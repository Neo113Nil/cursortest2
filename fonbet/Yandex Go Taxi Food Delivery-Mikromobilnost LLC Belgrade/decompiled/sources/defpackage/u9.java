package defpackage;

/* loaded from: classes11.dex */
public final class u9 {
    public static final u9 b;
    public static final u9 c;
    public final Throwable a;

    static {
        if (fa.w) {
            c = null;
            b = null;
        } else {
            c = new u9(null, false);
            b = new u9(null, true);
        }
    }

    public u9(Throwable th, boolean z) {
        this.a = th;
    }
}
