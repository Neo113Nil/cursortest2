package android.content.Context;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAlphaAnimationSolarHyperionCyber6976 extends FrostHunterViewModelPulseAlpha1331 {
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public boolean FrostHunterKeyframeGammaGamma1197;
    public int FrostHunterLightSensorForceFusion4241;
    public long FrostHunterScaleAnimationStrikeSpark5059;
    public byte[] FrostHunterServiceConnectionTurboPhoenixOmega6719;

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterAlertDialogAuroraDelta3200() {
        if (this.FrostHunterKeyframeGammaGamma1197) {
            this.FrostHunterKeyframeGammaGamma1197 = false;
            int i = this.FrostHunterAlertDialogAuroraDelta3200;
            int i2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new byte[i * i2];
            this.FrostHunterFragmentBetaMegaVortex6025 = this.FrostHunterFlowMaxDragonHero5809 * i2;
        }
        this.FrostHunterLightSensorForceFusion4241 = 0;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331, android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final ByteBuffer FrostHunterBundlePulseFusionHero2475() {
        int i;
        if (super.FrostHunterConstraintSetCloneMasterUltraRogue2633() && (i = this.FrostHunterLightSensorForceFusion4241) > 0) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(i).put(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, 0, this.FrostHunterLightSensorForceFusion4241).flip();
            this.FrostHunterLightSensorForceFusion4241 = 0;
        }
        return super.FrostHunterBundlePulseFusionHero2475();
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331, android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final boolean FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        return super.FrostHunterConstraintSetCloneMasterUltraRogue2633() && this.FrostHunterLightSensorForceFusion4241 == 0;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final FrostHunterConstraintSetHeroOlympian6218 FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetHeroOlympian6218 frostHunterConstraintSetHeroOlympian6218) {
        if (!FrostHunterGyroscopeHeroAlpha1995.FrostHunterLooperHyperionForce4133(frostHunterConstraintSetHeroOlympian6218.FrostHunterBundlePulseFusionHero2475)) {
            throw new FrostHunterVideoCaptureEclipseMasterBlaze3228(frostHunterConstraintSetHeroOlympian6218);
        }
        this.FrostHunterKeyframeGammaGamma1197 = true;
        return (this.FrostHunterFlowMaxDragonHero5809 == 0 && this.FrostHunterAlertDialogAuroraDelta3200 == 0) ? FrostHunterConstraintSetHeroOlympian6218.FrostHunterLifecycleBlazeGammaElite2889 : frostHunterConstraintSetHeroOlympian6218;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterFragmentBetaMegaVortex6025() {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    @Override // android.content.Context.FrostHunterViewModelPulseAlpha1331
    public final void FrostHunterKeyframeGammaGamma1197() {
        if (this.FrostHunterKeyframeGammaGamma1197) {
            if (this.FrostHunterLightSensorForceFusion4241 > 0) {
                this.FrostHunterScaleAnimationStrikeSpark5059 += r0 / this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
            }
            this.FrostHunterLightSensorForceFusion4241 = 0;
        }
    }

    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final long FrostHunterLevelListDrawableFusionDragonHero2232(long j) {
        return Math.max(0L, j - FrostHunterGyroscopeHeroAlpha1995.FrostHunterBillingClientFusionVortex9008(this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterFlowMaxDragonHero5809));
    }

    @Override // android.content.Context.FrostHunterPaintFlagsDrawFilterSparkSpectraMega2336
    public final void FrostHunterLifecycleBlazeGammaElite2889(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.FrostHunterFragmentBetaMegaVortex6025);
        this.FrostHunterScaleAnimationStrikeSpark5059 += min / this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
        this.FrostHunterFragmentBetaMegaVortex6025 -= min;
        byteBuffer.position(position + min);
        if (this.FrostHunterFragmentBetaMegaVortex6025 > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.FrostHunterLightSensorForceFusion4241 + i2) - this.FrostHunterServiceConnectionTurboPhoenixOmega6719.length;
        ByteBuffer FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(length);
        int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566(length, 0, this.FrostHunterLightSensorForceFusion4241);
        FrostHunterServiceConnectionTurboPhoenixOmega6719.put(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, 0, FrostHunterRemoteConfigSpeedSpeed8566);
        int FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566(length - FrostHunterRemoteConfigSpeedSpeed8566, 0, i2);
        byteBuffer.limit(byteBuffer.position() + FrostHunterRemoteConfigSpeedSpeed85662);
        FrostHunterServiceConnectionTurboPhoenixOmega6719.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - FrostHunterRemoteConfigSpeedSpeed85662;
        int i4 = this.FrostHunterLightSensorForceFusion4241 - FrostHunterRemoteConfigSpeedSpeed8566;
        this.FrostHunterLightSensorForceFusion4241 = i4;
        byte[] bArr = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        System.arraycopy(bArr, FrostHunterRemoteConfigSpeedSpeed8566, bArr, 0, i4);
        byteBuffer.get(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, i3);
        this.FrostHunterLightSensorForceFusion4241 += i3;
        FrostHunterServiceConnectionTurboPhoenixOmega6719.flip();
    }
}
