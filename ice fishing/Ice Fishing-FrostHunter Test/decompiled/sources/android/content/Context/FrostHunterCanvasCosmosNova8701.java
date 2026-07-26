package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCanvasCosmosNova8701 {
    public static final FrostHunterCanvasCosmosNova8701 FrostHunterBundlePulseFusionHero2475 = new FrostHunterCanvasCosmosNova8701(2, false);
    public static final FrostHunterCanvasCosmosNova8701 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterCanvasCosmosNova8701(1, true);
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterCanvasCosmosNova8701(int i, boolean z) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterCanvasCosmosNova8701)) {
            return false;
        }
        FrostHunterCanvasCosmosNova8701 frostHunterCanvasCosmosNova8701 = (FrostHunterCanvasCosmosNova8701) obj;
        return this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterCanvasCosmosNova8701.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterCanvasCosmosNova8701.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Integer.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31);
    }

    public final String toString() {
        return equals(FrostHunterBundlePulseFusionHero2475) ? "TextMotion.Static" : equals(FrostHunterServiceEliteCelestialThunder1757) ? "TextMotion.Animated" : "Invalid";
    }
}
