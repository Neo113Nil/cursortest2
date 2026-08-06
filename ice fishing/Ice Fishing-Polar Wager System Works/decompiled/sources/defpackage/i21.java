package defpackage;

/* loaded from: classes.dex */
public abstract class i21 {
    public static final defpackage.qh IHQe1A4L2xu = new defpackage.qh(new defpackage.g(28));
    public static final defpackage.k21 oh6vYeIP;
    public static final defpackage.k21 r1MBDhnF;

    static {
        long j = defpackage.ae.xiZrDbcSW0;
        oh6vYeIP = new defpackage.k21(true, Float.NaN, j);
        r1MBDhnF = new defpackage.k21(false, Float.NaN, j);
    }

    public static defpackage.k21 IHQe1A4L2xu(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = defpackage.ae.xiZrDbcSW0;
        return (defpackage.uq.oh6vYeIP(f, Float.NaN) && defpackage.ae.r1MBDhnF(j, j)) ? z ? oh6vYeIP : r1MBDhnF : new defpackage.k21(z, f, j);
    }
}
