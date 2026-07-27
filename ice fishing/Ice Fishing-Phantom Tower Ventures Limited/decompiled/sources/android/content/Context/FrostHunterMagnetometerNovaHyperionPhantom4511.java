package android.content.Context;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMagnetometerNovaHyperionPhantom4511 implements Application.ActivityLifecycleCallbacks {
    public final double FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterDispatchersInfernoSpark9076 FrostHunterFlowMaxDragonHero5809;

    public FrostHunterMagnetometerNovaHyperionPhantom4511(FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076, FrostHunterConstraintSetVisionCelestial6602 frostHunterConstraintSetVisionCelestial6602) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDispatchersInfernoSpark9076;
        FrostHunterPoseDetectionFusionHyperion4759 frostHunterPoseDetectionFusionHyperion4759 = frostHunterConstraintSetVisionCelestial6602.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterInstrumentationStrikeBlazeThunder7469 frostHunterInstrumentationStrikeBlazeThunder7469 = FrostHunterLintStormFusion8650.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = frostHunterPoseDetectionFusionHyperion4759.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterLightSensorForceFusion4241.FrostHunterAlphaAnimationNeoCosmos5761.get(FrostHunterLintStormFusion8650.FrostHunterServiceEliteCelestialThunder1757);
        this.FrostHunterCameraXPixelTurboCosmos9814 = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        long j;
        double d = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (d == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterConstraintSetVisionCelestial6602 frostHunterConstraintSetVisionCelestial6602 = (FrostHunterConstraintSetVisionCelestial6602) ((WeakReference) frostHunterDispatchersInfernoSpark9076.FrostHunterConstraintSetCloneMasterUltraRogue2633).get();
        if (frostHunterConstraintSetVisionCelestial6602 == null) {
            frostHunterDispatchersInfernoSpark9076.FrostHunterRemoteConfigSpeedSpeed8566();
            return;
        }
        FrostHunterTextInputLayoutTitaniumSolarVision1935 FrostHunterBundlePulseFusionHero2475 = frostHunterConstraintSetVisionCelestial6602.FrostHunterBundlePulseFusionHero2475();
        if (FrostHunterBundlePulseFusionHero2475 != null) {
            synchronized (FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475) {
                j = FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
            }
            FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761((long) (d * j));
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context) {
        long j;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterConstraintSetVisionCelestial6602 frostHunterConstraintSetVisionCelestial6602 = (FrostHunterConstraintSetVisionCelestial6602) ((WeakReference) frostHunterDispatchersInfernoSpark9076.FrostHunterConstraintSetCloneMasterUltraRogue2633).get();
        if (frostHunterConstraintSetVisionCelestial6602 == null) {
            frostHunterDispatchersInfernoSpark9076.FrostHunterRemoteConfigSpeedSpeed8566();
            return;
        }
        FrostHunterTextInputLayoutTitaniumSolarVision1935 FrostHunterBundlePulseFusionHero2475 = frostHunterConstraintSetVisionCelestial6602.FrostHunterBundlePulseFusionHero2475();
        if (FrostHunterBundlePulseFusionHero2475 != null) {
            synchronized (FrostHunterBundlePulseFusionHero2475.FrostHunterBundlePulseFusionHero2475) {
                j = FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
            }
            FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
