package android.content.Context;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionRogueDelta1533 implements FrostHunterMotionLayoutTransitionEliteSolarMax1226 {
    public static final ArrayDeque FrostHunterLightSensorForceFusion4241 = new ArrayDeque();
    public static final Object FrostHunterScaleAnimationStrikeSpark5059 = new Object();
    public FrostHunterBottomSheetBlazeMaster8362 FrostHunterAlertDialogAuroraDelta3200;
    public final MediaCodec FrostHunterCameraXPixelTurboCosmos9814;
    public final HandlerThread FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterSensorManagerMegaEclipse5665 FrostHunterFragmentBetaMegaVortex6025;
    public final AtomicReference FrostHunterKeyframeGammaGamma1197;
    public boolean FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterTransitionRogueDelta1533(MediaCodec mediaCodec, HandlerThread handlerThread) {
        FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665 = new FrostHunterSensorManagerMegaEclipse5665();
        this.FrostHunterCameraXPixelTurboCosmos9814 = mediaCodec;
        this.FrostHunterFlowMaxDragonHero5809 = handlerThread;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterSensorManagerMegaEclipse5665;
        this.FrostHunterKeyframeGammaGamma1197 = new AtomicReference();
    }

    public static FrostHunterLooperSolarDragon9122 FrostHunterAlphaAnimationNeoCosmos5761() {
        ArrayDeque arrayDeque = FrostHunterLightSensorForceFusion4241;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new FrostHunterLooperSolarDragon9122();
                }
                return (FrostHunterLooperSolarDragon9122) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void FrostHunterFragmentBetaMegaVortex6025() {
        RuntimeException runtimeException = (RuntimeException) this.FrostHunterKeyframeGammaGamma1197.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2, long j, int i3) {
        FrostHunterFragmentBetaMegaVortex6025();
        FrostHunterLooperSolarDragon9122 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757 = j;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889 = i3;
        FrostHunterBottomSheetBlazeMaster8362 frostHunterBottomSheetBlazeMaster8362 = this.FrostHunterAlertDialogAuroraDelta3200;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterBottomSheetBlazeMaster8362.obtainMessage(1, FrostHunterAlphaAnimationNeoCosmos5761).sendToTarget();
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void FrostHunterLifecycleBlazeGammaElite2889(int i, FrostHunterObjectDetectionDeltaQuantumHyperion3304 frostHunterObjectDetectionDeltaQuantumHyperion3304, long j, int i2) {
        FrostHunterFragmentBetaMegaVortex6025();
        FrostHunterLooperSolarDragon9122 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 0;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757 = j;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889 = i2;
        MediaCodec.CryptoInfo cryptoInfo = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475;
        cryptoInfo.numSubSamples = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterLevelListDrawableFusionDragonHero2232;
        int[] iArr = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterServiceEliteCelestialThunder1757;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterLifecycleBlazeGammaElite2889;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterAlphaAnimationNeoCosmos5761;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterBundlePulseFusionHero2475;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterCameraXPixelTurboCosmos9814));
        FrostHunterBottomSheetBlazeMaster8362 frostHunterBottomSheetBlazeMaster8362 = this.FrostHunterAlertDialogAuroraDelta3200;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterBottomSheetBlazeMaster8362.obtainMessage(2, FrostHunterAlphaAnimationNeoCosmos5761).sendToTarget();
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void FrostHunterServiceEliteCelestialThunder1757(Bundle bundle) {
        FrostHunterFragmentBetaMegaVortex6025();
        FrostHunterBottomSheetBlazeMaster8362 frostHunterBottomSheetBlazeMaster8362 = this.FrostHunterAlertDialogAuroraDelta3200;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterBottomSheetBlazeMaster8362.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void flush() {
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            try {
                FrostHunterBottomSheetBlazeMaster8362 frostHunterBottomSheetBlazeMaster8362 = this.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterBottomSheetBlazeMaster8362.getClass();
                frostHunterBottomSheetBlazeMaster8362.removeCallbacksAndMessages(null);
                FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665 = this.FrostHunterFragmentBetaMegaVortex6025;
                synchronized (frostHunterSensorManagerMegaEclipse5665) {
                    frostHunterSensorManagerMegaEclipse5665.FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
                }
                FrostHunterBottomSheetBlazeMaster8362 frostHunterBottomSheetBlazeMaster83622 = this.FrostHunterAlertDialogAuroraDelta3200;
                frostHunterBottomSheetBlazeMaster83622.getClass();
                frostHunterBottomSheetBlazeMaster83622.obtainMessage(3).sendToTarget();
                synchronized (frostHunterSensorManagerMegaEclipse5665) {
                    while (!frostHunterSensorManagerMegaEclipse5665.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        frostHunterSensorManagerMegaEclipse5665.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                        frostHunterSensorManagerMegaEclipse5665.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void shutdown() {
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            flush();
            this.FrostHunterFlowMaxDragonHero5809.quit();
        }
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
    }

    @Override // android.content.Context.FrostHunterMotionLayoutTransitionEliteSolarMax1226
    public final void start() {
        if (this.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            return;
        }
        HandlerThread handlerThread = this.FrostHunterFlowMaxDragonHero5809;
        handlerThread.start();
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterBottomSheetBlazeMaster8362(this, handlerThread.getLooper());
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
    }
}
