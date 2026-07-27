package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSharedElementDragonSpectra8319 extends FrostHunterMaterialCardViewEliteRogue2483 {
    public float FrostHunterAlphaAnimationNeoCosmos5761;
    public float FrostHunterBundlePulseFusionHero2475;
    public float FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public float FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterSharedElementDragonSpectra8319(float f, float f2, float f3, float f4) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
        this.FrostHunterBundlePulseFusionHero2475 = f3;
        this.FrostHunterServiceEliteCelestialThunder1757 = f4;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final float FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        if (i == 0) {
            return this.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        if (i == 1) {
            return this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if (i == 2) {
            return this.FrostHunterBundlePulseFusionHero2475;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.FrostHunterServiceEliteCelestialThunder1757;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final FrostHunterMaterialCardViewEliteRogue2483 FrostHunterBundlePulseFusionHero2475() {
        return new FrostHunterSharedElementDragonSpectra8319(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return 4;
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final void FrostHunterLifecycleBlazeGammaElite2889(float f, int i) {
        if (i == 0) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
            return;
        }
        if (i == 1) {
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
        } else if (i == 2) {
            this.FrostHunterBundlePulseFusionHero2475 = f;
        } else {
            if (i != 3) {
                return;
            }
            this.FrostHunterServiceEliteCelestialThunder1757 = f;
        }
    }

    @Override // android.content.Context.FrostHunterMaterialCardViewEliteRogue2483
    public final void FrostHunterServiceEliteCelestialThunder1757() {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0.0f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0.0f;
        this.FrostHunterBundlePulseFusionHero2475 = 0.0f;
        this.FrostHunterServiceEliteCelestialThunder1757 = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FrostHunterSharedElementDragonSpectra8319)) {
            return false;
        }
        FrostHunterSharedElementDragonSpectra8319 frostHunterSharedElementDragonSpectra8319 = (FrostHunterSharedElementDragonSpectra8319) obj;
        return frostHunterSharedElementDragonSpectra8319.FrostHunterAlphaAnimationNeoCosmos5761 == this.FrostHunterAlphaAnimationNeoCosmos5761 && frostHunterSharedElementDragonSpectra8319.FrostHunterConstraintSetCloneMasterUltraRogue2633 == this.FrostHunterConstraintSetCloneMasterUltraRogue2633 && frostHunterSharedElementDragonSpectra8319.FrostHunterBundlePulseFusionHero2475 == this.FrostHunterBundlePulseFusionHero2475 && frostHunterSharedElementDragonSpectra8319.FrostHunterServiceEliteCelestialThunder1757 == this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterBundlePulseFusionHero2475, FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", v2 = " + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", v3 = " + this.FrostHunterBundlePulseFusionHero2475 + ", v4 = " + this.FrostHunterServiceEliteCelestialThunder1757;
    }
}
