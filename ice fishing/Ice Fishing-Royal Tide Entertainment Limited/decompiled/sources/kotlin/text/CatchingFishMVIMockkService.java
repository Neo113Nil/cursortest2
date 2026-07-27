package kotlin.text;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* loaded from: classes.dex */
public final class CatchingFishMVIMockkService extends Binder {
    public final CatchingFishViewPagerMockk CatchingFishEspressoTesting;

    public CatchingFishMVIMockkService(CatchingFishViewPagerMockk catchingFishViewPagerMockk) {
        this.CatchingFishEspressoTesting = catchingFishViewPagerMockk;
    }

    public final void CatchingFishParcelableFAB(CatchingFishBundleKtorFlux catchingFishBundleKtorFlux) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = catchingFishBundleKtorFlux.CatchingFishParcelableFAB;
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.CatchingFishEspressoTesting.CatchingFishDaggerWebsocket;
        int i = EnhancedIntentService.CatchingFishLayout;
        CatchingFishAndroidXPayPal catchingFishAndroidXPayPal = new CatchingFishAndroidXPayPal();
        enhancedIntentService.CatchingFishReduxKtor.execute(new CatchingFishMVPFluxFirebase(enhancedIntentService, intent, catchingFishAndroidXPayPal, 2));
        catchingFishAndroidXPayPal.CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishExoPlayerRealm(), new CatchingFishLayoutCoroutine(11, catchingFishBundleKtorFlux));
    }
}
