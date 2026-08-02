package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zztn {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bf A[Catch: NumberFormatException -> 0x02d0, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02d0, blocks: (B:122:0x0269, B:124:0x027b, B:135:0x0297, B:138:0x02bf), top: B:121:0x0269 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0794  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzam zzamVar) {
        char c;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        Integer num;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        char c3;
        Integer num2;
        Integer num3;
        String str = zzamVar.zzj;
        if (str != null) {
            String[] split = str.split("\\.");
            int i11 = 8;
            int i12 = 2;
            if (!"video/dolby-vision".equals(zzamVar.zzm)) {
                String str2 = split[0];
                switch (str2.hashCode()) {
                    case 3004662:
                        if (str2.equals("av01")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006243:
                        if (str2.equals("avc1")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3006244:
                        if (str2.equals("avc2")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3199032:
                        if (str2.equals("hev1")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3214780:
                        if (str2.equals("hvc1")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3356560:
                        if (str2.equals("mp4a")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3624515:
                        if (str2.equals("vp09")) {
                            c = 2;
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
                    case 1:
                        String str3 = zzamVar.zzj;
                        int length = split.length;
                        if (length >= 2) {
                            try {
                                if (split[1].length() != 6) {
                                    i = 16;
                                    if (length < 3) {
                                        zzff.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str3);
                                        break;
                                    } else {
                                        parseInt = Integer.parseInt(split[1]);
                                        parseInt2 = Integer.parseInt(split[2]);
                                    }
                                } else {
                                    i = 16;
                                    parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                    parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                                }
                                if (parseInt == 66) {
                                    i12 = 1;
                                } else if (parseInt != 77) {
                                    if (parseInt != 88) {
                                        if (parseInt == 100) {
                                            i2 = -1;
                                            i12 = 8;
                                        } else if (parseInt == 110) {
                                            i12 = i;
                                        } else if (parseInt == 122) {
                                            i12 = 32;
                                        } else if (parseInt != 244) {
                                            i2 = -1;
                                            i12 = -1;
                                        } else {
                                            i12 = 64;
                                        }
                                        if (i12 != i2) {
                                            zzff.zzf("MediaCodecUtil", "Unknown AVC profile: " + parseInt);
                                            break;
                                        } else {
                                            switch (parseInt2) {
                                                case 10:
                                                    i3 = 1;
                                                    break;
                                                case 11:
                                                    i3 = 4;
                                                    break;
                                                case 12:
                                                    i3 = 8;
                                                    break;
                                                case 13:
                                                    i3 = i;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 20:
                                                            i3 = 32;
                                                            break;
                                                        case 21:
                                                            i3 = 64;
                                                            break;
                                                        case 22:
                                                            i3 = 128;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 30:
                                                                    i3 = 256;
                                                                    break;
                                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                                                    i3 = 512;
                                                                    break;
                                                                case 32:
                                                                    i3 = 1024;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case 40:
                                                                            i3 = 2048;
                                                                            break;
                                                                        case 41:
                                                                            i3 = 4096;
                                                                            break;
                                                                        case 42:
                                                                            i3 = 8192;
                                                                            break;
                                                                        default:
                                                                            switch (parseInt2) {
                                                                                case 50:
                                                                                    i3 = 16384;
                                                                                    break;
                                                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                                                    i3 = 32768;
                                                                                    break;
                                                                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                                                    i3 = 65536;
                                                                                    break;
                                                                                default:
                                                                                    i3 = -1;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                            if (i3 != -1) {
                                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i3));
                                            }
                                            zzff.zzf("MediaCodecUtil", "Unknown AVC level: " + parseInt2);
                                            break;
                                        }
                                    } else {
                                        i12 = 4;
                                    }
                                }
                                i2 = -1;
                                if (i12 != i2) {
                                }
                            } catch (NumberFormatException unused) {
                                zzff.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                                break;
                            }
                        } else {
                            zzff.zzf("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                            break;
                        }
                    case 2:
                        String str4 = zzamVar.zzj;
                        if (split.length >= 3) {
                            try {
                                int parseInt3 = Integer.parseInt(split[1]);
                                int parseInt4 = Integer.parseInt(split[2]);
                                int i13 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                                if (i13 == -1) {
                                    zzff.zzf("MediaCodecUtil", "Unknown VP9 profile: " + parseInt3);
                                    break;
                                } else {
                                    if (parseInt4 == 10) {
                                        i11 = 1;
                                    } else if (parseInt4 == 11) {
                                        i11 = 2;
                                    } else if (parseInt4 == 20) {
                                        i11 = 4;
                                    } else if (parseInt4 != 21) {
                                        if (parseInt4 == 30) {
                                            i4 = -1;
                                            i11 = 16;
                                        } else if (parseInt4 == 31) {
                                            i11 = 32;
                                        } else if (parseInt4 == 40) {
                                            i11 = 64;
                                        } else if (parseInt4 == 41) {
                                            i11 = 128;
                                        } else if (parseInt4 == 50) {
                                            i11 = 256;
                                        } else if (parseInt4 != 51) {
                                            switch (parseInt4) {
                                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                    i11 = 2048;
                                                    break;
                                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                    i11 = 4096;
                                                    break;
                                                case 62:
                                                    i11 = 8192;
                                                    break;
                                                default:
                                                    i4 = -1;
                                                    i11 = -1;
                                                    break;
                                            }
                                        } else {
                                            i11 = 512;
                                        }
                                        if (i11 == i4) {
                                            return new Pair(Integer.valueOf(i13), Integer.valueOf(i11));
                                        }
                                        zzff.zzf("MediaCodecUtil", "Unknown VP9 level: " + parseInt4);
                                        break;
                                    }
                                    i4 = -1;
                                    if (i11 == i4) {
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                                zzff.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                                break;
                            }
                        } else {
                            zzff.zzf("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    case 3:
                    case 4:
                        String str5 = zzamVar.zzj;
                        zzt zztVar = zzamVar.zzy;
                        if (split.length < 4) {
                            zzff.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            Matcher matcher = zzb.matcher(split[1]);
                            if (!matcher.matches()) {
                                zzff.zzf("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str5)));
                                break;
                            } else {
                                String group = matcher.group(1);
                                if (!AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(group)) {
                                    if (!ExifInterface.GPS_MEASUREMENT_2D.equals(group)) {
                                        zzff.zzf("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                                        break;
                                    } else {
                                        i5 = (zztVar == null || zztVar.zzf != 6) ? 2 : 4096;
                                    }
                                } else {
                                    i5 = 1;
                                }
                                String str6 = split[3];
                                if (str6 != null) {
                                    switch (str6.hashCode()) {
                                        case 70821:
                                            if (str6.equals("H30")) {
                                                c2 = '\r';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 70914:
                                            if (str6.equals("H60")) {
                                                c2 = 14;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 70917:
                                            if (str6.equals("H63")) {
                                                c2 = 15;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 71007:
                                            if (str6.equals("H90")) {
                                                c2 = 16;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 71010:
                                            if (str6.equals("H93")) {
                                                c2 = 17;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74665:
                                            if (str6.equals("L30")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74758:
                                            if (str6.equals("L60")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74761:
                                            if (str6.equals("L63")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74851:
                                            if (str6.equals("L90")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 74854:
                                            if (str6.equals("L93")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193639:
                                            if (str6.equals("H120")) {
                                                c2 = 18;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193642:
                                            if (str6.equals("H123")) {
                                                c2 = 19;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193732:
                                            if (str6.equals("H150")) {
                                                c2 = 20;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193735:
                                            if (str6.equals("H153")) {
                                                c2 = 21;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193738:
                                            if (str6.equals("H156")) {
                                                c2 = 22;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193825:
                                            if (str6.equals("H180")) {
                                                c2 = 23;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193828:
                                            if (str6.equals("H183")) {
                                                c2 = 24;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2193831:
                                            if (str6.equals("H186")) {
                                                c2 = 25;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312803:
                                            if (str6.equals("L120")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312806:
                                            if (str6.equals("L123")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312896:
                                            if (str6.equals("L150")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312899:
                                            if (str6.equals("L153")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312902:
                                            if (str6.equals("L156")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312989:
                                            if (str6.equals("L180")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312992:
                                            if (str6.equals("L183")) {
                                                c2 = 11;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 2312995:
                                            if (str6.equals("L186")) {
                                                c2 = '\f';
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
                                            num = 1;
                                            break;
                                        case 1:
                                            num = 4;
                                            break;
                                        case 2:
                                            num = 16;
                                            break;
                                        case 3:
                                            num = 64;
                                            break;
                                        case 4:
                                            num = 256;
                                            break;
                                        case 5:
                                            num = 1024;
                                            break;
                                        case 6:
                                            num = 4096;
                                            break;
                                        case 7:
                                            num = 16384;
                                            break;
                                        case '\b':
                                            num = 65536;
                                            break;
                                        case '\t':
                                            num = 262144;
                                            break;
                                        case '\n':
                                            num = 1048576;
                                            break;
                                        case 11:
                                            num = 4194304;
                                            break;
                                        case '\f':
                                            num = 16777216;
                                            break;
                                        case '\r':
                                            num = 2;
                                            break;
                                        case 14:
                                            num = 8;
                                            break;
                                        case 15:
                                            num = 32;
                                            break;
                                        case 16:
                                            num = 128;
                                            break;
                                        case 17:
                                            num = 512;
                                            break;
                                        case 18:
                                            num = 2048;
                                            break;
                                        case 19:
                                            num = 8192;
                                            break;
                                        case 20:
                                            num = 32768;
                                            break;
                                        case 21:
                                            num = 131072;
                                            break;
                                        case 22:
                                            num = 524288;
                                            break;
                                        case 23:
                                            num = 2097152;
                                            break;
                                        case 24:
                                            num = 8388608;
                                            break;
                                        case 25:
                                            num = 33554432;
                                            break;
                                    }
                                    if (num == null) {
                                        return new Pair(Integer.valueOf(i5), num);
                                    }
                                    zzff.zzf("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str6)));
                                    break;
                                }
                                num = null;
                                if (num == null) {
                                }
                            }
                        }
                        break;
                    case 5:
                        String str7 = zzamVar.zzj;
                        zzt zztVar2 = zzamVar.zzy;
                        if (split.length >= 4) {
                            try {
                                int parseInt5 = Integer.parseInt(split[1]);
                                int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                                int parseInt7 = Integer.parseInt(split[3]);
                                if (parseInt5 != 0) {
                                    zzff.zzf("MediaCodecUtil", "Unknown AV1 profile: " + parseInt5);
                                    break;
                                } else {
                                    if (parseInt7 == 8) {
                                        i6 = 1;
                                    } else if (parseInt7 != 10) {
                                        zzff.zzf("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt7);
                                        break;
                                    } else {
                                        i6 = (zztVar2 == null || !(zztVar2.zzg != null || (i8 = zztVar2.zzf) == 7 || i8 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt6) {
                                        case 0:
                                            i12 = 1;
                                            i7 = -1;
                                            break;
                                        case 1:
                                            i7 = -1;
                                            break;
                                        case 2:
                                            i12 = 4;
                                            i7 = -1;
                                            break;
                                        case 3:
                                            i12 = 8;
                                            i7 = -1;
                                            break;
                                        case 4:
                                            i7 = -1;
                                            i12 = 16;
                                            break;
                                        case 5:
                                            i12 = 32;
                                            i7 = -1;
                                            break;
                                        case 6:
                                            i7 = -1;
                                            i12 = 64;
                                            break;
                                        case 7:
                                            i12 = 128;
                                            i7 = -1;
                                            break;
                                        case 8:
                                            i7 = -1;
                                            i12 = 256;
                                            break;
                                        case 9:
                                            i12 = 512;
                                            i7 = -1;
                                            break;
                                        case 10:
                                            i7 = -1;
                                            i12 = 1024;
                                            break;
                                        case 11:
                                            i7 = -1;
                                            i12 = 2048;
                                            break;
                                        case 12:
                                            i7 = -1;
                                            i12 = 4096;
                                            break;
                                        case 13:
                                            i12 = 8192;
                                            i7 = -1;
                                            break;
                                        case 14:
                                            i12 = 16384;
                                            i7 = -1;
                                            break;
                                        case 15:
                                            i12 = 32768;
                                            i7 = -1;
                                            break;
                                        case 16:
                                            i12 = 65536;
                                            i7 = -1;
                                            break;
                                        case 17:
                                            i12 = 131072;
                                            i7 = -1;
                                            break;
                                        case 18:
                                            i12 = 262144;
                                            i7 = -1;
                                            break;
                                        case 19:
                                            i12 = 524288;
                                            i7 = -1;
                                            break;
                                        case 20:
                                            i12 = 1048576;
                                            i7 = -1;
                                            break;
                                        case 21:
                                            i12 = 2097152;
                                            i7 = -1;
                                            break;
                                        case 22:
                                            i12 = 4194304;
                                            i7 = -1;
                                            break;
                                        case 23:
                                            i12 = 8388608;
                                            i7 = -1;
                                            break;
                                        default:
                                            i7 = -1;
                                            i12 = -1;
                                            break;
                                    }
                                    if (i12 != i7) {
                                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i12));
                                    }
                                    zzff.zzf("MediaCodecUtil", "Unknown AV1 level: " + parseInt6);
                                    break;
                                }
                            } catch (NumberFormatException unused3) {
                                zzff.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                                break;
                            }
                        } else {
                            zzff.zzf("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                            break;
                        }
                        break;
                    case 6:
                        String str8 = zzamVar.zzj;
                        if (split.length == 3) {
                            try {
                                if ("audio/mp4a-latm".equals(zzcb.zzd(Integer.parseInt(split[1], 16)))) {
                                    int parseInt8 = Integer.parseInt(split[2]);
                                    if (parseInt8 == 17) {
                                        i9 = 17;
                                    } else if (parseInt8 == 20) {
                                        i9 = 20;
                                    } else if (parseInt8 == 23) {
                                        i9 = 23;
                                    } else if (parseInt8 == 29) {
                                        i9 = 29;
                                    } else if (parseInt8 == 39) {
                                        i9 = 39;
                                    } else if (parseInt8 != 42) {
                                        switch (parseInt8) {
                                            case 1:
                                                i9 = 1;
                                                break;
                                            case 2:
                                                i9 = 2;
                                                break;
                                            case 3:
                                                i9 = 3;
                                                break;
                                            case 4:
                                                i9 = 4;
                                                break;
                                            case 5:
                                                i10 = -1;
                                                i9 = 5;
                                                break;
                                            case 6:
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
                                    } else {
                                        i9 = 42;
                                    }
                                    i10 = -1;
                                    if (i9 != i10) {
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                zzff.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                                break;
                            }
                        } else {
                            zzff.zzf("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                            break;
                        }
                        break;
                }
            } else {
                String str9 = zzamVar.zzj;
                if (split.length < 3) {
                    zzff.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                } else {
                    Matcher matcher2 = zzb.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if (group2 != null) {
                            switch (group2.hashCode()) {
                                case 1536:
                                    if (group2.equals("00")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1537:
                                    if (group2.equals("01")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1538:
                                    if (group2.equals("02")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1539:
                                    if (group2.equals("03")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1540:
                                    if (group2.equals("04")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1541:
                                    if (group2.equals("05")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1542:
                                    if (group2.equals("06")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1543:
                                    if (group2.equals("07")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1544:
                                    if (group2.equals("08")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1545:
                                    if (group2.equals("09")) {
                                        c3 = '\t';
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
                            }
                            if (num2 != null) {
                                zzff.zzf("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group2)));
                            } else {
                                String str10 = split[2];
                                if (str10 != null) {
                                    int hashCode = str10.hashCode();
                                    switch (hashCode) {
                                        case 1537:
                                            if (str10.equals("01")) {
                                                num3 = 1;
                                                break;
                                            }
                                            break;
                                        case 1538:
                                            if (str10.equals("02")) {
                                                num3 = 2;
                                                break;
                                            }
                                            break;
                                        case 1539:
                                            if (str10.equals("03")) {
                                                num3 = 4;
                                                break;
                                            }
                                            break;
                                        case 1540:
                                            if (str10.equals("04")) {
                                                num3 = 8;
                                                break;
                                            }
                                            break;
                                        case 1541:
                                            if (str10.equals("05")) {
                                                num3 = 16;
                                                break;
                                            }
                                            break;
                                        case 1542:
                                            if (str10.equals("06")) {
                                                num3 = 32;
                                                break;
                                            }
                                            break;
                                        case 1543:
                                            if (str10.equals("07")) {
                                                num3 = 64;
                                                break;
                                            }
                                            break;
                                        case 1544:
                                            if (str10.equals("08")) {
                                                num3 = 128;
                                                break;
                                            }
                                            break;
                                        case 1545:
                                            if (str10.equals("09")) {
                                                num3 = 256;
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (hashCode) {
                                                case 1567:
                                                    if (str10.equals("10")) {
                                                        num3 = 512;
                                                        break;
                                                    }
                                                    break;
                                                case 1568:
                                                    if (str10.equals("11")) {
                                                        num3 = 1024;
                                                        break;
                                                    }
                                                    break;
                                                case 1569:
                                                    if (str10.equals("12")) {
                                                        num3 = 2048;
                                                        break;
                                                    }
                                                    break;
                                                case 1570:
                                                    if (str10.equals("13")) {
                                                        num3 = 4096;
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                                    if (num3 == null) {
                                        return new Pair(num2, num3);
                                    }
                                    zzff.zzf("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str10)));
                                }
                                num3 = null;
                                if (num3 == null) {
                                }
                            }
                        }
                        num2 = null;
                        if (num2 != null) {
                        }
                    } else {
                        zzff.zzf("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str9)));
                    }
                }
            }
        }
        return null;
    }

    public static zzsv zzb() throws zzth {
        List zze = zze("audio/raw", false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zzsv) zze.get(0);
    }

    public static String zzc(zzam zzamVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzamVar.zzm) || (zza2 = zza(zzamVar)) == null) {
            return null;
        }
        int intValue = ((Integer) zza2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(zztb zztbVar, zzam zzamVar, boolean z, boolean z2) throws zzth {
        String zzc2 = zzc(zzamVar);
        return zzc2 == null ? zzgaa.zzl() : zze(zzc2, z, z2);
    }

    public static synchronized List zze(String str, boolean z, boolean z2) throws zzth {
        synchronized (zztn.class) {
            zztf zztfVar = new zztf(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zztfVar);
            if (list != null) {
                return list;
            }
            int i = zzfy.zza;
            ArrayList zzh = zzh(zztfVar, new zztl(z, z2));
            if (z && zzh.isEmpty() && zzfy.zza <= 23) {
                zzh = zzh(zztfVar, new zztk(null));
                if (!zzh.isEmpty()) {
                    zzff.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsv) zzh.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzfy.zza < 26 && zzfy.zzb.equals("R9") && zzh.size() == 1 && ((zzsv) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzsv.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zztm() { // from class: com.google.android.gms.internal.ads.zztd
                    @Override // com.google.android.gms.internal.ads.zztm
                    public final int zza(Object obj) {
                        int i2 = zztn.zza;
                        String str2 = ((zzsv) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzfy.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzfy.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsv) zzh.get(0)).zza)) {
                zzh.add((zzsv) zzh.remove(0));
            }
            zzgaa zzj = zzgaa.zzj(zzh);
            hashMap.put(zztfVar, zzj);
            return zzj;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzf(zztb zztbVar, zzam zzamVar, boolean z, boolean z2) throws zzth {
        List zze = zze(zzamVar.zzm, z, z2);
        List zzd = zzd(zztbVar, zzamVar, z, z2);
        zzfzx zzfzxVar = new zzfzx();
        zzfzxVar.zzh(zze);
        zzfzxVar.zzh(zzd);
        return zzfzxVar.zzi();
    }

    public static List zzg(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zztm() { // from class: com.google.android.gms.internal.ads.zzte
            @Override // com.google.android.gms.internal.ads.zztm
            public final int zza(Object obj) {
                int i = zztn.zza;
                return ((zzsv) obj).zzd(zzam.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:129|(1:131)(1:132))|68|(1:70)(2:121|(1:128)(1:127))|(4:(2:115|116)|96|(8:99|100|101|102|103|104|105|107)|11)|74|75|76|78|11) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c6, code lost:
    
        if (r1.zzb == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0197 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:57:0x0145, B:61:0x015c, B:65:0x0171, B:67:0x0177, B:68:0x0188, B:70:0x0192, B:72:0x01be, B:121:0x0197, B:123:0x01a7, B:125:0x01af, B:129:0x017d), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017d A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:57:0x0145, B:61:0x015c, B:65:0x0171, B:67:0x0177, B:68:0x0188, B:70:0x0192, B:72:0x01be, B:121:0x0197, B:123:0x01a7, B:125:0x01af, B:129:0x017d), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:57:0x0145, B:61:0x015c, B:65:0x0171, B:67:0x0177, B:68:0x0188, B:70:0x0192, B:72:0x01be, B:121:0x0197, B:123:0x01a7, B:125:0x01af, B:129:0x017d), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192 A[Catch: Exception -> 0x0225, TryCatch #2 {Exception -> 0x0225, blocks: (B:57:0x0145, B:61:0x015c, B:65:0x0171, B:67:0x0177, B:68:0x0188, B:70:0x0192, B:72:0x01be, B:121:0x0197, B:123:0x01a7, B:125:0x01af, B:129:0x017d), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234 A[Catch: Exception -> 0x0282, TRY_ENTER, TryCatch #5 {Exception -> 0x0282, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:12:0x0034, B:16:0x0042, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007c, B:32:0x0086, B:34:0x0090, B:36:0x009a, B:38:0x00a4, B:40:0x00ae, B:42:0x00b8, B:44:0x00be, B:46:0x00c6, B:48:0x00ce, B:50:0x00d7, B:82:0x022c, B:85:0x0234, B:87:0x023a, B:90:0x0254, B:91:0x0275, B:52:0x00e0, B:141:0x00e3, B:143:0x00eb, B:146:0x00f6, B:148:0x00fe, B:152:0x0109, B:154:0x0111, B:157:0x011c, B:159:0x0124, B:162:0x012f, B:164:0x0137), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0254 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList zzh(zztf zztfVar, zzti zztiVar) throws zzth {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zzd;
        boolean zzc2;
        boolean isHardwareAccelerated;
        boolean zzj;
        boolean z;
        String str4;
        zztf zztfVar2 = zztfVar;
        zzti zztiVar2 = zztiVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zztfVar2.zza;
            int zza2 = zztiVar.zza();
            boolean zze = zztiVar.zze();
            int i3 = 0;
            while (i3 < zza2) {
                MediaCodecInfo zzb2 = zztiVar2.zzb(i3);
                if (zzfy.zza < 29 || !zzb2.isAlias()) {
                    String name = zzb2.getName();
                    if (!zzb2.isEncoder() && ((zze || !name.endsWith(".secure")) && ((zzfy.zza >= 24 || ((!"OMX.SEC.aac.dec".equals(name) && !"OMX.Exynos.AAC.Decoder".equals(name)) || !"samsung".equals(zzfy.zzc) || (!zzfy.zzb.startsWith("zeroflte") && !zzfy.zzb.startsWith("zerolte") && !zzfy.zzb.startsWith("zenlte") && !"SC-05G".equals(zzfy.zzb) && !"marinelteatt".equals(zzfy.zzb) && !"404SC".equals(zzfy.zzb) && !"SC-04G".equals(zzfy.zzb) && !"SCV31".equals(zzfy.zzb)))) && (zzfy.zza > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))))) {
                        String[] supportedTypes = zzb2.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                str = supportedTypes[i4];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                }
                                i4++;
                            } else if (str5.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str = null;
                                }
                            } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = zzb2.getCapabilitiesForType(str);
                                zzd = zztiVar2.zzd("tunneled-playback", str, capabilitiesForType);
                                zzc2 = zztiVar2.zzc("tunneled-playback", str, capabilitiesForType);
                            } catch (Exception e) {
                                e = e;
                                str2 = name;
                                i = i3;
                                i2 = zza2;
                                str3 = str5;
                            }
                            if (zztfVar2.zzc) {
                                if (!zzd) {
                                }
                                boolean zzd2 = zztiVar2.zzd("secure-playback", str, capabilitiesForType);
                                boolean zzc3 = zztiVar2.zzc("secure-playback", str, capabilitiesForType);
                                if (zztfVar2.zzb) {
                                }
                            } else if (!zzc2) {
                                boolean zzd22 = zztiVar2.zzd("secure-playback", str, capabilitiesForType);
                                boolean zzc32 = zztiVar2.zzc("secure-playback", str, capabilitiesForType);
                                if (zztfVar2.zzb) {
                                    if (!zzc32) {
                                        isHardwareAccelerated = zzfy.zza < 29 ? zzb2.isHardwareAccelerated() : !zzj(zzb2, str5);
                                        zzj = zzj(zzb2, str5);
                                        if (zzfy.zza < 29) {
                                            z = zzb2.isVendor();
                                        } else {
                                            String zza3 = zzfwk.zza(zzb2.getName());
                                            z = (zza3.startsWith("omx.google.") || zza3.startsWith("c2.android.") || zza3.startsWith("c2.google.")) ? false : true;
                                        }
                                        if (zze || zztfVar2.zzb != zzd22) {
                                            if (!zze) {
                                                try {
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str4 = name;
                                                    i = i3;
                                                    i2 = zza2;
                                                    str3 = str5;
                                                    str2 = str4;
                                                    if (zzfy.zza > 23) {
                                                    }
                                                    zzff.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                            i = i3;
                                            i2 = zza2;
                                            str3 = str5;
                                            if (!zze && zzd22) {
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    sb.append(name);
                                                    sb.append(".secure");
                                                    str2 = name;
                                                    try {
                                                        arrayList.add(zzsv.zzc(sb.toString(), str3, str, capabilitiesForType, isHardwareAccelerated, zzj, z, false, true));
                                                        break;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        if (zzfy.zza > 23 || arrayList.isEmpty()) {
                                                            zzff.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                        zzff.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                        i3 = i + 1;
                                                        zztfVar2 = zztfVar;
                                                        str5 = str3;
                                                        zza2 = i2;
                                                        zztiVar2 = zztiVar;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    str2 = name;
                                                }
                                            }
                                            i3 = i + 1;
                                            zztfVar2 = zztfVar;
                                            str5 = str3;
                                            zza2 = i2;
                                            zztiVar2 = zztiVar;
                                        }
                                        str4 = name;
                                        i = i3;
                                        i2 = zza2;
                                        str3 = str5;
                                        arrayList.add(zzsv.zzc(name, str5, str, capabilitiesForType, isHardwareAccelerated, zzj, z, false, false));
                                        i3 = i + 1;
                                        zztfVar2 = zztfVar;
                                        str5 = str3;
                                        zza2 = i2;
                                        zztiVar2 = zztiVar;
                                    }
                                } else if (zzd22) {
                                    zzd22 = true;
                                    if (zzfy.zza < 29) {
                                    }
                                    zzj = zzj(zzb2, str5);
                                    if (zzfy.zza < 29) {
                                    }
                                    if (zze) {
                                    }
                                    if (!zze) {
                                    }
                                    i = i3;
                                    i2 = zza2;
                                    str3 = str5;
                                    if (!zze) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(name);
                                        sb2.append(".secure");
                                        str2 = name;
                                        arrayList.add(zzsv.zzc(sb2.toString(), str3, str, capabilitiesForType, isHardwareAccelerated, zzj, z, false, true));
                                        break;
                                        break;
                                    }
                                    continue;
                                    i3 = i + 1;
                                    zztfVar2 = zztfVar;
                                    str5 = str3;
                                    zza2 = i2;
                                    zztiVar2 = zztiVar;
                                }
                            }
                        }
                    }
                }
                i = i3;
                i2 = zza2;
                str3 = str5;
                i3 = i + 1;
                zztfVar2 = zztfVar;
                str5 = str3;
                zza2 = i2;
                zztiVar2 = zztiVar;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zzth(e5, null);
        }
    }

    private static void zzi(List list, final zztm zztmVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztc
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zztn.zza;
                zztm zztmVar2 = zztm.this;
                return zztmVar2.zza(obj2) - zztmVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzfy.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzcb.zzg(str)) {
            return true;
        }
        String zza2 = zzfwk.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }
}
