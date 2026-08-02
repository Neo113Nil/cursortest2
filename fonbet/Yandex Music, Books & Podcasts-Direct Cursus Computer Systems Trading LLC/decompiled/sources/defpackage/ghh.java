package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.joda.time.IllegalFieldValueException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.data.CoverInfo$CoverType;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class ghh {
    public static final wn5 a = new wn5(new h3(16), -1104558201, false);
    public static final wn5 b = new wn5(new jo5(3), 60934911, false);
    public static final wn5 c = new wn5(new jo5(4), 2038030326, false);
    public static final wn5 d = new wn5(new jo5(5), 342006967, false);
    public static final wn5 e;
    public static final wn5 f;
    public static final uec g;
    public static String h = "https://yandex.ru/clck/click";
    public static aaw i;

    static {
        new wn5(new io5(8), -370954866, false);
        e = new wn5(new po5(14), -1236907479, false);
        f = new wn5(new ap5(23), 1041842450, false);
        g = new uec(0);
        i = new aaw(25);
    }

    public static final wn5 A(yci yciVar) {
        return new wn5(new wk0(6, yciVar), -1586257396, true);
    }

    public static final CoverInfo$CoverType B(String str) {
        str.getClass();
        String upperCase = StringsKt.t0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int hashCode = upperCase.hashCode();
        if (hashCode != -2015027062) {
            if (hashCode != 79210) {
                if (hashCode == 1748463920 && upperCase.equals("UNDEFINED")) {
                    return CoverInfo$CoverType.UNDEFINED;
                }
            } else if (upperCase.equals("PIC")) {
                return CoverInfo$CoverType.PIC;
            }
        } else if (upperCase.equals("MOSAIC")) {
            return CoverInfo$CoverType.MOSAIC;
        }
        v3w.l("Unknown cover type: ", str, 7, null, null);
        return CoverInfo$CoverType.UNDEFINED;
    }

    public static final vm C(o0k o0kVar, o0k o0kVar2) {
        o0kVar.getClass();
        o0kVar2.getClass();
        return new vm(o0kVar, o0kVar2);
    }

    public static long D(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder l = tlm.l(j, "The calculation caused an overflow: ", " + ");
        l.append(j2);
        throw new ArithmeticException(l.toString());
    }

    public static int E(long j) {
        if (-2147483648L > j || j > 2147483647L) {
            throw new ArithmeticException(dfi.d(j, "Value cannot fit in an int: "));
        }
        return (int) j;
    }

    public static final int F(mbp mbpVar, int i2) {
        int i3;
        int[] iArr = mbpVar.f;
        int i4 = i2 + 1;
        int length = mbpVar.e.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final void G(y yVar, long j) {
        yVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        fxf.Q(yVar, o6m.b(wjb.FeatureOnboardingScreen, null, 6), saiVar, null, pd.t(new qzm[0]), null, new wn5(new lw4(j, saiVar), 1324185596, true), 20);
    }

    public static final void H(wms wmsVar, Object obj, Object obj2) {
        String concat;
        mhb mhbVar;
        wmsVar.getClass();
        obj.getClass();
        obj2.getClass();
        String str = S(obj) + ' ' + wmsVar + ' ' + S(obj2);
        boolean equals = obj.getClass().equals(obj2.getClass());
        mhb mhbVar2 = mhb.ARRAY;
        mhb mhbVar3 = mhb.DICT;
        mhb mhbVar4 = mhb.URL;
        mhb mhbVar5 = mhb.COLOR;
        mhb mhbVar6 = mhb.DATETIME;
        mhb mhbVar7 = mhb.STRING;
        mhb mhbVar8 = mhb.BOOLEAN;
        mhb mhbVar9 = mhb.NUMBER;
        mhb mhbVar10 = mhb.INTEGER;
        if (equals) {
            if (obj instanceof Long) {
                mhbVar2 = mhbVar10;
            } else if (obj instanceof Double) {
                mhbVar2 = mhbVar9;
            } else if (obj instanceof Boolean) {
                mhbVar2 = mhbVar8;
            } else if (obj instanceof String) {
                mhbVar2 = mhbVar7;
            } else if (obj instanceof vc7) {
                mhbVar2 = mhbVar6;
            } else if (obj instanceof c85) {
                mhbVar2 = mhbVar5;
            } else if (obj instanceof lpt) {
                mhbVar2 = mhbVar4;
            } else if (obj instanceof JSONObject) {
                mhbVar2 = mhbVar3;
            } else if (!(obj instanceof JSONArray)) {
                throw new khb("Unable to find type for ".concat(obj.getClass().getName()), (Throwable) null);
            }
            concat = mhbVar2.a.concat(" type");
        } else {
            StringBuilder sb = new StringBuilder("different types: ");
            if (obj instanceof Long) {
                mhbVar = mhbVar10;
            } else if (obj instanceof Double) {
                mhbVar = mhbVar9;
            } else if (obj instanceof Boolean) {
                mhbVar = mhbVar8;
            } else if (obj instanceof String) {
                mhbVar = mhbVar7;
            } else if (obj instanceof vc7) {
                mhbVar = mhbVar6;
            } else if (obj instanceof c85) {
                mhbVar = mhbVar5;
            } else if (obj instanceof lpt) {
                mhbVar = mhbVar4;
            } else if (obj instanceof JSONObject) {
                mhbVar = mhbVar3;
            } else {
                if (!(obj instanceof JSONArray)) {
                    throw new khb("Unable to find type for ".concat(obj.getClass().getName()), (Throwable) null);
                }
                mhbVar = mhbVar2;
            }
            sb.append(mhbVar.a);
            sb.append(" and ");
            if (obj2 instanceof Long) {
                mhbVar2 = mhbVar10;
            } else if (obj2 instanceof Double) {
                mhbVar2 = mhbVar9;
            } else if (obj2 instanceof Boolean) {
                mhbVar2 = mhbVar8;
            } else if (obj2 instanceof String) {
                mhbVar2 = mhbVar7;
            } else if (obj2 instanceof vc7) {
                mhbVar2 = mhbVar6;
            } else if (obj2 instanceof c85) {
                mhbVar2 = mhbVar5;
            } else if (obj2 instanceof lpt) {
                mhbVar2 = mhbVar4;
            } else if (obj2 instanceof JSONObject) {
                mhbVar2 = mhbVar3;
            } else if (!(obj2 instanceof JSONArray)) {
                throw new khb("Unable to find type for ".concat(obj2.getClass().getName()), (Throwable) null);
            }
            sb.append(mhbVar2.a);
            concat = sb.toString();
        }
        I(str, "Operator '" + wmsVar + "' cannot be applied to " + concat + '.', null);
        throw null;
    }

    public static final void I(String str, String str2, Exception exc) {
        str.getClass();
        throw new khb(hrg.r("Failed to evaluate [", str, "]. ", str2), exc);
    }

    public static final void J(String str, List list, String str2, IllegalArgumentException illegalArgumentException) {
        str.getClass();
        list.getClass();
        I(v(str, list), str2, illegalArgumentException);
        throw null;
    }

    public static final void K(y6 y6Var, Number number) {
        y6.q(y6Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final u51 L(ljm ljmVar) {
        String uri;
        ljmVar.getClass();
        String str = ljmVar.a;
        String str2 = ljmVar.b;
        CoverPath coverPath = ljmVar.c;
        u9b u9bVar = null;
        if (coverPath != null && (uri = coverPath.getUri()) != null) {
            u9bVar = new u9b(uri, null, null);
        }
        return new u51(str, str2, u9bVar, null, null);
    }

    public static final zp2 M(u51 u51Var) {
        u51Var.getClass();
        String str = u51Var.a;
        String str2 = u51Var.b;
        u9b u9bVar = u51Var.c;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        return new zp2(str, str2, null, null, null, null, kg5.M(u9bVar, webPath$Storage), kg5.M(u51Var.d, webPath$Storage), 60);
    }

    public static byte[] N(ym3 ym3Var) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(RemoteCameraConfig.Notification.ID, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = ym3Var.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return p(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = min * (min < 4096 ? 4 : 2);
            min = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (ym3Var.read() == -1) {
            return p(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final u51 O(zp2 zp2Var) {
        String uri;
        String uri2;
        zp2Var.getClass();
        String str = zp2Var.a;
        String str2 = zp2Var.b;
        CoverPath coverPath = zp2Var.g;
        u9b u9bVar = null;
        u9b u9bVar2 = (coverPath == null || (uri2 = coverPath.getUri()) == null) ? null : new u9b(uri2, null, null);
        CoverPath coverPath2 = zp2Var.h;
        if (coverPath2 != null && (uri = coverPath2.getUri()) != null) {
            u9bVar = new u9b(uri, null, null);
        }
        return new u51(str, str2, u9bVar2, u9bVar, new gd6((List) zp2Var.j.getValue(), (List) zp2Var.i.getValue(), true));
    }

    public static u51 P(c01 c01Var) {
        c01Var.getClass();
        String str = c01Var.a;
        String str2 = c01Var.b;
        String uri = c01Var.k.getUri();
        u9b u9bVar = uri != null ? new u9b(uri, null, null) : null;
        String uri2 = c01Var.l.getUri();
        return new u51(str, str2, u9bVar, uri2 != null ? new u9b(uri2, null, null) : null, new gd6((List) c01Var.t.getValue(), (List) c01Var.s.getValue(), c01Var.e));
    }

    public static final wjb Q(n70 n70Var) {
        n70Var.getClass();
        if (!(n70Var instanceof j70)) {
            if (n70Var instanceof k70) {
                return wjb.Link;
            }
            if (n70Var instanceof i70) {
                return wjb.BottomsheetScreen;
            }
            if (n70Var.equals(m70.a)) {
                return wjb.TrailerScreen;
            }
            if (n70Var instanceof l70) {
                return wjb.valueOf("DislikesScreen");
            }
            b6e.s();
            return null;
        }
        d70 d70Var = ((j70) n70Var).a;
        d70Var.getClass();
        switch (d70Var.b.ordinal()) {
            case 0:
                return wjb.AlbumScreen;
            case 1:
                dfi.r("Unreachable code, pre-save has no separate screen in app", "EvgenAnalyticsExt");
                return wjb.AlbumScreen;
            case 2:
                return wjb.ArtistScreen;
            case 3:
                return wjb.Link;
            case 4:
                return wjb.PlaylistScreen;
            case 5:
                dfi.r("Unreachable code, wave cannot be converted to screen", "EvgenAnalyticsExt");
                return wjb.Link;
            case 6:
                return wjb.Link;
            case 7:
                dfi.r("Unreachable code, track cannot be converted to screen", "EvgenAnalyticsExt");
                return wjb.Link;
            case 8:
                return wjb.Link;
            case 9:
                return wjb.VideoScreen;
            case 10:
                dfi.r("Unreachable code, text cannot be converted to screen", "EvgenAnalyticsExt");
                return wjb.Link;
            case 11:
                return wjb.ConcertScreen;
            case 12:
                return wjb.ConcertPurchaseScreen;
            case 13:
                return wjb.MusicHistoryScreen;
            case 14:
                return wjb.Link;
            case 15:
                dfi.r("Unreachable code, text cannot be converted to screen", "EvgenAnalyticsExt");
                return wjb.Link;
            case 16:
                dfi.r("Unreachable code, text cannot be converted to screen", "EvgenAnalyticsExt");
                return wjb.Link;
            case 17:
                return wjb.CollectionLandingScreen;
            case 18:
                return wjb.DownloadedContentScreen;
            case 19:
                return wjb.PlayerScreen;
            default:
                b6e.s();
                return null;
        }
    }

    public static final pkb R(c70 c70Var) {
        c70Var.getClass();
        switch (c70Var.ordinal()) {
            case 0:
                return pkb.Album;
            case 1:
                return pkb.UpcomingAlbum;
            case 2:
                return pkb.Artist;
            case 3:
                return pkb.Banner;
            case 4:
                return pkb.Playlist;
            case 5:
                return pkb.Wave;
            case 6:
            case 13:
                return pkb.Shortcut;
            case 7:
                return pkb.Track;
            case 8:
                return pkb.Feature;
            case 9:
                return pkb.Video;
            case 10:
                return pkb.Text;
            case 11:
                return pkb.Concert;
            case 12:
                return pkb.Concert;
            case 14:
                return pkb.Donation;
            case 15:
                return pkb.Generative;
            case 16:
                return pkb.NonApplicable;
            case 17:
                return pkb.NonApplicable;
            case 18:
                return pkb.NonApplicable;
            case 19:
                return pkb.NonApplicable;
            default:
                b6e.s();
                return null;
        }
    }

    public static final String S(Object obj) {
        obj.getClass();
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        return "'" + obj + '\'';
    }

    public static final String T(List list) {
        list.getClass();
        return CollectionsKt.X(list, ", ", null, null, lhb.s, 30);
    }

    public static final String U(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) z(-1, str2));
    }

    public static void V(xc7 xc7Var, int i2, int i3, int i4) {
        if (i2 < i3 || i2 > i4) {
            throw new IllegalFieldValueException(xc7Var.q(), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ru ruVar, Function0 function0, yci yciVar, ges gesVar, Function2 function2, e9g e9gVar, Function0 function02, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        ges gesVar2;
        int i5;
        Function2 function22;
        int i6;
        int i7;
        Function0 function03;
        ges gesVar3;
        e9g e9gVar2;
        yci yciVar3;
        Function2 function23;
        Function0 function04;
        oq5 oq5Var;
        e9g e9gVar3;
        yci yciVar4;
        Function0 function05;
        Function2 function24;
        xmn r;
        int i8;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1534005624);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var2.f(ruVar) : oq5Var2.h(ruVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    gesVar2 = gesVar;
                    if (oq5Var2.f(gesVar2)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    gesVar2 = gesVar;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                gesVar2 = gesVar;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function22 = function2;
                i4 |= oq5Var2.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                int i10 = 196608;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        i10 = oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i2) == 0) {
                        function03 = function02;
                        i4 |= oq5Var2.h(function03) ? 1048576 : 524288;
                        if ((599187 & i4) == 599186 || !oq5Var2.z()) {
                            oq5Var2.U();
                            if ((i2 & 1) != 0 || oq5Var2.y()) {
                                yci yciVar5 = i9 != 0 ? vci.a : yciVar2;
                                if ((i3 & 8) != 0) {
                                    h6g h6gVar = nu0.a;
                                    h6g h6gVar2 = h6g.c;
                                    gesVar3 = nu0.j();
                                    i4 &= -7169;
                                } else {
                                    gesVar3 = gesVar2;
                                }
                                if (i5 != 0) {
                                    function22 = saf.a;
                                }
                                e9gVar2 = i6 != 0 ? e9g.a : e9gVar;
                                if (i7 != 0) {
                                    yciVar3 = yciVar5;
                                    function04 = null;
                                    function23 = function22;
                                } else {
                                    yciVar3 = yciVar5;
                                    function23 = function22;
                                    function04 = function03;
                                }
                            } else {
                                oq5Var2.S();
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                yciVar3 = yciVar2;
                                gesVar3 = gesVar2;
                                function23 = function22;
                                function04 = function03;
                                e9gVar2 = e9gVar;
                            }
                            oq5Var2.q();
                            int i11 = i4 >> 3;
                            oq5Var = oq5Var2;
                            ngg.i(function0, yciVar3, ild.C(910627386, new nu(ruVar, e9gVar2, 0), oq5Var2), false, 0L, function04, function23, 0.0f, null, ild.C(-489196461, new x3(6, ruVar, e9gVar2, gesVar3), oq5Var2), oq5Var, (i11 & 458752) | (i11 & 14) | 805306752 | (i11 & 112) | ((i4 << 6) & 3670016), 408);
                            e9gVar3 = e9gVar2;
                            yciVar4 = yciVar3;
                            function05 = function04;
                            function24 = function23;
                        } else {
                            oq5Var2.S();
                            e9gVar3 = e9gVar;
                            oq5Var = oq5Var2;
                            yciVar4 = yciVar2;
                            gesVar3 = gesVar2;
                            function24 = function22;
                            function05 = function03;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new ou(ruVar, function0, yciVar4, gesVar3, function24, e9gVar3, function05, i2, i3);
                            return;
                        }
                        return;
                    }
                    function03 = function02;
                    if ((599187 & i4) == 599186) {
                    }
                    oq5Var2.U();
                    if ((i2 & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    oq5Var2.q();
                    int i112 = i4 >> 3;
                    oq5Var = oq5Var2;
                    ngg.i(function0, yciVar3, ild.C(910627386, new nu(ruVar, e9gVar2, 0), oq5Var2), false, 0L, function04, function23, 0.0f, null, ild.C(-489196461, new x3(6, ruVar, e9gVar2, gesVar3), oq5Var2), oq5Var, (i112 & 458752) | (i112 & 14) | 805306752 | (i112 & 112) | ((i4 << 6) & 3670016), 408);
                    e9gVar3 = e9gVar2;
                    yciVar4 = yciVar3;
                    function05 = function04;
                    function24 = function23;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                i4 |= i10;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                function03 = function02;
                if ((599187 & i4) == 599186) {
                }
                oq5Var2.U();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                oq5Var2.q();
                int i1122 = i4 >> 3;
                oq5Var = oq5Var2;
                ngg.i(function0, yciVar3, ild.C(910627386, new nu(ruVar, e9gVar2, 0), oq5Var2), false, 0L, function04, function23, 0.0f, null, ild.C(-489196461, new x3(6, ruVar, e9gVar2, gesVar3), oq5Var2), oq5Var, (i1122 & 458752) | (i1122 & 14) | 805306752 | (i1122 & 112) | ((i4 << 6) & 3670016), 408);
                e9gVar3 = e9gVar2;
                yciVar4 = yciVar3;
                function05 = function04;
                function24 = function23;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            function22 = function2;
            i6 = i3 & 32;
            int i102 = 196608;
            if (i6 == 0) {
            }
            i4 |= i102;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            function03 = function02;
            if ((599187 & i4) == 599186) {
            }
            oq5Var2.U();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            oq5Var2.q();
            int i11222 = i4 >> 3;
            oq5Var = oq5Var2;
            ngg.i(function0, yciVar3, ild.C(910627386, new nu(ruVar, e9gVar2, 0), oq5Var2), false, 0L, function04, function23, 0.0f, null, ild.C(-489196461, new x3(6, ruVar, e9gVar2, gesVar3), oq5Var2), oq5Var, (i11222 & 458752) | (i11222 & 14) | 805306752 | (i11222 & 112) | ((i4 << 6) & 3670016), 408);
            e9gVar3 = e9gVar2;
            yciVar4 = yciVar3;
            function05 = function04;
            function24 = function23;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function22 = function2;
        i6 = i3 & 32;
        int i1022 = 196608;
        if (i6 == 0) {
        }
        i4 |= i1022;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        function03 = function02;
        if ((599187 & i4) == 599186) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        oq5Var2.q();
        int i112222 = i4 >> 3;
        oq5Var = oq5Var2;
        ngg.i(function0, yciVar3, ild.C(910627386, new nu(ruVar, e9gVar2, 0), oq5Var2), false, 0L, function04, function23, 0.0f, null, ild.C(-489196461, new x3(6, ruVar, e9gVar2, gesVar3), oq5Var2), oq5Var, (i112222 & 458752) | (i112222 & 14) | 805306752 | (i112222 & 112) | ((i4 << 6) & 3670016), 408);
        e9gVar3 = e9gVar2;
        yciVar4 = yciVar3;
        function05 = function04;
        function24 = function23;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, yci yciVar, e9g e9gVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        e9g e9gVar2;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1450046848);
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 32 : 16;
            i5 = i4 | 384;
            if ((i5 & 147) == 146 || !oq5Var.z()) {
                yci yciVar4 = i6 == 0 ? vci.a : yciVar2;
                e9g e9gVar3 = e9g.a;
                c9g.g(z, qo6.b, true, e9gVar3, yciVar4, false, null, oq5Var, (i5 & 14) | 432 | ((i5 << 3) & 7168) | ((i5 << 9) & 57344), 96);
                e9gVar2 = e9gVar3;
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                e9gVar2 = e9gVar;
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new qu(z, yciVar3, e9gVar2, i2, i3, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i5 = i4 | 384;
        if ((i5 & 147) == 146) {
        }
        if (i6 == 0) {
        }
        e9g e9gVar32 = e9g.a;
        c9g.g(z, qo6.b, true, e9gVar32, yciVar4, false, null, oq5Var, (i5 & 14) | 432 | ((i5 << 3) & 7168) | ((i5 << 9) & 57344), 96);
        e9gVar2 = e9gVar32;
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(cgv cgvVar, idv idvVar, Function1 function1, Function1 function12, lev levVar, kev kevVar, Function1 function13, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Object obj;
        cgvVar.getClass();
        idvVar.getClass();
        function1.getClass();
        function12.getClass();
        levVar.getClass();
        kevVar.getClass();
        function13.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1916047468);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(cgvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(idvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = function1;
            i3 |= oq5Var.h(obj) ? 256 : 128;
        } else {
            obj = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(levVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(kevVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.h(function13) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i3 |= oq5Var.g(true) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if ((i4 & 38347923) == 38347922 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = (WebView) function13.invoke(context);
                oq5Var.k0(K);
            }
            WebView webView = (WebView) K;
            Object[] objArr = {webView};
            Object K2 = oq5Var.K();
            if (K2 == obj2) {
                K2 = new dq5(webView);
                oq5Var.k0(K2);
            }
            dq5 dq5Var = (dq5) K2;
            Object K3 = oq5Var.K();
            if (K3 == obj2) {
                K3 = new cp5(7);
                oq5Var.k0(K3);
            }
            o2g.g0(objArr, dq5Var, (Function0) K3, oq5Var, 3120, 4);
            boolean booleanValue = ((Boolean) idvVar.c.getValue()).booleanValue();
            boolean h2 = oq5Var.h(webView);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj2) {
                K4 = new bq5(webView, 0);
                oq5Var.k0(K4);
            }
            pd.c(0, 0, oq5Var, (Function0) K4, booleanValue);
            boolean h3 = oq5Var.h(webView) | ((i4 & 112) == 32);
            Object K5 = oq5Var.K();
            if (h3 || K5 == obj2) {
                K5 = new eq5(idvVar, webView, null, 0);
                oq5Var.k0(K5);
            }
            gld.y(webView, idvVar, (Function2) K5, oq5Var);
            boolean h4 = oq5Var.h(webView);
            Object K6 = oq5Var.K();
            if (h4 || K6 == obj2) {
                K6 = new bq5(webView, 1);
                oq5Var.k0(K6);
            }
            Function0 function0 = (Function0) K6;
            boolean h5 = oq5Var.h(webView);
            Object K7 = oq5Var.K();
            if (h5 || K7 == obj2) {
                K7 = new bq5(webView, 2);
                oq5Var.k0(K7);
            }
            wyf.b(webView, function0, (Function0) K7, oq5Var, 0);
            Object o0 = szf.o0(function12, oq5Var);
            oq5Var.Z(1219396857);
            boolean h6 = oq5Var.h(webView) | oq5Var.f(o0) | oq5Var.h(webView);
            Object K8 = oq5Var.K();
            if (h6 || K8 == obj2) {
                K8 = new g3(19, webView, webView, o0);
                oq5Var.k0(K8);
            }
            gld.k(webView, (Function1) K8, oq5Var);
            oq5Var.p(false);
            levVar.a = cgvVar;
            levVar.b = idvVar;
            kevVar.a = cgvVar;
            bg3.a(yciVar, null, false, ild.C(-1774433154, new up(webView, obj, kevVar, levVar, 11), oq5Var), oq5Var, ((i4 >> 21) & 14) | 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bt4(cgvVar, idvVar, function1, function12, levVar, kevVar, function13, yciVar, i2, 1);
        }
    }

    public static final void d(n0s n0sVar, o3k o3kVar, Function1 function1, hq5 hq5Var, int i2) {
        mn0 mn0Var;
        boolean z;
        o3kVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1888364161);
        int i3 = i2 | (oq5Var.f(n0sVar) ? 4 : 2) | (oq5Var.f(o3kVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            lx0 lx0Var = qx0.e;
            vci vciVar = vci.a;
            yci d2 = d.d(a.o(vciVar, 0.0f, 12, 1), 1.0f);
            nho a2 = lho.a(lx0Var, b2c.k, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1598666879);
            int i5 = 0;
            for (Object obj : n0sVar.a) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    u75.n();
                    throw null;
                }
                x1s x1sVar = (x1s) obj;
                mn0 m0 = bkp.m0(x1sVar.b, rvf.M(x1sVar.a, oq5Var));
                if (o3kVar.j() == i5) {
                    mn0Var = m0;
                    z = true;
                } else {
                    mn0Var = m0;
                    z = false;
                }
                yci a3 = androidx.compose.ui.platform.a.a(vciVar, i5 == 0 ? "dislikes_tab_tracks" : "dislikes_tab_artists");
                boolean d3 = ((i3 & 112) == 32) | oq5Var.d(i5) | ((i3 & 896) == 256);
                Object K = oq5Var.K();
                if (d3 || K == gq5.a) {
                    K = new de(o3kVar, i5, function1, 10);
                    oq5Var.k0(K);
                }
                zwf.f(mn0Var, z, (Function0) K, a3, oq5Var, 0, 0);
                i5 = i6;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(n0sVar, o3kVar, function1, i2, 1);
        }
    }

    public static final void e(c cVar, List list, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        wn5 wn5Var2;
        yci yciVar3;
        cVar.getClass();
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1392667803);
        int i5 = i2 | (oq5Var.f(cVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= oq5Var.f(list) ? 32 : 16;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i5 | (oq5Var.f(yciVar2) ? 256 : 128);
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            yciVar3 = i6 != 0 ? vci.a : yciVar2;
            float A = w1g.A(cVar.e(), oq5Var);
            wn5Var2 = wn5Var;
            ild.k(list, d.d(yciVar3, 1.0f), vt0.c, vt0.a + (2 * A), 0, false, ild.C(-659418465, new bb1(wn5Var2, A, 1), oq5Var), oq5Var, ((i4 >> 3) & 14) | 100663296);
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(cVar, list, yciVar3, wn5Var2, i2, i3, 9);
        }
    }

    public static final void f(ztd ztdVar, Function0 function0, dib dibVar, yci yciVar, yci yciVar2, hq5 hq5Var, int i2) {
        yci yciVar3;
        yci yciVar4;
        yci u;
        boolean z;
        vci vciVar;
        boolean z2;
        ztdVar.getClass();
        function0.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1438250065);
        int i3 = i2 | (oq5Var.f(ztdVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(dibVar) ? 256 : 128) | 27648;
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            float f2 = 24;
            vci vciVar2 = vci.a;
            u = d.u(d.e(vciVar2, f2), b2c.l, (r2 & 2) == 0);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            hz2 hz2Var = b2c.l;
            lx0 lx0Var = qx0.e;
            float f3 = 4;
            yci a2 = androidx.compose.ui.platform.a.a(a.m(androidx.compose.foundation.a.e(xp3.u(vciVar2, ugo.a(f3)), ztdVar.d, null, null, function0, 6), f3), "artists");
            nho a3 = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            String str = ztdVar.b;
            if (str == null) {
                oq5Var.Z(970249545);
                oq5Var.p(false);
                vciVar = vciVar2;
                z2 = true;
            } else {
                oq5Var.Z(970249546);
                yci u2 = xp3.u(d.m(vciVar2, f2), ugo.a);
                kfh d3 = ug3.d(iz2Var, true);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, u2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    oq5Var.Z(576050768);
                    ug3.a(androidx.compose.foundation.a.b(vciVar2, c3x.h(4287221203L), vnj.i), oq5Var, 6);
                    z = false;
                    oq5Var.p(false);
                    vciVar = vciVar2;
                    z2 = true;
                } else {
                    z = false;
                    oq5Var.Z(576172660);
                    hs1 J = up6.J(oq5Var);
                    boolean h2 = oq5Var.h(dibVar) | oq5Var.f(J);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h2 || K == kjnVar) {
                        K = new ev5(dibVar, J, null, 1);
                        oq5Var.k0(K);
                    }
                    gld.w(oq5Var, dibVar, (Function2) K);
                    long j = ((dq0) oq5Var.j(eq0.a)).c.c;
                    boolean e2 = oq5Var.e(j);
                    Object K2 = oq5Var.K();
                    if (e2 || K2 == kjnVar) {
                        K2 = new w85(j);
                        oq5Var.k0(K2);
                    }
                    w85 w85Var = (w85) K2;
                    pce pceVar = new pce((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
                    pceVar.c = str;
                    up6.K(pceVar, J);
                    vciVar = vciVar2;
                    z2 = true;
                    p1g.b(pceVar.a(), null, null, w85Var, w85Var, w85Var, null, null, 0.0f, 0, oq5Var, 48, 0, 16324);
                    oq5Var.p(false);
                }
                oq5Var.p(z2);
                vz1.B(vciVar, 8, oq5Var, z);
            }
            zwf.i(((q9b) oq5Var.j(s9b.a)).d(oq5Var), ild.C(771000090, new nha(12, ztdVar), oq5Var), oq5Var, 48);
            oq5Var.p(z2);
            oq5Var.p(z2);
            yciVar3 = vciVar;
            yciVar4 = yciVar3;
        } else {
            oq5Var.S();
            yciVar3 = yciVar;
            yciVar4 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(ztdVar, function0, dibVar, yciVar3, yciVar4, i2);
        }
    }

    public static final c5f g(Number number, String str) {
        str.getClass();
        return new c5f("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) z(-1, str)));
    }

    public static final c5f h(mhp mhpVar) {
        mhpVar.getClass();
        return new c5f("Value of type '" + mhpVar.i() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + mhpVar.a() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final u4f i(int i2, String str) {
        if (i2 >= 0) {
            str = hrg.p("Unexpected JSON token at offset ", i2, ": ", str);
        }
        return new u4f(str);
    }

    public static final u4f j(String str, CharSequence charSequence, int i2) {
        charSequence.getClass();
        return i(i2, str + "\nJSON input: " + ((Object) z(i2, charSequence)));
    }

    public static float k(EdgeEffect edgeEffect, float f2, float f3, jx7 jx7Var) {
        float f4 = z0b.a;
        double density = jx7Var.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d2 = z0b.a * density;
        float exp = (float) (Math.exp((z0b.b / z0b.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (exp > (i2 >= 31 ? rf0.l(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int b2 = eeh.b(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(b2);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(b2);
        }
        return f2;
    }

    public static void l(String str, Number number, Number number2) {
        if (number.equals(number2)) {
            return;
        }
        t(number, number2, str);
    }

    public static final float m(uf7 uf7Var, float f2, float f3) {
        oct octVar = azt.a;
        xic xicVar = uf7Var.a;
        ym0 ym0Var = new ym0(0.0f);
        int b2 = ym0Var.b();
        int i2 = 0;
        while (i2 < b2) {
            ym0Var.e(i2, xicVar.I(i2 == 0 ? f2 : 0.0f, i2 == 0 ? f3 : 0.0f));
            i2++;
        }
        return ym0Var.a;
    }

    public static final long n(AndroidComposeView androidComposeView) {
        Activity activity;
        int round;
        long j;
        Context context = androidComposeView.getContext();
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof Activity)) {
                if (!(context2 instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            } else {
                activity = (Activity) context2;
                break;
            }
        }
        if (activity != null) {
            int i2 = Build.VERSION.SDK_INT;
            Rect p = (i2 >= 30 ? pg3.a : i2 >= 29 ? h1b.a : i2 >= 28 ? og3.b : e88.b).p(activity);
            int width = p.width();
            round = p.height();
            j = width;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            float f2 = context.getResources().getDisplayMetrics().density;
            int round2 = Math.round(configuration.screenWidthDp * f2);
            round = Math.round(configuration.screenHeightDp * f2);
            j = round2;
        }
        return (round & 4294967295L) | (j << 32);
    }

    public static final wn5 o(List list) {
        return new wn5(new y5(16, list), -1953651383, true);
    }

    public static byte[] p(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final be6 q(boolean z, boolean z2, boolean z3) {
        return z ? be6.d : z2 ? be6.c : z3 ? be6.e : be6.b;
    }

    public static final String r(n70 n70Var) {
        n70Var.getClass();
        if (n70Var instanceof j70) {
            return "";
        }
        if (n70Var instanceof k70) {
            return ((k70) n70Var).a;
        }
        if ((n70Var instanceof i70) || Intrinsics.d(n70Var, m70.a) || (n70Var instanceof l70)) {
            return "";
        }
        b6e.s();
        return null;
    }

    public static uf7 s(int i2) {
        return new uf7(new yz0((i2 & 1) != 0 ? 1.0f : 10.0f, 0.1f));
    }

    public static String t(Object obj, Object obj2, String str) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str.concat(StringUtil.SPACE);
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            StringBuilder m = tlm.m(str2, "expected: ");
            m.append(u(obj, valueOf));
            m.append(" but was: ");
            m.append(u(obj2, valueOf2));
            return m.toString();
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + '>';
    }

    public static String u(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + '<' + str + '>';
    }

    public static final String v(String str, List list) {
        str.getClass();
        list.getClass();
        return CollectionsKt.X(list, null, str.concat("("), ")", jx9.B0, 25);
    }

    public static final String w(Context context) {
        context.getClass();
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final yg0 x(int i2, hq5 hq5Var) {
        Resources K = gdg.K(hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        Object K2 = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K2 == kjnVar) {
            K2 = new TypedValue();
            oq5Var.k0(K2);
        }
        TypedValue typedValue = (TypedValue) K2;
        K.getValue(i2, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean f2 = oq5Var.f(charSequence.toString());
        Object K3 = oq5Var.K();
        if (f2 || K3 == kjnVar) {
            Drawable drawable = K.getDrawable(i2, null);
            drawable.getClass();
            K3 = new yg0(((BitmapDrawable) drawable).getBitmap());
            oq5Var.k0(K3);
        }
        return (yg0) K3;
    }

    public static final void y(y6 y6Var, String str) {
        y6Var.p(y6Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence z(int i2, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder k = dfi.k(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                k.append(charSequence.subSequence(i3, i4).toString());
                k.append(str2);
                return k.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }
}
