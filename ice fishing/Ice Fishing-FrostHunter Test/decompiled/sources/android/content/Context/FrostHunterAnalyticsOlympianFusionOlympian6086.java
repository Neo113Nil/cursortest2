package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnalyticsOlympianFusionOlympian6086 {
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public String FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterAnalyticsOlympianFusionOlympian6086(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = i3;
        this.FrostHunterServiceEliteCelestialThunder1757 = Integer.MIN_VALUE;
        this.FrostHunterLifecycleBlazeGammaElite2889 = "";
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        int i = this.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterServiceEliteCelestialThunder1757 = i == Integer.MIN_VALUE ? this.FrostHunterConstraintSetCloneMasterUltraRogue2633 : i + this.FrostHunterBundlePulseFusionHero2475;
        this.FrostHunterLifecycleBlazeGammaElite2889 = this.FrostHunterAlphaAnimationNeoCosmos5761 + this.FrostHunterServiceEliteCelestialThunder1757;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        if (this.FrostHunterServiceEliteCelestialThunder1757 != Integer.MIN_VALUE) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("generateNewId() must be called before retrieving ids.");
    }

    public FrostHunterAnalyticsOlympianFusionOlympian6086(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
