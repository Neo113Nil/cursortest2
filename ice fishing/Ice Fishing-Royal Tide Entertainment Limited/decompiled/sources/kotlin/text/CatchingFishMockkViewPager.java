package kotlin.text;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMockkViewPager implements CatchingFishFluxLiveData {
    public final /* synthetic */ Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishMockkViewPager(int i, Object obj, Object obj2) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
        this.CatchingFishCoroutine = obj2;
    }

    @Override // kotlin.text.CatchingFishFluxLiveData
    public final void CatchingFishParcelableFAB() {
        int i = this.CatchingFishParcelableFAB;
        Object obj = this.CatchingFishCoroutine;
        Object obj2 = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((CatchingFishGlideGoogleMaps) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((CatchingFishGraphQL) obj);
                break;
            case 2:
                ((CatchingFishMVPWidget) obj2).CatchingFishParcelableFAB.CatchingFishLayout((CatchingFishHiltFlux) obj);
                break;
            default:
                CatchingFishServiceMockk catchingFishServiceMockk = (CatchingFishServiceMockk) obj2;
                View view = (View) obj;
                int i2 = catchingFishServiceMockk.CatchingFishJetpackCompose - 1;
                catchingFishServiceMockk.CatchingFishJetpackCompose = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    CatchingFishGlideFlux.CatchingFishCoroutine(view, null);
                    CatchingFishFABCameraX.CatchingFishAnimationMockk(view, null);
                    view.removeOnAttachStateChangeListener(catchingFishServiceMockk.CatchingFishCoroutineFlow);
                    break;
                }
                break;
        }
    }
}
