package defpackage;

/* loaded from: classes.dex */
public abstract class lg1 {
    public static final java.lang.ThreadLocal IHQe1A4L2xu = new java.lang.ThreadLocal();

    public static defpackage.hu IHQe1A4L2xu() {
        java.lang.ThreadLocal threadLocal = IHQe1A4L2xu;
        defpackage.hu huVar = (defpackage.hu) threadLocal.get();
        if (huVar != null) {
            return huVar;
        }
        defpackage.j8 j8Var = new defpackage.j8(java.lang.Thread.currentThread());
        threadLocal.set(j8Var);
        return j8Var;
    }
}
