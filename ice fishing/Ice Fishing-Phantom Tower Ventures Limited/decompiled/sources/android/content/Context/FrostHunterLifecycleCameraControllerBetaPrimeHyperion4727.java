package android.content.Context;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLifecycleCameraControllerBetaPrimeHyperion4727 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final Interpolator FrostHunterBundlePulseFusionHero2475;
    public float FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLifecycleCameraControllerBetaPrimeHyperion4727(int i, Interpolator interpolator, long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterBundlePulseFusionHero2475 = interpolator;
        this.FrostHunterServiceEliteCelestialThunder1757 = j;
    }

    public float FrostHunterAlphaAnimationNeoCosmos5761() {
        return 1.0f;
    }

    public float FrostHunterBundlePulseFusionHero2475() {
        float f = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Interpolator interpolator = this.FrostHunterBundlePulseFusionHero2475;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public long FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public void FrostHunterLifecycleBlazeGammaElite2889(float f) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
    }

    public int FrostHunterServiceEliteCelestialThunder1757() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761;
    }
}
