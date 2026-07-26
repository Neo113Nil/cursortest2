package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPlaceholderPhoenixTitan8469 implements FrostHunterBitmapTurboStormHyperion1313 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterAnalyticsMasterAurora3691 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPlaceholderPhoenixTitan8469(int i, int i2, FrostHunterAnalyticsMasterAurora3691 frostHunterAnalyticsMasterAurora3691) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAnalyticsMasterAurora3691;
        this.FrostHunterBundlePulseFusionHero2475 = i * 1000000;
        this.FrostHunterServiceEliteCelestialThunder1757 = i2 * 1000000;
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final float FrostHunterBundlePulseFusionHero2475(long j, float f, float f2, float f3) {
        long j2 = j - this.FrostHunterServiceEliteCelestialThunder1757;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.FrostHunterBundlePulseFusionHero2475;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (FrostHunterConstraintSetCloneMasterUltraRogue2633(j4, f, f2, f3) - FrostHunterConstraintSetCloneMasterUltraRogue2633(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, float f, float f2, float f3) {
        long j2 = j - this.FrostHunterServiceEliteCelestialThunder1757;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.FrostHunterBundlePulseFusionHero2475;
        if (j2 > j3) {
            j2 = j3;
        }
        float FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterAlphaAnimationNeoCosmos5761 == 0 ? 1.0f : j2 / j3);
        return (f2 * FrostHunterConstraintSetCloneMasterUltraRogue2633) + ((1.0f - FrostHunterConstraintSetCloneMasterUltraRogue2633) * f);
    }

    @Override // android.content.Context.FrostHunterBitmapTurboStormHyperion1313
    public final long FrostHunterServiceEliteCelestialThunder1757(float f, float f2, float f3) {
        return this.FrostHunterServiceEliteCelestialThunder1757 + this.FrostHunterBundlePulseFusionHero2475;
    }
}
