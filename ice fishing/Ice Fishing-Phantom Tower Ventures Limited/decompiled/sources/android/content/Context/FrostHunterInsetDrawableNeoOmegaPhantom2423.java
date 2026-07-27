package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInsetDrawableNeoOmegaPhantom2423 {
    public static final FrostHunterInsetDrawableNeoOmegaPhantom2423 FrostHunterBundlePulseFusionHero2475 = new FrostHunterInsetDrawableNeoOmegaPhantom2423(FrostHunterViewBindingRogueOmegaPhoenix9310.FrostHunterBundlePulseFusionHero2475, 17);
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterInsetDrawableNeoOmegaPhantom2423(float f, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterInsetDrawableNeoOmegaPhantom2423)) {
            return false;
        }
        FrostHunterInsetDrawableNeoOmegaPhantom2423 frostHunterInsetDrawableNeoOmegaPhantom2423 = (FrostHunterInsetDrawableNeoOmegaPhantom2423) obj;
        float f = frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = FrostHunterViewBindingRogueOmegaPhoenix9310.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, f) == 0 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final int hashCode() {
        float f = FrostHunterViewBindingRogueOmegaPhoenix9310.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return Integer.hashCode(0) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterBundlePulseFusionHero2475(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) FrostHunterViewBindingRogueOmegaPhoenix9310.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterAlphaAnimationNeoCosmos5761));
        sb.append(", trim=");
        int i = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
