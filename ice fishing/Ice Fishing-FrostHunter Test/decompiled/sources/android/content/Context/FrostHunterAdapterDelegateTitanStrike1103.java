package android.content.Context;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterDelegateTitanStrike1103 implements Closeable {
    public static final Logger FrostHunterServiceConnectionTurboPhoenixOmega6719 = Logger.getLogger(FrostHunterKeyframeGammaGamma2319.class.getName());
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterCameraViewPhantomUltraHyperion8580 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterMergeSpeedHyperionBlaze4246 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterLayerFusionTurbo9521 FrostHunterFragmentBetaMegaVortex6025;
    public boolean FrostHunterKeyframeGammaGamma1197;

    public FrostHunterAdapterDelegateTitanStrike1103(FrostHunterConstraintSetBlazeSpectra9155 frostHunterConstraintSetBlazeSpectra9155) {
        frostHunterConstraintSetBlazeSpectra9155.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterConstraintSetBlazeSpectra9155;
        FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterMergeSpeedHyperionBlaze4246;
        this.FrostHunterAlertDialogAuroraDelta3200 = 16384;
        this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterLayerFusionTurbo9521(frostHunterMergeSpeedHyperionBlaze4246);
    }

    public final void FrostHunterAlertDialogAuroraDelta3200(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            FrostHunterLevelListDrawableFusionDragonHero2232(0, 8, 6, z ? 1 : 0);
            this.FrostHunterCameraXPixelTurboCosmos9814.writeInt(i);
            this.FrostHunterCameraXPixelTurboCosmos9814.writeInt(i2);
            this.FrostHunterCameraXPixelTurboCosmos9814.flush();
        }
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterMotionSceneSparkNebula4815 frostHunterMotionSceneSparkNebula4815) {
        frostHunterMotionSceneSparkNebula4815.getClass();
        synchronized (this) {
            try {
                if (this.FrostHunterKeyframeGammaGamma1197) {
                    throw new IOException("closed");
                }
                int i = this.FrostHunterAlertDialogAuroraDelta3200;
                int i2 = frostHunterMotionSceneSparkNebula4815.FrostHunterAlphaAnimationNeoCosmos5761;
                if ((i2 & 32) != 0) {
                    i = frostHunterMotionSceneSparkNebula4815.FrostHunterConstraintSetCloneMasterUltraRogue2633[5];
                }
                this.FrostHunterAlertDialogAuroraDelta3200 = i;
                if (((i2 & 2) != 0 ? frostHunterMotionSceneSparkNebula4815.FrostHunterConstraintSetCloneMasterUltraRogue2633[1] : -1) != -1) {
                    FrostHunterLayerFusionTurbo9521 frostHunterLayerFusionTurbo9521 = this.FrostHunterFragmentBetaMegaVortex6025;
                    int i3 = (i2 & 2) != 0 ? frostHunterMotionSceneSparkNebula4815.FrostHunterConstraintSetCloneMasterUltraRogue2633[1] : -1;
                    frostHunterLayerFusionTurbo9521.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = frostHunterLayerFusionTurbo9521.FrostHunterServiceEliteCelestialThunder1757;
                    if (i4 != min) {
                        if (min < i4) {
                            frostHunterLayerFusionTurbo9521.FrostHunterConstraintSetCloneMasterUltraRogue2633 = Math.min(frostHunterLayerFusionTurbo9521.FrostHunterConstraintSetCloneMasterUltraRogue2633, min);
                        }
                        frostHunterLayerFusionTurbo9521.FrostHunterBundlePulseFusionHero2475 = true;
                        frostHunterLayerFusionTurbo9521.FrostHunterServiceEliteCelestialThunder1757 = min;
                        int i5 = frostHunterLayerFusionTurbo9521.FrostHunterCameraXPixelTurboCosmos9814;
                        if (min < i5) {
                            if (min == 0) {
                                FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr = frostHunterLayerFusionTurbo9521.FrostHunterLifecycleBlazeGammaElite2889;
                                FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(frostHunterDataBindingCelestialCyberSpectra3810Arr, 0, frostHunterDataBindingCelestialCyberSpectra3810Arr.length);
                                frostHunterLayerFusionTurbo9521.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterLayerFusionTurbo9521.FrostHunterLifecycleBlazeGammaElite2889.length - 1;
                                frostHunterLayerFusionTurbo9521.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
                                frostHunterLayerFusionTurbo9521.FrostHunterCameraXPixelTurboCosmos9814 = 0;
                            } else {
                                frostHunterLayerFusionTurbo9521.FrostHunterAlphaAnimationNeoCosmos5761(i5 - min);
                            }
                        }
                    }
                }
                FrostHunterLevelListDrawableFusionDragonHero2232(0, 0, 4, 1);
                this.FrostHunterCameraXPixelTurboCosmos9814.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion3959, byte[] bArr) {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            if (frostHunterWithContextForceFusion3959.FrostHunterCameraXPixelTurboCosmos9814 == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            FrostHunterLevelListDrawableFusionDragonHero2232(0, bArr.length + 8, 7, 0);
            this.FrostHunterCameraXPixelTurboCosmos9814.writeInt(i);
            this.FrostHunterCameraXPixelTurboCosmos9814.writeInt(frostHunterWithContextForceFusion3959.FrostHunterCameraXPixelTurboCosmos9814);
            if (bArr.length != 0) {
                this.FrostHunterCameraXPixelTurboCosmos9814.write(bArr);
            }
            this.FrostHunterCameraXPixelTurboCosmos9814.flush();
        }
    }

    public final void FrostHunterFlowMaxDragonHero5809(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceEliteCelestialThunder1757(arrayList);
            long j = this.FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809;
            long min = Math.min(this.FrostHunterAlertDialogAuroraDelta3200, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            FrostHunterLevelListDrawableFusionDragonHero2232(i, (int) min, 1, i2);
            this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceConnectionTurboPhoenixOmega6719(min, this.FrostHunterFlowMaxDragonHero5809);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.FrostHunterAlertDialogAuroraDelta3200, j2);
                    j2 -= min2;
                    FrostHunterLevelListDrawableFusionDragonHero2232(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceConnectionTurboPhoenixOmega6719(min2, this.FrostHunterFlowMaxDragonHero5809);
                }
            }
        }
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(int i, long j) {
        synchronized (this) {
            try {
                if (this.FrostHunterKeyframeGammaGamma1197) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = FrostHunterServiceConnectionTurboPhoenixOmega6719;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterBundlePulseFusionHero2475(i, 4, j, false));
                }
                FrostHunterLevelListDrawableFusionDragonHero2232(i, 4, 8, 0);
                this.FrostHunterCameraXPixelTurboCosmos9814.writeInt((int) j);
                this.FrostHunterCameraXPixelTurboCosmos9814.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void FrostHunterKeyframeGammaGamma1197(int i, FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion3959) {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            if (frostHunterWithContextForceFusion3959.FrostHunterCameraXPixelTurboCosmos9814 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            FrostHunterLevelListDrawableFusionDragonHero2232(i, 4, 3, 0);
            this.FrostHunterCameraXPixelTurboCosmos9814.writeInt(frostHunterWithContextForceFusion3959.FrostHunterCameraXPixelTurboCosmos9814);
            this.FrostHunterCameraXPixelTurboCosmos9814.flush();
        }
    }

    public final void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (logger.isLoggable(level)) {
                logger.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterConstraintSetCloneMasterUltraRogue2633(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.FrostHunterAlertDialogAuroraDelta3200) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.FrostHunterAlertDialogAuroraDelta3200 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("reserved bit set: ", i));
            return;
        }
        byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterCameraViewPhantomUltraHyperion8580 frostHunterCameraViewPhantomUltraHyperion8580 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterCameraViewPhantomUltraHyperion8580.getClass();
        frostHunterCameraViewPhantomUltraHyperion8580.writeByte((i2 >>> 16) & 255);
        frostHunterCameraViewPhantomUltraHyperion8580.writeByte((i2 >>> 8) & 255);
        frostHunterCameraViewPhantomUltraHyperion8580.writeByte(i2 & 255);
        frostHunterCameraViewPhantomUltraHyperion8580.writeByte(i3 & 255);
        frostHunterCameraViewPhantomUltraHyperion8580.writeByte(i4 & 255);
        frostHunterCameraViewPhantomUltraHyperion8580.writeInt(i & Integer.MAX_VALUE);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(boolean z, int i, FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246, int i2) {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            FrostHunterLevelListDrawableFusionDragonHero2232(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                FrostHunterCameraViewPhantomUltraHyperion8580 frostHunterCameraViewPhantomUltraHyperion8580 = this.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterMergeSpeedHyperionBlaze4246.getClass();
                frostHunterCameraViewPhantomUltraHyperion8580.FrostHunterServiceConnectionTurboPhoenixOmega6719(i2, frostHunterMergeSpeedHyperionBlaze4246);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.FrostHunterKeyframeGammaGamma1197 = true;
            this.FrostHunterCameraXPixelTurboCosmos9814.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.FrostHunterKeyframeGammaGamma1197) {
                throw new IOException("closed");
            }
            this.FrostHunterCameraXPixelTurboCosmos9814.flush();
        }
    }
}
