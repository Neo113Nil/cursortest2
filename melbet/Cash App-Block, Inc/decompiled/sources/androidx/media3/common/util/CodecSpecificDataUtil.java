package androidx.media3.common.util;

import android.util.Pair;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.plaid.internal.EnumC0170g;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public abstract class CodecSpecificDataUtil {
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS, "B", "C"};
    public static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    public static String buildHevcCodecString(int i, int i2, int i3, int[] iArr, boolean z, int i4) {
        Object[] objArr = {HEVC_GENERAL_PROFILE_SPACE_STRINGS[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : Matrix.MATRIX_TYPE_RANDOM_LT), Integer.valueOf(i4)};
        String str = Util.DEVICE_DEBUG_INFO;
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
    /* JADX WARN: Removed duplicated region for block: B:153:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0610 A[Catch: NumberFormatException -> 0x061a, TRY_LEAVE, TryCatch #8 {NumberFormatException -> 0x061a, blocks: (B:343:0x05c3, B:345:0x05d7, B:356:0x05f5, B:359:0x0610), top: B:342:0x05c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0945  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair getCodecProfileAndLevel(Format format2) {
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
        int i8;
        char c2;
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
        String str = format2.codecs;
        ColorInfo colorInfo = format2.colorInfo;
        String str2 = format2.codecs;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(format2.sampleMimeType)) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3001066:
                    if (str3.equals("apv1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3631854:
                    if (str3.equals("vvc1")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 3632040:
                    if (str3.equals("vvi1")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i14 = PKIFailureInfo.certRevoked;
            switch (c) {
                case 0:
                    if (split.length != 4) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                if (parseInt4 == 0) {
                                    i = EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                }
                                i = -1;
                            } else if (parseInt3 != 1) {
                                if (parseInt3 == 2) {
                                    if (parseInt4 == 1) {
                                        i = IptcConstants.IMAGE_RESOURCE_BLOCK_LAYERS_GROUP_INFO;
                                    } else if (parseInt4 == 2) {
                                        i = IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
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
                                Log.w("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                break;
                            } else {
                                if (parseInt5 == 0) {
                                    i2 = 1;
                                } else if (parseInt5 == 1) {
                                    i2 = 2;
                                } else if (parseInt5 == 2) {
                                    i2 = 4;
                                } else if (parseInt5 == 3) {
                                    i2 = 8;
                                } else if (parseInt5 != 4) {
                                    i3 = -1;
                                    i2 = -1;
                                    if (i2 == i3) {
                                        break;
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    i2 = 16;
                                }
                                i3 = -1;
                                if (i2 == i3) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 1:
                    if (split.length < 4) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1].substring(4));
                            int parseInt7 = Integer.parseInt(split[2].substring(4));
                            int parseInt8 = Integer.parseInt(split[3].substring(4));
                            if (parseInt6 != 33) {
                                if (parseInt6 != 44) {
                                    Fragment$5$$ExternalSyntheticOutline0.m(parseInt6, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i14 = 1;
                            }
                            int i15 = (parseInt7 / 30) * 2;
                            if (parseInt7 % 30 == 0) {
                                i15--;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            Log.w("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                            return null;
                        }
                    }
                case 2:
                    if (split.length < 4) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt9 = Integer.parseInt(split[1]);
                            int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt11 = Integer.parseInt(split[3]);
                            if (parseInt9 == 0) {
                                int i16 = 8;
                                if (parseInt11 != 8 && parseInt11 != 10) {
                                    Fragment$5$$ExternalSyntheticOutline0.m(parseInt11, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    int i17 = parseInt11 == 8 ? 1 : (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i4 = colorInfo.colorTransfer) == 7 || i4 == 6)) ? 2 : 4096;
                                    switch (parseInt10) {
                                        case 0:
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
                                        case 5:
                                            i16 = 32;
                                            break;
                                        case 6:
                                            i16 = 64;
                                            break;
                                        case 7:
                                            i16 = 128;
                                            break;
                                        case 8:
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
                                            i16 = PKIFailureInfo.unsupportedVersion;
                                            break;
                                        case 18:
                                            i16 = PKIFailureInfo.transactionIdInUse;
                                            break;
                                        case 19:
                                            i16 = PKIFailureInfo.signerNotTrusted;
                                            break;
                                        case 20:
                                            i16 = PKIFailureInfo.badCertTemplate;
                                            break;
                                        case 21:
                                            i16 = PKIFailureInfo.badSenderNonce;
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
                                        break;
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(parseInt10, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                }
                            } else {
                                Fragment$5$$ExternalSyntheticOutline0.m(parseInt9, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 3:
                case 4:
                    if (split.length < 2) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i5 = 16;
                                if (split.length < 3) {
                                    Log.w("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i5 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt != 66) {
                                if (parseInt == 77) {
                                    i7 = -1;
                                    i6 = 2;
                                } else if (parseInt == 88) {
                                    i7 = -1;
                                    i6 = 4;
                                } else if (parseInt == 100) {
                                    i7 = -1;
                                    i6 = 8;
                                } else if (parseInt == 110) {
                                    i6 = i5;
                                } else if (parseInt == 122) {
                                    i7 = -1;
                                    i6 = 32;
                                } else if (parseInt != 244) {
                                    i7 = -1;
                                    i6 = -1;
                                } else {
                                    i7 = -1;
                                    i6 = 64;
                                }
                                if (i6 == i7) {
                                    switch (parseInt2) {
                                        case 10:
                                            i5 = 1;
                                            i8 = -1;
                                            break;
                                        case 11:
                                            i8 = -1;
                                            i5 = 4;
                                            break;
                                        case 12:
                                            i8 = -1;
                                            i5 = 8;
                                            break;
                                        case 13:
                                            i8 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i8 = -1;
                                                    i5 = 32;
                                                    break;
                                                case 21:
                                                    i8 = -1;
                                                    i5 = 64;
                                                    break;
                                                case 22:
                                                    i8 = -1;
                                                    i5 = 128;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 30:
                                                            i5 = 256;
                                                            i8 = -1;
                                                            break;
                                                        case 31:
                                                            i8 = -1;
                                                            i5 = 512;
                                                            break;
                                                        case 32:
                                                            i8 = -1;
                                                            i5 = 1024;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 40:
                                                                    i8 = -1;
                                                                    i5 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i8 = -1;
                                                                    i5 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i5 = 8192;
                                                                    i8 = -1;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 50:
                                                                            i5 = 16384;
                                                                            i8 = -1;
                                                                            break;
                                                                        case 51:
                                                                            i5 = 32768;
                                                                            i8 = -1;
                                                                            break;
                                                                        case 52:
                                                                            i5 = 65536;
                                                                            i8 = -1;
                                                                            break;
                                                                        default:
                                                                            i8 = -1;
                                                                            i5 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i5 != i8) {
                                        break;
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    Fragment$5$$ExternalSyntheticOutline0.m(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i6 = 1;
                            }
                            i7 = -1;
                            if (i6 == i7) {
                            }
                        } catch (NumberFormatException unused3) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 7:
                    if (split.length < 4) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str4 = split[3];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 2464863:
                                    if (str4.equals("Opus")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3114792:
                                    if (str4.equals("fLaC")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3238865:
                                    if (str4.equals("ipcm")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3356560:
                                    if (str4.equals("mp4a")) {
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
                                case 0:
                                    i9 = 1;
                                    break;
                                case 1:
                                    i9 = 4;
                                    break;
                                case 2:
                                    i9 = 8;
                                    break;
                                case 3:
                                    i9 = 2;
                                    break;
                                default:
                                    Log.w("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e2) {
                            Log.w("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e2);
                            return null;
                        }
                    }
                case '\b':
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(split[1], 16)))) {
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
                                                                i18 = 1;
                                                                break;
                                                            case 2:
                                                                i10 = -1;
                                                                i18 = 2;
                                                                break;
                                                            case 3:
                                                                i18 = 3;
                                                                break;
                                                            case 4:
                                                                i10 = -1;
                                                                i18 = 4;
                                                                break;
                                                            case 5:
                                                                i18 = 5;
                                                                break;
                                                            case 6:
                                                                i10 = -1;
                                                                i18 = 6;
                                                                break;
                                                            default:
                                                                i10 = -1;
                                                                i18 = -1;
                                                                break;
                                                        }
                                                        if (i18 != i10) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i18 = 20;
                                    }
                                }
                                i10 = -1;
                                if (i18 != i10) {
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case '\t':
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                    }
                case '\n':
                    if (split.length < 3) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt14 = Integer.parseInt(split[1]);
                            int parseInt15 = Integer.parseInt(split[2]);
                            int i19 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i19 == -1) {
                                Fragment$5$$ExternalSyntheticOutline0.m(parseInt14, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            } else {
                                if (parseInt15 != 10) {
                                    if (parseInt15 == 11) {
                                        i12 = -1;
                                        i11 = 2;
                                    } else if (parseInt15 == 20) {
                                        i12 = -1;
                                        i11 = 4;
                                    } else if (parseInt15 == 21) {
                                        i12 = -1;
                                        i11 = 8;
                                    } else if (parseInt15 == 30) {
                                        i12 = -1;
                                        i11 = 16;
                                    } else if (parseInt15 == 31) {
                                        i12 = -1;
                                        i11 = 32;
                                    } else if (parseInt15 == 40) {
                                        i12 = -1;
                                        i11 = 64;
                                    } else if (parseInt15 == 41) {
                                        i12 = -1;
                                        i11 = 128;
                                    } else if (parseInt15 == 50) {
                                        i11 = 256;
                                    } else if (parseInt15 != 51) {
                                        switch (parseInt15) {
                                            case 60:
                                                i12 = -1;
                                                i11 = 2048;
                                                break;
                                            case 61:
                                                i12 = -1;
                                                i11 = 4096;
                                                break;
                                            case 62:
                                                i11 = 8192;
                                                break;
                                            default:
                                                i12 = -1;
                                                i11 = -1;
                                                break;
                                        }
                                    } else {
                                        i12 = -1;
                                        i11 = 512;
                                    }
                                    if (i11 == i12) {
                                        break;
                                    } else {
                                        Fragment$5$$ExternalSyntheticOutline0.m(parseInt15, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    i11 = 1;
                                }
                                i12 = -1;
                                if (i11 == i12) {
                                }
                            }
                        } catch (NumberFormatException unused6) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 11:
                case '\f':
                    if (split.length < 3) {
                        Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt16 = Integer.parseInt(split[1]);
                            if (parseInt16 != 1) {
                                if (parseInt16 != 65) {
                                    Log.w("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + split[1]);
                                    break;
                                } else {
                                    i13 = 4;
                                }
                            } else {
                                i13 = (colorInfo == null || colorInfo.colorTransfer != 6) ? (colorInfo == null || colorInfo.lumaBitdepth != 8) ? 2 : 1 : 4096;
                            }
                            String str5 = split[2];
                            if (str5 != null) {
                                switch (str5.hashCode()) {
                                    case 70918:
                                        if (str5.equals("H64")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70921:
                                        if (str5.equals("H67")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70976:
                                        if (str5.equals("H80")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70979:
                                        if (str5.equals("H83")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 70982:
                                        if (str5.equals("H86")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 71013:
                                        if (str5.equals("H96")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74609:
                                        if (str5.equals("L16")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74667:
                                        if (str5.equals("L32")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74670:
                                        if (str5.equals("L35")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74704:
                                        if (str5.equals("L48")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74728:
                                        if (str5.equals("L51")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74762:
                                        if (str5.equals("L64")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74765:
                                        if (str5.equals("L67")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74820:
                                        if (str5.equals("L80")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74823:
                                        if (str5.equals("L83")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74826:
                                        if (str5.equals("L86")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 74857:
                                        if (str5.equals("L96")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193610:
                                        if (str5.equals("H112")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193647:
                                        if (str5.equals("H128")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2193705:
                                        if (str5.equals("H144")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312774:
                                        if (str5.equals("L112")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312811:
                                        if (str5.equals("L128")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2312869:
                                        if (str5.equals("L144")) {
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
                                    case 0:
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
                                    case 5:
                                        num2 = 65536;
                                        break;
                                    case 6:
                                        num2 = 1;
                                        break;
                                    case 7:
                                        num2 = 2;
                                        break;
                                    case '\b':
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
                                        num2 = Integer.valueOf(PKIFailureInfo.certRevoked);
                                        break;
                                    case 16:
                                        num2 = 32768;
                                        break;
                                    case 17:
                                        num2 = Integer.valueOf(PKIFailureInfo.transactionIdInUse);
                                        break;
                                    case 18:
                                        num2 = Integer.valueOf(PKIFailureInfo.badCertTemplate);
                                        break;
                                    case 19:
                                        num2 = 4194304;
                                        break;
                                    case 20:
                                        num2 = Integer.valueOf(PKIFailureInfo.unsupportedVersion);
                                        break;
                                    case 21:
                                        num2 = Integer.valueOf(PKIFailureInfo.signerNotTrusted);
                                        break;
                                    case 22:
                                        num2 = Integer.valueOf(PKIFailureInfo.badSenderNonce);
                                        break;
                                }
                                if (num2 == null) {
                                    break;
                                } else {
                                    Fragment$5$$ExternalSyntheticOutline0.m("Unknown VVC level string: ", str5, "CodecSpecificDataUtil");
                                    break;
                                }
                            }
                            num2 = null;
                            if (num2 == null) {
                            }
                        } catch (NumberFormatException unused7) {
                            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
            }
            return null;
        }
        if (split.length < 3) {
            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(split[1]);
        if (!matcher.matches()) {
            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
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
                case 0:
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
                case 5:
                    num = 32;
                    break;
                case 6:
                    num = 64;
                    break;
                case 7:
                    num = 128;
                    break;
                case '\b':
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
                Fragment$5$$ExternalSyntheticOutline0.m("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str6 = split[2];
            if (str6 != null) {
                switch (str6.hashCode()) {
                    case 1537:
                        if (str6.equals("01")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1538:
                        if (str6.equals("02")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1539:
                        if (str6.equals("03")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1540:
                        if (str6.equals("04")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1541:
                        if (str6.equals("05")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1542:
                        if (str6.equals("06")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1543:
                        if (str6.equals("07")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1544:
                        if (str6.equals("08")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1545:
                        if (str6.equals("09")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1567:
                        if (str6.equals("10")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1568:
                        if (str6.equals("11")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1569:
                        if (str6.equals("12")) {
                            c5 = 11;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1570:
                        if (str6.equals("13")) {
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
                    case 0:
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
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = 128;
                        break;
                    case '\b':
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
                Fragment$5$$ExternalSyntheticOutline0.m("Unknown Dolby Vision level string: ", str6, "CodecSpecificDataUtil");
                return null;
            }
            num2 = null;
            if (num2 == null) {
            }
        }
        num = null;
        if (num != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0167, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair getHevcProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Fragment$5$$ExternalSyntheticOutline0.m("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                Fragment$5$$ExternalSyntheticOutline0.m("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
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
                case 0:
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
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = Integer.valueOf(PKIFailureInfo.certRevoked);
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = Integer.valueOf(PKIFailureInfo.unsupportedVersion);
                    break;
                case 14:
                    num = Integer.valueOf(PKIFailureInfo.signerNotTrusted);
                    break;
                case 15:
                    num = Integer.valueOf(PKIFailureInfo.badSenderNonce);
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
                    num = Integer.valueOf(PKIFailureInfo.transactionIdInUse);
                    break;
                case 23:
                    num = Integer.valueOf(PKIFailureInfo.badCertTemplate);
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
            Fragment$5$$ExternalSyntheticOutline0.m("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
