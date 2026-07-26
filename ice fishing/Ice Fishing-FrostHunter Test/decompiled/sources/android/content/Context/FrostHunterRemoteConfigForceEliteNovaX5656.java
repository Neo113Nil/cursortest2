package android.content.Context;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRemoteConfigForceEliteNovaX5656 extends FrostHunterImageAnalysisThunderSolar6127 {
    public static final FrostHunterAuthNovaPulse2006 FrostHunterPagingSourceEclipseDelta8255;
    public final FrostHunterCanvasTitanHyper8996 FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterBillingClientFusionVortex9008;
    public int FrostHunterBitmapTurboDeltaNebula8743;
    public long FrostHunterCameraXPixelTurboCosmos9814;
    public boolean FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterVectorDrawableVortexTitanRogue2910 FrostHunterCardViewSpectraCyber7714;
    public FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterDatabaseEliteShadowUltra2452;
    public Integer FrostHunterDialogFragmentTurboPhoenixDragon7627;
    public FrostHunterViewPagerVortexGammaMega9328 FrostHunterEditTextPulseHyperion1262;
    public final FrostHunterFilterAlphaSparkSpeed9857 FrostHunterFCMDeltaQuantumHero8364;
    public FrostHunterMenuUltraHyperion3040 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterAsyncMegaBetaPhantom8286 FrostHunterFlowMaxDragonHero5809;
    public final Handler FrostHunterFragmentBetaMegaVortex6025;
    public List FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterFlipAnimationQuantumNeo7496 FrostHunterLevelListDrawableFusionDragonHero2232;
    public int FrostHunterLifecycleBlazeGammaElite2889 = Integer.MIN_VALUE;
    public int FrostHunterLightSensorForceFusion4241;
    public FrostHunterMenuUltraHyperion3040 FrostHunterLintTitanVortexQuantum9911;
    public final FrostHunterEditTextPhoenixMaster1089 FrostHunterLooperHyperionForce4133;
    public final FrostHunterOnDeviceTranslatorDragonLegendFusion2692 FrostHunterLooperThreadBetaHyperionMax1000;
    public FrostHunterMotionLayoutNeoShadow3871 FrostHunterMagnetometerFusionTitanium8202;
    public final String FrostHunterMediaPlayerCelestialBetaTitan3868;
    public final FrostHunterShapeDrawableAuroraThunder2834 FrostHunterMeteringPointBetaCyber9571;
    public final FrostHunterGestureDetectorSpeedMaxThunder3477 FrostHunterMeteringPointMegaCyber7955;
    public final FrostHunterOnDeviceTranslatorDragonLegendFusion2692 FrostHunterMotionSceneAuroraMega2271;
    public boolean FrostHunterPagingDataTurboTitanium7332;
    public final FrostHunterFlipAnimationQuantumNeo7496 FrostHunterPermissionInfoAlphaDelta6279;
    public final FrostHunterGestureDetectorSpeedMaxThunder3477 FrostHunterR8MasterNebulaSpark7247;
    public final AccessibilityManager FrostHunterRemoteConfigSpeedSpeed8566;
    public final FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterResourcesTitanHyperVision5823;
    public final ArrayList FrostHunterRewardedAdMasterStrike9463;
    public int FrostHunterScaleAnimationStrikeSpark5059;
    public final FrostHunterTextRecognitionRogueOmegaNova9253 FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public final FrostHunterFilterSpectraTitan5298 FrostHunterServiceEliteCelestialThunder1757;
    public boolean FrostHunterServiceInfoHyperionSparkMax9966;
    public final FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterStateCelestialNovaPixel8414;
    public final FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterTextViewDragonStormMega4297;
    public final FrostHunterServicePhantomGammaTitan7103 FrostHunterTranslateAnimationCyberSolarUltra7101;
    public final FrostHunterGestureDetectorSpeedMaxThunder3477 FrostHunterViewPhantomNeo1634;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i = FrostHunterScaleGestureDetectorHyperionThunderForce7358.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAuthNovaPulse2006 frostHunterAuthNovaPulse2006 = new FrostHunterAuthNovaPulse2006(32);
        int i2 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i2 < 0) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889("");
            return;
        }
        int i3 = i2 + 32;
        int[] iArr2 = frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761;
        if (iArr2.length < i3) {
            frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761 = Arrays.copyOf(iArr2, Math.max(i3, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = frostHunterAuthNovaPulse2006.FrostHunterAlphaAnimationNeoCosmos5761;
        int i4 = frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i2 != i4) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterColorStateListMegaBetaFusion7423(i3, i2, i4, iArr3, iArr3);
        }
        FrostHunterContextSolarMegaPhantom7469.FrostHunterInAppPurchaseLegendEpicDragon4579(i2, 0, 12, iArr, iArr3);
        frostHunterAuthNovaPulse2006.FrostHunterConstraintSetCloneMasterUltraRogue2633 += 32;
        FrostHunterPagingSourceEclipseDelta8255 = frostHunterAuthNovaPulse2006;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context.FrostHunterAsyncMegaBetaPhantom8286] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.Context.FrostHunterCanvasTitanHyper8996] */
    public FrostHunterRemoteConfigForceEliteNovaX5656(FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298) {
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterFilterSpectraTitan5298;
        int i = 0;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterFlipAnimationQuantumNeo7496(this, i);
        Object systemService = frostHunterFilterSpectraTitan5298.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = accessibilityManager;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 100L;
        this.FrostHunterFlowMaxDragonHero5809 = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: android.content.Context.FrostHunterAsyncMegaBetaPhantom8286
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                FrostHunterRemoteConfigForceEliteNovaX5656 frostHunterRemoteConfigForceEliteNovaX5656 = FrostHunterRemoteConfigForceEliteNovaX5656.this;
                frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterKeyframeGammaGamma1197 = z ? frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterRemoteConfigSpeedSpeed8566.getEnabledAccessibilityServiceList(-1) : FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
            }
        };
        this.FrostHunterAlertDialogAuroraDelta3200 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: android.content.Context.FrostHunterCanvasTitanHyper8996
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                FrostHunterRemoteConfigForceEliteNovaX5656 frostHunterRemoteConfigForceEliteNovaX5656 = FrostHunterRemoteConfigForceEliteNovaX5656.this;
                frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterKeyframeGammaGamma1197 = frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterRemoteConfigSpeedSpeed8566.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.FrostHunterKeyframeGammaGamma1197 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.FrostHunterFragmentBetaMegaVortex6025 = new Handler(Looper.getMainLooper());
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new FrostHunterTextRecognitionRogueOmegaNova9253(this);
        this.FrostHunterLightSensorForceFusion4241 = Integer.MIN_VALUE;
        this.FrostHunterScaleAnimationStrikeSpark5059 = Integer.MIN_VALUE;
        this.FrostHunterResourcesTitanHyperVision5823 = new FrostHunterContentResolverEpicBetaOlympian4466();
        this.FrostHunterTextViewDragonStormMega4297 = new FrostHunterContentResolverEpicBetaOlympian4466();
        this.FrostHunterLooperThreadBetaHyperionMax1000 = new FrostHunterOnDeviceTranslatorDragonLegendFusion2692(0);
        this.FrostHunterMotionSceneAuroraMega2271 = new FrostHunterOnDeviceTranslatorDragonLegendFusion2692(0);
        this.FrostHunterBitmapTurboDeltaNebula8743 = -1;
        this.FrostHunterLooperHyperionForce4133 = new FrostHunterEditTextPhoenixMaster1089(0);
        int i2 = 1;
        this.FrostHunterMeteringPointBetaCyber9571 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterBundlePulseFusionHero2475(1, null, 6);
        this.FrostHunterServiceInfoHyperionSparkMax9966 = true;
        FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = FrostHunterDispatchersBetaHeroVision6785.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterContentResolverEpicBetaOlympian4466.getClass();
        this.FrostHunterDatabaseEliteShadowUltra2452 = frostHunterContentResolverEpicBetaOlympian4466;
        this.FrostHunterCardViewSpectraCyber7714 = new FrostHunterVectorDrawableVortexTitanRogue2910();
        this.FrostHunterViewPhantomNeo1634 = new FrostHunterGestureDetectorSpeedMaxThunder3477();
        this.FrostHunterMeteringPointMegaCyber7955 = new FrostHunterGestureDetectorSpeedMaxThunder3477();
        this.FrostHunterBillingClientFusionVortex9008 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.FrostHunterMediaPlayerCelestialBetaTitan3868 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.FrostHunterTranslateAnimationCyberSolarUltra7101 = new FrostHunterServicePhantomGammaTitan7103(8);
        this.FrostHunterStateCelestialNovaPixel8414 = new FrostHunterContentResolverEpicBetaOlympian4466();
        this.FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterMotionLayoutNeoShadow3871(frostHunterFilterSpectraTitan5298.getSemanticsOwner().FrostHunterAlphaAnimationNeoCosmos5761(), frostHunterContentResolverEpicBetaOlympian4466);
        int i3 = FrostHunterProximitySensorMegaMegaMaster2440.FrostHunterAlphaAnimationNeoCosmos5761;
        this.FrostHunterR8MasterNebulaSpark7247 = new FrostHunterGestureDetectorSpeedMaxThunder3477();
        frostHunterFilterSpectraTitan5298.addOnAttachStateChangeListener(new FrostHunterOnTouchListenerPixelMaxSpectra9429(i, this));
        this.FrostHunterFCMDeltaQuantumHero8364 = new FrostHunterFilterAlphaSparkSpeed9857(i2, this);
        this.FrostHunterRewardedAdMasterStrike9463 = new ArrayList();
        this.FrostHunterPermissionInfoAlphaDelta6279 = new FrostHunterFlipAnimationQuantumNeo7496(this, i2);
    }

    public static Region FrostHunterBillingClientFusionVortex9008(FrostHunterCoroutineNovaXMasterMaster7803 frostHunterCoroutineNovaXMasterMaster7803) {
        if (!(frostHunterCoroutineNovaXMasterMaster7803 instanceof FrostHunterAnnotationProcessorLegendHyperNeo3699)) {
            return null;
        }
        FrostHunterAnnotationProcessorLegendHyperNeo3699 frostHunterAnnotationProcessorLegendHyperNeo3699 = (FrostHunterAnnotationProcessorLegendHyperNeo3699) frostHunterCoroutineNovaXMasterMaster7803;
        FrostHunterBarrierThunderHyperion9659 FrostHunterTextViewDragonStormMega4297 = frostHunterAnnotationProcessorLegendHyperNeo3699.FrostHunterTextViewDragonStormMega4297();
        Region region = new Region(new Rect((int) FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterConstraintSetCloneMasterUltraRogue2633, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterServiceEliteCelestialThunder1757));
        Region region2 = new Region();
        FrostHunterCoroutinePixelNebulaMaster1626 frostHunterCoroutinePixelNebulaMaster1626 = frostHunterAnnotationProcessorLegendHyperNeo3699.FrostHunterBitmapTurboDeltaNebula8743;
        if (!(frostHunterCoroutinePixelNebulaMaster1626 instanceof FrostHunterCoroutinePixelNebulaMaster1626)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(frostHunterCoroutinePixelNebulaMaster1626.FrostHunterAlphaAnimationNeoCosmos5761, region);
        return region2;
    }

    public static final boolean FrostHunterCameraXTurboCelestialHero5430(FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860) {
        FrostHunterKeyEventSpectraTitan1846 frostHunterKeyEventSpectraTitan1846 = frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterAlphaAnimationNeoCosmos5761;
        if (((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue();
        ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue();
        return false;
    }

    public static /* synthetic */ void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterRemoteConfigForceEliteNovaX5656 frostHunterRemoteConfigForceEliteNovaX5656, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterBitmapTurboDeltaNebula8743(i, i2, num, null);
    }

    public static String FrostHunterLightSensorForceFusion4241(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite4081;
        if (frostHunterSharedElementSpectraNeo2511 != null) {
            FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761;
            if (frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)) {
                return FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761((List) frostHunterFirestoreEliteMasterThunder9916.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882), ",", null, 62);
            }
            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98822 = FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452;
            if (frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98822)) {
                Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98822);
                if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                    FrostHunterRemoteConfigSpeedSpeed8566 = null;
                }
                FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite40812 = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterRemoteConfigSpeedSpeed8566;
                if (frostHunterSnackbarHyperionMaxElite40812 != null) {
                    return frostHunterSnackbarHyperionMaxElite40812.FrostHunterFlowMaxDragonHero5809;
                }
            } else {
                Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLooperHyperionForce4133);
                if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                    FrostHunterRemoteConfigSpeedSpeed85662 = null;
                }
                List list = (List) FrostHunterRemoteConfigSpeedSpeed85662;
                if (list != null && (frostHunterSnackbarHyperionMaxElite4081 = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterSharedElementPixelTitan2806(list)) != null) {
                    return frostHunterSnackbarHyperionMaxElite4081.FrostHunterFlowMaxDragonHero5809;
                }
            }
        }
        return null;
    }

    public static final boolean FrostHunterLintTitanVortexQuantum9911(FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860, float f) {
        FrostHunterKeyEventSpectraTitan1846 frostHunterKeyEventSpectraTitan1846 = frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterAlphaAnimationNeoCosmos5761;
        if (f >= 0.0f || ((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() < ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue();
        }
        return true;
    }

    public static CharSequence FrostHunterMediaPlayerCelestialBetaTitan3868(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static float[] FrostHunterMeteringPointMegaCyber7955(FrostHunterCoroutineNovaXMasterMaster7803 frostHunterCoroutineNovaXMasterMaster7803) {
        if (!(frostHunterCoroutineNovaXMasterMaster7803 instanceof FrostHunterMaterialCardViewAuroraBlazeSpeed8498)) {
            return null;
        }
        FrostHunterFocusMeteringActionBetaShadowTurbo7112 frostHunterFocusMeteringActionBetaShadowTurbo7112 = ((FrostHunterMaterialCardViewAuroraBlazeSpeed8498) frostHunterCoroutineNovaXMasterMaster7803).FrostHunterBitmapTurboDeltaNebula8743;
        long j = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterCameraXPixelTurboCosmos9814;
        long j2 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterRemoteConfigSpeedSpeed8566;
        long j3 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLevelListDrawableFusionDragonHero2232;
        long j4 = frostHunterFocusMeteringActionBetaShadowTurbo7112.FrostHunterLifecycleBlazeGammaElite2889;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static final boolean FrostHunterResourcesTitanHyperVision5823(FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860) {
        FrostHunterKeyEventSpectraTitan1846 frostHunterKeyEventSpectraTitan1846 = frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterAlphaAnimationNeoCosmos5761;
        if (((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() < ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue()) {
            return true;
        }
        ((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue();
        return false;
    }

    public static Rect FrostHunterViewPhantomNeo1634(FrostHunterCoroutineNovaXMasterMaster7803 frostHunterCoroutineNovaXMasterMaster7803) {
        if (!(frostHunterCoroutineNovaXMasterMaster7803 instanceof FrostHunterViewPulseShadow4652) && !(frostHunterCoroutineNovaXMasterMaster7803 instanceof FrostHunterMaterialCardViewAuroraBlazeSpeed8498)) {
            return null;
        }
        FrostHunterBarrierThunderHyperion9659 FrostHunterTextViewDragonStormMega4297 = frostHunterCoroutineNovaXMasterMaster7803.FrostHunterTextViewDragonStormMega4297();
        return new Rect((int) FrostHunterTextViewDragonStormMega4297.FrostHunterAlphaAnimationNeoCosmos5761, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterConstraintSetCloneMasterUltraRogue2633, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475, (int) FrostHunterTextViewDragonStormMega4297.FrostHunterServiceEliteCelestialThunder1757);
    }

    public final AccessibilityEvent FrostHunterAlertDialogAuroraDelta3200(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i, 8192);
        if (num != null) {
            FrostHunterCameraXPixelTurboCosmos9814.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            FrostHunterCameraXPixelTurboCosmos9814.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            FrostHunterCameraXPixelTurboCosmos9814.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            FrostHunterCameraXPixelTurboCosmos9814.getText().add(charSequence);
        }
        return FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterImageAnalysisThunderSolar6127
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlphaAnimationNeoCosmos5761(View view) {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    public final boolean FrostHunterBitmapTurboDeltaNebula8743(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !FrostHunterScaleAnimationStrikeSpark5059()) {
            return false;
        }
        AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i, i2);
        if (num != null) {
            FrostHunterCameraXPixelTurboCosmos9814.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            FrostHunterCameraXPixelTurboCosmos9814.setContentDescription(FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(list, ",", null, 62));
        }
        return FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final void FrostHunterBundlePulseFusionHero2475(int i, FrostHunterMenuUltraHyperion3040 frostHunterMenuUltraHyperion3040, String str, Bundle bundle) {
        FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511;
        Region FrostHunterBillingClientFusionVortex9008;
        float[] FrostHunterMeteringPointMegaCyber7955;
        Rect FrostHunterViewPhantomNeo1634;
        FrostHunterStateNovaXEpic1904 FrostHunterServiceEliteCelestialThunder1757;
        int i2;
        float FrostHunterCameraXPixelTurboCosmos9814;
        float FrostHunterCameraXPixelTurboCosmos98142;
        float FrostHunterRemoteConfigSpeedSpeed8566;
        float FrostHunterRemoteConfigSpeedSpeed85662;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i3;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = frostHunterMenuUltraHyperion3040.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) FrostHunterServiceConnectionTurboPhoenixOmega6719().FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
        if (frostHunterRecyclerViewInfernoPhantomSpark2260 == null || (frostHunterSharedElementSpectraNeo2511 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761) == null) {
            return;
        }
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814;
        String FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(frostHunterSharedElementSpectraNeo2511);
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, this.FrostHunterBillingClientFusionVortex9008)) {
            int FrostHunterServiceEliteCelestialThunder17572 = this.FrostHunterViewPhantomNeo1634.FrostHunterServiceEliteCelestialThunder1757(i);
            if (FrostHunterServiceEliteCelestialThunder17572 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, FrostHunterServiceEliteCelestialThunder17572);
                return;
            }
            return;
        }
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, this.FrostHunterMediaPlayerCelestialBetaTitan3868)) {
            int FrostHunterServiceEliteCelestialThunder17573 = this.FrostHunterMeteringPointMegaCyber7955.FrostHunterServiceEliteCelestialThunder1757(i);
            if (FrostHunterServiceEliteCelestialThunder17573 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, FrostHunterServiceEliteCelestialThunder17573);
                return;
            }
            return;
        }
        boolean z = false;
        if (!frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(FrostHunterDialogVortexNeoUltra2659.FrostHunterAlphaAnimationNeoCosmos5761) || bundle == null || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterBitmapTurboDeltaNebula8743;
            if (frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882) && bundle != null && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.testTag")) {
                Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                String str2 = (String) (FrostHunterRemoteConfigSpeedSpeed85663 == null ? null : FrostHunterRemoteConfigSpeedSpeed85663);
                if (str2 != null) {
                    accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo2.getExtras().putInt(str, frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566);
                return;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.shapeType")) {
                Object FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMagnetometerFusionTitanium8202);
                FrostHunterGradlePluginDeltaPhantom5661 frostHunterGradlePluginDeltaPhantom5661 = (FrostHunterGradlePluginDeltaPhantom5661) (FrostHunterRemoteConfigSpeedSpeed85664 == null ? null : FrostHunterRemoteConfigSpeedSpeed85664);
                if (frostHunterGradlePluginDeltaPhantom5661 != null) {
                    FrostHunterCoroutineNovaXMasterMaster7803 FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(frostHunterGradlePluginDeltaPhantom5661, frostHunterSharedElementSpectraNeo2511);
                    if (FrostHunterFlowMaxDragonHero5809 instanceof FrostHunterViewPulseShadow4652) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", FrostHunterViewPhantomNeo1634(FrostHunterFlowMaxDragonHero5809));
                        return;
                    } else if (FrostHunterFlowMaxDragonHero5809 instanceof FrostHunterMaterialCardViewAuroraBlazeSpeed8498) {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", FrostHunterViewPhantomNeo1634(FrostHunterFlowMaxDragonHero5809));
                        accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", FrostHunterMeteringPointMegaCyber7955(FrostHunterFlowMaxDragonHero5809));
                        return;
                    } else if (!(FrostHunterFlowMaxDragonHero5809 instanceof FrostHunterAnnotationProcessorLegendHyperNeo3699)) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return;
                    } else {
                        accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", FrostHunterBillingClientFusionVortex9008(FrostHunterFlowMaxDragonHero5809));
                        return;
                    }
                }
                return;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMagnetometerFusionTitanium8202);
                FrostHunterGradlePluginDeltaPhantom5661 frostHunterGradlePluginDeltaPhantom56612 = (FrostHunterGradlePluginDeltaPhantom5661) (FrostHunterRemoteConfigSpeedSpeed85665 == null ? null : FrostHunterRemoteConfigSpeedSpeed85665);
                if (frostHunterGradlePluginDeltaPhantom56612 == null || (FrostHunterViewPhantomNeo1634 = FrostHunterViewPhantomNeo1634(FrostHunterFlowMaxDragonHero5809(frostHunterGradlePluginDeltaPhantom56612, frostHunterSharedElementSpectraNeo2511))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", FrostHunterViewPhantomNeo1634);
                return;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object FrostHunterRemoteConfigSpeedSpeed85666 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMagnetometerFusionTitanium8202);
                FrostHunterGradlePluginDeltaPhantom5661 frostHunterGradlePluginDeltaPhantom56613 = (FrostHunterGradlePluginDeltaPhantom5661) (FrostHunterRemoteConfigSpeedSpeed85666 == null ? null : FrostHunterRemoteConfigSpeedSpeed85666);
                if (frostHunterGradlePluginDeltaPhantom56613 == null || (FrostHunterMeteringPointMegaCyber7955 = FrostHunterMeteringPointMegaCyber7955(FrostHunterFlowMaxDragonHero5809(frostHunterGradlePluginDeltaPhantom56613, frostHunterSharedElementSpectraNeo2511))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", FrostHunterMeteringPointMegaCyber7955);
                return;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object FrostHunterRemoteConfigSpeedSpeed85667 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMagnetometerFusionTitanium8202);
                FrostHunterGradlePluginDeltaPhantom5661 frostHunterGradlePluginDeltaPhantom56614 = (FrostHunterGradlePluginDeltaPhantom5661) (FrostHunterRemoteConfigSpeedSpeed85667 == null ? null : FrostHunterRemoteConfigSpeedSpeed85667);
                if (frostHunterGradlePluginDeltaPhantom56614 == null || (FrostHunterBillingClientFusionVortex9008 = FrostHunterBillingClientFusionVortex9008(FrostHunterFlowMaxDragonHero5809(frostHunterGradlePluginDeltaPhantom56614, frostHunterSharedElementSpectraNeo2511))) == null) {
                    return;
                }
                accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", FrostHunterBillingClientFusionVortex9008);
                return;
            }
            return;
        }
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i5 <= 0 || i4 < 0) {
            return;
        }
        if (i4 < (FrostHunterLightSensorForceFusion4241 != null ? FrostHunterLightSensorForceFusion4241.length() : Integer.MAX_VALUE) && (FrostHunterServiceEliteCelestialThunder1757 = FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterServiceEliteCelestialThunder1757(frostHunterFirestoreEliteMasterThunder9916)) != null) {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i4 + i6;
                if (i7 >= FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809.length()) {
                    arrayList.add(z);
                    i2 = i4;
                    accessibilityNodeInfo = accessibilityNodeInfo2;
                    i3 = i5;
                } else {
                    FrostHunterCamera2PixelSpectraAlpha7690 frostHunterCamera2PixelSpectraAlpha7690 = FrostHunterServiceEliteCelestialThunder1757.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite4081 = (FrostHunterSnackbarHyperionMaxElite4081) ((FrostHunterOnItemLongClickListenerRogueDeltaStrike7658) frostHunterCamera2PixelSpectraAlpha7690.FrostHunterBundlePulseFusionHero2475).FrostHunterFlowMaxDragonHero5809;
                    if (i7 < 0 || i7 >= frostHunterSnackbarHyperionMaxElite4081.FrostHunterFlowMaxDragonHero5809.length()) {
                        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("offset(", i7, ") is out of bounds [0, ");
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(frostHunterSnackbarHyperionMaxElite4081.FrostHunterFlowMaxDragonHero5809.length());
                        FrostHunterServiceConnectionTurboPhoenixOmega6719.append(')');
                        FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceConnectionTurboPhoenixOmega6719.toString());
                    }
                    ArrayList arrayList2 = (ArrayList) frostHunterCamera2PixelSpectraAlpha7690.FrostHunterLifecycleBlazeGammaElite2889;
                    FrostHunterPaintFlagsDrawFilterSpectraCyber3909 frostHunterPaintFlagsDrawFilterSpectraCyber3909 = (FrostHunterPaintFlagsDrawFilterSpectraCyber3909) arrayList2.get(FrostHunterBannerAdTitanVisionDragon3523.FrostHunterMotionSceneAuroraMega2271(i7, arrayList2));
                    FrostHunterVectorDrawableCompatStormPhoenixElite6271 frostHunterVectorDrawableCompatStormPhoenixElite6271 = frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterAlphaAnimationNeoCosmos5761;
                    int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterAlphaAnimationNeoCosmos5761(i7);
                    CharSequence charSequence = frostHunterVectorDrawableCompatStormPhoenixElite6271.FrostHunterLifecycleBlazeGammaElite2889;
                    if (FrostHunterAlphaAnimationNeoCosmos5761 < 0 || FrostHunterAlphaAnimationNeoCosmos5761 >= charSequence.length()) {
                        StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("offset(", FrostHunterAlphaAnimationNeoCosmos5761, ") is out of bounds [0,");
                        FrostHunterServiceConnectionTurboPhoenixOmega67192.append(charSequence.length());
                        FrostHunterServiceConnectionTurboPhoenixOmega67192.append(')');
                        FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterServiceConnectionTurboPhoenixOmega67192.toString());
                    }
                    FrostHunterFlipAnimationSpectraOmegaOmega1311 frostHunterFlipAnimationSpectraOmegaOmega1311 = frostHunterVectorDrawableCompatStormPhoenixElite6271.FrostHunterServiceEliteCelestialThunder1757;
                    Layout layout = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterLifecycleBlazeGammaElite2889;
                    int lineForOffset = layout.getLineForOffset(FrostHunterAlphaAnimationNeoCosmos5761);
                    float FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterLevelListDrawableFusionDragonHero2232(lineForOffset);
                    float FrostHunterServiceEliteCelestialThunder17574 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterServiceEliteCelestialThunder1757(lineForOffset);
                    i2 = i4;
                    boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                    boolean isRtlCharAt = layout.isRtlCharAt(FrostHunterAlphaAnimationNeoCosmos5761);
                    if (!z2 || isRtlCharAt) {
                        if (z2 && isRtlCharAt) {
                            FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761, false);
                            FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761 + 1, true);
                        } else if (isRtlCharAt) {
                            FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationNeoCosmos5761, false);
                            FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationNeoCosmos5761 + 1, true);
                        } else {
                            FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761, false);
                            FrostHunterCameraXPixelTurboCosmos98142 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAlphaAnimationNeoCosmos5761 + 1, true);
                        }
                        float f = FrostHunterRemoteConfigSpeedSpeed8566;
                        FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterRemoteConfigSpeedSpeed85662;
                        FrostHunterCameraXPixelTurboCosmos98142 = f;
                    } else {
                        FrostHunterCameraXPixelTurboCosmos9814 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationNeoCosmos5761, false);
                        FrostHunterCameraXPixelTurboCosmos98142 = frostHunterFlipAnimationSpectraOmegaOmega1311.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterAlphaAnimationNeoCosmos5761 + 1, true);
                    }
                    RectF rectF2 = new RectF(FrostHunterCameraXPixelTurboCosmos9814, FrostHunterLevelListDrawableFusionDragonHero2232, FrostHunterCameraXPixelTurboCosmos98142, FrostHunterServiceEliteCelestialThunder17574);
                    accessibilityNodeInfo = accessibilityNodeInfo2;
                    i3 = i5;
                    long floatToRawIntBits = (Float.floatToRawIntBits(frostHunterPaintFlagsDrawFilterSpectraCyber3909.FrostHunterLevelListDrawableFusionDragonHero2232) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                    int i8 = (int) (floatToRawIntBits >> 32);
                    int i9 = (int) (floatToRawIntBits & 4294967295L);
                    FrostHunterBarrierThunderHyperion9659 frostHunterBarrierThunderHyperion9659 = new FrostHunterBarrierThunderHyperion9659(Float.intBitsToFloat(i8) + rectF2.left, Float.intBitsToFloat(i9) + rectF2.top, Float.intBitsToFloat(i8) + rectF2.right, Float.intBitsToFloat(i9) + rectF2.bottom);
                    FrostHunterVectorDrawableMaxAlpha8598 FrostHunterServiceEliteCelestialThunder17575 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757();
                    long j = 0;
                    if (FrostHunterServiceEliteCelestialThunder17575 != null) {
                        if (!FrostHunterServiceEliteCelestialThunder17575.FrostHunterGradleOmegaVisionSpectra5961().FrostHunterLooperThreadBetaHyperionMax1000) {
                            FrostHunterServiceEliteCelestialThunder17575 = null;
                        }
                        if (FrostHunterServiceEliteCelestialThunder17575 != null) {
                            j = FrostHunterServiceEliteCelestialThunder17575.FrostHunterViewPhantomNeo1634(0L);
                        }
                    }
                    FrostHunterBarrierThunderHyperion9659 FrostHunterLifecycleBlazeGammaElite2889 = frostHunterBarrierThunderHyperion9659.FrostHunterLifecycleBlazeGammaElite2889(j);
                    FrostHunterBarrierThunderHyperion9659 FrostHunterRemoteConfigSpeedSpeed85668 = frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566();
                    if ((((((FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761 > FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterBundlePulseFusionHero2475 ? 1 : (FrostHunterLifecycleBlazeGammaElite2889.FrostHunterAlphaAnimationNeoCosmos5761 == FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterBundlePulseFusionHero2475 ? 0 : -1)) < 0) & ((FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterAlphaAnimationNeoCosmos5761 > FrostHunterLifecycleBlazeGammaElite2889.FrostHunterBundlePulseFusionHero2475 ? 1 : (FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterAlphaAnimationNeoCosmos5761 == FrostHunterLifecycleBlazeGammaElite2889.FrostHunterBundlePulseFusionHero2475 ? 0 : -1)) < 0)) & ((FrostHunterLifecycleBlazeGammaElite2889.FrostHunterConstraintSetCloneMasterUltraRogue2633 > FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterServiceEliteCelestialThunder1757 ? 1 : (FrostHunterLifecycleBlazeGammaElite2889.FrostHunterConstraintSetCloneMasterUltraRogue2633 == FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterServiceEliteCelestialThunder1757 ? 0 : -1)) < 0)) & ((FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterConstraintSetCloneMasterUltraRogue2633 > FrostHunterLifecycleBlazeGammaElite2889.FrostHunterServiceEliteCelestialThunder1757 ? 1 : (FrostHunterRemoteConfigSpeedSpeed85668.FrostHunterConstraintSetCloneMasterUltraRogue2633 == FrostHunterLifecycleBlazeGammaElite2889.FrostHunterServiceEliteCelestialThunder1757 ? 0 : -1)) < 0) ? FrostHunterLifecycleBlazeGammaElite2889.FrostHunterBundlePulseFusionHero2475(FrostHunterRemoteConfigSpeedSpeed85668) : null) != null) {
                        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = this.FrostHunterServiceEliteCelestialThunder1757;
                        long FrostHunterMotionSceneAuroraMega2271 = frostHunterFilterSpectraTitan5298.FrostHunterMotionSceneAuroraMega2271((Float.floatToRawIntBits(r1.FrostHunterConstraintSetCloneMasterUltraRogue2633) & 4294967295L) | (Float.floatToRawIntBits(r1.FrostHunterAlphaAnimationNeoCosmos5761) << 32));
                        long FrostHunterMotionSceneAuroraMega22712 = frostHunterFilterSpectraTitan5298.FrostHunterMotionSceneAuroraMega2271((Float.floatToRawIntBits(r1.FrostHunterBundlePulseFusionHero2475) << 32) | (Float.floatToRawIntBits(r1.FrostHunterServiceEliteCelestialThunder1757) & 4294967295L));
                        int i10 = (int) (FrostHunterMotionSceneAuroraMega2271 >> 32);
                        int i11 = (int) (FrostHunterMotionSceneAuroraMega22712 >> 32);
                        int i12 = (int) (FrostHunterMotionSceneAuroraMega2271 & 4294967295L);
                        int i13 = (int) (FrostHunterMotionSceneAuroraMega22712 & 4294967295L);
                        rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                    } else {
                        rectF = null;
                    }
                    arrayList.add(rectF);
                }
                i6++;
                i5 = i3;
                accessibilityNodeInfo2 = accessibilityNodeInfo;
                i4 = i2;
                z = false;
            }
            accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    public final AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814(int i, int i2) {
        FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = this.FrostHunterServiceEliteCelestialThunder1757;
        obtain.setPackageName(frostHunterFilterSpectraTitan5298.getContext().getPackageName());
        obtain.setSource(frostHunterFilterSpectraTitan5298, i);
        if (FrostHunterScaleAnimationStrikeSpark5059() && (frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) FrostHunterServiceConnectionTurboPhoenixOmega6719().FrostHunterConstraintSetCloneMasterUltraRogue2633(i)) != null) {
            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761;
            obtain.setPassword(frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterBillingClientFusionVortex9008));
            Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterServiceConnectionTurboPhoenixOmega6719);
            if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                FrostHunterRemoteConfigSpeedSpeed8566 = null;
            }
            boolean FrostHunterLightSensorForceFusion4241 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterRemoteConfigSpeedSpeed8566, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                FrostHunterTextWatcherMasterHyperionHyperion1994.FrostHunterLevelListDrawableFusionDragonHero2232(obtain, FrostHunterLightSensorForceFusion4241);
            }
        }
        return obtain;
    }

    public final boolean FrostHunterCardViewSpectraCyber7714(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, int i, int i2, boolean z) {
        String FrostHunterLightSensorForceFusion4241;
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566;
        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterDialogVortexNeoUltra2659.FrostHunterCameraXPixelTurboCosmos9814;
        if (frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882) && FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterSharedElementSpectraNeo2511)) {
            FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109 = (FrostHunterDragEventStormHyperion6109) ((FrostHunterContextGammaSolar6144) frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)).FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (frostHunterDragEventStormHyperion6109 != null) {
                return ((Boolean) frostHunterDragEventStormHyperion6109.FrostHunterLevelListDrawableFusionDragonHero2232(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.FrostHunterBitmapTurboDeltaNebula8743) && (FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(frostHunterSharedElementSpectraNeo2511)) != null) {
            if (i < 0 || i != i2 || i2 > FrostHunterLightSensorForceFusion4241.length()) {
                i = -1;
            }
            this.FrostHunterBitmapTurboDeltaNebula8743 = i;
            boolean z2 = FrostHunterLightSensorForceFusion4241.length() > 0;
            FrostHunterMotionSceneAuroraMega2271(FrostHunterAlertDialogAuroraDelta3200(FrostHunterTextViewDragonStormMega4297(i3), z2 ? Integer.valueOf(this.FrostHunterBitmapTurboDeltaNebula8743) : null, z2 ? Integer.valueOf(this.FrostHunterBitmapTurboDeltaNebula8743) : null, z2 ? Integer.valueOf(FrostHunterLightSensorForceFusion4241.length()) : null, FrostHunterLightSensorForceFusion4241));
            FrostHunterMeteringPointBetaCyber9571(i3);
            return true;
        }
        return false;
    }

    public final void FrostHunterDatabaseEliteShadowUltra2452(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterBillingClientFusionVortex9008() && !this.FrostHunterServiceEliteCelestialThunder1757.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439)) {
            int i = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809;
            FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) this.FrostHunterResourcesTitanHyperVision5823.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
            FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova18602 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) this.FrostHunterTextViewDragonStormMega4297.FrostHunterConstraintSetCloneMasterUltraRogue2633(i);
            if (frostHunterProcessCameraProviderTitaniumNeoNova1860 == null && frostHunterProcessCameraProviderTitaniumNeoNova18602 == null) {
                return;
            }
            AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(i, 4096);
            if (frostHunterProcessCameraProviderTitaniumNeoNova1860 != null) {
                FrostHunterCameraXPixelTurboCosmos9814.setScrollX((int) ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue());
                FrostHunterCameraXPixelTurboCosmos9814.setMaxScrollX((int) ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue());
            }
            if (frostHunterProcessCameraProviderTitaniumNeoNova18602 != null) {
                FrostHunterCameraXPixelTurboCosmos9814.setScrollY((int) ((Number) frostHunterProcessCameraProviderTitaniumNeoNova18602.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue());
                FrostHunterCameraXPixelTurboCosmos9814.setMaxScrollY((int) ((Number) frostHunterProcessCameraProviderTitaniumNeoNova18602.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue());
            }
            FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814);
        }
    }

    public final void FrostHunterEditTextPulseHyperion1262(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue2910) {
        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega2271;
        if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterBillingClientFusionVortex9008() && !this.FrostHunterServiceEliteCelestialThunder1757.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439)) {
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = null;
            if (!frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterCameraXPixelTurboCosmos9814(8)) {
                frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
                while (true) {
                    if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 == null) {
                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = null;
                        break;
                    } else if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterPagingDataTurboTitanium7332.FrostHunterCameraXPixelTurboCosmos9814(8)) {
                        break;
                    } else {
                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
                    }
                }
            }
            if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 == null || (FrostHunterMotionSceneAuroraMega2271 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMotionSceneAuroraMega2271()) == null) {
                return;
            }
            if (!FrostHunterMotionSceneAuroraMega2271.FrostHunterAlertDialogAuroraDelta3200) {
                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterResourcesTitanHyperVision5823 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterResourcesTitanHyperVision5823();
                while (true) {
                    if (FrostHunterResourcesTitanHyperVision5823 != null) {
                        FrostHunterFirestoreEliteMasterThunder9916 FrostHunterMotionSceneAuroraMega22712 = FrostHunterResourcesTitanHyperVision5823.FrostHunterMotionSceneAuroraMega2271();
                        if (FrostHunterMotionSceneAuroraMega22712 != null && FrostHunterMotionSceneAuroraMega22712.FrostHunterAlertDialogAuroraDelta3200) {
                            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = FrostHunterResourcesTitanHyperVision5823;
                            break;
                        }
                        FrostHunterResourcesTitanHyperVision5823 = FrostHunterResourcesTitanHyperVision5823.FrostHunterResourcesTitanHyperVision5823();
                    } else {
                        break;
                    }
                }
                if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 != null) {
                    frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392;
                }
            }
            int i = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterAlphaAnimationNeoCosmos5761(i)) {
                FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i), 2048, 1, 8);
            }
        }
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) {
        if (this.FrostHunterLooperHyperionForce4133.add(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439)) {
            this.FrostHunterMeteringPointBetaCyber9571.FrostHunterBundlePulseFusionHero2475(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761);
        }
    }

    public final FrostHunterCoroutineNovaXMasterMaster7803 FrostHunterFlowMaxDragonHero5809(FrostHunterGradlePluginDeltaPhantom5661 frostHunterGradlePluginDeltaPhantom5661, FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterVectorDrawableMaxAlpha8598 FrostHunterServiceEliteCelestialThunder1757 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757();
        return frostHunterGradlePluginDeltaPhantom5661.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTransitionGammaTitanSpeed7178.FrostHunterColorDrawableLegendPhoenixVision7927(FrostHunterServiceEliteCelestialThunder1757 != null ? FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlertDialogAuroraDelta3200 : 0L), frostHunterSharedElementSpectraNeo2511.FrostHunterBundlePulseFusionHero2475.FrostHunterMeteringPointMegaCyber7955, this.FrostHunterServiceEliteCelestialThunder1757.getDensity());
    }

    public final int FrostHunterFragmentBetaMegaVortex6025(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        if (!frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761)) {
            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterCardViewSpectraCyber7714;
            if (frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)) {
                return (int) (((FrostHunterServiceCelestialHyper2330) frostHunterFirestoreEliteMasterThunder9916.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)).FrostHunterAlphaAnimationNeoCosmos5761 >> 32);
            }
        }
        return this.FrostHunterBitmapTurboDeltaNebula8743;
    }

    public final int FrostHunterKeyframeGammaGamma1197(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
        if (!frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761)) {
            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterCardViewSpectraCyber7714;
            if (frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)) {
                return (int) (((FrostHunterServiceCelestialHyper2330) frostHunterFirestoreEliteMasterThunder9916.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882)).FrostHunterAlphaAnimationNeoCosmos5761 & 4294967295L);
            }
        }
        return this.FrostHunterBitmapTurboDeltaNebula8743;
    }

    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232(int i, long j, boolean z) {
        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882;
        int i2;
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            FrostHunterDiffUtilPhoenixNovaXBeta5728 FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719();
            if (!FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterTextViewDragonStormMega4297;
                } else {
                    if (z) {
                        FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        return false;
                    }
                    frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterResourcesTitanHyperVision5823;
                }
                Object[] objArr = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475;
                long[] jArr = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) objArr[(i3 << 3) + i6];
                                    FrostHunterSQLiteVisionSpeedSpark5388 frostHunterSQLiteVisionSpeedSpark5388 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                    float f = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterAlphaAnimationNeoCosmos5761;
                                    i2 = i4;
                                    float f2 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                    float f3 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterBundlePulseFusionHero2475;
                                    float f4 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterServiceEliteCelestialThunder1757;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                                        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                                            FrostHunterRemoteConfigSpeedSpeed8566 = null;
                                        }
                                        FrostHunterProcessCameraProviderTitaniumNeoNova1860 frostHunterProcessCameraProviderTitaniumNeoNova1860 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) FrostHunterRemoteConfigSpeedSpeed8566;
                                        if (frostHunterProcessCameraProviderTitaniumNeoNova1860 != null) {
                                            FrostHunterKeyEventSpectraTitan1846 frostHunterKeyEventSpectraTitan1846 = frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterAlphaAnimationNeoCosmos5761;
                                            if (i < 0) {
                                                if (((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) frostHunterKeyEventSpectraTitan1846.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue() >= ((Number) frostHunterProcessCameraProviderTitaniumNeoNova1860.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (android.content.Context.FrostHunterPaintCyberPulse5979.FrostHunterLooperThreadBetaHyperionMax1000(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ec -> B:14:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object FrostHunterLifecycleBlazeGammaElite2889(FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterPoseDetectionForceSpectra1924 frostHunterPoseDetectionForceSpectra1924;
        int i;
        FrostHunterEditTextPhoenixMaster1089 frostHunterEditTextPhoenixMaster1089;
        FrostHunterEditTextPhoenixMaster1089 frostHunterEditTextPhoenixMaster10892;
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue2910;
        FrostHunterVideoCaptureOmegaCosmosCosmos7652 frostHunterVideoCaptureOmegaCosmosCosmos7652;
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue29102;
        FrostHunterVideoCaptureOmegaCosmosCosmos7652 frostHunterVideoCaptureOmegaCosmosCosmos76522;
        int i2;
        long j;
        Object FrostHunterConstraintSetCloneMasterUltraRogue2633;
        try {
            if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterPoseDetectionForceSpectra1924) {
                frostHunterPoseDetectionForceSpectra1924 = (FrostHunterPoseDetectionForceSpectra1924) frostHunterViewBindingCelestialVortex7351;
                int i3 = frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059 = i3 - Integer.MIN_VALUE;
                    Object obj = frostHunterPoseDetectionForceSpectra1924.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    i = frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059;
                    frostHunterEditTextPhoenixMaster1089 = this.FrostHunterLooperHyperionForce4133;
                    FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i != 0) {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        frostHunterVectorDrawableVortexTitanRogue2910 = new FrostHunterVectorDrawableVortexTitanRogue2910();
                        FrostHunterShapeDrawableAuroraThunder2834 frostHunterShapeDrawableAuroraThunder2834 = this.FrostHunterMeteringPointBetaCyber9571;
                        frostHunterShapeDrawableAuroraThunder2834.getClass();
                        frostHunterVideoCaptureOmegaCosmosCosmos7652 = new FrostHunterVideoCaptureOmegaCosmosCosmos7652(frostHunterShapeDrawableAuroraThunder2834);
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterKeyframeGammaGamma1197 = frostHunterVectorDrawableVortexTitanRogue2910;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVideoCaptureOmegaCosmosCosmos7652;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059 = 1;
                        FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterVideoCaptureOmegaCosmosCosmos7652.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterPoseDetectionForceSpectra1924);
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != frostHunterAuthMasterNovaXMax8430) {
                        }
                    } else if (i == 1) {
                        frostHunterVideoCaptureOmegaCosmosCosmos76522 = frostHunterPoseDetectionForceSpectra1924.FrostHunterFragmentBetaMegaVortex6025;
                        frostHunterVectorDrawableVortexTitanRogue29102 = frostHunterPoseDetectionForceSpectra1924.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        frostHunterVideoCaptureOmegaCosmosCosmos76522 = frostHunterPoseDetectionForceSpectra1924.FrostHunterFragmentBetaMegaVortex6025;
                        frostHunterVectorDrawableVortexTitanRogue29102 = frostHunterPoseDetectionForceSpectra1924.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        char c = 2;
                        frostHunterEditTextPhoenixMaster10892 = frostHunterEditTextPhoenixMaster1089;
                        frostHunterVectorDrawableVortexTitanRogue2910 = frostHunterVectorDrawableVortexTitanRogue29102;
                        frostHunterEditTextPhoenixMaster1089 = frostHunterEditTextPhoenixMaster10892;
                        frostHunterVideoCaptureOmegaCosmosCosmos7652 = frostHunterVideoCaptureOmegaCosmosCosmos76522;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterKeyframeGammaGamma1197 = frostHunterVectorDrawableVortexTitanRogue2910;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVideoCaptureOmegaCosmosCosmos7652;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059 = 1;
                        FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterVideoCaptureOmegaCosmosCosmos7652.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterPoseDetectionForceSpectra1924);
                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != frostHunterAuthMasterNovaXMax8430) {
                            return frostHunterAuthMasterNovaXMax8430;
                        }
                        FrostHunterVideoCaptureOmegaCosmosCosmos7652 frostHunterVideoCaptureOmegaCosmosCosmos76523 = frostHunterVideoCaptureOmegaCosmosCosmos7652;
                        frostHunterVectorDrawableVortexTitanRogue29102 = frostHunterVectorDrawableVortexTitanRogue2910;
                        obj = FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterVideoCaptureOmegaCosmosCosmos76522 = frostHunterVideoCaptureOmegaCosmosCosmos76523;
                        if (((Boolean) obj).booleanValue()) {
                            frostHunterEditTextPhoenixMaster1089.clear();
                            return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                        }
                        frostHunterVideoCaptureOmegaCosmosCosmos76522.FrostHunterBundlePulseFusionHero2475();
                        if (FrostHunterScaleAnimationStrikeSpark5059()) {
                            int i4 = frostHunterEditTextPhoenixMaster1089.FrostHunterAlertDialogAuroraDelta3200;
                            for (int i5 = 0; i5 < i4; i5++) {
                                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = (FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) frostHunterEditTextPhoenixMaster1089.FrostHunterFlowMaxDragonHero5809[i5];
                                FrostHunterEditTextPulseHyperion1262(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, frostHunterVectorDrawableVortexTitanRogue29102);
                                FrostHunterDatabaseEliteShadowUltra2452(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
                            }
                            frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterServiceEliteCelestialThunder1757 = 0;
                            long[] jArr = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (jArr != FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761) {
                                try {
                                    FrostHunterContextSolarMegaPhantom7469.FrostHunterSharedElementPixelTitan2806(jArr);
                                    long[] jArr2 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761;
                                    i2 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterBundlePulseFusionHero2475;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    frostHunterEditTextPhoenixMaster10892.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                frostHunterEditTextPhoenixMaster10892 = frostHunterEditTextPhoenixMaster1089;
                            } else {
                                frostHunterEditTextPhoenixMaster10892 = frostHunterEditTextPhoenixMaster1089;
                            }
                            frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterBundlePulseFusionHero2475) - frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterServiceEliteCelestialThunder1757;
                            if (!this.FrostHunterPagingDataTurboTitanium7332) {
                                this.FrostHunterPagingDataTurboTitanium7332 = true;
                                this.FrostHunterFragmentBetaMegaVortex6025.post(this.FrostHunterFCMDeltaQuantumHero8364);
                            }
                        } else {
                            frostHunterEditTextPhoenixMaster10892 = frostHunterEditTextPhoenixMaster1089;
                        }
                        frostHunterEditTextPhoenixMaster10892.clear();
                        this.FrostHunterResourcesTitanHyperVision5823.FrostHunterBundlePulseFusionHero2475();
                        this.FrostHunterTextViewDragonStormMega4297.FrostHunterBundlePulseFusionHero2475();
                        long j2 = this.FrostHunterCameraXPixelTurboCosmos9814;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterKeyframeGammaGamma1197 = frostHunterVectorDrawableVortexTitanRogue29102;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVideoCaptureOmegaCosmosCosmos76522;
                        c = 2;
                        frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059 = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            frostHunterEditTextPhoenixMaster10892 = frostHunterEditTextPhoenixMaster1089;
        }
        frostHunterPoseDetectionForceSpectra1924 = new FrostHunterPoseDetectionForceSpectra1924(this, frostHunterViewBindingCelestialVortex7351);
        Object obj2 = frostHunterPoseDetectionForceSpectra1924.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        i = frostHunterPoseDetectionForceSpectra1924.FrostHunterScaleAnimationStrikeSpark5059;
        frostHunterEditTextPhoenixMaster1089 = this.FrostHunterLooperHyperionForce4133;
        FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax84302 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public final void FrostHunterLooperHyperionForce4133(String str, int i, int i2) {
        AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextViewDragonStormMega4297(i), 32);
        FrostHunterCameraXPixelTurboCosmos9814.setContentChangeTypes(i2);
        if (str != null) {
            FrostHunterCameraXPixelTurboCosmos9814.getText().add(str);
        }
        FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814);
    }

    public final void FrostHunterLooperThreadBetaHyperionMax1000(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, FrostHunterMotionLayoutNeoShadow3871 frostHunterMotionLayoutNeoShadow3871) {
        int[] iArr = FrostHunterChipCyberThunder9742.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue2910 = new FrostHunterVectorDrawableVortexTitanRogue2910();
        List FrostHunterAlertDialogAuroraDelta3200 = FrostHunterSharedElementSpectraNeo2511.FrostHunterAlertDialogAuroraDelta3200(4, frostHunterSharedElementSpectraNeo2511);
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterSharedElementSpectraNeo2511.FrostHunterBundlePulseFusionHero2475;
        int size = FrostHunterAlertDialogAuroraDelta3200.size();
        for (int i = 0; i < size; i++) {
            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112 = (FrostHunterSharedElementSpectraNeo2511) FrostHunterAlertDialogAuroraDelta3200.get(i);
            FrostHunterDiffUtilPhoenixNovaXBeta5728 FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719();
            int i2 = frostHunterSharedElementSpectraNeo25112.FrostHunterRemoteConfigSpeedSpeed8566;
            if (FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761(i2)) {
                if (!frostHunterMotionLayoutNeoShadow3871.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633(i2)) {
                    FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
                    return;
                }
                frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterAlphaAnimationNeoCosmos5761(i2);
            }
        }
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue29102 = frostHunterMotionLayoutNeoShadow3871.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int[] iArr2 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterConstraintSetCloneMasterUltraRogue2633(iArr2[(i3 << 3) + i5])) {
                            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List FrostHunterAlertDialogAuroraDelta32002 = FrostHunterSharedElementSpectraNeo2511.FrostHunterAlertDialogAuroraDelta3200(4, frostHunterSharedElementSpectraNeo2511);
        int size2 = FrostHunterAlertDialogAuroraDelta32002.size();
        for (int i6 = 0; i6 < size2; i6++) {
            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25113 = (FrostHunterSharedElementSpectraNeo2511) FrostHunterAlertDialogAuroraDelta32002.get(i6);
            FrostHunterMotionLayoutNeoShadow3871 frostHunterMotionLayoutNeoShadow38712 = (FrostHunterMotionLayoutNeoShadow3871) this.FrostHunterStateCelestialNovaPixel8414.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterSharedElementSpectraNeo25113.FrostHunterRemoteConfigSpeedSpeed8566);
            if (frostHunterMotionLayoutNeoShadow38712 != null && FrostHunterServiceConnectionTurboPhoenixOmega6719().FrostHunterAlphaAnimationNeoCosmos5761(frostHunterSharedElementSpectraNeo25113.FrostHunterRemoteConfigSpeedSpeed8566)) {
                FrostHunterLooperThreadBetaHyperionMax1000(frostHunterSharedElementSpectraNeo25113, frostHunterMotionLayoutNeoShadow38712);
            }
        }
    }

    public final void FrostHunterMeteringPointBetaCyber9571(int i) {
        FrostHunterViewPagerVortexGammaMega9328 frostHunterViewPagerVortexGammaMega9328 = this.FrostHunterEditTextPulseHyperion1262;
        if (frostHunterViewPagerVortexGammaMega9328 != null) {
            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = frostHunterViewPagerVortexGammaMega9328.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i != frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566) {
                return;
            }
            if (SystemClock.uptimeMillis() - frostHunterViewPagerVortexGammaMega9328.FrostHunterLevelListDrawableFusionDragonHero2232 <= 1000) {
                AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextViewDragonStormMega4297(frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566), 131072);
                FrostHunterCameraXPixelTurboCosmos9814.setFromIndex(frostHunterViewPagerVortexGammaMega9328.FrostHunterServiceEliteCelestialThunder1757);
                FrostHunterCameraXPixelTurboCosmos9814.setToIndex(frostHunterViewPagerVortexGammaMega9328.FrostHunterLifecycleBlazeGammaElite2889);
                FrostHunterCameraXPixelTurboCosmos9814.setAction(frostHunterViewPagerVortexGammaMega9328.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                FrostHunterCameraXPixelTurboCosmos9814.setMovementGranularity(frostHunterViewPagerVortexGammaMega9328.FrostHunterBundlePulseFusionHero2475);
                FrostHunterCameraXPixelTurboCosmos9814.getText().add(FrostHunterLightSensorForceFusion4241(frostHunterSharedElementSpectraNeo2511));
                FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814);
            }
        }
        this.FrostHunterEditTextPulseHyperion1262 = null;
    }

    public final boolean FrostHunterMotionSceneAuroraMega2271(AccessibilityEvent accessibilityEvent) {
        if (!FrostHunterScaleAnimationStrikeSpark5059()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.FrostHunterCameraXTurboCelestialHero5430 = true;
        }
        try {
            return ((Boolean) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761(accessibilityEvent)).booleanValue();
        } finally {
            this.FrostHunterCameraXTurboCelestialHero5430 = false;
        }
    }

    public final void FrostHunterRemoteConfigSpeedSpeed8566() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (FrostHunterScaleAnimationStrikeSpark5059()) {
                FrostHunterLooperThreadBetaHyperionMax1000(this.FrostHunterServiceEliteCelestialThunder1757.getSemanticsOwner().FrostHunterAlphaAnimationNeoCosmos5761(), this.FrostHunterMagnetometerFusionTitanium8202);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterServiceConnectionTurboPhoenixOmega6719());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    FrostHunterTranslateAnimationCyberSolarUltra7101();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final boolean FrostHunterScaleAnimationStrikeSpark5059() {
        return this.FrostHunterRemoteConfigSpeedSpeed8566.isEnabled() && !this.FrostHunterKeyframeGammaGamma1197.isEmpty();
    }

    public final FrostHunterDiffUtilPhoenixNovaXBeta5728 FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        if (this.FrostHunterServiceInfoHyperionSparkMax9966) {
            this.FrostHunterServiceInfoHyperionSparkMax9966 = false;
            FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = this.FrostHunterServiceEliteCelestialThunder1757;
            this.FrostHunterDatabaseEliteShadowUltra2452 = FrostHunterRemoteConfigPhantomDelta1739.FrostHunterMeteringPointBetaCyber9571(frostHunterFilterSpectraTitan5298.getSemanticsOwner());
            if (FrostHunterScaleAnimationStrikeSpark5059()) {
                FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = this.FrostHunterDatabaseEliteShadowUltra2452;
                Resources resources = frostHunterFilterSpectraTitan5298.getContext().getResources();
                FrostHunterGestureDetectorSpeedMaxThunder3477 frostHunterGestureDetectorSpeedMaxThunder3477 = this.FrostHunterViewPhantomNeo1634;
                frostHunterGestureDetectorSpeedMaxThunder3477.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterGestureDetectorSpeedMaxThunder3477 frostHunterGestureDetectorSpeedMaxThunder34772 = this.FrostHunterMeteringPointMegaCyber7955;
                frostHunterGestureDetectorSpeedMaxThunder34772.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) frostHunterContentResolverEpicBetaOlympian4466.FrostHunterConstraintSetCloneMasterUltraRogue2633(-1);
                FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = frostHunterRecyclerViewInfernoPhantomSpark2260 != null ? frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761 : null;
                frostHunterSharedElementSpectraNeo2511.getClass();
                int i = 1;
                ArrayList FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterMediaPlayerTitanQuantum9073.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterSharedElementSpectraNeo2511, new FrostHunterOnAttachStateChangeListenerStrikeOmegaElite9598(i, frostHunterContentResolverEpicBetaOlympian4466), new FrostHunterOnAttachStateChangeListenerStrikeOmegaElite9598(2, resources), FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(frostHunterSharedElementSpectraNeo2511));
                int size = FrostHunterConstraintSetCloneMasterUltraRogue2633.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((FrostHunterSharedElementSpectraNeo2511) FrostHunterConstraintSetCloneMasterUltraRogue2633.get(i - 1)).FrostHunterRemoteConfigSpeedSpeed8566;
                        int i3 = ((FrostHunterSharedElementSpectraNeo2511) FrostHunterConstraintSetCloneMasterUltraRogue2633.get(i)).FrostHunterRemoteConfigSpeedSpeed8566;
                        frostHunterGestureDetectorSpeedMaxThunder3477.FrostHunterLevelListDrawableFusionDragonHero2232(i2, i3);
                        frostHunterGestureDetectorSpeedMaxThunder34772.FrostHunterLevelListDrawableFusionDragonHero2232(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.FrostHunterDatabaseEliteShadowUltra2452;
    }

    public final Rect FrostHunterServiceEliteCelestialThunder1757(FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260) {
        FrostHunterSQLiteVisionSpeedSpark5388 frostHunterSQLiteVisionSpeedSpark5388 = frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        float f = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterAlphaAnimationNeoCosmos5761;
        float f2 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = this.FrostHunterServiceEliteCelestialThunder1757;
        long FrostHunterMotionSceneAuroraMega2271 = frostHunterFilterSpectraTitan5298.FrostHunterMotionSceneAuroraMega2271((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        float f3 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterBundlePulseFusionHero2475;
        float f4 = frostHunterSQLiteVisionSpeedSpark5388.FrostHunterServiceEliteCelestialThunder1757;
        long FrostHunterMotionSceneAuroraMega22712 = frostHunterFilterSpectraTitan5298.FrostHunterMotionSceneAuroraMega2271((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (FrostHunterMotionSceneAuroraMega2271 >> 32);
        int i2 = (int) (FrostHunterMotionSceneAuroraMega22712 >> 32);
        int i3 = (int) (FrostHunterMotionSceneAuroraMega2271 & 4294967295L);
        int i4 = (int) (FrostHunterMotionSceneAuroraMega22712 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04be, code lost:
    
        if (r1.isEmpty() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04ed, code lost:
    
        if (r12 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f2, code lost:
    
        if (r12 == null) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterDiffUtilPhoenixNovaXBeta5728 frostHunterDiffUtilPhoenixNovaXBeta5728) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i;
        int i2;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num2;
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916;
        FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
        int i6;
        FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder99162;
        ArrayList arrayList3;
        long j;
        int i7;
        int i8;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392;
        Integer num3;
        int i9;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22752;
        int i10;
        int i11;
        FrostHunterShapeAppearanceUltraPhantom6821 frostHunterShapeAppearanceUltraPhantom6821;
        boolean z4;
        FrostHunterShapeAppearanceUltraPhantom6821 frostHunterShapeAppearanceUltraPhantom68212;
        boolean z5;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22753;
        Integer num4;
        AccessibilityEvent FrostHunterAlertDialogAuroraDelta3200;
        Integer num5;
        FrostHunterDiffUtilPhoenixNovaXBeta5728 frostHunterDiffUtilPhoenixNovaXBeta57282 = frostHunterDiffUtilPhoenixNovaXBeta5728;
        ArrayList arrayList4 = this.FrostHunterRewardedAdMasterStrike9463;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = frostHunterDiffUtilPhoenixNovaXBeta57282.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr3 = frostHunterDiffUtilPhoenixNovaXBeta57282.FrostHunterAlphaAnimationNeoCosmos5761;
        int i16 = 2;
        int length = jArr3.length - 2;
        int i17 = 0;
        Integer num6 = 0;
        if (length < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j2 = jArr3[i18];
            int i19 = i16;
            int i20 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i18 - i20)) >>> 31);
                long j3 = j2;
                int i23 = i17;
                while (i23 < i22) {
                    if ((j3 & 255) < 128) {
                        int i24 = iArr3[(i18 << 3) + i23];
                        FrostHunterMotionLayoutNeoShadow3871 frostHunterMotionLayoutNeoShadow3871 = (FrostHunterMotionLayoutNeoShadow3871) this.FrostHunterStateCelestialNovaPixel8414.FrostHunterConstraintSetCloneMasterUltraRogue2633(i24);
                        if (frostHunterMotionLayoutNeoShadow3871 != null) {
                            FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder99163 = frostHunterMotionLayoutNeoShadow3871.FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22754 = frostHunterFirestoreEliteMasterThunder99163.FrostHunterCameraXPixelTurboCosmos9814;
                            FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) frostHunterDiffUtilPhoenixNovaXBeta57282.FrostHunterConstraintSetCloneMasterUltraRogue2633(i24);
                            int i25 = i21;
                            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112 = frostHunterRecyclerViewInfernoPhantomSpark2260 != null ? frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761 : null;
                            if (frostHunterSharedElementSpectraNeo25112 == null) {
                                throw FrostHunterKeyEventNovaXAlpha1220.FrostHunterLevelListDrawableFusionDragonHero2232("no value for specified key");
                            }
                            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14393 = frostHunterSharedElementSpectraNeo25112.FrostHunterBundlePulseFusionHero2475;
                            FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder99164 = frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757;
                            iArr2 = iArr3;
                            int i26 = frostHunterSharedElementSpectraNeo25112.FrostHunterRemoteConfigSpeedSpeed8566;
                            jArr2 = jArr3;
                            FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22755 = frostHunterFirestoreEliteMasterThunder99164.FrostHunterCameraXPixelTurboCosmos9814;
                            i4 = i18;
                            Object[] objArr = frostHunterToastHyperTitanThunder22755.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            Object[] objArr2 = frostHunterToastHyperTitanThunder22755.FrostHunterBundlePulseFusionHero2475;
                            long[] jArr4 = frostHunterToastHyperTitanThunder22755.FrostHunterAlphaAnimationNeoCosmos5761;
                            i2 = i23;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14393;
                                i3 = i22;
                                int i27 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i27];
                                    frostHunterSharedElementSpectraNeo2511 = frostHunterSharedElementSpectraNeo25112;
                                    int i28 = i27;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            if ((j4 & 255) < 128) {
                                                int i31 = (i28 << 3) + i30;
                                                Object obj = objArr[i31];
                                                int i32 = length2;
                                                Object obj2 = objArr2[i31];
                                                frostHunterFirestoreEliteMasterThunder99162 = frostHunterFirestoreEliteMasterThunder99163;
                                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = (FrostHunterLiveDataScopeMaxSpark9882) obj;
                                                j = j4;
                                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98822 = FrostHunterBannerAdEliteStrike7333.FrostHunterResourcesTitanHyperVision5823;
                                                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98822) || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterTextViewDragonStormMega4297)) {
                                                    int size = arrayList5.size();
                                                    i8 = i30;
                                                    int i33 = 0;
                                                    while (true) {
                                                        if (i33 >= size) {
                                                            frostHunterShapeAppearanceUltraPhantom6821 = null;
                                                            break;
                                                        }
                                                        int i34 = size;
                                                        if (((FrostHunterShapeAppearanceUltraPhantom6821) arrayList5.get(i33)).FrostHunterCameraXPixelTurboCosmos9814 == i24) {
                                                            frostHunterShapeAppearanceUltraPhantom6821 = (FrostHunterShapeAppearanceUltraPhantom6821) arrayList5.get(i33);
                                                            break;
                                                        } else {
                                                            i33++;
                                                            size = i34;
                                                        }
                                                    }
                                                    if (frostHunterShapeAppearanceUltraPhantom6821 != null) {
                                                        z4 = false;
                                                    } else {
                                                        frostHunterShapeAppearanceUltraPhantom6821 = new FrostHunterShapeAppearanceUltraPhantom6821(i24, arrayList4);
                                                        z4 = true;
                                                    }
                                                    arrayList4.add(frostHunterShapeAppearanceUltraPhantom6821);
                                                } else {
                                                    i8 = i30;
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterToastHyperTitanThunder22754.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                                                    if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                                                        FrostHunterRemoteConfigSpeedSpeed8566 = null;
                                                    }
                                                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj2, FrostHunterRemoteConfigSpeedSpeed8566)) {
                                                        i9 = i24;
                                                        arrayList3 = arrayList5;
                                                        i7 = i29;
                                                        i10 = i25;
                                                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                        num3 = num6;
                                                        frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                        i11 = i32;
                                                    }
                                                }
                                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98823 = FrostHunterBannerAdEliteStrike7333.FrostHunterServiceEliteCelestialThunder1757;
                                                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98823)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    if (frostHunterToastHyperTitanThunder22754.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98823)) {
                                                        FrostHunterLooperHyperionForce4133(str2, i24, i25);
                                                    }
                                                    i9 = i24;
                                                    arrayList3 = arrayList5;
                                                    i7 = i29;
                                                    frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                    i10 = 8;
                                                    num3 = num6;
                                                    frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                    i11 = i32;
                                                } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterConstraintSetCloneMasterUltraRogue2633) || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterMeteringPointMegaCyber7955)) {
                                                    i9 = i24;
                                                    arrayList3 = arrayList5;
                                                    i7 = i29;
                                                    frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                    num3 = num6;
                                                    frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                    i11 = i32;
                                                    i10 = 8;
                                                    FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i9), 2048, 64, 8);
                                                    FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i9), 2048, num3, 8);
                                                } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterBundlePulseFusionHero2475)) {
                                                    FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i24), 2048, 64, 8);
                                                    FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i24), 2048, num6, 8);
                                                    i9 = i24;
                                                    arrayList3 = arrayList5;
                                                    i10 = 8;
                                                    i7 = i29;
                                                    frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                    num3 = num6;
                                                    frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                    i11 = i32;
                                                } else {
                                                    FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98824 = FrostHunterBannerAdEliteStrike7333.FrostHunterViewPhantomNeo1634;
                                                    arrayList3 = arrayList5;
                                                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98824)) {
                                                        Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterMotionSceneAuroraMega2271);
                                                        if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                                                            FrostHunterRemoteConfigSpeedSpeed85662 = null;
                                                        }
                                                        FrostHunterPoseDetectionThunderCosmos3414 frostHunterPoseDetectionThunderCosmos3414 = (FrostHunterPoseDetectionThunderCosmos3414) FrostHunterRemoteConfigSpeedSpeed85662;
                                                        if (frostHunterPoseDetectionThunderCosmos3414 != null && frostHunterPoseDetectionThunderCosmos3414.FrostHunterAlphaAnimationNeoCosmos5761 == 4) {
                                                            Object FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98824);
                                                            if (FrostHunterRemoteConfigSpeedSpeed85663 == null) {
                                                                FrostHunterRemoteConfigSpeedSpeed85663 = null;
                                                            }
                                                            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterRemoteConfigSpeedSpeed85663, Boolean.TRUE)) {
                                                                AccessibilityEvent FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextViewDragonStormMega4297(i24), 4);
                                                                FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25113 = frostHunterSharedElementSpectraNeo2511;
                                                                frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                                FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25114 = new FrostHunterSharedElementSpectraNeo2511(frostHunterSharedElementSpectraNeo25113.FrostHunterAlphaAnimationNeoCosmos5761, true, frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392, frostHunterFirestoreEliteMasterThunder99164);
                                                                Object FrostHunterRemoteConfigSpeedSpeed85664 = frostHunterSharedElementSpectraNeo25114.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761);
                                                                if (FrostHunterRemoteConfigSpeedSpeed85664 == null) {
                                                                    FrostHunterRemoteConfigSpeedSpeed85664 = null;
                                                                }
                                                                List list = (List) FrostHunterRemoteConfigSpeedSpeed85664;
                                                                frostHunterSharedElementSpectraNeo2511 = frostHunterSharedElementSpectraNeo25113;
                                                                String FrostHunterAlphaAnimationNeoCosmos5761 = list != null ? FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(list, ",", null, 62) : null;
                                                                Object FrostHunterRemoteConfigSpeedSpeed85665 = frostHunterSharedElementSpectraNeo25114.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterLooperHyperionForce4133);
                                                                if (FrostHunterRemoteConfigSpeedSpeed85665 == null) {
                                                                    FrostHunterRemoteConfigSpeedSpeed85665 = null;
                                                                }
                                                                List list2 = (List) FrostHunterRemoteConfigSpeedSpeed85665;
                                                                i7 = i29;
                                                                String FrostHunterAlphaAnimationNeoCosmos57612 = list2 != null ? FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(list2, ",", null, 62) : null;
                                                                if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                                                                    FrostHunterCameraXPixelTurboCosmos9814.setContentDescription(FrostHunterAlphaAnimationNeoCosmos5761);
                                                                }
                                                                if (FrostHunterAlphaAnimationNeoCosmos57612 != null) {
                                                                    FrostHunterCameraXPixelTurboCosmos9814.getText().add(FrostHunterAlphaAnimationNeoCosmos57612);
                                                                }
                                                                FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814);
                                                            } else {
                                                                i7 = i29;
                                                                frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                                FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i24), 2048, num6, 8);
                                                            }
                                                        } else {
                                                            i7 = i29;
                                                            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                            FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i24), 2048, 64, 8);
                                                            FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i24), 2048, num6, 8);
                                                        }
                                                    } else {
                                                        i7 = i29;
                                                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                            int FrostHunterTextViewDragonStormMega4297 = FrostHunterTextViewDragonStormMega4297(i24);
                                                            obj2.getClass();
                                                            FrostHunterBitmapTurboDeltaNebula8743(FrostHunterTextViewDragonStormMega4297, 2048, 4, (List) obj2);
                                                        } else {
                                                            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98825 = FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452;
                                                            String str3 = "";
                                                            if (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98825)) {
                                                                Integer num7 = num6;
                                                                i9 = i24;
                                                                frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98826 = FrostHunterBannerAdEliteStrike7333.FrostHunterCardViewSpectraCyber7714;
                                                                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98826)) {
                                                                    Object FrostHunterRemoteConfigSpeedSpeed85666 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98825);
                                                                    if (FrostHunterRemoteConfigSpeedSpeed85666 == null) {
                                                                        FrostHunterRemoteConfigSpeedSpeed85666 = null;
                                                                    }
                                                                    FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite4081 = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterRemoteConfigSpeedSpeed85666;
                                                                    if (frostHunterSnackbarHyperionMaxElite4081 != null && (str = frostHunterSnackbarHyperionMaxElite4081.FrostHunterFlowMaxDragonHero5809) != null) {
                                                                        str3 = str;
                                                                    }
                                                                    long j5 = ((FrostHunterServiceCelestialHyper2330) frostHunterFirestoreEliteMasterThunder99164.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98826)).FrostHunterAlphaAnimationNeoCosmos5761;
                                                                    num3 = num7;
                                                                    FrostHunterMotionSceneAuroraMega2271(FrostHunterAlertDialogAuroraDelta3200(FrostHunterTextViewDragonStormMega4297(i9), Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Integer.valueOf(str3.length()), FrostHunterMediaPlayerCelestialBetaTitan3868(str3)));
                                                                    FrostHunterMeteringPointBetaCyber9571(i26);
                                                                    i11 = i32;
                                                                    i10 = 8;
                                                                } else {
                                                                    i11 = i32;
                                                                    num3 = num7;
                                                                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98822) || FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterTextViewDragonStormMega4297)) {
                                                                        FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392);
                                                                        int size2 = arrayList4.size();
                                                                        int i35 = 0;
                                                                        while (true) {
                                                                            if (i35 >= size2) {
                                                                                frostHunterShapeAppearanceUltraPhantom68212 = null;
                                                                                break;
                                                                            } else {
                                                                                if (((FrostHunterShapeAppearanceUltraPhantom6821) arrayList4.get(i35)).FrostHunterCameraXPixelTurboCosmos9814 == i9) {
                                                                                    frostHunterShapeAppearanceUltraPhantom68212 = (FrostHunterShapeAppearanceUltraPhantom6821) arrayList4.get(i35);
                                                                                    break;
                                                                                }
                                                                                i35++;
                                                                            }
                                                                        }
                                                                        frostHunterShapeAppearanceUltraPhantom68212.getClass();
                                                                        Object FrostHunterRemoteConfigSpeedSpeed85667 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98822);
                                                                        if (FrostHunterRemoteConfigSpeedSpeed85667 == null) {
                                                                            FrostHunterRemoteConfigSpeedSpeed85667 = null;
                                                                        }
                                                                        frostHunterShapeAppearanceUltraPhantom68212.FrostHunterFragmentBetaMegaVortex6025 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) FrostHunterRemoteConfigSpeedSpeed85667;
                                                                        Object FrostHunterRemoteConfigSpeedSpeed85668 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterTextViewDragonStormMega4297);
                                                                        if (FrostHunterRemoteConfigSpeedSpeed85668 == null) {
                                                                            FrostHunterRemoteConfigSpeedSpeed85668 = null;
                                                                        }
                                                                        frostHunterShapeAppearanceUltraPhantom68212.FrostHunterServiceConnectionTurboPhoenixOmega6719 = (FrostHunterProcessCameraProviderTitaniumNeoNova1860) FrostHunterRemoteConfigSpeedSpeed85668;
                                                                        if (frostHunterShapeAppearanceUltraPhantom68212.FrostHunterFlowMaxDragonHero5809.contains(frostHunterShapeAppearanceUltraPhantom68212)) {
                                                                            this.FrostHunterServiceEliteCelestialThunder1757.getSnapshotObserver().FrostHunterAlphaAnimationNeoCosmos5761(frostHunterShapeAppearanceUltraPhantom68212, this.FrostHunterPermissionInfoAlphaDelta6279, new FrostHunterColorDrawableGammaPulseNeo6855(1, frostHunterShapeAppearanceUltraPhantom68212, this));
                                                                        }
                                                                        i10 = 8;
                                                                    } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, FrostHunterBannerAdEliteStrike7333.FrostHunterKeyframeGammaGamma1197)) {
                                                                        obj2.getClass();
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            i12 = 8;
                                                                            FrostHunterMotionSceneAuroraMega2271(FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextViewDragonStormMega4297(i26), 8));
                                                                        } else {
                                                                            i12 = 8;
                                                                        }
                                                                        FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i26), 2048, num3, i12);
                                                                        i10 = i12;
                                                                    } else {
                                                                        FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98827 = FrostHunterDialogVortexNeoUltra2659.FrostHunterLooperThreadBetaHyperionMax1000;
                                                                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterLiveDataScopeMaxSpark9882, frostHunterLiveDataScopeMaxSpark98827)) {
                                                                            List list3 = (List) frostHunterFirestoreEliteMasterThunder99164.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98827);
                                                                            Object FrostHunterRemoteConfigSpeedSpeed85669 = frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98827);
                                                                            if (FrostHunterRemoteConfigSpeedSpeed85669 == null) {
                                                                                FrostHunterRemoteConfigSpeedSpeed85669 = null;
                                                                            }
                                                                            List list4 = (List) FrostHunterRemoteConfigSpeedSpeed85669;
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                if (list3.size() > 0) {
                                                                                    list3.get(0).getClass();
                                                                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                                                                                    return;
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                if (list4.size() > 0) {
                                                                                    list4.get(0).getClass();
                                                                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                                                                                    return;
                                                                                }
                                                                                z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                                            }
                                                                            i10 = 8;
                                                                        } else {
                                                                            if (obj2 instanceof FrostHunterContextGammaSolar6144) {
                                                                                FrostHunterContextGammaSolar6144 frostHunterContextGammaSolar6144 = (FrostHunterContextGammaSolar6144) obj2;
                                                                                Object FrostHunterRemoteConfigSpeedSpeed856610 = frostHunterToastHyperTitanThunder22752.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                                                                                if (FrostHunterRemoteConfigSpeedSpeed856610 == null) {
                                                                                    FrostHunterRemoteConfigSpeedSpeed856610 = null;
                                                                                }
                                                                                if (frostHunterContextGammaSolar6144 != FrostHunterRemoteConfigSpeedSpeed856610) {
                                                                                    if (FrostHunterRemoteConfigSpeedSpeed856610 instanceof FrostHunterContextGammaSolar6144) {
                                                                                        String str4 = frostHunterContextGammaSolar6144.FrostHunterAlphaAnimationNeoCosmos5761;
                                                                                        FrostHunterContextGammaSolar6144 frostHunterContextGammaSolar61442 = (FrostHunterContextGammaSolar6144) FrostHunterRemoteConfigSpeedSpeed856610;
                                                                                        FrostHunterFontFamilyTitanDragonThunder7606 frostHunterFontFamilyTitanDragonThunder7606 = frostHunterContextGammaSolar61442.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                                                        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(str4, frostHunterContextGammaSolar61442.FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                                            FrostHunterFontFamilyTitanDragonThunder7606 frostHunterFontFamilyTitanDragonThunder76062 = frostHunterContextGammaSolar6144.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                                                            if (frostHunterFontFamilyTitanDragonThunder76062 == null) {
                                                                                            }
                                                                                            if (frostHunterFontFamilyTitanDragonThunder76062 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    z5 = false;
                                                                                    if (z5) {
                                                                                        z2 = false;
                                                                                        i10 = 8;
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                if (z5) {
                                                                                }
                                                                            }
                                                                            z2 = true;
                                                                            i10 = 8;
                                                                        }
                                                                    }
                                                                }
                                                            } else if (frostHunterToastHyperTitanThunder22755.FrostHunterBundlePulseFusionHero2475(FrostHunterDialogVortexNeoUltra2659.FrostHunterFlowMaxDragonHero5809)) {
                                                                Object FrostHunterRemoteConfigSpeedSpeed856611 = frostHunterToastHyperTitanThunder22754.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98825);
                                                                if (FrostHunterRemoteConfigSpeedSpeed856611 == null) {
                                                                    FrostHunterRemoteConfigSpeedSpeed856611 = null;
                                                                }
                                                                FrostHunterSnackbarHyperionMaxElite4081 frostHunterSnackbarHyperionMaxElite40812 = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterRemoteConfigSpeedSpeed856611;
                                                                if (frostHunterSnackbarHyperionMaxElite40812 == null) {
                                                                    frostHunterSnackbarHyperionMaxElite40812 = "";
                                                                }
                                                                Object FrostHunterRemoteConfigSpeedSpeed856612 = frostHunterToastHyperTitanThunder22755.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark98825);
                                                                if (FrostHunterRemoteConfigSpeedSpeed856612 == null) {
                                                                    FrostHunterRemoteConfigSpeedSpeed856612 = null;
                                                                }
                                                                CharSequence charSequence = (FrostHunterSnackbarHyperionMaxElite4081) FrostHunterRemoteConfigSpeedSpeed856612;
                                                                if (charSequence == null) {
                                                                    charSequence = "";
                                                                }
                                                                CharSequence FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterMediaPlayerCelestialBetaTitan3868(charSequence);
                                                                int length3 = frostHunterSnackbarHyperionMaxElite40812.length();
                                                                int length4 = charSequence.length();
                                                                int i36 = length3 > length4 ? length4 : length3;
                                                                Integer num8 = num6;
                                                                int i37 = 0;
                                                                while (true) {
                                                                    i13 = length3;
                                                                    if (i37 >= i36) {
                                                                        i14 = length4;
                                                                        break;
                                                                    }
                                                                    i14 = length4;
                                                                    if (frostHunterSnackbarHyperionMaxElite40812.charAt(i37) != charSequence.charAt(i37)) {
                                                                        break;
                                                                    }
                                                                    i37++;
                                                                    length3 = i13;
                                                                    length4 = i14;
                                                                }
                                                                int i38 = 0;
                                                                while (true) {
                                                                    if (i38 >= i36 - i37) {
                                                                        i15 = i38;
                                                                        break;
                                                                    }
                                                                    i15 = i38;
                                                                    if (frostHunterSnackbarHyperionMaxElite40812.charAt((i13 - 1) - i38) != charSequence.charAt((i14 - 1) - i15)) {
                                                                        break;
                                                                    } else {
                                                                        i38 = i15 + 1;
                                                                    }
                                                                }
                                                                int i39 = (i13 - i15) - i37;
                                                                int i40 = (i14 - i15) - i37;
                                                                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark98828 = FrostHunterBannerAdEliteStrike7333.FrostHunterBillingClientFusionVortex9008;
                                                                boolean FrostHunterBundlePulseFusionHero2475 = frostHunterToastHyperTitanThunder22754.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98828);
                                                                boolean FrostHunterBundlePulseFusionHero24752 = frostHunterToastHyperTitanThunder22755.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark98828);
                                                                boolean FrostHunterBundlePulseFusionHero24753 = frostHunterToastHyperTitanThunder22754.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterDatabaseEliteShadowUltra2452);
                                                                boolean z6 = FrostHunterBundlePulseFusionHero24753 && !FrostHunterBundlePulseFusionHero2475 && FrostHunterBundlePulseFusionHero24752;
                                                                boolean z7 = FrostHunterBundlePulseFusionHero24753 && FrostHunterBundlePulseFusionHero2475 && !FrostHunterBundlePulseFusionHero24752;
                                                                if (z6 || z7) {
                                                                    frostHunterToastHyperTitanThunder22753 = frostHunterToastHyperTitanThunder22754;
                                                                    i9 = i24;
                                                                    num4 = num8;
                                                                    FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlertDialogAuroraDelta3200(FrostHunterTextViewDragonStormMega4297(i24), num4, num8, Integer.valueOf(i14), FrostHunterMediaPlayerCelestialBetaTitan3868);
                                                                } else {
                                                                    frostHunterToastHyperTitanThunder22753 = frostHunterToastHyperTitanThunder22754;
                                                                    FrostHunterAlertDialogAuroraDelta3200 = FrostHunterCameraXPixelTurboCosmos9814(FrostHunterTextViewDragonStormMega4297(i24), 16);
                                                                    FrostHunterAlertDialogAuroraDelta3200.setFromIndex(i37);
                                                                    FrostHunterAlertDialogAuroraDelta3200.setRemovedCount(i39);
                                                                    FrostHunterAlertDialogAuroraDelta3200.setAddedCount(i40);
                                                                    FrostHunterAlertDialogAuroraDelta3200.setBeforeText(frostHunterSnackbarHyperionMaxElite40812);
                                                                    FrostHunterAlertDialogAuroraDelta3200.getText().add(FrostHunterMediaPlayerCelestialBetaTitan3868);
                                                                    i9 = i24;
                                                                    num4 = num8;
                                                                }
                                                                FrostHunterAlertDialogAuroraDelta3200.setClassName("android.widget.EditText");
                                                                FrostHunterMotionSceneAuroraMega2271(FrostHunterAlertDialogAuroraDelta3200);
                                                                if (z6 || z7) {
                                                                    long j6 = ((FrostHunterServiceCelestialHyper2330) frostHunterFirestoreEliteMasterThunder99164.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterCardViewSpectraCyber7714)).FrostHunterAlphaAnimationNeoCosmos5761;
                                                                    num5 = num4;
                                                                    FrostHunterAlertDialogAuroraDelta3200.setFromIndex((int) (j6 >> 32));
                                                                    FrostHunterAlertDialogAuroraDelta3200.setToIndex((int) (j6 & 4294967295L));
                                                                    FrostHunterMotionSceneAuroraMega2271(FrostHunterAlertDialogAuroraDelta3200);
                                                                } else {
                                                                    num5 = num4;
                                                                }
                                                                i11 = i32;
                                                                num3 = num5;
                                                                frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22753;
                                                                i10 = 8;
                                                            } else {
                                                                Integer num9 = num6;
                                                                i9 = i24;
                                                                FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i9), 2048, Integer.valueOf(i19), 8);
                                                                i10 = 8;
                                                                i11 = i32;
                                                                num3 = num9;
                                                                frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                            }
                                                        }
                                                    }
                                                    num3 = num6;
                                                    i9 = i24;
                                                    frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                    i11 = i32;
                                                    i10 = 8;
                                                }
                                            } else {
                                                frostHunterFirestoreEliteMasterThunder99162 = frostHunterFirestoreEliteMasterThunder99163;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i7 = i29;
                                                i8 = i30;
                                                frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                                num3 = num6;
                                                i9 = i24;
                                                frostHunterToastHyperTitanThunder22752 = frostHunterToastHyperTitanThunder22754;
                                                i10 = i25;
                                                i11 = length2;
                                            }
                                            long j7 = j >> i10;
                                            i25 = i10;
                                            i24 = i9;
                                            frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392;
                                            i30 = i8 + 1;
                                            length2 = i11;
                                            j4 = j7;
                                            num6 = num3;
                                            frostHunterToastHyperTitanThunder22754 = frostHunterToastHyperTitanThunder22752;
                                            i29 = i7;
                                            frostHunterFirestoreEliteMasterThunder99163 = frostHunterFirestoreEliteMasterThunder99162;
                                            arrayList5 = arrayList3;
                                        }
                                        i5 = i24;
                                        frostHunterFirestoreEliteMasterThunder9916 = frostHunterFirestoreEliteMasterThunder99163;
                                        arrayList2 = arrayList5;
                                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                        z = true;
                                        num2 = num6;
                                        i6 = length2;
                                        int i41 = i29;
                                        frostHunterToastHyperTitanThunder2275 = frostHunterToastHyperTitanThunder22754;
                                        if (i41 != i25) {
                                            break;
                                        }
                                    } else {
                                        i5 = i24;
                                        frostHunterFirestoreEliteMasterThunder9916 = frostHunterFirestoreEliteMasterThunder99163;
                                        frostHunterToastHyperTitanThunder2275 = frostHunterToastHyperTitanThunder22754;
                                        arrayList2 = arrayList5;
                                        frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394;
                                        z = true;
                                        num2 = num6;
                                        i6 = length2;
                                    }
                                    if (i28 == i6) {
                                        break;
                                    }
                                    i24 = i5;
                                    frostHunterToastHyperTitanThunder22754 = frostHunterToastHyperTitanThunder2275;
                                    frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14394 = frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
                                    frostHunterSharedElementSpectraNeo25112 = frostHunterSharedElementSpectraNeo2511;
                                    frostHunterFirestoreEliteMasterThunder99163 = frostHunterFirestoreEliteMasterThunder9916;
                                    i25 = 8;
                                    i27 = i28 + 1;
                                    length2 = i6;
                                    num6 = num2;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                frostHunterFirestoreEliteMasterThunder9916 = frostHunterFirestoreEliteMasterThunder99163;
                                arrayList2 = arrayList5;
                                i3 = i22;
                                frostHunterSharedElementSpectraNeo2511 = frostHunterSharedElementSpectraNeo25112;
                                z = true;
                                num2 = num6;
                                i5 = i24;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = frostHunterFirestoreEliteMasterThunder9916.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!frostHunterSharedElementSpectraNeo2511.FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475((FrostHunterLiveDataScopeMaxSpark9882) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i21 = 8;
                                FrostHunterDialogFragmentTurboPhoenixDragon7627(this, FrostHunterTextViewDragonStormMega4297(i5), 2048, num2, 8);
                            } else {
                                i21 = 8;
                            }
                            j3 >>= i21;
                            i23 = i2 + 1;
                            frostHunterDiffUtilPhoenixNovaXBeta57282 = frostHunterDiffUtilPhoenixNovaXBeta5728;
                            num6 = num2;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i18 = i4;
                            i22 = i3;
                            arrayList5 = arrayList2;
                        }
                    }
                    i2 = i23;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i22;
                    i4 = i18;
                    num2 = num6;
                    j3 >>= i21;
                    i23 = i2 + 1;
                    frostHunterDiffUtilPhoenixNovaXBeta57282 = frostHunterDiffUtilPhoenixNovaXBeta5728;
                    num6 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i18 = i4;
                    i22 = i3;
                    arrayList5 = arrayList2;
                }
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i42 = i18;
                num = num6;
                if (i22 != i21) {
                    return;
                } else {
                    i = i42;
                }
            } else {
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num = num6;
                i = i18;
            }
            if (i == i20) {
                return;
            }
            i18 = i + 1;
            frostHunterDiffUtilPhoenixNovaXBeta57282 = frostHunterDiffUtilPhoenixNovaXBeta5728;
            length = i20;
            num6 = num;
            i16 = i19;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            i17 = 0;
        }
    }

    public final int FrostHunterTextViewDragonStormMega4297(int i) {
        if (i == this.FrostHunterServiceEliteCelestialThunder1757.getSemanticsOwner().FrostHunterAlphaAnimationNeoCosmos5761().FrostHunterRemoteConfigSpeedSpeed8566) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FrostHunterTranslateAnimationCyberSolarUltra7101() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue2910 = new FrostHunterVectorDrawableVortexTitanRogue2910();
        FrostHunterVectorDrawableVortexTitanRogue2910 frostHunterVectorDrawableVortexTitanRogue29102 = this.FrostHunterCardViewSpectraCyber7714;
        int[] iArr = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr3 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761;
        int length = jArr3.length - 2;
        FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = this.FrostHunterStateCelestialNovaPixel8414;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            FrostHunterRecyclerViewInfernoPhantomSpark2260 frostHunterRecyclerViewInfernoPhantomSpark2260 = (FrostHunterRecyclerViewInfernoPhantomSpark2260) FrostHunterServiceConnectionTurboPhoenixOmega6719().FrostHunterConstraintSetCloneMasterUltraRogue2633(i8);
                            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = frostHunterRecyclerViewInfernoPhantomSpark2260 != null ? frostHunterRecyclerViewInfernoPhantomSpark2260.FrostHunterAlphaAnimationNeoCosmos5761 : null;
                            if (frostHunterSharedElementSpectraNeo2511 != null) {
                                if (frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterServiceEliteCelestialThunder1757)) {
                                }
                            }
                            frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterAlphaAnimationNeoCosmos5761(i8);
                            FrostHunterMotionLayoutNeoShadow3871 frostHunterMotionLayoutNeoShadow3871 = (FrostHunterMotionLayoutNeoShadow3871) frostHunterContentResolverEpicBetaOlympian4466.FrostHunterConstraintSetCloneMasterUltraRogue2633(i8);
                            if (frostHunterMotionLayoutNeoShadow3871 != null) {
                                Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterMotionLayoutNeoShadow3871.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterBannerAdEliteStrike7333.FrostHunterServiceEliteCelestialThunder1757);
                                r23 = FrostHunterRemoteConfigSpeedSpeed8566 != 0 ? FrostHunterRemoteConfigSpeedSpeed8566 : null;
                            }
                            FrostHunterLooperHyperionForce4133(r23, i8, 32);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        long[] jArr4 = frostHunterVectorDrawableVortexTitanRogue2910.FrostHunterAlphaAnimationNeoCosmos5761;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterBundlePulseFusionHero2475;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterConstraintSetCloneMasterUltraRogue2633[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterLevelListDrawableFusionDragonHero2232(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        frostHunterContentResolverEpicBetaOlympian4466.FrostHunterBundlePulseFusionHero2475();
        FrostHunterDiffUtilPhoenixNovaXBeta5728 FrostHunterServiceConnectionTurboPhoenixOmega6719 = FrostHunterServiceConnectionTurboPhoenixOmega6719();
        int[] iArr3 = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object[] objArr = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterBundlePulseFusionHero2475;
        long[] jArr6 = FrostHunterServiceConnectionTurboPhoenixOmega6719.FrostHunterAlphaAnimationNeoCosmos5761;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112 = ((FrostHunterRecyclerViewInfernoPhantomSpark2260) objArr[i26]).FrostHunterAlphaAnimationNeoCosmos5761;
                            FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757;
                            FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterServiceEliteCelestialThunder1757;
                            if (frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882) && frostHunterVectorDrawableVortexTitanRogue29102.FrostHunterAlphaAnimationNeoCosmos5761(i27)) {
                                FrostHunterLooperHyperionForce4133((String) frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757.FrostHunterBundlePulseFusionHero2475(frostHunterLiveDataScopeMaxSpark9882), i27, 16);
                            }
                            frostHunterContentResolverEpicBetaOlympian4466.FrostHunterRemoteConfigSpeedSpeed8566(i27, new FrostHunterMotionLayoutNeoShadow3871(frostHunterSharedElementSpectraNeo25112, FrostHunterServiceConnectionTurboPhoenixOmega6719()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterMotionLayoutNeoShadow3871(this.FrostHunterServiceEliteCelestialThunder1757.getSemanticsOwner().FrostHunterAlphaAnimationNeoCosmos5761(), FrostHunterServiceConnectionTurboPhoenixOmega6719());
    }
}
