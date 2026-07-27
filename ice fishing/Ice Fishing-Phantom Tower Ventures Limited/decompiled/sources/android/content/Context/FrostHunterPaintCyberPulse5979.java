package android.content.Context;

import android.content.res.TypedArray;
import android.graphics.Paint;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterPaintCyberPulse5979 {
    public static ExecutorService FrostHunterAlphaAnimationNeoCosmos5761;
    public static final FrostHunterKotlinQuantumRogue5892 FrostHunterCameraXPixelTurboCosmos9814;
    public static final FrostHunterKotlinQuantumRogue5892 FrostHunterFlowMaxDragonHero5809;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterLevelListDrawableFusionDragonHero2232;
    public static final FrostHunterKotlinQuantumRogue5892 FrostHunterRemoteConfigSpeedSpeed8566;
    public static final int[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] FrostHunterBundlePulseFusionHero2475 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final Object FrostHunterServiceEliteCelestialThunder1757 = new Object();
    public static final int[] FrostHunterLifecycleBlazeGammaElite2889 = new int[2];
    public static final byte[] FrostHunterAlertDialogAuroraDelta3200 = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] FrostHunterKeyframeGammaGamma1197 = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    static {
        int i = 3;
        FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterWorkManagerMaxTurbo1858("NULL", i);
        int i2 = 24;
        FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterKotlinQuantumRogue5892(i2, new FrostHunterGroupEpicMega1178(2), new FrostHunterLaunchStormOlympian3697(18));
        FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterKotlinQuantumRogue5892(i2, new FrostHunterGroupEpicMega1178(i), new FrostHunterLaunchStormOlympian3697(19));
        FrostHunterFlowMaxDragonHero5809 = new FrostHunterKotlinQuantumRogue5892(i2, new FrostHunterGroupEpicMega1178(4), new FrostHunterLaunchStormOlympian3697(20));
    }

    public static final void FrostHunterAlertDialogAuroraDelta3200(int i, int i2) {
        if (i < 0 || i >= i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
        }
    }

    public static final FrostHunterCrashlyticsTurboPhantomTitan3440 FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new FrostHunterCrashlyticsTurboPhantomTitan3440(singleton);
    }

    public static final Object FrostHunterAnnotationProcessorSparkEclipse8710(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Object obj, Object obj2, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        Object FrostHunterCameraXPixelTurboCosmos98142;
        Object FrostHunterColorStateListMegaBetaFusion7423 = FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListMegaBetaFusion7423(frostHunterCountDownTimerRogueTitan5615, obj2);
        try {
            FrostHunterTextInputLayoutTurboPixelShadow9543 frostHunterTextInputLayoutTurboPixelShadow9543 = new FrostHunterTextInputLayoutTurboPixelShadow9543(frostHunterTraceCelestialVortexSpark6705, frostHunterCountDownTimerRogueTitan5615);
            if (frostHunterFontFamilyNeoBetaEpic8574 == null) {
                FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterPreviewBlazeAurora1020(frostHunterFontFamilyNeoBetaEpic8574, obj, frostHunterTextInputLayoutTurboPixelShadow9543);
            } else {
                FrostHunterCanvasInfernoVortex4700.FrostHunterLightSensorForceFusion4241(2, frostHunterFontFamilyNeoBetaEpic8574);
                FrostHunterCameraXPixelTurboCosmos98142 = frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(obj, frostHunterTextInputLayoutTurboPixelShadow9543);
            }
            FrostHunterCardViewHyperionAurora3829.FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterCountDownTimerRogueTitan5615, FrostHunterColorStateListMegaBetaFusion7423);
            if (FrostHunterCameraXPixelTurboCosmos98142 == FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814) {
                frostHunterTraceCelestialVortexSpark6705.getClass();
            }
            return FrostHunterCameraXPixelTurboCosmos98142;
        } catch (Throwable th) {
            FrostHunterCardViewHyperionAurora3829.FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterCountDownTimerRogueTitan5615, FrostHunterColorStateListMegaBetaFusion7423);
            throw th;
        }
    }

    public static final boolean FrostHunterBillingClientFusionVortex9008(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final FrostHunterModelInputOutputEliteHyperForce8871 FrostHunterBitmapTurboDeltaNebula8743(FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce8871) {
        FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce88712;
        FrostHunterModelInputOutputEliteHyperForce8871 FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterModelInputOutputEliteHyperForce8871.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        while (true) {
            FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce88713 = FrostHunterServiceConnectionTurboPhoenixOmega6719;
            frostHunterModelInputOutputEliteHyperForce88712 = frostHunterModelInputOutputEliteHyperForce8871;
            frostHunterModelInputOutputEliteHyperForce8871 = frostHunterModelInputOutputEliteHyperForce88713;
            if (frostHunterModelInputOutputEliteHyperForce8871 == null) {
                break;
            }
            FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterModelInputOutputEliteHyperForce8871.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        }
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598 = frostHunterModelInputOutputEliteHyperForce88712 instanceof FrostHunterVectorDrawableMaxAlpha8598 ? (FrostHunterVectorDrawableMaxAlpha8598) frostHunterModelInputOutputEliteHyperForce88712 : null;
        if (frostHunterVectorDrawableMaxAlpha8598 == null) {
            return frostHunterModelInputOutputEliteHyperForce88712;
        }
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha85982 = frostHunterVectorDrawableMaxAlpha8598.FrostHunterDialogFragmentTurboPhoenixDragon7627;
        while (true) {
            FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha85983 = frostHunterVectorDrawableMaxAlpha85982;
            FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha85984 = frostHunterVectorDrawableMaxAlpha8598;
            frostHunterVectorDrawableMaxAlpha8598 = frostHunterVectorDrawableMaxAlpha85983;
            if (frostHunterVectorDrawableMaxAlpha8598 == null) {
                return frostHunterVectorDrawableMaxAlpha85984;
            }
            frostHunterVectorDrawableMaxAlpha85982 = frostHunterVectorDrawableMaxAlpha8598.FrostHunterDialogFragmentTurboPhoenixDragon7627;
        }
    }

    public static final FrostHunterCardViewFusionHeroSpectra3749 FrostHunterBundlePulseFusionHero2475() {
        return new FrostHunterCardViewFusionHeroSpectra3749(new Paint(7));
    }

    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterCameraXPixelTurboCosmos9814(FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598) {
        FrostHunterModelInputOutputEliteHyperForce8871 FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterBitmapTurboDeltaNebula8743(frostHunterVectorDrawableMaxAlpha8598);
        float FrostHunterCardViewSpectraCyber7714 = (int) (FrostHunterBitmapTurboDeltaNebula8743.FrostHunterCardViewSpectraCyber7714() >> 32);
        float FrostHunterCardViewSpectraCyber77142 = (int) (FrostHunterBitmapTurboDeltaNebula8743.FrostHunterCardViewSpectraCyber7714() & 4294967295L);
        FrostHunterBarrierThunderHyperion9659 FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterBitmapTurboDeltaNebula8743.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterVectorDrawableMaxAlpha8598, true);
        float f = FrostHunterLevelListDrawableFusionDragonHero22322.FrostHunterAlphaAnimationNeoCosmos5761;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > FrostHunterCardViewSpectraCyber7714) {
            f = FrostHunterCardViewSpectraCyber7714;
        }
        float f2 = FrostHunterLevelListDrawableFusionDragonHero22322.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > FrostHunterCardViewSpectraCyber77142) {
            f2 = FrostHunterCardViewSpectraCyber77142;
        }
        float f3 = FrostHunterLevelListDrawableFusionDragonHero22322.FrostHunterBundlePulseFusionHero2475;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= FrostHunterCardViewSpectraCyber7714) {
            FrostHunterCardViewSpectraCyber7714 = f3;
        }
        float f4 = FrostHunterLevelListDrawableFusionDragonHero22322.FrostHunterServiceEliteCelestialThunder1757;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= FrostHunterCardViewSpectraCyber77142) {
            FrostHunterCardViewSpectraCyber77142 = f5;
        }
        if (f == FrostHunterCardViewSpectraCyber7714 || f2 == FrostHunterCardViewSpectraCyber77142) {
            return FrostHunterBarrierThunderHyperion9659.FrostHunterLifecycleBlazeGammaElite2889;
        }
        long FrostHunterFlowMaxDragonHero58092 = FrostHunterBitmapTurboDeltaNebula8743.FrostHunterFlowMaxDragonHero5809((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long FrostHunterFlowMaxDragonHero58093 = FrostHunterBitmapTurboDeltaNebula8743.FrostHunterFlowMaxDragonHero5809((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(FrostHunterCardViewSpectraCyber7714) << 32));
        long FrostHunterFlowMaxDragonHero58094 = FrostHunterBitmapTurboDeltaNebula8743.FrostHunterFlowMaxDragonHero5809((Float.floatToRawIntBits(FrostHunterCardViewSpectraCyber7714) << 32) | (Float.floatToRawIntBits(FrostHunterCardViewSpectraCyber77142) & 4294967295L));
        long FrostHunterFlowMaxDragonHero58095 = FrostHunterBitmapTurboDeltaNebula8743.FrostHunterFlowMaxDragonHero5809((Float.floatToRawIntBits(FrostHunterCardViewSpectraCyber77142) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58092 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58093 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58095 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58094 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58092 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58093 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58095 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (FrostHunterFlowMaxDragonHero58094 & 4294967295L));
        return new FrostHunterBarrierThunderHyperion9659(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrostHunterTraceCelestialVortexSpark6705 FrostHunterCameraXTurboCelestialHero5430(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark67052, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        frostHunterFontFamilyNeoBetaEpic8574.getClass();
        if (frostHunterFontFamilyNeoBetaEpic8574 instanceof FrostHunterGradleShadowPhantom7937) {
            return ((FrostHunterGradleShadowPhantom7937) frostHunterFontFamilyNeoBetaEpic8574).FrostHunterKeyframeGammaGamma1197(frostHunterTraceCelestialVortexSpark67052, frostHunterTraceCelestialVortexSpark6705);
        }
        FrostHunterCountDownTimerRogueTitan5615 context = frostHunterTraceCelestialVortexSpark67052.getContext();
        return context == FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814 ? new FrostHunterActionBarSparkTitan9404(frostHunterTraceCelestialVortexSpark67052, frostHunterTraceCelestialVortexSpark6705, frostHunterFontFamilyNeoBetaEpic8574) : new FrostHunterScrollViewEclipseNebula5943(frostHunterTraceCelestialVortexSpark67052, context, frostHunterFontFamilyNeoBetaEpic8574, frostHunterTraceCelestialVortexSpark6705);
    }

    public static final FrostHunterPushNotificationPhoenixOlympian6533 FrostHunterCardViewSpectraCyber7714(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterTransformSpectraLegend4789 FrostHunterKeyframeGammaGamma11972 = frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterAlertDialogAuroraDelta3200);
        FrostHunterPushNotificationPhoenixOlympian6533 frostHunterPushNotificationPhoenixOlympian6533 = FrostHunterKeyframeGammaGamma11972 instanceof FrostHunterPushNotificationPhoenixOlympian6533 ? (FrostHunterPushNotificationPhoenixOlympian6533) FrostHunterKeyframeGammaGamma11972 : null;
        return frostHunterPushNotificationPhoenixOlympian6533 == null ? FrostHunterViewBindingSpeedPixelSpark4156.FrostHunterAlphaAnimationNeoCosmos5761 : frostHunterPushNotificationPhoenixOlympian6533;
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(final FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma1840, final FrostHunterInputMethodManagerQuantumSpeedMaster8897 frostHunterInputMethodManagerQuantumSpeedMaster8897, final FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion9221, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75953, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75954, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        final FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92212;
        FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterServiceEliteCelestialThunder17572;
        Object obj;
        boolean z;
        frostHunterDelayPixelGamma1840.getClass();
        frostHunterItemDecorationNovaPulseHyperion9221.getClass();
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterNotificationGammaBlazePhoenix75952.getClass();
        frostHunterNotificationGammaBlazePhoenix75953.getClass();
        frostHunterNotificationGammaBlazePhoenix75954.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1402472077);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75954) ? 1048576 : 524288) | i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterDelayPixelGamma1840.ordinal()) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion9221) ? 256 : 128) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 2048 : 1024) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75952) ? 16384 : 8192) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75953) ? 131072 : 65536);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (599171 & i2) != 599170)) {
            FrostHunterFragmentManagerOlympianNovaAlpha1516 frostHunterFragmentManagerOlympianNovaAlpha1516 = (FrostHunterFragmentManagerOlympianNovaAlpha1516) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterHandlerThreadPhoenixQuantum3560.FrostHunterAlphaAnimationNeoCosmos5761);
            if (frostHunterFragmentManagerOlympianNovaAlpha1516 == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1260197608);
                frostHunterFragmentManagerOlympianNovaAlpha1516 = FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterLifecycleBlazeGammaElite2889((View) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterLifecycleBlazeGammaElite2889));
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1260196492);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            if (frostHunterFragmentManagerOlympianNovaAlpha1516 == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            boolean z2 = frostHunterFragmentManagerOlympianNovaAlpha1516 instanceof FrostHunterLevelListDrawableCyberSolarForce1472;
            FrostHunterAnimatorSetThunderSpark5581 FrostHunterLifecycleBlazeGammaElite28892 = z2 ? ((FrostHunterLevelListDrawableCyberSolarForce1472) frostHunterFragmentManagerOlympianNovaAlpha1516).FrostHunterLifecycleBlazeGammaElite2889() : FrostHunterResourceUltraSolarBeta9587.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterRewardedAdAlphaPhoenixVortex4789 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterFragmentTransactionShadowOmega3645.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterObserverNovaHyperionSolar5635.class);
            int i3 = 6;
            FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705 = null;
            if (z2) {
                FrostHunterPropertyValuesHolderMaxSpeed2945 FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterFragmentManagerOlympianNovaAlpha1516.FrostHunterLevelListDrawableFusionDragonHero2232();
                FrostHunterAdapterDelegatePhantomTitanium6932 FrostHunterServiceEliteCelestialThunder17573 = ((FrostHunterLevelListDrawableCyberSolarForce1472) frostHunterFragmentManagerOlympianNovaAlpha1516).FrostHunterServiceEliteCelestialThunder1757();
                FrostHunterLevelListDrawableFusionDragonHero22322.getClass();
                FrostHunterServiceEliteCelestialThunder17573.getClass();
                FrostHunterLifecycleBlazeGammaElite28892.getClass();
                FrostHunterServiceEliteCelestialThunder17572 = new FrostHunterLayoutInflaterTurboHyperion3832(FrostHunterLevelListDrawableFusionDragonHero22322, FrostHunterServiceEliteCelestialThunder17573, FrostHunterLifecycleBlazeGammaElite28892);
            } else {
                FrostHunterServiceEliteCelestialThunder17572 = FrostHunterLocationManagerAlphaFusion6480.FrostHunterServiceEliteCelestialThunder1757(frostHunterFragmentManagerOlympianNovaAlpha1516, null, 6);
            }
            FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 = (FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) FrostHunterServiceEliteCelestialThunder17572.FrostHunterFlowMaxDragonHero5809;
            String FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Local and anonymous classes can not be ViewModels");
                return;
            }
            final FrostHunterObserverNovaHyperionSolar5635 frostHunterObserverNovaHyperionSolar5635 = (FrostHunterObserverNovaHyperionSolar5635) frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849.FrostHunterBitmapTurboDeltaNebula8743(FrostHunterAlphaAnimationNeoCosmos57612, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(FrostHunterConstraintSetCloneMasterUltraRogue26332));
            FrostHunterChipSpectraInfernoVortex8090 FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterTransitionGammaTitanSpeed7178.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObserverNovaHyperionSolar5635.FrostHunterLifecycleBlazeGammaElite2889, frostHunterDialogFragmentPhantomEclipse8068);
            boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar5635) | ((i2 & 14) == 4);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj2 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium8202 == obj2) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterObjectDetectionBlazeGammaRogue7560(frostHunterObserverNovaHyperionSolar5635, frostHunterDelayPixelGamma1840, (FrostHunterTraceCelestialVortexSpark6705) null);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDialogFragmentPhantomEclipse8068, (FrostHunterFontFamilyNeoBetaEpic8574) FrostHunterMagnetometerFusionTitanium8202, frostHunterDelayPixelGamma1840);
            boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar5635);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98143 || FrostHunterMagnetometerFusionTitanium82022 == obj2) {
                FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterDatabaseMasterPrimeSpeed8049(10, frostHunterObserverNovaHyperionSolar5635);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82022, frostHunterDialogFragmentPhantomEclipse8068);
            boolean FrostHunterCameraXPixelTurboCosmos98144 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar5635) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion9221);
            Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98144 || FrostHunterMagnetometerFusionTitanium82023 == obj2) {
                FrostHunterMagnetometerFusionTitanium82023 = new FrostHunterGuidelineCyberShadow5104(frostHunterObserverNovaHyperionSolar5635, frostHunterItemDecorationNovaPulseHyperion9221, frostHunterTraceCelestialVortexSpark6705, 11);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82023);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDialogFragmentPhantomEclipse8068, (FrostHunterFontFamilyNeoBetaEpic8574) FrostHunterMagnetometerFusionTitanium82023, frostHunterObserverNovaHyperionSolar5635);
            final FrostHunterServiceConnectionTurboEclipse7688 frostHunterServiceConnectionTurboEclipse7688 = (FrostHunterServiceConnectionTurboEclipse7688) FrostHunterScaleAnimationStrikeSpark5059.getValue();
            if (frostHunterServiceConnectionTurboEclipse7688 == null) {
                FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
                if (FrostHunterResourcesTitanHyperVision5823 != null) {
                    final int i4 = 0;
                    FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(frostHunterDelayPixelGamma1840, frostHunterInputMethodManagerQuantumSpeedMaster8897, frostHunterItemDecorationNovaPulseHyperion9221, frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, i, i4) { // from class: android.content.Context.FrostHunterClipDrawableStrikeInfernoSolar2356
                        public final /* synthetic */ FrostHunterInputMethodManagerQuantumSpeedMaster8897 FrostHunterAlertDialogAuroraDelta3200;
                        public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
                        public final /* synthetic */ FrostHunterDelayPixelGamma1840 FrostHunterFlowMaxDragonHero5809;
                        public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFragmentBetaMegaVortex6025;
                        public final /* synthetic */ FrostHunterItemDecorationNovaPulseHyperion9221 FrostHunterKeyframeGammaGamma1197;
                        public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterLightSensorForceFusion4241;
                        public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterScaleAnimationStrikeSpark5059;
                        public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterServiceConnectionTurboPhoenixOmega6719;

                        {
                            this.FrostHunterCameraXPixelTurboCosmos9814 = i4;
                        }

                        @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                        public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj3, Object obj4) {
                            int i5 = this.FrostHunterCameraXPixelTurboCosmos9814;
                            FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                            switch (i5) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    ((Integer) obj4).getClass();
                                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                                    FrostHunterPaintCyberPulse5979.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, this.FrostHunterScaleAnimationStrikeSpark5059, (FrostHunterDialogFragmentPhantomEclipse8068) obj3, FrostHunterLiveDataBetaLegend3442);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int FrostHunterLiveDataBetaLegend34422 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                                    FrostHunterPaintCyberPulse5979.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, this.FrostHunterScaleAnimationStrikeSpark5059, (FrostHunterDialogFragmentPhantomEclipse8068) obj3, FrostHunterLiveDataBetaLegend34422);
                                    break;
                            }
                            return frostHunterLinearLayoutSolarHero7990;
                        }
                    };
                    return;
                }
                return;
            }
            frostHunterItemDecorationNovaPulseHyperion92212 = frostHunterItemDecorationNovaPulseHyperion9221;
            FrostHunterPagingSourcePhantomSolar2809 frostHunterPagingSourcePhantomSolar2809 = frostHunterServiceConnectionTurboEclipse7688.FrostHunterLightSensorForceFusion4241;
            Object FrostHunterMagnetometerFusionTitanium82024 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterMagnetometerFusionTitanium82024 == obj2) {
                FrostHunterMagnetometerFusionTitanium82024 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterCameraXPixelTurboCosmos9814(null);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82024);
            }
            FrostHunterChipSpectraInfernoVortex8090 frostHunterChipSpectraInfernoVortex8090 = (FrostHunterChipSpectraInfernoVortex8090) FrostHunterMagnetometerFusionTitanium82024;
            boolean FrostHunterCameraXPixelTurboCosmos98145 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterServiceConnectionTurboEclipse7688) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion92212);
            Object FrostHunterMagnetometerFusionTitanium82025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98145 || FrostHunterMagnetometerFusionTitanium82025 == obj2) {
                FrostHunterMagnetometerFusionTitanium82025 = new FrostHunterActivitySpectraNebulaOlympian5738(frostHunterServiceConnectionTurboEclipse7688, frostHunterItemDecorationNovaPulseHyperion92212, frostHunterChipSpectraInfernoVortex8090, null);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82025);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDialogFragmentPhantomEclipse8068, (FrostHunterFontFamilyNeoBetaEpic8574) FrostHunterMagnetometerFusionTitanium82025, frostHunterPagingSourcePhantomSolar2809);
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingDataTurboTitanium7332(-1625365298, new FrostHunterDragEventStormHyperion6109() { // from class: android.content.Context.FrostHunterAssetManagerBlazeCosmosNebula7427
                @Override // android.content.Context.FrostHunterDragEventStormHyperion6109
                public final Object FrostHunterLevelListDrawableFusionDragonHero2232(Object obj3, Object obj4, Object obj5) {
                    FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320;
                    FrostHunterObserverNovaHyperionSolar5635 frostHunterObserverNovaHyperionSolar56352;
                    FrostHunterExoPlayerHeroQuantum1765 frostHunterExoPlayerHeroQuantum1765 = (FrostHunterExoPlayerHeroQuantum1765) obj3;
                    FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = (FrostHunterDialogFragmentPhantomEclipse8068) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    frostHunterExoPlayerHeroQuantum1765.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterExoPlayerHeroQuantum1765) ? 4 : 2;
                    }
                    if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFCMDeltaQuantumHero8364(intValue & 1, (intValue & 19) != 18)) {
                        FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 4.0f));
                        FrostHunterServiceConnectionTurboEclipse7688 frostHunterServiceConnectionTurboEclipse76882 = FrostHunterServiceConnectionTurboEclipse7688.this;
                        FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma18402 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i5 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterAlertDialogAuroraDelta3200;
                        FrostHunterKaptMasterUltra4503 frostHunterKaptMasterUltra4503 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        int i6 = frostHunterKaptMasterUltra4503.FrostHunterLevelListDrawableFusionDragonHero2232;
                        int i7 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterFragmentBetaMegaVortex6025;
                        int i8 = frostHunterKaptMasterUltra4503.FrostHunterLifecycleBlazeGammaElite2889;
                        int i9 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        int i10 = frostHunterServiceConnectionTurboEclipse76882.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterObserverNovaHyperionSolar5635 frostHunterObserverNovaHyperionSolar56353 = frostHunterObserverNovaHyperionSolar5635;
                        boolean FrostHunterCameraXPixelTurboCosmos98146 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar56353);
                        Object FrostHunterMagnetometerFusionTitanium82026 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202();
                        FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm63202 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
                        if (FrostHunterCameraXPixelTurboCosmos98146 || FrostHunterMagnetometerFusionTitanium82026 == frostHunterRippleDrawableBlazeBetaStorm63202) {
                            frostHunterRippleDrawableBlazeBetaStorm6320 = frostHunterRippleDrawableBlazeBetaStorm63202;
                            FrostHunterMagnetometerFusionTitanium82026 = new FrostHunterExecutorSolarGamma2515(0, frostHunterObserverNovaHyperionSolar56353, FrostHunterObserverNovaHyperionSolar5635.class, "togglePause", "togglePause()V", 0, 0, 3);
                            frostHunterObserverNovaHyperionSolar56352 = frostHunterObserverNovaHyperionSolar56353;
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82026);
                        } else {
                            frostHunterRippleDrawableBlazeBetaStorm6320 = frostHunterRippleDrawableBlazeBetaStorm63202;
                            frostHunterObserverNovaHyperionSolar56352 = frostHunterObserverNovaHyperionSolar56353;
                        }
                        FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm63203 = frostHunterRippleDrawableBlazeBetaStorm6320;
                        FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterServiceEliteCelestialThunder1757(frostHunterDelayPixelGamma18402, i5, i6, i7, i8, i9, i10, (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82026), frostHunterDialogFragmentPhantomEclipse80682, 0);
                        FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92213 = frostHunterItemDecorationNovaPulseHyperion92212;
                        boolean FrostHunterCameraXPixelTurboCosmos98147 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterItemDecorationNovaPulseHyperion92213) | frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar56352);
                        Object FrostHunterMagnetometerFusionTitanium82027 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202();
                        if (FrostHunterCameraXPixelTurboCosmos98147 || FrostHunterMagnetometerFusionTitanium82027 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                            FrostHunterMagnetometerFusionTitanium82027 = new FrostHunterBundleQuantumTurboRogue8500(7, frostHunterItemDecorationNovaPulseHyperion92213, frostHunterObserverNovaHyperionSolar56352);
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82027);
                        }
                        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955 = (FrostHunterNotificationGammaBlazePhoenix7595) FrostHunterMagnetometerFusionTitanium82027;
                        boolean FrostHunterCameraXPixelTurboCosmos98148 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar56352);
                        Object FrostHunterMagnetometerFusionTitanium82028 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202();
                        if (FrostHunterCameraXPixelTurboCosmos98148 || FrostHunterMagnetometerFusionTitanium82028 == frostHunterRippleDrawableBlazeBetaStorm63203) {
                            FrostHunterGradientDrawableMasterPhoenixSpeed8004 frostHunterGradientDrawableMasterPhoenixSpeed8004 = new FrostHunterGradientDrawableMasterPhoenixSpeed8004(3, frostHunterObserverNovaHyperionSolar56352, FrostHunterObserverNovaHyperionSolar5635.class, "onFieldMeasured", "onFieldMeasured(FFF)V", 0, 0);
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterGradientDrawableMasterPhoenixSpeed8004);
                            FrostHunterMagnetometerFusionTitanium82028 = frostHunterGradientDrawableMasterPhoenixSpeed8004;
                        }
                        FrostHunterRemoteConfigPhantomDelta1739.FrostHunterKeyframeGammaGamma1197(frostHunterServiceConnectionTurboEclipse76882, frostHunterNotificationGammaBlazePhoenix75955, (FrostHunterDragEventStormHyperion6109) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82028), FrostHunterExoPlayerHeroQuantum1765.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterExoPlayerHeroQuantum1765, frostHunterAnimatorRoguePulse2723, 1.0f), frostHunterDialogFragmentPhantomEclipse80682, 0);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 12.0f));
                    } else {
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }, frostHunterDialogFragmentPhantomEclipse8068), frostHunterDialogFragmentPhantomEclipse8068, 48);
            if (frostHunterServiceConnectionTurboEclipse7688.FrostHunterScaleAnimationStrikeSpark5059 && frostHunterPagingSourcePhantomSolar2809 == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-393996582);
                boolean FrostHunterCameraXPixelTurboCosmos98146 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar5635);
                Object FrostHunterMagnetometerFusionTitanium82026 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                if (FrostHunterCameraXPixelTurboCosmos98146 || FrostHunterMagnetometerFusionTitanium82026 == obj2) {
                    FrostHunterMagnetometerFusionTitanium82026 = new FrostHunterExecutorSolarGamma2515(0, frostHunterObserverNovaHyperionSolar5635, FrostHunterObserverNovaHyperionSolar5635.class, "togglePause", "togglePause()V", 0, 0, 4);
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82026);
                }
                FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955 = (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82026);
                boolean FrostHunterCameraXPixelTurboCosmos98147 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterObserverNovaHyperionSolar5635);
                Object FrostHunterMagnetometerFusionTitanium82027 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                if (FrostHunterCameraXPixelTurboCosmos98147 || FrostHunterMagnetometerFusionTitanium82027 == obj2) {
                    FrostHunterMagnetometerFusionTitanium82027 = new FrostHunterExecutorSolarGamma2515(0, frostHunterObserverNovaHyperionSolar5635, FrostHunterObserverNovaHyperionSolar5635.class, "restart", "restart()V", 0, 0, 5);
                    obj = frostHunterObserverNovaHyperionSolar5635;
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82027);
                } else {
                    obj = frostHunterObserverNovaHyperionSolar5635;
                }
                FrostHunterVectorDrawableForceMax1351.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterNotificationGammaBlazePhoenix75955, (FrostHunterNotificationGammaBlazePhoenix7595) ((FrostHunterRippleDrawableNeoTitanium8154) FrostHunterMagnetometerFusionTitanium82027), frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, frostHunterDialogFragmentPhantomEclipse8068, (i2 >> 3) & 524160);
                z = false;
            } else {
                obj = frostHunterObserverNovaHyperionSolar5635;
                z = false;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-398049739);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z);
            if (frostHunterPagingSourcePhantomSolar2809 == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-393692380);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-393692379);
                int i5 = frostHunterServiceConnectionTurboEclipse7688.FrostHunterAlertDialogAuroraDelta3200;
                FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma18402 = frostHunterServiceConnectionTurboEclipse7688.FrostHunterAlphaAnimationNeoCosmos5761;
                boolean FrostHunterCameraXPixelTurboCosmos98148 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj);
                Object FrostHunterMagnetometerFusionTitanium82028 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
                if (FrostHunterCameraXPixelTurboCosmos98148 || FrostHunterMagnetometerFusionTitanium82028 == obj2) {
                    FrostHunterMagnetometerFusionTitanium82028 = new FrostHunterBundleQuantumTurboRogue8500(i3, obj, frostHunterChipSpectraInfernoVortex8090);
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82028);
                }
                FrostHunterVectorDrawableForceMax1351.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterPagingSourcePhantomSolar2809, i5, frostHunterDelayPixelGamma18402, (FrostHunterNotificationGammaBlazePhoenix7595) FrostHunterMagnetometerFusionTitanium82028, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, frostHunterDialogFragmentPhantomEclipse8068, (i2 >> 3) & 516096);
                z = false;
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(z);
        } else {
            frostHunterItemDecorationNovaPulseHyperion92212 = frostHunterItemDecorationNovaPulseHyperion9221;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision58232 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision58232 != null) {
            final int i6 = 1;
            final FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion92213 = frostHunterItemDecorationNovaPulseHyperion92212;
            FrostHunterResourcesTitanHyperVision58232.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(frostHunterDelayPixelGamma1840, frostHunterInputMethodManagerQuantumSpeedMaster8897, frostHunterItemDecorationNovaPulseHyperion92213, frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, i, i6) { // from class: android.content.Context.FrostHunterClipDrawableStrikeInfernoSolar2356
                public final /* synthetic */ FrostHunterInputMethodManagerQuantumSpeedMaster8897 FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
                public final /* synthetic */ FrostHunterDelayPixelGamma1840 FrostHunterFlowMaxDragonHero5809;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFragmentBetaMegaVortex6025;
                public final /* synthetic */ FrostHunterItemDecorationNovaPulseHyperion9221 FrostHunterKeyframeGammaGamma1197;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterLightSensorForceFusion4241;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterScaleAnimationStrikeSpark5059;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterServiceConnectionTurboPhoenixOmega6719;

                {
                    this.FrostHunterCameraXPixelTurboCosmos9814 = i6;
                }

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj3, Object obj4) {
                    int i52 = this.FrostHunterCameraXPixelTurboCosmos9814;
                    FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            ((Integer) obj4).getClass();
                            int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                            FrostHunterPaintCyberPulse5979.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, this.FrostHunterScaleAnimationStrikeSpark5059, (FrostHunterDialogFragmentPhantomEclipse8068) obj3, FrostHunterLiveDataBetaLegend3442);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int FrostHunterLiveDataBetaLegend34422 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                            FrostHunterPaintCyberPulse5979.FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, this.FrostHunterServiceConnectionTurboPhoenixOmega6719, this.FrostHunterLightSensorForceFusion4241, this.FrostHunterScaleAnimationStrikeSpark5059, (FrostHunterDialogFragmentPhantomEclipse8068) obj3, FrostHunterLiveDataBetaLegend34422);
                            break;
                    }
                    return frostHunterLinearLayoutSolarHero7990;
                }
            };
        }
    }

    public static final Object FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        FrostHunterCountDownTimerRogueTitan5615 context = frostHunterTraceCelestialVortexSpark6705.getContext();
        FrostHunterCountDownTimerRogueTitan5615 FrostHunterFragmentBetaMegaVortex6025 = !((Boolean) frostHunterCountDownTimerRogueTitan5615.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLaunchEclipseAurora4535(4), Boolean.FALSE)).booleanValue() ? context.FrostHunterFragmentBetaMegaVortex6025(frostHunterCountDownTimerRogueTitan5615) : FrostHunterBindingAdapterSpeedNeo6677.FrostHunterTextViewDragonStormMega4297(context, frostHunterCountDownTimerRogueTitan5615, false);
        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterCameraXTurboCelestialHero5430(FrostHunterFragmentBetaMegaVortex6025);
        if (FrostHunterFragmentBetaMegaVortex6025 == context) {
            FrostHunterRippleDrawableOlympianLegendSpark5293 frostHunterRippleDrawableOlympianLegendSpark5293 = new FrostHunterRippleDrawableOlympianLegendSpark5293(frostHunterTraceCelestialVortexSpark6705, FrostHunterFragmentBetaMegaVortex6025);
            return FrostHunterFirebaseModelDownloadConditionsOmegaNebulaHero6281.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterRippleDrawableOlympianLegendSpark5293, true, frostHunterRippleDrawableOlympianLegendSpark5293, frostHunterFontFamilyNeoBetaEpic8574);
        }
        FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterAlertDialogAuroraDelta3200;
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterFragmentBetaMegaVortex6025.FrostHunterKeyframeGammaGamma1197(frostHunterRippleDrawableBlazeBetaStorm6320), context.FrostHunterKeyframeGammaGamma1197(frostHunterRippleDrawableBlazeBetaStorm6320))) {
            FrostHunterLayerDrawableMegaCosmos5639 frostHunterLayerDrawableMegaCosmos5639 = new FrostHunterLayerDrawableMegaCosmos5639(frostHunterTraceCelestialVortexSpark6705, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan56152 = frostHunterLayerDrawableMegaCosmos5639.FrostHunterAlertDialogAuroraDelta3200;
            Object FrostHunterColorStateListMegaBetaFusion7423 = FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListMegaBetaFusion7423(frostHunterCountDownTimerRogueTitan56152, null);
            try {
                return FrostHunterFirebaseModelDownloadConditionsOmegaNebulaHero6281.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLayerDrawableMegaCosmos5639, true, frostHunterLayerDrawableMegaCosmos5639, frostHunterFontFamilyNeoBetaEpic8574);
            } finally {
                FrostHunterCardViewHyperionAurora3829.FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterCountDownTimerRogueTitan56152, FrostHunterColorStateListMegaBetaFusion7423);
            }
        }
        FrostHunterObjectDetectionPhoenixMaxFusion4023 frostHunterObjectDetectionPhoenixMaxFusion4023 = new FrostHunterObjectDetectionPhoenixMaxFusion4023(frostHunterTraceCelestialVortexSpark6705, FrostHunterFragmentBetaMegaVortex6025);
        try {
            FrostHunterBindingAdapterSpeedNeo6677.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterMeteringPointMegaCyber7955(FrostHunterCameraXTurboCelestialHero5430(frostHunterObjectDetectionPhoenixMaxFusion4023, frostHunterObjectDetectionPhoenixMaxFusion4023, frostHunterFontFamilyNeoBetaEpic8574)), FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = FrostHunterObjectDetectionPhoenixMaxFusion4023.FrostHunterFragmentBetaMegaVortex6025;
            do {
                int i = atomicIntegerFieldUpdater.get(frostHunterObjectDetectionPhoenixMaxFusion4023);
                if (i != 0) {
                    if (i != 2) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Already suspended");
                        return null;
                    }
                    Object FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterPermissionInfoAlphaDelta6279(FrostHunterDelayPhoenixRogueLegend5759.FrostHunterCameraXPixelTurboCosmos9814.get(frostHunterObjectDetectionPhoenixMaxFusion4023));
                    if (FrostHunterPermissionInfoAlphaDelta6279 instanceof FrostHunterImageViewTitaniumVision4682) {
                        throw ((FrostHunterImageViewTitaniumVision4682) FrostHunterPermissionInfoAlphaDelta6279).FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                    return FrostHunterPermissionInfoAlphaDelta6279;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(frostHunterObjectDetectionPhoenixMaxFusion4023, 0, 1));
            return FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
        } catch (Throwable th) {
            th = th;
            if (th instanceof FrostHunterBindingAdapterPhantomMega6235) {
                th = ((FrostHunterBindingAdapterPhantomMega6235) th).FrostHunterCameraXPixelTurboCosmos9814;
            }
            frostHunterObjectDetectionPhoenixMaxFusion4023.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterCameraXTurboCelestialHero5430(th));
            throw th;
        }
    }

    public static final String[] FrostHunterDatabaseEliteShadowUltra2452(FrostHunterCoroutineEpicQuantum9819 frostHunterCoroutineEpicQuantum9819) {
        frostHunterCoroutineEpicQuantum9819.getClass();
        return (String[]) ((FrostHunterCrashlyticsTurboPhantomTitan3440) frostHunterCoroutineEpicQuantum9819).FrostHunterConstraintSetCloneMasterUltraRogue2633.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterCrashlyticsPhoenixGammaPhoenix6624 frostHunterCrashlyticsPhoenixGammaPhoenix6624;
        int i;
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858;
        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236;
        FrostHunterViewPagerPrimeNeoSpeed4839 e;
        FrostHunterRoomDatabaseDragonElite3872 frostHunterRoomDatabaseDragonElite3872;
        Object obj;
        if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterCrashlyticsPhoenixGammaPhoenix6624) {
            frostHunterCrashlyticsPhoenixGammaPhoenix6624 = (FrostHunterCrashlyticsPhoenixGammaPhoenix6624) frostHunterViewBindingCelestialVortex7351;
            int i2 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterLightSensorForceFusion4241;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterLightSensorForceFusion4241 = i2 - Integer.MIN_VALUE;
                Object obj2 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                i = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterLightSensorForceFusion4241;
                frostHunterWorkManagerMaxTurbo1858 = FrostHunterLevelListDrawableFusionDragonHero2232;
                int i3 = 1;
                if (i != 0) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj2);
                    frostHunterVibratorMegaNovaX1236 = new FrostHunterVibratorMegaNovaX1236();
                    frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterWorkManagerMaxTurbo1858;
                    FrostHunterRoomDatabaseDragonElite3872 frostHunterRoomDatabaseDragonElite38722 = new FrostHunterRoomDatabaseDragonElite3872(i3, frostHunterVibratorMegaNovaX1236);
                    try {
                        frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterKeyframeGammaGamma1197 = frostHunterVibratorMegaNovaX1236;
                        frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterFragmentBetaMegaVortex6025 = frostHunterRoomDatabaseDragonElite38722;
                        frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterLightSensorForceFusion4241 = 1;
                        Object FrostHunterAlertDialogAuroraDelta32002 = frostHunterSQLiteMasterUltra9956.FrostHunterAlertDialogAuroraDelta3200(frostHunterRoomDatabaseDragonElite38722, frostHunterCrashlyticsPhoenixGammaPhoenix6624);
                        Object obj3 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                        if (FrostHunterAlertDialogAuroraDelta32002 == obj3) {
                            return obj3;
                        }
                    } catch (FrostHunterViewPagerPrimeNeoSpeed4839 e2) {
                        e = e2;
                        frostHunterRoomDatabaseDragonElite3872 = frostHunterRoomDatabaseDragonElite38722;
                        if (e.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterRoomDatabaseDragonElite3872) {
                        }
                    }
                } else {
                    if (i != 1) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    frostHunterRoomDatabaseDragonElite3872 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterFragmentBetaMegaVortex6025;
                    frostHunterVibratorMegaNovaX1236 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterKeyframeGammaGamma1197;
                    try {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj2);
                    } catch (FrostHunterViewPagerPrimeNeoSpeed4839 e3) {
                        e = e3;
                        if (e.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterRoomDatabaseDragonElite3872) {
                            throw e;
                        }
                        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterFlowMaxDragonHero5809;
                        frostHunterCountDownTimerRogueTitan5615.getClass();
                        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterCameraXTurboCelestialHero5430(frostHunterCountDownTimerRogueTitan5615);
                        obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
                        if (obj != frostHunterWorkManagerMaxTurbo1858) {
                        }
                    }
                }
                obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
                if (obj != frostHunterWorkManagerMaxTurbo1858) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        frostHunterCrashlyticsPhoenixGammaPhoenix6624 = new FrostHunterCrashlyticsPhoenixGammaPhoenix6624(frostHunterViewBindingCelestialVortex7351);
        Object obj22 = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        i = frostHunterCrashlyticsPhoenixGammaPhoenix6624.FrostHunterLightSensorForceFusion4241;
        frostHunterWorkManagerMaxTurbo1858 = FrostHunterLevelListDrawableFusionDragonHero2232;
        int i32 = 1;
        if (i != 0) {
        }
        obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj != frostHunterWorkManagerMaxTurbo1858) {
        }
    }

    public static final Object FrostHunterFCMDeltaQuantumHero8364(Object[] objArr, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        return FrostHunterR8MasterNebulaSpark7247(Arrays.copyOf(objArr, objArr.length), FrostHunterTransitionGammaTitanSpeed7178.FrostHunterAlertDialogAuroraDelta3200, frostHunterNotificationGammaBlazePhoenix7595, frostHunterDialogFragmentPhantomEclipse8068, 3456);
    }

    public static FrostHunterFragmentTitaniumVortexTurbo6559 FrostHunterFlowMaxDragonHero5809(FrostHunterFragmentTitaniumVortexTurbo6559 frostHunterFragmentTitaniumVortexTurbo6559, int i) {
        FrostHunterPagingEclipseDragonInferno8878 frostHunterPagingEclipseDragonInferno8878;
        if (i < 0 && i != -2 && i != -1) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            frostHunterPagingEclipseDragonInferno8878 = FrostHunterPagingEclipseDragonInferno8878.FrostHunterFlowMaxDragonHero5809;
        } else {
            frostHunterPagingEclipseDragonInferno8878 = FrostHunterPagingEclipseDragonInferno8878.FrostHunterCameraXPixelTurboCosmos9814;
        }
        boolean z = frostHunterFragmentTitaniumVortexTurbo6559 instanceof FrostHunterBundleEpicCelestial5775;
        FrostHunterFCMThunderTitanium1373 frostHunterFCMThunderTitanium1373 = FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
        return z ? ((FrostHunterBundleEpicCelestial5775) frostHunterFragmentTitaniumVortexTurbo6559).FrostHunterFlowMaxDragonHero5809(frostHunterFCMThunderTitanium1373, i, frostHunterPagingEclipseDragonInferno8878) : new FrostHunterAlarmManagerBetaOlympianQuantum5211(frostHunterFragmentTitaniumVortexTurbo6559, frostHunterFCMThunderTitanium1373, i, frostHunterPagingEclipseDragonInferno8878);
    }

    public static final void FrostHunterFragmentBetaMegaVortex6025(int i, int i2) {
        if (i < 0 || i > i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
        }
    }

    public static boolean FrostHunterKeyframeGammaGamma1197(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393) {
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868(8);
        int i = FrostHunterRoomUltraForce5592.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPreviewNeoBeta3393, frostHunterLicensingSpectraPulse8868).FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        frostHunterPreviewNeoBeta3393.FrostHunterLintTitanVortexQuantum9911(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, 0, 4);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(0);
        int FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        if (FrostHunterServiceConnectionTurboPhoenixOmega6719 == 1463899717) {
            return true;
        }
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterEditTextPulseHyperion1262("Unsupported form type: " + FrostHunterServiceConnectionTurboPhoenixOmega6719);
        return false;
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterAuthNovaPulse2006 frostHunterAuthNovaPulse2006, int i) {
        if (frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 0 || !(frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(0) == i || frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1) == i)) {
            int i2 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(i3);
                if (i <= FrostHunterConstraintSetCloneMasterUltraRogue26332) {
                    break;
                }
                frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i2, FrostHunterConstraintSetCloneMasterUltraRogue26332);
                i2 = i3;
            }
            frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i2, i);
        }
    }

    public static final boolean FrostHunterLifecycleBlazeGammaElite2889(FrostHunterColorDrawableVisionHyperionNova8883 frostHunterColorDrawableVisionHyperionNova8883, long j) {
        if (!frostHunterColorDrawableVisionHyperionNova8883.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            return false;
        }
        FrostHunterPagingSourceRogueStrike9373 frostHunterPagingSourceRogueStrike9373 = (FrostHunterPagingSourceRogueStrike9373) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterColorDrawableVisionHyperionNova8883).FrostHunterPagingDataTurboTitanium7332.FrostHunterRemoteConfigSpeedSpeed8566;
        if (!frostHunterPagingSourceRogueStrike9373.FrostHunterRemoteConfigThunderShadow4435.FrostHunterLooperThreadBetaHyperionMax1000) {
            return false;
        }
        long FrostHunterViewPhantomNeo1634 = frostHunterPagingSourceRogueStrike9373.FrostHunterViewPhantomNeo1634(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (FrostHunterViewPhantomNeo1634 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (FrostHunterViewPhantomNeo1634 & 4294967295L));
        long j2 = frostHunterColorDrawableVisionHyperionNova8883.FrostHunterDialogFragmentTurboPhoenixDragon7627;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final void FrostHunterLightSensorForceFusion4241(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    FrostHunterImageCaptureShadowGammaMax6416.FrostHunterBundlePulseFusionHero2475(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] FrostHunterLintTitanVortexQuantum9911(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object FrostHunterLooperHyperionForce4133(FrostHunterFragmentTitaniumVortexTurbo6559 frostHunterFragmentTitaniumVortexTurbo6559, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterStateFusionSpectraMaster2474 frostHunterStateFusionSpectraMaster2474;
        int i;
        FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858;
        FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX1236;
        FrostHunterViewPagerPrimeNeoSpeed4839 e;
        FrostHunterWithContextHeroVisionMax9290 frostHunterWithContextHeroVisionMax9290;
        Object obj;
        if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterStateFusionSpectraMaster2474) {
            frostHunterStateFusionSpectraMaster2474 = (FrostHunterStateFusionSpectraMaster2474) frostHunterViewBindingCelestialVortex7351;
            int i2 = frostHunterStateFusionSpectraMaster2474.FrostHunterLightSensorForceFusion4241;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frostHunterStateFusionSpectraMaster2474.FrostHunterLightSensorForceFusion4241 = i2 - Integer.MIN_VALUE;
                Object obj2 = frostHunterStateFusionSpectraMaster2474.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                i = frostHunterStateFusionSpectraMaster2474.FrostHunterLightSensorForceFusion4241;
                frostHunterWorkManagerMaxTurbo1858 = FrostHunterLevelListDrawableFusionDragonHero2232;
                if (i != 0) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj2);
                    FrostHunterVibratorMegaNovaX1236 frostHunterVibratorMegaNovaX12362 = new FrostHunterVibratorMegaNovaX1236();
                    frostHunterVibratorMegaNovaX12362.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterWorkManagerMaxTurbo1858;
                    FrostHunterWithContextHeroVisionMax9290 frostHunterWithContextHeroVisionMax92902 = new FrostHunterWithContextHeroVisionMax9290(frostHunterFontFamilyNeoBetaEpic8574, frostHunterVibratorMegaNovaX12362);
                    try {
                        frostHunterStateFusionSpectraMaster2474.FrostHunterKeyframeGammaGamma1197 = frostHunterVibratorMegaNovaX12362;
                        frostHunterStateFusionSpectraMaster2474.FrostHunterFragmentBetaMegaVortex6025 = frostHunterWithContextHeroVisionMax92902;
                        frostHunterStateFusionSpectraMaster2474.FrostHunterLightSensorForceFusion4241 = 1;
                        Object FrostHunterAlertDialogAuroraDelta32002 = frostHunterFragmentTitaniumVortexTurbo6559.FrostHunterAlertDialogAuroraDelta3200(frostHunterWithContextHeroVisionMax92902, frostHunterStateFusionSpectraMaster2474);
                        Object obj3 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                        if (FrostHunterAlertDialogAuroraDelta32002 == obj3) {
                            return obj3;
                        }
                        frostHunterVibratorMegaNovaX1236 = frostHunterVibratorMegaNovaX12362;
                    } catch (FrostHunterViewPagerPrimeNeoSpeed4839 e2) {
                        frostHunterVibratorMegaNovaX1236 = frostHunterVibratorMegaNovaX12362;
                        e = e2;
                        frostHunterWithContextHeroVisionMax9290 = frostHunterWithContextHeroVisionMax92902;
                        if (e.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterWithContextHeroVisionMax9290) {
                        }
                    }
                } else {
                    if (i != 1) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    frostHunterWithContextHeroVisionMax9290 = frostHunterStateFusionSpectraMaster2474.FrostHunterFragmentBetaMegaVortex6025;
                    frostHunterVibratorMegaNovaX1236 = frostHunterStateFusionSpectraMaster2474.FrostHunterKeyframeGammaGamma1197;
                    try {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj2);
                    } catch (FrostHunterViewPagerPrimeNeoSpeed4839 e3) {
                        e = e3;
                        if (e.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterWithContextHeroVisionMax9290) {
                            throw e;
                        }
                        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = frostHunterStateFusionSpectraMaster2474.FrostHunterFlowMaxDragonHero5809;
                        frostHunterCountDownTimerRogueTitan5615.getClass();
                        FrostHunterBindingAdapterSpeedNeo6677.FrostHunterCameraXTurboCelestialHero5430(frostHunterCountDownTimerRogueTitan5615);
                        obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
                        if (obj != frostHunterWorkManagerMaxTurbo1858) {
                        }
                    }
                }
                obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
                if (obj != frostHunterWorkManagerMaxTurbo1858) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        frostHunterStateFusionSpectraMaster2474 = new FrostHunterStateFusionSpectraMaster2474(frostHunterViewBindingCelestialVortex7351);
        Object obj22 = frostHunterStateFusionSpectraMaster2474.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        i = frostHunterStateFusionSpectraMaster2474.FrostHunterLightSensorForceFusion4241;
        frostHunterWorkManagerMaxTurbo1858 = FrostHunterLevelListDrawableFusionDragonHero2232;
        if (i != 0) {
        }
        obj = frostHunterVibratorMegaNovaX1236.FrostHunterCameraXPixelTurboCosmos9814;
        if (obj != frostHunterWorkManagerMaxTurbo1858) {
        }
    }

    public static final Object FrostHunterLooperThreadBetaHyperionMax1000(long j, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        if (j > 0) {
            FrostHunterSQLiteUltraElite7894 frostHunterSQLiteUltraElite7894 = new FrostHunterSQLiteUltraElite7894(1, FrostHunterMeteringPointMegaCyber7955(frostHunterViewBindingCelestialVortex7351));
            frostHunterSQLiteUltraElite7894.FrostHunterCameraXTurboCelestialHero5430();
            if (j < Long.MAX_VALUE) {
                FrostHunterCardViewSpectraCyber7714(frostHunterSQLiteUltraElite7894.FrostHunterFragmentBetaMegaVortex6025).FrostHunterDatabaseEliteShadowUltra2452(j, frostHunterSQLiteUltraElite7894);
            }
            Object FrostHunterLintTitanVortexQuantum9911 = frostHunterSQLiteUltraElite7894.FrostHunterLintTitanVortexQuantum9911();
            if (FrostHunterLintTitanVortexQuantum9911 == FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814) {
                return FrostHunterLintTitanVortexQuantum9911;
            }
        }
        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public static FrostHunterSnackbarSparkLegendLegend9759 FrostHunterMagnetometerFusionTitanium8202(FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949, boolean z) {
        int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(5);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == 31) {
            FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(6) + 32;
        }
        int FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(frostHunterCountDownTimerStormPulseFusion5949);
        int FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(4);
        String FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("mp4a.40.", FrostHunterRemoteConfigSpeedSpeed85662);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == 5 || FrostHunterRemoteConfigSpeedSpeed85662 == 29) {
            FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(frostHunterCountDownTimerStormPulseFusion5949);
            int FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(5);
            if (FrostHunterRemoteConfigSpeedSpeed85664 == 31) {
                FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(6) + 32;
            }
            FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterRemoteConfigSpeedSpeed85664;
            if (FrostHunterRemoteConfigSpeedSpeed85662 == 22) {
                FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(4);
            }
        }
        if (z) {
            if (FrostHunterRemoteConfigSpeedSpeed85662 != 1 && FrostHunterRemoteConfigSpeedSpeed85662 != 2 && FrostHunterRemoteConfigSpeedSpeed85662 != 3 && FrostHunterRemoteConfigSpeedSpeed85662 != 4 && FrostHunterRemoteConfigSpeedSpeed85662 != 6 && FrostHunterRemoteConfigSpeedSpeed85662 != 7 && FrostHunterRemoteConfigSpeedSpeed85662 != 17) {
                switch (FrostHunterRemoteConfigSpeedSpeed85662) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw FrostHunterDiffUtilTurboSpark8131.FrostHunterConstraintSetCloneMasterUltraRogue2633("Unsupported audio object type: " + FrostHunterRemoteConfigSpeedSpeed85662);
                }
            }
            if (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unexpected frameLengthFlag = 1");
            }
            if (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(14);
            }
            boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterLevelListDrawableFusionDragonHero2232();
            if (FrostHunterRemoteConfigSpeedSpeed85663 == 0) {
                throw new UnsupportedOperationException();
            }
            if (FrostHunterRemoteConfigSpeedSpeed85662 == 6 || FrostHunterRemoteConfigSpeedSpeed85662 == 20) {
                frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(3);
            }
            if (FrostHunterLevelListDrawableFusionDragonHero22322) {
                if (FrostHunterRemoteConfigSpeedSpeed85662 == 22) {
                    frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(16);
                }
                if (FrostHunterRemoteConfigSpeedSpeed85662 == 17 || FrostHunterRemoteConfigSpeedSpeed85662 == 19 || FrostHunterRemoteConfigSpeedSpeed85662 == 20 || FrostHunterRemoteConfigSpeedSpeed85662 == 23) {
                    frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(3);
                }
                frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(1);
            }
            switch (FrostHunterRemoteConfigSpeedSpeed85662) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(2);
                    if (FrostHunterRemoteConfigSpeedSpeed85665 == 2 || FrostHunterRemoteConfigSpeedSpeed85665 == 3) {
                        throw FrostHunterDiffUtilTurboSpark8131.FrostHunterConstraintSetCloneMasterUltraRogue2633("Unsupported epConfig: " + FrostHunterRemoteConfigSpeedSpeed85665);
                    }
            }
        }
        int i = FrostHunterBundlePulseFusionHero2475[FrostHunterRemoteConfigSpeedSpeed85663];
        if (i != -1) {
            return new FrostHunterSnackbarSparkLegendLegend9759(FrostHunterCameraXPixelTurboCosmos98142, FrostHunterViewPhantomNeo1634, i);
        }
        throw FrostHunterDiffUtilTurboSpark8131.FrostHunterAlphaAnimationNeoCosmos5761(null, null);
    }

    public static final FrostHunterPagingSparkCosmos2306 FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterViewModelScopeSparkBlaze1575 frostHunterViewModelScopeSparkBlaze1575, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, FrostHunterInsetDrawableFusionThunder3299 frostHunterInsetDrawableFusionThunder3299, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        FrostHunterCountDownTimerRogueTitan5615 FrostHunterCardViewSpectraCyber7714 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterCardViewSpectraCyber7714(frostHunterViewModelScopeSparkBlaze1575, frostHunterCountDownTimerRogueTitan5615);
        frostHunterInsetDrawableFusionThunder3299.getClass();
        FrostHunterPagingSparkCosmos2306 frostHunterOnItemLongClickListenerShadowCyberAurora6495 = frostHunterInsetDrawableFusionThunder3299 == FrostHunterInsetDrawableFusionThunder3299.FrostHunterFlowMaxDragonHero5809 ? new FrostHunterOnItemLongClickListenerShadowCyberAurora6495(FrostHunterCardViewSpectraCyber7714, frostHunterFontFamilyNeoBetaEpic8574) : new FrostHunterPagingSparkCosmos2306(FrostHunterCardViewSpectraCyber7714, true, true ? 1 : 0);
        frostHunterOnItemLongClickListenerShadowCyberAurora6495.FrostHunterViewPager2StrikePulse8790(frostHunterInsetDrawableFusionThunder3299, frostHunterOnItemLongClickListenerShadowCyberAurora6495, frostHunterFontFamilyNeoBetaEpic8574);
        return frostHunterOnItemLongClickListenerShadowCyberAurora6495;
    }

    public static final String FrostHunterMeteringPointBetaCyber9571(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static FrostHunterTraceCelestialVortexSpark6705 FrostHunterMeteringPointMegaCyber7955(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        frostHunterTraceCelestialVortexSpark6705.getClass();
        FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351 = frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterViewBindingCelestialVortex7351 ? (FrostHunterViewBindingCelestialVortex7351) frostHunterTraceCelestialVortexSpark6705 : null;
        if (frostHunterViewBindingCelestialVortex7351 == null || (frostHunterTraceCelestialVortexSpark6705 = frostHunterViewBindingCelestialVortex7351.FrostHunterAlertDialogAuroraDelta3200) != null) {
            return frostHunterTraceCelestialVortexSpark6705;
        }
        FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212 = (FrostHunterResourceThunderSolarForce1212) frostHunterViewBindingCelestialVortex7351.getContext().FrostHunterKeyframeGammaGamma1197(FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterAlertDialogAuroraDelta3200);
        FrostHunterTraceCelestialVortexSpark6705 frostHunterFlowOnUltraInfernoThunder4489 = frostHunterResourceThunderSolarForce1212 != null ? new FrostHunterFlowOnUltraInfernoThunder4489(frostHunterResourceThunderSolarForce1212, frostHunterViewBindingCelestialVortex7351) : frostHunterViewBindingCelestialVortex7351;
        frostHunterViewBindingCelestialVortex7351.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFlowOnUltraInfernoThunder4489;
        return frostHunterFlowOnUltraInfernoThunder4489;
    }

    public static final FrostHunterFragmentTitaniumVortexTurbo6559 FrostHunterMotionSceneAuroraMega2271(FrostHunterFragmentTitaniumVortexTurbo6559 frostHunterFragmentTitaniumVortexTurbo6559) {
        return frostHunterFragmentTitaniumVortexTurbo6559 instanceof FrostHunterPaintFlagsDrawFilterStrikeGammaHero6122 ? frostHunterFragmentTitaniumVortexTurbo6559 : frostHunterFragmentTitaniumVortexTurbo6559 instanceof FrostHunterAsyncTaskForceCelestialBlaze3352 ? frostHunterFragmentTitaniumVortexTurbo6559 : new FrostHunterAsyncTaskForceCelestialBlaze3352(frostHunterFragmentTitaniumVortexTurbo6559);
    }

    public static boolean FrostHunterNavigationMasterMegaMax2752(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean FrostHunterPagingDataTurboTitanium7332(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static ArrayList FrostHunterPagingSourceEclipseDelta8255(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = asReadOnlyBuffer.get();
                        remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new FrostHunterPagingDeltaMegaSpeed3833(i, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static FrostHunterRoomUltraForce5592 FrostHunterPermissionInfoAlphaDelta6279(int i, FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        FrostHunterRoomUltraForce5592 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterRoomUltraForce5592.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPreviewNeoBeta3393, frostHunterLicensingSpectraPulse8868);
        while (true) {
            int i2 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i2 == i) {
                return FrostHunterAlphaAnimationNeoCosmos57612;
            }
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Ignoring unknown WAV chunk: ", i2);
            long j = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw FrostHunterDiffUtilTurboSpark8131.FrostHunterConstraintSetCloneMasterUltraRogue2633("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            frostHunterPreviewNeoBeta3393.FrostHunterAlertDialogAuroraDelta3200((int) j2);
            FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterRoomUltraForce5592.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPreviewNeoBeta3393, frostHunterLicensingSpectraPulse8868);
        }
    }

    public static Object FrostHunterPreviewBlazeAurora1020(FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, Object obj, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        frostHunterFontFamilyNeoBetaEpic8574.getClass();
        FrostHunterCountDownTimerRogueTitan5615 context = frostHunterTraceCelestialVortexSpark6705.getContext();
        Object frostHunterPagingSourceForceUltraMaster5356 = context == FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814 ? new FrostHunterPagingSourceForceUltraMaster5356(frostHunterTraceCelestialVortexSpark6705) : new FrostHunterStateListAnimatorEclipseTurboPhoenix7130(frostHunterTraceCelestialVortexSpark6705, context);
        FrostHunterCanvasInfernoVortex4700.FrostHunterLightSensorForceFusion4241(2, frostHunterFontFamilyNeoBetaEpic8574);
        return frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(obj, frostHunterPagingSourceForceUltraMaster5356);
    }

    public static final int FrostHunterPushNotificationStormTitanGamma8999(FrostHunterAuthNovaPulse2006 frostHunterAuthNovaPulse2006) {
        int FrostHunterConstraintSetCloneMasterUltraRogue26332;
        int i = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int FrostHunterConstraintSetCloneMasterUltraRogue26333 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(0);
        while (frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633 != 0 && frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(0) == FrostHunterConstraintSetCloneMasterUltraRogue26333) {
            int i2 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i2 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(0, frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761[i2 - 1]);
            frostHunterAuthNovaPulse2006.FrostHunterBundlePulseFusionHero2475(frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1);
            int i3 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int FrostHunterConstraintSetCloneMasterUltraRogue26334 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int FrostHunterConstraintSetCloneMasterUltraRogue26335 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(i7);
                if (i6 >= i3 || (FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633(i6)) <= FrostHunterConstraintSetCloneMasterUltraRogue26335) {
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26335 > FrostHunterConstraintSetCloneMasterUltraRogue26334) {
                        frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i5, FrostHunterConstraintSetCloneMasterUltraRogue26335);
                        frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i7, FrostHunterConstraintSetCloneMasterUltraRogue26334);
                        i5 = i7;
                    }
                } else if (FrostHunterConstraintSetCloneMasterUltraRogue26332 > FrostHunterConstraintSetCloneMasterUltraRogue26334) {
                    frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i5, FrostHunterConstraintSetCloneMasterUltraRogue26332);
                    frostHunterAuthNovaPulse2006.FrostHunterServiceEliteCelestialThunder1757(i6, FrostHunterConstraintSetCloneMasterUltraRogue26334);
                    i5 = i6;
                }
            }
        }
        return FrostHunterConstraintSetCloneMasterUltraRogue26333;
    }

    public static final Object FrostHunterR8MasterNebulaSpark7247(Object[] objArr, FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        Object[] objArr2;
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue58922;
        final Object obj;
        Object FrostHunterConstraintSetCloneMasterUltraRogue26332;
        long j = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752;
        FrostHunterVectorDrawableForceMax1351.FrostHunterFragmentBetaMegaVortex6025(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        final FrostHunterInterstitialAdMaxOlympian1405 frostHunterInterstitialAdMaxOlympian1405 = (FrostHunterInterstitialAdMaxOlympian1405) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterOnItemLongClickListenerSpectraPhoenix9180.FrostHunterAlphaAnimationNeoCosmos5761);
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        Object obj2 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterMagnetometerFusionTitanium8202 == obj2) {
            Object FrostHunterAlphaAnimationNeoCosmos57612 = (frostHunterInterstitialAdMaxOlympian1405 == null || (FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterInterstitialAdMaxOlympian1405.FrostHunterConstraintSetCloneMasterUltraRogue2633(l)) == null) ? null : ((FrostHunterCombineLegendMegaPrime5473) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332);
            if (FrostHunterAlphaAnimationNeoCosmos57612 == null) {
                FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            objArr2 = objArr;
            frostHunterKotlinQuantumRogue58922 = frostHunterKotlinQuantumRogue5892;
            Object frostHunterVibratorOmegaSpeed8811 = new FrostHunterVibratorOmegaSpeed8811(frostHunterKotlinQuantumRogue58922, frostHunterInterstitialAdMaxOlympian1405, l, FrostHunterAlphaAnimationNeoCosmos57612, objArr2);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterVibratorOmegaSpeed8811);
            FrostHunterMagnetometerFusionTitanium8202 = frostHunterVibratorOmegaSpeed8811;
        } else {
            objArr2 = objArr;
            frostHunterKotlinQuantumRogue58922 = frostHunterKotlinQuantumRogue5892;
        }
        final FrostHunterVibratorOmegaSpeed8811 frostHunterVibratorOmegaSpeed88112 = (FrostHunterVibratorOmegaSpeed8811) FrostHunterMagnetometerFusionTitanium8202;
        Object obj3 = Arrays.equals(objArr2, frostHunterVibratorOmegaSpeed88112.FrostHunterFragmentBetaMegaVortex6025) ? frostHunterVibratorOmegaSpeed88112.FrostHunterKeyframeGammaGamma1197 : null;
        if (obj3 == null) {
            obj3 = frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVibratorOmegaSpeed88112) | ((((i & 112) ^ 48) > 32 && frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterKotlinQuantumRogue58922)) || (i & 48) == 32) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterInterstitialAdMaxOlympian1405) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(l) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj3) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(objArr2);
        Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium82022 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue58923 = frostHunterKotlinQuantumRogue58922;
            Object obj4 = new FrostHunterNotificationGammaBlazePhoenix7595() { // from class: android.content.Context.FrostHunterFragmentEliteCosmosHyper9860
                @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
                public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
                    boolean z;
                    FrostHunterVibratorOmegaSpeed8811 frostHunterVibratorOmegaSpeed88113 = FrostHunterVibratorOmegaSpeed8811.this;
                    FrostHunterInterstitialAdMaxOlympian1405 frostHunterInterstitialAdMaxOlympian14052 = frostHunterVibratorOmegaSpeed88113.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterInterstitialAdMaxOlympian1405 frostHunterInterstitialAdMaxOlympian14053 = frostHunterInterstitialAdMaxOlympian1405;
                    boolean z2 = true;
                    if (frostHunterInterstitialAdMaxOlympian14052 != frostHunterInterstitialAdMaxOlympian14053) {
                        frostHunterVibratorOmegaSpeed88113.FrostHunterFlowMaxDragonHero5809 = frostHunterInterstitialAdMaxOlympian14053;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = frostHunterVibratorOmegaSpeed88113.FrostHunterAlertDialogAuroraDelta3200;
                    String str2 = l;
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, str2)) {
                        z2 = z;
                    } else {
                        frostHunterVibratorOmegaSpeed88113.FrostHunterAlertDialogAuroraDelta3200 = str2;
                    }
                    frostHunterVibratorOmegaSpeed88113.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterKotlinQuantumRogue58923;
                    frostHunterVibratorOmegaSpeed88113.FrostHunterKeyframeGammaGamma1197 = obj;
                    frostHunterVibratorOmegaSpeed88113.FrostHunterFragmentBetaMegaVortex6025 = objArr3;
                    FrostHunterRoomEliteInferno4871 frostHunterRoomEliteInferno4871 = frostHunterVibratorOmegaSpeed88113.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (frostHunterRoomEliteInferno4871 != null && z2) {
                        ((FrostHunterServicePhantomGammaTitan7103) frostHunterRoomEliteInferno4871).FrostHunterResourcesTitanHyperVision5823();
                        frostHunterVibratorOmegaSpeed88113.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
                        frostHunterVibratorOmegaSpeed88113.FrostHunterAlphaAnimationNeoCosmos5761();
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(obj4);
            FrostHunterMagnetometerFusionTitanium82022 = obj4;
        } else {
            obj = obj3;
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809((FrostHunterNotificationGammaBlazePhoenix7595) FrostHunterMagnetometerFusionTitanium82022, frostHunterDialogFragmentPhantomEclipse8068);
        return obj;
    }

    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterModelInputOutputEliteHyperForce8871 frostHunterModelInputOutputEliteHyperForce8871) {
        FrostHunterModelInputOutputEliteHyperForce8871 FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterModelInputOutputEliteHyperForce8871.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        return FrostHunterServiceConnectionTurboPhoenixOmega6719 != null ? FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterModelInputOutputEliteHyperForce8871, true) : new FrostHunterBarrierThunderHyperion9659(0.0f, 0.0f, (int) (frostHunterModelInputOutputEliteHyperForce8871.FrostHunterCardViewSpectraCyber7714() >> 32), (int) (frostHunterModelInputOutputEliteHyperForce8871.FrostHunterCardViewSpectraCyber7714() & 4294967295L));
    }

    public static void FrostHunterRemoteConfigThunderShadow4435(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static FrostHunterStateFlowCosmosTurboPhantom3869 FrostHunterResourcesTitanHyperVision5823(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            FrostHunterStateFlowCosmosTurboPhantom3869 frostHunterStateFlowCosmosTurboPhantom3869 = new FrostHunterStateFlowCosmosTurboPhantom3869();
            new LinkedHashMap();
            frostHunterStateFlowCosmosTurboPhantom3869.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterOnItemLongClickListenerRogueDeltaStrike7658(FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814);
            return frostHunterStateFlowCosmosTurboPhantom3869;
        }
        ClassLoader classLoader = FrostHunterStateFlowCosmosTurboPhantom3869.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        FrostHunterViewTurboHyperion7821 frostHunterViewTurboHyperion7821 = new FrostHunterViewTurboHyperion7821(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            frostHunterViewTurboHyperion7821.put(str, bundle.get(str));
        }
        frostHunterViewTurboHyperion7821.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        frostHunterViewTurboHyperion7821.FrostHunterTextViewDragonStormMega4297 = true;
        if (frostHunterViewTurboHyperion7821.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 <= 0) {
            frostHunterViewTurboHyperion7821 = FrostHunterViewTurboHyperion7821.FrostHunterLooperThreadBetaHyperionMax1000;
            frostHunterViewTurboHyperion7821.getClass();
        }
        FrostHunterStateFlowCosmosTurboPhantom3869 frostHunterStateFlowCosmosTurboPhantom38692 = new FrostHunterStateFlowCosmosTurboPhantom3869();
        new LinkedHashMap();
        frostHunterStateFlowCosmosTurboPhantom38692.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterOnItemLongClickListenerRogueDeltaStrike7658(frostHunterViewTurboHyperion7821);
        return frostHunterStateFlowCosmosTurboPhantom38692;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        FrostHunterRemoteConfigThunderShadow4435(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = FrostHunterStateCelestialNovaPixel8414(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterRewardedAdMasterStrike9463(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int FrostHunterPreviewBlazeAurora1020 = FrostHunterCanvasInfernoVortex4700.FrostHunterPreviewBlazeAurora1020(obj);
        int i2 = FrostHunterPreviewBlazeAurora1020 & i;
        int FrostHunterRewardedAdSpectraElite8288 = FrostHunterRewardedAdSpectraElite8288(i2, obj3);
        if (FrostHunterRewardedAdSpectraElite8288 != 0) {
            int i3 = ~i;
            int i4 = FrostHunterPreviewBlazeAurora1020 & i3;
            int i5 = -1;
            while (true) {
                int i6 = FrostHunterRewardedAdSpectraElite8288 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(obj, objArr[i6]) || (objArr2 != null && !FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    FrostHunterRewardedAdSpectraElite8288 = i8;
                }
            }
        }
        return -1;
    }

    public static int FrostHunterRewardedAdSpectraElite8288(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static final Object FrostHunterScaleAnimationStrikeSpark5059(FrostHunterFragmentTitaniumVortexTurbo6559 frostHunterFragmentTitaniumVortexTurbo6559, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterShapeDrawablePhantomMasterGamma8047 frostHunterShapeDrawablePhantomMasterGamma8047) {
        int i = FrostHunterResourcesShadowTurbo2021.FrostHunterAlphaAnimationNeoCosmos5761;
        Object FrostHunterAlertDialogAuroraDelta32002 = FrostHunterFlowMaxDragonHero5809(new FrostHunterNotificationPhoenixUltraThunder9738(new FrostHunterOnItemClickListenerBlazeEliteBlaze2614(frostHunterFontFamilyNeoBetaEpic8574, null), frostHunterFragmentTitaniumVortexTurbo6559, FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814, -2, FrostHunterPagingEclipseDragonInferno8878.FrostHunterCameraXPixelTurboCosmos9814), 0).FrostHunterAlertDialogAuroraDelta3200(FrostHunterRotateDrawableStrikePixel1391.FrostHunterCameraXPixelTurboCosmos9814, frostHunterShapeDrawablePhantomMasterGamma8047);
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
        if (FrostHunterAlertDialogAuroraDelta32002 != frostHunterAuthMasterNovaXMax8430) {
            FrostHunterAlertDialogAuroraDelta32002 = frostHunterLinearLayoutSolarHero7990;
        }
        return FrostHunterAlertDialogAuroraDelta32002 == frostHunterAuthMasterNovaXMax8430 ? FrostHunterAlertDialogAuroraDelta32002 : frostHunterLinearLayoutSolarHero7990;
    }

    public static final void FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterKeyframeGammaGamma1197("fromIndex: ", i, ", toIndex: ", i2, i3);
        } else {
            if (i <= i2) {
                return;
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static FrostHunterVectorDrawableCompatStormPhoenixElite6271 FrostHunterServiceEliteCelestialThunder1757(String str, FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284, long j, FrostHunterProGuardDragonDelta7682 frostHunterProGuardDragonDelta7682, FrostHunterNotificationManagerHeroNova8010 frostHunterNotificationManagerHeroNova8010, int i) {
        FrostHunterAssetManagerForceNebulaNebula4990 frostHunterAssetManagerForceNebulaNebula4990 = FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        return new FrostHunterVectorDrawableCompatStormPhoenixElite6271(new FrostHunterColorDrawableRogueTitanium9596(str, frostHunterFragmentManagerFusionNovaDragon6284, frostHunterAssetManagerForceNebulaNebula4990, frostHunterAssetManagerForceNebulaNebula4990, frostHunterNotificationManagerHeroNova8010, frostHunterProGuardDragonDelta7682), i, 1, j);
    }

    public static synchronized Executor FrostHunterServiceInfoHyperionSparkMax9966() {
        ExecutorService executorService;
        synchronized (FrostHunterPaintCyberPulse5979.class) {
            try {
                if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                    String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterAlphaAnimationNeoCosmos5761 = Executors.newSingleThreadExecutor(new FrostHunterInterpolatorVortexOlympian7007("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = FrostHunterAlphaAnimationNeoCosmos5761;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static int FrostHunterStateCelestialNovaPixel8414(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static Object FrostHunterTextViewDragonStormMega4297(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("must be power of 2 between 2^1 and 2^30: ", i));
        return null;
    }

    public static final FrostHunterRoomTitanSpark1255 FrostHunterTransitionListenerPulseVortexCosmos7949(FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565, FrostHunterContentObserverShadowShadow6344 frostHunterContentObserverShadowShadow6344, FrostHunterPermissionQuantumElite1956 frostHunterPermissionQuantumElite1956, Float f) {
        FrostHunterBundleMaxNovaXVortex6982.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        FrostHunterLiveDataScopeLegendStrikeGamma5301 frostHunterLiveDataScopeLegendStrikeGamma5301 = FrostHunterLiveDataScopeLegendStrikeGamma5301.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(26, frostHunterAnimatorQuantumFusionMaster8565, FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814);
        FrostHunterPreviewPixelBetaQuantum7840 FrostHunterBundlePulseFusionHero24752 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBundlePulseFusionHero2475(f);
        FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterContentObserverShadowShadow6344, (FrostHunterCountDownTimerRogueTitan5615) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809, frostHunterPermissionQuantumElite1956.equals(FrostHunterTypefaceCelestialTitanium6534.FrostHunterAlphaAnimationNeoCosmos5761) ? FrostHunterInsetDrawableFusionThunder3299.FrostHunterCameraXPixelTurboCosmos9814 : FrostHunterInsetDrawableFusionThunder3299.FrostHunterKeyframeGammaGamma1197, new FrostHunterRealtimeDatabaseFusionStrike9318(frostHunterPermissionQuantumElite1956, (FrostHunterFragmentTitaniumVortexTurbo6559) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200, FrostHunterBundlePulseFusionHero24752, f, null, 4));
        return new FrostHunterRoomTitanSpark1255(FrostHunterBundlePulseFusionHero24752);
    }

    public static /* synthetic */ FrostHunterPagingSparkCosmos2306 FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterViewModelScopeSparkBlaze1575 frostHunterViewModelScopeSparkBlaze1575, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, int i) {
        if ((i & 1) != 0) {
            frostHunterCountDownTimerRogueTitan5615 = FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
        }
        return FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterViewModelScopeSparkBlaze1575, frostHunterCountDownTimerRogueTitan5615, (i & 2) != 0 ? FrostHunterInsetDrawableFusionThunder3299.FrostHunterCameraXPixelTurboCosmos9814 : FrostHunterInsetDrawableFusionThunder3299.FrostHunterKeyframeGammaGamma1197, frostHunterFontFamilyNeoBetaEpic8574);
    }

    public static int FrostHunterViewPhantomNeo1634(FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949) {
        int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(4);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == 15) {
            if (frostHunterCountDownTimerStormPulseFusion5949.FrostHunterConstraintSetCloneMasterUltraRogue2633() >= 24) {
                return frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(24);
            }
            throw FrostHunterDiffUtilTurboSpark8131.FrostHunterAlphaAnimationNeoCosmos5761(null, "AAC header insufficient data");
        }
        if (FrostHunterRemoteConfigSpeedSpeed85662 < 13) {
            return FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterRemoteConfigSpeedSpeed85662];
        }
        throw FrostHunterDiffUtilTurboSpark8131.FrostHunterAlphaAnimationNeoCosmos5761(null, "AAC header wrong Sampling Frequency Index");
    }

    public abstract Object FrostHunterEditTextPulseHyperion1262(FrostHunterShapeDrawableSpectraGammaEclipse4714 frostHunterShapeDrawableSpectraGammaEclipse4714);

    public abstract boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterShapeDrawableSpectraGammaEclipse4714 frostHunterShapeDrawableSpectraGammaEclipse4714);
}
