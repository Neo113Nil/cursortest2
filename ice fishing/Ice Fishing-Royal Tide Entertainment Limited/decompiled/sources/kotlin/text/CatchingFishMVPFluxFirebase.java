package kotlin.text;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVPFluxFirebase implements Runnable {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishViewModelScope;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVPFluxFirebase(Object obj, Object obj2, Object obj3, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
        this.CatchingFishViewModelScope = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishMVIMockk catchingFishMVIMockk = (CatchingFishMVIMockk) this.CatchingFishDaggerWebsocket;
                CatchingFishBundleMVIHilt catchingFishBundleMVIHilt = (CatchingFishBundleMVIHilt) this.CatchingFishWorkManager;
                String str = catchingFishBundleMVIHilt.CatchingFishParcelableFAB;
                CatchingFishSpannableView catchingFishSpannableView = (CatchingFishSpannableView) this.CatchingFishViewModelScope;
                catchingFishMVIMockk.getClass();
                Logger logger = CatchingFishMVIMockk.CatchingFishWorkManager;
                try {
                    CatchingFishAdMobCoroutine CatchingFishParcelableFAB = catchingFishMVIMockk.CatchingFishCoroutine.CatchingFishParcelableFAB(str);
                    if (CatchingFishParcelableFAB == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((CatchingFishMVIView) catchingFishMVIMockk.CatchingFishDaggerWebsocket).CatchingFishEspressoTesting(new CatchingFishDataStoreHilt(catchingFishMVIMockk, catchingFishBundleMVIHilt, ((CatchingFishGsonPicasso) CatchingFishParcelableFAB).CatchingFishParcelableFAB(catchingFishSpannableView), 0));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                CatchingFishFluxDataStore catchingFishFluxDataStore = (CatchingFishFluxDataStore) this.CatchingFishDaggerWebsocket;
                CatchingFishBiometricBundle catchingFishBiometricBundle = (CatchingFishBiometricBundle) this.CatchingFishWorkManager;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.CatchingFishViewModelScope;
                try {
                    CatchingFishRoomRealmMVI CatchingFishNavigation = CatchingFishAdMobFAB.CatchingFishNavigation(catchingFishFluxDataStore.CatchingFishParcelableFAB);
                    if (CatchingFishNavigation == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    CatchingFishIntentLiveData catchingFishIntentLiveData = (CatchingFishIntentLiveData) ((CatchingFishViewModelRealm) CatchingFishNavigation.CatchingFishSnackbar);
                    synchronized (catchingFishIntentLiveData.CatchingFishReduxKtor) {
                        catchingFishIntentLiveData.CatchingFishWorkManager = threadPoolExecutor;
                    }
                    ((CatchingFishViewModelRealm) CatchingFishNavigation.CatchingFishSnackbar).CatchingFishParcelableFAB(new CatchingFishLifecycleToast(catchingFishBiometricBundle, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    catchingFishBiometricBundle.CatchingFishGsonAppCompat(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.CatchingFishDaggerWebsocket;
                Intent intent = (Intent) this.CatchingFishWorkManager;
                CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = (CatchingFishAndroidXPayPal) this.CatchingFishViewModelScope;
                int i = EnhancedIntentService.CatchingFishLayout;
                try {
                    enhancedIntentService.CatchingFishCoroutine(intent);
                    return;
                } finally {
                    catchingFishAndroidXPayPal.CatchingFishParcelableFAB(null);
                }
        }
    }

    public /* synthetic */ CatchingFishMVPFluxFirebase(CatchingFishMVIMockk catchingFishMVIMockk, CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, CatchingFishAsyncTaskWidget catchingFishAsyncTaskWidget, CatchingFishSpannableView catchingFishSpannableView) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = catchingFishMVIMockk;
        this.CatchingFishWorkManager = catchingFishBundleMVIHilt;
        this.CatchingFishViewModelScope = catchingFishSpannableView;
    }
}
