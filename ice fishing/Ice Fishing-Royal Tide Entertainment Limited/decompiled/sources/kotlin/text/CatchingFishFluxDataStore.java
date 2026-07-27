package kotlin.text;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishFluxDataStore implements CatchingFishViewModelRealm {
    public Context CatchingFishParcelableFAB;

    public CatchingFishFluxDataStore(Context context, int i) {
        switch (i) {
            case 2:
                this.CatchingFishParcelableFAB = context;
                break;
            default:
                this.CatchingFishParcelableFAB = context.getApplicationContext();
                break;
        }
    }

    @Override // kotlin.text.CatchingFishViewModelRealm
    public void CatchingFishParcelableFAB(CatchingFishBiometricBundle catchingFishBiometricBundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new CatchingFishJUnitStripeAPI("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new CatchingFishMVPFluxFirebase(this, catchingFishBiometricBundle, threadPoolExecutor, 1));
    }

    public CatchingFishSpannablePayPal CatchingFishSnackbar() {
        Context context = this.CatchingFishParcelableFAB;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        CatchingFishSpannablePayPal catchingFishSpannablePayPal = new CatchingFishSpannablePayPal();
        catchingFishSpannablePayPal.CatchingFishReduxKtor = CatchingFishGlideRetrofit.CatchingFishParcelableFAB(CatchingFishGsonCardView.CatchingFishEspressoTesting);
        CatchingFishFABFlux catchingFishFABFlux = new CatchingFishFABFlux(context);
        catchingFishSpannablePayPal.CatchingFishDaggerWebsocket = catchingFishFABFlux;
        catchingFishSpannablePayPal.CatchingFishWorkManager = CatchingFishGlideRetrofit.CatchingFishParcelableFAB(new CatchingFishViewModelIntent(1, catchingFishFABFlux, new CatchingFishServiceHilt(29, catchingFishFABFlux)));
        CatchingFishFABFlux catchingFishFABFlux2 = catchingFishSpannablePayPal.CatchingFishDaggerWebsocket;
        catchingFishSpannablePayPal.CatchingFishViewModelScope = new CatchingFishGsonParcelable(catchingFishFABFlux2, 1);
        CatchingFishHandlerMVP CatchingFishParcelableFAB = CatchingFishGlideRetrofit.CatchingFishParcelableFAB(new CatchingFishViewModelIntent(12, catchingFishSpannablePayPal.CatchingFishViewModelScope, CatchingFishGlideRetrofit.CatchingFishParcelableFAB(new CatchingFishGsonParcelable(catchingFishFABFlux2, 0))));
        catchingFishSpannablePayPal.CatchingFishViewModelFAB = CatchingFishParcelableFAB;
        CatchingFishMoshiFluxMoshi catchingFishMoshiFluxMoshi = new CatchingFishMoshiFluxMoshi(27);
        CatchingFishFABFlux catchingFishFABFlux3 = catchingFishSpannablePayPal.CatchingFishDaggerWebsocket;
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = new CatchingFishAsyncTaskDagger(catchingFishFABFlux3, CatchingFishParcelableFAB, catchingFishMoshiFluxMoshi, 19);
        CatchingFishHandlerMVP catchingFishHandlerMVP = catchingFishSpannablePayPal.CatchingFishReduxKtor;
        CatchingFishHandlerMVP catchingFishHandlerMVP2 = catchingFishSpannablePayPal.CatchingFishWorkManager;
        catchingFishSpannablePayPal.CatchingFishLayout = CatchingFishGlideRetrofit.CatchingFishParcelableFAB(new CatchingFishAsyncTaskDagger(new CatchingFishSensorManager(catchingFishHandlerMVP, catchingFishHandlerMVP2, catchingFishAsyncTaskDagger, CatchingFishParcelableFAB, CatchingFishParcelableFAB), new CatchingFishSpannableJUnit(catchingFishFABFlux3, catchingFishHandlerMVP2, CatchingFishParcelableFAB, catchingFishAsyncTaskDagger, catchingFishHandlerMVP, CatchingFishParcelableFAB, CatchingFishParcelableFAB), new CatchingFishFluxFluxBundle(catchingFishHandlerMVP, CatchingFishParcelableFAB, catchingFishAsyncTaskDagger, CatchingFishParcelableFAB), 23));
        return catchingFishSpannablePayPal;
    }
}
