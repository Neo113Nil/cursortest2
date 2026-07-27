package android.content.Context;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterGeocoderHyperTitanium5786 extends FrostHunterProfilerTurboMaxTurbo5507 {
    public static Field FrostHunterCameraXTurboCelestialHero5430 = null;
    public static Class FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = null;
    public static boolean FrostHunterLightSensorForceFusion4241 = false;
    public static Field FrostHunterLintTitanVortexQuantum9911;
    public static Method FrostHunterScaleAnimationStrikeSpark5059;
    public int FrostHunterAlertDialogAuroraDelta3200;
    public final WindowInsets FrostHunterBundlePulseFusionHero2475;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public FrostHunterPackageManagerNovaStrike8745 FrostHunterFlowMaxDragonHero5809;
    public Rect[][] FrostHunterFragmentBetaMegaVortex6025;
    public int FrostHunterKeyframeGammaGamma1197;
    public FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterLevelListDrawableFusionDragonHero2232;
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterLifecycleBlazeGammaElite2889;
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterRemoteConfigSpeedSpeed8566;
    public Rect[][] FrostHunterServiceConnectionTurboPhoenixOmega6719;
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterGeocoderHyperTitanium5786(FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624, WindowInsets windowInsets) {
        super(frostHunterServiceInfoAuroraHyperNeo5624);
        this.FrostHunterLifecycleBlazeGammaElite2889 = null;
        this.FrostHunterFragmentBetaMegaVortex6025 = new Rect[10][];
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = new Rect[10][];
        this.FrostHunterBundlePulseFusionHero2475 = windowInsets;
    }

    private FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterBillingClientFusionVortex9008(int i, boolean z) {
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterLifecycleBlazeGammaElite2889;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995, FrostHunterMediaPlayerCelestialBetaTitan3868(i2, z));
            }
        }
        return frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995;
    }

    private FrostHunterPackageManagerNovaStrike8745 FrostHunterCardViewSpectraCyber7714(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterTextViewDragonStormMega4297()) {
            return FrostHunterPackageManagerNovaStrike8745.FrostHunterAlphaAnimationNeoCosmos5761(point.x, point.y, true, 0, 0, 0, 0);
        }
        FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 FrostHunterFCMDeltaQuantumHero8364 = FrostHunterCanvasInfernoVortex4700.FrostHunterFCMDeltaQuantumHero8364(display, 0);
        FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 FrostHunterFCMDeltaQuantumHero83642 = FrostHunterCanvasInfernoVortex4700.FrostHunterFCMDeltaQuantumHero8364(display, 1);
        FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 FrostHunterFCMDeltaQuantumHero83643 = FrostHunterCanvasInfernoVortex4700.FrostHunterFCMDeltaQuantumHero8364(display, 2);
        FrostHunterOnItemClickListenerTitaniumSpectraStorm7629 FrostHunterFCMDeltaQuantumHero83644 = FrostHunterCanvasInfernoVortex4700.FrostHunterFCMDeltaQuantumHero8364(display, 3);
        return FrostHunterPackageManagerNovaStrike8745.FrostHunterAlphaAnimationNeoCosmos5761(point.x, point.y, false, FrostHunterFCMDeltaQuantumHero8364 != null ? FrostHunterFCMDeltaQuantumHero8364.FrostHunterConstraintSetCloneMasterUltraRogue2633 : 0, FrostHunterFCMDeltaQuantumHero83642 != null ? FrostHunterFCMDeltaQuantumHero83642.FrostHunterConstraintSetCloneMasterUltraRogue2633 : 0, FrostHunterFCMDeltaQuantumHero83643 != null ? FrostHunterFCMDeltaQuantumHero83643.FrostHunterConstraintSetCloneMasterUltraRogue2633 : 0, FrostHunterFCMDeltaQuantumHero83644 != null ? FrostHunterFCMDeltaQuantumHero83644.FrostHunterConstraintSetCloneMasterUltraRogue2633 : 0);
    }

    private Rect[] FrostHunterMeteringPointMegaCyber7955(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) {
        ArrayList arrayList = new ArrayList();
        int i = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterAlphaAnimationNeoCosmos5761;
        int i2 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterServiceEliteCelestialThunder1757;
        int i3 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterBundlePulseFusionHero2475;
        int i4 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterAlertDialogAuroraDelta3200));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.FrostHunterKeyframeGammaGamma1197, i4));
        }
        if (i3 != 0) {
            int i5 = this.FrostHunterKeyframeGammaGamma1197;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.FrostHunterAlertDialogAuroraDelta3200));
        }
        if (i2 != 0) {
            int i6 = this.FrostHunterAlertDialogAuroraDelta3200;
            arrayList.add(new Rect(0, i6 - i2, this.FrostHunterKeyframeGammaGamma1197, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private static void FrostHunterPagingDataTurboTitanium7332() {
        try {
            FrostHunterScaleAnimationStrikeSpark5059 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = cls;
            FrostHunterLintTitanVortexQuantum9911 = cls.getDeclaredField("mVisibleInsets");
            FrostHunterCameraXTurboCelestialHero5430 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            FrostHunterLintTitanVortexQuantum9911.setAccessible(true);
            FrostHunterCameraXTurboCelestialHero5430.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        FrostHunterLightSensorForceFusion4241 = true;
    }

    public static boolean FrostHunterR8MasterNebulaSpark7247(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterStateCelestialNovaPixel8414(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!FrostHunterLightSensorForceFusion4241) {
            FrostHunterPagingDataTurboTitanium7332();
        }
        Method method = FrostHunterScaleAnimationStrikeSpark5059;
        if (method != null && FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 != null && FrostHunterLintTitanVortexQuantum9911 != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) FrostHunterLintTitanVortexQuantum9911.get(FrostHunterCameraXTurboCelestialHero5430.get(invoke));
                if (rect != null) {
                    return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterTranslateAnimationCyberSolarUltra7101() {
        FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        return frostHunterServiceInfoAuroraHyperNeo5624 != null ? frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025() : FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterLifecycleBlazeGammaElite2889;
    }

    private static List<Rect> FrostHunterViewPhantomNeo1634(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[FrostHunterTextInputLayoutBlazePhoenix5492.FrostHunterCameraXPixelTurboCosmos9814(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterAlertDialogAuroraDelta3200(int i) {
        return FrostHunterBillingClientFusionVortex9008(i, true);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterBitmapTurboDeltaNebula8743(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995[] frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr) {
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterCameraXTurboCelestialHero5430(int i, int i2, int i3, int i4) {
        FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero2475 = FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterBundlePulseFusionHero2475(null, this.FrostHunterBundlePulseFusionHero2475);
        int i5 = Build.VERSION.SDK_INT;
        FrostHunterStateFlowAuroraLegendDelta6548 frostHunterLaunchHeroPulseNeo5805 = i5 >= 36 ? new FrostHunterLaunchHeroPulseNeo5805(FrostHunterBundlePulseFusionHero2475) : i5 >= 35 ? new FrostHunterServiceConnectionSparkElite7501(FrostHunterBundlePulseFusionHero2475) : i5 >= 34 ? new FrostHunterContentObserverBetaQuantumEpic3645(FrostHunterBundlePulseFusionHero2475) : i5 >= 31 ? new FrostHunterProximitySensorTitaniumEpicLegend3537(FrostHunterBundlePulseFusionHero2475) : i5 >= 30 ? new FrostHunterLaunchRogueStorm2286(FrostHunterBundlePulseFusionHero2475) : i5 >= 29 ? new FrostHunterStateStrikeRogue4835(FrostHunterBundlePulseFusionHero2475) : new FrostHunterColorStateListStormPulseElite7932(FrostHunterBundlePulseFusionHero2475);
        frostHunterLaunchHeroPulseNeo5805.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLightSensorForceFusion4241(), i, i2, i3, i4));
        frostHunterLaunchHeroPulseNeo5805.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterFragmentBetaMegaVortex6025(), i, i2, i3, i4));
        return frostHunterLaunchHeroPulseNeo5805.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterDatabaseEliteShadowUltra2452(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = (Rect[][]) rectArr.clone();
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) {
        this.FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterEditTextPulseHyperion1262(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.FrostHunterFragmentBetaMegaVortex6025 = (Rect[][]) rectArr.clone();
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(View view) {
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterCardViewSpectraCyber7714(view);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterFlowMaxDragonHero5809(int i) {
        return FrostHunterBillingClientFusionVortex9008(i, false);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public List<Rect> FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        return FrostHunterViewPhantomNeo1634(this.FrostHunterFragmentBetaMegaVortex6025, i);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterLifecycleBlazeGammaElite2889(FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624) {
        frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLooperHyperionForce4133(this.FrostHunterLevelListDrawableFusionDragonHero2232);
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 = this.FrostHunterRemoteConfigSpeedSpeed8566;
        FrostHunterProfilerTurboMaxTurbo5507 frostHunterProfilerTurboMaxTurbo5507 = frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterDialogFragmentTurboPhoenixDragon7627(frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterServiceInfoHyperionSparkMax9966(this.FrostHunterCameraXPixelTurboCosmos9814);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterMotionSceneAuroraMega2271(this.FrostHunterFlowMaxDragonHero5809);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterEditTextPulseHyperion1262(this.FrostHunterFragmentBetaMegaVortex6025);
        frostHunterProfilerTurboMaxTurbo5507.FrostHunterDatabaseEliteShadowUltra2452(this.FrostHunterServiceConnectionTurboPhoenixOmega6719);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public final FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterLightSensorForceFusion4241() {
        if (this.FrostHunterLifecycleBlazeGammaElite2889 == null) {
            WindowInsets windowInsets = this.FrostHunterBundlePulseFusionHero2475;
            this.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterLintTitanVortexQuantum9911() {
        for (int i = 1; i <= 512; i <<= 1) {
            int FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterTextInputLayoutBlazePhoenix5492.FrostHunterCameraXPixelTurboCosmos9814(i);
            this.FrostHunterFragmentBetaMegaVortex6025[FrostHunterCameraXPixelTurboCosmos9814] = FrostHunterMeteringPointMegaCyber7955(FrostHunterFlowMaxDragonHero5809(i));
            if (i != 8) {
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719[FrostHunterCameraXPixelTurboCosmos9814] = FrostHunterMeteringPointMegaCyber7955(FrostHunterAlertDialogAuroraDelta3200(i));
            }
        }
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterLooperHyperionForce4133(FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624) {
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterServiceInfoAuroraHyperNeo5624;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public boolean FrostHunterLooperThreadBetaHyperionMax1000(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !FrostHunterMagnetometerFusionTitanium8202(i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean FrostHunterMagnetometerFusionTitanium8202(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !FrostHunterMediaPlayerCelestialBetaTitan3868(i, false).equals(FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterLifecycleBlazeGammaElite2889);
    }

    public FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterMediaPlayerCelestialBetaTitan3868(int i, boolean z) {
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterFragmentBetaMegaVortex6025;
        int i2;
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterLifecycleBlazeGammaElite2889;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995[] frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr = this.FrostHunterServiceEliteCelestialThunder1757;
                    FrostHunterFragmentBetaMegaVortex6025 = frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr != null ? frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995Arr[FrostHunterTextInputLayoutBlazePhoenix5492.FrostHunterCameraXPixelTurboCosmos9814(8)] : null;
                    if (FrostHunterFragmentBetaMegaVortex6025 != null) {
                        return FrostHunterFragmentBetaMegaVortex6025;
                    }
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterLightSensorForceFusion42412 = FrostHunterLightSensorForceFusion4241();
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterTranslateAnimationCyberSolarUltra7101 = FrostHunterTranslateAnimationCyberSolarUltra7101();
                    int i3 = FrostHunterLightSensorForceFusion42412.FrostHunterServiceEliteCelestialThunder1757;
                    if (i3 > FrostHunterTranslateAnimationCyberSolarUltra7101.FrostHunterServiceEliteCelestialThunder1757) {
                        return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(0, 0, 0, i3);
                    }
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 frostHunterOnAttachStateChangeListenerNovaXHeroHyper79952 = this.FrostHunterRemoteConfigSpeedSpeed8566;
                    if (frostHunterOnAttachStateChangeListenerNovaXHeroHyper79952 != null && !frostHunterOnAttachStateChangeListenerNovaXHeroHyper79952.equals(frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) && (i2 = this.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterServiceEliteCelestialThunder1757) > FrostHunterTranslateAnimationCyberSolarUltra7101.FrostHunterServiceEliteCelestialThunder1757) {
                        return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return FrostHunterServiceConnectionTurboPhoenixOmega6719();
                    }
                    if (i == 32) {
                        return FrostHunterKeyframeGammaGamma1197();
                    }
                    if (i == 64) {
                        return FrostHunterScaleAnimationStrikeSpark5059();
                    }
                    if (i == 128) {
                        FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                        FrostHunterHandlerThreadNovaXStrikeEclipse1740 FrostHunterCameraXPixelTurboCosmos9814 = frostHunterServiceInfoAuroraHyperNeo5624 != null ? frostHunterServiceInfoAuroraHyperNeo5624.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814() : FrostHunterCameraXPixelTurboCosmos9814();
                        if (FrostHunterCameraXPixelTurboCosmos9814 != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(i4 >= 28 ? FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761) : 0, i4 >= 28 ? FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761) : 0, i4 >= 28 ? FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761) : 0, i4 >= 28 ? FrostHunterLiveDataScopeForcePhoenix6923.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlphaAnimationNeoCosmos5761) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterTranslateAnimationCyberSolarUltra71012 = FrostHunterTranslateAnimationCyberSolarUltra7101();
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterFragmentBetaMegaVortex60252 = FrostHunterFragmentBetaMegaVortex6025();
                    return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(Math.max(FrostHunterTranslateAnimationCyberSolarUltra71012.FrostHunterAlphaAnimationNeoCosmos5761, FrostHunterFragmentBetaMegaVortex60252.FrostHunterAlphaAnimationNeoCosmos5761), 0, Math.max(FrostHunterTranslateAnimationCyberSolarUltra71012.FrostHunterBundlePulseFusionHero2475, FrostHunterFragmentBetaMegaVortex60252.FrostHunterBundlePulseFusionHero2475), Math.max(FrostHunterTranslateAnimationCyberSolarUltra71012.FrostHunterServiceEliteCelestialThunder1757, FrostHunterFragmentBetaMegaVortex60252.FrostHunterServiceEliteCelestialThunder1757));
                }
                if ((this.FrostHunterCameraXPixelTurboCosmos9814 & 2) == 0) {
                    FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterLightSensorForceFusion42413 = FrostHunterLightSensorForceFusion4241();
                    FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo56242 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
                    FrostHunterFragmentBetaMegaVortex6025 = frostHunterServiceInfoAuroraHyperNeo56242 != null ? frostHunterServiceInfoAuroraHyperNeo56242.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025() : null;
                    int i5 = FrostHunterLightSensorForceFusion42413.FrostHunterServiceEliteCelestialThunder1757;
                    if (FrostHunterFragmentBetaMegaVortex6025 != null) {
                        i5 = Math.min(i5, FrostHunterFragmentBetaMegaVortex6025.FrostHunterServiceEliteCelestialThunder1757);
                    }
                    return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLightSensorForceFusion42413.FrostHunterAlphaAnimationNeoCosmos5761, 0, FrostHunterLightSensorForceFusion42413.FrostHunterBundlePulseFusionHero2475, i5);
                }
            }
        } else {
            if (z) {
                return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(0, Math.max(FrostHunterTranslateAnimationCyberSolarUltra7101().FrostHunterConstraintSetCloneMasterUltraRogue2633, FrostHunterLightSensorForceFusion4241().FrostHunterConstraintSetCloneMasterUltraRogue2633), 0, 0);
            }
            if ((this.FrostHunterCameraXPixelTurboCosmos9814 & 4) == 0) {
                return FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterConstraintSetCloneMasterUltraRogue2633(0, FrostHunterLightSensorForceFusion4241().FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, 0);
            }
        }
        return frostHunterOnAttachStateChangeListenerNovaXHeroHyper7995;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterMotionSceneAuroraMega2271(FrostHunterPackageManagerNovaStrike8745 frostHunterPackageManagerNovaStrike8745) {
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterPackageManagerNovaStrike8745;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public List<Rect> FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        return FrostHunterViewPhantomNeo1634(this.FrostHunterServiceConnectionTurboPhoenixOmega6719, i);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterServiceEliteCelestialThunder1757(View view) {
        this.FrostHunterKeyframeGammaGamma1197 = view.getWidth();
        this.FrostHunterAlertDialogAuroraDelta3200 = view.getHeight();
        FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995 FrostHunterStateCelestialNovaPixel8414 = FrostHunterStateCelestialNovaPixel8414(view);
        if (FrostHunterStateCelestialNovaPixel8414 == null) {
            FrostHunterStateCelestialNovaPixel8414 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterLifecycleBlazeGammaElite2889;
        }
        FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterStateCelestialNovaPixel8414);
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public void FrostHunterServiceInfoHyperionSparkMax9966(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public boolean FrostHunterTextViewDragonStormMega4297() {
        return this.FrostHunterBundlePulseFusionHero2475.isRound();
    }

    @Override // android.content.Context.FrostHunterProfilerTurboMaxTurbo5507
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        FrostHunterGeocoderHyperTitanium5786 frostHunterGeocoderHyperTitanium5786 = (FrostHunterGeocoderHyperTitanium5786) obj;
        return Objects.equals(this.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterGeocoderHyperTitanium5786.FrostHunterRemoteConfigSpeedSpeed8566) && FrostHunterR8MasterNebulaSpark7247(this.FrostHunterCameraXPixelTurboCosmos9814, frostHunterGeocoderHyperTitanium5786.FrostHunterCameraXPixelTurboCosmos9814);
    }

    public FrostHunterGeocoderHyperTitanium5786(FrostHunterServiceInfoAuroraHyperNeo5624 frostHunterServiceInfoAuroraHyperNeo5624, FrostHunterGeocoderHyperTitanium5786 frostHunterGeocoderHyperTitanium5786) {
        this(frostHunterServiceInfoAuroraHyperNeo5624, new WindowInsets(frostHunterGeocoderHyperTitanium5786.FrostHunterBundlePulseFusionHero2475));
    }
}
