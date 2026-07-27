package kotlin.text;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLJUnit extends CatchingFishToastHiltBundle {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishGraphQLFragment CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGraphQLJUnit(CatchingFishGraphQLFragment catchingFishGraphQLFragment, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishGraphQLFragment;
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishParcelableFAB() {
        View view;
        int i = this.CatchingFishParcelableFAB;
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishSnackbar;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (catchingFishGraphQLFragment.CatchingFishEspressoMockk && (view = catchingFishGraphQLFragment.CatchingFishCardViewView) != null) {
                    view.setTranslationY(0.0f);
                    catchingFishGraphQLFragment.CatchingFishGsonAppCompat.setTranslationY(0.0f);
                }
                catchingFishGraphQLFragment.CatchingFishGsonAppCompat.setVisibility(8);
                catchingFishGraphQLFragment.CatchingFishGsonAppCompat.setTransitioning(false);
                catchingFishGraphQLFragment.CatchingFishPayPalLiveData = null;
                CatchingFishBundleGlide catchingFishBundleGlide = catchingFishGraphQLFragment.CatchingFishMutableLiveData;
                if (catchingFishBundleGlide != null) {
                    catchingFishBundleGlide.CatchingFishCardViewRealm(catchingFishGraphQLFragment.CatchingFishFragmentFactory);
                    catchingFishGraphQLFragment.CatchingFishFragmentFactory = null;
                    catchingFishGraphQLFragment.CatchingFishMutableLiveData = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = catchingFishGraphQLFragment.CatchingFishParcelableFlux;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                catchingFishGraphQLFragment.CatchingFishPayPalLiveData = null;
                catchingFishGraphQLFragment.CatchingFishGsonAppCompat.requestLayout();
                break;
        }
    }
}
