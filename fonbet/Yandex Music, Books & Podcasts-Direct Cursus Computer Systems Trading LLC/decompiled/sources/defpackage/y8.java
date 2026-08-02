package defpackage;

/* loaded from: classes.dex */
public final class y8 {
    public static final y8 c;
    public static final y8 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (k9.d) {
            d = null;
            c = null;
        } else {
            d = new y8(null, false);
            c = new y8(null, true);
        }
    }

    public y8(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
