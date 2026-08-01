package T7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.h;
import u7.C5090h;

/* loaded from: classes2.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object f3;
        try {
            f3 = new e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            f3 = com.bumptech.glide.d.f(th);
        }
        if (f3 instanceof C5090h) {
            f3 = null;
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
