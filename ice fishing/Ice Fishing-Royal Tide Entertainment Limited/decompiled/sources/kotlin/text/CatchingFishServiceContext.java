package kotlin.text;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CatchingFishServiceContext {
    public static void CatchingFishCoroutine(Object obj, Object obj2) {
        CatchingFishRoomDatabase.CatchingFishViewModelScope(obj).unregisterOnBackInvokedCallback(CatchingFishRoomDatabase.CatchingFishReduxKtor(obj2));
    }

    public static OnBackInvokedDispatcher CatchingFishParcelableFAB(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback CatchingFishSnackbar(Object obj, CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor) {
        Objects.requireNonNull(catchingFishMockkWidgetKtor);
        CatchingFishKtorParcelable catchingFishKtorParcelable = new CatchingFishKtorParcelable(0, catchingFishMockkWidgetKtor);
        CatchingFishRoomDatabase.CatchingFishViewModelScope(obj).registerOnBackInvokedCallback(1000000, catchingFishKtorParcelable);
        return catchingFishKtorParcelable;
    }
}
