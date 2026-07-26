package android.content.Context;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionListenerShadowVisionNovaX9521 extends FrostHunterFontFamilyOmegaOmega7640 {
    final /* synthetic */ FrostHunterCamera2PrimeOlympianThunder6126 this$0;

    /* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
    public static final class FrostHunterTransitionManagerOmegaNeoMaster3754 extends FrostHunterFontFamilyOmegaOmega7640 {
        final /* synthetic */ FrostHunterCamera2PrimeOlympianThunder6126 this$0;

        public FrostHunterTransitionManagerOmegaNeoMaster3754(FrostHunterCamera2PrimeOlympianThunder6126 frostHunterCamera2PrimeOlympianThunder6126) {
            this.this$0 = frostHunterCamera2PrimeOlympianThunder6126;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.FrostHunterBundlePulseFusionHero2475();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            FrostHunterCamera2PrimeOlympianThunder6126 frostHunterCamera2PrimeOlympianThunder6126 = this.this$0;
            int i = frostHunterCamera2PrimeOlympianThunder6126.FrostHunterCameraXPixelTurboCosmos9814 + 1;
            frostHunterCamera2PrimeOlympianThunder6126.FrostHunterCameraXPixelTurboCosmos9814 = i;
            if (i == 1 && frostHunterCamera2PrimeOlympianThunder6126.FrostHunterKeyframeGammaGamma1197) {
                frostHunterCamera2PrimeOlympianThunder6126.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterServiceEliteCelestialThunder1757(FrostHunterMaterialCardViewLegendDragon2868.ON_START);
                frostHunterCamera2PrimeOlympianThunder6126.FrostHunterKeyframeGammaGamma1197 = false;
            }
        }
    }

    public FrostHunterTransitionListenerShadowVisionNovaX9521(FrostHunterCamera2PrimeOlympianThunder6126 frostHunterCamera2PrimeOlympianThunder6126) {
        this.this$0 = frostHunterCamera2PrimeOlympianThunder6126;
    }

    @Override // android.content.Context.FrostHunterFontFamilyOmegaOmega7640, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = FrostHunterTextInputLayoutLegendBeta2184.FrostHunterFlowMaxDragonHero5809;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((FrostHunterTextInputLayoutLegendBeta2184) findFragmentByTag).FrostHunterCameraXPixelTurboCosmos9814 = this.this$0.FrostHunterScaleAnimationStrikeSpark5059;
        }
    }

    @Override // android.content.Context.FrostHunterFontFamilyOmegaOmega7640, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        FrostHunterCamera2PrimeOlympianThunder6126 frostHunterCamera2PrimeOlympianThunder6126 = this.this$0;
        int i = frostHunterCamera2PrimeOlympianThunder6126.FrostHunterFlowMaxDragonHero5809 - 1;
        frostHunterCamera2PrimeOlympianThunder6126.FrostHunterFlowMaxDragonHero5809 = i;
        if (i == 0) {
            Handler handler = frostHunterCamera2PrimeOlympianThunder6126.FrostHunterFragmentBetaMegaVortex6025;
            handler.getClass();
            handler.postDelayed(frostHunterCamera2PrimeOlympianThunder6126.FrostHunterLightSensorForceFusion4241, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        FrostHunterRemoteConfigPulseLegendStorm6177.FrostHunterFlowMaxDragonHero5809(activity, new FrostHunterTransitionManagerOmegaNeoMaster3754(this.this$0));
    }

    @Override // android.content.Context.FrostHunterFontFamilyOmegaOmega7640, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        FrostHunterCamera2PrimeOlympianThunder6126 frostHunterCamera2PrimeOlympianThunder6126 = this.this$0;
        int i = frostHunterCamera2PrimeOlympianThunder6126.FrostHunterCameraXPixelTurboCosmos9814 - 1;
        frostHunterCamera2PrimeOlympianThunder6126.FrostHunterCameraXPixelTurboCosmos9814 = i;
        if (i == 0 && frostHunterCamera2PrimeOlympianThunder6126.FrostHunterAlertDialogAuroraDelta3200) {
            frostHunterCamera2PrimeOlympianThunder6126.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterServiceEliteCelestialThunder1757(FrostHunterMaterialCardViewLegendDragon2868.ON_STOP);
            frostHunterCamera2PrimeOlympianThunder6126.FrostHunterKeyframeGammaGamma1197 = true;
        }
    }
}
