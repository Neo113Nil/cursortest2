package com.google.android.gms.internal.ads;

import android.R;
import android.util.Pair;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.zm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4305zm {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f36216a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f36217b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f36218c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z6, int i4, int i6, int[] iArr, int i9) {
        int i10;
        Object[] objArr = {f36217b[i], Integer.valueOf(i4), Integer.valueOf(i6), Character.valueOf(true != z6 ? 'L' : 'H'), Integer.valueOf(i9)};
        String str = AbstractC3182eu.f30782a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i11 = 6;
        while (true) {
            if (i11 <= 0) {
                break;
            }
            int i12 = i11 - 1;
            if (iArr[i12] != 0) {
                break;
            }
            i11 = i12;
        }
        for (i10 = 0; i10 < i11; i10++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i10])));
        }
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        AbstractC2792Sd.w(length, "Invalid APV CSD length: %s", length >= 17);
        byte b9 = bArr[0];
        AbstractC2792Sd.w(b9, "Invalid APV CSD version: %s", b9 == 1);
        int i = bArr[5] & 255;
        int i4 = bArr[6] & 255;
        int i6 = bArr[7] & 255;
        String str = AbstractC3182eu.f30782a;
        Locale locale = Locale.US;
        StringBuilder j6 = Wv.j(i, i4, "apv1.apvf", ".apvl", ".apvb");
        j6.append(i6);
        return j6.toString();
    }

    public static Pair c(DP dp) {
        boolean z6;
        C3550lm d9 = d(dp);
        if (d9 == null || !(z6 = d9.f32625b)) {
            return null;
        }
        AbstractC2792Sd.H(z6);
        Integer valueOf = Integer.valueOf(d9.f32624a);
        AbstractC2792Sd.H(z6);
        return new Pair(valueOf, Integer.valueOf(d9.f32626c));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0895, code lost:
    
        if (r2.equals("L48") != false) goto L579;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3550lm d(DP dp) {
        char c9;
        int i;
        int i4;
        int parseInt;
        int parseInt2;
        int i6;
        int i9;
        int i10;
        Integer num;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char c10;
        int i16;
        Integer num2;
        Integer num3;
        String str = dp.f25172k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(dp.f25176o);
        C3550lm c3550lm = C3550lm.f32623d;
        int i17 = 32;
        int i18 = 3;
        int i19 = 4;
        int i20 = 2;
        if (!equals) {
            String str2 = split[0];
            switch (str2.hashCode()) {
                case 2986313:
                    if (str2.equals("ac-4")) {
                        c9 = 11;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3001066:
                    if (str2.equals("apv1")) {
                        c9 = '\t';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3004662:
                    if (str2.equals("av01")) {
                        c9 = '\b';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3006243:
                    if (str2.equals("avc1")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3199032:
                    if (str2.equals("hev1")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3214780:
                    if (str2.equals("hvc1")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3224753:
                    if (str2.equals("iamf")) {
                        c9 = '\f';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        c9 = '\n';
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3631854:
                    if (str2.equals("vvc1")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3632040:
                    if (str2.equals("vvi1")) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            KJ kj = dp.f25152F;
            String str3 = dp.f25172k;
            switch (c9) {
                case 0:
                    if (split.length < 3) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        switch (parseInt3) {
                            case 0:
                                i = 1;
                                break;
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 4;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 16;
                                break;
                            case 5:
                                i = 32;
                                break;
                            case 6:
                                i = 64;
                                break;
                            case 7:
                                i = 128;
                                break;
                            case 8:
                                i = 256;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        if (i == -1) {
                            com.IceFishing.LiveIceFishing.k.t(parseInt3, "Unknown H263 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt3).length() + 22));
                            return c3550lm;
                        }
                        if (parseInt4 == 10) {
                            i17 = 1;
                        } else if (parseInt4 == 20) {
                            i17 = 2;
                        } else if (parseInt4 == 30) {
                            i17 = 4;
                        } else if (parseInt4 == 40) {
                            i17 = 8;
                        } else if (parseInt4 == 45) {
                            i17 = 16;
                        } else if (parseInt4 != 50) {
                            i17 = parseInt4 != 60 ? parseInt4 != 70 ? -1 : 128 : 64;
                        }
                        if (i17 != -1) {
                            return new C3550lm(i, i17, true);
                        }
                        com.IceFishing.LiveIceFishing.k.t(parseInt4, "Unknown H263 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt4).length() + 20));
                        return c3550lm;
                    } catch (NumberFormatException unused) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 1:
                case 2:
                    int length = split.length;
                    if (length < 2) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            i4 = 16;
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else {
                            i4 = 16;
                            if (length < 3) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 37);
                                sb.append("Ignoring malformed AVC codec string: ");
                                sb.append(str3);
                                AbstractC2991bG.y("CodecSpecificDataUtil", sb.toString());
                                return null;
                            }
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        if (parseInt == 66) {
                            i20 = 1;
                        } else if (parseInt != 77) {
                            i20 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i4 : 8 : 4;
                        }
                        if (i20 == -1) {
                            com.IceFishing.LiveIceFishing.k.t(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt).length() + 21));
                            return c3550lm;
                        }
                        switch (parseInt2) {
                            case 10:
                                i6 = 1;
                                break;
                            case 11:
                                i6 = 4;
                                break;
                            case 12:
                                i6 = 8;
                                break;
                            case 13:
                                i6 = i4;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i6 = 32;
                                        break;
                                    case 21:
                                        i6 = 64;
                                        break;
                                    case 22:
                                        i6 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i6 = 256;
                                                break;
                                            case 31:
                                                i6 = 512;
                                                break;
                                            case 32:
                                                i6 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case com.anythink.basead.b.b.j.f6594O /* 40 */:
                                                        i6 = 2048;
                                                        break;
                                                    case 41:
                                                        i6 = 4096;
                                                        break;
                                                    case 42:
                                                        i6 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i6 = 16384;
                                                                break;
                                                            case 51:
                                                                i6 = 32768;
                                                                break;
                                                            case 52:
                                                                i6 = 65536;
                                                                break;
                                                            default:
                                                                i6 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i6 != -1) {
                            return new C3550lm(i20, i6, true);
                        }
                        com.IceFishing.LiveIceFishing.k.t(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt2).length() + 19));
                        return c3550lm;
                    } catch (NumberFormatException unused2) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 3:
                    if (split.length < 3) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2]);
                        int i21 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i21 == -1) {
                            com.IceFishing.LiveIceFishing.k.t(parseInt5, "Unknown VP9 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt5).length() + 21));
                            return c3550lm;
                        }
                        if (parseInt6 == 10) {
                            i9 = 1;
                        } else if (parseInt6 == 11) {
                            i9 = 2;
                        } else if (parseInt6 == 20) {
                            i9 = 4;
                        } else if (parseInt6 == 21) {
                            i9 = 8;
                        } else if (parseInt6 == 30) {
                            i9 = 16;
                        } else if (parseInt6 == 31) {
                            i9 = 32;
                        } else if (parseInt6 == 40) {
                            i9 = 64;
                        } else if (parseInt6 == 41) {
                            i9 = 128;
                        } else if (parseInt6 == 50) {
                            i9 = 256;
                        } else if (parseInt6 != 51) {
                            switch (parseInt6) {
                                case 60:
                                    i9 = 2048;
                                    break;
                                case 61:
                                    i9 = 4096;
                                    break;
                                case 62:
                                    i9 = 8192;
                                    break;
                                default:
                                    i9 = -1;
                                    break;
                            }
                        } else {
                            i9 = 512;
                        }
                        if (i9 != -1) {
                            return new C3550lm(i21, i9, true);
                        }
                        com.IceFishing.LiveIceFishing.k.t(parseInt6, "Unknown VP9 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt6).length() + 19));
                        return c3550lm;
                    } catch (NumberFormatException unused3) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 4:
                case 5:
                    return e(str3, split, kj);
                case 6:
                case 7:
                    if (split.length < 3) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt7 = Integer.parseInt(split[1]);
                        if (parseInt7 == 1) {
                            i10 = (kj == null || kj.f26651c != 6) ? (kj == null || kj.f26653e != 8) ? 2 : 1 : 4096;
                        } else {
                            if (parseInt7 != 65) {
                                com.IceFishing.LiveIceFishing.k.y(split[1], "Unknown VVC profile IDC: ", "CodecSpecificDataUtil");
                                return c3550lm;
                            }
                            i10 = 4;
                        }
                        String str4 = split[2];
                        switch (str4.hashCode()) {
                            case 70918:
                                if (str4.equals("H64")) {
                                    i18 = 6;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 70921:
                                if (str4.equals("H67")) {
                                    i18 = 8;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 70976:
                                if (str4.equals("H80")) {
                                    i18 = 10;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 70979:
                                if (str4.equals("H83")) {
                                    i18 = 12;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 70982:
                                if (str4.equals("H86")) {
                                    i18 = 14;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 71013:
                                if (str4.equals("H96")) {
                                    i18 = 16;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74609:
                                if (str4.equals("L16")) {
                                    i18 = 0;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74667:
                                if (str4.equals("L32")) {
                                    i18 = 1;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74670:
                                if (str4.equals("L35")) {
                                    i18 = 2;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74704:
                                break;
                            case 74728:
                                if (str4.equals("L51")) {
                                    i18 = 4;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74762:
                                if (str4.equals("L64")) {
                                    i18 = 5;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74765:
                                if (str4.equals("L67")) {
                                    i18 = 7;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74820:
                                if (str4.equals("L80")) {
                                    i18 = 9;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74823:
                                if (str4.equals("L83")) {
                                    i18 = 11;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74826:
                                if (str4.equals("L86")) {
                                    i18 = 13;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 74857:
                                if (str4.equals("L96")) {
                                    i18 = 15;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2193610:
                                if (str4.equals("H112")) {
                                    i18 = 18;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2193647:
                                if (str4.equals("H128")) {
                                    i18 = 20;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2193705:
                                if (str4.equals("H144")) {
                                    i18 = 22;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2312774:
                                if (str4.equals("L112")) {
                                    i18 = 17;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2312811:
                                if (str4.equals("L128")) {
                                    i18 = 19;
                                    break;
                                }
                                i18 = -1;
                                break;
                            case 2312869:
                                if (str4.equals("L144")) {
                                    i18 = 21;
                                    break;
                                }
                                i18 = -1;
                                break;
                            default:
                                i18 = -1;
                                break;
                        }
                        switch (i18) {
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
                            case 8:
                                num = 256;
                                break;
                            case 9:
                                num = 512;
                                break;
                            case 10:
                                num = 1024;
                                break;
                            case 11:
                                num = 2048;
                                break;
                            case 12:
                                num = 4096;
                                break;
                            case 13:
                                num = 8192;
                                break;
                            case 14:
                                num = 16384;
                                break;
                            case 15:
                                num = 32768;
                                break;
                            case 16:
                                num = Integer.valueOf(com.anythink.basead.exoplayer.b.aX);
                                break;
                            case 17:
                                num = 131072;
                                break;
                            case 18:
                                num = 262144;
                                break;
                            case 19:
                                num = 524288;
                                break;
                            case 20:
                                num = Integer.valueOf(com.anythink.basead.exoplayer.h.o.f8528d);
                                break;
                            case 21:
                                num = 2097152;
                                break;
                            case 22:
                                num = 4194304;
                                break;
                            default:
                                num = null;
                                break;
                        }
                        if (num != null) {
                            return new C3550lm(i10, num.intValue(), true);
                        }
                        AbstractC2991bG.y("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(str4));
                        return c3550lm;
                    } catch (NumberFormatException unused4) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\b':
                    if (split.length < 4) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt8 = Integer.parseInt(split[1]);
                        int parseInt9 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt10 = Integer.parseInt(split[3]);
                        if (parseInt8 != 0) {
                            com.IceFishing.LiveIceFishing.k.t(parseInt8, "Unknown AV1 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt8).length() + 21));
                            return c3550lm;
                        }
                        if (parseInt10 == 8) {
                            i11 = 1;
                        } else {
                            if (parseInt10 != 10) {
                                com.IceFishing.LiveIceFishing.k.t(parseInt10, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt10).length() + 23));
                                return c3550lm;
                            }
                            i11 = (kj == null || !(kj.f26652d != null || (i13 = kj.f26651c) == 7 || i13 == 6)) ? 2 : 4096;
                        }
                        switch (parseInt9) {
                            case 0:
                                i12 = 1;
                                break;
                            case 1:
                                i12 = 2;
                                break;
                            case 2:
                                i12 = 4;
                                break;
                            case 3:
                                i12 = 8;
                                break;
                            case 4:
                                i12 = 16;
                                break;
                            case 5:
                                i12 = 32;
                                break;
                            case 6:
                                i12 = 64;
                                break;
                            case 7:
                                i12 = 128;
                                break;
                            case 8:
                                i12 = 256;
                                break;
                            case 9:
                                i12 = 512;
                                break;
                            case 10:
                                i12 = 1024;
                                break;
                            case 11:
                                i12 = 2048;
                                break;
                            case 12:
                                i12 = 4096;
                                break;
                            case 13:
                                i12 = 8192;
                                break;
                            case 14:
                                i12 = 16384;
                                break;
                            case 15:
                                i12 = 32768;
                                break;
                            case 16:
                                i12 = 65536;
                                break;
                            case 17:
                                i12 = 131072;
                                break;
                            case 18:
                                i12 = 262144;
                                break;
                            case 19:
                                i12 = 524288;
                                break;
                            case 20:
                                i12 = com.anythink.basead.exoplayer.h.o.f8528d;
                                break;
                            case 21:
                                i12 = 2097152;
                                break;
                            case 22:
                                i12 = 4194304;
                                break;
                            case 23:
                                i12 = 8388608;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        if (i12 != -1) {
                            return new C3550lm(i11, i12, true);
                        }
                        com.IceFishing.LiveIceFishing.k.t(parseInt9, "Unknown AV1 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt9).length() + 19));
                        return c3550lm;
                    } catch (NumberFormatException unused5) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\t':
                    if (split.length < 4) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed APV codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt11 = Integer.parseInt(split[1].substring(4));
                        int parseInt12 = Integer.parseInt(split[2].substring(4));
                        int parseInt13 = Integer.parseInt(split[3].substring(4));
                        if (parseInt11 == 33) {
                            i14 = 1;
                        } else {
                            if (parseInt11 != 44) {
                                com.IceFishing.LiveIceFishing.k.t(parseInt11, "Unrecognized APV profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt11).length() + 26));
                                return c3550lm;
                            }
                            i14 = 8192;
                        }
                        int i22 = -1;
                        switch (parseInt12) {
                            case 30:
                                if (parseInt13 == 0) {
                                    i22 = 257;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 258;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 260;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 264;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 33:
                                if (parseInt13 == 0) {
                                    i22 = 513;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 514;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 516;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 520;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 60:
                                if (parseInt13 == 0) {
                                    i22 = 1025;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 1026;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 1028;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 1032;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 63:
                                if (parseInt13 == 0) {
                                    i22 = 2049;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 2050;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 2052;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 2056;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                if (parseInt13 == 0) {
                                    i22 = 4097;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 4098;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 4100;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 4104;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case j.v.f13364I /* 93 */:
                                if (parseInt13 == 0) {
                                    i22 = 8193;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 8194;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 8196;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 8200;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 120:
                                if (parseInt13 == 0) {
                                    i22 = 16385;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 16386;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 16388;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 16392;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 123:
                                if (parseInt13 == 0) {
                                    i22 = 32769;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 32770;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 32772;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 32776;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 150:
                                if (parseInt13 == 0) {
                                    i22 = 65537;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 65538;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 65540;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 65544;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 153:
                                if (parseInt13 == 0) {
                                    i22 = 131073;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 131074;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 131076;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 131080;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 180:
                                if (parseInt13 == 0) {
                                    i22 = 262145;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 262146;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 262148;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 262152;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 183:
                                if (parseInt13 == 0) {
                                    i22 = 524289;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 524290;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 524292;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 524296;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case BaseATView.a.f10559I /* 210 */:
                                if (parseInt13 == 0) {
                                    i22 = 1048577;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 1048578;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 1048580;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 1048584;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 213:
                                if (parseInt13 == 0) {
                                    i22 = 2097153;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i22 = 2097154;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i22 = 2097156;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i22 = 2097160;
                                    break;
                                } else {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            default:
                                com.IceFishing.LiveIceFishing.k.t(parseInt12, "Unrecognized APV level index: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt12).length() + 30));
                                break;
                        }
                        if (i22 != -1) {
                            return new C3550lm(i14, i22, true);
                        }
                        return c3550lm;
                    } catch (NumberFormatException e9) {
                        AbstractC2991bG.C("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str3)), e9);
                        return null;
                    }
                case '\n':
                    if (split.length != 3) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (!com.anythink.basead.exoplayer.k.o.f9246r.equals(H4.e(Integer.parseInt(split[1], 16)))) {
                            return null;
                        }
                        int parseInt14 = Integer.parseInt(split[2]);
                        if (parseInt14 == 17) {
                            i18 = 17;
                        } else if (parseInt14 == 20) {
                            i18 = 20;
                        } else if (parseInt14 == 23) {
                            i18 = 23;
                        } else if (parseInt14 == 29) {
                            i18 = 29;
                        } else if (parseInt14 == 39) {
                            i18 = 39;
                        } else if (parseInt14 != 42) {
                            switch (parseInt14) {
                                case 1:
                                    i18 = 1;
                                    break;
                                case 2:
                                    i18 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i18 = 4;
                                    break;
                                case 5:
                                    i18 = 5;
                                    break;
                                case 6:
                                    i18 = 6;
                                    break;
                                default:
                                    i18 = -1;
                                    break;
                            }
                        } else {
                            i18 = 42;
                        }
                        if (i18 != -1) {
                            return new C3550lm(i18, 0, true);
                        }
                        StringBuilder sb2 = new StringBuilder(29);
                        sb2.append("Unrecognized MP4A profile: -1");
                        AbstractC2991bG.y("CodecSpecificDataUtil", sb2.toString());
                        return c3550lm;
                    } catch (NumberFormatException unused6) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 11:
                    if (split.length != 4) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt15 = Integer.parseInt(split[1]);
                        int parseInt16 = Integer.parseInt(split[2]);
                        int parseInt17 = Integer.parseInt(split[3]);
                        if (parseInt15 == 0) {
                            if (parseInt16 == 0) {
                                i15 = 257;
                                if (i15 == -1) {
                                }
                            }
                            i15 = -1;
                            if (i15 == -1) {
                            }
                        } else if (parseInt15 != 1) {
                            if (parseInt15 == 2) {
                                if (parseInt16 == 1) {
                                    i15 = 1026;
                                } else if (parseInt16 == 2) {
                                    i15 = 1028;
                                }
                                if (i15 == -1) {
                                    AbstractC2991bG.y("CodecSpecificDataUtil", D.x.o(new StringBuilder(String.valueOf(parseInt15).length() + 23 + String.valueOf(parseInt16).length()), "Unknown AC-4 profile: ", parseInt15, com.anythink.core.common.d.j.f13164z, parseInt16));
                                    return c3550lm;
                                }
                                if (parseInt17 == 0) {
                                    i19 = 1;
                                } else if (parseInt17 == 1) {
                                    i19 = 2;
                                } else if (parseInt17 != 2) {
                                    i19 = parseInt17 != 3 ? parseInt17 != 4 ? -1 : 16 : 8;
                                }
                                if (i19 != -1) {
                                    return new C3550lm(i15, i19, true);
                                }
                                com.IceFishing.LiveIceFishing.k.t(parseInt17, "Unknown AC-4 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt17).length() + 20));
                                return c3550lm;
                            }
                            i15 = -1;
                            if (i15 == -1) {
                            }
                        } else {
                            if (parseInt16 == 0) {
                                i15 = 513;
                            } else {
                                if (parseInt16 == 1) {
                                    i15 = 514;
                                }
                                i15 = -1;
                            }
                            if (i15 == -1) {
                            }
                        }
                    } catch (NumberFormatException unused7) {
                        com.IceFishing.LiveIceFishing.k.y(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\f':
                    if (split.length < 4) {
                        AbstractC2991bG.y("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                        return null;
                    }
                    try {
                        int parseInt18 = Integer.parseInt(split[1]);
                        String str5 = split[3];
                        switch (str5.hashCode()) {
                            case 2464863:
                                if (str5.equals("Opus")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3114792:
                                if (str5.equals("fLaC")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3238865:
                                if (str5.equals("ipcm")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3356560:
                                if (str5.equals("mp4a")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        if (c10 == 0) {
                            if (parseInt18 == 0) {
                                i16 = R.attr.label;
                            } else if (parseInt18 == 1) {
                                i16 = R.id.checkbox;
                            } else if (parseInt18 != 2) {
                                com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt18, 32), parseInt18, "Unrecognized IAMF Opus profile: ", "CodecSpecificDataUtil");
                                i16 = -1;
                            } else {
                                i16 = R.string.copy;
                            }
                            if (i16 != -1) {
                            }
                        } else if (c10 == 1) {
                            if (parseInt18 == 0) {
                                i16 = R.attr.icon;
                            } else if (parseInt18 == 1) {
                                i16 = R.id.content;
                            } else if (parseInt18 != 2) {
                                com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt18, 31), parseInt18, "Unrecognized IAMF AAC profile: ", "CodecSpecificDataUtil");
                                i16 = -1;
                            } else {
                                i16 = R.string.copyUrl;
                            }
                            if (i16 != -1) {
                            }
                        } else if (c10 != 2) {
                            if (c10 != 3) {
                                AbstractC2991bG.y("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str5));
                            } else {
                                if (parseInt18 == 0) {
                                    i16 = R.attr.writePermission;
                                } else if (parseInt18 == 1) {
                                    i16 = R.id.icon2;
                                } else if (parseInt18 != 2) {
                                    com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt18, 31), parseInt18, "Unrecognized IAMF PCM profile: ", "CodecSpecificDataUtil");
                                } else {
                                    i16 = R.string.httpErrorUnsupportedScheme;
                                }
                                if (i16 != -1) {
                                    return new C3550lm(i16, 0, true);
                                }
                            }
                            i16 = -1;
                            if (i16 != -1) {
                            }
                        } else {
                            if (parseInt18 == 0) {
                                i16 = R.attr.manageSpaceActivity;
                            } else if (parseInt18 == 1) {
                                i16 = R.id.empty;
                            } else if (parseInt18 != 2) {
                                com.IceFishing.LiveIceFishing.k.s(Wv.b(parseInt18, 32), parseInt18, "Unrecognized IAMF FLAC profile: ", "CodecSpecificDataUtil");
                                i16 = -1;
                            } else {
                                i16 = R.string.defaultVoiceMailAlphaTag;
                            }
                            if (i16 != -1) {
                            }
                        }
                        return c3550lm;
                    } catch (NumberFormatException e10) {
                        AbstractC2991bG.C("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(split[1])), e10);
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            if (split.length < 3) {
                AbstractC2991bG.y("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = f36218c.matcher(split[1]);
            if (!matcher.matches()) {
                AbstractC2991bG.y("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            group.getClass();
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num2 = 1;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num2 = 2;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num2 = 4;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num2 = 8;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num2 = 16;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num2 = 32;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num2 = 64;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num2 = 128;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num2 = 256;
                            break;
                        }
                        num2 = null;
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num2 = 512;
                            break;
                        }
                        num2 = null;
                        break;
                    default:
                        num2 = null;
                        break;
                }
                if (num2 == null) {
                    AbstractC2991bG.y("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(group));
                    return c3550lm;
                }
                String str6 = split[2];
                int hashCode2 = str6.hashCode();
                switch (hashCode2) {
                    case 1537:
                        if (str6.equals("01")) {
                            num3 = 1;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1538:
                        if (str6.equals("02")) {
                            num3 = 2;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1539:
                        if (str6.equals("03")) {
                            num3 = 4;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1540:
                        if (str6.equals("04")) {
                            num3 = 8;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1541:
                        if (str6.equals("05")) {
                            num3 = 16;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1542:
                        if (str6.equals("06")) {
                            num3 = 32;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1543:
                        if (str6.equals("07")) {
                            num3 = 64;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1544:
                        if (str6.equals("08")) {
                            num3 = 128;
                            break;
                        }
                        num3 = null;
                        break;
                    case 1545:
                        if (str6.equals("09")) {
                            num3 = 256;
                            break;
                        }
                        num3 = null;
                        break;
                    default:
                        switch (hashCode2) {
                            case 1567:
                                if (str6.equals("10")) {
                                    num3 = 512;
                                    break;
                                }
                                num3 = null;
                                break;
                            case 1568:
                                if (str6.equals("11")) {
                                    num3 = 1024;
                                    break;
                                }
                                num3 = null;
                                break;
                            case 1569:
                                if (str6.equals("12")) {
                                    num3 = 2048;
                                    break;
                                }
                                num3 = null;
                                break;
                            case 1570:
                                if (str6.equals("13")) {
                                    num3 = 4096;
                                    break;
                                }
                                num3 = null;
                                break;
                            default:
                                num3 = null;
                                break;
                        }
                }
                if (num3 != null) {
                    return new C3550lm(num2.intValue(), num3.intValue(), true);
                }
                AbstractC2991bG.y("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(str6));
                return null;
            }
            if (group.equals("10")) {
                num2 = 1024;
                if (num2 == null) {
                }
            }
            num2 = null;
            if (num2 == null) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a1, code lost:
    
        if (r12.equals("L123") != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3550lm e(String str, String[] strArr, KJ kj) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            com.IceFishing.LiveIceFishing.k.y(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f36218c.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.IceFishing.LiveIceFishing.k.y(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        boolean equals = "1".equals(group);
        C3550lm c3550lm = C3550lm.f32623d;
        char c9 = 6;
        if (equals) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                com.IceFishing.LiveIceFishing.k.y(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return c3550lm;
            }
            i = (kj == null || kj.f26651c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            case 70914:
                if (str2.equals("H60")) {
                    c9 = 14;
                    break;
                }
                c9 = 65535;
                break;
            case 70917:
                if (str2.equals("H63")) {
                    c9 = 15;
                    break;
                }
                c9 = 65535;
                break;
            case 71007:
                if (str2.equals("H90")) {
                    c9 = 16;
                    break;
                }
                c9 = 65535;
                break;
            case 71010:
                if (str2.equals("H93")) {
                    c9 = 17;
                    break;
                }
                c9 = 65535;
                break;
            case 74665:
                if (str2.equals("L30")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 74758:
                if (str2.equals("L60")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 74761:
                if (str2.equals("L63")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 74851:
                if (str2.equals("L90")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 74854:
                if (str2.equals("L93")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    c9 = 18;
                    break;
                }
                c9 = 65535;
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    c9 = 19;
                    break;
                }
                c9 = 65535;
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    c9 = 20;
                    break;
                }
                c9 = 65535;
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    c9 = 21;
                    break;
                }
                c9 = 65535;
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    c9 = 22;
                    break;
                }
                c9 = 65535;
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    c9 = 23;
                    break;
                }
                c9 = 65535;
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    c9 = 24;
                    break;
                }
                c9 = 65535;
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    c9 = 25;
                    break;
                }
                c9 = 65535;
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 2312806:
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
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
                num = Integer.valueOf(com.anythink.basead.exoplayer.b.aX);
                break;
            case '\t':
                num = 262144;
                break;
            case '\n':
                num = Integer.valueOf(com.anythink.basead.exoplayer.h.o.f8528d);
                break;
            case 11:
                num = 4194304;
                break;
            case '\f':
                num = Integer.valueOf(com.anythink.basead.exoplayer.b.bc);
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
        if (num != null) {
            return new C3550lm(i, num.intValue(), true);
        }
        AbstractC2991bG.y("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return c3550lm;
    }
}
