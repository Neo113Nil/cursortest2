package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPermissionInfoSpectraPulse9598 {
    public long FrostHunterAlphaAnimationNeoCosmos5761;
    public long FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterLevelListDrawableFusionDragonHero2232;
    public long FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean[] FrostHunterRemoteConfigSpeedSpeed8566 = new boolean[15];
    public long FrostHunterServiceEliteCelestialThunder1757;

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterServiceEliteCelestialThunder1757 > 15 && this.FrostHunterCameraXPixelTurboCosmos9814 == 0;
    }

    public final void FrostHunterBundlePulseFusionHero2475() {
        this.FrostHunterServiceEliteCelestialThunder1757 = 0L;
        this.FrostHunterLifecycleBlazeGammaElite2889 = 0L;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0L;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        Arrays.fill(this.FrostHunterRemoteConfigSpeedSpeed8566, false);
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(long j) {
        long j2 = this.FrostHunterServiceEliteCelestialThunder1757;
        if (j2 == 0) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        } else if (j2 == 1) {
            long j3 = j - this.FrostHunterAlphaAnimationNeoCosmos5761;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j3;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = j3;
            this.FrostHunterLifecycleBlazeGammaElite2889 = 1L;
        } else {
            long j4 = j - this.FrostHunterBundlePulseFusionHero2475;
            int i = (int) (j2 % 15);
            long abs = Math.abs(j4 - this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            boolean[] zArr = this.FrostHunterRemoteConfigSpeedSpeed8566;
            if (abs <= 1000000) {
                this.FrostHunterLifecycleBlazeGammaElite2889++;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.FrostHunterCameraXPixelTurboCosmos9814--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.FrostHunterCameraXPixelTurboCosmos9814++;
            }
        }
        this.FrostHunterServiceEliteCelestialThunder1757++;
        this.FrostHunterBundlePulseFusionHero2475 = j;
    }
}
