package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatorAuroraShadow7198 implements Closeable {
    public static final Logger FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterClipboardManagerLegendNovaXCyber3511 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterBitmapHyperLegend9603 FrostHunterFlowMaxDragonHero5809;

    static {
        Logger logger = Logger.getLogger(FrostHunterKeyframeGammaGamma2319.class.getName());
        logger.getClass();
        FrostHunterKeyframeGammaGamma1197 = logger;
    }

    public FrostHunterAnimatorAuroraShadow7198(FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582) {
        frostHunterConstraintLayoutBetaAlphaNebula8582.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterConstraintLayoutBetaAlphaNebula8582;
        FrostHunterBitmapHyperLegend9603 frostHunterBitmapHyperLegend9603 = new FrostHunterBitmapHyperLegend9603(frostHunterConstraintLayoutBetaAlphaNebula8582);
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterBitmapHyperLegend9603;
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterClipboardManagerLegendNovaXCyber3511(frostHunterBitmapHyperLegend9603);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x022f, code lost:
    
        android.content.Context.FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(android.content.Context.FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0238, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(boolean z, FrostHunterSnackbarTitanPhantom6369 frostHunterSnackbarTitanPhantom6369) {
        int FrostHunterFragmentBetaMegaVortex6025;
        Object[] array;
        try {
            this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterServiceInfoHyperionSparkMax9966(9L);
            FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterFragmentBetaMegaVortex6025(this.FrostHunterCameraXPixelTurboCosmos9814);
        } catch (EOFException unused) {
        }
        if (FrostHunterFragmentBetaMegaVortex6025 > 16384) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("FRAME_SIZE_ERROR: ", FrostHunterFragmentBetaMegaVortex6025));
            return false;
        }
        int readByte = this.FrostHunterCameraXPixelTurboCosmos9814.readByte() & 255;
        byte readByte2 = this.FrostHunterCameraXPixelTurboCosmos9814.readByte();
        int i = readByte2 & 255;
        int readInt = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
        int i2 = Integer.MAX_VALUE & readInt;
        int i3 = 1;
        if (readByte != 8) {
            Logger logger = FrostHunterKeyframeGammaGamma1197;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterConstraintSetCloneMasterUltraRogue2633(true, i2, FrostHunterFragmentBetaMegaVortex6025, readByte, i));
            }
        }
        if (z && readByte != 4) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyframeGammaGamma2319.FrostHunterAlphaAnimationNeoCosmos5761(readByte), "Expected a SETTINGS frame but was ");
            return false;
        }
        FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion3959 = null;
        switch (readByte) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterServiceEliteCelestialThunder1757(frostHunterSnackbarTitanPhantom6369, FrostHunterFragmentBetaMegaVortex6025, i, i2);
                return true;
            case 1:
                FrostHunterCameraXPixelTurboCosmos9814(frostHunterSnackbarTitanPhantom6369, FrostHunterFragmentBetaMegaVortex6025, i, i2);
                return true;
            case 2:
                if (FrostHunterFragmentBetaMegaVortex6025 != 5) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("TYPE_PRIORITY length: ", FrostHunterFragmentBetaMegaVortex6025, " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterJobSchedulerEpicAuroraNebula9616.readInt();
                frostHunterJobSchedulerEpicAuroraNebula9616.readByte();
                return true;
            case 3:
                if (FrostHunterFragmentBetaMegaVortex6025 != 4) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("TYPE_RST_STREAM length: ", FrostHunterFragmentBetaMegaVortex6025, " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
                FrostHunterWithContextForceFusion3959.FrostHunterFlowMaxDragonHero5809.getClass();
                FrostHunterWithContextForceFusion3959[] values = FrostHunterWithContextForceFusion3959.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion39592 = values[i4];
                        if (frostHunterWithContextForceFusion39592.FrostHunterCameraXPixelTurboCosmos9814 == readInt2) {
                            frostHunterWithContextForceFusion3959 = frostHunterWithContextForceFusion39592;
                        } else {
                            i4++;
                        }
                    }
                }
                if (frostHunterWithContextForceFusion3959 == null) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    return false;
                }
                FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian9745 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                if (i2 == 0 || (readInt & 1) != 0) {
                    FrostHunterButtonThunderLegendRogue2654 FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterServiceBetaOlympian9745.FrostHunterLevelListDrawableFusionDragonHero2232(i2);
                    if (FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
                        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
                            if (FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterCameraXPixelTurboCosmos9814() == null) {
                                FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterResourcesTitanHyperVision5823 = frostHunterWithContextForceFusion3959;
                                FrostHunterLevelListDrawableFusionDragonHero2232.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                }
                FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian9745.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterServiceBetaOlympian9745.FrostHunterAlertDialogAuroraDelta3200 + '[' + i2 + "] onReset", 0L, new FrostHunterVibratorCosmosPrimeDragon6219(frostHunterServiceBetaOlympian9745, i2, frostHunterWithContextForceFusion3959, i3), 6);
                return true;
            case 4:
                FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula96162 = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (i2 != 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (FrostHunterFragmentBetaMegaVortex6025 != 0) {
                        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (FrostHunterFragmentBetaMegaVortex6025 % 6 != 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("TYPE_SETTINGS length % 6 != 0: ", FrostHunterFragmentBetaMegaVortex6025));
                    return false;
                }
                FrostHunterMotionSceneSparkNebula4815 frostHunterMotionSceneSparkNebula4815 = new FrostHunterMotionSceneSparkNebula4815();
                FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRunnableCosmosCelestial4235(0, FrostHunterFragmentBetaMegaVortex6025), 6);
                int i5 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterCameraXPixelTurboCosmos9814;
                int i6 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterFlowMaxDragonHero5809;
                int i7 = FrostHunterConstraintSetCloneOmegaHyperion9304.FrostHunterAlertDialogAuroraDelta3200;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        short readShort = frostHunterJobSchedulerEpicAuroraNebula96162.readShort();
                        byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i8 = readShort & 65535;
                        int readInt3 = frostHunterJobSchedulerEpicAuroraNebula96162.readInt();
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        frostHunterMotionSceneSparkNebula4815.FrostHunterConstraintSetCloneMasterUltraRogue2633(i8, readInt3);
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                }
                FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97452 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian97452.FrostHunterScaleAnimationStrikeSpark5059, FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), frostHunterServiceBetaOlympian97452.FrostHunterAlertDialogAuroraDelta3200, " applyAndAckSettings"), 0L, new FrostHunterBundleQuantumTurboRogue8500(9, frostHunterSnackbarTitanPhantom6369, frostHunterMotionSceneSparkNebula4815), 6);
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                FrostHunterFlowMaxDragonHero5809(frostHunterSnackbarTitanPhantom6369, FrostHunterFragmentBetaMegaVortex6025, i, i2);
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                if (FrostHunterFragmentBetaMegaVortex6025 != 8) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("TYPE_PING length != 8: ", FrostHunterFragmentBetaMegaVortex6025));
                    return false;
                }
                if (i2 != 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_PING streamId != 0");
                    return false;
                }
                final int readInt4 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
                final int readInt5 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
                r0 = (readByte2 & 1) != 0 ? 1 : 0;
                FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97453 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                if (r0 == 0) {
                    FrostHunterApplicationInfoUltraInfernoSpectra4401 frostHunterApplicationInfoUltraInfernoSpectra4401 = frostHunterServiceBetaOlympian97453.FrostHunterScaleAnimationStrikeSpark5059;
                    String FrostHunterFragmentBetaMegaVortex60252 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809.FrostHunterAlertDialogAuroraDelta3200, " ping");
                    final FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97454 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterApplicationInfoUltraInfernoSpectra4401, FrostHunterFragmentBetaMegaVortex60252, 0L, new FrostHunterNotificationGammaBlazePhoenix7595() { // from class: android.content.Context.FrostHunterVelocityTrackerNebulaStormMaster3990
                        @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
                        public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
                            FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97455 = FrostHunterServiceBetaOlympian9745.this;
                            try {
                                frostHunterServiceBetaOlympian97455.FrostHunterCardViewSpectraCyber7714.FrostHunterAlertDialogAuroraDelta3200(readInt4, readInt5, true);
                            } catch (IOException e) {
                                FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion39593 = FrostHunterWithContextForceFusion3959.PROTOCOL_ERROR;
                                frostHunterServiceBetaOlympian97455.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterWithContextForceFusion39593, frostHunterWithContextForceFusion39593, e);
                            }
                            return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                        }
                    }, 6);
                    return true;
                }
                synchronized (frostHunterServiceBetaOlympian97453) {
                    try {
                        if (readInt4 == 1) {
                            frostHunterServiceBetaOlympian97453.FrostHunterResourcesTitanHyperVision5823++;
                        } else if (readInt4 == 2) {
                            frostHunterServiceBetaOlympian97453.FrostHunterLooperThreadBetaHyperionMax1000++;
                        } else if (readInt4 == 3) {
                            frostHunterServiceBetaOlympian97453.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                if (FrostHunterFragmentBetaMegaVortex6025 < 8) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("TYPE_GOAWAY length < 8: ", FrostHunterFragmentBetaMegaVortex6025));
                    return false;
                }
                if (i2 != 0) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
                int readInt7 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt();
                int i9 = FrostHunterFragmentBetaMegaVortex6025 - 8;
                FrostHunterWithContextForceFusion3959.FrostHunterFlowMaxDragonHero5809.getClass();
                FrostHunterWithContextForceFusion3959[] values2 = FrostHunterWithContextForceFusion3959.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion39593 = values2[i10];
                        if (frostHunterWithContextForceFusion39593.FrostHunterCameraXPixelTurboCosmos9814 == readInt7) {
                            frostHunterWithContextForceFusion3959 = frostHunterWithContextForceFusion39593;
                        } else {
                            i10++;
                        }
                    }
                }
                if (frostHunterWithContextForceFusion3959 == null) {
                    FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("TYPE_GOAWAY unexpected error code: ", readInt7));
                    return false;
                }
                FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
                if (i9 > 0) {
                    frostHunterBarrierStrikeDragonOlympian9836 = this.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLifecycleBlazeGammaElite2889(i9);
                }
                frostHunterBarrierStrikeDragonOlympian9836.getClass();
                frostHunterBarrierStrikeDragonOlympian9836.FrostHunterServiceEliteCelestialThunder1757();
                FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97455 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterServiceBetaOlympian97455) {
                    array = frostHunterServiceBetaOlympian97455.FrostHunterFlowMaxDragonHero5809.values().toArray(new FrostHunterButtonThunderLegendRogue2654[0]);
                    frostHunterServiceBetaOlympian97455.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
                }
                FrostHunterButtonThunderLegendRogue2654[] frostHunterButtonThunderLegendRogue2654Arr = (FrostHunterButtonThunderLegendRogue2654[]) array;
                int length3 = frostHunterButtonThunderLegendRogue2654Arr.length;
                while (r0 < length3) {
                    FrostHunterButtonThunderLegendRogue2654 frostHunterButtonThunderLegendRogue2654 = frostHunterButtonThunderLegendRogue2654Arr[r0];
                    if (frostHunterButtonThunderLegendRogue2654.FrostHunterCameraXPixelTurboCosmos9814 > readInt6 && frostHunterButtonThunderLegendRogue2654.FrostHunterFlowMaxDragonHero5809()) {
                        FrostHunterWithContextForceFusion3959 frostHunterWithContextForceFusion39594 = FrostHunterWithContextForceFusion3959.REFUSED_STREAM;
                        synchronized (frostHunterButtonThunderLegendRogue2654) {
                            if (frostHunterButtonThunderLegendRogue2654.FrostHunterCameraXPixelTurboCosmos9814() == null) {
                                frostHunterButtonThunderLegendRogue2654.FrostHunterResourcesTitanHyperVision5823 = frostHunterWithContextForceFusion39594;
                                frostHunterButtonThunderLegendRogue2654.notifyAll();
                            }
                        }
                        frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterButtonThunderLegendRogue2654.FrostHunterCameraXPixelTurboCosmos9814);
                    }
                    r0++;
                }
                return true;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    if (FrostHunterFragmentBetaMegaVortex6025 != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + FrostHunterFragmentBetaMegaVortex6025);
                    }
                    long readInt8 = this.FrostHunterCameraXPixelTurboCosmos9814.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = FrostHunterKeyframeGammaGamma1197;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterBundlePulseFusionHero2475(i2, FrostHunterFragmentBetaMegaVortex6025, readInt8, true));
                    }
                    FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97456 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
                    if (i2 == 0) {
                        synchronized (frostHunterServiceBetaOlympian97456) {
                            frostHunterServiceBetaOlympian97456.FrostHunterEditTextPulseHyperion1262 += readInt8;
                            frostHunterServiceBetaOlympian97456.notifyAll();
                        }
                        return true;
                    }
                    FrostHunterButtonThunderLegendRogue2654 FrostHunterServiceEliteCelestialThunder1757 = frostHunterServiceBetaOlympian97456.FrostHunterServiceEliteCelestialThunder1757(i2);
                    if (FrostHunterServiceEliteCelestialThunder1757 != null) {
                        synchronized (FrostHunterServiceEliteCelestialThunder1757) {
                            FrostHunterServiceEliteCelestialThunder1757.FrostHunterFragmentBetaMegaVortex6025 += readInt8;
                            if (readInt8 > 0) {
                                FrostHunterServiceEliteCelestialThunder1757.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    FrostHunterKeyframeGammaGamma1197.fine(FrostHunterKeyframeGammaGamma2319.FrostHunterConstraintSetCloneMasterUltraRogue2633(true, i2, FrostHunterFragmentBetaMegaVortex6025, 8, i));
                    throw e;
                }
            default:
                this.FrostHunterCameraXPixelTurboCosmos9814.skip(FrostHunterFragmentBetaMegaVortex6025);
                return true;
        }
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterSnackbarTitanPhantom6369 frostHunterSnackbarTitanPhantom6369, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian9745;
        if (i3 == 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.FrostHunterCameraXPixelTurboCosmos9814.readByte();
            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterJobSchedulerEpicAuroraNebula9616.readInt();
            frostHunterJobSchedulerEpicAuroraNebula9616.readByte();
            byte[] bArr2 = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMediaPlayerCelestialBetaTitan3868(i5, i2, i4), i4, i2, i3);
        FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97452 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = z;
        }
        if (z2) {
            FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian97452.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterServiceBetaOlympian97452.FrostHunterAlertDialogAuroraDelta3200 + '[' + i3 + "] onHeaders", 0L, new FrostHunterVibratorCosmosPrimeDragon6219(frostHunterServiceBetaOlympian97452, i3, FrostHunterLevelListDrawableFusionDragonHero2232, z3), 6);
            return;
        }
        synchronized (frostHunterServiceBetaOlympian97452) {
            try {
                FrostHunterButtonThunderLegendRogue2654 FrostHunterServiceEliteCelestialThunder1757 = frostHunterServiceBetaOlympian97452.FrostHunterServiceEliteCelestialThunder1757(i3);
                if (FrostHunterServiceEliteCelestialThunder1757 != null) {
                    FrostHunterServiceEliteCelestialThunder1757.FrostHunterKeyframeGammaGamma1197(FrostHunterTextureViewForceEpicQuantum6388.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterLevelListDrawableFusionDragonHero2232), z3);
                    return;
                }
                if (frostHunterServiceBetaOlympian97452.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                    return;
                }
                if (i3 <= frostHunterServiceBetaOlympian97452.FrostHunterKeyframeGammaGamma1197) {
                    return;
                }
                if (i3 % 2 == frostHunterServiceBetaOlympian97452.FrostHunterFragmentBetaMegaVortex6025 % 2) {
                    return;
                }
                frostHunterServiceBetaOlympian9745 = frostHunterServiceBetaOlympian97452;
                try {
                    FrostHunterButtonThunderLegendRogue2654 frostHunterButtonThunderLegendRogue2654 = new FrostHunterButtonThunderLegendRogue2654(i3, frostHunterServiceBetaOlympian9745, false, z3, FrostHunterTextureViewForceEpicQuantum6388.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterLevelListDrawableFusionDragonHero2232));
                    frostHunterServiceBetaOlympian9745.FrostHunterKeyframeGammaGamma1197 = i3;
                    frostHunterServiceBetaOlympian9745.FrostHunterFlowMaxDragonHero5809.put(Integer.valueOf(i3), frostHunterButtonThunderLegendRogue2654);
                    FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian9745.FrostHunterLightSensorForceFusion4241.FrostHunterServiceEliteCelestialThunder1757(), frostHunterServiceBetaOlympian9745.FrostHunterAlertDialogAuroraDelta3200 + '[' + i3 + "] onStream", 0L, new FrostHunterBundleQuantumTurboRogue8500(8, frostHunterServiceBetaOlympian9745, frostHunterButtonThunderLegendRogue2654), 6);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                frostHunterServiceBetaOlympian9745 = frostHunterServiceBetaOlympian97452;
            }
        }
    }

    public final void FrostHunterFlowMaxDragonHero5809(FrostHunterSnackbarTitanPhantom6369 frostHunterSnackbarTitanPhantom6369, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.FrostHunterCameraXPixelTurboCosmos9814.readByte();
            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.FrostHunterCameraXPixelTurboCosmos9814.readInt() & Integer.MAX_VALUE;
        List FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMediaPlayerCelestialBetaTitan3868(i - 4, i2, i4), i4, i2, i3);
        FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian9745 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
        synchronized (frostHunterServiceBetaOlympian9745) {
            if (frostHunterServiceBetaOlympian9745.FrostHunterMeteringPointMegaCyber7955.contains(Integer.valueOf(readInt))) {
                frostHunterServiceBetaOlympian9745.FrostHunterKeyframeGammaGamma1197(readInt, FrostHunterWithContextForceFusion3959.PROTOCOL_ERROR);
                return;
            }
            frostHunterServiceBetaOlympian9745.FrostHunterMeteringPointMegaCyber7955.add(Integer.valueOf(readInt));
            FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian9745.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterServiceBetaOlympian9745.FrostHunterAlertDialogAuroraDelta3200 + '[' + readInt + "] onRequest", 0L, new FrostHunterVibratorCosmosPrimeDragon6219(frostHunterServiceBetaOlympian9745, readInt, FrostHunterLevelListDrawableFusionDragonHero2232, i5), 6);
        }
    }

    public final List FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2, int i3, int i4) {
        FrostHunterBitmapHyperLegend9603 frostHunterBitmapHyperLegend9603 = this.FrostHunterFlowMaxDragonHero5809;
        frostHunterBitmapHyperLegend9603.FrostHunterFragmentBetaMegaVortex6025 = i;
        frostHunterBitmapHyperLegend9603.FrostHunterFlowMaxDragonHero5809 = i;
        frostHunterBitmapHyperLegend9603.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2;
        frostHunterBitmapHyperLegend9603.FrostHunterAlertDialogAuroraDelta3200 = i3;
        frostHunterBitmapHyperLegend9603.FrostHunterKeyframeGammaGamma1197 = i4;
        FrostHunterClipboardManagerLegendNovaXCyber3511 frostHunterClipboardManagerLegendNovaXCyber3511 = this.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterConstraintLayoutBetaAlphaNebula8582 frostHunterConstraintLayoutBetaAlphaNebula8582 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterBundlePulseFusionHero2475;
        ArrayList arrayList = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (!frostHunterConstraintLayoutBetaAlphaNebula8582.FrostHunterAlphaAnimationNeoCosmos5761()) {
            byte readByte = frostHunterConstraintLayoutBetaAlphaNebula8582.readByte();
            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            int i5 = readByte & 255;
            if (i5 == 128) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int FrostHunterLifecycleBlazeGammaElite2889 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889(i5, 127);
                int i6 = FrostHunterLifecycleBlazeGammaElite2889 - 1;
                if (i6 >= 0) {
                    FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr = FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (i6 <= frostHunterDataBindingCelestialCyberSpectra3810Arr.length - 1) {
                        arrayList.add(frostHunterDataBindingCelestialCyberSpectra3810Arr[i6]);
                    }
                }
                int length = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889 + 1 + (i6 - FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761.length);
                if (length >= 0) {
                    FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr2 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757;
                    if (length < frostHunterDataBindingCelestialCyberSpectra3810Arr2.length) {
                        FrostHunterDataBindingCelestialCyberSpectra3810 frostHunterDataBindingCelestialCyberSpectra3810 = frostHunterDataBindingCelestialCyberSpectra3810Arr2[length];
                        frostHunterDataBindingCelestialCyberSpectra3810.getClass();
                        arrayList.add(frostHunterDataBindingCelestialCyberSpectra3810);
                    }
                }
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Header index too large ", FrostHunterLifecycleBlazeGammaElite2889));
                return null;
            }
            if (i5 == 64) {
                FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr3 = FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterServiceEliteCelestialThunder1757 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757();
                FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder1757);
                frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterBundlePulseFusionHero2475(new FrostHunterDataBindingCelestialCyberSpectra3810(FrostHunterServiceEliteCelestialThunder1757, frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757()));
            } else if ((readByte & 64) == 64) {
                frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterBundlePulseFusionHero2475(new FrostHunterDataBindingCelestialCyberSpectra3810(frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889(i5, 63) - 1), frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757()));
            } else if ((readByte & 32) == 32) {
                int FrostHunterLifecycleBlazeGammaElite28892 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889(i5, 31);
                frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLifecycleBlazeGammaElite28892;
                if (FrostHunterLifecycleBlazeGammaElite28892 < 0 || FrostHunterLifecycleBlazeGammaElite28892 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterAlphaAnimationNeoCosmos5761);
                }
                int i7 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterRemoteConfigSpeedSpeed8566;
                if (FrostHunterLifecycleBlazeGammaElite28892 < i7) {
                    if (FrostHunterLifecycleBlazeGammaElite28892 == 0) {
                        FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(r6, 0, frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757.length);
                        frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757.length - 1;
                        frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
                        frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterRemoteConfigSpeedSpeed8566 = 0;
                    } else {
                        frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterAlphaAnimationNeoCosmos5761(i7 - FrostHunterLifecycleBlazeGammaElite28892);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                FrostHunterDataBindingCelestialCyberSpectra3810[] frostHunterDataBindingCelestialCyberSpectra3810Arr4 = FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterServiceEliteCelestialThunder17572 = frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757();
                FrostHunterTabLayoutPhantomRogueShadow8811.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceEliteCelestialThunder17572);
                arrayList.add(new FrostHunterDataBindingCelestialCyberSpectra3810(FrostHunterServiceEliteCelestialThunder17572, frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757()));
            } else {
                arrayList.add(new FrostHunterDataBindingCelestialCyberSpectra3810(frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterLifecycleBlazeGammaElite2889(i5, 15) - 1), frostHunterClipboardManagerLegendNovaXCyber3511.FrostHunterServiceEliteCelestialThunder1757()));
            }
        }
        List FrostHunterGyroscopeOmegaEclipseOlympian7225 = FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterGyroscopeOmegaEclipseOlympian7225(arrayList);
        arrayList.clear();
        return FrostHunterGyroscopeOmegaEclipseOlympian7225;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterSnackbarTitanPhantom6369 frostHunterSnackbarTitanPhantom6369, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.FrostHunterCameraXPixelTurboCosmos9814.readByte();
            byte[] bArr = FrostHunterFirebasePhantomVisionOlympian3288.FrostHunterAlphaAnimationNeoCosmos5761;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        final int FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterMediaPlayerCelestialBetaTitan3868(i, i2, i4);
        FrostHunterJobSchedulerEpicAuroraNebula9616 frostHunterJobSchedulerEpicAuroraNebula9616 = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterJobSchedulerEpicAuroraNebula9616.getClass();
        final FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian9745 = frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze4246 = new FrostHunterMergeSpeedHyperionBlaze4246();
            long j = FrostHunterMediaPlayerCelestialBetaTitan3868;
            frostHunterJobSchedulerEpicAuroraNebula9616.FrostHunterServiceInfoHyperionSparkMax9966(j);
            frostHunterJobSchedulerEpicAuroraNebula9616.FrostHunterResourcesTitanHyperVision5823(j, frostHunterMergeSpeedHyperionBlaze4246);
            FrostHunterApplicationInfoUltraInfernoSpectra4401.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterServiceBetaOlympian9745.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, frostHunterServiceBetaOlympian9745.FrostHunterAlertDialogAuroraDelta3200 + '[' + i3 + "] onData", 0L, new FrostHunterNotificationGammaBlazePhoenix7595(i3, frostHunterMergeSpeedHyperionBlaze4246, FrostHunterMediaPlayerCelestialBetaTitan3868, z4) { // from class: android.content.Context.FrostHunterOnClickListenerSolarFusion4612
                public final /* synthetic */ FrostHunterMergeSpeedHyperionBlaze4246 FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;
                public final /* synthetic */ int FrostHunterKeyframeGammaGamma1197;

                @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
                public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
                    FrostHunterServiceBetaOlympian9745 frostHunterServiceBetaOlympian97452 = FrostHunterServiceBetaOlympian9745.this;
                    int i5 = this.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze42462 = this.FrostHunterAlertDialogAuroraDelta3200;
                    int i6 = this.FrostHunterKeyframeGammaGamma1197;
                    try {
                        frostHunterServiceBetaOlympian97452.FrostHunterCameraXTurboCelestialHero5430.getClass();
                        frostHunterMergeSpeedHyperionBlaze42462.skip(i6);
                        frostHunterServiceBetaOlympian97452.FrostHunterCardViewSpectraCyber7714.FrostHunterKeyframeGammaGamma1197(i5, FrostHunterWithContextForceFusion3959.CANCEL);
                        synchronized (frostHunterServiceBetaOlympian97452) {
                            frostHunterServiceBetaOlympian97452.FrostHunterMeteringPointMegaCyber7955.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }, 6);
        } else {
            FrostHunterButtonThunderLegendRogue2654 FrostHunterServiceEliteCelestialThunder1757 = frostHunterServiceBetaOlympian9745.FrostHunterServiceEliteCelestialThunder1757(i3);
            if (FrostHunterServiceEliteCelestialThunder1757 == null) {
                frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197(i3, FrostHunterWithContextForceFusion3959.PROTOCOL_ERROR);
                long j2 = FrostHunterMediaPlayerCelestialBetaTitan3868;
                frostHunterSnackbarTitanPhantom6369.FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809(j2);
                frostHunterJobSchedulerEpicAuroraNebula9616.skip(j2);
            } else {
                TimeZone timeZone = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterInterpolatorCosmosPhoenix5719 frostHunterInterpolatorCosmosPhoenix5719 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059;
                long j3 = FrostHunterMediaPlayerCelestialBetaTitan3868;
                frostHunterInterpolatorCosmosPhoenix5719.getClass();
                long j4 = j3;
                while (true) {
                    FrostHunterButtonThunderLegendRogue2654 frostHunterButtonThunderLegendRogue2654 = frostHunterInterpolatorCosmosPhoenix5719.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761;
                        frostHunterButtonThunderLegendRogue2654.FrostHunterFlowMaxDragonHero5809.FrostHunterFlowMaxDragonHero5809(j3);
                        frostHunterInterpolatorCosmosPhoenix5719.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFlowMaxDragonHero5809.FrostHunterBitmapTurboDeltaNebula8743.getClass();
                        break;
                    }
                    synchronized (frostHunterButtonThunderLegendRogue2654) {
                        z2 = frostHunterInterpolatorCosmosPhoenix5719.FrostHunterFlowMaxDragonHero5809;
                        z3 = frostHunterInterpolatorCosmosPhoenix5719.FrostHunterKeyframeGammaGamma1197.FrostHunterFlowMaxDragonHero5809 + j4 > frostHunterInterpolatorCosmosPhoenix5719.FrostHunterCameraXPixelTurboCosmos9814;
                    }
                    if (z3) {
                        frostHunterJobSchedulerEpicAuroraNebula9616.skip(j4);
                        frostHunterInterpolatorCosmosPhoenix5719.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterWithContextForceFusion3959.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        frostHunterJobSchedulerEpicAuroraNebula9616.skip(j4);
                        break;
                    }
                    long FrostHunterResourcesTitanHyperVision5823 = frostHunterJobSchedulerEpicAuroraNebula9616.FrostHunterResourcesTitanHyperVision5823(j4, frostHunterInterpolatorCosmosPhoenix5719.FrostHunterAlertDialogAuroraDelta3200);
                    if (FrostHunterResourcesTitanHyperVision5823 == -1) {
                        throw new EOFException();
                    }
                    j4 -= FrostHunterResourcesTitanHyperVision5823;
                    FrostHunterButtonThunderLegendRogue2654 frostHunterButtonThunderLegendRogue26542 = frostHunterInterpolatorCosmosPhoenix5719.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    synchronized (frostHunterButtonThunderLegendRogue26542) {
                        try {
                            if (frostHunterInterpolatorCosmosPhoenix5719.FrostHunterFragmentBetaMegaVortex6025) {
                                frostHunterInterpolatorCosmosPhoenix5719.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761();
                            } else {
                                FrostHunterMergeSpeedHyperionBlaze4246 frostHunterMergeSpeedHyperionBlaze42462 = frostHunterInterpolatorCosmosPhoenix5719.FrostHunterKeyframeGammaGamma1197;
                                boolean z5 = frostHunterMergeSpeedHyperionBlaze42462.FrostHunterFlowMaxDragonHero5809 == 0;
                                frostHunterMergeSpeedHyperionBlaze42462.FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterInterpolatorCosmosPhoenix5719.FrostHunterAlertDialogAuroraDelta3200);
                                if (z5) {
                                    frostHunterButtonThunderLegendRogue26542.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    FrostHunterServiceEliteCelestialThunder1757.FrostHunterKeyframeGammaGamma1197(FrostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterFlowMaxDragonHero5809, true);
                }
            }
        }
        this.FrostHunterCameraXPixelTurboCosmos9814.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.FrostHunterCameraXPixelTurboCosmos9814.close();
    }
}
