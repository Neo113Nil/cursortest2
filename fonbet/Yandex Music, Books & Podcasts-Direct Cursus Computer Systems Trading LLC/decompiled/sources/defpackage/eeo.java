package defpackage;

/* loaded from: classes.dex */
public abstract class eeo {
    public static final qs5 a = new qs5(xuj.J);
    public static final geo b;
    public static final geo c;
    public static final udo d;
    public static final udo e;
    public static final udo f;

    static {
        long j = d85.n;
        b = new geo(Float.NaN, j, true);
        c = new geo(Float.NaN, j, false);
        d = new udo(0.16f, 0.24f, 0.08f, 0.24f);
        e = new udo(0.08f, 0.12f, 0.04f, 0.12f);
        f = new udo(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static geo a(float f2, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = d85.n;
        }
        return (cma.a(f2, Float.NaN) && d85.c(j, d85.n)) ? z ? b : c : new geo(f2, j, z);
    }
}
