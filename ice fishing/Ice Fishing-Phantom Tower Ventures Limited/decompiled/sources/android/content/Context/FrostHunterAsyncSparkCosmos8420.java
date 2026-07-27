package android.content.Context;

import android.os.SystemClock;
import com.adjust.sdk.network.ErrorCodes;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAsyncSparkCosmos8420 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public boolean FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final /* synthetic */ FrostHunterColorStateListOmegaHero9965 FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAsyncSparkCosmos8420(FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965, int i) {
        this.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterColorStateListOmegaHero9965;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965 = this.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = (FrostHunterRotateDrawableMaxPrime8918) frostHunterColorStateListOmegaHero9965.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterColorStateListOmegaHero9965.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
        int i = frostHunterThreadSpectraShadowGamma2307.FrostHunterLiveDataBetaLegend3442.FrostHunterLightSensorForceFusion4241;
        if (!frostHunterThreadSpectraShadowGamma2307.FrostHunterServiceConnectionTurboPhoenixOmega6719() || frostHunterThreadSpectraShadowGamma2307.FrostHunterLightSensorForceFusion4241() == 1 || frostHunterThreadSpectraShadowGamma2307.FrostHunterLightSensorForceFusion4241() == 4 || i == 0 || i == 1) {
            if (this.FrostHunterBundlePulseFusionHero2475) {
                frostHunterRotateDrawableMaxPrime8918.FrostHunterLifecycleBlazeGammaElite2889(4);
            }
            this.FrostHunterBundlePulseFusionHero2475 = false;
            return;
        }
        ((FrostHunterAssetManagerQuantumRogue9837) frostHunterColorStateListOmegaHero9965.FrostHunterCameraXPixelTurboCosmos9814).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (z && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == i) {
            if (elapsedRealtime - this.FrostHunterServiceEliteCelestialThunder1757 >= i2) {
                ((FrostHunterProcessCameraProviderQuantumNovaXHyperion4894) frostHunterColorStateListOmegaHero9965.FrostHunterRemoteConfigSpeedSpeed8566).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterDialogFragmentTurboPhoenixDragon7627(new FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868(2, new FrostHunterTransitionListenerNeoOmegaSolar7445(4, i2), ErrorCodes.MALFORMED_URL_EXCEPTION));
                return;
            }
            return;
        }
        this.FrostHunterBundlePulseFusionHero2475 = true;
        this.FrostHunterServiceEliteCelestialThunder1757 = elapsedRealtime;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        frostHunterRotateDrawableMaxPrime8918.FrostHunterLifecycleBlazeGammaElite2889(4);
        frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.sendEmptyMessageDelayed(4, i2);
    }
}
