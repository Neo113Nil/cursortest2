package A1;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f52a = new ThreadLocal();

    public static J a() {
        ThreadLocal threadLocal = f52a;
        J j2 = (J) threadLocal.get();
        if (j2 != null) {
            return j2;
        }
        C0003d c0003d = new C0003d(Thread.currentThread());
        threadLocal.set(c0003d);
        return c0003d;
    }
}
