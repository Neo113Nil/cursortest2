package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class CatchingFishMoshiLiveData extends CatchingFishAppCompatDagger {
    @Override // kotlin.text.CatchingFishAppCompatDagger
    public void CatchingFishSnackbar(CatchingFishGraphQLIntent catchingFishGraphQLIntent, CatchingFishGraphQLIntent catchingFishGraphQLIntent2, Window window, View view, boolean z, boolean z2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent, "statusBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent2, "navigationBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(window, "window");
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishToastHiltBundle.CatchingFishCardViewView(window, false);
        window.setStatusBarColor(z ? catchingFishGraphQLIntent.CatchingFishSnackbar : catchingFishGraphQLIntent.CatchingFishParcelableFAB);
        window.setNavigationBarColor(catchingFishGraphQLIntent2.CatchingFishSnackbar);
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM) : i >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM) : i >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM)).CatchingFishJobScheduler(!z);
    }
}
