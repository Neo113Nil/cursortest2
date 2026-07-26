package android.content.Context;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterVectorDrawableForceMax1351 {
    public static Boolean FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public static final int[] FrostHunterAlphaAnimationNeoCosmos5761 = {1, 2, 3, 6};
    public static final int[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = {48000, 44100, 32000};
    public static final int[] FrostHunterBundlePulseFusionHero2475 = {24000, 22050, 16000};
    public static final int[] FrostHunterServiceEliteCelestialThunder1757 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] FrostHunterLifecycleBlazeGammaElite2889 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] FrostHunterLevelListDrawableFusionDragonHero2232 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] FrostHunterRemoteConfigSpeedSpeed8566 = new int[0];
    public static final long[] FrostHunterCameraXPixelTurboCosmos9814 = new long[0];
    public static final Object[] FrostHunterFlowMaxDragonHero5809 = new Object[0];
    public static final FrostHunterBottomSheetEclipseUltraShadow6009 FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterBottomSheetEclipseUltraShadow6009(11);
    public static final StackTraceElement[] FrostHunterKeyframeGammaGamma1197 = new StackTraceElement[0];
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterWorkManagerMaxTurbo1858("NO_VALUE", 3);
    public static final String[] FrostHunterServiceConnectionTurboPhoenixOmega6719 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] FrostHunterLightSensorForceFusion4241 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] FrostHunterScaleAnimationStrikeSpark5059 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static final Bundle FrostHunterAlertDialogAuroraDelta3200(FrostHunterLaunchHeroForce4010... frostHunterLaunchHeroForce4010Arr) {
        Bundle bundle = new Bundle(frostHunterLaunchHeroForce4010Arr.length);
        for (FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 : frostHunterLaunchHeroForce4010Arr) {
            String str = (String) frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814;
            Object obj = frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75953, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75954, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75956, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        int i2;
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterNotificationGammaBlazePhoenix75952.getClass();
        frostHunterNotificationGammaBlazePhoenix75953.getClass();
        frostHunterNotificationGammaBlazePhoenix75954.getClass();
        frostHunterNotificationGammaBlazePhoenix75955.getClass();
        frostHunterNotificationGammaBlazePhoenix75956.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1288359972);
        if ((i & 6) == 0) {
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75952) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75953) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75954) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75955) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75956) ? 131072 : 65536;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (74899 & i2) != 74898)) {
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26332 = androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0.75f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterConstraintSetCloneMasterUltraRogue26332);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterBundlePulseFusionHero2475(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633, 28.0f, 2), new FrostHunterTextRecognitionBlazeNeo4593(20.0f, 24.0f, 20.0f, 24.0f), FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4283417591L), false, FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingDataTurboTitanium7332(-1348623061, new FrostHunterDragEventStormHyperion6109() { // from class: android.content.Context.FrostHunterClipboardManagerGammaPixelHyperion9551
                @Override // android.content.Context.FrostHunterDragEventStormHyperion6109
                public final Object FrostHunterLevelListDrawableFusionDragonHero2232(Object obj, Object obj2, Object obj3) {
                    FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = (FrostHunterDialogFragmentPhantomEclipse8068) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((FrostHunterExoPlayerHeroQuantum1765) obj).getClass();
                    if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFCMDeltaQuantumHero8364(intValue & 1, (intValue & 17) != 16)) {
                        FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
                        FrostHunterBitmapStrikeOmegaPixel8415 frostHunterBitmapStrikeOmegaPixel8415 = FrostHunterRewardedAdHyperStrike1151.FrostHunterMotionSceneAuroraMega2271;
                        FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterBitmapStrikeOmegaPixel8415, frostHunterDialogFragmentPhantomEclipse80682, 48);
                        int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAlphaAnimationNeoCosmos57612);
                        FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                        FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike11232 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11232);
                        } else {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterAlphaAnimationNeoCosmos57613);
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterFragmentBetaMegaVortex60253);
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse80682, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24514);
                        }
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24515 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24515, FrostHunterRewardedAdMasterStrike94632);
                        FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("⏸", null, 0L, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(36), 0L, null, 0L, 0, false, 0, 0, null, frostHunterDialogFragmentPhantomEclipse80682, 3078, 131062);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 10.0f));
                        FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("PAUSED", null, 0L, 0L, 0L, new FrostHunterDiffUtilSparkPhantomHyper9986(3), 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterLifecycleBlazeGammaElite2889, FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0L, FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(4), 0L, null, 16777082), frostHunterDialogFragmentPhantomEclipse80682, 6, 65022);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 20.0f));
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57614 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
                        FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57615 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterBindingAdapterVisionNovaXNeo5053(6.0f, new FrostHunterLaunchEclipseAurora4535(0)), frostHunterBitmapStrikeOmegaPixel8415, frostHunterDialogFragmentPhantomEclipse80682, 54);
                        int hashCode3 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60254 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94633 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAlphaAnimationNeoCosmos57614);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11232);
                        } else {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterAlphaAnimationNeoCosmos57615);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterFragmentBetaMegaVortex60254);
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode3))) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode3, frostHunterDialogFragmentPhantomEclipse80682, hashCode3, frostHunterBindingAdapterUltraSpectraOmega24514);
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24515, FrostHunterRewardedAdMasterStrike94633);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("RESUME", FrostHunterNotificationGammaBlazePhoenix7595.this, null, "▶", true, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 221190, 200);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("RESTART", frostHunterNotificationGammaBlazePhoenix75952, null, "↻", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("RULES", frostHunterNotificationGammaBlazePhoenix75953, null, "❄", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("SETTINGS", frostHunterNotificationGammaBlazePhoenix75954, null, "⚙", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("CHANGE MODE", frostHunterNotificationGammaBlazePhoenix75955, null, "⟳", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("MENU", frostHunterNotificationGammaBlazePhoenix75956, null, "✕", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                    } else {
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }, frostHunterDialogFragmentPhantomEclipse8068), frostHunterDialogFragmentPhantomEclipse8068, 25014);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574() { // from class: android.content.Context.FrostHunterFaceDetectionAuroraNeoPhoenix6892
                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    FrostHunterVectorDrawableForceMax1351.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterNotificationGammaBlazePhoenix7595.this, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, frostHunterNotificationGammaBlazePhoenix75954, frostHunterNotificationGammaBlazePhoenix75955, frostHunterNotificationGammaBlazePhoenix75956, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(i | 1));
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static boolean FrostHunterBitmapTurboDeltaNebula8743() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final void FrostHunterBundlePulseFusionHero2475(final String str, final String str2, final long j, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterConstraintSetCloneOmegaHyperion9304(-2073521347);
        int i2 = (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLevelListDrawableFusionDragonHero2232(str2) ? 32 : 16) | i;
        if ((i & 384) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLifecycleBlazeGammaElite2889(j) ? 256 : 128;
        }
        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterRewardedAdHyperStrike1151.FrostHunterMotionSceneAuroraMega2271, frostHunterDialogFragmentPhantomEclipse80682, 48);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterAlphaAnimationNeoCosmos57612);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse80682, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterPlaceholderFusionCyber5867 frostHunterPlaceholderFusionCyber5867 = FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterCameraXPixelTurboCosmos9814, j, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(15), FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059, null, 0L, 0L, null, 16777208), frostHunterDialogFragmentPhantomEclipse80682, (i2 >> 3) & 14, 65534);
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterScaleAnimationStrikeSpark5059, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.4f), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(8), null, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(1), 0L, null, 16777084), frostHunterDialogFragmentPhantomEclipse80682, 6, 65534);
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse80682;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574() { // from class: android.content.Context.FrostHunterFirebaseModelDownloadConditionsBetaTurboElite1982
                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    FrostHunterVectorDrawableForceMax1351.FrostHunterBundlePulseFusionHero2475(str, str2, j, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(i | 1));
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static final int FrostHunterCameraXPixelTurboCosmos9814(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int FrostHunterCameraXTurboCelestialHero5430(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final View FrostHunterCardViewSpectraCyber7714(FrostHunterDrawerLayoutShadowPhoenix9863 frostHunterDrawerLayoutShadowPhoenix9863) {
        if (!((FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterDrawerLayoutShadowPhoenix9863).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("Cannot get View because the Modifier node is not currently attached.");
        }
        return FrostHunterOnAttachStateChangeListenerBlazeFusion8632.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterDrawerLayoutShadowPhoenix9863));
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterPagingSourcePhantomSolar2809 frostHunterPagingSourcePhantomSolar2809, final int i, final FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma1840, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75953, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i2) {
        int i3;
        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75954;
        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75955;
        FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75956;
        String str;
        frostHunterPagingSourcePhantomSolar2809.getClass();
        frostHunterDelayPixelGamma1840.getClass();
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterNotificationGammaBlazePhoenix75952.getClass();
        frostHunterNotificationGammaBlazePhoenix75953.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(651898040);
        if ((i2 & 6) == 0) {
            i3 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterPagingSourcePhantomSolar2809.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(frostHunterDelayPixelGamma1840.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            frostHunterNotificationGammaBlazePhoenix75954 = frostHunterNotificationGammaBlazePhoenix7595;
            i3 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75954) ? 2048 : 1024;
        } else {
            frostHunterNotificationGammaBlazePhoenix75954 = frostHunterNotificationGammaBlazePhoenix7595;
        }
        if ((i2 & 24576) == 0) {
            frostHunterNotificationGammaBlazePhoenix75955 = frostHunterNotificationGammaBlazePhoenix75952;
            i3 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75955) ? 16384 : 8192;
        } else {
            frostHunterNotificationGammaBlazePhoenix75955 = frostHunterNotificationGammaBlazePhoenix75952;
        }
        if ((196608 & i2) == 0) {
            frostHunterNotificationGammaBlazePhoenix75956 = frostHunterNotificationGammaBlazePhoenix75953;
            i3 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75956) ? 131072 : 65536;
        } else {
            frostHunterNotificationGammaBlazePhoenix75956 = frostHunterNotificationGammaBlazePhoenix75953;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i3 & 1, (74899 & i3) != 74898)) {
            final boolean z = frostHunterPagingSourcePhantomSolar2809 == FrostHunterPagingSourcePhantomSolar2809.FrostHunterCameraXPixelTurboCosmos9814;
            final long FrostHunterBundlePulseFusionHero24752 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(z ? 4286695300L : 4293227379L);
            final String str2 = z ? "🏆" : frostHunterPagingSourcePhantomSolar2809 == FrostHunterPagingSourcePhantomSolar2809.FrostHunterAlertDialogAuroraDelta3200 ? "⏰" : "💔";
            int ordinal = frostHunterPagingSourcePhantomSolar2809.ordinal();
            if (ordinal == 0) {
                str = "MISSION\nCOMPLETE!";
            } else if (ordinal == 1) {
                str = "MISSION FAILED";
            } else {
                if (ordinal != 2) {
                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return;
                }
                str = "TIME'S UP!";
            }
            final String str3 = str;
            final String str4 = z ? "You delivered enough cargo to win this run." : "Try again and refine your aim.";
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26332 = androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0.8f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterConstraintSetCloneMasterUltraRogue26332);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75957 = frostHunterNotificationGammaBlazePhoenix75954;
            final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75958 = frostHunterNotificationGammaBlazePhoenix75955;
            final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75959 = frostHunterNotificationGammaBlazePhoenix75956;
            FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterBundlePulseFusionHero2475(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633, 28.0f, 2), new FrostHunterTextRecognitionBlazeNeo4593(24.0f, 28.0f, 24.0f, 28.0f), FrostHunterBundlePulseFusionHero24752, false, FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingDataTurboTitanium7332(650543369, new FrostHunterDragEventStormHyperion6109() { // from class: android.content.Context.FrostHunterHandlerThreadTitaniumVortexHero9410
                @Override // android.content.Context.FrostHunterDragEventStormHyperion6109
                public final Object FrostHunterLevelListDrawableFusionDragonHero2232(Object obj, Object obj2, Object obj3) {
                    FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike11232;
                    FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512;
                    FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = (FrostHunterDialogFragmentPhantomEclipse8068) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((FrostHunterExoPlayerHeroQuantum1765) obj).getClass();
                    if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFCMDeltaQuantumHero8364(intValue & 1, (intValue & 17) != 16)) {
                        FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
                        FrostHunterBitmapStrikeOmegaPixel8415 frostHunterBitmapStrikeOmegaPixel8415 = FrostHunterRewardedAdHyperStrike1151.FrostHunterMotionSceneAuroraMega2271;
                        FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterBitmapStrikeOmegaPixel8415, frostHunterDialogFragmentPhantomEclipse80682, 48);
                        int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAlphaAnimationNeoCosmos57612);
                        FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
                        FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike11233 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11233);
                        } else {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterAlphaAnimationNeoCosmos57613);
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterFragmentBetaMegaVortex60253);
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24515 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse80682, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24515);
                        }
                        FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24516 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24516, FrostHunterRewardedAdMasterStrike94632);
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17573 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatorRoguePulse2723, 80.0f);
                        FrostHunterBroadcastFusionCosmos6323 frostHunterBroadcastFusionCosmos6323 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26333 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder17573, frostHunterBroadcastFusionCosmos6323, 518143);
                        long j = FrostHunterBundlePulseFusionHero24752;
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26333, FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.28f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.08f))))), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.55f), frostHunterBroadcastFusionCosmos6323);
                        FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17574 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
                        int hashCode3 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60254 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94633 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterCameraXPixelTurboCosmos98142);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11233);
                        } else {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterServiceEliteCelestialThunder17574);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterFragmentBetaMegaVortex60254);
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode3))) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode3, frostHunterDialogFragmentPhantomEclipse80682, hashCode3, frostHunterBindingAdapterUltraSpectraOmega24515);
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24516, FrostHunterRewardedAdMasterStrike94633);
                        FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str2, null, 0L, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(36), 0L, null, 0L, 0, false, 0, 0, null, frostHunterDialogFragmentPhantomEclipse80682, 3072, 131062);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 18.0f));
                        FrostHunterPlaceholderFusionCyber5867 frostHunterPlaceholderFusionCyber5867 = FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284 = ((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterLifecycleBlazeGammaElite2889;
                        long j2 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475;
                        FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str3, null, 0L, 0L, 0L, new FrostHunterDiffUtilSparkPhantomHyper9986(3), 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFragmentManagerFusionNovaDragon6284, j2, 0L, FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(3), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(32), null, 16646010), frostHunterDialogFragmentPhantomEclipse80682, 0, 65022);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 8.0f));
                        FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str4, null, 0L, 0L, 0L, new FrostHunterDiffUtilSparkPhantomHyper9986(3), 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterKeyframeGammaGamma1197, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.62f), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(13), null, null, 0L, 0L, null, 16777212), frostHunterDialogFragmentPhantomEclipse80682, 0, 65022);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 16.0f));
                        FrostHunterAuthSparkSpectra4812.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f), 1.0f), FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.1f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889), frostHunterDialogFragmentPhantomEclipse80682, 6);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 12.0f));
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57614 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
                        FrostHunterProfilerPixelEliteElite8399 FrostHunterAlphaAnimationNeoCosmos57615 = FrostHunterBannerAdBlazeSolarThunder2938.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdHyperStrike1151.FrostHunterResourcesTitanHyperVision5823, frostHunterDialogFragmentPhantomEclipse80682, 6);
                        int hashCode4 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60255 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94634 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAlphaAnimationNeoCosmos57614);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterBundleShadowStrike11232 = frostHunterBundleShadowStrike11233;
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11232);
                        } else {
                            frostHunterBundleShadowStrike11232 = frostHunterBundleShadowStrike11233;
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterAlphaAnimationNeoCosmos57615);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterFragmentBetaMegaVortex60255);
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode4))) {
                            frostHunterBindingAdapterUltraSpectraOmega24512 = frostHunterBindingAdapterUltraSpectraOmega24515;
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode4, frostHunterDialogFragmentPhantomEclipse80682, hashCode4, frostHunterBindingAdapterUltraSpectraOmega24512);
                        } else {
                            frostHunterBindingAdapterUltraSpectraOmega24512 = frostHunterBindingAdapterUltraSpectraOmega24515;
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24516, FrostHunterRewardedAdMasterStrike94634);
                        FrostHunterVectorDrawableForceMax1351.FrostHunterBundlePulseFusionHero2475("SCORE", String.valueOf(i), j2, frostHunterDialogFragmentPhantomEclipse80682, 390);
                        FrostHunterDelayPixelGamma1840 frostHunterDelayPixelGamma18402 = frostHunterDelayPixelGamma1840;
                        FrostHunterVectorDrawableForceMax1351.FrostHunterBundlePulseFusionHero2475("MODE", frostHunterDelayPixelGamma18402.FrostHunterCameraXPixelTurboCosmos9814, frostHunterDelayPixelGamma18402.FrostHunterFragmentBetaMegaVortex6025, frostHunterDialogFragmentPhantomEclipse80682, 6);
                        FrostHunterVectorDrawableForceMax1351.FrostHunterBundlePulseFusionHero2475("LEVEL", frostHunterDelayPixelGamma18402.FrostHunterAlertDialogAuroraDelta3200, frostHunterDelayPixelGamma18402.FrostHunterFragmentBetaMegaVortex6025, frostHunterDialogFragmentPhantomEclipse80682, 6);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                        FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse80682, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 20.0f));
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57616 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
                        FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57617 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterBindingAdapterVisionNovaXNeo5053(6.0f, new FrostHunterLaunchEclipseAurora4535(0)), frostHunterBitmapStrikeOmegaPixel8415, frostHunterDialogFragmentPhantomEclipse80682, 54);
                        int hashCode5 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
                        FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60256 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
                        FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94635 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterAlphaAnimationNeoCosmos57616);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike11232);
                        } else {
                            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24513, FrostHunterAlphaAnimationNeoCosmos57617);
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterFragmentBetaMegaVortex60256);
                        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode5))) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode5, frostHunterDialogFragmentPhantomEclipse80682, hashCode5, frostHunterBindingAdapterUltraSpectraOmega24512);
                        }
                        FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24516, FrostHunterRewardedAdMasterStrike94635);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633(z ? "PLAY AGAIN" : "TRY AGAIN", frostHunterNotificationGammaBlazePhoenix75957, null, "↻", true, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 221184, 200);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("CHANGE MODE", frostHunterNotificationGammaBlazePhoenix75958, null, "⟳", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633("MENU", frostHunterNotificationGammaBlazePhoenix75959, null, "✕", false, 0.0f, 0.0f, frostHunterDialogFragmentPhantomEclipse80682, 24582, 232);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
                    } else {
                        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }, frostHunterDialogFragmentPhantomEclipse8068), frostHunterDialogFragmentPhantomEclipse8068, 24630);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterTextRecognitionHeroRoguePrime7650(frostHunterPagingSourcePhantomSolar2809, i, frostHunterDelayPixelGamma1840, frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix75953, i2);
        }
    }

    public static final Object FrostHunterDatabaseEliteShadowUltra2452(Object obj) {
        return obj instanceof FrostHunterImageViewTitaniumVision4682 ? FrostHunterBannerAdTitanVisionDragon3523.FrostHunterCameraXTurboCelestialHero5430(((FrostHunterImageViewTitaniumVision4682) obj).FrostHunterAlphaAnimationNeoCosmos5761) : obj;
    }

    public static boolean FrostHunterDialogFragmentTurboPhoenixDragon7627(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        FrostHunterKeyframeGammaGamma1197("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        FrostHunterKeyframeGammaGamma1197("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new FrostHunterButtonRogueQuantum5741("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterScaleAnimationStrikeSpark5059(Integer.valueOf(eglGetError)));
    }

    public static FrostHunterBitmapNeoCosmos7205 FrostHunterEditTextPulseHyperion1262(XmlPullParser xmlPullParser, String str, String str2) {
        FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta32002 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, concat3);
                String FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, concat4);
                String FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, concat5);
                String FrostHunterConstraintSetCloneMasterUltraRogue26335 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(xmlPullParser, concat6);
                if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null || FrostHunterConstraintSetCloneMasterUltraRogue26333 == null) {
                    return FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
                }
                FrostHunterAlertDialogAuroraDelta32002.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterMenuPixelAlphaGamma4898(FrostHunterConstraintSetCloneMasterUltraRogue26332, FrostHunterConstraintSetCloneMasterUltraRogue26334 != null ? Long.parseLong(FrostHunterConstraintSetCloneMasterUltraRogue26334) : 0L, FrostHunterConstraintSetCloneMasterUltraRogue26335 != null ? Long.parseLong(FrostHunterConstraintSetCloneMasterUltraRogue26335) : 0L));
            }
        } while (!FrostHunterCardViewLegendUltra9902.FrostHunterServiceEliteCelestialThunder1757(xmlPullParser, concat2));
        return FrostHunterAlertDialogAuroraDelta32002.FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    public static FrostHunterMagnetometerTurboBetaEpic7262 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = FrostHunterTraceMasterInfernoLegend3460.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterTraceHyperionAuroraNebula9947.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((FrostHunterServiceInfoEclipseAurora7011) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197)) {
            try {
                FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic7262 = (FrostHunterMagnetometerTurboBetaEpic7262) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterMagnetometerTurboBetaEpic7262 != null && localeList == ((LocaleList) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809)) {
                    return frostHunterMagnetometerTurboBetaEpic7262;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new FrostHunterLayerPrimePulseForce2951(localeList.get(i)));
                }
                FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic72622 = new FrostHunterMagnetometerTurboBetaEpic7262(arrayList);
                frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809 = localeList;
                frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200 = frostHunterMagnetometerTurboBetaEpic72622;
                return frostHunterMagnetometerTurboBetaEpic72622;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final int FrostHunterFlowMaxDragonHero5809(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void FrostHunterFragmentBetaMegaVortex6025(int i) {
        if (2 > i || i >= 37) {
            StringBuilder FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterKeyEventNovaXAlpha1220.FrostHunterServiceConnectionTurboPhoenixOmega6719("radix ", i, " was not in valid range ");
            FrostHunterServiceConnectionTurboPhoenixOmega67192.append(new FrostHunterFirebaseModelInterpreterOlympianStorm9227(2, 36, 1));
            throw new IllegalArgumentException(FrostHunterServiceConnectionTurboPhoenixOmega67192.toString());
        }
    }

    public static void FrostHunterKeyframeGammaGamma1197(String str, boolean z) {
        if (z) {
            return;
        }
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        throw new FrostHunterButtonRogueQuantum5741(str, FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025);
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final boolean FrostHunterLifecycleBlazeGammaElite2889(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final boolean FrostHunterLightSensorForceFusion4241(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean FrostHunterLintTitanVortexQuantum9911() {
        try {
            if (FrostHunterFilterSpectraTitan5298.FrostHunterLayoutLegendDelta7410 == null) {
                FrostHunterFilterSpectraTitan5298.FrostHunterLayoutLegendDelta7410 = Class.forName("android.os.SystemProperties");
            }
            if (FrostHunterFilterSpectraTitan5298.FrostHunterLayerEpicHyperQuantum7656 == null) {
                Class cls = FrostHunterFilterSpectraTitan5298.FrostHunterLayoutLegendDelta7410;
                FrostHunterFilterSpectraTitan5298.FrostHunterLayerEpicHyperQuantum7656 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = FrostHunterFilterSpectraTitan5298.FrostHunterLayerEpicHyperQuantum7656;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean FrostHunterLooperHyperionForce4133(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final boolean FrostHunterLooperThreadBetaHyperionMax1000(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static long FrostHunterMeteringPointBetaCyber9571(String str, int i) {
        int FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterServiceConnectionTurboPhoenixOmega6719(0, i, str, false);
        Matcher matcher = FrostHunterTypefaceNebulaBlazeNovaX2145.FrostHunterLightSensorForceFusion4241.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (FrostHunterServiceConnectionTurboPhoenixOmega67192 < i) {
            int FrostHunterServiceConnectionTurboPhoenixOmega67193 = FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterServiceConnectionTurboPhoenixOmega67192 + 1, i, str, true);
            matcher.region(FrostHunterServiceConnectionTurboPhoenixOmega67192, FrostHunterServiceConnectionTurboPhoenixOmega67193);
            if (i3 == -1 && matcher.usePattern(FrostHunterTypefaceNebulaBlazeNovaX2145.FrostHunterLightSensorForceFusion4241).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(FrostHunterTypefaceNebulaBlazeNovaX2145.FrostHunterServiceConnectionTurboPhoenixOmega6719).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = FrostHunterTypefaceNebulaBlazeNovaX2145.FrostHunterFragmentBetaMegaVortex6025;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i5 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterLooperHyperionForce4133(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(FrostHunterTypefaceNebulaBlazeNovaX2145.FrostHunterKeyframeGammaGamma1197).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i2 = Integer.parseInt(group6);
                }
            }
            FrostHunterServiceConnectionTurboPhoenixOmega67192 = FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterServiceConnectionTurboPhoenixOmega67193 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        if (i5 == -1) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(FrostHunterTextureViewForceEpicQuantum6388.FrostHunterAlphaAnimationNeoCosmos5761);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final FrostHunterButtonOmegaGammaSpectra9562 FrostHunterMeteringPointMegaCyber7955(InputStream inputStream) {
        inputStream.getClass();
        return new FrostHunterButtonOmegaGammaSpectra9562(inputStream, new FrostHunterAdMobBlazeEclipseGamma6684());
    }

    public static final void FrostHunterMotionSceneAuroraMega2271(FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        frostHunterFontFamilyNeoBetaEpic8574.getClass();
        FrostHunterCanvasInfernoVortex4700.FrostHunterLightSensorForceFusion4241(2, frostHunterFontFamilyNeoBetaEpic8574);
        frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, 1);
    }

    public static final FrostHunterBitmapBetaStrikeCosmos6327 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFragmentTransactionEclipseNovaXForce8101 frostHunterFragmentTransactionEclipseNovaXForce8101, Context context, int i) {
        if (!(frostHunterFragmentTransactionEclipseNovaXForce8101 instanceof FrostHunterDrawableNovaCelestial2796)) {
            return frostHunterFragmentTransactionEclipseNovaXForce8101 instanceof FrostHunterBarcodeScannerEclipseUltraMega1019 ? new FrostHunterTransitionManagerEliteVortexPixel2771(FrostHunterBindingAdapterSpeedNeo6677.FrostHunterServiceEliteCelestialThunder1757(frostHunterFragmentTransactionEclipseNovaXForce8101, context.getResources()).mutate()) : new FrostHunterObjectAnimatorSparkThunder3909(frostHunterFragmentTransactionEclipseNovaXForce8101);
        }
        FrostHunterRunnableEliteEclipseHero1863 frostHunterRunnableEliteEclipseHero1863 = new FrostHunterRunnableEliteEclipseHero1863(new FrostHunterPoseDetectionPixelEclipseBeta2021(((FrostHunterDrawableNovaCelestial2796) frostHunterFragmentTransactionEclipseNovaXForce8101).FrostHunterAlphaAnimationNeoCosmos5761), (r6.getWidth() << 32) | (r6.getHeight() & 4294967295L));
        frostHunterRunnableEliteEclipseHero1863.FrostHunterLightSensorForceFusion4241 = i;
        return frostHunterRunnableEliteEclipseHero1863;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void FrostHunterResourcesTitanHyperVision5823(FrostHunterFragmentHyperCosmosTitan7632 frostHunterFragmentHyperCosmosTitan7632) {
        if (((FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterFragmentHyperCosmosTitan7632).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterRemoteConfigPhantomDelta1739.FrostHunterR8MasterNebulaSpark7247(frostHunterFragmentHyperCosmosTitan7632, 1).FrostHunterScaleAnimationHeroStormNeo5898();
        }
    }

    public static int FrostHunterScaleAnimationStrikeSpark5059(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = FrostHunterConstraintSetCloneMasterUltraRogue2633[i];
        if (i4 == 44100) {
            return ((i2 % 2) + FrostHunterLevelListDrawableFusionDragonHero2232[i3]) * 2;
        }
        int i5 = FrostHunterLifecycleBlazeGammaElite2889[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int FrostHunterServiceConnectionTurboPhoenixOmega6719(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object FrostHunterServiceEliteCelestialThunder1757(FrostHunterStateFlowShadowOlympian7273 frostHunterStateFlowShadowOlympian7273, FrostHunterDispatchersOmegaOlympian3812 frostHunterDispatchersOmegaOlympian3812, Throwable th, FrostHunterViewBindingCelestialVortex7351 frostHunterViewBindingCelestialVortex7351) {
        FrostHunterTextInputLayoutNovaXOmega6335 frostHunterTextInputLayoutNovaXOmega6335;
        int i;
        try {
            if (frostHunterViewBindingCelestialVortex7351 instanceof FrostHunterTextInputLayoutNovaXOmega6335) {
                frostHunterTextInputLayoutNovaXOmega6335 = (FrostHunterTextInputLayoutNovaXOmega6335) frostHunterViewBindingCelestialVortex7351;
                int i2 = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    frostHunterTextInputLayoutNovaXOmega6335.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i2 - Integer.MIN_VALUE;
                    Object obj = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterFragmentBetaMegaVortex6025;
                    i = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    if (i != 0) {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        frostHunterTextInputLayoutNovaXOmega6335.FrostHunterKeyframeGammaGamma1197 = th;
                        frostHunterTextInputLayoutNovaXOmega6335.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
                        Object FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterDispatchersOmegaOlympian3812.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterStateFlowShadowOlympian7273, th, frostHunterTextInputLayoutNovaXOmega6335);
                        Object obj2 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                        if (FrostHunterLevelListDrawableFusionDragonHero22322 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                    }
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            }
            if (i != 0) {
            }
            return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                FrostHunterTransitionGammaTitanSpeed7178.FrostHunterRemoteConfigSpeedSpeed8566(th2, th);
            }
            throw th2;
        }
        frostHunterTextInputLayoutNovaXOmega6335 = new FrostHunterTextInputLayoutNovaXOmega6335(frostHunterViewBindingCelestialVortex7351);
        Object obj3 = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterFragmentBetaMegaVortex6025;
        i = frostHunterTextInputLayoutNovaXOmega6335.FrostHunterServiceConnectionTurboPhoenixOmega6719;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterLooperSpeedDeltaStrike3218 FrostHunterServiceInfoHyperionSparkMax9966(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(newPullParser, "x:xmpmeta")) {
            throw FrostHunterDiffUtilTurboSpark8131.FrostHunterAlphaAnimationNeoCosmos5761(null, "Couldn't find xmp metadata");
        }
        FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite2405 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
        FrostHunterBitmapNeoCosmos7205 frostHunterBitmapNeoCosmos7205 = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(newPullParser, FrostHunterServiceConnectionTurboPhoenixOmega6719[i2]);
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(FrostHunterConstraintSetCloneMasterUltraRogue26332) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(newPullParser, FrostHunterLightSensorForceFusion4241[i3]);
                            if (FrostHunterConstraintSetCloneMasterUltraRogue26333 != null) {
                                j = Long.parseLong(FrostHunterConstraintSetCloneMasterUltraRogue26333);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                FrostHunterAnimatorOlympianPhantomElite2405 frostHunterAnimatorOlympianPhantomElite24052 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFlowMaxDragonHero5809;
                                frostHunterBitmapNeoCosmos7205 = FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025;
                                break;
                            }
                            String FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterCardViewLegendUltra9902.FrostHunterConstraintSetCloneMasterUltraRogue2633(newPullParser, FrostHunterScaleAnimationStrikeSpark5059[i]);
                            if (FrostHunterConstraintSetCloneMasterUltraRogue26334 != null) {
                                frostHunterBitmapNeoCosmos7205 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(new FrostHunterMenuPixelAlphaGamma4898("image/jpeg", 0L, 0L), new FrostHunterMenuPixelAlphaGamma4898("video/mp4", Long.parseLong(FrostHunterConstraintSetCloneMasterUltraRogue26334), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(newPullParser, "Container:Directory")) {
                frostHunterBitmapNeoCosmos7205 = FrostHunterEditTextPulseHyperion1262(newPullParser, "Container", "Item");
            } else if (FrostHunterCardViewLegendUltra9902.FrostHunterLifecycleBlazeGammaElite2889(newPullParser, "GContainer:Directory")) {
                frostHunterBitmapNeoCosmos7205 = FrostHunterEditTextPulseHyperion1262(newPullParser, "GContainer", "GContainerItem");
            }
            if (FrostHunterCardViewLegendUltra9902.FrostHunterServiceEliteCelestialThunder1757(newPullParser, "x:xmpmeta")) {
                if (!frostHunterBitmapNeoCosmos7205.isEmpty()) {
                    return new FrostHunterLooperSpeedDeltaStrike3218(j, frostHunterBitmapNeoCosmos7205);
                }
            }
        }
        return null;
    }

    public static final void FrostHunterTextViewDragonStormMega4297(FrostHunterPagingCelestialThunderOmega7610 frostHunterPagingCelestialThunderOmega7610) {
        FrostHunterRemoteConfigPhantomDelta1739.FrostHunterRewardedAdMasterStrike9463(frostHunterPagingCelestialThunderOmega7610).FrostHunterDatabaseEliteShadowUltra2452();
    }

    public static final void FrostHunterViewPhantomNeo1634(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }
}
