package defpackage;

/* loaded from: classes5.dex */
public abstract class rfs {
    public static final ThreadLocal a = new ThreadLocal();

    public static rib a() {
        ThreadLocal threadLocal = a;
        rib ribVar = (rib) threadLocal.get();
        if (ribVar != null) {
            return ribVar;
        }
        k73 k73Var = new k73(Thread.currentThread());
        threadLocal.set(k73Var);
        return k73Var;
    }
}
