package defpackage;

/* loaded from: classes.dex */
public abstract class ceo {
    public static final act a = new act(15, nya.d, 2);

    public static final huk a(boolean z, float f, long j, hq5 hq5Var, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = d85.n;
        }
        aqi o0 = szf.o0(new d85(j), hq5Var);
        boolean z3 = (((i & 14) ^ 6) > 4 && ((oq5) hq5Var).g(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !((oq5) hq5Var).c(f)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z4 || K == gq5.a) {
            K = new huk(z, f, o0);
            oq5Var.k0(K);
        }
        return (huk) K;
    }
}
