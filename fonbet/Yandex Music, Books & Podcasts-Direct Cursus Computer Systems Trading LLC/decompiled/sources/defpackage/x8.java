package defpackage;

/* loaded from: classes5.dex */
public final class x8 {
    public static final x8 b;
    public static final x8 c;
    public final Throwable a;

    static {
        if (j9.d) {
            c = null;
            b = null;
        } else {
            c = new x8(null, false);
            b = new x8(null, true);
        }
    }

    public x8(Throwable th, boolean z) {
        this.a = th;
    }
}
