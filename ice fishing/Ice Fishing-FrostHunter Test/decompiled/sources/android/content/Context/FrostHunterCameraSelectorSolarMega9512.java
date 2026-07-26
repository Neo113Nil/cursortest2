package android.content.Context;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterCameraSelectorSolarMega9512 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ ComponentActivity FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterCameraSelectorSolarMega9512(ComponentActivity componentActivity, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = componentActivity;
    }

    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i2 = 0;
        ComponentActivity componentActivity = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i3 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                componentActivity.reportFullyDrawn();
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            case 1:
                return new FrostHunterProcessCameraProviderAlphaFusionSpectra5341(componentActivity.FrostHunterServiceConnectionTurboPhoenixOmega6719, new FrostHunterCameraSelectorSolarMega9512(componentActivity, i2));
            case 2:
                int i4 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                FrostHunterKeyframeTitaniumQuantumStorm9567 frostHunterKeyframeTitaniumQuantumStorm9567 = new FrostHunterKeyframeTitaniumQuantumStorm9567();
                componentActivity.FrostHunterBundlePulseFusionHero2475().FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterKeyframeTitaniumQuantumStorm9567);
                return frostHunterKeyframeTitaniumQuantumStorm9567;
            case 3:
                int i5 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                return new FrostHunterRewardedAdGammaThunder6003(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i6 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                FrostHunterNavigationSolarCosmos2919 frostHunterNavigationSolarCosmos2919 = new FrostHunterNavigationSolarCosmos2919(new FrostHunterTransitionListenerBetaUltra3918(componentActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterFirebaseModelDownloadConditionsEliteMaxEpic6718(frostHunterNavigationSolarCosmos2919, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new FrostHunterDialogQuantumTurbo8340(10, componentActivity, frostHunterNavigationSolarCosmos2919));
                    }
                }
                return frostHunterNavigationSolarCosmos2919;
        }
    }
}
