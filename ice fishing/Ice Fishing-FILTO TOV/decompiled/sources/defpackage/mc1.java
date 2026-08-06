package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mc1 {
    public static lc1 GWasM1elztuh(Object obj) {
        ay ayVar = (ay) obj;
        lc1 lc1Var = ayVar.unknownFields;
        if (lc1Var != lc1.EljAMC1QTz) {
            return lc1Var;
        }
        lc1 lc1Var2 = new lc1(0, new int[8], new Object[8], true);
        ayVar.unknownFields = lc1Var2;
        return lc1Var2;
    }

    public static boolean Yi7zF1RB1(int i, nb nbVar, Object obj) {
        int i2 = nbVar.GWasM1elztuh;
        mb mbVar = (mb) nbVar.xqGvceK5x;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            nbVar.WRKkgoJXwDn(0);
            ((lc1) obj).X1lG3V04pd(i3 << 3, Long.valueOf(mbVar.mE4lRynR()));
            return true;
        }
        if (i4 == 1) {
            nbVar.WRKkgoJXwDn(1);
            ((lc1) obj).X1lG3V04pd((i3 << 3) | 1, Long.valueOf(mbVar.WIEu4Ya2g8()));
            return true;
        }
        if (i4 == 2) {
            ((lc1) obj).X1lG3V04pd((i3 << 3) | 2, nbVar.AvO7iQsrTN());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw w30.Yi7zF1RB1();
            }
            nbVar.WRKkgoJXwDn(5);
            ((lc1) obj).X1lG3V04pd(5 | (i3 << 3), Integer.valueOf(mbVar.iwATDS1i01k()));
            return true;
        }
        lc1 lc1Var = new lc1(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new w30("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nbVar.GWasM1elztuh() != Integer.MAX_VALUE && Yi7zF1RB1(i7, nbVar, lc1Var)) {
        }
        if (i6 != nbVar.GWasM1elztuh) {
            throw new w30("Protocol message end-group tag did not match expected tag.");
        }
        if (lc1Var.OOA6hdeuvCS) {
            lc1Var.OOA6hdeuvCS = false;
        }
        ((lc1) obj).X1lG3V04pd(i5 | 3, lc1Var);
        return true;
    }
}
