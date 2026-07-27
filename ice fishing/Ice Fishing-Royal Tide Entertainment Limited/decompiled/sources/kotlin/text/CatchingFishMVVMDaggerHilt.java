package kotlin.text;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishMVVMDaggerHilt implements CatchingFishManifestJUnit {
    public final /* synthetic */ CatchingFishReduxRetrofit CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishBiometricRoom CatchingFishSnackbar;

    public CatchingFishMVVMDaggerHilt(CatchingFishReduxRetrofit catchingFishReduxRetrofit, CatchingFishBiometricRoom catchingFishBiometricRoom) {
        this.CatchingFishParcelableFAB = catchingFishReduxRetrofit;
        this.CatchingFishSnackbar = catchingFishBiometricRoom;
    }

    @Override // kotlin.text.CatchingFishManifestJUnit
    public final CatchingFishSharedFlowMVP CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, List list, long j) {
        CatchingFishReduxRetrofit catchingFishReduxRetrofit = this.CatchingFishParcelableFAB;
        if (catchingFishReduxRetrofit.getChildCount() == 0) {
            return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishGradleGraphQL.CatchingFishLayout(j), CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j), CatchingFishMVI.CatchingFishCloudMessaging);
        }
        if (CatchingFishGradleGraphQL.CatchingFishLayout(j) != 0) {
            catchingFishReduxRetrofit.getChildAt(0).setMinimumWidth(CatchingFishGradleGraphQL.CatchingFishLayout(j));
        }
        if (CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j) != 0) {
            catchingFishReduxRetrofit.getChildAt(0).setMinimumHeight(CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j));
        }
        int CatchingFishLayout = CatchingFishGradleGraphQL.CatchingFishLayout(j);
        int CatchingFishViewModelScope = CatchingFishGradleGraphQL.CatchingFishViewModelScope(j);
        ViewGroup.LayoutParams layoutParams = catchingFishReduxRetrofit.getLayoutParams();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(layoutParams);
        int CatchingFishFragmentHandler = CatchingFishHiltBundle.CatchingFishFragmentHandler(catchingFishReduxRetrofit, CatchingFishLayout, CatchingFishViewModelScope, layoutParams.width);
        int CatchingFishViewModelFAB = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j);
        int CatchingFishWorkManager = CatchingFishGradleGraphQL.CatchingFishWorkManager(j);
        ViewGroup.LayoutParams layoutParams2 = catchingFishReduxRetrofit.getLayoutParams();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(layoutParams2);
        catchingFishReduxRetrofit.measure(CatchingFishFragmentHandler, CatchingFishHiltBundle.CatchingFishFragmentHandler(catchingFishReduxRetrofit, CatchingFishViewModelFAB, CatchingFishWorkManager, layoutParams2.height));
        return catchingFishWidgetXMLLayout.CatchingFishFirebase(catchingFishReduxRetrofit.getMeasuredWidth(), catchingFishReduxRetrofit.getMeasuredHeight(), new CatchingFishDaggerCameraX(catchingFishReduxRetrofit, this.CatchingFishSnackbar, 1));
    }
}
