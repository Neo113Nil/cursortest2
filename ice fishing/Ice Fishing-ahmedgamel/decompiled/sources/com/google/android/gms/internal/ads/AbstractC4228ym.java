package com.google.android.gms.internal.ads;

import android.R;
import android.util.Pair;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.anythink.core.common.d.j;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ym, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4228ym {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f35218a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f35219b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f35220c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z3, int i6, int i9, int[] iArr, int i10) {
        int i11;
        Object[] objArr = {f35219b[i], Integer.valueOf(i6), Integer.valueOf(i9), Character.valueOf(true != z3 ? 'L' : 'H'), Integer.valueOf(i10)};
        String str = AbstractC3159eu.f29993a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i12 = 6;
        while (true) {
            if (i12 <= 0) {
                break;
            }
            int i13 = i12 - 1;
            if (iArr[i13] != 0) {
                break;
            }
            i12 = i13;
        }
        for (i11 = 0; i11 < i12; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        AbstractC2772Sd.w(length, "Invalid APV CSD length: %s", length >= 17);
        byte b9 = bArr[0];
        AbstractC2772Sd.w(b9, "Invalid APV CSD version: %s", b9 == 1);
        int i = bArr[5] & 255;
        int i6 = bArr[6] & 255;
        int i9 = bArr[7] & 255;
        String str = AbstractC3159eu.f29993a;
        Locale locale = Locale.US;
        StringBuilder h9 = AbstractC4404f.h(i, i6, "apv1.apvf", ".apvl", ".apvb");
        h9.append(i9);
        return h9.toString();
    }

    public static Pair c(DP dp) {
        boolean z3;
        C3473km d2 = d(dp);
        if (d2 == null || !(z3 = d2.f31627b)) {
            return null;
        }
        AbstractC2772Sd.H(z3);
        Integer valueOf = Integer.valueOf(d2.f31626a);
        AbstractC2772Sd.H(z3);
        return new Pair(valueOf, Integer.valueOf(d2.f31628c));
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
    public static C3473km d(DP dp) {
        char c9;
        int i;
        int i6;
        int parseInt;
        int parseInt2;
        int i9;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c10;
        int i17;
        Integer num2;
        Integer num3;
        String str = dp.f24427k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(dp.f24431o);
        C3473km c3473km = C3473km.f31625d;
        int i18 = 32;
        int i19 = 3;
        int i20 = 4;
        int i21 = 2;
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
            KJ kj = dp.f24407F;
            String str3 = dp.f24427k;
            switch (c9) {
                case 0:
                    if (split.length < 3) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
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
                            com.anythink.basead.exoplayer.f.f.q(parseInt3, "Unknown H263 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt3).length() + 22));
                            return c3473km;
                        }
                        if (parseInt4 == 10) {
                            i18 = 1;
                        } else if (parseInt4 == 20) {
                            i18 = 2;
                        } else if (parseInt4 == 30) {
                            i18 = 4;
                        } else if (parseInt4 == 40) {
                            i18 = 8;
                        } else if (parseInt4 == 45) {
                            i18 = 16;
                        } else if (parseInt4 != 50) {
                            i18 = parseInt4 != 60 ? parseInt4 != 70 ? -1 : 128 : 64;
                        }
                        if (i18 != -1) {
                            return new C3473km(i, i18, true);
                        }
                        com.anythink.basead.exoplayer.f.f.q(parseInt4, "Unknown H263 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt4).length() + 20));
                        return c3473km;
                    } catch (NumberFormatException unused) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 1:
                case 2:
                    int length = split.length;
                    if (length < 2) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            i6 = 16;
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else {
                            i6 = 16;
                            if (length < 3) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 37);
                                sb.append("Ignoring malformed AVC codec string: ");
                                sb.append(str3);
                                AbstractC2968bG.y("CodecSpecificDataUtil", sb.toString());
                                return null;
                            }
                            parseInt = Integer.parseInt(split[1]);
                            parseInt2 = Integer.parseInt(split[2]);
                        }
                        if (parseInt == 66) {
                            i21 = 1;
                        } else if (parseInt != 77) {
                            i21 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i6 : 8 : 4;
                        }
                        if (i21 == -1) {
                            com.anythink.basead.exoplayer.f.f.q(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt).length() + 21));
                            return c3473km;
                        }
                        switch (parseInt2) {
                            case 10:
                                i9 = 1;
                                break;
                            case 11:
                                i9 = 4;
                                break;
                            case 12:
                                i9 = 8;
                                break;
                            case 13:
                                i9 = i6;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i9 = 32;
                                        break;
                                    case 21:
                                        i9 = 64;
                                        break;
                                    case 22:
                                        i9 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i9 = 256;
                                                break;
                                            case 31:
                                                i9 = 512;
                                                break;
                                            case 32:
                                                i9 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case com.anythink.basead.b.b.j.f5808O /* 40 */:
                                                        i9 = 2048;
                                                        break;
                                                    case 41:
                                                        i9 = 4096;
                                                        break;
                                                    case 42:
                                                        i9 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i9 = 16384;
                                                                break;
                                                            case 51:
                                                                i9 = 32768;
                                                                break;
                                                            case 52:
                                                                i9 = 65536;
                                                                break;
                                                            default:
                                                                i9 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i9 != -1) {
                            return new C3473km(i21, i9, true);
                        }
                        com.anythink.basead.exoplayer.f.f.q(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt2).length() + 19));
                        return c3473km;
                    } catch (NumberFormatException unused2) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 3:
                    if (split.length < 3) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2]);
                        int i22 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i22 == -1) {
                            com.anythink.basead.exoplayer.f.f.q(parseInt5, "Unknown VP9 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt5).length() + 21));
                            return c3473km;
                        }
                        if (parseInt6 == 10) {
                            i10 = 1;
                        } else if (parseInt6 == 11) {
                            i10 = 2;
                        } else if (parseInt6 == 20) {
                            i10 = 4;
                        } else if (parseInt6 == 21) {
                            i10 = 8;
                        } else if (parseInt6 == 30) {
                            i10 = 16;
                        } else if (parseInt6 == 31) {
                            i10 = 32;
                        } else if (parseInt6 == 40) {
                            i10 = 64;
                        } else if (parseInt6 == 41) {
                            i10 = 128;
                        } else if (parseInt6 == 50) {
                            i10 = 256;
                        } else if (parseInt6 != 51) {
                            switch (parseInt6) {
                                case 60:
                                    i10 = 2048;
                                    break;
                                case 61:
                                    i10 = 4096;
                                    break;
                                case 62:
                                    i10 = 8192;
                                    break;
                                default:
                                    i10 = -1;
                                    break;
                            }
                        } else {
                            i10 = 512;
                        }
                        if (i10 != -1) {
                            return new C3473km(i22, i10, true);
                        }
                        com.anythink.basead.exoplayer.f.f.q(parseInt6, "Unknown VP9 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt6).length() + 19));
                        return c3473km;
                    } catch (NumberFormatException unused3) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 4:
                case 5:
                    return e(str3, split, kj);
                case 6:
                case 7:
                    if (split.length < 3) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt7 = Integer.parseInt(split[1]);
                        if (parseInt7 == 1) {
                            i11 = (kj == null || kj.f25899c != 6) ? (kj == null || kj.f25901e != 8) ? 2 : 1 : 4096;
                        } else {
                            if (parseInt7 != 65) {
                                com.anythink.basead.exoplayer.f.f.v(split[1], "Unknown VVC profile IDC: ", "CodecSpecificDataUtil");
                                return c3473km;
                            }
                            i11 = 4;
                        }
                        String str4 = split[2];
                        switch (str4.hashCode()) {
                            case 70918:
                                if (str4.equals("H64")) {
                                    i19 = 6;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 70921:
                                if (str4.equals("H67")) {
                                    i19 = 8;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 70976:
                                if (str4.equals("H80")) {
                                    i19 = 10;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 70979:
                                if (str4.equals("H83")) {
                                    i19 = 12;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 70982:
                                if (str4.equals("H86")) {
                                    i19 = 14;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 71013:
                                if (str4.equals("H96")) {
                                    i19 = 16;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74609:
                                if (str4.equals("L16")) {
                                    i19 = 0;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74667:
                                if (str4.equals("L32")) {
                                    i19 = 1;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74670:
                                if (str4.equals("L35")) {
                                    i19 = 2;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74704:
                                break;
                            case 74728:
                                if (str4.equals("L51")) {
                                    i19 = 4;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74762:
                                if (str4.equals("L64")) {
                                    i19 = 5;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74765:
                                if (str4.equals("L67")) {
                                    i19 = 7;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74820:
                                if (str4.equals("L80")) {
                                    i19 = 9;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74823:
                                if (str4.equals("L83")) {
                                    i19 = 11;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74826:
                                if (str4.equals("L86")) {
                                    i19 = 13;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 74857:
                                if (str4.equals("L96")) {
                                    i19 = 15;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2193610:
                                if (str4.equals("H112")) {
                                    i19 = 18;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2193647:
                                if (str4.equals("H128")) {
                                    i19 = 20;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2193705:
                                if (str4.equals("H144")) {
                                    i19 = 22;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2312774:
                                if (str4.equals("L112")) {
                                    i19 = 17;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2312811:
                                if (str4.equals("L128")) {
                                    i19 = 19;
                                    break;
                                }
                                i19 = -1;
                                break;
                            case 2312869:
                                if (str4.equals("L144")) {
                                    i19 = 21;
                                    break;
                                }
                                i19 = -1;
                                break;
                            default:
                                i19 = -1;
                                break;
                        }
                        switch (i19) {
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
                                num = Integer.valueOf(com.anythink.basead.exoplayer.h.o.f7742d);
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
                            return new C3473km(i11, num.intValue(), true);
                        }
                        AbstractC2968bG.y("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(str4));
                        return c3473km;
                    } catch (NumberFormatException unused4) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed VVC codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\b':
                    if (split.length < 4) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt8 = Integer.parseInt(split[1]);
                        int parseInt9 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt10 = Integer.parseInt(split[3]);
                        if (parseInt8 != 0) {
                            com.anythink.basead.exoplayer.f.f.q(parseInt8, "Unknown AV1 profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt8).length() + 21));
                            return c3473km;
                        }
                        if (parseInt10 == 8) {
                            i12 = 1;
                        } else {
                            if (parseInt10 != 10) {
                                com.anythink.basead.exoplayer.f.f.q(parseInt10, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt10).length() + 23));
                                return c3473km;
                            }
                            i12 = (kj == null || !(kj.f25900d != null || (i14 = kj.f25899c) == 7 || i14 == 6)) ? 2 : 4096;
                        }
                        switch (parseInt9) {
                            case 0:
                                i13 = 1;
                                break;
                            case 1:
                                i13 = 2;
                                break;
                            case 2:
                                i13 = 4;
                                break;
                            case 3:
                                i13 = 8;
                                break;
                            case 4:
                                i13 = 16;
                                break;
                            case 5:
                                i13 = 32;
                                break;
                            case 6:
                                i13 = 64;
                                break;
                            case 7:
                                i13 = 128;
                                break;
                            case 8:
                                i13 = 256;
                                break;
                            case 9:
                                i13 = 512;
                                break;
                            case 10:
                                i13 = 1024;
                                break;
                            case 11:
                                i13 = 2048;
                                break;
                            case 12:
                                i13 = 4096;
                                break;
                            case 13:
                                i13 = 8192;
                                break;
                            case 14:
                                i13 = 16384;
                                break;
                            case 15:
                                i13 = 32768;
                                break;
                            case 16:
                                i13 = 65536;
                                break;
                            case 17:
                                i13 = 131072;
                                break;
                            case 18:
                                i13 = 262144;
                                break;
                            case 19:
                                i13 = 524288;
                                break;
                            case 20:
                                i13 = com.anythink.basead.exoplayer.h.o.f7742d;
                                break;
                            case 21:
                                i13 = 2097152;
                                break;
                            case 22:
                                i13 = 4194304;
                                break;
                            case 23:
                                i13 = 8388608;
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                        if (i13 != -1) {
                            return new C3473km(i12, i13, true);
                        }
                        com.anythink.basead.exoplayer.f.f.q(parseInt9, "Unknown AV1 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt9).length() + 19));
                        return c3473km;
                    } catch (NumberFormatException unused5) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\t':
                    if (split.length < 4) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed APV codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt11 = Integer.parseInt(split[1].substring(4));
                        int parseInt12 = Integer.parseInt(split[2].substring(4));
                        int parseInt13 = Integer.parseInt(split[3].substring(4));
                        if (parseInt11 == 33) {
                            i15 = 1;
                        } else {
                            if (parseInt11 != 44) {
                                com.anythink.basead.exoplayer.f.f.q(parseInt11, "Unrecognized APV profile: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt11).length() + 26));
                                return c3473km;
                            }
                            i15 = 8192;
                        }
                        int i23 = -1;
                        switch (parseInt12) {
                            case 30:
                                if (parseInt13 == 0) {
                                    i23 = 257;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 258;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 260;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 264;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 33:
                                if (parseInt13 == 0) {
                                    i23 = 513;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 514;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 516;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 520;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 60:
                                if (parseInt13 == 0) {
                                    i23 = 1025;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 1026;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 1028;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 1032;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 63:
                                if (parseInt13 == 0) {
                                    i23 = 2049;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 2050;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 2052;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 2056;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                if (parseInt13 == 0) {
                                    i23 = 4097;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 4098;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 4100;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 4104;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case j.v.f12578I /* 93 */:
                                if (parseInt13 == 0) {
                                    i23 = 8193;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 8194;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 8196;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 8200;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 120:
                                if (parseInt13 == 0) {
                                    i23 = 16385;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 16386;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 16388;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 16392;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 123:
                                if (parseInt13 == 0) {
                                    i23 = 32769;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 32770;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 32772;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 32776;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 150:
                                if (parseInt13 == 0) {
                                    i23 = 65537;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 65538;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 65540;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 65544;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 153:
                                if (parseInt13 == 0) {
                                    i23 = 131073;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 131074;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 131076;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 131080;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 180:
                                if (parseInt13 == 0) {
                                    i23 = 262145;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 262146;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 262148;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 262152;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 183:
                                if (parseInt13 == 0) {
                                    i23 = 524289;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 524290;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 524292;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 524296;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case BaseATView.a.f9773I /* 210 */:
                                if (parseInt13 == 0) {
                                    i23 = 1048577;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 1048578;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 1048580;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 1048584;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            case 213:
                                if (parseInt13 == 0) {
                                    i23 = 2097153;
                                    break;
                                } else if (parseInt13 == 1) {
                                    i23 = 2097154;
                                    break;
                                } else if (parseInt13 == 2) {
                                    i23 = 2097156;
                                    break;
                                } else if (parseInt13 == 3) {
                                    i23 = 2097160;
                                    break;
                                } else {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt13, 23), parseInt13, "Unrecognized APV band: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            default:
                                com.anythink.basead.exoplayer.f.f.q(parseInt12, "Unrecognized APV level index: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt12).length() + 30));
                                break;
                        }
                        if (i23 != -1) {
                            return new C3473km(i15, i23, true);
                        }
                        return c3473km;
                    } catch (NumberFormatException e9) {
                        AbstractC2968bG.C("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str3)), e9);
                        return null;
                    }
                case '\n':
                    if (split.length != 3) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        if (!com.anythink.basead.exoplayer.k.o.f8460r.equals(H4.e(Integer.parseInt(split[1], 16)))) {
                            return null;
                        }
                        int parseInt14 = Integer.parseInt(split[2]);
                        if (parseInt14 == 17) {
                            i19 = 17;
                        } else if (parseInt14 == 20) {
                            i19 = 20;
                        } else if (parseInt14 == 23) {
                            i19 = 23;
                        } else if (parseInt14 == 29) {
                            i19 = 29;
                        } else if (parseInt14 == 39) {
                            i19 = 39;
                        } else if (parseInt14 != 42) {
                            switch (parseInt14) {
                                case 1:
                                    i19 = 1;
                                    break;
                                case 2:
                                    i19 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i19 = 4;
                                    break;
                                case 5:
                                    i19 = 5;
                                    break;
                                case 6:
                                    i19 = 6;
                                    break;
                                default:
                                    i19 = -1;
                                    break;
                            }
                        } else {
                            i19 = 42;
                        }
                        if (i19 != -1) {
                            return new C3473km(i19, 0, true);
                        }
                        StringBuilder sb2 = new StringBuilder(29);
                        sb2.append("Unrecognized MP4A profile: -1");
                        AbstractC2968bG.y("CodecSpecificDataUtil", sb2.toString());
                        return c3473km;
                    } catch (NumberFormatException unused6) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case 11:
                    if (split.length != 4) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    try {
                        int parseInt15 = Integer.parseInt(split[1]);
                        int parseInt16 = Integer.parseInt(split[2]);
                        int parseInt17 = Integer.parseInt(split[3]);
                        if (parseInt15 == 0) {
                            if (parseInt16 == 0) {
                                i16 = 257;
                                if (i16 == -1) {
                                }
                            }
                            i16 = -1;
                            if (i16 == -1) {
                            }
                        } else if (parseInt15 != 1) {
                            if (parseInt15 == 2) {
                                if (parseInt16 == 1) {
                                    i16 = 1026;
                                } else if (parseInt16 == 2) {
                                    i16 = 1028;
                                }
                                if (i16 == -1) {
                                    AbstractC2968bG.y("CodecSpecificDataUtil", D.y.r(new StringBuilder(String.valueOf(parseInt15).length() + 23 + String.valueOf(parseInt16).length()), "Unknown AC-4 profile: ", parseInt15, com.anythink.core.common.d.j.f12378z, parseInt16));
                                    return c3473km;
                                }
                                if (parseInt17 == 0) {
                                    i20 = 1;
                                } else if (parseInt17 == 1) {
                                    i20 = 2;
                                } else if (parseInt17 != 2) {
                                    i20 = parseInt17 != 3 ? parseInt17 != 4 ? -1 : 16 : 8;
                                }
                                if (i20 != -1) {
                                    return new C3473km(i16, i20, true);
                                }
                                com.anythink.basead.exoplayer.f.f.q(parseInt17, "Unknown AC-4 level: ", "CodecSpecificDataUtil", new StringBuilder(String.valueOf(parseInt17).length() + 20));
                                return c3473km;
                            }
                            i16 = -1;
                            if (i16 == -1) {
                            }
                        } else {
                            if (parseInt16 == 0) {
                                i16 = 513;
                            } else {
                                if (parseInt16 == 1) {
                                    i16 = 514;
                                }
                                i16 = -1;
                            }
                            if (i16 == -1) {
                            }
                        }
                    } catch (NumberFormatException unused7) {
                        com.anythink.basead.exoplayer.f.f.v(str3, "Ignoring malformed AC-4 codec string: ", "CodecSpecificDataUtil");
                        return null;
                    }
                case '\f':
                    if (split.length < 4) {
                        AbstractC2968bG.y("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
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
                                i17 = R.attr.label;
                            } else if (parseInt18 == 1) {
                                i17 = R.id.checkbox;
                            } else if (parseInt18 != 2) {
                                com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt18, 32), parseInt18, "Unrecognized IAMF Opus profile: ", "CodecSpecificDataUtil");
                                i17 = -1;
                            } else {
                                i17 = R.string.copy;
                            }
                            if (i17 != -1) {
                            }
                        } else if (c10 == 1) {
                            if (parseInt18 == 0) {
                                i17 = R.attr.icon;
                            } else if (parseInt18 == 1) {
                                i17 = R.id.content;
                            } else if (parseInt18 != 2) {
                                com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt18, 31), parseInt18, "Unrecognized IAMF AAC profile: ", "CodecSpecificDataUtil");
                                i17 = -1;
                            } else {
                                i17 = R.string.copyUrl;
                            }
                            if (i17 != -1) {
                            }
                        } else if (c10 != 2) {
                            if (c10 != 3) {
                                AbstractC2968bG.y("CodecSpecificDataUtil", "Unrecognized codec identifier for IAMF auxiliary profile: ".concat(str5));
                            } else {
                                if (parseInt18 == 0) {
                                    i17 = R.attr.writePermission;
                                } else if (parseInt18 == 1) {
                                    i17 = R.id.icon2;
                                } else if (parseInt18 != 2) {
                                    com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt18, 31), parseInt18, "Unrecognized IAMF PCM profile: ", "CodecSpecificDataUtil");
                                } else {
                                    i17 = R.string.httpErrorUnsupportedScheme;
                                }
                                if (i17 != -1) {
                                    return new C3473km(i17, 0, true);
                                }
                            }
                            i17 = -1;
                            if (i17 != -1) {
                            }
                        } else {
                            if (parseInt18 == 0) {
                                i17 = R.attr.manageSpaceActivity;
                            } else if (parseInt18 == 1) {
                                i17 = R.id.empty;
                            } else if (parseInt18 != 2) {
                                com.anythink.basead.exoplayer.f.f.p(AbstractC4404f.b(parseInt18, 32), parseInt18, "Unrecognized IAMF FLAC profile: ", "CodecSpecificDataUtil");
                                i17 = -1;
                            } else {
                                i17 = R.string.defaultVoiceMailAlphaTag;
                            }
                            if (i17 != -1) {
                            }
                        }
                        return c3473km;
                    } catch (NumberFormatException e10) {
                        AbstractC2968bG.C("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(split[1])), e10);
                        return null;
                    }
                default:
                    return null;
            }
        } else {
            if (split.length < 3) {
                AbstractC2968bG.y("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = f35220c.matcher(split[1]);
            if (!matcher.matches()) {
                AbstractC2968bG.y("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
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
                    AbstractC2968bG.y("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(group));
                    return c3473km;
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
                    return new C3473km(num2.intValue(), num3.intValue(), true);
                }
                AbstractC2968bG.y("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(str6));
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
    public static C3473km e(String str, String[] strArr, KJ kj) {
        int i;
        Integer num = null;
        if (strArr.length < 4) {
            com.anythink.basead.exoplayer.f.f.v(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f35220c.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.anythink.basead.exoplayer.f.f.v(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        boolean equals = "1".equals(group);
        C3473km c3473km = C3473km.f31625d;
        char c9 = 6;
        if (equals) {
            i = 1;
        } else {
            if (!"2".equals(group)) {
                com.anythink.basead.exoplayer.f.f.v(group, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return c3473km;
            }
            i = (kj == null || kj.f25899c != 6) ? 2 : 4096;
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
                num = Integer.valueOf(com.anythink.basead.exoplayer.h.o.f7742d);
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
            return new C3473km(i, num.intValue(), true);
        }
        AbstractC2968bG.y("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return c3473km;
    }
}
