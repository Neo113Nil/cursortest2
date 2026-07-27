package kotlin.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishStripeAPIRedux implements CatchingFishJUnitGlide {
    public final /* synthetic */ ComponentActivity CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishStripeAPIRedux(ComponentActivity componentActivity, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = componentActivity;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        int i = this.CatchingFishReduxKtor;
        int i2 = 0;
        ComponentActivity componentActivity = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = ComponentActivity.CatchingFishParcelableFlux;
                componentActivity.reportFullyDrawn();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            case 1:
                return new CatchingFishMVVMWebSocket(componentActivity.CatchingFishLayout, new CatchingFishStripeAPIRedux(componentActivity, i2));
            case 2:
                int i4 = ComponentActivity.CatchingFishParcelableFlux;
                CatchingFishRealmViewPager catchingFishRealmViewPager = new CatchingFishRealmViewPager();
                componentActivity.CatchingFishLayout().CatchingFishSnackbar().CatchingFishCoroutine.CatchingFishSnackbar(catchingFishRealmViewPager);
                return catchingFishRealmViewPager;
            case 3:
                int i5 = ComponentActivity.CatchingFishParcelableFlux;
                return new CatchingFishKtorLiveData(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i6 = ComponentActivity.CatchingFishParcelableFlux;
                CatchingFishFluxCameraX catchingFishFluxCameraX = new CatchingFishFluxCameraX(new CatchingFishGoogleMapsRoom(componentActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (CatchingFishFirebaseDagger.CatchingFishOkHttp(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.CatchingFishReduxKtor.CatchingFishParcelableFAB(new CatchingFishCameraXIntent(catchingFishFluxCameraX, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new CatchingFishEspressoFlux(4, componentActivity, catchingFishFluxCameraX));
                    }
                }
                return catchingFishFluxCameraX;
        }
    }
}
