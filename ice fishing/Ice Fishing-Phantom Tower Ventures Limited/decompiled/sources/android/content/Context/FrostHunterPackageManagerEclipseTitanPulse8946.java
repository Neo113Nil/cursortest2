package android.content.Context;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPackageManagerEclipseTitanPulse8946 implements Handler.Callback, FrostHunterCameraHyperionSparkNova6520, FrostHunterInstrumentationDragonOmega6403 {
    public static final long FrostHunterSharedElementPixelTitan2806 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(10000);
    public final boolean[] FrostHunterAlertDialogAuroraDelta3200;
    public boolean FrostHunterAlphaAnimationNovaGamma6326;
    public final FrostHunterManifestPulseSolarHero2561 FrostHunterBillingClientFusionVortex9008;
    public final FrostHunterAssetManagerQuantumRogue9837 FrostHunterBitmapTurboDeltaNebula8743;
    public final FrostHunterPaintAuroraNovaXPulse1290[] FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterGyroscopeBetaVisionInferno6797 FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterDispatchersBetaNova8419 FrostHunterCardViewSpectraCyber7714;
    public int FrostHunterColorDrawableLegendPhoenixVision7927;
    public boolean FrostHunterColorStateListInflaterNovaQuantum4229;
    public int FrostHunterColorStateListMegaBetaFusion7423;
    public int FrostHunterConstraintSetCloneOmegaHyperion9304;
    public final FrostHunterToolbarPixelHyperion1536 FrostHunterDatabaseEliteShadowUltra2452;
    public final FrostHunterViewPager2DeltaThunder2760 FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public final long FrostHunterEditTextPulseHyperion1262;
    public int FrostHunterFCMDeltaQuantumHero8364;
    public final FrostHunterCardViewFusionHeroSpectra3749 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterFaceDetectionPixelFusionBlaze5291[] FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterSurfaceViewPhantomHyperion3032 FrostHunterFragmentBetaMegaVortex6025;
    public FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 FrostHunterImageAnalysisGammaOlympian2400;
    public final FrostHunterLiveDataScopeShadowCelestialMax5831 FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterDisplayMetricsSpeedOmegaHyperion6555 FrostHunterLightSensorForceFusion4241;
    public final Looper FrostHunterLintTitanVortexQuantum9911;
    public FrostHunterAnimatorSetEliteHyper3417 FrostHunterLiveDataBetaLegend3442;
    public final FrostHunterLooperThreadOlympianAurora4719 FrostHunterLooperHyperionForce4133;
    public final FrostHunterPreviewOlympianBeta7981 FrostHunterLooperThreadBetaHyperionMax1000;
    public boolean FrostHunterMagnetometerFusionTitanium8202;
    public final boolean FrostHunterMediaPlayerCelestialBetaTitan3868;
    public final FrostHunterModelInputOutputStrikePrime1569 FrostHunterMeteringPointBetaCyber9571;
    public final boolean FrostHunterMeteringPointMegaCyber7955;
    public final ArrayList FrostHunterMotionSceneAuroraMega2271;
    public boolean FrostHunterNestedScrollViewPixelPhantom8605;
    public long FrostHunterNestedScrollViewThunderNovaX6772;
    public boolean FrostHunterPagingDataTurboTitanium7332;
    public boolean FrostHunterPagingSourceEclipseDelta8255;
    public FrostHunterLinearLayoutRoguePrime1122 FrostHunterPermissionInfoAlphaDelta6279;
    public boolean FrostHunterPreviewBlazeAurora1020;
    public boolean FrostHunterPushNotificationStormTitanGamma8999;
    public FrostHunterAnimatorSetEliteHyper3417 FrostHunterR8MasterNebulaSpark7247;
    public final FrostHunterRoomEntityFusionQuantumFusion6361 FrostHunterResourcesTitanHyperVision5823;
    public FrostHunterVelocityTrackerPrimePulse4533 FrostHunterRewardedAdMasterStrike9463;
    public boolean FrostHunterRewardedAdSpectraElite8288;
    public boolean FrostHunterRunnableCosmosCelestial4235;
    public final FrostHunterRotateDrawableMaxPrime8918 FrostHunterScaleAnimationStrikeSpark5059;
    public final FrostHunterMeteringPointEclipseTitan1504 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterModelInputOutputNebulaPhantom1071 FrostHunterServiceInfoHyperionSparkMax9966;
    public long FrostHunterSoundPoolNovaTitanTitan5784;
    public final long FrostHunterTextViewDragonStormMega4297;
    public boolean FrostHunterTransitionListenerPulseVortexCosmos7949;
    public FrostHunterColorDrawableSpeedAurora7439 FrostHunterTranslateAnimationCyberSolarUltra7101;
    public FrostHunterRoomDaoSpectraPixelGamma1835 FrostHunterViewPager2StrikePulse8790;
    public final FrostHunterRotateDrawableMaxPrime8918 FrostHunterViewPhantomNeo1634;
    public long FrostHunterPlaceholderLegendForceNebula9869 = -9223372036854775807L;
    public boolean FrostHunterAnnotationProcessorSparkEclipse8710 = false;
    public boolean FrostHunterNavigationMasterMegaMax2752 = false;
    public float FrostHunterNavigationViewMasterVortexBeta1295 = 1.0f;
    public FrostHunterSupervisorJobBetaMasterNeo7868 FrostHunterStateCelestialNovaPixel8414 = FrostHunterSupervisorJobBetaMasterNeo7868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public long FrostHunterInAppPurchaseLegendEpicDragon4579 = -9223372036854775807L;
    public long FrostHunterRemoteConfigThunderShadow4435 = -9223372036854775807L;

    public FrostHunterPackageManagerEclipseTitanPulse8946(Context context, FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr, FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr2, FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831, FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032, FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504, FrostHunterDisplayMetricsSpeedOmegaHyperion6555 frostHunterDisplayMetricsSpeedOmegaHyperion6555, int i, FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419, FrostHunterColorDrawableSpeedAurora7439 frostHunterColorDrawableSpeedAurora7439, FrostHunterModelInputOutputNebulaPhantom1071 frostHunterModelInputOutputNebulaPhantom1071, long j, Looper looper, FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837, FrostHunterViewPager2DeltaThunder2760 frostHunterViewPager2DeltaThunder2760, FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536, FrostHunterRoomDaoSpectraPixelGamma1835 frostHunterRoomDaoSpectraPixelGamma1835, final FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega6403, boolean z) {
        Looper looper2;
        this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterViewPager2DeltaThunder2760;
        this.FrostHunterKeyframeGammaGamma1197 = frostHunterLiveDataScopeShadowCelestialMax5831;
        this.FrostHunterFragmentBetaMegaVortex6025 = frostHunterSurfaceViewPhantomHyperion3032;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterMeteringPointEclipseTitan1504;
        this.FrostHunterLightSensorForceFusion4241 = frostHunterDisplayMetricsSpeedOmegaHyperion6555;
        this.FrostHunterConstraintSetCloneOmegaHyperion9304 = i;
        boolean z2 = false;
        this.FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterColorDrawableSpeedAurora7439;
        this.FrostHunterServiceInfoHyperionSparkMax9966 = frostHunterModelInputOutputNebulaPhantom1071;
        this.FrostHunterEditTextPulseHyperion1262 = j;
        this.FrostHunterBitmapTurboDeltaNebula8743 = frostHunterAssetManagerQuantumRogue9837;
        this.FrostHunterDatabaseEliteShadowUltra2452 = frostHunterToolbarPixelHyperion1536;
        this.FrostHunterViewPager2StrikePulse8790 = frostHunterRoomDaoSpectraPixelGamma1835;
        this.FrostHunterCardViewSpectraCyber7714 = frostHunterDispatchersBetaNova8419;
        this.FrostHunterMediaPlayerCelestialBetaTitan3868 = z;
        this.FrostHunterTextViewDragonStormMega4297 = frostHunterMeteringPointEclipseTitan1504.FrostHunterLightSensorForceFusion4241;
        FrostHunterMLKitEliteSpeed3980 frostHunterMLKitEliteSpeed3980 = FrostHunterStrictModeNebulaEliteHyper7105.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200(frostHunterSurfaceViewPhantomHyperion3032);
        this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterAlertDialogAuroraDelta3200;
        this.FrostHunterPermissionInfoAlphaDelta6279 = new FrostHunterLinearLayoutRoguePrime1122(FrostHunterAlertDialogAuroraDelta3200);
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterFaceDetectionPixelFusionBlaze5291[frostHunterFaceDetectionPixelFusionBlaze5291Arr.length];
        this.FrostHunterAlertDialogAuroraDelta3200 = new boolean[frostHunterFaceDetectionPixelFusionBlaze5291Arr.length];
        frostHunterLiveDataScopeShadowCelestialMax5831.getClass();
        this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterPaintAuroraNovaXPulse1290[frostHunterFaceDetectionPixelFusionBlaze5291Arr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < frostHunterFaceDetectionPixelFusionBlaze5291Arr.length; i2++) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterFaceDetectionPixelFusionBlaze5291Arr[i2];
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFragmentBetaMegaVortex6025 = i2;
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterToolbarPixelHyperion1536;
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLightSensorForceFusion4241 = frostHunterAssetManagerQuantumRogue9837;
            this.FrostHunterFlowMaxDragonHero5809[i2] = frostHunterFaceDetectionPixelFusionBlaze5291;
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = this.FrostHunterFlowMaxDragonHero5809[i2];
            synchronized (frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterCameraXPixelTurboCosmos9814) {
                frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterLooperHyperionForce4133 = frostHunterLiveDataScopeShadowCelestialMax5831;
            }
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52913 = frostHunterFaceDetectionPixelFusionBlaze5291Arr2[i2];
            if (frostHunterFaceDetectionPixelFusionBlaze52913 != null) {
                frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterFragmentBetaMegaVortex6025 = i2;
                frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterToolbarPixelHyperion1536;
                frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterLightSensorForceFusion4241 = frostHunterAssetManagerQuantumRogue9837;
                z3 = true;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814[i2] = new FrostHunterPaintAuroraNovaXPulse1290(frostHunterFaceDetectionPixelFusionBlaze5291Arr[i2], frostHunterFaceDetectionPixelFusionBlaze52913, i2);
        }
        this.FrostHunterMeteringPointMegaCyber7955 = z3;
        this.FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterPreviewOlympianBeta7981(this, frostHunterAssetManagerQuantumRogue9837);
        this.FrostHunterMotionSceneAuroraMega2271 = new ArrayList();
        this.FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterGyroscopeBetaVisionInferno6797();
        this.FrostHunterResourcesTitanHyperVision5823 = new FrostHunterRoomEntityFusionQuantumFusion6361();
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterAlphaAnimationNeoCosmos5761 == null);
        frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterAlphaAnimationNeoCosmos5761 = this;
        frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterDisplayMetricsSpeedOmegaHyperion6555;
        this.FrostHunterNestedScrollViewPixelPhantom8605 = true;
        FrostHunterRotateDrawableMaxPrime8918 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterAssetManagerQuantumRogue9837.FrostHunterAlphaAnimationNeoCosmos5761(looper, null);
        this.FrostHunterViewPhantomNeo1634 = FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterLooperHyperionForce4133 = new FrostHunterLooperThreadOlympianAurora4719(frostHunterDispatchersBetaNova8419, FrostHunterAlphaAnimationNeoCosmos5761, new FrostHunterRippleDrawableMaxElite5227(13, this), frostHunterRoomDaoSpectraPixelGamma1835);
        this.FrostHunterMeteringPointBetaCyber9571 = new FrostHunterModelInputOutputStrikePrime1569(this, frostHunterDispatchersBetaNova8419, FrostHunterAlphaAnimationNeoCosmos5761, frostHunterToolbarPixelHyperion1536);
        FrostHunterCardViewFusionHeroSpectra3749 frostHunterCardViewFusionHeroSpectra3749 = new FrostHunterCardViewFusionHeroSpectra3749();
        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterCardViewFusionHeroSpectra3749;
        synchronized (frostHunterCardViewFusionHeroSpectra3749.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            try {
                if (((Looper) frostHunterCardViewFusionHeroSpectra3749.FrostHunterBundlePulseFusionHero2475) == null) {
                    if (frostHunterCardViewFusionHeroSpectra3749.FrostHunterAlphaAnimationNeoCosmos5761 == 0 && ((HandlerThread) frostHunterCardViewFusionHeroSpectra3749.FrostHunterServiceEliteCelestialThunder1757) == null) {
                        z2 = true;
                    }
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    frostHunterCardViewFusionHeroSpectra3749.FrostHunterServiceEliteCelestialThunder1757 = handlerThread;
                    handlerThread.start();
                    frostHunterCardViewFusionHeroSpectra3749.FrostHunterBundlePulseFusionHero2475 = ((HandlerThread) frostHunterCardViewFusionHeroSpectra3749.FrostHunterServiceEliteCelestialThunder1757).getLooper();
                }
                frostHunterCardViewFusionHeroSpectra3749.FrostHunterAlphaAnimationNeoCosmos5761++;
                looper2 = (Looper) frostHunterCardViewFusionHeroSpectra3749.FrostHunterBundlePulseFusionHero2475;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.FrostHunterLintTitanVortexQuantum9911 = looper2;
        FrostHunterRotateDrawableMaxPrime8918 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterAssetManagerQuantumRogue9837.FrostHunterAlphaAnimationNeoCosmos5761(looper2, this);
        this.FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterAlphaAnimationNeoCosmos57612;
        this.FrostHunterBillingClientFusionVortex9008 = new FrostHunterManifestPulseSolarHero2561(context, looper2, this);
        FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633(35, new FrostHunterInstrumentationDragonOmega6403() { // from class: android.content.Context.FrostHunterViewPagerDragonBeta3625
            @Override // android.content.Context.FrostHunterInstrumentationDragonOmega6403
            public final void FrostHunterAlphaAnimationNeoCosmos5761(long j2, long j3, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaFormat mediaFormat) {
                frostHunterInstrumentationDragonOmega6403.FrostHunterAlphaAnimationNeoCosmos5761(j2, j3, frostHunterFirebaseOlympianMax4818, mediaFormat);
                FrostHunterPackageManagerEclipseTitanPulse8946.this.FrostHunterAlphaAnimationNeoCosmos5761(j2, j3, frostHunterFirebaseOlympianMax4818, mediaFormat);
            }
        }).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterConstraintSetCloneMasterUltraRogue2633(39, new FrostHunterMotionSceneHyperShadow8814(this)).FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public static boolean FrostHunterMeteringPointBetaCyber9571(FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601) {
        if (frostHunterInsetDrawableCelestialEclipse3601 != null) {
            try {
                FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
                    for (FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterBundlePulseFusionHero2475) {
                        if (frostHunterOnItemLongClickListenerNovaXTitan1242 != null) {
                            frostHunterOnItemLongClickListenerNovaXTitan1242.FrostHunterLifecycleBlazeGammaElite2889();
                        }
                    }
                } else {
                    frostHunterDrawableDeltaLegend6817.FrostHunterAlertDialogAuroraDelta3200();
                }
                if ((!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889 ? 0L : frostHunterDrawableDeltaLegend6817.FrostHunterLifecycleBlazeGammaElite2889()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int FrostHunterRewardedAdSpectraElite8288(FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797, FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361, int i, boolean z, Object obj, FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052) {
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno67972 = frostHunterGyroscopeBetaVisionInferno6797;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper7105;
        Object obj2 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761;
        for (int i2 = 0; i2 < frostHunterStrictModeNebulaEliteHyper71052.FrostHunterScaleAnimationStrikeSpark5059(); i2++) {
            if (frostHunterStrictModeNebulaEliteHyper71052.FrostHunterServiceConnectionTurboPhoenixOmega6719(i2, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761.equals(obj2)) {
                return i2;
            }
        }
        int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterConstraintSetCloneMasterUltraRogue2633(obj);
        int FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterCameraXPixelTurboCosmos9814();
        int i3 = -1;
        int i4 = 0;
        while (i4 < FrostHunterCameraXPixelTurboCosmos9814 && i3 == -1) {
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71054 = frostHunterStrictModeNebulaEliteHyper71053;
            int FrostHunterServiceEliteCelestialThunder1757 = frostHunterStrictModeNebulaEliteHyper71054.FrostHunterServiceEliteCelestialThunder1757(FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterRoomEntityFusionQuantumFusion6361, frostHunterGyroscopeBetaVisionInferno67972, i, z);
            if (FrostHunterServiceEliteCelestialThunder1757 == -1) {
                break;
            }
            i3 = frostHunterStrictModeNebulaEliteHyper71052.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterStrictModeNebulaEliteHyper71054.FrostHunterFragmentBetaMegaVortex6025(FrostHunterServiceEliteCelestialThunder1757));
            i4++;
            frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71054;
            FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterServiceEliteCelestialThunder1757;
            frostHunterGyroscopeBetaVisionInferno67972 = frostHunterGyroscopeBetaVisionInferno6797;
        }
        if (i3 == -1) {
            return -1;
        }
        return frostHunterStrictModeNebulaEliteHyper71052.FrostHunterLevelListDrawableFusionDragonHero2232(i3, frostHunterRoomEntityFusionQuantumFusion6361, false).FrostHunterBundlePulseFusionHero2475;
    }

    public static Pair FrostHunterTransitionListenerPulseVortexCosmos7949(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper3417, boolean z, int i, boolean z2, FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797, FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361) {
        int FrostHunterRewardedAdSpectraElite8288;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052 = frostHunterAnimatorSetEliteHyper3417.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return null;
        }
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71052.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? frostHunterStrictModeNebulaEliteHyper7105 : frostHunterStrictModeNebulaEliteHyper71052;
        try {
            Pair FrostHunterFlowMaxDragonHero5809 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterFlowMaxDragonHero5809(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion6361, frostHunterAnimatorSetEliteHyper3417.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatorSetEliteHyper3417.FrostHunterBundlePulseFusionHero2475);
            if (!frostHunterStrictModeNebulaEliteHyper7105.equals(frostHunterStrictModeNebulaEliteHyper71053)) {
                if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFlowMaxDragonHero5809.first) == -1) {
                    if (!z || (FrostHunterRewardedAdSpectraElite8288 = FrostHunterRewardedAdSpectraElite8288(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion6361, i, z2, FrostHunterFlowMaxDragonHero5809.first, frostHunterStrictModeNebulaEliteHyper71053, frostHunterStrictModeNebulaEliteHyper7105)) == -1) {
                        return null;
                    }
                    return frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFlowMaxDragonHero5809(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion6361, FrostHunterRewardedAdSpectraElite8288, -9223372036854775807L);
                }
                if (frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero5809.first, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterLevelListDrawableFusionDragonHero2232 && frostHunterStrictModeNebulaEliteHyper71053.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterFragmentBetaMegaVortex6025 == frostHunterStrictModeNebulaEliteHyper71053.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFlowMaxDragonHero5809.first)) {
                    return frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFlowMaxDragonHero5809(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion6361, frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero5809.first, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475, frostHunterAnimatorSetEliteHyper3417.FrostHunterBundlePulseFusionHero2475);
                }
            }
            return FrostHunterFlowMaxDragonHero5809;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0244, code lost:
    
        if (r6 >= r4.FrostHunterBundlePulseFusionHero2475) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterAlertDialogAuroraDelta3200() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        long j2;
        boolean z5;
        int i;
        boolean z6;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533;
        int i2;
        boolean z7;
        this.FrostHunterBitmapTurboDeltaNebula8743.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889(2);
        if (!this.FrostHunterMediaPlayerCelestialBetaTitan3868) {
            FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402();
        }
        int i3 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889;
        if (i3 == 1 || i3 == 4) {
            return;
        }
        if (this.FrostHunterMediaPlayerCelestialBetaTitan3868) {
            FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402();
        }
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
            FrostHunterRemoteConfigThunderShadow4435(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        FrostHunterBannerAdNebulaMasterBeta4389();
        if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
            this.FrostHunterBitmapTurboDeltaNebula8743.getClass();
            this.FrostHunterNestedScrollViewThunderNovaX6772 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(SystemClock.elapsedRealtime());
            frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823 - this.FrostHunterTextViewDragonStormMega4297);
            z = true;
            z2 = true;
            int i4 = 0;
            while (true) {
                FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (i4 >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                    break;
                }
                FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = frostHunterPaintAuroraNovaXPulse1290Arr[i4];
                if (frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475() == 0) {
                    FrostHunterBillingClientFusionVortex9008(i4, false);
                } else {
                    long j3 = this.FrostHunterSoundPoolNovaTitanTitan5784;
                    long j4 = this.FrostHunterNestedScrollViewThunderNovaX6772;
                    FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                    FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52912)) {
                        frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterMeteringPointBetaCyber9571(j3, j4);
                    }
                    if (frostHunterFaceDetectionPixelFusionBlaze5291 != null && frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
                        frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterMeteringPointBetaCyber9571(j3, j4);
                    }
                    if (z) {
                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52913 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52914 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                        boolean FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52914) ? frostHunterFaceDetectionPixelFusionBlaze52914.FrostHunterServiceConnectionTurboPhoenixOmega6719() : true;
                        if (frostHunterFaceDetectionPixelFusionBlaze52913 != null && frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
                            FrostHunterServiceConnectionTurboPhoenixOmega6719 &= frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                        }
                        if (FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                            z = true;
                            FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
                            z7 = FrostHunterServiceEliteCelestialThunder1757 != null || FrostHunterServiceEliteCelestialThunder1757.FrostHunterFragmentBetaMegaVortex6025() || FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059() || FrostHunterServiceEliteCelestialThunder1757.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                            FrostHunterBillingClientFusionVortex9008(i4, z7);
                            z2 = !z2 && z7;
                            if (z7) {
                                FrostHunterMeteringPointMegaCyber7955(i4);
                            }
                        }
                    }
                    z = false;
                    FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder17572 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
                    if (FrostHunterServiceEliteCelestialThunder17572 != null) {
                    }
                    FrostHunterBillingClientFusionVortex9008(i4, z7);
                    if (z2) {
                    }
                    if (z7) {
                    }
                }
                i4++;
            }
        } else {
            frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200();
            z = true;
            z2 = true;
        }
        long j5 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232;
        boolean z8 = z && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889 && (j5 == -9223372036854775807L || j5 <= this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823);
        if (z8 && this.FrostHunterTransitionListenerPulseVortexCosmos7949) {
            this.FrostHunterTransitionListenerPulseVortexCosmos7949 = false;
            int i5 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLightSensorForceFusion4241;
            this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(0);
            FrostHunterObjectAnimatorPhoenixSpectraThunder6218(this.FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889, false), i5, 5, false);
        }
        if (!z8 || !frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
            if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterLifecycleBlazeGammaElite2889 == 2) {
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
                if (this.FrostHunterColorDrawableLegendPhoenixVision7927 == 0) {
                    z5 = FrostHunterEditTextPulseHyperion1262();
                } else if (z2) {
                    if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterRemoteConfigSpeedSpeed8566) {
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809;
                        long j6 = FrostHunterBindingAdapterInfernoFusionForce2284(frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761) ? this.FrostHunterServiceInfoHyperionSparkMax9966.FrostHunterCameraXPixelTurboCosmos9814 : -9223372036854775807L;
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFragmentBetaMegaVortex6025;
                        boolean z9 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterRemoteConfigSpeedSpeed8566() && frostHunterInsetDrawableCelestialEclipse36013.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterKeyframeGammaGamma1197;
                        boolean z10 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633() && !frostHunterInsetDrawableCelestialEclipse36013.FrostHunterLifecycleBlazeGammaElite2889;
                        if (!z9 && !z10) {
                            long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterInsetDrawableCelestialEclipse36013.FrostHunterServiceEliteCelestialThunder1757());
                            FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                            FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
                            j = -9223372036854775807L;
                            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
                            float f = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
                            boolean z11 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFragmentBetaMegaVortex6025;
                            boolean z12 = this.FrostHunterRewardedAdSpectraElite8288;
                            frostHunterMeteringPointEclipseTitan1504.getClass();
                            long j7 = j6;
                            FrostHunterExoPlayerDeltaBlazeStorm6993 frostHunterExoPlayerDeltaBlazeStorm6993 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMeteringPointEclipseTitan1504.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterBundlePulseFusionHero2475, frostHunterMeteringPointEclipseTitan1504.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            if (frostHunterExoPlayerDeltaBlazeStorm6993 != null) {
                                String scheme = frostHunterExoPlayerDeltaBlazeStorm6993.FrostHunterAlphaAnimationNeoCosmos5761.getScheme();
                                if (TextUtils.isEmpty(scheme) || FrostHunterMeteringPointEclipseTitan1504.FrostHunterCameraXTurboCelestialHero5430.contains(scheme)) {
                                    z4 = true;
                                    if (f != 1.0f) {
                                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = Math.round(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 / f);
                                    }
                                    j2 = !z12 ? z4 ? frostHunterMeteringPointEclipseTitan1504.FrostHunterKeyframeGammaGamma1197 : frostHunterMeteringPointEclipseTitan1504.FrostHunterAlertDialogAuroraDelta3200 : z4 ? frostHunterMeteringPointEclipseTitan1504.FrostHunterFlowMaxDragonHero5809 : frostHunterMeteringPointEclipseTitan1504.FrostHunterCameraXPixelTurboCosmos9814;
                                    if (j7 != -9223372036854775807L) {
                                        j2 = Math.min(j7 / 2, j2);
                                    }
                                    if (j2 > 0 && FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 < j2) {
                                        if (!(!z4 ? frostHunterMeteringPointEclipseTitan1504.FrostHunterServiceConnectionTurboPhoenixOmega6719 : false)) {
                                            FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterToolbarPixelHyperion1536);
                                            frostHunterTransformForceShadowSolar6619.getClass();
                                            synchronized (frostHunterTransformForceShadowSolar6619) {
                                                i = frostHunterTransformForceShadowSolar6619.FrostHunterServiceEliteCelestialThunder1757;
                                            }
                                            int i6 = i * frostHunterMeteringPointEclipseTitan1504.FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                            FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar66192 = (FrostHunterTransformForceShadowSolar6619) frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterToolbarPixelHyperion1536);
                                            frostHunterTransformForceShadowSolar66192.getClass();
                                        }
                                        z5 = false;
                                        if (z5) {
                                            FrostHunterSharedElementPixelTitan2806(3);
                                            this.FrostHunterImageAnalysisGammaOlympian2400 = null;
                                            if (FrostHunterViewModelScopeTitanRogue1970()) {
                                                FrostHunterItemDecorationPixelShadow2695(false, false);
                                                FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                                                z3 = true;
                                                frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
                                                frostHunterPreviewOlympianBeta7981.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLevelListDrawableFusionDragonHero2232();
                                                FrostHunterCoordinatorLayoutGammaTurboSpark2420();
                                                if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 2) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                                                        if (i7 >= frostHunterPaintAuroraNovaXPulse1290Arr2.length) {
                                                            break;
                                                        }
                                                        if (frostHunterPaintAuroraNovaXPulse1290Arr2[i7].FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601) != null ? z3 : false) {
                                                            FrostHunterMeteringPointMegaCyber7955(i7);
                                                        }
                                                        i7++;
                                                    }
                                                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
                                                    if (!frostHunterVelocityTrackerPrimePulse45333.FrostHunterRemoteConfigSpeedSpeed8566 && frostHunterVelocityTrackerPrimePulse45333.FrostHunterCameraXTurboCelestialHero5430 < 500000 && FrostHunterMeteringPointBetaCyber9571(this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025) && FrostHunterViewModelScopeTitanRogue1970()) {
                                                        z6 = z3;
                                                        if (z6) {
                                                            this.FrostHunterInAppPurchaseLegendEpicDragon4579 = -9223372036854775807L;
                                                        } else {
                                                            long j8 = this.FrostHunterInAppPurchaseLegendEpicDragon4579;
                                                            FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837 = this.FrostHunterBitmapTurboDeltaNebula8743;
                                                            if (j8 == -9223372036854775807L) {
                                                                frostHunterAssetManagerQuantumRogue9837.getClass();
                                                                this.FrostHunterInAppPurchaseLegendEpicDragon4579 = SystemClock.elapsedRealtime();
                                                            } else {
                                                                frostHunterAssetManagerQuantumRogue9837.getClass();
                                                                if (SystemClock.elapsedRealtime() - this.FrostHunterInAppPurchaseLegendEpicDragon4579 >= 4000) {
                                                                    throw new FrostHunterTransitionListenerNeoOmegaSolar7445(0, 4000);
                                                                }
                                                            }
                                                        }
                                                        boolean z13 = (FrostHunterViewModelScopeTitanRogue1970() || this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 != 3) ? false : z3;
                                                        if (this.FrostHunterColorStateListInflaterNovaQuantum4229 || !this.FrostHunterRunnableCosmosCelestial4235 || !z13) {
                                                            z3 = false;
                                                        }
                                                        frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
                                                        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != z3) {
                                                            this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterCameraXPixelTurboCosmos9814(z3);
                                                        }
                                                        this.FrostHunterRunnableCosmosCelestial4235 = false;
                                                        if (!z3 && (i2 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889) != 4 && (z13 || i2 == 2 || (i2 == 3 && this.FrostHunterColorDrawableLegendPhoenixVision7927 != 0))) {
                                                            FrostHunterRemoteConfigThunderShadow4435(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z6 = false;
                                                if (z6) {
                                                }
                                                if (FrostHunterViewModelScopeTitanRogue1970()) {
                                                }
                                                if (this.FrostHunterColorStateListInflaterNovaQuantum4229) {
                                                }
                                                z3 = false;
                                                frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
                                                if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != z3) {
                                                }
                                                this.FrostHunterRunnableCosmosCelestial4235 = false;
                                                if (!z3) {
                                                    FrostHunterRemoteConfigThunderShadow4435(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                            }
                            z4 = false;
                            if (f != 1.0f) {
                            }
                            if (!z12) {
                            }
                            if (j7 != -9223372036854775807L) {
                            }
                            if (j2 > 0) {
                                if (!(!z4 ? frostHunterMeteringPointEclipseTitan1504.FrostHunterServiceConnectionTurboPhoenixOmega6719 : false)) {
                                }
                                z5 = false;
                                if (z5) {
                                }
                            }
                            z5 = true;
                            if (z5) {
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    z5 = true;
                    if (z5) {
                    }
                } else {
                    z5 = false;
                }
                j = -9223372036854775807L;
                if (z5) {
                }
            } else {
                j = -9223372036854775807L;
            }
            z3 = true;
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3 && (this.FrostHunterColorDrawableLegendPhoenixVision7927 != 0 ? !z2 : !FrostHunterEditTextPulseHyperion1262())) {
                FrostHunterItemDecorationPixelShadow2695(FrostHunterViewModelScopeTitanRogue1970(), false);
                FrostHunterSharedElementPixelTitan2806(2);
                if (this.FrostHunterRewardedAdSpectraElite8288) {
                    for (FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36014 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809; frostHunterInsetDrawableCelestialEclipse36014 != null; frostHunterInsetDrawableCelestialEclipse36014 = frostHunterInsetDrawableCelestialEclipse36014.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                        for (FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 : (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterInsetDrawableCelestialEclipse36014.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200) {
                            if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                                frostHunterBindingAdapterOmegaBlaze8548.FrostHunterKeyframeGammaGamma1197();
                            }
                        }
                    }
                    FrostHunterModelInputOutputNebulaPhantom1071 frostHunterModelInputOutputNebulaPhantom1071 = this.FrostHunterServiceInfoHyperionSparkMax9966;
                    long j9 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814;
                    if (j9 != j) {
                        long j10 = j9 + frostHunterModelInputOutputNebulaPhantom1071.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 = j10;
                        long j11 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterRemoteConfigSpeedSpeed8566;
                        if (j11 != j && j10 > j11) {
                            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 = j11;
                        }
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFragmentBetaMegaVortex6025 = j;
                    }
                }
                FrostHunterItemDecorationPhoenixAlphaVortex8006();
            }
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 2) {
            }
            z6 = false;
            if (z6) {
            }
            if (FrostHunterViewModelScopeTitanRogue1970()) {
            }
            if (this.FrostHunterColorStateListInflaterNovaQuantum4229) {
            }
            z3 = false;
            frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
            if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != z3) {
            }
            this.FrostHunterRunnableCosmosCelestial4235 = false;
            if (!z3) {
            }
            Trace.endSection();
        }
        FrostHunterSharedElementPixelTitan2806(4);
        FrostHunterItemDecorationPhoenixAlphaVortex8006();
        z3 = true;
        if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 2) {
        }
        z6 = false;
        if (z6) {
        }
        if (FrostHunterViewModelScopeTitanRogue1970()) {
        }
        if (this.FrostHunterColorStateListInflaterNovaQuantum4229) {
        }
        z3 = false;
        frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != z3) {
        }
        this.FrostHunterRunnableCosmosCelestial4235 = false;
        if (!z3) {
        }
        Trace.endSection();
    }

    @Override // android.content.Context.FrostHunterInstrumentationDragonOmega6403
    public final void FrostHunterAlphaAnimationNeoCosmos5761(long j, long j2, FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818, MediaFormat mediaFormat) {
        if (this.FrostHunterPagingDataTurboTitanium7332) {
            this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761(37).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
    }

    public final void FrostHunterAlphaAnimationNovaGamma6326(boolean z) {
        this.FrostHunterAnnotationProcessorSparkEclipse8710 = z;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        frostHunterLooperThreadOlympianAurora4719.FrostHunterCameraXPixelTurboCosmos9814 = z;
        int FrostHunterCameraXTurboCelestialHero5430 = frostHunterLooperThreadOlympianAurora4719.FrostHunterCameraXTurboCelestialHero5430(frostHunterStrictModeNebulaEliteHyper7105);
        if ((FrostHunterCameraXTurboCelestialHero5430 & 1) != 0) {
            FrostHunterPushNotificationStormTitanGamma8999(true);
        } else if ((FrostHunterCameraXTurboCelestialHero5430 & 2) != 0) {
            FrostHunterCameraXPixelTurboCosmos9814();
        }
        FrostHunterLooperThreadBetaHyperionMax1000(false);
    }

    public final void FrostHunterAnimatorSetEliteQuantum4520(FrostHunterInstrumentationDragonOmega6403 frostHunterInstrumentationDragonOmega6403) {
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809 == 2) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterConstraintSetCloneMasterUltraRogue2633(7, frostHunterInstrumentationDragonOmega6403);
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterFaceDetectionPixelFusionBlaze52912 != null) {
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterConstraintSetCloneMasterUltraRogue2633(7, frostHunterInstrumentationDragonOmega6403);
                }
            }
        }
    }

    public final void FrostHunterAnnotationProcessorSolarSpeedNebula4443(Object obj, FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665) {
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809 == 2) {
                int i = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757;
                if (i == 4 || i == 1) {
                    FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                    frostHunterFaceDetectionPixelFusionBlaze52912.getClass();
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterConstraintSetCloneMasterUltraRogue2633(1, obj);
                } else {
                    frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterConstraintSetCloneMasterUltraRogue2633(1, obj);
                }
            }
        }
        int i2 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889;
        if (i2 == 3 || i2 == 2) {
            this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
        }
        if (frostHunterSensorManagerMegaEclipse5665 != null) {
            frostHunterSensorManagerMegaEclipse5665.FrostHunterBundlePulseFusionHero2475();
        }
    }

    public final long FrostHunterAnnotationProcessorSparkEclipse8710(FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960, long j, boolean z, boolean z2) {
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719;
        int i;
        FrostHunterItemDecorationPhoenixAlphaVortex8006();
        boolean z3 = true;
        FrostHunterItemDecorationPixelShadow2695(false, true);
        if (z2 || this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3) {
            FrostHunterSharedElementPixelTitan2806(2);
        }
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterInsetDrawableCelestialEclipse3601;
        while (frostHunterInsetDrawableCelestialEclipse36012 != null && !frostHunterAnimatedVectorDrawableMasterHeroHyper6960.equals(frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761)) {
            frostHunterInsetDrawableCelestialEclipse36012 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        }
        if (z || frostHunterInsetDrawableCelestialEclipse3601 != frostHunterInsetDrawableCelestialEclipse36012 || (frostHunterInsetDrawableCelestialEclipse36012 != null && frostHunterInsetDrawableCelestialEclipse36012.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + j < 0)) {
            for (int i2 = 0; i2 < this.FrostHunterCameraXPixelTurboCosmos9814.length; i2++) {
                FrostHunterFlowMaxDragonHero5809(i2);
            }
            this.FrostHunterPlaceholderLegendForceNebula9869 = -9223372036854775807L;
            if (frostHunterInsetDrawableCelestialEclipse36012 != null) {
                while (true) {
                    frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
                    if (frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809 == frostHunterInsetDrawableCelestialEclipse36012) {
                        break;
                    }
                    frostHunterLooperThreadOlympianAurora4719.FrostHunterAlphaAnimationNeoCosmos5761();
                }
                frostHunterLooperThreadOlympianAurora4719.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36012);
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1000000000000L;
                FrostHunterFragmentBetaMegaVortex6025(new boolean[this.FrostHunterCameraXPixelTurboCosmos9814.length], this.FrostHunterLooperHyperionForce4133.FrostHunterAlertDialogAuroraDelta3200.FrostHunterLifecycleBlazeGammaElite2889());
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterCameraXPixelTurboCosmos9814 = true;
            }
        }
        FrostHunterCameraXPixelTurboCosmos9814();
        if (this.FrostHunterMagnetometerFusionTitanium8202) {
            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                if (frostHunterPaintAuroraNovaXPulse1290.FrostHunterRemoteConfigSpeedSpeed8566() && ((i = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809) == 2 || i == 4)) {
                    this.FrostHunterPagingDataTurboTitanium7332 = true;
                    break;
                }
            }
        }
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47192 = this.FrostHunterLooperHyperionForce4133;
        if (frostHunterInsetDrawableCelestialEclipse36012 != null) {
            frostHunterLooperThreadOlympianAurora47192.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36012);
            if (!frostHunterInsetDrawableCelestialEclipse36012.FrostHunterLifecycleBlazeGammaElite2889) {
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, -9223372036854775807L);
            } else if (frostHunterInsetDrawableCelestialEclipse36012.FrostHunterLevelListDrawableFusionDragonHero2232) {
                if (this.FrostHunterMagnetometerFusionTitanium8202) {
                    this.FrostHunterStateCelestialNovaPixel8414.getClass();
                    if (!this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.equals(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                        long j2 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + j;
                        boolean z4 = true;
                        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12902 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                            if (frostHunterPaintAuroraNovaXPulse12902.FrostHunterRemoteConfigSpeedSpeed8566()) {
                                FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse12902.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012);
                                z4 &= FrostHunterServiceEliteCelestialThunder1757 != null && FrostHunterServiceEliteCelestialThunder1757.FrostHunterMeteringPointMegaCyber7955(j2);
                            }
                        }
                        if (z4) {
                            FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761;
                            long j3 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823;
                            FrostHunterColorDrawableSpeedAurora7439 frostHunterColorDrawableSpeedAurora7439 = FrostHunterColorDrawableSpeedAurora7439.FrostHunterBundlePulseFusionHero2475;
                            if (frostHunterDrawableDeltaLegend6817.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(j3, frostHunterColorDrawableSpeedAurora7439) == frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(j, frostHunterColorDrawableSpeedAurora7439)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLightSensorForceFusion4241(j);
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterScaleAnimationStrikeSpark5059(j - this.FrostHunterTextViewDragonStormMega4297);
            }
            FrostHunterPagingSourceEclipseDelta8255(j, z3);
            FrostHunterDatabaseEliteShadowUltra2452();
        } else {
            frostHunterLooperThreadOlympianAurora47192.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            FrostHunterPagingSourceEclipseDelta8255(j, true);
        }
        FrostHunterLooperThreadBetaHyperionMax1000(false);
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
        return j;
    }

    public final void FrostHunterBannerAdNebulaMasterBeta4389() {
        long j;
        float f;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
            return;
        }
        long FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889 ? frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232() : -9223372036854775807L;
        if (FrostHunterLevelListDrawableFusionDragonHero2232 != -9223372036854775807L) {
            if (!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566()) {
                this.FrostHunterLooperHyperionForce4133.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse3601);
                FrostHunterLooperThreadBetaHyperionMax1000(false);
                FrostHunterDatabaseEliteShadowUltra2452();
            }
            FrostHunterPagingSourceEclipseDelta8255(FrostHunterLevelListDrawableFusionDragonHero2232, true);
            if (FrostHunterLevelListDrawableFusionDragonHero2232 != this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823) {
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475, FrostHunterLevelListDrawableFusionDragonHero2232, true, 5);
            }
        } else {
            FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            boolean z = frostHunterInsetDrawableCelestialEclipse3601 != this.FrostHunterLooperHyperionForce4133.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterOnItemClickListenerTitaniumTitanEpic5303 frostHunterOnItemClickListenerTitaniumTitanEpic5303 = frostHunterPreviewOlympianBeta7981.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPreviewOlympianBeta7981.FrostHunterAlertDialogAuroraDelta3200;
            if (frostHunterFaceDetectionPixelFusionBlaze5291 == null || frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterServiceConnectionTurboPhoenixOmega6719() || ((z && frostHunterPreviewOlympianBeta7981.FrostHunterAlertDialogAuroraDelta3200.FrostHunterScaleAnimationStrikeSpark5059 != 2) || (!frostHunterPreviewOlympianBeta7981.FrostHunterAlertDialogAuroraDelta3200.FrostHunterScaleAnimationStrikeSpark5059() && (z || frostHunterPreviewOlympianBeta7981.FrostHunterAlertDialogAuroraDelta3200.FrostHunterFragmentBetaMegaVortex6025())))) {
                frostHunterPreviewOlympianBeta7981.FrostHunterFragmentBetaMegaVortex6025 = true;
                if (frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                    frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLevelListDrawableFusionDragonHero2232();
                }
            } else {
                FrostHunterTypefaceNovaOmegaDragon6589 frostHunterTypefaceNovaOmegaDragon6589 = frostHunterPreviewOlympianBeta7981.FrostHunterKeyframeGammaGamma1197;
                frostHunterTypefaceNovaOmegaDragon6589.getClass();
                long FrostHunterLifecycleBlazeGammaElite2889 = frostHunterTypefaceNovaOmegaDragon6589.FrostHunterLifecycleBlazeGammaElite2889();
                if (frostHunterPreviewOlympianBeta7981.FrostHunterFragmentBetaMegaVortex6025) {
                    if (FrostHunterLifecycleBlazeGammaElite2889 >= frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLifecycleBlazeGammaElite2889()) {
                        frostHunterPreviewOlympianBeta7981.FrostHunterFragmentBetaMegaVortex6025 = false;
                        if (frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                            frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLevelListDrawableFusionDragonHero2232();
                        }
                    } else if (frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809) {
                        frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLifecycleBlazeGammaElite2889());
                        frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809 = false;
                    }
                }
                frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLifecycleBlazeGammaElite2889);
                FrostHunterCameraThunderEpicBeta3381 FrostHunterBundlePulseFusionHero2475 = frostHunterTypefaceNovaOmegaDragon6589.FrostHunterBundlePulseFusionHero2475();
                if (!FrostHunterBundlePulseFusionHero2475.equals(frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFragmentBetaMegaVortex6025)) {
                    frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterServiceEliteCelestialThunder1757(FrostHunterBundlePulseFusionHero2475);
                    frostHunterPreviewOlympianBeta7981.FrostHunterFlowMaxDragonHero5809.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(16, FrostHunterBundlePulseFusionHero2475).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                }
            }
            long FrostHunterLifecycleBlazeGammaElite28892 = frostHunterPreviewOlympianBeta7981.FrostHunterLifecycleBlazeGammaElite2889();
            this.FrostHunterSoundPoolNovaTitanTitan5784 = FrostHunterLifecycleBlazeGammaElite28892;
            long j2 = FrostHunterLifecycleBlazeGammaElite28892 - frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            long j3 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823;
            if (!this.FrostHunterMotionSceneAuroraMega2271.isEmpty() && !this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                if (this.FrostHunterNestedScrollViewPixelPhantom8605) {
                    this.FrostHunterNestedScrollViewPixelPhantom8605 = false;
                }
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
                frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761);
                int min = Math.min(this.FrostHunterColorStateListMegaBetaFusion7423, this.FrostHunterMotionSceneAuroraMega2271.size());
                if (min > 0 && this.FrostHunterMotionSceneAuroraMega2271.get(min - 1) != null) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                    return;
                } else {
                    if (min < this.FrostHunterMotionSceneAuroraMega2271.size() && this.FrostHunterMotionSceneAuroraMega2271.get(min) != null) {
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                        return;
                    }
                    this.FrostHunterColorStateListMegaBetaFusion7423 = min;
                }
            }
            if (this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterAlphaAnimationNeoCosmos5761()) {
                boolean z2 = !this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633, j2, frostHunterVelocityTrackerPrimePulse45333.FrostHunterBundlePulseFusionHero2475, j2, z2, 6);
            } else {
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = this.FrostHunterRewardedAdMasterStrike9463;
                frostHunterVelocityTrackerPrimePulse45334.FrostHunterResourcesTitanHyperVision5823 = j2;
                frostHunterVelocityTrackerPrimePulse45334.FrostHunterTextViewDragonStormMega4297 = SystemClock.elapsedRealtime();
            }
        }
        this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLintTitanVortexQuantum9911 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceEliteCelestialThunder1757();
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45335 = this.FrostHunterRewardedAdMasterStrike9463;
        frostHunterVelocityTrackerPrimePulse45335.FrostHunterCameraXTurboCelestialHero5430 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45335.FrostHunterLintTitanVortexQuantum9911);
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45336 = this.FrostHunterRewardedAdMasterStrike9463;
        if (frostHunterVelocityTrackerPrimePulse45336.FrostHunterFragmentBetaMegaVortex6025 && frostHunterVelocityTrackerPrimePulse45336.FrostHunterLifecycleBlazeGammaElite2889 == 3 && FrostHunterBindingAdapterInfernoFusionForce2284(frostHunterVelocityTrackerPrimePulse45336.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45336.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45337 = this.FrostHunterRewardedAdMasterStrike9463;
            float f2 = 1.0f;
            if (frostHunterVelocityTrackerPrimePulse45337.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761 == 1.0f) {
                FrostHunterModelInputOutputNebulaPhantom1071 frostHunterModelInputOutputNebulaPhantom1071 = this.FrostHunterServiceInfoHyperionSparkMax9966;
                long FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45337.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45337.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45337.FrostHunterResourcesTitanHyperVision5823);
                long j4 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterCameraXTurboCelestialHero5430;
                if (frostHunterModelInputOutputNebulaPhantom1071.FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                    long j5 = FrostHunterServiceConnectionTurboPhoenixOmega6719 - j4;
                    long j6 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (j6 == -9223372036854775807L) {
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceConnectionTurboPhoenixOmega6719 = j5;
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLightSensorForceFusion4241 = 0L;
                    } else {
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceConnectionTurboPhoenixOmega6719 = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLightSensorForceFusion4241 = (long) ((9.999871E-4f * Math.abs(j5 - r9)) + (frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLightSensorForceFusion4241 * 0.999f));
                    }
                    if (frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFragmentBetaMegaVortex6025 != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFragmentBetaMegaVortex6025 < 1000) {
                            f2 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197;
                        }
                    } else {
                        j = 1000;
                    }
                    frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFragmentBetaMegaVortex6025 = SystemClock.elapsedRealtime();
                    long j7 = (frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLightSensorForceFusion4241 * 3) + frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 > j7) {
                        float FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLifecycleBlazeGammaElite2889, frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 - (((long) ((frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197 - 1.0f) * FrostHunterDatabaseEliteShadowUltra2452)) + ((long) ((frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFlowMaxDragonHero5809 - 1.0f) * FrostHunterDatabaseEliteShadowUltra2452)))};
                        long j8 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j8) {
                                j8 = j9;
                            }
                        }
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 = j8;
                    } else {
                        f = 1.0E-7f;
                        long FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterServiceConnectionTurboPhoenixOmega6719 - ((long) (Math.max(0.0f, frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197 - 1.0f) / 1.0E-7f)), frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814, j7);
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814;
                        long j10 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterRemoteConfigSpeedSpeed8566;
                        if (j10 != -9223372036854775807L && FrostHunterCameraXPixelTurboCosmos9814 > j10) {
                            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814 = j10;
                        }
                    }
                    long j11 = FrostHunterServiceConnectionTurboPhoenixOmega6719 - frostHunterModelInputOutputNebulaPhantom1071.FrostHunterCameraXPixelTurboCosmos9814;
                    if (Math.abs(j11) < frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlphaAnimationNeoCosmos5761) {
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197 = 1.0f;
                    } else {
                        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232((f * j11) + 1.0f, frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlertDialogAuroraDelta3200, frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFlowMaxDragonHero5809);
                    }
                    f2 = frostHunterModelInputOutputNebulaPhantom1071.FrostHunterKeyframeGammaGamma1197;
                }
                if (this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761 != f2) {
                    FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = new FrostHunterCameraThunderEpicBeta3381(f2, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889(16);
                    this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterServiceEliteCelestialThunder1757(frostHunterCameraThunderEpicBeta3381);
                    FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761, false, false);
                }
            }
        }
    }

    public final void FrostHunterBillingClientFusionVortex9008(int i, boolean z) {
        boolean[] zArr = this.FrostHunterAlertDialogAuroraDelta3200;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.FrostHunterViewPhantomNeo1634.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterMergeQuantumMega4504(this, i, z));
        }
    }

    public final boolean FrostHunterBindingAdapterInfernoFusionForce2284(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960) {
        if (frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterConstraintSetCloneMasterUltraRogue2633() || frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return false;
        }
        int i = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterResourcesTitanHyperVision5823).FrostHunterBundlePulseFusionHero2475;
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterCameraXTurboCelestialHero5430;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterLightSensorForceFusion4241(i, frostHunterGyroscopeBetaVisionInferno6797);
        return frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761() && frostHunterGyroscopeBetaVisionInferno6797.FrostHunterRemoteConfigSpeedSpeed8566 && frostHunterGyroscopeBetaVisionInferno6797.FrostHunterServiceEliteCelestialThunder1757 != -9223372036854775807L;
    }

    public final void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817) {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601;
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        if (frostHunterInsetDrawableCelestialEclipse36012 != null && frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterDrawableDeltaLegend6817) {
            frostHunterInsetDrawableCelestialEclipse36012.getClass();
            if (!frostHunterInsetDrawableCelestialEclipse36012.FrostHunterLifecycleBlazeGammaElite2889) {
                float f = frostHunterPreviewOlympianBeta7981.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterLevelListDrawableFusionDragonHero2232(f, frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025);
            }
            FrostHunterGyroscopeOmegaEclipseOlympian7225(frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse36012.FrostHunterScaleAnimationStrikeSpark5059);
            if (frostHunterInsetDrawableCelestialEclipse36012 == frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809) {
                FrostHunterPagingSourceEclipseDelta8255(frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633, true);
                FrostHunterFragmentBetaMegaVortex6025(new boolean[this.FrostHunterCameraXPixelTurboCosmos9814.length], frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200.FrostHunterLifecycleBlazeGammaElite2889());
                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterCameraXPixelTurboCosmos9814 = true;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                long j = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterPackageManagerEclipseTitanPulse8946 = this;
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j, frostHunterVelocityTrackerPrimePulse45332.FrostHunterBundlePulseFusionHero2475, j, false, 5);
            } else {
                frostHunterPackageManagerEclipseTitanPulse8946 = this;
            }
            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterDatabaseEliteShadowUltra2452();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.size()) {
                frostHunterInsetDrawableCelestialEclipse3601 = null;
                break;
            }
            frostHunterInsetDrawableCelestialEclipse3601 = (FrostHunterInsetDrawableCelestialEclipse3601) frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.get(i);
            if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterDrawableDeltaLegend6817) {
                break;
            } else {
                i++;
            }
        }
        if (frostHunterInsetDrawableCelestialEclipse3601 != null) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889);
            float f2 = frostHunterPreviewOlympianBeta7981.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
            frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLevelListDrawableFusionDragonHero2232(f2, frostHunterVelocityTrackerPrimePulse45333.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45333.FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (frostHunterInsetDrawableCelestialEclipse36013 == null || frostHunterInsetDrawableCelestialEclipse36013.FrostHunterAlphaAnimationNeoCosmos5761 != frostHunterDrawableDeltaLegend6817) {
                return;
            }
            FrostHunterCardViewSpectraCyber7714();
        }
    }

    @Override // android.content.Context.FrostHunterCameraHyperionSparkNova6520
    public final void FrostHunterBundlePulseFusionHero2475(FrostHunterAnimatorFusionVortex3103 frostHunterAnimatorFusionVortex3103) {
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(9, (FrostHunterDrawableDeltaLegend6817) frostHunterAnimatorFusionVortex3103).FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final void FrostHunterCamera2NeoMax8666(boolean z, boolean z2) {
        FrostHunterRewardedAdMasterStrike9463(z || !this.FrostHunterPreviewBlazeAurora1020, false, true, false);
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(z2 ? 1 : 0);
        FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        ConcurrentHashMap concurrentHashMap = frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
        FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) concurrentHashMap.get(frostHunterToolbarPixelHyperion1536);
        if (frostHunterTransformForceShadowSolar6619 != null) {
            int i = frostHunterTransformForceShadowSolar6619.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
            frostHunterTransformForceShadowSolar6619.FrostHunterAlphaAnimationNeoCosmos5761 = i;
            if (i == 0) {
                concurrentHashMap.remove(frostHunterToolbarPixelHyperion1536);
                frostHunterMeteringPointEclipseTitan1504.FrostHunterBundlePulseFusionHero2475();
            }
        }
        this.FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475(1, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFragmentBetaMegaVortex6025);
        FrostHunterSharedElementPixelTitan2806(1);
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814() {
        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291;
        if (this.FrostHunterMeteringPointMegaCyber7955 && FrostHunterLevelListDrawableFusionDragonHero2232()) {
            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                int FrostHunterBundlePulseFusionHero2475 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475();
                FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                if (frostHunterPaintAuroraNovaXPulse1290.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                    int i = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                        } catch (RuntimeException e) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Disable prewarming failed.", e);
                        }
                    } else {
                        frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                        frostHunterFaceDetectionPixelFusionBlaze5291.getClass();
                    }
                    frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFaceDetectionPixelFusionBlaze5291, frostHunterPreviewOlympianBeta7981);
                    try {
                        frostHunterPaintAuroraNovaXPulse1290.FrostHunterFlowMaxDragonHero5809(z);
                    } catch (RuntimeException e2) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Reset prewarming failed.", e2);
                    }
                    frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757 = i2;
                }
                this.FrostHunterColorDrawableLegendPhoenixVision7927 -= FrostHunterBundlePulseFusionHero2475 - frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475();
            }
            this.FrostHunterPlaceholderLegendForceNebula9869 = -9223372036854775807L;
        }
    }

    public final void FrostHunterCameraXTurboCelestialHero5430() {
        FrostHunterTransformNovaBetaNovaX5251(this.FrostHunterNavigationViewMasterVortexBeta1295);
    }

    public final void FrostHunterCardViewSpectraCyber7714() {
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197();
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterInsetDrawableCelestialEclipse3601 != null) {
            FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761;
            if ((!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757 || frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) && !frostHunterDrawableDeltaLegend6817.FrostHunterAlphaAnimationNeoCosmos5761()) {
                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
                    frostHunterDrawableDeltaLegend6817.FrostHunterFlowMaxDragonHero5809();
                }
                Iterator it = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.values().iterator();
                while (it.hasNext()) {
                    if (((FrostHunterTransformForceShadowSolar6619) it.next()).FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        return;
                    }
                }
                if (!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757) {
                    long j = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757 = true;
                    frostHunterDrawableDeltaLegend6817.FrostHunterServiceConnectionTurboPhoenixOmega6719(this, j);
                    return;
                }
                FrostHunterWindowManagerLegendPhantom6645 frostHunterWindowManagerLegendPhantom6645 = new FrostHunterWindowManagerLegendPhantom6645();
                frostHunterWindowManagerLegendPhantom6645.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterSoundPoolNovaTitanTitan5784 - frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                float f = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f > 0.0f || f == -3.4028235E38f);
                frostHunterWindowManagerLegendPhantom6645.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f;
                long j2 = this.FrostHunterRemoteConfigThunderShadow4435;
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j2 >= 0 || j2 == -9223372036854775807L);
                frostHunterWindowManagerLegendPhantom6645.FrostHunterBundlePulseFusionHero2475 = j2;
                FrostHunterToolbarAuroraCosmos9248 frostHunterToolbarAuroraCosmos9248 = new FrostHunterToolbarAuroraCosmos9248(frostHunterWindowManagerLegendPhantom6645);
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceConnectionTurboPhoenixOmega6719 == null);
                frostHunterDrawableDeltaLegend6817.FrostHunterKeyframeGammaGamma1197(frostHunterToolbarAuroraCosmos9248);
            }
        }
    }

    public final void FrostHunterColorDrawableLegendPhoenixVision7927(boolean z, FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665) {
        if (this.FrostHunterPreviewBlazeAurora1020 != z) {
            this.FrostHunterPreviewBlazeAurora1020 = z;
            if (!z) {
                for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                    frostHunterPaintAuroraNovaXPulse1290.FrostHunterKeyframeGammaGamma1197();
                }
            }
        }
        if (frostHunterSensorManagerMegaEclipse5665 != null) {
            frostHunterSensorManagerMegaEclipse5665.FrostHunterBundlePulseFusionHero2475();
        }
    }

    public final void FrostHunterColorStateListInflaterNovaQuantum4229(FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411, boolean z) {
        FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831 = this.FrostHunterKeyframeGammaGamma1197;
        if (!frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterFlowMaxDragonHero5809.equals(frostHunterRemoteConfigEpicUltraDragon2411)) {
            frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterFlowMaxDragonHero5809 = frostHunterRemoteConfigEpicUltraDragon2411;
            frostHunterLiveDataScopeShadowCelestialMax5831.FrostHunterRemoteConfigSpeedSpeed8566();
        }
        if (!z) {
            frostHunterRemoteConfigEpicUltraDragon2411 = null;
        }
        FrostHunterManifestPulseSolarHero2561 frostHunterManifestPulseSolarHero2561 = this.FrostHunterBillingClientFusionVortex9008;
        if (!Objects.equals(frostHunterManifestPulseSolarHero2561.FrostHunterServiceEliteCelestialThunder1757, frostHunterRemoteConfigEpicUltraDragon2411)) {
            frostHunterManifestPulseSolarHero2561.FrostHunterServiceEliteCelestialThunder1757 = frostHunterRemoteConfigEpicUltraDragon2411;
            int i = frostHunterRemoteConfigEpicUltraDragon2411 == null ? 0 : 1;
            frostHunterManifestPulseSolarHero2561.FrostHunterLevelListDrawableFusionDragonHero2232 = i;
            FrostHunterCanvasInfernoVortex4700.FrostHunterCameraXTurboCelestialHero5430("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        boolean z2 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterObjectAnimatorPhoenixSpectraThunder6218(frostHunterManifestPulseSolarHero2561.FrostHunterBundlePulseFusionHero2475(frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889, z2), frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719, z2);
    }

    public final void FrostHunterColorStateListMegaBetaFusion7423(FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381) {
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889(16);
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterPreviewOlympianBeta7981.FrostHunterServiceEliteCelestialThunder1757(frostHunterCameraThunderEpicBeta3381);
        FrostHunterCameraThunderEpicBeta3381 FrostHunterBundlePulseFusionHero2475 = frostHunterPreviewOlympianBeta7981.FrostHunterBundlePulseFusionHero2475();
        FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterBundlePulseFusionHero2475, FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761, true, true);
    }

    @Override // android.content.Context.FrostHunterCameraHyperionSparkNova6520
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817) {
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(8, frostHunterDrawableDeltaLegend6817).FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(21:(8:29|(1:95)(3:35|(1:39)|40)|41|(1:50)|48|49|19|20)(1:96)|55|56|(1:58)(1:88)|59|60|61|(1:63)(1:86)|64|65|66|67|68|69|70|71|72|73|18|19|20)|51|52|(1:54)(1:92)) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper3417) {
        long longValue;
        long j;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        long j2;
        boolean z;
        boolean z2;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long FrostHunterAnnotationProcessorSparkEclipse8710;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105;
        long j6;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603;
        long j7;
        long j8;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332;
        int i;
        int i2;
        long j9;
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946 = this;
        if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPagingDataTurboTitanium7332) {
            if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterR8MasterNebulaSpark7247 != null) {
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterFCMDeltaQuantumHero8364++;
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
            }
            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterR8MasterNebulaSpark7247 = frostHunterAnimatorSetEliteHyper3417;
            return;
        }
        frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        Pair FrostHunterTransitionListenerPulseVortexCosmos7949 = FrostHunterTransitionListenerPulseVortexCosmos7949(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterAnimatorSetEliteHyper3417, true, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterConstraintSetCloneOmegaHyperion9304, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterAnnotationProcessorSparkEclipse8710, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterCameraXTurboCelestialHero5430, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterResourcesTitanHyperVision5823);
        if (FrostHunterTransitionListenerPulseVortexCosmos7949 == null) {
            Pair FrostHunterScaleAnimationStrikeSpark5059 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterScaleAnimationStrikeSpark5059(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) FrostHunterScaleAnimationStrikeSpark5059.first;
            longValue = ((Long) FrostHunterScaleAnimationStrikeSpark5059.second).longValue();
            z = !frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
            j2 = 0;
            j = -9223372036854775807L;
        } else {
            Object obj = FrostHunterTransitionListenerPulseVortexCosmos7949.first;
            longValue = ((Long) FrostHunterTransitionListenerPulseVortexCosmos7949.second).longValue();
            j = frostHunterAnimatorSetEliteHyper3417.FrostHunterBundlePulseFusionHero2475 == -9223372036854775807L ? -9223372036854775807L : longValue;
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761, obj, longValue);
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterResourcesTitanHyperVision5823);
                if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterResourcesTitanHyperVision5823.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633) == FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475) {
                    frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterResourcesTitanHyperVision5823.FrostHunterRemoteConfigSpeedSpeed8566.getClass();
                }
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterResourcesTitanHyperVision5823.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633).getClass();
                j = Math.max(j, 0L);
                longValue = 0;
                j2 = 0;
            } else {
                j2 = 0;
                if (frostHunterAnimatorSetEliteHyper3417.FrostHunterBundlePulseFusionHero2475 != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                    frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLiveDataBetaLegend3442 = frostHunterAnimatorSetEliteHyper3417;
                } else {
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463;
                    if (FrostHunterTransitionListenerPulseVortexCosmos7949 == null) {
                        if (frostHunterVelocityTrackerPrimePulse45333.FrostHunterLifecycleBlazeGammaElite2889 != 1) {
                            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterSharedElementPixelTitan2806(4);
                        }
                        frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.equals(frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
                                            if (frostHunterInsetDrawableCelestialEclipse3601 == null || !frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889 || longValue == j2) {
                                                j5 = longValue;
                                            } else {
                                                FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761;
                                                long j10 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterCameraXTurboCelestialHero5430.FrostHunterKeyframeGammaGamma1197;
                                                if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterMagnetometerFusionTitanium8202 && j10 != -9223372036854775807L) {
                                                    frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterStateCelestialNovaPixel8414.getClass();
                                                }
                                                j5 = frostHunterDrawableDeltaLegend6817.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(longValue, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterTranslateAnimationCyberSolarUltra7101);
                                            }
                                            if (FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(j5) != FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823) || ((i = (frostHunterVelocityTrackerPrimePulse45332 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463).FrostHunterLifecycleBlazeGammaElite2889) != 2 && i != 3)) {
                                                z2 = z;
                                                frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                            }
                                            j8 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterResourcesTitanHyperVision5823;
                                            i2 = 2;
                                            j9 = j8;
                                            z2 = z;
                                            frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                            j7 = j;
                                            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69603, j8, j7, j9, z2, i2);
                                        }
                                        z2 = z;
                                        frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                        j5 = longValue;
                                        frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper69602, frostHunterStrictModeNebulaEliteHyper7105, frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633, j6, true);
                                        frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
                                        j7 = j6;
                                        j8 = FrostHunterAnnotationProcessorSparkEclipse8710;
                                        i2 = 2;
                                        j9 = j8;
                                        frostHunterPackageManagerEclipseTitanPulse8946 = this;
                                        frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69603, j8, j7, j9, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
                                        j3 = j6;
                                        j4 = FrostHunterAnnotationProcessorSparkEclipse8710;
                                        frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                    frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
                                    j6 = j;
                                } catch (Throwable th2) {
                                    th = th2;
                                    frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
                                    j3 = j;
                                    j4 = FrostHunterAnnotationProcessorSparkEclipse8710;
                                    frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                                frostHunterVelocityTrackerPrimePulse4533 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463;
                                frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133;
                            FrostHunterAnnotationProcessorSparkEclipse8710 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j5, frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809 != frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200, z3);
                            z2 |= longValue != FrostHunterAnnotationProcessorSparkEclipse8710;
                        } catch (Throwable th4) {
                            th = th4;
                            j3 = j;
                            j4 = longValue;
                            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        z3 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 4;
                    }
                }
                z2 = z;
                frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                j8 = longValue;
                j7 = j;
                i2 = 2;
                j9 = j8;
                frostHunterPackageManagerEclipseTitanPulse8946 = this;
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterRewardedAdMasterStrike9463 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69603, j8, j7, j9, z2, i2);
            } catch (Throwable th5) {
                th = th5;
                z2 = z;
                frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                j4 = longValue;
                j3 = j;
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = z;
            frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        }
    }

    public final void FrostHunterCoordinatorLayoutDragonHyperionSolar9277(int i, int i2, List list) {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        frostHunterModelInputOutputStrikePrime1569.getClass();
        ArrayList arrayList = frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i >= 0 && i <= i2 && i2 <= arrayList.size());
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((FrostHunterSQLiteUltraCosmosSpectra2008) arrayList.get(i3)).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXTurboCelestialHero5430((FrostHunterGradientDrawableDeltaTitaniumPhoenix9347) list.get(i3 - i));
        }
        FrostHunterMotionSceneAuroraMega2271(frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633(), false);
    }

    public final void FrostHunterCoordinatorLayoutGammaTurboSpark2420() {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
            return;
        }
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059;
        int i = 0;
        while (true) {
            FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                return;
            }
            if (frostHunterSurfaceViewPhantomHyperion3032.FrostHunterServiceEliteCelestialThunder1757(i)) {
                frostHunterPaintAuroraNovaXPulse1290Arr[i].FrostHunterServiceConnectionTurboPhoenixOmega6719();
            }
            i++;
        }
    }

    public final void FrostHunterDatabaseEliteShadowUltra2452() {
        boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (FrostHunterMeteringPointBetaCyber9571(this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025)) {
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
            long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889 ? 0L : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889());
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
            long j = FrostHunterBindingAdapterInfernoFusionForce2284(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761) ? this.FrostHunterServiceInfoHyperionSparkMax9966.FrostHunterCameraXPixelTurboCosmos9814 : -9223372036854775807L;
            FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
            float f = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
            boolean z = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterViewPagerTurboPhantom8732 frostHunterViewPagerTurboPhantom8732 = new FrostHunterViewPagerTurboPhantom8732(frostHunterToolbarPixelHyperion1536, frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper6960, FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, f, this.FrostHunterRewardedAdSpectraElite8288, j);
            FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterViewPagerTurboPhantom8732);
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
            if (!FrostHunterConstraintSetCloneMasterUltraRogue2633 && frostHunterInsetDrawableCelestialEclipse36013.FrostHunterLifecycleBlazeGammaElite2889 && FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 < 500000 && this.FrostHunterTextViewDragonStormMega4297 > 0) {
                frostHunterInsetDrawableCelestialEclipse36013.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823);
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterViewPagerTurboPhantom8732);
            }
        } else {
            FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
        }
        this.FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36014 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
            frostHunterInsetDrawableCelestialEclipse36014.getClass();
            FrostHunterWindowManagerLegendPhantom6645 frostHunterWindowManagerLegendPhantom6645 = new FrostHunterWindowManagerLegendPhantom6645();
            frostHunterWindowManagerLegendPhantom6645.FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterSoundPoolNovaTitanTitan5784 - frostHunterInsetDrawableCelestialEclipse36014.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            float f2 = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(f2 > 0.0f || f2 == -3.4028235E38f);
            frostHunterWindowManagerLegendPhantom6645.FrostHunterConstraintSetCloneMasterUltraRogue2633 = f2;
            long j2 = this.FrostHunterRemoteConfigThunderShadow4435;
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(j2 >= 0 || j2 == -9223372036854775807L);
            frostHunterWindowManagerLegendPhantom6645.FrostHunterBundlePulseFusionHero2475 = j2;
            FrostHunterToolbarAuroraCosmos9248 frostHunterToolbarAuroraCosmos9248 = new FrostHunterToolbarAuroraCosmos9248(frostHunterWindowManagerLegendPhantom6645);
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterInsetDrawableCelestialEclipse36014.FrostHunterServiceConnectionTurboPhoenixOmega6719 == null);
            frostHunterInsetDrawableCelestialEclipse36014.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(frostHunterToolbarAuroraCosmos9248);
        }
        FrostHunterDrawableCompatHeroMasterSpectra7412();
    }

    public final void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381, float f, boolean z, boolean z2) {
        FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta33812;
        int i;
        if (z) {
            if (z2) {
                this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
            }
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = new FrostHunterVelocityTrackerPrimePulse4533(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceEliteCelestialThunder1757, frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse4533.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterVelocityTrackerPrimePulse4533.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterVelocityTrackerPrimePulse4533.FrostHunterCameraXPixelTurboCosmos9814, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFlowMaxDragonHero5809, frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200, frostHunterVelocityTrackerPrimePulse4533.FrostHunterKeyframeGammaGamma1197, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241, frostHunterCameraThunderEpicBeta3381, frostHunterVelocityTrackerPrimePulse4533.FrostHunterLintTitanVortexQuantum9911, frostHunterVelocityTrackerPrimePulse4533.FrostHunterCameraXTurboCelestialHero5430, frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823, frostHunterVelocityTrackerPrimePulse4533.FrostHunterTextViewDragonStormMega4297, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
            frostHunterCameraThunderEpicBeta33812 = frostHunterCameraThunderEpicBeta3381;
            this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse45332;
        } else {
            frostHunterCameraThunderEpicBeta33812 = frostHunterCameraThunderEpicBeta3381;
        }
        float f2 = frostHunterCameraThunderEpicBeta33812.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        while (true) {
            i = 0;
            if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
                break;
            }
            FrostHunterBindingAdapterOmegaBlaze8548[] frostHunterBindingAdapterOmegaBlaze8548Arr = (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200;
            int length = frostHunterBindingAdapterOmegaBlaze8548Arr.length;
            while (i < length) {
                FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 = frostHunterBindingAdapterOmegaBlaze8548Arr[i];
                if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                    frostHunterBindingAdapterOmegaBlaze8548.FrostHunterFlowMaxDragonHero5809(f2);
                }
                i++;
            }
            frostHunterInsetDrawableCelestialEclipse3601 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        }
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int length2 = frostHunterPaintAuroraNovaXPulse1290Arr.length;
        while (i < length2) {
            FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = frostHunterPaintAuroraNovaXPulse1290Arr[i];
            float f3 = frostHunterCameraThunderEpicBeta33812.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterDatabaseEliteShadowUltra2452(f, f3);
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterFaceDetectionPixelFusionBlaze5291 != null) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterDatabaseEliteShadowUltra2452(f, f3);
            }
            i++;
        }
    }

    public final void FrostHunterDrawableCompatHeroMasterSpectra7412() {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
        boolean z = this.FrostHunterPushNotificationStormTitanGamma8999 || (frostHunterInsetDrawableCelestialEclipse3601 != null && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761());
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        if (z != frostHunterVelocityTrackerPrimePulse4533.FrostHunterRemoteConfigSpeedSpeed8566) {
            this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633(z);
        }
    }

    public final boolean FrostHunterEditTextPulseHyperion1262() {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        long j = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
            return j == -9223372036854775807L || this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823 < j || !FrostHunterViewModelScopeTitanRogue1970();
        }
        return false;
    }

    public final void FrostHunterExecutorNeoDragonMax5687(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960, FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602, long j, boolean z) {
        boolean FrostHunterBindingAdapterInfernoFusionForce2284 = FrostHunterBindingAdapterInfernoFusionForce2284(frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        Object obj = frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!FrostHunterBindingAdapterInfernoFusionForce2284) {
            FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterConstraintSetCloneMasterUltraRogue2633() ? FrostHunterCameraThunderEpicBeta3381.FrostHunterServiceEliteCelestialThunder1757 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterScaleAnimationStrikeSpark5059;
            FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            if (frostHunterPreviewOlympianBeta7981.FrostHunterBundlePulseFusionHero2475().equals(frostHunterCameraThunderEpicBeta3381)) {
                return;
            }
            this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889(16);
            frostHunterPreviewOlympianBeta7981.FrostHunterServiceEliteCelestialThunder1757(frostHunterCameraThunderEpicBeta3381);
            FrostHunterDialogFragmentTurboPhoenixDragon7627(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterScaleAnimationStrikeSpark5059, frostHunterCameraThunderEpicBeta3381.FrostHunterAlphaAnimationNeoCosmos5761, false, false);
            return;
        }
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterResourcesTitanHyperVision5823;
        int i = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475;
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterCameraXTurboCelestialHero5430;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterLightSensorForceFusion4241(i, frostHunterGyroscopeBetaVisionInferno6797);
        FrostHunterTransformUltraTitanForce8251 frostHunterTransformUltraTitanForce8251 = frostHunterGyroscopeBetaVisionInferno6797.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterModelInputOutputNebulaPhantom1071 frostHunterModelInputOutputNebulaPhantom1071 = this.FrostHunterServiceInfoHyperionSparkMax9966;
        frostHunterModelInputOutputNebulaPhantom1071.getClass();
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterBundlePulseFusionHero2475 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(frostHunterTransformUltraTitanForce8251.FrostHunterAlphaAnimationNeoCosmos5761);
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(frostHunterTransformUltraTitanForce8251.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(frostHunterTransformUltraTitanForce8251.FrostHunterBundlePulseFusionHero2475);
        float f = frostHunterTransformUltraTitanForce8251.FrostHunterServiceEliteCelestialThunder1757;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlertDialogAuroraDelta3200 = f;
        float f2 = frostHunterTransformUltraTitanForce8251.FrostHunterLifecycleBlazeGammaElite2889;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterFlowMaxDragonHero5809 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterBundlePulseFusionHero2475 = -9223372036854775807L;
        }
        frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlphaAnimationNeoCosmos5761();
        if (j != -9223372036854775807L) {
            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper7105, obj, j);
            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlphaAnimationNeoCosmos5761();
            return;
        }
        if (!Objects.equals(!frostHunterStrictModeNebulaEliteHyper71052.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? frostHunterStrictModeNebulaEliteHyper71052.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper71052.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761 : null, frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761) || z) {
            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterServiceEliteCelestialThunder1757 = -9223372036854775807L;
            frostHunterModelInputOutputNebulaPhantom1071.FrostHunterAlphaAnimationNeoCosmos5761();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterFCMDeltaQuantumHero8364() {
        int i;
        int i2;
        float f = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = null;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = frostHunterInsetDrawableCelestialEclipse3601;
        boolean z = true;
        while (frostHunterInsetDrawableCelestialEclipse36013 != null && frostHunterInsetDrawableCelestialEclipse36013.FrostHunterLifecycleBlazeGammaElite2889) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
            FrostHunterSurfaceViewPhantomHyperion3032 FrostHunterAlertDialogAuroraDelta3200 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterAlertDialogAuroraDelta3200(f, frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = frostHunterInsetDrawableCelestialEclipse36013 == this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809 ? FrostHunterAlertDialogAuroraDelta3200 : frostHunterSurfaceViewPhantomHyperion3032;
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30323 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterScaleAnimationStrikeSpark5059;
            FrostHunterBindingAdapterOmegaBlaze8548[] frostHunterBindingAdapterOmegaBlaze8548Arr = (FrostHunterBindingAdapterOmegaBlaze8548[]) FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlertDialogAuroraDelta3200;
            if (frostHunterSurfaceViewPhantomHyperion30323 != null && ((FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion30323.FrostHunterAlertDialogAuroraDelta3200).length == frostHunterBindingAdapterOmegaBlaze8548Arr.length) {
                for (int i3 = 0; i3 < frostHunterBindingAdapterOmegaBlaze8548Arr.length; i3++) {
                    if (FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSurfaceViewPhantomHyperion30323, i3)) {
                    }
                }
                if (frostHunterInsetDrawableCelestialEclipse36013 == frostHunterInsetDrawableCelestialEclipse36012) {
                    z = false;
                }
                frostHunterInsetDrawableCelestialEclipse36013 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                frostHunterSurfaceViewPhantomHyperion3032 = frostHunterSurfaceViewPhantomHyperion30322;
            }
            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47192 = this.FrostHunterLooperHyperionForce4133;
            if (z) {
                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36014 = frostHunterLooperThreadOlympianAurora47192.FrostHunterFlowMaxDragonHero5809;
                boolean z2 = (frostHunterLooperThreadOlympianAurora47192.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36014) & 1) != 0;
                boolean[] zArr = new boolean[this.FrostHunterCameraXPixelTurboCosmos9814.length];
                frostHunterSurfaceViewPhantomHyperion30322.getClass();
                long FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterInsetDrawableCelestialEclipse36014.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSurfaceViewPhantomHyperion30322, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823, z2, zArr);
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
                boolean z3 = (frostHunterVelocityTrackerPrimePulse45332.FrostHunterLifecycleBlazeGammaElite2889 == 4 || FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterVelocityTrackerPrimePulse45332.FrostHunterResourcesTitanHyperVision5823) ? false : true;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
                i = 4;
                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45333.FrostHunterBundlePulseFusionHero2475, frostHunterVelocityTrackerPrimePulse45333.FrostHunterServiceEliteCelestialThunder1757, z3, 5);
                if (z3) {
                    FrostHunterPagingSourceEclipseDelta8255(FrostHunterAlphaAnimationNeoCosmos5761, true);
                }
                FrostHunterCameraXPixelTurboCosmos9814();
                boolean[] zArr2 = new boolean[this.FrostHunterCameraXPixelTurboCosmos9814.length];
                int i4 = 0;
                while (true) {
                    FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i4 >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                        break;
                    }
                    int FrostHunterBundlePulseFusionHero2475 = frostHunterPaintAuroraNovaXPulse1290Arr[i4].FrostHunterBundlePulseFusionHero2475();
                    zArr2[i4] = this.FrostHunterCameraXPixelTurboCosmos9814[i4].FrostHunterRemoteConfigSpeedSpeed8566();
                    FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = this.FrostHunterCameraXPixelTurboCosmos9814[i4];
                    FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = frostHunterInsetDrawableCelestialEclipse36014.FrostHunterBundlePulseFusionHero2475[i4];
                    FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                    long j = this.FrostHunterSoundPoolNovaTitanTitan5784;
                    boolean z4 = zArr[i4];
                    FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze5291)) {
                        if (frostHunterOnItemLongClickListenerNovaXTitan1242 != frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                            frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFaceDetectionPixelFusionBlaze5291, frostHunterPreviewOlympianBeta7981);
                        } else if (z4) {
                            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterEditTextPulseHyperion1262(j, false, true);
                        }
                    }
                    FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                    if (frostHunterFaceDetectionPixelFusionBlaze52912 != null && FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52912)) {
                        if (frostHunterOnItemLongClickListenerNovaXTitan1242 != frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                            frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFaceDetectionPixelFusionBlaze52912, frostHunterPreviewOlympianBeta7981);
                        } else if (z4) {
                            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterEditTextPulseHyperion1262(j, false, true);
                        }
                    }
                    if (FrostHunterBundlePulseFusionHero2475 - this.FrostHunterCameraXPixelTurboCosmos9814[i4].FrostHunterBundlePulseFusionHero2475() > 0) {
                        FrostHunterBillingClientFusionVortex9008(i4, false);
                    }
                    this.FrostHunterColorDrawableLegendPhoenixVision7927 -= FrostHunterBundlePulseFusionHero2475 - this.FrostHunterCameraXPixelTurboCosmos9814[i4].FrostHunterBundlePulseFusionHero2475();
                    i4++;
                }
                FrostHunterFragmentBetaMegaVortex6025(zArr2, this.FrostHunterSoundPoolNovaTitanTitan5784);
                frostHunterInsetDrawableCelestialEclipse36014.FrostHunterCameraXPixelTurboCosmos9814 = true;
            } else {
                i = 4;
                frostHunterLooperThreadOlympianAurora47192.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36013);
                if (frostHunterInsetDrawableCelestialEclipse36013.FrostHunterLifecycleBlazeGammaElite2889) {
                    long max = Math.max(frostHunterInsetDrawableCelestialEclipse36013.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633, this.FrostHunterSoundPoolNovaTitanTitan5784 - frostHunterInsetDrawableCelestialEclipse36013.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
                    if (this.FrostHunterMeteringPointMegaCyber7955 && FrostHunterLevelListDrawableFusionDragonHero2232() && this.FrostHunterLooperHyperionForce4133.FrostHunterKeyframeGammaGamma1197 == frostHunterInsetDrawableCelestialEclipse36013) {
                        FrostHunterCameraXPixelTurboCosmos9814();
                    }
                    i2 = 4;
                    frostHunterInsetDrawableCelestialEclipse36013.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlertDialogAuroraDelta3200, max, false, new boolean[frostHunterInsetDrawableCelestialEclipse36013.FrostHunterAlertDialogAuroraDelta3200.length]);
                    FrostHunterLooperThreadBetaHyperionMax1000(true);
                    if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == i2) {
                        FrostHunterDatabaseEliteShadowUltra2452();
                        FrostHunterBannerAdNebulaMasterBeta4389();
                        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            FrostHunterLooperThreadBetaHyperionMax1000(true);
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == i2) {
            }
        }
    }

    public final long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(long j) {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.FrostHunterSoundPoolNovaTitanTitan5784 - frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223));
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029b, code lost:
    
        if (((long) ((r3.FrostHunterLifecycleBlazeGammaElite2889() - r23.FrostHunterSoundPoolNovaTitanTitan5784) / r23.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761)) > 10000000) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterFirebaseModelInterpreterEclipseEpicQuantum5402() {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601;
        long j;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013;
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719;
        boolean z;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36014;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36015;
        FrostHunterInsetDrawableCelestialEclipse3601 FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z2;
        int i;
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr2;
        int i2;
        boolean z3;
        boolean z4;
        char c;
        int i3;
        int i4;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36016;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36017;
        boolean z5;
        int i5;
        if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || !this.FrostHunterMeteringPointBetaCyber9571.FrostHunterKeyframeGammaGamma1197) {
            return;
        }
        this.FrostHunterLooperHyperionForce4133.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterSoundPoolNovaTitanTitan5784);
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47192 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36018 = frostHunterLooperThreadOlympianAurora47192.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterInsetDrawableCelestialEclipse36018 == null || (!frostHunterInsetDrawableCelestialEclipse36018.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterKeyframeGammaGamma1197 && frostHunterInsetDrawableCelestialEclipse36018.FrostHunterRemoteConfigSpeedSpeed8566() && frostHunterLooperThreadOlympianAurora47192.FrostHunterFragmentBetaMegaVortex6025.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232 != -9223372036854775807L && frostHunterLooperThreadOlympianAurora47192.FrostHunterLightSensorForceFusion4241 < 100)) {
            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47193 = this.FrostHunterLooperHyperionForce4133;
            long j2 = this.FrostHunterSoundPoolNovaTitanTitan5784;
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36019 = frostHunterLooperThreadOlympianAurora47193.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterWorkManagerUltraQuantumCosmos6075 FrostHunterServiceEliteCelestialThunder1757 = frostHunterInsetDrawableCelestialEclipse36019 == null ? frostHunterLooperThreadOlympianAurora47193.FrostHunterServiceEliteCelestialThunder1757(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475, frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823, -9223372036854775807L) : frostHunterLooperThreadOlympianAurora47193.FrostHunterBundlePulseFusionHero2475(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse36019, j2);
            if (FrostHunterServiceEliteCelestialThunder1757 != null) {
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47194 = this.FrostHunterLooperHyperionForce4133;
                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360110 = frostHunterLooperThreadOlympianAurora47194.FrostHunterFragmentBetaMegaVortex6025;
                long j3 = frostHunterInsetDrawableCelestialEclipse360110 == null ? 1000000000000L : (frostHunterInsetDrawableCelestialEclipse360110.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 + frostHunterInsetDrawableCelestialEclipse360110.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232) - FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                int i6 = 0;
                while (true) {
                    if (i6 >= frostHunterLooperThreadOlympianAurora47194.FrostHunterLintTitanVortexQuantum9911.size()) {
                        frostHunterInsetDrawableCelestialEclipse3601 = null;
                        break;
                    }
                    FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos6075 = ((FrostHunterInsetDrawableCelestialEclipse3601) frostHunterLooperThreadOlympianAurora47194.FrostHunterLintTitanVortexQuantum9911.get(i6)).FrostHunterRemoteConfigSpeedSpeed8566;
                    long j4 = frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterLevelListDrawableFusionDragonHero2232;
                    long j5 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterLevelListDrawableFusionDragonHero2232;
                    if ((j4 == -9223372036854775807L || j4 == j5) && frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterConstraintSetCloneMasterUltraRogue2633 == FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633 && frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterAlphaAnimationNeoCosmos5761.equals(FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761)) {
                        frostHunterInsetDrawableCelestialEclipse3601 = (FrostHunterInsetDrawableCelestialEclipse3601) frostHunterLooperThreadOlympianAurora47194.FrostHunterLintTitanVortexQuantum9911.remove(i6);
                        break;
                    }
                    i6++;
                }
                if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
                    FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946 = (FrostHunterPackageManagerEclipseTitanPulse8946) frostHunterLooperThreadOlympianAurora47194.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterKeyframeGammaGamma1197;
                    FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterDatabaseEliteShadowUltra2452;
                    frostHunterMeteringPointEclipseTitan1504.getClass();
                    j = -9223372036854775807L;
                    FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = new FrostHunterTraceHyperionAuroraNebula9947(frostHunterMeteringPointEclipseTitan1504, frostHunterToolbarPixelHyperion1536);
                    FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterMeteringPointBetaCyber9571;
                    FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterFragmentBetaMegaVortex6025;
                    frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterViewPager2StrikePulse8790.getClass();
                    frostHunterInsetDrawableCelestialEclipse3601 = new FrostHunterInsetDrawableCelestialEclipse3601(frostHunterFaceDetectionPixelFusionBlaze5291Arr, j3, frostHunterLiveDataScopeShadowCelestialMax5831, frostHunterTraceHyperionAuroraNebula9947, frostHunterModelInputOutputStrikePrime1569, FrostHunterServiceEliteCelestialThunder1757, frostHunterSurfaceViewPhantomHyperion3032);
                } else {
                    j = -9223372036854775807L;
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterServiceEliteCelestialThunder1757;
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j3;
                }
                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360111 = frostHunterLooperThreadOlympianAurora47194.FrostHunterFragmentBetaMegaVortex6025;
                if (frostHunterInsetDrawableCelestialEclipse360111 == null) {
                    frostHunterLooperThreadOlympianAurora47194.FrostHunterFlowMaxDragonHero5809 = frostHunterInsetDrawableCelestialEclipse3601;
                    frostHunterLooperThreadOlympianAurora47194.FrostHunterAlertDialogAuroraDelta3200 = frostHunterInsetDrawableCelestialEclipse3601;
                    frostHunterLooperThreadOlympianAurora47194.FrostHunterKeyframeGammaGamma1197 = frostHunterInsetDrawableCelestialEclipse3601;
                } else if (frostHunterInsetDrawableCelestialEclipse3601 != frostHunterInsetDrawableCelestialEclipse360111.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                    frostHunterInsetDrawableCelestialEclipse360111.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    frostHunterInsetDrawableCelestialEclipse360111.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterInsetDrawableCelestialEclipse3601;
                    frostHunterInsetDrawableCelestialEclipse360111.FrostHunterBundlePulseFusionHero2475();
                }
                frostHunterLooperThreadOlympianAurora47194.FrostHunterScaleAnimationStrikeSpark5059 = null;
                frostHunterLooperThreadOlympianAurora47194.FrostHunterFragmentBetaMegaVortex6025 = frostHunterInsetDrawableCelestialEclipse3601;
                frostHunterLooperThreadOlympianAurora47194.FrostHunterLightSensorForceFusion4241++;
                frostHunterLooperThreadOlympianAurora47194.FrostHunterFragmentBetaMegaVortex6025();
                if (!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757) {
                    long j6 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757 = true;
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(this, j6);
                } else if (frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
                    this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(8, frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                }
                if (this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809 == frostHunterInsetDrawableCelestialEclipse3601) {
                    FrostHunterPagingSourceEclipseDelta8255(FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633, true);
                }
                FrostHunterLooperThreadBetaHyperionMax1000(false);
                if (this.FrostHunterPushNotificationStormTitanGamma8999) {
                    FrostHunterDatabaseEliteShadowUltra2452();
                } else {
                    this.FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterMeteringPointBetaCyber9571(this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025);
                    FrostHunterDrawableCompatHeroMasterSpectra7412();
                }
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47195 = this.FrostHunterLooperHyperionForce4133;
                if (!this.FrostHunterTransitionListenerPulseVortexCosmos7949 && this.FrostHunterMeteringPointMegaCyber7955 && !this.FrostHunterAlphaAnimationNovaGamma6326 && !FrostHunterLevelListDrawableFusionDragonHero2232() && (frostHunterInsetDrawableCelestialEclipse36016 = frostHunterLooperThreadOlympianAurora47195.FrostHunterKeyframeGammaGamma1197) != null && frostHunterInsetDrawableCelestialEclipse36016 == frostHunterLooperThreadOlympianAurora47195.FrostHunterAlertDialogAuroraDelta3200 && (frostHunterInsetDrawableCelestialEclipse36017 = frostHunterInsetDrawableCelestialEclipse36016.FrostHunterServiceConnectionTurboPhoenixOmega6719) != null && (z5 = frostHunterInsetDrawableCelestialEclipse36017.FrostHunterLifecycleBlazeGammaElite2889)) {
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z5);
                    if (((long) ((frostHunterInsetDrawableCelestialEclipse36017.FrostHunterLifecycleBlazeGammaElite2889() - this.FrostHunterSoundPoolNovaTitanTitan5784) / this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761)) <= 10000000) {
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360112 = frostHunterLooperThreadOlympianAurora47195.FrostHunterKeyframeGammaGamma1197;
                        frostHunterInsetDrawableCelestialEclipse360112.getClass();
                        frostHunterLooperThreadOlympianAurora47195.FrostHunterKeyframeGammaGamma1197 = frostHunterInsetDrawableCelestialEclipse360112.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        frostHunterLooperThreadOlympianAurora47195.FrostHunterFragmentBetaMegaVortex6025();
                        frostHunterLooperThreadOlympianAurora47195.FrostHunterKeyframeGammaGamma1197.getClass();
                        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr3 = this.FrostHunterCameraXPixelTurboCosmos9814;
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360113 = frostHunterLooperThreadOlympianAurora47195.FrostHunterKeyframeGammaGamma1197;
                        if (frostHunterInsetDrawableCelestialEclipse360113 != null) {
                            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = frostHunterInsetDrawableCelestialEclipse360113.FrostHunterScaleAnimationStrikeSpark5059;
                            for (int i7 = 0; i7 < frostHunterPaintAuroraNovaXPulse1290Arr3.length; i7++) {
                                if (frostHunterSurfaceViewPhantomHyperion30322.FrostHunterServiceEliteCelestialThunder1757(i7)) {
                                    FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = frostHunterPaintAuroraNovaXPulse1290Arr3[i7];
                                    if (frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475 != null && !frostHunterPaintAuroraNovaXPulse1290.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12902 = frostHunterPaintAuroraNovaXPulse1290Arr3[i7];
                                        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterPaintAuroraNovaXPulse12902.FrostHunterLevelListDrawableFusionDragonHero2232());
                                        if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterPaintAuroraNovaXPulse12902.FrostHunterAlphaAnimationNeoCosmos5761)) {
                                            i5 = 3;
                                        } else {
                                            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse12902.FrostHunterBundlePulseFusionHero2475;
                                            i5 = (frostHunterFaceDetectionPixelFusionBlaze5291 == null || frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 == 0) ? 2 : 4;
                                        }
                                        frostHunterPaintAuroraNovaXPulse12902.FrostHunterServiceEliteCelestialThunder1757 = i5;
                                        FrostHunterKeyframeGammaGamma1197(frostHunterInsetDrawableCelestialEclipse360113, i7, false, frostHunterInsetDrawableCelestialEclipse360113.FrostHunterLifecycleBlazeGammaElite2889());
                                    }
                                }
                            }
                            if (FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                this.FrostHunterPlaceholderLegendForceNebula9869 = frostHunterInsetDrawableCelestialEclipse360113.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232();
                                if (!frostHunterInsetDrawableCelestialEclipse360113.FrostHunterRemoteConfigSpeedSpeed8566()) {
                                    frostHunterLooperThreadOlympianAurora47195.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse360113);
                                    FrostHunterLooperThreadBetaHyperionMax1000(false);
                                    FrostHunterDatabaseEliteShadowUltra2452();
                                }
                            }
                        }
                    }
                }
                boolean z6 = this.FrostHunterMeteringPointMegaCyber7955;
                FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr4 = this.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47196 = this.FrostHunterLooperHyperionForce4133;
                frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterInsetDrawableCelestialEclipse36012 != null) {
                    if (frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719 == null || this.FrostHunterTransitionListenerPulseVortexCosmos7949) {
                        if (frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterKeyframeGammaGamma1197 || this.FrostHunterTransitionListenerPulseVortexCosmos7949) {
                            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12903 : frostHunterPaintAuroraNovaXPulse1290Arr4) {
                                if (frostHunterPaintAuroraNovaXPulse12903.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012) != null) {
                                    FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder17572 = frostHunterPaintAuroraNovaXPulse12903.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012);
                                    FrostHunterServiceEliteCelestialThunder17572.getClass();
                                    if (FrostHunterServiceEliteCelestialThunder17572.FrostHunterFragmentBetaMegaVortex6025()) {
                                        long j7 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterLevelListDrawableFusionDragonHero2232;
                                        long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + frostHunterInsetDrawableCelestialEclipse36012.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                                        FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder17573 = frostHunterPaintAuroraNovaXPulse12903.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012);
                                        FrostHunterServiceEliteCelestialThunder17573.getClass();
                                        FrostHunterPaintAuroraNovaXPulse1290.FrostHunterFragmentBetaMegaVortex6025(FrostHunterServiceEliteCelestialThunder17573, j8);
                                    }
                                }
                            }
                        }
                    } else if (frostHunterInsetDrawableCelestialEclipse36012.FrostHunterLifecycleBlazeGammaElite2889) {
                        int i8 = 0;
                        while (true) {
                            if (i8 < frostHunterPaintAuroraNovaXPulse1290Arr4.length) {
                                FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12904 = frostHunterPaintAuroraNovaXPulse1290Arr4[i8];
                                if (!frostHunterPaintAuroraNovaXPulse12904.FrostHunterLifecycleBlazeGammaElite2889(frostHunterInsetDrawableCelestialEclipse36012, frostHunterPaintAuroraNovaXPulse12904.FrostHunterAlphaAnimationNeoCosmos5761) || !frostHunterPaintAuroraNovaXPulse12904.FrostHunterLifecycleBlazeGammaElite2889(frostHunterInsetDrawableCelestialEclipse36012, frostHunterPaintAuroraNovaXPulse12904.FrostHunterBundlePulseFusionHero2475)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else if (!FrostHunterLevelListDrawableFusionDragonHero2232() || frostHunterLooperThreadOlympianAurora47196.FrostHunterKeyframeGammaGamma1197 != frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200) {
                                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360114 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                if (frostHunterInsetDrawableCelestialEclipse360114.FrostHunterLifecycleBlazeGammaElite2889 || this.FrostHunterSoundPoolNovaTitanTitan5784 >= frostHunterInsetDrawableCelestialEclipse360114.FrostHunterLifecycleBlazeGammaElite2889()) {
                                    boolean z7 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterLifecycleBlazeGammaElite2889;
                                    if (z7) {
                                        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z7);
                                    }
                                    FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30323 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterScaleAnimationStrikeSpark5059;
                                    FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360115 = frostHunterLooperThreadOlympianAurora47196.FrostHunterKeyframeGammaGamma1197;
                                    FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360116 = frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200;
                                    if (frostHunterInsetDrawableCelestialEclipse360115 == frostHunterInsetDrawableCelestialEclipse360116) {
                                        frostHunterInsetDrawableCelestialEclipse360116.getClass();
                                        frostHunterLooperThreadOlympianAurora47196.FrostHunterKeyframeGammaGamma1197 = frostHunterInsetDrawableCelestialEclipse360116.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                    }
                                    FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360117 = frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200;
                                    frostHunterInsetDrawableCelestialEclipse360117.getClass();
                                    frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200 = frostHunterInsetDrawableCelestialEclipse360117.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                    frostHunterLooperThreadOlympianAurora47196.FrostHunterFragmentBetaMegaVortex6025();
                                    FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse360118 = frostHunterLooperThreadOlympianAurora47196.FrostHunterAlertDialogAuroraDelta3200;
                                    frostHunterInsetDrawableCelestialEclipse360118.getClass();
                                    FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30324 = frostHunterInsetDrawableCelestialEclipse360118.FrostHunterScaleAnimationStrikeSpark5059;
                                    FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                                    FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper7105, frostHunterInsetDrawableCelestialEclipse360118.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStrictModeNebulaEliteHyper7105, frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761, -9223372036854775807L, false);
                                    if (frostHunterInsetDrawableCelestialEclipse360118.FrostHunterLifecycleBlazeGammaElite2889 && ((z6 && this.FrostHunterPlaceholderLegendForceNebula9869 != j) || frostHunterInsetDrawableCelestialEclipse360118.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232() != j)) {
                                        this.FrostHunterPlaceholderLegendForceNebula9869 = j;
                                        boolean z8 = z6 && !this.FrostHunterAlphaAnimationNovaGamma6326;
                                        if (z8) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= frostHunterPaintAuroraNovaXPulse1290Arr4.length) {
                                                    break;
                                                }
                                                boolean FrostHunterServiceEliteCelestialThunder17574 = frostHunterSurfaceViewPhantomHyperion30324.FrostHunterServiceEliteCelestialThunder1757(i9);
                                                FrostHunterBindingAdapterOmegaBlaze8548[] frostHunterBindingAdapterOmegaBlaze8548Arr = (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion30324.FrostHunterAlertDialogAuroraDelta3200;
                                                if (FrostHunterServiceEliteCelestialThunder17574 && frostHunterPaintAuroraNovaXPulse1290Arr4[i9].FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809 != -2 && !FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterBindingAdapterOmegaBlaze8548Arr[i9].FrostHunterCameraXPixelTurboCosmos9814().FrostHunterScaleAnimationStrikeSpark5059, frostHunterBindingAdapterOmegaBlaze8548Arr[i9].FrostHunterCameraXPixelTurboCosmos9814().FrostHunterKeyframeGammaGamma1197) && !frostHunterPaintAuroraNovaXPulse1290Arr4[i9].FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                    z8 = false;
                                                    break;
                                                }
                                                i9++;
                                            }
                                        }
                                        if (!z8) {
                                            long FrostHunterLifecycleBlazeGammaElite2889 = frostHunterInsetDrawableCelestialEclipse360118.FrostHunterLifecycleBlazeGammaElite2889();
                                            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12905 : frostHunterPaintAuroraNovaXPulse1290Arr4) {
                                                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse12905.FrostHunterBundlePulseFusionHero2475;
                                                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52913 = frostHunterPaintAuroraNovaXPulse12905.FrostHunterAlphaAnimationNeoCosmos5761;
                                                if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52913) && (i4 = frostHunterPaintAuroraNovaXPulse12905.FrostHunterServiceEliteCelestialThunder1757) != 4 && i4 != 2) {
                                                    FrostHunterPaintAuroraNovaXPulse1290.FrostHunterFragmentBetaMegaVortex6025(frostHunterFaceDetectionPixelFusionBlaze52913, FrostHunterLifecycleBlazeGammaElite2889);
                                                }
                                                if (frostHunterFaceDetectionPixelFusionBlaze52912 != null) {
                                                    if ((frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterScaleAnimationStrikeSpark5059 != 0) && frostHunterPaintAuroraNovaXPulse12905.FrostHunterServiceEliteCelestialThunder1757 != 3) {
                                                        FrostHunterPaintAuroraNovaXPulse1290.FrostHunterFragmentBetaMegaVortex6025(frostHunterFaceDetectionPixelFusionBlaze52912, FrostHunterLifecycleBlazeGammaElite2889);
                                                    }
                                                }
                                            }
                                            if (!frostHunterInsetDrawableCelestialEclipse360118.FrostHunterRemoteConfigSpeedSpeed8566()) {
                                                frostHunterLooperThreadOlympianAurora47196.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse360118);
                                                FrostHunterLooperThreadBetaHyperionMax1000(false);
                                                FrostHunterDatabaseEliteShadowUltra2452();
                                            }
                                        }
                                    }
                                    for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12906 : frostHunterPaintAuroraNovaXPulse1290Arr4) {
                                        long FrostHunterLifecycleBlazeGammaElite28892 = frostHunterInsetDrawableCelestialEclipse360118.FrostHunterLifecycleBlazeGammaElite2889();
                                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52914 = frostHunterPaintAuroraNovaXPulse12906.FrostHunterAlphaAnimationNeoCosmos5761;
                                        int i10 = frostHunterPaintAuroraNovaXPulse12906.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        boolean FrostHunterServiceEliteCelestialThunder17575 = frostHunterSurfaceViewPhantomHyperion30323.FrostHunterServiceEliteCelestialThunder1757(i10);
                                        boolean FrostHunterServiceEliteCelestialThunder17576 = frostHunterSurfaceViewPhantomHyperion30324.FrostHunterServiceEliteCelestialThunder1757(i10);
                                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52915 = frostHunterPaintAuroraNovaXPulse12906.FrostHunterBundlePulseFusionHero2475;
                                        if (frostHunterFaceDetectionPixelFusionBlaze52915 == null || (i3 = frostHunterPaintAuroraNovaXPulse12906.FrostHunterServiceEliteCelestialThunder1757) == 3 || (i3 == 0 && FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52914))) {
                                            frostHunterFaceDetectionPixelFusionBlaze52915 = frostHunterFaceDetectionPixelFusionBlaze52914;
                                        }
                                        if (!FrostHunterServiceEliteCelestialThunder17575 || frostHunterFaceDetectionPixelFusionBlaze52915.FrostHunterLooperThreadBetaHyperionMax1000) {
                                            c = 65534;
                                        } else {
                                            int i11 = frostHunterFaceDetectionPixelFusionBlaze52914.FrostHunterFlowMaxDragonHero5809;
                                            c = 65534;
                                            boolean z9 = i11 == -2;
                                            FrostHunterResourcesOmegaOlympianOlympian5268 frostHunterResourcesOmegaOlympianOlympian5268 = ((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion30323.FrostHunterFlowMaxDragonHero5809)[i10];
                                            FrostHunterResourcesOmegaOlympianOlympian5268 frostHunterResourcesOmegaOlympianOlympian52682 = ((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion30324.FrostHunterFlowMaxDragonHero5809)[i10];
                                            if (!FrostHunterServiceEliteCelestialThunder17576 || !Objects.equals(frostHunterResourcesOmegaOlympianOlympian52682, frostHunterResourcesOmegaOlympianOlympian5268) || z9 || frostHunterPaintAuroraNovaXPulse12906.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                                                FrostHunterPaintAuroraNovaXPulse1290.FrostHunterFragmentBetaMegaVortex6025(frostHunterFaceDetectionPixelFusionBlaze52915, FrostHunterLifecycleBlazeGammaElite28892);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47197 = this.FrostHunterLooperHyperionForce4133;
                frostHunterInsetDrawableCelestialEclipse36013 = frostHunterLooperThreadOlympianAurora47197.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterInsetDrawableCelestialEclipse36013 != null && frostHunterLooperThreadOlympianAurora47197.FrostHunterFlowMaxDragonHero5809 != frostHunterInsetDrawableCelestialEclipse36013 && !frostHunterInsetDrawableCelestialEclipse36013.FrostHunterCameraXPixelTurboCosmos9814) {
                    frostHunterPaintAuroraNovaXPulse1290Arr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                    FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30325 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterScaleAnimationStrikeSpark5059;
                    z3 = true;
                    for (i2 = 0; i2 < frostHunterPaintAuroraNovaXPulse1290Arr2.length; i2++) {
                        int FrostHunterBundlePulseFusionHero2475 = frostHunterPaintAuroraNovaXPulse1290Arr2[i2].FrostHunterBundlePulseFusionHero2475();
                        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12907 = frostHunterPaintAuroraNovaXPulse1290Arr2[i2];
                        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
                        int FrostHunterAlertDialogAuroraDelta3200 = frostHunterPaintAuroraNovaXPulse12907.FrostHunterAlertDialogAuroraDelta3200(frostHunterPaintAuroraNovaXPulse12907.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse36013, frostHunterSurfaceViewPhantomHyperion30325, frostHunterPreviewOlympianBeta7981);
                        int FrostHunterAlertDialogAuroraDelta32002 = frostHunterPaintAuroraNovaXPulse12907.FrostHunterAlertDialogAuroraDelta3200(frostHunterPaintAuroraNovaXPulse12907.FrostHunterBundlePulseFusionHero2475, frostHunterInsetDrawableCelestialEclipse36013, frostHunterSurfaceViewPhantomHyperion30325, frostHunterPreviewOlympianBeta7981);
                        if (FrostHunterAlertDialogAuroraDelta3200 == 1) {
                            FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta32002;
                        }
                        if ((FrostHunterAlertDialogAuroraDelta3200 & 2) != 0 && (z4 = this.FrostHunterColorStateListInflaterNovaQuantum4229) && z4) {
                            this.FrostHunterColorStateListInflaterNovaQuantum4229 = false;
                            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                                this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                            }
                        }
                        this.FrostHunterColorDrawableLegendPhoenixVision7927 -= FrostHunterBundlePulseFusionHero2475 - frostHunterPaintAuroraNovaXPulse1290Arr2[i2].FrostHunterBundlePulseFusionHero2475();
                        z3 &= (FrostHunterAlertDialogAuroraDelta3200 & 1) != 0;
                    }
                    if (z3) {
                        for (int i12 = 0; i12 < frostHunterPaintAuroraNovaXPulse1290Arr2.length; i12++) {
                            if (frostHunterSurfaceViewPhantomHyperion30325.FrostHunterServiceEliteCelestialThunder1757(i12)) {
                                if (!(frostHunterPaintAuroraNovaXPulse1290Arr2[i12].FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36013) != null)) {
                                    FrostHunterKeyframeGammaGamma1197(frostHunterInsetDrawableCelestialEclipse36013, i12, false, frostHunterInsetDrawableCelestialEclipse36013.FrostHunterLifecycleBlazeGammaElite2889());
                                }
                            }
                        }
                    }
                    if (z3) {
                        frostHunterLooperThreadOlympianAurora47197.FrostHunterAlertDialogAuroraDelta3200.FrostHunterCameraXPixelTurboCosmos9814 = true;
                    }
                }
                frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
                z = false;
                while (FrostHunterViewModelScopeTitanRogue1970() && !this.FrostHunterTransitionListenerPulseVortexCosmos7949 && (frostHunterInsetDrawableCelestialEclipse36014 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809) != null && (frostHunterInsetDrawableCelestialEclipse36015 = frostHunterInsetDrawableCelestialEclipse36014.FrostHunterServiceConnectionTurboPhoenixOmega6719) != null && this.FrostHunterSoundPoolNovaTitanTitan5784 >= frostHunterInsetDrawableCelestialEclipse36015.FrostHunterLifecycleBlazeGammaElite2889() && frostHunterInsetDrawableCelestialEclipse36015.FrostHunterCameraXPixelTurboCosmos9814) {
                    if (z) {
                        FrostHunterViewPhantomNeo1634();
                    }
                    this.FrostHunterAlphaAnimationNovaGamma6326 = false;
                    FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLooperThreadOlympianAurora4719.FrostHunterAlphaAnimationNeoCosmos5761();
                    FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                    if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761.equals(FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761)) {
                        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        if (frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterConstraintSetCloneMasterUltraRogue2633 == -1) {
                            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterConstraintSetCloneMasterUltraRogue2633 == -1 && frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterLifecycleBlazeGammaElite2889 != frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterLifecycleBlazeGammaElite2889) {
                                z2 = true;
                                FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos60752 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566;
                                boolean z10 = z2;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterWorkManagerUltraQuantumCosmos60752.FrostHunterAlphaAnimationNeoCosmos5761;
                                long j9 = frostHunterWorkManagerUltraQuantumCosmos60752.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69603, j9, frostHunterWorkManagerUltraQuantumCosmos60752.FrostHunterServiceEliteCelestialThunder1757, j9, !z10, 0);
                                FrostHunterPermissionInfoAlphaDelta6279();
                                FrostHunterBannerAdNebulaMasterBeta4389();
                                if (FrostHunterLevelListDrawableFusionDragonHero2232() && FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197) {
                                    for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12908 : frostHunterPaintAuroraNovaXPulse1290Arr) {
                                        int i13 = frostHunterPaintAuroraNovaXPulse12908.FrostHunterServiceEliteCelestialThunder1757;
                                        if (i13 == 3 || i13 == 4) {
                                            boolean z11 = i13 == 4;
                                            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52916 = frostHunterPaintAuroraNovaXPulse12908.FrostHunterAlphaAnimationNeoCosmos5761;
                                            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52917 = frostHunterPaintAuroraNovaXPulse12908.FrostHunterBundlePulseFusionHero2475;
                                            if (z11) {
                                                frostHunterFaceDetectionPixelFusionBlaze52917.getClass();
                                                frostHunterFaceDetectionPixelFusionBlaze52917.FrostHunterConstraintSetCloneMasterUltraRogue2633(17, frostHunterFaceDetectionPixelFusionBlaze52916);
                                            } else {
                                                frostHunterFaceDetectionPixelFusionBlaze52917.getClass();
                                                frostHunterFaceDetectionPixelFusionBlaze52916.FrostHunterConstraintSetCloneMasterUltraRogue2633(17, frostHunterFaceDetectionPixelFusionBlaze52917);
                                            }
                                            frostHunterPaintAuroraNovaXPulse12908.FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse12908.FrostHunterServiceEliteCelestialThunder1757 == 4 ? 0 : 1;
                                        } else if (i13 == 2) {
                                            frostHunterPaintAuroraNovaXPulse12908.FrostHunterServiceEliteCelestialThunder1757 = 0;
                                        }
                                    }
                                }
                                if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3) {
                                    FrostHunterCoordinatorLayoutGammaTurboSpark2420();
                                }
                                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30326 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809.FrostHunterScaleAnimationStrikeSpark5059;
                                for (i = 0; i < frostHunterPaintAuroraNovaXPulse1290Arr.length; i++) {
                                    if (frostHunterSurfaceViewPhantomHyperion30326.FrostHunterServiceEliteCelestialThunder1757(i)) {
                                        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse12909 = frostHunterPaintAuroraNovaXPulse1290Arr[i];
                                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52918 = frostHunterPaintAuroraNovaXPulse12909.FrostHunterBundlePulseFusionHero2475;
                                        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52919 = frostHunterPaintAuroraNovaXPulse12909.FrostHunterAlphaAnimationNeoCosmos5761;
                                        if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52919)) {
                                            frostHunterFaceDetectionPixelFusionBlaze52919.FrostHunterCameraXPixelTurboCosmos9814();
                                        } else if (frostHunterFaceDetectionPixelFusionBlaze52918 != null) {
                                            if (frostHunterFaceDetectionPixelFusionBlaze52918.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
                                                frostHunterFaceDetectionPixelFusionBlaze52918.FrostHunterCameraXPixelTurboCosmos9814();
                                            }
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z2 = false;
                    FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos607522 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566;
                    boolean z102 = z2;
                    FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper696032 = frostHunterWorkManagerUltraQuantumCosmos607522.FrostHunterAlphaAnimationNeoCosmos5761;
                    long j92 = frostHunterWorkManagerUltraQuantumCosmos607522.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper696032, j92, frostHunterWorkManagerUltraQuantumCosmos607522.FrostHunterServiceEliteCelestialThunder1757, j92, !z102, 0);
                    FrostHunterPermissionInfoAlphaDelta6279();
                    FrostHunterBannerAdNebulaMasterBeta4389();
                    if (FrostHunterLevelListDrawableFusionDragonHero2232()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3) {
                    }
                    FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion303262 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809.FrostHunterScaleAnimationStrikeSpark5059;
                    while (i < frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                    }
                    z = true;
                }
                this.FrostHunterViewPager2StrikePulse8790.getClass();
            }
        }
        j = -9223372036854775807L;
        if (this.FrostHunterPushNotificationStormTitanGamma8999) {
        }
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora471952 = this.FrostHunterLooperHyperionForce4133;
        if (!this.FrostHunterTransitionListenerPulseVortexCosmos7949) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(z5);
            if (((long) ((frostHunterInsetDrawableCelestialEclipse36017.FrostHunterLifecycleBlazeGammaElite2889() - this.FrostHunterSoundPoolNovaTitanTitan5784) / this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761)) <= 10000000) {
            }
        }
        boolean z62 = this.FrostHunterMeteringPointMegaCyber7955;
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr42 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora471962 = this.FrostHunterLooperHyperionForce4133;
        frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora471962.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterInsetDrawableCelestialEclipse36012 != null) {
        }
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora471972 = this.FrostHunterLooperHyperionForce4133;
        frostHunterInsetDrawableCelestialEclipse36013 = frostHunterLooperThreadOlympianAurora471972.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterInsetDrawableCelestialEclipse36013 != null) {
            frostHunterPaintAuroraNovaXPulse1290Arr2 = this.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion303252 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterScaleAnimationStrikeSpark5059;
            z3 = true;
            while (i2 < frostHunterPaintAuroraNovaXPulse1290Arr2.length) {
            }
            if (z3) {
            }
            if (z3) {
            }
        }
        frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        z = false;
        while (FrostHunterViewModelScopeTitanRogue1970()) {
            if (z) {
            }
            this.FrostHunterAlphaAnimationNovaGamma6326 = false;
            FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLooperThreadOlympianAurora4719.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761.equals(FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761)) {
            }
            z2 = false;
            FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos6075222 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566;
            boolean z1022 = z2;
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960322 = frostHunterWorkManagerUltraQuantumCosmos6075222.FrostHunterAlphaAnimationNeoCosmos5761;
            long j922 = frostHunterWorkManagerUltraQuantumCosmos6075222.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960322, j922, frostHunterWorkManagerUltraQuantumCosmos6075222.FrostHunterServiceEliteCelestialThunder1757, j922, !z1022, 0);
            FrostHunterPermissionInfoAlphaDelta6279();
            FrostHunterBannerAdNebulaMasterBeta4389();
            if (FrostHunterLevelListDrawableFusionDragonHero2232()) {
            }
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3) {
            }
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032622 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809.FrostHunterScaleAnimationStrikeSpark5059;
            while (i < frostHunterPaintAuroraNovaXPulse1290Arr.length) {
            }
            z = true;
        }
        this.FrostHunterViewPager2StrikePulse8790.getClass();
    }

    public final void FrostHunterFlowMaxDragonHero5809(int i) {
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
        int FrostHunterBundlePulseFusionHero2475 = frostHunterPaintAuroraNovaXPulse1290Arr[i].FrostHunterBundlePulseFusionHero2475();
        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = frostHunterPaintAuroraNovaXPulse1290Arr[i];
        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFaceDetectionPixelFusionBlaze5291, frostHunterPreviewOlympianBeta7981);
        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterFaceDetectionPixelFusionBlaze52912 != null) {
            boolean z = (frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterScaleAnimationStrikeSpark5059 == 0 || frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757 == 3) ? false : true;
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFaceDetectionPixelFusionBlaze52912, frostHunterPreviewOlympianBeta7981);
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterFlowMaxDragonHero5809(false);
            if (z) {
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52913 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterFaceDetectionPixelFusionBlaze52912.getClass();
                frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterConstraintSetCloneMasterUltraRogue2633(17, frostHunterFaceDetectionPixelFusionBlaze52913);
            }
        }
        frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757 = 0;
        FrostHunterBillingClientFusionVortex9008(i, false);
        this.FrostHunterColorDrawableLegendPhoenixVision7927 -= FrostHunterBundlePulseFusionHero2475;
    }

    public final void FrostHunterFragmentBetaMegaVortex6025(boolean[] zArr, long j) {
        FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr;
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946;
        long j2;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059;
        int i = 0;
        while (true) {
            frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                break;
            }
            if (!frostHunterSurfaceViewPhantomHyperion3032.FrostHunterServiceEliteCelestialThunder1757(i)) {
                frostHunterPaintAuroraNovaXPulse1290Arr[i].FrostHunterKeyframeGammaGamma1197();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < frostHunterPaintAuroraNovaXPulse1290Arr.length) {
            if (frostHunterSurfaceViewPhantomHyperion3032.FrostHunterServiceEliteCelestialThunder1757(i2) && frostHunterPaintAuroraNovaXPulse1290Arr[i2].FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601) == null) {
                frostHunterPackageManagerEclipseTitanPulse8946 = this;
                j2 = j;
                frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterKeyframeGammaGamma1197(frostHunterInsetDrawableCelestialEclipse3601, i2, zArr[i2], j2);
            } else {
                frostHunterPackageManagerEclipseTitanPulse8946 = this;
                j2 = j;
            }
            i2++;
            this = frostHunterPackageManagerEclipseTitanPulse8946;
            j = j2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterGyroscopeOmegaEclipseOlympian7225(FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960, FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032) {
        boolean z;
        int length;
        int i;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterInsetDrawableCelestialEclipse3601.getClass();
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757());
        if (FrostHunterBindingAdapterInfernoFusionForce2284(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761)) {
            long j = this.FrostHunterServiceInfoHyperionSparkMax9966.FrostHunterCameraXPixelTurboCosmos9814;
        }
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
        float f = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterBundlePulseFusionHero2475().FrostHunterAlphaAnimationNeoCosmos5761;
        boolean z2 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterBindingAdapterOmegaBlaze8548[] frostHunterBindingAdapterOmegaBlaze8548Arr = (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterAlertDialogAuroraDelta3200;
        FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        frostHunterMeteringPointEclipseTitan1504.getClass();
        FrostHunterContentObserverOmegaEclipseHyper3428 frostHunterContentObserverOmegaEclipseHyper3428 = frostHunterMeteringPointEclipseTitan1504.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
        Integer num = (Integer) frostHunterContentObserverOmegaEclipseHyper3428.get(frostHunterToolbarPixelHyperion1536.FrostHunterAlphaAnimationNeoCosmos5761);
        int intValue = (num == null || num.intValue() == -1) ? frostHunterMeteringPointEclipseTitan1504.FrostHunterFragmentBetaMegaVortex6025 : num.intValue();
        FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.get(frostHunterToolbarPixelHyperion1536);
        frostHunterTransformForceShadowSolar6619.getClass();
        if (intValue == -1) {
            FrostHunterExoPlayerDeltaBlazeStorm6993 frostHunterExoPlayerDeltaBlazeStorm6993 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMeteringPointEclipseTitan1504.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterBundlePulseFusionHero2475, frostHunterMeteringPointEclipseTitan1504.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterExoPlayerDeltaBlazeStorm6993 != null) {
                String scheme = frostHunterExoPlayerDeltaBlazeStorm6993.FrostHunterAlphaAnimationNeoCosmos5761.getScheme();
                if (TextUtils.isEmpty(scheme) || FrostHunterMeteringPointEclipseTitan1504.FrostHunterCameraXTurboCelestialHero5430.contains(scheme)) {
                    z = true;
                    length = frostHunterBindingAdapterOmegaBlaze8548Arr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 = frostHunterBindingAdapterOmegaBlaze8548Arr[i];
                            if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                                switch (frostHunterBindingAdapterOmegaBlaze8548.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterBundlePulseFusionHero2475) {
                                    case -2:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = FrostHunterGyroscopeHeroAlpha1995.FrostHunterRemoteConfigSpeedSpeed8566(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = frostHunterBindingAdapterOmegaBlaze8548Arr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        frostHunterTransformForceShadowSolar6619.FrostHunterBundlePulseFusionHero2475 = intValue;
        frostHunterMeteringPointEclipseTitan1504.FrostHunterBundlePulseFusionHero2475();
    }

    public final void FrostHunterImageAnalysisGammaOlympian2400(int i) {
        this.FrostHunterConstraintSetCloneOmegaHyperion9304 = i;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        frostHunterLooperThreadOlympianAurora4719.FrostHunterRemoteConfigSpeedSpeed8566 = i;
        int FrostHunterCameraXTurboCelestialHero5430 = frostHunterLooperThreadOlympianAurora4719.FrostHunterCameraXTurboCelestialHero5430(frostHunterStrictModeNebulaEliteHyper7105);
        if ((FrostHunterCameraXTurboCelestialHero5430 & 1) != 0) {
            FrostHunterPushNotificationStormTitanGamma8999(true);
        } else if ((FrostHunterCameraXTurboCelestialHero5430 & 2) != 0) {
            FrostHunterCameraXPixelTurboCosmos9814();
        }
        FrostHunterLooperThreadBetaHyperionMax1000(false);
    }

    public final void FrostHunterInAppPurchaseLegendEpicDragon4579(boolean z) {
        if (!z) {
            FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper3417 = this.FrostHunterR8MasterNebulaSpark7247;
            FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (frostHunterAnimatorSetEliteHyper3417 != null && this.FrostHunterPagingDataTurboTitanium7332 && !frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.hasMessages(37)) {
                this.FrostHunterFCMDeltaQuantumHero8364++;
            }
            int i = this.FrostHunterFCMDeltaQuantumHero8364;
            if (i > 0) {
                this.FrostHunterViewPhantomNeo1634.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterFilterAlphaSparkSpeed9857(this, i));
            }
            this.FrostHunterFCMDeltaQuantumHero8364 = 0;
            this.FrostHunterPagingDataTurboTitanium7332 = false;
            frostHunterRotateDrawableMaxPrime8918.FrostHunterLifecycleBlazeGammaElite2889(37);
            FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper34172 = this.FrostHunterR8MasterNebulaSpark7247;
            if (frostHunterAnimatorSetEliteHyper34172 != null) {
                FrostHunterConstraintSetCloneOmegaHyperion9304(frostHunterAnimatorSetEliteHyper34172);
                this.FrostHunterR8MasterNebulaSpark7247 = null;
                this.FrostHunterPagingDataTurboTitanium7332 = false;
            }
        }
        this.FrostHunterMagnetometerFusionTitanium8202 = z;
        FrostHunterLifecycleBlazeGammaElite2889();
    }

    public final void FrostHunterItemDecorationPhoenixAlphaVortex8006() {
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
        FrostHunterOnItemClickListenerTitaniumTitanEpic5303 frostHunterOnItemClickListenerTitaniumTitanEpic5303 = frostHunterPreviewOlympianBeta7981.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809) {
            frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLifecycleBlazeGammaElite2889());
            frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809 = false;
        }
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52912)) {
                FrostHunterPaintAuroraNovaXPulse1290.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFaceDetectionPixelFusionBlaze52912);
            }
            if (frostHunterFaceDetectionPixelFusionBlaze5291 != null && frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
                FrostHunterPaintAuroraNovaXPulse1290.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFaceDetectionPixelFusionBlaze5291);
            }
        }
    }

    public final void FrostHunterItemDecorationPixelShadow2695(boolean z, boolean z2) {
        long j;
        this.FrostHunterRewardedAdSpectraElite8288 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.FrostHunterBitmapTurboDeltaNebula8743.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.FrostHunterRemoteConfigThunderShadow4435 = j;
    }

    public final void FrostHunterKeyframeGammaGamma1197(FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601, int i, boolean z, long j) {
        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = this.FrostHunterCameraXPixelTurboCosmos9814[i];
        boolean FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterRemoteConfigSpeedSpeed8566();
        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterRemoteConfigSpeedSpeed8566) {
            return;
        }
        boolean z2 = frostHunterInsetDrawableCelestialEclipse3601 == this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059;
        FrostHunterResourcesOmegaOlympianOlympian5268 frostHunterResourcesOmegaOlympianOlympian5268 = ((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterFlowMaxDragonHero5809)[i];
        FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 = ((FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterAlertDialogAuroraDelta3200)[i];
        boolean z3 = FrostHunterViewModelScopeTitanRogue1970() && this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 == 3;
        boolean z4 = !z && z3;
        this.FrostHunterColorDrawableLegendPhoenixVision7927++;
        FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterBundlePulseFusionHero2475[i];
        long j2 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
        int length = frostHunterBindingAdapterOmegaBlaze8548 != null ? frostHunterBindingAdapterOmegaBlaze8548.length() : 0;
        FrostHunterFirebaseOlympianMax4818[] frostHunterFirebaseOlympianMax4818Arr = new FrostHunterFirebaseOlympianMax4818[length];
        for (int i2 = 0; i2 < length; i2++) {
            frostHunterBindingAdapterOmegaBlaze8548.getClass();
            frostHunterFirebaseOlympianMax4818Arr[i2] = frostHunterBindingAdapterOmegaBlaze8548.FrostHunterConstraintSetCloneMasterUltraRogue2633(i2);
        }
        int i3 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterLifecycleBlazeGammaElite2889 = true;
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 == 0);
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterKeyframeGammaGamma1197 = frostHunterResourcesOmegaOlympianOlympian5268;
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 = 1;
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLintTitanVortexQuantum9911(z4, z2);
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterServiceInfoHyperionSparkMax9966(frostHunterFirebaseOlympianMax4818Arr, frostHunterOnItemLongClickListenerNovaXTitan1242, j, j2, frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
            frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterEditTextPulseHyperion1262(j, z4, true);
            frostHunterPreviewOlympianBeta7981.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFaceDetectionPixelFusionBlaze5291);
        } else {
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterLevelListDrawableFusionDragonHero2232 = true;
            frostHunterFaceDetectionPixelFusionBlaze52912.getClass();
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterScaleAnimationStrikeSpark5059 == 0);
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterKeyframeGammaGamma1197 = frostHunterResourcesOmegaOlympianOlympian5268;
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterScaleAnimationStrikeSpark5059 = 1;
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterLintTitanVortexQuantum9911(z4, z2);
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterServiceInfoHyperionSparkMax9966(frostHunterFirebaseOlympianMax4818Arr, frostHunterOnItemLongClickListenerNovaXTitan1242, j, j2, frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterEditTextPulseHyperion1262(j, z4, true);
            frostHunterPreviewOlympianBeta7981.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFaceDetectionPixelFusionBlaze52912);
        }
        FrostHunterAnimatorSetEclipseHeroHyperion7191 frostHunterAnimatorSetEclipseHeroHyperion7191 = new FrostHunterAnimatorSetEclipseHeroHyperion7191(this);
        FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
        FrostHunterServiceEliteCelestialThunder1757.getClass();
        FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633(11, frostHunterAnimatorSetEclipseHeroHyperion7191);
        if (z3 && z2) {
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        }
    }

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232() {
        if (!this.FrostHunterMeteringPointMegaCyber7955) {
            return false;
        }
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            if (frostHunterPaintAuroraNovaXPulse1290.FrostHunterLevelListDrawableFusionDragonHero2232()) {
                return true;
            }
        }
        return false;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889() {
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterSupervisorJobBetaMasterNeo7868 frostHunterSupervisorJobBetaMasterNeo7868 = this.FrostHunterMagnetometerFusionTitanium8202 ? this.FrostHunterStateCelestialNovaPixel8414 : null;
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(18, frostHunterSupervisorJobBetaMasterNeo7868);
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterFaceDetectionPixelFusionBlaze5291 != null) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterConstraintSetCloneMasterUltraRogue2633(18, frostHunterSupervisorJobBetaMasterNeo7868);
            }
        }
    }

    public final long FrostHunterLightSensorForceFusion4241(FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601) {
        if (frostHunterInsetDrawableCelestialEclipse3601 == null) {
            return 0L;
        }
        long j = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (!frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
            return j;
        }
        int i = 0;
        while (true) {
            FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                return j;
            }
            if (frostHunterPaintAuroraNovaXPulse1290Arr[i].FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601) != null) {
                FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse1290Arr[i].FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
                Objects.requireNonNull(FrostHunterServiceEliteCelestialThunder1757);
                long j2 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterTextViewDragonStormMega4297;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final void FrostHunterLintTitanVortexQuantum9911(int i) {
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        FrostHunterObjectAnimatorPhoenixSpectraThunder6218(i, frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025);
    }

    public final void FrostHunterLiveDataBetaLegend3442(FrostHunterMotionSceneHyperShadow8814 frostHunterMotionSceneHyperShadow8814) {
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809 == 4) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterConstraintSetCloneMasterUltraRogue2633(23, frostHunterMotionSceneHyperShadow8814);
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterFaceDetectionPixelFusionBlaze52912 != null) {
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterConstraintSetCloneMasterUltraRogue2633(23, frostHunterMotionSceneHyperShadow8814);
                }
            }
        }
    }

    public final FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLooperHyperionForce4133(FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960, long j, long j2, long j3, boolean z, int i) {
        FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205;
        boolean z2;
        this.FrostHunterNestedScrollViewPixelPhantom8605 = (!this.FrostHunterNestedScrollViewPixelPhantom8605 && j == this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823 && frostHunterAnimatedVectorDrawableMasterHeroHyper6960.equals(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633)) ? false : true;
        FrostHunterPermissionInfoAlphaDelta6279();
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan4255 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFlowMaxDragonHero5809;
        List list = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200;
        if (this.FrostHunterMeteringPointBetaCyber9571.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
            frostHunterMergeHyperTitan4255 = frostHunterInsetDrawableCelestialEclipse3601 == null ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLightSensorForceFusion4241;
            frostHunterSurfaceViewPhantomHyperion3032 = frostHunterInsetDrawableCelestialEclipse3601 == null ? this.FrostHunterFragmentBetaMegaVortex6025 : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059;
            FrostHunterBindingAdapterOmegaBlaze8548[] frostHunterBindingAdapterOmegaBlaze8548Arr = (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterTextureViewBlazePhantomDragon5593 frostHunterTextureViewBlazePhantomDragon5593 = new FrostHunterTextureViewBlazePhantomDragon5593(4);
            boolean z3 = false;
            for (FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 : frostHunterBindingAdapterOmegaBlaze8548Arr) {
                if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                    FrostHunterDialogFragmentTitaniumEpicMega8033 frostHunterDialogFragmentTitaniumEpicMega8033 = frostHunterBindingAdapterOmegaBlaze8548.FrostHunterConstraintSetCloneMasterUltraRogue2633(0).FrostHunterFragmentBetaMegaVortex6025;
                    if (frostHunterDialogFragmentTitaniumEpicMega8033 == null) {
                        frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterDialogFragmentTitaniumEpicMega8033(new FrostHunterWithContextVisionPixelCosmos6861[0]));
                    } else {
                        frostHunterTextureViewBlazePhantomDragon5593.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterDialogFragmentTitaniumEpicMega8033);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                frostHunterBitmapNeoCosmos7205 = frostHunterTextureViewBlazePhantomDragon5593.FrostHunterLevelListDrawableFusionDragonHero2232();
            } else {
                FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                frostHunterBitmapNeoCosmos7205 = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
            }
            list = frostHunterBitmapNeoCosmos7205;
            if (frostHunterInsetDrawableCelestialEclipse3601 != null) {
                FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos6075 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566;
                if (frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterServiceEliteCelestialThunder1757 != j2) {
                    frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterAlphaAnimationNeoCosmos5761(j2);
                }
            }
            FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterInsetDrawableCelestialEclipse36012 == frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200 && frostHunterInsetDrawableCelestialEclipse36012 != null) {
                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterScaleAnimationStrikeSpark5059;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= frostHunterPaintAuroraNovaXPulse1290Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (frostHunterSurfaceViewPhantomHyperion30322.FrostHunterServiceEliteCelestialThunder1757(i2)) {
                        if (frostHunterPaintAuroraNovaXPulse1290Arr[i2].FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809 != 1) {
                            z2 = false;
                            break;
                        }
                        if (((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion30322.FrostHunterFlowMaxDragonHero5809)[i2].FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.FrostHunterColorStateListInflaterNovaQuantum4229) {
                    this.FrostHunterColorStateListInflaterNovaQuantum4229 = z5;
                    if (!z5 && this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                    }
                }
            }
        } else if (!frostHunterAnimatedVectorDrawableMasterHeroHyper6960.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
            frostHunterMergeHyperTitan4255 = FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757;
            frostHunterSurfaceViewPhantomHyperion3032 = this.FrostHunterFragmentBetaMegaVortex6025;
            list = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
        }
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30323 = frostHunterSurfaceViewPhantomHyperion3032;
        List list2 = list;
        FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan42552 = frostHunterMergeHyperTitan4255;
        if (z) {
            FrostHunterLinearLayoutRoguePrime1122 frostHunterLinearLayoutRoguePrime1122 = this.FrostHunterPermissionInfoAlphaDelta6279;
            if (!frostHunterLinearLayoutRoguePrime1122.FrostHunterBundlePulseFusionHero2475 || frostHunterLinearLayoutRoguePrime1122.FrostHunterServiceEliteCelestialThunder1757 == 5) {
                frostHunterLinearLayoutRoguePrime1122.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
                frostHunterLinearLayoutRoguePrime1122.FrostHunterBundlePulseFusionHero2475 = true;
                frostHunterLinearLayoutRoguePrime1122.FrostHunterServiceEliteCelestialThunder1757 = i;
            } else {
                FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i == 5);
            }
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
        return frostHunterVelocityTrackerPrimePulse45332.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j, j2, j3, FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45332.FrostHunterLintTitanVortexQuantum9911), frostHunterMergeHyperTitan42552, frostHunterSurfaceViewPhantomHyperion30323, list2);
    }

    public final void FrostHunterLooperThreadBetaHyperionMax1000(boolean z) {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterInsetDrawableCelestialEclipse3601 == null ? this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633 : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean equals = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterKeyframeGammaGamma1197.equals(frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        if (!equals) {
            this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475(frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        frostHunterVelocityTrackerPrimePulse4533.FrostHunterLintTitanVortexQuantum9911 = frostHunterInsetDrawableCelestialEclipse3601 == null ? frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823 : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceEliteCelestialThunder1757();
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
        frostHunterVelocityTrackerPrimePulse45332.FrostHunterCameraXTurboCelestialHero5430 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45332.FrostHunterLintTitanVortexQuantum9911);
        if ((!equals || z) && frostHunterInsetDrawableCelestialEclipse3601 != null && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterLifecycleBlazeGammaElite2889) {
            FrostHunterGyroscopeOmegaEclipseOlympian7225(frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059);
        }
    }

    public final void FrostHunterMagnetometerFusionTitanium8202(FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665) {
        FrostHunterCardViewFusionHeroSpectra3749 frostHunterCardViewFusionHeroSpectra3749 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterScaleAnimationStrikeSpark5059;
        try {
            FrostHunterRewardedAdMasterStrike9463(true, false, true, false);
            FrostHunterPagingDataTurboTitanium7332();
            FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
            ConcurrentHashMap concurrentHashMap = frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) concurrentHashMap.get(frostHunterToolbarPixelHyperion1536);
            if (frostHunterTransformForceShadowSolar6619 != null) {
                int i = frostHunterTransformForceShadowSolar6619.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
                frostHunterTransformForceShadowSolar6619.FrostHunterAlphaAnimationNeoCosmos5761 = i;
                if (i == 0) {
                    concurrentHashMap.remove(frostHunterToolbarPixelHyperion1536);
                    frostHunterMeteringPointEclipseTitan1504.FrostHunterBundlePulseFusionHero2475();
                }
            }
            if (frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.isEmpty()) {
                frostHunterMeteringPointEclipseTitan1504.FrostHunterLintTitanVortexQuantum9911 = -1L;
            }
            FrostHunterManifestPulseSolarHero2561 frostHunterManifestPulseSolarHero2561 = this.FrostHunterBillingClientFusionVortex9008;
            frostHunterManifestPulseSolarHero2561.FrostHunterBundlePulseFusionHero2475 = null;
            frostHunterManifestPulseSolarHero2561.FrostHunterAlphaAnimationNeoCosmos5761();
            frostHunterManifestPulseSolarHero2561.FrostHunterConstraintSetCloneMasterUltraRogue2633(0);
            this.FrostHunterKeyframeGammaGamma1197.FrostHunterFlowMaxDragonHero5809();
            FrostHunterSharedElementPixelTitan2806(1);
        } finally {
            frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.removeCallbacksAndMessages(null);
            frostHunterCardViewFusionHeroSpectra3749.FrostHunterBundlePulseFusionHero2475();
            frostHunterSensorManagerMegaEclipse5665.FrostHunterBundlePulseFusionHero2475();
        }
    }

    public final void FrostHunterMediaPlayerCelestialBetaTitan3868() {
        FrostHunterMotionSceneAuroraMega2271(this.FrostHunterMeteringPointBetaCyber9571.FrostHunterConstraintSetCloneMasterUltraRogue2633(), true);
    }

    public final void FrostHunterMeteringPointMegaCyber7955(int i) {
        FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = this.FrostHunterCameraXPixelTurboCosmos9814[i];
        try {
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
            frostHunterInsetDrawableCelestialEclipse3601.getClass();
            FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
            FrostHunterServiceEliteCelestialThunder1757.getClass();
            FrostHunterOnItemLongClickListenerNovaXTitan1242 frostHunterOnItemLongClickListenerNovaXTitan1242 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            frostHunterOnItemLongClickListenerNovaXTitan1242.getClass();
            frostHunterOnItemLongClickListenerNovaXTitan1242.FrostHunterLifecycleBlazeGammaElite2889();
        } catch (IOException | RuntimeException e) {
            int i2 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809.FrostHunterScaleAnimationStrikeSpark5059;
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Disabling track due to error: ".concat(FrostHunterFirebaseOlympianMax4818.FrostHunterBundlePulseFusionHero2475(((FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterAlertDialogAuroraDelta3200)[i].FrostHunterCameraXPixelTurboCosmos9814())), e);
            FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = new FrostHunterSurfaceViewPhantomHyperion3032((FrostHunterResourcesOmegaOlympianOlympian5268[]) ((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterFlowMaxDragonHero5809).clone(), (FrostHunterBindingAdapterOmegaBlaze8548[]) ((FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterAlertDialogAuroraDelta3200).clone(), (FrostHunterCameraXAuroraVortex8383) frostHunterSurfaceViewPhantomHyperion3032.FrostHunterKeyframeGammaGamma1197, frostHunterSurfaceViewPhantomHyperion3032.FrostHunterFragmentBetaMegaVortex6025);
            ((FrostHunterResourcesOmegaOlympianOlympian5268[]) frostHunterSurfaceViewPhantomHyperion30322.FrostHunterFlowMaxDragonHero5809)[i] = null;
            ((FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterSurfaceViewPhantomHyperion30322.FrostHunterAlertDialogAuroraDelta3200)[i] = null;
            FrostHunterFlowMaxDragonHero5809(i);
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
            frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSurfaceViewPhantomHyperion30322, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823, false, new boolean[frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlertDialogAuroraDelta3200.length]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03aa A[Catch: all -> 0x03a5, TryCatch #1 {all -> 0x03a5, blocks: (B:127:0x03a1, B:128:0x03aa, B:130:0x03b0, B:43:0x03bf, B:65:0x03c6, B:67:0x03cc, B:69:0x03d6, B:71:0x03e3, B:74:0x03e6), top: B:41:0x036c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterMotionSceneAuroraMega2271(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, boolean z) {
        long j;
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797;
        Object obj;
        int i;
        long FrostHunterCameraXPixelTurboCosmos9814;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361;
        boolean z5;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63612;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2;
        FrostHunterItemDecorationMasterNovaX7048 frostHunterItemDecorationMasterNovaX7048;
        int i3;
        long longValue;
        boolean z6;
        int i4;
        boolean z7;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63613;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71054;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71055;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
        boolean z8;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71056;
        long j8;
        int FrostHunterResourcesTitanHyperVision5823;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper3417 = this.FrostHunterLiveDataBetaLegend3442;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        int i5 = this.FrostHunterConstraintSetCloneOmegaHyperion9304;
        boolean z9 = this.FrostHunterAnnotationProcessorSparkEclipse8710;
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno67972 = this.FrostHunterCameraXTurboCelestialHero5430;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63614 = this.FrostHunterResourcesTitanHyperVision5823;
        if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = FrostHunterVelocityTrackerPrimePulse4533.FrostHunterLooperThreadBetaHyperionMax1000;
            boolean z10 = (frostHunterAnimatedVectorDrawableMasterHeroHyper69602.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633) && frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823 == 0) ? false : true;
            FrostHunterItemDecorationMasterNovaX7048 frostHunterItemDecorationMasterNovaX70482 = new FrostHunterItemDecorationMasterNovaX7048(frostHunterAnimatedVectorDrawableMasterHeroHyper69602, 0L, -9223372036854775807L, false, true, false, z10, z10 && z && !frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && !frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterLevelListDrawableFusionDragonHero2232, 4);
            frostHunterStrictModeNebulaEliteHyper71054 = frostHunterStrictModeNebulaEliteHyper7105;
            j5 = 0;
            frostHunterItemDecorationMasterNovaX7048 = frostHunterItemDecorationMasterNovaX70482;
            frostHunterRoomEntityFusionQuantumFusion63613 = frostHunterRoomEntityFusionQuantumFusion63614;
        } else {
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Object obj2 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71057 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
            boolean z11 = frostHunterStrictModeNebulaEliteHyper71057.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || frostHunterStrictModeNebulaEliteHyper71057.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterLevelListDrawableFusionDragonHero2232;
            long j9 = (frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633() || z11) ? frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475 : frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823;
            if (frostHunterAnimatorSetEliteHyper3417 != null) {
                boolean z12 = true;
                j = 1;
                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71058 = frostHunterStrictModeNebulaEliteHyper7105;
                Pair FrostHunterTransitionListenerPulseVortexCosmos7949 = FrostHunterTransitionListenerPulseVortexCosmos7949(frostHunterStrictModeNebulaEliteHyper71058, frostHunterAnimatorSetEliteHyper3417, true, i5, z9, frostHunterGyroscopeBetaVisionInferno67972, frostHunterRoomEntityFusionQuantumFusion63614);
                if (FrostHunterTransitionListenerPulseVortexCosmos7949 == null) {
                    i4 = frostHunterStrictModeNebulaEliteHyper71058.FrostHunterAlphaAnimationNeoCosmos5761(z9);
                    obj = obj2;
                    longValue = j9;
                    z6 = false;
                    z7 = false;
                } else {
                    long j10 = frostHunterAnimatorSetEliteHyper3417.FrostHunterBundlePulseFusionHero2475;
                    obj = FrostHunterTransitionListenerPulseVortexCosmos7949.first;
                    if (j10 == -9223372036854775807L) {
                        i4 = frostHunterStrictModeNebulaEliteHyper71058.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterBundlePulseFusionHero2475;
                        obj = obj2;
                        longValue = j9;
                        z6 = false;
                    } else {
                        longValue = ((Long) FrostHunterTransitionListenerPulseVortexCosmos7949.second).longValue();
                        z6 = true;
                        i4 = -1;
                    }
                    z7 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889 == 4;
                    z12 = false;
                }
                z4 = z6;
                z3 = z12;
                z2 = z7;
                j2 = longValue;
                i = i4;
                frostHunterGyroscopeBetaVisionInferno6797 = frostHunterGyroscopeBetaVisionInferno67972;
                frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71058;
                frostHunterRoomEntityFusionQuantumFusion63612 = frostHunterRoomEntityFusionQuantumFusion63614;
            } else {
                j = 1;
                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71059 = frostHunterStrictModeNebulaEliteHyper7105;
                if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                    i = frostHunterStrictModeNebulaEliteHyper71059.FrostHunterAlphaAnimationNeoCosmos5761(z9);
                    frostHunterGyroscopeBetaVisionInferno6797 = frostHunterGyroscopeBetaVisionInferno67972;
                    obj = obj2;
                } else if (frostHunterStrictModeNebulaEliteHyper71059.FrostHunterConstraintSetCloneMasterUltraRogue2633(obj2) == -1) {
                    obj = obj2;
                    int FrostHunterRewardedAdSpectraElite8288 = FrostHunterRewardedAdSpectraElite8288(frostHunterGyroscopeBetaVisionInferno67972, frostHunterRoomEntityFusionQuantumFusion63614, i5, z9, obj, frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStrictModeNebulaEliteHyper71059);
                    frostHunterGyroscopeBetaVisionInferno6797 = frostHunterGyroscopeBetaVisionInferno67972;
                    FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper710510 = frostHunterStrictModeNebulaEliteHyper71059;
                    frostHunterRoomEntityFusionQuantumFusion6361 = frostHunterRoomEntityFusionQuantumFusion63614;
                    if (FrostHunterRewardedAdSpectraElite8288 == -1) {
                        FrostHunterRewardedAdSpectraElite8288 = frostHunterStrictModeNebulaEliteHyper710510.FrostHunterAlphaAnimationNeoCosmos5761(z9);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i = FrostHunterRewardedAdSpectraElite8288;
                    z3 = z5;
                    j2 = j9;
                    z2 = false;
                    frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper710510;
                    z4 = false;
                    frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71052;
                    frostHunterRoomEntityFusionQuantumFusion63612 = frostHunterRoomEntityFusionQuantumFusion6361;
                } else {
                    frostHunterGyroscopeBetaVisionInferno6797 = frostHunterGyroscopeBetaVisionInferno67972;
                    obj = obj2;
                    if (j9 == -9223372036854775807L) {
                        i = frostHunterStrictModeNebulaEliteHyper71059.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterBundlePulseFusionHero2475;
                    } else if (z11) {
                        frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63614);
                        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterRoomEntityFusionQuantumFusion63614.FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterFragmentBetaMegaVortex6025 == frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761)) {
                            Pair FrostHunterFlowMaxDragonHero5809 = frostHunterStrictModeNebulaEliteHyper71059.FrostHunterFlowMaxDragonHero5809(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion63614, frostHunterStrictModeNebulaEliteHyper71059.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterBundlePulseFusionHero2475, j9 + frostHunterRoomEntityFusionQuantumFusion63614.FrostHunterLifecycleBlazeGammaElite2889);
                            obj = FrostHunterFlowMaxDragonHero5809.first;
                            FrostHunterCameraXPixelTurboCosmos9814 = ((Long) FrostHunterFlowMaxDragonHero5809.second).longValue();
                        } else {
                            FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStrictModeNebulaEliteHyper71059.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63614).FrostHunterServiceEliteCelestialThunder1757 != -9223372036854775807L ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterCameraXPixelTurboCosmos9814(j9, 0L, frostHunterRoomEntityFusionQuantumFusion63614.FrostHunterServiceEliteCelestialThunder1757 - 1) : j9;
                        }
                        j2 = FrostHunterCameraXPixelTurboCosmos9814;
                        i = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71059;
                        frostHunterRoomEntityFusionQuantumFusion63612 = frostHunterRoomEntityFusionQuantumFusion63614;
                    } else {
                        i = -1;
                    }
                }
                j2 = j9;
                z2 = false;
                z3 = false;
                frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper71059;
                frostHunterRoomEntityFusionQuantumFusion6361 = frostHunterRoomEntityFusionQuantumFusion63614;
                z4 = false;
                frostHunterStrictModeNebulaEliteHyper71053 = frostHunterStrictModeNebulaEliteHyper71052;
                frostHunterRoomEntityFusionQuantumFusion63612 = frostHunterRoomEntityFusionQuantumFusion6361;
            }
            if (i != -1) {
                Pair FrostHunterFlowMaxDragonHero58092 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterFlowMaxDragonHero5809(frostHunterGyroscopeBetaVisionInferno6797, frostHunterRoomEntityFusionQuantumFusion63612, i, -9223372036854775807L);
                obj = FrostHunterFlowMaxDragonHero58092.first;
                j2 = ((Long) FrostHunterFlowMaxDragonHero58092.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                j3 = j2;
            }
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStrictModeNebulaEliteHyper71053, obj, j2);
            int i6 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterLifecycleBlazeGammaElite2889;
            boolean z13 = i6 == -1 || ((i3 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterLifecycleBlazeGammaElite2889) != -1 && i6 >= i3);
            boolean equals = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761.equals(obj);
            boolean z14 = equals && !frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633() && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633() && z13;
            FrostHunterRoomEntityFusionQuantumFusion6361 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63612);
            if (z11 || j9 != j3) {
                j4 = j3;
            } else {
                Object obj3 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761;
                int i7 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                j4 = j3;
                if (obj3.equals(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761)) {
                    if (frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                        FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterRemoteConfigSpeedSpeed8566(i7);
                    }
                    if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                        FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    }
                }
            }
            if (z14) {
                FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603;
            }
            if (!FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                if (equals && frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                    FrostHunterTextInputEditTextRogueSpeedStrike3942 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63612).FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                    long j11 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475;
                    j5 = 0;
                    if (j11 == -9223372036854775807L || 0 > j11) {
                        int i8 = FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
                        int i9 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterBundlePulseFusionHero2475;
                        if (i8 > i9 && FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889[i9] == 2) {
                            long j12 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion63612).FrostHunterServiceEliteCelestialThunder1757;
                            if (j12 != -9223372036854775807L) {
                                j2 = Math.min(j12 - j, j2);
                            }
                            j6 = j2;
                            j7 = j6;
                        }
                    }
                } else {
                    j5 = 0;
                }
                j6 = j2;
                j7 = j4;
            } else if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.equals(frostHunterAnimatedVectorDrawableMasterHeroHyper69603)) {
                j6 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823;
                j7 = j4;
                j5 = 0;
            } else {
                frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63612);
                if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475 == frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                    frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterRemoteConfigSpeedSpeed8566.getClass();
                }
                j7 = j4;
                j5 = 0;
                j6 = 0;
            }
            boolean z15 = (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633) && j6 == frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823) ? false : true;
            int i10 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761) == -1 ? 4 : 3;
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761) && FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633 != -1) {
                FrostHunterTextInputEditTextRogueSpeedStrike3942 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63612).FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                int i11 = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475;
                int[] iArr = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterLifecycleBlazeGammaElite2889;
                if (i11 >= iArr.length || iArr[i11] != 2) {
                    i2 = 0;
                    frostHunterItemDecorationMasterNovaX7048 = new FrostHunterItemDecorationMasterNovaX7048(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, j6, j7, z2, z3, z4, z15, (z15 || !z || frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63612).FrostHunterLevelListDrawableFusionDragonHero2232) ? false : true, i2);
                    frostHunterStrictModeNebulaEliteHyper71054 = frostHunterStrictModeNebulaEliteHyper71053;
                    frostHunterRoomEntityFusionQuantumFusion63613 = frostHunterRoomEntityFusionQuantumFusion63612;
                }
            }
            i2 = i10;
            frostHunterItemDecorationMasterNovaX7048 = new FrostHunterItemDecorationMasterNovaX7048(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, j6, j7, z2, z3, z4, z15, (z15 || !z || frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion63612).FrostHunterLevelListDrawableFusionDragonHero2232) ? false : true, i2);
            frostHunterStrictModeNebulaEliteHyper71054 = frostHunterStrictModeNebulaEliteHyper71053;
            frostHunterRoomEntityFusionQuantumFusion63613 = frostHunterRoomEntityFusionQuantumFusion63612;
        }
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69604 = frostHunterItemDecorationMasterNovaX7048.FrostHunterAlphaAnimationNeoCosmos5761;
        long j13 = frostHunterItemDecorationMasterNovaX7048.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        try {
            if (frostHunterItemDecorationMasterNovaX7048.FrostHunterLifecycleBlazeGammaElite2889) {
                z8 = true;
                if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 != 1) {
                    FrostHunterSharedElementPixelTitan2806(4);
                }
                FrostHunterRewardedAdMasterStrike9463(false, false, false, true);
            } else {
                z8 = true;
            }
            FrostHunterPaintAuroraNovaXPulse1290[] frostHunterPaintAuroraNovaXPulse1290Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
            int length = frostHunterPaintAuroraNovaXPulse1290Arr.length;
            int i12 = 0;
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper710511 = frostHunterRoomEntityFusionQuantumFusion63613;
            while (i12 < length) {
                FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = frostHunterPaintAuroraNovaXPulse1290Arr[i12];
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                boolean equals2 = Objects.equals(frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterBitmapTurboDeltaNebula8743, frostHunterStrictModeNebulaEliteHyper71054);
                if (equals2 == 0) {
                    frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterBitmapTurboDeltaNebula8743 = frostHunterStrictModeNebulaEliteHyper71054;
                    frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterDialogFragmentTurboPhoenixDragon7627();
                }
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterFaceDetectionPixelFusionBlaze52912 != null && !Objects.equals(frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterBitmapTurboDeltaNebula8743, frostHunterStrictModeNebulaEliteHyper71054)) {
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterBitmapTurboDeltaNebula8743 = frostHunterStrictModeNebulaEliteHyper71054;
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterDialogFragmentTurboPhoenixDragon7627();
                }
                i12++;
                frostHunterStrictModeNebulaEliteHyper710511 = equals2;
            }
            try {
                if (frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566) {
                    frostHunterStrictModeNebulaEliteHyper710511 = frostHunterStrictModeNebulaEliteHyper71054;
                    if (!frostHunterStrictModeNebulaEliteHyper710511.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                        for (FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809; frostHunterInsetDrawableCelestialEclipse36012 != null; frostHunterInsetDrawableCelestialEclipse36012 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                            if (frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterAnimatedVectorDrawableMasterHeroHyper69604)) {
                                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566 = this.FrostHunterLooperHyperionForce4133.FrostHunterCameraXPixelTurboCosmos9814(frostHunterStrictModeNebulaEliteHyper710511, frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566);
                                frostHunterInsetDrawableCelestialEclipse36012.FrostHunterKeyframeGammaGamma1197();
                            }
                        }
                        boolean z16 = frostHunterItemDecorationMasterNovaX7048.FrostHunterServiceEliteCelestialThunder1757;
                        try {
                            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora47192 = this.FrostHunterLooperHyperionForce4133;
                            frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69604;
                            try {
                                j13 = FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j13, frostHunterLooperThreadOlympianAurora47192.FrostHunterFlowMaxDragonHero5809 != frostHunterLooperThreadOlympianAurora47192.FrostHunterAlertDialogAuroraDelta3200 ? z8 : false, z16);
                                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69605 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                                FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper69605, frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633, !frostHunterItemDecorationMasterNovaX7048.FrostHunterLevelListDrawableFusionDragonHero2232 ? j13 : -9223372036854775807L, false);
                                if (!frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566 || frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475 != this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475) {
                                    long j14 = frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475;
                                    boolean z17 = frostHunterItemDecorationMasterNovaX7048.FrostHunterCameraXPixelTurboCosmos9814;
                                    this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69605, j13, j14, !z17 ? j13 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterServiceEliteCelestialThunder1757, z17, frostHunterItemDecorationMasterNovaX7048.FrostHunterFlowMaxDragonHero5809);
                                }
                                FrostHunterPermissionInfoAlphaDelta6279();
                                FrostHunterNavigationMasterMegaMax2752(frostHunterStrictModeNebulaEliteHyper7105, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                                this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFlowMaxDragonHero5809(frostHunterStrictModeNebulaEliteHyper7105);
                                if (!frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                                    this.FrostHunterLiveDataBetaLegend3442 = null;
                                }
                                FrostHunterLooperThreadBetaHyperionMax1000(false);
                                this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                            } catch (Throwable th) {
                                th = th;
                                j13 = j13;
                                frostHunterStrictModeNebulaEliteHyper71056 = frostHunterStrictModeNebulaEliteHyper710511;
                                frostHunterStrictModeNebulaEliteHyper71055 = frostHunterStrictModeNebulaEliteHyper71056;
                                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
                                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper710512 = frostHunterVelocityTrackerPrimePulse45333.FrostHunterAlphaAnimationNeoCosmos5761;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69606 = frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69607 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                                FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper71055, frostHunterAnimatedVectorDrawableMasterHeroHyper69607, frostHunterStrictModeNebulaEliteHyper710512, frostHunterAnimatedVectorDrawableMasterHeroHyper69606, frostHunterItemDecorationMasterNovaX7048.FrostHunterLevelListDrawableFusionDragonHero2232 ? j13 : -9223372036854775807L, false);
                                if (!frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566) {
                                }
                                long j15 = frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475;
                                boolean z18 = frostHunterItemDecorationMasterNovaX7048.FrostHunterCameraXPixelTurboCosmos9814;
                                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69607, j13, j15, z18 ? j13 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterServiceEliteCelestialThunder1757, z18, frostHunterItemDecorationMasterNovaX7048.FrostHunterFlowMaxDragonHero5809);
                                FrostHunterPermissionInfoAlphaDelta6279();
                                FrostHunterNavigationMasterMegaMax2752(frostHunterStrictModeNebulaEliteHyper71055, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                                this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFlowMaxDragonHero5809(frostHunterStrictModeNebulaEliteHyper71055);
                                if (!frostHunterStrictModeNebulaEliteHyper71055.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                                }
                                FrostHunterLooperThreadBetaHyperionMax1000(false);
                                this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69604;
                            frostHunterStrictModeNebulaEliteHyper71056 = frostHunterStrictModeNebulaEliteHyper710511;
                            frostHunterStrictModeNebulaEliteHyper71055 = frostHunterStrictModeNebulaEliteHyper71056;
                            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse453332 = this.FrostHunterRewardedAdMasterStrike9463;
                            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105122 = frostHunterVelocityTrackerPrimePulse453332.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper696062 = frostHunterVelocityTrackerPrimePulse453332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper696072 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                            FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper71055, frostHunterAnimatedVectorDrawableMasterHeroHyper696072, frostHunterStrictModeNebulaEliteHyper7105122, frostHunterAnimatedVectorDrawableMasterHeroHyper696062, frostHunterItemDecorationMasterNovaX7048.FrostHunterLevelListDrawableFusionDragonHero2232 ? j13 : -9223372036854775807L, false);
                            if (!frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566) {
                            }
                            long j152 = frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475;
                            boolean z182 = frostHunterItemDecorationMasterNovaX7048.FrostHunterCameraXPixelTurboCosmos9814;
                            this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper696072, j13, j152, z182 ? j13 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterServiceEliteCelestialThunder1757, z182, frostHunterItemDecorationMasterNovaX7048.FrostHunterFlowMaxDragonHero5809);
                            FrostHunterPermissionInfoAlphaDelta6279();
                            FrostHunterNavigationMasterMegaMax2752(frostHunterStrictModeNebulaEliteHyper71055, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                            this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFlowMaxDragonHero5809(frostHunterStrictModeNebulaEliteHyper71055);
                            if (!frostHunterStrictModeNebulaEliteHyper71055.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                            }
                            FrostHunterLooperThreadBetaHyperionMax1000(false);
                            this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = this.FrostHunterLooperHyperionForce4133.FrostHunterAlertDialogAuroraDelta3200;
                        long FrostHunterLightSensorForceFusion4241 = frostHunterInsetDrawableCelestialEclipse36013 == null ? j5 : FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36013);
                        try {
                            try {
                                if (FrostHunterLevelListDrawableFusionDragonHero2232() && (frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterKeyframeGammaGamma1197) != null) {
                                    j8 = FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse3601);
                                    FrostHunterResourcesTitanHyperVision5823 = this.FrostHunterLooperHyperionForce4133.FrostHunterResourcesTitanHyperVision5823(frostHunterStrictModeNebulaEliteHyper7105, this.FrostHunterSoundPoolNovaTitanTitan5784, FrostHunterLightSensorForceFusion4241, j8);
                                    if ((FrostHunterResourcesTitanHyperVision5823 & 1) == 0) {
                                        FrostHunterPushNotificationStormTitanGamma8999(false);
                                    } else if ((FrostHunterResourcesTitanHyperVision5823 & 2) != 0) {
                                        FrostHunterCameraXPixelTurboCosmos9814();
                                    }
                                }
                                FrostHunterResourcesTitanHyperVision5823 = this.FrostHunterLooperHyperionForce4133.FrostHunterResourcesTitanHyperVision5823(frostHunterStrictModeNebulaEliteHyper7105, this.FrostHunterSoundPoolNovaTitanTitan5784, FrostHunterLightSensorForceFusion4241, j8);
                                if ((FrostHunterResourcesTitanHyperVision5823 & 1) == 0) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                frostHunterStrictModeNebulaEliteHyper710511 = frostHunterStrictModeNebulaEliteHyper7105;
                                frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69604;
                                frostHunterStrictModeNebulaEliteHyper71056 = frostHunterStrictModeNebulaEliteHyper710511;
                                frostHunterStrictModeNebulaEliteHyper71055 = frostHunterStrictModeNebulaEliteHyper71056;
                                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533322 = this.FrostHunterRewardedAdMasterStrike9463;
                                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71051222 = frostHunterVelocityTrackerPrimePulse4533322.FrostHunterAlphaAnimationNeoCosmos5761;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960622 = frostHunterVelocityTrackerPrimePulse4533322.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960722 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                                FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper71055, frostHunterAnimatedVectorDrawableMasterHeroHyper6960722, frostHunterStrictModeNebulaEliteHyper71051222, frostHunterAnimatedVectorDrawableMasterHeroHyper6960622, frostHunterItemDecorationMasterNovaX7048.FrostHunterLevelListDrawableFusionDragonHero2232 ? j13 : -9223372036854775807L, false);
                                if (!frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566 || frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475 != this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475) {
                                    long j1522 = frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475;
                                    boolean z1822 = frostHunterItemDecorationMasterNovaX7048.FrostHunterCameraXPixelTurboCosmos9814;
                                    this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960722, j13, j1522, z1822 ? j13 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterServiceEliteCelestialThunder1757, z1822, frostHunterItemDecorationMasterNovaX7048.FrostHunterFlowMaxDragonHero5809);
                                }
                                FrostHunterPermissionInfoAlphaDelta6279();
                                FrostHunterNavigationMasterMegaMax2752(frostHunterStrictModeNebulaEliteHyper71055, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                                this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFlowMaxDragonHero5809(frostHunterStrictModeNebulaEliteHyper71055);
                                if (!frostHunterStrictModeNebulaEliteHyper71055.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                                    this.FrostHunterLiveDataBetaLegend3442 = null;
                                }
                                FrostHunterLooperThreadBetaHyperionMax1000(false);
                                this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            frostHunterStrictModeNebulaEliteHyper710511 = frostHunterStrictModeNebulaEliteHyper7105;
                        }
                        j8 = j5;
                    } catch (Throwable th5) {
                        th = th5;
                        frostHunterStrictModeNebulaEliteHyper710511 = frostHunterStrictModeNebulaEliteHyper71054;
                    }
                }
                frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69604;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse453322 = this.FrostHunterRewardedAdMasterStrike9463;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper696052 = frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
                FrostHunterExecutorNeoDragonMax5687(frostHunterStrictModeNebulaEliteHyper7105, frostHunterAnimatedVectorDrawableMasterHeroHyper696052, frostHunterVelocityTrackerPrimePulse453322.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterVelocityTrackerPrimePulse453322.FrostHunterConstraintSetCloneMasterUltraRogue2633, !frostHunterItemDecorationMasterNovaX7048.FrostHunterLevelListDrawableFusionDragonHero2232 ? j13 : -9223372036854775807L, false);
                if (!frostHunterItemDecorationMasterNovaX7048.FrostHunterRemoteConfigSpeedSpeed8566) {
                }
                long j142 = frostHunterItemDecorationMasterNovaX7048.FrostHunterBundlePulseFusionHero2475;
                boolean z172 = frostHunterItemDecorationMasterNovaX7048.FrostHunterCameraXPixelTurboCosmos9814;
                this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper696052, j13, j142, !z172 ? j13 : this.FrostHunterRewardedAdMasterStrike9463.FrostHunterServiceEliteCelestialThunder1757, z172, frostHunterItemDecorationMasterNovaX7048.FrostHunterFlowMaxDragonHero5809);
                FrostHunterPermissionInfoAlphaDelta6279();
                FrostHunterNavigationMasterMegaMax2752(frostHunterStrictModeNebulaEliteHyper7105, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFlowMaxDragonHero5809(frostHunterStrictModeNebulaEliteHyper7105);
                if (!frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                }
                FrostHunterLooperThreadBetaHyperionMax1000(false);
                this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            frostHunterStrictModeNebulaEliteHyper71055 = frostHunterStrictModeNebulaEliteHyper71054;
            frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterAnimatedVectorDrawableMasterHeroHyper69604;
        }
    }

    public final void FrostHunterNavigationMasterMegaMax2752(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052) {
        if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && frostHunterStrictModeNebulaEliteHyper71052.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return;
        }
        ArrayList arrayList = this.FrostHunterMotionSceneAuroraMega2271;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperThreadBetaHyperionMax1000(arrayList.get(size));
            throw null;
        }
    }

    public final void FrostHunterNavigationViewMasterVortexBeta1295(FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194) {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        int size = frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633.size();
        if (frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterConstraintSetCloneMasterUltraRogue2633.length != size) {
            frostHunterLifecycleCameraControllerRogueQuantum1194 = new FrostHunterLifecycleCameraControllerRogueQuantum1194(new Random(frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterAlphaAnimationNeoCosmos5761.nextLong())).FrostHunterAlphaAnimationNeoCosmos5761(size);
        }
        frostHunterModelInputOutputStrikePrime1569.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLifecycleCameraControllerRogueQuantum1194;
        FrostHunterMotionSceneAuroraMega2271(frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633(), false);
    }

    public final void FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterRoomDaoSpectraPixelGamma1835 frostHunterRoomDaoSpectraPixelGamma1835) {
        this.FrostHunterViewPager2StrikePulse8790 = frostHunterRoomDaoSpectraPixelGamma1835;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        frostHunterLooperThreadOlympianAurora4719.getClass();
        frostHunterRoomDaoSpectraPixelGamma1835.getClass();
        if (frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.size(); i++) {
            ((FrostHunterInsetDrawableCelestialEclipse3601) frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.get(i)).FrostHunterFlowMaxDragonHero5809();
        }
        frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911 = arrayList;
        frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
        frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197();
    }

    public final void FrostHunterNestedScrollViewThunderNovaX6772(boolean z) {
        this.FrostHunterNavigationMasterMegaMax2752 = z;
        FrostHunterPermissionInfoAlphaDelta6279();
        if (this.FrostHunterTransitionListenerPulseVortexCosmos7949) {
            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
            if (frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200 != frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809) {
                FrostHunterPushNotificationStormTitanGamma8999(true);
                FrostHunterLooperThreadBetaHyperionMax1000(false);
            }
        }
    }

    public final void FrostHunterObjectAnimatorPhoenixSpectraThunder6218(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.FrostHunterMagnetometerFusionTitanium8202;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025 == z2 && frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241 == i2 && frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719 == i3) {
            return;
        }
        this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889(i3, i2, z2);
        FrostHunterItemDecorationPixelShadow2695(false, false);
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        for (FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809; frostHunterInsetDrawableCelestialEclipse3601 != null; frostHunterInsetDrawableCelestialEclipse3601 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            for (FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 : (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterInsetDrawableCelestialEclipse3601.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200) {
                if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                    frostHunterBindingAdapterOmegaBlaze8548.FrostHunterAlphaAnimationNeoCosmos5761(z2);
                }
            }
        }
        if (!FrostHunterViewModelScopeTitanRogue1970()) {
            FrostHunterItemDecorationPhoenixAlphaVortex8006();
            FrostHunterBannerAdNebulaMasterBeta4389();
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
            if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterCameraXPixelTurboCosmos9814(false);
            }
            frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterSoundPoolNovaTitanTitan5784);
            return;
        }
        int i4 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (i4 != 3) {
            if (i4 == 2) {
                frostHunterRotateDrawableMaxPrime8918.FrostHunterLevelListDrawableFusionDragonHero2232(2);
            }
        } else {
            FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
            frostHunterPreviewOlympianBeta7981.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLevelListDrawableFusionDragonHero2232();
            FrostHunterCoordinatorLayoutGammaTurboSpark2420();
            frostHunterRotateDrawableMaxPrime8918.FrostHunterLevelListDrawableFusionDragonHero2232(2);
        }
    }

    public final void FrostHunterPagingDataTurboTitanium7332() {
        for (int i = 0; i < this.FrostHunterCameraXPixelTurboCosmos9814.length; i++) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = this.FrostHunterFlowMaxDragonHero5809[i];
            synchronized (frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterCameraXPixelTurboCosmos9814) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterLooperHyperionForce4133 = null;
            }
            FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = this.FrostHunterCameraXPixelTurboCosmos9814[i];
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterScaleAnimationStrikeSpark5059 == 0);
            frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterResourcesTitanHyperVision5823();
            frostHunterPaintAuroraNovaXPulse1290.FrostHunterLifecycleBlazeGammaElite2889 = false;
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52913 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterFaceDetectionPixelFusionBlaze52913 != null) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterScaleAnimationStrikeSpark5059 == 0);
                frostHunterFaceDetectionPixelFusionBlaze52913.FrostHunterResourcesTitanHyperVision5823();
                frostHunterPaintAuroraNovaXPulse1290.FrostHunterLevelListDrawableFusionDragonHero2232 = false;
            }
        }
    }

    public final void FrostHunterPagingSourceEclipseDelta8255(long j, boolean z) {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        long j2 = j + (frostHunterInsetDrawableCelestialEclipse3601 == null ? 1000000000000L : frostHunterInsetDrawableCelestialEclipse3601.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        this.FrostHunterSoundPoolNovaTitanTitan5784 = j2;
        this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2);
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            long j3 = this.FrostHunterSoundPoolNovaTitanTitan5784;
            FrostHunterFaceDetectionPixelFusionBlaze5291 FrostHunterServiceEliteCelestialThunder1757 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse3601);
            if (FrostHunterServiceEliteCelestialThunder1757 != null) {
                FrostHunterServiceEliteCelestialThunder1757.FrostHunterEditTextPulseHyperion1262(j3, false, z);
            }
        }
        for (FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = r0.FrostHunterFlowMaxDragonHero5809; frostHunterInsetDrawableCelestialEclipse36012 != null; frostHunterInsetDrawableCelestialEclipse36012 = frostHunterInsetDrawableCelestialEclipse36012.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            for (FrostHunterBindingAdapterOmegaBlaze8548 frostHunterBindingAdapterOmegaBlaze8548 : (FrostHunterBindingAdapterOmegaBlaze8548[]) frostHunterInsetDrawableCelestialEclipse36012.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlertDialogAuroraDelta3200) {
                if (frostHunterBindingAdapterOmegaBlaze8548 != null) {
                    frostHunterBindingAdapterOmegaBlaze8548.FrostHunterAlertDialogAuroraDelta3200();
                }
            }
        }
    }

    public final void FrostHunterPermissionInfoAlphaDelta6279() {
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        this.FrostHunterTransitionListenerPulseVortexCosmos7949 = frostHunterInsetDrawableCelestialEclipse3601 != null && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlertDialogAuroraDelta3200 && this.FrostHunterNavigationMasterMegaMax2752;
    }

    public final void FrostHunterPlaceholderLegendForceNebula9869(FrostHunterColorDrawableSpeedAurora7439 frostHunterColorDrawableSpeedAurora7439) {
        this.FrostHunterTranslateAnimationCyberSolarUltra7101 = frostHunterColorDrawableSpeedAurora7439;
    }

    public final void FrostHunterPreviewBlazeAurora1020(FrostHunterSharedFlowShadowEpicCelestial4667 frostHunterSharedFlowShadowEpicCelestial4667) {
        frostHunterSharedFlowShadowEpicCelestial4667.getClass();
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterLifecycleBlazeGammaElite2889 != this.FrostHunterLintTitanVortexQuantum9911) {
            frostHunterRotateDrawableMaxPrime8918.FrostHunterConstraintSetCloneMasterUltraRogue2633(15, frostHunterSharedFlowShadowEpicCelestial4667).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            return;
        }
        synchronized (frostHunterSharedFlowShadowEpicCelestial4667) {
        }
        try {
            frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterBundlePulseFusionHero2475, frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterServiceEliteCelestialThunder1757);
            frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterAlphaAnimationNeoCosmos5761(true);
            int i = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889;
            if (i == 3 || i == 2) {
                frostHunterRotateDrawableMaxPrime8918.FrostHunterLevelListDrawableFusionDragonHero2232(2);
            }
        } catch (Throwable th) {
            frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterAlphaAnimationNeoCosmos5761(true);
            throw th;
        }
    }

    public final void FrostHunterPushNotificationStormTitanGamma8999(boolean z) {
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761;
        long FrostHunterAnnotationProcessorSparkEclipse8710 = FrostHunterAnnotationProcessorSparkEclipse8710(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823, true, false);
        if (FrostHunterAnnotationProcessorSparkEclipse8710 != this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
            this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, FrostHunterAnnotationProcessorSparkEclipse8710, frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceEliteCelestialThunder1757, z, 5);
        }
    }

    public final void FrostHunterR8MasterNebulaSpark7247(int i, int i2, FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194) {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        frostHunterModelInputOutputStrikePrime1569.getClass();
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i >= 0 && i <= i2 && i2 <= frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633.size());
        frostHunterModelInputOutputStrikePrime1569.FrostHunterAlertDialogAuroraDelta3200 = frostHunterLifecycleCameraControllerRogueQuantum1194;
        frostHunterModelInputOutputStrikePrime1569.FrostHunterRemoteConfigSpeedSpeed8566(i, i2);
        FrostHunterMotionSceneAuroraMega2271(frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633(), false);
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566() {
        FrostHunterFCMDeltaQuantumHero8364();
        FrostHunterPushNotificationStormTitanGamma8999(true);
    }

    public final void FrostHunterRemoteConfigThunderShadow4435(long j) {
        boolean z;
        if (this.FrostHunterMagnetometerFusionTitanium8202) {
            this.FrostHunterStateCelestialNovaPixel8414.getClass();
            z = true;
        } else {
            z = false;
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        long j2 = FrostHunterSharedElementPixelTitan2806;
        if (z) {
            r4 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889 != 3 ? j2 : 1000L;
            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                long j3 = this.FrostHunterSoundPoolNovaTitanTitan5784;
                long j4 = this.FrostHunterNestedScrollViewThunderNovaX6772;
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
                long FrostHunterFlowMaxDragonHero5809 = FrostHunterPaintAuroraNovaXPulse1290.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFaceDetectionPixelFusionBlaze52912) ? frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterFlowMaxDragonHero5809(j3, j4) : Long.MAX_VALUE;
                if (frostHunterFaceDetectionPixelFusionBlaze5291 != null && frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterScaleAnimationStrikeSpark5059 != 0) {
                    FrostHunterFlowMaxDragonHero5809 = Math.min(FrostHunterFlowMaxDragonHero5809, frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809(j3, j4));
                }
                r4 = Math.min(r4, FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterFlowMaxDragonHero5809));
            }
            if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterFragmentBetaMegaVortex6025()) {
                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
                if ((frostHunterInsetDrawableCelestialEclipse3601 != null ? frostHunterInsetDrawableCelestialEclipse3601.FrostHunterServiceConnectionTurboPhoenixOmega6719 : null) != null) {
                    if ((FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(r4) * this.FrostHunterRewardedAdMasterStrike9463.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761) + this.FrostHunterSoundPoolNovaTitanTitan5784 >= r1.FrostHunterLifecycleBlazeGammaElite2889()) {
                        r4 = Math.min(r4, j2);
                    }
                }
            }
        } else if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889 != 3 || FrostHunterViewModelScopeTitanRogue1970()) {
            r4 = j2;
        }
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761.sendEmptyMessageAtTime(2, j + r4);
    }

    public final void FrostHunterResourcesTitanHyperVision5823(FrostHunterDrawableDeltaLegend6817 frostHunterDrawableDeltaLegend6817) {
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFragmentBetaMegaVortex6025;
        if (frostHunterInsetDrawableCelestialEclipse3601 != null && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterDrawableDeltaLegend6817) {
            frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterSoundPoolNovaTitanTitan5784);
            FrostHunterDatabaseEliteShadowUltra2452();
            return;
        }
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterInsetDrawableCelestialEclipse36012 == null || frostHunterInsetDrawableCelestialEclipse36012.FrostHunterAlphaAnimationNeoCosmos5761 != frostHunterDrawableDeltaLegend6817) {
            return;
        }
        FrostHunterCardViewSpectraCyber7714();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterRewardedAdMasterStrike9463(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052;
        List list;
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLifecycleBlazeGammaElite2889(2);
        this.FrostHunterPagingDataTurboTitanium7332 = false;
        if (this.FrostHunterR8MasterNebulaSpark7247 != null) {
            this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
            this.FrostHunterR8MasterNebulaSpark7247 = null;
        }
        this.FrostHunterImageAnalysisGammaOlympian2400 = null;
        FrostHunterItemDecorationPixelShadow2695(false, true);
        FrostHunterPreviewOlympianBeta7981 frostHunterPreviewOlympianBeta7981 = this.FrostHunterLooperThreadBetaHyperionMax1000;
        frostHunterPreviewOlympianBeta7981.FrostHunterServiceConnectionTurboPhoenixOmega6719 = false;
        FrostHunterOnItemClickListenerTitaniumTitanEpic5303 frostHunterOnItemClickListenerTitaniumTitanEpic5303 = frostHunterPreviewOlympianBeta7981.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809) {
            frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterLifecycleBlazeGammaElite2889());
            frostHunterOnItemClickListenerTitaniumTitanEpic5303.FrostHunterFlowMaxDragonHero5809 = false;
        }
        this.FrostHunterSoundPoolNovaTitanTitan5784 = 1000000000000L;
        for (int i = 0; i < this.FrostHunterCameraXPixelTurboCosmos9814.length; i++) {
            try {
                FrostHunterFlowMaxDragonHero5809(i);
            } catch (FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 e) {
                e = e;
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Disable failed.", e);
                if (z) {
                }
                this.FrostHunterColorDrawableLegendPhoenixVision7927 = 0;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                long j4 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823;
                if (!this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                }
                j = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475;
                if (z2) {
                }
                this.FrostHunterLooperHyperionForce4133.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                this.FrostHunterPushNotificationStormTitanGamma8999 = false;
                frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                if (z3) {
                }
                frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper7105;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterRewardedAdMasterStrike9463;
                int i2 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterLifecycleBlazeGammaElite2889;
                if (!z4) {
                }
                FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan4255 = !z5 ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : frostHunterVelocityTrackerPrimePulse45332.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = !z5 ? this.FrostHunterFragmentBetaMegaVortex6025 : frostHunterVelocityTrackerPrimePulse45332.FrostHunterFlowMaxDragonHero5809;
                if (z5) {
                }
                this.FrostHunterRewardedAdMasterStrike9463 = new FrostHunterVelocityTrackerPrimePulse4533(frostHunterStrictModeNebulaEliteHyper71052, frostHunterAnimatedVectorDrawableMasterHeroHyper6960, j3, j2, i2, r13, false, frostHunterMergeHyperTitan4255, frostHunterSurfaceViewPhantomHyperion3032, list, frostHunterAnimatedVectorDrawableMasterHeroHyper6960, frostHunterVelocityTrackerPrimePulse45332.FrostHunterFragmentBetaMegaVortex6025, frostHunterVelocityTrackerPrimePulse45332.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45332.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse45332.FrostHunterScaleAnimationStrikeSpark5059, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            } catch (RuntimeException e2) {
                e = e2;
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Disable failed.", e);
                if (z) {
                }
                this.FrostHunterColorDrawableLegendPhoenixVision7927 = 0;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterRewardedAdMasterStrike9463;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                long j42 = frostHunterVelocityTrackerPrimePulse45333.FrostHunterResourcesTitanHyperVision5823;
                if (!this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                }
                j = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475;
                if (z2) {
                }
                this.FrostHunterLooperHyperionForce4133.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                this.FrostHunterPushNotificationStormTitanGamma8999 = false;
                frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                if (z3) {
                }
                frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper7105;
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse453322 = this.FrostHunterRewardedAdMasterStrike9463;
                int i22 = frostHunterVelocityTrackerPrimePulse453322.FrostHunterLifecycleBlazeGammaElite2889;
                if (!z4) {
                }
                FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan42552 = !z5 ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : frostHunterVelocityTrackerPrimePulse453322.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = !z5 ? this.FrostHunterFragmentBetaMegaVortex6025 : frostHunterVelocityTrackerPrimePulse453322.FrostHunterFlowMaxDragonHero5809;
                if (z5) {
                }
                this.FrostHunterRewardedAdMasterStrike9463 = new FrostHunterVelocityTrackerPrimePulse4533(frostHunterStrictModeNebulaEliteHyper71052, frostHunterAnimatedVectorDrawableMasterHeroHyper69602, j3, j2, i22, r13, false, frostHunterMergeHyperTitan42552, frostHunterSurfaceViewPhantomHyperion30322, list, frostHunterAnimatedVectorDrawableMasterHeroHyper69602, frostHunterVelocityTrackerPrimePulse453322.FrostHunterFragmentBetaMegaVortex6025, frostHunterVelocityTrackerPrimePulse453322.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse453322.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse453322.FrostHunterScaleAnimationStrikeSpark5059, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        this.FrostHunterPlaceholderLegendForceNebula9869 = -9223372036854775807L;
        if (z) {
            for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
                try {
                    frostHunterPaintAuroraNovaXPulse1290.FrostHunterKeyframeGammaGamma1197();
                } catch (RuntimeException e3) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Reset failed.", e3);
                }
            }
        }
        this.FrostHunterColorDrawableLegendPhoenixVision7927 = 0;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse453332 = this.FrostHunterRewardedAdMasterStrike9463;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper696022 = frostHunterVelocityTrackerPrimePulse453332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j422 = frostHunterVelocityTrackerPrimePulse453332.FrostHunterResourcesTitanHyperVision5823;
        if (!this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = this.FrostHunterRewardedAdMasterStrike9463;
            FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterResourcesTitanHyperVision5823;
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterAlphaAnimationNeoCosmos5761;
            if (!frostHunterStrictModeNebulaEliteHyper71053.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && !frostHunterStrictModeNebulaEliteHyper71053.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterLevelListDrawableFusionDragonHero2232) {
                j = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterResourcesTitanHyperVision5823;
                if (z2) {
                    long j5 = j;
                    j2 = j422;
                    j3 = j5;
                    z5 = false;
                } else {
                    this.FrostHunterLiveDataBetaLegend3442 = null;
                    Pair FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761);
                    frostHunterAnimatedVectorDrawableMasterHeroHyper696022 = (FrostHunterAnimatedVectorDrawableMasterHeroHyper6960) FrostHunterScaleAnimationStrikeSpark5059.first;
                    long longValue = ((Long) FrostHunterScaleAnimationStrikeSpark5059.second).longValue();
                    z5 = frostHunterAnimatedVectorDrawableMasterHeroHyper696022.equals(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterConstraintSetCloneMasterUltraRogue2633) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.FrostHunterLooperHyperionForce4133.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                this.FrostHunterPushNotificationStormTitanGamma8999 = false;
                frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
                if (z3 || !(frostHunterStrictModeNebulaEliteHyper7105 instanceof FrostHunterImageAnalysisPrimeSpectraNova7921)) {
                    frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper7105;
                } else {
                    FrostHunterImageAnalysisPrimeSpectraNova7921 frostHunterImageAnalysisPrimeSpectraNova7921 = (FrostHunterImageAnalysisPrimeSpectraNova7921) frostHunterStrictModeNebulaEliteHyper7105;
                    FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194 = this.FrostHunterMeteringPointBetaCyber9571.FrostHunterAlertDialogAuroraDelta3200;
                    FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr = frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterCameraXPixelTurboCosmos9814;
                    FrostHunterStrictModeNebulaEliteHyper7105[] frostHunterStrictModeNebulaEliteHyper7105Arr2 = new FrostHunterStrictModeNebulaEliteHyper7105[frostHunterStrictModeNebulaEliteHyper7105Arr.length];
                    for (int i3 = 0; i3 < frostHunterStrictModeNebulaEliteHyper7105Arr.length; i3++) {
                        frostHunterStrictModeNebulaEliteHyper7105Arr2[i3] = new FrostHunterAlertDialogMasterVision4753(frostHunterStrictModeNebulaEliteHyper7105Arr[i3]);
                    }
                    frostHunterStrictModeNebulaEliteHyper71052 = new FrostHunterImageAnalysisPrimeSpectraNova7921(frostHunterStrictModeNebulaEliteHyper7105Arr2, frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFlowMaxDragonHero5809, frostHunterLifecycleCameraControllerRogueQuantum1194);
                    if (frostHunterAnimatedVectorDrawableMasterHeroHyper696022.FrostHunterConstraintSetCloneMasterUltraRogue2633 != -1) {
                        frostHunterStrictModeNebulaEliteHyper71052.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper696022.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterResourcesTitanHyperVision5823);
                        int i4 = this.FrostHunterResourcesTitanHyperVision5823.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterCameraXTurboCelestialHero5430;
                        frostHunterStrictModeNebulaEliteHyper71052.FrostHunterServiceConnectionTurboPhoenixOmega6719(i4, frostHunterGyroscopeBetaVisionInferno6797, 0L);
                        if (frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761()) {
                            frostHunterAnimatedVectorDrawableMasterHeroHyper696022 = new FrostHunterAnimatedVectorDrawableMasterHeroHyper6960(frostHunterAnimatedVectorDrawableMasterHeroHyper696022.FrostHunterServiceEliteCelestialThunder1757, frostHunterAnimatedVectorDrawableMasterHeroHyper696022.FrostHunterAlphaAnimationNeoCosmos5761);
                        }
                    }
                }
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533222 = this.FrostHunterRewardedAdMasterStrike9463;
                int i222 = frostHunterVelocityTrackerPrimePulse4533222.FrostHunterLifecycleBlazeGammaElite2889;
                FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = !z4 ? null : frostHunterVelocityTrackerPrimePulse4533222.FrostHunterLevelListDrawableFusionDragonHero2232;
                FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan425522 = !z5 ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : frostHunterVelocityTrackerPrimePulse4533222.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion303222 = !z5 ? this.FrostHunterFragmentBetaMegaVortex6025 : frostHunterVelocityTrackerPrimePulse4533222.FrostHunterFlowMaxDragonHero5809;
                if (z5) {
                    list = frostHunterVelocityTrackerPrimePulse4533222.FrostHunterAlertDialogAuroraDelta3200;
                } else {
                    FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                    list = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
                }
                this.FrostHunterRewardedAdMasterStrike9463 = new FrostHunterVelocityTrackerPrimePulse4533(frostHunterStrictModeNebulaEliteHyper71052, frostHunterAnimatedVectorDrawableMasterHeroHyper696022, j3, j2, i222, frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868, false, frostHunterMergeHyperTitan425522, frostHunterSurfaceViewPhantomHyperion303222, list, frostHunterAnimatedVectorDrawableMasterHeroHyper696022, frostHunterVelocityTrackerPrimePulse4533222.FrostHunterFragmentBetaMegaVortex6025, frostHunterVelocityTrackerPrimePulse4533222.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse4533222.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse4533222.FrostHunterScaleAnimationStrikeSpark5059, j2, 0L, j2, 0L, false);
                if (z3) {
                    return;
                }
                FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
                if (!frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.size(); i5++) {
                        ((FrostHunterInsetDrawableCelestialEclipse3601) frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911.get(i5)).FrostHunterFlowMaxDragonHero5809();
                    }
                    frostHunterLooperThreadOlympianAurora4719.FrostHunterLintTitanVortexQuantum9911 = arrayList;
                    frostHunterLooperThreadOlympianAurora4719.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
                    frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197();
                }
                FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
                HashMap hashMap = frostHunterModelInputOutputStrikePrime1569.FrostHunterLevelListDrawableFusionDragonHero2232;
                for (FrostHunterAlertDialogNebulaPhantom6015 frostHunterAlertDialogNebulaPhantom6015 : hashMap.values()) {
                    try {
                        frostHunterAlertDialogNebulaPhantom6015.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLightSensorForceFusion4241(frostHunterAlertDialogNebulaPhantom6015.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    } catch (RuntimeException e4) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Failed to release child source.", e4);
                    }
                    FrostHunterKotlinOlympianHeroCosmos8366 frostHunterKotlinOlympianHeroCosmos8366 = frostHunterAlertDialogNebulaPhantom6015.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterDialogStormSpeedMega9154 frostHunterDialogStormSpeedMega9154 = frostHunterAlertDialogNebulaPhantom6015.FrostHunterBundlePulseFusionHero2475;
                    frostHunterKotlinOlympianHeroCosmos8366.FrostHunterLintTitanVortexQuantum9911(frostHunterDialogStormSpeedMega9154);
                    frostHunterAlertDialogNebulaPhantom6015.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterDialogStormSpeedMega9154);
                }
                hashMap.clear();
                frostHunterModelInputOutputStrikePrime1569.FrostHunterRemoteConfigSpeedSpeed8566.clear();
                frostHunterModelInputOutputStrikePrime1569.FrostHunterKeyframeGammaGamma1197 = false;
                return;
            }
        }
        j = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterBundlePulseFusionHero2475;
        if (z2) {
        }
        this.FrostHunterLooperHyperionForce4133.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        this.FrostHunterPushNotificationStormTitanGamma8999 = false;
        frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761;
        if (z3) {
        }
        frostHunterStrictModeNebulaEliteHyper71052 = frostHunterStrictModeNebulaEliteHyper7105;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332222 = this.FrostHunterRewardedAdMasterStrike9463;
        int i2222 = frostHunterVelocityTrackerPrimePulse45332222.FrostHunterLifecycleBlazeGammaElite2889;
        if (!z4) {
        }
        FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan4255222 = !z5 ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : frostHunterVelocityTrackerPrimePulse45332222.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032222 = !z5 ? this.FrostHunterFragmentBetaMegaVortex6025 : frostHunterVelocityTrackerPrimePulse45332222.FrostHunterFlowMaxDragonHero5809;
        if (z5) {
        }
        this.FrostHunterRewardedAdMasterStrike9463 = new FrostHunterVelocityTrackerPrimePulse4533(frostHunterStrictModeNebulaEliteHyper71052, frostHunterAnimatedVectorDrawableMasterHeroHyper696022, j3, j2, i2222, frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868, false, frostHunterMergeHyperTitan4255222, frostHunterSurfaceViewPhantomHyperion3032222, list, frostHunterAnimatedVectorDrawableMasterHeroHyper696022, frostHunterVelocityTrackerPrimePulse45332222.FrostHunterFragmentBetaMegaVortex6025, frostHunterVelocityTrackerPrimePulse45332222.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45332222.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse45332222.FrostHunterScaleAnimationStrikeSpark5059, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void FrostHunterRunnableCosmosCelestial4235(FrostHunterSharedFlowShadowEpicCelestial4667 frostHunterSharedFlowShadowEpicCelestial4667) {
        Looper looper = frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterLifecycleBlazeGammaElite2889;
        if (looper.getThread().isAlive()) {
            this.FrostHunterBitmapTurboDeltaNebula8743.FrostHunterAlphaAnimationNeoCosmos5761(looper, null).FrostHunterServiceEliteCelestialThunder1757(new FrostHunterFilterAlphaSparkSpeed9857(16, this, frostHunterSharedFlowShadowEpicCelestial4667));
        } else {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Trying to send message on a dead thread.");
            frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterAlphaAnimationNeoCosmos5761(false);
        }
    }

    public final Pair FrostHunterScaleAnimationStrikeSpark5059(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105) {
        long j = 0;
        if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return Pair.create(FrostHunterVelocityTrackerPrimePulse4533.FrostHunterLooperThreadBetaHyperionMax1000, 0L);
        }
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterAnnotationProcessorSparkEclipse8710);
        Pair FrostHunterFlowMaxDragonHero5809 = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXTurboCelestialHero5430, this.FrostHunterResourcesTitanHyperVision5823, FrostHunterAlphaAnimationNeoCosmos5761, -9223372036854775807L);
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = this.FrostHunterLooperHyperionForce4133.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterStrictModeNebulaEliteHyper7105, FrostHunterFlowMaxDragonHero5809.first, 0L);
        long longValue = ((Long) FrostHunterFlowMaxDragonHero5809.second).longValue();
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
            Object obj = FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterResourcesTitanHyperVision5823;
            frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361);
            if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475 == frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterRemoteConfigSpeedSpeed8566.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, Long.valueOf(j));
    }

    public final long FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105, Object obj, long j) {
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterResourcesTitanHyperVision5823;
        int i = frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475;
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterCameraXTurboCelestialHero5430;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterLightSensorForceFusion4241(i, frostHunterGyroscopeBetaVisionInferno6797);
        if (frostHunterGyroscopeBetaVisionInferno6797.FrostHunterServiceEliteCelestialThunder1757 == -9223372036854775807L || !frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlphaAnimationNeoCosmos5761() || !frostHunterGyroscopeBetaVisionInferno6797.FrostHunterRemoteConfigSpeedSpeed8566) {
            return -9223372036854775807L;
        }
        long j2 = frostHunterGyroscopeBetaVisionInferno6797.FrostHunterLifecycleBlazeGammaElite2889;
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - frostHunterGyroscopeBetaVisionInferno6797.FrostHunterServiceEliteCelestialThunder1757) - (j + frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterMLKitPrimeOlympianOmega4332 frostHunterMLKitPrimeOlympianOmega4332, int i) {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        if (i == -1) {
            i = frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633.size();
        }
        FrostHunterMotionSceneAuroraMega2271(frostHunterModelInputOutputStrikePrime1569.FrostHunterAlphaAnimationNeoCosmos5761(i, frostHunterMLKitPrimeOlympianOmega4332.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterMLKitPrimeOlympianOmega4332.FrostHunterConstraintSetCloneMasterUltraRogue2633), false);
    }

    public final boolean FrostHunterServiceInfoHyperionSparkMax9966(int i, FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960) {
        FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterInsetDrawableCelestialEclipse3601 != null && frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterAnimatedVectorDrawableMasterHeroHyper6960)) {
            FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 = this.FrostHunterCameraXPixelTurboCosmos9814[i];
            FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterKeyframeGammaGamma1197;
            int i2 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757;
            boolean z = (i2 == 2 || i2 == 4) && frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012) == frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            boolean z2 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757 == 3 && frostHunterPaintAuroraNovaXPulse1290.FrostHunterServiceEliteCelestialThunder1757(frostHunterInsetDrawableCelestialEclipse36012) == frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void FrostHunterSharedElementPixelTitan2806(int i) {
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889 != i) {
            if (i != 2) {
                this.FrostHunterInAppPurchaseLegendEpicDragon4579 = -9223372036854775807L;
            }
            if (i != 3 && frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
                this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterCameraXPixelTurboCosmos9814(false);
            }
            this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterRemoteConfigSpeedSpeed8566(i);
        }
    }

    public final void FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterMLKitPrimeOlympianOmega4332 frostHunterMLKitPrimeOlympianOmega4332) {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        int i = frostHunterMLKitPrimeOlympianOmega4332.FrostHunterBundlePulseFusionHero2475;
        FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194 = frostHunterMLKitPrimeOlympianOmega4332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        ArrayList arrayList = frostHunterMLKitPrimeOlympianOmega4332.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != -1) {
            this.FrostHunterLiveDataBetaLegend3442 = new FrostHunterAnimatorSetEliteHyper3417(new FrostHunterImageAnalysisPrimeSpectraNova7921(arrayList, frostHunterLifecycleCameraControllerRogueQuantum1194), frostHunterMLKitPrimeOlympianOmega4332.FrostHunterBundlePulseFusionHero2475, frostHunterMLKitPrimeOlympianOmega4332.FrostHunterServiceEliteCelestialThunder1757);
        }
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        ArrayList arrayList2 = frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterModelInputOutputStrikePrime1569.FrostHunterRemoteConfigSpeedSpeed8566(0, arrayList2.size());
        FrostHunterMotionSceneAuroraMega2271(frostHunterModelInputOutputStrikePrime1569.FrostHunterAlphaAnimationNeoCosmos5761(arrayList2.size(), arrayList, frostHunterLifecycleCameraControllerRogueQuantum1194), false);
    }

    public final void FrostHunterStateCelestialNovaPixel8414() {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        FrostHunterRewardedAdMasterStrike9463(false, false, false, true);
        FrostHunterMeteringPointEclipseTitan1504 frostHunterMeteringPointEclipseTitan1504 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        ConcurrentHashMap concurrentHashMap = frostHunterMeteringPointEclipseTitan1504.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        long id = Thread.currentThread().getId();
        long j = frostHunterMeteringPointEclipseTitan1504.FrostHunterLintTitanVortexQuantum9911;
        FrostHunterCanvasInfernoVortex4700.FrostHunterViewPhantomNeo1634("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        frostHunterMeteringPointEclipseTitan1504.FrostHunterLintTitanVortexQuantum9911 = id;
        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = this.FrostHunterDatabaseEliteShadowUltra2452;
        FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar6619 = (FrostHunterTransformForceShadowSolar6619) concurrentHashMap.get(frostHunterToolbarPixelHyperion1536);
        if (frostHunterTransformForceShadowSolar6619 == null) {
            FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar66192 = new FrostHunterTransformForceShadowSolar6619();
            frostHunterTransformForceShadowSolar66192.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
            concurrentHashMap.put(frostHunterToolbarPixelHyperion1536, frostHunterTransformForceShadowSolar66192);
        } else {
            frostHunterTransformForceShadowSolar6619.FrostHunterAlphaAnimationNeoCosmos5761++;
        }
        FrostHunterTransformForceShadowSolar6619 frostHunterTransformForceShadowSolar66193 = (FrostHunterTransformForceShadowSolar6619) concurrentHashMap.get(frostHunterToolbarPixelHyperion1536);
        frostHunterTransformForceShadowSolar66193.getClass();
        Integer num = (Integer) frostHunterMeteringPointEclipseTitan1504.FrostHunterScaleAnimationStrikeSpark5059.get(frostHunterToolbarPixelHyperion1536.FrostHunterAlphaAnimationNeoCosmos5761);
        int intValue = (num == null || num.intValue() == -1) ? frostHunterMeteringPointEclipseTitan1504.FrostHunterFragmentBetaMegaVortex6025 : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        frostHunterTransformForceShadowSolar66193.FrostHunterBundlePulseFusionHero2475 = intValue;
        frostHunterTransformForceShadowSolar66193.FrostHunterConstraintSetCloneMasterUltraRogue2633 = false;
        FrostHunterSharedElementPixelTitan2806(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? 4 : 2);
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        boolean z = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterObjectAnimatorPhoenixSpectraThunder6218(this.FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475(frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889, z), frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241, frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719, z);
        FrostHunterDisplayMetricsSpeedOmegaHyperion6555 frostHunterDisplayMetricsSpeedOmegaHyperion6555 = this.FrostHunterLightSensorForceFusion4241;
        frostHunterDisplayMetricsSpeedOmegaHyperion6555.getClass();
        FrostHunterModelInputOutputStrikePrime1569 frostHunterModelInputOutputStrikePrime1569 = this.FrostHunterMeteringPointBetaCyber9571;
        ArrayList arrayList = frostHunterModelInputOutputStrikePrime1569.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterModelInputOutputStrikePrime1569.FrostHunterKeyframeGammaGamma1197);
        frostHunterModelInputOutputStrikePrime1569.FrostHunterFragmentBetaMegaVortex6025 = frostHunterDisplayMetricsSpeedOmegaHyperion6555;
        for (int i = 0; i < arrayList.size(); i++) {
            FrostHunterSQLiteUltraCosmosSpectra2008 frostHunterSQLiteUltraCosmosSpectra2008 = (FrostHunterSQLiteUltraCosmosSpectra2008) arrayList.get(i);
            frostHunterModelInputOutputStrikePrime1569.FrostHunterLifecycleBlazeGammaElite2889(frostHunterSQLiteUltraCosmosSpectra2008);
            frostHunterModelInputOutputStrikePrime1569.FrostHunterRemoteConfigSpeedSpeed8566.add(frostHunterSQLiteUltraCosmosSpectra2008);
        }
        frostHunterModelInputOutputStrikePrime1569.FrostHunterKeyframeGammaGamma1197 = true;
        this.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterLevelListDrawableFusionDragonHero2232(2);
    }

    public final void FrostHunterTextViewDragonStormMega4297(IOException iOException, int i) {
        FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = new FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868(0, iOException, i);
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601 = this.FrostHunterLooperHyperionForce4133.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterInsetDrawableCelestialEclipse3601 != null) {
            frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Playback error", frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
        FrostHunterCamera2NeoMax8666(false, false);
        this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
    }

    public final void FrostHunterTransformNovaBetaNovaX5251(float f) {
        this.FrostHunterNavigationViewMasterVortexBeta1295 = f;
        float f2 = f * this.FrostHunterBillingClientFusionVortex9008.FrostHunterRemoteConfigSpeedSpeed8566;
        for (FrostHunterPaintAuroraNovaXPulse1290 frostHunterPaintAuroraNovaXPulse1290 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809 == 1) {
                frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterConstraintSetCloneMasterUltraRogue2633(2, Float.valueOf(f2));
                FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 = frostHunterPaintAuroraNovaXPulse1290.FrostHunterBundlePulseFusionHero2475;
                if (frostHunterFaceDetectionPixelFusionBlaze52912 != null) {
                    frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterConstraintSetCloneMasterUltraRogue2633(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void FrostHunterTranslateAnimationCyberSolarUltra7101() {
        this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
        throw null;
    }

    public final boolean FrostHunterViewModelScopeTitanRogue1970() {
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        return frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025 && frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241 == 0;
    }

    public final void FrostHunterViewPager2StrikePulse8790(FrostHunterSupervisorJobBetaMasterNeo7868 frostHunterSupervisorJobBetaMasterNeo7868) {
        this.FrostHunterStateCelestialNovaPixel8414 = frostHunterSupervisorJobBetaMasterNeo7868;
        FrostHunterLifecycleBlazeGammaElite2889();
    }

    public final void FrostHunterViewPhantomNeo1634() {
        FrostHunterLinearLayoutRoguePrime1122 frostHunterLinearLayoutRoguePrime1122 = this.FrostHunterPermissionInfoAlphaDelta6279;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterRewardedAdMasterStrike9463;
        boolean z = frostHunterLinearLayoutRoguePrime1122.FrostHunterConstraintSetCloneMasterUltraRogue2633 | (((FrostHunterVelocityTrackerPrimePulse4533) frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889) != frostHunterVelocityTrackerPrimePulse4533);
        frostHunterLinearLayoutRoguePrime1122.FrostHunterConstraintSetCloneMasterUltraRogue2633 = z;
        frostHunterLinearLayoutRoguePrime1122.FrostHunterLifecycleBlazeGammaElite2889 = frostHunterVelocityTrackerPrimePulse4533;
        if (z) {
            FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = this.FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterCameraXPixelTurboCosmos9814;
            frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterDialogQuantumTurbo8340(16, frostHunterThreadSpectraShadowGamma2307, frostHunterLinearLayoutRoguePrime1122));
            this.FrostHunterPermissionInfoAlphaDelta6279 = new FrostHunterLinearLayoutRoguePrime1122(this.FrostHunterRewardedAdMasterStrike9463);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960;
        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36012;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.FrostHunterPermissionInfoAlphaDelta6279.FrostHunterBundlePulseFusionHero2475(1);
                    FrostHunterObjectAnimatorPhoenixSpectraThunder6218(this.FrostHunterBillingClientFusionVortex9008.FrostHunterBundlePulseFusionHero2475(this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    FrostHunterAlertDialogAuroraDelta3200();
                    break;
                case 3:
                    FrostHunterConstraintSetCloneOmegaHyperion9304((FrostHunterAnimatorSetEliteHyper3417) message.obj);
                    break;
                case 4:
                    FrostHunterColorStateListMegaBetaFusion7423((FrostHunterCameraThunderEpicBeta3381) message.obj);
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    FrostHunterPlaceholderLegendForceNebula9869((FrostHunterColorDrawableSpeedAurora7439) message.obj);
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    FrostHunterCamera2NeoMax8666(false, true);
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    FrostHunterMagnetometerFusionTitanium8202((FrostHunterSensorManagerMegaEclipse5665) message.obj);
                    return true;
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    FrostHunterBitmapTurboDeltaNebula8743((FrostHunterDrawableDeltaLegend6817) message.obj);
                    break;
                case 9:
                    FrostHunterResourcesTitanHyperVision5823((FrostHunterDrawableDeltaLegend6817) message.obj);
                    break;
                case 10:
                    FrostHunterFCMDeltaQuantumHero8364();
                    break;
                case 11:
                    FrostHunterImageAnalysisGammaOlympian2400(message.arg1);
                    break;
                case 12:
                    FrostHunterAlphaAnimationNovaGamma6326(message.arg1 != 0);
                    break;
                case 13:
                    FrostHunterColorDrawableLegendPhoenixVision7927(message.arg1 != 0, (FrostHunterSensorManagerMegaEclipse5665) message.obj);
                    break;
                case 14:
                    FrostHunterPreviewBlazeAurora1020((FrostHunterSharedFlowShadowEpicCelestial4667) message.obj);
                    break;
                case 15:
                    FrostHunterRunnableCosmosCelestial4235((FrostHunterSharedFlowShadowEpicCelestial4667) message.obj);
                    break;
                case 16:
                    FrostHunterCameraThunderEpicBeta3381 frostHunterCameraThunderEpicBeta3381 = (FrostHunterCameraThunderEpicBeta3381) message.obj;
                    FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterCameraThunderEpicBeta3381, frostHunterCameraThunderEpicBeta3381.FrostHunterAlphaAnimationNeoCosmos5761, true, false);
                    break;
                case 17:
                    FrostHunterSoundPoolNovaTitanTitan5784((FrostHunterMLKitPrimeOlympianOmega4332) message.obj);
                    break;
                case 18:
                    FrostHunterServiceEliteCelestialThunder1757((FrostHunterMLKitPrimeOlympianOmega4332) message.obj, message.arg1);
                    break;
                case 19:
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterLooperThreadBetaHyperionMax1000(message.obj);
                    FrostHunterTranslateAnimationCyberSolarUltra7101();
                    throw null;
                case 20:
                    FrostHunterR8MasterNebulaSpark7247(message.arg1, message.arg2, (FrostHunterLifecycleCameraControllerRogueQuantum1194) message.obj);
                    break;
                case 21:
                    FrostHunterNavigationViewMasterVortexBeta1295((FrostHunterLifecycleCameraControllerRogueQuantum1194) message.obj);
                    break;
                case 22:
                    FrostHunterMediaPlayerCelestialBetaTitan3868();
                    break;
                case 23:
                    FrostHunterNestedScrollViewThunderNovaX6772(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    FrostHunterRemoteConfigSpeedSpeed8566();
                    break;
                case 26:
                    FrostHunterFCMDeltaQuantumHero8364();
                    FrostHunterPushNotificationStormTitanGamma8999(true);
                    break;
                case 27:
                    FrostHunterCoordinatorLayoutDragonHyperionSolar9277(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    FrostHunterNestedScrollViewPixelPhantom8605((FrostHunterRoomDaoSpectraPixelGamma1835) message.obj);
                    break;
                case 29:
                    FrostHunterStateCelestialNovaPixel8414();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    FrostHunterAnnotationProcessorSolarSpeedNebula4443(pair.first, (FrostHunterSensorManagerMegaEclipse5665) pair.second);
                    break;
                case 31:
                    FrostHunterColorStateListInflaterNovaQuantum4229((FrostHunterRemoteConfigEpicUltraDragon2411) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    FrostHunterTransformNovaBetaNovaX5251(((Float) message.obj).floatValue());
                    break;
                case 33:
                    FrostHunterLintTitanVortexQuantum9911(message.arg1);
                    break;
                case 34:
                    FrostHunterCameraXTurboCelestialHero5430();
                    break;
                case 35:
                    FrostHunterAnimatorSetEliteQuantum4520((FrostHunterInstrumentationDragonOmega6403) message.obj);
                    break;
                case 36:
                    FrostHunterInAppPurchaseLegendEpicDragon4579(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.FrostHunterPagingDataTurboTitanium7332 = false;
                    FrostHunterAnimatorSetEliteHyper3417 frostHunterAnimatorSetEliteHyper3417 = this.FrostHunterR8MasterNebulaSpark7247;
                    if (frostHunterAnimatorSetEliteHyper3417 != null) {
                        FrostHunterConstraintSetCloneOmegaHyperion9304(frostHunterAnimatorSetEliteHyper3417);
                        this.FrostHunterR8MasterNebulaSpark7247 = null;
                        break;
                    }
                    break;
                case 38:
                    FrostHunterViewPager2StrikePulse8790((FrostHunterSupervisorJobBetaMasterNeo7868) message.obj);
                    break;
                case 39:
                    FrostHunterLiveDataBetaLegend3442((FrostHunterMotionSceneHyperShadow8814) message.obj);
                    break;
            }
        } catch (FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 e) {
            e = e;
            int i4 = e.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterLooperThreadOlympianAurora4719 frostHunterLooperThreadOlympianAurora4719 = this.FrostHunterLooperHyperionForce4133;
            if (i4 == 1 && (frostHunterInsetDrawableCelestialEclipse36012 = frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200) != null && e.FrostHunterScaleAnimationStrikeSpark5059 == null) {
                e = e.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterInsetDrawableCelestialEclipse36012.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterAlphaAnimationNeoCosmos5761);
            }
            int i5 = e.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterScaleAnimationStrikeSpark5059;
            if (i5 == 1 && (frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = e.FrostHunterScaleAnimationStrikeSpark5059) != null && FrostHunterServiceInfoHyperionSparkMax9966(e.FrostHunterFragmentBetaMegaVortex6025, frostHunterAnimatedVectorDrawableMasterHeroHyper6960)) {
                this.FrostHunterAlphaAnimationNovaGamma6326 = true;
                FrostHunterCameraXPixelTurboCosmos9814();
                FrostHunterInsetDrawableCelestialEclipse3601 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterLooperThreadOlympianAurora4719.FrostHunterRemoteConfigSpeedSpeed8566();
                FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36013 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809;
                if (frostHunterInsetDrawableCelestialEclipse36013 != FrostHunterRemoteConfigSpeedSpeed8566) {
                    while (frostHunterInsetDrawableCelestialEclipse36013 != null) {
                        FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse36014 = frostHunterInsetDrawableCelestialEclipse36013.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        if (frostHunterInsetDrawableCelestialEclipse36014 == FrostHunterRemoteConfigSpeedSpeed8566) {
                            break;
                        }
                        frostHunterInsetDrawableCelestialEclipse36013 = frostHunterInsetDrawableCelestialEclipse36014;
                    }
                }
                frostHunterLooperThreadOlympianAurora4719.FrostHunterLightSensorForceFusion4241(frostHunterInsetDrawableCelestialEclipse36013);
                if (this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLifecycleBlazeGammaElite2889 != 4) {
                    FrostHunterDatabaseEliteShadowUltra2452();
                    frostHunterRotateDrawableMaxPrime8918.FrostHunterLevelListDrawableFusionDragonHero2232(2);
                }
            } else {
                FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 = this.FrostHunterImageAnalysisGammaOlympian2400;
                if (frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 != null) {
                    frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868.addSuppressed(e);
                    e = this.FrostHunterImageAnalysisGammaOlympian2400;
                }
                if (e.FrostHunterAlertDialogAuroraDelta3200 == 1 && frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809 != frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200) {
                    while (true) {
                        frostHunterInsetDrawableCelestialEclipse3601 = frostHunterLooperThreadOlympianAurora4719.FrostHunterFlowMaxDragonHero5809;
                        if (frostHunterInsetDrawableCelestialEclipse3601 == frostHunterLooperThreadOlympianAurora4719.FrostHunterAlertDialogAuroraDelta3200) {
                            break;
                        }
                        frostHunterLooperThreadOlympianAurora4719.FrostHunterAlphaAnimationNeoCosmos5761();
                    }
                    FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointBetaCyber9571(frostHunterInsetDrawableCelestialEclipse3601);
                    FrostHunterViewPhantomNeo1634();
                    FrostHunterWorkManagerUltraQuantumCosmos6075 frostHunterWorkManagerUltraQuantumCosmos6075 = frostHunterInsetDrawableCelestialEclipse3601.FrostHunterRemoteConfigSpeedSpeed8566;
                    FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterAlphaAnimationNeoCosmos5761;
                    long j = frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    this.FrostHunterRewardedAdMasterStrike9463 = FrostHunterLooperHyperionForce4133(frostHunterAnimatedVectorDrawableMasterHeroHyper69602, j, frostHunterWorkManagerUltraQuantumCosmos6075.FrostHunterServiceEliteCelestialThunder1757, j, true, 0);
                }
                if (e.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 && (this.FrostHunterImageAnalysisGammaOlympian2400 == null || (i2 = e.FrostHunterCameraXPixelTurboCosmos9814) == 5004 || i2 == 5003)) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Recoverable renderer error", e);
                    if (this.FrostHunterImageAnalysisGammaOlympian2400 == null) {
                        this.FrostHunterImageAnalysisGammaOlympian2400 = e;
                    }
                    FrostHunterObjectDetectionNeoBlaze6529 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterRotateDrawableMaxPrime8918.FrostHunterConstraintSetCloneMasterUltraRogue2633(25, e);
                    Handler handler = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761;
                    Message message2 = FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761();
                } else {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Playback error", e);
                    FrostHunterCamera2NeoMax8666(true, false);
                    this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLevelListDrawableFusionDragonHero2232(e);
                }
            }
        } catch (FrostHunterDiffUtilTurboSpark8131 e2) {
            boolean z2 = e2.FrostHunterCameraXPixelTurboCosmos9814;
            int i6 = e2.FrostHunterFlowMaxDragonHero5809;
            if (i6 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i6 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                FrostHunterTextViewDragonStormMega4297(e2, r3);
            }
            r3 = i;
            FrostHunterTextViewDragonStormMega4297(e2, r3);
        } catch (FrostHunterInstrumentationDragonEclipseMega6457 e3) {
            FrostHunterTextViewDragonStormMega4297(e3, e3.FrostHunterCameraXPixelTurboCosmos9814);
        } catch (FrostHunterMotionSceneTitaniumMega7732 e4) {
            FrostHunterTextViewDragonStormMega4297(e4, e4.FrostHunterCameraXPixelTurboCosmos9814);
        } catch (IOException e5) {
            FrostHunterTextViewDragonStormMega4297(e5, 2000);
        } catch (RuntimeException e6) {
            FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero38682 = new FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868(2, e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("Playback error", frostHunterAnimatedVectorDrawablePhoenixEclipseHero38682);
            FrostHunterCamera2NeoMax8666(true, false);
            this.FrostHunterRewardedAdMasterStrike9463 = this.FrostHunterRewardedAdMasterStrike9463.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterAnimatedVectorDrawablePhoenixEclipseHero38682);
        }
        FrostHunterViewPhantomNeo1634();
        return true;
    }
}
