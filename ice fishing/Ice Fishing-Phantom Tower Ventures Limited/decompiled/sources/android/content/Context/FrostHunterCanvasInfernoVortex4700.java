package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import com.adjust.sdk.Constants;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterCanvasInfernoVortex4700 {
    public static final FrostHunterTraceHyperionAuroraNebula9947 FrostHunterBundlePulseFusionHero2475;
    public static boolean FrostHunterCameraXPixelTurboCosmos9814 = false;
    public static Method FrostHunterFlowMaxDragonHero5809 = null;
    public static final long FrostHunterLevelListDrawableFusionDragonHero2232 = Long.MIN_VALUE;
    public static final /* synthetic */ int FrostHunterRemoteConfigSpeedSpeed8566 = 0;
    public static FrostHunterTraceHyperionAuroraNebula9947 FrostHunterServiceEliteCelestialThunder1757;
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterWorkManagerMaxTurbo1858("RESUME_TOKEN", 3);
    public static final FrostHunterExoPlayerForceNeoGamma8294 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterExoPlayerForceNeoGamma8294();
    public static final FrostHunterClipDrawableFusionNovaXNova3326 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterClipDrawableFusionNovaXNova3326(1);

    static {
        Object obj = null;
        FrostHunterBundlePulseFusionHero2475 = new FrostHunterTraceHyperionAuroraNebula9947(obj, obj, obj, 27);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface FrostHunterAlertDialogAuroraDelta3200(FrostHunterAudioManagerVisionLegendOlympian2455 frostHunterAudioManagerVisionLegendOlympian2455, Context context) {
        int i = FrostHunterJobSchedulerPixelBeta4864.FrostHunterAlphaAnimationNeoCosmos5761;
        Typeface typeface = null;
        if (!context.isRestricted()) {
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            resources.getValue(R.font.frost_font, typedValue, true);
            CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(R.font.frost_font) + "\" (" + Integer.toHexString(R.font.frost_font) + ") is not a Font: " + typedValue);
            }
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                int i2 = typedValue.assetCookie;
                FrostHunterVectorDrawablePulseMaxStorm8774 frostHunterVectorDrawablePulseMaxStorm8774 = FrostHunterConstraintLayoutHyperDelta1865.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                Typeface typeface2 = (Typeface) frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintLayoutHyperDelta1865.FrostHunterConstraintSetCloneMasterUltraRogue2633(resources, charSequence2, i2));
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            FrostHunterInAppPurchaseAlphaCyberNeo4980 FrostHunterTransitionListenerPulseVortexCosmos7949 = FrostHunterTransitionListenerPulseVortexCosmos7949(resources.getXml(R.font.frost_font), resources);
                            if (FrostHunterTransitionListenerPulseVortexCosmos7949 != null) {
                                typeface = FrostHunterConstraintLayoutHyperDelta1865.FrostHunterAlphaAnimationNeoCosmos5761(context, FrostHunterTransitionListenerPulseVortexCosmos7949, resources, charSequence2, typedValue.assetCookie, null);
                            }
                        } else {
                            int i3 = typedValue.assetCookie;
                            Typeface FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterConstraintLayoutHyperDelta1865.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889(context, resources, charSequence2);
                            if (FrostHunterLifecycleBlazeGammaElite28892 != null) {
                                frostHunterVectorDrawablePulseMaxStorm8774.FrostHunterServiceEliteCelestialThunder1757(FrostHunterConstraintLayoutHyperDelta1865.FrostHunterConstraintSetCloneMasterUltraRogue2633(resources, charSequence2, i3), FrostHunterLifecycleBlazeGammaElite28892);
                            }
                            typeface = FrostHunterLifecycleBlazeGammaElite28892;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                    }
                }
                if (typeface == null) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(R.font.frost_font) + " could not be retrieved.");
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        }
        typeface.getClass();
        return typeface;
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-932836462);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 4 : 2) | i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime5473) ? 32 : 16);
        int i3 = 0;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 19) != 18)) {
            FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse8068, androidx.compose.ui.draw.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterCombineBlazeLegendGamma9228, frostHunterCombineLegendMegaPrime5473));
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterCameraXNebulaHyperBeta8411(frostHunterCombineBlazeLegendGamma9228, frostHunterCombineLegendMegaPrime5473, i, i3);
        }
    }

    public static int FrostHunterAnnotationProcessorSparkEclipse8710(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int FrostHunterBillingClientFusionVortex9008(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i + ", " + i2 + ")");
    }

    public static void FrostHunterBitmapTurboDeltaNebula8743(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterKeyframeGammaGamma1197("startIndex: ", i, ", endIndex: ", i2, i3);
        } else {
            if (i <= i2) {
                return;
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrostHunterBundlePulseFusionHero2475(FrostHunterSharedPreferencesVortexDelta8576[] frostHunterSharedPreferencesVortexDelta8576Arr, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        FrostHunterFlingGestureFusionBlaze2826 FrostHunterSoundPoolNovaTitanTitan5784;
        boolean z;
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(415205898);
        FrostHunterPermissionInfoTurboCelestial3934 frostHunterPermissionInfoTurboCelestial3934 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBitmapTurboDeltaNebula8743;
        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRewardedAdSpectraElite8288(201, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
            FrostHunterSoundPoolNovaTitanTitan5784 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterFragmentBetaMegaVortex6025, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRunnableCosmosCelestial4235(frostHunterSharedPreferencesVortexDelta8576Arr, FrostHunterFragmentBetaMegaVortex6025, FrostHunterFlingGestureFusionBlaze2826.FrostHunterKeyframeGammaGamma1197));
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101 = true;
        } else {
            FrostHunterKeyEventForceSparkSpeed5603 frostHunterKeyEventForceSparkSpeed5603 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointMegaCyber7955;
            Object FrostHunterCameraXPixelTurboCosmos98142 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterCameraXPixelTurboCosmos9814(frostHunterKeyEventForceSparkSpeed5603.FrostHunterRemoteConfigSpeedSpeed8566, 0);
            FrostHunterCameraXPixelTurboCosmos98142.getClass();
            FrostHunterFlingGestureFusionBlaze2826 frostHunterFlingGestureFusionBlaze2826 = (FrostHunterFlingGestureFusionBlaze2826) FrostHunterCameraXPixelTurboCosmos98142;
            FrostHunterKeyEventForceSparkSpeed5603 frostHunterKeyEventForceSparkSpeed56032 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointMegaCyber7955;
            Object FrostHunterCameraXPixelTurboCosmos98143 = frostHunterKeyEventForceSparkSpeed56032.FrostHunterCameraXPixelTurboCosmos9814(frostHunterKeyEventForceSparkSpeed56032.FrostHunterRemoteConfigSpeedSpeed8566, 1);
            FrostHunterCameraXPixelTurboCosmos98143.getClass();
            FrostHunterFlingGestureFusionBlaze2826 frostHunterFlingGestureFusionBlaze28262 = (FrostHunterFlingGestureFusionBlaze2826) FrostHunterCameraXPixelTurboCosmos98143;
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterRunnableCosmosCelestial4235 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRunnableCosmosCelestial4235(frostHunterSharedPreferencesVortexDelta8576Arr, FrostHunterFragmentBetaMegaVortex6025, frostHunterFlingGestureFusionBlaze28262);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointBetaCyber9571() && !frostHunterDialogFragmentPhantomEclipse8068.FrostHunterDialogFragmentTurboPhoenixDragon7627 && frostHunterFlingGestureFusionBlaze28262.equals(FrostHunterRunnableCosmosCelestial4235)) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointMegaCyber7955.FrostHunterResourcesTitanHyperVision5823() + frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197;
                FrostHunterSoundPoolNovaTitanTitan5784 = frostHunterFlingGestureFusionBlaze2826;
            } else {
                FrostHunterSoundPoolNovaTitanTitan5784 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterSoundPoolNovaTitanTitan5784(FrostHunterFragmentBetaMegaVortex6025, FrostHunterRunnableCosmosCelestial4235);
                if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterDialogFragmentTurboPhoenixDragon7627 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterSoundPoolNovaTitanTitan5784, frostHunterFlingGestureFusionBlaze2826)) {
                    z = true;
                    if (z && !frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterSoundPoolNovaTitanTitan5784);
                    }
                    frostHunterPermissionInfoTurboCelestial3934.FrostHunterBundlePulseFusionHero2475(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 ? 1 : 0);
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = z;
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = FrostHunterSoundPoolNovaTitanTitan5784;
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752(202, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475, 0, FrostHunterSoundPoolNovaTitanTitan5784);
                    frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, Integer.valueOf((i >> 3) & 14));
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = frostHunterPermissionInfoTurboCelestial3934.FrostHunterConstraintSetCloneMasterUltraRogue2633() != 0;
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = null;
                    FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
                    if (FrostHunterResourcesTitanHyperVision5823 == null) {
                        FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterVibratorMasterForceAurora2932(i, 2, frostHunterSharedPreferencesVortexDelta8576Arr, frostHunterFontFamilyNeoBetaEpic8574);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterSoundPoolNovaTitanTitan5784);
        }
        frostHunterPermissionInfoTurboCelestial3934.FrostHunterBundlePulseFusionHero2475(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 ? 1 : 0);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = z;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = FrostHunterSoundPoolNovaTitanTitan5784;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752(202, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475, 0, FrostHunterSoundPoolNovaTitanTitan5784);
        frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, Integer.valueOf((i >> 3) & 14));
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = frostHunterPermissionInfoTurboCelestial3934.FrostHunterConstraintSetCloneMasterUltraRogue2633() != 0;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = null;
        FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 == null) {
        }
    }

    public static final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo8770, FrostHunterJobIntentServiceSpectraBlaze2155 frostHunterJobIntentServiceSpectraBlaze2155, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        int i2;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(228371534);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationSpectraTurbo8770) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterJobIntentServiceSpectraBlaze2155) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime5473) ? 256 : 128;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterJobIntentServiceSpectraBlaze2155) | ((i2 & 896) == 256) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationSpectraTurbo8770);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterPagingDataAuroraSpark1825(frostHunterNotificationSpectraTurbo8770, frostHunterJobIntentServiceSpectraBlaze2155, frostHunterCombineLegendMegaPrime5473, i3);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterLifecycleBlazeGammaElite2889(frostHunterNotificationSpectraTurbo8770, frostHunterJobIntentServiceSpectraBlaze2155, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium8202, frostHunterDialogFragmentPhantomEclipse8068);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterBillingClientCosmosSpark7312(frostHunterNotificationSpectraTurbo8770, frostHunterJobIntentServiceSpectraBlaze2155, frostHunterCombineLegendMegaPrime5473, i, 1);
        }
    }

    public static void FrostHunterCameraXTurboCelestialHero5430(String str, boolean z) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(str);
    }

    public static void FrostHunterCardViewSpectraCyber7714(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterKeyframeGammaGamma1197("fromIndex: ", i, ", toIndex: ", i2, i3);
        } else {
            if (i <= i2) {
                return;
            }
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final Map FrostHunterColorDrawableLegendPhoenixVision7927(Map map) {
        int size = map.size();
        if (size == 0) {
            return FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterAlphaAnimationNovaGamma6326(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final List FrostHunterColorStateListInflaterNovaQuantum4229(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(FrostHunterStrictModeNebulaTitanPrime4338.FrostHunterNavigationViewMasterVortexBeta1295(list)) : FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterSharedPreferencesVortexDelta8576 frostHunterSharedPreferencesVortexDelta8576, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        FrostHunterStateListAnimatorCelestialBetaStrike3817 frostHunterStateListAnimatorCelestialBetaStrike3817;
        boolean z;
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-149765515);
        FrostHunterPermissionInfoTurboCelestial3934 frostHunterPermissionInfoTurboCelestial3934 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBitmapTurboDeltaNebula8743;
        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRewardedAdSpectraElite8288(201, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(FrostHunterMagnetometerFusionTitanium8202, FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761)) {
            frostHunterStateListAnimatorCelestialBetaStrike3817 = null;
        } else {
            FrostHunterMagnetometerFusionTitanium8202.getClass();
            frostHunterStateListAnimatorCelestialBetaStrike3817 = (FrostHunterStateListAnimatorCelestialBetaStrike3817) FrostHunterMagnetometerFusionTitanium8202;
        }
        FrostHunterVideoCaptureMaxPulseSpectra7535 frostHunterVideoCaptureMaxPulseSpectra7535 = frostHunterSharedPreferencesVortexDelta8576.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterStateListAnimatorCelestialBetaStrike3817 FrostHunterBundlePulseFusionHero24752 = frostHunterVideoCaptureMaxPulseSpectra7535.FrostHunterBundlePulseFusionHero2475(frostHunterSharedPreferencesVortexDelta8576, frostHunterStateListAnimatorCelestialBetaStrike3817);
        boolean equals = FrostHunterBundlePulseFusionHero24752.equals(frostHunterStateListAnimatorCelestialBetaStrike3817);
        if (!equals) {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterBundlePulseFusionHero24752);
        }
        int i2 = 1;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
            if (frostHunterSharedPreferencesVortexDelta8576.FrostHunterLevelListDrawableFusionDragonHero2232 || !FrostHunterFragmentBetaMegaVortex6025.containsKey(frostHunterVideoCaptureMaxPulseSpectra7535)) {
                FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVideoCaptureMaxPulseSpectra7535, FrostHunterBundlePulseFusionHero24752);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101 = true;
        } else {
            FrostHunterKeyEventForceSparkSpeed5603 frostHunterKeyEventForceSparkSpeed5603 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointMegaCyber7955;
            Object FrostHunterConstraintSetCloneMasterUltraRogue26332 = frostHunterKeyEventForceSparkSpeed5603.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterKeyEventForceSparkSpeed5603.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterKeyEventForceSparkSpeed5603.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            FrostHunterConstraintSetCloneMasterUltraRogue26332.getClass();
            FrostHunterFlingGestureFusionBlaze2826 frostHunterFlingGestureFusionBlaze2826 = (FrostHunterFlingGestureFusionBlaze2826) FrostHunterConstraintSetCloneMasterUltraRogue26332;
            if (!(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMeteringPointBetaCyber9571() && equals) && (frostHunterSharedPreferencesVortexDelta8576.FrostHunterLevelListDrawableFusionDragonHero2232 || !FrostHunterFragmentBetaMegaVortex6025.containsKey(frostHunterVideoCaptureMaxPulseSpectra7535))) {
                FrostHunterFragmentBetaMegaVortex6025 = FrostHunterFragmentBetaMegaVortex6025.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterVideoCaptureMaxPulseSpectra7535, FrostHunterBundlePulseFusionHero24752);
            } else if ((equals && !frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271) || !frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271) {
                FrostHunterFragmentBetaMegaVortex6025 = frostHunterFlingGestureFusionBlaze2826;
            }
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterDialogFragmentTurboPhoenixDragon7627 || frostHunterFlingGestureFusionBlaze2826 != FrostHunterFragmentBetaMegaVortex6025) {
                z = true;
                if (z && !frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterFragmentBetaMegaVortex6025);
                }
                frostHunterPermissionInfoTurboCelestial3934.FrostHunterBundlePulseFusionHero2475(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 ? 1 : 0);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = z;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = FrostHunterFragmentBetaMegaVortex6025;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752(202, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475, 0, FrostHunterFragmentBetaMegaVortex6025);
                frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, Integer.valueOf((i >> 3) & 14));
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = frostHunterPermissionInfoTurboCelestial3934.FrostHunterConstraintSetCloneMasterUltraRogue2633() != 0;
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = null;
                FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
                if (FrostHunterResourcesTitanHyperVision5823 == null) {
                    FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterVibratorMasterForceAurora2932(i, i2, frostHunterSharedPreferencesVortexDelta8576, frostHunterFontFamilyNeoBetaEpic8574);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTranslateAnimationCyberSolarUltra7101(FrostHunterFragmentBetaMegaVortex6025);
        }
        frostHunterPermissionInfoTurboCelestial3934.FrostHunterBundlePulseFusionHero2475(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 ? 1 : 0);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = z;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = FrostHunterFragmentBetaMegaVortex6025;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752(202, FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475, 0, FrostHunterFragmentBetaMegaVortex6025);
        frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, Integer.valueOf((i >> 3) & 14));
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMotionSceneAuroraMega2271 = frostHunterPermissionInfoTurboCelestial3934.FrostHunterConstraintSetCloneMasterUltraRogue2633() != 0;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterStateCelestialNovaPixel8414 = null;
        FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 == null) {
        }
    }

    public static void FrostHunterConstraintSetCloneOmegaHyperion9304(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static void FrostHunterDatabaseEliteShadowUltra2452(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? FrostHunterServiceConnectionTurboPhoenixOmega6719("start index", i, i3) : (i2 < 0 || i2 > i3) ? FrostHunterServiceConnectionTurboPhoenixOmega6719("end index", i2, i3) : FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void FrostHunterDialogFragmentTurboPhoenixDragon7627(int i, int i2) {
        String FrostHunterRemoteConfigSpeedSpeed85662;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("negative size: ", i2));
                    return;
                }
                FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(FrostHunterRemoteConfigSpeedSpeed85662);
        }
    }

    public static void FrostHunterEditTextPulseHyperion1262(int i, int i2) {
        if (i < 0 || i > i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterServiceConnectionTurboPhoenixOmega6719("index", i, i2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 FrostHunterFCMDeltaQuantumHero8364(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new FrostHunterOnItemClickListenerTitaniumSpectraStorm7629(i2, radius, center);
    }

    public static boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, FrostHunterCoordinatorLayoutVortexMaster5256 frostHunterCoordinatorLayoutVortexMaster5256, int i, FrostHunterRotateDrawableOlympianOmega5269 frostHunterRotateDrawableOlympianOmega5269) {
        long FrostHunterEditTextPulseHyperion1262 = frostHunterLicensingSpectraPulse8868.FrostHunterEditTextPulseHyperion1262();
        long j = FrostHunterEditTextPulseHyperion1262 >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((FrostHunterEditTextPulseHyperion1262 >> 12) & 15);
        int i3 = (int) ((FrostHunterEditTextPulseHyperion1262 >> 8) & 15);
        int i4 = (int) ((FrostHunterEditTextPulseHyperion1262 >> 4) & 15);
        int i5 = (int) ((FrostHunterEditTextPulseHyperion1262 >> 1) & 7);
        boolean z2 = (FrostHunterEditTextPulseHyperion1262 & 1) == 1;
        if (i4 <= 7) {
            if (i4 != frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterRemoteConfigSpeedSpeed8566 - 1) {
                return false;
            }
        } else if (i4 > 10 || frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterRemoteConfigSpeedSpeed8566 != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterFlowMaxDragonHero5809) || z2) {
            return false;
        }
        try {
            long FrostHunterMediaPlayerCelestialBetaTitan3868 = frostHunterLicensingSpectraPulse8868.FrostHunterMediaPlayerCelestialBetaTitan3868();
            if (!z) {
                FrostHunterMediaPlayerCelestialBetaTitan3868 *= frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
            long j2 = frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterAlertDialogAuroraDelta3200;
            if (j2 != 0 && FrostHunterMediaPlayerCelestialBetaTitan3868 > j2) {
                return false;
            }
            frostHunterRotateDrawableOlympianOmega5269.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterMediaPlayerCelestialBetaTitan3868;
            int FrostHunterPushNotificationStormTitanGamma8999 = FrostHunterPushNotificationStormTitanGamma8999(i2, frostHunterLicensingSpectraPulse8868);
            long j3 = frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterAlertDialogAuroraDelta3200;
            boolean z3 = j3 == 0 || FrostHunterMediaPlayerCelestialBetaTitan3868 + ((long) FrostHunterPushNotificationStormTitanGamma8999) >= j3;
            if (FrostHunterPushNotificationStormTitanGamma8999 == -1) {
                return false;
            }
            if ((!z3 && FrostHunterPushNotificationStormTitanGamma8999 < frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterAlphaAnimationNeoCosmos5761) || FrostHunterPushNotificationStormTitanGamma8999 > frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                return false;
            }
            int i6 = frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterLifecycleBlazeGammaElite2889;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != frostHunterCoordinatorLayoutVortexMaster5256.FrostHunterLevelListDrawableFusionDragonHero2232) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int FrostHunterBillingClientFusionVortex9008 = frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008();
                    if (i3 == 14) {
                        FrostHunterBillingClientFusionVortex9008 *= 10;
                    }
                    if (FrostHunterBillingClientFusionVortex9008 != i6) {
                        return false;
                    }
                } else if (frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() * 1000 != i6) {
                    return false;
                }
            }
            int FrostHunterMeteringPointBetaCyber9571 = frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571();
            int i7 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            byte[] bArr = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633; i10 < i8; i10++) {
                i9 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterFlowMaxDragonHero5809[i9 ^ (bArr[i10] & 255)];
            }
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterMeteringPointBetaCyber9571 != i9) {
                return false;
            }
            if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() != 0) {
                int FrostHunterAlertDialogAuroraDelta3200 = frostHunterLicensingSpectraPulse8868.FrostHunterAlertDialogAuroraDelta3200();
                if ((FrostHunterAlertDialogAuroraDelta3200 & 128) != 0) {
                    return false;
                }
                int i11 = (FrostHunterAlertDialogAuroraDelta3200 & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202("Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final void FrostHunterFlowMaxDragonHero5809(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        FrostHunterTextureViewElitePixel5268 frostHunterTextureViewElitePixel5268 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingDataTurboTitanium7332.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        frostHunterTextureViewElitePixel5268.FrostHunterInAppPurchaseLegendEpicDragon4579(FrostHunterWithContextPrimeEpic7001.FrostHunterBundlePulseFusionHero2475);
        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterMagnetometerFusionTitanium8202(frostHunterTextureViewElitePixel5268, 0, frostHunterNotificationGammaBlazePhoenix7595);
    }

    public static Map FrostHunterFragmentBetaMegaVortex6025(Object obj) {
        if ((obj instanceof FrostHunterContextBlazePrimeMax4967) && !(obj instanceof FrostHunterDispatchersCyberNovaX6237)) {
            FrostHunterRunnableCosmosCelestial4235(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRemoteConfigThunderShadow4435(e, FrostHunterCanvasInfernoVortex4700.class.getName());
            throw e;
        }
    }

    public static Collection FrostHunterKeyframeGammaGamma1197(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof FrostHunterContextBlazePrimeMax4967) || (abstractCollection instanceof FrostHunterModelInputOutputCyberSpectra6508)) {
            return abstractCollection;
        }
        FrostHunterRunnableCosmosCelestial4235(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, Object obj) {
        FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPermissionInfoAlphaDelta6279;
        boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterBarrierStrikeDelta5335(frostHunterCountDownTimerRogueTitan5615, frostHunterFontFamilyNeoBetaEpic8574);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
        }
    }

    public static final void FrostHunterLifecycleBlazeGammaElite2889(Object obj, Object obj2, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj2);
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterPaintVortexTitan7760(frostHunterCombineLegendMegaPrime5473);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
        }
    }

    public static void FrostHunterLightSensorForceFusion4241(int i, Object obj) {
        if (obj == null || FrostHunterRewardedAdMasterStrike9463(i, obj)) {
            return;
        }
        FrostHunterRunnableCosmosCelestial4235(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static void FrostHunterLintTitanVortexQuantum9911(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final int FrostHunterLiveDataBetaLegend3442(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static void FrostHunterLooperHyperionForce4133(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("at index ", i2));
                return;
            }
        }
    }

    public static void FrostHunterLooperThreadBetaHyperionMax1000(boolean z, String str, long j) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566(str, Long.valueOf(j)));
    }

    public static int FrostHunterMagnetometerFusionTitanium8202(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (FrostHunterConstraintLayoutSolarSpark3996.FrostHunterAlphaAnimationNeoCosmos5761[roundingMode.ordinal()]) {
            case 1:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterFragmentBetaMegaVortex6025(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static final void FrostHunterMediaPlayerCelestialBetaTitan3868(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static void FrostHunterMeteringPointBetaCyber9571(FrostHunterInsetDrawableCelestialEclipse3601 frostHunterInsetDrawableCelestialEclipse3601) {
        frostHunterInsetDrawableCelestialEclipse3601.getClass();
    }

    public static void FrostHunterMeteringPointMegaCyber7955(boolean z) {
        if (z) {
            return;
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
    }

    public static void FrostHunterMotionSceneAuroraMega2271(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566(str, obj));
    }

    public static FrostHunterInstrumentationPhantomVortex8747 FrostHunterNavigationMasterMegaMax2752(FrostHunterMenuPrimeTitan7073 frostHunterMenuPrimeTitan7073, int i, int i2, int i3, int i4, int i5, FrostHunterStateFlowCosmosMega1087 frostHunterStateFlowCosmosMega1087, List list, FrostHunterClipDrawableMasterVortexEclipse8656[] frostHunterClipDrawableMasterVortexEclipse8656Arr, int i6) {
        int i7;
        float f;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        List list2 = list;
        long j2 = i5;
        int[] iArr = new int[i6];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        float f2 = 0.0f;
        while (i13 < i6) {
            FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision5998 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list2.get(i13);
            float FrostHunterMediaPlayerCelestialBetaTitan3868 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision5998));
            if (FrostHunterMediaPlayerCelestialBetaTitan3868 > 0.0f) {
                f2 += FrostHunterMediaPlayerCelestialBetaTitan3868;
                i14++;
                j = j2;
                i9 = i13;
            } else {
                int i17 = i3 - i15;
                FrostHunterClipDrawableMasterVortexEclipse8656 frostHunterClipDrawableMasterVortexEclipse8656 = frostHunterClipDrawableMasterVortexEclipse8656Arr[i13];
                j = j2;
                if (frostHunterClipDrawableMasterVortexEclipse8656 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i9 = i13;
                        i10 = i14;
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i9 = i13;
                        i10 = i14;
                        i11 = i17 < 0 ? 0 : i17;
                    }
                    frostHunterClipDrawableMasterVortexEclipse8656 = frostHunterDigitalInkRecognitionSpeedMasterVision5998.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMenuPrimeTitan7073.FrostHunterLifecycleBlazeGammaElite2889(0, i11, i4, false));
                } else {
                    i9 = i13;
                    i10 = i14;
                }
                FrostHunterClipDrawableMasterVortexEclipse8656 frostHunterClipDrawableMasterVortexEclipse86562 = frostHunterClipDrawableMasterVortexEclipse8656;
                int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterMenuPrimeTitan7073.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterClipDrawableMasterVortexEclipse86562);
                int FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterMenuPrimeTitan7073.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterClipDrawableMasterVortexEclipse86562);
                iArr[i9] = FrostHunterRemoteConfigSpeedSpeed85662;
                int i18 = i17 - FrostHunterRemoteConfigSpeedSpeed85662;
                if (i18 < 0) {
                    i18 = 0;
                }
                i16 = Math.min(i5, i18);
                i15 += FrostHunterRemoteConfigSpeedSpeed85662 + i16;
                i12 = Math.max(i12, FrostHunterAlphaAnimationNeoCosmos57612);
                frostHunterClipDrawableMasterVortexEclipse8656Arr[i9] = frostHunterClipDrawableMasterVortexEclipse86562;
                i14 = i10;
            }
            i13 = i9 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i14 == 0) {
            i15 -= i16;
            i7 = 0;
        } else {
            long j4 = (r21 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i15) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i19 = 0; i19 < i6; i19++) {
                j5 -= Math.round(FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955((FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list2.get(i19))) * f3);
            }
            int i20 = i12;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i6) {
                if (frostHunterClipDrawableMasterVortexEclipse8656Arr[i21] == null) {
                    FrostHunterDigitalInkRecognitionSpeedMasterVision5998 frostHunterDigitalInkRecognitionSpeedMasterVision59982 = (FrostHunterDigitalInkRecognitionSpeedMasterVision5998) list2.get(i21);
                    FrostHunterServiceMaxPrime3805 FrostHunterMeteringPointMegaCyber7955 = FrostHunterCardViewHyperionAurora3829.FrostHunterMeteringPointMegaCyber7955(frostHunterDigitalInkRecognitionSpeedMasterVision59982);
                    float FrostHunterMediaPlayerCelestialBetaTitan38682 = FrostHunterCardViewHyperionAurora3829.FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterMeteringPointMegaCyber7955);
                    if (FrostHunterMediaPlayerCelestialBetaTitan38682 <= 0.0f) {
                        FrostHunterLintSparkHyperion2725.FrostHunterConstraintSetCloneMasterUltraRogue2633("All weights <= 0 should have placeables");
                    }
                    f = f3;
                    int signum = Long.signum(j5);
                    j5 -= signum;
                    int max = Math.max(0, Math.round(FrostHunterMediaPlayerCelestialBetaTitan38682 * f) + signum);
                    if ((FrostHunterMeteringPointMegaCyber7955 != null ? FrostHunterMeteringPointMegaCyber7955.FrostHunterConstraintSetCloneMasterUltraRogue2633 : true) && max != Integer.MAX_VALUE) {
                        i8 = max;
                        FrostHunterClipDrawableMasterVortexEclipse8656 FrostHunterLifecycleBlazeGammaElite28892 = frostHunterDigitalInkRecognitionSpeedMasterVision59982.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMenuPrimeTitan7073.FrostHunterLifecycleBlazeGammaElite2889(i8, max, i4, true));
                        int FrostHunterRemoteConfigSpeedSpeed85663 = frostHunterMenuPrimeTitan7073.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLifecycleBlazeGammaElite28892);
                        int FrostHunterAlphaAnimationNeoCosmos57613 = frostHunterMenuPrimeTitan7073.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite28892);
                        iArr[i21] = FrostHunterRemoteConfigSpeedSpeed85663;
                        i22 += FrostHunterRemoteConfigSpeedSpeed85663;
                        int max2 = Math.max(i20, FrostHunterAlphaAnimationNeoCosmos57613);
                        frostHunterClipDrawableMasterVortexEclipse8656Arr[i21] = FrostHunterLifecycleBlazeGammaElite28892;
                        i20 = max2;
                    }
                    i8 = 0;
                    FrostHunterClipDrawableMasterVortexEclipse8656 FrostHunterLifecycleBlazeGammaElite288922 = frostHunterDigitalInkRecognitionSpeedMasterVision59982.FrostHunterLifecycleBlazeGammaElite2889(frostHunterMenuPrimeTitan7073.FrostHunterLifecycleBlazeGammaElite2889(i8, max, i4, true));
                    int FrostHunterRemoteConfigSpeedSpeed856632 = frostHunterMenuPrimeTitan7073.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterLifecycleBlazeGammaElite288922);
                    int FrostHunterAlphaAnimationNeoCosmos576132 = frostHunterMenuPrimeTitan7073.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite288922);
                    iArr[i21] = FrostHunterRemoteConfigSpeedSpeed856632;
                    i22 += FrostHunterRemoteConfigSpeedSpeed856632;
                    int max22 = Math.max(i20, FrostHunterAlphaAnimationNeoCosmos576132);
                    frostHunterClipDrawableMasterVortexEclipse8656Arr[i21] = FrostHunterLifecycleBlazeGammaElite288922;
                    i20 = max22;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i7 = (int) (i22 + j4);
            int i23 = i3 - i15;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > i23) {
                i7 = i23;
            }
            i12 = i20;
        }
        int i24 = i7 + i15;
        if (i24 < 0) {
            i24 = 0;
        }
        int max3 = Math.max(i24, i);
        int max4 = Math.max(i12, Math.max(i2, 0));
        int[] iArr2 = new int[i6];
        frostHunterMenuPrimeTitan7073.FrostHunterFlowMaxDragonHero5809(max3, frostHunterStateFlowCosmosMega1087, iArr, iArr2);
        return frostHunterMenuPrimeTitan7073.FrostHunterCameraXPixelTurboCosmos9814(frostHunterClipDrawableMasterVortexEclipse8656Arr, frostHunterStateFlowCosmosMega1087, iArr2, max3, max4);
    }

    public static Set FrostHunterPagingDataTurboTitanium7332() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int FrostHunterPagingSourceEclipseDelta8255(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("x (", i, ") must be > 0"));
            return 0;
        }
        switch (FrostHunterConstraintLayoutSolarSpark3996.FrostHunterAlphaAnimationNeoCosmos5761[roundingMode.ordinal()]) {
            case 1:
                FrostHunterExecutorSolarPhoenix3849.FrostHunterFragmentBetaMegaVortex6025((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final boolean FrostHunterPermissionInfoAlphaDelta6279(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static int FrostHunterPreviewBlazeAurora1020(Object obj) {
        return FrostHunterAnnotationProcessorSparkEclipse8710(obj == null ? 0 : obj.hashCode());
    }

    public static int FrostHunterPushNotificationStormTitanGamma8999(int i, FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i - 2);
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() + 1;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return frostHunterLicensingSpectraPulse8868.FrostHunterBillingClientFusionVortex9008() + 1;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long FrostHunterR8MasterNebulaSpark7247(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static final void FrostHunterRemoteConfigSpeedSpeed8566(final Boolean bool, final Object obj, FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo8770, final FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        int i2;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(696924721);
        if ((i & 6) == 0) {
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineLegendMegaPrime5473) ? 2048 : 1024;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 1171) != 1170)) {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterTransitionListenerPulseVortexCosmos7949();
            if ((i & 1) == 0 || frostHunterDialogFragmentPhantomEclipse8068.FrostHunterDialogFragmentTurboPhoenixDragon7627()) {
                frostHunterNotificationSpectraTurbo8770 = (FrostHunterNotificationSpectraTurbo8770) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFocusMeteringActionThunderMegaGamma5195.FrostHunterAlphaAnimationNeoCosmos5761);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
            }
            int i3 = i2 & (-897);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXTurboCelestialHero5430();
            boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(bool) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterNotificationSpectraTurbo8770);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterJobIntentServiceSpectraBlaze2155(frostHunterNotificationSpectraTurbo8770.FrostHunterRemoteConfigSpeedSpeed8566());
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationSpectraTurbo8770, (FrostHunterJobIntentServiceSpectraBlaze2155) FrostHunterMagnetometerFusionTitanium8202, frostHunterCombineLegendMegaPrime5473, frostHunterDialogFragmentPhantomEclipse8068, (i3 >> 3) & 896);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        final FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo87702 = frostHunterNotificationSpectraTurbo8770;
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574() { // from class: android.content.Context.FrostHunterLiveDataAlphaMaxStorm2977
                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    FrostHunterCanvasInfernoVortex4700.FrostHunterRemoteConfigSpeedSpeed8566(bool, obj, frostHunterNotificationSpectraTurbo87702, frostHunterCombineLegendMegaPrime5473, (FrostHunterDialogFragmentPhantomEclipse8068) obj2, FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(i | 1));
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static List FrostHunterRemoteConfigThunderShadow4435(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void FrostHunterResourcesTitanHyperVision5823(boolean z) {
        if (z) {
            return;
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterFragmentBetaMegaVortex6025();
    }

    public static boolean FrostHunterRewardedAdMasterStrike9463(int i, Object obj) {
        if (obj instanceof FrostHunterFontFamilyTitanDragonThunder7606) {
            if ((obj instanceof FrostHunterTypefaceQuantumPhantomQuantum2493 ? ((FrostHunterTypefaceQuantumPhantomQuantum2493) obj).FrostHunterServiceEliteCelestialThunder1757() : obj instanceof FrostHunterNotificationGammaBlazePhoenix7595 ? 0 : obj instanceof FrostHunterCombineLegendMegaPrime5473 ? 1 : obj instanceof FrostHunterFontFamilyNeoBetaEpic8574 ? 2 : obj instanceof FrostHunterDragEventStormHyperion6109 ? 3 : obj instanceof FrostHunterRoomShadowOlympianCosmos4955 ? 4 : obj instanceof FrostHunterContentObserverRogueDragonElite6323 ? 5 : obj instanceof FrostHunterButtonLegendPixelNebula3622 ? 6 : obj instanceof FrostHunterGroupAlphaOmega6139 ? 7 : obj instanceof FrostHunterGradientDrawableBetaForceMax2175 ? 8 : obj instanceof FrostHunterServiceConnectionInfernoHero2419 ? 9 : obj instanceof FrostHunterWindowManagerStormTurbo7841 ? 10 : obj instanceof FrostHunterCanvasNovaPixelBeta7851 ? 11 : obj instanceof FrostHunterFontFamilyTitaniumCosmosFusion4235 ? 13 : obj instanceof FrostHunterOnLongClickListenerMegaFusionQuantum4978 ? 14 : obj instanceof FrostHunterOnPreDrawListenerAlphaFusion6796 ? 15 : obj instanceof FrostHunterItemDecorationHeroStormVision7205 ? 16 : obj instanceof FrostHunterInterstitialAdInfernoHyper3177 ? 17 : obj instanceof FrostHunterObjectAnimatorPhantomSpark4034 ? 18 : obj instanceof FrostHunterViewBindingEpicHyper6174 ? 19 : obj instanceof FrostHunterScaleDrawableLegendVision6700 ? 20 : obj instanceof FrostHunterAdapterDelegateTurboStrikeNova4119 ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static FrostHunterWindowManagerPrimeForce7319 FrostHunterRewardedAdSpectraElite8288(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    FrostHunterWindowManagerPrimeForce7319 frostHunterWindowManagerPrimeForce7319 = new FrostHunterWindowManagerPrimeForce7319();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197 = duplicate;
                    frostHunterWindowManagerPrimeForce7319.FrostHunterCameraXPixelTurboCosmos9814 = position;
                    int i6 = position - duplicate.getInt(position);
                    frostHunterWindowManagerPrimeForce7319.FrostHunterFlowMaxDragonHero5809 = i6;
                    frostHunterWindowManagerPrimeForce7319.FrostHunterAlertDialogAuroraDelta3200 = ((ByteBuffer) frostHunterWindowManagerPrimeForce7319.FrostHunterKeyframeGammaGamma1197).getShort(i6);
                    return frostHunterWindowManagerPrimeForce7319;
                }
            }
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("Cannot read metadata.");
        return null;
    }

    public static void FrostHunterRunnableCosmosCelestial4235(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRemoteConfigThunderShadow4435(classCastException, FrostHunterCanvasInfernoVortex4700.class.getName());
        throw classCastException;
    }

    public static ArrayList FrostHunterScaleAnimationStrikeSpark5059(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static String FrostHunterServiceConnectionTurboPhoenixOmega6719(String str, int i, int i2) {
        if (i < 0) {
            return FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("negative size: ", i2));
        return null;
    }

    public static final void FrostHunterServiceEliteCelestialThunder1757(Object obj, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068) {
        boolean FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj);
        Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
        if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterPaintVortexTitan7760(frostHunterCombineLegendMegaPrime5473);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
        }
    }

    public static void FrostHunterServiceInfoHyperionSparkMax9966(Object obj, String str) {
        if (obj != null) {
            return;
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814(str);
    }

    public static boolean FrostHunterStateCelestialNovaPixel8414(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = FrostHunterBroadcastPrimePixel6628.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterBroadcastPrimePixel6628 frostHunterBroadcastPrimePixel6628 = (FrostHunterBroadcastPrimePixel6628) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (frostHunterBroadcastPrimePixel6628 == null) {
                frostHunterBroadcastPrimePixel6628 = new FrostHunterBroadcastPrimePixel6628();
                frostHunterBroadcastPrimePixel6628.FrostHunterAlphaAnimationNeoCosmos5761 = null;
                frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                frostHunterBroadcastPrimePixel6628.FrostHunterBundlePulseFusionHero2475 = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, frostHunterBroadcastPrimePixel6628);
            }
            WeakReference weakReference2 = frostHunterBroadcastPrimePixel6628.FrostHunterBundlePulseFusionHero2475;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                frostHunterBroadcastPrimePixel6628.FrostHunterBundlePulseFusionHero2475 = new WeakReference(keyEvent);
                if (frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                    frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new SparseArray();
                }
                SparseArray sparseArray = frostHunterBroadcastPrimePixel6628.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                    return false;
                }
            }
        }
        return false;
    }

    public static void FrostHunterTextViewDragonStormMega4297(boolean z, String str, int i) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterRemoteConfigSpeedSpeed8566(str, Integer.valueOf(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterInAppPurchaseAlphaCyberNeo4980 FrostHunterTransitionListenerPulseVortexCosmos7949(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        String str;
        int i3;
        ?? r4;
        long j;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            FrostHunterConstraintSetCloneOmegaHyperion9304(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), FrostHunterGuidelineFusionTitanium8256.FrostHunterAlphaAnimationNeoCosmos5761);
        int i4 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), FrostHunterGuidelineFusionTitanium8256.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, Constants.MINIMAL_ERROR_STATUS_CODE);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        String string7 = obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            FrostHunterConstraintSetCloneOmegaHyperion9304(xmlResourceParser);
                        }
                        arrayList.add(new FrostHunterOnLongClickListenerGammaNovaXMaster7595(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        FrostHunterConstraintSetCloneOmegaHyperion9304(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new FrostHunterDataBindingHyperionEclipseNova9876((FrostHunterOnLongClickListenerGammaNovaXMaster7595[]) arrayList.toArray(new FrostHunterOnLongClickListenerGammaNovaXMaster7595[0]));
        }
        List FrostHunterRemoteConfigThunderShadow4435 = FrostHunterRemoteConfigThunderShadow4435(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), FrostHunterGuidelineFusionTitanium8256.FrostHunterBundlePulseFusionHero2475);
                    int i10 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            r4 = obtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                FrostHunterConstraintSetCloneOmegaHyperion9304(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = obtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            str = string5;
                            r4 = obtainAttributes3;
                            i3 = i10;
                            i2 = integer2;
                            j = 1;
                            try {
                                FrostHunterHandlerThreadFusionOmegaHero7374 frostHunterHandlerThreadFusionOmegaHero7374 = new FrostHunterHandlerThreadFusionOmegaHero7374(string, string2, string8, FrostHunterRemoteConfigThunderShadow4435, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r4;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(frostHunterHandlerThreadFusionOmegaHero7374);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = obtainAttributes3;
                            j = 1;
                            th = th;
                            typedArray = r4;
                            if (typedArray != null) {
                            }
                        }
                        th = th3;
                    } catch (Throwable th5) {
                        th = th5;
                        r4 = obtainAttributes3;
                    }
                    th = th;
                    typedArray = r4;
                    if (typedArray != null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer2;
                str = string5;
                i3 = integer;
                FrostHunterConstraintSetCloneOmegaHyperion9304(xmlResourceParser);
                integer = i3;
                integer2 = i2;
                string5 = str;
                i = 2;
                i4 = 0;
                i5 = 3;
            }
        }
        int i11 = integer2;
        String str2 = string5;
        int i12 = integer;
        if (!arrayList2.isEmpty()) {
            return new FrostHunterThreadEclipsePrime2743(arrayList2, i12, i11, str2);
        }
        if (string3 == null) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new FrostHunterHandlerThreadFusionOmegaHero7374(string, string2, string3, FrostHunterRemoteConfigThunderShadow4435, null, null));
        if (string4 != null) {
            arrayList2.add(new FrostHunterHandlerThreadFusionOmegaHero7374(string, string2, string4, FrostHunterRemoteConfigThunderShadow4435, null, null));
        }
        return new FrostHunterThreadEclipsePrime2743(arrayList2, i12, i11, str2);
    }

    public static void FrostHunterTranslateAnimationCyberSolarUltra7101(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            FrostHunterAnimatorStormAurora6710 frostHunterAnimatorStormAurora6710 = (FrostHunterAnimatorStormAurora6710) obj;
            FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion2449 = new FrostHunterInputMethodManagerBetaBetaFusion2449(frostHunterAnimatorStormAurora6710);
            for (FrostHunterObserverVisionSpeed8931 frostHunterObserverVisionSpeed8931 : frostHunterAnimatorStormAurora6710.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                boolean z = frostHunterAnimatorStormAurora6710.FrostHunterLifecycleBlazeGammaElite2889 == 0;
                FrostHunterMediaPlayerPrimeStormInferno4601 frostHunterMediaPlayerPrimeStormInferno4601 = new FrostHunterMediaPlayerPrimeStormInferno4601(frostHunterObserverVisionSpeed8931, !z);
                if (!hashMap.containsKey(frostHunterMediaPlayerPrimeStormInferno4601)) {
                    hashMap.put(frostHunterMediaPlayerPrimeStormInferno4601, new HashSet());
                }
                Set set = (Set) hashMap.get(frostHunterMediaPlayerPrimeStormInferno4601);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + frostHunterObserverVisionSpeed8931 + ".");
                }
                set.add(frostHunterInputMethodManagerBetaBetaFusion2449);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24492 : (Set) it.next()) {
                for (FrostHunterStateFlowMasterShadow1577 frostHunterStateFlowMasterShadow1577 : frostHunterInputMethodManagerBetaBetaFusion24492.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475) {
                    if (frostHunterStateFlowMasterShadow1577.FrostHunterBundlePulseFusionHero2475 == 0) {
                        Set<FrostHunterInputMethodManagerBetaBetaFusion2449> set2 = (Set) hashMap.get(new FrostHunterMediaPlayerPrimeStormInferno4601(frostHunterStateFlowMasterShadow1577.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterStateFlowMasterShadow1577.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 2));
                        if (set2 != null) {
                            for (FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24493 : set2) {
                                frostHunterInputMethodManagerBetaBetaFusion24492.FrostHunterConstraintSetCloneMasterUltraRogue2633.add(frostHunterInputMethodManagerBetaBetaFusion24493);
                                frostHunterInputMethodManagerBetaBetaFusion24493.FrostHunterBundlePulseFusionHero2475.add(frostHunterInputMethodManagerBetaBetaFusion24492);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24494 = (FrostHunterInputMethodManagerBetaBetaFusion2449) it3.next();
            if (frostHunterInputMethodManagerBetaBetaFusion24494.FrostHunterBundlePulseFusionHero2475.isEmpty()) {
                hashSet2.add(frostHunterInputMethodManagerBetaBetaFusion24494);
            }
        }
        while (!hashSet2.isEmpty()) {
            FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24495 = (FrostHunterInputMethodManagerBetaBetaFusion2449) hashSet2.iterator().next();
            hashSet2.remove(frostHunterInputMethodManagerBetaBetaFusion24495);
            i++;
            Iterator it4 = frostHunterInputMethodManagerBetaBetaFusion24495.FrostHunterConstraintSetCloneMasterUltraRogue2633.iterator();
            while (it4.hasNext()) {
                FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24496 = (FrostHunterInputMethodManagerBetaBetaFusion2449) it4.next();
                frostHunterInputMethodManagerBetaBetaFusion24496.FrostHunterBundlePulseFusionHero2475.remove(frostHunterInputMethodManagerBetaBetaFusion24495);
                if (frostHunterInputMethodManagerBetaBetaFusion24496.FrostHunterBundlePulseFusionHero2475.isEmpty()) {
                    hashSet2.add(frostHunterInputMethodManagerBetaBetaFusion24496);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            FrostHunterInputMethodManagerBetaBetaFusion2449 frostHunterInputMethodManagerBetaBetaFusion24497 = (FrostHunterInputMethodManagerBetaBetaFusion2449) it5.next();
            if (!frostHunterInputMethodManagerBetaBetaFusion24497.FrostHunterBundlePulseFusionHero2475.isEmpty() && !frostHunterInputMethodManagerBetaBetaFusion24497.FrostHunterConstraintSetCloneMasterUltraRogue2633.isEmpty()) {
                arrayList2.add(frostHunterInputMethodManagerBetaBetaFusion24497.FrostHunterAlphaAnimationNeoCosmos5761);
            }
        }
        throw new FrostHunterNavigationViewNebulaMaster8945("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static void FrostHunterViewPhantomNeo1634(String str, boolean z) {
        if (z) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719(str);
    }
}
