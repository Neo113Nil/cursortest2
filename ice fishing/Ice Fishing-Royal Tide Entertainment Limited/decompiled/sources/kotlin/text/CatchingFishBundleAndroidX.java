package kotlin.text;

import android.content.Context;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeAdjustBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeAdvertisingBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativePayloadFieldsBridge;
import com.catchingfish.fishcatcherpro.data.nativeconfig.bridge.NativeTransportBridge;
import com.catchingfish.fishcatcherpro.presentation.application.FishApp;

/* loaded from: classes.dex */
public final class CatchingFishBundleAndroidX {
    public final CatchingFishMVPExoPlayer CatchingFishCoroutine;
    public final CatchingFishKtorCameraX CatchingFishDaggerWebsocket;
    public final CatchingFishKtorCameraX CatchingFishLayout;
    public final CatchingFishGradleMVVM CatchingFishParcelableFAB;
    public final CatchingFishViewPagerMockk CatchingFishReduxKtor;
    public final CatchingFishViewPagerMockk CatchingFishSnackbar;
    public final CatchingFishKtorCameraX CatchingFishViewModelFAB;
    public final CatchingFishKtorCameraX CatchingFishViewModelScope;
    public final CatchingFishKtorCameraX CatchingFishWorkManager;

    public CatchingFishBundleAndroidX(FishApp fishApp) {
        Context applicationContext = fishApp.getApplicationContext();
        CatchingFishWidgetContext catchingFishWidgetContext = new CatchingFishWidgetContext();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(applicationContext, "appContext");
        CatchingFishFluxGraphQL catchingFishFluxGraphQL = new CatchingFishFluxGraphQL(applicationContext);
        new CatchingFishGradleMVVM(22);
        NativeAdvertisingBridge nativeAdvertisingBridge = new NativeAdvertisingBridge();
        NativeTransportBridge nativeTransportBridge = new NativeTransportBridge();
        NativeAdjustBridge nativeAdjustBridge = new NativeAdjustBridge();
        NativePayloadFieldsBridge nativePayloadFieldsBridge = new NativePayloadFieldsBridge();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
        catchingFishFluxFluxBundle.CatchingFishReduxKtor = nativeAdvertisingBridge;
        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = nativeTransportBridge;
        catchingFishFluxFluxBundle.CatchingFishWorkManager = nativeAdjustBridge;
        catchingFishFluxFluxBundle.CatchingFishViewModelScope = nativePayloadFieldsBridge;
        System.loadLibrary("native_params");
        this.CatchingFishParcelableFAB = new CatchingFishGradleMVVM(11);
        this.CatchingFishSnackbar = new CatchingFishViewPagerMockk(15, catchingFishFluxFluxBundle);
        this.CatchingFishCoroutine = new CatchingFishMVPExoPlayer(new CatchingFishWidgetContext(), new CatchingFishWidgetContext());
        this.CatchingFishReduxKtor = new CatchingFishViewPagerMockk(11, catchingFishWidgetContext);
        this.CatchingFishDaggerWebsocket = new CatchingFishKtorCameraX(catchingFishFluxGraphQL);
        this.CatchingFishWorkManager = new CatchingFishKtorCameraX(catchingFishFluxGraphQL);
        this.CatchingFishViewModelScope = new CatchingFishKtorCameraX(catchingFishFluxGraphQL);
        this.CatchingFishViewModelFAB = new CatchingFishKtorCameraX(catchingFishFluxGraphQL);
        this.CatchingFishLayout = new CatchingFishKtorCameraX(catchingFishFluxGraphQL);
    }
}
