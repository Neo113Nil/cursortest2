package android.content.Context;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDrawableBetaSpark1812 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FrostHunterTransitionCelestialOmega6993 FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final /* synthetic */ View FrostHunterLifecycleBlazeGammaElite2889;
    public final /* synthetic */ int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterDrawableBetaSpark1812(FrostHunterTransitionCelestialOmega6993 frostHunterTransitionCelestialOmega6993, FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624, FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo56242, int i, View view) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionCelestialOmega6993;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterServiceInfoAuroraHyperNeo5624;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterServiceInfoAuroraHyperNeo56242;
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        this.FrostHunterLifecycleBlazeGammaElite2889 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        FrostHunterTransitionCelestialOmega6993 frostHunterTransitionCelestialOmega6993 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLifecycleCameraControllerBetaPrimeHyperion4727 frostHunterLifecycleCameraControllerBetaPrimeHyperion4727 = frostHunterTransitionCelestialOmega6993.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterLifecycleCameraControllerBetaPrimeHyperion4727.FrostHunterLifecycleBlazeGammaElite2889(animatedFraction);
        float FrostHunterBundlePulseFusionHero2475 = frostHunterLifecycleCameraControllerBetaPrimeHyperion4727.FrostHunterBundlePulseFusionHero2475();
        PathInterpolator pathInterpolator = FrostHunterSharedElementHyperVisionEpic7121.FrostHunterLifecycleBlazeGammaElite2889;
        int i = Build.VERSION.SDK_INT;
        FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterStateFlowAuroraLegendDelta6548 frostHunterLaunchHeroPulseNeo5805 = i >= 36 ? new FrostHunterLaunchHeroPulseNeo5805(frostHunterServiceInfoAuroraHyperNeo5624) : i >= 35 ? new FrostHunterServiceConnectionSparkElite7501(frostHunterServiceInfoAuroraHyperNeo5624) : i >= 34 ? new FrostHunterContentObserverBetaQuantumEpic3645(frostHunterServiceInfoAuroraHyperNeo5624) : i >= 31 ? new FrostHunterProximitySensorTitaniumEpicLegend3537(frostHunterServiceInfoAuroraHyperNeo5624) : i >= 30 ? new FrostHunterLaunchRogueStorm2286(frostHunterServiceInfoAuroraHyperNeo5624) : i >= 29 ? new FrostHunterStateStrikeRogue4835(frostHunterServiceInfoAuroraHyperNeo5624) : new FrostHunterColorStateListStormPulseElite7932(frostHunterServiceInfoAuroraHyperNeo5624);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.FrostHunterServiceEliteCelestialThunder1757 & i2;
            FrostHunterProfilerTurboMaxTurbo5507 frostHunterProfilerTurboMaxTurbo5507 = frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i3 == 0) {
                frostHunterLaunchHeroPulseNeo5805.FrostHunterServiceEliteCelestialThunder1757(i2, frostHunterProfilerTurboMaxTurbo5507.FrostHunterFlowMaxDragonHero5809(i2));
            } else {
                FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterFlowMaxDragonHero5809 = frostHunterProfilerTurboMaxTurbo5507.FrostHunterFlowMaxDragonHero5809(i2);
                FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterFlowMaxDragonHero58092 = this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809(i2);
                float f = 1.0f - FrostHunterBundlePulseFusionHero2475;
                frostHunterLaunchHeroPulseNeo5805.FrostHunterServiceEliteCelestialThunder1757(i2, FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFlowMaxDragonHero5809, (int) (((FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761 - FrostHunterFlowMaxDragonHero58092.FrostHunterAlphaAnimationNeoCosmos5761) * f) + 0.5d), (int) (((FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633 - FrostHunterFlowMaxDragonHero58092.FrostHunterConstraintSetCloneMasterUltraRogue2633) * f) + 0.5d), (int) (((FrostHunterFlowMaxDragonHero5809.FrostHunterBundlePulseFusionHero2475 - FrostHunterFlowMaxDragonHero58092.FrostHunterBundlePulseFusionHero2475) * f) + 0.5d), (int) (((FrostHunterFlowMaxDragonHero5809.FrostHunterServiceEliteCelestialThunder1757 - FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757) * f) + 0.5d)));
            }
        }
        FrostHunterSharedElementHyperVisionEpic7121.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterLifecycleBlazeGammaElite2889, frostHunterLaunchHeroPulseNeo5805.FrostHunterConstraintSetCloneMasterUltraRogue2633(), Collections.singletonList(frostHunterTransitionCelestialOmega6993));
    }
}
