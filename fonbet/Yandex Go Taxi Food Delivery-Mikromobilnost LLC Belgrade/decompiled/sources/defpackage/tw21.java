package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.ybsdk.widgets.common.BlendingGradientView;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes.dex */
public abstract class tw21 {
    public static final int a;
    public static final String b;
    public static final byte[] c;
    public static final long[] d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static HashMap i;
    public static final String[] j;
    public static final String[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        b = unr0.m(i2, Extension.FIX_SPACE, oyr.w(Build.DEVICE, Extension.FIX_SPACE, Build.MODEL, Extension.FIX_SPACE, Build.MANUFACTURER));
        c = new byte[0];
        d = new long[0];
        e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        g = Pattern.compile("%([A-Fa-f0-9]{2})");
        h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, HProv.PP_DELETE_SAVED_PASSWD, Constants.VPN_TRAFFIC, 108, HProv.PP_SET_PIN, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, HProv.PP_LICENSE, BlendingGradientView.BASE_ALPHA, PollMessageDraft.MAX_ANSWER_LENGTH, 139, 130, HProv.PP_ENUM_CONTAINER_EXTENSION, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 175, 166, 161, SubsamplingScaleImageView.ORIENTATION_180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, MSException.ERROR_MORE_DATA, 183, 176, 185, 190, HProv.PP_REFCOUNT, HProv.PP_EXPORT_CSP, 165, 162, 143, HProv.PP_LCD_QUERY, HProv.PP_SECURITY_LEVEL, HProv.PP_CONTAINER_EXTENSION_DEL, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, HProv.PP_CACHE_SIZE, BuildConfig.API_LEVEL, HProv.PP_DELETE_KEYSET, 122, HProv.PP_ENUM_LOG, 142, HProv.PP_CONTAINER_DEFAULT, 128, 149, HProv.PP_CONTAINER_STATUS, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, MSException.ERROR_BUSY, HProv.PP_HANDLE_COUNT, 164, 249, 254, 247, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 229, 226, 235, 236, 193, 198, 207, 200, 221, HProv.PP_AUTH_INFO, 211, 212, 105, 110, 103, 96, HProv.PP_NK_SYNC, 114, HProv.PP_PASSWD_TERM, HProv.PP_SAME_MEDIA, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, HProv.PP_INFO, 113, 120, HProv.PP_VERSION_TIMESTAMP, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, HProv.PP_VERSION_EX, 141, HProv.PP_CONTAINER_EXTENSION, HProv.PP_FAST_CODE, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int B(String str) {
        String[] split;
        int length;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static String C(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        ny61.k();
        return null;
    }

    public static long D(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long E(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int F(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static a G(int i2, int i3, int i4) {
        f7s f7sVar = new f7s();
        f7sVar.d("audio/raw");
        f7sVar.b(i3);
        f7sVar.e(i4);
        f7sVar.c(i2);
        return f7sVar.a();
    }

    public static long H(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static String I(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            lk91.f("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String K(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return kju0.j;
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? oyr.j(i2, "custom (", Extension.C_BRAKE) : "?";
        }
    }

    public static boolean L(zxc0 zxc0Var) {
        if (zxc0Var == null || !zxc0Var.isCommandAvailable(1)) {
            return false;
        }
        zxc0Var.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean M(zxc0 zxc0Var) {
        boolean z = false;
        if (zxc0Var == null) {
            return false;
        }
        int playbackState = zxc0Var.getPlaybackState();
        if (playbackState != 1 || !zxc0Var.isCommandAvailable(2)) {
            if (playbackState == 4 && zxc0Var.isCommandAvailable(4)) {
                zxc0Var.seekToDefaultPosition();
            }
            if (zxc0Var.isCommandAvailable(1)) {
                return z;
            }
            zxc0Var.play();
            return true;
        }
        zxc0Var.prepare();
        z = true;
        if (zxc0Var.isCommandAvailable(1)) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r0.equals("m3u8") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int N(Uri uri) {
        int i2;
        String scheme = uri.getScheme();
        char c2 = 3;
        if (scheme != null && (f0b1.f("rtsp", scheme) || f0b1.f("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String g2 = f0b1.g(lastPathSegment.substring(lastIndexOf + 1));
                g2.getClass();
                switch (g2.hashCode()) {
                    case 104579:
                        if (g2.equals("ism")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 108321:
                        if (g2.equals("mpd")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3242057:
                        if (g2.equals("isml")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3299913:
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                    case 2:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 0;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
                if (i2 != 4) {
                    return i2;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = h.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group != null) {
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 4;
    }

    public static int O(Uri uri, String str) {
        if (str == null) {
            return N(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean P(ef90 ef90Var, ef90 ef90Var2, Inflater inflater) {
        if (ef90Var.a() <= 0) {
            return false;
        }
        if (ef90Var2.b() < ef90Var.a()) {
            ef90Var2.c(ef90Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(ef90Var.d(), ef90Var.e(), ef90Var.a());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(ef90Var2.d(), i2, ef90Var2.b() - i2);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i2 == ef90Var2.b()) {
                        ef90Var2.c(ef90Var2.b() * 2);
                    }
                } else {
                    ef90Var2.J(i2);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void Q(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean R(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean S(Context context) {
        int i2 = a;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (f0b1.f(str, "moto g(20)") || f0b1.f(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && f0b1.f(Build.MODEL, "sm-x200");
    }

    public static boolean T(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean U(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void V(ArrayList arrayList, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(arrayList.remove(i2 + i5));
        }
        arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
    }

    public static long W(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String X(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', LicenseUtility.SEPARATOR);
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String g2 = f0b1.g(str);
        int i2 = 0;
        String str2 = g2.split("-", 2)[0];
        if (i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = j;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap.put(strArr[i3], strArr[i3 + 1]);
            }
            i = hashMap;
        }
        String str4 = (String) i.get(str2);
        if (str4 != null) {
            g2 = str4.concat(g2.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !CoreConstants.PushMessage.SERVICE_TYPE.equals(str2) && !"zh".equals(str2)) {
            return g2;
        }
        while (true) {
            String[] strArr2 = k;
            if (i2 >= strArr2.length) {
                return g2;
            }
            if (g2.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + g2.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] Y(int i2, Object[] objArr) {
        d6z.l(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long Z(String str) {
        Matcher matcher = e.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.a(null, "Invalid date/time format: " + str);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    public static int a(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        return z ? binarySearch : i2;
    }

    public static void a0(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static int b(nlz nlzVar, long j2) {
        int d2 = nlzVar.d() - 1;
        int i2 = 0;
        while (i2 <= d2) {
            int i3 = (i2 + d2) >>> 1;
            if (nlzVar.c(i3) < j2) {
                i2 = i3 + 1;
            } else {
                d2 = i3 - 1;
            }
        }
        int i4 = d2 + 1;
        if (i4 < nlzVar.d() && nlzVar.c(i4) == j2) {
            return i4;
        }
        if (d2 == -1) {
            return 0;
        }
        return d2;
    }

    public static void b0(int i2, int i3, List list) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            w511.q();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static int c(List list, Long l2, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(list, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static long c0(int i2, long j2) {
        return e0(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static int d(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            i4 = z ? binarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static void d0(long j2, long[] jArr) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long c2 = ygb1.c(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = ygb1.c(jArr[i2], c2, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long c3 = ygb1.c(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = ygb1.f(jArr[i2], c3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = ygb1.c(1000000L, ygb1.c(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = f0(j4, 1000000L, j3, roundingMode);
                    i3++;
                    j2 = j3;
                } else {
                    jArr[i3] = ygb1.f(1000000L, ygb1.c(j4, j2, RoundingMode.UNNECESSARY));
                }
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static int e(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static long e0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? f0(j2, j3, j4, roundingMode) : ygb1.f(j3, ygb1.c(j2, j4, RoundingMode.UNNECESSARY)) : ygb1.c(j3, ygb1.c(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : ygb1.f(j2, ygb1.c(j3, j4, RoundingMode.UNNECESSARY)) : ygb1.c(j2, ygb1.c(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int f(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static long f0(long j2, long j3, long j4, RoundingMode roundingMode) {
        long f2 = ygb1.f(j2, j3);
        if (f2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && f2 != Long.MIN_VALUE) {
            return ygb1.c(f2, j4, roundingMode);
        }
        long d2 = ygb1.d(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long c2 = ygb1.c(j3, d2, roundingMode2);
        long c3 = ygb1.c(j4, d2, roundingMode2);
        long d3 = ygb1.d(Math.abs(j2), Math.abs(c3));
        long c4 = ygb1.c(j2, d3, roundingMode2);
        long c5 = ygb1.c(c3, d3, roundingMode2);
        long f3 = ygb1.f(c4, c2);
        if (f3 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && f3 != Long.MIN_VALUE) {
            return ygb1.c(f3, c5, roundingMode);
        }
        double d4 = c4 * (c2 / c5);
        if (d4 > 9.223372036854776E18d) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        if (d4 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zk91.j(d4, roundingMode);
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean g0(zxc0 zxc0Var, boolean z) {
        return zxc0Var == null || !zxc0Var.getPlayWhenReady() || zxc0Var.getPlaybackState() == 1 || zxc0Var.getPlaybackState() == 4 || (z && zxc0Var.getPlaybackSuppressionReason() != 0);
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static String[] h0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static void i0(Context context, Intent intent) {
        if (a >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static String j0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i2] & PKIBody._CCP, 16));
        }
        return sb.toString();
    }

    public static boolean k(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static long k0(int i2, int i3) {
        return (i3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) << 32);
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static long l0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static int m(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = l[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        d6z.z(myLooper);
        return new Handler(myLooper, callback);
    }

    public static Handler o(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper, callback);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int q(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static AudioFormat r(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int s(int i2) {
        int i3 = a;
        if (i2 == 10) {
            return i3 >= 32 ? 737532 : 6396;
        }
        if (i2 == 12) {
            return 743676;
        }
        if (i2 == 24) {
            return i3 >= 32 ? 67108860 : 0;
        }
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int t(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    w511.q();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static byte[] u(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static int v(int i2, String str) {
        int i3 = 0;
        for (String str2 : h0(str)) {
            if (i2 == eh20.j(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static String w(int i2, String str) {
        String[] h0 = h0(str);
        if (h0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : h0) {
            if (i2 == eh20.j(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String x(String str) {
        String[] h0 = h0(str);
        if (h0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : h0) {
            if (2 != eh20.j(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String y(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return f0b1.h(networkCountryIso);
            }
        }
        return f0b1.h(Locale.getDefault().getCountry());
    }

    public static Point z(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        int displayId = display.getDisplayId();
        int i2 = a;
        if (displayId == 0 && U(context)) {
            String J = i2 < 28 ? J("sys.display-size") : J("vendor.display-size");
            if (!TextUtils.isEmpty(J)) {
                try {
                    String[] split = J.trim().split(RemoteBioParameters.X, -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                lk91.e("Util", "Invalid display size: " + J);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (i2 < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }
}
