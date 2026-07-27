package android.content.Context;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterProximitySensorNeoMaster3330 {
    public static void FrostHunterAlertDialogAuroraDelta3200(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static final ColorSpace FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterJavaPhoenixNebula9385 frostHunterJavaPhoenixNebula9385) {
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterLifecycleBlazeGammaElite2889)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterLintTitanVortexQuantum9911)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterCameraXTurboCelestialHero5430)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterScaleAnimationStrikeSpark5059)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterAlertDialogAuroraDelta3200)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterFlowMaxDragonHero5809)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterTextViewDragonStormMega4297)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterResourcesTitanHyperVision5823)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterKeyframeGammaGamma1197)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterFragmentBetaMegaVortex6025)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterRemoteConfigSpeedSpeed8566)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterCameraXPixelTurboCosmos9814)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterLevelListDrawableFusionDragonHero2232)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterServiceConnectionTurboPhoenixOmega6719)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterLightSensorForceFusion4241)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterMotionSceneAuroraMega2271)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace2 = ColorSpace.get(named2);
                } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(frostHunterJavaPhoenixNebula9385, FrostHunterFocusMeteringActionOlympianSpeedTitan3727.FrostHunterBitmapTurboDeltaNebula8743)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace2 = ColorSpace.get(named);
                } else {
                    colorSpace2 = null;
                }
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (frostHunterJavaPhoenixNebula9385 instanceof FrostHunterPlaceholderQuantumVortex5765) {
                String str = frostHunterJavaPhoenixNebula9385.FrostHunterAlphaAnimationNeoCosmos5761;
                FrostHunterPlaceholderQuantumVortex5765 frostHunterPlaceholderQuantumVortex5765 = (FrostHunterPlaceholderQuantumVortex5765) frostHunterJavaPhoenixNebula9385;
                float[] FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterPlaceholderQuantumVortex5765.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761();
                FrostHunterContentResolverCosmosTurbo7899 frostHunterContentResolverCosmosTurbo7899 = frostHunterPlaceholderQuantumVortex5765.FrostHunterRemoteConfigSpeedSpeed8566;
                ColorSpace.Rgb.TransferParameters transferParameters = frostHunterContentResolverCosmosTurbo7899 != null ? new ColorSpace.Rgb.TransferParameters(frostHunterContentResolverCosmosTurbo7899.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterContentResolverCosmosTurbo7899.FrostHunterBundlePulseFusionHero2475, frostHunterContentResolverCosmosTurbo7899.FrostHunterServiceEliteCelestialThunder1757, frostHunterContentResolverCosmosTurbo7899.FrostHunterLifecycleBlazeGammaElite2889, frostHunterContentResolverCosmosTurbo7899.FrostHunterLevelListDrawableFusionDragonHero2232, frostHunterContentResolverCosmosTurbo7899.FrostHunterRemoteConfigSpeedSpeed8566, frostHunterContentResolverCosmosTurbo7899.FrostHunterAlphaAnimationNeoCosmos5761) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, frostHunterPlaceholderQuantumVortex5765.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterAlphaAnimationNeoCosmos5761, transferParameters);
                }
                float[] fArr = frostHunterPlaceholderQuantumVortex5765.FrostHunterCameraXPixelTurboCosmos9814;
                final FrostHunterNotificationSparkBetaDelta5681 frostHunterNotificationSparkBetaDelta5681 = frostHunterPlaceholderQuantumVortex5765.FrostHunterFragmentBetaMegaVortex6025;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: android.content.Context.FrostHunterClipDrawableAlphaEpicTurbo7009
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i2 = i;
                        FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 = frostHunterNotificationSparkBetaDelta5681;
                        switch (i2) {
                        }
                        return ((Number) frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(Double.valueOf(d))).doubleValue();
                    }
                };
                final FrostHunterNotificationSparkBetaDelta5681 frostHunterNotificationSparkBetaDelta56812 = frostHunterPlaceholderQuantumVortex5765.FrostHunterScaleAnimationStrikeSpark5059;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, FrostHunterAlphaAnimationNeoCosmos5761, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: android.content.Context.FrostHunterClipDrawableAlphaEpicTurbo7009
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        int i22 = i2;
                        FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473 = frostHunterNotificationSparkBetaDelta56812;
                        switch (i22) {
                        }
                        return ((Number) frostHunterCombineLegendMegaPrime5473.FrostHunterAlphaAnimationNeoCosmos5761(Double.valueOf(d))).doubleValue();
                    }
                }, frostHunterPlaceholderQuantumVortex5765.FrostHunterLifecycleBlazeGammaElite2889, frostHunterPlaceholderQuantumVortex5765.FrostHunterLevelListDrawableFusionDragonHero2232);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static Icon FrostHunterBundlePulseFusionHero2475(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float FrostHunterCameraXPixelTurboCosmos9814(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static Notification.Builder FrostHunterConstraintSetCloneMasterUltraRogue2633(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static boolean FrostHunterFlowMaxDragonHero5809(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void FrostHunterFragmentBetaMegaVortex6025(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void FrostHunterKeyframeGammaGamma1197(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static float FrostHunterLevelListDrawableFusionDragonHero2232(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float FrostHunterLifecycleBlazeGammaElite2889(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void FrostHunterLightSensorForceFusion4241(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static float FrostHunterRemoteConfigSpeedSpeed8566(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void FrostHunterServiceConnectionTurboPhoenixOmega6719(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static AutofillId FrostHunterServiceEliteCelestialThunder1757(View view) {
        return view.getAutofillId();
    }
}
