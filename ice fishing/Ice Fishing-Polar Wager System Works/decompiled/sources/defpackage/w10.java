package defpackage;

/* loaded from: classes.dex */
public final class w10 {
    public final java.util.ArrayList F7NU4MC0GW;
    public final java.util.ArrayList IHQe1A4L2xu;
    public final defpackage.xk0 adDC3e2L;
    public final int oh6vYeIP;
    public int r1MBDhnF;
    public final defpackage.le1 xiZrDbcSW0;

    public w10(int i, java.util.ArrayList arrayList) {
        this.IHQe1A4L2xu = arrayList;
        this.oh6vYeIP = i;
        if (i < 0) {
            defpackage.nw0.IHQe1A4L2xu("Invalid start index");
        }
        this.F7NU4MC0GW = new java.util.ArrayList();
        defpackage.xk0 xk0Var = new defpackage.xk0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.m90 m90Var = (defpackage.m90) this.IHQe1A4L2xu.get(i3);
            int i4 = m90Var.r1MBDhnF;
            int i5 = m90Var.F7NU4MC0GW;
            xk0Var.EXtogiMhuM(i4, new defpackage.a30(i3, i2, i5));
            i2 += i5;
        }
        this.adDC3e2L = xk0Var;
        this.xiZrDbcSW0 = new defpackage.le1(new defpackage.jk(2, this));
    }

    public final boolean IHQe1A4L2xu(int i, int i2) {
        defpackage.a30 a30Var;
        int i3;
        int i4;
        defpackage.xk0 xk0Var = this.adDC3e2L;
        defpackage.a30 a30Var2 = (defpackage.a30) xk0Var.oh6vYeIP(i);
        if (a30Var2 == null) {
            return false;
        }
        int i5 = a30Var2.oh6vYeIP;
        int i6 = i2 - a30Var2.r1MBDhnF;
        a30Var2.r1MBDhnF = i2;
        if (i6 == 0) {
            return true;
        }
        java.lang.Object[] objArr = xk0Var.r1MBDhnF;
        long[] jArr = xk0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (a30Var = (defpackage.a30) objArr[(i7 << 3) + i9]).oh6vYeIP) >= i5 && a30Var != a30Var2 && (i4 = i3 + i6) >= 0) {
                        a30Var.oh6vYeIP = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
