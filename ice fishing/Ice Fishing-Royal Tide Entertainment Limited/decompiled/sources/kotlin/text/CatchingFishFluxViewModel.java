package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class CatchingFishFluxViewModel extends CatchingFishWidgetLayout {
    @Override // kotlin.text.CatchingFishMockkCustomView, kotlin.text.CatchingFishAppCompatDagger
    public void CatchingFishSnackbar(CatchingFishGraphQLIntent catchingFishGraphQLIntent, CatchingFishGraphQLIntent catchingFishGraphQLIntent2, Window window, View view, boolean z, boolean z2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent, "statusBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent2, "navigationBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(window, "window");
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishToastHiltBundle.CatchingFishCardViewView(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(view);
        int i = Build.VERSION.SDK_INT;
        CatchingFishHiltMVPToast catchingFishPicassoGson = i >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM) : i >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM) : i >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM);
        catchingFishPicassoGson.CatchingFishJobScheduler(!z);
        catchingFishPicassoGson.CatchingFishMutableLiveData(!z2);
    }
}
