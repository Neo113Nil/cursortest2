package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterContentResolverCosmosTurbo7899 {
    public final double FrostHunterAlphaAnimationNeoCosmos5761;
    public final double FrostHunterBundlePulseFusionHero2475;
    public final double FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final double FrostHunterLevelListDrawableFusionDragonHero2232;
    public final double FrostHunterLifecycleBlazeGammaElite2889;
    public final double FrostHunterRemoteConfigSpeedSpeed8566;
    public final double FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterContentResolverCosmosTurbo7899(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = d;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = d2;
        this.FrostHunterBundlePulseFusionHero2475 = d3;
        this.FrostHunterServiceEliteCelestialThunder1757 = d4;
        this.FrostHunterLifecycleBlazeGammaElite2889 = d5;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = d6;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterContentResolverCosmosTurbo7899)) {
            return false;
        }
        FrostHunterContentResolverCosmosTurbo7899 frostHunterContentResolverCosmosTurbo7899 = (FrostHunterContentResolverCosmosTurbo7899) obj;
        return Double.compare(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterContentResolverCosmosTurbo7899.FrostHunterAlphaAnimationNeoCosmos5761) == 0 && Double.compare(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterContentResolverCosmosTurbo7899.FrostHunterConstraintSetCloneMasterUltraRogue2633) == 0 && Double.compare(this.FrostHunterBundlePulseFusionHero2475, frostHunterContentResolverCosmosTurbo7899.FrostHunterBundlePulseFusionHero2475) == 0 && Double.compare(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterContentResolverCosmosTurbo7899.FrostHunterServiceEliteCelestialThunder1757) == 0 && Double.compare(this.FrostHunterLifecycleBlazeGammaElite2889, frostHunterContentResolverCosmosTurbo7899.FrostHunterLifecycleBlazeGammaElite2889) == 0 && Double.compare(this.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterContentResolverCosmosTurbo7899.FrostHunterLevelListDrawableFusionDragonHero2232) == 0 && Double.compare(this.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterContentResolverCosmosTurbo7899.FrostHunterRemoteConfigSpeedSpeed8566) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.FrostHunterRemoteConfigSpeedSpeed8566) + ((Double.hashCode(this.FrostHunterLevelListDrawableFusionDragonHero2232) + ((Double.hashCode(this.FrostHunterLifecycleBlazeGammaElite2889) + ((Double.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + ((Double.hashCode(this.FrostHunterBundlePulseFusionHero2475) + ((Double.hashCode(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) + (Double.hashCode(this.FrostHunterAlphaAnimationNeoCosmos5761) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", a=" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ", b=" + this.FrostHunterBundlePulseFusionHero2475 + ", c=" + this.FrostHunterServiceEliteCelestialThunder1757 + ", d=" + this.FrostHunterLifecycleBlazeGammaElite2889 + ", e=" + this.FrostHunterLevelListDrawableFusionDragonHero2232 + ", f=" + this.FrostHunterRemoteConfigSpeedSpeed8566 + ')';
    }

    public /* synthetic */ FrostHunterContentResolverCosmosTurbo7899(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
