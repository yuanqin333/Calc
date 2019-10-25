package com.kavinschool.calc;

public class DoMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calc myCalc = new Calc(8, 2);

		System.out.println("Add: " + myCalc.add());
		System.out.println("Mul: " + myCalc.mul());
		System.out.println("Sub: " + myCalc.sub());
		System.out.println("Div: " + myCalc.div());
	}

}
