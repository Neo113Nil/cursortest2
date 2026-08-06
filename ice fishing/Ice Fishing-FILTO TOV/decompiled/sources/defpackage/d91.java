package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class d91 {
    public static final ThreadLocal GWasM1elztuh = new ThreadLocal();

    public static qq GWasM1elztuh() {
        ThreadLocal threadLocal = GWasM1elztuh;
        qq qqVar = (qq) threadLocal.get();
        if (qqVar != null) {
            return qqVar;
        }
        w6 w6Var = new w6(Thread.currentThread());
        threadLocal.set(w6Var);
        return w6Var;
    }
}
