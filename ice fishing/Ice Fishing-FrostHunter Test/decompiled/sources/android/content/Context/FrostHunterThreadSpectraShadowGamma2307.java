package android.content.Context;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import com.adjust.sdk.network.ErrorCodes;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.GlassNewActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterThreadSpectraShadowGamma2307 {
    public final FrostHunterRotateDrawableMaxPrime8918 FrostHunterAlertDialogAuroraDelta3200;
    public final FrostHunterGyroscopeBetaVisionInferno6797 FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterAnnotationProcessorSparkEclipse8710;
    public int FrostHunterBillingClientFusionVortex9008;
    public final FrostHunterResourcesPixelVortexSpark3581 FrostHunterBitmapTurboDeltaNebula8743;
    public final FrostHunterVideoCaptureNovaAurora4338 FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterFaceDetectionPixelFusionBlaze5291[] FrostHunterCameraXPixelTurboCosmos9814;
    public final FrostHunterDispatchersBetaNova8419 FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterTraceHyperionAuroraNebula9947 FrostHunterCardViewSpectraCyber7714;
    public FrostHunterSharedPreferencesPixelOlympianCyber8894 FrostHunterColorDrawableLegendPhoenixVision7927;
    public boolean FrostHunterColorStateListInflaterNovaQuantum4229;
    public final FrostHunterSurfaceViewPhantomHyperion3032 FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public boolean FrostHunterConstraintSetCloneOmegaHyperion9304;
    public final FrostHunterColorStateListOmegaHero9965 FrostHunterDatabaseEliteShadowUltra2452;
    public final androidx.media3.common.audio.FrostHunterAdapterDelegateNebulaRogue3354 FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public final FrostHunterEventShadowStrike2576 FrostHunterEditTextPulseHyperion1262;
    public final FrostHunterRoomDaoSpectraPixelGamma1835 FrostHunterFCMDeltaQuantumHero8364;
    public final boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterLiveDataScopeShadowCelestialMax5831 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterAlertDialogEliteMasterCosmos7701 FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterPackageManagerEclipseTitanPulse8946 FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterThreadSpectraShadowGamma2307 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final Context FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterRoomEntityFusionQuantumFusion6361 FrostHunterLightSensorForceFusion4241;
    public final FrostHunterPagingSourcePulseTitanAlpha4802 FrostHunterLintTitanVortexQuantum9911;
    public FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLiveDataBetaLegend3442;
    public final FrostHunterItemDecorationNovaPulseHyperion9221 FrostHunterLooperHyperionForce4133;
    public final FrostHunterAssetManagerQuantumRogue9837 FrostHunterLooperThreadBetaHyperionMax1000;
    public final FrostHunterSupervisorJobBetaMasterNeo7868 FrostHunterMagnetometerFusionTitanium8202;
    public int FrostHunterMediaPlayerCelestialBetaTitan3868;
    public final FrostHunterTextWatcherNovaXStormRogue9640 FrostHunterMeteringPointBetaCyber9571;
    public final FrostHunterIntentForceSpeed4935 FrostHunterMeteringPointMegaCyber7955;
    public final FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 FrostHunterMotionSceneAuroraMega2271;
    public Surface FrostHunterNavigationMasterMegaMax2752;
    public long FrostHunterNestedScrollViewThunderNovaX6772;
    public final FrostHunterColorDrawableSpeedAurora7439 FrostHunterPagingDataTurboTitanium7332;
    public Object FrostHunterPagingSourceEclipseDelta8255;
    public FrostHunterSharedPreferencesPixelOlympianCyber8894 FrostHunterPermissionInfoAlphaDelta6279;
    public boolean FrostHunterPreviewBlazeAurora1020;
    public float FrostHunterPushNotificationStormTitanGamma8999;
    public FrostHunterLifecycleCameraControllerRogueQuantum1194 FrostHunterR8MasterNebulaSpark7247;
    public final FrostHunterFaceDetectionPixelFusionBlaze5291[] FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterRemoteConfigEpicUltraDragon2411 FrostHunterRemoteConfigThunderShadow4435;
    public final Looper FrostHunterResourcesTitanHyperVision5823;
    public FrostHunterVideoCaptureNovaAurora4338 FrostHunterRewardedAdMasterStrike9463;
    public FrostHunterThemeOverlayStrikeCelestial4609 FrostHunterRewardedAdSpectraElite8288;
    public final int FrostHunterRunnableCosmosCelestial4235;
    public final ArrayList FrostHunterScaleAnimationStrikeSpark5059;
    public final CopyOnWriteArraySet FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterSensorManagerMegaEclipse5665 FrostHunterServiceEliteCelestialThunder1757;
    public final long FrostHunterServiceInfoHyperionSparkMax9966;
    public int FrostHunterSoundPoolNovaTitanTitan5784;
    public boolean FrostHunterStateCelestialNovaPixel8414;
    public final FrostHunterDisplayMetricsSpeedOmegaHyperion6555 FrostHunterTextViewDragonStormMega4297;
    public final int FrostHunterTransitionListenerPulseVortexCosmos7949;
    public int FrostHunterTranslateAnimationCyberSolarUltra7101;
    public final FrostHunterIntentForceSpeed4935 FrostHunterViewPhantomNeo1634;

    static {
        FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterAlphaAnimationNeoCosmos5761("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x032d A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:3:0x0020, B:6:0x009a, B:7:0x00a3, B:9:0x00a9, B:11:0x00b7, B:13:0x013f, B:15:0x014c, B:16:0x0174, B:18:0x017a, B:20:0x0190, B:21:0x0266, B:23:0x026c, B:30:0x0276, B:33:0x027f, B:35:0x0295, B:36:0x02aa, B:38:0x02f3, B:40:0x02f7, B:42:0x02fb, B:46:0x0303, B:49:0x0318, B:51:0x032d, B:52:0x0335, B:58:0x0311), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0311 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:3:0x0020, B:6:0x009a, B:7:0x00a3, B:9:0x00a9, B:11:0x00b7, B:13:0x013f, B:15:0x014c, B:16:0x0174, B:18:0x017a, B:20:0x0190, B:21:0x0266, B:23:0x026c, B:30:0x0276, B:33:0x027f, B:35:0x0295, B:36:0x02aa, B:38:0x02f3, B:40:0x02f7, B:42:0x02fb, B:46:0x0303, B:49:0x0318, B:51:0x032d, B:52:0x0335, B:58:0x0311), top: B:2:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterThreadSpectraShadowGamma2307(FrostHunterRemoteConfigLegendGammaPhantom1184 frostHunterRemoteConfigLegendGammaPhantom1184) {
        boolean z;
        FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion9221;
        GlassNewActivity glassNewActivity = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterGyroscopeBetaVisionInferno6797();
        this.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterSensorManagerMegaEclipse5665();
        try {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761 + "]");
            Looper looper = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterRemoteConfigSpeedSpeed8566;
            FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue9837 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterLifecycleBlazeGammaElite2889 = glassNewActivity.getApplicationContext();
            this.FrostHunterCameraXTurboCelestialHero5430 = new FrostHunterDispatchersBetaNova8419(frostHunterAssetManagerQuantumRogue9837);
            this.FrostHunterRunnableCosmosCelestial4235 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterCameraXPixelTurboCosmos9814;
            this.FrostHunterRemoteConfigThunderShadow4435 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterFlowMaxDragonHero5809;
            this.FrostHunterTransitionListenerPulseVortexCosmos7949 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterAlertDialogAuroraDelta3200;
            this.FrostHunterConstraintSetCloneOmegaHyperion9304 = false;
            this.FrostHunterServiceInfoHyperionSparkMax9966 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            FrostHunterProcessCameraProviderQuantumNovaXHyperion4894 frostHunterProcessCameraProviderQuantumNovaXHyperion4894 = new FrostHunterProcessCameraProviderQuantumNovaXHyperion4894(this);
            this.FrostHunterMotionSceneAuroraMega2271 = frostHunterProcessCameraProviderQuantumNovaXHyperion4894;
            this.FrostHunterBitmapTurboDeltaNebula8743 = new FrostHunterResourcesPixelVortexSpark3581();
            FrostHunterFaceDetectionPixelFusionBlaze5291[] FrostHunterLightSensorForceFusion4241 = ((FrostHunterIntentForceSpeed4935) frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterBundlePulseFusionHero2475.get()).FrostHunterLightSensorForceFusion4241(new Handler(looper), frostHunterProcessCameraProviderQuantumNovaXHyperion4894, frostHunterProcessCameraProviderQuantumNovaXHyperion4894, frostHunterProcessCameraProviderQuantumNovaXHyperion4894, frostHunterProcessCameraProviderQuantumNovaXHyperion4894);
            this.FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterLightSensorForceFusion4241;
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(FrostHunterLightSensorForceFusion4241.length > 0);
            this.FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterFaceDetectionPixelFusionBlaze5291[FrostHunterLightSensorForceFusion4241.length];
            int i = 0;
            while (true) {
                FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr = this.FrostHunterCameraXPixelTurboCosmos9814;
                if (i >= frostHunterFaceDetectionPixelFusionBlaze5291Arr.length) {
                    break;
                }
                int i2 = this.FrostHunterRemoteConfigSpeedSpeed8566[i].FrostHunterFlowMaxDragonHero5809;
                frostHunterFaceDetectionPixelFusionBlaze5291Arr[i] = null;
                i++;
            }
            this.FrostHunterFlowMaxDragonHero5809 = (FrostHunterLiveDataScopeShadowCelestialMax5831) frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLifecycleBlazeGammaElite2889.get();
            this.FrostHunterLintTitanVortexQuantum9911 = (FrostHunterPagingSourcePulseTitanAlpha4802) frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterServiceEliteCelestialThunder1757.get();
            this.FrostHunterTextViewDragonStormMega4297 = (FrostHunterDisplayMetricsSpeedOmegaHyperion6555) frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLevelListDrawableFusionDragonHero2232.get();
            this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterKeyframeGammaGamma1197;
            this.FrostHunterPagingDataTurboTitanium7332 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterFragmentBetaMegaVortex6025;
            this.FrostHunterMagnetometerFusionTitanium8202 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            this.FrostHunterResourcesTitanHyperVision5823 = looper;
            this.FrostHunterLooperThreadBetaHyperionMax1000 = frostHunterAssetManagerQuantumRogue9837;
            this.FrostHunterLevelListDrawableFusionDragonHero2232 = this;
            this.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterAlertDialogEliteMasterCosmos7701(new CopyOnWriteArraySet(), looper, looper.getThread(), frostHunterAssetManagerQuantumRogue9837, new FrostHunterVibratorSpectraBetaNovaX4683(2, this), true);
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new CopyOnWriteArraySet();
            this.FrostHunterScaleAnimationStrikeSpark5059 = new ArrayList();
            this.FrostHunterR8MasterNebulaSpark7247 = new FrostHunterLifecycleCameraControllerRogueQuantum1194();
            this.FrostHunterFCMDeltaQuantumHero8364 = FrostHunterRoomDaoSpectraPixelGamma1835.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr2 = this.FrostHunterRemoteConfigSpeedSpeed8566;
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterSurfaceViewPhantomHyperion3032(new FrostHunterResourcesOmegaOlympianOlympian5268[frostHunterFaceDetectionPixelFusionBlaze5291Arr2.length], new FrostHunterBindingAdapterOmegaBlaze8548[frostHunterFaceDetectionPixelFusionBlaze5291Arr2.length], FrostHunterCameraXAuroraVortex8383.FrostHunterConstraintSetCloneMasterUltraRogue2633, null);
            this.FrostHunterLightSensorForceFusion4241 = new FrostHunterRoomEntityFusionQuantumFusion6361();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i4 = iArr[i3];
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
                sparseBooleanArray.append(i4, true);
            }
            this.FrostHunterFlowMaxDragonHero5809.getClass();
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
            sparseBooleanArray.append(29, true);
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
            FrostHunterAsyncNebulaCosmos7324 frostHunterAsyncNebulaCosmos7324 = new FrostHunterAsyncNebulaCosmos7324(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = frostHunterAsyncNebulaCosmos7324.FrostHunterAlphaAnimationNeoCosmos5761;
            this.FrostHunterBundlePulseFusionHero2475 = new FrostHunterVideoCaptureNovaAurora4338(frostHunterAsyncNebulaCosmos7324);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i5 = 0; i5 < sparseBooleanArray2.size(); i5++) {
                FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i5, sparseBooleanArray2.size());
                int keyAt = sparseBooleanArray2.keyAt(i5);
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
                sparseBooleanArray3.append(keyAt, true);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
            sparseBooleanArray3.append(4, true);
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
            sparseBooleanArray3.append(10, true);
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!false);
            this.FrostHunterRewardedAdMasterStrike9463 = new FrostHunterVideoCaptureNovaAurora4338(new FrostHunterAsyncNebulaCosmos7324(sparseBooleanArray3));
            this.FrostHunterAlertDialogAuroraDelta3200 = this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterResourcesTitanHyperVision5823, null);
            FrostHunterViewPager2DeltaThunder2760 frostHunterViewPager2DeltaThunder2760 = new FrostHunterViewPager2DeltaThunder2760(this);
            this.FrostHunterLiveDataBetaLegend3442 = FrostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200(this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            this.FrostHunterCameraXTurboCelestialHero5430.FrostHunterMagnetometerFusionTitanium8202(this.FrostHunterLevelListDrawableFusionDragonHero2232, this.FrostHunterResourcesTitanHyperVision5823);
            final FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion1536 = new FrostHunterToolbarPixelHyperion1536(frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterBitmapTurboDeltaNebula8743);
            FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946 = new FrostHunterPackageManagerEclipseTitanPulse8946(this.FrostHunterLifecycleBlazeGammaElite2889, this.FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, new FrostHunterMeteringPointEclipseTitan1504(), this.FrostHunterTextViewDragonStormMega4297, this.FrostHunterBillingClientFusionVortex9008, this.FrostHunterCameraXTurboCelestialHero5430, this.FrostHunterPagingDataTurboTitanium7332, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLightSensorForceFusion4241, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterResourcesTitanHyperVision5823, this.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterViewPager2DeltaThunder2760, frostHunterToolbarPixelHyperion1536, this.FrostHunterFCMDeltaQuantumHero8364, this.FrostHunterBitmapTurboDeltaNebula8743, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterDialogFragmentTurboPhoenixDragon7627);
            FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterScaleAnimationStrikeSpark5059;
            this.FrostHunterKeyframeGammaGamma1197 = frostHunterPackageManagerEclipseTitanPulse8946;
            Looper looper2 = frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911;
            this.FrostHunterPushNotificationStormTitanGamma8999 = 1.0f;
            this.FrostHunterBillingClientFusionVortex9008 = 0;
            FrostHunterSharedPreferencesPixelOlympianCyber8894 frostHunterSharedPreferencesPixelOlympianCyber8894 = FrostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterEditTextPulseHyperion1262;
            this.FrostHunterPermissionInfoAlphaDelta6279 = frostHunterSharedPreferencesPixelOlympianCyber8894;
            this.FrostHunterColorDrawableLegendPhoenixVision7927 = frostHunterSharedPreferencesPixelOlympianCyber8894;
            this.FrostHunterSoundPoolNovaTitanTitan5784 = -1;
            FrostHunterFlipAnimationOlympianInfernoHyper5815 frostHunterFlipAnimationOlympianInfernoHyper5815 = FrostHunterItemDecorationSparkFusionCelestial5742.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterAnnotationProcessorSparkEclipse8710 = true;
            FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = this.FrostHunterCameraXTurboCelestialHero5430;
            FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = this.FrostHunterFragmentBetaMegaVortex6025;
            frostHunterDispatchersBetaNova8419.getClass();
            frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDispatchersBetaNova8419);
            FrostHunterDisplayMetricsSpeedOmegaHyperion6555 frostHunterDisplayMetricsSpeedOmegaHyperion6555 = this.FrostHunterTextViewDragonStormMega4297;
            Handler handler = new Handler(this.FrostHunterResourcesTitanHyperVision5823);
            FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova84192 = this.FrostHunterCameraXTurboCelestialHero5430;
            frostHunterDisplayMetricsSpeedOmegaHyperion6555.getClass();
            frostHunterDispatchersBetaNova84192.getClass();
            FrostHunterOnPreDrawListenerSpeedPulseNovaX3490 frostHunterOnPreDrawListenerSpeedPulseNovaX3490 = frostHunterDisplayMetricsSpeedOmegaHyperion6555.FrostHunterBundlePulseFusionHero2475;
            frostHunterOnPreDrawListenerSpeedPulseNovaX3490.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = frostHunterOnPreDrawListenerSpeedPulseNovaX3490.FrostHunterAlphaAnimationNeoCosmos5761;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                FrostHunterActivityInfoSpeedGamma4158 frostHunterActivityInfoSpeedGamma4158 = (FrostHunterActivityInfoSpeedGamma4158) it.next();
                if (frostHunterActivityInfoSpeedGamma4158.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterDispatchersBetaNova84192) {
                    frostHunterActivityInfoSpeedGamma4158.FrostHunterBundlePulseFusionHero2475 = true;
                    copyOnWriteArrayList.remove(frostHunterActivityInfoSpeedGamma4158);
                }
            }
            copyOnWriteArrayList.add(new FrostHunterActivityInfoSpeedGamma4158(handler, frostHunterDispatchersBetaNova84192));
            this.FrostHunterServiceConnectionTurboPhoenixOmega6719.add(this.FrostHunterMotionSceneAuroraMega2271);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                final Context context = this.FrostHunterLifecycleBlazeGammaElite2889;
                final boolean z2 = frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLooperThreadBetaHyperionMax1000;
                this.FrostHunterLooperThreadBetaHyperionMax1000.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911, null).FrostHunterServiceEliteCelestialThunder1757(new Runnable() { // from class: android.content.Context.FrostHunterEventMaxHeroAurora9135
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlaybackSession createPlaybackSession;
                        FrostHunterTextRecognitionMaxHeroHyper6407 frostHunterTextRecognitionMaxHeroHyper6407;
                        LogSessionId sessionId;
                        boolean equals;
                        LogSessionId unused;
                        Context context2 = context;
                        boolean z3 = z2;
                        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = this;
                        FrostHunterToolbarPixelHyperion1536 frostHunterToolbarPixelHyperion15362 = frostHunterToolbarPixelHyperion1536;
                        MediaMetricsManager FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAudioManagerTitanBetaMega4705.FrostHunterAlphaAnimationNeoCosmos5761(context2.getSystemService("media_metrics"));
                        if (FrostHunterAlphaAnimationNeoCosmos5761 == null) {
                            frostHunterTextRecognitionMaxHeroHyper6407 = null;
                        } else {
                            createPlaybackSession = FrostHunterAlphaAnimationNeoCosmos5761.createPlaybackSession();
                            frostHunterTextRecognitionMaxHeroHyper6407 = new FrostHunterTextRecognitionMaxHeroHyper6407(context2, createPlaybackSession);
                        }
                        if (frostHunterTextRecognitionMaxHeroHyper6407 == null) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("MediaMetricsService unavailable.");
                            return;
                        }
                        if (z3) {
                            FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova84193 = frostHunterThreadSpectraShadowGamma2307.FrostHunterCameraXTurboCelestialHero5430;
                            frostHunterDispatchersBetaNova84193.getClass();
                            frostHunterDispatchersBetaNova84193.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterTextRecognitionMaxHeroHyper6407);
                        }
                        sessionId = frostHunterTextRecognitionMaxHeroHyper6407.FrostHunterServiceEliteCelestialThunder1757.getSessionId();
                        synchronized (frostHunterToolbarPixelHyperion15362) {
                            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = frostHunterToolbarPixelHyperion15362.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            frostHunterSQLiteMasterUltra9956.getClass();
                            LogSessionId logSessionId = (LogSessionId) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
                            unused = LogSessionId.LOG_SESSION_ID_NONE;
                            equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
                            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(equals);
                            frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809 = sessionId;
                        }
                    }
                });
            }
            Looper looper3 = this.FrostHunterResourcesTitanHyperVision5823;
            FrostHunterAssetManagerQuantumRogue9837 frostHunterAssetManagerQuantumRogue98372 = this.FrostHunterLooperThreadBetaHyperionMax1000;
            FrostHunterViewPager2DeltaThunder2760 frostHunterViewPager2DeltaThunder27602 = new FrostHunterViewPager2DeltaThunder2760(this);
            FrostHunterEventShadowStrike2576 frostHunterEventShadowStrike2576 = new FrostHunterEventShadowStrike2576();
            frostHunterEventShadowStrike2576.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAssetManagerQuantumRogue98372.FrostHunterAlphaAnimationNeoCosmos5761(looper2, null);
            frostHunterEventShadowStrike2576.FrostHunterBundlePulseFusionHero2475 = frostHunterAssetManagerQuantumRogue98372.FrostHunterAlphaAnimationNeoCosmos5761(looper3, null);
            frostHunterEventShadowStrike2576.FrostHunterLifecycleBlazeGammaElite2889 = 0;
            frostHunterEventShadowStrike2576.FrostHunterLevelListDrawableFusionDragonHero2232 = 0;
            frostHunterEventShadowStrike2576.FrostHunterServiceEliteCelestialThunder1757 = frostHunterViewPager2DeltaThunder27602;
            this.FrostHunterEditTextPulseHyperion1262 = frostHunterEventShadowStrike2576;
            frostHunterEventShadowStrike2576.FrostHunterBundlePulseFusionHero2475(new FrostHunterFilterAlphaSparkSpeed9857(14, this));
            androidx.media3.common.audio.FrostHunterAdapterDelegateNebulaRogue3354 frostHunterAdapterDelegateNebulaRogue3354 = new androidx.media3.common.audio.FrostHunterAdapterDelegateNebulaRogue3354(glassNewActivity, looper2, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterRemoteConfigSpeedSpeed8566, this.FrostHunterMotionSceneAuroraMega2271, this.FrostHunterLooperThreadBetaHyperionMax1000);
            this.FrostHunterDialogFragmentTurboPhoenixDragon7627 = frostHunterAdapterDelegateNebulaRogue3354;
            frostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761();
            if (frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLintTitanVortexQuantum9911 != Integer.MAX_VALUE && frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterCameraXTurboCelestialHero5430 != Integer.MAX_VALUE && frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterResourcesTitanHyperVision5823 != Integer.MAX_VALUE && frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterTextViewDragonStormMega4297 != Integer.MAX_VALUE) {
                z = true;
                frostHunterItemDecorationNovaPulseHyperion9221 = new FrostHunterItemDecorationNovaPulseHyperion9221(glassNewActivity, looper2, this.FrostHunterLooperThreadBetaHyperionMax1000);
                this.FrostHunterLooperHyperionForce4133 = frostHunterItemDecorationNovaPulseHyperion9221;
                if (frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterAlphaAnimationNeoCosmos5761 == z) {
                    frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterAlphaAnimationNeoCosmos5761 = z;
                    frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterConstraintSetCloneMasterUltraRogue2633(z, frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                }
                this.FrostHunterMeteringPointBetaCyber9571 = new FrostHunterTextWatcherNovaXStormRogue9640(glassNewActivity, looper2, this.FrostHunterLooperThreadBetaHyperionMax1000);
                int i7 = FrostHunterOnTouchListenerMegaVortex5044.FrostHunterBundlePulseFusionHero2475;
                FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel5536 = FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757;
                this.FrostHunterRewardedAdSpectraElite8288 = FrostHunterThemeOverlayStrikeCelestial4609.FrostHunterBundlePulseFusionHero2475;
                this.FrostHunterCardViewSpectraCyber7714 = i6 < 34 ? new FrostHunterTraceHyperionAuroraNebula9947(this, glassNewActivity) : null;
                this.FrostHunterViewPhantomNeo1634 = new FrostHunterIntentForceSpeed4935(23);
                this.FrostHunterMeteringPointMegaCyber7955 = new FrostHunterIntentForceSpeed4935(23);
                this.FrostHunterDatabaseEliteShadowUltra2452 = new FrostHunterColorStateListOmegaHero9965(this, this.FrostHunterMotionSceneAuroraMega2271, this.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLintTitanVortexQuantum9911, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterCameraXTurboCelestialHero5430, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterResourcesTitanHyperVision5823, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterTextViewDragonStormMega4297);
                frostHunterRotateDrawableMaxPrime8918.FrostHunterConstraintSetCloneMasterUltraRogue2633(38, this.FrostHunterMagnetometerFusionTitanium8202).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon2411 = this.FrostHunterRemoteConfigThunderShadow4435;
                FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero2475 = FrostHunterRotateDrawableMaxPrime8918.FrostHunterBundlePulseFusionHero2475();
                FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.obtainMessage(31, 0, 0, frostHunterRemoteConfigEpicUltraDragon2411);
                FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                FrostHunterTextViewDragonStormMega4297(1, 3, this.FrostHunterRemoteConfigThunderShadow4435);
                FrostHunterTextViewDragonStormMega4297(2, 4, Integer.valueOf(this.FrostHunterTransitionListenerPulseVortexCosmos7949));
                FrostHunterTextViewDragonStormMega4297(2, 5, 0);
                FrostHunterTextViewDragonStormMega4297(1, 9, Boolean.valueOf(this.FrostHunterConstraintSetCloneOmegaHyperion9304));
                FrostHunterTextViewDragonStormMega4297(6, 8, this.FrostHunterBitmapTurboDeltaNebula8743);
                FrostHunterTextViewDragonStormMega4297(-1, 16, Integer.valueOf(this.FrostHunterRunnableCosmosCelestial4235));
                this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475();
            }
            z = false;
            frostHunterItemDecorationNovaPulseHyperion9221 = new FrostHunterItemDecorationNovaPulseHyperion9221(glassNewActivity, looper2, this.FrostHunterLooperThreadBetaHyperionMax1000);
            this.FrostHunterLooperHyperionForce4133 = frostHunterItemDecorationNovaPulseHyperion9221;
            if (frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterAlphaAnimationNeoCosmos5761 == z) {
            }
            this.FrostHunterMeteringPointBetaCyber9571 = new FrostHunterTextWatcherNovaXStormRogue9640(glassNewActivity, looper2, this.FrostHunterLooperThreadBetaHyperionMax1000);
            int i72 = FrostHunterOnTouchListenerMegaVortex5044.FrostHunterBundlePulseFusionHero2475;
            FrostHunterCoroutineSolarPixel5536 frostHunterCoroutineSolarPixel55362 = FrostHunterCoroutineSolarPixel5536.FrostHunterServiceEliteCelestialThunder1757;
            this.FrostHunterRewardedAdSpectraElite8288 = FrostHunterThemeOverlayStrikeCelestial4609.FrostHunterBundlePulseFusionHero2475;
            this.FrostHunterCardViewSpectraCyber7714 = i6 < 34 ? new FrostHunterTraceHyperionAuroraNebula9947(this, glassNewActivity) : null;
            this.FrostHunterViewPhantomNeo1634 = new FrostHunterIntentForceSpeed4935(23);
            this.FrostHunterMeteringPointMegaCyber7955 = new FrostHunterIntentForceSpeed4935(23);
            this.FrostHunterDatabaseEliteShadowUltra2452 = new FrostHunterColorStateListOmegaHero9965(this, this.FrostHunterMotionSceneAuroraMega2271, this.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterLintTitanVortexQuantum9911, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterCameraXTurboCelestialHero5430, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterResourcesTitanHyperVision5823, frostHunterRemoteConfigLegendGammaPhantom1184.FrostHunterTextViewDragonStormMega4297);
            frostHunterRotateDrawableMaxPrime8918.FrostHunterConstraintSetCloneMasterUltraRogue2633(38, this.FrostHunterMagnetometerFusionTitanium8202).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            FrostHunterRemoteConfigEpicUltraDragon2411 frostHunterRemoteConfigEpicUltraDragon24112 = this.FrostHunterRemoteConfigThunderShadow4435;
            FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero24752 = FrostHunterRotateDrawableMaxPrime8918.FrostHunterBundlePulseFusionHero2475();
            FrostHunterBundlePulseFusionHero24752.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.obtainMessage(31, 0, 0, frostHunterRemoteConfigEpicUltraDragon24112);
            FrostHunterBundlePulseFusionHero24752.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            FrostHunterTextViewDragonStormMega4297(1, 3, this.FrostHunterRemoteConfigThunderShadow4435);
            FrostHunterTextViewDragonStormMega4297(2, 4, Integer.valueOf(this.FrostHunterTransitionListenerPulseVortexCosmos7949));
            FrostHunterTextViewDragonStormMega4297(2, 5, 0);
            FrostHunterTextViewDragonStormMega4297(1, 9, Boolean.valueOf(this.FrostHunterConstraintSetCloneOmegaHyperion9304));
            FrostHunterTextViewDragonStormMega4297(6, 8, this.FrostHunterBitmapTurboDeltaNebula8743);
            FrostHunterTextViewDragonStormMega4297(-1, 16, Integer.valueOf(this.FrostHunterRunnableCosmosCelestial4235));
            this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475();
        } catch (Throwable th) {
            this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475();
            throw th;
        }
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307, final int i, final int i2) {
        FrostHunterThemeOverlayStrikeCelestial4609 frostHunterThemeOverlayStrikeCelestial4609 = frostHunterThreadSpectraShadowGamma2307.FrostHunterRewardedAdSpectraElite8288;
        if (i == frostHunterThemeOverlayStrikeCelestial4609.FrostHunterAlphaAnimationNeoCosmos5761 && i2 == frostHunterThemeOverlayStrikeCelestial4609.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            return;
        }
        frostHunterThreadSpectraShadowGamma2307.FrostHunterRewardedAdSpectraElite8288 = new FrostHunterThemeOverlayStrikeCelestial4609(i, i2);
        frostHunterThreadSpectraShadowGamma2307.FrostHunterFragmentBetaMegaVortex6025.FrostHunterLifecycleBlazeGammaElite2889(24, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterColorStateListInflaterStrikeBlazePulse4652
            @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
            public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterTextViewDragonStormMega4297(i, i2);
            }
        });
        frostHunterThreadSpectraShadowGamma2307.FrostHunterTextViewDragonStormMega4297(2, 14, new FrostHunterThemeOverlayStrikeCelestial4609(i, i2));
    }

    public static FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLintTitanVortexQuantum9911(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533, int i) {
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterRemoteConfigSpeedSpeed8566(i);
        return (i == 1 || i == 4) ? FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterConstraintSetCloneMasterUltraRogue2633(false) : FrostHunterRemoteConfigSpeedSpeed8566;
    }

    public static long FrostHunterScaleAnimationStrikeSpark5059(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533) {
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = new FrostHunterGyroscopeBetaVisionInferno6797();
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = new FrostHunterRoomEntityFusionQuantumFusion6361();
        frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion6361);
        long j = frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475;
        return j == -9223372036854775807L ? frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlertDialogAuroraDelta3200 : frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889 + j;
    }

    public final FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta3200() {
        FrostHunterDatabaseEliteShadowUltra2452();
        return this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final void FrostHunterBitmapTurboDeltaNebula8743(float f) {
        FrostHunterDatabaseEliteShadowUltra2452();
        final float FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterLevelListDrawableFusionDragonHero2232(f, 0.0f, 1.0f);
        if (this.FrostHunterPushNotificationStormTitanGamma8999 == FrostHunterLevelListDrawableFusionDragonHero2232) {
            return;
        }
        this.FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterLevelListDrawableFusionDragonHero2232;
        this.FrostHunterKeyframeGammaGamma1197.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(32, Float.valueOf(FrostHunterLevelListDrawableFusionDragonHero2232)).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterLifecycleBlazeGammaElite2889(22, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterLinearLayoutVisionBeta7673
            @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
            public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                ((FrostHunterHandlerStrikeNova5644) obj).FrostHunterLightSensorForceFusion4241(FrostHunterLevelListDrawableFusionDragonHero2232);
            }
        });
    }

    public final long FrostHunterBundlePulseFusionHero2475(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533) {
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long j = frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
        if (!frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterFlowMaxDragonHero5809(frostHunterVelocityTrackerPrimePulse4533));
        }
        Object obj = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterLightSensorForceFusion4241;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361);
        if (j == -9223372036854775807L) {
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterStrictModeNebulaEliteHyper7105.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterKeyframeGammaGamma1197(frostHunterVelocityTrackerPrimePulse4533), this.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterAlertDialogAuroraDelta3200);
        }
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(j) + FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889);
    }

    public final long FrostHunterCameraXPixelTurboCosmos9814() {
        FrostHunterDatabaseEliteShadowUltra2452();
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterFlowMaxDragonHero5809(this.FrostHunterLiveDataBetaLegend3442));
    }

    public final void FrostHunterCameraXTurboCelestialHero5430() {
        FrostHunterDatabaseEliteShadowUltra2452();
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889 != 1) {
            return;
        }
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLevelListDrawableFusionDragonHero2232(null);
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLintTitanVortexQuantum9911 = FrostHunterLintTitanVortexQuantum9911(FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? 4 : 2);
        this.FrostHunterMediaPlayerCelestialBetaTitan3868++;
        this.FrostHunterKeyframeGammaGamma1197.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761(29).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterLintTitanVortexQuantum9911, 1, false, 5, -9223372036854775807L, -1);
    }

    public final FrostHunterSharedPreferencesPixelOlympianCyber8894 FrostHunterConstraintSetCloneMasterUltraRogue2633() {
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200();
        if (FrostHunterAlertDialogAuroraDelta3200.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return this.FrostHunterColorDrawableLegendPhoenixVision7927;
        }
        FrostHunterGradientDrawableDeltaTitaniumPhoenix9347 frostHunterGradientDrawableDeltaTitaniumPhoenix9347 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLevelListDrawableFusionDragonHero2232(), this.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterAlphaAnimationSolarPrime2514 FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterColorDrawableLegendPhoenixVision7927.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterSharedPreferencesPixelOlympianCyber8894 frostHunterSharedPreferencesPixelOlympianCyber8894 = frostHunterGradientDrawableDeltaTitaniumPhoenix9347.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterSharedPreferencesPixelOlympianCyber8894 != null) {
            FrostHunterAlarmManagerHeroTitaniumFusion5758 frostHunterAlarmManagerHeroTitaniumFusion5758 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterServiceInfoHyperionSparkMax9966;
            byte[] bArr = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLevelListDrawableFusionDragonHero2232;
            CharSequence charSequence = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterAlphaAnimationNeoCosmos5761;
            if (charSequence != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761 = charSequence;
            }
            CharSequence charSequence2 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (charSequence2 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633 = charSequence2;
            }
            CharSequence charSequence3 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterBundlePulseFusionHero2475;
            if (charSequence3 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475 = charSequence3;
            }
            CharSequence charSequence4 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterServiceEliteCelestialThunder1757;
            if (charSequence4 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757 = charSequence4;
            }
            CharSequence charSequence5 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLifecycleBlazeGammaElite2889;
            if (charSequence5 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889 = charSequence5;
            }
            if (bArr != null) {
                Integer num = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterRemoteConfigSpeedSpeed8566;
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232 = bArr == null ? null : (byte[]) bArr.clone();
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566 = num;
                FrostHunterSharedPreferencesPixelOlympianCyber8894 frostHunterSharedPreferencesPixelOlympianCyber88942 = FrostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterEditTextPulseHyperion1262;
            }
            Integer num2 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterCameraXPixelTurboCosmos9814;
            if (num2 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814 = num2;
            }
            Integer num3 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterFlowMaxDragonHero5809;
            if (num3 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809 = num3;
            }
            Integer num4 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterAlertDialogAuroraDelta3200;
            if (num4 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200 = num4;
            }
            Boolean bool = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterKeyframeGammaGamma1197;
            if (bool != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197 = bool;
            }
            Integer num5 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterFragmentBetaMegaVortex6025;
            if (num5 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025 = num5;
            }
            Integer num6 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (num6 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025 = num6;
            }
            Integer num7 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLightSensorForceFusion4241;
            if (num7 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719 = num7;
            }
            Integer num8 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterScaleAnimationStrikeSpark5059;
            if (num8 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLightSensorForceFusion4241 = num8;
            }
            Integer num9 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (num9 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterScaleAnimationStrikeSpark5059 = num9;
            }
            Integer num10 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLintTitanVortexQuantum9911;
            if (num10 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = num10;
            }
            Integer num11 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterCameraXTurboCelestialHero5430;
            if (num11 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLintTitanVortexQuantum9911 = num11;
            }
            CharSequence charSequence6 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterResourcesTitanHyperVision5823;
            if (charSequence6 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXTurboCelestialHero5430 = charSequence6;
            }
            CharSequence charSequence7 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterTextViewDragonStormMega4297;
            if (charSequence7 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterResourcesTitanHyperVision5823 = charSequence7;
            }
            CharSequence charSequence8 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLooperThreadBetaHyperionMax1000;
            if (charSequence8 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterTextViewDragonStormMega4297 = charSequence8;
            }
            Integer num12 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterMotionSceneAuroraMega2271;
            if (num12 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperThreadBetaHyperionMax1000 = num12;
            }
            Integer num13 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterBitmapTurboDeltaNebula8743;
            if (num13 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMotionSceneAuroraMega2271 = num13;
            }
            CharSequence charSequence9 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterDialogFragmentTurboPhoenixDragon7627;
            if (charSequence9 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBitmapTurboDeltaNebula8743 = charSequence9;
            }
            CharSequence charSequence10 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterLooperHyperionForce4133;
            if (charSequence10 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterDialogFragmentTurboPhoenixDragon7627 = charSequence10;
            }
            Integer num14 = frostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterMeteringPointBetaCyber9571;
            if (num14 != null) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperHyperionForce4133 = num14;
            }
            if (!frostHunterAlarmManagerHeroTitaniumFusion5758.isEmpty()) {
                FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMeteringPointBetaCyber9571 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterKeyframeGammaGamma1197(frostHunterAlarmManagerHeroTitaniumFusion5758);
            }
        }
        return new FrostHunterSharedPreferencesPixelOlympianCyber8894(FrostHunterAlphaAnimationNeoCosmos5761);
    }

    public final void FrostHunterDatabaseEliteShadowUltra2452() {
        this.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.FrostHunterResourcesTitanHyperVision5823;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.FrostHunterAnnotationProcessorSparkEclipse8710) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(str2);
            } else {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927(str2, this.FrostHunterPreviewBlazeAurora1020 ? null : new IllegalStateException());
                this.FrostHunterPreviewBlazeAurora1020 = true;
            }
        }
    }

    public final void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868 frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868) {
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterBundlePulseFusionHero2475 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterBundlePulseFusionHero2475(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        FrostHunterBundlePulseFusionHero2475.FrostHunterLintTitanVortexQuantum9911 = FrostHunterBundlePulseFusionHero2475.FrostHunterResourcesTitanHyperVision5823;
        FrostHunterBundlePulseFusionHero2475.FrostHunterCameraXTurboCelestialHero5430 = 0L;
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLintTitanVortexQuantum9911(FrostHunterBundlePulseFusionHero2475, 1).FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterAnimatedVectorDrawablePhoenixEclipseHero3868);
        this.FrostHunterMediaPlayerCelestialBetaTitan3868++;
        this.FrostHunterKeyframeGammaGamma1197.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterAlphaAnimationNeoCosmos5761(6).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterLevelListDrawableFusionDragonHero2232, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void FrostHunterEditTextPulseHyperion1262() {
        int FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241();
        FrostHunterTextWatcherNovaXStormRogue9640 frostHunterTextWatcherNovaXStormRogue9640 = this.FrostHunterMeteringPointBetaCyber9571;
        FrostHunterItemDecorationNovaPulseHyperion9221 frostHunterItemDecorationNovaPulseHyperion9221 = this.FrostHunterLooperHyperionForce4133;
        boolean z = false;
        if (FrostHunterLightSensorForceFusion4241 != 1) {
            if (FrostHunterLightSensorForceFusion4241 == 2 || FrostHunterLightSensorForceFusion4241 == 3) {
                FrostHunterDatabaseEliteShadowUltra2452();
                boolean z2 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if (FrostHunterServiceConnectionTurboPhoenixOmega6719() && !z2) {
                    z = true;
                }
                frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterBundlePulseFusionHero2475(z);
                frostHunterTextWatcherNovaXStormRogue9640.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceConnectionTurboPhoenixOmega6719());
                return;
            }
            if (FrostHunterLightSensorForceFusion4241 != 4) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                return;
            }
        }
        frostHunterItemDecorationNovaPulseHyperion9221.FrostHunterBundlePulseFusionHero2475(false);
        frostHunterTextWatcherNovaXStormRogue9640.FrostHunterConstraintSetCloneMasterUltraRogue2633(false);
    }

    public final boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterDatabaseEliteShadowUltra2452();
        return this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    public final long FrostHunterFlowMaxDragonHero5809(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533) {
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(this.FrostHunterNestedScrollViewThunderNovaX6772);
        }
        long FrostHunterKeyframeGammaGamma1197 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 ? frostHunterVelocityTrackerPrimePulse4533.FrostHunterKeyframeGammaGamma1197() : frostHunterVelocityTrackerPrimePulse4533.FrostHunterResourcesTitanHyperVision5823;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
            return FrostHunterKeyframeGammaGamma1197;
        }
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterLightSensorForceFusion4241;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361);
        return FrostHunterKeyframeGammaGamma1197 + frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final long FrostHunterFragmentBetaMegaVortex6025() {
        FrostHunterDatabaseEliteShadowUltra2452();
        if (!FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200();
            if (FrostHunterAlertDialogAuroraDelta3200.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                return -9223372036854775807L;
            }
            return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterAlertDialogAuroraDelta3200.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLevelListDrawableFusionDragonHero2232(), this.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterKeyframeGammaGamma1197);
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterLightSensorForceFusion4241;
        frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, frostHunterRoomEntityFusionQuantumFusion6361);
        return FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterBundlePulseFusionHero2475));
    }

    public final int FrostHunterKeyframeGammaGamma1197(FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533) {
        return frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? this.FrostHunterSoundPoolNovaTitanTitan5784 : frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterLightSensorForceFusion4241).FrostHunterBundlePulseFusionHero2475;
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterDatabaseEliteShadowUltra2452();
        int FrostHunterKeyframeGammaGamma1197 = FrostHunterKeyframeGammaGamma1197(this.FrostHunterLiveDataBetaLegend3442);
        if (FrostHunterKeyframeGammaGamma1197 == -1) {
            return 0;
        }
        return FrostHunterKeyframeGammaGamma1197;
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889() {
        FrostHunterDatabaseEliteShadowUltra2452();
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475;
        }
        return -1;
    }

    public final int FrostHunterLightSensorForceFusion4241() {
        FrostHunterDatabaseEliteShadowUltra2452();
        return this.FrostHunterLiveDataBetaLegend3442.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final void FrostHunterLooperHyperionForce4133() {
        int FrostHunterKeyframeGammaGamma1197;
        int FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterVideoCaptureNovaAurora4338 frostHunterVideoCaptureNovaAurora4338 = this.FrostHunterRewardedAdMasterStrike9463;
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterThreadSpectraShadowGamma2307.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta3200 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200();
        boolean z = false;
        boolean z2 = !FrostHunterAlertDialogAuroraDelta3200.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && FrostHunterAlertDialogAuroraDelta3200.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232(), frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterLevelListDrawableFusionDragonHero2232;
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta32002 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200();
        if (FrostHunterAlertDialogAuroraDelta32002.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterKeyframeGammaGamma1197 = -1;
        } else {
            int FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232();
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            int i = frostHunterThreadSpectraShadowGamma2307.FrostHunterBillingClientFusionVortex9008;
            if (i == 1) {
                i = 0;
            }
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            FrostHunterKeyframeGammaGamma1197 = FrostHunterAlertDialogAuroraDelta32002.FrostHunterKeyframeGammaGamma1197(FrostHunterLevelListDrawableFusionDragonHero2232, i);
        }
        boolean z3 = FrostHunterKeyframeGammaGamma1197 != -1;
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta32003 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200();
        if (FrostHunterAlertDialogAuroraDelta32003.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterLifecycleBlazeGammaElite2889 = -1;
        } else {
            int FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232();
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            int i2 = frostHunterThreadSpectraShadowGamma2307.FrostHunterBillingClientFusionVortex9008;
            if (i2 == 1) {
                i2 = 0;
            }
            frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
            FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterAlertDialogAuroraDelta32003.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterLevelListDrawableFusionDragonHero22322, i2, false);
        }
        boolean z4 = FrostHunterLifecycleBlazeGammaElite2889 != -1;
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta32004 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200();
        boolean z5 = !FrostHunterAlertDialogAuroraDelta32004.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && FrostHunterAlertDialogAuroraDelta32004.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232(), frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterStrictModeNebulaEliteHyper7105 FrostHunterAlertDialogAuroraDelta32005 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200();
        boolean z6 = !FrostHunterAlertDialogAuroraDelta32005.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && FrostHunterAlertDialogAuroraDelta32005.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterThreadSpectraShadowGamma2307.FrostHunterLevelListDrawableFusionDragonHero2232(), frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterRemoteConfigSpeedSpeed8566;
        boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 = frostHunterThreadSpectraShadowGamma2307.FrostHunterAlertDialogAuroraDelta3200().FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = new FrostHunterSQLiteMasterUltra9956(27);
        FrostHunterDebugRogueElite2722 frostHunterDebugRogueElite2722 = (FrostHunterDebugRogueElite2722) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
        SparseBooleanArray sparseBooleanArray = this.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterDebugRogueElite2722.getClass();
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterDialogFragmentTurboPhoenixDragon7627(i3, sparseBooleanArray.size());
            frostHunterDebugRogueElite2722.FrostHunterAlphaAnimationNeoCosmos5761(sparseBooleanArray.keyAt(i3));
        }
        boolean z7 = !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(4, z7);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(5, z2 && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(6, z3 && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(7, !FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 && (z3 || !z5 || z2) && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(8, z4 && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(9, !FrostHunterFirebaseModelDownloadConditionsSolarBlaze22232 && (z4 || (z5 && z6)) && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(10, z7);
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(11, z2 && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
        if (z2 && !FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            z = true;
        }
        frostHunterSQLiteMasterUltra9956.FrostHunterBundlePulseFusionHero2475(12, z);
        FrostHunterVideoCaptureNovaAurora4338 frostHunterVideoCaptureNovaAurora43382 = new FrostHunterVideoCaptureNovaAurora4338(frostHunterDebugRogueElite2722.FrostHunterConstraintSetCloneMasterUltraRogue2633());
        this.FrostHunterRewardedAdMasterStrike9463 = frostHunterVideoCaptureNovaAurora43382;
        if (frostHunterVideoCaptureNovaAurora43382.equals(frostHunterVideoCaptureNovaAurora4338)) {
            return;
        }
        this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(13, new FrostHunterViewPager2DeltaThunder2760(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterGradientDrawableDeltaTitaniumPhoenix9347 frostHunterGradientDrawableDeltaTitaniumPhoenix9347) {
        int i;
        long FrostHunterPagingDataTurboTitanium7332;
        Pair FrostHunterFlowMaxDragonHero5809;
        long j;
        int i2;
        List list;
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterBundlePulseFusionHero2475;
        int i3;
        FrostHunterBitmapNeoCosmos7205 FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(frostHunterGradientDrawableDeltaTitaniumPhoenix9347);
        FrostHunterDatabaseEliteShadowUltra2452();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < FrostHunterScaleAnimationStrikeSpark5059.FrostHunterKeyframeGammaGamma1197; i4++) {
            arrayList.add(this.FrostHunterLintTitanVortexQuantum9911.FrostHunterConstraintSetCloneMasterUltraRogue2633((FrostHunterGradientDrawableDeltaTitaniumPhoenix9347) FrostHunterScaleAnimationStrikeSpark5059.get(i4)));
        }
        FrostHunterDatabaseEliteShadowUltra2452();
        FrostHunterKeyframeGammaGamma1197(this.FrostHunterLiveDataBetaLegend3442);
        FrostHunterCameraXPixelTurboCosmos9814();
        this.FrostHunterMediaPlayerCelestialBetaTitan3868++;
        ArrayList arrayList2 = this.FrostHunterScaleAnimationStrikeSpark5059;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            FrostHunterSQLiteUltraCosmosSpectra2008 frostHunterSQLiteUltraCosmosSpectra2008 = new FrostHunterSQLiteUltraCosmosSpectra2008((FrostHunterKotlinOlympianHeroCosmos8366) arrayList.get(i5), this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223);
            arrayList3.add(frostHunterSQLiteUltraCosmosSpectra2008);
            arrayList2.add(i5, new FrostHunterKotlinVortexSolarShadow3219(frostHunterSQLiteUltraCosmosSpectra2008.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterSQLiteUltraCosmosSpectra2008.FrostHunterAlphaAnimationNeoCosmos5761));
        }
        FrostHunterLifecycleCameraControllerRogueQuantum1194 frostHunterLifecycleCameraControllerRogueQuantum1194 = this.FrostHunterR8MasterNebulaSpark7247;
        int size = arrayList3.size();
        frostHunterLifecycleCameraControllerRogueQuantum1194.getClass();
        this.FrostHunterR8MasterNebulaSpark7247 = new FrostHunterLifecycleCameraControllerRogueQuantum1194(new Random(frostHunterLifecycleCameraControllerRogueQuantum1194.FrostHunterAlphaAnimationNeoCosmos5761.nextLong())).FrostHunterAlphaAnimationNeoCosmos5761(size);
        FrostHunterImageAnalysisPrimeSpectraNova7921 frostHunterImageAnalysisPrimeSpectraNova7921 = new FrostHunterImageAnalysisPrimeSpectraNova7921(this.FrostHunterScaleAnimationStrikeSpark5059, this.FrostHunterR8MasterNebulaSpark7247);
        if (!frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && -1 >= frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterServiceEliteCelestialThunder1757) {
            throw new FrostHunterTranslateAnimationHyperionNovaXElite2841();
        }
        int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterAlphaAnimationNeoCosmos5761(false);
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        if (frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            this.FrostHunterSoundPoolNovaTitanTitan5784 = FrostHunterAlphaAnimationNeoCosmos5761;
            this.FrostHunterNestedScrollViewThunderNovaX6772 = 0L;
            FrostHunterFlowMaxDragonHero5809 = null;
        } else {
            if (FrostHunterAlphaAnimationNeoCosmos5761 == -1 || FrostHunterAlphaAnimationNeoCosmos5761 >= frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterServiceEliteCelestialThunder1757) {
                int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterAlphaAnimationNeoCosmos5761(false);
                FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterAlphaAnimationNeoCosmos57612, frostHunterGyroscopeBetaVisionInferno6797, 0L);
                i = FrostHunterAlphaAnimationNeoCosmos57612;
                FrostHunterPagingDataTurboTitanium7332 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(frostHunterGyroscopeBetaVisionInferno6797.FrostHunterAlertDialogAuroraDelta3200);
            } else {
                i = FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterPagingDataTurboTitanium7332 = -9223372036854775807L;
            }
            FrostHunterFlowMaxDragonHero5809 = frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterLightSensorForceFusion4241, i, FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(FrostHunterPagingDataTurboTitanium7332));
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() || FrostHunterFlowMaxDragonHero5809 != null);
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
        long FrostHunterBundlePulseFusionHero24752 = FrostHunterBundlePulseFusionHero2475(frostHunterVelocityTrackerPrimePulse4533);
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterFlowMaxDragonHero58092 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFlowMaxDragonHero5809(frostHunterImageAnalysisPrimeSpectraNova7921);
        if (frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = FrostHunterVelocityTrackerPrimePulse4533.FrostHunterLooperThreadBetaHyperionMax1000;
            long FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(this.FrostHunterNestedScrollViewThunderNovaX6772);
            FrostHunterVelocityTrackerPrimePulse4533 FrostHunterBundlePulseFusionHero24753 = FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatedVectorDrawableMasterHeroHyper6960, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterDatabaseEliteShadowUltra2452, FrostHunterDatabaseEliteShadowUltra2452, 0L, FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025).FrostHunterBundlePulseFusionHero2475(frostHunterAnimatedVectorDrawableMasterHeroHyper6960);
            FrostHunterBundlePulseFusionHero24753.FrostHunterLintTitanVortexQuantum9911 = FrostHunterBundlePulseFusionHero24753.FrostHunterResourcesTitanHyperVision5823;
            i2 = 1;
            FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero24753;
            j = -9223372036854775807L;
        } else {
            Object obj = FrostHunterFlowMaxDragonHero58092.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
            j = -9223372036854775807L;
            boolean equals = obj.equals(FrostHunterFlowMaxDragonHero5809.first);
            i2 = 1;
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = !equals ? new FrostHunterAnimatedVectorDrawableMasterHeroHyper6960(FrostHunterFlowMaxDragonHero5809.first) : FrostHunterFlowMaxDragonHero58092.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            long longValue = ((Long) FrostHunterFlowMaxDragonHero5809.second).longValue();
            long FrostHunterDatabaseEliteShadowUltra24522 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(FrostHunterBundlePulseFusionHero24752);
            if (!frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                FrostHunterDatabaseEliteShadowUltra24522 -= frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, this.FrostHunterLightSensorForceFusion4241).FrostHunterLifecycleBlazeGammaElite2889;
                if (equals && FrostHunterDatabaseEliteShadowUltra24522 - longValue == 1 && FrostHunterDatabaseEliteShadowUltra24522 == frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(obj, this.FrostHunterLightSensorForceFusion4241).FrostHunterServiceEliteCelestialThunder1757) {
                    FrostHunterDatabaseEliteShadowUltra24522--;
                }
            }
            if (!equals || longValue < FrostHunterDatabaseEliteShadowUltra24522) {
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                FrostHunterMergeHyperTitan4255 frostHunterMergeHyperTitan4255 = !equals ? FrostHunterMergeHyperTitan4255.FrostHunterServiceEliteCelestialThunder1757 : FrostHunterFlowMaxDragonHero58092.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = !equals ? this.FrostHunterConstraintSetCloneMasterUltraRogue2633 : FrostHunterFlowMaxDragonHero58092.FrostHunterFlowMaxDragonHero5809;
                if (equals) {
                    list = FrostHunterFlowMaxDragonHero58092.FrostHunterAlertDialogAuroraDelta3200;
                } else {
                    FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                    list = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
                }
                FrostHunterBundlePulseFusionHero2475 = FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatedVectorDrawableMasterHeroHyper69603, longValue, longValue, longValue, 0L, frostHunterMergeHyperTitan4255, frostHunterSurfaceViewPhantomHyperion3032, list).FrostHunterBundlePulseFusionHero2475(frostHunterAnimatedVectorDrawableMasterHeroHyper69603);
                FrostHunterBundlePulseFusionHero2475.FrostHunterLintTitanVortexQuantum9911 = longValue;
            } else if (longValue == FrostHunterDatabaseEliteShadowUltra24522) {
                int FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFlowMaxDragonHero58092.FrostHunterKeyframeGammaGamma1197.FrostHunterAlphaAnimationNeoCosmos5761);
                if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != -1) {
                    FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterLightSensorForceFusion4241;
                    frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterRoomEntityFusionQuantumFusion6361, false);
                    int i6 = frostHunterRoomEntityFusionQuantumFusion6361.FrostHunterBundlePulseFusionHero2475;
                    Object obj2 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterAlphaAnimationNeoCosmos5761;
                    FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63612 = this.FrostHunterLightSensorForceFusion4241;
                    frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterRemoteConfigSpeedSpeed8566(obj2, frostHunterRoomEntityFusionQuantumFusion63612);
                    if (i6 == frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterBundlePulseFusionHero2475) {
                        FrostHunterBundlePulseFusionHero2475 = FrostHunterFlowMaxDragonHero58092;
                    }
                }
                frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterLightSensorForceFusion4241);
                boolean FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63613 = this.FrostHunterLightSensorForceFusion4241;
                long FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterConstraintSetCloneMasterUltraRogue26332 ? frostHunterRoomEntityFusionQuantumFusion63613.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterBundlePulseFusionHero2475) : frostHunterRoomEntityFusionQuantumFusion63613.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69604 = frostHunterAnimatedVectorDrawableMasterHeroHyper69602;
                FrostHunterBundlePulseFusionHero2475 = FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatedVectorDrawableMasterHeroHyper69604, FrostHunterFlowMaxDragonHero58092.FrostHunterResourcesTitanHyperVision5823, FrostHunterFlowMaxDragonHero58092.FrostHunterResourcesTitanHyperVision5823, FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757, FrostHunterAlphaAnimationNeoCosmos57613 - FrostHunterFlowMaxDragonHero58092.FrostHunterResourcesTitanHyperVision5823, FrostHunterFlowMaxDragonHero58092.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterFlowMaxDragonHero58092.FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero58092.FrostHunterAlertDialogAuroraDelta3200).FrostHunterBundlePulseFusionHero2475(frostHunterAnimatedVectorDrawableMasterHeroHyper69604);
                FrostHunterBundlePulseFusionHero2475.FrostHunterLintTitanVortexQuantum9911 = FrostHunterAlphaAnimationNeoCosmos57613;
            } else {
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                long max = Math.max(0L, FrostHunterFlowMaxDragonHero58092.FrostHunterCameraXTurboCelestialHero5430 - (longValue - FrostHunterDatabaseEliteShadowUltra24522));
                long j2 = FrostHunterFlowMaxDragonHero58092.FrostHunterLintTitanVortexQuantum9911;
                if (FrostHunterFlowMaxDragonHero58092.FrostHunterKeyframeGammaGamma1197.equals(FrostHunterFlowMaxDragonHero58092.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                    j2 = longValue + max;
                }
                FrostHunterVelocityTrackerPrimePulse4533 FrostHunterServiceEliteCelestialThunder1757 = FrostHunterFlowMaxDragonHero58092.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatedVectorDrawableMasterHeroHyper69602, longValue, longValue, longValue, max, FrostHunterFlowMaxDragonHero58092.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterFlowMaxDragonHero58092.FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero58092.FrostHunterAlertDialogAuroraDelta3200);
                FrostHunterServiceEliteCelestialThunder1757.FrostHunterLintTitanVortexQuantum9911 = j2;
                FrostHunterBundlePulseFusionHero2475 = FrostHunterServiceEliteCelestialThunder1757;
            }
        }
        int i7 = i2;
        if (FrostHunterBundlePulseFusionHero2475.FrostHunterLifecycleBlazeGammaElite2889 == i7) {
            i3 = i7;
        } else {
            i3 = 4;
            if (!frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                if (FrostHunterAlphaAnimationNeoCosmos5761 == -1) {
                    i3 = FrostHunterBundlePulseFusionHero2475.FrostHunterLifecycleBlazeGammaElite2889;
                } else if (FrostHunterAlphaAnimationNeoCosmos5761 < frostHunterImageAnalysisPrimeSpectraNova7921.FrostHunterServiceEliteCelestialThunder1757) {
                    i3 = 2;
                }
            }
        }
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLintTitanVortexQuantum9911 = FrostHunterLintTitanVortexQuantum9911(FrostHunterBundlePulseFusionHero2475, i3);
        this.FrostHunterKeyframeGammaGamma1197.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(17, new FrostHunterMLKitPrimeOlympianOmega4332(arrayList3, this.FrostHunterR8MasterNebulaSpark7247, FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterGyroscopeHeroAlpha1995.FrostHunterDatabaseEliteShadowUltra2452(j))).FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterLintTitanVortexQuantum9911, 0, (this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761.equals(FrostHunterLintTitanVortexQuantum9911.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761) || this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) ? 0 : i7, 4, FrostHunterFlowMaxDragonHero5809(FrostHunterLintTitanVortexQuantum9911), -1);
    }

    public final void FrostHunterMeteringPointBetaCyber9571(int i, boolean z) {
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        int i2 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025 == z && i2 == i3 && frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719 == i) {
            return;
        }
        this.FrostHunterMediaPlayerCelestialBetaTitan3868++;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            frostHunterVelocityTrackerPrimePulse4533 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLifecycleBlazeGammaElite2889 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889(i, i3, z);
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = this.FrostHunterKeyframeGammaGamma1197.FrostHunterScaleAnimationStrikeSpark5059;
        frostHunterRotateDrawableMaxPrime8918.getClass();
        FrostHunterObjectDetectionNeoBlaze6529 FrostHunterBundlePulseFusionHero2475 = FrostHunterRotateDrawableMaxPrime8918.FrostHunterBundlePulseFusionHero2475();
        FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterRotateDrawableMaxPrime8918.FrostHunterAlphaAnimationNeoCosmos5761.obtainMessage(1, z ? 1 : 0, i | (i3 << 4));
        FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterLifecycleBlazeGammaElite2889, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void FrostHunterMotionSceneAuroraMega2271(Surface surface) {
        Object obj = this.FrostHunterPagingSourceEclipseDelta8255;
        boolean z = true;
        boolean z2 = (obj == null || obj == surface) ? false : true;
        long j = z2 ? this.FrostHunterServiceInfoHyperionSparkMax9966 : -9223372036854775807L;
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946 = this.FrostHunterKeyframeGammaGamma1197;
        if (!frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPagingSourceEclipseDelta8255 && frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911.getThread().isAlive()) {
            FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665 = new FrostHunterSensorManagerMegaEclipse5665(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterBitmapTurboDeltaNebula8743);
            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(30, new Pair(surface, frostHunterSensorManagerMegaEclipse5665)).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            if (j != -9223372036854775807L) {
                z = frostHunterSensorManagerMegaEclipse5665.FrostHunterConstraintSetCloneMasterUltraRogue2633(j);
            }
        }
        if (z2) {
            Object obj2 = this.FrostHunterPagingSourceEclipseDelta8255;
            Surface surface2 = this.FrostHunterNavigationMasterMegaMax2752;
            if (obj2 == surface2) {
                surface2.release();
                this.FrostHunterNavigationMasterMegaMax2752 = null;
            }
        }
        this.FrostHunterPagingSourceEclipseDelta8255 = surface;
        if (z) {
            return;
        }
        FrostHunterDialogFragmentTurboPhoenixDragon7627(new FrostHunterAnimatedVectorDrawablePhoenixEclipseHero3868(2, new FrostHunterLinearLayoutSolarTurboSpark3070("Detaching surface timed out."), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    public final int FrostHunterRemoteConfigSpeedSpeed8566() {
        FrostHunterDatabaseEliteShadowUltra2452();
        if (!this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
            return frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        int i = this.FrostHunterSoundPoolNovaTitanTitan5784;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final void FrostHunterResourcesTitanHyperVision5823() {
        String str;
        boolean z;
        Context context;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761);
        sb.append("] [");
        HashSet hashSet = FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterAlphaAnimationNeoCosmos5761;
        synchronized (FrostHunterColorStateListInflaterNovaXLegend5808.class) {
            str = FrostHunterColorStateListInflaterNovaXLegend5808.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        sb.append(str);
        sb.append("]");
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202(sb.toString());
        FrostHunterDatabaseEliteShadowUltra2452();
        this.FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterAlphaAnimationNeoCosmos5761();
        int i = 0;
        this.FrostHunterLooperHyperionForce4133.FrostHunterBundlePulseFusionHero2475(false);
        this.FrostHunterMeteringPointBetaCyber9571.FrostHunterConstraintSetCloneMasterUltraRogue2633(false);
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterCardViewSpectraCyber7714;
        if (frostHunterTraceHyperionAuroraNebula9947 != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809).get()) != null) {
            context.unregisterDeviceIdChangeListener((FrostHunterButtonStrikeHeroMaster5769) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200);
        }
        FrostHunterColorStateListOmegaHero9965 frostHunterColorStateListOmegaHero9965 = this.FrostHunterDatabaseEliteShadowUltra2452;
        ((FrostHunterRotateDrawableMaxPrime8918) frostHunterColorStateListOmegaHero9965.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761.removeCallbacksAndMessages(null);
        FrostHunterThreadSpectraShadowGamma2307 frostHunterThreadSpectraShadowGamma2307 = (FrostHunterThreadSpectraShadowGamma2307) frostHunterColorStateListOmegaHero9965.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterObjectAnimatorNeoOmegaLegend2402 frostHunterObjectAnimatorNeoOmegaLegend2402 = (FrostHunterObjectAnimatorNeoOmegaLegend2402) frostHunterColorStateListOmegaHero9965.FrostHunterLevelListDrawableFusionDragonHero2232;
        frostHunterThreadSpectraShadowGamma2307.FrostHunterDatabaseEliteShadowUltra2452();
        FrostHunterAlertDialogEliteMasterCosmos7701 frostHunterAlertDialogEliteMasterCosmos7701 = frostHunterThreadSpectraShadowGamma2307.FrostHunterFragmentBetaMegaVortex6025;
        frostHunterObjectAnimatorNeoOmegaLegend2402.getClass();
        if (frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterFlowMaxDragonHero5809) {
            FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(Thread.currentThread() == frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterServiceEliteCelestialThunder1757;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            FrostHunterCamera2TurboSolar4584 frostHunterCamera2TurboSolar4584 = (FrostHunterCamera2TurboSolar4584) it.next();
            if (frostHunterCamera2TurboSolar4584.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterObjectAnimatorNeoOmegaLegend2402)) {
                FrostHunterTransitionNebulaBlaze7285 frostHunterTransitionNebulaBlaze7285 = frostHunterAlertDialogEliteMasterCosmos7701.FrostHunterBundlePulseFusionHero2475;
                frostHunterCamera2TurboSolar4584.FrostHunterServiceEliteCelestialThunder1757 = true;
                if (frostHunterTransitionNebulaBlaze7285 != null && frostHunterCamera2TurboSolar4584.FrostHunterBundlePulseFusionHero2475) {
                    frostHunterCamera2TurboSolar4584.FrostHunterBundlePulseFusionHero2475 = false;
                    frostHunterTransitionNebulaBlaze7285.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterCamera2TurboSolar4584.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterCamera2TurboSolar4584.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                }
                copyOnWriteArraySet.remove(frostHunterCamera2TurboSolar4584);
            }
        }
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946 = this.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPagingSourceEclipseDelta8255 || !frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911.getThread().isAlive()) {
            z = true;
        } else {
            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterPagingSourceEclipseDelta8255 = true;
            FrostHunterSensorManagerMegaEclipse5665 frostHunterSensorManagerMegaEclipse5665 = new FrostHunterSensorManagerMegaEclipse5665(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterBitmapTurboDeltaNebula8743);
            frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633(7, frostHunterSensorManagerMegaEclipse5665).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            z = frostHunterSensorManagerMegaEclipse5665.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterEditTextPulseHyperion1262);
        }
        int i2 = 10;
        if (!z) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterLifecycleBlazeGammaElite2889(10, new FrostHunterVibratorSpectraBetaNovaX4683(i));
        }
        this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceEliteCelestialThunder1757();
        this.FrostHunterAlertDialogAuroraDelta3200.FrostHunterAlphaAnimationNeoCosmos5761.removeCallbacksAndMessages(null);
        FrostHunterDisplayMetricsSpeedOmegaHyperion6555 frostHunterDisplayMetricsSpeedOmegaHyperion6555 = this.FrostHunterTextViewDragonStormMega4297;
        FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova8419 = this.FrostHunterCameraXTurboCelestialHero5430;
        CopyOnWriteArrayList copyOnWriteArrayList = frostHunterDisplayMetricsSpeedOmegaHyperion6555.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            FrostHunterActivityInfoSpeedGamma4158 frostHunterActivityInfoSpeedGamma4158 = (FrostHunterActivityInfoSpeedGamma4158) it2.next();
            if (frostHunterActivityInfoSpeedGamma4158.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterDispatchersBetaNova8419) {
                frostHunterActivityInfoSpeedGamma4158.FrostHunterBundlePulseFusionHero2475 = true;
                copyOnWriteArrayList.remove(frostHunterActivityInfoSpeedGamma4158);
            }
        }
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533 = this.FrostHunterLiveDataBetaLegend3442;
        if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            this.FrostHunterLiveDataBetaLegend3442 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterLintTitanVortexQuantum9911 = FrostHunterLintTitanVortexQuantum9911(this.FrostHunterLiveDataBetaLegend3442, 1);
        this.FrostHunterLiveDataBetaLegend3442 = FrostHunterLintTitanVortexQuantum9911;
        FrostHunterVelocityTrackerPrimePulse4533 FrostHunterBundlePulseFusionHero2475 = FrostHunterLintTitanVortexQuantum9911.FrostHunterBundlePulseFusionHero2475(FrostHunterLintTitanVortexQuantum9911.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        this.FrostHunterLiveDataBetaLegend3442 = FrostHunterBundlePulseFusionHero2475;
        FrostHunterBundlePulseFusionHero2475.FrostHunterLintTitanVortexQuantum9911 = FrostHunterBundlePulseFusionHero2475.FrostHunterResourcesTitanHyperVision5823;
        this.FrostHunterLiveDataBetaLegend3442.FrostHunterCameraXTurboCelestialHero5430 = 0L;
        FrostHunterDispatchersBetaNova8419 frostHunterDispatchersBetaNova84192 = this.FrostHunterCameraXTurboCelestialHero5430;
        FrostHunterRotateDrawableMaxPrime8918 frostHunterRotateDrawableMaxPrime8918 = frostHunterDispatchersBetaNova84192.FrostHunterCameraXPixelTurboCosmos9814;
        frostHunterRotateDrawableMaxPrime8918.getClass();
        frostHunterRotateDrawableMaxPrime8918.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterFilterAlphaSparkSpeed9857(i2, frostHunterDispatchersBetaNova84192));
        Surface surface = this.FrostHunterNavigationMasterMegaMax2752;
        if (surface != null) {
            surface.release();
            this.FrostHunterNavigationMasterMegaMax2752 = null;
        }
        FrostHunterFlipAnimationOlympianInfernoHyper5815 frostHunterFlipAnimationOlympianInfernoHyper5815 = FrostHunterItemDecorationSparkFusionCelestial5742.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        this.FrostHunterColorStateListInflaterNovaQuantum4229 = true;
    }

    public final boolean FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        FrostHunterDatabaseEliteShadowUltra2452();
        return this.FrostHunterLiveDataBetaLegend3442.FrostHunterFragmentBetaMegaVortex6025;
    }

    public final int FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterDatabaseEliteShadowUltra2452();
        if (FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            return this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        return -1;
    }

    public final void FrostHunterServiceInfoHyperionSparkMax9966(final FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse4533, final int i, boolean z, int i2, long j, int i3) {
        Pair pair;
        int i4;
        final FrostHunterGradientDrawableDeltaTitaniumPhoenix9347 frostHunterGradientDrawableDeltaTitaniumPhoenix9347;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        Object obj;
        FrostHunterGradientDrawableDeltaTitaniumPhoenix9347 frostHunterGradientDrawableDeltaTitaniumPhoenix93472;
        Object obj2;
        long j2;
        long j3;
        long j4;
        long FrostHunterScaleAnimationStrikeSpark5059;
        Object obj3;
        FrostHunterGradientDrawableDeltaTitaniumPhoenix9347 frostHunterGradientDrawableDeltaTitaniumPhoenix93473;
        Object obj4;
        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45332 = this.FrostHunterLiveDataBetaLegend3442;
        this.FrostHunterLiveDataBetaLegend3442 = frostHunterVelocityTrackerPrimePulse4533;
        boolean equals = frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761);
        FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno6797 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion6361 = this.FrostHunterLightSensorForceFusion4241;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper6960 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69602 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        final int i7 = 0;
        if (frostHunterStrictModeNebulaEliteHyper71052.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() && frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (frostHunterStrictModeNebulaEliteHyper71052.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() != frostHunterStrictModeNebulaEliteHyper7105.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (frostHunterStrictModeNebulaEliteHyper7105.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper7105.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761.equals(frostHunterStrictModeNebulaEliteHyper71052.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterStrictModeNebulaEliteHyper71052.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterRoomEntityFusionQuantumFusion6361).FrostHunterBundlePulseFusionHero2475, frostHunterGyroscopeBetaVisionInferno6797, 0L).FrostHunterAlphaAnimationNeoCosmos5761)) {
            pair = (z && i2 == 0 && frostHunterAnimatedVectorDrawableMasterHeroHyper6960.FrostHunterServiceEliteCelestialThunder1757 < frostHunterAnimatedVectorDrawableMasterHeroHyper69602.FrostHunterServiceEliteCelestialThunder1757) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (equals) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            frostHunterGradientDrawableDeltaTitaniumPhoenix9347 = !frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() ? frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterVelocityTrackerPrimePulse4533.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterLightSensorForceFusion4241).FrostHunterBundlePulseFusionHero2475, this.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterConstraintSetCloneMasterUltraRogue2633 : null;
            this.FrostHunterColorDrawableLegendPhoenixVision7927 = FrostHunterSharedPreferencesPixelOlympianCyber8894.FrostHunterEditTextPulseHyperion1262;
        } else {
            frostHunterGradientDrawableDeltaTitaniumPhoenix9347 = null;
        }
        if (booleanValue || !frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlertDialogAuroraDelta3200.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200)) {
            FrostHunterAlphaAnimationSolarPrime2514 FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterColorDrawableLegendPhoenixVision7927.FrostHunterAlphaAnimationNeoCosmos5761();
            List list = frostHunterVelocityTrackerPrimePulse4533.FrostHunterAlertDialogAuroraDelta3200;
            for (int i8 = 0; i8 < list.size(); i8++) {
                FrostHunterDialogFragmentTitaniumEpicMega8033 frostHunterDialogFragmentTitaniumEpicMega8033 = (FrostHunterDialogFragmentTitaniumEpicMega8033) list.get(i8);
                int i9 = 0;
                while (true) {
                    FrostHunterWithContextVisionPixelCosmos6861[] frostHunterWithContextVisionPixelCosmos6861Arr = frostHunterDialogFragmentTitaniumEpicMega8033.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (i9 < frostHunterWithContextVisionPixelCosmos6861Arr.length) {
                        frostHunterWithContextVisionPixelCosmos6861Arr[i9].FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAlphaAnimationNeoCosmos5761);
                        i9++;
                    }
                }
            }
            this.FrostHunterColorDrawableLegendPhoenixVision7927 = new FrostHunterSharedPreferencesPixelOlympianCyber8894(FrostHunterAlphaAnimationNeoCosmos5761);
        }
        FrostHunterSharedPreferencesPixelOlympianCyber8894 FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneMasterUltraRogue2633();
        boolean equals2 = FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(this.FrostHunterPermissionInfoAlphaDelta6279);
        this.FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        boolean z5 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterFragmentBetaMegaVortex6025 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025;
        boolean z6 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterLifecycleBlazeGammaElite2889 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterLifecycleBlazeGammaElite2889;
        if (z6 || z5) {
            FrostHunterEditTextPulseHyperion1262();
        }
        boolean z7 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterRemoteConfigSpeedSpeed8566 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterRemoteConfigSpeedSpeed8566;
        if (!equals) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(0, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterConstraintSetCloneVisionSpeed5480
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj5) {
                    switch (i7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterVelocityTrackerPrimePulse4533).FrostHunterAlphaAnimationNeoCosmos5761;
                            ((FrostHunterHandlerStrikeNova5644) obj5).FrostHunterServiceEliteCelestialThunder1757(i);
                            break;
                        default:
                            ((FrostHunterHandlerStrikeNova5644) obj5).FrostHunterResourcesTitanHyperVision5823((FrostHunterGradientDrawableDeltaTitaniumPhoenix9347) frostHunterVelocityTrackerPrimePulse4533, i);
                            break;
                    }
                }
            });
        }
        if (z) {
            FrostHunterRoomEntityFusionQuantumFusion6361 frostHunterRoomEntityFusionQuantumFusion63612 = new FrostHunterRoomEntityFusionQuantumFusion6361();
            if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                z2 = booleanValue;
                z3 = equals2;
                z4 = z6;
                i5 = i3;
                i6 = i5;
                obj = null;
                frostHunterGradientDrawableDeltaTitaniumPhoenix93472 = null;
                obj2 = null;
            } else {
                Object obj5 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(obj5, frostHunterRoomEntityFusionQuantumFusion63612);
                int i10 = frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterBundlePulseFusionHero2475;
                int FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(obj5);
                z2 = booleanValue;
                z3 = equals2;
                z4 = z6;
                obj = frostHunterVelocityTrackerPrimePulse45332.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(i10, this.FrostHunterAlphaAnimationNeoCosmos5761, 0L).FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterGradientDrawableDeltaTitaniumPhoenix93472 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                obj2 = obj5;
                i5 = i10;
                i6 = FrostHunterConstraintSetCloneMasterUltraRogue26332;
            }
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69603 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (i2 == 0) {
                boolean FrostHunterConstraintSetCloneMasterUltraRogue26333 = frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69604 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (FrostHunterConstraintSetCloneMasterUltraRogue26333) {
                    j4 = frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatedVectorDrawableMasterHeroHyper69604.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper69604.FrostHunterBundlePulseFusionHero2475);
                    FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterScaleAnimationStrikeSpark5059(frostHunterVelocityTrackerPrimePulse45332);
                } else if (frostHunterAnimatedVectorDrawableMasterHeroHyper69604.FrostHunterLifecycleBlazeGammaElite2889 != -1) {
                    j4 = FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterLiveDataBetaLegend3442);
                    FrostHunterScaleAnimationStrikeSpark5059 = j4;
                } else {
                    j2 = frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterLifecycleBlazeGammaElite2889;
                    j3 = frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterServiceEliteCelestialThunder1757;
                    j4 = j2 + j3;
                    FrostHunterScaleAnimationStrikeSpark5059 = j4;
                }
            } else if (frostHunterAnimatedVectorDrawableMasterHeroHyper69603.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                j4 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterResourcesTitanHyperVision5823;
                FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterScaleAnimationStrikeSpark5059(frostHunterVelocityTrackerPrimePulse45332);
            } else {
                j2 = frostHunterRoomEntityFusionQuantumFusion63612.FrostHunterLifecycleBlazeGammaElite2889;
                j3 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterResourcesTitanHyperVision5823;
                j4 = j2 + j3;
                FrostHunterScaleAnimationStrikeSpark5059 = j4;
            }
            long FrostHunterPagingDataTurboTitanium7332 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(j4);
            long FrostHunterPagingDataTurboTitanium73322 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterScaleAnimationStrikeSpark5059);
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69605 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterLightSensorCelestialNebulaPrime6217 frostHunterLightSensorCelestialNebulaPrime6217 = new FrostHunterLightSensorCelestialNebulaPrime6217(obj, i5, frostHunterGradientDrawableDeltaTitaniumPhoenix93472, obj2, i6, FrostHunterPagingDataTurboTitanium7332, FrostHunterPagingDataTurboTitanium73322, frostHunterAnimatedVectorDrawableMasterHeroHyper69605.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper69605.FrostHunterBundlePulseFusionHero2475);
            FrostHunterGyroscopeBetaVisionInferno6797 frostHunterGyroscopeBetaVisionInferno67972 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLevelListDrawableFusionDragonHero2232();
            int FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566();
            if (this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) {
                obj3 = null;
                frostHunterGradientDrawableDeltaTitaniumPhoenix93473 = null;
                obj4 = null;
            } else {
                FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45333 = this.FrostHunterLiveDataBetaLegend3442;
                Object obj6 = frostHunterVelocityTrackerPrimePulse45333.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterVelocityTrackerPrimePulse45333.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(obj6, this.FrostHunterLightSensorForceFusion4241);
                FrostHunterRemoteConfigSpeedSpeed8566 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(obj6);
                Object obj7 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterGyroscopeBetaVisionInferno67972, 0L).FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterGradientDrawableDeltaTitaniumPhoenix93473 = frostHunterGyroscopeBetaVisionInferno67972.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i11 = FrostHunterRemoteConfigSpeedSpeed8566;
            long FrostHunterPagingDataTurboTitanium73323 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(j);
            long FrostHunterPagingDataTurboTitanium73324 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633() ? FrostHunterGyroscopeHeroAlpha1995.FrostHunterPagingDataTurboTitanium7332(FrostHunterScaleAnimationStrikeSpark5059(this.FrostHunterLiveDataBetaLegend3442)) : FrostHunterPagingDataTurboTitanium73323;
            FrostHunterAnimatedVectorDrawableMasterHeroHyper6960 frostHunterAnimatedVectorDrawableMasterHeroHyper69606 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(11, new FrostHunterCardViewVisionNovaXSpeed5306(i2, frostHunterLightSensorCelestialNebulaPrime6217, new FrostHunterLightSensorCelestialNebulaPrime6217(obj3, FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterGradientDrawableDeltaTitaniumPhoenix93473, obj4, i11, FrostHunterPagingDataTurboTitanium73323, FrostHunterPagingDataTurboTitanium73324, frostHunterAnimatedVectorDrawableMasterHeroHyper69606.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterAnimatedVectorDrawableMasterHeroHyper69606.FrostHunterBundlePulseFusionHero2475)));
        } else {
            z2 = booleanValue;
            z3 = equals2;
            z4 = z6;
        }
        if (z2) {
            final int i12 = 1;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(1, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterConstraintSetCloneVisionSpeed5480
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj52) {
                    switch (i12) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71053 = ((FrostHunterVelocityTrackerPrimePulse4533) frostHunterGradientDrawableDeltaTitaniumPhoenix9347).FrostHunterAlphaAnimationNeoCosmos5761;
                            ((FrostHunterHandlerStrikeNova5644) obj52).FrostHunterServiceEliteCelestialThunder1757(intValue);
                            break;
                        default:
                            ((FrostHunterHandlerStrikeNova5644) obj52).FrostHunterResourcesTitanHyperVision5823((FrostHunterGradientDrawableDeltaTitaniumPhoenix9347) frostHunterGradientDrawableDeltaTitaniumPhoenix9347, intValue);
                            break;
                    }
                }
            });
        }
        final int i13 = 8;
        final int i14 = 7;
        if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterLevelListDrawableFusionDragonHero2232 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterLevelListDrawableFusionDragonHero2232) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(10, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj8) {
                    int i15 = i14;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj8;
                    switch (i15) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
            if (frostHunterVelocityTrackerPrimePulse4533.FrostHunterLevelListDrawableFusionDragonHero2232 != null) {
                this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(10, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                    @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                    public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj8) {
                        int i15 = i13;
                        FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                        FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj8;
                        switch (i15) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                                frostHunterHandlerStrikeNova5644.getClass();
                                frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                                break;
                            case 1:
                                frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                                break;
                            case 2:
                                frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                                break;
                            case 3:
                                frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                                break;
                            case 4:
                                frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                                break;
                            default:
                                frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                                break;
                        }
                    }
                });
            }
        }
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion3032 = frostHunterVelocityTrackerPrimePulse45332.FrostHunterFlowMaxDragonHero5809;
        FrostHunterSurfaceViewPhantomHyperion3032 frostHunterSurfaceViewPhantomHyperion30322 = frostHunterVelocityTrackerPrimePulse4533.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterSurfaceViewPhantomHyperion3032 != frostHunterSurfaceViewPhantomHyperion30322) {
            FrostHunterLiveDataScopeShadowCelestialMax5831 frostHunterLiveDataScopeShadowCelestialMax5831 = this.FrostHunterFlowMaxDragonHero5809;
            Object obj8 = frostHunterSurfaceViewPhantomHyperion30322.FrostHunterFragmentBetaMegaVortex6025;
            frostHunterLiveDataScopeShadowCelestialMax5831.getClass();
            final int i15 = 9;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(2, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i15;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        if (!z3) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(14, new FrostHunterRippleDrawableMaxElite5227(i13, this.FrostHunterPermissionInfoAlphaDelta6279));
        }
        if (z7) {
            final int i16 = 0;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(3, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i16;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        if (z4 || z5) {
            final int i17 = 1;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(-1, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i17;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        final int i18 = 4;
        if (z4) {
            final int i19 = 2;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(4, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i19;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        final int i20 = 5;
        if (z5 || frostHunterVelocityTrackerPrimePulse45332.FrostHunterServiceConnectionTurboPhoenixOmega6719 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
            final int i21 = 3;
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(5, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i21;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        final int i22 = 6;
        if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterLightSensorForceFusion4241 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterLightSensorForceFusion4241) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(6, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i18;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterFragmentBetaMegaVortex6025() != frostHunterVelocityTrackerPrimePulse4533.FrostHunterFragmentBetaMegaVortex6025()) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(7, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i20;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        if (!frostHunterVelocityTrackerPrimePulse45332.FrostHunterScaleAnimationStrikeSpark5059.equals(frostHunterVelocityTrackerPrimePulse4533.FrostHunterScaleAnimationStrikeSpark5059)) {
            this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475(12, new FrostHunterApplicationInfoHeroForceSpark2431() { // from class: android.content.Context.FrostHunterCardViewBetaPrimeForce1342
                @Override // android.content.Context.FrostHunterApplicationInfoHeroForceSpark2431
                public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj82) {
                    int i152 = i22;
                    FrostHunterVelocityTrackerPrimePulse4533 frostHunterVelocityTrackerPrimePulse45334 = frostHunterVelocityTrackerPrimePulse4533;
                    FrostHunterHandlerStrikeNova5644 frostHunterHandlerStrikeNova5644 = (FrostHunterHandlerStrikeNova5644) obj82;
                    switch (i152) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            boolean z8 = frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566;
                            frostHunterHandlerStrikeNova5644.getClass();
                            frostHunterHandlerStrikeNova5644.FrostHunterCameraXPixelTurboCosmos9814(frostHunterVelocityTrackerPrimePulse45334.FrostHunterRemoteConfigSpeedSpeed8566);
                            break;
                        case 1:
                            frostHunterHandlerStrikeNova5644.FrostHunterFragmentBetaMegaVortex6025(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 2:
                            frostHunterHandlerStrikeNova5644.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLifecycleBlazeGammaElite2889);
                            break;
                        case 3:
                            frostHunterHandlerStrikeNova5644.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterVelocityTrackerPrimePulse45334.FrostHunterServiceConnectionTurboPhoenixOmega6719, frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025);
                            break;
                        case 4:
                            frostHunterHandlerStrikeNova5644.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLightSensorForceFusion4241);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterCardViewSpectraCyber7714(frostHunterVelocityTrackerPrimePulse45334.FrostHunterFragmentBetaMegaVortex6025());
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLintTitanVortexQuantum9911(frostHunterVelocityTrackerPrimePulse45334.FrostHunterScaleAnimationStrikeSpark5059);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterMeteringPointBetaCyber9571(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            frostHunterHandlerStrikeNova5644.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterVelocityTrackerPrimePulse45334.FrostHunterLevelListDrawableFusionDragonHero2232);
                            break;
                        default:
                            frostHunterHandlerStrikeNova5644.FrostHunterKeyframeGammaGamma1197((FrostHunterCameraXAuroraVortex8383) frostHunterVelocityTrackerPrimePulse45334.FrostHunterFlowMaxDragonHero5809.FrostHunterKeyframeGammaGamma1197);
                            break;
                    }
                }
            });
        }
        FrostHunterLooperHyperionForce4133();
        this.FrostHunterFragmentBetaMegaVortex6025.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (frostHunterVelocityTrackerPrimePulse45332.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != frostHunterVelocityTrackerPrimePulse4533.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223) {
            Iterator it = this.FrostHunterServiceConnectionTurboPhoenixOmega6719.iterator();
            while (it.hasNext()) {
                ((FrostHunterProcessCameraProviderQuantumNovaXHyperion4894) it.next()).FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterEditTextPulseHyperion1262();
            }
        }
    }

    public final void FrostHunterTextViewDragonStormMega4297(int i, int i2, Object obj) {
        FrostHunterPackageManagerEclipseTitanPulse8946 frostHunterPackageManagerEclipseTitanPulse8946;
        FrostHunterFaceDetectionPixelFusionBlaze5291[] frostHunterFaceDetectionPixelFusionBlaze5291Arr = this.FrostHunterRemoteConfigSpeedSpeed8566;
        int length = frostHunterFaceDetectionPixelFusionBlaze5291Arr.length;
        int i3 = 0;
        while (true) {
            frostHunterPackageManagerEclipseTitanPulse8946 = this.FrostHunterKeyframeGammaGamma1197;
            if (i3 >= length) {
                break;
            }
            FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze5291 = frostHunterFaceDetectionPixelFusionBlaze5291Arr[i3];
            if (i == -1 || frostHunterFaceDetectionPixelFusionBlaze5291.FrostHunterFlowMaxDragonHero5809 == i) {
                int FrostHunterKeyframeGammaGamma1197 = FrostHunterKeyframeGammaGamma1197(this.FrostHunterLiveDataBetaLegend3442);
                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper7105 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761;
                if (FrostHunterKeyframeGammaGamma1197 == -1) {
                    FrostHunterKeyframeGammaGamma1197 = 0;
                }
                FrostHunterSharedFlowShadowEpicCelestial4667 frostHunterSharedFlowShadowEpicCelestial4667 = new FrostHunterSharedFlowShadowEpicCelestial4667(frostHunterPackageManagerEclipseTitanPulse8946, frostHunterFaceDetectionPixelFusionBlaze5291, frostHunterStrictModeNebulaEliteHyper7105, FrostHunterKeyframeGammaGamma1197, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911);
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterLevelListDrawableFusionDragonHero2232);
                frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterBundlePulseFusionHero2475 = i2;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterLevelListDrawableFusionDragonHero2232);
                frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterServiceEliteCelestialThunder1757 = obj;
                frostHunterSharedFlowShadowEpicCelestial4667.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            i3++;
        }
        for (FrostHunterFaceDetectionPixelFusionBlaze5291 frostHunterFaceDetectionPixelFusionBlaze52912 : this.FrostHunterCameraXPixelTurboCosmos9814) {
            if (frostHunterFaceDetectionPixelFusionBlaze52912 != null && (i == -1 || frostHunterFaceDetectionPixelFusionBlaze52912.FrostHunterFlowMaxDragonHero5809 == i)) {
                int FrostHunterKeyframeGammaGamma11972 = FrostHunterKeyframeGammaGamma1197(this.FrostHunterLiveDataBetaLegend3442);
                FrostHunterStrictModeNebulaEliteHyper7105 frostHunterStrictModeNebulaEliteHyper71052 = this.FrostHunterLiveDataBetaLegend3442.FrostHunterAlphaAnimationNeoCosmos5761;
                if (FrostHunterKeyframeGammaGamma11972 == -1) {
                    FrostHunterKeyframeGammaGamma11972 = 0;
                }
                FrostHunterSharedFlowShadowEpicCelestial4667 frostHunterSharedFlowShadowEpicCelestial46672 = new FrostHunterSharedFlowShadowEpicCelestial4667(frostHunterPackageManagerEclipseTitanPulse8946, frostHunterFaceDetectionPixelFusionBlaze52912, frostHunterStrictModeNebulaEliteHyper71052, FrostHunterKeyframeGammaGamma11972, frostHunterPackageManagerEclipseTitanPulse8946.FrostHunterLintTitanVortexQuantum9911);
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterSharedFlowShadowEpicCelestial46672.FrostHunterLevelListDrawableFusionDragonHero2232);
                frostHunterSharedFlowShadowEpicCelestial46672.FrostHunterBundlePulseFusionHero2475 = i2;
                FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(!frostHunterSharedFlowShadowEpicCelestial46672.FrostHunterLevelListDrawableFusionDragonHero2232);
                frostHunterSharedFlowShadowEpicCelestial46672.FrostHunterServiceEliteCelestialThunder1757 = obj;
                frostHunterSharedFlowShadowEpicCelestial46672.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
        }
    }
}
