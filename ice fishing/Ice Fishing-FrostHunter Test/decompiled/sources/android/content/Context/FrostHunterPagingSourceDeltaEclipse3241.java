package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPagingSourceDeltaEclipse3241 {
    public final byte[] FrostHunterAlphaAnimationNeoCosmos5761 = new byte[10];
    public int FrostHunterBundlePulseFusionHero2475;
    public boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public long FrostHunterServiceEliteCelestialThunder1757;

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterIntentServiceBetaPhoenixSolar4672 frostHunterIntentServiceBetaPhoenixSolar4672, FrostHunterMenuHyperShadowInferno4622 frostHunterMenuHyperShadowInferno4622) {
        if (this.FrostHunterBundlePulseFusionHero2475 > 0) {
            frostHunterIntentServiceBetaPhoenixSolar4672.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterMenuHyperShadowInferno4622);
            this.FrostHunterBundlePulseFusionHero2475 = 0;
        }
    }

    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393) {
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return;
        }
        byte[] bArr = this.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterPreviewNeoBeta3393.FrostHunterLintTitanVortexQuantum9911(bArr, 0, 10);
        frostHunterPreviewNeoBeta3393.FrostHunterFlowMaxDragonHero5809();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterIntentServiceBetaPhoenixSolar4672 frostHunterIntentServiceBetaPhoenixSolar4672, long j, int i, int i2, int i3, FrostHunterMenuHyperShadowInferno4622 frostHunterMenuHyperShadowInferno4622) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("TrueHD chunk samples must be contiguous in the sample queue.", this.FrostHunterRemoteConfigSpeedSpeed8566 <= i2 + i3);
        if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            int i4 = this.FrostHunterBundlePulseFusionHero2475;
            int i5 = i4 + 1;
            this.FrostHunterBundlePulseFusionHero2475 = i5;
            if (i4 == 0) {
                this.FrostHunterServiceEliteCelestialThunder1757 = j;
                this.FrostHunterLifecycleBlazeGammaElite2889 = i;
                this.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
            }
            this.FrostHunterLevelListDrawableFusionDragonHero2232 += i2;
            this.FrostHunterRemoteConfigSpeedSpeed8566 = i3;
            if (i5 >= 16) {
                FrostHunterAlphaAnimationNeoCosmos5761(frostHunterIntentServiceBetaPhoenixSolar4672, frostHunterMenuHyperShadowInferno4622);
            }
        }
    }
}
