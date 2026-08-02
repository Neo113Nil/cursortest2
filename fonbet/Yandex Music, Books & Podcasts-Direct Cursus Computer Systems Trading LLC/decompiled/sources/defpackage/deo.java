package defpackage;

/* loaded from: classes.dex */
public abstract class deo {
    public static final agr a = new agr(xuj.K);
    public static final qs5 b = new qs5(xuj.I);
    public static final feo c;
    public static final feo d;

    static {
        long j = d85.n;
        c = new feo(Float.NaN, j, true);
        d = new feo(Float.NaN, j, false);
    }

    public static final yie a(float f, hq5 hq5Var, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        float f2 = (i2 & 2) != 0 ? Float.NaN : f;
        long j = d85.n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1280632857);
        yie a2 = ((Boolean) oq5Var.j(a)).booleanValue() ? ceo.a(z, f2, j, oq5Var, i & 1022, 0) : (cma.a(f2, Float.NaN) && d85.c(j, j)) ? z ? c : d : new feo(f2, j, z);
        oq5Var.p(false);
        return a2;
    }
}
