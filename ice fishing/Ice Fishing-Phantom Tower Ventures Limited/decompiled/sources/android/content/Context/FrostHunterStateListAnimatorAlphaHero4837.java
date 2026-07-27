package android.content.Context;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterStateListAnimatorAlphaHero4837 extends FrostHunterSurfaceViewShadowTurbo8060 {
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final long FrostHunterFlowMaxDragonHero5809;
    public boolean FrostHunterFragmentBetaMegaVortex6025;
    public long FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLightSensorForceFusion4241;
    public final /* synthetic */ FrostHunterAudioManagerNovaNovaXAurora2834 FrostHunterScaleAnimationStrikeSpark5059;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterStateListAnimatorAlphaHero4837(FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834, FrostHunterFontFamilySolarSpeedCelestial8941 frostHunterFontFamilySolarSpeedCelestial8941, long j, boolean z) {
        super(frostHunterFontFamilySolarSpeedCelestial8941);
        frostHunterFontFamilySolarSpeedCelestial8941.getClass();
        this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterAudioManagerNovaNovaXAurora2834;
        this.FrostHunterFlowMaxDragonHero5809 = j;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterFragmentBetaMegaVortex6025 = true;
        if (j == 0) {
            FrostHunterAlphaAnimationNeoCosmos5761(null);
        }
    }

    public final IOException FrostHunterAlphaAnimationNeoCosmos5761(IOException iOException) {
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            return iOException;
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
        if (iOException == null && this.FrostHunterFragmentBetaMegaVortex6025) {
            this.FrostHunterFragmentBetaMegaVortex6025 = false;
        }
        return FrostHunterAudioManagerNovaNovaXAurora2834.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterAlertDialogAuroraDelta3200, iOException, 8);
    }

    @Override // android.content.Context.FrostHunterSurfaceViewShadowTurbo8060, android.content.Context.FrostHunterFontFamilySolarSpeedCelestial8941
    public final long FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834 = this.FrostHunterScaleAnimationStrikeSpark5059;
        frostHunterMergeSpeedHyperionBlaze4246.getClass();
        if (this.FrostHunterLightSensorForceFusion4241) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("closed");
            return 0L;
        }
        try {
            long FrostHunterResourcesTitanHyperVision5823 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterResourcesTitanHyperVision5823(j, frostHunterMergeSpeedHyperionBlaze4246);
            if (this.FrostHunterFragmentBetaMegaVortex6025) {
                this.FrostHunterFragmentBetaMegaVortex6025 = false;
            }
            if (FrostHunterResourcesTitanHyperVision5823 == -1) {
                FrostHunterAlphaAnimationNeoCosmos5761(null);
                return -1L;
            }
            long j2 = this.FrostHunterKeyframeGammaGamma1197 + FrostHunterResourcesTitanHyperVision5823;
            long j3 = this.FrostHunterFlowMaxDragonHero5809;
            if (j3 == -1 || j2 <= j3) {
                this.FrostHunterKeyframeGammaGamma1197 = j2;
                if (((FrostHunterLayoutInflaterNovaXTitan5170) frostHunterAudioManagerNovaNovaXAurora2834.FrostHunterKeyframeGammaGamma1197).FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    FrostHunterAlphaAnimationNeoCosmos5761(null);
                }
                return FrostHunterResourcesTitanHyperVision5823;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(e);
            FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            throw FrostHunterAlphaAnimationNeoCosmos5761;
        }
    }

    @Override // android.content.Context.FrostHunterSurfaceViewShadowTurbo8060, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.FrostHunterLightSensorForceFusion4241) {
            return;
        }
        this.FrostHunterLightSensorForceFusion4241 = true;
        try {
            super.close();
            FrostHunterAlphaAnimationNeoCosmos5761(null);
        } catch (IOException e) {
            IOException FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(e);
            FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            throw FrostHunterAlphaAnimationNeoCosmos5761;
        }
    }
}
