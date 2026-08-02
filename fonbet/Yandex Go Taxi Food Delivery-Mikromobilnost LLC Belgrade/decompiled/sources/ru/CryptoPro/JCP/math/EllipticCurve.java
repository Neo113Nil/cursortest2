package ru.CryptoPro.JCP.math;

import defpackage.iu61;
import defpackage.ny61;
import defpackage.zu61;

/* loaded from: classes4.dex */
public abstract class EllipticCurve {
    public static final int EDWARDS = 1;
    public static final int OPT_0 = 1;
    public static final int OPT_F = -1;
    public static final int OPT_N = 2;
    public static final int OPT_NIST = 6;
    public static final int WEIERSTRASS = 0;
    public BigIntr a;
    public BigIntr b;
    public int c;

    public static EllipticCurve getInstance(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, BigIntr bigIntr4, int i, int i2) throws IllegalArgumentException {
        if (i2 == 0) {
            zu61 zu61Var = new zu61();
            zu61Var.d = new BigIntr(bigIntr);
            zu61Var.e = new BigIntr(bigIntr2);
            zu61Var.a = new BigIntr(bigIntr3);
            zu61Var.b = new BigIntr(bigIntr4);
            zu61Var.c = i;
            return zu61Var;
        }
        if (i2 != 1) {
            ny61.g("Wrong curve type");
            return null;
        }
        iu61 iu61Var = new iu61();
        int intLength = bigIntr3.getIntLength();
        BigIntr bigIntr5 = new BigIntr(bigIntr, intLength);
        BigIntr bigIntr6 = BigIntr.ONE;
        if (!bigIntr5.equals(new BigIntr(bigIntr6, intLength)) && !bigIntr5.addCSP(new BigIntr(bigIntr6, intLength), bigIntr3).equals(new BigIntr(BigIntr.ZERO, intLength))) {
            ny61.g("Epsilon should be equal to +1 or to -1 mod p");
            return null;
        }
        if (bigIntr.equals(new BigIntr(bigIntr6, intLength))) {
            iu61Var.e = 1;
        } else {
            iu61Var.e = -1;
        }
        BigIntr bigIntr7 = new BigIntr(bigIntr, intLength);
        iu61Var.d = bigIntr7;
        BigIntr bigIntr8 = new BigIntr(bigIntr2, intLength);
        iu61Var.f = bigIntr8;
        iu61Var.a = new BigIntr(bigIntr3, intLength);
        iu61Var.b = new BigIntr(bigIntr4, intLength);
        BigIntr euclidInverse = BigIntr.valueOf(4L).euclidInverse(bigIntr3);
        BigIntr euclidInverse2 = BigIntr.valueOf(6L).euclidInverse(bigIntr3);
        long[] jArr = new long[(intLength * 2) + 1];
        BigIntr bigIntr9 = new BigIntr(bigIntr, intLength);
        iu61Var.g = bigIntr9;
        BigIntr.d(bigIntr9, bigIntr9, bigIntr8, iu61Var.a);
        BigIntr.e(bigIntr9, bigIntr9, euclidInverse, iu61Var.a, i, jArr);
        BigIntr bigIntr10 = new BigIntr(bigIntr2, intLength);
        iu61Var.h = bigIntr10;
        BigIntr.i(bigIntr10, bigIntr10, bigIntr7, iu61Var.a);
        BigIntr.e(bigIntr10, bigIntr10, euclidInverse2, iu61Var.a, i, jArr);
        iu61Var.c = i;
        return iu61Var;
    }

    public int getOptFlag() {
        return this.c;
    }

    public BigIntr getP() {
        return this.a;
    }

    public BigIntr getQ() {
        return this.b;
    }

    public abstract int getType();
}
