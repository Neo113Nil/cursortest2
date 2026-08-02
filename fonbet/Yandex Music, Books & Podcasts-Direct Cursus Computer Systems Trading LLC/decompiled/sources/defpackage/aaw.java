package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.yandex.music.screen.landing.api.header.ui.view.HeaderContentViewFrameLayout;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import j$.time.ZonedDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.coroutines.g;
import kotlin.text.StringsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class aaw implements xwt, w2q, fyh, inb, pur, l0e, e1o, s3c, v3q {
    public static final aaw b = new aaw(2);
    public static final aaw c = new aaw(3);
    public static final aaw d = new aaw(4);
    public static final l1j e = new l1j(16);
    public static final aaw f = new aaw(7);
    public static final aaw g = new aaw(8);
    public static final aaw h = new aaw(10);
    public static final aaw i = new aaw(11);
    public final /* synthetic */ int a;

    public /* synthetic */ aaw(int i2) {
        this.a = i2;
    }

    public static a6v C(k2v k2vVar, boolean z, hq5 hq5Var) {
        long f2;
        Integer num;
        j2v j2vVar;
        oq5 oq5Var = (oq5) hq5Var;
        if (asq.I((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a))) {
            ArrayList arrayList = m3w.a;
            f2 = c3x.f(1627389951);
        } else {
            f2 = z ? (k2vVar == null || (num = k2vVar.e) == null) ? oa5.a : c3x.f(num.intValue()) : oa5.a;
        }
        if (k2vVar != null && (j2vVar = k2vVar.k) != null) {
            int ordinal = j2vVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(104255982);
                z5v z5vVar = new z5v(((dq0) oq5Var.j(eq0.a)).a.h, c3x.f(-8087367), m3w.a(u75.h(new Pair(Float.valueOf(0.0f), -14602684), new Pair(Float.valueOf(0.5f), -14602684)), oq5Var));
                oq5Var.p(false);
                return z5vVar;
            }
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
        }
        if (z) {
            oq5Var.Z(104267873);
            y5v y5vVar = new y5v(m3w.a(k2vVar != null ? k2vVar.f : null, oq5Var), f2);
            oq5Var.p(false);
            return y5vVar;
        }
        oq5Var.Z(104274219);
        y5v y5vVar2 = new y5v(m3w.a(null, oq5Var), f2);
        oq5Var.p(false);
        return y5vVar2;
    }

    public static final String a(int i2) {
        int i3 = HeaderContentViewFrameLayout.h;
        int mode = View.MeasureSpec.getMode(i2);
        return "{mode:" + (mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? "UNKNOWN" : "EXACTLY" : "UNSPECIFIED" : "AT_MOST") + ", size:" + View.MeasureSpec.getSize(i2) + "}";
    }

    public static ct5 d(h06 h06Var, o36 o36Var, int i2, boolean z) {
        h06Var.getClass();
        o36Var.getClass();
        String str = h06Var.i;
        String str2 = h06Var.k;
        String str3 = h06Var.g;
        WebPath$Storage webPath$Storage = WebPath$Storage.AFISHA;
        str.getClass();
        webPath$Storage.getClass();
        String pathForSize = etn.B(str, webPath$Storage).getPathForSize(i2);
        pathForSize.getClass();
        String str4 = h06Var.b;
        ZonedDateTime zonedDateTime = h06Var.f;
        String h2 = o36Var.h(zonedDateTime);
        String g2 = o36Var.g(zonedDateTime);
        String c2 = o36Var.c(zonedDateTime);
        String b2 = o36Var.b(zonedDateTime);
        String str5 = h06Var.d;
        String str6 = h06Var.e;
        String str7 = (str6 == null || StringsKt.U(str6)) ? null : str6;
        String str8 = (str3 == null || StringsKt.U(str3)) ? null : str3;
        String str9 = (str2 == null || StringsKt.U(str2)) ? null : str2;
        Integer num = h06Var.l;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(o36Var.e(h06Var.m.d()));
            sb.append(", ");
        }
        sb.append(h06Var.b);
        sb.append(", ");
        sb.append(o36Var.d(zonedDateTime));
        sb.append(", ");
        sb.append(h06Var.d);
        if (str6 != null) {
            if (StringsKt.U(str6)) {
                str6 = null;
            }
            if (str6 != null) {
                sb.append(", ");
                sb.append(str6);
            }
        }
        if (str3 != null) {
            String str10 = !StringsKt.U(str3) ? str3 : null;
            if (str10 != null) {
                sb.append(", ");
                sb.append(str10);
            }
        }
        if (z) {
            Integer num2 = h06Var.l;
            if (num2 != null) {
                int intValue = num2.intValue();
                sb.append(", ");
                sb.append(o36Var.f(intValue));
            }
        } else if (str2 != null) {
            String str11 = !StringsKt.U(str2) ? str2 : null;
            if (str11 != null) {
                sb.append(", ");
                sb.append(str11);
            }
        }
        return new ct5(pathForSize, c3x.f(h06Var.j), str4, h2, g2, c2, b2, str5, str7, str8, str9, num, sb.toString(), h06Var.m);
    }

    public static po6 m(String str) {
        return new po6("", str, "subtitle", true, jzb.d, true, true);
    }

    public static void q(np2 np2Var, Intent intent) {
        intent.getClass();
        Bundle bundle = (Bundle) intent.getParcelableExtra("extra.localPush");
        if (bundle == null) {
            return;
        }
        Serializable serializable = bundle.getSerializable("extra.localPush.type");
        emg emgVar = serializable instanceof emg ? (emg) serializable : null;
        if (emgVar == null) {
            su4.s(2, null, "Unknown local push action type", null);
        }
        if (emgVar == null) {
            return;
        }
        int ordinal = emgVar.ordinal();
        if (ordinal == 0) {
            String string = bundle.getString("extra.localPush.title", "");
            HashMap hashMap = new HashMap();
            hashMap.put("title", string);
            hashMap.put("local", "local");
            hashMap.put("local_notification_type", "authenticate_reminder");
            lg3.e0("push_click_notification", hashMap);
            return;
        }
        if (ordinal != 1) {
            b6e.s();
            return;
        }
        NotificationManager g2 = l1b.g(np2Var);
        if (g2 != null) {
            try {
                g2.cancel(12001);
            } catch (Throwable th) {
                if (!c9g.J(th)) {
                    throw th;
                }
                ssg.a(6, null, "Dead system raise", th);
            }
        }
    }

    public static wdj t(mqs mqsVar, ag5 ag5Var, fdj fdjVar, vdj vdjVar, hq5 hq5Var, int i2) {
        mqsVar.getClass();
        ag5Var.getClass();
        fdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-329573434);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            mrm mrmVar = mrm.a;
            oq5Var.p(false);
            return mrmVar;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        boolean z = true;
        boolean f2 = oq5Var.f(mqsVar) | oq5Var.f(context) | ((((i2 & 112) ^ 48) > 32 && oq5Var.f(ag5Var)) || (i2 & 48) == 32);
        if ((((57344 & i2) ^ 24576) <= 16384 || !oq5Var.g(false)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean z2 = f2 | z;
        Object K2 = oq5Var.K();
        if (z2 || K2 == kjnVar) {
            context.getClass();
            ydj ydjVar = new ydj(fdjVar, mqsVar, false, mm6Var, context, ag5Var, vdjVar);
            oq5Var.k0(ydjVar);
            K2 = ydjVar;
        }
        wdj wdjVar = (wdj) K2;
        oq5Var.p(false);
        return wdjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void x(hi3 hi3Var, String str) {
        int i2;
        String str2;
        str.getClass();
        String[] strArr = hj3.h;
        hi3Var.M0(34);
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i2 = str2 == null ? i2 + 1 : 0;
                if (i3 < i2) {
                    hi3Var.R0(i3, i2, str);
                }
                hi3Var.S0(str2);
                i3 = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i3 < i2) {
                }
                hi3Var.S0(str2);
                i3 = i2 + 1;
            }
        }
        if (i3 < length) {
            hi3Var.R0(i3, length, str);
        }
        hi3Var.M0(34);
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return null;
    }

    @Override // defpackage.inb
    public fnb B(gnb gnbVar, Intent intent, Bundle bundle, gfo gfoVar) {
        m6s R;
        fnb fnbVar;
        if (bundle != null && (fnbVar = (fnb) bundle.getParcelable("global.key.evgen.meta")) != null) {
            return fnbVar;
        }
        uqi uqiVar = (uqi) intent.getParcelableExtra("global.key.evgen.meta");
        if (uqiVar == null) {
            uqiVar = null;
        } else if (uqiVar.a == gfo.Deeplink && (R = qgg.R(intent)) != null && R.b) {
            return uqiVar;
        }
        if (gfoVar != null) {
            return new uqi(gfoVar);
        }
        if (uqiVar != null && uqiVar.a == gfo.Deeplink) {
            return uqiVar;
        }
        if (uqiVar != null) {
            return uqiVar;
        }
        Assertions.throwOrSkip$default(new FailedAssertionException(tlm.j("No evgen meta provided in non root screen for ", gnbVar.getClass())), null, 2, null);
        return new uqi(gfo.Unknown);
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        e5qVar.getClass();
        if ((e5qVar instanceof u4q) || (e5qVar instanceof s4q) || (e5qVar instanceof w4q) || (e5qVar instanceof d5q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        z3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        f5qVar.getClass();
        return null;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 4:
                focVar.getClass();
                return Boolean.FALSE;
            default:
                focVar.getClass();
                return axk.b;
        }
    }

    @Override // defpackage.l0e
    public c8k f(h0e h0eVar, xzd xzdVar) {
        return new k0e(h0eVar, xzdVar);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        switch (this.a) {
            case 4:
                faqVar.getClass();
                boolean z = false;
                if (!(faqVar instanceof daq)) {
                    if (!(faqVar instanceof naq)) {
                        if (!(faqVar instanceof qaq)) {
                            if (!(faqVar instanceof saq)) {
                                b6e.s();
                                return null;
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                faqVar.getClass();
                if ((faqVar instanceof naq) || (faqVar instanceof saq)) {
                    return axk.a;
                }
                if (faqVar instanceof daq) {
                    return axk.b;
                }
                if (faqVar instanceof qaq) {
                    return axk.b;
                }
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 4:
                jzsVar.getClass();
                return Boolean.TRUE;
            default:
                jzsVar.getClass();
                return axk.a;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 4:
                m1qVar.getClass();
                boolean z = false;
                if (!(m1qVar instanceof j1q)) {
                    if (m1qVar instanceof c2q) {
                        z = true;
                    } else if (!(m1qVar instanceof e2q)) {
                        b6e.s();
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            default:
                m1qVar.getClass();
                if (m1qVar instanceof c2q) {
                    return axk.a;
                }
                if (m1qVar instanceof j1q) {
                    return axk.b;
                }
                if (m1qVar instanceof e2q) {
                    int ordinal = ((e2q) m1qVar).c.c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            return axk.a;
                        }
                        if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                            b6e.s();
                        }
                    }
                    return axk.b;
                }
                b6e.s();
                return null;
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 4:
                i5uVar.getClass();
                return Boolean.TRUE;
            default:
                i5uVar.getClass();
                return axk.a;
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 4:
                k4dVar.getClass();
                return Boolean.FALSE;
            default:
                k4dVar.getClass();
                return axk.b;
        }
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f2) {
        zcoVar.getClass();
        zcoVar.y((-(nmq.b(zcoVar.p) * 0.15483871f)) * f2);
        zcoVar.a(1.0f - f2);
    }

    public p79 n(ContextWrapper contextWrapper) {
        p79 p79Var = p79.d;
        if (p79Var != null) {
            return p79Var;
        }
        synchronized (this) {
            p79 p79Var2 = p79.d;
            if (p79Var2 != null) {
                return p79Var2;
            }
            p79 p79Var3 = new p79(contextWrapper, p79.c);
            p79.d = p79Var3;
            return p79Var3;
        }
    }

    @Override // defpackage.l0e
    public c8k o() {
        return new k0e();
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return null;
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        return Float.valueOf(p7f.d(b7fVar) * f2);
    }

    @Override // defpackage.inb
    public fnb s(o oVar, Bundle bundle, gfo gfoVar) {
        uqi uqiVar;
        m6s R;
        fnb fnbVar;
        if (bundle != null && (fnbVar = (fnb) bundle.getParcelable("global.key.evgen.meta")) != null) {
            return fnbVar;
        }
        t requireActivity = oVar.requireActivity();
        requireActivity.getClass();
        Activity K = bcx.K(requireActivity);
        Intent intent = K != null ? K.getIntent() : null;
        if (intent == null || (uqiVar = (uqi) intent.getParcelableExtra("global.key.evgen.meta")) == null || uqiVar.a != gfo.Deeplink) {
            uqiVar = null;
        }
        if (uqiVar != null && (R = qgg.R(intent)) != null && R.b) {
            return new uqi(uqiVar.a, uqiVar.b);
        }
        if (gfoVar != null) {
            return new uqi(gfoVar);
        }
        if (uqiVar != null) {
            return new uqi(uqiVar.a, uqiVar.b);
        }
        return null;
    }

    public synchronized void u(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("prefs.pushService", 0);
        sharedPreferences.getClass();
        sharedPreferences.edit().remove("key.auth_push_time").apply();
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return null;
    }

    @Override // defpackage.fyh
    public boolean w(hxh hxhVar) {
        return false;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return null;
    }

    @Override // defpackage.s3c
    public void b(Object obj) {
    }

    @Override // defpackage.fyh
    public void e(hxh hxhVar, boolean z) {
    }
}
