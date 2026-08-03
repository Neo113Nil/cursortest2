package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8908a = new ThreadLocal();

    public static s0 a() {
        ThreadLocal threadLocal = f8908a;
        s0 s0Var = (s0) threadLocal.get();
        if (s0Var != null) {
            return s0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
