package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPushNotificationCelestialPulse9607 {
    public String FrostHunterAlphaAnimationNeoCosmos5761;
    public String FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public Long FrostHunterLevelListDrawableFusionDragonHero2232;
    public Long FrostHunterLifecycleBlazeGammaElite2889;
    public String FrostHunterRemoteConfigSpeedSpeed8566;
    public String FrostHunterServiceEliteCelestialThunder1757;

    public final FrostHunterCanvasOmegaSolarNebula2242 FrostHunterAlphaAnimationNeoCosmos5761() {
        String str = this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0 ? " registrationStatus" : "";
        if (this.FrostHunterLifecycleBlazeGammaElite2889 == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
            str = str.concat(" tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new FrostHunterCanvasOmegaSolarNebula2242(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterBundlePulseFusionHero2475, this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889.longValue(), this.FrostHunterLevelListDrawableFusionDragonHero2232.longValue(), this.FrostHunterRemoteConfigSpeedSpeed8566);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Missing required properties:".concat(str));
        return null;
    }
}
