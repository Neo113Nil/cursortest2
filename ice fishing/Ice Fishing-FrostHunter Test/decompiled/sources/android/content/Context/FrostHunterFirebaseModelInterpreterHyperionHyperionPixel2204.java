package android.content.Context;

import android.graphics.Color;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204 {
    public final int FrostHunterAlertDialogAuroraDelta3200;
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final Integer FrostHunterBundlePulseFusionHero2475;
    public final boolean FrostHunterCameraXPixelTurboCosmos9814;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final boolean FrostHunterFlowMaxDragonHero5809;
    public final boolean FrostHunterLevelListDrawableFusionDragonHero2232;
    public final float FrostHunterLifecycleBlazeGammaElite2889;
    public final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public final Integer FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterFirebaseModelInterpreterHyperionHyperionPixel2204(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i;
        this.FrostHunterBundlePulseFusionHero2475 = num;
        this.FrostHunterServiceEliteCelestialThunder1757 = num2;
        this.FrostHunterLifecycleBlazeGammaElite2889 = f;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = z;
        this.FrostHunterRemoteConfigSpeedSpeed8566 = z2;
        this.FrostHunterCameraXPixelTurboCosmos9814 = z3;
        this.FrostHunterFlowMaxDragonHero5809 = z4;
        this.FrostHunterAlertDialogAuroraDelta3200 = i2;
    }

    public static int FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                return parseInt;
            default:
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    public static Integer FrostHunterBundlePulseFusionHero2475(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(((parseLong >> 24) & 255) ^ 255), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823(parseLong & 255), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823((parseLong >> 8) & 255), FrostHunterRemoteConfigPhantomDelta1739.FrostHunterResourcesTitanHyperVision5823((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
