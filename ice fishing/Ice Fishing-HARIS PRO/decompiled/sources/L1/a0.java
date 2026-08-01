package L1;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f552a = new ThreadLocal();

    public static E a() {
        ThreadLocal threadLocal = f552a;
        E e = (E) threadLocal.get();
        if (e != null) {
            return e;
        }
        C0001b c0001b = new C0001b(Thread.currentThread());
        threadLocal.set(c0001b);
        return c0001b;
    }
}
