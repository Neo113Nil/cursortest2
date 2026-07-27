package kotlin.text;

import android.os.Build;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskRedux implements CatchingFishHandlerSnackbar {
    public static boolean CatchingFishWorkManager = true;
    public Object CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public boolean CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;

    /* JADX WARN: Multi-variable type inference failed */
    public int CatchingFishCoroutine(CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishGradleCameraX catchingFishGradleCameraX, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        CatchingFishDaggerViewModel catchingFishDaggerViewModel = (CatchingFishDaggerViewModel) this.CatchingFishCoroutine;
        CatchingFishStripeAPIOkHttp catchingFishStripeAPIOkHttp = (CatchingFishStripeAPIOkHttp) this.CatchingFishDaggerWebsocket;
        if (this.CatchingFishParcelableFAB) {
            return 0;
        }
        try {
            this.CatchingFishParcelableFAB = true;
            CatchingFishGlideFAB CatchingFish = ((CatchingFishViewPagerMockk) this.CatchingFishReduxKtor).CatchingFish(catchingFishViewModelIntent, catchingFishGradleCameraX);
            CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) CatchingFish.CatchingFishSnackbar;
            int CatchingFishViewModelScope = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope();
            for (int i3 = 0; i3 < CatchingFishViewModelScope; i3++) {
                CatchingFishFABAdMob catchingFishFABAdMob = (CatchingFishFABAdMob) catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(i3);
                if (!catchingFishFABAdMob.CatchingFishReduxKtor && !catchingFishFABAdMob.CatchingFishViewModelFAB) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int CatchingFishViewModelScope2 = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope();
            for (int i4 = 0; i4 < CatchingFishViewModelScope2; i4++) {
                CatchingFishFABAdMob catchingFishFABAdMob2 = (CatchingFishFABAdMob) catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(i4);
                if (objArr != false || CatchingFishOkHttpFAB.CatchingFishWorkManager(catchingFishFABAdMob2)) {
                    ((CatchingFishBiometricRoom) this.CatchingFishSnackbar).CatchingFishDaggerHiltFAB(catchingFishFABAdMob2.CatchingFishCoroutine, (CatchingFishStripeAPIOkHttp) this.CatchingFishDaggerWebsocket, catchingFishFABAdMob2.CatchingFishLayout, true);
                    if (!catchingFishStripeAPIOkHttp.CatchingFishReduxKtor.CatchingFishViewModelScope()) {
                        catchingFishDaggerViewModel.CatchingFishParcelableFAB(catchingFishFABAdMob2.CatchingFishParcelableFAB, catchingFishStripeAPIOkHttp, CatchingFishOkHttpFAB.CatchingFishWorkManager(catchingFishFABAdMob2));
                        catchingFishStripeAPIOkHttp.clear();
                    }
                }
            }
            boolean CatchingFishSnackbar = catchingFishDaggerViewModel.CatchingFishSnackbar(CatchingFish, z);
            if (!CatchingFish.CatchingFishParcelableFAB) {
                int CatchingFishViewModelScope3 = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope();
                for (int i5 = 0; i5 < CatchingFishViewModelScope3; i5++) {
                    CatchingFishFABAdMob catchingFishFABAdMob3 = (CatchingFishFABAdMob) catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(i5);
                    if (!CatchingFishToolbarMVIMVVM.CatchingFishParcelableFAB(CatchingFishToolbarMVIMVVM.CatchingFishSnackbar(catchingFishFABAdMob3.CatchingFishCoroutine, catchingFishFABAdMob3.CatchingFishViewModelScope), 0L) && catchingFishFABAdMob3.CatchingFishSnackbar()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int CatchingFishViewModelScope4 = catchingFishLayoutMVVMFlux.CatchingFishViewModelScope();
            int i6 = 0;
            while (true) {
                if (i6 >= CatchingFishViewModelScope4) {
                    i2 = 0;
                    break;
                }
                if (((CatchingFishFABAdMob) catchingFishLayoutMVVMFlux.CatchingFishViewModelFAB(i6)).CatchingFishSnackbar()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (CatchingFishSnackbar ? 1 : 0) | (i << 1) | (i2 << 2);
            this.CatchingFishParcelableFAB = false;
            return i7;
        } catch (Throwable th) {
            this.CatchingFishParcelableFAB = false;
            throw th;
        }
    }

    public CatchingFishHiltMVI CatchingFishParcelableFAB() {
        CatchingFishFirebaseRealm catchingFishGsonXMLLayout;
        CatchingFishHiltMVI catchingFishHiltMVI;
        synchronized (this.CatchingFishCoroutine) {
            try {
                CatchingFishGradleCameraX catchingFishGradleCameraX = (CatchingFishGradleCameraX) this.CatchingFishSnackbar;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    catchingFishGradleCameraX.getUniqueDrawingId();
                }
                if (i >= 29) {
                    catchingFishGsonXMLLayout = new CatchingFishAdMobAdMobFlux();
                } else if (CatchingFishWorkManager) {
                    try {
                        catchingFishGsonXMLLayout = new CatchingFishMVIStripeAPI((CatchingFishGradleCameraX) this.CatchingFishSnackbar, new CatchingFishManifestPayPal(), new CatchingFishEspressoMoshi());
                    } catch (Throwable unused) {
                        CatchingFishWorkManager = false;
                        catchingFishGsonXMLLayout = new CatchingFishGsonXMLLayout(CatchingFishSnackbar((CatchingFishGradleCameraX) this.CatchingFishSnackbar));
                    }
                } else {
                    catchingFishGsonXMLLayout = new CatchingFishGsonXMLLayout(CatchingFishSnackbar((CatchingFishGradleCameraX) this.CatchingFishSnackbar));
                }
                catchingFishHiltMVI = new CatchingFishHiltMVI(catchingFishGsonXMLLayout);
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishHiltMVI;
    }

    public CatchingFishWidgetAppCompat CatchingFishSnackbar(CatchingFishGradleCameraX catchingFishGradleCameraX) {
        CatchingFishFluxUnitTesting catchingFishFluxUnitTesting = (CatchingFishFluxUnitTesting) this.CatchingFishReduxKtor;
        if (catchingFishFluxUnitTesting != null) {
            return catchingFishFluxUnitTesting;
        }
        CatchingFishFluxUnitTesting catchingFishFluxUnitTesting2 = new CatchingFishFluxUnitTesting(catchingFishGradleCameraX.getContext());
        catchingFishFluxUnitTesting2.setClipChildren(false);
        catchingFishFluxUnitTesting2.setClipToPadding(false);
        catchingFishFluxUnitTesting2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        catchingFishGradleCameraX.addView(catchingFishFluxUnitTesting2, -1);
        this.CatchingFishReduxKtor = catchingFishFluxUnitTesting2;
        return catchingFishFluxUnitTesting2;
    }
}
