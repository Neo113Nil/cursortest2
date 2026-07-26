package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnalyticsPulseDragon9368 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final float FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterAnalyticsPulseDragon9368(float f, int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = f;
    }

    public static FrostHunterAnalyticsPulseDragon9368 FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new FrostHunterAnalyticsPulseDragon9368(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterAnalyticsPulseDragon9368)) {
            return false;
        }
        FrostHunterAnalyticsPulseDragon9368 frostHunterAnalyticsPulseDragon9368 = (FrostHunterAnalyticsPulseDragon9368) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterAnalyticsPulseDragon9368.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterAnalyticsPulseDragon9368.FrostHunterConstraintSetCloneMasterUltraRogue2633 && Float.compare(this.FrostHunterBundlePulseFusionHero2475, frostHunterAnalyticsPulseDragon9368.FrostHunterBundlePulseFusionHero2475) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterBundlePulseFusionHero2475) + (((this.FrostHunterAlphaAnimationNeoCosmos5761 * 31) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", originator=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", gain=" + this.FrostHunterBundlePulseFusionHero2475 + '}';
    }
}
