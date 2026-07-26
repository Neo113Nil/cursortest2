package android.content.Context;

import android.media.AudioTrack;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionPhantomBeta6269 {
    public final FrostHunterLocationManagerTitaniumNovaXNova1391 FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterLevelListDrawableFusionDragonHero2232;
    public long FrostHunterLifecycleBlazeGammaElite2889;
    public long FrostHunterRemoteConfigSpeedSpeed8566;
    public int FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterTransitionPhantomBeta6269(AudioTrack audioTrack, FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterLocationManagerTitaniumNovaXNova1391(audioTrack);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = audioTrack.getSampleRate();
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterLayoutInflaterTurboHyperion3832;
        FrostHunterAlphaAnimationNeoCosmos5761(0);
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        this.FrostHunterServiceEliteCelestialThunder1757 = i;
        if (i == 0) {
            this.FrostHunterRemoteConfigSpeedSpeed8566 = 0L;
            this.FrostHunterCameraXPixelTurboCosmos9814 = -1L;
            this.FrostHunterFlowMaxDragonHero5809 = -9223372036854775807L;
            this.FrostHunterLifecycleBlazeGammaElite2889 = System.nanoTime() / 1000;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 10000L;
            return;
        }
        if (i == 1) {
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 10000000L;
        } else if (i == 4) {
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = 500000L;
        } else {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
        }
    }
}
