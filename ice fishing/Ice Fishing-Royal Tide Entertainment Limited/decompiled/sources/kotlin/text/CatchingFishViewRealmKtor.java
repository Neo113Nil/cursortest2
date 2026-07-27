package kotlin.text;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CatchingFishViewRealmKtor {
    public static void CatchingFishCoroutine(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher CatchingFishParcelableFAB(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static void CatchingFishReduxKtor(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback CatchingFishSnackbar(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new CatchingFishKtorParcelable(2, runnable);
    }
}
