package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class kc0 {
    public static final ThreadLocal qoPGr6Ce = new ThreadLocal();

    public static cg qoPGr6Ce() {
        ThreadLocal threadLocal = qoPGr6Ce;
        cg cgVar = (cg) threadLocal.get();
        if (cgVar != null) {
            return cgVar;
        }
        k2 k2Var = new k2(Thread.currentThread());
        threadLocal.set(k2Var);
        return k2Var;
    }
}
