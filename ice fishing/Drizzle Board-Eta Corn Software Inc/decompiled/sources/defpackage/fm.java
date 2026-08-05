package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class fm {
    private static volatile Choreographer choreographer;

    static {
        Object k30Var;
        try {
            k30Var = new em(qoPGr6Ce(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            k30Var = new k30(th);
        }
        if (k30Var instanceof k30) {
            k30Var = null;
        }
    }

    public static final Handler qoPGr6Ce(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
