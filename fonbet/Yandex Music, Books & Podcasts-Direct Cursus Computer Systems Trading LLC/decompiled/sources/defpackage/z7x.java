package defpackage;

/* loaded from: classes.dex */
public final class z7x {
    public static final z7x c;
    public static final z7x d;
    public final boolean a;
    public final Throwable b;

    static {
        if (j8x.d) {
            d = null;
            c = null;
        } else {
            d = new z7x(null, false);
            c = new z7x(null, true);
        }
    }

    public z7x(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
