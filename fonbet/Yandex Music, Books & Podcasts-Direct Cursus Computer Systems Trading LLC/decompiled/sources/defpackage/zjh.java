package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public abstract class zjh {
    public static final HashMap a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (dvt.a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((mih) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(mih.j("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new ze0(3, new b6e()));
        }
        if (dvt.a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((mih) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((mih) arrayList.remove(0));
    }

    public static String b(dsc dscVar) {
        Pair d;
        String str = dscVar.n;
        String str2 = dscVar.n;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (d = d(dscVar)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e4 A[Catch: NumberFormatException -> 0x03f2, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x03f2, blocks: (B:221:0x0396, B:223:0x03a8, B:234:0x03c6, B:237:0x03e4), top: B:220:0x0396 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(dsc dscVar) {
        char c;
        int i;
        int i2;
        int parseInt;
        int parseInt2;
        int i3;
        int i4;
        int i5;
        Integer num;
        char c2;
        Integer num2;
        char c3;
        byte[] bArr = ir4.a;
        Integer num3 = 1;
        String str = dscVar.k;
        q85 q85Var = dscVar.B;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i6 = 16;
        if (!"video/dolby-vision".equals(dscVar.n)) {
            String str2 = split[0];
            str2.getClass();
            switch (str2.hashCode()) {
                case 3004662:
                    if (str2.equals("av01")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    if (str2.equals("avc1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c = 2;
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
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    if (str2.equals("s263")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i7 = 16384;
            switch (c) {
                case 0:
                    if (split.length >= 4) {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 != 0) {
                                dfi.o(parseInt3, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            if (parseInt5 != 8 && parseInt5 != 10) {
                                dfi.o(parseInt5, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            int i8 = parseInt5 == 8 ? 1 : (q85Var == null || !(q85Var.d != null || (i = q85Var.c) == 7 || i == 6)) ? 2 : 4096;
                            switch (parseInt4) {
                                case 0:
                                    i7 = 1;
                                    i2 = -1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    i2 = -1;
                                    break;
                                case 2:
                                    i7 = 4;
                                    i2 = -1;
                                    break;
                                case 3:
                                    i7 = 8;
                                    i2 = -1;
                                    break;
                                case 4:
                                    i7 = 16;
                                    i2 = -1;
                                    break;
                                case 5:
                                    i7 = 32;
                                    i2 = -1;
                                    break;
                                case 6:
                                    i7 = 64;
                                    i2 = -1;
                                    break;
                                case 7:
                                    i7 = 128;
                                    i2 = -1;
                                    break;
                                case 8:
                                    i7 = 256;
                                    i2 = -1;
                                    break;
                                case 9:
                                    i7 = 512;
                                    i2 = -1;
                                    break;
                                case 10:
                                    i7 = 1024;
                                    i2 = -1;
                                    break;
                                case 11:
                                    i7 = 2048;
                                    i2 = -1;
                                    break;
                                case 12:
                                    i7 = 4096;
                                    i2 = -1;
                                    break;
                                case 13:
                                    i7 = 8192;
                                    i2 = -1;
                                    break;
                                case 14:
                                    i2 = -1;
                                    break;
                                case 15:
                                    i7 = 32768;
                                    i2 = -1;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    i2 = -1;
                                    break;
                                case 17:
                                    i7 = SQLiteDatabase.OPEN_SHAREDCACHE;
                                    i2 = -1;
                                    break;
                                case 18:
                                    i7 = SQLiteDatabase.OPEN_PRIVATECACHE;
                                    i2 = -1;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    i2 = -1;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    i2 = -1;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    i2 = -1;
                                    break;
                                case 22:
                                    i7 = RemoteCameraConfig.Camera.BITRATE;
                                    i2 = -1;
                                    break;
                                case 23:
                                    i7 = 8388608;
                                    i2 = -1;
                                    break;
                                default:
                                    i2 = -1;
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != i2) {
                                return new Pair(Integer.valueOf(i8), Integer.valueOf(i7));
                            }
                            dfi.o(parseInt4, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused) {
                            vz1.C("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        vz1.C("Ignoring malformed AV1 codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                    break;
                case 1:
                case 2:
                    if (split.length >= 2) {
                        try {
                            if (split[1].length() == 6) {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                if (split.length < 3) {
                                    vq1.n0("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            int i9 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : 16 : 8 : 4 : 2 : 1;
                            if (i9 == -1) {
                                dfi.o(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i3 = -1;
                                    i7 = 1;
                                    break;
                                case 11:
                                    i3 = -1;
                                    i7 = 4;
                                    break;
                                case 12:
                                    i3 = -1;
                                    i7 = 8;
                                    break;
                                case 13:
                                    i7 = 16;
                                    i3 = -1;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i7 = 32;
                                            i3 = -1;
                                            break;
                                        case 21:
                                            i7 = 64;
                                            i3 = -1;
                                            break;
                                        case 22:
                                            i7 = 128;
                                            i3 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i7 = 256;
                                                    i3 = -1;
                                                    break;
                                                case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                                                    i7 = 512;
                                                    i3 = -1;
                                                    break;
                                                case 32:
                                                    i7 = 1024;
                                                    i3 = -1;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i7 = 2048;
                                                            i3 = -1;
                                                            break;
                                                        case 41:
                                                            i7 = 4096;
                                                            i3 = -1;
                                                            break;
                                                        case 42:
                                                            i7 = 8192;
                                                            i3 = -1;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i3 = -1;
                                                                    break;
                                                                case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                                                                    i7 = 32768;
                                                                    i3 = -1;
                                                                    break;
                                                                case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                                                                    i7 = 65536;
                                                                    i3 = -1;
                                                                    break;
                                                                default:
                                                                    i3 = -1;
                                                                    i7 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i7 != i3) {
                                return new Pair(Integer.valueOf(i9), Integer.valueOf(i7));
                            }
                            dfi.o(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused2) {
                            vz1.C("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        vz1.C("Ignoring malformed AVC codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                case 3:
                case 4:
                    return ir4.c(str, split, q85Var);
                case 5:
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(l5i.f(Integer.parseInt(split[1], 16)))) {
                                int parseInt6 = Integer.parseInt(split[2]);
                                int i10 = 17;
                                if (parseInt6 != 17) {
                                    if (parseInt6 != 20) {
                                        i10 = 23;
                                        if (parseInt6 != 23) {
                                            i10 = 29;
                                            if (parseInt6 != 29) {
                                                i10 = 39;
                                                if (parseInt6 != 39) {
                                                    i10 = 42;
                                                    if (parseInt6 != 42) {
                                                        switch (parseInt6) {
                                                            case 1:
                                                                i4 = -1;
                                                                i10 = 1;
                                                                break;
                                                            case 2:
                                                                i4 = -1;
                                                                i10 = 2;
                                                                break;
                                                            case 3:
                                                                i4 = -1;
                                                                i10 = 3;
                                                                break;
                                                            case 4:
                                                                i4 = -1;
                                                                i10 = 4;
                                                                break;
                                                            case 5:
                                                                i4 = -1;
                                                                i10 = 5;
                                                                break;
                                                            case 6:
                                                                i4 = -1;
                                                                i10 = 6;
                                                                break;
                                                            default:
                                                                i4 = -1;
                                                                i10 = -1;
                                                                break;
                                                        }
                                                        if (i10 != i4) {
                                                            return new Pair(Integer.valueOf(i10), 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = 20;
                                    }
                                }
                                i4 = -1;
                                if (i10 != i4) {
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            vz1.C("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        vz1.C("Ignoring malformed MP4A codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                    break;
                case 6:
                    Pair pair = new Pair(num3, num3);
                    if (split.length < 3) {
                        vz1.C("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                    } catch (NumberFormatException unused4) {
                        vz1.C("Ignoring malformed H263 codec string: ", str, "CodecSpecificDataUtil");
                        return pair;
                    }
                case 7:
                    if (split.length >= 3) {
                        try {
                            int parseInt7 = Integer.parseInt(split[1]);
                            int parseInt8 = Integer.parseInt(split[2]);
                            int i11 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i11 == -1) {
                                dfi.o(parseInt7, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                return null;
                            }
                            if (parseInt8 == 10) {
                                i5 = -1;
                                i6 = 1;
                            } else if (parseInt8 == 11) {
                                i5 = -1;
                                i6 = 2;
                            } else if (parseInt8 == 20) {
                                i5 = -1;
                                i6 = 4;
                            } else if (parseInt8 != 21) {
                                if (parseInt8 != 30) {
                                    if (parseInt8 == 31) {
                                        i6 = 32;
                                    } else if (parseInt8 == 40) {
                                        i6 = 64;
                                    } else if (parseInt8 == 41) {
                                        i6 = 128;
                                    } else if (parseInt8 == 50) {
                                        i6 = 256;
                                    } else if (parseInt8 != 51) {
                                        switch (parseInt8) {
                                            case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                                                i6 = 2048;
                                                break;
                                            case 61:
                                                i6 = 4096;
                                                break;
                                            case 62:
                                                i6 = 8192;
                                                break;
                                            default:
                                                i5 = -1;
                                                i6 = -1;
                                                break;
                                        }
                                    } else {
                                        i6 = 512;
                                    }
                                }
                                i5 = -1;
                            } else {
                                i5 = -1;
                                i6 = 8;
                            }
                            if (i6 != i5) {
                                return new Pair(Integer.valueOf(i11), Integer.valueOf(i6));
                            }
                            dfi.o(parseInt8, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                            return null;
                        } catch (NumberFormatException unused5) {
                            vz1.C("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        vz1.C("Ignoring malformed VP9 codec string: ", str, "CodecSpecificDataUtil");
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        Integer valueOf = Integer.valueOf(RemoteCameraConfig.Mic.BUFFER_SIZE);
        if (split.length < 3) {
            vz1.C("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = ir4.c.matcher(split[1]);
        if (!matcher.matches()) {
            vz1.C("Ignoring malformed Dolby Vision codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group == null) {
            num = 8;
        } else {
            switch (group.hashCode()) {
                case 1536:
                    num = 8;
                    if (group.equals("00")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        num = 8;
                        c2 = 1;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        num = 8;
                        c2 = 2;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        num = 8;
                        c2 = 3;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        num = 8;
                        c2 = 4;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        num = 8;
                        c2 = 5;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        num = 8;
                        c2 = 6;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        num = 8;
                        c2 = 7;
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        num = 8;
                        c2 = '\b';
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        num = 8;
                        c2 = '\t';
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        num = 8;
                        c2 = '\n';
                        break;
                    }
                    num = 8;
                    c2 = 65535;
                    break;
                default:
                    num = 8;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    num2 = num3;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = num;
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
                    num2 = valueOf;
                    break;
                case '\n':
                    num2 = 1024;
                    break;
            }
            if (num2 != null) {
                vz1.C("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str3 = split[2];
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case 1537:
                        if (str3.equals("01")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1538:
                        if (str3.equals("02")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1539:
                        if (str3.equals("03")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1540:
                        if (str3.equals("04")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1541:
                        if (str3.equals("05")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1542:
                        if (str3.equals("06")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1543:
                        if (str3.equals("07")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1544:
                        if (str3.equals("08")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1545:
                        if (str3.equals("09")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1567:
                        if (str3.equals("10")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1568:
                        if (str3.equals("11")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1569:
                        if (str3.equals("12")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1570:
                        if (str3.equals("13")) {
                            c3 = '\f';
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = num;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case '\b':
                        num3 = 256;
                        break;
                    case '\t':
                        num3 = valueOf;
                        break;
                    case '\n':
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case '\f':
                        num3 = 4096;
                        break;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                vz1.C("Unknown Dolby Vision level string: ", str3, "CodecSpecificDataUtil");
                return null;
            }
            num3 = null;
            if (num3 == null) {
            }
        }
        num2 = null;
        if (num2 != null) {
        }
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        synchronized (zjh.class) {
            try {
                vjh vjhVar = new vjh(str, z, z2);
                HashMap hashMap = a;
                List list = (List) hashMap.get(vjhVar);
                if (list != null) {
                    return list;
                }
                ArrayList f = f(vjhVar, new j4x(z, z2, str.equals("video/mv-hevc")));
                if (z && f.isEmpty() && dvt.a <= 23) {
                    f = f(vjhVar, new e88(27));
                    if (!f.isEmpty()) {
                        vq1.n0("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((mih) f.get(0)).a);
                    }
                }
                a(str, f);
                yde v = yde.v(f);
                hashMap.put(vjhVar, v);
                return v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:11:0x0138, B:12:0x0035, B:15:0x0040, B:50:0x0111, B:53:0x0119, B:55:0x011f, B:58:0x0140, B:59:0x0161), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(vjh vjhVar, xjh xjhVar) {
        boolean z;
        String str;
        int i;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean d;
        boolean l;
        boolean z2;
        int i2;
        vjh vjhVar2 = vjhVar;
        boolean z3 = vjhVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = vjhVar2.a;
            int o = xjhVar.o();
            boolean A = xjhVar.A();
            int i3 = 0;
            while (i3 < o) {
                MediaCodecInfo a2 = xjhVar.a(i3);
                int i4 = dvt.a;
                if (i4 < 29 || !a2.isAlias()) {
                    String name = a2.getName();
                    if (j(a2, name, A, str2)) {
                        int i5 = i3;
                        String c = c(a2, name, str2);
                        if (c != null) {
                            try {
                                capabilitiesForType = a2.getCapabilitiesForType(c);
                                d = xjhVar.d("tunneled-playback", c, capabilitiesForType);
                                l = xjhVar.l("tunneled-playback", capabilitiesForType);
                                z2 = vjhVar2.c;
                            } catch (Exception e) {
                                e = e;
                                z = A;
                                str = name;
                            }
                            if (z2 || !l) {
                                if (!z2 || d) {
                                    boolean d2 = xjhVar.d("secure-playback", c, capabilitiesForType);
                                    boolean l2 = xjhVar.l("secure-playback", capabilitiesForType);
                                    if (z3 || !l2) {
                                        if (!z3 || d2) {
                                            boolean z4 = true;
                                            boolean isHardwareAccelerated = i4 >= 29 ? a2.isHardwareAccelerated() : !k(a2, str2);
                                            z = A;
                                            try {
                                                boolean k = k(a2, str2);
                                                if (i4 >= 29) {
                                                    z4 = a2.isVendor();
                                                } else {
                                                    String M = ltg.M(a2.getName());
                                                    if (M.startsWith("omx.google.") || M.startsWith("c2.android.") || M.startsWith("c2.google.")) {
                                                        z4 = false;
                                                    }
                                                }
                                                if (!(z && z3 == d2) && (z || z3)) {
                                                    boolean z5 = isHardwareAccelerated;
                                                    i2 = i5;
                                                    boolean z6 = z4;
                                                    if (!z && d2) {
                                                        i = i2;
                                                        str = name;
                                                        try {
                                                            arrayList.add(mih.j(name + ".secure", str2, c, capabilitiesForType, z5, k, z6, true));
                                                            break;
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            if (dvt.a > 23) {
                                                            }
                                                            vq1.K("MediaCodecUtil", "Failed to query codec " + str + " (" + c + ")");
                                                            throw e;
                                                        }
                                                    }
                                                    i = i2;
                                                } else {
                                                    boolean z7 = isHardwareAccelerated;
                                                    i2 = i5;
                                                    try {
                                                        arrayList.add(mih.j(name, str2, c, capabilitiesForType, z7, k, z4, false));
                                                        i = i2;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        i = i2;
                                                        str = name;
                                                        if (dvt.a > 23 || arrayList.isEmpty()) {
                                                            vq1.K("MediaCodecUtil", "Failed to query codec " + str + " (" + c + ")");
                                                            throw e;
                                                        }
                                                        vq1.K("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                        i3 = i + 1;
                                                        vjhVar2 = vjhVar;
                                                        A = z;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                str = name;
                                                i = i5;
                                                if (dvt.a > 23) {
                                                }
                                                vq1.K("MediaCodecUtil", "Failed to query codec " + str + " (" + c + ")");
                                                throw e;
                                            }
                                            i3 = i + 1;
                                            vjhVar2 = vjhVar;
                                            A = z;
                                        }
                                    }
                                }
                            }
                        }
                        z = A;
                        i = i5;
                        i3 = i + 1;
                        vjhVar2 = vjhVar;
                        A = z;
                    }
                }
                z = A;
                i = i3;
                i3 = i + 1;
                vjhVar2 = vjhVar;
                A = z;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new wjh("Failed to query underlying media codecs", e5);
        }
    }

    public static qsn g(rih rihVar, dsc dscVar, boolean z, boolean z2) {
        List b = rihVar.b(dscVar.n, z, z2);
        String b2 = b(dscVar);
        List b3 = b2 == null ? qsn.e : rihVar.b(b2, z, z2);
        tde u = yde.u();
        u.c(b);
        u.c(b3);
        return u.f();
    }

    public static ArrayList h(dsc dscVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new ze0(3, new uvg(6, dscVar)));
        return arrayList;
    }

    public static mih i() {
        List e = e("audio/raw", false, false);
        if (e.isEmpty()) {
            return null;
        }
        return (mih) e.get(0);
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = dvt.a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str) {
        if (dvt.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (l5i.k(str)) {
            return true;
        }
        String M = ltg.M(mediaCodecInfo.getName());
        if (M.startsWith("arc.")) {
            return false;
        }
        if (M.startsWith("omx.google.") || M.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((M.startsWith("omx.sec.") && M.contains(".sw.")) || M.equals("omx.qcom.video.decoder.hevcswvdec") || M.startsWith("c2.android.") || M.startsWith("c2.google.")) {
            return true;
        }
        return (M.startsWith("omx.") || M.startsWith("c2.")) ? false : true;
    }
}
