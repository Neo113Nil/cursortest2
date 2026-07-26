package android.content.Context;

import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimationHeroPixelHyperion9843 {
    public static final FrostHunterAnimationHeroPixelHyperion9843 FrostHunterCameraXPixelTurboCosmos9814 = new FrostHunterAnimationHeroPixelHyperion9843(1, 2, 3, null, -1, -1);
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final int FrostHunterLifecycleBlazeGammaElite2889;
    public int FrostHunterRemoteConfigSpeedSpeed8566;
    public final byte[] FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterKeyEventNovaXAlpha1220.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(0, 1, 2, 3, 4);
        FrostHunterGyroscopeHeroAlpha1995.FrostHunterBitmapTurboDeltaNebula8743(5);
    }

    public FrostHunterAnimationHeroPixelHyperion9843(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = i3;
        this.FrostHunterServiceEliteCelestialThunder1757 = bArr;
        this.FrostHunterLifecycleBlazeGammaElite2889 = i4;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i5;
    }

    public static String FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        return i != -1 ? i != 1 ? i != 2 ? FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String FrostHunterBundlePulseFusionHero2475(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? FrostHunterKeyEventNovaXAlpha1220.FrostHunterCameraXPixelTurboCosmos9814("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static int FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static boolean FrostHunterLifecycleBlazeGammaElite2889(FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843) {
        if (frostHunterAnimationHeroPixelHyperion9843 == null) {
            return true;
        }
        int i = frostHunterAnimationHeroPixelHyperion9843.FrostHunterAlphaAnimationNeoCosmos5761;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = frostHunterAnimationHeroPixelHyperion9843.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475;
        if ((i3 != -1 && i3 != 3) || frostHunterAnimationHeroPixelHyperion9843.FrostHunterServiceEliteCelestialThunder1757 != null) {
            return false;
        }
        int i4 = frostHunterAnimationHeroPixelHyperion9843.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = frostHunterAnimationHeroPixelHyperion9843.FrostHunterLifecycleBlazeGammaElite2889;
        return i5 == -1 || i5 == 8;
    }

    public static int FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean FrostHunterServiceEliteCelestialThunder1757() {
        return (this.FrostHunterAlphaAnimationNeoCosmos5761 == -1 || this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == -1 || this.FrostHunterBundlePulseFusionHero2475 == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterAnimationHeroPixelHyperion9843.class == obj.getClass()) {
            FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843 = (FrostHunterAnimationHeroPixelHyperion9843) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterAnimationHeroPixelHyperion9843.FrostHunterAlphaAnimationNeoCosmos5761 && this.FrostHunterConstraintSetCloneMasterUltraRogue2633 == frostHunterAnimationHeroPixelHyperion9843.FrostHunterConstraintSetCloneMasterUltraRogue2633 && this.FrostHunterBundlePulseFusionHero2475 == frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475 && Arrays.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterAnimationHeroPixelHyperion9843.FrostHunterServiceEliteCelestialThunder1757) && this.FrostHunterLifecycleBlazeGammaElite2889 == frostHunterAnimationHeroPixelHyperion9843.FrostHunterLifecycleBlazeGammaElite2889 && this.FrostHunterLevelListDrawableFusionDragonHero2232 == frostHunterAnimationHeroPixelHyperion9843.FrostHunterLevelListDrawableFusionDragonHero2232) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FrostHunterRemoteConfigSpeedSpeed8566 == 0) {
            this.FrostHunterRemoteConfigSpeedSpeed8566 = ((((Arrays.hashCode(this.FrostHunterServiceEliteCelestialThunder1757) + ((((((527 + this.FrostHunterAlphaAnimationNeoCosmos5761) * 31) + this.FrostHunterConstraintSetCloneMasterUltraRogue2633) * 31) + this.FrostHunterBundlePulseFusionHero2475) * 31)) * 31) + this.FrostHunterLifecycleBlazeGammaElite2889) * 31) + this.FrostHunterLevelListDrawableFusionDragonHero2232;
        }
        return this.FrostHunterRemoteConfigSpeedSpeed8566;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(FrostHunterConstraintSetCloneMasterUltraRogue2633(this.FrostHunterAlphaAnimationNeoCosmos5761));
        sb.append(", ");
        sb.append(FrostHunterAlphaAnimationNeoCosmos5761(this.FrostHunterConstraintSetCloneMasterUltraRogue2633));
        sb.append(", ");
        sb.append(FrostHunterBundlePulseFusionHero2475(this.FrostHunterBundlePulseFusionHero2475));
        sb.append(", ");
        sb.append(this.FrostHunterServiceEliteCelestialThunder1757 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.FrostHunterLifecycleBlazeGammaElite2889;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, str2, ")");
    }
}
