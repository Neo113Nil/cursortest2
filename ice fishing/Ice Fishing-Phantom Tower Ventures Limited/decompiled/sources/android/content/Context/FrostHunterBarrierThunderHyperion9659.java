package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBarrierThunderHyperion9659 {
    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterBarrierThunderHyperion9659(0.0f, 0.0f, 0.0f, 0.0f);
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final float FrostHunterBundlePulseFusionHero2475;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final float FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterBarrierThunderHyperion9659(float f, float f2, float f3, float f4) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
        this.FrostHunterBundlePulseFusionHero2475 = f3;
        this.FrostHunterServiceEliteCelestialThunder1757 = f4;
    }

    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        float f = this.FrostHunterBundlePulseFusionHero2475;
        float f2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.FrostHunterServiceEliteCelestialThunder1757;
        float f5 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final FrostHunterBarrierThunderHyperion9659 FrostHunterBundlePulseFusionHero2475(FrostHunterBarrierThunderHyperion9659 frostHunterBarrierThunderHyperion9659) {
        return new FrostHunterBarrierThunderHyperion9659(Math.max(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterBarrierThunderHyperion9659.FrostHunterAlphaAnimationNeoCosmos5761), Math.max(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterBarrierThunderHyperion9659.FrostHunterConstraintSetCloneMasterUltraRogue2633), Math.min(this.FrostHunterBundlePulseFusionHero2475, frostHunterBarrierThunderHyperion9659.FrostHunterBundlePulseFusionHero2475), Math.min(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterBarrierThunderHyperion9659.FrostHunterServiceEliteCelestialThunder1757));
    }

    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        float f = this.FrostHunterBundlePulseFusionHero2475 - this.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = this.FrostHunterServiceEliteCelestialThunder1757 - this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final FrostHunterBarrierThunderHyperion9659 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new FrostHunterBarrierThunderHyperion9659(Float.intBitsToFloat(i) + this.FrostHunterAlphaAnimationNeoCosmos5761, Float.intBitsToFloat(i2) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Float.intBitsToFloat(i) + this.FrostHunterBundlePulseFusionHero2475, Float.intBitsToFloat(i2) + this.FrostHunterServiceEliteCelestialThunder1757);
    }

    public final FrostHunterBarrierThunderHyperion9659 FrostHunterServiceEliteCelestialThunder1757(float f, float f2) {
        return new FrostHunterBarrierThunderHyperion9659(this.FrostHunterAlphaAnimationNeoCosmos5761 + f, this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + f2, this.FrostHunterBundlePulseFusionHero2475 + f, this.FrostHunterServiceEliteCelestialThunder1757 + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterBarrierThunderHyperion9659)) {
            return false;
        }
        FrostHunterBarrierThunderHyperion9659 frostHunterBarrierThunderHyperion9659 = (FrostHunterBarrierThunderHyperion9659) obj;
        return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterBarrierThunderHyperion9659.FrostHunterAlphaAnimationNeoCosmos5761) == 0 && Float.compare(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterBarrierThunderHyperion9659.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 0 && Float.compare(this.FrostHunterBundlePulseFusionHero2475, frostHunterBarrierThunderHyperion9659.FrostHunterBundlePulseFusionHero2475) == 0 && Float.compare(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterBarrierThunderHyperion9659.FrostHunterServiceEliteCelestialThunder1757) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterBundlePulseFusionHero2475, FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(this.FrostHunterAlphaAnimationNeoCosmos5761) + ", " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + ", " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(this.FrostHunterBundlePulseFusionHero2475) + ", " + FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPushNotificationStormTitanGamma8999(this.FrostHunterServiceEliteCelestialThunder1757) + ')';
    }
}
