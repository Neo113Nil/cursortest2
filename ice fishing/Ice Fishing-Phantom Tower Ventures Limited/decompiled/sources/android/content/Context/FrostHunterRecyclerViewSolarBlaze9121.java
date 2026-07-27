package android.content.Context;

import android.util.Range;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRecyclerViewSolarBlaze9121 {
    public long FrostHunterAlphaAnimationNeoCosmos5761;
    public double FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Range FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterRecyclerViewSolarBlaze9121() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.FrostHunterServiceEliteCelestialThunder1757 = range;
        this.FrostHunterBundlePulseFusionHero2475 = ((Double) range.getUpper()).doubleValue();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = -9223372036854775807L;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -9223372036854775807L;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2) {
        double doubleValue;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j != -9223372036854775807L);
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j2 != -9223372036854775807L);
        long j3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j3 != -9223372036854775807L) {
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633 != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.FrostHunterBundlePulseFusionHero2475 = (((Double) this.FrostHunterServiceEliteCelestialThunder1757.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.FrostHunterBundlePulseFusionHero2475 * 0.800000011920929d);
                this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
            }
        }
        doubleValue = ((Double) this.FrostHunterServiceEliteCelestialThunder1757.getUpper()).doubleValue();
        this.FrostHunterBundlePulseFusionHero2475 = (((Double) this.FrostHunterServiceEliteCelestialThunder1757.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.FrostHunterBundlePulseFusionHero2475 * 0.800000011920929d);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
    }

    public final void FrostHunterBundlePulseFusionHero2475(float f) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f > 0.0f);
        this.FrostHunterServiceEliteCelestialThunder1757 = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        this.FrostHunterBundlePulseFusionHero2475 = ((Double) this.FrostHunterServiceEliteCelestialThunder1757.getUpper()).doubleValue();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = -9223372036854775807L;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -9223372036854775807L;
    }
}
