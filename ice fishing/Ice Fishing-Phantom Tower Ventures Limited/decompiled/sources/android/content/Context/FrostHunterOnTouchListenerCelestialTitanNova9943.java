package android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class FrostHunterOnTouchListenerCelestialTitanNova9943 extends FrostHunterFocusMeteringActionShadowLegend9828 {
    public static final List FrostHunterBillingClientFusionVortex9008(String str, String str2) {
        int FrostHunterMotionSceneAuroraMega2271 = FrostHunterMotionSceneAuroraMega2271(str, str2, 0, false);
        if (FrostHunterMotionSceneAuroraMega2271 == -1) {
            return FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(str.subSequence(i, FrostHunterMotionSceneAuroraMega2271).toString());
            i = str2.length() + FrostHunterMotionSceneAuroraMega2271;
            FrostHunterMotionSceneAuroraMega2271 = FrostHunterMotionSceneAuroraMega2271(str, str2, i, false);
        } while (FrostHunterMotionSceneAuroraMega2271 != -1);
        arrayList.add(str.subSequence(i, str.length()).toString());
        return arrayList;
    }

    public static final int FrostHunterBitmapTurboDeltaNebula8743(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        FrostHunterFlatMapPrimeTitan4777 frostHunterFlatMapPrimeTitan4777;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            frostHunterFlatMapPrimeTitan4777 = new FrostHunterFlatMapPrimeTitan4777(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            frostHunterFlatMapPrimeTitan4777 = new FrostHunterFirebaseModelInterpreterOlympianStorm9227(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = frostHunterFlatMapPrimeTitan4777.FrostHunterAlertDialogAuroraDelta3200;
        int i4 = frostHunterFlatMapPrimeTitan4777.FrostHunterFlowMaxDragonHero5809;
        int i5 = frostHunterFlatMapPrimeTitan4777.FrostHunterCameraXPixelTurboCosmos9814;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!FrostHunterViewPhantomNeo1634(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterScaleAnimationStrikeSpark5059(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static String FrostHunterCardViewSpectraCyber7714(String str) {
        CharSequence charSequence;
        if (8 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final List FrostHunterDatabaseEliteShadowUltra2452(String str) {
        FrostHunterCanvasSparkNebulaStrike6682 frostHunterCanvasSparkNebulaStrike6682 = new FrostHunterCanvasSparkNebulaStrike6682(str);
        if (!frostHunterCanvasSparkNebulaStrike6682.hasNext()) {
            return FrostHunterAssetManagerForceNebulaNebula4990.FrostHunterCameraXPixelTurboCosmos9814;
        }
        Object next = frostHunterCanvasSparkNebulaStrike6682.next();
        if (!frostHunterCanvasSparkNebulaStrike6682.hasNext()) {
            return FrostHunterCardViewHyperionAurora3829.FrostHunterR8MasterNebulaSpark7247(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (frostHunterCanvasSparkNebulaStrike6682.hasNext()) {
            arrayList.add(frostHunterCanvasSparkNebulaStrike6682.next());
        }
        return arrayList;
    }

    public static int FrostHunterDialogFragmentTurboPhoenixDragon7627(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? FrostHunterMeteringPointBetaCyber9571(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static int FrostHunterEditTextPulseHyperion1262(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    public static /* synthetic */ int FrostHunterLooperHyperionForce4133(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return FrostHunterMotionSceneAuroraMega2271(charSequence, str, i, false);
    }

    public static boolean FrostHunterLooperThreadBetaHyperionMax1000(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (FrostHunterLooperHyperionForce4133(charSequence, (String) charSequence2, 0, 2) >= 0) {
                return true;
            }
        } else if (FrostHunterBitmapTurboDeltaNebula8743(charSequence, charSequence2, 0, charSequence.length(), false, false) >= 0) {
            return true;
        }
        return false;
    }

    public static String FrostHunterMagnetometerFusionTitanium8202(String str, char c) {
        int FrostHunterEditTextPulseHyperion1262 = FrostHunterEditTextPulseHyperion1262(str, c, 0, 6);
        return FrostHunterEditTextPulseHyperion1262 == -1 ? str : str.substring(0, FrostHunterEditTextPulseHyperion1262);
    }

    public static List FrostHunterMediaPlayerCelestialBetaTitan3868(String str, char[] cArr) {
        if (cArr.length == 1) {
            return FrostHunterBillingClientFusionVortex9008(str, String.valueOf(cArr[0]));
        }
        FrostHunterStateFlowAlphaAurora6431 frostHunterStateFlowAlphaAurora6431 = new FrostHunterStateFlowAlphaAurora6431(new FrostHunterThemeOverlayNovaXMaster6614(str, new FrostHunterThemeOverlayNebulaDelta6405(14, cArr)));
        ArrayList arrayList = new ArrayList(FrostHunterGroupRogueDeltaMega4192.FrostHunterNestedScrollViewPixelPhantom8605(frostHunterStateFlowAlphaAurora6431));
        Iterator it = frostHunterStateFlowAlphaAurora6431.iterator();
        while (true) {
            FrostHunterNavigationSpeedHyperionSolar8806 frostHunterNavigationSpeedHyperionSolar8806 = (FrostHunterNavigationSpeedHyperionSolar8806) it;
            if (!frostHunterNavigationSpeedHyperionSolar8806.hasNext()) {
                return arrayList;
            }
            FrostHunterFirebaseModelInterpreterOlympianStorm9227 frostHunterFirebaseModelInterpreterOlympianStorm9227 = (FrostHunterFirebaseModelInterpreterOlympianStorm9227) frostHunterNavigationSpeedHyperionSolar8806.next();
            frostHunterFirebaseModelInterpreterOlympianStorm9227.getClass();
            arrayList.add(str.subSequence(frostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterCameraXPixelTurboCosmos9814, frostHunterFirebaseModelInterpreterOlympianStorm9227.FrostHunterFlowMaxDragonHero5809 + 1).toString());
        }
    }

    public static final int FrostHunterMeteringPointBetaCyber9571(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(FrostHunterContextSolarMegaPhantom7469.FrostHunterCoordinatorLayoutGammaTurboSpark2420(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (FrostHunterVectorDrawableForceMax1351.FrostHunterLightSensorForceFusion4241(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static String FrostHunterMeteringPointMegaCyber7955(String str, String str2) {
        return FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterCameraXTurboCelestialHero5430(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static final int FrostHunterMotionSceneAuroraMega2271(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? FrostHunterBitmapTurboDeltaNebula8743(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static String FrostHunterPagingDataTurboTitanium7332(String str, int i) {
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence FrostHunterR8MasterNebulaSpark7247(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean FrostHunterLooperHyperionForce4133 = FrostHunterVectorDrawableForceMax1351.FrostHunterLooperHyperionForce4133(str.charAt(!z ? i : length));
            if (z) {
                if (!FrostHunterLooperHyperionForce4133) {
                    break;
                }
                length--;
            } else if (FrostHunterLooperHyperionForce4133) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static boolean FrostHunterServiceInfoHyperionSparkMax9966(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!FrostHunterVectorDrawableForceMax1351.FrostHunterLooperHyperionForce4133(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String FrostHunterStateCelestialNovaPixel8414(String str, char c, String str2) {
        int FrostHunterEditTextPulseHyperion1262 = FrostHunterEditTextPulseHyperion1262(str, c, 0, 6);
        return FrostHunterEditTextPulseHyperion1262 == -1 ? str2 : str.substring(FrostHunterEditTextPulseHyperion1262 + 1, str.length());
    }

    public static boolean FrostHunterTextViewDragonStormMega4297(CharSequence charSequence, char c) {
        charSequence.getClass();
        return FrostHunterDialogFragmentTurboPhoenixDragon7627(charSequence, c, 0, 2) >= 0;
    }

    public static String FrostHunterTranslateAnimationCyberSolarUltra7101(String str, String str2) {
        int FrostHunterLooperHyperionForce4133 = FrostHunterLooperHyperionForce4133(str, str2, 0, 6);
        return FrostHunterLooperHyperionForce4133 == -1 ? str : str.substring(str2.length() + FrostHunterLooperHyperionForce4133, str.length());
    }

    public static final boolean FrostHunterViewPhantomNeo1634(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!FrostHunterVectorDrawableForceMax1351.FrostHunterLightSensorForceFusion4241(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
