package kotlin.text;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishContextPayPal extends CatchingFishAdMobAnimation {
    @Override // kotlin.text.CatchingFishFluxViewModel, kotlin.text.CatchingFishMockkCustomView, kotlin.text.CatchingFishAppCompatDagger
    public void CatchingFishSnackbar(CatchingFishGraphQLIntent catchingFishGraphQLIntent, CatchingFishGraphQLIntent catchingFishGraphQLIntent2, Window window, View view, boolean z, boolean z2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent, "statusBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGraphQLIntent2, "navigationBarStyle");
        CatchingFishFirebaseDagger.CatchingFishNavigation(window, "window");
        CatchingFishFirebaseDagger.CatchingFishNavigation(view, "view");
        CatchingFishToastHiltBundle.CatchingFishCardViewView(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof CatchingFishHandlerAdMob)) {
                        for (Object obj : (Iterable) tag) {
                            if (obj instanceof CatchingFishHandlerAdMob) {
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(view);
        int i3 = Build.VERSION.SDK_INT;
        CatchingFishHiltMVPToast catchingFishPicassoGson = i3 >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM) : i3 >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM) : i3 >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM);
        catchingFishPicassoGson.CatchingFishJobScheduler(!z);
        catchingFishPicassoGson.CatchingFishMutableLiveData(!z2);
    }
}
