package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.widget.WidgetActionCallback;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class fxf {
    public static final String A(int i, long j, boolean z) {
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        int i2 = (int) j;
        String b = skrVar.b(i, i2, Integer.valueOf(i2));
        return !z ? b : skrVar.b(R.plurals.podcast_episode_time_left, i2, b);
    }

    public static String B(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static final boolean C(mn0 mn0Var) {
        int length = mn0Var.b.length();
        List list = mn0Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ln0 ln0Var = (ln0) list.get(i);
                if ((ln0Var.a instanceof p7g) && nn0.c(0, length, ln0Var.b, ln0Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void D(oq5 oq5Var, Function2 function2) {
        function2.getClass();
        wct.o(2, function2);
        function2.invoke(oq5Var, 1);
    }

    public static final boolean E(AssertionError assertionError) {
        Logger logger = epj.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.M(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final boolean G(cvl cvlVar) {
        cvlVar.getClass();
        u4h u4hVar = cvlVar.u;
        drt drtVar = u4hVar != null ? u4hVar.a : null;
        if (drtVar == null) {
            return false;
        }
        String str = drtVar.a;
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return Intrinsics.d(((frt) qdcVar.C(I)).c().a, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if ((r5 == null ? r5.b : null) != defpackage.yzi.a) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(z66 z66Var, cg6 cg6Var) {
        kyq kyqVar;
        int i;
        if (cg6Var instanceof kyq) {
            kyqVar = (kyq) cg6Var;
            int i2 = kyqVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kyqVar.k = i2 - Integer.MIN_VALUE;
                Object obj = kyqVar.j;
                nm6 nm6Var = nm6.a;
                i = kyqVar.k;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z66Var.g()) {
                        vdr d = z66Var.d();
                        kyqVar.k = 1;
                        obj = zsd.i0(d, kyqVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                zzi zziVar = (zzi) obj;
            }
        }
        kyqVar = new kyq(cg6Var);
        Object obj2 = kyqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kyqVar.k;
        boolean z2 = true;
        if (i != 0) {
        }
        zzi zziVar2 = (zzi) obj2;
    }

    public static final float I(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    public static final float J(float f, float f2, float f3, float f4, float f5) {
        return (((f5 - f4) * (f - f2)) / (f3 - f2)) + f4;
    }

    public static final int K(int i, float f, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static PorterDuff.Mode L(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final String M(mqs mqsVar, long j, boolean z) {
        mqsVar.getClass();
        if (z) {
            j = mqsVar.e - j;
        }
        long j2 = j / 1000;
        if (j2 <= 59) {
            return A(R.plurals.number_of_seconds_rtl_support, j2, z);
        }
        long j3 = j2 / 60;
        if (((int) j2) % 60 >= 30) {
            j3++;
        }
        return A(R.plurals.number_of_minutes_rtl_support, j3, z);
    }

    public static final void N(y yVar, cvo cvoVar, sai saiVar, String str, pu0 pu0Var, Function0 function0, wn5 wn5Var) {
        yVar.getClass();
        cvoVar.getClass();
        saiVar.getClass();
        str.getClass();
        pu0Var.getClass();
        boolean booleanValue = ((Boolean) pu0Var.a.getValue()).booleanValue();
        wn5 wn5Var2 = new wn5(new pw6(pu0Var, wn5Var, saiVar, 1), -341724975, true);
        if (yVar.D(str) != null) {
            return;
        }
        mai maiVar = new mai();
        maiVar.g = cvoVar;
        maiVar.k = saiVar;
        maiVar.m = function0;
        maiVar.l = wn5Var2;
        maiVar.n = booleanValue;
        maiVar.show(yVar, str);
    }

    public static void O(o oVar, cvo cvoVar, sai saiVar, pu0 pu0Var, Function0 function0, wn5 wn5Var, int i) {
        if ((i & 2) != 0) {
            saiVar = new sai(false);
        }
        sai saiVar2 = saiVar;
        if ((i & 16) != 0) {
            function0 = null;
        }
        oVar.getClass();
        cvoVar.getClass();
        pu0Var.getClass();
        y parentFragmentManager = oVar.getParentFragmentManager();
        parentFragmentManager.getClass();
        N(parentFragmentManager, cvoVar, saiVar2, "BOTTOM_SHEET_DIALOG_TAG", pu0Var, function0, wn5Var);
    }

    public static void P(t tVar, cvo cvoVar, sai saiVar, pu0 pu0Var, oi1 oi1Var, wn5 wn5Var, int i) {
        if ((i & 2) != 0) {
            saiVar = new sai(false);
        }
        sai saiVar2 = saiVar;
        if ((i & 16) != 0) {
            oi1Var = null;
        }
        tVar.getClass();
        saiVar2.getClass();
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        N(supportFragmentManager, cvoVar, saiVar2, "BOTTOM_SHEET_DIALOG_TAG", pu0Var, oi1Var, wn5Var);
    }

    public static /* synthetic */ void Q(y yVar, cvo cvoVar, sai saiVar, String str, pu0 pu0Var, zhs zhsVar, wn5 wn5Var, int i) {
        if ((i & 2) != 0) {
            saiVar = new sai(false);
        }
        sai saiVar2 = saiVar;
        if ((i & 4) != 0) {
            str = "BOTTOM_SHEET_DIALOG_TAG";
        }
        String str2 = str;
        if ((i & 16) != 0) {
            zhsVar = null;
        }
        N(yVar, cvoVar, saiVar2, str2, pu0Var, zhsVar, wn5Var);
    }

    public static final kt1 R(Socket socket) {
        Logger logger = epj.a;
        z2r z2rVar = new z2r(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new kt1(z2rVar, new kt1(outputStream, z2rVar));
    }

    public static final lt1 S(File file) {
        Logger logger = epj.a;
        file.getClass();
        return new lt1(new FileInputStream(file), vis.d);
    }

    public static final lt1 T(InputStream inputStream) {
        Logger logger = epj.a;
        inputStream.getClass();
        return new lt1(inputStream, new vis());
    }

    public static final lt1 U(Socket socket) {
        Logger logger = epj.a;
        z2r z2rVar = new z2r(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new lt1(z2rVar, new lt1(inputStream, z2rVar));
    }

    public static final s8 V(Function0 function0, Function1 function1, xdh xdhVar) {
        return new fpa(function0, new kif(4, function1), xdhVar).c();
    }

    public static final String W(mqs mqsVar) {
        mqsVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(o8q.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return zwf.a0(mqsVar, (o8q) qdcVar.C(I), R.string.unknown_album);
    }

    public static final long X(int i, int i2) {
        long j = 0;
        return TimeUnit.SECONDS.toMillis(i) + TimeUnit.MINUTES.toMillis(j) + TimeUnit.HOURS.toMillis(j) + TimeUnit.DAYS.toMillis(j) + i2;
    }

    public static byte[] Z(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static final void a(con conVar, plv plvVar, List list, ukd ukdVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1728093854);
        int i2 = i | (oq5Var.h(conVar) ? 4 : 2) | (oq5Var.f(plvVar) ? 32 : 16) | (oq5Var.f(list) ? 256 : 128) | (oq5Var.f(ukdVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            y1g.l(ukdVar, 0, 2, ild.C(1719006210, new vtb(23, list, ild.C(294240247, new av(2, conVar, plvVar), oq5Var), conVar), oq5Var), oq5Var, ((i2 >> 9) & 14) | 3072, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 20, conVar, plvVar, list, ukdVar);
        }
    }

    public static String a0(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static final void b(ru ruVar, Function0 function0, yci yciVar, Function2 function2, e9g e9gVar, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        yci yciVar2;
        int i3;
        yci yciVar3;
        Function2 function22;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1954820194);
        int i4 = i | (oq5Var.f(ruVar) ? 4 : 2);
        if ((i & 48) == 0) {
            function02 = function0;
            i4 |= oq5Var.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i4 | (oq5Var.f(yciVar2) ? 256 : 128);
        }
        int i6 = i3 | 3072;
        if (oq5Var.P(i6 & 1, (i6 & 9363) != 9362)) {
            yciVar3 = i5 != 0 ? vci.a : yciVar2;
            wn5 wn5Var = xv.d;
            int i7 = i6 >> 3;
            ngg.i(function02, yciVar3, ild.C(792947680, new nu(ruVar, e9gVar, 1), oq5Var), false, 0L, null, wn5Var, 0.0f, null, ild.C(2072542649, new ykf(13, ruVar), oq5Var), oq5Var, (i7 & 112) | (i7 & 14) | 805306752 | ScreenMirroringConfig.Video.BITRATE_1_5MB, 440);
            function22 = wn5Var;
        } else {
            oq5Var.S();
            yciVar3 = yciVar2;
            function22 = function2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj((Object) ruVar, function0, yciVar3, (Object) function22, (Object) e9gVar, i, i2, 10);
        }
    }

    public static void b0(char[] cArr, ByteArrayOutputStream byteArrayOutputStream) {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                byteArrayOutputStream.write(c);
            } else if (c < 2048) {
                byteArrayOutputStream.write((c >> 6) | 192);
                byteArrayOutputStream.write((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                byteArrayOutputStream.write((c >> '\f') | 224);
                byteArrayOutputStream.write(((c >> 6) & 63) | 128);
                byteArrayOutputStream.write((c & '?') | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    xq0.q("invalid UTF-16 codepoint");
                    return;
                }
                char c2 = cArr[i];
                if (c > 56319) {
                    xq0.q("invalid UTF-16 codepoint");
                    return;
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + SQLiteDatabase.OPEN_FULLMUTEX;
                byteArrayOutputStream.write((i2 >> 18) | 240);
                byteArrayOutputStream.write(((i2 >> 12) & 63) | 128);
                byteArrayOutputStream.write(((i2 >> 6) & 63) | 128);
                byteArrayOutputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    public static final void c(o3k o3kVar, yci yciVar, q0k q0kVar, s1r s1rVar, float f, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(110457907);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(o3kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(q0kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(s1rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.c(f) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var2.P(i2 & 1, (74899 & i2) != 74898)) {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new uv1(15);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            rvf.a(o3kVar, yciVar, q0kVar, null, 0, f, null, s1rVar, false, (Function1) K, null, null, null, wn5Var, oq5Var, (i2 & 1022) | ((i2 << 3) & 458752) | ((i2 << 12) & 29360128), ((i2 >> 3) & 57344) | 6, 15192);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nm2(o3kVar, yciVar, q0kVar, s1rVar, f, wn5Var, i);
        }
    }

    public static int c0(byte[] bArr, int i, vx0 vx0Var) {
        int h0 = h0(bArr, i, vx0Var);
        int i2 = vx0Var.a;
        if (i2 < 0) {
            tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - h0) {
            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            vx0Var.c = gbx.c;
            return h0;
        }
        vx0Var.c = gbx.q(bArr, h0, i2);
        return h0 + i2;
    }

    public static final void d(o3k o3kVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-110584850);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o3kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2;
            int j = o3kVar.j();
            IntRange m = yhn.m(0, o3kVar.n());
            int n = o3kVar.n();
            int n2 = o3kVar.n();
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            float n0 = jx7Var.n0(3);
            float n02 = jx7Var.n0(2);
            float n03 = jx7Var.n0(1);
            float n04 = jx7Var.n0(4);
            agr agrVar = eq0.a;
            m2k m2kVar = new m2k(n0, n02, n03, n04, ((dq0) oq5Var.j(agrVar)).a.c, ((dq0) oq5Var.j(agrVar)).a.a, n2);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new hpj(18);
                oq5Var.k0(K);
            }
            ivf.j(j, m, (Function1) K, n, m2kVar, yciVar, oq5Var, 384 | ((i3 << 12) & 458752), 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(o3kVar, yciVar, i, 27);
        }
    }

    public static int d0(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static final void e(final o3k o3kVar, yci yciVar, final q0k q0kVar, s1r s1rVar, final float f, long j, long j2, final wn5 wn5Var, hq5 hq5Var, final int i) {
        yci yciVar2;
        final s1r s1rVar2;
        final long j3;
        oq5 oq5Var;
        final long j4;
        int i2;
        long m;
        long m2;
        s1r s1rVar3;
        o3kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1370401056);
        int i3 = i | (oq5Var2.f(o3kVar) ? 4 : 2) | 1770496;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                s1r F = avf.F(o3kVar, new l48(0), oq5Var2, i3 & 14, 28);
                i2 = i3 & (-7169);
                m = xv.m(Float.POSITIVE_INFINITY, 200);
                m2 = xv.m(Float.POSITIVE_INFINITY, 18);
                s1rVar3 = F;
            } else {
                oq5Var2.S();
                i2 = i3 & (-7169);
                s1rVar3 = s1rVar;
                m = j;
                m2 = j2;
            }
            oq5Var2.q();
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            a l = oq5Var2.l();
            yciVar2 = yciVar;
            yci H = vnj.H(oq5Var2, yciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            vci vciVar = vci.a;
            c(o3kVar, d.d(d.n(m, vciVar), 1.0f), q0kVar, s1rVar3, f, wn5Var, oq5Var2, (i2 & 65422) | 196608);
            u1g.l(oq5Var2, d.e(vciVar, 20));
            d(o3kVar, d.n(m2, vciVar), oq5Var2, i2 & 14);
            oq5Var2.p(true);
            s1rVar2 = s1rVar3;
            oq5Var = oq5Var2;
            j4 = m;
            j3 = m2;
        } else {
            yciVar2 = yciVar;
            oq5Var2.S();
            s1rVar2 = s1rVar;
            j3 = j2;
            oq5Var = oq5Var2;
            j4 = j;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final yci yciVar3 = yciVar2;
            r.d = new Function2(yciVar3, q0kVar, s1rVar2, f, j4, j3, wn5Var, i) { // from class: s3k
                public final /* synthetic */ yci b;
                public final /* synthetic */ q0k c;
                public final /* synthetic */ s1r d;
                public final /* synthetic */ float e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ wn5 h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(12607921);
                    fxf.e(o3k.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static int e0(iex iexVar, int i, byte[] bArr, int i2, int i3, ucx ucxVar, vx0 vx0Var) {
        mcx g = iexVar.g();
        iex iexVar2 = iexVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        vx0 vx0Var2 = vx0Var;
        int m0 = m0(g, iexVar2, bArr2, i2, i4, vx0Var2);
        iexVar2.a(g);
        vx0Var2.c = g;
        ucxVar.add(g);
        while (m0 < i4) {
            vx0 vx0Var3 = vx0Var2;
            int i5 = i4;
            int h0 = h0(bArr2, m0, vx0Var3);
            if (i != vx0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            iex iexVar3 = iexVar2;
            mcx g2 = iexVar3.g();
            m0 = m0(g2, iexVar3, bArr3, h0, i5, vx0Var3);
            iexVar2 = iexVar3;
            bArr2 = bArr3;
            i4 = i5;
            vx0Var2 = vx0Var3;
            iexVar2.a(g2);
            vx0Var2.c = g2;
            ucxVar.add(g2);
        }
        return m0;
    }

    public static final void f(long j, ges gesVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-716124955);
        if ((((oq5Var.e(j) ? 4 : 2) | i | (oq5Var.f(gesVar) ? 32 : 16)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            qs5 qs5Var = wcs.a;
            etn.m(new qzm[]{rb6.a.a(new d85(j)), qs5Var.a(((ges) oq5Var.j(qs5Var)).e(gesVar))}, wn5Var, oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wf0(j, gesVar, wn5Var, i);
        }
    }

    public static int f0(byte[] bArr, int i, ucx ucxVar, vx0 vx0Var) {
        ncx ncxVar = (ncx) ucxVar;
        int h0 = h0(bArr, i, vx0Var);
        int i2 = vx0Var.a + h0;
        while (h0 < i2) {
            h0 = h0(bArr, h0, vx0Var);
            ncxVar.m(vx0Var.a);
        }
        if (h0 == i2) {
            return h0;
        }
        tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(con conVar, vov vovVar, boolean z, boolean z2, hq5 hq5Var, int i, int i2) {
        boolean z3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1163561967);
        int i3 = (oq5Var.h(conVar) ? 4 : 2) | i | (oq5Var.h(vovVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= oq5Var.g(z3) ? 2048 : 1024;
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var.S();
            } else {
                boolean z4 = i4 == 0 ? z3 : true;
                i(conVar, vovVar.f, z, vovVar.e, ild.C(129901736, new don(vovVar, conVar, 0), oq5Var), ild.C(379180137, new don(conVar, vovVar), oq5Var), ild.C(628458538, new don(vovVar, conVar, 2), oq5Var), z4, oq5Var, ((i3 << 12) & 29360128) | (i3 & 14) | 1794048 | (i3 & 896));
                z3 = z4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new vkg(conVar, vovVar, z, z3, i, i2, 2);
                return;
            }
            return;
        }
        z3 = z2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static int g0(int i, byte[] bArr, int i2, int i3, sex sexVar, vx0 vx0Var) {
        if ((i >>> 3) == 0) {
            tiu.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int k0 = k0(bArr, i2, vx0Var);
            sexVar.c(i, Long.valueOf(vx0Var.b));
            return k0;
        }
        if (i4 == 1) {
            sexVar.c(i, Long.valueOf(n0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int h0 = h0(bArr, i2, vx0Var);
            int i5 = vx0Var.a;
            if (i5 < 0) {
                tiu.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - h0) {
                tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                sexVar.c(i, gbx.c);
            } else {
                sexVar.c(i, gbx.q(bArr, h0, i5));
            }
            return h0 + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                sexVar.c(i, Integer.valueOf(d0(i2, bArr)));
                return i2 + 4;
            }
            tiu.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        sex b = sex.b();
        int i7 = vx0Var.d + 1;
        vx0Var.d = i7;
        if (i7 >= 100) {
            tiu.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int h02 = h0(bArr, i2, vx0Var);
            int i9 = vx0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = h02;
                break;
            }
            i2 = g0(i9, bArr, h02, i3, b, vx0Var);
            i8 = i9;
        }
        vx0Var.d--;
        if (i2 > i3 || i8 != i6) {
            tiu.i("Failed to parse the message.");
            return 0;
        }
        sexVar.c(i, b);
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final con conVar, final uov uovVar, boolean z, boolean z2, hq5 hq5Var, int i, int i2) {
        boolean z3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1132647488);
        int i3 = (oq5Var.h(conVar) ? 4 : 2) | i | (oq5Var.f(uovVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= oq5Var.g(z3) ? 2048 : 1024;
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var.S();
            } else {
                boolean z4 = i4 == 0 ? z3 : true;
                final int i5 = 0;
                final int i6 = 1;
                final int i7 = 2;
                i(conVar, uovVar.b, z, uovVar.a, ild.C(859634553, new Function2() { // from class: jon
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i5;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i8) {
                            case 0:
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar = uovVar.b;
                                    con conVar2 = conVar;
                                    p1g.j(conVar2.b(), nt0.u(o2g.j0(conVar2.g), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), plvVar, false, vnj.d, oq5Var2, 24576);
                                } else {
                                    oq5Var2.S();
                                }
                                break;
                            case 1:
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar2 = uovVar.b;
                                    con conVar3 = conVar;
                                    v3g.s(conVar3.p, conVar3.o, xee.x(conVar3.getContext()), plvVar2, oq5Var3, 0);
                                } else {
                                    oq5Var3.S();
                                }
                                break;
                            default:
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar3 = uovVar.b;
                                    con conVar4 = conVar;
                                    v3g.s(conVar4.n, conVar4.m, xee.x(conVar4.getContext()), plvVar3, oq5Var4, 0);
                                } else {
                                    oq5Var4.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, oq5Var), ild.C(-963552710, new Function2() { // from class: jon
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i6;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i8) {
                            case 0:
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar = uovVar.b;
                                    con conVar2 = conVar;
                                    p1g.j(conVar2.b(), nt0.u(o2g.j0(conVar2.g), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), plvVar, false, vnj.d, oq5Var2, 24576);
                                } else {
                                    oq5Var2.S();
                                }
                                break;
                            case 1:
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar2 = uovVar.b;
                                    con conVar3 = conVar;
                                    v3g.s(conVar3.p, conVar3.o, xee.x(conVar3.getContext()), plvVar2, oq5Var3, 0);
                                } else {
                                    oq5Var3.S();
                                }
                                break;
                            default:
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar3 = uovVar.b;
                                    con conVar4 = conVar;
                                    v3g.s(conVar4.n, conVar4.m, xee.x(conVar4.getContext()), plvVar3, oq5Var4, 0);
                                } else {
                                    oq5Var4.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, oq5Var), ild.C(1508227323, new Function2() { // from class: jon
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i8 = i7;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i8) {
                            case 0:
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar = uovVar.b;
                                    con conVar2 = conVar;
                                    p1g.j(conVar2.b(), nt0.u(o2g.j0(conVar2.g), new hjo(ng.a((lg[]) Arrays.copyOf(new lg[]{new lg(WidgetActionCallback.b, nkv.b)}, 1)))), plvVar, false, vnj.d, oq5Var2, 24576);
                                } else {
                                    oq5Var2.S();
                                }
                                break;
                            case 1:
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar2 = uovVar.b;
                                    con conVar3 = conVar;
                                    v3g.s(conVar3.p, conVar3.o, xee.x(conVar3.getContext()), plvVar2, oq5Var3, 0);
                                } else {
                                    oq5Var3.S();
                                }
                                break;
                            default:
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                                    plv plvVar3 = uovVar.b;
                                    con conVar4 = conVar;
                                    v3g.s(conVar4.n, conVar4.m, xee.x(conVar4.getContext()), plvVar3, oq5Var4, 0);
                                } else {
                                    oq5Var4.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, oq5Var), z4, oq5Var, ((i3 << 12) & 29360128) | (i3 & 14) | 1794048 | (i3 & 896));
                z3 = z4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new vkg(conVar, uovVar, z, z3, i, i2, 3);
                return;
            }
            return;
        }
        z3 = z2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static int h0(byte[] bArr, int i, vx0 vx0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return i0(b, bArr, i2, vx0Var);
        }
        vx0Var.a = b;
        return i2;
    }

    public static final void i(final con conVar, final plv plvVar, final boolean z, final llv llvVar, final wn5 wn5Var, final wn5 wn5Var2, final wn5 wn5Var3, final boolean z2, hq5 hq5Var, final int i) {
        int i2;
        boolean z3;
        llv llvVar2;
        wn5 wn5Var4;
        wn5 wn5Var5;
        wn5 wn5Var6;
        boolean z4;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1592011946);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(conVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(plvVar) : oq5Var2.h(plvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i2 |= oq5Var2.g(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            llvVar2 = llvVar;
            i2 |= oq5Var2.f(llvVar2) ? 2048 : 1024;
        } else {
            llvVar2 = llvVar;
        }
        if ((i & 24576) == 0) {
            wn5Var4 = wn5Var;
            i2 |= oq5Var2.h(wn5Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            wn5Var4 = wn5Var;
        }
        if ((196608 & i) == 0) {
            wn5Var5 = wn5Var2;
            i2 |= oq5Var2.h(wn5Var5) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            wn5Var5 = wn5Var2;
        }
        if ((1572864 & i) == 0) {
            wn5Var6 = wn5Var3;
            i2 |= oq5Var2.h(wn5Var6) ? 1048576 : 524288;
        } else {
            wn5Var6 = wn5Var3;
        }
        if ((12582912 & i) == 0) {
            z4 = z2;
            i2 |= oq5Var2.g(z4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            z4 = z2;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            oq5Var = oq5Var2;
            p1g.k(xee.x(conVar.getContext()), o2g.j0(conVar.b), plvVar, z4, ild.C(2135262395, new k26(conVar, wn5Var4, z3, llvVar2, plvVar, wn5Var5, wn5Var6), oq5Var2), oq5Var, ((i3 << 3) & 896) | 24576 | ((i3 >> 12) & 7168), 0);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: eon
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fxf.i(con.this, plvVar, z, llvVar, wn5Var, wn5Var2, wn5Var3, z2, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static int i0(int i, byte[] bArr, int i2, vx0 vx0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            vx0Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            vx0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            vx0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            vx0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                vx0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final void j(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1339508851);
        int i4 = ((i2 & 6) == 0 ? (oq5Var.f(yciVar) ? 4 : 2) | i2 : i2) | 432;
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            float f = 16;
            yci q = androidx.compose.foundation.layout.a.q(d.d(yciVar, 1.0f), f, 0.0f, f, 0.0f, 10);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float s = lsq.s(e9g.a);
            oq5Var.Z(-744497582);
            for (int i6 = 0; i6 < 1; i6++) {
                hz2 hz2Var = b2c.l;
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i7 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, d);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                yci m = d.m(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 8, 1), s);
                tgo tgoVar = ugo.a;
                int i8 = (i4 >> 3) & 14;
                ivf.k(i8, 0, oq5Var, xp3.u(m, tgoVar), true);
                k(null, oq5Var, (i4 & 112) | 6);
                ivf.k(i8, 0, oq5Var, xp3.u(d.m(vciVar, 24), tgoVar), true);
                oq5Var.p(true);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            z2 = true;
            i3 = 1;
        } else {
            oq5Var.S();
            i3 = i;
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(yciVar, z2, i3, i2, 7);
        }
    }

    public static int j0(int i, byte[] bArr, int i2, int i3, ucx ucxVar, vx0 vx0Var) {
        ncx ncxVar = (ncx) ucxVar;
        int h0 = h0(bArr, i2, vx0Var);
        ncxVar.m(vx0Var.a);
        while (h0 < i3) {
            int h02 = h0(bArr, h0, vx0Var);
            if (i != vx0Var.a) {
                break;
            }
            h0 = h0(bArr, h02, vx0Var);
            ncxVar.m(vx0Var.a);
        }
        return h0;
    }

    public static final void k(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(323339881);
        int i4 = i & 6;
        qho qhoVar = qho.a;
        if (i4 == 0) {
            i2 = (oq5Var.f(qhoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2;
        if ((i & 48) == 0) {
            i3 = (oq5Var.g(true) ? 32 : 16) | i5;
        } else {
            i3 = i5;
        }
        int i6 = i3 | 384;
        if (oq5Var.P(i6 & 1, (i6 & 147) != 146)) {
            yciVar2 = vci.a;
            yci a = qhoVar.a(1.0f, androidx.compose.foundation.layout.a.q(yciVar2, 12, 0.0f, 0.0f, 0.0f, 14), true);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i7 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i8 = ((i6 >> 3) & 14) | 48;
            ivf.l(true, d.r(yciVar2, 120), nu0.j(), oq5Var, i8, 0);
            u1g.l(oq5Var, d.e(yciVar2, 4));
            ivf.l(true, d.r(yciVar2, 80), nu0.i(), oq5Var, i8, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar2, i, 11);
        }
    }

    public static int k0(byte[] bArr, int i, vx0 vx0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            vx0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        vx0Var.b = j2;
        return i3;
    }

    public static final void l(iwm iwmVar, qw qwVar, pu0 pu0Var, float f, hq5 hq5Var, int i) {
        oq5 oq5Var;
        iwmVar.getClass();
        qwVar.getClass();
        tw twVar = qwVar.a;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2095790436);
        int i2 = i | (oq5Var2.h(iwmVar) ? 4 : 2) | (oq5Var2.h(qwVar) ? 32 : 16) | (oq5Var2.f(pu0Var) ? 256 : 128) | (oq5Var2.c(f) ? 2048 : 1024) | (oq5Var2.f(vci.a) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean f2 = oq5Var2.f(twVar);
            Object K2 = oq5Var2.K();
            if (f2 || K2 == kjnVar) {
                K2 = iwmVar.a(twVar, mm6Var);
                oq5Var2.k0(K2);
            }
            bc5 bc5Var = (bc5) K2;
            oq5Var = oq5Var2;
            jf0.a(new qzm[0], pu0Var, true, ild.C(1139111404, new bt5(qwVar, f, bc5Var, irv.i(oq5Var2), iwmVar, gld.M(bc5Var.c(), oq5Var2)), oq5Var2), oq5Var, ((i2 >> 3) & 112) | 3456, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ti7(f, i, 2, iwmVar, qwVar, pu0Var);
        }
    }

    public static int l0(Object obj, iex iexVar, byte[] bArr, int i, int i2, int i3, vx0 vx0Var) {
        bex bexVar = (bex) iexVar;
        int i4 = vx0Var.d + 1;
        vx0Var.d = i4;
        if (i4 >= 100) {
            tiu.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int t = bexVar.t(obj, bArr, i, i2, i3, vx0Var);
        vx0Var.d--;
        vx0Var.c = obj;
        return t;
    }

    public static final void m(float f, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(675807777);
        if ((((oq5Var.c(f) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(vci.a) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(200268536, new ui7(f, 3, z), oq5Var), oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ui7(f, i, 4, z);
        }
    }

    public static int m0(Object obj, iex iexVar, byte[] bArr, int i, int i2, vx0 vx0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i0(i4, bArr, i3, vx0Var);
            i4 = vx0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = vx0Var.d + 1;
        vx0Var.d = i6;
        if (i6 >= 100) {
            tiu.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        iexVar.i(obj, bArr, i5, i7, vx0Var);
        vx0Var.d--;
        vx0Var.c = obj;
        return i7;
    }

    public static final void n(fjt fjtVar, njt njtVar, fvf fvfVar, d9g d9gVar, vm vmVar, ynn ynnVar, String str, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        String str2;
        yci yciVar2;
        oq5 oq5Var;
        fjtVar.getClass();
        njtVar.getClass();
        fvfVar.getClass();
        ynnVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1781271250);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(fjtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(njtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.d(d9gVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(vmVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(ynnVar) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            str2 = str;
            i2 |= oq5Var2.f(str2) ? 1048576 : 524288;
        } else {
            str2 = str;
        }
        if ((12582912 & i) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            yciVar2 = yciVar;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z = fjtVar instanceof ejt;
            boolean h = oq5Var2.h(fjtVar) | ((i3 & 3670016) == 1048576) | ((458752 & i3) == 131072) | oq5Var2.h(njtVar) | ((i3 & 7168) == 2048);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                r90 r90Var = new r90(fjtVar, str2, ynnVar, njtVar, d9gVar, 11);
                oq5Var2.k0(r90Var);
                K = r90Var;
            }
            oq5Var = oq5Var2;
            weo.f(yciVar2, fvfVar, vmVar, null, null, null, z, null, (Function1) K, oq5Var, ((i3 >> 21) & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896), 376);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bt4(fjtVar, njtVar, fvfVar, d9gVar, vmVar, ynnVar, str, yciVar, i, 3);
        }
    }

    public static long n0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final void o(String str, long j, qmu qmuVar, yci yciVar, boolean z, hq5 hq5Var, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        qmuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1783530031);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.d(qmuVar.ordinal()) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z5 = false;
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            b bVar = b.a;
            if (str != null) {
                oq5Var.Z(2037793954);
                qo6 qo6Var = qo6.l;
                yci b = bVar.b(vciVar);
                if (!z || qmuVar == qmu.a) {
                    z4 = false;
                } else {
                    z4 = false;
                    z5 = true;
                }
                z2 = z4;
                z3 = true;
                irf.y(str, qo6Var, b, z5, false, null, new d85(j), null, oq5Var, (i2 & 14) | 48 | ((i2 << 15) & 3670016), 176);
                oq5Var.p(z2);
            } else {
                z2 = false;
                z3 = true;
                oq5Var.Z(2038154546);
                u1g.l(oq5Var, bVar.b(androidx.compose.foundation.a.b(vciVar, j, ugo.a)));
                oq5Var.p(false);
            }
            if (qmuVar != qmu.a) {
                oq5Var.Z(2038407816);
                orl.a(0, 6, 0L, oq5Var, null, qmuVar == qmu.c ? z3 : z2);
            } else {
                oq5Var.Z(2033071693);
            }
            oq5Var.p(z2);
            oq5Var.p(z3);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hz5(str, j, qmuVar, yciVar, z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(euu euuVar, owu owuVar, yci yciVar, o0k o0kVar, boolean z, e9g e9gVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        o0k o0kVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        e9g e9gVar2;
        yci yciVar3;
        boolean z3;
        aqi M;
        boolean h;
        Object K;
        oq5 oq5Var;
        e9g e9gVar3;
        boolean z4;
        o0k o0kVar3;
        xmn r;
        int i7;
        owuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2043970565);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(euuVar) : oq5Var2.h(euuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(owuVar) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    o0kVar2 = o0kVar;
                    if (oq5Var2.f(o0kVar2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    o0kVar2 = o0kVar;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                o0kVar2 = o0kVar;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i2 & 32;
                int i9 = 196608;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        i9 = oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    }
                    if ((74899 & i3) == 74898 || !oq5Var2.z()) {
                        oq5Var2.U();
                        if ((i & 1) != 0 || oq5Var2.y()) {
                            if (i8 != 0) {
                                yciVar2 = vci.a;
                            }
                            if ((i2 & 8) != 0) {
                                float f = 8;
                                o0kVar2 = new q0k(16, f, 4, f);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                i6 = i3;
                                e9gVar2 = e9g.a;
                                yciVar3 = yciVar2;
                                o0k o0kVar4 = o0kVar2;
                                z3 = z2;
                                oq5Var2.q();
                                M = gld.M(owuVar.c(), oq5Var2);
                                long j = ((dq0) oq5Var2.j(eq0.a)).c.c;
                                if (z3 || ((qmu) M.getValue()) == qmu.a) {
                                    j = d85.m;
                                }
                                long j2 = j;
                                yci c = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item"), "wave_list_item_selected", Boolean.valueOf(((qmu) M.getValue()) != qmu.a));
                                h = oq5Var2.h(owuVar) | oq5Var2.f(M);
                                K = oq5Var2.K();
                                if (!h || K == gq5.a) {
                                    K = new phi(owuVar, M, 1);
                                    oq5Var2.k0(K);
                                }
                                oq5Var = oq5Var2;
                                ngg.i((Function0) K, c, ild.C(1639519993, new duu(euuVar, e9gVar2, z3, M), oq5Var2), false, j2, null, null, 0.0f, o0kVar4, ild.C(1395915712, new f5r(19, euuVar), oq5Var2), oq5Var, ((i6 << 15) & 234881024) | 806879616, 168);
                                e9gVar3 = e9gVar2;
                                z4 = z3;
                                o0kVar3 = o0kVar4;
                            }
                        } else {
                            oq5Var2.S();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                        }
                        e9gVar2 = e9gVar;
                        i6 = i3;
                        yciVar3 = yciVar2;
                        o0k o0kVar42 = o0kVar2;
                        z3 = z2;
                        oq5Var2.q();
                        M = gld.M(owuVar.c(), oq5Var2);
                        long j3 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                        if (z3) {
                        }
                        j3 = d85.m;
                        long j22 = j3;
                        yci c2 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item"), "wave_list_item_selected", Boolean.valueOf(((qmu) M.getValue()) != qmu.a));
                        h = oq5Var2.h(owuVar) | oq5Var2.f(M);
                        K = oq5Var2.K();
                        if (!h) {
                        }
                        K = new phi(owuVar, M, 1);
                        oq5Var2.k0(K);
                        oq5Var = oq5Var2;
                        ngg.i((Function0) K, c2, ild.C(1639519993, new duu(euuVar, e9gVar2, z3, M), oq5Var2), false, j22, null, null, 0.0f, o0kVar42, ild.C(1395915712, new f5r(19, euuVar), oq5Var2), oq5Var, ((i6 << 15) & 234881024) | 806879616, 168);
                        e9gVar3 = e9gVar2;
                        z4 = z3;
                        o0kVar3 = o0kVar42;
                    } else {
                        oq5Var2.S();
                        e9gVar3 = e9gVar;
                        oq5Var = oq5Var2;
                        yciVar3 = yciVar2;
                        o0kVar3 = o0kVar2;
                        z4 = z2;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new tp(euuVar, owuVar, yciVar3, o0kVar3, z4, e9gVar3, i, i2);
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((74899 & i3) == 74898) {
                }
                oq5Var2.U();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                e9gVar2 = e9gVar;
                i6 = i3;
                yciVar3 = yciVar2;
                o0k o0kVar422 = o0kVar2;
                z3 = z2;
                oq5Var2.q();
                M = gld.M(owuVar.c(), oq5Var2);
                long j32 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                if (z3) {
                }
                j32 = d85.m;
                long j222 = j32;
                yci c22 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item"), "wave_list_item_selected", Boolean.valueOf(((qmu) M.getValue()) != qmu.a));
                h = oq5Var2.h(owuVar) | oq5Var2.f(M);
                K = oq5Var2.K();
                if (!h) {
                }
                K = new phi(owuVar, M, 1);
                oq5Var2.k0(K);
                oq5Var = oq5Var2;
                ngg.i((Function0) K, c22, ild.C(1639519993, new duu(euuVar, e9gVar2, z3, M), oq5Var2), false, j222, null, null, 0.0f, o0kVar422, ild.C(1395915712, new f5r(19, euuVar), oq5Var2), oq5Var, ((i6 << 15) & 234881024) | 806879616, 168);
                e9gVar3 = e9gVar2;
                z4 = z3;
                o0kVar3 = o0kVar422;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            int i92 = 196608;
            if (i5 == 0) {
            }
            i3 |= i92;
            if ((74899 & i3) == 74898) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            e9gVar2 = e9gVar;
            i6 = i3;
            yciVar3 = yciVar2;
            o0k o0kVar4222 = o0kVar2;
            z3 = z2;
            oq5Var2.q();
            M = gld.M(owuVar.c(), oq5Var2);
            long j322 = ((dq0) oq5Var2.j(eq0.a)).c.c;
            if (z3) {
            }
            j322 = d85.m;
            long j2222 = j322;
            yci c222 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item"), "wave_list_item_selected", Boolean.valueOf(((qmu) M.getValue()) != qmu.a));
            h = oq5Var2.h(owuVar) | oq5Var2.f(M);
            K = oq5Var2.K();
            if (!h) {
            }
            K = new phi(owuVar, M, 1);
            oq5Var2.k0(K);
            oq5Var = oq5Var2;
            ngg.i((Function0) K, c222, ild.C(1639519993, new duu(euuVar, e9gVar2, z3, M), oq5Var2), false, j2222, null, null, 0.0f, o0kVar4222, ild.C(1395915712, new f5r(19, euuVar), oq5Var2), oq5Var, ((i6 << 15) & 234881024) | 806879616, 168);
            e9gVar3 = e9gVar2;
            z4 = z3;
            o0kVar3 = o0kVar4222;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        int i922 = 196608;
        if (i5 == 0) {
        }
        i3 |= i922;
        if ((74899 & i3) == 74898) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        e9gVar2 = e9gVar;
        i6 = i3;
        yciVar3 = yciVar2;
        o0k o0kVar42222 = o0kVar2;
        z3 = z2;
        oq5Var2.q();
        M = gld.M(owuVar.c(), oq5Var2);
        long j3222 = ((dq0) oq5Var2.j(eq0.a)).c.c;
        if (z3) {
        }
        j3222 = d85.m;
        long j22222 = j3222;
        yci c2222 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item"), "wave_list_item_selected", Boolean.valueOf(((qmu) M.getValue()) != qmu.a));
        h = oq5Var2.h(owuVar) | oq5Var2.f(M);
        K = oq5Var2.K();
        if (!h) {
        }
        K = new phi(owuVar, M, 1);
        oq5Var2.k0(K);
        oq5Var = oq5Var2;
        ngg.i((Function0) K, c2222, ild.C(1639519993, new duu(euuVar, e9gVar2, z3, M), oq5Var2), false, j22222, null, null, 0.0f, o0kVar42222, ild.C(1395915712, new f5r(19, euuVar), oq5Var2), oq5Var, ((i6 << 15) & 234881024) | 806879616, 168);
        e9gVar3 = e9gVar2;
        z4 = z3;
        o0kVar3 = o0kVar42222;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void q(boolean z, yci yciVar, e9g e9gVar, hq5 hq5Var, int i) {
        int i2;
        e9g e9gVar2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1589091358);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            e9gVar2 = e9gVar;
        } else {
            e9g e9gVar3 = e9g.a;
            vci vciVar = vci.a;
            c9g.g(z, qo6.l, true, e9gVar3, vciVar, false, null, oq5Var, (i3 & 14) | 432 | ((i3 << 3) & 7168) | ((i3 << 9) & 57344), 96);
            e9gVar2 = e9gVar3;
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(z, yciVar2, e9gVar2, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r8)) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final Function0 function0, final Function0 function02, final Function0 function03, yci yciVar, hq5 hq5Var, final int i) {
        boolean z;
        kb5 kb5Var;
        kb5 kb5Var2;
        int i2;
        vci vciVar;
        kb5 kb5Var3;
        int i3;
        char c;
        boolean z2;
        oq5 oq5Var;
        kx0 kx0Var;
        kb5 kb5Var4;
        oq5 oq5Var2;
        final yci yciVar2;
        w4k E;
        xmn r;
        Function2 function2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(1058565010);
        int w = oq5Var3.w();
        int i4 = i | (oq5Var3.h(function0) ? 4 : 2) | (oq5Var3.h(function02) ? 32 : 16) | (oq5Var3.h(function03) ? 256 : 128) | 3072;
        if ((i4 & 1171) == 1170 && oq5Var3.z()) {
            oq5Var3.S();
            yciVar2 = yciVar;
            oq5Var2 = oq5Var3;
        } else {
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            qs5Var.getClass();
            boolean I = asq.I((Configuration) oq5Var3.j(qs5Var));
            final vci vciVar2 = vci.a;
            float f = 32;
            yci q = androidx.compose.foundation.layout.a.q(d.d(androidx.compose.ui.platform.a.a(vciVar2, "wizard_skip_dialog"), 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            gz2 gz2Var = b2c.o;
            kx0 kx0Var2 = qx0.c;
            ta5 a = sa5.a(kx0Var2, gz2Var, oq5Var3, 48);
            int i5 = oq5Var3.P;
            a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var3, a, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var3, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var3.O) {
                z = I;
            } else {
                z = I;
            }
            ouj.x(i5, oq5Var3, i5, kb5Var7);
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var8);
            oq5Var3.Z(1551609487);
            if (z) {
                kb5Var = kb5Var7;
                kb5Var2 = kb5Var6;
                i2 = i4;
                vciVar = vciVar2;
                kb5Var3 = kb5Var8;
                i3 = 24;
                c = 0;
                z2 = false;
                oq5Var = oq5Var3;
                kx0Var = kx0Var2;
                oq5Var.Z(1549400550);
            } else {
                oq5Var3.Z(1551574146);
                agr agrVar = koe.a;
                if (((Boolean) oq5Var3.j(agrVar)).booleanValue()) {
                    oq5Var3.Z(1551615562);
                    oq5Var3.p(false);
                    E = new w85(d85.c);
                } else {
                    oq5Var3.Z(1551687792);
                    Integer num = neg.o(oq5Var3).b;
                    if (num == null) {
                        function03.invoke();
                        oq5Var3.t(w);
                        r = oq5Var3.r();
                        if (r != null) {
                            final int i6 = 0;
                            function2 = new Function2(i, i6, vciVar2, function0, function02, function03) { // from class: p2w
                                public final /* synthetic */ int a;
                                public final /* synthetic */ Function0 b;
                                public final /* synthetic */ Function0 c;
                                public final /* synthetic */ Function0 d;
                                public final /* synthetic */ yci e;

                                {
                                    this.a = i6;
                                    this.b = function0;
                                    this.c = function02;
                                    this.d = function03;
                                    this.e = vciVar2;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (this.a) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int R = rvf.R(1);
                                            fxf.r(this.b, this.c, this.d, this.e, (hq5) obj, R);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int R2 = rvf.R(1);
                                            fxf.r(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            r.d = function2;
                        }
                        return;
                    }
                    E = a0g.E(num.intValue(), 0, oq5Var3);
                    oq5Var3.p(false);
                }
                yci q2 = androidx.compose.foundation.layout.a.q(d.d(vciVar2, 1.0f), 0.0f, 24, 0.0f, 0.0f, 13);
                yci e = ((Boolean) oq5Var3.j(agrVar)).booleanValue() ? d.e(vciVar2, 232) : vciVar2;
                c = 0;
                oq5Var = oq5Var3;
                vciVar = vciVar2;
                i3 = 24;
                i2 = i4;
                kb5Var3 = kb5Var8;
                z2 = false;
                kb5Var2 = kb5Var6;
                kx0Var = kx0Var2;
                kb5Var = kb5Var7;
                irf.r(E, null, q2.f(e), null, hd6.d, 0.0f, null, oq5Var, 24624, 104);
            }
            oq5Var.p(z2);
            float f2 = i3;
            vci vciVar3 = vciVar;
            kb5 kb5Var9 = kb5Var3;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, f2, 0.0f, 0.0f, 13), f, 0.0f, 2);
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i7 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var5);
            kb5 kb5Var10 = kb5Var2;
            g0g.U(oq5Var, l2, kb5Var10);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                kb5Var4 = kb5Var;
                ouj.x(i7, oq5Var, i7, kb5Var4);
            } else {
                kb5Var4 = kb5Var;
            }
            g0g.U(oq5Var, H2, kb5Var9);
            neg.s(oq5Var);
            String M = rvf.M(R.string.wizard_skip_bottom_sheet_title, oq5Var);
            float f3 = 12;
            yci q3 = androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, 0.0f, 0.0f, f3, 7);
            agr agrVar2 = eq0.a;
            oq5 oq5Var4 = oq5Var;
            kb5 kb5Var11 = kb5Var4;
            xcs.b(M, q3, ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).j.a, oq5Var4, 48, 0, 65016);
            neg.s(oq5Var4);
            xcs.b(rvf.M(R.string.wizard_skip_bottom_sheet_description, oq5Var4), androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, 0.0f, 0.0f, f2, 7), ((dq0) oq5Var4.j(agrVar2)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var4).j.b, oq5Var4, 48, 0, 65016);
            yci r2 = androidx.compose.foundation.layout.a.r(vciVar3, hxe.b);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var4, 48);
            int i8 = oq5Var4.P;
            a l3 = oq5Var4.l();
            yci H3 = vnj.H(oq5Var4, r2);
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar);
            } else {
                oq5Var4.n0();
            }
            g0g.U(oq5Var4, a3, kb5Var5);
            g0g.U(oq5Var4, l3, kb5Var10);
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var4, i8, kb5Var11);
            }
            g0g.U(oq5Var4, H3, kb5Var9);
            neg.s(oq5Var4);
            hdg.p(rvf.M(R.string.wizard_skip_bottom_sheet_button_text_continue, oq5Var4), function0, neg.n(oq5Var4).a.a, neg.n(oq5Var4).c.a, neg.t(oq5Var4).j.c, androidx.compose.foundation.layout.a.q(d.d(androidx.compose.ui.platform.a.a(vciVar3, "wizard_skip_dialog_continue_choosing_button"), 1.0f), 0.0f, 0.0f, 0.0f, f3, 7), 0.0f, oq5Var4, ((i2 << 3) & 112) | 196608, 64);
            oq5Var2 = oq5Var4;
            neg.s(oq5Var2);
            hdg.t(rvf.M(R.string.wizard_skip_bottom_sheet_button_text_later, oq5Var2), function02, d.d(androidx.compose.ui.platform.a.a(vciVar3, "wizard_skip_dialog_choose_later_button"), 1.0f), neg.t(oq5Var2).j.c, oq5Var2, (i2 & 112) | 384, 0);
            k5r.s(oq5Var2, true, true, false, true);
            yciVar2 = vciVar3;
        }
        r = oq5Var2.r();
        if (r != null) {
            final int i9 = 1;
            function2 = new Function2(i, i9, yciVar2, function0, function02, function03) { // from class: p2w
                public final /* synthetic */ int a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ yci e;

                {
                    this.a = i9;
                    this.b = function0;
                    this.c = function02;
                    this.d = function03;
                    this.e = yciVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int R = rvf.R(1);
                            fxf.r(this.b, this.c, this.d, this.e, (hq5) obj, R);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(1);
                            fxf.r(this.b, this.c, this.d, this.e, (hq5) obj, R2);
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static float s(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final hkn t(jmq jmqVar) {
        jmqVar.getClass();
        return new hkn(jmqVar);
    }

    public static final ikn u(n3r n3rVar) {
        n3rVar.getClass();
        return new ikn(n3rVar);
    }

    public static Rect v(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static void w(View view, xhu xhuVar) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        weg wegVar = new weg();
        wegVar.a = paddingStart;
        wegVar.b = paddingTop;
        wegVar.c = paddingEnd;
        wegVar.d = paddingBottom;
        nur nurVar = new nur(5, xhuVar, wegVar);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(view, nurVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new goe(1));
        }
    }

    public static float x(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final float y(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static InvocationHandler z() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = vo0.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e) {
                b6e.q(e);
                return null;
            } catch (NoSuchMethodException e2) {
                b6e.q(e2);
                return null;
            } catch (InvocationTargetException e3) {
                b6e.q(e3);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
