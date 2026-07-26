package com.adjust.sdk;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPropertyValuesHolderPulseQuantum8856 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final String FrostHunterLevelListDrawableFusionDragonHero2232;
    public final long FrostHunterLifecycleBlazeGammaElite2889;
    public final String FrostHunterRemoteConfigSpeedSpeed8566;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPropertyValuesHolderPulseQuantum8856(ActivityState activityState) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = -1;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = -1;
        this.FrostHunterBundlePulseFusionHero2475 = -1;
        this.FrostHunterServiceEliteCelestialThunder1757 = -1L;
        this.FrostHunterLifecycleBlazeGammaElite2889 = -1L;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = null;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = null;
        if (activityState == null) {
            return;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = activityState.eventCount;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = activityState.sessionCount;
        this.FrostHunterBundlePulseFusionHero2475 = activityState.subsessionCount;
        this.FrostHunterServiceEliteCelestialThunder1757 = activityState.timeSpent;
        this.FrostHunterLifecycleBlazeGammaElite2889 = activityState.sessionLength;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = activityState.uuid;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = activityState.pushToken;
    }
}
