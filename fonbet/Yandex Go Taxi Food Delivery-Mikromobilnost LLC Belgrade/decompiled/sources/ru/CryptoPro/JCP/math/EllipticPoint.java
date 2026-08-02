package ru.CryptoPro.JCP.math;

import defpackage.gw61;
import defpackage.iu61;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zu61;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public abstract class EllipticPoint {
    public static final BigIntr a;
    public static final BigIntr b;

    static {
        BigIntr bigIntr = BigIntr.ONE;
        a = new BigIntr(bigIntr, 8);
        b = new BigIntr(bigIntr, 16);
    }

    public static EllipticPoint getCopyInstance(EllipticPoint ellipticPoint) {
        if (ellipticPoint.getCurveType() != 0) {
            return new a((a) ellipticPoint);
        }
        gw61 gw61Var = (gw61) ellipticPoint;
        gw61 gw61Var2 = new gw61();
        gw61Var2.f = null;
        int i = gw61Var.h;
        gw61Var2.h = i;
        gw61Var2.c = new BigIntr(gw61Var.c);
        gw61Var2.d = new BigIntr(gw61Var.d);
        gw61Var2.e = new BigIntr(gw61Var.e);
        gw61Var2.g = gw61Var.g;
        gw61Var2.i = i == 8 ? 4 : 8;
        gw61Var2.j = i == 8 ? 1 : 8;
        return gw61Var2;
    }

    public static EllipticPoint getInstance(BigIntr bigIntr, BigIntr bigIntr2, EllipticCurve ellipticCurve) {
        EllipticPoint aVar;
        if (ellipticCurve.getType() == 0) {
            aVar = new gw61((zu61) ellipticCurve, bigIntr, bigIntr2);
        } else {
            aVar = new a((iu61) ellipticCurve, bigIntr, bigIntr2, 0);
            aVar.toZ1();
        }
        if (aVar.onCurve(ellipticCurve)) {
            return aVar;
        }
        w511.q();
        return null;
    }

    public static EllipticPoint getInstanceOfTwistedEdwardsByInverted(BigIntr bigIntr, BigIntr bigIntr2, EllipticCurve ellipticCurve) {
        if (ellipticCurve.getType() != 1) {
            ny61.g("Curve is not Edwards elliptic curve.");
            return null;
        }
        a aVar = new a((iu61) ellipticCurve, bigIntr, bigIntr2, 1);
        aVar.toZ1();
        if (aVar.onCurve(ellipticCurve)) {
            return aVar;
        }
        w511.q();
        return null;
    }

    public static EllipticPoint getInstanceOnIntArray(EllipticCurve ellipticCurve, int[] iArr) {
        if (ellipticCurve.getType() != 0) {
            ny61.g("Wrong curve type");
            return null;
        }
        zu61 zu61Var = (zu61) ellipticCurve;
        gw61 gw61Var = new gw61();
        gw61Var.f = null;
        int intLength = zu61Var.getP().getIntLength();
        gw61Var.h = intLength;
        gw61Var.i = intLength == 8 ? 4 : 8;
        gw61Var.j = intLength == 8 ? 1 : 8;
        int[] iArr2 = new int[intLength];
        int[] iArr3 = new int[intLength];
        Array.separate(iArr, iArr2, iArr3, intLength);
        gw61Var.c = new BigIntr(iArr2);
        gw61Var.d = new BigIntr(iArr3);
        gw61Var.e = new BigIntr(BigIntr.ONE, intLength);
        gw61Var.g = zu61Var;
        if (gw61Var.onCurve(ellipticCurve)) {
            return gw61Var;
        }
        w511.q();
        return null;
    }

    public static EllipticPoint getInstanceOnProjective(BigIntr bigIntr, BigIntr bigIntr2, BigIntr bigIntr3, EllipticCurve ellipticCurve) {
        EllipticPoint gw61Var = ellipticCurve.getType() == 0 ? new gw61((zu61) ellipticCurve, bigIntr, bigIntr2, bigIntr3, false) : new a((iu61) ellipticCurve, bigIntr, bigIntr2, bigIntr3, false);
        if (gw61Var.onCurve(ellipticCurve)) {
            return gw61Var;
        }
        w511.q();
        return null;
    }

    public static EllipticPoint getInstanceOnWeierstrassCoords(BigIntr bigIntr, BigIntr bigIntr2, EllipticCurve ellipticCurve) {
        EllipticPoint aVar = ellipticCurve.getType() == 1 ? new a(bigIntr, bigIntr2, (iu61) ellipticCurve) : new gw61((zu61) ellipticCurve, bigIntr, bigIntr2);
        if (aVar.onCurve(ellipticCurve)) {
            return aVar;
        }
        w511.q();
        return null;
    }

    public static EllipticPoint getNullInstance(EllipticCurve ellipticCurve) throws IllegalArgumentException {
        return ellipticCurve.getType() == 0 ? new gw61((zu61) ellipticCurve) : new a((iu61) ellipticCurve);
    }

    public static EllipticPoint translatePoint(EllipticPoint ellipticPoint, EllipticCurve ellipticCurve) {
        if (ellipticPoint.getCurveType() != 0 || ellipticCurve.getType() != 1) {
            w511.q();
            return null;
        }
        gw61 gw61Var = (gw61) ellipticPoint;
        BigIntr bigIntr = gw61Var.c;
        iu61 iu61Var = (iu61) ellipticCurve;
        a aVar = new a();
        aVar.f = null;
        BigIntr bigIntr2 = gw61Var.d;
        a.d(bigIntr, bigIntr2);
        int intLength = bigIntr.getIntLength();
        aVar.m = intLength;
        aVar.n = intLength == 8 ? 4 : 8;
        aVar.o = intLength == 8 ? 1 : 8;
        BigIntr bigIntr3 = BigIntr.ZERO;
        aVar.c = new BigIntr(bigIntr3, intLength);
        aVar.d = new BigIntr(bigIntr3, intLength);
        aVar.e = new BigIntr(bigIntr3, intLength);
        aVar.l = iu61Var;
        aVar.i = new BigIntr(bigIntr, intLength);
        aVar.j = new BigIntr(bigIntr2, intLength);
        aVar.k = new BigIntr(gw61Var.e, intLength);
        aVar.h = true;
        aVar.g = gw61Var.isNull();
        if (gw61Var.isNull()) {
            return aVar;
        }
        aVar.a();
        return aVar;
    }

    public abstract EllipticPoint add(EllipticPoint ellipticPoint);

    public abstract boolean equals(EllipticPoint ellipticPoint);

    public abstract EllipticPoint generateTable();

    public abstract int getCurveType();

    public abstract BigIntr getU();

    public abstract BigIntr getV();

    public abstract BigIntr getX();

    public abstract BigIntr getY();

    public abstract boolean isNull();

    public abstract boolean onCurve(EllipticCurve ellipticCurve);

    public abstract EllipticPoint powerHEX(BigIntr bigIntr, boolean z);

    public abstract EllipticPoint powerTAB(BigIntr bigIntr, boolean z);

    public abstract String printTable();

    public abstract void toZ1();

    public static EllipticPoint translatePoint(int[] iArr, EllipticCurve ellipticCurve) {
        if (ellipticCurve.getType() != 1) {
            w511.q();
            return null;
        }
        if (iArr == null || !(iArr.length == 16 || iArr.length == 32)) {
            w511.q();
            return null;
        }
        a aVar = new a(new BigIntr(iArr, 0, iArr.length >> 1), new BigIntr(iArr, iArr.length >> 1, iArr.length >> 1), (iu61) ellipticCurve);
        if (aVar.onCurve(ellipticCurve)) {
            return aVar;
        }
        w511.q();
        return null;
    }
}
