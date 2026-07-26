package android.content.Context;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAssetManagerCelestialShadowInferno9902 extends MediaCodec.Callback {
    public MediaCodec.CodecException FrostHunterAlertDialogAuroraDelta3200;
    public Handler FrostHunterBundlePulseFusionHero2475;
    public MediaFormat FrostHunterCameraXPixelTurboCosmos9814;
    public final HandlerThread FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public MediaFormat FrostHunterFlowMaxDragonHero5809;
    public long FrostHunterFragmentBetaMegaVortex6025;
    public MediaCodec.CryptoException FrostHunterKeyframeGammaGamma1197;
    public IllegalStateException FrostHunterLightSensorForceFusion4241;
    public FrostHunterSQLiteMasterUltra9956 FrostHunterScaleAnimationStrikeSpark5059;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final Object FrostHunterAlphaAnimationNeoCosmos5761 = new Object();
    public final FrostHunterChipPixelTurboBeta1817 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterChipPixelTurboBeta1817();
    public final FrostHunterChipPixelTurboBeta1817 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterChipPixelTurboBeta1817();
    public final ArrayDeque FrostHunterLevelListDrawableFusionDragonHero2232 = new ArrayDeque();
    public final ArrayDeque FrostHunterRemoteConfigSpeedSpeed8566 = new ArrayDeque();

    public FrostHunterAssetManagerCelestialShadowInferno9902(HandlerThread handlerThread) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = handlerThread;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761() {
        ArrayDeque arrayDeque = this.FrostHunterRemoteConfigSpeedSpeed8566;
        if (!arrayDeque.isEmpty()) {
            this.FrostHunterFlowMaxDragonHero5809 = (MediaFormat) arrayDeque.getLast();
        }
        FrostHunterChipPixelTurboBeta1817 frostHunterChipPixelTurboBeta1817 = this.FrostHunterServiceEliteCelestialThunder1757;
        frostHunterChipPixelTurboBeta1817.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterChipPixelTurboBeta1817.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterChipPixelTurboBeta1817 frostHunterChipPixelTurboBeta18172 = this.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterChipPixelTurboBeta18172.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterChipPixelTurboBeta18172.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterLevelListDrawableFusionDragonHero2232.clear();
        arrayDeque.clear();
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        IllegalStateException illegalStateException = this.FrostHunterLightSensorForceFusion4241;
        if (illegalStateException != null) {
            this.FrostHunterLightSensorForceFusion4241 = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.FrostHunterAlertDialogAuroraDelta3200;
        if (codecException != null) {
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.FrostHunterKeyframeGammaGamma1197;
        if (cryptoException == null) {
            return;
        }
        this.FrostHunterKeyframeGammaGamma1197 = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterKeyframeGammaGamma1197 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterAlertDialogAuroraDelta3200 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        FrostHunterAnimatorSetEclipseHeroHyperion7191 frostHunterAnimatorSetEclipseHeroHyperion7191;
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761(i);
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterSQLiteMasterUltra9956 != null && (frostHunterAnimatorSetEclipseHeroHyperion7191 = ((FrostHunterVibratorBetaMax2177) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809).FrostHunterPermissionInfoAlphaDelta6279) != null) {
                frostHunterAnimatorSetEclipseHeroHyperion7191.FrostHunterAlphaAnimationNeoCosmos5761();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        FrostHunterAnimatorSetEclipseHeroHyperion7191 frostHunterAnimatorSetEclipseHeroHyperion7191;
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            try {
                MediaFormat mediaFormat = this.FrostHunterFlowMaxDragonHero5809;
                if (mediaFormat != null) {
                    this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761(-2);
                    this.FrostHunterRemoteConfigSpeedSpeed8566.add(mediaFormat);
                    this.FrostHunterFlowMaxDragonHero5809 = null;
                }
                this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761(i);
                this.FrostHunterLevelListDrawableFusionDragonHero2232.add(bufferInfo);
                FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = this.FrostHunterScaleAnimationStrikeSpark5059;
                if (frostHunterSQLiteMasterUltra9956 != null && (frostHunterAnimatorSetEclipseHeroHyperion7191 = ((FrostHunterVibratorBetaMax2177) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809).FrostHunterPermissionInfoAlphaDelta6279) != null) {
                    frostHunterAnimatorSetEclipseHeroHyperion7191.FrostHunterAlphaAnimationNeoCosmos5761();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            this.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761(-2);
            this.FrostHunterRemoteConfigSpeedSpeed8566.add(mediaFormat);
            this.FrostHunterFlowMaxDragonHero5809 = null;
        }
    }
}
