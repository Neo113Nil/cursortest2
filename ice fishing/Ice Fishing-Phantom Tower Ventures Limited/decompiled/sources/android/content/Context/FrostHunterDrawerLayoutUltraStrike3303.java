package android.content.Context;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.EdgeEffect;
import android.window.BackEvent;
import com.adjust.sdk.Constants;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterDrawerLayoutUltraStrike3303 {
    public static final FrostHunterChipSpeedTitan5326 FrostHunterBundlePulseFusionHero2475;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterLightSensorForceFusion4241;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterScaleAnimationStrikeSpark5059;
    public static final FrostHunterRippleDrawableBlazeBetaStorm6320 FrostHunterServiceEliteCelestialThunder1757;
    public static final FrostHunterOnDeviceTranslatorDragonHyperMega3652 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterOnDeviceTranslatorDragonHyperMega3652();
    public static final FrostHunterPushNotificationOlympianBeta6868 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterPushNotificationOlympianBeta6868();
    public static final FrostHunterProGuardDragonDelta7682 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterProGuardDragonDelta7682(1.0f, 1.0f);
    public static final Object FrostHunterLevelListDrawableFusionDragonHero2232 = new Object();
    public static final byte[] FrostHunterRemoteConfigSpeedSpeed8566 = {48, 49, 53, 0};
    public static final byte[] FrostHunterCameraXPixelTurboCosmos9814 = {48, 49, 48, 0};
    public static final byte[] FrostHunterFlowMaxDragonHero5809 = {48, 48, 57, 0};
    public static final byte[] FrostHunterAlertDialogAuroraDelta3200 = {48, 48, 53, 0};
    public static final byte[] FrostHunterKeyframeGammaGamma1197 = {48, 48, 49, 0};
    public static final byte[] FrostHunterFragmentBetaMegaVortex6025 = {48, 48, 49, 0};
    public static final byte[] FrostHunterServiceConnectionTurboPhoenixOmega6719 = {48, 48, 50, 0};

    static {
        int i = 22;
        FrostHunterBundlePulseFusionHero2475 = new FrostHunterChipSpeedTitan5326(i);
        FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterRippleDrawableBlazeBetaStorm6320(i);
        int i2 = 3;
        FrostHunterLightSensorForceFusion4241 = new FrostHunterWorkManagerMaxTurbo1858("NONE", i2);
        FrostHunterScaleAnimationStrikeSpark5059 = new FrostHunterWorkManagerMaxTurbo1858("PENDING", i2);
    }

    public static final FrostHunterInsetDrawablePulseQuantum5539 FrostHunterAlertDialogAuroraDelta3200(FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883) {
        FrostHunterJobSchedulerEpicAuroraNebula9616 FrostHunterLooperHyperionForce4133;
        int i = frostHunterThemeOverlayAlphaUltra2883.FrostHunterKeyframeGammaGamma1197;
        long j = frostHunterThemeOverlayAlphaUltra2883.FrostHunterResourcesTitanHyperVision5823;
        long j2 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterTextViewDragonStormMega4297;
        FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian7298 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = frostHunterColorStateListInflaterHeroEclipseOlympian7298.iterator();
        while (true) {
            FrostHunterRoomDaoHyperFusionCelestial1775 frostHunterRoomDaoHyperFusionCelestial1775 = (FrostHunterRoomDaoHyperFusionCelestial1775) it;
            if (!frostHunterRoomDaoHyperFusionCelestial1775.hasNext()) {
                break;
            }
            FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 = (FrostHunterLaunchHeroForce4010) frostHunterRoomDaoHyperFusionCelestial1775.next();
            String str = (String) frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814;
            String str2 = (String) frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(lowerCase, obj);
            }
            ((List) obj).add(str2);
        }
        FrostHunterOnDeviceTranslatorUltraQuantum2312 frostHunterOnDeviceTranslatorUltraQuantum2312 = new FrostHunterOnDeviceTranslatorUltraQuantum2312(FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605(linkedHashMap));
        FrostHunterRoomEliteEclipseCyber1854 frostHunterRoomEliteEclipseCyber1854 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterLightSensorForceFusion4241;
        return new FrostHunterInsetDrawablePulseQuantum5539(i, j, j2, frostHunterOnDeviceTranslatorUltraQuantum2312, (frostHunterRoomEliteEclipseCyber1854 == null || (FrostHunterLooperHyperionForce4133 = frostHunterRoomEliteEclipseCyber1854.FrostHunterLooperHyperionForce4133()) == null) ? null : new FrostHunterCardViewTitanInfernoShadow1665(FrostHunterLooperHyperionForce4133), frostHunterThemeOverlayAlphaUltra2883);
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterLiveDataNeoMegaQuantum2801 frostHunterLiveDataNeoMegaQuantum2801, FrostHunterFlatMapAuroraOlympianBeta5874 frostHunterFlatMapAuroraOlympianBeta5874, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        int i2;
        int i3;
        Object obj;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(826668973);
        if ((i & 6) == 0) {
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterLiveDataNeoMegaQuantum2801) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFlatMapAuroraOlympianBeta5874) ? 256 : 128;
        }
        int i4 = i2;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterLifecycleBlazeGammaElite2889);
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630 = (FrostHunterViewLegendStormDelta9630) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterLightSensorForceFusion4241);
            FrostHunterGradlePluginBetaLegend8324 FrostHunterPermissionInfoAlphaDelta6279 = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterPermissionInfoAlphaDelta6279(frostHunterDialogFragmentPhantomEclipse8068);
            FrostHunterChipSpectraInfernoVortex8090 FrostHunterAlertDialogAuroraDelta32002 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlertDialogAuroraDelta3200(frostHunterFlatMapAuroraOlympianBeta5874, frostHunterDialogFragmentPhantomEclipse8068);
            Object[] objArr = new Object[0];
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj2 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            Object obj3 = FrostHunterMagnetometerFusionTitanium8202;
            if (FrostHunterMagnetometerFusionTitanium8202 == obj2) {
                Object obj4 = FrostHunterPreviewMaxRogue1811.FrostHunterScaleAnimationStrikeSpark5059;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(obj4);
                obj3 = obj4;
            }
            UUID uuid = (UUID) FrostHunterPaintCyberPulse5979.FrostHunterFCMDeltaQuantumHero8364(objArr, (FrostHunterNotificationGammaBlazePhoenix7595) obj3, frostHunterDialogFragmentPhantomEclipse8068);
            boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(view) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDispatchersPrimeHeroSpeed4562);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium82022 == obj2) {
                FrostHunterColorDrawableNeoForce3192 frostHunterColorDrawableNeoForce3192 = new FrostHunterColorDrawableNeoForce3192(frostHunterNotificationGammaBlazePhoenix7595, frostHunterLiveDataNeoMegaQuantum2801, view, frostHunterViewLegendStormDelta9630, frostHunterDispatchersPrimeHeroSpeed4562, uuid);
                FrostHunterFlatMapAuroraOlympianBeta5874 frostHunterFlatMapAuroraOlympianBeta58742 = new FrostHunterFlatMapAuroraOlympianBeta5874(346960332, true, new FrostHunterMediaPlayerForcePrime6643(r14, FrostHunterAlertDialogAuroraDelta32002));
                FrostHunterManifestThunderCelestialAurora1686 frostHunterManifestThunderCelestialAurora1686 = frostHunterColorDrawableNeoForce3192.FrostHunterScaleAnimationStrikeSpark5059;
                frostHunterManifestThunderCelestialAurora1686.setParentCompositionContext(FrostHunterPermissionInfoAlphaDelta6279);
                frostHunterManifestThunderCelestialAurora1686.FrostHunterLintTitanVortexQuantum9911.setValue(frostHunterFlatMapAuroraOlympianBeta58742);
                frostHunterManifestThunderCelestialAurora1686.FrostHunterLooperThreadBetaHyperionMax1000 = true;
                if (frostHunterManifestThunderCelestialAurora1686.FrostHunterKeyframeGammaGamma1197 == null && !frostHunterManifestThunderCelestialAurora1686.isAttachedToWindow()) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    return;
                } else {
                    frostHunterManifestThunderCelestialAurora1686.FrostHunterServiceEliteCelestialThunder1757();
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterColorDrawableNeoForce3192);
                    FrostHunterMagnetometerFusionTitanium82022 = frostHunterColorDrawableNeoForce3192;
                }
            }
            FrostHunterColorDrawableNeoForce3192 frostHunterColorDrawableNeoForce31922 = (FrostHunterColorDrawableNeoForce3192) FrostHunterMagnetometerFusionTitanium82022;
            boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterColorDrawableNeoForce31922);
            Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj5 = FrostHunterMagnetometerFusionTitanium82023;
            if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium82023 == obj2) {
                Object frostHunterContentResolverMaxForceSolar3003 = new FrostHunterContentResolverMaxForceSolar3003(frostHunterColorDrawableNeoForce31922, null, 0);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterContentResolverMaxForceSolar3003);
                obj5 = frostHunterContentResolverMaxForceSolar3003;
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDialogFragmentPhantomEclipse8068, (FrostHunterFontFamilyNeoBetaEpic8574) obj5, FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
            boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterColorDrawableNeoForce31922);
            Object FrostHunterMagnetometerFusionTitanium82024 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98143 || FrostHunterMagnetometerFusionTitanium82024 == obj2) {
                i3 = 0;
                Object frostHunterSensorManagerUltraEpicMega2476 = new FrostHunterSensorManagerUltraEpicMega2476(frostHunterColorDrawableNeoForce31922, i3);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterSensorManagerUltraEpicMega2476);
                obj = frostHunterSensorManagerUltraEpicMega2476;
            } else {
                i3 = 0;
                obj = FrostHunterMagnetometerFusionTitanium82024;
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterServiceEliteCelestialThunder1757(frostHunterColorDrawableNeoForce31922, (FrostHunterCombineLegendMegaPrime5473) obj, frostHunterDialogFragmentPhantomEclipse8068);
            int i5 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterColorDrawableNeoForce31922) ? 1 : 0) | ((i4 & 14) == 4 ? 1 : i3) | ((i4 & 112) != 32 ? i3 : 1) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterViewLegendStormDelta9630.ordinal()) ? 1 : 0);
            Object FrostHunterMagnetometerFusionTitanium82025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj6 = FrostHunterMagnetometerFusionTitanium82025;
            if (i5 != 0 || FrostHunterMagnetometerFusionTitanium82025 == obj2) {
                Object frostHunterRippleDrawableTitaniumSparkPhoenix9544 = new FrostHunterRippleDrawableTitaniumSparkPhoenix9544(frostHunterColorDrawableNeoForce31922, frostHunterNotificationGammaBlazePhoenix7595, frostHunterLiveDataNeoMegaQuantum2801, frostHunterViewLegendStormDelta9630);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterRippleDrawableTitaniumSparkPhoenix9544);
                obj6 = frostHunterRippleDrawableTitaniumSparkPhoenix9544;
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809((FrostHunterNotificationGammaBlazePhoenix7595) obj6, frostHunterDialogFragmentPhantomEclipse8068);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterExecutorForceStrike9281(frostHunterNotificationGammaBlazePhoenix7595, frostHunterLiveDataNeoMegaQuantum2801, frostHunterFlatMapAuroraOlympianBeta5874, i, 0);
        }
    }

    public static void FrostHunterAnnotationProcessorSparkEclipse8710(String str) {
        FrostHunterLinearLayoutSolarTurboSpark3070 frostHunterLinearLayoutSolarTurboSpark3070 = new FrostHunterLinearLayoutSolarTurboSpark3070(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("lateinit property ", str, " has not been initialized"));
        FrostHunterRemoteConfigThunderShadow4435(frostHunterLinearLayoutSolarTurboSpark3070, FrostHunterDrawerLayoutUltraStrike3303.class.getName());
        throw frostHunterLinearLayoutSolarTurboSpark3070;
    }

    public static final Class FrostHunterBillingClientFusionVortex9008(FrostHunterRewardedAdAlphaPhoenixVortex4789 frostHunterRewardedAdAlphaPhoenixVortex4789) {
        Class FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterRewardedAdAlphaPhoenixVortex4789.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterAlphaAnimationNeoCosmos57612.getClass();
        return FrostHunterAlphaAnimationNeoCosmos57612;
    }

    public static final FrostHunterCombineBlazeLegendGamma9228 FrostHunterBitmapTurboDeltaNebula8743(FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109) {
        return frostHunterCombineBlazeLegendGamma9228.FrostHunterServiceEliteCelestialThunder1757(new FrostHunterPagingNovaXSolarSpark4514(frostHunterDragEventStormHyperion6109));
    }

    public static final FrostHunterPreviewPixelBetaQuantum7840 FrostHunterBundlePulseFusionHero2475(Object obj) {
        if (obj == null) {
            obj = FrostHunterPaintCyberPulse5979.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        return new FrostHunterPreviewPixelBetaQuantum7840(obj);
    }

    public static final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        int i2;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1090521195);
        if ((i & 6) == 0) {
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterFontFamilyNeoBetaEpic8574) ? 32 : 16;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 19) != 18)) {
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                FrostHunterMagnetometerFusionTitanium8202 = FrostHunterBillingClientForceThunder1002.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterApplicationInfoEclipseSparkDelta6014 frostHunterApplicationInfoEclipseSparkDelta6014 = (FrostHunterApplicationInfoEclipseSparkDelta6014) FrostHunterMagnetometerFusionTitanium8202;
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, frostHunterCombineBlazeLegendGamma9228);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, frostHunterApplicationInfoEclipseSparkDelta6014);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, Integer.valueOf((i3 >> 6) & 14));
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterCountDownTimerDragonOlympianNovaX7318(frostHunterCombineBlazeLegendGamma9228, frostHunterFontFamilyNeoBetaEpic8574, i);
        }
    }

    public static int FrostHunterCameraXTurboCelestialHero5430(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterCardViewSpectraCyber7714(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = ((FrostHunterLiveDataScopeBlazeStrike6673) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterPermissionInfoAlphaDelta6279(frostHunterServiceInfoTitaniumPrimeCyber9213).getFocusOwner()).FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterServiceInfoTitaniumPrimeCyber92132 == null || !frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterLooperThreadBetaHyperionMax1000) {
            return null;
        }
        return frostHunterServiceInfoTitaniumPrimeCyber92132;
    }

    public static void FrostHunterColorDrawableLegendPhoenixVision7927(String str, Throwable th) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, th);
        }
    }

    public static void FrostHunterColorStateListInflaterNovaQuantum4229(String str) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(final String str, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, final String str2, boolean z, float f, float f2, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i, final int i2) {
        int i3;
        final boolean z2;
        int i4;
        final FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma92282;
        final float f3;
        final float f4;
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823;
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682;
        FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723;
        boolean z3;
        int i5;
        float f5;
        float f6;
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80683 = frostHunterDialogFragmentPhantomEclipse8068;
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterDialogFragmentPhantomEclipse80683.FrostHunterConstraintSetCloneOmegaHyperion9304(-409897590);
        if ((i & 6) == 0) {
            i3 = (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterLevelListDrawableFusionDragonHero2232(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterServiceEliteCelestialThunder1757(R.drawable.btn_primary) ? 32 : 16);
        if ((i & 384) == 0) {
            i6 |= frostHunterDialogFragmentPhantomEclipse80683.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 256 : 128;
        }
        int i7 = i6 | 3072;
        int i8 = i2 & 32;
        if (i8 != 0) {
            i7 = 199680 | i6;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i7 |= frostHunterDialogFragmentPhantomEclipse80683.FrostHunterRemoteConfigSpeedSpeed8566(z2) ? 131072 : 65536;
            i4 = i7 | 14155776;
            int i9 = 1;
            int i10 = 0;
            if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterFCMDeltaQuantumHero8364(i4 & 1, (i4 & 4793491) == 4793490)) {
                frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPagingSourceEclipseDelta8255();
                frostHunterCombineBlazeLegendGamma92282 = frostHunterCombineBlazeLegendGamma9228;
                f3 = f;
                f4 = f2;
            } else {
                boolean z4 = i8 != 0 ? false : z2;
                Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterMagnetometerFusionTitanium8202();
                FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
                if (FrostHunterMagnetometerFusionTitanium8202 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                    FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterLocationManagerPixelVortex2935();
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
                }
                FrostHunterLocationManagerPixelVortex2935 frostHunterLocationManagerPixelVortex2935 = (FrostHunterLocationManagerPixelVortex2935) FrostHunterMagnetometerFusionTitanium8202;
                FrostHunterDataBindingStrikeVortex2868 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterTracePrimeCyber2386.FrostHunterAlphaAnimationNeoCosmos5761(((Boolean) FrostHunterTransitionGammaTitanSpeed7178.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterLocationManagerPixelVortex2935, frostHunterDialogFragmentPhantomEclipse80683).getValue()).booleanValue() ? 0.95f : 1.0f, FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPushNotificationStormTitanGamma8999(90, 6, null), "btn_scale", frostHunterDialogFragmentPhantomEclipse80683);
                FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse27232 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26332 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterAnimatorRoguePulse27232, 280.0f), 58.0f);
                boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterAlphaAnimationNeoCosmos57612);
                Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterMagnetometerFusionTitanium8202();
                if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium82022 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                    FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterFirestoreMasterHero4694(FrostHunterAlphaAnimationNeoCosmos57612, i9);
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
                }
                FrostHunterCombineBlazeLegendGamma9228 FrostHunterBundlePulseFusionHero24752 = androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26332, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82022), frostHunterLocationManagerPixelVortex2935, frostHunterNotificationGammaBlazePhoenix7595);
                FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
                int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80683.FrostHunterNavigationMasterMegaMax2752);
                FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterFragmentBetaMegaVortex6025();
                FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80683, FrostHunterBundlePulseFusionHero24752);
                FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                frostHunterDialogFragmentPhantomEclipse80683.FrostHunterAnnotationProcessorSparkEclipse8710();
                if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPagingSourceEclipseDelta8255) {
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
                } else {
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterImageAnalysisGammaOlympian2400();
                }
                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889;
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17572);
                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60252);
                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80683.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse80683, hashCode, frostHunterBindingAdapterUltraSpectraOmega24513);
                }
                FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike9463);
                FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(R.drawable.btn_primary), androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(), FrostHunterSharedFlowOlympianDragon9650.FrostHunterLifecycleBlazeGammaElite2889, frostHunterDialogFragmentPhantomEclipse80683, ((i4 >> 3) & 14) | 1572912);
                FrostHunterCombineBlazeLegendGamma9228 FrostHunterCameraXPixelTurboCosmos98142 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814(frostHunterAnimatorRoguePulse27232, 28.0f, 2);
                FrostHunterProfilerPixelEliteElite8399 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterBannerAdBlazeSolarThunder2938.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterBindingAdapterVisionNovaXNeo5053(8.0f, new FrostHunterLaunchEclipseAurora4535(i10)), FrostHunterRewardedAdHyperStrike1151.FrostHunterTextViewDragonStormMega4297, frostHunterDialogFragmentPhantomEclipse80683, 54);
                int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80683.FrostHunterNavigationMasterMegaMax2752);
                FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterFragmentBetaMegaVortex6025();
                FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80683, FrostHunterCameraXPixelTurboCosmos98142);
                frostHunterDialogFragmentPhantomEclipse80683.FrostHunterAnnotationProcessorSparkEclipse8710();
                if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPagingSourceEclipseDelta8255) {
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
                } else {
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterImageAnalysisGammaOlympian2400();
                }
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterAlphaAnimationNeoCosmos57613);
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60253);
                if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80683.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse80683, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24513);
                }
                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80683, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94632);
                if (str2 != null) {
                    frostHunterDialogFragmentPhantomEclipse80683.FrostHunterPushNotificationStormTitanGamma8999(-427165279);
                    i5 = 2;
                    z3 = false;
                    frostHunterAnimatorRoguePulse2723 = frostHunterAnimatorRoguePulse27232;
                    f5 = 58.0f;
                    f6 = 280.0f;
                    FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str2, null, FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(17), 0L, null, 0L, 0, false, 0, 0, null, frostHunterDialogFragmentPhantomEclipse80683, 3462, 131058);
                    frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse80683;
                } else {
                    frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse80683;
                    frostHunterAnimatorRoguePulse2723 = frostHunterAnimatorRoguePulse27232;
                    z3 = false;
                    i5 = 2;
                    f5 = 58.0f;
                    f6 = 280.0f;
                    frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPushNotificationStormTitanGamma8999(-429817298);
                }
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(z3);
                FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80684 = frostHunterDialogFragmentPhantomEclipse80682;
                FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterCameraXPixelTurboCosmos9814, FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, z4 ? FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(18) : FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(16), null, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(i5), 0L, null, 16777084), frostHunterDialogFragmentPhantomEclipse80684, i4 & 14, 65534);
                frostHunterDialogFragmentPhantomEclipse80683 = frostHunterDialogFragmentPhantomEclipse80684;
                frostHunterDialogFragmentPhantomEclipse80683.FrostHunterLintTitanVortexQuantum9911(true);
                frostHunterDialogFragmentPhantomEclipse80683.FrostHunterLintTitanVortexQuantum9911(true);
                z2 = z4;
                frostHunterCombineBlazeLegendGamma92282 = frostHunterAnimatorRoguePulse2723;
                f3 = f5;
                f4 = f6;
            }
            FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterResourcesTitanHyperVision5823();
            if (FrostHunterResourcesTitanHyperVision5823 == null) {
                FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574() { // from class: android.content.Context.FrostHunterRemoteModelManagerEpicHyperFusion4215
                    @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                    public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, frostHunterNotificationGammaBlazePhoenix7595, frostHunterCombineBlazeLegendGamma92282, str2, z2, f3, f4, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(i | 1), i2);
                        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i4 = i7 | 14155776;
        int i92 = 1;
        int i102 = 0;
        if (frostHunterDialogFragmentPhantomEclipse80683.FrostHunterFCMDeltaQuantumHero8364(i4 & 1, (i4 & 4793491) == 4793490)) {
        }
        FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80683.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 == null) {
        }
    }

    public static FrostHunterFlatMapPrimeTitan4777 FrostHunterConstraintSetCloneOmegaHyperion9304(FrostHunterFirebaseModelInterpreterOlympianStorm9227 frostHunterFirebaseModelInterpreterOlympianStorm9227, int i) {
        frostHunterFirebaseModelInterpreterOlympianStorm9227.getClass();
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i2 = frostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterCameraXPixelTurboCosmos9814;
        int i3 = frostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterAlertDialogAuroraDelta3200 <= 0) {
            i = -i;
        }
        return new FrostHunterFlatMapPrimeTitan4777(i2, i3, i);
    }

    public static void FrostHunterDatabaseEliteShadowUltra2452(String str, Throwable th) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, th);
        }
    }

    public static Handler FrostHunterDialogFragmentTurboPhoenixDragon7627(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterAlphaAnimationNeoCosmos5761(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void FrostHunterEditTextPulseHyperion1262(String str) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, null);
        }
    }

    public static final FrostHunterCombineBlazeLegendGamma9228 FrostHunterFCMDeltaQuantumHero8364(FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228) {
        if (frostHunterCombineBlazeLegendGamma9228.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterManifestHyperTitanAlpha1411.FrostHunterLooperThreadBetaHyperionMax1000)) {
            return frostHunterCombineBlazeLegendGamma9228;
        }
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752(1219399079, null, 0, null);
        FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma92282 = (FrostHunterCombineBlazeLegendGamma9228) frostHunterCombineBlazeLegendGamma9228.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterMediaPlayerForcePrime6643(4, frostHunterDialogFragmentPhantomEclipse8068), FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        return frostHunterCombineBlazeLegendGamma92282;
    }

    public static double FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final int FrostHunterFlowMaxDragonHero5809(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final FrostHunterChipGroupThunderDragon5019 FrostHunterFragmentBetaMegaVortex6025(FrostHunterLinearLayoutInfernoStorm9299 frostHunterLinearLayoutInfernoStorm9299, float f, float f2, final FrostHunterBindingAdapterCelestialSolar9832 frostHunterBindingAdapterCelestialSolar9832, String str, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        final Float valueOf = Float.valueOf(f);
        final Float valueOf2 = Float.valueOf(f2);
        int i2 = (i & 1022) | 229376;
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        Object obj = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterMagnetometerFusionTitanium8202 == obj) {
            FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterChipGroupThunderDragon5019(frostHunterLinearLayoutInfernoStorm9299, valueOf, valueOf2, frostHunterBindingAdapterCelestialSolar9832);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
        }
        final FrostHunterChipGroupThunderDragon5019 frostHunterChipGroupThunderDragon5019 = (FrostHunterChipGroupThunderDragon5019) FrostHunterMagnetometerFusionTitanium8202;
        boolean FrostHunterCameraXPixelTurboCosmos98142 = ((((i2 & 112) ^ 48) > 32 && frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(valueOf)) || (i2 & 48) == 32) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterBindingAdapterCelestialSolar9832);
        Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium82022 == obj) {
            FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterNotificationGammaBlazePhoenix7595() { // from class: android.content.Context.FrostHunterConstraintSetCloneTurboLegendCosmos1414
                @Override // android.content.Context.FrostHunterNotificationGammaBlazePhoenix7595
                public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633() {
                    FrostHunterChipGroupThunderDragon5019 frostHunterChipGroupThunderDragon50192 = frostHunterChipGroupThunderDragon5019;
                    Float f3 = frostHunterChipGroupThunderDragon50192.FrostHunterCameraXPixelTurboCosmos9814;
                    Float f4 = valueOf;
                    boolean equals = f4.equals(f3);
                    Float f5 = valueOf2;
                    if (!equals || !f5.equals(frostHunterChipGroupThunderDragon50192.FrostHunterFlowMaxDragonHero5809)) {
                        frostHunterChipGroupThunderDragon50192.FrostHunterCameraXPixelTurboCosmos9814 = f4;
                        frostHunterChipGroupThunderDragon50192.FrostHunterFlowMaxDragonHero5809 = f5;
                        frostHunterChipGroupThunderDragon50192.FrostHunterKeyframeGammaGamma1197 = new FrostHunterLocationManagerTurboCyber7169(frostHunterBindingAdapterCelestialSolar9832, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterKeyframeGammaGamma1197, f4, f5, null);
                        frostHunterChipGroupThunderDragon50192.FrostHunterScaleAnimationStrikeSpark5059.FrostHunterConstraintSetCloneMasterUltraRogue2633.setValue(Boolean.TRUE);
                        frostHunterChipGroupThunderDragon50192.FrostHunterFragmentBetaMegaVortex6025 = false;
                        frostHunterChipGroupThunderDragon50192.FrostHunterServiceConnectionTurboPhoenixOmega6719 = true;
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809((FrostHunterNotificationGammaBlazePhoenix7595) FrostHunterMagnetometerFusionTitanium82022, frostHunterDialogFragmentPhantomEclipse8068);
        boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterLinearLayoutInfernoStorm9299);
        Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterCameraXPixelTurboCosmos98143 || FrostHunterMagnetometerFusionTitanium82023 == obj) {
            FrostHunterMagnetometerFusionTitanium82023 = new FrostHunterMapLegendNova8356(9, frostHunterLinearLayoutInfernoStorm9299, frostHunterChipGroupThunderDragon5019);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82023);
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterServiceEliteCelestialThunder1757(frostHunterChipGroupThunderDragon5019, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82023, frostHunterDialogFragmentPhantomEclipse8068);
        return frostHunterChipGroupThunderDragon5019;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FrostHunterLifecycleCameraControllerStormAlpha3266 FrostHunterKeyframeGammaGamma1197(FrostHunterVibratorSpeedMaxGamma2878 frostHunterVibratorSpeedMaxGamma2878, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterScaleAnimationPixelAuroraCosmos5985 frostHunterScaleAnimationPixelAuroraCosmos5985;
        int i;
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
        String str;
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike76582;
        FrostHunterVibratorSpeedMaxGamma2878 frostHunterVibratorSpeedMaxGamma28782;
        FrostHunterOnItemClickListenerNovaXMax7890 frostHunterOnItemClickListenerNovaXMax7890;
        if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterScaleAnimationPixelAuroraCosmos5985) {
            frostHunterScaleAnimationPixelAuroraCosmos5985 = (FrostHunterScaleAnimationPixelAuroraCosmos5985) frostHunterViewBindingCelestialVortex7351;
            int i2 = frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterFragmentBetaMegaVortex6025;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterFragmentBetaMegaVortex6025 = i2 - Integer.MIN_VALUE;
                Object obj = frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterKeyframeGammaGamma1197;
                i = frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterFragmentBetaMegaVortex6025;
                FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike76583 = null;
                if (i != 0) {
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = new FrostHunterOnItemLongClickListenerRogueDeltaStrike7658();
                    frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterLooperHyperionForce4133(frostHunterVibratorSpeedMaxGamma2878.FrostHunterAlphaAnimationNeoCosmos5761);
                    str = frostHunterVibratorSpeedMaxGamma2878.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    frostHunterOnItemLongClickListenerRogueDeltaStrike76582 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
                } else {
                    if (i != 1) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = (FrostHunterBarrierStrikeDragonOlympian9836) obj;
                    if (frostHunterBarrierStrikeDragonOlympian9836 != null) {
                        int i3 = FrostHunterOnItemClickListenerNovaXMax7890.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterOnItemClickListenerNovaXMax7890 = new FrostHunterOnItemClickListenerNovaXMax7890(frostHunterBarrierStrikeDragonOlympian9836);
                        frostHunterVibratorSpeedMaxGamma28782 = null;
                        frostHunterOnItemLongClickListenerRogueDeltaStrike76582 = null;
                        str = null;
                        frostHunterOnItemLongClickListenerRogueDeltaStrike76583.FrostHunterBitmapTurboDeltaNebula8743(str, frostHunterOnItemClickListenerNovaXMax7890);
                        FrostHunterOnDeviceTranslatorUltraQuantum2312 frostHunterOnDeviceTranslatorUltraQuantum2312 = frostHunterVibratorSpeedMaxGamma28782.FrostHunterBundlePulseFusionHero2475;
                        ArrayList arrayList = new ArrayList(20);
                        for (Map.Entry entry : frostHunterOnDeviceTranslatorUltraQuantum2312.FrostHunterAlphaAnimationNeoCosmos5761.entrySet()) {
                            String str2 = (String) entry.getKey();
                            for (String str3 : (List) entry.getValue()) {
                                str2.getClass();
                                str3.getClass();
                                FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterLifecycleBlazeGammaElite2889(str2);
                                arrayList.add(str2);
                                arrayList.add(FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterR8MasterNebulaSpark7247(str3).toString());
                            }
                        }
                        FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian7298 = new FrostHunterColorStateListInflaterHeroEclipseOlympian7298((String[]) arrayList.toArray(new String[0]));
                        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.getClass();
                        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200 = frostHunterColorStateListInflaterHeroEclipseOlympian7298.FrostHunterServiceEliteCelestialThunder1757();
                        return new FrostHunterLifecycleCameraControllerStormAlpha3266(frostHunterOnItemLongClickListenerRogueDeltaStrike76582);
                    }
                    frostHunterVibratorSpeedMaxGamma2878 = null;
                    frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = null;
                    frostHunterOnItemLongClickListenerRogueDeltaStrike76582 = null;
                    str = null;
                }
                FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike76584 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
                frostHunterVibratorSpeedMaxGamma28782 = frostHunterVibratorSpeedMaxGamma2878;
                frostHunterOnItemClickListenerNovaXMax7890 = null;
                frostHunterOnItemLongClickListenerRogueDeltaStrike76583 = frostHunterOnItemLongClickListenerRogueDeltaStrike76584;
                frostHunterOnItemLongClickListenerRogueDeltaStrike76583.FrostHunterBitmapTurboDeltaNebula8743(str, frostHunterOnItemClickListenerNovaXMax7890);
                FrostHunterOnDeviceTranslatorUltraQuantum2312 frostHunterOnDeviceTranslatorUltraQuantum23122 = frostHunterVibratorSpeedMaxGamma28782.FrostHunterBundlePulseFusionHero2475;
                ArrayList arrayList2 = new ArrayList(20);
                while (r5.hasNext()) {
                }
                FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian72982 = new FrostHunterColorStateListInflaterHeroEclipseOlympian7298((String[]) arrayList2.toArray(new String[0]));
                frostHunterOnItemLongClickListenerRogueDeltaStrike76582.getClass();
                frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200 = frostHunterColorStateListInflaterHeroEclipseOlympian72982.FrostHunterServiceEliteCelestialThunder1757();
                return new FrostHunterLifecycleCameraControllerStormAlpha3266(frostHunterOnItemLongClickListenerRogueDeltaStrike76582);
            }
        }
        frostHunterScaleAnimationPixelAuroraCosmos5985 = new FrostHunterScaleAnimationPixelAuroraCosmos5985(frostHunterViewBindingCelestialVortex7351);
        Object obj2 = frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterKeyframeGammaGamma1197;
        i = frostHunterScaleAnimationPixelAuroraCosmos5985.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike765832 = null;
        if (i != 0) {
        }
        FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike765842 = frostHunterOnItemLongClickListenerRogueDeltaStrike7658;
        frostHunterVibratorSpeedMaxGamma28782 = frostHunterVibratorSpeedMaxGamma2878;
        frostHunterOnItemClickListenerNovaXMax7890 = null;
        frostHunterOnItemLongClickListenerRogueDeltaStrike765832 = frostHunterOnItemLongClickListenerRogueDeltaStrike765842;
        frostHunterOnItemLongClickListenerRogueDeltaStrike765832.FrostHunterBitmapTurboDeltaNebula8743(str, frostHunterOnItemClickListenerNovaXMax7890);
        FrostHunterOnDeviceTranslatorUltraQuantum2312 frostHunterOnDeviceTranslatorUltraQuantum231222 = frostHunterVibratorSpeedMaxGamma28782.FrostHunterBundlePulseFusionHero2475;
        ArrayList arrayList22 = new ArrayList(20);
        while (r5.hasNext()) {
        }
        FrostHunterColorStateListInflaterHeroEclipseOlympian7298 frostHunterColorStateListInflaterHeroEclipseOlympian729822 = new FrostHunterColorStateListInflaterHeroEclipseOlympian7298((String[]) arrayList22.toArray(new String[0]));
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.getClass();
        frostHunterOnItemLongClickListenerRogueDeltaStrike76582.FrostHunterAlertDialogAuroraDelta3200 = frostHunterColorStateListInflaterHeroEclipseOlympian729822.FrostHunterServiceEliteCelestialThunder1757();
        return new FrostHunterLifecycleCameraControllerStormAlpha3266(frostHunterOnItemLongClickListenerRogueDeltaStrike76582);
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(String str, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, long j, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma92282;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-675842713);
        int i2 = i | 48;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterBroadcastFusionCosmos6323 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterFragmentManagerFusionNovaDragon6284 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterLightSensorForceFusion4241, j, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(11), null, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(3), 0L, null, 16777084);
            FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, FrostHunterAlphaAnimationNeoCosmos57612, 518143), FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.12f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.35f), FrostHunterAlphaAnimationNeoCosmos57612), 12.0f, 6.0f), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterAlphaAnimationNeoCosmos57613, frostHunterDialogFragmentPhantomEclipse8068, 6, 65532);
            frostHunterCombineBlazeLegendGamma92282 = frostHunterAnimatorRoguePulse2723;
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
            frostHunterCombineBlazeLegendGamma92282 = frostHunterCombineBlazeLegendGamma9228;
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterAlertDialogMaxSparkTitanium8740(str, frostHunterCombineBlazeLegendGamma92282, j, i, 3);
        }
    }

    public static final FrostHunterFocusMeteringActionBetaShadowTurbo7112 FrostHunterLifecycleBlazeGammaElite2889(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new FrostHunterFocusMeteringActionBetaShadowTurbo7112(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static boolean FrostHunterLightSensorForceFusion4241(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static float FrostHunterLintTitanVortexQuantum9911(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final Exception FrostHunterLiveDataBetaLegend3442(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new FrostHunterOnDeviceTranslatorStormEliteSpeed9866(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static void FrostHunterLooperHyperionForce4133(FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        if (frostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterAlertDialogAuroraDelta3200(frostHunterCoroutineScopePrimeSpark1417)) {
            return;
        }
        try {
            frostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterBitmapTurboDeltaNebula8743(frostHunterCoroutineScopePrimeSpark1417, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static int FrostHunterLooperThreadBetaHyperionMax1000(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void FrostHunterMagnetometerFusionTitanium8202(String str) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterRewardedAdAlphaPhoenixVortex4789 frostHunterRewardedAdAlphaPhoenixVortex4789) {
        frostHunterRewardedAdAlphaPhoenixVortex4789.getClass();
        Class FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterRewardedAdAlphaPhoenixVortex4789.FrostHunterAlphaAnimationNeoCosmos5761();
        if (FrostHunterAlphaAnimationNeoCosmos57612.isPrimitive()) {
            String name = FrostHunterAlphaAnimationNeoCosmos57612.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return FrostHunterAlphaAnimationNeoCosmos57612;
    }

    public static void FrostHunterMeteringPointBetaCyber9571(String str) {
        synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
            FrostHunterServiceConnectionTurboPhoenixOmega6719(str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FrostHunterServiceInfoTitaniumPrimeCyber9213 FrostHunterMeteringPointMegaCyber7955(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        boolean z = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000;
        if (z) {
            if (!z) {
                FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("visitChildren called on an unattached node");
            }
            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            if (frostHunterGradientDrawablePulseDragonInferno96372 == null) {
                FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno9637);
            } else {
                frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96372);
            }
            loop0: while (true) {
                int i = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200;
                if (i == 0) {
                    break;
                }
                FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96373 = (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i - 1);
                if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterKeyframeGammaGamma1197 & 1024) == 0) {
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterObjectAnimatorNeoStrike7090, frostHunterGradientDrawablePulseDragonInferno96373);
                } else {
                    while (true) {
                        if (frostHunterGradientDrawablePulseDragonInferno96373 == null) {
                            break;
                        }
                        if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                            FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike70902 = null;
                            while (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                                if (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterServiceInfoTitaniumPrimeCyber9213) {
                                    FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber92132 = (FrostHunterServiceInfoTitaniumPrimeCyber9213) frostHunterGradientDrawablePulseDragonInferno96373;
                                    if (frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                                        int ordinal = frostHunterServiceInfoTitaniumPrimeCyber92132.FrostHunterBannerAdNebulaMasterBeta4389().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                            return null;
                                        }
                                    }
                                } else if ((frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0 && (frostHunterGradientDrawablePulseDragonInferno96373 instanceof FrostHunterToolbarVortexMaster1971)) {
                                    int i2 = 0;
                                    for (FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96374 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96373).FrostHunterBitmapTurboDeltaNebula8743; frostHunterGradientDrawablePulseDragonInferno96374 != null; frostHunterGradientDrawablePulseDragonInferno96374 = frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterServiceConnectionTurboPhoenixOmega6719) {
                                        if ((frostHunterGradientDrawablePulseDragonInferno96374.FrostHunterAlertDialogAuroraDelta3200 & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96374;
                                            } else {
                                                if (frostHunterObjectAnimatorNeoStrike70902 == null) {
                                                    frostHunterObjectAnimatorNeoStrike70902 = new FrostHunterObjectAnimatorNeoStrike7090(new FrostHunterGradientDrawablePulseDragonInferno9637[16]);
                                                }
                                                if (frostHunterGradientDrawablePulseDragonInferno96373 != null) {
                                                    frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96373);
                                                    frostHunterGradientDrawablePulseDragonInferno96373 = null;
                                                }
                                                frostHunterObjectAnimatorNeoStrike70902.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterGradientDrawablePulseDragonInferno96374);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                frostHunterGradientDrawablePulseDragonInferno96373 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterScaleAnimationStrikeSpark5059(frostHunterObjectAnimatorNeoStrike70902);
                            }
                        } else {
                            frostHunterGradientDrawablePulseDragonInferno96373 = frostHunterGradientDrawablePulseDragonInferno96373.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int FrostHunterMotionSceneAuroraMega2271(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void FrostHunterNavigationMasterMegaMax2752(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static final boolean FrostHunterPagingDataTurboTitanium7332(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392;
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha85982 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterScaleAnimationStrikeSpark5059;
        return (frostHunterVectorDrawableMaxAlpha85982 == null || (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterVectorDrawableMaxAlpha85982.FrostHunterMotionSceneAuroraMega2271) == null || !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMediaPlayerCelestialBetaTitan3868() || (frostHunterVectorDrawableMaxAlpha8598 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterScaleAnimationStrikeSpark5059) == null || (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterVectorDrawableMaxAlpha8598.FrostHunterMotionSceneAuroraMega2271) == null || !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterBillingClientFusionVortex9008()) ? false : true;
    }

    public static void FrostHunterPagingSourceEclipseDelta8255(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + max;
            i2++;
            i6++;
        }
    }

    public static void FrostHunterPermissionInfoAlphaDelta6279(FrostHunterCoroutineScopeSolarTitan6330 frostHunterCoroutineScopeSolarTitan6330, int i, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        long FrostHunterFlowMaxDragonHero58092 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(i);
        List FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterFlowMaxDragonHero58092);
        if (FrostHunterServiceConnectionTurboPhoenixOmega67192.isEmpty()) {
            return;
        }
        if (i == frostHunterCoroutineScopeSolarTitan6330.FrostHunterScaleAnimationStrikeSpark5059() - 1) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
            return;
        }
        long FrostHunterFlowMaxDragonHero58093 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(i + 1) - frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(i);
        if (FrostHunterFlowMaxDragonHero58093 > 0) {
            frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(FrostHunterFlowMaxDragonHero58092, FrostHunterFlowMaxDragonHero58093, FrostHunterServiceConnectionTurboPhoenixOmega67192));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void FrostHunterPreviewBlazeAurora1020(FrostHunterCoroutineScopeSolarTitan6330 frostHunterCoroutineScopeSolarTitan6330, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        int FrostHunterConstraintSetCloneMasterUltraRogue26332;
        boolean z;
        int i;
        long j = frostHunterLaunchGammaTitanium8407.FrostHunterAlphaAnimationNeoCosmos5761;
        if (j == -9223372036854775807L) {
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = 0;
        } else {
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterConstraintSetCloneMasterUltraRogue2633(j);
            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == -1) {
                FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterScaleAnimationStrikeSpark5059();
            }
            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 > 0 && frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue26332 - 1) == j) {
                FrostHunterConstraintSetCloneMasterUltraRogue26332--;
            }
        }
        if (j != -9223372036854775807L && FrostHunterConstraintSetCloneMasterUltraRogue26332 < frostHunterCoroutineScopeSolarTitan6330.FrostHunterScaleAnimationStrikeSpark5059()) {
            List FrostHunterServiceConnectionTurboPhoenixOmega67192 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterServiceConnectionTurboPhoenixOmega6719(j);
            long FrostHunterFlowMaxDragonHero58092 = frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue26332);
            if (!FrostHunterServiceConnectionTurboPhoenixOmega67192.isEmpty()) {
                long j2 = frostHunterLaunchGammaTitanium8407.FrostHunterAlphaAnimationNeoCosmos5761;
                if (j2 < FrostHunterFlowMaxDragonHero58092) {
                    frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(j2, FrostHunterFlowMaxDragonHero58092 - j2, FrostHunterServiceConnectionTurboPhoenixOmega67192));
                    z = true;
                    for (i = FrostHunterConstraintSetCloneMasterUltraRogue26332; i < frostHunterCoroutineScopeSolarTitan6330.FrostHunterScaleAnimationStrikeSpark5059(); i++) {
                        FrostHunterPermissionInfoAlphaDelta6279(frostHunterCoroutineScopeSolarTitan6330, i, frostHunterLayoutInflaterNebulaVision6522);
                    }
                    if (frostHunterLaunchGammaTitanium8407.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        return;
                    }
                    if (z) {
                        FrostHunterConstraintSetCloneMasterUltraRogue26332--;
                    }
                    for (int i2 = 0; i2 < FrostHunterConstraintSetCloneMasterUltraRogue26332; i2++) {
                        FrostHunterPermissionInfoAlphaDelta6279(frostHunterCoroutineScopeSolarTitan6330, i2, frostHunterLayoutInflaterNebulaVision6522);
                    }
                    if (z) {
                        frostHunterLayoutInflaterNebulaVision6522.accept(new FrostHunterWindowManagerInfernoOlympianVortex6395(frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue26332), j - frostHunterCoroutineScopeSolarTitan6330.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue26332), frostHunterCoroutineScopeSolarTitan6330.FrostHunterServiceConnectionTurboPhoenixOmega6719(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < frostHunterCoroutineScopeSolarTitan6330.FrostHunterScaleAnimationStrikeSpark5059()) {
        }
        if (frostHunterLaunchGammaTitanium8407.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
        }
    }

    public static final void FrostHunterPushNotificationStormTitanGamma8999(FrostHunterMenuUltraHyperion3040 frostHunterMenuUltraHyperion3040, FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterRemoteConfigSpeedSpeed8566);
        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
            FrostHunterRemoteConfigSpeedSpeed85662 = null;
        }
        if (FrostHunterRemoteConfigSpeedSpeed85662 != null) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
            return;
        }
        FrostHunterSharedElementSpectraNeo2511 FrostHunterFragmentBetaMegaVortex60252 = frostHunterSharedElementSpectraNeo2511.FrostHunterFragmentBetaMegaVortex6025();
        if (FrostHunterFragmentBetaMegaVortex60252 == null) {
            return;
        }
        Object FrostHunterRemoteConfigSpeedSpeed85663 = FrostHunterFragmentBetaMegaVortex60252.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLifecycleBlazeGammaElite2889);
        if (FrostHunterRemoteConfigSpeedSpeed85663 == null) {
            FrostHunterRemoteConfigSpeedSpeed85663 = null;
        }
        if (FrostHunterRemoteConfigSpeedSpeed85663 != null) {
            Object FrostHunterRemoteConfigSpeedSpeed85664 = FrostHunterFragmentBetaMegaVortex60252.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLevelListDrawableFusionDragonHero2232);
            if ((FrostHunterRemoteConfigSpeedSpeed85664 != null ? FrostHunterRemoteConfigSpeedSpeed85664 : null) != null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            }
            if (frostHunterSharedElementSpectraNeo2511.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634)) {
                ArrayList arrayList = new ArrayList();
                List FrostHunterAlertDialogAuroraDelta32002 = FrostHunterSharedElementSpectraNeo2511.FrostHunterAlertDialogAuroraDelta3200(4, FrostHunterFragmentBetaMegaVortex60252);
                int size = FrostHunterAlertDialogAuroraDelta32002.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112 = (FrostHunterSharedElementSpectraNeo2511) FrostHunterAlertDialogAuroraDelta32002.get(i2);
                    if (frostHunterSharedElementSpectraNeo25112.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634)) {
                        arrayList.add(frostHunterSharedElementSpectraNeo25112);
                        if (frostHunterSharedElementSpectraNeo25112.FrostHunterBundlePulseFusionHero2475.FrostHunterLooperThreadBetaHyperionMax1000() < frostHunterSharedElementSpectraNeo2511.FrostHunterBundlePulseFusionHero2475.FrostHunterLooperThreadBetaHyperionMax1000()) {
                            i++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean FrostHunterScaleAnimationStrikeSpark50592 = FrostHunterScaleAnimationStrikeSpark5059(arrayList);
                int i3 = FrostHunterScaleAnimationStrikeSpark50592 ? 0 : i;
                int i4 = FrostHunterScaleAnimationStrikeSpark50592 ? i : 0;
                Object FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterSharedElementSpectraNeo2511.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634);
                if (FrostHunterRemoteConfigSpeedSpeed85665 == null) {
                    FrostHunterRemoteConfigSpeedSpeed85665 = Boolean.FALSE;
                }
                frostHunterMenuUltraHyperion3040.FrostHunterAlphaAnimationNeoCosmos5761.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) FrostHunterRemoteConfigSpeedSpeed85665).booleanValue()));
            }
        }
    }

    public static final boolean FrostHunterR8MasterNebulaSpark7247(FrostHunterFocusMeteringActionBetaShadowTurbo7112 frostHunterFocusMeteringActionBetaShadowTurbo7112) {
        long j = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLifecycleBlazeGammaElite2889;
        return (j >>> 32) == (4294967295L & j) && j == frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLevelListDrawableFusionDragonHero2232 && j == frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterRemoteConfigSpeedSpeed8566 && j == frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static float FrostHunterRemoteConfigSpeedSpeed8566(EdgeEffect edgeEffect, float f, float f2, FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562) {
        float f3 = FrostHunterFragmentTransactionRogueRogue7576.FrostHunterAlphaAnimationNeoCosmos5761;
        double FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterConstraintSetCloneMasterUltraRogue2633() * 386.0878f * 160.0f * 0.84f;
        double d = FrostHunterFragmentTransactionRogueRogue7576.FrostHunterAlphaAnimationNeoCosmos5761 * FrostHunterConstraintSetCloneMasterUltraRogue26332;
        float exp = (float) (Math.exp((FrostHunterFragmentTransactionRogueRogue7576.FrostHunterConstraintSetCloneMasterUltraRogue2633 / FrostHunterFragmentTransactionRogueRogue7576.FrostHunterBundlePulseFusionHero2475) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? FrostHunterThreadSolarEpicInferno6752.FrostHunterConstraintSetCloneMasterUltraRogue2633(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int FrostHunterColorStateListInflaterNovaQuantum4229 = FrostHunterCardViewHyperionAurora3829.FrostHunterColorStateListInflaterNovaQuantum4229(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(FrostHunterColorStateListInflaterNovaQuantum4229);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(FrostHunterColorStateListInflaterNovaQuantum4229);
        }
        return f;
    }

    public static void FrostHunterRemoteConfigThunderShadow4435(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static long FrostHunterResourcesTitanHyperVision5823(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463(FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(439770924);
        FrostHunterCombineBlazeLegendGamma9228 FrostHunterFCMDeltaQuantumHero8364 = FrostHunterFCMDeltaQuantumHero8364(frostHunterDialogFragmentPhantomEclipse8068, frostHunterCombineBlazeLegendGamma9228);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        return FrostHunterFCMDeltaQuantumHero8364;
    }

    public static final FrostHunterLinearLayoutInfernoStorm9299 FrostHunterRewardedAdSpectraElite8288(String str, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterLinearLayoutInfernoStorm9299();
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
        }
        FrostHunterLinearLayoutInfernoStorm9299 frostHunterLinearLayoutInfernoStorm9299 = (FrostHunterLinearLayoutInfernoStorm9299) FrostHunterMagnetometerFusionTitanium8202;
        frostHunterLinearLayoutInfernoStorm9299.FrostHunterAlphaAnimationNeoCosmos5761(0, frostHunterDialogFragmentPhantomEclipse8068);
        return frostHunterLinearLayoutInfernoStorm9299;
    }

    public static FrostHunterFirebaseModelInterpreterOlympianStorm9227 FrostHunterRunnableCosmosCelestial4235(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new FrostHunterFirebaseModelInterpreterOlympianStorm9227(i, i2 - 1, 1);
        }
        FrostHunterFirebaseModelInterpreterOlympianStorm9227 frostHunterFirebaseModelInterpreterOlympianStorm9227 = FrostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterKeyframeGammaGamma1197;
        return FrostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterKeyframeGammaGamma1197;
    }

    public static final boolean FrostHunterScaleAnimationStrikeSpark5059(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = (FrostHunterSharedElementSpectraNeo2511) obj2;
                    FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112 = (FrostHunterSharedElementSpectraNeo2511) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (frostHunterSharedElementSpectraNeo25112.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterAlphaAnimationNeoCosmos5761() >> 32)) - Float.intBitsToFloat((int) (frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterAlphaAnimationNeoCosmos5761() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (frostHunterSharedElementSpectraNeo25112.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterAlphaAnimationNeoCosmos5761() & 4294967295L)) - Float.intBitsToFloat((int) (frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterAlphaAnimationNeoCosmos5761() & 4294967295L)));
                    arrayList2.add(new FrostHunterFirebaseVortexDeltaBlaze8413((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((FrostHunterFirebaseVortexDeltaBlaze8413) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterNavigationViewMasterVortexBeta1295(list)).FrostHunterAlphaAnimationNeoCosmos5761;
            } else {
                if (list.isEmpty()) {
                    FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterConstraintSetCloneMasterUltraRogue2633("Empty collection can't be reduced.");
                }
                Object FrostHunterNavigationViewMasterVortexBeta1295 = FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterNavigationViewMasterVortexBeta1295(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        FrostHunterNavigationViewMasterVortexBeta1295 = new FrostHunterFirebaseVortexDeltaBlaze8413(FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterLifecycleBlazeGammaElite2889(((FrostHunterFirebaseVortexDeltaBlaze8413) FrostHunterNavigationViewMasterVortexBeta1295).FrostHunterAlphaAnimationNeoCosmos5761, ((FrostHunterFirebaseVortexDeltaBlaze8413) list.get(i2)).FrostHunterAlphaAnimationNeoCosmos5761));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((FrostHunterFirebaseVortexDeltaBlaze8413) FrostHunterNavigationViewMasterVortexBeta1295).FrostHunterAlphaAnimationNeoCosmos5761;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void FrostHunterServiceConnectionTurboPhoenixOmega6719(String str, Throwable th) {
        String replace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (FrostHunterLevelListDrawableFusionDragonHero2232) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } finally {
                    }
                }
            }
            str2 = replace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static final FrostHunterZoomStateTurboEpicEpic2510 FrostHunterServiceEliteCelestialThunder1757(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new FrostHunterZoomStateTurboEpicEpic2510(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterRemoteModelManagerPrimeStrikePrime5960 frostHunterRemoteModelManagerPrimeStrikePrime5960, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        try {
            IOException iOException = null;
            for (FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark14172 : frostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterKeyframeGammaGamma1197(frostHunterCoroutineScopePrimeSpark1417)) {
                try {
                    if (frostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterFragmentBetaMegaVortex6025(frostHunterCoroutineScopePrimeSpark14172).FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                        FrostHunterServiceInfoHyperionSparkMax9966(frostHunterRemoteModelManagerPrimeStrikePrime5960, frostHunterCoroutineScopePrimeSpark14172);
                    }
                    frostHunterRemoteModelManagerPrimeStrikePrime5960.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCoroutineScopePrimeSpark14172);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int FrostHunterSoundPoolNovaTitanTitan5784(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final void FrostHunterStateCelestialNovaPixel8414(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615, Throwable th) {
        if (th instanceof FrostHunterBindingAdapterPhantomMega6235) {
            th = ((FrostHunterBindingAdapterPhantomMega6235) th).FrostHunterCameraXPixelTurboCosmos9814;
        }
        try {
            FrostHunterWithContextAlphaStorm5781 frostHunterWithContextAlphaStorm5781 = (FrostHunterWithContextAlphaStorm5781) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterDialogFragmentTurboPhoenixDragon7627);
            if (frostHunterWithContextAlphaStorm5781 != null) {
                frostHunterWithContextAlphaStorm5781.FrostHunterMeteringPointBetaCyber9571(frostHunterCountDownTimerRogueTitan5615, th);
            } else {
                FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterMotionSceneAuroraMega2271(frostHunterCountDownTimerRogueTitan5615, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(runtimeException, th);
                th = runtimeException;
            }
            FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterMotionSceneAuroraMega2271(frostHunterCountDownTimerRogueTitan5615, th);
        }
    }

    public static Comparable FrostHunterTextViewDragonStormMega4297(Float f, FrostHunterConstraintSetHyperionNova2613 frostHunterConstraintSetHyperionNova2613) {
        float f2 = frostHunterConstraintSetHyperionNova2613.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        float f3 = frostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761;
        if (f3 <= f2) {
            return (!FrostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761(f, Float.valueOf(f3)) || FrostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761(Float.valueOf(f3), f)) ? (!FrostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761(Float.valueOf(f2), f) || FrostHunterConstraintSetHyperionNova2613.FrostHunterAlphaAnimationNeoCosmos5761(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + frostHunterConstraintSetHyperionNova2613 + '.');
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrostHunterTransitionListenerPulseVortexCosmos7949(ViewStructure viewStructure, FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, AutofillId autofillId, String str, FrostHunterTimerCosmosBlaze6992 frostHunterTimerCosmosBlaze6992) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        FrostHunterActivityFusionDelta7273 frostHunterActivityFusionDelta7273;
        FrostHunterPoseDetectionThunderCosmos3414 frostHunterPoseDetectionThunderCosmos3414;
        FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite4081;
        FrostHunterPoseDetectionSolarTurboPhoenix3644 frostHunterPoseDetectionSolarTurboPhoenix3644;
        boolean z;
        FrostHunterCoroutineEpicQuantum9819 frostHunterCoroutineEpicQuantum9819;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        String[] FrostHunterDatabaseEliteShadowUltra2452;
        boolean z3;
        boolean z4;
        boolean z5;
        AutofillValue forText;
        String FrostHunterFlowMaxDragonHero58092;
        String[] FrostHunterDatabaseEliteShadowUltra24522;
        String[] FrostHunterDatabaseEliteShadowUltra24523;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275;
        int i2;
        int i3;
        int i4;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22752;
        FrostHunterActivityFusionDelta7273 frostHunterActivityFusionDelta72732;
        FrostHunterPoseDetectionThunderCosmos3414 frostHunterPoseDetectionThunderCosmos34142;
        FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite40812;
        Integer num3 = 1;
        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98822 = FrostHunterDialogVortexNeoUltra2659.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega2271 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMotionSceneAuroraMega2271();
        int i5 = 8;
        if (FrostHunterMotionSceneAuroraMega2271 == null || (frostHunterToastHyperTitanThunder22752 = FrostHunterMotionSceneAuroraMega2271.FrostHunterCameraXPixelTurboCosmos9814) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            frostHunterActivityFusionDelta7273 = null;
            frostHunterPoseDetectionThunderCosmos3414 = null;
            frostHunterSnackbarHyperionMaxElite4081 = null;
            frostHunterPoseDetectionSolarTurboPhoenix3644 = null;
            z = false;
            frostHunterCoroutineEpicQuantum9819 = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr = frostHunterToastHyperTitanThunder22752.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Object[] objArr2 = frostHunterToastHyperTitanThunder22752.FrostHunterBundlePulseFusionHero2475;
            long[] jArr = frostHunterToastHyperTitanThunder22752.FrostHunterAlphaAnimationNeoCosmos5761;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                int i6 = 0;
                frostHunterPoseDetectionSolarTurboPhoenix3644 = null;
                z = false;
                frostHunterActivityFusionDelta72732 = null;
                frostHunterCoroutineEpicQuantum9819 = null;
                bool = null;
                frostHunterPoseDetectionThunderCosmos34142 = null;
                z2 = false;
                num = null;
                frostHunterSnackbarHyperionMaxElite40812 = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i6];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98823 = (FrostHunterLiveDataScopeMaxSpark9882) obj;
                                if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterLintTitanVortexQuantum9911)) {
                                    obj2.getClass();
                                    frostHunterPoseDetectionSolarTurboPhoenix3644 = (FrostHunterPoseDetectionSolarTurboPhoenix3644) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterSharedElementPixelTitan2806((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
                                    obj2.getClass();
                                    frostHunterCoroutineEpicQuantum9819 = (FrostHunterCoroutineEpicQuantum9819) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452)) {
                                    obj2.getClass();
                                    frostHunterSnackbarHyperionMaxElite40812 = (FrostHunterSnackbarHyperionMaxElite4081) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterKeyframeGammaGamma1197)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterStateCelestialNovaPixel8414)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterBillingClientFusionVortex9008)) {
                                    z2 = true;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterMotionSceneAuroraMega2271)) {
                                    obj2.getClass();
                                    frostHunterPoseDetectionThunderCosmos34142 = (FrostHunterPoseDetectionThunderCosmos3414) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterBannerAdEliteStrike7333.FrostHunterMeteringPointMegaCyber7955)) {
                                    obj2.getClass();
                                    frostHunterActivityFusionDelta72732 = (FrostHunterActivityFusionDelta7273) obj2;
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterDialogVortexNeoUltra2659.FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                    viewStructure.setClickable(true);
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterDialogVortexNeoUltra2659.FrostHunterBundlePulseFusionHero2475)) {
                                    viewStructure.setLongClickable(true);
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterDialogVortexNeoUltra2659.FrostHunterTextViewDragonStormMega4297)) {
                                    viewStructure.setFocusable(true);
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98823, FrostHunterDialogVortexNeoUltra2659.FrostHunterFlowMaxDragonHero5809)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            } else {
                c = 7;
                j3 = -9187201950435737472L;
                frostHunterPoseDetectionSolarTurboPhoenix3644 = null;
                z = false;
                frostHunterActivityFusionDelta72732 = null;
                frostHunterCoroutineEpicQuantum9819 = null;
                bool = null;
                frostHunterPoseDetectionThunderCosmos34142 = null;
                z2 = false;
                num = null;
                frostHunterSnackbarHyperionMaxElite40812 = null;
            }
            frostHunterActivityFusionDelta7273 = frostHunterActivityFusionDelta72732;
            frostHunterPoseDetectionThunderCosmos3414 = frostHunterPoseDetectionThunderCosmos34142;
            frostHunterSnackbarHyperionMaxElite4081 = frostHunterSnackbarHyperionMaxElite40812;
        }
        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega22712 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMotionSceneAuroraMega2271();
        if (FrostHunterMotionSceneAuroraMega22712 != null && FrostHunterMotionSceneAuroraMega22712.FrostHunterAlertDialogAuroraDelta3200 && !FrostHunterMotionSceneAuroraMega22712.FrostHunterKeyframeGammaGamma1197) {
            FrostHunterMotionSceneAuroraMega22712 = FrostHunterMotionSceneAuroraMega22712.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterOrientationSensorPhoenixOmegaStorm9585 frostHunterOrientationSensorPhoenixOmegaStorm9585 = new FrostHunterOrientationSensorPhoenixOmegaStorm9585(((FrostHunterImageViewMegaEclipseNebula6569) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterServiceConnectionTurboPhoenixOmega6719()).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200);
            frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterServiceConnectionTurboPhoenixOmega6719());
            while (frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterCameraXPixelTurboCosmos9814()) {
                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterAlertDialogAuroraDelta3200(frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633 - 1);
                FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega22713 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterMotionSceneAuroraMega2271();
                if (FrostHunterMotionSceneAuroraMega22713 != null && !FrostHunterMotionSceneAuroraMega22713.FrostHunterAlertDialogAuroraDelta3200) {
                    FrostHunterMotionSceneAuroraMega22712.FrostHunterServiceEliteCelestialThunder1757(FrostHunterMotionSceneAuroraMega22713);
                    if (!FrostHunterMotionSceneAuroraMega22713.FrostHunterKeyframeGammaGamma1197) {
                        frostHunterOrientationSensorPhoenixOmegaStorm9585.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterServiceConnectionTurboPhoenixOmega6719());
                    }
                }
            }
        }
        if (FrostHunterMotionSceneAuroraMega22712 != null && (frostHunterToastHyperTitanThunder2275 = FrostHunterMotionSceneAuroraMega22712.FrostHunterCameraXPixelTurboCosmos9814) != null) {
            Object[] objArr3 = frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Object[] objArr4 = frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475;
            long[] jArr2 = frostHunterToastHyperTitanThunder2275.FrostHunterAlphaAnimationNeoCosmos5761;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i10];
                    num2 = num3;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j5 & j2) < j) {
                                int i13 = (i10 << 3) + i12;
                                Object obj3 = objArr3[i13];
                                Object obj4 = objArr4[i13];
                                i4 = i5;
                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98824 = (FrostHunterLiveDataScopeMaxSpark9882) obj3;
                                i3 = i12;
                                if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98824, FrostHunterBannerAdEliteStrike7333.FrostHunterFlowMaxDragonHero5809)) {
                                    viewStructure.setEnabled(false);
                                } else if (FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark98824, FrostHunterBannerAdEliteStrike7333.FrostHunterLooperHyperionForce4133)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i3 = i12;
                                i4 = i5;
                            }
                            j5 >>= i4;
                            i12 = i3 + 1;
                            i5 = i4;
                        }
                        i2 = i5;
                        if (i11 != i2) {
                            break;
                        }
                    } else {
                        i2 = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i2;
                    num3 = num2;
                }
                Integer valueOf2 = Integer.valueOf(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809);
                if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (frostHunterPoseDetectionSolarTurboPhoenix3644 == null && !z) ? frostHunterActivityFusionDelta7273 == null ? Integer.valueOf(i) : null : num2;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (frostHunterCoroutineEpicQuantum9819 != null && (FrostHunterDatabaseEliteShadowUltra24523 = FrostHunterPaintCyberPulse5979.FrostHunterDatabaseEliteShadowUltra2452(frostHunterCoroutineEpicQuantum9819)) != null) {
                    viewStructure.setAutofillHints(FrostHunterDatabaseEliteShadowUltra24523);
                }
                frostHunterTimerCosmosBlaze6992.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809, new FrostHunterResourcesPixelMaxShadow2755(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (frostHunterActivityFusionDelta7273 != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(frostHunterActivityFusionDelta7273 == FrostHunterActivityFusionDelta7273.FrostHunterCameraXPixelTurboCosmos9814);
                } else if (bool != null && (frostHunterPoseDetectionThunderCosmos3414 == null || frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                FrostHunterCoroutineEpicQuantum9819.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterPaintCyberPulse5979.FrostHunterDatabaseEliteShadowUltra2452(FrostHunterResourceMegaEclipseNova7715.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                FrostHunterDatabaseEliteShadowUltra2452.getClass();
                if (FrostHunterDatabaseEliteShadowUltra2452.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                String str2 = FrostHunterDatabaseEliteShadowUltra2452[0];
                if (frostHunterCoroutineEpicQuantum9819 == null || (FrostHunterDatabaseEliteShadowUltra24522 = FrostHunterPaintCyberPulse5979.FrostHunterDatabaseEliteShadowUltra2452(frostHunterCoroutineEpicQuantum9819)) == null) {
                    z3 = true;
                } else {
                    boolean FrostHunterSoundPoolNovaTitanTitan5784 = FrostHunterContextSolarMegaPhantom7469.FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterDatabaseEliteShadowUltra24522, str2);
                    z3 = true;
                    if (FrostHunterSoundPoolNovaTitanTitan5784) {
                        z4 = true;
                        z5 = (!z2 || z4) ? z3 : false;
                        if (z5) {
                            viewStructure.setDataIsSensitive(true);
                        }
                        viewStructure.setVisibility(((FrostHunterVectorDrawableMaxAlpha8598) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterCameraXPixelTurboCosmos9814).FrostHunterGyroscopeSpeedDragon2744() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i14 = 0; i14 < size; i14++) {
                                str3 = str3 + ((FrostHunterSnackbarHyperionMaxElite4081) list.get(i14)).FrostHunterFlowMaxDragonHero5809 + '\n';
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((FrostHunterImageViewMegaEclipseNebula6569) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterServiceConnectionTurboPhoenixOmega6719()).isEmpty() && frostHunterPoseDetectionThunderCosmos3414 != null && (FrostHunterFlowMaxDragonHero58092 = FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterFlowMaxDragonHero5809(frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761)) != null) {
                            viewStructure.setClassName(FrostHunterFlowMaxDragonHero58092);
                        }
                        if (z) {
                            return;
                        }
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (frostHunterSnackbarHyperionMaxElite4081 != null) {
                            forText = AutofillValue.forText(frostHunterSnackbarHyperionMaxElite4081.FrostHunterFlowMaxDragonHero5809);
                            viewStructure.setAutofillValue(forText);
                        }
                        if (z5) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                }
                z4 = false;
                if (z2) {
                }
                if (z5) {
                }
                viewStructure.setVisibility(((FrostHunterVectorDrawableMaxAlpha8598) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterCameraXPixelTurboCosmos9814).FrostHunterGyroscopeSpeedDragon2744() ? 4 : 0);
                if (list != null) {
                }
                if (((FrostHunterImageViewMegaEclipseNebula6569) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterServiceConnectionTurboPhoenixOmega6719()).isEmpty()) {
                    viewStructure.setClassName(FrostHunterFlowMaxDragonHero58092);
                }
                if (z) {
                }
            }
        }
        num2 = num3;
        list = null;
        Integer valueOf22 = Integer.valueOf(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809);
        if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (frostHunterPoseDetectionSolarTurboPhoenix3644 == null) {
            if (valueOf != null) {
            }
            if (frostHunterCoroutineEpicQuantum9819 != null) {
                viewStructure.setAutofillHints(FrostHunterDatabaseEliteShadowUltra24523);
            }
            frostHunterTimerCosmosBlaze6992.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809, new FrostHunterResourcesPixelMaxShadow2755(viewStructure));
            if (bool != null) {
            }
            if (frostHunterActivityFusionDelta7273 != null) {
            }
            FrostHunterCoroutineEpicQuantum9819.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterPaintCyberPulse5979.FrostHunterDatabaseEliteShadowUltra2452(FrostHunterResourceMegaEclipseNova7715.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            FrostHunterDatabaseEliteShadowUltra2452.getClass();
            if (FrostHunterDatabaseEliteShadowUltra2452.length == 0) {
            }
        }
        if (valueOf != null) {
        }
        if (frostHunterCoroutineEpicQuantum9819 != null) {
        }
        frostHunterTimerCosmosBlaze6992.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809, new FrostHunterResourcesPixelMaxShadow2755(viewStructure));
        if (bool != null) {
        }
        if (frostHunterActivityFusionDelta7273 != null) {
        }
        FrostHunterCoroutineEpicQuantum9819.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterPaintCyberPulse5979.FrostHunterDatabaseEliteShadowUltra2452(FrostHunterResourceMegaEclipseNova7715.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        FrostHunterDatabaseEliteShadowUltra2452.getClass();
        if (FrostHunterDatabaseEliteShadowUltra2452.length == 0) {
        }
    }

    public static final FrostHunterTransformCosmosTitanium2459 FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterTransformCosmosTitanium2459 frostHunterTransformCosmosTitanium2459) {
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterTransformCosmosTitanium2459.FrostHunterMotionSceneAuroraMega2271.FrostHunterMotionSceneAuroraMega2271;
        while (true) {
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterResourcesTitanHyperVision5823 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = null;
            if ((FrostHunterResourcesTitanHyperVision5823 != null ? FrostHunterResourcesTitanHyperVision5823.FrostHunterLightSensorForceFusion4241 : null) == null) {
                FrostHunterTransformCosmosTitanium2459 FrostHunterRecyclerViewBetaNovaX7224 = ((FrostHunterVectorDrawableMaxAlpha8598) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterCameraXPixelTurboCosmos9814).FrostHunterRecyclerViewBetaNovaX7224();
                FrostHunterRecyclerViewBetaNovaX7224.getClass();
                return FrostHunterRecyclerViewBetaNovaX7224;
            }
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterResourcesTitanHyperVision58232 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
            if (FrostHunterResourcesTitanHyperVision58232 != null) {
                frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = FrostHunterResourcesTitanHyperVision58232.FrostHunterLightSensorForceFusion4241;
            }
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.getClass();
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterResourcesTitanHyperVision58233 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
            FrostHunterResourcesTitanHyperVision58233.getClass();
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = FrostHunterResourcesTitanHyperVision58233.FrostHunterLightSensorForceFusion4241;
            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.getClass();
        }
    }

    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterViewPhantomNeo1634(FrostHunterServiceInfoTitaniumPrimeCyber9213 frostHunterServiceInfoTitaniumPrimeCyber9213) {
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598 = frostHunterServiceInfoTitaniumPrimeCyber9213.FrostHunterScaleAnimationStrikeSpark5059;
        return frostHunterVectorDrawableMaxAlpha8598 != null ? FrostHunterPaintCyberPulse5979.FrostHunterBitmapTurboDeltaNebula8743(frostHunterVectorDrawableMaxAlpha8598).FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterVectorDrawableMaxAlpha8598, false) : FrostHunterBarrierThunderHyperion9659.FrostHunterLifecycleBlazeGammaElite2889;
    }
}
