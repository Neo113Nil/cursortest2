package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterInsetDrawableInfernoHyperOlympian4874 implements FrostHunterGyroscopeHyperionDragon5531, FrostHunterGeocoderHyperionTitan2118 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final long FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final long FrostHunterFlowMaxDragonHero5809;
    public final boolean FrostHunterFragmentBetaMegaVortex6025;
    public final int FrostHunterKeyframeGammaGamma1197;
    public final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public final long FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final long FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterInsetDrawableInfernoHyperOlympian4874(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j2;
        this.FrostHunterBundlePulseFusionHero2475 = i2 == -1 ? 1 : i2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z;
        this.FrostHunterCameraXPixelTurboCosmos9814 = z2;
        if (j == -1) {
            this.FrostHunterServiceEliteCelestialThunder1757 = -1L;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.FrostHunterServiceEliteCelestialThunder1757 = j3;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = (Math.max(0L, j3) * 8000000) / i;
        }
        this.FrostHunterFlowMaxDragonHero5809 = j2;
        this.FrostHunterAlertDialogAuroraDelta3200 = i;
        this.FrostHunterKeyframeGammaGamma1197 = i2;
        this.FrostHunterFragmentBetaMegaVortex6025 = z;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = j == -1 ? -1L : j;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterServiceEliteCelestialThunder1757 != -1 || this.FrostHunterRemoteConfigSpeedSpeed8566;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final FrostHunterInputMethodManagerTurboPrime9723 FrostHunterLifecycleBlazeGammaElite2889(long j) {
        long j2 = this.FrostHunterServiceEliteCelestialThunder1757;
        long j3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (j2 == -1 && !this.FrostHunterRemoteConfigSpeedSpeed8566) {
            FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora1705 = new FrostHunterDelayHyperAurora1705(0L, j3);
            return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora1705, frostHunterDelayHyperAurora1705);
        }
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        long j4 = this.FrostHunterBundlePulseFusionHero2475;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        FrostHunterDelayHyperAurora1705 frostHunterDelayHyperAurora17052 = new FrostHunterDelayHyperAurora1705(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.FrostHunterAlphaAnimationNeoCosmos5761) {
                return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora17052, new FrostHunterDelayHyperAurora1705((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new FrostHunterInputMethodManagerTurboPrime9723(frostHunterDelayHyperAurora17052, frostHunterDelayHyperAurora17052);
    }

    @Override // android.content.Context.FrostHunterGeocoderHyperionTitan2118
    public final long FrostHunterRemoteConfigSpeedSpeed8566() {
        return this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // android.content.Context.FrostHunterGyroscopeHyperionDragon5531
    public final long FrostHunterServiceEliteCelestialThunder1757(long j) {
        return (Math.max(0L, j - this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 8000000) / this.FrostHunterLifecycleBlazeGammaElite2889;
    }
}
