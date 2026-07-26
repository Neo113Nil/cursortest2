package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewBindingRogueOmegaPhoenix9310 {
    public static final float FrostHunterBundlePulseFusionHero2475;
    public static final float FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final float FrostHunterServiceEliteCelestialThunder1757;
    public final float FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        FrostHunterAlphaAnimationNeoCosmos5761(0.0f);
        FrostHunterAlphaAnimationNeoCosmos5761(0.5f);
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0.5f;
        FrostHunterAlphaAnimationNeoCosmos5761(-1.0f);
        FrostHunterBundlePulseFusionHero2475 = -1.0f;
        FrostHunterAlphaAnimationNeoCosmos5761(1.0f);
        FrostHunterServiceEliteCelestialThunder1757 = 1.0f;
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterConstraintSetCloneMasterUltraRogue2633("topRatio should be in [0..1] range or -1");
        }
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == FrostHunterBundlePulseFusionHero2475) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == FrostHunterServiceEliteCelestialThunder1757) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostHunterViewBindingRogueOmegaPhoenix9310) {
            return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, ((FrostHunterViewBindingRogueOmegaPhoenix9310) obj).FrostHunterAlphaAnimationNeoCosmos5761) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final String toString() {
        return FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterAlphaAnimationNeoCosmos5761);
    }
}
