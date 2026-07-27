package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishPicassoFlux extends CatchingFishToastHiltBundle {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishPicassoFlux(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // kotlin.text.CatchingFishToastHiltBundle, kotlin.text.CatchingFishCoroutineJUnit
    public void CatchingFishCoroutine() {
        int i = this.CatchingFishParcelableFAB;
        Object obj = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishAsyncTaskToast) obj).CatchingFishDaggerWebsocket.CatchingFishGsonAppCompat.setVisibility(0);
                break;
            case 1:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) obj;
                catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setVisibility(0);
                if (catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getParent() instanceof View) {
                    View view = (View) catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.getParent();
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishParcelableFAB() {
        int i = this.CatchingFishParcelableFAB;
        Object obj = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = ((CatchingFishAsyncTaskToast) obj).CatchingFishDaggerWebsocket;
                catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat.setAlpha(1.0f);
                catchingFishMockkWidgetKtor.CatchingFishCardViewView.CatchingFishReduxKtor(null);
                catchingFishMockkWidgetKtor.CatchingFishCardViewView = null;
                break;
            case 1:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor2 = (CatchingFishMockkWidgetKtor) obj;
                catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat.setAlpha(1.0f);
                catchingFishMockkWidgetKtor2.CatchingFishCardViewView.CatchingFishReduxKtor(null);
                catchingFishMockkWidgetKtor2.CatchingFishCardViewView = null;
                break;
            default:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor3 = (CatchingFishMockkWidgetKtor) ((CatchingFishBundleGlide) obj).CatchingFishWorkManager;
                catchingFishMockkWidgetKtor3.CatchingFishGsonAppCompat.setVisibility(8);
                PopupWindow popupWindow = catchingFishMockkWidgetKtor3.CatchingFishCardViewRealm;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (catchingFishMockkWidgetKtor3.CatchingFishGsonAppCompat.getParent() instanceof View) {
                    View view = (View) catchingFishMockkWidgetKtor3.CatchingFishGsonAppCompat.getParent();
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    view.requestApplyInsets();
                }
                catchingFishMockkWidgetKtor3.CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket();
                catchingFishMockkWidgetKtor3.CatchingFishCardViewView.CatchingFishReduxKtor(null);
                catchingFishMockkWidgetKtor3.CatchingFishCardViewView = null;
                ViewGroup viewGroup = catchingFishMockkWidgetKtor3.CatchingFishFragmentFactory;
                WeakHashMap weakHashMap2 = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
