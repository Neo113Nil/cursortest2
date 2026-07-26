package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterJavaPhoenixNebula9385 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterJavaPhoenixNebula9385(int i, long j, String str) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
        this.FrostHunterBundlePulseFusionHero2475 = i;
        if (str.length() == 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float FrostHunterAlphaAnimationNeoCosmos5761(int i);

    public boolean FrostHunterBundlePulseFusionHero2475() {
        return false;
    }

    public abstract float FrostHunterConstraintSetCloneMasterUltraRogue2633(int i);

    public abstract long FrostHunterLevelListDrawableFusionDragonHero2232(float f, float f2, float f3, float f4, FrostHunterJavaPhoenixNebula9385 frostHunterJavaPhoenixNebula9385);

    public abstract float FrostHunterLifecycleBlazeGammaElite2889(float f, float f2, float f3);

    public abstract long FrostHunterServiceEliteCelestialThunder1757(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrostHunterJavaPhoenixNebula9385 frostHunterJavaPhoenixNebula9385 = (FrostHunterJavaPhoenixNebula9385) obj;
        if (this.FrostHunterBundlePulseFusionHero2475 == frostHunterJavaPhoenixNebula9385.FrostHunterBundlePulseFusionHero2475 && this.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterJavaPhoenixNebula9385.FrostHunterAlphaAnimationNeoCosmos5761)) {
            return FrostHunterExecutorSolarPhoenix3849.FrostHunterMeteringPointBetaCyber9571(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterJavaPhoenixNebula9385.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        return false;
    }

    public int hashCode() {
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceEliteCelestialThunder1757(this.FrostHunterAlphaAnimationNeoCosmos5761.hashCode() * 31, 31, this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + this.FrostHunterBundlePulseFusionHero2475;
    }

    public final String toString() {
        return this.FrostHunterAlphaAnimationNeoCosmos5761 + " (id=" + this.FrostHunterBundlePulseFusionHero2475 + ", model=" + ((Object) FrostHunterExecutorSolarPhoenix3849.FrostHunterRewardedAdSpectraElite8288(this.FrostHunterConstraintSetCloneMasterUltraRogue2633)) + ')';
    }
}
