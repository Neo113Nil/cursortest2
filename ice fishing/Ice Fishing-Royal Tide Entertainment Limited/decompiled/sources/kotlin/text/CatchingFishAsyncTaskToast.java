package kotlin.text;

import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskToast implements Runnable {
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishAsyncTaskToast(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishMockkWidgetKtor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishDaggerWebsocket;
                if ((catchingFishMockkWidgetKtor.CatchingFishRedux & 1) != 0) {
                    catchingFishMockkWidgetKtor.CatchingFishJetpackCompose(0);
                }
                if ((catchingFishMockkWidgetKtor.CatchingFishRedux & 4096) != 0) {
                    catchingFishMockkWidgetKtor.CatchingFishJetpackCompose(108);
                }
                catchingFishMockkWidgetKtor.CatchingFishNavigationGson = false;
                catchingFishMockkWidgetKtor.CatchingFishRedux = 0;
                break;
            default:
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor2 = this.CatchingFishDaggerWebsocket;
                catchingFishMockkWidgetKtor2.CatchingFishCardViewRealm.showAtLocation(catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat, 55, 0, 0);
                CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = catchingFishMockkWidgetKtor2.CatchingFishCardViewView;
                if (catchingFishIntentMVPDagger != null) {
                    catchingFishIntentMVPDagger.CatchingFishSnackbar();
                }
                if (!catchingFishMockkWidgetKtor2.CatchingFishCustomView || (viewGroup = catchingFishMockkWidgetKtor2.CatchingFishFragmentFactory) == null || !viewGroup.isLaidOut()) {
                    catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat.setAlpha(1.0f);
                    catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat.setVisibility(0);
                    break;
                } else {
                    catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat.setAlpha(0.0f);
                    CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(catchingFishMockkWidgetKtor2.CatchingFishGsonAppCompat);
                    CatchingFishParcelableFAB.CatchingFishParcelableFAB(1.0f);
                    catchingFishMockkWidgetKtor2.CatchingFishCardViewView = CatchingFishParcelableFAB;
                    CatchingFishParcelableFAB.CatchingFishReduxKtor(new CatchingFishPicassoFlux(0, this));
                    break;
                }
        }
    }
}
