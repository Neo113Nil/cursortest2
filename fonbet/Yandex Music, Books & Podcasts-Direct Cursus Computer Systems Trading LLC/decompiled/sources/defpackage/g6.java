package defpackage;

/* loaded from: classes3.dex */
public final class g6 {
    public static final g6 c;
    public static final g6 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (v6.d) {
            d = null;
            c = null;
        } else {
            d = new g6(null, false);
            c = new g6(null, true);
        }
    }

    public g6(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
