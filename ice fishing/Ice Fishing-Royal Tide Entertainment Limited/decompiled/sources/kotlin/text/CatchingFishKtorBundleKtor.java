package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishKtorBundleKtor implements CatchingFishServiceHandler {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishKtorBundleKtor(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishIntentCoroutine) this.CatchingFishDaggerWebsocket).CatchingFishWorkManager.removeCallbacks((CatchingFishService) this.CatchingFishWorkManager);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                CatchingFishCameraXAndroidX catchingFishCameraXAndroidX = (CatchingFishCameraXAndroidX) this.CatchingFishDaggerWebsocket;
                String str = (String) this.CatchingFishWorkManager;
                CatchingFishDaggerHiltMVI catchingFishDaggerHiltMVI = (CatchingFishDaggerHiltMVI) obj;
                catchingFishCameraXAndroidX.getClass();
                catchingFishDaggerHiltMVI.CatchingFishReduxKtor(CatchingFishCameraXAndroidX.CatchingFishReduxKtor, str);
                catchingFishCameraXAndroidX.CatchingFishReduxKtor(catchingFishDaggerHiltMVI, str);
                return null;
            case 2:
                CatchingFishLayoutStripeAPI catchingFishLayoutStripeAPI = (CatchingFishLayoutStripeAPI) this.CatchingFishDaggerWebsocket;
                CatchingFishServiceBundle catchingFishServiceBundle = (CatchingFishServiceBundle) this.CatchingFishWorkManager;
                catchingFishLayoutStripeAPI.CatchingFishDaggerHiltFAB(obj);
                if (catchingFishServiceBundle != null) {
                    catchingFishServiceBundle.CatchingFishParcelableFAB(obj);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt = (CatchingFishMVIHandlerHilt) this.CatchingFishDaggerWebsocket;
                Throwable th = (Throwable) this.CatchingFishWorkManager;
                Throwable th2 = (Throwable) obj;
                synchronized (catchingFishMVIHandlerHilt.CatchingFishSnackbar) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                CatchingFishAdMobFAB.CatchingFishViewModelFAB(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    catchingFishMVIHandlerHilt.CatchingFishReduxKtor = th;
                    CatchingFishHandlerAndroidX catchingFishHandlerAndroidX = catchingFishMVIHandlerHilt.CatchingFishJetpackCompose;
                    CatchingFishContextAndroidX catchingFishContextAndroidX = CatchingFishContextAndroidX.CatchingFishReduxKtor;
                    catchingFishHandlerAndroidX.getClass();
                    catchingFishHandlerAndroidX.CatchingFishFragmentHandler(null, catchingFishContextAndroidX);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
