package T7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.h;
import u7.C5082h;

/* loaded from: classes2.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object b9;
        try {
            b9 = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            b9 = Q3.b.b(th);
        }
        if (b9 instanceof C5082h) {
            b9 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
