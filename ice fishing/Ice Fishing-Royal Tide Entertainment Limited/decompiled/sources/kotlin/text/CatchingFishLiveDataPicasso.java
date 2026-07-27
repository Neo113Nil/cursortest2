package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataPicasso implements CatchingFishMVPViewService {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 0;
    public final Object CatchingFishWorkManager;

    public CatchingFishLiveDataPicasso(CatchingFishCoroutineWidget catchingFishCoroutineWidget, CatchingFishMVPViewService catchingFishMVPViewService) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishCoroutineWidget, "defaultLifecycleObserver");
        this.CatchingFishDaggerWebsocket = catchingFishCoroutineWidget;
        this.CatchingFishWorkManager = catchingFishMVPViewService;
    }

    @Override // kotlin.text.CatchingFishMVPViewService
    public final void CatchingFishSnackbar(CatchingFishToastFlux catchingFishToastFlux, CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishCoroutineWidget catchingFishCoroutineWidget = (CatchingFishCoroutineWidget) this.CatchingFishDaggerWebsocket;
                switch (CatchingFishReduxBundleKtor.CatchingFishParcelableFAB[catchingFishToolbarLiveData.ordinal()]) {
                    case 1:
                        catchingFishCoroutineWidget.getClass();
                        break;
                    case 2:
                        catchingFishCoroutineWidget.CatchingFishDaggerWebsocket(catchingFishToastFlux);
                        break;
                    case 3:
                        catchingFishCoroutineWidget.CatchingFishCoroutine(catchingFishToastFlux);
                        break;
                    case 4:
                        catchingFishCoroutineWidget.getClass();
                        break;
                    case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                        catchingFishCoroutineWidget.CatchingFishReduxKtor(catchingFishToastFlux);
                        break;
                    case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                        catchingFishCoroutineWidget.getClass();
                        break;
                    case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new CatchingFishBiometricView();
                }
                CatchingFishMVPViewService catchingFishMVPViewService = (CatchingFishMVPViewService) this.CatchingFishWorkManager;
                if (catchingFishMVPViewService != null) {
                    catchingFishMVPViewService.CatchingFishSnackbar(catchingFishToastFlux, catchingFishToolbarLiveData);
                    return;
                }
                return;
            case 1:
                if (catchingFishToolbarLiveData == CatchingFishToolbarLiveData.ON_START) {
                    ((CatchingFishToolbarToast) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager(this);
                    ((CatchingFishViewModelIntent) this.CatchingFishWorkManager).CatchingFishMVPRobolectric();
                    return;
                }
                return;
            case 2:
                CatchingFishViewFABEspresso catchingFishViewFABEspresso = (CatchingFishViewFABEspresso) this.CatchingFishDaggerWebsocket;
                int i = CatchingFishParcelableKtor.CatchingFishParcelableFAB[catchingFishToolbarLiveData.ordinal()];
                if (i == 1) {
                    catchingFishViewFABEspresso.CatchingFishSnackbar(true);
                    return;
                }
                if (i == 2) {
                    catchingFishViewFABEspresso.CatchingFishSnackbar(false);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    catchingFishViewFABEspresso.CatchingFishParcelableFAB();
                    ((CatchingFishToolbarToast) this.CatchingFishWorkManager).CatchingFishWorkManager(this);
                    return;
                }
            default:
                HashMap hashMap = ((CatchingFishOkHttpCameraX) this.CatchingFishWorkManager).CatchingFishParcelableFAB;
                List list = (List) hashMap.get(catchingFishToolbarLiveData);
                Object obj = this.CatchingFishDaggerWebsocket;
                CatchingFishOkHttpCameraX.CatchingFishParcelableFAB(list, catchingFishToastFlux, catchingFishToolbarLiveData, obj);
                CatchingFishOkHttpCameraX.CatchingFishParcelableFAB((List) hashMap.get(CatchingFishToolbarLiveData.ON_ANY), catchingFishToastFlux, catchingFishToolbarLiveData, obj);
                return;
        }
    }

    public CatchingFishLiveDataPicasso(CatchingFishLiveDataFABMVP catchingFishLiveDataFABMVP) {
        this.CatchingFishDaggerWebsocket = catchingFishLiveDataFABMVP;
        CatchingFishBiometricKtor catchingFishBiometricKtor = CatchingFishBiometricKtor.CatchingFishCoroutine;
        Class<?> cls = catchingFishLiveDataFABMVP.getClass();
        CatchingFishOkHttpCameraX catchingFishOkHttpCameraX = (CatchingFishOkHttpCameraX) catchingFishBiometricKtor.CatchingFishParcelableFAB.get(cls);
        this.CatchingFishWorkManager = catchingFishOkHttpCameraX == null ? catchingFishBiometricKtor.CatchingFishParcelableFAB(cls, null) : catchingFishOkHttpCameraX;
    }

    public CatchingFishLiveDataPicasso(CatchingFishToolbarToast catchingFishToolbarToast, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        this.CatchingFishDaggerWebsocket = catchingFishToolbarToast;
        this.CatchingFishWorkManager = catchingFishViewModelIntent;
    }

    public CatchingFishLiveDataPicasso(CatchingFishViewFABEspresso catchingFishViewFABEspresso, CatchingFishFluxCameraX catchingFishFluxCameraX, CatchingFishToolbarToast catchingFishToolbarToast) {
        this.CatchingFishDaggerWebsocket = catchingFishViewFABEspresso;
        this.CatchingFishWorkManager = catchingFishToolbarToast;
    }
}
