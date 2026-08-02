package defpackage;

import android.text.TextUtils;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class l5i {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        c9n g;
        int e;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (g = g(str2)) != null && (e = g.e()) != 0 && e != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : dvt.j0(str)) {
            String e = e(str2);
            if (e != null && k(e)) {
                return e;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] j0 = dvt.j0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : j0) {
                if (str2.equals(e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int d(String str, String str2) {
        c9n g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (g = g(str2)) == null) {
                    return 0;
                }
                return g.e();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        c9n g;
        String str2 = null;
        if (str != null) {
            String M = ltg.M(str.trim());
            if (M.startsWith("avc1") || M.startsWith("avc3")) {
                return "video/avc";
            }
            if (M.startsWith("hev1") || M.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (M.startsWith("dvav") || M.startsWith("dva1") || M.startsWith("dvhe") || M.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (M.startsWith("av01")) {
                return "video/av01";
            }
            if (M.startsWith("vp9") || M.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (M.startsWith("vp8") || M.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (M.startsWith("mp4a")) {
                if (M.startsWith("mp4a.") && (g = g(M)) != null) {
                    str2 = f(g.b);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (M.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (M.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (M.startsWith("ac-3") || M.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (M.startsWith("ec-3") || M.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (M.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (M.startsWith("ac-4") || M.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (M.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (M.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (M.startsWith("dtsh") || M.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (M.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (M.startsWith("opus")) {
                return "audio/opus";
            }
            if (M.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (M.startsWith("flac")) {
                return "audio/flac";
            }
            if (M.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (M.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (M.contains("cea708")) {
                return "application/cea-708";
            }
            if (M.contains("eia608") || M.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                l1j.f();
                return null;
            }
        }
        return null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static c9n g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new c9n(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 8);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        l1j.f();
        return 0;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : dvt.j0(str)) {
            String e = e(str2);
            if (e != null && o(e)) {
                return e;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return CameraProperty.AUDIO.equals(h(str));
    }

    public static boolean l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean m(String str) {
        return "image".equals(h(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean n(String str) {
        return "text".equals(h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        String M;
        if (str == null) {
            return null;
        }
        M = ltg.M(str);
        M.getClass();
        switch (M) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return M;
        }
    }
}
