package android.content.Context;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPreviewMaxRogue1811 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterNotificationGammaBlazePhoenix7595 {
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterAlertDialogAuroraDelta3200;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterBillingClientFusionVortex9008;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterBitmapTurboDeltaNebula8743;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterCameraXTurboCelestialHero5430;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterCardViewSpectraCyber7714;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterDatabaseEliteShadowUltra2452;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterEditTextPulseHyperion1262;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterFragmentBetaMegaVortex6025;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterKeyframeGammaGamma1197;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterLightSensorForceFusion4241;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterLintTitanVortexQuantum9911;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterLooperHyperionForce4133;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterLooperThreadBetaHyperionMax1000;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterMagnetometerFusionTitanium8202;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterMediaPlayerCelestialBetaTitan3868;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterMeteringPointBetaCyber9571;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterMeteringPointMegaCyber7955;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterMotionSceneAuroraMega2271;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterPagingDataTurboTitanium7332;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterR8MasterNebulaSpark7247;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterResourcesTitanHyperVision5823;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterScaleAnimationStrikeSpark5059;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterServiceInfoHyperionSparkMax9966;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterStateCelestialNovaPixel8414;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterTextViewDragonStormMega4297;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterTranslateAnimationCyberSolarUltra7101;
    public static final FrostHunterPreviewMaxRogue1811 FrostHunterViewPhantomNeo1634;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    static {
        int i = 0;
        FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterPreviewMaxRogue1811(i, 0);
        FrostHunterKeyframeGammaGamma1197 = new FrostHunterPreviewMaxRogue1811(i, 1);
        FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterPreviewMaxRogue1811(i, 2);
        FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterPreviewMaxRogue1811(i, 3);
        FrostHunterLightSensorForceFusion4241 = new FrostHunterPreviewMaxRogue1811(i, 4);
        FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterPreviewMaxRogue1811(i, 5);
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterPreviewMaxRogue1811(i, 6);
        FrostHunterLintTitanVortexQuantum9911 = new FrostHunterPreviewMaxRogue1811(i, 7);
        FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterPreviewMaxRogue1811(i, 8);
        FrostHunterResourcesTitanHyperVision5823 = new FrostHunterPreviewMaxRogue1811(i, 9);
        FrostHunterTextViewDragonStormMega4297 = new FrostHunterPreviewMaxRogue1811(i, 10);
        FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterPreviewMaxRogue1811(i, 11);
        FrostHunterMotionSceneAuroraMega2271 = new FrostHunterPreviewMaxRogue1811(i, 12);
        FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterPreviewMaxRogue1811(i, 13);
        FrostHunterDialogFragmentTurboPhoenixDragon7627 = new FrostHunterPreviewMaxRogue1811(i, 14);
        FrostHunterLooperHyperionForce4133 = new FrostHunterPreviewMaxRogue1811(i, 15);
        FrostHunterMeteringPointBetaCyber9571 = new FrostHunterPreviewMaxRogue1811(i, 16);
        FrostHunterServiceInfoHyperionSparkMax9966 = new FrostHunterPreviewMaxRogue1811(i, 17);
        FrostHunterEditTextPulseHyperion1262 = new FrostHunterPreviewMaxRogue1811(i, 18);
        FrostHunterDatabaseEliteShadowUltra2452 = new FrostHunterPreviewMaxRogue1811(i, 19);
        FrostHunterCardViewSpectraCyber7714 = new FrostHunterPreviewMaxRogue1811(i, 20);
        FrostHunterViewPhantomNeo1634 = new FrostHunterPreviewMaxRogue1811(i, 21);
        FrostHunterMeteringPointMegaCyber7955 = new FrostHunterPreviewMaxRogue1811(i, 22);
        FrostHunterBillingClientFusionVortex9008 = new FrostHunterPreviewMaxRogue1811(i, 23);
        FrostHunterMediaPlayerCelestialBetaTitan3868 = new FrostHunterPreviewMaxRogue1811(i, 24);
        FrostHunterTranslateAnimationCyberSolarUltra7101 = new FrostHunterPreviewMaxRogue1811(i, 25);
        FrostHunterStateCelestialNovaPixel8414 = new FrostHunterPreviewMaxRogue1811(i, 26);
        FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterPreviewMaxRogue1811(i, 27);
        FrostHunterPagingDataTurboTitanium7332 = new FrostHunterPreviewMaxRogue1811(i, 28);
        FrostHunterR8MasterNebulaSpark7247 = new FrostHunterPreviewMaxRogue1811(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterPreviewMaxRogue1811(int i, int i2) {
        super(i);
        this.FrostHunterFlowMaxDragonHero5809 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterOnLongClickListenerBlazeFusionFusion2658 frostHunterOnLongClickListenerBlazeFusionFusion2658;
        FrostHunterCountDownTimerRogueTitan5615 FrostHunterTextViewDragonStormMega42972;
        long FrostHunterR8MasterNebulaSpark72472;
        Choreographer choreographer;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        Object[] objArr = 0;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalConfiguration");
                throw null;
            case 1:
                FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalContext");
                throw null;
            case 2:
                FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalImageVectorCache");
                throw null;
            case 3:
                FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalResourceIdCache");
                throw null;
            case 4:
                FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalView");
                throw null;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return UUID.randomUUID();
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return "DEFAULT_TEST_TAG";
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra7746 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterCountDownTimerCyberVisionTitanium9970 frostHunterCountDownTimerCyberVisionTitanium9970 = FrostHunterVideoCaptureSpeedOlympianDragon5178.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterFontFamilyNeoBetaEpic8574 frostHunterCombineEliteHeroStorm8220 = new FrostHunterCombineEliteHeroStorm8220(2, objArr == true ? 1 : 0, 0);
                    Thread currentThread = Thread.currentThread();
                    FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterAlertDialogAuroraDelta3200;
                    FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212 = (FrostHunterResourceThunderSolarForce1212) frostHunterCountDownTimerCyberVisionTitanium9970.FrostHunterKeyframeGammaGamma1197(frostHunterRippleDrawableBlazeBetaStorm6320);
                    FrostHunterFCMThunderTitanium1373 frostHunterFCMThunderTitanium1373 = FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
                    if (frostHunterResourceThunderSolarForce1212 == null) {
                        frostHunterOnLongClickListenerBlazeFusionFusion2658 = FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761();
                        FrostHunterTextViewDragonStormMega42972 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterTextViewDragonStormMega4297(frostHunterFCMThunderTitanium1373, FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdMasterStrike9463(frostHunterCountDownTimerCyberVisionTitanium9970, frostHunterOnLongClickListenerBlazeFusionFusion2658), true);
                        FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra77462 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
                        if (FrostHunterTextViewDragonStormMega42972 != frostHunterFragmentTransactionBetaUltra77462 && FrostHunterTextViewDragonStormMega42972.FrostHunterKeyframeGammaGamma1197(frostHunterRippleDrawableBlazeBetaStorm6320) == null) {
                            FrostHunterTextViewDragonStormMega42972 = FrostHunterTextViewDragonStormMega42972.FrostHunterFragmentBetaMegaVortex6025(frostHunterFragmentTransactionBetaUltra77462);
                        }
                    } else {
                        frostHunterOnLongClickListenerBlazeFusionFusion2658 = (FrostHunterOnLongClickListenerBlazeFusionFusion2658) FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761.get();
                        FrostHunterTextViewDragonStormMega42972 = FrostHunterBindingAdapterSpeedNeo6677.FrostHunterTextViewDragonStormMega4297(frostHunterFCMThunderTitanium1373, frostHunterCountDownTimerCyberVisionTitanium9970, true);
                        FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra77463 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
                        if (FrostHunterTextViewDragonStormMega42972 != frostHunterFragmentTransactionBetaUltra77463 && FrostHunterTextViewDragonStormMega42972.FrostHunterKeyframeGammaGamma1197(frostHunterRippleDrawableBlazeBetaStorm6320) == null) {
                            FrostHunterTextViewDragonStormMega42972 = FrostHunterTextViewDragonStormMega42972.FrostHunterFragmentBetaMegaVortex6025(frostHunterFragmentTransactionBetaUltra77463);
                        }
                    }
                    FrostHunterGraphPrimeTitaniumSpectra6149 frostHunterGraphPrimeTitaniumSpectra6149 = new FrostHunterGraphPrimeTitaniumSpectra6149(FrostHunterTextViewDragonStormMega42972, currentThread, frostHunterOnLongClickListenerBlazeFusionFusion2658);
                    frostHunterGraphPrimeTitaniumSpectra6149.FrostHunterViewPager2StrikePulse8790(FrostHunterInsetDrawableFusionThunder3299.FrostHunterCameraXPixelTurboCosmos9814, frostHunterGraphPrimeTitaniumSpectra6149, frostHunterCombineEliteHeroStorm8220);
                    FrostHunterOnLongClickListenerBlazeFusionFusion2658 frostHunterOnLongClickListenerBlazeFusionFusion26582 = frostHunterGraphPrimeTitaniumSpectra6149.FrostHunterFragmentBetaMegaVortex6025;
                    if (frostHunterOnLongClickListenerBlazeFusionFusion26582 != null) {
                        int i2 = FrostHunterOnLongClickListenerBlazeFusionFusion2658.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        frostHunterOnLongClickListenerBlazeFusionFusion26582.FrostHunterPagingDataTurboTitanium7332(false);
                    }
                    while (true) {
                        if (frostHunterOnLongClickListenerBlazeFusionFusion26582 != null) {
                            try {
                                FrostHunterR8MasterNebulaSpark72472 = frostHunterOnLongClickListenerBlazeFusionFusion26582.FrostHunterR8MasterNebulaSpark7247();
                            } catch (Throwable th) {
                                if (frostHunterOnLongClickListenerBlazeFusionFusion26582 != null) {
                                    int i3 = FrostHunterOnLongClickListenerBlazeFusionFusion2658.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                    frostHunterOnLongClickListenerBlazeFusionFusion26582.FrostHunterStateCelestialNovaPixel8414(false);
                                }
                                throw th;
                            }
                        } else {
                            FrostHunterR8MasterNebulaSpark72472 = Long.MAX_VALUE;
                        }
                        if (frostHunterGraphPrimeTitaniumSpectra6149.FrostHunterTransitionListenerPulseVortexCosmos7949()) {
                            if (frostHunterOnLongClickListenerBlazeFusionFusion26582 != null) {
                                int i4 = FrostHunterOnLongClickListenerBlazeFusionFusion2658.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                frostHunterOnLongClickListenerBlazeFusionFusion26582.FrostHunterStateCelestialNovaPixel8414(false);
                            }
                            Object FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterPermissionInfoAlphaDelta6279(FrostHunterDelayPhoenixRogueLegend5759.FrostHunterCameraXPixelTurboCosmos9814.get(frostHunterGraphPrimeTitaniumSpectra6149));
                            FrostHunterImageViewTitaniumVision4682 frostHunterImageViewTitaniumVision4682 = FrostHunterPermissionInfoAlphaDelta6279 instanceof FrostHunterImageViewTitaniumVision4682 ? (FrostHunterImageViewTitaniumVision4682) FrostHunterPermissionInfoAlphaDelta6279 : null;
                            if (frostHunterImageViewTitaniumVision4682 != null) {
                                throw frostHunterImageViewTitaniumVision4682.FrostHunterAlphaAnimationNeoCosmos5761;
                            }
                            choreographer = (Choreographer) FrostHunterPermissionInfoAlphaDelta6279;
                        } else {
                            LockSupport.parkNanos(frostHunterGraphPrimeTitaniumSpectra6149, FrostHunterR8MasterNebulaSpark72472);
                            if (Thread.interrupted()) {
                                frostHunterGraphPrimeTitaniumSpectra6149.FrostHunterLooperThreadBetaHyperionMax1000(new InterruptedException());
                            }
                        }
                    }
                }
                FrostHunterFaceDetectionOmegaBlazeInferno2129 frostHunterFaceDetectionOmegaBlazeInferno2129 = new FrostHunterFaceDetectionOmegaBlazeInferno2129(choreographer, FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDialogFragmentTurboPhoenixDragon7627(Looper.getMainLooper()));
                return FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdMasterStrike9463(frostHunterFaceDetectionOmegaBlazeInferno2129, frostHunterFaceDetectionOmegaBlazeInferno2129.FrostHunterResourcesTitanHyperVision5823);
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                return frostHunterLinearLayoutSolarHero7990;
            case 11:
                return null;
            case 12:
                return FrostHunterAuthMaxBeta2395.FrostHunterBundlePulseFusionHero2475(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 13:
                return Boolean.TRUE;
            case 14:
            case 15:
                return null;
            case 16:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalAutofillManager");
                throw null;
            case 17:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalAutofillTree");
                throw null;
            case 18:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalClipboard");
                throw null;
            case 19:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalClipboardManager");
                throw null;
            case 20:
                return Boolean.TRUE;
            case 21:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalDensity");
                throw null;
            case 22:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalFocusManager");
                throw null;
            case 23:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalFontFamilyResolver");
                throw null;
            case 24:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalFontLoader");
                throw null;
            case 25:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalGraphicsContext");
                throw null;
            case 26:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalHapticFeedback");
                throw null;
            case 27:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalInputManager");
                throw null;
            case 28:
                FrostHunterActionBarTitanBeta1231.FrostHunterConstraintSetCloneMasterUltraRogue2633("LocalLayoutDirection");
                throw null;
            default:
                return null;
        }
    }
}
