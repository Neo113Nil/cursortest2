package M1;

import D1.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import t1.e;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object eVar;
        try {
            eVar = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            eVar = new e(th);
        }
        if (eVar instanceof e) {
            eVar = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
