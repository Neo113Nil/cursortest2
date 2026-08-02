package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Parcelable;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.pulse.metrics.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class ot0 {
    public static final int[] a = {2002, 2000, ScreenMirroringConfig.Video.DEFAULT_WIDTH, 1601, 1600, c.FINITE_SUM_FIELD_NUMBER, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final wn5 b = new wn5(new fo5(10), -744405094, false);
    public static final wn5 c = new wn5(new go5(4), 750281563, false);
    public static final wn5 d = new wn5(new go5(6), -1124921647, false);
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final lc8 i;
    public static final os2 j;
    public static final jzk k;

    static {
        new wn5(new fo5(12), 1295609118, false);
        new wn5(new fo5(14), -175511550, false);
        e = new wn5(new jo5(28), -382944048, false);
        f = new wn5(new jo5(29), -800072593, false);
        g = new wn5(new zo5(8), -1714765712, false);
        h = new wn5(new zo5(9), -1704995151, false);
        i = new lc8(9);
        j = new os2(16);
        k = new jzk(5);
    }

    public static final void A(y60 y60Var, String str, Map map) {
        y60Var.getClass();
        str.getClass();
        y60Var.a(new y70(str, map));
    }

    public static final String B(int i2, Locale locale) {
        locale.getClass();
        String format = NumberFormat.getNumberInstance(locale).format(Integer.valueOf(i2));
        format.getClass();
        return format;
    }

    public static final String C(int i2, Locale locale) {
        locale.getClass();
        return kotlin.text.c.s(',', ' ', B(i2, locale));
    }

    public static void D(int i2, d7k d7kVar) {
        d7kVar.E(7);
        byte[] bArr = d7kVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final View E(Activity activity) {
        if (bp6.a.contains(ot0.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            decorView.getClass();
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            bp6.a(ot0.class, th);
            return null;
        }
    }

    public static final cq4 F(bfu bfuVar) {
        cq4 cq4Var;
        CoroutineContext coroutineContext;
        bfuVar.getClass();
        synchronized (k) {
            cq4Var = (cq4) bfuVar.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (cq4Var == null) {
                try {
                    try {
                        dq7 dq7Var = ca8.a;
                        coroutineContext = j5h.a.g;
                    } catch (uej unused) {
                        coroutineContext = g.a;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = g.a;
                }
                cq4 cq4Var2 = new cq4(coroutineContext.plus(a4g.n()));
                bfuVar.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cq4Var2);
                cq4Var = cq4Var2;
            }
        }
        return cq4Var;
    }

    public static final boolean J() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (kotlin.text.c.v(str, "generic", false) || kotlin.text.c.v(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.M(str2, "google_sdk", false) || StringsKt.M(str2, "Emulator", false) || StringsKt.M(str2, "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.M(str3, "Genymotion", false)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (kotlin.text.c.v(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (kotlin.text.c.v(str5, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    public static final boolean K(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (ve7.b()) {
            th2 = dar.c(th2);
        }
        if (ve7.b()) {
            th = dar.c(th);
        }
        return th2.equals(th);
    }

    public static final void L(y60 y60Var, String str, String str2) {
        y60Var.getClass();
        y60Var.b(new a4f(str, str2));
    }

    public static final void M(Activity activity, Intent intent) {
        StrictMode.VmPolicy build;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            xq0.x("List adapter activity trampoline invoked without specifying target intent.");
            return;
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            xq0.x("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        zg zgVar = new zg(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 0);
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            build = ckr.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
        } else {
            build = new StrictMode.VmPolicy.Builder().build();
        }
        StrictMode.setVmPolicy(build);
        zgVar.invoke();
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aa O(v94 v94Var) {
        int i2;
        int i3;
        int i4 = v94Var.i(16);
        int i5 = v94Var.i(16);
        if (i5 == 65535) {
            i5 = v94Var.i(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i6 = i5 + i2;
        if (i4 == 44097) {
            i6 += 2;
        }
        if (v94Var.i(2) == 3) {
            do {
                v94Var.i(2);
            } while (v94Var.h());
        }
        int i7 = v94Var.i(10);
        if (v94Var.h() && v94Var.i(3) > 0) {
            v94Var.t(2);
        }
        int i8 = v94Var.h() ? 48000 : 44100;
        int i9 = v94Var.i(4);
        int[] iArr = a;
        if (i8 == 44100 && i9 == 13) {
            i3 = iArr[i9];
        } else if (i8 != 48000 || i9 >= 14) {
            i3 = 0;
        } else {
            int i10 = iArr[i9];
            int i11 = i7 % 5;
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i9 != 8) {
                    }
                    i3 = i10 + 1;
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (i9 != 3) {
                            if (i9 != 8) {
                            }
                        }
                        i3 = i10 + 1;
                    }
                    i3 = i10;
                }
            }
            if (i9 != 3) {
            }
            i3 = i10 + 1;
        }
        return new aa(i8, i6, i3);
    }

    public static void P(v94 v94Var, z9 z9Var) {
        int i2 = v94Var.i(5);
        v94Var.t(2);
        if (v94Var.h()) {
            v94Var.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            v94Var.s();
        }
        if (v94Var.h()) {
            int i3 = v94Var.i(3);
            if (z9Var.a == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                z9Var.a = i2;
            }
            if (v94Var.h()) {
                R(v94Var);
            }
        }
    }

    public static void Q(v94 v94Var, z9 z9Var) {
        v94Var.t(2);
        boolean h2 = v94Var.h();
        int i2 = v94Var.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            v94Var.t(2);
            if (v94Var.h()) {
                v94Var.t(5);
            }
            if (h2) {
                v94Var.t(24);
            } else {
                if (v94Var.h()) {
                    if (!v94Var.h()) {
                        v94Var.t(4);
                    }
                    z9Var.b = v94Var.i(6) + 1;
                }
                v94Var.t(4);
            }
        }
        if (v94Var.h()) {
            v94Var.t(3);
            if (v94Var.h()) {
                R(v94Var);
            }
        }
    }

    public static void R(v94 v94Var) {
        int i2 = v94Var.i(6);
        if (i2 < 2 || i2 > 42) {
            throw r7k.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        v94Var.t(i2 * 8);
    }

    public static String S(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d)};
        int i3 = dvt.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final LinkedHashMap T(o08 o08Var) {
        o08Var.getClass();
        LinkedHashMap q = uah.q((Map) o08Var.i.getValue());
        q.remove("customInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : q.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final v70 U(zii ziiVar, w70 w70Var) {
        x70 x70Var;
        w70Var.getClass();
        if (ziiVar instanceof qii) {
            return new v70(x70.ALBUM, ((qii) ziiVar).a.a, w70Var);
        }
        if (ziiVar instanceof rii) {
            return new v70(x70.ARTIST, ((rii) ziiVar).a.a, w70Var);
        }
        if (ziiVar instanceof tii) {
            return new v70(x70.PLAYLIST, ((tii) ziiVar).a.f, w70Var);
        }
        if (ziiVar instanceof yii) {
            return new v70(x70.WAVE, ((yii) ziiVar).a.a, w70Var);
        }
        if (ziiVar instanceof sii) {
            return new v70(x70.WAVE, ((sii) ziiVar).a.a, w70Var);
        }
        if (ziiVar instanceof uii) {
            return new v70(x70.QUERY_TO_VIBE, CollectionsKt.X(((uii) ziiVar).a.c, StringUtils.COMMA, null, null, null, 62), w70Var);
        }
        if (!(ziiVar instanceof xii)) {
            b6e.s();
            return null;
        }
        xii xiiVar = (xii) ziiVar;
        if (xiiVar.equals(wii.a)) {
            x70Var = x70.SEARCH;
        } else {
            if (!xiiVar.equals(vii.a)) {
                b6e.s();
                return null;
            }
            x70Var = x70.OTHER;
        }
        return new v70(x70Var, "", w70Var);
    }

    public static final v70 V(fki fkiVar) {
        fkiVar.getClass();
        if (fkiVar instanceof zji) {
            zji zjiVar = (zji) fkiVar;
            return new v70(x70.ALBUM, zjiVar.b.a, zjiVar.c);
        }
        if (fkiVar instanceof aki) {
            aki akiVar = (aki) fkiVar;
            return new v70(x70.ARTIST, akiVar.b.a, akiVar.c);
        }
        if (fkiVar instanceof cki) {
            cki ckiVar = (cki) fkiVar;
            return new v70(x70.PLAYLIST, ckiVar.b.f, ckiVar.c);
        }
        if (fkiVar instanceof eki) {
            eki ekiVar = (eki) fkiVar;
            return new v70(x70.WAVE, ekiVar.c.a, ekiVar.d);
        }
        if (fkiVar instanceof bki) {
            bki bkiVar = (bki) fkiVar;
            return new v70(x70.WAVE, bkiVar.b.a, bkiVar.c);
        }
        if (fkiVar instanceof dki) {
            dki dkiVar = (dki) fkiVar;
            return new v70(x70.QUERY_TO_VIBE, CollectionsKt.X(dkiVar.b.c, StringUtils.COMMA, null, null, null, 62), dkiVar.c);
        }
        b6e.s();
        return null;
    }

    public static final l80 W(fki fkiVar) {
        fkiVar.getClass();
        if (fkiVar instanceof zji) {
            return new l80(m80.a, ((zji) fkiVar).b.a, 1);
        }
        if (fkiVar instanceof aki) {
            return new l80(m80.b, ((aki) fkiVar).b.a, 1);
        }
        if (fkiVar instanceof cki) {
            return new l80(m80.c, ((cki) fkiVar).b.f, 1);
        }
        if (fkiVar instanceof eki) {
            return new l80(m80.d, o8g.Q(((eki) fkiVar).c.b.a()), 1);
        }
        if (fkiVar instanceof bki) {
            return new l80(m80.d, o8g.Q(((bki) fkiVar).b.b.a()), 1);
        }
        if (fkiVar instanceof dki) {
            return new l80(m80.e, CollectionsKt.X(((dki) fkiVar).b.c, StringUtils.COMMA, null, null, null, 62), 1);
        }
        b6e.s();
        return null;
    }

    public static final l80 X(w2r w2rVar) {
        int i2;
        w2rVar.getClass();
        zii ziiVar = (zii) w2rVar.c;
        if ((ziiVar instanceof qii) || (ziiVar instanceof rii) || (ziiVar instanceof tii) || (ziiVar instanceof yii) || (ziiVar instanceof sii) || (ziiVar instanceof uii)) {
            i2 = 1;
        } else {
            if (!(ziiVar instanceof xii)) {
                b6e.s();
                return null;
            }
            i2 = 0;
        }
        return new l80(m80.f, ((mqs) w2rVar.d).a, w2rVar.b + 1 + i2);
    }

    public static final void a(String str, fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        str.getClass();
        fudVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1056990695);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (oq5Var.h(fudVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i5 = ((i4 >> 15) & 14) | 432;
            int i6 = i4 << 6;
            q(yciVar, ild.C(-2142630571, new iv(str, function03, 1), oq5Var), fudVar, function0, function02, function03, 0.0f, oq5Var, i5 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sd1(str, fudVar, function0, function02, function03, yciVar, i2, 0);
        }
    }

    public static final void b(qn2 qn2Var, hq5 hq5Var, int i2) {
        qn2Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1306708990);
        if ((((oq5Var.g(false) ? 4 : 2) | i2 | (oq5Var.f(qn2Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            d((uo2) gld.O(qn2Var.c, oq5Var).getValue(), d.d(a.b(vci.a, neg.m(oq5Var).a.a, vnj.i), 1.0f), null, null, ild.C(-238942036, new t31(3, qn2Var), oq5Var), oq5Var, 24576);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(qn2Var, i2, 16);
        }
    }

    public static final void c(mo2 mo2Var, qn2 qn2Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1897672304);
        int i3 = (oq5Var.h(mo2Var) ? 4 : 2) | i2 | (oq5Var.f(qn2Var) ? 32 : 16) | (oq5Var.g(false) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.Z(-1102095086);
            oq5Var.p(false);
            if (mo2Var instanceof ko2) {
                oq5Var.Z(-1098506712);
                swf.h((ko2) mo2Var, qn2Var, yciVar, oq5Var, ((i3 >> 3) & 896) | (i3 & 126));
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(mo2Var, lo2.a)) {
                    throw vz1.i(oq5Var, -1698005181, false);
                }
                oq5Var.Z(-1098300500);
                ixf.m(yciVar, oq5Var, (i3 >> 9) & 14);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(mo2Var, qn2Var, yciVar, i2, 7);
        }
    }

    public static final void d(uo2 uo2Var, yci yciVar, String str, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i2) {
        String str2;
        Function1 function12;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1884614644);
        int i3 = i2 | (oq5Var.f(uo2Var) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | 3456;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            str2 = str;
            function12 = function1;
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new tf2(19);
                oq5Var.k0(K);
            }
            Function1 function13 = (Function1) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = new tf2(20);
                oq5Var.k0(K2);
            }
            androidx.compose.animation.a.b(uo2Var, yciVar, (Function1) K2, b2c.f, "bar above state transition animation", function13, wn5Var, oq5Var, (i3 & 112) | 3456 | (i3 & 14) | 1794048, 0);
            str2 = "bar above state transition animation";
            function12 = function13;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(uo2Var, yciVar, str2, function12, wn5Var, i2);
        }
    }

    public static final void e(final int i2, final int i3, final long j2, hq5 hq5Var, final yci yciVar, final boolean z) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2099113921);
        int i5 = (oq5Var.g(z) ? 32 : 16) | i2 | (oq5Var.e(j2) ? 256 : 128);
        if ((i3 & 8) != 0) {
            i4 = i5 | 3072;
        } else {
            i4 = i5 | (oq5Var.h(null) ? 2048 : 1024);
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            float f2 = 16;
            yci b2 = a.b(d.e(yciVar, f2), j2, ugo.c(f2, f2));
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(1312474785);
                oq5Var.Z(1312561926);
                f(0, 0, oq5Var, b.a.a(vci.a, b2c.c));
                oq5Var.p(false);
            } else {
                oq5Var.Z(1311181031);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(i2, i3, j2, yciVar, z) { // from class: te3
                public final /* synthetic */ yci a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ int d;

                {
                    this.a = yciVar;
                    this.b = z;
                    this.c = j2;
                    this.d = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ot0.e(rvf.R(7), this.d, this.c, (hq5) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i2, int i3, hq5 hq5Var, yci yciVar) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1647503158);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        }
        if ((i4 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            yci yciVar2 = yciVar;
            ug3.a(a.b(d.o(androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 8, 0.0f, 0.0f, 13), 60, 4), ((dq0) oq5Var.j(eq0.a)).c.c, ugo.a), oq5Var, 0);
            yciVar = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i2, i3, 1);
        }
    }

    public static final void g(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-696747098);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(lm0.e, zsd.d, oq5Var, 48, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t83(i2, 2);
        }
    }

    public static final void h(ukd ukdVar, int i2, int i3, wn5 wn5Var, hq5 hq5Var, int i4, int i5) {
        int i6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1883910253);
        if ((i4 & 6) == 0) {
            i6 = (oq5Var.f(ukdVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= oq5Var.d(i2) ? 32 : 16;
        }
        int i8 = i5 & 4;
        if (i8 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= oq5Var.d(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= oq5Var.f(wn5Var) ? 2048 : 1024;
        }
        if ((i6 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i7 != 0) {
                i2 = 0;
            }
            if (i8 != 0) {
                i3 = 0;
            }
            qa5 qa5Var = qa5.a;
            oq5Var.a0(578571862);
            oq5Var.a0(-548224868);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(qa5Var);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, ukdVar, af0.z0);
            g0g.U(oq5Var, new d40(i3), af0.A0);
            g0g.U(oq5Var, new e40(i2), af0.B0);
            wn5Var.invoke(va5.a, oq5Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        int i9 = i2;
        int i10 = i3;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ra5(ukdVar, i9, i10, wn5Var, i4, i5, 0);
        }
    }

    public static final void i(wv5 wv5Var, gvd gvdVar, fvf fvfVar, ea2 ea2Var, tvd tvdVar, tz5 tz5Var, rv5 rv5Var, hq5 hq5Var, int i2) {
        int i3;
        List list;
        Object qu5Var;
        Object obj;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1675998756);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(wv5Var) : oq5Var.h(wv5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(gvdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(ea2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(tz5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.h(rv5Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if ((599187 & i4) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            cpq cpqVar = (cpq) gld.M(tz5Var.l, oq5Var).getValue();
            boolean d2 = Intrinsics.d(cpqVar, apq.a);
            Object obj2 = gq5.a;
            if (d2) {
                oq5Var.Z(-683680570);
                oq5Var.p(false);
                list = c5b.a;
            } else if (cpqVar instanceof zoq) {
                oq5Var.Z(-683547549);
                oq5Var.p(false);
                list = c5b.a;
            } else {
                if (!(cpqVar instanceof bpq)) {
                    throw vz1.i(oq5Var, -22057393, false);
                }
                oq5Var.Z(-683468003);
                List list2 = ((bpq) cpqVar).a;
                boolean f2 = oq5Var.f(list2);
                Object K = oq5Var.K();
                if (f2 || K == obj2) {
                    list2.getClass();
                    K = etn.j0(list2, (nnq) tz5Var.g.getValue(), tz5Var.a);
                    oq5Var.k0(K);
                }
                list = (List) K;
                oq5Var.p(false);
            }
            List list3 = list;
            iv5 iv5Var = rv5Var != null ? rv5Var.b : null;
            int i5 = i4 >> 3;
            gvdVar.getClass();
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K2 = oq5Var.K();
            if (K2 == obj2) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            cce cceVar = (cce) oq5Var.j(tkg.a);
            boolean f3 = ((((i5 & 14) ^ 6) > 4 && oq5Var.f(gvdVar)) || (i5 & 6) == 4) | oq5Var.f(iv5Var) | oq5Var.f(context) | oq5Var.f(mm6Var) | oq5Var.f(cceVar);
            Object K3 = oq5Var.K();
            if (f3 || K3 == obj2) {
                obj = obj2;
                qu5Var = new qu5(gvdVar, iv5Var, context, mm6Var, cceVar);
                oq5Var.k0(qu5Var);
            } else {
                obj = obj2;
                qu5Var = K3;
            }
            qu5 qu5Var2 = (qu5) qu5Var;
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var).f, oq5Var);
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = new uj1(tz5Var.c.l);
                oq5Var.k0(K4);
            }
            krf krfVar = (krf) K4;
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "lazy_column");
            Object obj3 = obj;
            wn5 C = ild.C(-906036013, new pr((Object) qu5Var2, tvdVar, (Object) wv5Var, (Object) tz5Var, (Object) rv5Var, gvdVar, 9), oq5Var);
            boolean f4 = oq5Var.f(n) | ((i4 & 896) == 256);
            Object K5 = oq5Var.K();
            if (f4 || K5 == obj3) {
                K5 = new od1(fvfVar, n, 1);
                oq5Var.k0(K5);
            }
            int i6 = i4 << 9;
            irf.u(list3, krfVar, a2, C, (Function1) K5, fvfVar, ea2Var, 0, null, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var)), 0.0f, 0, oq5Var, (i6 & 3670016) | (458752 & i6) | 3504, 0, 3456);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv(wv5Var, gvdVar, fvfVar, ea2Var, tvdVar, tz5Var, rv5Var, i2, 2);
        }
    }

    public static final void j(vz5 vz5Var, tz5 tz5Var, gvd gvdVar, rv5 rv5Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        wv5 wv5Var = vz5Var.a;
        gvdVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1861744839);
        int i3 = i2 | (oq5Var2.f(vz5Var) ? 4 : 2) | (oq5Var2.h(tz5Var) ? 32 : 16) | (oq5Var2.f(gvdVar) ? 256 : 128) | (oq5Var2.h(rv5Var) ? 2048 : 1024) | (oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float f2 = wv5Var.j != null ? 180 : edo.b;
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            tvd e2 = edo.e(a2, null, null, f2, oq5Var2, 6);
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var2).f, oq5Var2);
            boolean c2 = oq5Var2.c(f2) | oq5Var2.f(n);
            Object K = oq5Var2.K();
            int i4 = 1;
            kjn kjnVar = gq5.a;
            if (c2 || K == kjnVar) {
                K = new kz4(f2, n, i4);
                oq5Var2.k0(K);
            }
            ea2 v = u2x.v(a2, (Function1) K, oq5Var2);
            Unit unit = Unit.a;
            boolean h2 = oq5Var2.h(tz5Var) | oq5Var2.f(a2);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new vv4(tz5Var, a2, (Continuation) null, 15);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, unit, (Function2) K2);
            yci a3 = androidx.compose.ui.platform.a.a(d.c(yciVar, 1.0f), "concert_screen_success");
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            etn.t(a2, v, oq5Var2, 0);
            i(wv5Var, gvdVar, a2, v, e2, tz5Var, rv5Var, oq5Var2, ((i3 >> 3) & 112) | 8 | ((i3 << 12) & 458752) | ((i3 << 9) & 3670016));
            String str = wv5Var.f.c;
            boolean h3 = oq5Var2.h(tz5Var);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                e65 e65Var = new e65(0, tz5Var, tz5.class, "onBackClick", "onBackClick()V", 0, 17);
                oq5Var2.k0(e65Var);
                K3 = e65Var;
            }
            edo.c(e2, str, null, (Function0) ((h9f) K3), null, null, edo.b, oq5Var2, 221184, 4);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oz5(vz5Var, tz5Var, gvdVar, rv5Var, yciVar, i2);
        }
    }

    public static final void k(d8t d8tVar, yci yciVar, wdc wdcVar, Function1 function1, boolean z, wn5 wn5Var, hq5 hq5Var, int i2) {
        wdc wdcVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        d8t d8tVar2 = d8tVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1211267897);
        int i3 = (i2 & 6) == 0 ? (oq5Var.f(d8tVar2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            wdcVar2 = wdcVar;
            i3 |= oq5Var.h(wdcVar2) ? 256 : 128;
        } else {
            wdcVar2 = wdcVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        boolean z5 = z;
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.g(z5) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (K == kjnVar) {
                s2r s2rVar = new s2r();
                s2rVar.add(d8tVar2.c());
                oq5Var.k0(s2rVar);
                obj = s2rVar;
            }
            s2r s2rVar2 = (s2r) obj;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                long[] jArr = vso.a;
                K2 = new tpi();
                oq5Var.k0(K2);
            }
            tpi tpiVar = (tpi) K2;
            Object c2 = d8tVar2.c();
            x6k x6kVar = d8tVar2.d;
            if (Intrinsics.d(c2, x6kVar.getValue())) {
                oq5Var.Z(-1432826543);
                if (s2rVar2.size() == 1 && Intrinsics.d(s2rVar2.get(0), x6kVar.getValue())) {
                    oq5Var.Z(-1434801367);
                } else {
                    oq5Var.Z(-1432692189);
                    boolean z6 = (i3 & 14) == 4;
                    Object K3 = oq5Var.K();
                    if (z6 || K3 == kjnVar) {
                        K3 = new at5(13, d8tVar2);
                        oq5Var.k0(K3);
                    }
                    z75.z(s2rVar2, (Function1) K3);
                    tpiVar.a();
                }
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1434801367);
            }
            oq5Var.p(false);
            if (tpiVar.b(x6kVar.getValue())) {
                z2 = false;
                z3 = true;
                oq5Var.Z(-1434801367);
            } else {
                oq5Var.Z(-1432425713);
                ListIterator listIterator = s2rVar2.listIterator();
                int i4 = 0;
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (Intrinsics.d(function1.invoke(ezdVar.next()), function1.invoke(x6kVar.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    s2rVar2.add(x6kVar.getValue());
                } else {
                    s2rVar2.set(i4, x6kVar.getValue());
                }
                tpiVar.a();
                int size = s2rVar2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = s2rVar2.get(i5);
                    tpiVar.m(obj2, ild.C(796672816, new qr(d8tVar2, z5, wdcVar2, obj2, wn5Var), oq5Var));
                    i5++;
                    d8tVar2 = d8tVar;
                    wdcVar2 = wdcVar;
                    z5 = z;
                }
                z2 = false;
                z3 = true;
            }
            oq5Var.p(z2);
            kfh d2 = ug3.d(b2c.b, z2);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1497030269);
            int size2 = s2rVar2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = s2rVar2.get(i7);
                oq5Var.W(1785150334, function1.invoke(obj3));
                Function2 function2 = (Function2) tpiVar.g(obj3);
                if (function2 == null) {
                    oq5Var.Z(-494863033);
                    z4 = false;
                } else {
                    z4 = false;
                    oq5Var.Z(1785151994);
                    function2.invoke(oq5Var, 0);
                }
                oq5Var.p(z4);
                oq5Var.p(z4);
            }
            oq5Var.p(false);
            oq5Var.p(z3);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(d8tVar, yciVar, wdcVar, function1, z, wn5Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(Object obj, Function1 function1, yci yciVar, wdc wdcVar, String str, boolean z, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        wdc wdcVar2;
        int i6;
        String str2;
        int i7;
        boolean z2;
        wdc S;
        boolean z3;
        xmn r;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2131711102);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function1) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                wdcVar2 = wdcVar;
                i4 |= oq5Var.h(wdcVar2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    str2 = str;
                    i4 |= oq5Var.f(str2) ? 16384 : RemoteCameraConfig.Notification.ID;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                    } else if ((196608 & i2) == 0) {
                        z2 = z;
                        i4 |= oq5Var.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        if ((1572864 & i2) == 0) {
                            i4 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
                        }
                        if ((599187 & i4) == 599186 || !oq5Var.z()) {
                            yci yciVar3 = i8 != 0 ? vci.a : yciVar2;
                            S = i5 != 0 ? weo.S(0, 0, null, 7) : wdcVar2;
                            if (i6 != 0) {
                                str2 = null;
                            }
                            boolean z4 = i7 != 0 ? true : z2;
                            int i9 = i4 >> 3;
                            yci yciVar4 = yciVar3;
                            k(i8t.e(obj, str2, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), yciVar4, S, function1, z4, wn5Var, oq5Var, ((i4 << 6) & 7168) | (i9 & 1008) | (57344 & i9) | (i9 & 458752));
                            yciVar2 = yciVar4;
                            z3 = z4;
                        } else {
                            oq5Var.S();
                            S = wdcVar2;
                            z3 = z2;
                        }
                        String str3 = str2;
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new i93(obj, function1, yciVar2, S, str3, z3, wn5Var, i2, i3);
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((599187 & i4) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    int i92 = i4 >> 3;
                    yci yciVar42 = yciVar3;
                    k(i8t.e(obj, str2, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), yciVar42, S, function1, z4, wn5Var, oq5Var, ((i4 << 6) & 7168) | (i92 & 1008) | (57344 & i92) | (i92 & 458752));
                    yciVar2 = yciVar42;
                    z3 = z4;
                    String str32 = str2;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                str2 = str;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                z2 = z;
                if ((1572864 & i2) == 0) {
                }
                if ((599187 & i4) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                int i922 = i4 >> 3;
                yci yciVar422 = yciVar3;
                k(i8t.e(obj, str2, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), yciVar422, S, function1, z4, wn5Var, oq5Var, ((i4 << 6) & 7168) | (i922 & 1008) | (57344 & i922) | (i922 & 458752));
                yciVar2 = yciVar422;
                z3 = z4;
                String str322 = str2;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            wdcVar2 = wdcVar;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str2 = str;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            z2 = z;
            if ((1572864 & i2) == 0) {
            }
            if ((599187 & i4) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            int i9222 = i4 >> 3;
            yci yciVar4222 = yciVar3;
            k(i8t.e(obj, str2, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), yciVar4222, S, function1, z4, wn5Var, oq5Var, ((i4 << 6) & 7168) | (i9222 & 1008) | (57344 & i9222) | (i9222 & 458752));
            yciVar2 = yciVar4222;
            z3 = z4;
            String str3222 = str2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        wdcVar2 = wdcVar;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str2 = str;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        z2 = z;
        if ((1572864 & i2) == 0) {
        }
        if ((599187 & i4) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        int i92222 = i4 >> 3;
        yci yciVar42222 = yciVar3;
        k(i8t.e(obj, str2, oq5Var, (i4 & 14) | ((i4 >> 9) & 112), 0), yciVar42222, S, function1, z4, wn5Var, oq5Var, ((i4 << 6) & 7168) | (i92222 & 1008) | (57344 & i92222) | (i92222 & 458752));
        yciVar2 = yciVar42222;
        z3 = z4;
        String str32222 = str2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void m(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1515549229);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci m = d.m(vciVar, 64);
            long j2 = d85.f;
            tgo tgoVar = ugo.a;
            ug3.a(a.b(m, j2, tgoVar), oq5Var, 0);
            ug3.a(a.b(d.o(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 14, 0.0f, 0.0f, 13), 36, 8), j2, tgoVar), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j3(i2, 15);
        }
    }

    public static final void n(float f2, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-932684594);
        int i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 wn5Var = weo.b;
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new y8q(f2);
                oq5Var.k0(K);
            }
            p9b.a(wn5Var, wyf.s(vci.a, (Function0) K), false, oq5Var, 6, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xd1(i2, f2, 0);
        }
    }

    public static final void o(v2h v2hVar, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, wn5 wn5Var5, wn5 wn5Var6, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-209110025);
        int i3 = i2 | (oq5Var.f(v2hVar) ? 4 : 2) | 12582912;
        if (oq5Var.P(i3 & 1, (4793491 & i3) != 4793490)) {
            vci vciVar = vci.a;
            bg3.a(d.c(vciVar, 1.0f), b2c.f, false, ild.C(1539256525, new ntb(v2hVar, wn5Var, wn5Var2, wn5Var3, wn5Var5, wn5Var6, wn5Var4, 0), oq5Var), oq5Var, 3120, 4);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x91(v2hVar, wn5Var, wn5Var2, wn5Var3, wn5Var4, wn5Var5, wn5Var6, yciVar2, i2, 2);
        }
    }

    public static final void p(jef jefVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1430269386);
        int i3 = i2 | (oq5Var2.h(jefVar) ? 4 : 2) | (oq5Var2.f(list) ? 32 : 16) | (oq5Var2.f(fvfVar) ? 256 : 128) | (oq5Var2.f(vmVar) ? 2048 : 1024) | (oq5Var2.f(q0kVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            boolean booleanValue = ((Boolean) szf.Q(jefVar.h, oq5Var2).getValue()).booleanValue();
            boolean h2 = oq5Var2.h(jefVar);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                v2d v2dVar = new v2d(0, jefVar, jef.class, "onRefresh", "onRefresh()V", 0, 23);
                oq5Var2.k0(v2dVar);
                K = v2dVar;
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), vmVar, null, false, ild.C(718768714, new lef(vmVar, q0kVar, list, fvfVar, jefVar, 0), oq5Var2), oq5Var, ((i3 >> 3) & 896) | 196608, 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lef(jefVar, list, fvfVar, vmVar, q0kVar, i2);
        }
    }

    public static final void q(yci yciVar, wn5 wn5Var, fud fudVar, Function0 function0, Function0 function02, Function0 function03, float f2, hq5 hq5Var, int i2) {
        int i3;
        wn5 wn5Var2;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        float f3;
        wn5 wn5Var3 = weo.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-954476211);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            wn5Var2 = wn5Var;
            i3 |= oq5Var.h(wn5Var2) ? 32 : 16;
        } else {
            wn5Var2 = wn5Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(fudVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function04 = function0;
            i3 |= oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function04 = function0;
        }
        if ((196608 & i2) == 0) {
            function05 = function02;
            i3 |= oq5Var.h(function05) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function05 = function02;
        }
        if ((1572864 & i2) == 0) {
            function06 = function03;
            i3 |= oq5Var.h(function06) ? 1048576 : 524288;
        } else {
            function06 = function03;
        }
        if (((i3 | 12582912) & 4793491) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            f3 = f2;
        } else {
            float f4 = 114;
            wje s = fgq.s(fgq.D("slot_entity_shimmer", oq5Var, 0), 0.05f, 0.1f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), "slot_entity_shimmer_animation", oq5Var, 28680, 0);
            oq5Var = oq5Var;
            boolean h2 = oq5Var.h(fudVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new td1(fudVar, 0);
                oq5Var.k0(K);
            }
            yci a2 = androidx.compose.ui.draw.a.a(yciVar, (Function1) K);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            jf0.a(new qzm[0], null, true, ild.C(554530831, new ud1(function04, function05, function06, wn5Var2, f4, s, 0), oq5Var), oq5Var, 3072, 2);
            boolean h3 = oq5Var.h(fudVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                K2 = new yd1(fudVar, 0);
                oq5Var.k0(K2);
            }
            zsd.r((Function0) K2, null, androidx.compose.foundation.layout.a.j(b.a.a(vci.a, b2c.i), 0, 160), oq5Var, 48);
            oq5Var.p(true);
            f3 = f4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vd1(yciVar, wn5Var, fudVar, function0, function02, function03, f3, i2);
        }
    }

    public static Intent r(Intent intent, e9t e9tVar, int i2) {
        Intent intent2 = new Intent(e9tVar.a, (Class<?>) InvisibleActionTrampolineActivity.class);
        intent2.setData(y(e9tVar, i2, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static void t(int i2, int i3) {
        GLES20.glBindTexture(i2, i3);
        v();
        GLES20.glTexParameteri(i2, 10240, 9729);
        v();
        GLES20.glTexParameteri(i2, 10241, 9729);
        v();
        GLES20.glTexParameteri(i2, 10242, 33071);
        v();
        GLES20.glTexParameteri(i2, 10243, 33071);
        v();
    }

    public static final String u(byte[] bArr) {
        bArr.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        return stringBuffer2;
    }

    public static void v() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new zcd(sb.toString());
        }
    }

    public static final String x(int i2) {
        return k5r.i(i2, "appWidget-");
    }

    public static final Uri y(e9t e9tVar, int i2, int i3, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i3 == 1) {
            str2 = "ACTIVITY";
        } else if (i3 == 2) {
            str2 = "BROADCAST";
        } else if (i3 == 3) {
            str2 = "SERVICE";
        } else if (i3 == 4) {
            str2 = "FOREGROUND_SERVICE";
        } else {
            if (i3 != 5) {
                throw null;
            }
            str2 = "CALLBACK";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(e9tVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i2));
        builder.appendQueryParameter("viewSize", fma.d(e9tVar.j));
        builder.appendQueryParameter("extraData", str);
        if (e9tVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(e9tVar.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Object z(wx9 wx9Var, xzb xzbVar) {
        if (wx9Var instanceof ox9) {
            return ((ox9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof px9) {
            return ((px9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof qx9) {
            return c85.a(((Number) ((qx9) wx9Var).b.a.a(xzbVar)).intValue());
        }
        if (wx9Var instanceof rx9) {
            return ((rx9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof sx9) {
            return ((sx9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof tx9) {
            return ((tx9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof ux9) {
            return ((ux9) wx9Var).b.a.a(xzbVar);
        }
        if (wx9Var instanceof vx9) {
            return ((Uri) ((vx9) wx9Var).b.a.a(xzbVar)).toString();
        }
        b6e.s();
        return null;
    }

    public void G(xjo xjoVar, Iterable iterable) {
        xjoVar.getClass();
        if (iterable == null) {
            return;
        }
        cko D0 = xjoVar.D0(w());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    s(D0, obj);
                    D0.q();
                    D0.reset();
                }
            }
            i4w.w(D0, null);
        } finally {
        }
    }

    public void H(xjo xjoVar, Object obj) {
        xjoVar.getClass();
        if (obj == null) {
            return;
        }
        cko D0 = xjoVar.D0(w());
        try {
            s(D0, obj);
            D0.q();
            i4w.w(D0, null);
        } finally {
        }
    }

    public long I(xjo xjoVar, Object obj) {
        xjoVar.getClass();
        if (obj == null) {
            return -1L;
        }
        cko D0 = xjoVar.D0(w());
        try {
            s(D0, obj);
            D0.q();
            i4w.w(D0, null);
            if (gut.L(xjoVar) == 0) {
                return -1L;
            }
            D0 = xjoVar.D0("SELECT last_insert_rowid()");
            try {
                D0.q();
                long j2 = D0.getLong(0);
                i4w.w(D0, null);
                return j2;
            } finally {
            }
        } finally {
        }
    }

    public abstract Object N();

    public abstract void s(cko ckoVar, Object obj);

    public abstract String w();
}
