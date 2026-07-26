package android.content.Context;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterColorDrawableRogueTitanium9596 implements FrostHunterViewPagerPixelLegendBeta8372 {
    public final List FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterCameraXPixelTurboCosmos9814;
    public final boolean FrostHunterCameraXTurboCelestialHero5430;
    public final FrostHunterKaptDeltaCelestialPhoenix4341 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final FrostHunterFragmentManagerFusionNovaDragon6284 FrostHunterFlowMaxDragonHero5809;
    public final FrostHunterNotificationManagerHeroNova8010 FrostHunterFragmentBetaMegaVortex6025;
    public final List FrostHunterKeyframeGammaGamma1197;
    public final FrostHunterInAppPurchaseNebulaSpeedPhoenix1905 FrostHunterLightSensorForceFusion4241;
    public FrostHunterServicePhantomGammaTitan7103 FrostHunterLintTitanVortexQuantum9911;
    public final int FrostHunterResourcesTitanHyperVision5823;
    public final CharSequence FrostHunterScaleAnimationStrikeSpark5059;
    public final FrostHunterDispatchersPrimeHeroSpeed4562 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    /* JADX WARN: Code restructure failed: missing block: B:152:0x048f, code lost:
    
        if ((r3.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterBundlePulseFusionHero2475 & 1095216660480L) == 0) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0097, code lost:
    
        if (r7 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0956 A[LOOP:7: B:336:0x0954->B:337:0x0956, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context.FrostHunterColorDrawableRogueTitanium9596, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v44, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterColorDrawableRogueTitanium9596(String str, FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284, List list, List list2, FrostHunterNotificationManagerHeroNova8010 frostHunterNotificationManagerHeroNova8010, FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562) {
        Locale locale;
        int i;
        FrostHunterTraceGammaTitan6222 frostHunterTraceGammaTitan6222;
        int i2;
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster3441;
        int size;
        int i3;
        Object obj;
        boolean z;
        String str2;
        FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic7262;
        FrostHunterExoPlayerDragonSolar4887 frostHunterExoPlayerDragonSolar4887;
        long j;
        long FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova6138;
        FrostHunterTraceGammaTitan6222 frostHunterTraceGammaTitan62222;
        boolean z2;
        FrostHunterDataBindingPhoenixThunderTitan8989 FrostHunterConstraintSetCloneMasterUltraRogue26332;
        Typeface typeface;
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34412;
        List list3;
        ?? r8;
        FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon62842;
        List list4;
        boolean z3;
        float f;
        String str3;
        CharSequence charSequence;
        long j2;
        FrostHunterColorDrawableRogueTitanium9596 frostHunterColorDrawableRogueTitanium9596;
        FrostHunterEditTextEpicDelta3687 frostHunterEditTextEpicDelta3687;
        long j3;
        float FrostHunterFlowMaxDragonHero5809;
        int length;
        FrostHunterInterpolatorRogueBeta7108 frostHunterInterpolatorRogueBeta7108;
        ArrayList arrayList;
        int size2;
        int i4;
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34413;
        ArrayList arrayList2;
        int i5;
        int i6;
        int size3;
        boolean z4;
        int i7;
        FrostHunterInterpolatorRogueBeta7108 frostHunterInterpolatorRogueBeta71082;
        int size4;
        int i8;
        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45622;
        Object frostHunterRoomDaoQuantumAuroraMaster3136;
        int i9;
        boolean z5;
        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45623;
        int i10;
        int i11;
        long j4;
        float FrostHunterBundlePulseFusionHero2475;
        FrostHunterBillingClientTurboMaster6935 frostHunterBillingClientTurboMaster6935;
        int i12;
        FrostHunterAnimatedVectorDrawableMaxRogueShadow9762 frostHunterAnimatedVectorDrawableMaxRogueShadow9762;
        int i13;
        int i14;
        FrostHunterBitmapHyperTurbo8349[] frostHunterBitmapHyperTurbo8349Arr;
        ?? obj2 = new Object();
        obj2.FrostHunterCameraXPixelTurboCosmos9814 = str;
        obj2.FrostHunterFlowMaxDragonHero5809 = frostHunterFragmentManagerFusionNovaDragon6284;
        obj2.FrostHunterAlertDialogAuroraDelta3200 = list;
        obj2.FrostHunterKeyframeGammaGamma1197 = list2;
        obj2.FrostHunterFragmentBetaMegaVortex6025 = frostHunterNotificationManagerHeroNova8010;
        obj2.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterDispatchersPrimeHeroSpeed4562;
        float FrostHunterConstraintSetCloneMasterUltraRogue26333 = frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        FrostHunterInAppPurchaseNebulaSpeedPhoenix1905 frostHunterInAppPurchaseNebulaSpeedPhoenix1905 = new FrostHunterInAppPurchaseNebulaSpeedPhoenix1905(1);
        ((TextPaint) frostHunterInAppPurchaseNebulaSpeedPhoenix1905).density = FrostHunterConstraintSetCloneMasterUltraRogue26333;
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterKeyframeSparkVortex3717.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterBundlePulseFusionHero2475 = 3;
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterServiceEliteCelestialThunder1757 = FrostHunterPermissionHyperMegaAurora3908.FrostHunterServiceEliteCelestialThunder1757;
        obj2.FrostHunterLightSensorForceFusion4241 = frostHunterInAppPurchaseNebulaSpeedPhoenix1905;
        FrostHunterEditTextEpicDelta3687 frostHunterEditTextEpicDelta36872 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterBundlePulseFusionHero2475;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = FrostHunterObserverSpeedNovaStorm3929.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = FrostHunterObserverSpeedNovaStorm3929.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterDataBindingStrikeVortex2868 frostHunterDataBindingStrikeVortex2868 = (FrostHunterDataBindingStrikeVortex2868) frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterDataBindingStrikeVortex2868 == null) {
            if (FrostHunterLaunchPulseSpeed9430.FrostHunterKeyframeGammaGamma1197 != null) {
                frostHunterDataBindingStrikeVortex2868 = frostHunterSQLiteMasterUltra99562.FrostHunterLightSensorForceFusion4241();
                frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809 = frostHunterDataBindingStrikeVortex2868;
            } else {
                frostHunterDataBindingStrikeVortex2868 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            }
        }
        obj2.FrostHunterCameraXTurboCelestialHero5430 = ((Boolean) frostHunterDataBindingStrikeVortex2868.getValue()).booleanValue();
        int i15 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic72622 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197;
        if (i15 != 4) {
            if (i15 != 5) {
                if (i15 == 1) {
                    i = 0;
                } else if (i15 == 2) {
                    i = 1;
                } else {
                    if (i15 != 3 && i15 != Integer.MIN_VALUE) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((frostHunterMagnetometerTurboBetaEpic72622 == null || (locale = ((FrostHunterLayerPrimePulseForce2951) frostHunterMagnetometerTurboBetaEpic72622.FrostHunterCameraXPixelTurboCosmos9814.get(0)).FrostHunterAlphaAnimationNeoCosmos5761) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj2.FrostHunterResourcesTitanHyperVision5823 = i;
                frostHunterTraceGammaTitan6222 = new FrostHunterTraceGammaTitan6222(obj2);
                FrostHunterCanvasCosmosNova8701 frostHunterCanvasCosmosNova8701 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
                frostHunterCanvasCosmosNova8701 = frostHunterCanvasCosmosNova8701 == null ? FrostHunterCanvasCosmosNova8701.FrostHunterBundlePulseFusionHero2475 : frostHunterCanvasCosmosNova8701;
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFlags(frostHunterCanvasCosmosNova8701.FrostHunterConstraintSetCloneMasterUltraRogue2633 ? frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() | 128 : frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() & (-129));
                i2 = frostHunterCanvasCosmosNova8701.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i2 == 1) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFlags(frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() | 64);
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setHinting(0);
                } else if (i2 == 2) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags();
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setHinting(1);
                } else if (i2 == 3) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags();
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setHinting(0);
                } else {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags();
                }
                frostHunterThemeOverlayTitanHyperionMaster3441 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((FrostHunterOrientationSensorNovaXCelestialMaster4056) obj).FrostHunterAlphaAnimationNeoCosmos5761 instanceof FrostHunterThemeOverlayTitanHyperionMaster3441) {
                        break;
                    } else {
                        i3++;
                    }
                }
                z = obj != null;
                long j5 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                str2 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterMagnetometerTurboBetaEpic7262 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterKeyframeGammaGamma1197;
                FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse1914 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlphaAnimationNeoCosmos5761;
                frostHunterExoPlayerDragonSolar4887 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlertDialogAuroraDelta3200;
                j = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j5);
                if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue2633, 4294967296L)) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextSize(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterTransitionListenerPulseVortexCosmos7949(j5));
                } else if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue2633, 8589934592L)) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextSize(FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j5) * frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextSize());
                }
                frostHunterFirestoreLegendNova6138 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (frostHunterFirestoreLegendNova6138 != null && frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceEliteCelestialThunder1757 == null && frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterBundlePulseFusionHero2475 == null) {
                    z2 = z;
                    frostHunterTraceGammaTitan62222 = frostHunterTraceGammaTitan6222;
                } else {
                    FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterBundlePulseFusionHero2475;
                    frostHunterBillingClientRogueThunder4597 = frostHunterBillingClientRogueThunder4597 == null ? FrostHunterBillingClientRogueThunder4597.FrostHunterFragmentBetaMegaVortex6025 : frostHunterBillingClientRogueThunder4597;
                    FrostHunterEditTextNovaXPrime4148 frostHunterEditTextNovaXPrime4148 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceEliteCelestialThunder1757;
                    int i16 = frostHunterEditTextNovaXPrime4148 != null ? frostHunterEditTextNovaXPrime4148.FrostHunterAlphaAnimationNeoCosmos5761 : 0;
                    FrostHunterServiceConnectionVisionTurboPrime2486 frostHunterServiceConnectionVisionTurboPrime2486 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLifecycleBlazeGammaElite2889;
                    int i17 = frostHunterServiceConnectionVisionTurboPrime2486 != null ? frostHunterServiceConnectionVisionTurboPrime2486.FrostHunterAlphaAnimationNeoCosmos5761 : 65535;
                    frostHunterTraceGammaTitan62222 = frostHunterTraceGammaTitan6222;
                    FrostHunterColorDrawableRogueTitanium9596 frostHunterColorDrawableRogueTitanium95962 = frostHunterTraceGammaTitan62222.FrostHunterCameraXPixelTurboCosmos9814;
                    z2 = z;
                    FrostHunterConstraintSetCloneMasterUltraRogue26332 = ((FrostHunterMotionEventForceInferno3363) frostHunterColorDrawableRogueTitanium95962.FrostHunterFragmentBetaMegaVortex6025).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirestoreLegendNova6138, frostHunterBillingClientRogueThunder4597, i16, i17);
                    if (FrostHunterConstraintSetCloneMasterUltraRogue26332 instanceof FrostHunterActivityInfoHyperAlphaForce7300) {
                        Object obj3 = ((FrostHunterActivityInfoHyperAlphaForce7300) FrostHunterConstraintSetCloneMasterUltraRogue26332).FrostHunterCameraXPixelTurboCosmos9814;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    } else {
                        FrostHunterServicePhantomGammaTitan7103 frostHunterServicePhantomGammaTitan7103 = new FrostHunterServicePhantomGammaTitan7103(FrostHunterConstraintSetCloneMasterUltraRogue26332, frostHunterColorDrawableRogueTitanium95962.FrostHunterLintTitanVortexQuantum9911);
                        frostHunterColorDrawableRogueTitanium95962.FrostHunterLintTitanVortexQuantum9911 = frostHunterServicePhantomGammaTitan7103;
                        Object obj4 = frostHunterServicePhantomGammaTitan7103.FrostHunterKeyframeGammaGamma1197;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    }
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTypeface(typeface);
                }
                if (frostHunterMagnetometerTurboBetaEpic7262 != null) {
                    FrostHunterMagnetometerTurboBetaEpic7262 frostHunterMagnetometerTurboBetaEpic72623 = FrostHunterMagnetometerTurboBetaEpic7262.FrostHunterAlertDialogAuroraDelta3200;
                    if (!frostHunterMagnetometerTurboBetaEpic7262.equals(FrostHunterVectorDrawableForceMax1351.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223())) {
                        ArrayList arrayList3 = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(frostHunterMagnetometerTurboBetaEpic7262));
                        Iterator it = frostHunterMagnetometerTurboBetaEpic7262.FrostHunterCameraXPixelTurboCosmos9814.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((FrostHunterLayerPrimePulseForce2951) it.next()).FrostHunterAlphaAnimationNeoCosmos5761);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFontFeatureSettings(str2);
                }
                if (frostHunterExoPlayerDragonSolar4887 != null && !frostHunterExoPlayerDragonSolar4887.equals(FrostHunterExoPlayerDragonSolar4887.FrostHunterBundlePulseFusionHero2475)) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextScaleX(frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextScaleX() * frostHunterExoPlayerDragonSolar4887.FrostHunterAlphaAnimationNeoCosmos5761);
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextSkewX(frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextSkewX() + frostHunterExoPlayerDragonSolar4887.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                }
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterServiceEliteCelestialThunder1757(frostHunterLaunchTitaniumPulse1914.FrostHunterConstraintSetCloneMasterUltraRogue2633());
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterBundlePulseFusionHero2475(frostHunterLaunchTitaniumPulse1914.FrostHunterRemoteConfigSpeedSpeed8566(), 9205357640488583168L, frostHunterLaunchTitaniumPulse1914.FrostHunterAlphaAnimationNeoCosmos5761());
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLightSensorForceFusion4241);
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceConnectionTurboPhoenixOmega6719);
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLifecycleBlazeGammaElite2889(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterScaleAnimationStrikeSpark5059);
                if (!FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 4294967296L) && FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j) != 0.0f) {
                    float textScaleX = frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextScaleX() * frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextSize();
                    float FrostHunterTransitionListenerPulseVortexCosmos7949 = frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterTransitionListenerPulseVortexCosmos7949(j);
                    if (textScaleX != 0.0f) {
                        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setLetterSpacing(FrostHunterTransitionListenerPulseVortexCosmos7949 / textScaleX);
                    }
                } else if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 8589934592L)) {
                    frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setLetterSpacing(FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j));
                }
                long j6 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFragmentBetaMegaVortex6025;
                FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision6043 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFlowMaxDragonHero5809;
                boolean z6 = (z2 || !FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 4294967296L) || FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j) == 0.0f) ? false : true;
                long j7 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterRemoteConfigSpeedSpeed8566;
                boolean z7 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(j6, j7) && !FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(j6, FrostHunterViewModelScopeLegendAurora8732.FrostHunterLevelListDrawableFusionDragonHero2232);
                boolean z8 = frostHunterDebugHyperVision6043 == null && Float.compare(frostHunterDebugHyperVision6043.FrostHunterAlphaAnimationNeoCosmos5761, 0.0f) != 0;
                frostHunterThemeOverlayTitanHyperionMaster34412 = (!z6 || z7 || z8) ? new FrostHunterThemeOverlayTitanHyperionMaster3441(0L, 0L, (FrostHunterBillingClientRogueThunder4597) null, (FrostHunterEditTextNovaXPrime4148) null, (FrostHunterServiceConnectionVisionTurboPrime2486) null, (FrostHunterFirestoreLegendNova6138) null, (String) null, z6 ? j : FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475, z8 ? frostHunterDebugHyperVision6043 : null, (FrostHunterExoPlayerDragonSolar4887) null, (FrostHunterMagnetometerTurboBetaEpic7262) null, z7 ? j6 : j7, (FrostHunterKeyframeSparkVortex3717) null, (FrostHunterPermissionHyperMegaAurora3908) null, 63103) : null;
                list3 = obj2.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterThemeOverlayTitanHyperionMaster34412 != null) {
                    int size5 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    int i18 = 0;
                    while (i18 < size5) {
                        arrayList4.add(i18 == 0 ? new FrostHunterOrientationSensorNovaXCelestialMaster4056(0, obj2.FrostHunterCameraXPixelTurboCosmos9814.length(), frostHunterThemeOverlayTitanHyperionMaster34412) : (FrostHunterOrientationSensorNovaXCelestialMaster4056) obj2.FrostHunterAlertDialogAuroraDelta3200.get(i18 - 1));
                        i18++;
                    }
                    list3 = arrayList4;
                }
                r8 = obj2.FrostHunterCameraXPixelTurboCosmos9814;
                float textSize = obj2.FrostHunterLightSensorForceFusion4241.getTextSize();
                frostHunterFragmentManagerFusionNovaDragon62842 = obj2.FrostHunterFlowMaxDragonHero5809;
                list4 = obj2.FrostHunterKeyframeGammaGamma1197;
                FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45624 = obj2.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                z3 = obj2.FrostHunterCameraXTurboCelestialHero5430;
                FrostHunterRunnablePulseInferno6680 frostHunterRunnablePulseInferno6680 = FrostHunterContextGammaLegendVortex3358.FrostHunterAlphaAnimationNeoCosmos5761;
                if (z3 || FrostHunterLaunchPulseSpeed9430.FrostHunterKeyframeGammaGamma1197 == null) {
                    f = 0.0f;
                    str3 = r8;
                    charSequence = str3;
                } else {
                    FrostHunterEditTextEpicDelta3687 frostHunterEditTextEpicDelta36873 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterBundlePulseFusionHero2475;
                    if (frostHunterEditTextEpicDelta36873 != null) {
                        FrostHunterBillingClientTurboMaster6935 frostHunterBillingClientTurboMaster69352 = frostHunterEditTextEpicDelta36873.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                    FrostHunterLaunchPulseSpeed9430 FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterLaunchPulseSpeed9430.FrostHunterAlphaAnimationNeoCosmos5761();
                    int length2 = r8.length();
                    if (!(FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633() == 1)) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Not initialized yet");
                        throw null;
                    }
                    if (length2 < 0) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("end cannot be negative");
                        throw null;
                    }
                    if (!(length2 >= 0)) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("start should be <= than end");
                        throw null;
                    }
                    if (!(r8.length() >= 0)) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("start should be < than charSequence length");
                        throw null;
                    }
                    if (!(length2 <= r8.length())) {
                        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("end should be < than charSequence length");
                        throw null;
                    }
                    if (r8.length() == 0 || length2 == 0) {
                        f = 0.0f;
                        str3 = r8;
                    } else {
                        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        frostHunterTraceHyperionAuroraNebula9947.getClass();
                        if (r8 instanceof Spannable) {
                            frostHunterAnimatedVectorDrawableMaxRogueShadow9762 = new FrostHunterAnimatedVectorDrawableMaxRogueShadow9762((Spannable) r8);
                            i12 = 0;
                        } else if (!(r8 instanceof Spanned) || ((Spanned) r8).nextSpanTransition(-1, length2 + 1, FrostHunterBitmapHyperTurbo8349.class) > length2) {
                            i12 = 0;
                            frostHunterAnimatedVectorDrawableMaxRogueShadow9762 = null;
                        } else {
                            frostHunterAnimatedVectorDrawableMaxRogueShadow9762 = new FrostHunterAnimatedVectorDrawableMaxRogueShadow9762();
                            i12 = 0;
                            frostHunterAnimatedVectorDrawableMaxRogueShadow9762.FrostHunterCameraXPixelTurboCosmos9814 = false;
                            frostHunterAnimatedVectorDrawableMaxRogueShadow9762.FrostHunterFlowMaxDragonHero5809 = new SpannableString(r8);
                        }
                        if (frostHunterAnimatedVectorDrawableMaxRogueShadow9762 == null || (frostHunterBitmapHyperTurbo8349Arr = (FrostHunterBitmapHyperTurbo8349[]) frostHunterAnimatedVectorDrawableMaxRogueShadow9762.FrostHunterFlowMaxDragonHero5809.getSpans(i12, length2, FrostHunterBitmapHyperTurbo8349.class)) == null || frostHunterBitmapHyperTurbo8349Arr.length <= 0) {
                            f = 0.0f;
                            str3 = r8;
                            i13 = length2;
                            i14 = 0;
                        } else {
                            int length3 = frostHunterBitmapHyperTurbo8349Arr.length;
                            f = 0.0f;
                            i13 = length2;
                            int i19 = 0;
                            int i20 = 0;
                            String str4 = r8;
                            while (true) {
                                str3 = str4;
                                if (i19 >= length3) {
                                    break;
                                }
                                FrostHunterBitmapHyperTurbo8349 frostHunterBitmapHyperTurbo8349 = frostHunterBitmapHyperTurbo8349Arr[i19];
                                int i21 = i19;
                                int spanStart = frostHunterAnimatedVectorDrawableMaxRogueShadow9762.FrostHunterFlowMaxDragonHero5809.getSpanStart(frostHunterBitmapHyperTurbo8349);
                                int i22 = length3;
                                int spanEnd = frostHunterAnimatedVectorDrawableMaxRogueShadow9762.FrostHunterFlowMaxDragonHero5809.getSpanEnd(frostHunterBitmapHyperTurbo8349);
                                if (spanStart != i13) {
                                    frostHunterAnimatedVectorDrawableMaxRogueShadow9762.removeSpan(frostHunterBitmapHyperTurbo8349);
                                }
                                i20 = Math.min(spanStart, i20);
                                i13 = Math.max(spanEnd, i13);
                                i19 = i21 + 1;
                                str4 = str3;
                                length3 = i22;
                            }
                            i14 = i20;
                        }
                        if (i14 != i13 && i14 < str3.length()) {
                            FrostHunterAnimatedVectorDrawableMaxRogueShadow9762 frostHunterAnimatedVectorDrawableMaxRogueShadow97622 = (FrostHunterAnimatedVectorDrawableMaxRogueShadow9762) frostHunterTraceHyperionAuroraNebula9947.FrostHunterTextViewDragonStormMega4297(str3, i14, i13, Integer.MAX_VALUE, false, new FrostHunterIntentForceSpeed4935(20, frostHunterAnimatedVectorDrawableMaxRogueShadow9762, (FrostHunterMagnetometerInfernoDragon1607) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809));
                            if (frostHunterAnimatedVectorDrawableMaxRogueShadow97622 != null) {
                                charSequence = frostHunterAnimatedVectorDrawableMaxRogueShadow97622.FrostHunterFlowMaxDragonHero5809;
                                charSequence.getClass();
                            }
                        }
                    }
                    charSequence = str3;
                    charSequence.getClass();
                }
                if (!list3.isEmpty() && list4.isEmpty() && FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757, FrostHunterInterpolatorRogueBeta7108.FrostHunterBundlePulseFusionHero2475)) {
                    j2 = 0;
                    frostHunterColorDrawableRogueTitanium9596 = obj2;
                } else {
                    j2 = 0;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterKeyframeSparkVortex3717.FrostHunterBundlePulseFusionHero2475)) {
                    spannableString.setSpan(FrostHunterContextGammaLegendVortex3358.FrostHunterAlphaAnimationNeoCosmos5761, 0, str3.length(), 33);
                }
                frostHunterEditTextEpicDelta3687 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterBundlePulseFusionHero2475;
                if ((frostHunterEditTextEpicDelta3687 != null || (frostHunterBillingClientTurboMaster6935 = frostHunterEditTextEpicDelta3687.FrostHunterAlphaAnimationNeoCosmos5761) == null) ? false : frostHunterBillingClientTurboMaster6935.FrostHunterAlphaAnimationNeoCosmos5761) {
                    FrostHunterCardViewNovaMaxHyper9189 frostHunterCardViewNovaMaxHyper9189 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (frostHunterCardViewNovaMaxHyper9189.FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
                        j3 = 1095216660480L;
                        float FrostHunterFlowMaxDragonHero58092 = FrostHunterGraphQuantumSpeed6562.FrostHunterFlowMaxDragonHero5809(frostHunterCardViewNovaMaxHyper9189.FrostHunterBundlePulseFusionHero2475, textSize, frostHunterDispatchersPrimeHeroSpeed45624);
                        if (!Float.isNaN(FrostHunterFlowMaxDragonHero58092)) {
                            spannableString.setSpan(new FrostHunterMapBlazeMega9173(FrostHunterFlowMaxDragonHero58092), 0, spannableString.length(), 33);
                        }
                        frostHunterInterpolatorRogueBeta7108 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
                        if (frostHunterInterpolatorRogueBeta7108 != null) {
                            long j8 = frostHunterInterpolatorRogueBeta7108.FrostHunterAlphaAnimationNeoCosmos5761;
                            long j9 = frostHunterInterpolatorRogueBeta7108.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            if ((!FrostHunterTabLayoutShadowElite6492.FrostHunterAlphaAnimationNeoCosmos5761(j8, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(0)) || !FrostHunterTabLayoutShadowElite6492.FrostHunterAlphaAnimationNeoCosmos5761(j9, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(0))) && (j8 & j3) != j2 && (j9 & j3) != j2) {
                                long FrostHunterConstraintSetCloneMasterUltraRogue26334 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j8);
                                if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26334, 4294967296L)) {
                                    FrostHunterBundlePulseFusionHero2475 = frostHunterDispatchersPrimeHeroSpeed45624.FrostHunterTransitionListenerPulseVortexCosmos7949(j8);
                                    j4 = 8589934592L;
                                } else {
                                    j4 = 8589934592L;
                                    FrostHunterBundlePulseFusionHero2475 = FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26334, 8589934592L) ? FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j8) * textSize : f;
                                }
                                long FrostHunterConstraintSetCloneMasterUltraRogue26335 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j9);
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(FrostHunterBundlePulseFusionHero2475), (int) Math.ceil(FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26335, 4294967296L) ? frostHunterDispatchersPrimeHeroSpeed45624.FrostHunterTransitionListenerPulseVortexCosmos7949(j9) : FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26335, j4) ? FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j9) * textSize : f)), 0, spannableString.length(), 33);
                            }
                        }
                        arrayList = new ArrayList(list3.size());
                        size2 = list3.size();
                        for (i4 = 0; i4 < size2; i4++) {
                            FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster4056 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) list3.get(i4);
                            Object obj5 = frostHunterOrientationSensorNovaXCelestialMaster4056.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (obj5 instanceof FrostHunterThemeOverlayTitanHyperionMaster3441) {
                                FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34414 = (FrostHunterThemeOverlayTitanHyperionMaster3441) obj5;
                                if (((frostHunterThemeOverlayTitanHyperionMaster34414.FrostHunterLevelListDrawableFusionDragonHero2232 == null && frostHunterThemeOverlayTitanHyperionMaster34414.FrostHunterServiceEliteCelestialThunder1757 == null && frostHunterThemeOverlayTitanHyperionMaster34414.FrostHunterBundlePulseFusionHero2475 == null) ? false : true) || ((FrostHunterThemeOverlayTitanHyperionMaster3441) obj5).FrostHunterLifecycleBlazeGammaElite2889 != null) {
                                    arrayList.add(frostHunterOrientationSensorNovaXCelestialMaster4056);
                                }
                            }
                        }
                        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34415 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761;
                        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova61382 = frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterLevelListDrawableFusionDragonHero2232;
                        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34416 = ((frostHunterFirestoreLegendNova61382 == null || frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterServiceEliteCelestialThunder1757 != null || frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterBundlePulseFusionHero2475 != null) && frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterLifecycleBlazeGammaElite2889 == null) ? null : new FrostHunterThemeOverlayTitanHyperionMaster3441(0L, 0L, frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterBundlePulseFusionHero2475, frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterServiceEliteCelestialThunder1757, frostHunterThemeOverlayTitanHyperionMaster34415.FrostHunterLifecycleBlazeGammaElite2889, frostHunterFirestoreLegendNova61382, (String) null, 0L, (FrostHunterDebugHyperVision6043) null, (FrostHunterExoPlayerDragonSolar4887) null, (FrostHunterMagnetometerTurboBetaEpic7262) null, 0L, (FrostHunterKeyframeSparkVortex3717) null, (FrostHunterPermissionHyperMegaAurora3908) null, 65475);
                        FrostHunterMaterialButtonCelestialLegend6807 frostHunterMaterialButtonCelestialLegend6807 = new FrostHunterMaterialButtonCelestialLegend6807(2, spannableString, frostHunterTraceGammaTitan62222);
                        if (arrayList.size() <= 1) {
                            int size6 = arrayList.size();
                            int i23 = size6 * 2;
                            int[] iArr = new int[i23];
                            int size7 = arrayList.size();
                            for (int i24 = 0; i24 < size7; i24++) {
                                FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster40562 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) arrayList.get(i24);
                                iArr[i24] = frostHunterOrientationSensorNovaXCelestialMaster40562.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                iArr[i24 + size6] = frostHunterOrientationSensorNovaXCelestialMaster40562.FrostHunterBundlePulseFusionHero2475;
                            }
                            if (i23 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i23 == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            int i25 = iArr[0];
                            int i26 = 0;
                            while (i26 < i23) {
                                int i27 = iArr[i26];
                                if (i27 == i25) {
                                    arrayList2 = arrayList;
                                    frostHunterThemeOverlayTitanHyperionMaster34413 = frostHunterThemeOverlayTitanHyperionMaster34416;
                                    i5 = i26;
                                    i6 = i23;
                                } else {
                                    int size8 = arrayList.size();
                                    frostHunterThemeOverlayTitanHyperionMaster34413 = frostHunterThemeOverlayTitanHyperionMaster34416;
                                    int i28 = 0;
                                    while (i28 < size8) {
                                        ArrayList arrayList5 = arrayList;
                                        FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster40563 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) arrayList.get(i28);
                                        int i29 = i26;
                                        int i30 = frostHunterOrientationSensorNovaXCelestialMaster40563.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        int i31 = i23;
                                        int i32 = frostHunterOrientationSensorNovaXCelestialMaster40563.FrostHunterBundlePulseFusionHero2475;
                                        if (i30 != i32 && FrostHunterCoordinatorLayoutUltraCosmosTitan7380.FrostHunterAlphaAnimationNeoCosmos5761(i25, i27, i30, i32)) {
                                            FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34417 = (FrostHunterThemeOverlayTitanHyperionMaster3441) frostHunterOrientationSensorNovaXCelestialMaster40563.FrostHunterAlphaAnimationNeoCosmos5761;
                                            frostHunterThemeOverlayTitanHyperionMaster34416 = frostHunterThemeOverlayTitanHyperionMaster34416 != null ? frostHunterThemeOverlayTitanHyperionMaster34416.FrostHunterBundlePulseFusionHero2475(frostHunterThemeOverlayTitanHyperionMaster34417) : frostHunterThemeOverlayTitanHyperionMaster34417;
                                        }
                                        i28++;
                                        arrayList = arrayList5;
                                        i26 = i29;
                                        i23 = i31;
                                    }
                                    arrayList2 = arrayList;
                                    i5 = i26;
                                    i6 = i23;
                                    if (frostHunterThemeOverlayTitanHyperionMaster34416 != null) {
                                        frostHunterMaterialButtonCelestialLegend6807.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterThemeOverlayTitanHyperionMaster34416, Integer.valueOf(i25), Integer.valueOf(i27));
                                    }
                                    i25 = i27;
                                }
                                i26 = i5 + 1;
                                frostHunterThemeOverlayTitanHyperionMaster34416 = frostHunterThemeOverlayTitanHyperionMaster34413;
                                arrayList = arrayList2;
                                i23 = i6;
                            }
                        } else if (!arrayList.isEmpty()) {
                            FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34418 = (FrostHunterThemeOverlayTitanHyperionMaster3441) ((FrostHunterOrientationSensorNovaXCelestialMaster4056) arrayList.get(0)).FrostHunterAlphaAnimationNeoCosmos5761;
                            frostHunterMaterialButtonCelestialLegend6807.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterThemeOverlayTitanHyperionMaster34416 != null ? frostHunterThemeOverlayTitanHyperionMaster34416.FrostHunterBundlePulseFusionHero2475(frostHunterThemeOverlayTitanHyperionMaster34418) : frostHunterThemeOverlayTitanHyperionMaster34418, Integer.valueOf(((FrostHunterOrientationSensorNovaXCelestialMaster4056) arrayList.get(0)).FrostHunterConstraintSetCloneMasterUltraRogue2633), Integer.valueOf(((FrostHunterOrientationSensorNovaXCelestialMaster4056) arrayList.get(0)).FrostHunterBundlePulseFusionHero2475));
                        }
                        size3 = list3.size();
                        z4 = false;
                        i7 = 0;
                        while (i7 < size3) {
                            FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster40564 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) list3.get(i7);
                            Object obj6 = frostHunterOrientationSensorNovaXCelestialMaster40564.FrostHunterAlphaAnimationNeoCosmos5761;
                            if (obj6 instanceof FrostHunterThemeOverlayTitanHyperionMaster3441) {
                                int i33 = frostHunterOrientationSensorNovaXCelestialMaster40564.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                int i34 = frostHunterOrientationSensorNovaXCelestialMaster40564.FrostHunterBundlePulseFusionHero2475;
                                if (i33 >= 0 && i33 < spannableString.length() && i34 > i33 && i34 <= spannableString.length()) {
                                    FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34419 = (FrostHunterThemeOverlayTitanHyperionMaster3441) obj6;
                                    FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision60432 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterFlowMaxDragonHero5809;
                                    FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse19142 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterAlphaAnimationNeoCosmos5761;
                                    if (frostHunterDebugHyperVision60432 != null) {
                                        spannableString.setSpan(new FrostHunterPaintUltraMaster4514(frostHunterDebugHyperVision60432.FrostHunterAlphaAnimationNeoCosmos5761, 0), i33, i34, 33);
                                    }
                                    FrostHunterGraphQuantumSpeed6562.FrostHunterAlertDialogAuroraDelta3200(spannableString, frostHunterLaunchTitaniumPulse19142.FrostHunterConstraintSetCloneMasterUltraRogue2633(), i33, i34);
                                    FrostHunterCardViewHyperionAurora3829 FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterLaunchTitaniumPulse19142.FrostHunterRemoteConfigSpeedSpeed8566();
                                    float FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterLaunchTitaniumPulse19142.FrostHunterAlphaAnimationNeoCosmos5761();
                                    if (FrostHunterRemoteConfigSpeedSpeed8566 != null) {
                                        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof FrostHunterMapPhoenixGammaCyber4635) {
                                            FrostHunterGraphQuantumSpeed6562.FrostHunterAlertDialogAuroraDelta3200(spannableString, ((FrostHunterMapPhoenixGammaCyber4635) FrostHunterRemoteConfigSpeedSpeed8566).FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223, i33, i34);
                                        } else {
                                            spannableString.setSpan(new FrostHunterLocationManagerMasterAlpha6950((FrostHunterSoundPoolThunderTurboNeo7086) FrostHunterRemoteConfigSpeedSpeed8566, FrostHunterAlphaAnimationNeoCosmos57612), i33, i34, 33);
                                        }
                                    }
                                    FrostHunterKeyframeSparkVortex3717 frostHunterKeyframeSparkVortex3717 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                                    if (frostHunterKeyframeSparkVortex3717 != null) {
                                        int i35 = frostHunterKeyframeSparkVortex3717.FrostHunterAlphaAnimationNeoCosmos5761;
                                        FrostHunterDrawableCompatOmegaCyber8154 frostHunterDrawableCompatOmegaCyber8154 = new FrostHunterDrawableCompatOmegaCyber8154((i35 | 1) == i35, (i35 | 2) == i35);
                                        i10 = 33;
                                        spannableString.setSpan(frostHunterDrawableCompatOmegaCyber8154, i33, i34, 33);
                                    } else {
                                        i10 = 33;
                                    }
                                    FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45625 = frostHunterDispatchersPrimeHeroSpeed45624;
                                    FrostHunterGraphQuantumSpeed6562.FrostHunterKeyframeGammaGamma1197(spannableString, frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterDispatchersPrimeHeroSpeed45625, i33, i34);
                                    String str5 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterRemoteConfigSpeedSpeed8566;
                                    if (str5 != null) {
                                        spannableString.setSpan(new FrostHunterAnimatorCosmosGamma4606(0, str5), i33, i34, i10);
                                    }
                                    FrostHunterExoPlayerDragonSolar4887 frostHunterExoPlayerDragonSolar48872 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterAlertDialogAuroraDelta3200;
                                    if (frostHunterExoPlayerDragonSolar48872 != null) {
                                        spannableString.setSpan(new ScaleXSpan(frostHunterExoPlayerDragonSolar48872.FrostHunterAlphaAnimationNeoCosmos5761), i33, i34, i10);
                                        spannableString.setSpan(new FrostHunterPaintUltraMaster4514(frostHunterExoPlayerDragonSolar48872.FrostHunterConstraintSetCloneMasterUltraRogue2633, 1), i33, i34, i10);
                                    }
                                    FrostHunterGraphQuantumSpeed6562.FrostHunterFragmentBetaMegaVortex6025(spannableString, frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterKeyframeGammaGamma1197, i33, i34);
                                    frostHunterDispatchersPrimeHeroSpeed45623 = frostHunterDispatchersPrimeHeroSpeed45625;
                                    long j10 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterFragmentBetaMegaVortex6025;
                                    if (j10 != 16) {
                                        spannableString.setSpan(new BackgroundColorSpan(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(j10)), i33, i34, 33);
                                    }
                                    FrostHunterPermissionHyperMegaAurora3908 frostHunterPermissionHyperMegaAurora3908 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterLightSensorForceFusion4241;
                                    if (frostHunterPermissionHyperMegaAurora3908 != null) {
                                        long j11 = frostHunterPermissionHyperMegaAurora3908.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        i9 = size3;
                                        z5 = z4;
                                        int FrostHunterRemoteConfigThunderShadow4435 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(frostHunterPermissionHyperMegaAurora3908.FrostHunterAlphaAnimationNeoCosmos5761);
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                                        float f2 = frostHunterPermissionHyperMegaAurora3908.FrostHunterBundlePulseFusionHero2475;
                                        FrostHunterAnimatorStrikeOlympianElite7274 frostHunterAnimatorStrikeOlympianElite7274 = new FrostHunterAnimatorStrikeOlympianElite7274(FrostHunterRemoteConfigThunderShadow4435, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                        i11 = 33;
                                        spannableString.setSpan(frostHunterAnimatorStrikeOlympianElite7274, i33, i34, 33);
                                    } else {
                                        i9 = size3;
                                        z5 = z4;
                                        i11 = 33;
                                    }
                                    FrostHunterDiffUtilQuantumNebulaTurbo2317 frostHunterDiffUtilQuantumNebulaTurbo2317 = frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterScaleAnimationStrikeSpark5059;
                                    if (frostHunterDiffUtilQuantumNebulaTurbo2317 != null) {
                                        spannableString.setSpan(new FrostHunterDrawableTurboNovaX6564(frostHunterDiffUtilQuantumNebulaTurbo2317), i33, i34, i11);
                                    }
                                    if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterCameraXPixelTurboCosmos9814), 4294967296L) || FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterThemeOverlayTitanHyperionMaster34419.FrostHunterCameraXPixelTurboCosmos9814), 8589934592L)) {
                                        z4 = true;
                                        i7++;
                                        size3 = i9;
                                        frostHunterDispatchersPrimeHeroSpeed45624 = frostHunterDispatchersPrimeHeroSpeed45623;
                                    }
                                    z4 = z5;
                                    i7++;
                                    size3 = i9;
                                    frostHunterDispatchersPrimeHeroSpeed45624 = frostHunterDispatchersPrimeHeroSpeed45623;
                                }
                            }
                            i9 = size3;
                            z5 = z4;
                            frostHunterDispatchersPrimeHeroSpeed45623 = frostHunterDispatchersPrimeHeroSpeed45624;
                            z4 = z5;
                            i7++;
                            size3 = i9;
                            frostHunterDispatchersPrimeHeroSpeed45624 = frostHunterDispatchersPrimeHeroSpeed45623;
                        }
                        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45626 = frostHunterDispatchersPrimeHeroSpeed45624;
                        if (z4) {
                            int size9 = list3.size();
                            int i36 = 0;
                            while (i36 < size9) {
                                FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster40565 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) list3.get(i36);
                                FrostHunterCombineQuantumSpectra3743 frostHunterCombineQuantumSpectra3743 = (FrostHunterCombineQuantumSpectra3743) frostHunterOrientationSensorNovaXCelestialMaster40565.FrostHunterAlphaAnimationNeoCosmos5761;
                                if (frostHunterCombineQuantumSpectra3743 instanceof FrostHunterThemeOverlayTitanHyperionMaster3441) {
                                    int i37 = frostHunterOrientationSensorNovaXCelestialMaster40565.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                    int i38 = frostHunterOrientationSensorNovaXCelestialMaster40565.FrostHunterBundlePulseFusionHero2475;
                                    if (i37 >= 0 && i37 < spannableString.length() && i38 > i37 && i38 <= spannableString.length()) {
                                        long j12 = ((FrostHunterThemeOverlayTitanHyperionMaster3441) frostHunterCombineQuantumSpectra3743).FrostHunterCameraXPixelTurboCosmos9814;
                                        long FrostHunterConstraintSetCloneMasterUltraRogue26336 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j12);
                                        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45627 = frostHunterDispatchersPrimeHeroSpeed45626;
                                        if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26336, 4294967296L)) {
                                            frostHunterDispatchersPrimeHeroSpeed45622 = frostHunterDispatchersPrimeHeroSpeed45627;
                                            frostHunterRoomDaoQuantumAuroraMaster3136 = new FrostHunterLocationManagerVortexDragon3041(frostHunterDispatchersPrimeHeroSpeed45622.FrostHunterTransitionListenerPulseVortexCosmos7949(j12));
                                        } else {
                                            frostHunterDispatchersPrimeHeroSpeed45622 = frostHunterDispatchersPrimeHeroSpeed45627;
                                            frostHunterRoomDaoQuantumAuroraMaster3136 = FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26336, 8589934592L) ? new FrostHunterRoomDaoQuantumAuroraMaster3136(FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j12)) : null;
                                        }
                                        if (frostHunterRoomDaoQuantumAuroraMaster3136 != null) {
                                            spannableString.setSpan(frostHunterRoomDaoQuantumAuroraMaster3136, i37, i38, 33);
                                        }
                                        i36++;
                                        frostHunterDispatchersPrimeHeroSpeed45626 = frostHunterDispatchersPrimeHeroSpeed45622;
                                    }
                                }
                                frostHunterDispatchersPrimeHeroSpeed45622 = frostHunterDispatchersPrimeHeroSpeed45626;
                                i36++;
                                frostHunterDispatchersPrimeHeroSpeed45626 = frostHunterDispatchersPrimeHeroSpeed45622;
                            }
                        }
                        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45628 = frostHunterDispatchersPrimeHeroSpeed45626;
                        frostHunterInterpolatorRogueBeta71082 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
                        if (frostHunterInterpolatorRogueBeta71082 != null) {
                            long j13 = frostHunterInterpolatorRogueBeta71082.FrostHunterAlphaAnimationNeoCosmos5761;
                            long FrostHunterConstraintSetCloneMasterUltraRogue26337 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j13);
                            if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26337, 4294967296L)) {
                                frostHunterDispatchersPrimeHeroSpeed45628.FrostHunterTransitionListenerPulseVortexCosmos7949(j13);
                            } else if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26337, 8589934592L)) {
                                FrostHunterTabLayoutShadowElite6492.FrostHunterBundlePulseFusionHero2475(j13);
                            }
                        }
                        size4 = list3.size();
                        for (i8 = 0; i8 < size4; i8++) {
                            Object obj7 = ((FrostHunterOrientationSensorNovaXCelestialMaster4056) list3.get(i8)).FrostHunterAlphaAnimationNeoCosmos5761;
                        }
                        if (list4.size() > 0) {
                            frostHunterColorDrawableRogueTitanium9596 = this;
                            charSequence = spannableString;
                            frostHunterColorDrawableRogueTitanium9596.FrostHunterScaleAnimationStrikeSpark5059 = charSequence;
                            frostHunterColorDrawableRogueTitanium9596.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = new FrostHunterKaptDeltaCelestialPhoenix4341(charSequence, frostHunterColorDrawableRogueTitanium9596.FrostHunterLightSensorForceFusion4241, frostHunterColorDrawableRogueTitanium9596.FrostHunterResourcesTitanHyperVision5823);
                            return;
                        }
                        FrostHunterOrientationSensorNovaXCelestialMaster4056 frostHunterOrientationSensorNovaXCelestialMaster40566 = (FrostHunterOrientationSensorNovaXCelestialMaster4056) list4.get(0);
                        if (frostHunterOrientationSensorNovaXCelestialMaster40566.FrostHunterAlphaAnimationNeoCosmos5761 != null) {
                            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                            throw null;
                        }
                        for (Object obj8 : spannableString.getSpans(frostHunterOrientationSensorNovaXCelestialMaster40566.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOrientationSensorNovaXCelestialMaster40566.FrostHunterBundlePulseFusionHero2475, FrostHunterBitmapHyperTurbo8349.class)) {
                            spannableString.removeSpan((FrostHunterBitmapHyperTurbo8349) obj8);
                        }
                        throw null;
                    }
                }
                j3 = 1095216660480L;
                FrostHunterCardViewNovaMaxHyper9189 frostHunterCardViewNovaMaxHyper91892 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                FrostHunterInsetDrawableNeoOmegaPhantom2423 frostHunterInsetDrawableNeoOmegaPhantom2423 = frostHunterCardViewNovaMaxHyper91892.FrostHunterLevelListDrawableFusionDragonHero2232;
                frostHunterInsetDrawableNeoOmegaPhantom2423 = frostHunterInsetDrawableNeoOmegaPhantom2423 == null ? FrostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterBundlePulseFusionHero2475 : frostHunterInsetDrawableNeoOmegaPhantom2423;
                FrostHunterFlowMaxDragonHero5809 = FrostHunterGraphQuantumSpeed6562.FrostHunterFlowMaxDragonHero5809(frostHunterCardViewNovaMaxHyper91892.FrostHunterBundlePulseFusionHero2475, textSize, frostHunterDispatchersPrimeHeroSpeed45624);
                if (!Float.isNaN(FrostHunterFlowMaxDragonHero5809)) {
                    if (spannableString.length() != 0) {
                        if (spannableString.length() == 0) {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                        if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                            length = spannableString.length();
                            int i39 = length;
                            int i40 = frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            spannableString.setSpan(new FrostHunterMotionEventVortexVisionCosmos3608(FrostHunterFlowMaxDragonHero5809, i39, (i40 & 1) <= 0, (i40 & 16) <= 0, frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterAlphaAnimationNeoCosmos5761, false), 0, spannableString.length(), 33);
                        }
                    }
                    length = spannableString.length() + 1;
                    int i392 = length;
                    int i402 = frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    spannableString.setSpan(new FrostHunterMotionEventVortexVisionCosmos3608(FrostHunterFlowMaxDragonHero5809, i392, (i402 & 1) <= 0, (i402 & 16) <= 0, frostHunterInsetDrawableNeoOmegaPhantom2423.FrostHunterAlphaAnimationNeoCosmos5761, false), 0, spannableString.length(), 33);
                }
                frostHunterInterpolatorRogueBeta7108 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
                if (frostHunterInterpolatorRogueBeta7108 != null) {
                }
                arrayList = new ArrayList(list3.size());
                size2 = list3.size();
                while (i4 < size2) {
                }
                FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster344152 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova613822 = frostHunterThemeOverlayTitanHyperionMaster344152.FrostHunterLevelListDrawableFusionDragonHero2232;
                if (frostHunterFirestoreLegendNova613822 == null || frostHunterThemeOverlayTitanHyperionMaster344152.FrostHunterServiceEliteCelestialThunder1757 != null || frostHunterThemeOverlayTitanHyperionMaster344152.FrostHunterBundlePulseFusionHero2475 != null) {
                }
                FrostHunterMaterialButtonCelestialLegend6807 frostHunterMaterialButtonCelestialLegend68072 = new FrostHunterMaterialButtonCelestialLegend6807(2, spannableString, frostHunterTraceGammaTitan62222);
                if (arrayList.size() <= 1) {
                }
                size3 = list3.size();
                z4 = false;
                i7 = 0;
                while (i7 < size3) {
                }
                FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed456262 = frostHunterDispatchersPrimeHeroSpeed45624;
                if (z4) {
                }
                FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed456282 = frostHunterDispatchersPrimeHeroSpeed456262;
                frostHunterInterpolatorRogueBeta71082 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
                if (frostHunterInterpolatorRogueBeta71082 != null) {
                }
                size4 = list3.size();
                while (i8 < size4) {
                }
                if (list4.size() > 0) {
                }
            }
            i = 3;
            obj2.FrostHunterResourcesTitanHyperVision5823 = i;
            frostHunterTraceGammaTitan6222 = new FrostHunterTraceGammaTitan6222(obj2);
            FrostHunterCanvasCosmosNova8701 frostHunterCanvasCosmosNova87012 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterCanvasCosmosNova87012 == null) {
            }
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFlags(frostHunterCanvasCosmosNova87012.FrostHunterConstraintSetCloneMasterUltraRogue2633 ? frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() | 128 : frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() & (-129));
            i2 = frostHunterCanvasCosmosNova87012.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i2 == 1) {
            }
            frostHunterThemeOverlayTitanHyperionMaster3441 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j52 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            str2 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterRemoteConfigSpeedSpeed8566;
            frostHunterMagnetometerTurboBetaEpic7262 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterKeyframeGammaGamma1197;
            FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse19143 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterExoPlayerDragonSolar4887 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlertDialogAuroraDelta3200;
            j = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterCameraXPixelTurboCosmos9814;
            FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j52);
            if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue2633, 4294967296L)) {
            }
            frostHunterFirestoreLegendNova6138 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterFirestoreLegendNova6138 != null) {
            }
            FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder45972 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterBillingClientRogueThunder45972 == null) {
            }
            FrostHunterEditTextNovaXPrime4148 frostHunterEditTextNovaXPrime41482 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterEditTextNovaXPrime41482 != null) {
            }
            FrostHunterServiceConnectionVisionTurboPrime2486 frostHunterServiceConnectionVisionTurboPrime24862 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLifecycleBlazeGammaElite2889;
            if (frostHunterServiceConnectionVisionTurboPrime24862 != null) {
            }
            frostHunterTraceGammaTitan62222 = frostHunterTraceGammaTitan6222;
            FrostHunterColorDrawableRogueTitanium9596 frostHunterColorDrawableRogueTitanium959622 = frostHunterTraceGammaTitan62222.FrostHunterCameraXPixelTurboCosmos9814;
            z2 = z;
            FrostHunterConstraintSetCloneMasterUltraRogue26332 = ((FrostHunterMotionEventForceInferno3363) frostHunterColorDrawableRogueTitanium959622.FrostHunterFragmentBetaMegaVortex6025).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirestoreLegendNova6138, frostHunterBillingClientRogueThunder45972, i16, i17);
            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 instanceof FrostHunterActivityInfoHyperAlphaForce7300) {
            }
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTypeface(typeface);
            if (frostHunterMagnetometerTurboBetaEpic7262 != null) {
            }
            if (str2 != null) {
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFontFeatureSettings(str2);
            }
            if (frostHunterExoPlayerDragonSolar4887 != null) {
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextScaleX(frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextScaleX() * frostHunterExoPlayerDragonSolar4887.FrostHunterAlphaAnimationNeoCosmos5761);
                frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTextSkewX(frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getTextSkewX() + frostHunterExoPlayerDragonSolar4887.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            }
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterServiceEliteCelestialThunder1757(frostHunterLaunchTitaniumPulse19143.FrostHunterConstraintSetCloneMasterUltraRogue2633());
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterBundlePulseFusionHero2475(frostHunterLaunchTitaniumPulse19143.FrostHunterRemoteConfigSpeedSpeed8566(), 9205357640488583168L, frostHunterLaunchTitaniumPulse19143.FrostHunterAlphaAnimationNeoCosmos5761());
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLightSensorForceFusion4241);
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceConnectionTurboPhoenixOmega6719);
            frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLifecycleBlazeGammaElite2889(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterScaleAnimationStrikeSpark5059);
            if (!FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 4294967296L)) {
            }
            if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 8589934592L)) {
            }
            long j62 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFragmentBetaMegaVortex6025;
            FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision60433 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFlowMaxDragonHero5809;
            if (z2) {
            }
            long j72 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterRemoteConfigSpeedSpeed8566;
            if (FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(j62, j72)) {
            }
            if (frostHunterDebugHyperVision60433 == null) {
            }
            if (z6) {
            }
            list3 = obj2.FrostHunterAlertDialogAuroraDelta3200;
            if (frostHunterThemeOverlayTitanHyperionMaster34412 != null) {
            }
            r8 = obj2.FrostHunterCameraXPixelTurboCosmos9814;
            float textSize2 = obj2.FrostHunterLightSensorForceFusion4241.getTextSize();
            frostHunterFragmentManagerFusionNovaDragon62842 = obj2.FrostHunterFlowMaxDragonHero5809;
            list4 = obj2.FrostHunterKeyframeGammaGamma1197;
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed456242 = obj2.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            z3 = obj2.FrostHunterCameraXTurboCelestialHero5430;
            FrostHunterRunnablePulseInferno6680 frostHunterRunnablePulseInferno66802 = FrostHunterContextGammaLegendVortex3358.FrostHunterAlphaAnimationNeoCosmos5761;
            if (z3) {
            }
            f = 0.0f;
            str3 = r8;
            charSequence = str3;
            if (!list3.isEmpty()) {
            }
            j2 = 0;
            if (charSequence instanceof Spannable) {
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterKeyframeSparkVortex3717.FrostHunterBundlePulseFusionHero2475)) {
            }
            frostHunterEditTextEpicDelta3687 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterBundlePulseFusionHero2475;
            if ((frostHunterEditTextEpicDelta3687 != null || (frostHunterBillingClientTurboMaster6935 = frostHunterEditTextEpicDelta3687.FrostHunterAlphaAnimationNeoCosmos5761) == null) ? false : frostHunterBillingClientTurboMaster6935.FrostHunterAlphaAnimationNeoCosmos5761) {
            }
            j3 = 1095216660480L;
            FrostHunterCardViewNovaMaxHyper9189 frostHunterCardViewNovaMaxHyper918922 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterInsetDrawableNeoOmegaPhantom2423 frostHunterInsetDrawableNeoOmegaPhantom24232 = frostHunterCardViewNovaMaxHyper918922.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterInsetDrawableNeoOmegaPhantom24232 == null) {
            }
            FrostHunterFlowMaxDragonHero5809 = FrostHunterGraphQuantumSpeed6562.FrostHunterFlowMaxDragonHero5809(frostHunterCardViewNovaMaxHyper918922.FrostHunterBundlePulseFusionHero2475, textSize2, frostHunterDispatchersPrimeHeroSpeed456242);
            if (!Float.isNaN(FrostHunterFlowMaxDragonHero5809)) {
            }
            frostHunterInterpolatorRogueBeta7108 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterInterpolatorRogueBeta7108 != null) {
            }
            arrayList = new ArrayList(list3.size());
            size2 = list3.size();
            while (i4 < size2) {
            }
            FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster3441522 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova6138222 = frostHunterThemeOverlayTitanHyperionMaster3441522.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterFirestoreLegendNova6138222 == null || frostHunterThemeOverlayTitanHyperionMaster3441522.FrostHunterServiceEliteCelestialThunder1757 != null || frostHunterThemeOverlayTitanHyperionMaster3441522.FrostHunterBundlePulseFusionHero2475 != null) {
            }
            FrostHunterMaterialButtonCelestialLegend6807 frostHunterMaterialButtonCelestialLegend680722 = new FrostHunterMaterialButtonCelestialLegend6807(2, spannableString, frostHunterTraceGammaTitan62222);
            if (arrayList.size() <= 1) {
            }
            size3 = list3.size();
            z4 = false;
            i7 = 0;
            while (i7 < size3) {
            }
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562622 = frostHunterDispatchersPrimeHeroSpeed456242;
            if (z4) {
            }
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562822 = frostHunterDispatchersPrimeHeroSpeed4562622;
            frostHunterInterpolatorRogueBeta71082 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterInterpolatorRogueBeta71082 != null) {
            }
            size4 = list3.size();
            while (i8 < size4) {
            }
            if (list4.size() > 0) {
            }
        }
        i = 2;
        obj2.FrostHunterResourcesTitanHyperVision5823 = i;
        frostHunterTraceGammaTitan6222 = new FrostHunterTraceGammaTitan6222(obj2);
        FrostHunterCanvasCosmosNova8701 frostHunterCanvasCosmosNova870122 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterCanvasCosmosNova870122 == null) {
        }
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setFlags(frostHunterCanvasCosmosNova870122.FrostHunterConstraintSetCloneMasterUltraRogue2633 ? frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() | 128 : frostHunterInAppPurchaseNebulaSpeedPhoenix1905.getFlags() & (-129));
        i2 = frostHunterCanvasCosmosNova870122.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i2 == 1) {
        }
        frostHunterThemeOverlayTitanHyperionMaster3441 = frostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j522 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        str2 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterRemoteConfigSpeedSpeed8566;
        frostHunterMagnetometerTurboBetaEpic7262 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterKeyframeGammaGamma1197;
        FrostHunterLaunchTitaniumPulse1914 frostHunterLaunchTitaniumPulse191432 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterExoPlayerDragonSolar4887 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterAlertDialogAuroraDelta3200;
        j = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j522);
        if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue2633, 4294967296L)) {
        }
        frostHunterFirestoreLegendNova6138 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterFirestoreLegendNova6138 != null) {
        }
        FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder459722 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterBundlePulseFusionHero2475;
        if (frostHunterBillingClientRogueThunder459722 == null) {
        }
        FrostHunterEditTextNovaXPrime4148 frostHunterEditTextNovaXPrime414822 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterEditTextNovaXPrime414822 != null) {
        }
        FrostHunterServiceConnectionVisionTurboPrime2486 frostHunterServiceConnectionVisionTurboPrime248622 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLifecycleBlazeGammaElite2889;
        if (frostHunterServiceConnectionVisionTurboPrime248622 != null) {
        }
        frostHunterTraceGammaTitan62222 = frostHunterTraceGammaTitan6222;
        FrostHunterColorDrawableRogueTitanium9596 frostHunterColorDrawableRogueTitanium9596222 = frostHunterTraceGammaTitan62222.FrostHunterCameraXPixelTurboCosmos9814;
        z2 = z;
        FrostHunterConstraintSetCloneMasterUltraRogue26332 = ((FrostHunterMotionEventForceInferno3363) frostHunterColorDrawableRogueTitanium9596222.FrostHunterFragmentBetaMegaVortex6025).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirestoreLegendNova6138, frostHunterBillingClientRogueThunder459722, i16, i17);
        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 instanceof FrostHunterActivityInfoHyperAlphaForce7300) {
        }
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.setTypeface(typeface);
        if (frostHunterMagnetometerTurboBetaEpic7262 != null) {
        }
        if (str2 != null) {
        }
        if (frostHunterExoPlayerDragonSolar4887 != null) {
        }
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterServiceEliteCelestialThunder1757(frostHunterLaunchTitaniumPulse191432.FrostHunterConstraintSetCloneMasterUltraRogue2633());
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterBundlePulseFusionHero2475(frostHunterLaunchTitaniumPulse191432.FrostHunterRemoteConfigSpeedSpeed8566(), 9205357640488583168L, frostHunterLaunchTitaniumPulse191432.FrostHunterAlphaAnimationNeoCosmos5761());
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterLightSensorForceFusion4241);
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterServiceConnectionTurboPhoenixOmega6719);
        frostHunterInAppPurchaseNebulaSpeedPhoenix1905.FrostHunterLifecycleBlazeGammaElite2889(frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterScaleAnimationStrikeSpark5059);
        if (!FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 4294967296L)) {
        }
        if (FrostHunterLifecycleMaxPulseElite3479.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterTabLayoutShadowElite6492.FrostHunterConstraintSetCloneMasterUltraRogue2633(j), 8589934592L)) {
        }
        long j622 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterDebugHyperVision6043 frostHunterDebugHyperVision604332 = frostHunterThemeOverlayTitanHyperionMaster3441.FrostHunterFlowMaxDragonHero5809;
        if (z2) {
        }
        long j722 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterRemoteConfigSpeedSpeed8566;
        if (FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475(j622, j722)) {
        }
        if (frostHunterDebugHyperVision604332 == null) {
        }
        if (z6) {
        }
        list3 = obj2.FrostHunterAlertDialogAuroraDelta3200;
        if (frostHunterThemeOverlayTitanHyperionMaster34412 != null) {
        }
        r8 = obj2.FrostHunterCameraXPixelTurboCosmos9814;
        float textSize22 = obj2.FrostHunterLightSensorForceFusion4241.getTextSize();
        frostHunterFragmentManagerFusionNovaDragon62842 = obj2.FrostHunterFlowMaxDragonHero5809;
        list4 = obj2.FrostHunterKeyframeGammaGamma1197;
        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562422 = obj2.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        z3 = obj2.FrostHunterCameraXTurboCelestialHero5430;
        FrostHunterRunnablePulseInferno6680 frostHunterRunnablePulseInferno668022 = FrostHunterContextGammaLegendVortex3358.FrostHunterAlphaAnimationNeoCosmos5761;
        if (z3) {
        }
        f = 0.0f;
        str3 = r8;
        charSequence = str3;
        if (!list3.isEmpty()) {
        }
        j2 = 0;
        if (charSequence instanceof Spannable) {
        }
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceConnectionTurboPhoenixOmega6719, FrostHunterKeyframeSparkVortex3717.FrostHunterBundlePulseFusionHero2475)) {
        }
        frostHunterEditTextEpicDelta3687 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterBundlePulseFusionHero2475;
        if ((frostHunterEditTextEpicDelta3687 != null || (frostHunterBillingClientTurboMaster6935 = frostHunterEditTextEpicDelta3687.FrostHunterAlphaAnimationNeoCosmos5761) == null) ? false : frostHunterBillingClientTurboMaster6935.FrostHunterAlphaAnimationNeoCosmos5761) {
        }
        j3 = 1095216660480L;
        FrostHunterCardViewNovaMaxHyper9189 frostHunterCardViewNovaMaxHyper9189222 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterInsetDrawableNeoOmegaPhantom2423 frostHunterInsetDrawableNeoOmegaPhantom242322 = frostHunterCardViewNovaMaxHyper9189222.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterInsetDrawableNeoOmegaPhantom242322 == null) {
        }
        FrostHunterFlowMaxDragonHero5809 = FrostHunterGraphQuantumSpeed6562.FrostHunterFlowMaxDragonHero5809(frostHunterCardViewNovaMaxHyper9189222.FrostHunterBundlePulseFusionHero2475, textSize22, frostHunterDispatchersPrimeHeroSpeed4562422);
        if (!Float.isNaN(FrostHunterFlowMaxDragonHero5809)) {
        }
        frostHunterInterpolatorRogueBeta7108 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterInterpolatorRogueBeta7108 != null) {
        }
        arrayList = new ArrayList(list3.size());
        size2 = list3.size();
        while (i4 < size2) {
        }
        FrostHunterThemeOverlayTitanHyperionMaster3441 frostHunterThemeOverlayTitanHyperionMaster34415222 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterFirestoreLegendNova6138 frostHunterFirestoreLegendNova61382222 = frostHunterThemeOverlayTitanHyperionMaster34415222.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (frostHunterFirestoreLegendNova61382222 == null || frostHunterThemeOverlayTitanHyperionMaster34415222.FrostHunterServiceEliteCelestialThunder1757 != null || frostHunterThemeOverlayTitanHyperionMaster34415222.FrostHunterBundlePulseFusionHero2475 != null) {
        }
        FrostHunterMaterialButtonCelestialLegend6807 frostHunterMaterialButtonCelestialLegend6807222 = new FrostHunterMaterialButtonCelestialLegend6807(2, spannableString, frostHunterTraceGammaTitan62222);
        if (arrayList.size() <= 1) {
        }
        size3 = list3.size();
        z4 = false;
        i7 = 0;
        while (i7 < size3) {
        }
        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45626222 = frostHunterDispatchersPrimeHeroSpeed4562422;
        if (z4) {
        }
        FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed45628222 = frostHunterDispatchersPrimeHeroSpeed45626222;
        frostHunterInterpolatorRogueBeta71082 = frostHunterFragmentManagerFusionNovaDragon62842.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterServiceEliteCelestialThunder1757;
        if (frostHunterInterpolatorRogueBeta71082 != null) {
        }
        size4 = list3.size();
        while (i8 < size4) {
        }
        if (list4.size() > 0) {
        }
    }

    @Override // android.content.Context.FrostHunterViewPagerPixelLegendBeta8372
    public final float FrostHunterFragmentBetaMegaVortex6025() {
        return this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223.FrostHunterBundlePulseFusionHero2475();
    }

    @Override // android.content.Context.FrostHunterViewPagerPixelLegendBeta8372
    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232() {
        FrostHunterServicePhantomGammaTitan7103 frostHunterServicePhantomGammaTitan7103 = this.FrostHunterLintTitanVortexQuantum9911;
        if (frostHunterServicePhantomGammaTitan7103 != null ? frostHunterServicePhantomGammaTitan7103.FrostHunterLightSensorForceFusion4241() : false) {
            return true;
        }
        if (!this.FrostHunterCameraXTurboCelestialHero5430) {
            FrostHunterEditTextEpicDelta3687 frostHunterEditTextEpicDelta3687 = this.FrostHunterFlowMaxDragonHero5809.FrostHunterBundlePulseFusionHero2475;
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956 = FrostHunterObserverSpeedNovaStorm3929.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra99562 = FrostHunterObserverSpeedNovaStorm3929.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterDataBindingStrikeVortex2868 frostHunterDataBindingStrikeVortex2868 = (FrostHunterDataBindingStrikeVortex2868) frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809;
            if (frostHunterDataBindingStrikeVortex2868 == null) {
                if (FrostHunterLaunchPulseSpeed9430.FrostHunterKeyframeGammaGamma1197 != null) {
                    frostHunterDataBindingStrikeVortex2868 = frostHunterSQLiteMasterUltra99562.FrostHunterLightSensorForceFusion4241();
                    frostHunterSQLiteMasterUltra99562.FrostHunterFlowMaxDragonHero5809 = frostHunterDataBindingStrikeVortex2868;
                } else {
                    frostHunterDataBindingStrikeVortex2868 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                }
            }
            if (((Boolean) frostHunterDataBindingStrikeVortex2868.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.Context.FrostHunterViewPagerPixelLegendBeta8372
    public final float FrostHunterServiceEliteCelestialThunder1757() {
        FrostHunterKaptDeltaCelestialPhoenix4341 frostHunterKaptDeltaCelestialPhoenix4341 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        float f = frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterLifecycleBlazeGammaElite2889;
        TextPaint textPaint = frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (!Float.isNaN(f)) {
            return frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterLifecycleBlazeGammaElite2889;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterAlphaAnimationNeoCosmos5761;
        lineInstance.setText(new FrostHunterMeteringPointSpeedHyperionEclipse2694(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new FrostHunterTextInputLayoutPhantomPhantom6564(14));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new FrostHunterLaunchHeroForce4010(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce4010 = (FrostHunterLaunchHeroForce4010) priorityQueue.peek();
                if (frostHunterLaunchHeroForce4010 != null && ((Number) frostHunterLaunchHeroForce4010.FrostHunterFlowMaxDragonHero5809).intValue() - ((Number) frostHunterLaunchHeroForce4010.FrostHunterCameraXPixelTurboCosmos9814).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new FrostHunterLaunchHeroForce4010(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterCameraXPixelTurboCosmos9814();
                return 0.0f;
            }
            FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce40102 = (FrostHunterLaunchHeroForce4010) it.next();
            f2 = Layout.getDesiredWidth(frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterConstraintSetCloneMasterUltraRogue2633(), ((Number) frostHunterLaunchHeroForce40102.FrostHunterCameraXPixelTurboCosmos9814).intValue(), ((Number) frostHunterLaunchHeroForce40102.FrostHunterFlowMaxDragonHero5809).intValue(), textPaint);
            while (it.hasNext()) {
                FrostHunterLaunchHeroForce4010 frostHunterLaunchHeroForce40103 = (FrostHunterLaunchHeroForce4010) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterConstraintSetCloneMasterUltraRogue2633(), ((Number) frostHunterLaunchHeroForce40103.FrostHunterCameraXPixelTurboCosmos9814).intValue(), ((Number) frostHunterLaunchHeroForce40103.FrostHunterFlowMaxDragonHero5809).intValue(), textPaint));
            }
        }
        frostHunterKaptDeltaCelestialPhoenix4341.FrostHunterLifecycleBlazeGammaElite2889 = f2;
        return f2;
    }
}
