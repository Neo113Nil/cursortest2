package kotlin.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class CatchingFishToastFABJUnit {
    public static final /* synthetic */ int CatchingFishParcelableFAB = 0;
    private static volatile Choreographer choreographer;

    static {
        Object CatchingFishViewModelFAB;
        try {
            CatchingFishViewModelFAB = new CatchingFishIntentCoroutine(CatchingFishParcelableFAB(Looper.getMainLooper()));
        } catch (Throwable th) {
            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        if (CatchingFishViewModelFAB instanceof CatchingFishLiveDataToolbar) {
            CatchingFishViewModelFAB = null;
        }
    }

    public static final Handler CatchingFishParcelableFAB(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
