package android.content.Context;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterValueAnimatorShadowInferno2629 implements Closeable {
    public FrostHunterMaterialCardViewTitanMax3245 FrostHunterAlertDialogAuroraDelta3200;
    public FrostHunterMergeSpeedHyperionBlaze4246 FrostHunterCameraXPixelTurboCosmos9814;
    public boolean FrostHunterFlowMaxDragonHero5809;
    public byte[] FrostHunterFragmentBetaMegaVortex6025;
    public long FrostHunterKeyframeGammaGamma1197 = -1;
    public int FrostHunterServiceConnectionTurboPhoenixOmega6719 = -1;
    public int FrostHunterLightSensorForceFusion4241 = -1;

    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMergeSpeedHyperionBlaze4246 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("not attached to a buffer");
            return;
        }
        if (!this.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809;
        if (j <= j2) {
            if (j < 0) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterAlertDialogAuroraDelta3200("newSize < 0: ", j));
                return;
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterMaterialCardViewTitanMax3245.getClass();
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMaterialCardViewTitanMax32452.getClass();
                int i = frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475;
                long j4 = i - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (j4 > j3) {
                    frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 = i - ((int) j3);
                    break;
                } else {
                    frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax32452.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterLayoutNeoCyberMega2992.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterMaterialCardViewTitanMax32452);
                    j3 -= j4;
                }
            }
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
            this.FrostHunterKeyframeGammaGamma1197 = j;
            this.FrostHunterFragmentBetaMegaVortex6025 = null;
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = -1;
            this.FrostHunterLightSensorForceFusion4241 = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                FrostHunterMaterialCardViewTitanMax3245 FrostHunterViewPhantomNeo1634 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterViewPhantomNeo1634(i2);
                int min = (int) Math.min(j5, 8192 - FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475);
                int i3 = FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 + min;
                FrostHunterViewPhantomNeo1634.FrostHunterBundlePulseFusionHero2475 = i3;
                j5 -= min;
                if (z) {
                    this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterViewPhantomNeo1634;
                    this.FrostHunterKeyframeGammaGamma1197 = j2;
                    this.FrostHunterFragmentBetaMegaVortex6025 = FrostHunterViewPhantomNeo1634.FrostHunterAlphaAnimationNeoCosmos5761;
                    this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i3 - min;
                    this.FrostHunterLightSensorForceFusion4241 = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809 = j;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757(long j) {
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterMergeSpeedHyperionBlaze4246 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.FrostHunterAlertDialogAuroraDelta3200 = null;
                    this.FrostHunterKeyframeGammaGamma1197 = j;
                    this.FrostHunterFragmentBetaMegaVortex6025 = null;
                    this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = -1;
                    this.FrostHunterLightSensorForceFusion4241 = -1;
                    return -1;
                }
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax3245 = frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32452 = this.FrostHunterAlertDialogAuroraDelta3200;
                long j3 = 0;
                if (frostHunterMaterialCardViewTitanMax32452 != null) {
                    long j4 = this.FrostHunterKeyframeGammaGamma1197 - (this.FrostHunterServiceConnectionTurboPhoenixOmega6719 - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    if (j4 > j) {
                        frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245;
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax32452;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        frostHunterMaterialCardViewTitanMax32452.getClass();
                        long j5 = (frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633) + j3;
                        if (j < j5) {
                            break;
                        }
                        frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax32452.FrostHunterLevelListDrawableFusionDragonHero2232;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        frostHunterMaterialCardViewTitanMax3245 = frostHunterMaterialCardViewTitanMax3245.FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterMaterialCardViewTitanMax3245.getClass();
                        j2 -= frostHunterMaterialCardViewTitanMax3245.FrostHunterBundlePulseFusionHero2475 - frostHunterMaterialCardViewTitanMax3245.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    }
                    frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax3245;
                    j3 = j2;
                }
                if (this.FrostHunterFlowMaxDragonHero5809) {
                    frostHunterMaterialCardViewTitanMax32452.getClass();
                    if (frostHunterMaterialCardViewTitanMax32452.FrostHunterServiceEliteCelestialThunder1757) {
                        byte[] bArr = frostHunterMaterialCardViewTitanMax32452.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32453 = new FrostHunterMaterialCardViewTitanMax3245(Arrays.copyOf(bArr, bArr.length), frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475, false, true);
                        if (frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterMaterialCardViewTitanMax32452) {
                            frostHunterMergeSpeedHyperionBlaze4246.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterMaterialCardViewTitanMax32453;
                        }
                        frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterMaterialCardViewTitanMax32453);
                        FrostHunterMaterialCardViewTitanMax3245 frostHunterMaterialCardViewTitanMax32454 = frostHunterMaterialCardViewTitanMax32453.FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterMaterialCardViewTitanMax32454.getClass();
                        frostHunterMaterialCardViewTitanMax32454.FrostHunterAlphaAnimationNeoCosmos5761();
                        frostHunterMaterialCardViewTitanMax32452 = frostHunterMaterialCardViewTitanMax32453;
                    }
                }
                this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterMaterialCardViewTitanMax32452;
                this.FrostHunterKeyframeGammaGamma1197 = j;
                frostHunterMaterialCardViewTitanMax32452.getClass();
                this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterMaterialCardViewTitanMax32452.FrostHunterAlphaAnimationNeoCosmos5761;
                int i = frostHunterMaterialCardViewTitanMax32452.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ((int) (j - j3));
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i;
                int i2 = frostHunterMaterialCardViewTitanMax32452.FrostHunterBundlePulseFusionHero2475;
                this.FrostHunterLightSensorForceFusion4241 = i2;
                return i2 - i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + frostHunterMergeSpeedHyperionBlaze4246.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("not attached to a buffer");
            return;
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = null;
        this.FrostHunterAlertDialogAuroraDelta3200 = null;
        this.FrostHunterKeyframeGammaGamma1197 = -1L;
        this.FrostHunterFragmentBetaMegaVortex6025 = null;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = -1;
        this.FrostHunterLightSensorForceFusion4241 = -1;
    }
}
