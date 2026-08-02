package S7;

/* loaded from: classes2.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3067a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f3067a;
        P p9 = (P) threadLocal.get();
        if (p9 != null) {
            return p9;
        }
        C0390d c0390d = new C0390d(Thread.currentThread());
        threadLocal.set(c0390d);
        return c0390d;
    }
}
