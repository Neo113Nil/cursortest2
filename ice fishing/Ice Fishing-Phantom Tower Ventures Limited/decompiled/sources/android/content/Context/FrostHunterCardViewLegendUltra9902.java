package android.content.Context;

import android.os.Build;
import android.view.View;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterCardViewLegendUltra9902 {
    public static final int FrostHunterAlphaAnimationNeoCosmos5761(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static FrostHunterInstrumentationStrikeBlazeThunder7469 FrostHunterBundlePulseFusionHero2475(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new FrostHunterInstrumentationStrikeBlazeThunder7469(FrostHunterProximitySensorNeoMaster3330.FrostHunterServiceEliteCelestialThunder1757(view));
        }
        return null;
    }

    public static final FrostHunterThemeOverlayAlphaUltra2883 FrostHunterCameraXPixelTurboCosmos9814(FrostHunterThemeOverlayAlphaUltra2883 frostHunterThemeOverlayAlphaUltra2883) {
        frostHunterThemeOverlayAlphaUltra2883.getClass();
        FrostHunterCountDownTimerSparkStorm4778 FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterAlphaAnimationNeoCosmos5761();
        FrostHunterRoomEliteEclipseCyber1854 frostHunterRoomEliteEclipseCyber1854 = frostHunterThemeOverlayAlphaUltra2883.FrostHunterLightSensorForceFusion4241;
        FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterRemoteConfigSpeedSpeed8566 = new FrostHunterPlaceholderGammaThunderDragon8126(frostHunterRoomEliteEclipseCyber1854.FrostHunterServiceEliteCelestialThunder1757(), frostHunterRoomEliteEclipseCyber1854.FrostHunterAlphaAnimationNeoCosmos5761());
        return FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761();
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String FrostHunterLevelListDrawableFusionDragonHero2232(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean FrostHunterLifecycleBlazeGammaElite2889(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final FrostHunterFragmentManagerFusionNovaDragon6284 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284, FrostHunterViewLegendStormDelta9630 frostHunterViewLegendStormDelta9630) {
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster3441 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse1914 = FrostHunterStorageHyperionShadow1863.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse19142 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlphaAnimationNeoCosmos5761;
        if (frostHunterLaunchTitaniumPulse19142.equals(FrostHunterRewardedAdHyperStrike1151.FrostHunterTranslateAnimationCyberSolarUltra7101)) {
            frostHunterLaunchTitaniumPulse19142 = FrostHunterStorageHyperionShadow1863.FrostHunterServiceEliteCelestialThunder1757;
        }
        FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse19143 = frostHunterLaunchTitaniumPulse19142;
        long j = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterLifecycleMaxPulseElite3479[] frostHunterLifecycleMaxPulseElite3479Arr = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if ((j & 1095216660480L) == 0) {
            j = FrostHunterStorageHyperionShadow1863.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        long j2 = j;
        FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterBillingClientRogueThunder4597 == null) {
            frostHunterBillingClientRogueThunder4597 = FrostHunterBillingClientRogueThunder4597.FrostHunterFragmentBetaMegaVortex6025;
        }
        FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder45972 = frostHunterBillingClientRogueThunder4597;
        FrostHunterEditTextNovaXPrime4148 frostHunterEditTextNovaXPrime4148 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterEditTextNovaXPrime4148 frostHunterEditTextNovaXPrime41482 = new FrostHunterEditTextNovaXPrime4148(frostHunterEditTextNovaXPrime4148 != null ? frostHunterEditTextNovaXPrime4148.FrostHunterAlphaAnimationNeoCosmos5761 : 0);
        FrostHunterServiceConnectionVisionTurboPrime2486 frostHunterServiceConnectionVisionTurboPrime2486 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterServiceConnectionVisionTurboPrime2486 frostHunterServiceConnectionVisionTurboPrime24862 = new FrostHunterServiceConnectionVisionTurboPrime2486(frostHunterServiceConnectionVisionTurboPrime2486 != null ? frostHunterServiceConnectionVisionTurboPrime2486.FrostHunterAlphaAnimationNeoCosmos5761 : 65535);
        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova6138 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterFirestoreLegendNova6138 == null) {
            frostHunterFirestoreLegendNova6138 = FrostHunterFirestoreLegendNova6138.FrostHunterCameraXPixelTurboCosmos9814;
        }
        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova61382 = frostHunterFirestoreLegendNova6138;
        String str = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterRemoteConfigSpeedSpeed8566;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterCameraXPixelTurboCosmos9814;
        if ((j3 & 1095216660480L) == 0) {
            j3 = FrostHunterStorageHyperionShadow1863.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        long j4 = j3;
        FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision6043 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFlowMaxDragonHero5809;
        FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision60432 = new FrostHunterDebugHyperVision6043(frostHunterDebugHyperVision6043 != null ? frostHunterDebugHyperVision6043.FrostHunterAlphaAnimationNeoCosmos5761 : 0.0f);
        FrostHunterExoPlayerDragonSolar4887 frostHunterExoPlayerDragonSolar4887 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterExoPlayerDragonSolar4887 == null) {
            frostHunterExoPlayerDragonSolar4887 = FrostHunterExoPlayerDragonSolar4887.FrostHunterBundlePulseFusionHero2475;
        }
        FrostHunterExoPlayerDragonSolar4887 frostHunterExoPlayerDragonSolar48872 = frostHunterExoPlayerDragonSolar4887;
        FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic7262 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterKeyframeGammaGamma1197;
        if (frostHunterMagnetometerTurboBetaEpic7262 == null) {
            FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic72622 = FrostHunterMagnetometerTurboBetaEpic7262.FrostHunterAlertDialogAuroraDelta3200;
            frostHunterMagnetometerTurboBetaEpic7262 = FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223();
        }
        FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic72623 = frostHunterMagnetometerTurboBetaEpic7262;
        long j5 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFragmentBetaMegaVortex6025;
        if (j5 == 16) {
            j5 = FrostHunterStorageHyperionShadow1863.FrostHunterBundlePulseFusionHero2475;
        }
        long j6 = j5;
        FrostHunterKeyframeSparkVortex3717 frostHunterKeyframeSparkVortex3717 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterKeyframeSparkVortex3717 == null) {
            frostHunterKeyframeSparkVortex3717 = FrostHunterKeyframeSparkVortex3717.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        FrostHunterKeyframeSparkVortex3717 frostHunterKeyframeSparkVortex37172 = frostHunterKeyframeSparkVortex3717;
        FrostHunterPermissionHyperMegaAurora3908 frostHunterPermissionHyperMegaAurora3908 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLightSensorForceFusion4241;
        if (frostHunterPermissionHyperMegaAurora3908 == null) {
            frostHunterPermissionHyperMegaAurora3908 = FrostHunterPermissionHyperMegaAurora3908.FrostHunterServiceEliteCelestialThunder1757;
        }
        FrostHunterPermissionHyperMegaAurora3908 frostHunterPermissionHyperMegaAurora39082 = frostHunterPermissionHyperMegaAurora3908;
        FrostHunterDiffUtilQuantumNebulaTurbo2317 frostHunterDiffUtilQuantumNebulaTurbo2317 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterDiffUtilQuantumNebulaTurbo2317 == null) {
            frostHunterDiffUtilQuantumNebulaTurbo2317 = FrostHunterProximitySensorVortexEclipseStrike8378.FrostHunterCameraXTurboCelestialHero5430;
        }
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34412 = new FrostHunterThemeOverlayTitanHyperionMaster3441(frostHunterLaunchTitaniumPulse19143, j2, frostHunterBillingClientRogueThunder45972, frostHunterEditTextNovaXPrime41482, frostHunterServiceConnectionVisionTurboPrime24862, frostHunterFirestoreLegendNova61382, str2, j4, frostHunterDebugHyperVision60432, frostHunterExoPlayerDragonSolar48872, frostHunterMagnetometerTurboBetaEpic72623, j6, frostHunterKeyframeSparkVortex37172, frostHunterPermissionHyperMegaAurora39082, frostHunterDiffUtilQuantumNebulaTurbo2317);
        FrostHunterCardViewNovaMaxHyper9189 frostHunterCardViewNovaMaxHyper9189 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i = FrostHunterTimerPhoenixUltraMega8773.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterCardViewNovaMaxHyper9189.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = 5;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 5;
        }
        int i4 = frostHunterCardViewNovaMaxHyper9189.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i4 == 3) {
            int ordinal = frostHunterViewLegendStormDelta9630.ordinal();
            if (ordinal == 0) {
                i3 = 4;
            } else if (ordinal != 1) {
                FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                return null;
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = frostHunterViewLegendStormDelta9630.ordinal();
            if (ordinal2 == 0) {
                i3 = 1;
            } else {
                if (ordinal2 != 1) {
                    FrostHunterAdapterDelegateDragonVision1098.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return null;
                }
                i3 = 2;
            }
        } else {
            i3 = i4;
        }
        long j7 = frostHunterCardViewNovaMaxHyper9189.FrostHunterBundlePulseFusionHero2475;
        if ((j7 & 1095216660480L) == 0) {
            j7 = FrostHunterTimerPhoenixUltraMega8773.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        FrostHunterInterpolatorRogueBeta7108 frostHunterInterpolatorRogueBeta7108 = frostHunterCardViewNovaMaxHyper9189.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterInterpolatorRogueBeta7108 == null) {
            frostHunterInterpolatorRogueBeta7108 = FrostHunterInterpolatorRogueBeta7108.FrostHunterBundlePulseFusionHero2475;
        }
        FrostHunterBillingClientTurboMaster6935 frostHunterBillingClientTurboMaster6935 = frostHunterCardViewNovaMaxHyper9189.FrostHunterLifecycleBlazeGammaElite2889;
        FrostHunterInsetDrawableNeoOmegaPhantom2423 frostHunterInsetDrawableNeoOmegaPhantom2423 = frostHunterCardViewNovaMaxHyper9189.FrostHunterLevelListDrawableFusionDragonHero2232;
        int i5 = frostHunterCardViewNovaMaxHyper9189.FrostHunterRemoteConfigSpeedSpeed8566;
        if (i5 == 0) {
            i5 = FrostHunterMergePulseNebulaForce9477.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        int i6 = frostHunterCardViewNovaMaxHyper9189.FrostHunterCameraXPixelTurboCosmos9814;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        FrostHunterCanvasCosmosNova8701 frostHunterCanvasCosmosNova8701 = frostHunterCardViewNovaMaxHyper9189.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterCanvasCosmosNova8701 == null) {
            frostHunterCanvasCosmosNova8701 = FrostHunterCanvasCosmosNova8701.FrostHunterBundlePulseFusionHero2475;
        }
        return new FrostHunterFragmentManagerFusionNovaDragon6284(frostHunterThemeOverlayTitanHyperionMaster34412, new FrostHunterCardViewNovaMaxHyper9189(i2, i3, j7, frostHunterInterpolatorRogueBeta7108, frostHunterBillingClientTurboMaster6935, frostHunterInsetDrawableNeoOmegaPhantom2423, i5, i6, frostHunterCanvasCosmosNova8701), frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterBundlePulseFusionHero2475);
    }

    public static boolean FrostHunterServiceEliteCelestialThunder1757(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }
}
