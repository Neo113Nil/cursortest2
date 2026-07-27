package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInAppPurchaseLegendHyperion1980 extends FrostHunterMaterialCardViewEliteRogue2483 {
    public float FrostHunterAlphaAnimationNeoCosmos5761;
    public float FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterInAppPurchaseLegendHyperion1980(float f, float f2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final float FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (i == 0) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final FrostHunterMaterialCardViewEliteRogue2483 FrostHunterBundlePulseFusionHero2475() {
        return new FrostHunterInAppPurchaseLegendHyperion1980(0.0f, 0.0f);
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return 2;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final void FrostHunterLifecycleBlazeGammaElite2889(float f, int i) {
        if (i == 0) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        } else {
            if (i != 1) {
                return;
            }
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
        }
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final void FrostHunterServiceEliteCelestialThunder1757() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0.0f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterInAppPurchaseLegendHyperion1980)) {
            return false;
        }
        FrostHunterInAppPurchaseLegendHyperion1980 frostHunterInAppPurchaseLegendHyperion1980 = (FrostHunterInAppPurchaseLegendHyperion1980) obj;
        return frostHunterInAppPurchaseLegendHyperion1980.FrostHunterAlphaAnimationNeoCosmos5761 == this.FrostHunterAlphaAnimationNeoCosmos5761 && frostHunterInAppPurchaseLegendHyperion1980.FrostHunterConstraintSetCloneMasterUltraRogue2633 == this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", v2 = " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }
}
