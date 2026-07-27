package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;

/* loaded from: classes.dex */
public final class CatchingFishFABParcelable implements CatchingFishMockkView {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFABParcelable(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI = (CatchingFishSharedFlowMVI) obj;
                int intValue = ((Number) obj2).intValue();
                MainActivity mainActivity = (MainActivity) this.CatchingFishDaggerWebsocket;
                CatchingFishBundleGlide catchingFishBundleGlide = mainActivity.CatchingFishGsonAppCompat;
                if ((intValue & 3) == 2 && catchingFishSharedFlowMVI.CatchingFishSpannableWidget()) {
                    catchingFishSharedFlowMVI.CatchingFishPayPalLiveData();
                } else {
                    int CatchingFishViewModelScope = ((CatchingFishViewWidgetFAB) catchingFishBundleGlide.CatchingFishDaggerWebsocket).CatchingFishViewModelScope();
                    boolean booleanValue = ((Boolean) ((CatchingFishAsyncTaskIntent) catchingFishBundleGlide.CatchingFishWorkManager).getValue()).booleanValue();
                    catchingFishSharedFlowMVI.CatchingFishParcelable(-1971577899);
                    boolean CatchingFishViewModelScope2 = catchingFishSharedFlowMVI.CatchingFishViewModelScope(mainActivity);
                    Object CatchingFishPayPalService = catchingFishSharedFlowMVI.CatchingFishPayPalService();
                    if (CatchingFishViewModelScope2 || CatchingFishPayPalService == CatchingFishGsonOkHttp.CatchingFishParcelableFAB) {
                        CatchingFishNavigationFAB catchingFishNavigationFAB = new CatchingFishNavigationFAB(2, mainActivity, MainActivity.class, "acceptWebContainer", "acceptWebContainer(Landroid/widget/FrameLayout;Landroid/webkit/WebView;)V", 0, 0);
                        catchingFishSharedFlowMVI.CatchingFishMoshiDaggerHilt(catchingFishNavigationFAB);
                        CatchingFishPayPalService = catchingFishNavigationFAB;
                    }
                    catchingFishSharedFlowMVI.CatchingFishStateLiveData(false);
                    CatchingFishFirebaseDagger.CatchingFishViewModelScope(CatchingFishViewModelScope, booleanValue, (CatchingFishMockkView) ((CatchingFishPicassoRetrofit) CatchingFishPayPalService), catchingFishSharedFlowMVI, 0);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI2 = (CatchingFishSharedFlowMVI) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && catchingFishSharedFlowMVI2.CatchingFishSpannableWidget()) {
                    catchingFishSharedFlowMVI2.CatchingFishPayPalLiveData();
                } else {
                    CatchingFishMVVMBiometric.CatchingFishParcelableFAB(false, CatchingFishBiometricBundle.CatchingFishMutableLiveData(123255100, new CatchingFishFABParcelable(0, (MainActivity) this.CatchingFishDaggerWebsocket), catchingFishSharedFlowMVI2), catchingFishSharedFlowMVI2, 48);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishSharedFlowMVI catchingFishSharedFlowMVI3 = (CatchingFishSharedFlowMVI) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (catchingFishSharedFlowMVI3.CatchingFishDagger(intValue2 & 1, (intValue2 & 3) != 2)) {
                    throw null;
                }
                catchingFishSharedFlowMVI3.CatchingFishPayPalLiveData();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
