package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class vd0 {
    public static final ArrayList NCTxEWno;
    public static final ThreadLocal qoPGr6Ce;

    static {
        new j1();
        qoPGr6Ce = new ThreadLocal();
        NCTxEWno = new ArrayList();
    }

    public static x0 qoPGr6Ce() {
        x0 x0Var;
        ThreadLocal threadLocal = qoPGr6Ce;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (x0Var = (x0) weakReference.get()) != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0(0);
        threadLocal.set(new WeakReference(x0Var2));
        return x0Var2;
    }
}
