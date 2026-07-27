package android.content.Context;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterTraceVisionNova3975 {
    public static final byte[] FrostHunterAlphaAnimationNeoCosmos5761 = {0, 0, 0, 1};
    public static final String[] FrostHunterConstraintSetCloneMasterUltraRogue2633 = {"", "A", "B", "C"};
    public static final Pattern FrostHunterBundlePulseFusionHero2475 = Pattern.compile("^\\D?(\\d+)$");

    public static String FrostHunterAlphaAnimationNeoCosmos5761(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {FrostHunterConstraintSetCloneMasterUltraRogue2633[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0165, code lost:
    
        if (r11.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair FrostHunterBundlePulseFusionHero2475(String str, String[] strArr, FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        Matcher matcher = FrostHunterBundlePulseFusionHero2475.matcher(strArr[1]);
        if (!matcher.matches()) {
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed HEVC codec string: ", str);
            return null;
        }
        String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (frostHunterAnimationHeroPixelHyperion9843 == null || frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475 != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Unknown HEVC profile string: ", group);
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    num = 1;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    num = 4;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    num = 16;
                    break;
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = 8388608;
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = 1024;
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = 262144;
                    break;
                case 23:
                    num = 1048576;
                    break;
                case 24:
                    num = 4194304;
                    break;
                case 25:
                    num = 16777216;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Unknown HEVC level string: ", str2);
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0616 A[Catch: NumberFormatException -> 0x0621, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0621, blocks: (B:345:0x05c5, B:347:0x05d9, B:358:0x05f7, B:361:0x0616), top: B:344:0x05c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x095d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterFirebaseOlympianMax4818 frostHunterFirebaseOlympianMax4818) {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int parseInt;
        int parseInt2;
        int i6;
        int i7;
        char c2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c3;
        char c4;
        Integer num;
        char c5;
        Integer num2 = 1024;
        String str = frostHunterFirebaseOlympianMax4818.FrostHunterKeyframeGammaGamma1197;
        FrostHunterAnimationHeroPixelHyperion9843 frostHunterAnimationHeroPixelHyperion9843 = frostHunterFirebaseOlympianMax4818.FrostHunterViewPhantomNeo1634;
        if (str != null) {
            String[] split = str.split("\\.");
            if (!"video/dolby-vision".equals(frostHunterFirebaseOlympianMax4818.FrostHunterScaleAnimationStrikeSpark5059)) {
                String str2 = split[0];
                str2.getClass();
                switch (str2.hashCode()) {
                    case 2986313:
                        if (str2.equals("ac-4")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3001066:
                        if (str2.equals("apv1")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3004662:
                        if (str2.equals("av01")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3224753:
                        if (str2.equals("iamf")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3475740:
                        if (str2.equals("s263")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3631854:
                        if (str2.equals("vvc1")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3632040:
                        if (str2.equals("vvi1")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i14 = 8192;
                switch (c) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (split.length != 4) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AC-4 codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                if (parseInt4 == 0) {
                                    i = 257;
                                }
                                i = -1;
                            } else if (parseInt3 != 1) {
                                if (parseInt3 == 2) {
                                    if (parseInt4 == 1) {
                                        i = 1026;
                                    } else if (parseInt4 == 2) {
                                        i = 1028;
                                    }
                                }
                                i = -1;
                            } else if (parseInt4 == 0) {
                                i = 513;
                            } else {
                                if (parseInt4 == 1) {
                                    i = 514;
                                }
                                i = -1;
                            }
                            if (i == -1) {
                                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                return null;
                            }
                            if (parseInt5 == 0) {
                                i2 = 1;
                            } else if (parseInt5 == 1) {
                                i2 = 2;
                            } else if (parseInt5 == 2) {
                                i2 = 4;
                            } else if (parseInt5 == 3) {
                                i2 = 8;
                            } else {
                                if (parseInt5 != 4) {
                                    i3 = -1;
                                    i2 = -1;
                                    if (i2 == i3) {
                                        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                                    }
                                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AC-4 level: ", parseInt5);
                                    return null;
                                }
                                i2 = 16;
                            }
                            i3 = -1;
                            if (i2 == i3) {
                            }
                        } catch (NumberFormatException unused) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AC-4 codec string: ", str);
                            return null;
                        }
                    case 1:
                        if (split.length < 4) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed APV codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt6 = Integer.parseInt(split[1].substring(4));
                            int parseInt7 = Integer.parseInt(split[2].substring(4));
                            int parseInt8 = Integer.parseInt(split[3].substring(4));
                            if (parseInt6 == 33) {
                                i14 = 1;
                            } else if (parseInt6 != 44) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Ignoring invalid APV profile: ", parseInt6);
                                return null;
                            }
                            int i15 = (parseInt7 / 30) * 2;
                            if (parseInt7 % 30 == 0) {
                                i15--;
                            }
                            return new Pair(Integer.valueOf(i14), Integer.valueOf((256 << (i15 - 1)) | (1 << parseInt8)));
                        } catch (NumberFormatException e) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Ignoring malformed APV codec string: " + str, e);
                            return null;
                        }
                    case 2:
                        if (split.length < 4) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AV1 codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt9 = Integer.parseInt(split[1]);
                            int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt11 = Integer.parseInt(split[3]);
                            if (parseInt9 != 0) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AV1 profile: ", parseInt9);
                                return null;
                            }
                            int i16 = 8;
                            if (parseInt11 != 8 && parseInt11 != 10) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AV1 bit depth: ", parseInt11);
                                return null;
                            }
                            int i17 = parseInt11 == 8 ? 1 : (frostHunterAnimationHeroPixelHyperion9843 == null || !(frostHunterAnimationHeroPixelHyperion9843.FrostHunterServiceEliteCelestialThunder1757 != null || (i4 = frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475) == 7 || i4 == 6)) ? 2 : 4096;
                            switch (parseInt10) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    i16 = 1;
                                    break;
                                case 1:
                                    i16 = 2;
                                    break;
                                case 2:
                                    i16 = 4;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i16 = 16;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                    i16 = 32;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i16 = 64;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i16 = 128;
                                    break;
                                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                    i16 = 256;
                                    break;
                                case 9:
                                    i16 = 512;
                                    break;
                                case 10:
                                    i16 = 1024;
                                    break;
                                case 11:
                                    i16 = 2048;
                                    break;
                                case 12:
                                    i16 = 4096;
                                    break;
                                case 13:
                                    i16 = 8192;
                                    break;
                                case 14:
                                    i16 = 16384;
                                    break;
                                case 15:
                                    i16 = 32768;
                                    break;
                                case 16:
                                    i16 = 65536;
                                    break;
                                case 17:
                                    i16 = 131072;
                                    break;
                                case 18:
                                    i16 = 262144;
                                    break;
                                case 19:
                                    i16 = 524288;
                                    break;
                                case 20:
                                    i16 = 1048576;
                                    break;
                                case 21:
                                    i16 = 2097152;
                                    break;
                                case 22:
                                    i16 = 4194304;
                                    break;
                                case 23:
                                    i16 = 8388608;
                                    break;
                                default:
                                    i16 = -1;
                                    break;
                            }
                            if (i16 != -1) {
                                return new Pair(Integer.valueOf(i17), Integer.valueOf(i16));
                            }
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AV1 level: ", parseInt10);
                            return null;
                        } catch (NumberFormatException unused2) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AV1 codec string: ", str);
                            return null;
                        }
                    case 3:
                    case 4:
                        if (split.length < 2) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AVC codec string: ", str);
                            return null;
                        }
                        try {
                            if (split[1].length() == 6) {
                                i5 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                i5 = 16;
                                if (split.length < 3) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring malformed AVC codec string: " + str);
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i6 = -1;
                                i7 = 1;
                            } else if (parseInt == 77) {
                                i6 = -1;
                                i7 = 2;
                            } else if (parseInt == 88) {
                                i6 = -1;
                                i7 = 4;
                            } else if (parseInt == 100) {
                                i6 = -1;
                                i7 = 8;
                            } else if (parseInt == 110) {
                                i7 = i5;
                                i6 = -1;
                            } else if (parseInt == 122) {
                                i6 = -1;
                                i7 = 32;
                            } else if (parseInt != 244) {
                                i6 = -1;
                                i7 = -1;
                            } else {
                                i6 = -1;
                                i7 = 64;
                            }
                            if (i7 == i6) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AVC profile: ", parseInt);
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i5 = 1;
                                    break;
                                case 11:
                                    i5 = 4;
                                    break;
                                case 12:
                                    i5 = 8;
                                    break;
                                case 13:
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i5 = 32;
                                            break;
                                        case 21:
                                            i5 = 64;
                                            break;
                                        case 22:
                                            i5 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i5 = 256;
                                                    break;
                                                case 31:
                                                    i5 = 512;
                                                    break;
                                                case 32:
                                                    i5 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i5 = 2048;
                                                            break;
                                                        case 41:
                                                            i5 = 4096;
                                                            break;
                                                        case 42:
                                                            i5 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i5 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i5 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i5 = 65536;
                                                                    break;
                                                                default:
                                                                    i5 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i5 != -1) {
                                return new Pair(Integer.valueOf(i7), Integer.valueOf(i5));
                            }
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown AVC level: ", parseInt2);
                            return null;
                        } catch (NumberFormatException unused3) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed AVC codec string: ", str);
                            return null;
                        }
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                        return FrostHunterBundlePulseFusionHero2475(str, split, frostHunterAnimationHeroPixelHyperion9843);
                    case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (split.length < 4) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed IAMF codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str3 = split[3];
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case 2464863:
                                    if (str3.equals("Opus")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3114792:
                                    if (str3.equals("fLaC")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3238865:
                                    if (str3.equals("ipcm")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3356560:
                                    if (str3.equals("mp4a")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    i8 = 1;
                                    break;
                                case 1:
                                    i8 = 4;
                                    break;
                                case 2:
                                    i8 = 8;
                                    break;
                                case 3:
                                    i8 = 2;
                                    break;
                                default:
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    return null;
                            }
                            return new Pair(Integer.valueOf(parseInt12 | 16777216 | i8), 0);
                        } catch (NumberFormatException e2) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorDrawableLegendPhoenixVision7927("Ignoring malformed primary profile in IAMF codec string: " + split[1], e2);
                            return null;
                        }
                    case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                        if (split.length != 3) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed MP4A codec string: ", str);
                            return null;
                        }
                        try {
                            if ("audio/mp4a-latm".equals(FrostHunterOrientationSensorDeltaSolarMaster8286.FrostHunterBundlePulseFusionHero2475(Integer.parseInt(split[1], 16)))) {
                                int parseInt13 = Integer.parseInt(split[2]);
                                int i18 = 17;
                                if (parseInt13 != 17) {
                                    if (parseInt13 != 20) {
                                        i18 = 23;
                                        if (parseInt13 != 23) {
                                            i18 = 29;
                                            if (parseInt13 != 29) {
                                                i18 = 39;
                                                if (parseInt13 != 39) {
                                                    i18 = 42;
                                                    if (parseInt13 != 42) {
                                                        switch (parseInt13) {
                                                            case 1:
                                                                i10 = -1;
                                                                i9 = 1;
                                                                break;
                                                            case 2:
                                                                i10 = -1;
                                                                i9 = 2;
                                                                break;
                                                            case 3:
                                                                i10 = -1;
                                                                i9 = 3;
                                                                break;
                                                            case 4:
                                                                i10 = -1;
                                                                i9 = 4;
                                                                break;
                                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                                                i9 = 5;
                                                                break;
                                                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                                                i10 = -1;
                                                                i9 = 6;
                                                                break;
                                                            default:
                                                                i10 = -1;
                                                                i9 = -1;
                                                                break;
                                                        }
                                                        if (i9 != i10) {
                                                            return new Pair(Integer.valueOf(i9), 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i9 = 20;
                                    }
                                    i10 = -1;
                                    if (i9 != i10) {
                                    }
                                }
                                i9 = i18;
                                i10 = -1;
                                if (i9 != i10) {
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed MP4A codec string: ", str);
                            return null;
                        }
                        break;
                    case '\t':
                        Pair pair = new Pair(1, 1);
                        if (split.length < 3) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed H263 codec string: ", str);
                            return pair;
                        }
                        try {
                            return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                        } catch (NumberFormatException unused5) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed H263 codec string: ", str);
                            return pair;
                        }
                    case '\n':
                        if (split.length < 3) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed VP9 codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt14 = Integer.parseInt(split[1]);
                            int parseInt15 = Integer.parseInt(split[2]);
                            int i19 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i19 == -1) {
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown VP9 profile: ", parseInt14);
                                return null;
                            }
                            if (parseInt15 == 10) {
                                i11 = -1;
                                i12 = 1;
                            } else if (parseInt15 == 11) {
                                i11 = -1;
                                i12 = 2;
                            } else if (parseInt15 == 20) {
                                i11 = -1;
                                i12 = 4;
                            } else if (parseInt15 == 21) {
                                i11 = -1;
                                i12 = 8;
                            } else if (parseInt15 == 30) {
                                i11 = -1;
                                i12 = 16;
                            } else if (parseInt15 == 31) {
                                i11 = -1;
                                i12 = 32;
                            } else if (parseInt15 == 40) {
                                i11 = -1;
                                i12 = 64;
                            } else if (parseInt15 != 41) {
                                if (parseInt15 == 50) {
                                    i12 = 256;
                                } else if (parseInt15 != 51) {
                                    switch (parseInt15) {
                                        case 60:
                                            i11 = -1;
                                            i12 = 2048;
                                            break;
                                        case 61:
                                            i11 = -1;
                                            i12 = 4096;
                                            break;
                                        case 62:
                                            i12 = 8192;
                                            break;
                                        default:
                                            i11 = -1;
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i11 = -1;
                                    i12 = 512;
                                }
                                i11 = -1;
                            } else {
                                i11 = -1;
                                i12 = 128;
                            }
                            if (i12 != i11) {
                                return new Pair(Integer.valueOf(i19), Integer.valueOf(i12));
                            }
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterMotionSceneAuroraMega2271("Unknown VP9 level: ", parseInt15);
                            return null;
                        } catch (NumberFormatException unused6) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed VP9 codec string: ", str);
                            return null;
                        }
                    case 11:
                    case '\f':
                        if (split.length < 3) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed VVC codec string: ", str);
                            return null;
                        }
                        try {
                            int parseInt16 = Integer.parseInt(split[1]);
                            if (parseInt16 == 1) {
                                i13 = (frostHunterAnimationHeroPixelHyperion9843 == null || frostHunterAnimationHeroPixelHyperion9843.FrostHunterBundlePulseFusionHero2475 != 6) ? (frostHunterAnimationHeroPixelHyperion9843 == null || frostHunterAnimationHeroPixelHyperion9843.FrostHunterLifecycleBlazeGammaElite2889 != 8) ? 2 : 1 : 4096;
                            } else {
                                if (parseInt16 != 65) {
                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Unknown VVC profile IDC: " + split[1]);
                                    return null;
                                }
                                i13 = 4;
                            }
                            String str4 = split[2];
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case 70918:
                                        if (str4.equals("H64")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70921:
                                        if (str4.equals("H67")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70976:
                                        if (str4.equals("H80")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70979:
                                        if (str4.equals("H83")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70982:
                                        if (str4.equals("H86")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 71013:
                                        if (str4.equals("H96")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74609:
                                        if (str4.equals("L16")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74667:
                                        if (str4.equals("L32")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74670:
                                        if (str4.equals("L35")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74704:
                                        if (str4.equals("L48")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74728:
                                        if (str4.equals("L51")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74762:
                                        if (str4.equals("L64")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74765:
                                        if (str4.equals("L67")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74820:
                                        if (str4.equals("L80")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74823:
                                        if (str4.equals("L83")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74826:
                                        if (str4.equals("L86")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74857:
                                        if (str4.equals("L96")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193610:
                                        if (str4.equals("H112")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193647:
                                        if (str4.equals("H128")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193705:
                                        if (str4.equals("H144")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312774:
                                        if (str4.equals("L112")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312811:
                                        if (str4.equals("L128")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312869:
                                        if (str4.equals("L144")) {
                                            c3 = 22;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        num2 = 64;
                                        break;
                                    case 1:
                                        num2 = 256;
                                        break;
                                    case 3:
                                        num2 = 4096;
                                        break;
                                    case 4:
                                        num2 = 16384;
                                        break;
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                        num2 = 65536;
                                        break;
                                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                        num2 = 1;
                                        break;
                                    case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                        num2 = 2;
                                        break;
                                    case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                        num2 = 4;
                                        break;
                                    case '\t':
                                        num2 = 8;
                                        break;
                                    case '\n':
                                        num2 = 16;
                                        break;
                                    case 11:
                                        num2 = 32;
                                        break;
                                    case '\f':
                                        num2 = 128;
                                        break;
                                    case '\r':
                                        num2 = 512;
                                        break;
                                    case 14:
                                        num2 = 2048;
                                        break;
                                    case 15:
                                        num2 = 8192;
                                        break;
                                    case 16:
                                        num2 = 32768;
                                        break;
                                    case 17:
                                        num2 = 262144;
                                        break;
                                    case 18:
                                        num2 = 1048576;
                                        break;
                                    case 19:
                                        num2 = 4194304;
                                        break;
                                    case 20:
                                        num2 = 131072;
                                        break;
                                    case 21:
                                        num2 = 524288;
                                        break;
                                    case 22:
                                        num2 = 2097152;
                                        break;
                                }
                                if (num2 == null) {
                                    return new Pair(Integer.valueOf(i13), num2);
                                }
                                FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Unknown VVC level string: ", str4);
                                return null;
                            }
                            num2 = null;
                            if (num2 == null) {
                            }
                        } catch (NumberFormatException unused7) {
                            FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed VVC codec string: ", str);
                            return null;
                        }
                        break;
                }
            } else {
                if (split.length < 3) {
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed Dolby Vision codec string: ", str);
                    return null;
                }
                Matcher matcher = FrostHunterBundlePulseFusionHero2475.matcher(split[1]);
                if (!matcher.matches()) {
                    FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Ignoring malformed Dolby Vision codec string: ", str);
                    return null;
                }
                String group = matcher.group(1);
                if (group != null) {
                    switch (group.hashCode()) {
                        case 1536:
                            if (group.equals("00")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1537:
                            if (group.equals("01")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1538:
                            if (group.equals("02")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1539:
                            if (group.equals("03")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1540:
                            if (group.equals("04")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1541:
                            if (group.equals("05")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1542:
                            if (group.equals("06")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1543:
                            if (group.equals("07")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1544:
                            if (group.equals("08")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1545:
                            if (group.equals("09")) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1567:
                            if (group.equals("10")) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            num = 1;
                            break;
                        case 1:
                            num = 2;
                            break;
                        case 2:
                            num = 4;
                            break;
                        case 3:
                            num = 8;
                            break;
                        case 4:
                            num = 16;
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                            num = 32;
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                            num = 64;
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                            num = 128;
                            break;
                        case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                            num = 256;
                            break;
                        case '\t':
                            num = 512;
                            break;
                        case '\n':
                            num = num2;
                            break;
                    }
                    if (num != null) {
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Unknown Dolby Vision profile string: ", group);
                        return null;
                    }
                    String str5 = split[2];
                    if (str5 != null) {
                        switch (str5.hashCode()) {
                            case 1537:
                                if (str5.equals("01")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1538:
                                if (str5.equals("02")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1539:
                                if (str5.equals("03")) {
                                    c5 = 2;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1540:
                                if (str5.equals("04")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1541:
                                if (str5.equals("05")) {
                                    c5 = 4;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1542:
                                if (str5.equals("06")) {
                                    c5 = 5;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1543:
                                if (str5.equals("07")) {
                                    c5 = 6;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1544:
                                if (str5.equals("08")) {
                                    c5 = 7;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1545:
                                if (str5.equals("09")) {
                                    c5 = '\b';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1567:
                                if (str5.equals("10")) {
                                    c5 = '\t';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1568:
                                if (str5.equals("11")) {
                                    c5 = '\n';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1569:
                                if (str5.equals("12")) {
                                    c5 = 11;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case 1570:
                                if (str5.equals("13")) {
                                    c5 = '\f';
                                    break;
                                }
                                c5 = 65535;
                                break;
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                                num2 = 32;
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                                num2 = 64;
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                                num2 = 128;
                                break;
                            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                            case 11:
                                num2 = 2048;
                                break;
                            case '\f':
                                num2 = 4096;
                                break;
                        }
                        if (num2 == null) {
                            return new Pair(num, num2);
                        }
                        FrostHunterKeyEventNovaXAlpha1220.FrostHunterBitmapTurboDeltaNebula8743("Unknown Dolby Vision level string: ", str5);
                        return null;
                    }
                    num2 = null;
                    if (num2 == null) {
                    }
                }
                num = null;
                if (num != null) {
                }
            }
        }
        return null;
    }
}
