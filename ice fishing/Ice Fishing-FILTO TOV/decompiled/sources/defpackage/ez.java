package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ez {
    public static final /* synthetic */ int GWasM1elztuh = 0;
    private static volatile Choreographer choreographer;

    static {
        Object su0Var;
        try {
            su0Var = new dz(GWasM1elztuh(Looper.getMainLooper()));
        } catch (Throwable th) {
            su0Var = new su0(th);
        }
        if (su0Var instanceof su0) {
            su0Var = null;
        }
    }

    public static final Handler GWasM1elztuh(Looper looper) {
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
