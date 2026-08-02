package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.android.installreferrer.api.InstallReferrerClient;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

/* loaded from: classes5.dex */
public final class y9w implements dup, w2q, m7q, na, mu1, pur, dhc, v3q, n03 {
    public static final y9w b = new y9w(1);
    public static final /* synthetic */ y9w c = new y9w(3);
    public static final d5b d = new d5b();
    public static final y9w e = new y9w(4);
    public static final y9w f = new y9w(6);
    public static final y9w g = new y9w(7);
    public static final y9w h = new y9w(8);
    public static final y9w i = new y9w(10);
    public static final y9w j = new y9w(11);
    public final /* synthetic */ int a;

    public /* synthetic */ y9w(int i2) {
        this.a = i2;
    }

    public static o6g F(List list, float f2, float f3, int i2) {
        return new o6g(list, null, (Float.floatToRawIntBits((i2 & 2) != 0 ? 0.0f : f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), 0);
    }

    public static o6g G(Pair[] pairArr, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.POSITIVE_INFINITY;
        }
        return L((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static void J() {
        synchronized (pt0.j()) {
            if (pt0.h() != null) {
                return;
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            if (!bp6.a.contains(pt0.class)) {
                try {
                    pt0.c = scheduledThreadPoolExecutor;
                } catch (Throwable th) {
                    bp6.a(pt0.class, th);
                }
            }
            q qVar = q.g;
            ScheduledThreadPoolExecutor h2 = pt0.h();
            if (h2 != null) {
                h2.scheduleAtFixedRate(qVar, 0L, 86400, TimeUnit.SECONDS);
            } else {
                xq0.q("Required value was null.");
            }
        }
    }

    public static o6g L(Pair[] pairArr, long j2, long j3) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new d85(((d85) pair.b).a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.a).floatValue()));
        }
        return new o6g(arrayList, arrayList2, j2, j3, 0);
    }

    public static HashMap M(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet();
                    int length2 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        int optInt2 = optJSONArray2.optInt(i3);
                        if (optInt2 != 0) {
                            hashSet.add(Integer.valueOf(optInt2));
                        }
                    }
                }
                hashMap.put(Integer.valueOf(optInt), hashSet);
            }
        }
        return hashMap;
    }

    public static afn N(Pair[] pairArr, float f2, int i2) {
        if ((i2 & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        float f3 = f2;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new d85(((d85) pair.b).a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.a).floatValue()));
        }
        return new afn(arrayList, arrayList2, 9205357640488583168L, f3);
    }

    public static z6a Q(aab aabVar, int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-615405762);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            b7a b7aVar = b7a.a;
            oq5Var.p(false);
            return b7aVar;
        }
        boolean f2 = oq5Var.f(aabVar) | oq5Var.d(i2);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new a7a(i2, aabVar, null);
            oq5Var.k0(K);
        }
        a7a a7aVar = (a7a) K;
        oq5Var.p(false);
        return a7aVar;
    }

    public static z6a R(aab aabVar, y6a y6aVar, int i2, hq5 hq5Var, int i3) {
        aabVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(276658894);
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            b7a b7aVar = b7a.a;
            oq5Var.p(false);
            return b7aVar;
        }
        boolean f2 = oq5Var.f(aabVar) | oq5Var.d(i2) | oq5Var.f(y6aVar);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new a7a(i2, aabVar, y6aVar);
            oq5Var.k0(K);
        }
        a7a a7aVar = (a7a) K;
        oq5Var.p(false);
        return a7aVar;
    }

    public static taj S(oq oqVar, wpd wpdVar, hq5 hq5Var) {
        oqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-271450721);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            lrm lrmVar = lrm.a;
            oq5Var.p(false);
            return lrmVar;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        boolean f2 = oq5Var.f(oqVar);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            mm6Var.getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(z3g.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            z3g z3gVar = (z3g) qdcVar.C(I);
            z3gVar.b(oqVar);
            K2 = new vaj(oqVar, z3gVar, mm6Var, wpdVar);
            oq5Var.k0(K2);
        }
        taj tajVar = (taj) K2;
        oq5Var.p(false);
        return tajVar;
    }

    public static o6g T(List list, float f2, float f3, int i2) {
        return new o6g(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i2 & 2) != 0 ? 0.0f : f2) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f3) & 4294967295L), 0);
    }

    public static o6g U(Pair[] pairArr, int i2) {
        float f2 = (i2 & 2) != 0 ? 0.0f : Float.POSITIVE_INFINITY;
        float f3 = (i2 & 4) == 0 ? 0.0f : Float.POSITIVE_INFINITY;
        return L((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    public static void V(IOException iOException, Function0 function0) {
        if (iOException != null) {
            ssg.a(5, "PhonotekaSynchronizer", (String) function0.invoke(), iOException);
        } else {
            ssg.a(5, "PhonotekaSynchronizer", (String) function0.invoke(), null);
        }
    }

    public static final void a(ht0 ht0Var, la laVar) {
        boolean z;
        String str = ht0Var.d;
        boolean z2 = ht0Var.b;
        pa7 pa7Var = lt0.a;
        if (!bp6.a.contains(lt0.class)) {
            try {
                laVar.getClass();
                lt0.b.execute(new x8x(5, laVar, ht0Var));
            } catch (Throwable th) {
                bp6.a(lt0.class, th);
            }
        }
        boolean z3 = false;
        if (x6c.b(v6c.OnDevicePostInstallEventProcessing) && wpj.a()) {
            String str2 = laVar.b;
            Set set = bp6.a;
            if (!set.contains(wpj.class)) {
                try {
                    wpj wpjVar = wpj.b;
                    if (!set.contains(wpjVar)) {
                        if (z2) {
                            try {
                                if (wpj.a.contains(str)) {
                                    z = true;
                                    if (z2 || z) {
                                        j3c.d().execute(new e8h(str2, ht0Var, z3, 7));
                                    }
                                }
                            } catch (Throwable th2) {
                                bp6.a(wpjVar, th2);
                            }
                        }
                        z = false;
                        if (z2) {
                        }
                        j3c.d().execute(new e8h(str2, ht0Var, z3, 7));
                    }
                } catch (Throwable th3) {
                    bp6.a(wpj.class, th3);
                }
            }
        }
        if (z2) {
            return;
        }
        if (!bp6.a.contains(pt0.class)) {
            try {
                z3 = pt0.f;
            } catch (Throwable th4) {
                bp6.a(pt0.class, th4);
            }
        }
        if (z3) {
            return;
        }
        if (!Intrinsics.d(str, "fb_mobile_activate_app")) {
            HashMap hashMap = lsg.d;
            b3i.Q(tsg.b, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        } else {
            if (bp6.a.contains(pt0.class)) {
                return;
            }
            try {
                pt0.f = true;
            } catch (Throwable th5) {
                bp6.a(pt0.class, th5);
            }
        }
    }

    public static gsu f(int i2, String str) {
        mhi mhiVar = mhi.b;
        String str2 = (i2 & 2) != 0 ? "Я.Дрейк х Пользователь" : "Непрогруз фоток и очеееень длинное какое-то название чисто посмотреть что будет";
        if ((i2 & 4) != 0) {
            mhiVar = mhi.a;
        }
        return new gsu(str, str2, "", "", mhiVar, new dou("user:onyourwave", new s9p(t75.c(r9p.a)), "Моя волна", ""));
    }

    public static nsh n() {
        return new nsh(null, uah.d(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), uah.d(new Pair(102, null), new Pair(190, null), new Pair(Integer.valueOf(UibcKeyCode.TV_KEYCODE_REWIND), null)), null, null, null);
    }

    public static String q(EventType eventType) {
        eventType.getClass();
        int i2 = yl7.a[eventType.ordinal()];
        if (i2 == 1) {
            return NetcastTVService.UDAP_API_EVENT;
        }
        if (i2 == 2) {
            return "fatal";
        }
        if (i2 == 3) {
            return "error";
        }
        b6e.s();
        return null;
    }

    public static int t() {
        int i2;
        synchronized (pt0.j()) {
            i2 = !bp6.a.contains(pt0.class) ? 1 : 0;
        }
        return i2;
    }

    public static String u() {
        i9w i9wVar = new i9w();
        if (!j3c.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(j3c.b()).build();
            try {
                build.startConnection(new oxa(build, i9wVar));
            } catch (Exception unused) {
            }
        }
        return j3c.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return null;
    }

    @Override // defpackage.n03
    public jxt B(jxt jxtVar, jxt jxtVar2) {
        jxtVar.getClass();
        jxtVar2.getClass();
        yxt yxtVar = jxtVar2.a;
        yxt yxtVar2 = jxtVar.a;
        yxt yxtVar3 = yxt.Array;
        if (yxtVar2 == yxtVar3 && yxtVar == yxt.String_) {
            jz0 jz0Var = yxtVar2 == yxtVar3 ? (jz0) jxtVar : null;
            mac macVar = new mac(jxtVar, yxtVar3);
            if (jz0Var != null) {
                return new vc3(jz0Var.b.contains(jxtVar2.f()));
            }
            throw macVar;
        }
        yxt yxtVar4 = yxt.Map;
        if (yxtVar2 != yxtVar4 || yxtVar != yxt.String_) {
            throw new mac(yxtVar2, yxtVar);
        }
        if (yxtVar2 != yxtVar4) {
            throw new mac(jxtVar, yxtVar4);
        }
        l1j.f();
        return null;
    }

    @Override // defpackage.m7q
    public Object C(lzu lzuVar) {
        lzuVar.getClass();
        oyu oyuVar = lzuVar.b;
        if (oyuVar instanceof kyu) {
            return ((kyu) oyuVar).a.a;
        }
        if (oyuVar instanceof hyu) {
            return ((hyu) oyuVar).a.a;
        }
        if (oyuVar instanceof iyu) {
            return ((iyu) oyuVar).a;
        }
        if (oyuVar instanceof jyu) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.na
    public String D() {
        return "refresh_access_token";
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        e5qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return null;
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        xofVar.getClass();
        jx7Var.getClass();
        float d2 = nmq.d(j2);
        float b2 = nmq.b(j2);
        float n0 = jx7Var.n0(6);
        nh0 a = ph0.a();
        float f2 = b2 * 0.97436f;
        Path path = a.a;
        a.f(d2, f2);
        a.e(d2, 0.02564f * b2);
        float f3 = n0 * 2;
        float f4 = d2 - f3;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(f4, 0.0f, d2, f3);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.arcTo(rectF2, 0.0f, -90.0f, false);
        a.e(0.72199f * d2, 0.0f);
        float f5 = b2 * 0.00963f;
        a.c(0.70872f * d2, 0.0f, d2 * 0.69606f, b2 * 0.00379f, d2 * 0.68574f, f5);
        float f6 = 0.02554f * b2;
        float f7 = 0.04556f * b2;
        a.c(0.65762f * d2, f6, 0.59269f * d2, f7, 0.50305f * d2, f7);
        a.c(0.41189f * d2, f7, 0.34288f * d2, f6, 0.31384f * d2, f5);
        a.c(0.30384f * d2, 0.00344f * b2, 0.29173f * d2, 0.0f, d2 * 0.27911f, 0.0f);
        a.e(0.03659f * d2, 0.0f);
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF3 = a.b;
        rectF3.getClass();
        rectF3.set(0.0f, 0.0f, f3, f3);
        RectF rectF4 = a.b;
        rectF4.getClass();
        path.arcTo(rectF4, -90.0f, -90.0f, false);
        a.e(0.0f, 0.11221f * b2);
        float f8 = 0.0819f * d2;
        float f9 = 0.24042001f * b2;
        float f10 = d2 * 0.18293f;
        a.c(0.0f, 0.18302f * b2, f8, f9, f10, f9);
        float f11 = 0.18902f * d2;
        a.e(f11, f9);
        float f12 = 0.26606f * b2;
        a.e(f11, f12);
        a.e(f10, f12);
        a.c(f8, f12, 0.0f, 0.32346f * b2, 0.0f, 0.39426002f * b2);
        a.e(0.0f, f2);
        float f13 = b2 - f3;
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF5 = a.b;
        rectF5.getClass();
        rectF5.set(0.0f, f13, f3, b2);
        RectF rectF6 = a.b;
        rectF6.getClass();
        path.arcTo(rectF6, 180.0f, -90.0f, false);
        a.e(0.96341f * d2, b2);
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF7 = a.b;
        rectF7.getClass();
        rectF7.set(f4, f13, d2, b2);
        RectF rectF8 = a.b;
        rectF8.getClass();
        path.arcTo(rectF8, 90.0f, -90.0f, false);
        a.b();
        return new zxj(a);
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return null;
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        List split$default;
        z3qVar.getClass();
        if ((z3qVar instanceof u1q) || (z3qVar instanceof c1q) || (z3qVar instanceof e1q) || (z3qVar instanceof r1q)) {
            return null;
        }
        if (!(z3qVar instanceof h1q)) {
            if ((z3qVar instanceof k1q) || (z3qVar instanceof a2q)) {
                return null;
            }
            b6e.s();
            return null;
        }
        String str = ((h1q) z3qVar).b.a;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        if (split$default.size() != 2) {
            xq0.x("Illegal station combined id ".concat(str));
            return null;
        }
        String str2 = (String) split$default.get(0);
        String str3 = (String) split$default.get(1);
        str2.getClass();
        str3.getClass();
        return new StationId(str2, str3);
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        f5qVar.getClass();
        if (f5qVar instanceof s9q) {
            return null;
        }
        if (f5qVar instanceof baq) {
            return ((baq) f5qVar).a;
        }
        if ((f5qVar instanceof oaq) || (f5qVar instanceof taq) || (f5qVar instanceof abq) || (f5qVar instanceof xaq)) {
            return null;
        }
        b6e.s();
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
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.m7q
    public void d(v4d v4dVar) {
        v4dVar.getClass();
    }

    @Override // defpackage.na
    public String e() {
        return "ig_refresh_token";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (defpackage.a4g.G(((defpackage.naq) r4).e) == false) goto L10;
     */
    @Override // defpackage.w2q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(faq faqVar) {
        switch (this.a) {
            case 4:
                faqVar.getClass();
                boolean z = false;
                if (!(faqVar instanceof naq)) {
                    if (!(faqVar instanceof saq)) {
                        if (!(faqVar instanceof daq) && !(faqVar instanceof qaq)) {
                            b6e.s();
                            return null;
                        }
                        return Boolean.valueOf(z);
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                break;
                break;
            default:
                faqVar.getClass();
                return Boolean.FALSE;
        }
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 4:
                jzsVar.getClass();
                return Boolean.valueOf(!a4g.G(jzsVar.a));
            default:
                jzsVar.getClass();
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 4:
                m1qVar.getClass();
                boolean z = false;
                if (m1qVar instanceof c2q) {
                    if (!a4g.G(((c2q) m1qVar).f)) {
                        z = true;
                    }
                } else if (!(m1qVar instanceof j1q) && !(m1qVar instanceof e2q)) {
                    b6e.s();
                    return null;
                }
                return Boolean.valueOf(z);
            default:
                m1qVar.getClass();
                return Boolean.FALSE;
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
                return Boolean.FALSE;
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
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f2) {
        zcoVar.getClass();
        zcoVar.y((1.0f - f2) * nmq.b(zcoVar.p) * 0.15483871f);
        zcoVar.a(f2);
    }

    public synchronized nsh m() {
        nsh nshVar;
        try {
            if (nsh.l == null) {
                nsh.l = n();
            }
            nshVar = nsh.l;
            if (nshVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
        } catch (Throwable th) {
            throw th;
        }
        return nshVar;
    }

    @Override // defpackage.m7q
    public void o(hoc hocVar) {
        hocVar.getClass();
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return null;
    }

    @Override // defpackage.m7q
    public Object r(xhd xhdVar) {
        xhdVar.getClass();
        z3q z3qVar = xhdVar.a;
        if (z3qVar instanceof u1q) {
            return (s9p) ((u1q) z3qVar).c.d.getValue();
        }
        if ((z3qVar instanceof c1q) || (z3qVar instanceof e1q) || (z3qVar instanceof h1q) || (z3qVar instanceof k1q) || (z3qVar instanceof r1q) || (z3qVar instanceof a2q) || z3qVar == null) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.m7q
    public void s(t7u t7uVar) {
        t7uVar.getClass();
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return null;
    }

    @Override // defpackage.m7q
    public Object w(pnw pnwVar) {
        pnwVar.getClass();
        f5q f5qVar = pnwVar.b;
        if (f5qVar instanceof abq) {
            gbq gbqVar = ((abq) f5qVar).a;
            if (gbqVar instanceof ebq) {
                return ((ebq) gbqVar).a;
            }
            if (gbqVar instanceof fbq) {
                return ((fbq) gbqVar).a;
            }
            b6e.s();
            return null;
        }
        if ((f5qVar instanceof s9q) || (f5qVar instanceof baq) || (f5qVar instanceof oaq) || (f5qVar instanceof taq) || (f5qVar instanceof xaq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.mu1
    public int x(nu1 nu1Var) {
        return ((cvl) nu1Var).h;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        d5d d5dVar = y3qVar.a.a;
        d5dVar.getClass();
        return new StationId(d5dVar.a, d5dVar.b);
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return null;
    }

    @Override // defpackage.dhc
    public mif b(yop yopVar) {
        return yopVar;
    }
}
