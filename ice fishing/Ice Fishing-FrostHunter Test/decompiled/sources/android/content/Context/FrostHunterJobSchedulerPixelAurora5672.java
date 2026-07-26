package android.content.Context;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterJobSchedulerPixelAurora5672 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public int FrostHunterLifecycleBlazeGammaElite2889;
    public final FrostHunterFirebaseOlympianMax4818[] FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(0);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(1);
    }

    public FrostHunterJobSchedulerPixelAurora5672(String str, FrostHunterFirebaseOlympianMax4818... frostHunterFirebaseOlympianMax4818Arr) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(frostHunterFirebaseOlympianMax4818Arr.length > 0);
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterServiceEliteCelestialThunder1757 = frostHunterFirebaseOlympianMax4818Arr;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterFirebaseOlympianMax4818Arr.length;
        String str2 = frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterScaleAnimationStrikeSpark5059;
        this.FrostHunterBundlePulseFusionHero2475 = TextUtils.isEmpty(str2) ? FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterLightSensorForceFusion4241) : FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterLevelListDrawableFusionDragonHero2232(str2);
        String str3 = frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterServiceEliteCelestialThunder1757;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterLevelListDrawableFusionDragonHero2232 | 16384;
        for (int i2 = 1; i2 < frostHunterFirebaseOlympianMax4818Arr.length; i2++) {
            String str4 = frostHunterFirebaseOlympianMax4818Arr[i2].FrostHunterServiceEliteCelestialThunder1757;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                FrostHunterAlphaAnimationNeoCosmos5761("languages", frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterServiceEliteCelestialThunder1757, frostHunterFirebaseOlympianMax4818Arr[i2].FrostHunterServiceEliteCelestialThunder1757, i2);
                return;
            } else {
                if (i != (frostHunterFirebaseOlympianMax4818Arr[i2].FrostHunterLevelListDrawableFusionDragonHero2232 | 16384)) {
                    FrostHunterAlphaAnimationNeoCosmos5761("role flags", Integer.toBinaryString(frostHunterFirebaseOlympianMax4818Arr[0].FrostHunterLevelListDrawableFusionDragonHero2232), Integer.toBinaryString(frostHunterFirebaseOlympianMax4818Arr[i2].FrostHunterLevelListDrawableFusionDragonHero2232), i2);
                    return;
                }
            }
        }
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(String str, String str2, String str3, int i) {
        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterDatabaseEliteShadowUltra2452("", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterJobSchedulerPixelAurora5672.class == obj.getClass()) {
            FrostHunterJobSchedulerPixelAurora5672 frostHunterJobSchedulerPixelAurora5672 = (FrostHunterJobSchedulerPixelAurora5672) obj;
            if (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.equals(frostHunterJobSchedulerPixelAurora5672.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Arrays.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterJobSchedulerPixelAurora5672.FrostHunterServiceEliteCelestialThunder1757)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FrostHunterLifecycleBlazeGammaElite2889 == 0) {
            this.FrostHunterLifecycleBlazeGammaElite2889 = Arrays.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + FrostHunterKeyEventNovaXAlpha1220.FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, 527, 31);
        }
        return this.FrostHunterLifecycleBlazeGammaElite2889;
    }

    public final String toString() {
        return this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + ": " + Arrays.toString(this.FrostHunterServiceEliteCelestialThunder1757);
    }
}
