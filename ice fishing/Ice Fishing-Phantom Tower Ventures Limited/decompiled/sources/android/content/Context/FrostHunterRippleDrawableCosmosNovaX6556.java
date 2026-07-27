package android.content.Context;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRippleDrawableCosmosNovaX6556 implements FrostHunterDigitalInkRecognitionForceHyper4284 {
    public final FrostHunterStorageRogueRogue1303 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterDigitalInkRecognitionForceHyper4284 FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public final byte[] FrostHunterKeyframeGammaGamma1197;

    public FrostHunterRippleDrawableCosmosNovaX6556(FrostHunterDigitalInkRecognitionForceHyper4284 frostHunterDigitalInkRecognitionForceHyper4284, int i, FrostHunterStorageRogueRogue1303 frostHunterStorageRogueRogue1303) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i > 0);
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterDigitalInkRecognitionForceHyper4284;
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterStorageRogueRogue1303;
        this.FrostHunterKeyframeGammaGamma1197 = new byte[1];
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterDisplayMetricsSpeedOmegaHyperion6555 frostHunterDisplayMetricsSpeedOmegaHyperion6555) {
        frostHunterDisplayMetricsSpeedOmegaHyperion6555.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDisplayMetricsSpeedOmegaHyperion6555);
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Map FrostHunterLevelListDrawableFusionDragonHero2232() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLightSensorForceFusion4241();
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterDigitalInkRecognitionForceHyper4284 frostHunterDigitalInkRecognitionForceHyper4284 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i3 == 0) {
            byte[] bArr2 = this.FrostHunterKeyframeGammaGamma1197;
            int i4 = 0;
            if (frostHunterDigitalInkRecognitionForceHyper4284.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = frostHunterDigitalInkRecognitionForceHyper4284.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868(bArr3, i5);
                        FrostHunterStorageRogueRogue1303 frostHunterStorageRogueRogue1303 = this.FrostHunterAlertDialogAuroraDelta3200;
                        long max = !frostHunterStorageRogueRogue1303.FrostHunterFragmentBetaMegaVortex6025 ? frostHunterStorageRogueRogue1303.FrostHunterFlowMaxDragonHero5809 : Math.max(frostHunterStorageRogueRogue1303.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterResourcesTitanHyperVision5823(true), frostHunterStorageRogueRogue1303.FrostHunterFlowMaxDragonHero5809);
                        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterIntentServiceBetaPhoenixSolar4672 frostHunterIntentServiceBetaPhoenixSolar4672 = frostHunterStorageRogueRogue1303.FrostHunterKeyframeGammaGamma1197;
                        frostHunterIntentServiceBetaPhoenixSolar4672.getClass();
                        frostHunterIntentServiceBetaPhoenixSolar4672.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868);
                        frostHunterIntentServiceBetaPhoenixSolar4672.FrostHunterAlphaAnimationNeoCosmos5761(max, 1, FrostHunterAlphaAnimationNeoCosmos5761, 0, null);
                        frostHunterStorageRogueRogue1303.FrostHunterFragmentBetaMegaVortex6025 = true;
                    }
                }
                this.FrostHunterFragmentBetaMegaVortex6025 = this.FrostHunterFlowMaxDragonHero5809;
            }
            return -1;
        }
        int read2 = frostHunterDigitalInkRecognitionForceHyper4284.read(bArr, i, Math.min(this.FrostHunterFragmentBetaMegaVortex6025, i2));
        if (read2 != -1) {
            this.FrostHunterFragmentBetaMegaVortex6025 -= read2;
        }
        return read2;
    }
}
