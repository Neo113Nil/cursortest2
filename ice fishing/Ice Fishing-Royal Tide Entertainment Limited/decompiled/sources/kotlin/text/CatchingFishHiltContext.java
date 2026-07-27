package kotlin.text;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import kotlin.text.CatchingFishAdMobHandler;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltContext {
    /* JADX WARN: Multi-variable type inference failed */
    public static void CatchingFishParcelableFAB(Activity activity, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        CatchingFishToolbarToast CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarLiveData, "event");
        if (!(activity instanceof CatchingFishToastFlux) || (CatchingFishDaggerWebsocket = ((CatchingFishToastFlux) activity).CatchingFishDaggerWebsocket()) == null) {
            return;
        }
        CatchingFishDaggerWebsocket.CatchingFishReduxKtor(catchingFishToolbarLiveData);
    }

    public static void CatchingFishSnackbar(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            CatchingFishAdMobHandler.CatchingFishPagingLibrary.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new CatchingFishAdMobHandler.CatchingFishPagingLibrary());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new CatchingFishAdMobHandler(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
