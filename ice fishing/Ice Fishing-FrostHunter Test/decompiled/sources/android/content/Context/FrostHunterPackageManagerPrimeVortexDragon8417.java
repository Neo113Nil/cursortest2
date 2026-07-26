package android.content.Context;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPackageManagerPrimeVortexDragon8417 implements FrostHunterWithContextVisionPixelCosmos6861 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final int FrostHunterLevelListDrawableFusionDragonHero2232;
    public final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public final String FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterPackageManagerPrimeVortexDragon8417(int i, String str, String str2, String str3, boolean z, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(i2 == -1 || i2 > 0);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str;
        this.FrostHunterBundlePulseFusionHero2475 = str2;
        this.FrostHunterServiceEliteCelestialThunder1757 = str3;
        this.FrostHunterLifecycleBlazeGammaElite2889 = z;
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static FrostHunterPackageManagerPrimeVortexDragon8417 FrostHunterServiceEliteCelestialThunder1757(Map map) {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        List list6 = (List) map.get("icy-br");
        boolean z3 = true;
        int i3 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid bitrate: " + str4);
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Invalid bitrate header: ", str4);
                        z = false;
                        i = i2;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i4 = i3;
                        if (z) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
            i = i2;
        } else {
            z = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z2 = ((String) list4.get(0)).equals("1");
            z = true;
        } else {
            z2 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i3 = parseInt;
                } else {
                    try {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid metadata interval: " + str5);
                        z3 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = parseInt;
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Invalid metadata interval: ", str5);
                        int i42 = i3;
                        if (z) {
                        }
                    }
                }
                z = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i422 = i3;
        if (z) {
            return new FrostHunterPackageManagerPrimeVortexDragon8417(i, str, str2, str3, z2, i422);
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterWithContextVisionPixelCosmos6861
    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterAlphaAnimationSolarPrime2514 frostHunterAlphaAnimationSolarPrime2514) {
        String str = this.FrostHunterBundlePulseFusionHero2475;
        if (str != null) {
            frostHunterAlphaAnimationSolarPrime2514.FrostHunterDialogFragmentTurboPhoenixDragon7627 = str;
        }
        String str2 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (str2 != null) {
            frostHunterAlphaAnimationSolarPrime2514.FrostHunterBitmapTurboDeltaNebula8743 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FrostHunterPackageManagerPrimeVortexDragon8417.class == obj.getClass()) {
            FrostHunterPackageManagerPrimeVortexDragon8417 frostHunterPackageManagerPrimeVortexDragon8417 = (FrostHunterPackageManagerPrimeVortexDragon8417) obj;
            if (this.FrostHunterAlphaAnimationNeoCosmos5761 == frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterAlphaAnimationNeoCosmos5761 && Objects.equals(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterConstraintSetCloneMasterUltraRogue2633) && Objects.equals(this.FrostHunterBundlePulseFusionHero2475, frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterBundlePulseFusionHero2475) && Objects.equals(this.FrostHunterServiceEliteCelestialThunder1757, frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterServiceEliteCelestialThunder1757) && this.FrostHunterLifecycleBlazeGammaElite2889 == frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterLifecycleBlazeGammaElite2889 && this.FrostHunterLevelListDrawableFusionDragonHero2232 == frostHunterPackageManagerPrimeVortexDragon8417.FrostHunterLevelListDrawableFusionDragonHero2232) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.FrostHunterAlphaAnimationNeoCosmos5761) * 31;
        String str = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.FrostHunterBundlePulseFusionHero2475;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.FrostHunterServiceEliteCelestialThunder1757;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.FrostHunterLifecycleBlazeGammaElite2889 ? 1 : 0)) * 31) + this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.FrostHunterBundlePulseFusionHero2475 + "\", genre=\"" + this.FrostHunterConstraintSetCloneMasterUltraRogue2633 + "\", bitrate=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + ", metadataInterval=" + this.FrostHunterLevelListDrawableFusionDragonHero2232;
    }
}
