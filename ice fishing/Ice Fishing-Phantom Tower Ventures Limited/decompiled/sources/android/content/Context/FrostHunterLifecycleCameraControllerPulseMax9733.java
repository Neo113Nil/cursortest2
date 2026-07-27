package android.content.Context;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLifecycleCameraControllerPulseMax9733 implements FrostHunterProfilerPhantomLegendPhoenix6109 {
    public final boolean FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterCameraXPixelTurboCosmos9814;
    public final long FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterFragmentBetaMegaVortex6025;
    public boolean FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterLightSensorForceFusion4241;
    public final /* synthetic */ FrostHunterAudioManagerNovaNovaXAurora2834 FrostHunterScaleAnimationStrikeSpark5059;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterLifecycleCameraControllerPulseMax9733(FrostHunterAudioManagerNovaNovaXAurora2834 frostHunterAudioManagerNovaNovaXAurora2834, FrostHunterProfilerPhantomLegendPhoenix6109 frostHunterProfilerPhantomLegendPhoenix6109, long j, boolean z) {
        frostHunterProfilerPhantomLegendPhoenix6109.getClass();
        this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterAudioManagerNovaNovaXAurora2834;
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterProfilerPhantomLegendPhoenix6109;
        this.FrostHunterFlowMaxDragonHero5809 = j;
        this.FrostHunterAlertDialogAuroraDelta3200 = z;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = z;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final FrostHunterAdMobBlazeEclipseGamma6684 FrostHunterBundlePulseFusionHero2475() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475();
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232() {
        this.FrostHunterCameraXPixelTurboCosmos9814.flush();
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109
    public final void FrostHunterServiceConnectionTurboPhoenixOmega6719(long j, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246) {
        if (this.FrostHunterLightSensorForceFusion4241) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("closed");
            return;
        }
        long j2 = this.FrostHunterFlowMaxDragonHero5809;
        if (j2 != -1 && this.FrostHunterFragmentBetaMegaVortex6025 + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.FrostHunterFragmentBetaMegaVortex6025 + j));
        }
        try {
            if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceConnectionTurboPhoenixOmega6719(j, frostHunterMergeSpeedHyperionBlaze4246);
            this.FrostHunterFragmentBetaMegaVortex6025 += j;
        } catch (IOException e) {
            IOException FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(e);
            FrostHunterServiceEliteCelestialThunder1757.getClass();
            throw FrostHunterServiceEliteCelestialThunder1757;
        }
    }

    public final IOException FrostHunterServiceEliteCelestialThunder1757(IOException iOException) {
        if (this.FrostHunterKeyframeGammaGamma1197) {
            return iOException;
        }
        this.FrostHunterKeyframeGammaGamma1197 = true;
        return FrostHunterAudioManagerNovaNovaXAurora2834.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterAlertDialogAuroraDelta3200, iOException, 4);
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.FrostHunterLightSensorForceFusion4241) {
            return;
        }
        this.FrostHunterLightSensorForceFusion4241 = true;
        long j = this.FrostHunterFlowMaxDragonHero5809;
        if (j != -1 && this.FrostHunterFragmentBetaMegaVortex6025 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterServiceEliteCelestialThunder1757(null);
        } catch (IOException e) {
            IOException FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(e);
            FrostHunterServiceEliteCelestialThunder1757.getClass();
            throw FrostHunterServiceEliteCelestialThunder1757;
        }
    }

    @Override // android.content.Context.FrostHunterProfilerPhantomLegendPhoenix6109, java.io.Flushable
    public final void flush() {
        try {
            FrostHunterLevelListDrawableFusionDragonHero2232();
        } catch (IOException e) {
            IOException FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceEliteCelestialThunder1757(e);
            FrostHunterServiceEliteCelestialThunder1757.getClass();
            throw FrostHunterServiceEliteCelestialThunder1757;
        }
    }

    public final String toString() {
        return FrostHunterLifecycleCameraControllerPulseMax9733.class.getSimpleName() + '(' + this.FrostHunterCameraXPixelTurboCosmos9814 + ')';
    }
}
