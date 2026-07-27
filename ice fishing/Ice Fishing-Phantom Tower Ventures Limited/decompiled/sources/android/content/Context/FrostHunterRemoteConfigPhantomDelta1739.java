package android.content.Context;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterRemoteConfigPhantomDelta1739 {
    public static int FrostHunterCameraXPixelTurboCosmos9814;
    public static String FrostHunterRemoteConfigSpeedSpeed8566;
    public static final FrostHunterTraceCelestialVortexSpark6705[] FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterTraceCelestialVortexSpark6705[0];
    public static final FrostHunterWorkManagerMaxTurbo1858 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterWorkManagerMaxTurbo1858("CLOSED", 3);
    public static final char[] FrostHunterBundlePulseFusionHero2475 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final StackTraceElement[] FrostHunterServiceEliteCelestialThunder1757 = new StackTraceElement[0];
    public static final FrostHunterBarrierThunderHyperion9659 FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterBarrierThunderHyperion9659(0.0f, 0.0f, 10.0f, 10.0f);
    public static final FrostHunterShapeDrawableSpectraGammaEclipse4714 FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterShapeDrawableSpectraGammaEclipse4714(new FrostHunterRecyclerViewStormPixelSpectra2196(7));

    public static final long FrostHunterAlertDialogAuroraDelta3200(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void FrostHunterAlphaAnimationNeoCosmos5761(final boolean z, final FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-361453782);
        int i2 = i | 6 | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (FrostHunterZipStrikeAuroraAlpha2474) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterLinearLayoutPulseElite6567.FrostHunterAlphaAnimationNeoCosmos5761);
            if (obj == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(950836184);
                View view = (View) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterLifecycleBlazeGammaElite2889);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    Object obj2 = tag instanceof FrostHunterZipStrikeAuroraAlpha2474 ? (FrostHunterZipStrikeAuroraAlpha2474) tag : null;
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    } else {
                        Object FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterLevelListDrawableFusionDragonHero2232(view);
                        view = FrostHunterLevelListDrawableFusionDragonHero22322 instanceof View ? (View) FrostHunterLevelListDrawableFusionDragonHero22322 : null;
                    }
                }
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(950834231);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            }
            if (obj == null) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(535274673);
                obj = (FrostHunterActionBarTurboSolar8668) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterShapeDrawableTurboMasterNova3851.FrostHunterAlphaAnimationNeoCosmos5761);
                if (obj == null) {
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1208426157);
                    View view2 = (View) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterLifecycleBlazeGammaElite2889);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        Object obj3 = tag2 instanceof FrostHunterActionBarTurboSolar8668 ? (FrostHunterActionBarTurboSolar8668) tag2 : null;
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        } else {
                            Object FrostHunterLevelListDrawableFusionDragonHero22323 = FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterLevelListDrawableFusionDragonHero2232(view2);
                            view2 = FrostHunterLevelListDrawableFusionDragonHero22323 instanceof View ? (View) FrostHunterLevelListDrawableFusionDragonHero22323 : null;
                        }
                    }
                } else {
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1208423708);
                }
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
                if (obj == null) {
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1208428160);
                    Object obj4 = (Context) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterFlipAnimationInfernoSpectraTitan5388.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    while (true) {
                        if (!(obj4 instanceof ContextWrapper)) {
                            obj4 = null;
                            break;
                        } else if (obj4 instanceof FrostHunterActionBarTurboSolar8668) {
                            break;
                        } else {
                            obj4 = ((ContextWrapper) obj4).getBaseContext();
                        }
                    }
                    obj = (FrostHunterActionBarTurboSolar8668) obj4;
                } else {
                    frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1208423789);
                }
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(535271790);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            if (obj == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean FrostHunterLevelListDrawableFusionDragonHero22324 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj5 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterLevelListDrawableFusionDragonHero22324 || FrostHunterMagnetometerFusionTitanium8202 == obj5) {
                FrostHunterZipStrikeAuroraAlpha2474 frostHunterZipStrikeAuroraAlpha2474 = obj instanceof FrostHunterZipStrikeAuroraAlpha2474 ? (FrostHunterZipStrikeAuroraAlpha2474) obj : null;
                FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterBundlePulseFusionHero24752 = frostHunterZipStrikeAuroraAlpha2474 != null ? frostHunterZipStrikeAuroraAlpha2474.FrostHunterBundlePulseFusionHero2475() : null;
                FrostHunterActionBarTurboSolar8668 frostHunterActionBarTurboSolar8668 = obj instanceof FrostHunterActionBarTurboSolar8668 ? (FrostHunterActionBarTurboSolar8668) obj : null;
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterPaintNebulaAuroraRogue3863(FrostHunterBundlePulseFusionHero24752, frostHunterActionBarTurboSolar8668 != null ? frostHunterActionBarTurboSolar8668.FrostHunterAlphaAnimationNeoCosmos5761() : null);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            Object obj6 = (FrostHunterPaintNebulaAuroraRogue3863) FrostHunterMagnetometerFusionTitanium8202;
            long j = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752;
            boolean FrostHunterLevelListDrawableFusionDragonHero22325 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(obj6) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLifecycleBlazeGammaElite2889(j);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            Object obj7 = FrostHunterMagnetometerFusionTitanium82022;
            if (FrostHunterLevelListDrawableFusionDragonHero22325 || FrostHunterMagnetometerFusionTitanium82022 == obj5) {
                FrostHunterAsyncPulseSparkVision4752 frostHunterAsyncPulseSparkVision4752 = new FrostHunterAsyncPulseSparkVision4752(new FrostHunterTransitionManagerRogueNovaX1803(j, obj));
                frostHunterAsyncPulseSparkVision4752.FrostHunterBundlePulseFusionHero2475 = new FrostHunterNavigationViewSpectraBlazeOmega1546(3);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(frostHunterAsyncPulseSparkVision4752);
                obj7 = frostHunterAsyncPulseSparkVision4752;
            }
            Object obj8 = (FrostHunterAsyncPulseSparkVision4752) obj7;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(-585307852);
            boolean FrostHunterCameraXPixelTurboCosmos98142 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj8) | ((i2 & 112) == 32);
            Object FrostHunterMagnetometerFusionTitanium82023 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98142 || FrostHunterMagnetometerFusionTitanium82023 == obj5) {
                FrostHunterMagnetometerFusionTitanium82023 = new FrostHunterBundleQuantumTurboRogue8500(i4, obj8, frostHunterNotificationGammaBlazePhoenix7595);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82023);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterFlowMaxDragonHero5809((FrostHunterNotificationGammaBlazePhoenix7595) FrostHunterMagnetometerFusionTitanium82023, frostHunterDialogFragmentPhantomEclipse8068);
            boolean FrostHunterCameraXPixelTurboCosmos98143 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj8);
            Object FrostHunterMagnetometerFusionTitanium82024 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98143 || FrostHunterMagnetometerFusionTitanium82024 == obj5) {
                FrostHunterMagnetometerFusionTitanium82024 = new FrostHunterDatabaseMasterPrimeSpeed8049(2, obj8);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82024);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterRemoteConfigSpeedSpeed8566(true, obj8, null, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82024, frostHunterDialogFragmentPhantomEclipse8068, 6);
            boolean FrostHunterCameraXPixelTurboCosmos98144 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj6) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(obj8);
            Object FrostHunterMagnetometerFusionTitanium82025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterCameraXPixelTurboCosmos98144 || FrostHunterMagnetometerFusionTitanium82025 == obj5) {
                FrostHunterMagnetometerFusionTitanium82025 = new FrostHunterMapLegendNova8356(i3, obj6, obj8);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82025);
            }
            FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889(obj6, obj8, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82025, frostHunterDialogFragmentPhantomEclipse8068);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            z = true;
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(z, frostHunterNotificationGammaBlazePhoenix7595, i) { // from class: android.content.Context.FrostHunterSupervisorJobForceVision9987
                public final /* synthetic */ boolean FrostHunterCameraXPixelTurboCosmos9814;
                public final /* synthetic */ FrostHunterNotificationGammaBlazePhoenix7595 FrostHunterFlowMaxDragonHero5809;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, (FrostHunterDialogFragmentPhantomEclipse8068) obj9, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static Integer FrostHunterAnnotationProcessorSparkEclipse8710(String str) {
        byte b;
        Long valueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = FrostHunterFCMQuantumVision8191.FrostHunterAlphaAnimationNeoCosmos5761[charAt];
                } else {
                    byte[] bArr = FrostHunterFCMQuantumVision8191.FrostHunterAlphaAnimationNeoCosmos5761;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = FrostHunterFCMQuantumVision8191.FrostHunterAlphaAnimationNeoCosmos5761[charAt2];
                            } else {
                                byte[] bArr2 = FrostHunterFCMQuantumVision8191.FrostHunterAlphaAnimationNeoCosmos5761;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = b2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i2 = i3;
                        } else if (i != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static final boolean FrostHunterBillingClientFusionVortex9008(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        FrostHunterVectorDrawableMaxAlpha8598 FrostHunterServiceEliteCelestialThunder17572 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757();
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814;
        return (FrostHunterServiceEliteCelestialThunder17572 != null ? FrostHunterServiceEliteCelestialThunder17572.FrostHunterGyroscopeSpeedDragon2744() : false) || frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterScaleAnimationStrikeSpark5059) || frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterLightSensorForceFusion4241);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int FrostHunterBitmapTurboDeltaNebula8743(boolean z) {
        List supportedPerformancePoints;
        boolean covers;
        try {
            FrostHunterCamera2EpicNovaX6250 frostHunterCamera2EpicNovaX6250 = new FrostHunterCamera2EpicNovaX6250();
            frostHunterCamera2EpicNovaX6250.FrostHunterLightSensorForceFusion4241 = FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterKeyframeGammaGamma1197("video/avc");
            FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818 = new FrostHunterFirebaseOlympianMax4818(frostHunterCamera2EpicNovaX6250);
            String str = frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059;
            if (str != null) {
                List FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterLifecycleBlazeGammaElite2889(str, z, false);
                String FrostHunterBundlePulseFusionHero24752 = FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterBundlePulseFusionHero2475(frostHunterFirebaseOlympianMax4818);
                Iterable FrostHunterLifecycleBlazeGammaElite28893 = FrostHunterBundlePulseFusionHero24752 == null ? FrostHunterBitmapNeoCosmos7205.FrostHunterFragmentBetaMegaVortex6025 : FrostHunterLocationListenerThunderNebulaSpeed6355.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterBundlePulseFusionHero24752, z, false);
                FrostHunterTextureViewBlazePhantomDragon5593 FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlarmManagerHeroTitaniumFusion5758.FrostHunterAlertDialogAuroraDelta3200();
                FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite28892);
                FrostHunterAlertDialogAuroraDelta3200.FrostHunterBundlePulseFusionHero2475(FrostHunterLifecycleBlazeGammaElite28893);
                FrostHunterBitmapNeoCosmos7205 FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterAlertDialogAuroraDelta3200.FrostHunterLevelListDrawableFusionDragonHero2232();
                for (int i = 0; i < FrostHunterLevelListDrawableFusionDragonHero22322.FrostHunterKeyframeGammaGamma1197; i++) {
                    if (((FrostHunterStorageNovaXEliteAurora3066) FrostHunterLevelListDrawableFusionDragonHero22322.get(i)).FrostHunterServiceEliteCelestialThunder1757 != null && (r2 = ((FrostHunterStorageNovaXEliteAurora3066) FrostHunterLevelListDrawableFusionDragonHero22322.get(i)).FrostHunterServiceEliteCelestialThunder1757.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        FrostHunterTabLayoutGammaPixelForce9969.FrostHunterAlertDialogAuroraDelta3200();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint FrostHunterLifecycleBlazeGammaElite28894 = FrostHunterTabLayoutGammaPixelForce9969.FrostHunterLifecycleBlazeGammaElite2889();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            covers = FrostHunterTabLayoutGammaPixelForce9969.FrostHunterRemoteConfigSpeedSpeed8566(supportedPerformancePoints.get(i2)).covers(FrostHunterLifecycleBlazeGammaElite28894);
                            if (covers) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (FrostHunterStateTitaniumHyperTitanium4233 unused) {
        }
        return 0;
    }

    public static FrostHunterShapeDrawableAuroraThunder2834 FrostHunterBundlePulseFusionHero2475(int i, FrostHunterPagingEclipseDragonInferno8878 frostHunterPagingEclipseDragonInferno8878, int i2) {
        int i3 = i2 & 2;
        FrostHunterPagingEclipseDragonInferno8878 frostHunterPagingEclipseDragonInferno88782 = FrostHunterPagingEclipseDragonInferno8878.FrostHunterCameraXPixelTurboCosmos9814;
        if (i3 != 0) {
            frostHunterPagingEclipseDragonInferno8878 = frostHunterPagingEclipseDragonInferno88782;
        }
        if (i == -2) {
            if (frostHunterPagingEclipseDragonInferno8878 != frostHunterPagingEclipseDragonInferno88782) {
                return new FrostHunterCoroutinePhantomPhoenixBeta6920(1, frostHunterPagingEclipseDragonInferno8878);
            }
            FrostHunterBundleMaxNovaXVortex6982.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            return new FrostHunterShapeDrawableAuroraThunder2834(FrostHunterLiveDataScopeLegendStrikeGamma5301.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? frostHunterPagingEclipseDragonInferno8878 == frostHunterPagingEclipseDragonInferno88782 ? new FrostHunterShapeDrawableAuroraThunder2834(i) : new FrostHunterCoroutinePhantomPhoenixBeta6920(i, frostHunterPagingEclipseDragonInferno8878) : new FrostHunterShapeDrawableAuroraThunder2834(Integer.MAX_VALUE) : frostHunterPagingEclipseDragonInferno8878 == frostHunterPagingEclipseDragonInferno88782 ? new FrostHunterShapeDrawableAuroraThunder2834(0) : new FrostHunterCoroutinePhantomPhoenixBeta6920(1, frostHunterPagingEclipseDragonInferno8878);
        }
        if (frostHunterPagingEclipseDragonInferno8878 == frostHunterPagingEclipseDragonInferno88782) {
            return new FrostHunterCoroutinePhantomPhoenixBeta6920(1, FrostHunterPagingEclipseDragonInferno8878.FrostHunterFlowMaxDragonHero5809);
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void FrostHunterCameraXPixelTurboCosmos9814(final float f, final float f2, final String str, final boolean z, final long j, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-2112867595);
        int i2 = i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f2) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str) ? 256 : 128) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRemoteConfigSpeedSpeed8566(z) ? 2048 : 1024) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLifecycleBlazeGammaElite2889(j) ? 16384 : 8192);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 9363) != 9362)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            boolean z2 = (57344 & i2) == 16384;
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (z2 || FrostHunterMagnetometerFusionTitanium8202 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                FrostHunterMagnetometerFusionTitanium8202 = Long.valueOf(System.currentTimeMillis() - j);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            float FrostHunterLintTitanVortexQuantum9911 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLintTitanVortexQuantum9911(((Number) FrostHunterMagnetometerFusionTitanium8202).longValue() / 900.0f, 0.0f, 1.0f);
            final float f3 = 1.0f - FrostHunterLintTitanVortexQuantum9911;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterBundlePulseFusionHero24752 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f - 30.0f), frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f2 - (FrostHunterLintTitanVortexQuantum9911 * 50.0f)));
            boolean FrostHunterBundlePulseFusionHero24753 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f3);
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (FrostHunterBundlePulseFusionHero24753 || FrostHunterMagnetometerFusionTitanium82022 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterLiveDataScopeQuantumTitanNova7743
                    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
                    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                        FrostHunterLiveDataScopePulseBeta1740 frostHunterLiveDataScopePulseBeta1740 = (FrostHunterLiveDataScopePulseBeta1740) obj;
                        frostHunterLiveDataScopePulseBeta1740.getClass();
                        frostHunterLiveDataScopePulseBeta1740.FrostHunterAlphaAnimationNeoCosmos5761(f3);
                        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                };
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
            }
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterBundlePulseFusionHero24752, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium82022);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterAlphaAnimationNeoCosmos57612);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterCameraXPixelTurboCosmos9814, FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(z ? 4286695300L : 4293227379L), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(18), FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059, null, 0L, 0L, null, 16777208), frostHunterDialogFragmentPhantomEclipse8068, (i2 >> 6) & 14, 65534);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(f, f2, str, z, j, i) { // from class: android.content.Context.FrostHunterFlatMapHeroSolar2334
                public final /* synthetic */ String FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ float FrostHunterCameraXPixelTurboCosmos9814;
                public final /* synthetic */ float FrostHunterFlowMaxDragonHero5809;
                public final /* synthetic */ long FrostHunterFragmentBetaMegaVortex6025;
                public final /* synthetic */ boolean FrostHunterKeyframeGammaGamma1197;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, this.FrostHunterFragmentBetaMegaVortex6025, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static int FrostHunterCameraXTurboCelestialHero5430(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new FrostHunterFirebaseModelDownloadConditionsHeroShadowPhoenix7109(context).FrostHunterAlphaAnimationNeoCosmos5761.areNotificationsEnabled() ? 0 : -1;
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterCameraXPixelTurboCosmos9814("permission must be non-null");
        return 0;
    }

    public static Object FrostHunterCardViewSpectraCyber7714(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return FrostHunterTypefacePhantomUltra7139.FrostHunterConstraintSetCloneMasterUltraRogue2633(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (FrostHunterRealtimeDatabasePulseStormOlympian4721.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final void FrostHunterConstraintSetCloneMasterUltraRogue2633(float f, float f2, int i, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i2) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(207699702);
        int i3 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f) ? 4 : 2) | i2 | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f2) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 256 : 128);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i3 & 1, (i3 & 147) != 146)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17572 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f - 20.0f), frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f2 - 20.0f)), 40.0f);
            FrostHunterBroadcastFusionCosmos6323 frostHunterBroadcastFusionCosmos6323 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26332 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder17572, frostHunterBroadcastFusionCosmos6323, 518143);
            long j = FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterLevelListDrawableFusionDragonHero22322 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintSetCloneMasterUltraRogue26332, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.1f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.4f), frostHunterBroadcastFusionCosmos6323), 4.0f);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17573 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterLevelListDrawableFusionDragonHero22322);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17573);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(i), androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterSharedFlowOlympianDragon9650.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterDialogFragmentPhantomEclipse8068, ((i3 >> 6) & 14) | 1573296);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterNestedScrollViewNebulaHyper6713(f, f2, i, i2, 0);
        }
    }

    public static AbstractList FrostHunterConstraintSetCloneOmegaHyperion9304(List list, FrostHunterFragmentManagerEclipseTurboUltra1848 frostHunterFragmentManagerEclipseTurboUltra1848) {
        return list instanceof RandomAccess ? new FrostHunterWithContextInfernoStormSolar9419(list, frostHunterFragmentManagerEclipseTurboUltra1848) : new FrostHunterVibratorOmegaOlympianGamma1322(list, frostHunterFragmentManagerEclipseTurboUltra1848);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String FrostHunterDatabaseEliteShadowUltra2452() {
        BufferedReader bufferedReader;
        String processName;
        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                FrostHunterRemoteConfigSpeedSpeed8566 = processName;
            } else {
                int i = FrostHunterCameraXPixelTurboCosmos9814;
                if (i == 0) {
                    i = Process.myPid();
                    FrostHunterCameraXPixelTurboCosmos9814 = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String str2 = "/proc/" + i + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                FrostHunterRemoteConfigSpeedSpeed8566 = str;
            }
        }
        return FrostHunterRemoteConfigSpeedSpeed8566;
    }

    public static final Object FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder5171, long j, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        while (true) {
            if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475 >= j && !frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475()) {
                return frostHunterAdapterSpectraVisionThunder5171;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = FrostHunterTimerMegaOlympian7464.FrostHunterAlphaAnimationNeoCosmos5761;
            Object obj = atomicReferenceFieldUpdater.get(frostHunterAdapterSpectraVisionThunder5171);
            FrostHunterWorkManagerMaxTurbo1858 frostHunterWorkManagerMaxTurbo1858 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            if (obj == frostHunterWorkManagerMaxTurbo1858) {
                return frostHunterWorkManagerMaxTurbo1858;
            }
            FrostHunterAdapterSpectraVisionThunder5171 frostHunterAdapterSpectraVisionThunder51712 = (FrostHunterAdapterSpectraVisionThunder5171) ((FrostHunterTimerMegaOlympian7464) obj);
            if (frostHunterAdapterSpectraVisionThunder51712 == null) {
                frostHunterAdapterSpectraVisionThunder51712 = (FrostHunterAdapterSpectraVisionThunder5171) frostHunterFontFamilyNeoBetaEpic8574.FrostHunterCameraXPixelTurboCosmos9814(Long.valueOf(frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475 + 1), frostHunterAdapterSpectraVisionThunder5171);
                while (!atomicReferenceFieldUpdater.compareAndSet(frostHunterAdapterSpectraVisionThunder5171, null, frostHunterAdapterSpectraVisionThunder51712)) {
                    if (atomicReferenceFieldUpdater.get(frostHunterAdapterSpectraVisionThunder5171) != null) {
                        break;
                    }
                }
                if (frostHunterAdapterSpectraVisionThunder5171.FrostHunterBundlePulseFusionHero2475()) {
                    frostHunterAdapterSpectraVisionThunder5171.FrostHunterServiceEliteCelestialThunder1757();
                }
            }
            frostHunterAdapterSpectraVisionThunder5171 = frostHunterAdapterSpectraVisionThunder51712;
        }
    }

    public static final FrostHunterFirebaseForceDragon4248 FrostHunterEditTextPulseHyperion1262(FrostHunterCountDownTimerRogueTitan5615 frostHunterCountDownTimerRogueTitan5615) {
        FrostHunterFirebaseForceDragon4248 frostHunterFirebaseForceDragon4248 = (FrostHunterFirebaseForceDragon4248) frostHunterCountDownTimerRogueTitan5615.FrostHunterKeyframeGammaGamma1197(FrostHunterRewardedAdHyperStrike1151.FrostHunterViewPhantomNeo1634);
        if (frostHunterFirebaseForceDragon4248 != null) {
            return frostHunterFirebaseForceDragon4248;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final FrostHunterVectorDrawableMaxAlpha8598 FrostHunterFCMDeltaQuantumHero8364(FrostHunterDrawerLayoutShadowPhoenix9863 frostHunterDrawerLayoutShadowPhoenix9863) {
        if (!((FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterDrawerLayoutShadowPhoenix9863).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        FrostHunterVectorDrawableMaxAlpha8598 FrostHunterR8MasterNebulaSpark7247 = FrostHunterR8MasterNebulaSpark7247(frostHunterDrawerLayoutShadowPhoenix9863, 2);
        if (!FrostHunterR8MasterNebulaSpark7247.FrostHunterGradleOmegaVisionSpectra5961().FrostHunterLooperThreadBetaHyperionMax1000) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("LayoutCoordinates is not attached.");
        }
        return FrostHunterR8MasterNebulaSpark7247;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FrostHunterPagingCelestialThunderOmega7610 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637) {
        if ((frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterAlertDialogAuroraDelta3200 & 2) != 0) {
            if (frostHunterGradientDrawablePulseDragonInferno9637 instanceof FrostHunterPagingCelestialThunderOmega7610) {
                return (FrostHunterPagingCelestialThunderOmega7610) frostHunterGradientDrawablePulseDragonInferno9637;
            }
            if (frostHunterGradientDrawablePulseDragonInferno9637 instanceof FrostHunterToolbarVortexMaster1971) {
                FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno96372 = ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno9637).FrostHunterBitmapTurboDeltaNebula8743;
                while (frostHunterGradientDrawablePulseDragonInferno96372 != 0) {
                    if (frostHunterGradientDrawablePulseDragonInferno96372 instanceof FrostHunterPagingCelestialThunderOmega7610) {
                        return (FrostHunterPagingCelestialThunderOmega7610) frostHunterGradientDrawablePulseDragonInferno96372;
                    }
                    frostHunterGradientDrawablePulseDragonInferno96372 = (!(frostHunterGradientDrawablePulseDragonInferno96372 instanceof FrostHunterToolbarVortexMaster1971) || (frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterAlertDialogAuroraDelta3200 & 2) == 0) ? frostHunterGradientDrawablePulseDragonInferno96372.FrostHunterServiceConnectionTurboPhoenixOmega6719 : ((FrostHunterToolbarVortexMaster1971) frostHunterGradientDrawablePulseDragonInferno96372).FrostHunterBitmapTurboDeltaNebula8743;
                }
            }
        }
        return null;
    }

    public static final void FrostHunterFlowMaxDragonHero5809(final float f, final float f2, final int i, final int i2, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i3) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(2019683280);
        int i4 = i3 | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f2) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 256 : 128) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i2) ? 2048 : 1024);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i4 & 1, (i4 & 1171) != 1170)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterBundlePulseFusionHero24752 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f - 60.0f), frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f2 - 40.0f));
            FrostHunterScaleAnimationOmegaTitan6238 frostHunterScaleAnimationOmegaTitan6238 = FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200;
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(frostHunterScaleAnimationOmegaTitan6238);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterBundlePulseFusionHero24752);
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
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterLifecycleBlazeGammaElite28892 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633, 120.0f, 80.0f);
            boolean z = (i4 & 896) == 256;
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (z || FrostHunterMagnetometerFusionTitanium8202 == FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterCombineLegendMegaPrime5473() { // from class: android.content.Context.FrostHunterStateCyberSpectra9604
                    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
                    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
                        FrostHunterLiveDataScopePulseBeta1740 frostHunterLiveDataScopePulseBeta1740 = (FrostHunterLiveDataScopePulseBeta1740) obj;
                        frostHunterLiveDataScopePulseBeta1740.getClass();
                        frostHunterLiveDataScopePulseBeta1740.FrostHunterServiceEliteCelestialThunder1757(i);
                        return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                };
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLifecycleBlazeGammaElite28892, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium8202);
            Integer valueOf = Integer.valueOf(R.drawable.item_helicopter);
            FrostHunterRewardedAdHyperStrike1151 frostHunterRewardedAdHyperStrike1151 = FrostHunterSharedFlowOlympianDragon9650.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(valueOf, FrostHunterAlphaAnimationNeoCosmos57612, frostHunterRewardedAdHyperStrike1151, frostHunterDialogFragmentPhantomEclipse8068, 1572912);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17573 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(40.0f, 56.0f), 32.0f);
            FrostHunterBroadcastFusionCosmos6323 frostHunterBroadcastFusionCosmos6323 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterLevelListDrawableFusionDragonHero22322 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder17573, frostHunterBroadcastFusionCosmos6323, 518143), FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0.4f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.35f), frostHunterBroadcastFusionCosmos6323), 4.0f);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17574 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(frostHunterScaleAnimationOmegaTitan6238);
            int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterLevelListDrawableFusionDragonHero22322);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17574);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60252);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse8068, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94632);
            FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(i2), androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterRewardedAdHyperStrike1151, frostHunterDialogFragmentPhantomEclipse8068, ((i4 >> 9) & 14) | 1573296);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(f, f2, i, i2, i3) { // from class: android.content.Context.FrostHunterAnimationSetVisionTurbo9638
                public final /* synthetic */ int FrostHunterAlertDialogAuroraDelta3200;
                public final /* synthetic */ float FrostHunterCameraXPixelTurboCosmos9814;
                public final /* synthetic */ float FrostHunterFlowMaxDragonHero5809;
                public final /* synthetic */ int FrostHunterKeyframeGammaGamma1197;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(1);
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, this.FrostHunterAlertDialogAuroraDelta3200, this.FrostHunterKeyframeGammaGamma1197, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static final void FrostHunterFragmentBetaMegaVortex6025(final FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, final float f, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, final int i) {
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(921331392);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f) ? 32 : 16) | i;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 19) != 18)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, frostHunterCombineBlazeLegendGamma9228);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterAuthSparkSpectra4812.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceEliteCelestialThunder1757(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f)).FrostHunterServiceEliteCelestialThunder1757(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633), FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4283417591L), 0.18f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4279903102L), 0.45f))))), frostHunterDialogFragmentPhantomEclipse8068, 0);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterFontFamilyNeoBetaEpic8574(f, i) { // from class: android.content.Context.FrostHunterSupervisorJobCyberSpectraNova9640
                public final /* synthetic */ float FrostHunterFlowMaxDragonHero5809;

                @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
                public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int FrostHunterLiveDataBetaLegend3442 = FrostHunterCanvasInfernoVortex4700.FrostHunterLiveDataBetaLegend3442(7);
                    FrostHunterRemoteConfigPhantomDelta1739.FrostHunterFragmentBetaMegaVortex6025(FrostHunterCombineBlazeLegendGamma9228.this, this.FrostHunterFlowMaxDragonHero5809, (FrostHunterDialogFragmentPhantomEclipse8068) obj, FrostHunterLiveDataBetaLegend3442);
                    return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                }
            };
        }
    }

    public static final void FrostHunterKeyframeGammaGamma1197(FrostHunterServiceConnectionTurboEclipse7688 frostHunterServiceConnectionTurboEclipse7688, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterDragEventStormHyperion6109 frostHunterDragEventStormHyperion6109, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        float f = frostHunterServiceConnectionTurboEclipse7688.FrostHunterServiceEliteCelestialThunder1757;
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterDragEventStormHyperion6109.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1219851385);
        int i2 = 16;
        int i3 = i | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterServiceConnectionTurboEclipse7688) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDragEventStormHyperion6109) ? 256 : 128) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 2048 : 1024);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i3 & 1, (i3 & 1171) != 1170)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterBroadcastFusionCosmos6323 FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterJobSchedulerSparkForce2643.FrostHunterConstraintSetCloneMasterUltraRogue2633(20.0f);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814(frostHunterCombineBlazeLegendGamma9228, 12.0f, 2), FrostHunterConstraintSetCloneMasterUltraRogue26332, 518143), FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4280175986L), 0.45f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4278919731L), 0.85f))))), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.12f), FrostHunterConstraintSetCloneMasterUltraRogue26332);
            boolean FrostHunterLevelListDrawableFusionDragonHero22322 = ((i3 & 896) == 256) | frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterDispatchersPrimeHeroSpeed4562);
            Object FrostHunterMagnetometerFusionTitanium8202 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            FrostHunterRippleDrawableBlazeBetaStorm6320 frostHunterRippleDrawableBlazeBetaStorm6320 = FrostHunterViewPagerDragonStormElite3703.FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterLevelListDrawableFusionDragonHero22322 || FrostHunterMagnetometerFusionTitanium8202 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                FrostHunterMagnetometerFusionTitanium8202 = new FrostHunterMapLegendNova8356(i2, frostHunterDragEventStormHyperion6109, frostHunterDispatchersPrimeHeroSpeed4562);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium8202);
            }
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterBundlePulseFusionHero24752 = androidx.compose.ui.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(FrostHunterCameraXPixelTurboCosmos98142, (FrostHunterCombineLegendMegaPrime5473) FrostHunterMagnetometerFusionTitanium8202);
            boolean z = (i3 & 112) == 32;
            Object FrostHunterMagnetometerFusionTitanium82022 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202();
            if (z || FrostHunterMagnetometerFusionTitanium82022 == frostHunterRippleDrawableBlazeBetaStorm6320) {
                FrostHunterMagnetometerFusionTitanium82022 = new FrostHunterFirebaseModelInterpreterEclipseSpark3612(2, frostHunterNotificationGammaBlazePhoenix7595);
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNestedScrollViewThunderNovaX6772(FrostHunterMagnetometerFusionTitanium82022);
            }
            FrostHunterResourcePixelEpic4102 frostHunterResourcePixelEpic4102 = FrostHunterOnItemClickListenerHyperNebula3656.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterScaleAnimationStrikeSpark5059 = FrostHunterBannerAdTitanVisionDragon3523.FrostHunterScaleAnimationStrikeSpark5059(FrostHunterBundlePulseFusionHero24752.FrostHunterServiceEliteCelestialThunder1757(new SuspendPointerInputElement(FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761, null, (PointerInputEventHandler) FrostHunterMagnetometerFusionTitanium82022, 6)));
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterScaleAnimationStrikeSpark5059);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterFragmentBetaMegaVortex6025(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, f - 110.0f, frostHunterDialogFragmentPhantomEclipse8068, 6);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1898586063);
            for (FrostHunterProcessCameraProviderStrikeSolarEpic3728 frostHunterProcessCameraProviderStrikeSolarEpic3728 : frostHunterServiceConnectionTurboEclipse7688.FrostHunterRemoteConfigSpeedSpeed8566) {
                FrostHunterRemoteConfigSpeedSpeed8566(frostHunterProcessCameraProviderStrikeSolarEpic3728.FrostHunterConstraintSetCloneMasterUltraRogue2633, f - 95.0f, frostHunterProcessCameraProviderStrikeSolarEpic3728.FrostHunterBundlePulseFusionHero2475.FrostHunterCameraXPixelTurboCosmos9814, frostHunterDialogFragmentPhantomEclipse8068, 0);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1898593359);
            for (FrostHunterFirebaseCosmosPrime3958 frostHunterFirebaseCosmosPrime3958 : frostHunterServiceConnectionTurboEclipse7688.FrostHunterCameraXPixelTurboCosmos9814) {
                FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterFirebaseCosmosPrime3958.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterFirebaseCosmosPrime3958.FrostHunterBundlePulseFusionHero2475, frostHunterFirebaseCosmosPrime3958.FrostHunterLifecycleBlazeGammaElite2889.FrostHunterCameraXPixelTurboCosmos9814, frostHunterDialogFragmentPhantomEclipse8068, 0);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            FrostHunterLayoutMasterSparkVortex8052 frostHunterLayoutMasterSparkVortex8052 = frostHunterServiceConnectionTurboEclipse7688.FrostHunterLevelListDrawableFusionDragonHero2232;
            FrostHunterFlowMaxDragonHero5809(frostHunterLayoutMasterSparkVortex8052.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLayoutMasterSparkVortex8052.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterLayoutMasterSparkVortex8052.FrostHunterBundlePulseFusionHero2475, frostHunterLayoutMasterSparkVortex8052.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814, frostHunterDialogFragmentPhantomEclipse8068, 0);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPushNotificationStormTitanGamma8999(1898607155);
            for (FrostHunterOnClickListenerTitanPulse7592 frostHunterOnClickListenerTitanPulse7592 : frostHunterServiceConnectionTurboEclipse7688.FrostHunterFlowMaxDragonHero5809) {
                FrostHunterCameraXPixelTurboCosmos9814(frostHunterOnClickListenerTitanPulse7592.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterOnClickListenerTitanPulse7592.FrostHunterBundlePulseFusionHero2475, frostHunterOnClickListenerTitanPulse7592.FrostHunterServiceEliteCelestialThunder1757, frostHunterOnClickListenerTitanPulse7592.FrostHunterLifecycleBlazeGammaElite2889, frostHunterOnClickListenerTitanPulse7592.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterDialogFragmentPhantomEclipse8068, 0);
            }
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(false);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterNavigationViewOlympianForceBeta6070(frostHunterServiceConnectionTurboEclipse7688, frostHunterNotificationGammaBlazePhoenix7595, frostHunterDragEventStormHyperion6109, frostHunterCombineBlazeLegendGamma9228, i);
        }
    }

    public static final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, long j, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
        frostHunterDialogFragmentPhantomEclipse80682.FrostHunterConstraintSetCloneOmegaHyperion9304(-77080139);
        int i2 = i | (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix75952) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLifecycleBlazeGammaElite2889(j) ? 256 : 128);
        if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterBroadcastFusionCosmos6323 FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterJobSchedulerSparkForce2643.FrostHunterConstraintSetCloneMasterUltraRogue2633(28.0f);
            long FrostHunterBundlePulseFusionHero24752 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4293227379L);
            FrostHunterAnimatorRoguePulse2723 frostHunterAnimatorRoguePulse2723 = FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57612 = androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f), FrostHunterConstraintSetCloneMasterUltraRogue26332, 518143), FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4279380026L)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4278851362L)))));
            long j2 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterServiceEliteCelestialThunder1757(new BorderModifierNodeElement(1.0f, FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.22f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.04f)))), FrostHunterConstraintSetCloneMasterUltraRogue26332));
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17573 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterAlertDialogAuroraDelta3200);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17573);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24512 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse80682, hashCode, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26333 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f), 2.0f);
            long j3 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterLevelListDrawableFusionDragonHero2232;
            FrostHunterAuthSparkSpectra4812.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterConstraintSetCloneMasterUltraRogue26333, FrostHunterRewardedAdHyperStrike1151.FrostHunterFragmentBetaMegaVortex6025(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(j3), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero24752, 0.9f)), new FrostHunterViewModelScopeLegendAurora8732(j3)))), FrostHunterRewardedAdHyperStrike1151.FrostHunterKeyframeGammaGamma1197), frostHunterDialogFragmentPhantomEclipse80682, 0);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRemoteConfigSpeedSpeed85662 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f), 24.0f, 28.0f);
            FrostHunterStrictModeDragonAlpha5913 FrostHunterAlphaAnimationNeoCosmos57613 = FrostHunterPermissionInfoOmegaSolarNova1692.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterDrawerLayoutUltraStrike3303.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterRewardedAdHyperStrike1151.FrostHunterMotionSceneAuroraMega2271, frostHunterDialogFragmentPhantomEclipse80682, 48);
            int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterRemoteConfigSpeedSpeed85662);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterAlphaAnimationNeoCosmos57613);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60252);
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse80682, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94632);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17574 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(frostHunterAnimatorRoguePulse2723, 64.0f);
            FrostHunterBroadcastFusionCosmos6323 frostHunterBroadcastFusionCosmos6323 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterConstraintSetCloneMasterUltraRogue26334 = androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder17574, frostHunterBroadcastFusionCosmos6323, 518143);
            long FrostHunterConstraintSetCloneMasterUltraRogue26335 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero24752, 0.14f);
            FrostHunterClipDrawableFusionNovaXNova3326 frostHunterClipDrawableFusionNovaXNova3326 = FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintSetCloneMasterUltraRogue26334, FrostHunterConstraintSetCloneMasterUltraRogue26335, frostHunterClipDrawableFusionNovaXNova3326), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterBundlePulseFusionHero24752, 0.45f), frostHunterBroadcastFusionCosmos6323);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17575 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
            int hashCode3 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94633 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse80682, FrostHunterCameraXPixelTurboCosmos98142);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse80682.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17575);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60253);
            if (frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse80682.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode3))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode3, frostHunterDialogFragmentPhantomEclipse80682, hashCode3, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse80682, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94633);
            FrostHunterPlaceholderFusionCyber5867 frostHunterPlaceholderFusionCyber5867 = FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterFragmentManagerFusionNovaDragon6284 frostHunterFragmentManagerFusionNovaDragon6284 = ((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse80682.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterServiceEliteCelestialThunder1757;
            long FrostHunterLifecycleBlazeGammaElite28892 = FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(32);
            FrostHunterBillingClientRogueThunder4597 frostHunterBillingClientRogueThunder4597 = FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059;
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("!", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterFragmentManagerFusionNovaDragon6284, FrostHunterBundlePulseFusionHero24752, FrostHunterLifecycleBlazeGammaElite28892, frostHunterBillingClientRogueThunder4597, null, 0L, 0L, null, 16777208), frostHunterDialogFragmentPhantomEclipse8068, 6, 65534);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
            FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse8068, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 18.0f));
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("LEAVE EXPEDITION?", null, 0L, 0L, 0L, new FrostHunterDiffUtilSparkPhantomHyper9986(3), 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterRemoteConfigSpeedSpeed8566, j2, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(18), frostHunterBillingClientRogueThunder4597, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(3), 0L, null, 16777080), frostHunterDialogFragmentPhantomEclipse8068, 6, 65022);
            FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse8068, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 10.0f));
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("Are you sure you want to exit the game? Your current progress will be lost.", null, 0L, 0L, 0L, new FrostHunterDiffUtilSparkPhantomHyper9986(3), 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(frostHunterPlaceholderFusionCyber5867)).FrostHunterKeyframeGammaGamma1197, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.65f), FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(13), null, null, 0L, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(20), null, 16646140), frostHunterDialogFragmentPhantomEclipse8068, 6, 65022);
            FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse8068, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 24.0f));
            FrostHunterAuthSparkSpectra4812.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f), 1.0f), FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.1f), frostHunterClipDrawableFusionNovaXNova3326), frostHunterDialogFragmentPhantomEclipse8068, 6);
            FrostHunterCoroutineScopeNovaVortexMega5640.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterDialogFragmentPhantomEclipse8068, androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterAnimatorRoguePulse2723, 20.0f));
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterAlphaAnimationNeoCosmos57614 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterAnimatorRoguePulse2723, 1.0f);
            FrostHunterProfilerPixelEliteElite8399 FrostHunterAlphaAnimationNeoCosmos57615 = FrostHunterBannerAdBlazeSolarThunder2938.FrostHunterAlphaAnimationNeoCosmos5761(new FrostHunterBindingAdapterVisionNovaXNeo5053(12.0f, new FrostHunterLaunchEclipseAurora4535(0)), FrostHunterRewardedAdHyperStrike1151.FrostHunterResourcesTitanHyperVision5823, frostHunterDialogFragmentPhantomEclipse8068, 6);
            int hashCode4 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60254 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94634 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterAlphaAnimationNeoCosmos57614);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterAlphaAnimationNeoCosmos57615);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60254);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode4))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode4, frostHunterDialogFragmentPhantomEclipse8068, hashCode4, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94634);
            int i3 = i2 << 3;
            FrostHunterServiceEliteCelestialThunder1757("CANCEL", frostHunterNotificationGammaBlazePhoenix75952, false, j, FrostHunterProfilerStrikeInfernoMax8360.FrostHunterAlphaAnimationNeoCosmos5761(), frostHunterDialogFragmentPhantomEclipse8068, (i2 & 112) | 390 | (i3 & 7168));
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            FrostHunterServiceEliteCelestialThunder1757("EXIT", frostHunterNotificationGammaBlazePhoenix7595, true, FrostHunterBundlePulseFusionHero24752, FrostHunterProfilerStrikeInfernoMax8360.FrostHunterAlphaAnimationNeoCosmos5761(), frostHunterDialogFragmentPhantomEclipse80682, (i3 & 112) | 3462);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterAlertDialogMaxSparkTitanium8740(frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, j, i, 2);
        }
    }

    public static final void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix75952, long j, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        frostHunterNotificationGammaBlazePhoenix7595.getClass();
        frostHunterNotificationGammaBlazePhoenix75952.getClass();
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(-1270323495);
        int i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 4 : 2) | i;
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 147) != 146)) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterNotificationGammaBlazePhoenix75952, new FrostHunterLiveDataNeoMegaQuantum2801(false), FrostHunterDiffUtilQuantumNebulaTurbo2317.FrostHunterPagingDataTurboTitanium7332(1242031650, new FrostHunterAlertDialogMaxSparkTitanium8740(frostHunterNotificationGammaBlazePhoenix75952, frostHunterNotificationGammaBlazePhoenix7595, j), frostHunterDialogFragmentPhantomEclipse8068), frostHunterDialogFragmentPhantomEclipse8068, 438);
        } else {
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterAlertDialogMaxSparkTitanium8740(frostHunterNotificationGammaBlazePhoenix7595, frostHunterNotificationGammaBlazePhoenix75952, j, i, 1);
        }
    }

    public static final int FrostHunterLightSensorForceFusion4241(FrostHunterFlowCyberHyper5624 frostHunterFlowCyberHyper5624, FrostHunterGradientDrawableNovaStorm1783 frostHunterGradientDrawableNovaStorm1783) {
        FrostHunterFlowCyberHyper5624 FrostHunterPlaceholderLegendForceNebula9869 = frostHunterFlowCyberHyper5624.FrostHunterPlaceholderLegendForceNebula9869();
        if (FrostHunterPlaceholderLegendForceNebula9869 == null) {
            FrostHunterAudioManagerThunderTitan4297.FrostHunterConstraintSetCloneMasterUltraRogue2633("Child of " + frostHunterFlowCyberHyper5624 + " cannot be null when calculating alignment line");
        }
        if (frostHunterFlowCyberHyper5624.FrostHunterAnnotationProcessorSolarSpeedNebula4443().FrostHunterServiceEliteCelestialThunder1757().containsKey(frostHunterGradientDrawableNovaStorm1783)) {
            Integer num = (Integer) frostHunterFlowCyberHyper5624.FrostHunterAnnotationProcessorSolarSpeedNebula4443().FrostHunterServiceEliteCelestialThunder1757().get(frostHunterGradientDrawableNovaStorm1783);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int FrostHunterInAppPurchaseLegendEpicDragon4579 = FrostHunterPlaceholderLegendForceNebula9869.FrostHunterInAppPurchaseLegendEpicDragon4579(frostHunterGradientDrawableNovaStorm1783);
            if (FrostHunterInAppPurchaseLegendEpicDragon4579 != Integer.MIN_VALUE) {
                FrostHunterPlaceholderLegendForceNebula9869.FrostHunterLintTitanVortexQuantum9911 = true;
                frostHunterFlowCyberHyper5624.FrostHunterCameraXTurboCelestialHero5430 = true;
                frostHunterFlowCyberHyper5624.FrostHunterItemDecorationPhoenixAlphaVortex8006();
                FrostHunterPlaceholderLegendForceNebula9869.FrostHunterLintTitanVortexQuantum9911 = false;
                frostHunterFlowCyberHyper5624.FrostHunterCameraXTurboCelestialHero5430 = false;
                return FrostHunterInAppPurchaseLegendEpicDragon4579 + ((int) (frostHunterGradientDrawableNovaStorm1783 instanceof FrostHunterGradientDrawableNovaStorm1783 ? FrostHunterPlaceholderLegendForceNebula9869.FrostHunterViewModelScopeTitanRogue1970() & 4294967295L : FrostHunterPlaceholderLegendForceNebula9869.FrostHunterViewModelScopeTitanRogue1970() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static List FrostHunterLintTitanVortexQuantum9911(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new FrostHunterGeocoderPhoenixHyperionSpark7905(iArr, 0, iArr.length);
    }

    public static int FrostHunterLooperHyperionForce4133(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static final int FrostHunterLooperThreadBetaHyperionMax1000(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            if (FrostHunterViewModelScopeLegendAurora8732.FrostHunterServiceEliteCelestialThunder1757(((FrostHunterViewModelScopeLegendAurora8732) list.get(i2)).FrostHunterAlphaAnimationNeoCosmos5761) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static ArrayList FrostHunterMagnetometerFusionTitanium8202(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final boolean FrostHunterMediaPlayerCelestialBetaTitan3868(FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511) {
        if (!FrostHunterBillingClientFusionVortex9008(frostHunterSharedElementSpectraNeo2511)) {
            FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757;
            if (frostHunterFirestoreEliteMasterThunder9916.FrostHunterAlertDialogAuroraDelta3200) {
                return true;
            }
            FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814;
            Object[] objArr = frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Object[] objArr2 = frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475;
            long[] jArr = frostHunterToastHyperTitanThunder2275.FrostHunterAlphaAnimationNeoCosmos5761;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((FrostHunterLiveDataScopeMaxSpark9882) obj).FrostHunterBundlePulseFusionHero2475) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static final FrostHunterContentResolverEpicBetaOlympian4466 FrostHunterMeteringPointBetaCyber9571(FrostHunterJobIntentServiceAlphaForce8629 frostHunterJobIntentServiceAlphaForce8629) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            FrostHunterSharedElementSpectraNeo2511 FrostHunterAlphaAnimationNeoCosmos57612 = frostHunterJobIntentServiceAlphaForce8629.FrostHunterAlphaAnimationNeoCosmos5761();
            FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterBundlePulseFusionHero2475;
            if (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMediaPlayerCelestialBetaTitan3868() && frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterBillingClientFusionVortex9008()) {
                FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466 = new FrostHunterContentResolverEpicBetaOlympian4466(48);
                FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565 = new FrostHunterAnimatorQuantumFusionMaster8565(15);
                FrostHunterSQLiteVisionSpeedSpark5388 FrostHunterPagingDataTurboTitanium7332 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingDataTurboTitanium7332(FrostHunterAlphaAnimationNeoCosmos57612.FrostHunterRemoteConfigSpeedSpeed8566());
                ((Region) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809).set(FrostHunterPagingDataTurboTitanium7332.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterPagingDataTurboTitanium7332.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterPagingDataTurboTitanium7332.FrostHunterBundlePulseFusionHero2475, FrostHunterPagingDataTurboTitanium7332.FrostHunterServiceEliteCelestialThunder1757);
                FrostHunterServiceInfoHyperionSparkMax9966(frostHunterAnimatorQuantumFusionMaster8565, FrostHunterAlphaAnimationNeoCosmos57612, frostHunterContentResolverEpicBetaOlympian4466, FrostHunterAlphaAnimationNeoCosmos57612, new FrostHunterAnimatorQuantumFusionMaster8565(15));
                return frostHunterContentResolverEpicBetaOlympian4466;
            }
            FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian44662 = FrostHunterDispatchersBetaHeroVision6785.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterContentResolverEpicBetaOlympian44662.getClass();
            return frostHunterContentResolverEpicBetaOlympian44662;
        } finally {
            Trace.endSection();
        }
    }

    public static final Bundle FrostHunterMeteringPointMegaCyber7955(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.FrostHunterBundlePulseFusionHero2475(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object FrostHunterMotionSceneAuroraMega2271(FrostHunterLocationManagerPrimeHero3906 frostHunterLocationManagerPrimeHero3906, FrostHunterBundleMaxNovaXVortex6982 frostHunterBundleMaxNovaXVortex6982, boolean z, FrostHunterTraceCelestialVortexSpark6705 frostHunterTraceCelestialVortexSpark6705) {
        FrostHunterActionBarFusionMegaMax2388 frostHunterActionBarFusionMegaMax2388;
        int i;
        FrostHunterVideoCaptureOmegaCosmosCosmos7652 it;
        FrostHunterVideoCaptureOmegaCosmosCosmos7652 frostHunterVideoCaptureOmegaCosmosCosmos7652;
        FrostHunterLocationManagerPrimeHero3906 frostHunterLocationManagerPrimeHero39062;
        Object FrostHunterConstraintSetCloneMasterUltraRogue26332;
        try {
            if (frostHunterTraceCelestialVortexSpark6705 instanceof FrostHunterActionBarFusionMegaMax2388) {
                frostHunterActionBarFusionMegaMax2388 = (FrostHunterActionBarFusionMegaMax2388) frostHunterTraceCelestialVortexSpark6705;
                int i2 = frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i2 - Integer.MIN_VALUE;
                    Object obj = frostHunterActionBarFusionMegaMax2388.FrostHunterScaleAnimationStrikeSpark5059;
                    i = frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    CancellationException cancellationException = null;
                    FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax8430 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i != 0) {
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        if (frostHunterLocationManagerPrimeHero3906 instanceof FrostHunterStateFlowShadowOlympian7273) {
                            throw ((FrostHunterStateFlowShadowOlympian7273) frostHunterLocationManagerPrimeHero3906).FrostHunterCameraXPixelTurboCosmos9814;
                        }
                        it = frostHunterBundleMaxNovaXVortex6982.iterator();
                        frostHunterActionBarFusionMegaMax2388.FrostHunterKeyframeGammaGamma1197 = frostHunterLocationManagerPrimeHero3906;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFragmentBetaMegaVortex6025 = frostHunterBundleMaxNovaXVortex6982;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterServiceConnectionTurboPhoenixOmega6719 = it;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterLightSensorForceFusion4241 = z;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1;
                        FrostHunterConstraintSetCloneMasterUltraRogue26332 = it.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterActionBarFusionMegaMax2388);
                        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != frostHunterAuthMasterNovaXMax8430) {
                        }
                    } else if (i == 1) {
                        z = frostHunterActionBarFusionMegaMax2388.FrostHunterLightSensorForceFusion4241;
                        frostHunterVideoCaptureOmegaCosmosCosmos7652 = frostHunterActionBarFusionMegaMax2388.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        frostHunterBundleMaxNovaXVortex6982 = frostHunterActionBarFusionMegaMax2388.FrostHunterFragmentBetaMegaVortex6025;
                        frostHunterLocationManagerPrimeHero39062 = frostHunterActionBarFusionMegaMax2388.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = frostHunterActionBarFusionMegaMax2388.FrostHunterLightSensorForceFusion4241;
                        frostHunterVideoCaptureOmegaCosmosCosmos7652 = frostHunterActionBarFusionMegaMax2388.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                        frostHunterBundleMaxNovaXVortex6982 = frostHunterActionBarFusionMegaMax2388.FrostHunterFragmentBetaMegaVortex6025;
                        frostHunterLocationManagerPrimeHero39062 = frostHunterActionBarFusionMegaMax2388.FrostHunterKeyframeGammaGamma1197;
                        FrostHunterBannerAdTitanVisionDragon3523.FrostHunterRewardedAdSpectraElite8288(obj);
                        it = frostHunterVideoCaptureOmegaCosmosCosmos7652;
                        frostHunterLocationManagerPrimeHero3906 = frostHunterLocationManagerPrimeHero39062;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterKeyframeGammaGamma1197 = frostHunterLocationManagerPrimeHero3906;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFragmentBetaMegaVortex6025 = frostHunterBundleMaxNovaXVortex6982;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterServiceConnectionTurboPhoenixOmega6719 = it;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterLightSensorForceFusion4241 = z;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1;
                        FrostHunterConstraintSetCloneMasterUltraRogue26332 = it.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterActionBarFusionMegaMax2388);
                        if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != frostHunterAuthMasterNovaXMax8430) {
                            return frostHunterAuthMasterNovaXMax8430;
                        }
                        frostHunterLocationManagerPrimeHero39062 = frostHunterLocationManagerPrimeHero3906;
                        frostHunterVideoCaptureOmegaCosmosCosmos7652 = it;
                        obj = FrostHunterConstraintSetCloneMasterUltraRogue26332;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                frostHunterBundleMaxNovaXVortex6982.FrostHunterServiceEliteCelestialThunder1757(null);
                            }
                            return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
                        }
                        Object FrostHunterBundlePulseFusionHero24752 = frostHunterVideoCaptureOmegaCosmosCosmos7652.FrostHunterBundlePulseFusionHero2475();
                        frostHunterActionBarFusionMegaMax2388.FrostHunterKeyframeGammaGamma1197 = frostHunterLocationManagerPrimeHero39062;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFragmentBetaMegaVortex6025 = frostHunterBundleMaxNovaXVortex6982;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterVideoCaptureOmegaCosmosCosmos7652;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterLightSensorForceFusion4241 = z;
                        frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        frostHunterActionBarFusionMegaMax2388 = new FrostHunterActionBarFusionMegaMax2388(frostHunterTraceCelestialVortexSpark6705);
        Object obj2 = frostHunterActionBarFusionMegaMax2388.FrostHunterScaleAnimationStrikeSpark5059;
        i = frostHunterActionBarFusionMegaMax2388.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        CancellationException cancellationException2 = null;
        FrostHunterAuthMasterNovaXMax8430 frostHunterAuthMasterNovaXMax84302 = FrostHunterAuthMasterNovaXMax8430.FrostHunterCameraXPixelTurboCosmos9814;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface FrostHunterNavigationMasterMegaMax2752(Typeface typeface, FrostHunterRewardedAdMasterGammaTurbo4439 frostHunterRewardedAdMasterGammaTurbo4439, Context context) {
        int i;
        String str;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return typeface;
        }
        ThreadLocal threadLocal = FrostHunterGradleCelestialGamma3515.FrostHunterAlphaAnimationNeoCosmos5761;
        if (typeface == null) {
            return null;
        }
        ArrayList arrayList = frostHunterRewardedAdMasterGammaTurbo4439.FrostHunterAlphaAnimationNeoCosmos5761;
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = FrostHunterGradleCelestialGamma3515.FrostHunterAlphaAnimationNeoCosmos5761;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        FrostHunterInAppPurchaseStormTitanium3752 FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterAlphaAnimationNeoCosmos5761(context);
        if (i3 >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    str = FrostHunterAnalyticsPixelSolarEpic8004.FrostHunterAlphaAnimationNeoCosmos5761(arrayList, null, new FrostHunterResourceUltraUltraLegend1377(FrostHunterAlphaAnimationNeoCosmos57612), 31);
                } else {
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                        return null;
                    }
                    float FrostHunterLintTitanVortexQuantum9911 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLintTitanVortexQuantum9911(i + 400.0f, 1.0f, 1000.0f);
                    str = (arrayList.isEmpty() ? "" : "".concat(",")) + "'wght' " + FrostHunterLintTitanVortexQuantum9911;
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        i = 0;
        if (i != 0) {
        }
        paint.setFontVariationSettings(str);
        return paint.getTypeface();
    }

    public static final int FrostHunterPagingDataTurboTitanium7332(String str, int i) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }

    public static int FrostHunterPagingSourceEclipseDelta8255(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final FrostHunterFilterSpectraTitan5298 FrostHunterPermissionInfoAlphaDelta6279(FrostHunterDrawerLayoutShadowPhoenix9863 frostHunterDrawerLayoutShadowPhoenix9863) {
        FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = FrostHunterRewardedAdMasterStrike9463(frostHunterDrawerLayoutShadowPhoenix9863).FrostHunterTextViewDragonStormMega4297;
        if (frostHunterFilterSpectraTitan5298 != null) {
            return frostHunterFilterSpectraTitan5298;
        }
        throw FrostHunterKeyEventNovaXAlpha1220.FrostHunterLevelListDrawableFusionDragonHero2232("This node does not have an owner.");
    }

    public static final void FrostHunterPreviewBlazeAurora1020(List list) {
        if (list.size() >= 2) {
            return;
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("colors must have length of at least 2 if colorStops is omitted.");
    }

    public static final String FrostHunterPushNotificationStormTitanGamma8999(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final FrostHunterVectorDrawableMaxAlpha8598 FrostHunterR8MasterNebulaSpark7247(FrostHunterDrawerLayoutShadowPhoenix9863 frostHunterDrawerLayoutShadowPhoenix9863, int i) {
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598 = ((FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterDrawerLayoutShadowPhoenix9863).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterScaleAnimationStrikeSpark5059;
        frostHunterVectorDrawableMaxAlpha8598.getClass();
        if (frostHunterVectorDrawableMaxAlpha8598.FrostHunterGradleOmegaVisionSpectra5961() != frostHunterDrawerLayoutShadowPhoenix9863 || !FrostHunterDigitalInkRecognitionFusionAlphaThunder2199.FrostHunterRemoteConfigSpeedSpeed8566(i)) {
            return frostHunterVectorDrawableMaxAlpha8598;
        }
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha85982 = frostHunterVectorDrawableMaxAlpha8598.FrostHunterBitmapTurboDeltaNebula8743;
        frostHunterVectorDrawableMaxAlpha85982.getClass();
        return frostHunterVectorDrawableMaxAlpha85982;
    }

    public static final void FrostHunterRemoteConfigSpeedSpeed8566(float f, float f2, int i, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i2) {
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(1921380911);
        int i3 = i2 | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f) ? 4 : 2) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterBundlePulseFusionHero2475(f2) ? 32 : 16) | (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterServiceEliteCelestialThunder1757(i) ? 256 : 128);
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i3 & 1, (i3 & 147) != 146)) {
            FrostHunterDispatchersPrimeHeroSpeed4562 frostHunterDispatchersPrimeHeroSpeed4562 = (FrostHunterDispatchersPrimeHeroSpeed4562) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterActionBarTitanBeta1231.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterLifecycleBlazeGammaElite28892 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterLifecycleBlazeGammaElite2889(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterBundlePulseFusionHero2475(frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f - 45.0f), frostHunterDispatchersPrimeHeroSpeed4562.FrostHunterViewPager2StrikePulse8790(f2 - 60.0f)), 90.0f, 110.0f);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17572 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterKeyframeGammaGamma1197);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterLifecycleBlazeGammaElite28892);
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
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24513 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega24514 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475;
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17573 = androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterServiceEliteCelestialThunder1757(FrostHunterAnimatorRoguePulse2723.FrostHunterConstraintSetCloneMasterUltraRogue2633, 40.0f);
            FrostHunterBroadcastFusionCosmos6323 frostHunterBroadcastFusionCosmos6323 = FrostHunterJobSchedulerSparkForce2643.FrostHunterAlphaAnimationNeoCosmos5761;
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterLevelListDrawableFusionDragonHero22322 = androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterServiceEliteCelestialThunder17573, frostHunterBroadcastFusionCosmos6323, 518143), FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4283417591L), 0.25f), FrostHunterCanvasInfernoVortex4700.FrostHunterLifecycleBlazeGammaElite2889), 1.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4283417591L), 0.7f), frostHunterBroadcastFusionCosmos6323), 6.0f);
            FrostHunterScaleAnimationOmegaTitan6238 frostHunterScaleAnimationOmegaTitan6238 = FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241;
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17574 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(frostHunterScaleAnimationOmegaTitan6238);
            int hashCode2 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60252 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94632 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterLevelListDrawableFusionDragonHero22322);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17574);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60252);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode2))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode2, frostHunterDialogFragmentPhantomEclipse8068, hashCode2, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94632);
            FrostHunterChipNovaPhantomElite7665.FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(i), androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterSharedFlowOlympianDragon9650.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterDialogFragmentPhantomEclipse8068, ((i3 >> 6) & 14) | 1573296);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLintTitanVortexQuantum9911(true);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterLifecycleBlazeGammaElite2889(androidx.compose.foundation.layout.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceEliteCelestialThunder1757(48.0f), 60.0f, 60.0f), frostHunterBroadcastFusionCosmos6323, 518143), FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4280693304L)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterBundlePulseFusionHero2475(4279048994L))))), 2.0f, FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.3f), frostHunterBroadcastFusionCosmos6323);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17575 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(frostHunterScaleAnimationOmegaTitan6238);
            int hashCode3 = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex60253 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike94633 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterCameraXPixelTurboCosmos98142);
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega2451, FrostHunterServiceEliteCelestialThunder17575);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24512, FrostHunterFragmentBetaMegaVortex60253);
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode3))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode3, frostHunterDialogFragmentPhantomEclipse8068, hashCode3, frostHunterBindingAdapterUltraSpectraOmega24513);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, frostHunterBindingAdapterUltraSpectraOmega24514, FrostHunterRewardedAdMasterStrike94633);
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633("🎣", null, 0L, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(26), 0L, null, 0L, 0, false, 0, 0, null, frostHunterDialogFragmentPhantomEclipse8068, 3078, 131062);
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterNestedScrollViewNebulaHyper6713(f, f2, i, i2, 1);
        }
    }

    public static final PorterDuff.Mode FrostHunterRemoteConfigThunderShadow4435(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static int FrostHunterResourcesTitanHyperVision5823(long j) {
        int i = (int) j;
        FrostHunterCanvasInfernoVortex4700.FrostHunterLooperThreadBetaHyperionMax1000(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static final FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 FrostHunterRewardedAdMasterStrike9463(FrostHunterDrawerLayoutShadowPhoenix9863 frostHunterDrawerLayoutShadowPhoenix9863) {
        FrostHunterVectorDrawableMaxAlpha8598 frostHunterVectorDrawableMaxAlpha8598 = ((FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterDrawerLayoutShadowPhoenix9863).FrostHunterCameraXPixelTurboCosmos9814.FrostHunterScaleAnimationStrikeSpark5059;
        if (frostHunterVectorDrawableMaxAlpha8598 != null) {
            return frostHunterVectorDrawableMaxAlpha8598.FrostHunterMotionSceneAuroraMega2271;
        }
        throw FrostHunterKeyEventNovaXAlpha1220.FrostHunterLevelListDrawableFusionDragonHero2232("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static int[] FrostHunterRewardedAdSpectraElite8288(Collection collection) {
        if (collection instanceof FrostHunterGeocoderPhoenixHyperionSpark7905) {
            FrostHunterGeocoderPhoenixHyperionSpark7905 frostHunterGeocoderPhoenixHyperionSpark7905 = (FrostHunterGeocoderPhoenixHyperionSpark7905) collection;
            return Arrays.copyOfRange(frostHunterGeocoderPhoenixHyperionSpark7905.FrostHunterCameraXPixelTurboCosmos9814, frostHunterGeocoderPhoenixHyperionSpark7905.FrostHunterFlowMaxDragonHero5809, frostHunterGeocoderPhoenixHyperionSpark7905.FrostHunterAlertDialogAuroraDelta3200);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final FrostHunterGradientDrawablePulseDragonInferno9637 FrostHunterScaleAnimationStrikeSpark5059(FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090) {
        int i;
        if (frostHunterObjectAnimatorNeoStrike7090 == null || (i = frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200) == 0) {
            return null;
        }
        return (FrostHunterGradientDrawablePulseDragonInferno9637) frostHunterObjectAnimatorNeoStrike7090.FrostHunterAlertDialogAuroraDelta3200(i - 1);
    }

    public static final void FrostHunterServiceConnectionTurboPhoenixOmega6719(FrostHunterObjectAnimatorNeoStrike7090 frostHunterObjectAnimatorNeoStrike7090, FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637) {
        FrostHunterObjectAnimatorNeoStrike7090 FrostHunterDialogFragmentTurboPhoenixDragon7627 = FrostHunterRewardedAdMasterStrike9463(frostHunterGradientDrawablePulseDragonInferno9637).FrostHunterDialogFragmentTurboPhoenixDragon7627();
        int i = FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterAlertDialogAuroraDelta3200 - 1;
        Object[] objArr = FrostHunterDialogFragmentTurboPhoenixDragon7627.FrostHunterCameraXPixelTurboCosmos9814;
        if (i < objArr.length) {
            while (i >= 0) {
                frostHunterObjectAnimatorNeoStrike7090.FrostHunterConstraintSetCloneMasterUltraRogue2633((FrostHunterGradientDrawablePulseDragonInferno9637) ((FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439) objArr[i]).FrostHunterPagingDataTurboTitanium7332.FrostHunterAlertDialogAuroraDelta3200);
                i--;
            }
        }
    }

    public static final void FrostHunterServiceEliteCelestialThunder1757(String str, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595, boolean z, long j, FrostHunterCombineBlazeLegendGamma9228 frostHunterCombineBlazeLegendGamma9228, FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse8068, int i) {
        String str2;
        int i2;
        FrostHunterDialogFragmentPhantomEclipse8068 frostHunterDialogFragmentPhantomEclipse80682;
        int i3;
        FrostHunterVideoCaptureEclipseGamma2116 FrostHunterLightSensorForceFusion4241;
        frostHunterDialogFragmentPhantomEclipse8068.FrostHunterConstraintSetCloneOmegaHyperion9304(475197382);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterCameraXPixelTurboCosmos9814(frostHunterNotificationGammaBlazePhoenix7595) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterRemoteConfigSpeedSpeed8566(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLifecycleBlazeGammaElite2889(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= frostHunterDialogFragmentPhantomEclipse8068.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterCombineBlazeLegendGamma9228) ? 16384 : 8192;
        }
        if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFCMDeltaQuantumHero8364(i2 & 1, (i2 & 9363) != 9362)) {
            FrostHunterBroadcastFusionCosmos6323 FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterJobSchedulerSparkForce2643.FrostHunterConstraintSetCloneMasterUltraRogue2633(16.0f);
            if (z) {
                i3 = 2;
                FrostHunterLightSensorForceFusion4241 = FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.85f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.55f))));
            } else {
                i3 = 2;
                long j2 = FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475;
                FrostHunterLightSensorForceFusion4241 = FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241(FrostHunterCardViewHyperionAurora3829.FrostHunterFCMDeltaQuantumHero8364(new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.1f)), new FrostHunterViewModelScopeLegendAurora8732(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j2, 0.04f))));
            }
            long FrostHunterConstraintSetCloneMasterUltraRogue26333 = z ? FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(j, 0.55f) : FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.18f);
            long FrostHunterConstraintSetCloneMasterUltraRogue26334 = z ? FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475 : FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterViewModelScopeLegendAurora8732.FrostHunterBundlePulseFusionHero2475, 0.85f);
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterServiceEliteCelestialThunder17572 = androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceEliteCelestialThunder1757(FrostHunterExecutorSolarPhoenix3849.FrostHunterCameraXPixelTurboCosmos9814(androidx.compose.foundation.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterAlphaAnimationNeoCosmos5761(androidx.compose.ui.graphics.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterConstraintSetCloneMasterUltraRogue2633(androidx.compose.foundation.layout.FrostHunterAdapterDelegateNebulaRogue3354.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterCombineBlazeLegendGamma9228, 50.0f), FrostHunterConstraintSetCloneMasterUltraRogue26332, 518143), FrostHunterLightSensorForceFusion4241), 1.0f, FrostHunterConstraintSetCloneMasterUltraRogue26333, FrostHunterConstraintSetCloneMasterUltraRogue26332), frostHunterNotificationGammaBlazePhoenix7595);
            FrostHunterApplicationInfoEclipseSparkDelta6014 FrostHunterServiceEliteCelestialThunder17573 = FrostHunterAuthSparkSpectra4812.FrostHunterServiceEliteCelestialThunder1757(FrostHunterRewardedAdHyperStrike1151.FrostHunterLightSensorForceFusion4241);
            int hashCode = Long.hashCode(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterNavigationMasterMegaMax2752);
            FrostHunterFlingGestureFusionBlaze2826 FrostHunterFragmentBetaMegaVortex6025 = frostHunterDialogFragmentPhantomEclipse8068.FrostHunterFragmentBetaMegaVortex6025();
            FrostHunterCombineBlazeLegendGamma9228 FrostHunterRewardedAdMasterStrike9463 = FrostHunterDrawerLayoutUltraStrike3303.FrostHunterRewardedAdMasterStrike9463(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterServiceEliteCelestialThunder17572);
            FrostHunterContextHyperDelta9193.FrostHunterConstraintSetCloneMasterUltraRogue2633.getClass();
            FrostHunterBundleShadowStrike1123 frostHunterBundleShadowStrike1123 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAnnotationProcessorSparkEclipse8710();
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255) {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterKeyframeGammaGamma1197(frostHunterBundleShadowStrike1123);
            } else {
                frostHunterDialogFragmentPhantomEclipse8068.FrostHunterImageAnalysisGammaOlympian2400();
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterLifecycleBlazeGammaElite2889, FrostHunterServiceEliteCelestialThunder17573);
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex6025);
            FrostHunterBindingAdapterUltraSpectraOmega2451 frostHunterBindingAdapterUltraSpectraOmega2451 = FrostHunterPaintThunderVisionAlpha4064.FrostHunterLevelListDrawableFusionDragonHero2232;
            if (frostHunterDialogFragmentPhantomEclipse8068.FrostHunterPagingSourceEclipseDelta8255 || !FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterDialogFragmentPhantomEclipse8068.FrostHunterMagnetometerFusionTitanium8202(), Integer.valueOf(hashCode))) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterLintTitanVortexQuantum9911(hashCode, frostHunterDialogFragmentPhantomEclipse8068, hashCode, frostHunterBindingAdapterUltraSpectraOmega2451);
            }
            FrostHunterInAppPurchaseEclipseThunder8224.FrostHunterCameraXPixelTurboCosmos9814(frostHunterDialogFragmentPhantomEclipse8068, FrostHunterPaintThunderVisionAlpha4064.FrostHunterBundlePulseFusionHero2475, FrostHunterRewardedAdMasterStrike9463);
            FrostHunterGradientDrawableCelestialMega9586.FrostHunterConstraintSetCloneMasterUltraRogue2633(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, FrostHunterFragmentManagerFusionNovaDragon6284.FrostHunterAlphaAnimationNeoCosmos5761(((FrostHunterFirestoreLegendSpectraPrime7157) frostHunterDialogFragmentPhantomEclipse8068.FrostHunterAlertDialogAuroraDelta3200(FrostHunterBannerAdCosmosEliteSpark7619.FrostHunterAlphaAnimationNeoCosmos5761)).FrostHunterCameraXPixelTurboCosmos9814, FrostHunterConstraintSetCloneMasterUltraRogue26334, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(14), FrostHunterBillingClientRogueThunder4597.FrostHunterScaleAnimationStrikeSpark5059, null, FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterLifecycleBlazeGammaElite2889(i3), 0L, null, 16777080), frostHunterDialogFragmentPhantomEclipse8068, i2 & 14, 65534);
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterLintTitanVortexQuantum9911(true);
        } else {
            frostHunterDialogFragmentPhantomEclipse80682 = frostHunterDialogFragmentPhantomEclipse8068;
            frostHunterDialogFragmentPhantomEclipse80682.FrostHunterPagingSourceEclipseDelta8255();
        }
        FrostHunterNotificationPrimeSpectraShadow9543 FrostHunterResourcesTitanHyperVision5823 = frostHunterDialogFragmentPhantomEclipse80682.FrostHunterResourcesTitanHyperVision5823();
        if (FrostHunterResourcesTitanHyperVision5823 != null) {
            FrostHunterResourcesTitanHyperVision5823.FrostHunterServiceEliteCelestialThunder1757 = new FrostHunterServiceInfoCelestialStrikeLegend4781(str, frostHunterNotificationGammaBlazePhoenix7595, z, j, frostHunterCombineBlazeLegendGamma9228, i);
        }
    }

    public static final void FrostHunterServiceInfoHyperionSparkMax9966(FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster8565, FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511, FrostHunterContentResolverEpicBetaOlympian4466 frostHunterContentResolverEpicBetaOlympian4466, FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo25112, FrostHunterAnimatorQuantumFusionMaster8565 frostHunterAnimatorQuantumFusionMaster85652) {
        FrostHunterBarrierThunderHyperion9659 FrostHunterOnItemClickListenerSparkLegend4271;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439;
        int i = frostHunterSharedElementSpectraNeo2511.FrostHunterRemoteConfigSpeedSpeed8566;
        Region region = (Region) frostHunterAnimatorQuantumFusionMaster85652.FrostHunterFlowMaxDragonHero5809;
        FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392 = frostHunterSharedElementSpectraNeo25112.FrostHunterBundlePulseFusionHero2475;
        int i2 = frostHunterSharedElementSpectraNeo25112.FrostHunterRemoteConfigSpeedSpeed8566;
        boolean z = (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterMediaPlayerCelestialBetaTitan3868() && frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterBillingClientFusionVortex9008()) ? false : true;
        Region region2 = (Region) frostHunterAnimatorQuantumFusionMaster8565.FrostHunterFlowMaxDragonHero5809;
        if (!region2.isEmpty() || i2 == i) {
            if (!z || frostHunterSharedElementSpectraNeo25112.FrostHunterLifecycleBlazeGammaElite2889) {
                FrostHunterDrawerLayoutShadowPhoenix9863 FrostHunterLevelListDrawableFusionDragonHero22322 = frostHunterSharedElementSpectraNeo25112.FrostHunterLevelListDrawableFusionDragonHero2232();
                if (FrostHunterLevelListDrawableFusionDragonHero22322 == null) {
                    FrostHunterOnItemClickListenerSparkLegend4271 = ((FrostHunterPagingSourceRogueStrike9373) frostHunterOnGlobalLayoutListenerTitanStrikeNovaX14392.FrostHunterPagingDataTurboTitanium7332.FrostHunterRemoteConfigSpeedSpeed8566).FrostHunterOnItemClickListenerSparkLegend4271();
                } else {
                    FrostHunterGradientDrawablePulseDragonInferno9637 frostHunterGradientDrawablePulseDragonInferno9637 = ((FrostHunterGradientDrawablePulseDragonInferno9637) FrostHunterLevelListDrawableFusionDragonHero22322).FrostHunterCameraXPixelTurboCosmos9814;
                    Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo25112.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterDialogVortexNeoUltra2659.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                    if (FrostHunterRemoteConfigSpeedSpeed85662 == null) {
                        FrostHunterRemoteConfigSpeedSpeed85662 = null;
                    }
                    boolean z2 = FrostHunterRemoteConfigSpeedSpeed85662 != null;
                    if (!frostHunterGradientDrawablePulseDragonInferno9637.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLooperThreadBetaHyperionMax1000) {
                        FrostHunterOnItemClickListenerSparkLegend4271 = FrostHunterBarrierThunderHyperion9659.FrostHunterLifecycleBlazeGammaElite2889;
                    } else if (z2) {
                        FrostHunterOnItemClickListenerSparkLegend4271 = FrostHunterR8MasterNebulaSpark7247(frostHunterGradientDrawablePulseDragonInferno9637, 8).FrostHunterOnItemClickListenerSparkLegend4271();
                    } else {
                        FrostHunterVectorDrawableMaxAlpha8598 FrostHunterR8MasterNebulaSpark7247 = FrostHunterR8MasterNebulaSpark7247(frostHunterGradientDrawablePulseDragonInferno9637, 8);
                        FrostHunterOnItemClickListenerSparkLegend4271 = FrostHunterPaintCyberPulse5979.FrostHunterBitmapTurboDeltaNebula8743(FrostHunterR8MasterNebulaSpark7247).FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterR8MasterNebulaSpark7247, true);
                    }
                }
                FrostHunterSQLiteVisionSpeedSpark5388 FrostHunterPagingDataTurboTitanium7332 = FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingDataTurboTitanium7332(FrostHunterOnItemClickListenerSparkLegend4271);
                region.set(FrostHunterPagingDataTurboTitanium7332.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterPagingDataTurboTitanium7332.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterPagingDataTurboTitanium7332.FrostHunterBundlePulseFusionHero2475, FrostHunterPagingDataTurboTitanium7332.FrostHunterServiceEliteCelestialThunder1757);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (frostHunterSharedElementSpectraNeo25112.FrostHunterLifecycleBlazeGammaElite2889) {
                        FrostHunterSharedElementSpectraNeo2511 FrostHunterFragmentBetaMegaVortex6025 = frostHunterSharedElementSpectraNeo25112.FrostHunterFragmentBetaMegaVortex6025();
                        frostHunterContentResolverEpicBetaOlympian4466.FrostHunterRemoteConfigSpeedSpeed8566(i2, new FrostHunterRecyclerViewInfernoPhantomSpark2260(frostHunterSharedElementSpectraNeo25112, FrostHunterExecutorSolarPhoenix3849.FrostHunterPagingDataTurboTitanium7332((FrostHunterFragmentBetaMegaVortex6025 == null || (frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439 = FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475) == null || !frostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439.FrostHunterMediaPlayerCelestialBetaTitan3868()) ? FrostHunterLifecycleBlazeGammaElite2889 : FrostHunterFragmentBetaMegaVortex6025.FrostHunterRemoteConfigSpeedSpeed8566())));
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            frostHunterContentResolverEpicBetaOlympian4466.FrostHunterRemoteConfigSpeedSpeed8566(i2, new FrostHunterRecyclerViewInfernoPhantomSpark2260(frostHunterSharedElementSpectraNeo25112, new FrostHunterSQLiteVisionSpeedSpark5388(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                frostHunterContentResolverEpicBetaOlympian4466.FrostHunterRemoteConfigSpeedSpeed8566(i2, new FrostHunterRecyclerViewInfernoPhantomSpark2260(frostHunterSharedElementSpectraNeo25112, new FrostHunterSQLiteVisionSpeedSpark5388(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List FrostHunterAlertDialogAuroraDelta3200 = FrostHunterSharedElementSpectraNeo2511.FrostHunterAlertDialogAuroraDelta3200(4, frostHunterSharedElementSpectraNeo25112);
                for (int size = FrostHunterAlertDialogAuroraDelta3200.size() - 1; -1 < size; size--) {
                    if (!((FrostHunterSharedElementSpectraNeo2511) FrostHunterAlertDialogAuroraDelta3200.get(size)).FrostHunterKeyframeGammaGamma1197().FrostHunterCameraXPixelTurboCosmos9814.FrostHunterBundlePulseFusionHero2475(FrostHunterBannerAdEliteStrike7333.FrostHunterDialogFragmentTurboPhoenixDragon7627)) {
                        FrostHunterServiceInfoHyperionSparkMax9966(frostHunterAnimatorQuantumFusionMaster8565, frostHunterSharedElementSpectraNeo2511, frostHunterContentResolverEpicBetaOlympian4466, (FrostHunterSharedElementSpectraNeo2511) FrostHunterAlertDialogAuroraDelta3200.get(size), frostHunterAnimatorQuantumFusionMaster85652);
                    }
                }
                if (FrostHunterMediaPlayerCelestialBetaTitan3868(frostHunterSharedElementSpectraNeo25112)) {
                    region2.op(FrostHunterPagingDataTurboTitanium7332.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterPagingDataTurboTitanium7332.FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterPagingDataTurboTitanium7332.FrostHunterBundlePulseFusionHero2475, FrostHunterPagingDataTurboTitanium7332.FrostHunterServiceEliteCelestialThunder1757, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final float[] FrostHunterStateCelestialNovaPixel8414(int i, List list) {
        if (i == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i];
        fArr[0] = 0.0f;
        int size = list.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size; i3++) {
            long j = ((FrostHunterViewModelScopeLegendAurora8732) list.get(i3)).FrostHunterAlphaAnimationNeoCosmos5761;
            float size2 = i3 / (list.size() - 1);
            int i4 = i2 + 1;
            fArr[i2] = size2;
            if (FrostHunterViewModelScopeLegendAurora8732.FrostHunterServiceEliteCelestialThunder1757(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = size2;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = 1.0f;
        return fArr;
    }

    public static int FrostHunterTextViewDragonStormMega4297(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final BlendMode FrostHunterTransitionListenerPulseVortexCosmos7949(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final int[] FrostHunterTranslateAnimationCyberSolarUltra7101(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(((FrostHunterViewModelScopeLegendAurora8732) list.get(i3)).FrostHunterAlphaAnimationNeoCosmos5761);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        while (i3 < size3) {
            long j = ((FrostHunterViewModelScopeLegendAurora8732) list.get(i3)).FrostHunterAlphaAnimationNeoCosmos5761;
            if (FrostHunterViewModelScopeLegendAurora8732.FrostHunterServiceEliteCelestialThunder1757(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterViewModelScopeLegendAurora8732) list.get(1)).FrostHunterAlphaAnimationNeoCosmos5761, 0.0f));
                } else if (i3 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterViewModelScopeLegendAurora8732) list.get(i3 - 1)).FrostHunterAlphaAnimationNeoCosmos5761, 0.0f));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterViewModelScopeLegendAurora8732) list.get(i3 - 1)).FrostHunterAlphaAnimationNeoCosmos5761, 0.0f));
                    i4 += 2;
                    iArr2[i5] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(FrostHunterViewModelScopeLegendAurora8732.FrostHunterConstraintSetCloneMasterUltraRogue2633(((FrostHunterViewModelScopeLegendAurora8732) list.get(i3 + 1)).FrostHunterAlphaAnimationNeoCosmos5761, 0.0f));
                }
                i4 = i2;
            } else {
                iArr2[i4] = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterRemoteConfigThunderShadow4435(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    public static final long FrostHunterViewPhantomNeo1634(FrostHunterSQLiteMasterUltra9956 frostHunterSQLiteMasterUltra9956) {
        DragEvent dragEvent = (DragEvent) frostHunterSQLiteMasterUltra9956.FrostHunterFlowMaxDragonHero5809;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }
}
