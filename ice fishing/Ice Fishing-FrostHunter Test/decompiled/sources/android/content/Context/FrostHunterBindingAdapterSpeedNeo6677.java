package android.content.Context;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.foundation.layout.FillElement;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterBindingAdapterSpeedNeo6677 {
    public static Context FrostHunterAlphaAnimationNeoCosmos5761;
    public static Boolean FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final FrostHunterContextBetaSpark7441 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterFragmentBetaMegaVortex6025;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterKeyframeGammaGamma1197;
    public static final FrostHunterContextBetaSpark7441[] FrostHunterLintTitanVortexQuantum9911;
    public static final FrostHunterIntentServiceHyperionQuantumInferno4126 FrostHunterBundlePulseFusionHero2475 = new FrostHunterIntentServiceHyperionQuantumInferno4126(Float.POSITIVE_INFINITY);
    public static final FrostHunterInAppPurchaseLegendHyperion1980 FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterInAppPurchaseLegendHyperion1980(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final FrostHunterDialogPhantomHyper2522 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterDialogPhantomHyper2522(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final FrostHunterSharedElementDragonSpectra8319 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterSharedElementDragonSpectra8319(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final FrostHunterIntentServiceHyperionQuantumInferno4126 FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterIntentServiceHyperionQuantumInferno4126(Float.NEGATIVE_INFINITY);
    public static final FrostHunterInAppPurchaseLegendHyperion1980 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterInAppPurchaseLegendHyperion1980(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final FrostHunterDialogPhantomHyper2522 FrostHunterFlowMaxDragonHero5809 = new FrostHunterDialogPhantomHyper2522(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final FrostHunterSharedElementDragonSpectra8319 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterSharedElementDragonSpectra8319(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final FrostHunterInstrumentationStrikeBlazeThunder7469 FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterInstrumentationStrikeBlazeThunder7469(Boolean.FALSE);
    public static final FrostHunterServiceInfoEclipseAurora7011 FrostHunterLightSensorForceFusion4241 = new FrostHunterServiceInfoEclipseAurora7011(18);
    public static final int[] FrostHunterScaleAnimationStrikeSpark5059 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    static {
        int i = 3;
        FrostHunterKeyframeGammaGamma1197 = new FrostHunterWorkManagerMaxTurbo1858("UNDEFINED", i);
        FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterWorkManagerMaxTurbo1858("REUSABLE_CLAIMED", i);
        FrostHunterContextBetaSpark7441 frostHunterContextBetaSpark7441 = new FrostHunterContextBetaSpark7441();
        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = frostHunterContextBetaSpark7441;
        FrostHunterLintTitanVortexQuantum9911 = new FrostHunterContextBetaSpark7441[]{frostHunterContextBetaSpark7441};
    }

    public static final void FrostHunterAlertDialogAuroraDelta3200(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, CancellationException cancellationException) {
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 != null) {
            frostHunterContentObserverLegendUltraVortex4209.FrostHunterServiceEliteCelestialThunder1757(cancellationException);
        }
    }

    public static FrostHunterObserverUltraDragonMax6742 FrostHunterAlphaAnimationNeoCosmos5761(float f) {
        return new FrostHunterObserverUltraDragonMax6742(Float.valueOf(f), Float.valueOf(0.01f));
    }

    public static final void FrostHunterBillingClientFusionVortex9008(FrostHunterOnClickListenerNebulaStorm6760 frostHunterOnClickListenerNebulaStorm6760, FrostHunterAdapterPixelMax1447 frostHunterAdapterPixelMax1447, int i) {
        while (true) {
            int i2 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterMotionSceneAuroraMega2271;
            if (i > i2 && i < frostHunterOnClickListenerNebulaStorm6760.FrostHunterLooperThreadBetaHyperionMax1000) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            frostHunterOnClickListenerNebulaStorm6760.FrostHunterMagnetometerFusionTitanium8202();
            if (frostHunterOnClickListenerNebulaStorm6760.FrostHunterBitmapTurboDeltaNebula8743(frostHunterOnClickListenerNebulaStorm6760.FrostHunterMotionSceneAuroraMega2271)) {
                frostHunterAdapterPixelMax1447.FrostHunterLooperThreadBetaHyperionMax1000();
            }
            frostHunterOnClickListenerNebulaStorm6760.FrostHunterAlertDialogAuroraDelta3200();
        }
    }

    public static final FrostHunterCoroutineScopeNeoMega4482 FrostHunterBitmapTurboDeltaNebula8743(FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209, boolean z, FrostHunterCoroutineEclipseNovaShadow7878 frostHunterCoroutineEclipseNovaShadow7878) {
        if (frostHunterContentObserverLegendUltraVortex4209 instanceof FrostHunterDelayPhoenixRogueLegend5759) {
            return ((FrostHunterDelayPhoenixRogueLegend5759) frostHunterContentObserverLegendUltraVortex4209).FrostHunterNavigationMasterMegaMax2752(z, frostHunterCoroutineEclipseNovaShadow7878);
        }
        return frostHunterContentObserverLegendUltraVortex4209.FrostHunterLightSensorForceFusion4241(frostHunterCoroutineEclipseNovaShadow7878.FrostHunterKeyframeGammaGamma1197(), z, new FrostHunterRewardedAdNeoSpeed8147(1, frostHunterCoroutineEclipseNovaShadow7878, FrostHunterCoroutineEclipseNovaShadow7878.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 6));
    }

    public static float FrostHunterBundlePulseFusionHero2475(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context.FrostHunterFaceDetectionHyperFusionEpic9056, android.content.Context.FrostHunterLooperShadowNovaXFusion5903] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context.FrostHunterLinearLayoutForceDragonHyper4990] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List FrostHunterCameraXPixelTurboCosmos9814(FrostHunterOnClickListenerNebulaStorm6760 frostHunterOnClickListenerNebulaStorm6760, Integer num, int i, Integer num2) {
        int i2;
        FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm9585;
        if (frostHunterOnClickListenerNebulaStorm6760.FrostHunterBitmapTurboDeltaNebula8743 || frostHunterOnClickListenerNebulaStorm6760.FrostHunterScaleAnimationStrikeSpark5059() == 0) {
            return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        }
        ?? frostHunterFaceDetectionHyperFusionEpic9056 = new FrostHunterFaceDetectionHyperFusionEpic9056(frostHunterOnClickListenerNebulaStorm6760);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterMotionSceneAuroraMega2271;
            if (i2 < 0) {
                i2 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterDatabaseEliteShadowUltra2452(i, frostHunterOnClickListenerNebulaStorm6760.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            }
        }
        if (num == 0) {
            int FrostHunterPagingDataTurboTitanium7332 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterFlowMaxDragonHero5809 - frostHunterOnClickListenerNebulaStorm6760.FrostHunterPagingDataTurboTitanium7332(frostHunterOnClickListenerNebulaStorm6760.FrostHunterLintTitanVortexQuantum9911(i), frostHunterOnClickListenerNebulaStorm6760.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterResourcesTitanHyperVision5823;
            num = Integer.valueOf(FrostHunterPagingDataTurboTitanium7332 + ((frostHunterContentResolverEpicBetaOlympian4466 == null || (frostHunterOrientationSensorPhoenixOmegaStorm9585 = (FrostHunterOrientationSensorPhoenixOmegaStorm9585) frostHunterContentResolverEpicBetaOlympian4466.FrostHunterConstraintSetCloneMasterUltraRogue2633(i)) == null) ? 0 : frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633));
        }
        while (i >= 0) {
            frostHunterFaceDetectionHyperFusionEpic9056.FrostHunterServiceEliteCelestialThunder1757(frostHunterOnClickListenerNebulaStorm6760.FrostHunterR8MasterNebulaSpark7247(i), num);
            num = frostHunterOnClickListenerNebulaStorm6760.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
            if (i2 >= 0) {
                int i3 = i2;
                i2 = frostHunterOnClickListenerNebulaStorm6760.FrostHunterDatabaseEliteShadowUltra2452(i2, frostHunterOnClickListenerNebulaStorm6760.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                i = i3;
            } else {
                i = i2;
            }
        }
        return (ArrayList) frostHunterFaceDetectionHyperFusionEpic9056.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public static final void FrostHunterCameraXTurboCelestialHero5430(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 != null && !frostHunterContentObserverLegendUltraVortex4209.FrostHunterAlphaAnimationNeoCosmos5761()) {
            throw frostHunterContentObserverLegendUltraVortex4209.FrostHunterTextViewDragonStormMega4297();
        }
    }

    public static final FrostHunterCountDownTimerRogueTitan5615 FrostHunterCardViewSpectraCyber7714(FrostHunterViewModelScopeSparkBlaze1575 frostHunterViewModelScopeSparkBlaze1575, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterCountDownTimerRogueTitan5615 FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(frostHunterViewModelScopeSparkBlaze1575.FrostHunterFlowMaxDragonHero5809(), frostHunterCountDownTimerRogueTitan5615, true);
        FrostHunterFragmentTransactionBetaUltra7746 frostHunterFragmentTransactionBetaUltra7746 = FrostHunterInsetDrawableOmegaForce2390.FrostHunterAlphaAnimationNeoCosmos5761;
        return (FrostHunterTextViewDragonStormMega4297 == frostHunterFragmentTransactionBetaUltra7746 || FrostHunterTextViewDragonStormMega4297.FrostHunterKeyframeGammaGamma1197(FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterAlertDialogAuroraDelta3200) != null) ? FrostHunterTextViewDragonStormMega4297 : FrostHunterTextViewDragonStormMega4297.FrostHunterFragmentBetaMegaVortex6025(frostHunterFragmentTransactionBetaUltra7746);
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFlatMapAuroraOlympianBeta5874 frostHunterFlatMapAuroraOlympianBeta5874, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1440339811);
        int i2 = 4;
        int i3 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(R.drawable.frost_bg) ? 4 : 2) | i;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i3 & 1, (i3 & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, fillElement);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60252);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(R.drawable.frost_bg), fillElement, FrostHunterSharedFlowOlympianDragon9650.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterDialogFragmentPhantomEclipse8068, (i3 & 14) | 1573296);
            long j = FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterAuthSparkSpectra4812.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(fillElement, FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.55f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.3f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.65f))))), frostHunterDialogFragmentPhantomEclipse8068, 6);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterBitmapTurboDeltaNebula8743 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBitmapTurboDeltaNebula8743(fillElement, new FrostHunterViewPagerTitanCyber7552(i2));
            FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterRewardedAdHyperStrike1151.FrostHunterLooperThreadBetaHyperionMax1000, frostHunterDialogFragmentPhantomEclipse8068, 0);
            int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterBitmapTurboDeltaNebula8743);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterAlphaAnimationNeoCosmos57612);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60253);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse8068, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94632);
            frostHunterFlatMapAuroraOlympianBeta5874.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterExoPlayerHeroQuantum1765.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterDialogFragmentPhantomEclipse8068, 54);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterThemeOverlayNebulaDelta6405(i, 2, frostHunterFlatMapAuroraOlympianBeta5874);
        }
    }

    public static FrostHunterSharedFlowTitaniumBeta1713 FrostHunterDatabaseEliteShadowUltra2452(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        return new FrostHunterSharedFlowTitaniumBeta1713(frostHunterNotificationGammaBlazePhoenix7595);
    }

    public static final boolean FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 != null) {
            return frostHunterContentObserverLegendUltraVortex4209.FrostHunterAlphaAnimationNeoCosmos5761();
        }
        return true;
    }

    public static FrostHunterMergePhoenixEpic5883 FrostHunterEditTextPulseHyperion1262(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        FrostHunterChipSpeedTitan5326 frostHunterChipSpeedTitan5326 = FrostHunterChipSpeedTitan5326.FrostHunterLooperHyperionForce4133;
        FrostHunterLiveDataScopeSparkNovaX3716 frostHunterLiveDataScopeSparkNovaX3716 = new FrostHunterLiveDataScopeSparkNovaX3716();
        frostHunterLiveDataScopeSparkNovaX3716.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterNotificationGammaBlazePhoenix7595;
        frostHunterLiveDataScopeSparkNovaX3716.FrostHunterFlowMaxDragonHero5809 = frostHunterChipSpeedTitan5326;
        return frostHunterLiveDataScopeSparkNovaX3716;
    }

    public static final Integer FrostHunterFCMDeltaQuantumHero8364(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterFontFamilyInfernoCyberBeta1746 frostHunterFontFamilyInfernoCyberBeta1746, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260;
        FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511;
        FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse FrostHunterLightSensorForceFusion42412 = FrostHunterLiveDataMasterEpicNeo4453.FrostHunterLightSensorForceFusion4241(longSparseArray.get(keyAt));
            if (FrostHunterLightSensorForceFusion42412 != null && value != null && text != null && (frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) frostHunterFontFamilyInfernoCyberBeta1746.FrostHunterBundlePulseFusionHero2475().FrostHunterConstraintSetCloneMasterUltraRogue2633((int) keyAt)) != null && (frostHunterSharedElementSpectraNeo2511 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761) != null) {
                Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterDialogVortexNeoUltra2659.FrostHunterAlertDialogAuroraDelta3200);
                if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                    FrostHunterRemoteConfigSpeedSpeed85662 = null;
                }
                FrostHunterContextGammaSolar6144 frostHunterContextGammaSolar6144 = (FrostHunterContextGammaSolar6144) FrostHunterRemoteConfigSpeedSpeed85662;
                if (frostHunterContextGammaSolar6144 != null && (frostHunterCombineLegendMegaPrime5473 = (FrostHunterCombineLegendMegaPrime5473) frostHunterContextGammaSolar6144.FrostHunterConstraintSetCloneMasterUltraRogue2633) != null) {
                }
            }
        }
    }

    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterFlowMaxDragonHero5809(View view, FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298) {
        int[] iArr = FrostHunterPaintCyberPulse5979.FrostHunterLifecycleBlazeGammaElite2889;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        frostHunterFilterSpectraTitan5298.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        return new FrostHunterBarrierThunderHyperion9659(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final void FrostHunterFragmentBetaMegaVortex6025(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(th, th2);
            }
        }
    }

    public static long FrostHunterKeyframeGammaGamma1197(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j2 + ")");
    }

    public static IOException FrostHunterLevelListDrawableFusionDragonHero2232(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static final FrostHunterFragmentTransactionEclipseNovaXForce8101 FrostHunterLifecycleBlazeGammaElite2889(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new FrostHunterDrawableNovaCelestial2796(((BitmapDrawable) drawable).getBitmap()) : new FrostHunterBarcodeScannerEclipseUltraMega1019(drawable);
    }

    public static boolean FrostHunterLightSensorForceFusion4241(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = FrostHunterLightSensorForceFusion4241(file2) && z;
        }
        return z;
    }

    public static final long FrostHunterLintTitanVortexQuantum9911(long j) {
        long j2 = (j << 1) + 1;
        FrostHunterContextPhantomVortex1776.FrostHunterCameraXPixelTurboCosmos9814.getClass();
        int i = FrostHunterJobIntentServiceForceBlazeForce7061.FrostHunterAlphaAnimationNeoCosmos5761;
        return j2;
    }

    public static boolean FrostHunterLooperHyperionForce4133(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static long FrostHunterLooperThreadBetaHyperionMax1000(long j, long j2) {
        FrostHunterExecutorSolarPhoenix3849.FrostHunterFlowMaxDragonHero5809("a", j);
        FrostHunterExecutorSolarPhoenix3849.FrostHunterFlowMaxDragonHero5809("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static final boolean FrostHunterMagnetometerFusionTitanium8202(FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        try {
            return frostHunterResourceThunderSolarForce1212.FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterCountDownTimerRogueTitan5615);
        } catch (Throwable th) {
            throw new FrostHunterBindingAdapterPhantomMega6235(th, frostHunterResourceThunderSolarForce1212, frostHunterCountDownTimerRogueTitan5615);
        }
    }

    public static final boolean FrostHunterMediaPlayerCelestialBetaTitan3868(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof FrostHunterFilterSpectraTitan5298) {
            return ((FrostHunterFilterSpectraTitan5298) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static boolean FrostHunterMeteringPointBetaCyber9571(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (FrostHunterScaleAnimationStrikeSpark5059[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static FrostHunterAnimatorQuantumFusionMaster8565 FrostHunterMeteringPointMegaCyber7955(byte[] bArr) {
        UUID[] uuidArr;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868(bArr);
        if (frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475 < 32) {
            return null;
        }
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(0);
        int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761();
        int FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != FrostHunterAlphaAnimationNeoCosmos57612) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Advertised atom size (" + FrostHunterServiceConnectionTurboPhoenixOmega67192 + ") does not match buffer size: " + FrostHunterAlphaAnimationNeoCosmos57612);
            return null;
        }
        int FrostHunterServiceConnectionTurboPhoenixOmega67193 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
        if (FrostHunterServiceConnectionTurboPhoenixOmega67193 != 1886614376) {
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Atom type is not pssh: ", FrostHunterServiceConnectionTurboPhoenixOmega67193);
            return null;
        }
        int FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterConstraintSetCloneOmegaMaxOmega7436.FrostHunterLifecycleBlazeGammaElite2889(frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719());
        if (FrostHunterLifecycleBlazeGammaElite28892 > 1) {
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unsupported pssh version: ", FrostHunterLifecycleBlazeGammaElite28892);
            return null;
        }
        UUID uuid = new UUID(frostHunterLicensingSpectraPulse8868.FrostHunterTextViewDragonStormMega4297(), frostHunterLicensingSpectraPulse8868.FrostHunterTextViewDragonStormMega4297());
        if (FrostHunterLifecycleBlazeGammaElite28892 == 1) {
            int FrostHunterCardViewSpectraCyber7714 = frostHunterLicensingSpectraPulse8868.FrostHunterCardViewSpectraCyber7714();
            uuidArr = new UUID[FrostHunterCardViewSpectraCyber7714];
            for (int i = 0; i < FrostHunterCardViewSpectraCyber7714; i++) {
                uuidArr[i] = new UUID(frostHunterLicensingSpectraPulse8868.FrostHunterTextViewDragonStormMega4297(), frostHunterLicensingSpectraPulse8868.FrostHunterTextViewDragonStormMega4297());
            }
        } else {
            uuidArr = null;
        }
        int FrostHunterCardViewSpectraCyber77142 = frostHunterLicensingSpectraPulse8868.FrostHunterCardViewSpectraCyber7714();
        int FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761();
        if (FrostHunterCardViewSpectraCyber77142 == FrostHunterAlphaAnimationNeoCosmos57613) {
            byte[] bArr2 = new byte[FrostHunterCardViewSpectraCyber77142];
            frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(bArr2, 0, FrostHunterCardViewSpectraCyber77142);
            return new FrostHunterAnimatorQuantumFusionMaster8565(uuid, FrostHunterLifecycleBlazeGammaElite28892, bArr2, uuidArr);
        }
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Atom data size (" + FrostHunterCardViewSpectraCyber77142 + ") does not match the bytes left: " + FrostHunterAlphaAnimationNeoCosmos57613);
        return null;
    }

    public static final FrostHunterContentObserverLegendUltraVortex4209 FrostHunterMotionSceneAuroraMega2271(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
        if (frostHunterContentObserverLegendUltraVortex4209 != null) {
            return frostHunterContentObserverLegendUltraVortex4209;
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(frostHunterCountDownTimerRogueTitan5615, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context.FrostHunterFaceDetectionHyperFusionEpic9056, android.content.Context.FrostHunterLooperShadowNovaXFusion5903] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList FrostHunterNavigationMasterMegaMax2752(FrostHunterKeyEventForceSparkSpeed5603 frostHunterKeyEventForceSparkSpeed5603, int i, Integer num) {
        ?? frostHunterFaceDetectionHyperFusionEpic9056 = new FrostHunterFaceDetectionHyperFusionEpic9056(frostHunterKeyEventForceSparkSpeed5603);
        int FrostHunterLintTitanVortexQuantum99112 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterLintTitanVortexQuantum9911(i);
        FrostHunterLinearLayoutForceDragonHyper4990 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterAlphaAnimationNeoCosmos5761(i);
        while (i >= 0) {
            frostHunterFaceDetectionHyperFusionEpic9056.FrostHunterServiceEliteCelestialThunder1757(frostHunterKeyEventForceSparkSpeed5603.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566(i), num);
            if (FrostHunterLintTitanVortexQuantum99112 >= 0) {
                FrostHunterLinearLayoutForceDragonHyper4990 frostHunterLinearLayoutForceDragonHyper4990 = FrostHunterAlphaAnimationNeoCosmos57612;
                FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLintTitanVortexQuantum99112);
                i = FrostHunterLintTitanVortexQuantum99112;
                FrostHunterLintTitanVortexQuantum99112 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterLintTitanVortexQuantum9911(FrostHunterLintTitanVortexQuantum99112);
                num = frostHunterLinearLayoutForceDragonHyper4990;
            } else {
                i = FrostHunterLintTitanVortexQuantum99112;
                num = FrostHunterAlphaAnimationNeoCosmos57612;
            }
        }
        return (ArrayList) frostHunterFaceDetectionHyperFusionEpic9056.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public static long FrostHunterPagingDataTurboTitanium7332(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final void FrostHunterPagingSourceEclipseDelta8255(FrostHunterResourcePixelEpic4102 frostHunterResourcePixelEpic4102, long j, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, boolean z) {
        FrostHunterPushNotificationUltraQuantum3493 frostHunterPushNotificationUltraQuantum3493 = frostHunterResourcePixelEpic4102.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        MotionEvent motionEvent = frostHunterPushNotificationUltraQuantum3493 != null ? (MotionEvent) ((FrostHunterKotlinQuantumRogue5892) frostHunterPushNotificationUltraQuantum3493.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809 : null;
        if (motionEvent == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }

    public static final FrostHunterLaunchSolarQuantum2471 FrostHunterPermissionInfoAlphaDelta6279(int i) {
        if (i == 1) {
            return new FrostHunterLaunchSolarQuantum2471(2);
        }
        if (i == 2) {
            return new FrostHunterLaunchSolarQuantum2471(1);
        }
        if (i == 17) {
            return new FrostHunterLaunchSolarQuantum2471(3);
        }
        if (i == 33) {
            return new FrostHunterLaunchSolarQuantum2471(5);
        }
        if (i == 66) {
            return new FrostHunterLaunchSolarQuantum2471(4);
        }
        if (i != 130) {
            return null;
        }
        return new FrostHunterLaunchSolarQuantum2471(6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FrostHunterRecyclerViewPulsePixelSolar8816 FrostHunterR8MasterNebulaSpark7247(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393, boolean z, boolean z2) {
        FrostHunterRecyclerViewPulsePixelSolar8816 frostHunterRecyclerViewPulsePixelSolar8816;
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        boolean z3;
        int[] iArr;
        long FrostHunterServiceEliteCelestialThunder17572 = frostHunterPreviewNeoBeta3393.FrostHunterServiceEliteCelestialThunder1757();
        long j4 = -1;
        int i6 = (FrostHunterServiceEliteCelestialThunder17572 > (-1L) ? 1 : (FrostHunterServiceEliteCelestialThunder17572 == (-1L) ? 0 : -1));
        long j5 = 4096;
        if (i6 != 0 && FrostHunterServiceEliteCelestialThunder17572 <= 4096) {
            j5 = FrostHunterServiceEliteCelestialThunder17572;
        }
        int i7 = (int) j5;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = new FrostHunterLicensingSpectraPulse8868(64);
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (i9 < i7) {
            frostHunterLicensingSpectraPulse8868.FrostHunterStateCelestialNovaPixel8414(8);
            if (!frostHunterPreviewNeoBeta3393.FrostHunterScaleAnimationStrikeSpark5059(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, i8, 8, true)) {
                break;
            }
            long FrostHunterEditTextPulseHyperion1262 = frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262();
            int FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
            if (FrostHunterEditTextPulseHyperion1262 == 1) {
                j = j4;
                frostHunterPreviewNeoBeta3393.FrostHunterLintTitanVortexQuantum9911(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, 8, 8);
                i4 = 16;
                frostHunterLicensingSpectraPulse8868.FrostHunterPagingDataTurboTitanium7332(16);
                i2 = i9;
                j2 = frostHunterLicensingSpectraPulse8868.FrostHunterTextViewDragonStormMega4297();
                i3 = i6;
            } else {
                j = j4;
                if (FrostHunterEditTextPulseHyperion1262 == 0) {
                    long FrostHunterServiceEliteCelestialThunder17573 = frostHunterPreviewNeoBeta3393.FrostHunterServiceEliteCelestialThunder1757();
                    if (FrostHunterServiceEliteCelestialThunder17573 != j) {
                        FrostHunterEditTextPulseHyperion1262 = (FrostHunterServiceEliteCelestialThunder17573 - frostHunterPreviewNeoBeta3393.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223()) + 8;
                    }
                }
                long j6 = FrostHunterEditTextPulseHyperion1262;
                i2 = i9;
                j2 = j6;
                i3 = i6;
                i4 = 8;
            }
            long j7 = i4;
            if (j2 < j7) {
                frostHunterRecyclerViewPulsePixelSolar8816 = null;
                if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1718773093 || i4 != 8) {
                    return new FrostHunterPropertyValuesHolderTurboQuantum5848(FrostHunterServiceConnectionTurboPhoenixOmega67192, i4, j2);
                }
                j2 = j7;
            } else {
                frostHunterRecyclerViewPulsePixelSolar8816 = null;
            }
            int i10 = i2 + i4;
            if (FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1836019574 || FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1970628964) {
                i7 += (int) j2;
                if (i3 != 0 && i7 > FrostHunterServiceEliteCelestialThunder17572) {
                    i7 = (int) FrostHunterServiceEliteCelestialThunder17572;
                }
                if (FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1836019574) {
                    i9 = i10;
                    i6 = i3;
                    j4 = j;
                    i8 = 0;
                }
            }
            if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1953653099 && FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1835297121 && FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1835626086) {
                if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1836019558 && FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1836475768) {
                    if (FrostHunterServiceConnectionTurboPhoenixOmega67192 == 1835295092) {
                        z4 = true;
                    }
                    if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1937007212 || j2 <= 1000000) {
                        j3 = FrostHunterServiceEliteCelestialThunder17572;
                        if ((i10 + j2) - j7 < i7) {
                            int i11 = (int) (j2 - j7);
                            i9 = i10 + i11;
                            if (FrostHunterServiceConnectionTurboPhoenixOmega67192 != 1718909296) {
                                i5 = 0;
                                if (i11 != 0) {
                                    frostHunterPreviewNeoBeta3393.FrostHunterCameraXTurboCelestialHero5430(i11);
                                }
                            } else {
                                if (i11 < 8) {
                                    return new FrostHunterPropertyValuesHolderTurboQuantum5848(FrostHunterServiceConnectionTurboPhoenixOmega67192, 8, i11);
                                }
                                frostHunterLicensingSpectraPulse8868.FrostHunterStateCelestialNovaPixel8414(i11);
                                i5 = 0;
                                frostHunterPreviewNeoBeta3393.FrostHunterLintTitanVortexQuantum9911(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, 0, i11);
                                int FrostHunterServiceConnectionTurboPhoenixOmega67193 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                                if (FrostHunterMeteringPointBetaCyber9571(FrostHunterServiceConnectionTurboPhoenixOmega67193, z2)) {
                                    z4 = true;
                                }
                                frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(4);
                                int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() / 4;
                                if (!z4 && FrostHunterAlphaAnimationNeoCosmos57612 > 0) {
                                    int[] iArr2 = new int[FrostHunterAlphaAnimationNeoCosmos57612];
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= FrostHunterAlphaAnimationNeoCosmos57612) {
                                            z3 = z4;
                                            iArr = iArr2;
                                            break;
                                        }
                                        int FrostHunterServiceConnectionTurboPhoenixOmega67194 = frostHunterLicensingSpectraPulse8868.FrostHunterServiceConnectionTurboPhoenixOmega6719();
                                        iArr2[i12] = FrostHunterServiceConnectionTurboPhoenixOmega67194;
                                        if (FrostHunterMeteringPointBetaCyber9571(FrostHunterServiceConnectionTurboPhoenixOmega67194, z2)) {
                                            z3 = true;
                                            iArr = iArr2;
                                            break;
                                        }
                                        i12++;
                                    }
                                } else {
                                    z3 = z4;
                                    iArr = frostHunterRecyclerViewPulsePixelSolar8816;
                                }
                                if (!z3) {
                                    return new FrostHunterNestedScrollViewMaxEpicEpic6844(FrostHunterServiceConnectionTurboPhoenixOmega67193, iArr);
                                }
                                z4 = z3;
                            }
                        }
                    }
                    i = 0;
                    break;
                }
                i = 1;
                break;
            }
            j3 = FrostHunterServiceEliteCelestialThunder17572;
            i5 = 0;
            i9 = i10;
            i8 = i5;
            i6 = i3;
            j4 = j;
            FrostHunterServiceEliteCelestialThunder17572 = j3;
        }
        frostHunterRecyclerViewPulsePixelSolar8816 = null;
        i = i8;
        return !z4 ? FrostHunterRippleDrawableBlazeBetaStorm6320.FrostHunterResourcesTitanHyperVision5823 : z != i ? i != 0 ? FrostHunterTextWatcherNovaXStormRogue9640.FrostHunterAlertDialogAuroraDelta3200 : FrostHunterTextWatcherNovaXStormRogue9640.FrostHunterKeyframeGammaGamma1197 : frostHunterRecyclerViewPulsePixelSolar8816;
    }

    public static IOException FrostHunterRemoteConfigSpeedSpeed8566(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : parentFile.canWrite() ? FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : parentFile.canWrite() ? FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException) : FrostHunterLevelListDrawableFusionDragonHero2232(file, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterRemoteConfigThunderShadow4435(Context context, Executor executor, FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze1599, boolean z) {
        boolean z2;
        ?? r7;
        FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr;
        FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr2;
        FrostHunterStorageHyperionRogue1554[] frostHunterStorageHyperionRogue1554Arr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? byteArrayOutputStream;
        FrostHunterCanvasSpectraPixelHyper7343 frostHunterCanvasSpectraPixelHyper7343;
        String str;
        String str2;
        FileInputStream FrostHunterServiceEliteCelestialThunder17572;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        context.getPackageName();
                        FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, false);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            context.getPackageName();
            byte[] bArr2 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterAlertDialogAuroraDelta3200;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            FrostHunterCanvasSpectraPixelHyper7343 frostHunterCanvasSpectraPixelHyper73432 = new FrostHunterCanvasSpectraPixelHyper7343(assets, executor, frostHunterPropertyValuesHolderAlphaBetaBlaze1599, name, file2);
            byte[] bArr3 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(4, null);
                    }
                    frostHunterCanvasSpectraPixelHyper73432.FrostHunterAlphaAnimationNeoCosmos5761 = true;
                    try {
                        try {
                            r7 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e) {
                            frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(6, e);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                            if (frostHunterStorageHyperionRogue1554Arr2 != null) {
                            }
                            FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze15992 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                            frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                            byte[] bArr4 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                            boolean z11 = r7;
                            z11 = r7;
                            if (frostHunterStorageHyperionRogue1554Arr3 != null) {
                            }
                            bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                        } catch (IOException e2) {
                            frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e2);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                            if (frostHunterStorageHyperionRogue1554Arr2 != null) {
                            }
                            FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze159922 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                            frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                            byte[] bArr42 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                            boolean z112 = r7;
                            z112 = r7;
                            if (frostHunterStorageHyperionRogue1554Arr3 != null) {
                            }
                            bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                        }
                        if (r7 != 0) {
                            try {
                            } catch (IOException e3) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e3);
                                try {
                                    r7.close();
                                } catch (IOException e4) {
                                    frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e4);
                                }
                                frostHunterStorageHyperionRogue1554Arr = null;
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStorageHyperionRogue1554Arr;
                                frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                                if (frostHunterStorageHyperionRogue1554Arr2 != null) {
                                }
                                FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze1599222 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                                frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                                byte[] bArr422 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                                boolean z1122 = r7;
                                z1122 = r7;
                                if (frostHunterStorageHyperionRogue1554Arr3 != null) {
                                }
                                bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                            } catch (IllegalStateException e5) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(8, e5);
                                r7.close();
                                frostHunterStorageHyperionRogue1554Arr = null;
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStorageHyperionRogue1554Arr;
                                frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                                if (frostHunterStorageHyperionRogue1554Arr2 != null) {
                                }
                                FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze15992222 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                                frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                                byte[] bArr4222 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (frostHunterStorageHyperionRogue1554Arr3 != null) {
                                }
                                bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                            }
                            if (!Arrays.equals(bArr2, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            frostHunterStorageHyperionRogue1554Arr = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterBillingClientFusionVortex9008(r7, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(r7, 4), (String) frostHunterCanvasSpectraPixelHyper73432.FrostHunterRemoteConfigSpeedSpeed8566);
                            try {
                                r7.close();
                            } catch (IOException e6) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e6);
                            }
                            frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = frostHunterStorageHyperionRogue1554Arr;
                        }
                        frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                        if (frostHunterStorageHyperionRogue1554Arr2 != null && ((r7 = Build.VERSION.SDK_INT) >= 31 || r7 == 24 || r7 == 25)) {
                            try {
                                str2 = "dexopt/baseline.profm";
                                FrostHunterServiceEliteCelestialThunder17572 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757(assets, "dexopt/baseline.profm");
                                str = str2;
                            } catch (FileNotFoundException e7) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(9, e7);
                                str = r7;
                            } catch (IOException e8) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e8);
                                str = r7;
                            } catch (IllegalStateException e9) {
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(8, e9);
                                str = r7;
                            }
                            if (FrostHunterServiceEliteCelestialThunder17572 == null) {
                                try {
                                    if (!Arrays.equals(FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterKeyframeGammaGamma1197, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(FrostHunterServiceEliteCelestialThunder17572, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] FrostHunterMagnetometerFusionTitanium8202 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterMagnetometerFusionTitanium8202(FrostHunterServiceEliteCelestialThunder17572, 4);
                                    frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterCardViewSpectraCyber7714(FrostHunterServiceEliteCelestialThunder17572, FrostHunterMagnetometerFusionTitanium8202, bArr3, frostHunterStorageHyperionRogue1554Arr2);
                                    FrostHunterServiceEliteCelestialThunder17572.close();
                                    frostHunterCanvasSpectraPixelHyper7343 = frostHunterCanvasSpectraPixelHyper73432;
                                    r7 = FrostHunterMagnetometerFusionTitanium8202;
                                    if (frostHunterCanvasSpectraPixelHyper7343 != null) {
                                        frostHunterCanvasSpectraPixelHyper73432 = frostHunterCanvasSpectraPixelHyper7343;
                                    }
                                } finally {
                                }
                            } else {
                                if (FrostHunterServiceEliteCelestialThunder17572 != null) {
                                    FrostHunterServiceEliteCelestialThunder17572.close();
                                    str = str2;
                                }
                                frostHunterCanvasSpectraPixelHyper7343 = null;
                                r7 = str;
                                if (frostHunterCanvasSpectraPixelHyper7343 != null) {
                                }
                            }
                        }
                        FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze159922222 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                        frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                        byte[] bArr42222 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (frostHunterStorageHyperionRogue1554Arr3 != null && bArr42222 != null) {
                            z7 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (z7) {
                                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr2);
                                    byteArrayOutputStream.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e10) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze159922222.FrostHunterLintTitanVortexQuantum9911(7, e10);
                                z8 = z7;
                            } catch (IllegalStateException e11) {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze159922222.FrostHunterLintTitanVortexQuantum9911(8, e11);
                                z8 = z7;
                            }
                            if (FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFCMDeltaQuantumHero8364(byteArrayOutputStream, bArr42222, frostHunterStorageHyperionRogue1554Arr3)) {
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                z8 = byteArrayOutputStream;
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                z112222 = z8;
                            } else {
                                frostHunterPropertyValuesHolderAlphaBetaBlaze159922222.FrostHunterLintTitanVortexQuantum9911(5, null);
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                byteArrayOutputStream.close();
                                z112222 = byteArrayOutputStream;
                            }
                        }
                        bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!frostHunterCanvasSpectraPixelHyper73432.FrostHunterAlphaAnimationNeoCosmos5761) {
                                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLevelListDrawableFusionDragonHero2232);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889 = null;
                                                                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        z112222 = true;
                                        frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                                    } catch (IOException e13) {
                                        e = e13;
                                        z112222 = true;
                                        frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                                } catch (IOException e15) {
                                    e = e15;
                                    frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
                                }
                            } finally {
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889 = null;
                                frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814 = null;
                            }
                        }
                        if (z4) {
                            FrostHunterViewPhantomNeo1634(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(4, null);
                        }
                        frostHunterCanvasSpectraPixelHyper73432.FrostHunterAlphaAnimationNeoCosmos5761 = true;
                        r7 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        frostHunterStorageHyperionRogue1554Arr2 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                        if (frostHunterStorageHyperionRogue1554Arr2 != null) {
                            str2 = "dexopt/baseline.profm";
                            FrostHunterServiceEliteCelestialThunder17572 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757(assets, "dexopt/baseline.profm");
                            str = str2;
                            if (FrostHunterServiceEliteCelestialThunder17572 == null) {
                            }
                        }
                        FrostHunterPropertyValuesHolderAlphaBetaBlaze1599 frostHunterPropertyValuesHolderAlphaBetaBlaze1599222222 = (FrostHunterPropertyValuesHolderAlphaBetaBlaze1599) frostHunterCanvasSpectraPixelHyper73432.FrostHunterBundlePulseFusionHero2475;
                        frostHunterStorageHyperionRogue1554Arr3 = (FrostHunterStorageHyperionRogue1554[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterCameraXPixelTurboCosmos9814;
                        byte[] bArr422222 = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterServiceEliteCelestialThunder1757;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (frostHunterStorageHyperionRogue1554Arr3 != null) {
                            z7 = frostHunterCanvasSpectraPixelHyper73432.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (z7) {
                            }
                        }
                        bArr = (byte[]) frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(4, null);
                    }
                }
                FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
            }
            frostHunterCanvasSpectraPixelHyper73432.FrostHunterLifecycleBlazeGammaElite2889(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, (z6 || !z) ? false : z9);
        } catch (PackageManager.NameNotFoundException e16) {
            frostHunterPropertyValuesHolderAlphaBetaBlaze1599.FrostHunterLintTitanVortexQuantum9911(7, e16);
            FrostHunterGyroscopeHyperQuantum5036.FrostHunterBundlePulseFusionHero2475(context, false);
        }
    }

    public static final Integer FrostHunterResourcesTitanHyperVision5823(FrostHunterKeyEventForceSparkSpeed5603 frostHunterKeyEventForceSparkSpeed5603, FrostHunterActivityInfoTitaniumAlphaElite4329 frostHunterActivityInfoTitaniumAlphaElite4329, int i, int i2) {
        Integer FrostHunterResourcesTitanHyperVision5823;
        int[] iArr = frostHunterKeyEventForceSparkSpeed5603.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (frostHunterKeyEventForceSparkSpeed5603.FrostHunterAlertDialogAuroraDelta3200(i) && frostHunterKeyEventForceSparkSpeed5603.FrostHunterFlowMaxDragonHero5809(i) == 206 && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterKeyEventForceSparkSpeed5603.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(i, iArr), FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterLifecycleBlazeGammaElite2889)) {
                Object FrostHunterCameraXPixelTurboCosmos98142 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterCameraXPixelTurboCosmos9814(i, 0);
                FrostHunterProcessCameraProviderNebulaOlympianNova6091 frostHunterProcessCameraProviderNebulaOlympianNova6091 = FrostHunterCameraXPixelTurboCosmos98142 instanceof FrostHunterProcessCameraProviderNebulaOlympianNova6091 ? (FrostHunterProcessCameraProviderNebulaOlympianNova6091) FrostHunterCameraXPixelTurboCosmos98142 : null;
                if (frostHunterProcessCameraProviderNebulaOlympianNova6091 != null && frostHunterProcessCameraProviderNebulaOlympianNova6091.FrostHunterCameraXPixelTurboCosmos9814 == frostHunterActivityInfoTitaniumAlphaElite4329) {
                    return Integer.valueOf(i);
                }
            }
            if (frostHunterKeyEventForceSparkSpeed5603.FrostHunterServiceEliteCelestialThunder1757(i) && (FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823(frostHunterKeyEventForceSparkSpeed5603, frostHunterActivityInfoTitaniumAlphaElite4329, i + 1, i3)) != null) {
                return Integer.valueOf(FrostHunterResourcesTitanHyperVision5823.intValue());
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long FrostHunterRewardedAdMasterStrike9463(long j, FrostHunterPagingSourceSpeedNeo6157 frostHunterPagingSourceSpeedNeo6157) {
        long j2;
        TimeUnit timeUnit = frostHunterPagingSourceSpeedNeo6157.FrostHunterCameraXPixelTurboCosmos9814;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            FrostHunterBottomSheetEclipseUltraShadow6009 frostHunterBottomSheetEclipseUltraShadow6009 = FrostHunterContextPhantomVortex1776.FrostHunterCameraXPixelTurboCosmos9814;
            long j3 = convert2 << 1;
            int i = FrostHunterJobIntentServiceForceBlazeForce7061.FrostHunterAlphaAnimationNeoCosmos5761;
            return j3;
        }
        if (frostHunterPagingSourceSpeedNeo6157.compareTo(FrostHunterPagingSourceSpeedNeo6157.MILLISECONDS) < 0) {
            return FrostHunterLintTitanVortexQuantum9911(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterResourcesTitanHyperVision5823(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long abs = Math.abs(j);
        int ordinal = frostHunterPagingSourceSpeedNeo6157.ordinal();
        long j4 = 0;
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(frostHunterPagingSourceSpeedNeo6157, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (abs != 0) {
            j4 = 4611686018427387903L;
            if (abs == 1) {
                if (j2 <= 4611686018427387903L) {
                    abs = j2;
                    return FrostHunterLintTitanVortexQuantum9911(signum * abs);
                }
            } else if (j2 != 1) {
                int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(abs)) - Long.numberOfLeadingZeros(j2);
                if (numberOfLeadingZeros < 63) {
                    abs *= j2;
                } else if (numberOfLeadingZeros <= 63) {
                    abs *= j2;
                }
                return FrostHunterLintTitanVortexQuantum9911(signum * abs);
            }
        }
        abs = j4;
        return FrostHunterLintTitanVortexQuantum9911(signum * abs);
    }

    public static final void FrostHunterRewardedAdSpectraElite8288(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, int i, FrostHunterLaunchDeltaHeroHyperion7277 frostHunterLaunchDeltaHeroHyperion7277) {
        FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112;
        FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterSharedElementSpectraNeo2511[16]);
        List FrostHunterFlowMaxDragonHero58092 = frostHunterSharedElementSpectraNeo2511.FrostHunterFlowMaxDragonHero5809(false, false);
        while (true) {
            frostHunterObjectAnimatorNeoStrike7090.FrostHunterServiceEliteCelestialThunder1757(frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200, FrostHunterFlowMaxDragonHero58092);
            while (true) {
                int i2 = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
                if (i2 == 0) {
                    return;
                }
                frostHunterSharedElementSpectraNeo25112 = (FrostHunterSharedElementSpectraNeo2511) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i2 - 1);
                boolean FrostHunterBillingClientFusionVortex9008 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBillingClientFusionVortex9008(frostHunterSharedElementSpectraNeo25112);
                FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814;
                if (!FrostHunterBillingClientFusionVortex9008 && !frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterFlowMaxDragonHero5809)) {
                    FrostHunterVectorDrawableMaxAlpha8598 FrostHunterServiceEliteCelestialThunder17572 = frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757();
                    if (FrostHunterServiceEliteCelestialThunder17572 == null) {
                        throw FrostHunterKeyEventNovaXAlpha1220.FrostHunterLevelListDrawableFusionDragonHero2232("Expected semantics node to have a coordinator.");
                    }
                    FrostHunterSQLiteVisionSpeedSpark5388 FrostHunterPagingDataTurboTitanium7332 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingDataTurboTitanium7332(FrostHunterPaintCyberPulse5979.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterServiceEliteCelestialThunder17572));
                    if (FrostHunterPagingDataTurboTitanium7332.FrostHunterAlphaAnimationNeoCosmos5761 < FrostHunterPagingDataTurboTitanium7332.FrostHunterBundlePulseFusionHero2475 && FrostHunterPagingDataTurboTitanium7332.FrostHunterConstraintSetCloneMasterUltraRogue2633 < FrostHunterPagingDataTurboTitanium7332.FrostHunterServiceEliteCelestialThunder1757) {
                        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterDialogVortexNeoUltra2659.FrostHunterLifecycleBlazeGammaElite2889);
                        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                            FrostHunterRemoteConfigSpeedSpeed85662 = null;
                        }
                        FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574 = (FrostHunterFontFamilyNeoBetaEpic8574) FrostHunterRemoteConfigSpeedSpeed85662;
                        Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterTextViewDragonStormMega4297);
                        FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) (FrostHunterRemoteConfigSpeedSpeed85663 != null ? FrostHunterRemoteConfigSpeedSpeed85663 : null);
                        if (frostHunterFontFamilyNeoBetaEpic8574 != null && frostHunterProcessCameraProviderTitaniumNeoNova1860 != null && ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() > 0.0f) {
                            int i3 = i + 1;
                            frostHunterLaunchDeltaHeroHyperion7277.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterExoPlayerMegaSolar4982(frostHunterSharedElementSpectraNeo25112, i3, FrostHunterPagingDataTurboTitanium7332, FrostHunterServiceEliteCelestialThunder17572));
                            FrostHunterRewardedAdSpectraElite8288(frostHunterSharedElementSpectraNeo25112, i3, frostHunterLaunchDeltaHeroHyperion7277);
                        }
                    }
                }
            }
            FrostHunterFlowMaxDragonHero58092 = frostHunterSharedElementSpectraNeo25112.FrostHunterFlowMaxDragonHero5809(false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long FrostHunterScaleAnimationStrikeSpark5059(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (FrostHunterTextInputLayoutSolarCyberEpic4119.FrostHunterAlphaAnimationNeoCosmos5761[roundingMode.ordinal()]) {
            case 1:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterFragmentBetaMegaVortex6025(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                throw new AssertionError();
        }
    }

    public static final FrostHunterMaterialCardViewEliteRogue2483 FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483) {
        FrostHunterMaterialCardViewEliteRogue2483 FrostHunterBundlePulseFusionHero24752 = frostHunterMaterialCardViewEliteRogue2483.FrostHunterBundlePulseFusionHero2475();
        int FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterBundlePulseFusionHero24752.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        for (int i = 0; i < FrostHunterConstraintSetCloneMasterUltraRogue26332; i++) {
            FrostHunterBundlePulseFusionHero24752.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMaterialCardViewEliteRogue2483.FrostHunterAlphaAnimationNeoCosmos5761(i), i);
        }
        return FrostHunterBundlePulseFusionHero24752;
    }

    public static final Drawable FrostHunterServiceEliteCelestialThunder1757(FrostHunterFragmentTransactionEclipseNovaXForce8101 frostHunterFragmentTransactionEclipseNovaXForce8101, Resources resources) {
        return frostHunterFragmentTransactionEclipseNovaXForce8101 instanceof FrostHunterBarcodeScannerEclipseUltraMega1019 ? ((FrostHunterBarcodeScannerEclipseUltraMega1019) frostHunterFragmentTransactionEclipseNovaXForce8101).FrostHunterAlphaAnimationNeoCosmos5761 : frostHunterFragmentTransactionEclipseNovaXForce8101 instanceof FrostHunterDrawableNovaCelestial2796 ? new BitmapDrawable(resources, ((FrostHunterDrawableNovaCelestial2796) frostHunterFragmentTransactionEclipseNovaXForce8101).FrostHunterAlphaAnimationNeoCosmos5761) : new FrostHunterKeyframeUltraBlaze8005(frostHunterFragmentTransactionEclipseNovaXForce8101);
    }

    public static boolean FrostHunterServiceInfoHyperionSparkMax9966(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final void FrostHunterStateCelestialNovaPixel8414(FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Runnable runnable) {
        try {
            frostHunterResourceThunderSolarForce1212.FrostHunterMeteringPointMegaCyber7955(frostHunterCountDownTimerRogueTitan5615, runnable);
        } catch (Throwable th) {
            throw new FrostHunterBindingAdapterPhantomMega6235(th, frostHunterResourceThunderSolarForce1212, frostHunterCountDownTimerRogueTitan5615);
        }
    }

    public static final FrostHunterCountDownTimerRogueTitan5615 FrostHunterTextViewDragonStormMega4297(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan56152, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 4;
        boolean booleanValue = ((Boolean) frostHunterCountDownTimerRogueTitan5615.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLaunchEclipseAurora4535(i), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) frostHunterCountDownTimerRogueTitan56152.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLaunchEclipseAurora4535(i), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return frostHunterCountDownTimerRogueTitan5615.FrostHunterFragmentBetaMegaVortex6025(frostHunterCountDownTimerRogueTitan56152);
        }
        FrostHunterLaunchEclipseAurora4535 frostHunterLaunchEclipseAurora4535 = new FrostHunterLaunchEclipseAurora4535(5);
        FrostHunterFCMThunderTitanium1373 frostHunterFCMThunderTitanium1373 = FrostHunterFCMThunderTitanium1373.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan56153 = (FrostHunterCountDownTimerRogueTitan5615) frostHunterCountDownTimerRogueTitan5615.FrostHunterAlertDialogAuroraDelta3200(frostHunterLaunchEclipseAurora4535, frostHunterFCMThunderTitanium1373);
        Object obj = frostHunterCountDownTimerRogueTitan56152;
        if (booleanValue2) {
            obj = frostHunterCountDownTimerRogueTitan56152.FrostHunterAlertDialogAuroraDelta3200(new FrostHunterLaunchEclipseAurora4535(6), frostHunterFCMThunderTitanium1373);
        }
        return frostHunterCountDownTimerRogueTitan56153.FrostHunterFragmentBetaMegaVortex6025((FrostHunterCountDownTimerRogueTitan5615) obj);
    }

    public static final FrostHunterLayerDrawableMegaCosmos5639 FrostHunterTransitionListenerPulseVortexCosmos7949(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705, FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Object obj) {
        FrostHunterLayerDrawableMegaCosmos5639 frostHunterLayerDrawableMegaCosmos5639 = null;
        if ((frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterSQLiteNovaXCelestial9743) && frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterTransitionListenerStormDelta1888.FrostHunterAlertDialogAuroraDelta3200) != null) {
            FrostHunterSQLiteNovaXCelestial9743 frostHunterSQLiteNovaXCelestial9743 = (FrostHunterSQLiteNovaXCelestial9743) frostHunterTraceCelestialVortexSpark6705;
            while (true) {
                if ((frostHunterSQLiteNovaXCelestial9743 instanceof FrostHunterObjectDetectionPhoenixMaxFusion4023) || (frostHunterSQLiteNovaXCelestial9743 = frostHunterSQLiteNovaXCelestial9743.FrostHunterLifecycleBlazeGammaElite2889()) == null) {
                    break;
                }
                if (frostHunterSQLiteNovaXCelestial9743 instanceof FrostHunterLayerDrawableMegaCosmos5639) {
                    frostHunterLayerDrawableMegaCosmos5639 = (FrostHunterLayerDrawableMegaCosmos5639) frostHunterSQLiteNovaXCelestial9743;
                    break;
                }
            }
            if (frostHunterLayerDrawableMegaCosmos5639 != null) {
                frostHunterLayerDrawableMegaCosmos5639.FrostHunterSharedElementPixelTitan2806(frostHunterCountDownTimerRogueTitan5615, obj);
            }
        }
        return frostHunterLayerDrawableMegaCosmos5639;
    }

    public static final void FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705, Object obj) {
        if (!(frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterFlowOnUltraInfernoThunder4489)) {
            frostHunterTraceCelestialVortexSpark6705.FrostHunterRemoteConfigSpeedSpeed8566(obj);
            return;
        }
        FrostHunterFlowOnUltraInfernoThunder4489 frostHunterFlowOnUltraInfernoThunder4489 = (FrostHunterFlowOnUltraInfernoThunder4489) frostHunterTraceCelestialVortexSpark6705;
        FrostHunterResourceThunderSolarForce1212 frostHunterResourceThunderSolarForce1212 = frostHunterFlowOnUltraInfernoThunder4489.FrostHunterKeyframeGammaGamma1197;
        FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351 = frostHunterFlowOnUltraInfernoThunder4489.FrostHunterFragmentBetaMegaVortex6025;
        Throwable FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterProximitySensorLegendAuroraPrime1541.FrostHunterAlphaAnimationNeoCosmos5761(obj);
        Object frostHunterImageViewTitaniumVision4682 = FrostHunterAlphaAnimationNeoCosmos57612 == null ? obj : new FrostHunterImageViewTitaniumVision4682(FrostHunterAlphaAnimationNeoCosmos57612, false);
        if (FrostHunterMagnetometerFusionTitanium8202(frostHunterResourceThunderSolarForce1212, frostHunterViewBindingCelestialVortex7351.getContext())) {
            frostHunterFlowOnUltraInfernoThunder4489.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterImageViewTitaniumVision4682;
            frostHunterFlowOnUltraInfernoThunder4489.FrostHunterAlertDialogAuroraDelta3200 = 1;
            FrostHunterStateCelestialNovaPixel8414(frostHunterResourceThunderSolarForce1212, frostHunterViewBindingCelestialVortex7351.getContext(), frostHunterFlowOnUltraInfernoThunder4489);
            return;
        }
        FrostHunterOnLongClickListenerBlazeFusionFusion2658 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterDrawableRogueCelestial1881.FrostHunterAlphaAnimationNeoCosmos5761();
        if (FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterAlertDialogAuroraDelta3200 >= 4294967296L) {
            frostHunterFlowOnUltraInfernoThunder4489.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterImageViewTitaniumVision4682;
            frostHunterFlowOnUltraInfernoThunder4489.FrostHunterAlertDialogAuroraDelta3200 = 1;
            FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterMagnetometerFusionTitanium8202(frostHunterFlowOnUltraInfernoThunder4489);
            return;
        }
        FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterPagingDataTurboTitanium7332(true);
        try {
            FrostHunterContentObserverLegendUltraVortex4209 frostHunterContentObserverLegendUltraVortex4209 = (FrostHunterContentObserverLegendUltraVortex4209) frostHunterViewBindingCelestialVortex7351.getContext().FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterCardViewSpectraCyber7714);
            if (frostHunterContentObserverLegendUltraVortex4209 == null || frostHunterContentObserverLegendUltraVortex4209.FrostHunterAlphaAnimationNeoCosmos5761()) {
                Object obj2 = frostHunterFlowOnUltraInfernoThunder4489.FrostHunterLightSensorForceFusion4241;
                FrostHunterCountDownTimerRogueTitan5615 context = frostHunterViewBindingCelestialVortex7351.getContext();
                Object FrostHunterColorStateListMegaBetaFusion7423 = FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListMegaBetaFusion7423(context, obj2);
                FrostHunterLayerDrawableMegaCosmos5639 FrostHunterTransitionListenerPulseVortexCosmos7949 = FrostHunterColorStateListMegaBetaFusion7423 != FrostHunterCardViewHyperionAurora3829.FrostHunterFragmentBetaMegaVortex6025 ? FrostHunterTransitionListenerPulseVortexCosmos7949(frostHunterViewBindingCelestialVortex7351, context, FrostHunterColorStateListMegaBetaFusion7423) : null;
                try {
                    frostHunterViewBindingCelestialVortex7351.FrostHunterRemoteConfigSpeedSpeed8566(obj);
                } finally {
                    if (FrostHunterTransitionListenerPulseVortexCosmos7949 == null || FrostHunterTransitionListenerPulseVortexCosmos7949.FrostHunterAlphaAnimationNovaGamma6326()) {
                        FrostHunterCardViewHyperionAurora3829.FrostHunterAnnotationProcessorSparkEclipse8710(context, FrostHunterColorStateListMegaBetaFusion7423);
                    }
                }
            } else {
                frostHunterFlowOnUltraInfernoThunder4489.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterCameraXTurboCelestialHero5430(frostHunterContentObserverLegendUltraVortex4209.FrostHunterTextViewDragonStormMega4297()));
            }
            while (FrostHunterAlphaAnimationNeoCosmos57613.FrostHunterFCMDeltaQuantumHero8364()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static void FrostHunterViewPhantomNeo1634(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
