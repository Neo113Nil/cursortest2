package B1;

import R1.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h1.C0235e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object h2;
        try {
            h2 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            h2 = l.h(th);
        }
        if (h2 instanceof C0235e) {
            h2 = null;
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
