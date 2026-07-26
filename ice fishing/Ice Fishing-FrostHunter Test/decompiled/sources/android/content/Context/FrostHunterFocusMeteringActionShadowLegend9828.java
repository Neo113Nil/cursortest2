package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterFocusMeteringActionShadowLegend9828 extends FrostHunterNotificationManagerMaxDeltaPulse8026 {
    public static boolean FrostHunterCameraXTurboCelestialHero5430(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : FrostHunterScaleAnimationStrikeSpark5059(0, 0, str2.length(), str, str2, z);
    }

    public static String FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        int FrostHunterMotionSceneAuroraMega2271 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterMotionSceneAuroraMega2271(str, str2, 0, false);
        if (FrostHunterMotionSceneAuroraMega2271 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, FrostHunterMotionSceneAuroraMega2271);
            sb.append(str3);
            i2 = FrostHunterMotionSceneAuroraMega2271 + length;
            if (FrostHunterMotionSceneAuroraMega2271 >= str.length()) {
                break;
            }
            FrostHunterMotionSceneAuroraMega2271 = FrostHunterOnTouchListenerCelestialTitanNova9943.FrostHunterMotionSceneAuroraMega2271(str, str2, FrostHunterMotionSceneAuroraMega2271 + i, false);
        } while (FrostHunterMotionSceneAuroraMega2271 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean FrostHunterLightSensorForceFusion4241(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean FrostHunterLintTitanVortexQuantum9911(int i, String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : FrostHunterScaleAnimationStrikeSpark5059(i, 0, str2.length(), str, str2, z);
    }

    public static Integer FrostHunterResourcesTitanHyperVision5823(String str) {
        boolean z;
        int i;
        int i2;
        FrostHunterVectorDrawableForceMax1351.FrostHunterFragmentBetaMegaVortex6025(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLooperThreadBetaHyperionMax1000(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static boolean FrostHunterScaleAnimationStrikeSpark5059(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }
}
