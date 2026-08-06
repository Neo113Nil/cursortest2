package defpackage;

/* loaded from: classes.dex */
public final class qk1 {
    public static defpackage.pk1 IHQe1A4L2xu(java.lang.Object obj) {
        defpackage.e20 e20Var = (defpackage.e20) obj;
        defpackage.pk1 pk1Var = e20Var.unknownFields;
        if (pk1Var != defpackage.pk1.xiZrDbcSW0) {
            return pk1Var;
        }
        defpackage.pk1 pk1Var2 = new defpackage.pk1(0, new int[8], new java.lang.Object[8], true);
        e20Var.unknownFields = pk1Var2;
        return pk1Var2;
    }

    public static boolean oh6vYeIP(int i, defpackage.pd pdVar, java.lang.Object obj) {
        int i2 = pdVar.IHQe1A4L2xu;
        defpackage.od odVar = (defpackage.od) pdVar.F7NU4MC0GW;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            pdVar.NHJTzaLwkd(0);
            ((defpackage.pk1) obj).r1MBDhnF(i3 << 3, java.lang.Long.valueOf(odVar.EgCjBq0SZwJ()));
            return true;
        }
        if (i4 == 1) {
            pdVar.NHJTzaLwkd(1);
            ((defpackage.pk1) obj).r1MBDhnF((i3 << 3) | 1, java.lang.Long.valueOf(odVar.QoRHpC4k()));
            return true;
        }
        if (i4 == 2) {
            ((defpackage.pk1) obj).r1MBDhnF((i3 << 3) | 2, pdVar.AARZUJiTa());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw defpackage.g80.oh6vYeIP();
            }
            pdVar.NHJTzaLwkd(5);
            ((defpackage.pk1) obj).r1MBDhnF(5 | (i3 << 3), java.lang.Integer.valueOf(odVar.cnag84Bm()));
            return true;
        }
        defpackage.pk1 pk1Var = new defpackage.pk1(0, new int[8], new java.lang.Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new defpackage.g80("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (pdVar.IHQe1A4L2xu() != Integer.MAX_VALUE && oh6vYeIP(i7, pdVar, pk1Var)) {
        }
        if (i6 != pdVar.IHQe1A4L2xu) {
            throw new defpackage.g80("Protocol message end-group tag did not match expected tag.");
        }
        if (pk1Var.adDC3e2L) {
            pk1Var.adDC3e2L = false;
        }
        ((defpackage.pk1) obj).r1MBDhnF(i5 | 3, pk1Var);
        return true;
    }
}
