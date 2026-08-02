package defpackage;

/* loaded from: classes.dex */
public final class v9 {
    public static final v9 c;
    public static final v9 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (ga.w) {
            d = null;
            c = null;
        } else {
            d = new v9(null, false);
            c = new v9(null, true);
        }
    }

    public v9(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
