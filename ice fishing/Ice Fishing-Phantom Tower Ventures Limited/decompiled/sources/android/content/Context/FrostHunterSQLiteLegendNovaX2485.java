package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterSQLiteLegendNovaX2485 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterLevelListDrawableFusionDragonHero2232;
    public long FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterRemoteConfigSpeedSpeed8566;
    public long FrostHunterServiceEliteCelestialThunder1757 = 0;

    public FrostHunterSQLiteLegendNovaX2485(long j, long j2, long j3, long j4, long j5, long j6) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = j3;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = j4;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = j5;
        this.FrostHunterBundlePulseFusionHero2475 = j6;
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterAlphaAnimationNeoCosmos5761(j2, 0L, j3, j4, j5, j6);
    }

    public static long FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }
}
