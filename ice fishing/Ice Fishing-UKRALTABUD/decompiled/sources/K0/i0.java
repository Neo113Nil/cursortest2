package K0;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f512a = new ThreadLocal();

    public static I a() {
        ThreadLocal threadLocal = f512a;
        I i2 = (I) threadLocal.get();
        if (i2 != null) {
            return i2;
        }
        C0028d c0028d = new C0028d(Thread.currentThread());
        threadLocal.set(c0028d);
        return c0028d;
    }
}
