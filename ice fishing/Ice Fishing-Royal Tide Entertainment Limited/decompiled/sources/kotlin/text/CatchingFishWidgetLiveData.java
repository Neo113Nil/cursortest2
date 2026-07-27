package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public abstract class CatchingFishWidgetLiveData {
    public CatchingFishFluxFluxBundle CatchingFishParcelableFAB;
    public boolean CatchingFishSnackbar;

    public final void CatchingFishParcelableFAB() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishParcelableFAB;
        if (catchingFishFluxFluxBundle == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.CatchingFishSnackbar) {
            catchingFishFluxFluxBundle.CatchingFishViewModelScope(this, null);
        }
        CatchingFishReduxSharedFlow catchingFishReduxSharedFlow = (CatchingFishReduxSharedFlow) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = (CatchingFishLayoutCoroutine) catchingFishFluxFluxBundle.CatchingFishReduxKtor;
        catchingFishReduxSharedFlow.getClass();
        if (equals(catchingFishReduxSharedFlow.CatchingFishViewModelFAB) && -1 == catchingFishReduxSharedFlow.CatchingFishViewModelScope) {
            CatchingFishViewFABEspresso catchingFishViewFABEspresso = catchingFishReduxSharedFlow.CatchingFishWorkManager;
            if (catchingFishViewFABEspresso == null) {
                catchingFishViewFABEspresso = catchingFishReduxSharedFlow.CatchingFishCoroutine(-1);
            }
            catchingFishReduxSharedFlow.CatchingFishWorkManager = null;
            catchingFishReduxSharedFlow.CatchingFishViewModelScope = 0;
            catchingFishReduxSharedFlow.CatchingFishViewModelFAB = null;
            if (catchingFishViewFABEspresso != null) {
                CatchingFishViewPagerRealm catchingFishViewPagerRealm = catchingFishViewFABEspresso.CatchingFishReduxKtor;
                switch (catchingFishViewPagerRealm.CatchingFishReduxKtor) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CatchingFishToastSharedFlow catchingFishToastSharedFlow = (CatchingFishToastSharedFlow) catchingFishViewPagerRealm.CatchingFishDaggerWebsocket;
                        catchingFishToastSharedFlow.CatchingFishGsonAppCompat(true);
                        if (!catchingFishToastSharedFlow.CatchingFishViewModelFAB.CatchingFishSnackbar) {
                            catchingFishToastSharedFlow.CatchingFishViewModelScope.CatchingFishSnackbar().CatchingFishParcelableFAB();
                            break;
                        } else {
                            catchingFishToastSharedFlow.CatchingFishCameraXIntent();
                            break;
                        }
                    default:
                        ((CatchingFishServiceHandler) catchingFishViewPagerRealm.CatchingFishDaggerWebsocket).CatchingFishFragmentHandler(catchingFishViewPagerRealm);
                        break;
                }
            } else {
                ((CatchingFishFluxCameraX) catchingFishLayoutCoroutine.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB.run();
            }
            CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishReduxSharedFlow.CatchingFishParcelableFAB;
            catchingFishHandlerAndroidX.getClass();
            catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, CatchingFishParcelableFAB.CatchingFishLayout);
        }
        this.CatchingFishSnackbar = false;
    }

    public void CatchingFishSnackbar(boolean z) {
    }
}
