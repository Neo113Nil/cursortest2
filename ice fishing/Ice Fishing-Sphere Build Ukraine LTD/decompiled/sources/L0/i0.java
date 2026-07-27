package L0;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f660a = new ThreadLocal();

    public static I a() {
        ThreadLocal threadLocal = f660a;
        I i2 = (I) threadLocal.get();
        if (i2 != null) {
            return i2;
        }
        C0046d c0046d = new C0046d(Thread.currentThread());
        threadLocal.set(c0046d);
        return c0046d;
    }
}
