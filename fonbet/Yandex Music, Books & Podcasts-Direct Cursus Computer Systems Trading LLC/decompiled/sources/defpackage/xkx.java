package defpackage;

/* loaded from: classes.dex */
public final class xkx {
    public static final xkx c;
    public static final xkx d;
    public final boolean a;
    public final Throwable b;

    static {
        if (flx.d) {
            d = null;
            c = null;
        } else {
            d = new xkx(null, false);
            c = new xkx(null, true);
        }
    }

    public xkx(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
