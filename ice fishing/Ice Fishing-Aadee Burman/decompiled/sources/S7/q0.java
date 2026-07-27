package S7;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2984a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f2984a;
        P p9 = (P) threadLocal.get();
        if (p9 != null) {
            return p9;
        }
        C0386d c0386d = new C0386d(Thread.currentThread());
        threadLocal.set(c0386d);
        return c0386d;
    }
}
