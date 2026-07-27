package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutMasterSparkVortex8052 {
    public final float FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final float FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final FrostHunterLayerOmegaNeo1119 FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLayoutMasterSparkVortex8052(float f, float f2, int i, FrostHunterLayerOmegaNeo1119 frostHunterLayerOmegaNeo1119) {
        frostHunterLayerOmegaNeo1119.getClass();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = f;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterLayerOmegaNeo1119;
    }

    public static FrostHunterLayoutMasterSparkVortex8052 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLayoutMasterSparkVortex8052 frostHunterLayoutMasterSparkVortex8052, float f, float f2, int i, FrostHunterLayerOmegaNeo1119 frostHunterLayerOmegaNeo1119, int i2) {
        if ((i2 & 1) != 0) {
            f = frostHunterLayoutMasterSparkVortex8052.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        if ((i2 & 2) != 0) {
            f2 = frostHunterLayoutMasterSparkVortex8052.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        if ((i2 & 4) != 0) {
            i = frostHunterLayoutMasterSparkVortex8052.FrostHunterBundlePulseFusionHero2475;
        }
        if ((i2 & 8) != 0) {
            frostHunterLayerOmegaNeo1119 = frostHunterLayoutMasterSparkVortex8052.FrostHunterServiceEliteCelestialThunder1757;
        }
        frostHunterLayerOmegaNeo1119.getClass();
        return new FrostHunterLayoutMasterSparkVortex8052(f, f2, i, frostHunterLayerOmegaNeo1119);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterLayoutMasterSparkVortex8052)) {
            return false;
        }
        FrostHunterLayoutMasterSparkVortex8052 frostHunterLayoutMasterSparkVortex8052 = (FrostHunterLayoutMasterSparkVortex8052) obj;
        return Float.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLayoutMasterSparkVortex8052.FrostHunterAlphaAnimationNeoCosmos5761) == 0 && Float.compare(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterLayoutMasterSparkVortex8052.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 0 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterLayoutMasterSparkVortex8052.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterServiceEliteCelestialThunder1757 == frostHunterLayoutMasterSparkVortex8052.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final int hashCode() {
        return this.FrostHunterServiceEliteCelestialThunder1757.hashCode() + FrostHunterKeyEventNovaXAlpha1220.FrostHunterBundlePulseFusionHero2475(this.FrostHunterBundlePulseFusionHero2475, FrostHunterKeyEventNovaXAlpha1220.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, Float.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31, 31), 31);
    }

    public final String toString() {
        return "Helicopter(x=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", y=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", direction=" + this.FrostHunterBundlePulseFusionHero2475 + ", currentCargo=" + this.FrostHunterServiceEliteCelestialThunder1757 + ")";
    }
}
