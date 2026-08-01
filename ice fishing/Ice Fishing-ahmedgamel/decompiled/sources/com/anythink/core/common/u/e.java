package com.anythink.core.common.u;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.b.d.c;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bh;
import com.anythink.core.common.h.bi;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.h.cd;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.u;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.ai;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.core.d.l;
import com.anythink.core.mg.api.MgAdInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16478a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f16479b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f16480c = 7;

    /* renamed from: d, reason: collision with root package name */
    public static final int f16481d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f16482e = 9;

    /* renamed from: f, reason: collision with root package name */
    public static final int f16483f = 10;

    /* renamed from: g, reason: collision with root package name */
    public static final int f16484g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f16485h = 11;
    public static final int i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static final int f16486j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f16487k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f16488l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f16489m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f16490n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f16491o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f16492p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f16493q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f16494r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f16495s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f16496t = 3;

    /* renamed from: u, reason: collision with root package name */
    public static final int f16497u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final int f16498v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final int f16499w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static final String f16500x = "e";

    /* renamed from: y, reason: collision with root package name */
    private static String f16501y = "";

    private static boolean d(com.anythink.core.d.b bVar, u uVar) {
        Map<String, String> aw = bVar.aw();
        if (aw == null) {
            return false;
        }
        if (TextUtils.isEmpty(uVar.f14065P)) {
            return aw.containsKey(uVar.f14075c);
        }
        if (!aw.containsKey(uVar.f14075c)) {
            return false;
        }
        String str = aw.get(uVar.f14075c);
        return !TextUtils.isEmpty(str) && str.contains(uVar.f14065P);
    }

    public static void a(n nVar, AdError adError) {
        a(nVar, adError, (bv) null);
    }

    public static void b(String str, String str2, String str3) {
        b(str, str2, str3, "");
    }

    private static void c(n nVar, String str) {
        try {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14075c = "1004639";
            uVar.a(nVar);
            uVar.f14087p = String.valueOf(nVar.Y());
            uVar.f14088q = nVar.M();
            uVar.f14089r = String.valueOf(nVar.O());
            uVar.f14090s = str;
            uVar.f14065P = nVar.aK();
            uVar.f14067R = nVar.aB();
            uVar.f14068S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(n nVar, AdError adError, bv bvVar) {
        try {
            u uVar = new u(nVar.aK(), null);
            uVar.f14075c = "1004630";
            uVar.a(nVar);
            l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
            uVar.f14082k = a9 != null ? a9.an() : "";
            if (adError != null) {
                uVar.f14087p = adError.printStackTrace();
                uVar.f14088q = adError.getCode();
            }
            if (bvVar != null) {
                uVar.f14089r = bvVar.z();
                uVar.f14090s = String.valueOf(p.a(bvVar));
            }
            uVar.f14067R = nVar.aB();
            uVar.f14068S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004647";
        uVar.f14078f = str3;
        uVar.f14087p = str2;
        uVar.f14088q = str;
        uVar.f14089r = str4;
        a(uVar);
    }

    public static void b(x xVar, w wVar, String str, String str2, int i6) {
        if (xVar == null || wVar == null) {
            return;
        }
        boolean z3 = i6 == 0;
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004728";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        uVar.f14088q = String.valueOf(xVar.f14168o.bo());
        uVar.f14089r = String.valueOf(z3 ? 1 : 2);
        uVar.f14090s = str;
        uVar.f14091t = str2;
        if (!z3) {
            uVar.f14092u = String.valueOf(i6);
        }
        a(uVar);
    }

    public static void c(n nVar, String str, String str2) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004750";
        uVar.a(nVar);
        uVar.f14076d = nVar.aJ();
        uVar.f14077e = nVar.aI();
        uVar.f14082k = nVar.aH();
        uVar.f14080h = String.valueOf(nVar.Z());
        uVar.f14086o = String.valueOf(nVar.aG());
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = String.valueOf(nVar.aK());
        uVar.f14090s = str;
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14091t = str2;
        }
        a(uVar);
    }

    private static void a(n nVar, String str, int i6, String str2, String str3, int i9, int i10, AdError adError, int i11, double d2, long j6, int i12, int i13, String str4, String str5, JSONObject jSONObject, int i14, String str6) {
        String str7;
        u uVar = new u(str3, String.valueOf(i6));
        uVar.f14075c = "1004631";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = str2;
        uVar.f14089r = String.valueOf(i9);
        if (!TextUtils.isEmpty(str6)) {
            uVar.f14090s = "15";
        } else {
            uVar.f14090s = String.valueOf(i10);
        }
        String str8 = "";
        uVar.f14091t = adError != null ? adError.getPlatformCode() : "";
        if (adError == null) {
            str7 = "";
        } else {
            str7 = adError.getPlatformMSG();
        }
        uVar.f14092u = str7;
        uVar.f14093v = String.valueOf(i11);
        uVar.f14094w = String.valueOf(d2);
        if (i10 == 0) {
            uVar.f14095x = String.valueOf(j6);
        }
        uVar.f14096y = String.valueOf(i12);
        uVar.f14097z = String.valueOf(i13);
        if (i14 >= -1) {
            uVar.f14051A = String.valueOf(i14);
        }
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(str);
        if (a9 != null) {
            str8 = a9.an();
        }
        uVar.f14082k = str8;
        uVar.f14067R = str4;
        uVar.f14068S = str5;
        if (jSONObject != null) {
            uVar.Y = jSONObject;
        }
        a(uVar);
    }

    public static void b(x xVar, w wVar, int i6, long j6, long j9, long j10, long j11) {
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004708";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(xVar.f14160f);
        uVar.f14088q = xVar.f14157c;
        uVar.f14089r = String.valueOf(xVar.f14163j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14090s = rVar.aD();
            uVar.f14091t = rVar.v();
        }
        uVar.f14092u = String.valueOf(i6);
        uVar.f14093v = String.valueOf(j6);
        uVar.f14094w = String.format("%.2f", Double.valueOf((j9 / 1024.0d) / 1024.0d));
        uVar.f14095x = String.valueOf(j10);
        uVar.f14096y = String.format("%.2f", Double.valueOf((j11 / 1024.0d) / 1024.0d));
        y yVar = xVar.f14168o;
        if (yVar != null && yVar.bk() > 0) {
            uVar.f14097z = String.valueOf(xVar.f14168o.bk());
        }
        a(uVar);
    }

    public static void c(w wVar, x xVar, int i6) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004768";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14088q = rVar.aD();
            uVar.f14089r = String.valueOf(rVar.az());
        }
        uVar.f14090s = String.valueOf(i6);
        a(uVar);
    }

    public static void b(n nVar, String str, String str2) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004745";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = String.valueOf(nVar.aK());
        uVar.f14090s = str;
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14091t = str2;
        }
        a(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(com.anythink.core.d.b bVar, u uVar) {
        if (t.b().z()) {
            return true;
        }
        String aA = bVar.aA();
        if (!TextUtils.isEmpty(aA)) {
            String str = uVar.f14066Q;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(aA);
                    int length = jSONArray.length();
                    for (int i6 = 0; i6 < length; i6++) {
                        if (TextUtils.equals(str, jSONArray.optString(i6))) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Map<String, String> ay = bVar.ay();
        if (ay == null) {
            return false;
        }
        if (TextUtils.isEmpty(uVar.f14065P)) {
            return ay.containsKey(uVar.f14075c);
        }
        if (ay.containsKey(uVar.f14075c)) {
            String str2 = ay.get(uVar.f14075c);
            if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14065P)) {
                return true;
            }
        }
        return false;
    }

    public static void a(n nVar, int i6, AdError adError) {
        try {
            a(nVar, nVar.aI(), nVar.Y(), nVar.M(), nVar.aK(), -1, i6, adError, nVar.J(), nVar.L(), 0L, nVar.ac(), nVar.f14025t, nVar.aB(), nVar.aC(), nVar.ax(), nVar.am(), a(adError, nVar.Y(), nVar.aI(), i6));
        } catch (Throwable unused) {
        }
    }

    public static void b(w wVar, x xVar, int i6) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004749";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        uVar.f14089r = wVar.G();
        uVar.f14090s = String.valueOf(i6);
        a(uVar);
    }

    public static void c(u uVar) {
        l b9 = com.anythink.core.d.n.a(t.b().g()).b(uVar.f14077e);
        if (b9 != null) {
            uVar.f14069T = b9.aQ();
        }
    }

    public static void a(n nVar, int i6, AdError adError, long j6) {
        try {
            a(nVar, nVar.aI(), nVar.Y(), nVar.M(), nVar.aK(), nVar.O(), i6, adError, nVar.J(), nVar.L(), j6, nVar.ac(), nVar.f14025t, nVar.aB(), nVar.aC(), nVar.ax(), nVar.am(), a(adError, nVar.Y(), nVar.aI(), i6));
        } catch (Throwable unused) {
        }
    }

    public static void b(n nVar) {
        com.anythink.core.common.h.d f3 = nVar.f();
        int U3 = nVar.U();
        nVar.aI();
        if (f3 == null || !com.anythink.core.common.w.a().a(nVar.aI())) {
            return;
        }
        u uVar = new u(nVar.aK(), null);
        uVar.f14075c = "1004754";
        uVar.a(nVar);
        uVar.f14076d = nVar.aJ();
        uVar.f14077e = nVar.aI();
        uVar.f14080h = String.valueOf(nVar.Z());
        uVar.f14086o = String.valueOf(nVar.aG());
        uVar.f14087p = String.valueOf(U3);
        uVar.f14088q = f3.a();
        uVar.f14089r = f3.d();
        uVar.f14090s = String.valueOf(f3.e());
        uVar.f14091t = String.valueOf(f3.i());
        uVar.f14092u = String.valueOf(f3.g());
        uVar.f14093v = String.valueOf(f3.f());
        uVar.f14094w = String.valueOf(f3.h());
        a(uVar);
    }

    public static void a(String str, String str2, l lVar, int i6, String str3, Map<String, Object> map, ae aeVar) {
        Object obj;
        String str4;
        try {
            String str5 = "";
            u uVar = new u(lVar != null ? String.valueOf(lVar.aq()) : "", "");
            uVar.f14075c = "1004633";
            uVar.a(lVar);
            uVar.a(aeVar);
            uVar.f14076d = str;
            uVar.f14077e = str2;
            uVar.f14080h = String.valueOf(lVar != null ? lVar.ay() : 0);
            uVar.f14083l = "0";
            if (lVar == null) {
                obj = "";
            } else {
                obj = Integer.valueOf(lVar.ai());
            }
            uVar.f14086o = String.valueOf(obj);
            uVar.f14087p = String.valueOf(i6);
            uVar.f14088q = str3;
            uVar.f14091t = str;
            uVar.f14092u = "0";
            if (lVar == null) {
                str4 = "";
            } else {
                str4 = lVar.an();
            }
            uVar.f14082k = str4;
            if (lVar != null) {
                str5 = lVar.A();
            }
            uVar.f14067R = str5;
            if (map != null) {
                Object obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj2 != null) {
                    uVar.f14068S = obj2.toString();
                }
                JSONObject a9 = ai.a(map);
                if (a9 != null) {
                    uVar.Y = a9;
                }
            }
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void b(n nVar, int i6) {
        ATAdRequest a9;
        if (nVar == null || (a9 = nVar.a()) == null || a9.getPreLoadInfo() == null || a9.getPreLoadInfo().getPreLoadCallbackRegister() == null || a9.getPreLoadInfo().getPreLoadCallbackRegister().getMgAdInfo() == null) {
            return;
        }
        MgPreLoadAdRequest preLoadInfo = a9.getPreLoadInfo();
        MgAdInfo mgAdInfo = preLoadInfo.getPreLoadCallbackRegister().getMgAdInfo();
        int cpEcpmReceiveTime = preLoadInfo.getCpEcpmReceiveTime();
        if (!MgAdInfo.isMgAdInfoValid(mgAdInfo) || cpEcpmReceiveTime > 0) {
            return;
        }
        preLoadInfo.setCpEcpmReceiveTime(i6);
        u uVar = new u(null, null);
        uVar.f14075c = "1004760";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(i6);
        MgComparedResult mgComparedResult = a9.getPreLoadInfo().getMgComparedResult();
        uVar.f14088q = String.valueOf(mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L);
        double cpPrice = mgComparedResult != null ? mgComparedResult.getCpPrice() : 0.0d;
        if (cpPrice > 0.0d) {
            uVar.f14089r = String.valueOf(cpPrice);
        }
        a(uVar);
    }

    public static void a(n nVar, boolean z3) {
        if (t.b().g() == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004634";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = String.valueOf(nVar.P());
        uVar.f14090s = z3 ? "1" : "0";
        uVar.f14091t = String.valueOf(nVar.f14008C);
        if (nVar.Y() == 66) {
            int ag = nVar.ag();
            if (ag != 0) {
                uVar.f14092u = String.valueOf(ag);
            }
            int ai = nVar.ai();
            if (ai != 0) {
                uVar.f14094w = String.valueOf(ai);
            }
            int aj = nVar.aj();
            if (aj != 0) {
                uVar.f14095x = String.valueOf(aj);
            }
        }
        uVar.f14093v = nVar.aK();
        uVar.f14096y = String.valueOf(nVar.as());
        uVar.f14097z = String.valueOf(nVar.ar());
        uVar.f14051A = String.valueOf(nVar.at());
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
        uVar.f14082k = a9 != null ? a9.an() : "";
        uVar.f14065P = nVar.aK();
        uVar.f14067R = nVar.aB();
        uVar.f14068S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
        b.a().a(uVar, nVar);
    }

    public static void b(n nVar, String str) {
        u uVar = new u("", "");
        uVar.a(nVar);
        uVar.f14075c = "1004767";
        uVar.f14087p = str;
        a(uVar);
    }

    private static boolean b(u uVar, com.anythink.core.d.b bVar) {
        Map<String, String> f3;
        if ("1004742".equals(uVar.f14075c)) {
            return true;
        }
        if (!TextUtils.isEmpty(uVar.f14075c) && !TextUtils.isEmpty(uVar.f14066Q) && !TextUtils.isEmpty(uVar.f14065P) && (f3 = bVar.f(uVar.f14075c)) != null) {
            if (f3.containsKey("0")) {
                String str = f3.get("0");
                return !TextUtils.isEmpty(str) && str.contains(uVar.f14065P);
            }
            if (f3.containsKey(uVar.f14066Q)) {
                String str2 = f3.get(uVar.f14066Q);
                if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14065P)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(final String str) {
        a(new Runnable() { // from class: com.anythink.core.common.u.e.7
            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                u a9 = u.a(str);
                if (TextUtils.isEmpty(a9.f14075c)) {
                    return;
                }
                e.a(a9);
            }
        });
    }

    public static void b(u uVar) {
        a(uVar);
    }

    public static /* synthetic */ boolean b(com.anythink.core.d.b bVar, u uVar) {
        Map<String, String> aw = bVar.aw();
        if (aw == null) {
            return false;
        }
        if (TextUtils.isEmpty(uVar.f14065P)) {
            return aw.containsKey(uVar.f14075c);
        }
        if (!aw.containsKey(uVar.f14075c)) {
            return false;
        }
        String str = aw.get(uVar.f14075c);
        return !TextUtils.isEmpty(str) && str.contains(uVar.f14065P);
    }

    public static void a(String str, String str2, boolean z3, int i6, l lVar, com.anythink.core.common.h.c cVar, String str3, String str4, Map<String, Object> map, com.anythink.core.common.h.d dVar, ae aeVar) {
        a(str, str2, z3, i6, lVar, cVar, str3, str4, map, dVar, 0L, aeVar);
    }

    public static void a(final String str, final String str2, final boolean z3, final int i6, final l lVar, final com.anythink.core.common.h.c cVar, final String str3, final String str4, final Map<String, Object> map, final com.anythink.core.common.h.d dVar, final long j6, final ae aeVar) {
        try {
            a(new Runnable() { // from class: com.anythink.core.common.u.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    JSONObject a9;
                    try {
                        com.anythink.core.common.h.c cVar2 = com.anythink.core.common.h.c.this;
                        n i9 = cVar2 != null ? cVar2.i() : null;
                        l lVar2 = lVar;
                        u uVar = new u(lVar2 != null ? String.valueOf(lVar2.aq()) : "", i9 != null ? String.valueOf(i9.Y()) : "");
                        uVar.f14075c = "1004632";
                        uVar.f14076d = str;
                        uVar.f14077e = str2;
                        uVar.a(i9);
                        if (i9 == null) {
                            uVar.a(aeVar);
                        }
                        if (TextUtils.isEmpty(uVar.f14080h)) {
                            l lVar3 = lVar;
                            if (lVar3 != null) {
                                uVar.f14080h = String.valueOf(lVar3.ay());
                            } else {
                                uVar.f14080h = "0";
                            }
                        }
                        uVar.f14087p = z3 ? "1" : "0";
                        uVar.f14088q = String.valueOf(i6);
                        uVar.f14089r = i9 != null ? String.valueOf(i9.P()) : "-1";
                        uVar.f14090s = i9 != null ? i9.M() : "";
                        uVar.f14091t = i9 != null ? String.valueOf(i9.Y()) : "";
                        uVar.f14092u = i9 != null ? i9.f14029x : "";
                        uVar.f14093v = str3;
                        uVar.f14094w = i9 != null ? i9.aJ() : str;
                        if (i9 == null || TextUtils.equals(str, i9.aJ())) {
                            uVar.f14095x = "0";
                        } else {
                            uVar.f14095x = "1";
                        }
                        if (i9 != null) {
                            uVar.f14096y = i9.f14025t == 3 ? "1" : "0";
                        } else {
                            uVar.f14096y = "0";
                        }
                        uVar.f14097z = str4;
                        com.anythink.core.common.h.c cVar3 = com.anythink.core.common.h.c.this;
                        if (cVar3 != null && cVar3.l() == "3") {
                            uVar.f14052B = "1";
                        }
                        long j9 = j6;
                        if (j9 > 0) {
                            uVar.f14051A = String.valueOf(j9);
                        }
                        l lVar4 = lVar;
                        uVar.f14082k = lVar4 != null ? lVar4.an() : "";
                        l lVar5 = lVar;
                        uVar.f14065P = lVar5 != null ? String.valueOf(lVar5.aq()) : "";
                        if (i9 != null) {
                            uVar.f14067R = i9.aB();
                        } else {
                            l lVar6 = lVar;
                            if (lVar6 != null) {
                                uVar.f14067R = lVar6.A();
                            }
                        }
                        if (i9 != null) {
                            uVar.f14068S = i9.aC();
                        } else {
                            Map map2 = map;
                            if (map2 != null && (obj = map2.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                                uVar.f14068S = obj.toString();
                            }
                        }
                        com.anythink.core.common.h.d dVar2 = dVar;
                        if (dVar2 != null) {
                            uVar.f14070U = dVar2.a();
                            uVar.f14071V = dVar.b();
                            uVar.f14072W = dVar.c();
                        }
                        if (i9 != null) {
                            uVar.Y = i9.ax();
                        } else {
                            Map map3 = map;
                            if (map3 != null && (a9 = ai.a(map3)) != null) {
                                uVar.Y = a9;
                            }
                        }
                        e.a(uVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static void a(n nVar, AdError adError, Map<String, Object> map) {
        if (t.b().g() == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004636";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = String.valueOf(nVar.P());
        if (adError != null) {
            uVar.f14090s = adError.getCode();
            uVar.f14091t = adError.getPlatformCode();
            uVar.f14092u = adError.getPlatformMSG();
        }
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
        uVar.f14082k = a9 != null ? a9.an() : "";
        uVar.f14065P = nVar.aK();
        if (map != null) {
            try {
                if (map.containsKey("offer_id")) {
                    uVar.f14093v = map.get("offer_id").toString();
                }
                if (map.containsKey(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE) && nVar.aK().equals("1")) {
                    uVar.f14094w = map.get(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE).toString();
                }
            } catch (Throwable unused) {
            }
        }
        uVar.f14067R = nVar.aB();
        uVar.f14068S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, ATAdRequest aTAdRequest) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004616";
        uVar.a(aTAdRequest);
        uVar.f14077e = str5;
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = str4;
        uVar.f14091t = str6;
        uVar.f14092u = str7;
        uVar.f14093v = String.valueOf(q.a(t.b().g()) ? 1 : 0);
        uVar.f14094w = String.valueOf(com.anythink.core.d.d.a().aT());
        a(uVar);
    }

    public static void a(String str, String str2, long j6, long j9, long j10, ATAdRequest aTAdRequest) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004635";
        uVar.a(aTAdRequest);
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14077e = str2;
        }
        uVar.f14087p = str;
        uVar.f14088q = String.valueOf(j6);
        uVar.f14089r = String.valueOf(j9);
        uVar.f14090s = String.valueOf(j10);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004637";
        uVar.f14077e = str;
        uVar.f14087p = str2;
        uVar.f14088q = str3;
        uVar.f14089r = str4;
        a(uVar);
    }

    public static void a(String str, String str2, String str3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004772";
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str) {
        a(wVar, xVar, false, str, 0.0d, 0.0d, 0L, 0L, 0L, 0);
    }

    public static void a(w wVar, x xVar, double d2, double d9, long j6) {
        a(wVar, xVar, true, "", d2, d9, j6, 0L, 0L, 0);
    }

    public static void a(w wVar, x xVar, boolean z3, String str, double d2, double d9, long j6, long j9, long j10, int i6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004764";
        uVar.a(xVar);
        if (wVar != null) {
            uVar.f14087p = String.valueOf(wVar.b());
            if (wVar instanceof r) {
                uVar.f14089r = ((r) wVar).aD();
                uVar.f14090s = wVar.v();
            }
            uVar.f14091t = wVar.E();
        }
        if (xVar != null) {
            uVar.f14088q = String.valueOf(xVar.f14163j);
            y yVar = xVar.f14168o;
            if (yVar != null) {
                uVar.f14096y = String.valueOf(yVar.ac());
            }
        }
        uVar.f14092u = z3 ? "1" : "2";
        if (!TextUtils.isEmpty(str)) {
            uVar.f14093v = str;
        }
        if (d2 > 0.0d) {
            uVar.f14094w = String.valueOf(Math.round(d2 / 1024.0d));
        }
        if (d9 > 0.0d) {
            uVar.f14095x = String.valueOf(Math.round(d9 / 1024.0d));
        }
        if (j6 > 0) {
            uVar.f14097z = String.valueOf(j6);
        }
        if (j9 > 0) {
            uVar.f14051A = String.valueOf(j9);
        }
        if (j10 > 0) {
            uVar.f14052B = String.valueOf(j10);
        }
        if (i6 > 0) {
            uVar.f14053C = String.valueOf(i6);
        }
        a(uVar);
    }

    public static void a(n nVar) {
        try {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14075c = "1004640";
            uVar.a(nVar);
            uVar.f14087p = String.valueOf(nVar.Y());
            uVar.f14088q = nVar.M();
            uVar.f14089r = String.valueOf(nVar.O());
            uVar.f14090s = String.valueOf(nVar.aa());
            uVar.f14091t = String.valueOf(nVar.ab());
            uVar.f14067R = nVar.aB();
            uVar.f14068S = nVar.aC();
            uVar.Y = nVar.ax();
            uVar.f14065P = nVar.aK();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(int i6, int i9, int i10, int i11) {
        u uVar = new u(null, String.valueOf(i11));
        uVar.f14075c = "1004641";
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = String.valueOf(i9);
        uVar.f14089r = String.valueOf(i10);
        uVar.f14090s = String.valueOf(i11);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, int i6, String str4, long j6, long j9, String str5, String str6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004642";
        uVar.f14076d = str;
        uVar.f14074Z = str5;
        uVar.aa = str6;
        uVar.f14087p = str2;
        uVar.f14088q = str3;
        uVar.f14089r = String.valueOf(i6);
        if (i6 == 3 || i6 == 10) {
            uVar.f14090s = str4;
        } else if (i6 == 2) {
            uVar.f14091t = String.valueOf(j6);
            uVar.f14092u = String.valueOf(j9 / 1024.0f);
        }
        a(uVar);
    }

    public static void a(String str, String str2, long j6, String str3, String str4, String str5, String str6, String str7, String str8, int i6, String str9, String str10, int i9, long j9, long j10, String str11, String str12) {
        u uVar = new u(null, str3);
        uVar.f14075c = "1004711";
        uVar.f14076d = str;
        uVar.f14074Z = str11;
        uVar.aa = str12;
        uVar.f14077e = str2;
        uVar.f14081j = String.valueOf(j6);
        uVar.f14087p = str3;
        uVar.f14088q = str4;
        uVar.f14089r = str5;
        uVar.f14090s = str6;
        if (!TextUtils.isEmpty(str7)) {
            uVar.f14091t = String.valueOf(str7.contains("data/data") ? 1 : 2);
        }
        uVar.f14092u = str8;
        uVar.f14093v = String.valueOf(i6);
        uVar.f14094w = str9;
        if (!"1".equals(str9)) {
            uVar.f14095x = str10;
        }
        uVar.f14096y = String.valueOf(i9);
        uVar.f14097z = String.valueOf(j9 / 1024.0f);
        uVar.f14051A = String.valueOf(j10);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i6, String str8, String str9) {
        u uVar = new u(null, str3);
        uVar.f14075c = "1004712";
        uVar.f14076d = str;
        uVar.f14074Z = str8;
        uVar.aa = str9;
        uVar.f14077e = str2;
        uVar.f14081j = String.valueOf(System.currentTimeMillis());
        uVar.f14087p = str3;
        uVar.f14088q = str4;
        uVar.f14089r = str5;
        uVar.f14090s = str6;
        uVar.f14091t = str7;
        uVar.f14092u = String.valueOf(i6);
        a(uVar);
    }

    public static void a(int i6, long j6, long j9, String str) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004644";
        uVar.f14078f = str;
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = String.valueOf(j6);
        uVar.f14089r = String.valueOf(j9);
        uVar.f14090s = String.valueOf(j9 - j6);
        a(uVar);
    }

    private static void a(int i6, long j6, long j9, String str, String str2) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004651";
        uVar.f14078f = str;
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = String.valueOf(j9 - j6);
        uVar.f14089r = str2;
        a(uVar);
    }

    public static void a(n nVar, boolean z3, long j6, long j9, long j10) {
        try {
            if (t.b().g() == null) {
                return;
            }
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14075c = "1004643";
            uVar.a(nVar);
            uVar.f14087p = nVar.aK();
            uVar.f14088q = String.valueOf(j6);
            uVar.f14089r = String.valueOf(j9);
            uVar.f14090s = String.valueOf(j10);
            uVar.f14091t = String.valueOf(nVar.Y());
            uVar.f14092u = nVar.M();
            uVar.f14093v = String.valueOf(nVar.P());
            uVar.f14094w = String.valueOf(nVar.f14008C);
            uVar.f14095x = z3 ? "1" : "0";
            l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
            uVar.f14082k = a9 != null ? a9.an() : "";
            uVar.f14065P = nVar.aK();
            uVar.f14067R = nVar.aB();
            uVar.f14068S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, n nVar, l lVar, String str4, String str5) {
        try {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14075c = str;
            uVar.a(nVar);
            uVar.f14076d = nVar.aJ();
            uVar.f14077e = str2;
            uVar.f14082k = lVar != null ? lVar.an() : "";
            uVar.f14087p = String.valueOf(nVar.Y());
            uVar.f14088q = nVar.M();
            uVar.f14089r = nVar.z();
            uVar.f14090s = nVar.o();
            uVar.f14091t = nVar.f14011F;
            uVar.f14092u = str4;
            uVar.f14093v = str5;
            uVar.f14094w = str3;
            uVar.f14067R = nVar.aB();
            uVar.f14068S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(x xVar, w wVar, int i6) {
        try {
            u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
            uVar.f14075c = "1004679";
            uVar.a(xVar);
            if (wVar instanceof r) {
                uVar.f14087p = ((r) wVar).aD();
            }
            uVar.f14088q = xVar.f14157c;
            uVar.f14089r = wVar.v();
            uVar.f14090s = String.valueOf(wVar.b());
            uVar.f14091t = wVar.k();
            uVar.f14092u = wVar.l();
            uVar.f14093v = String.valueOf(i6);
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, l lVar, String str3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004646";
        uVar.f14076d = str;
        uVar.f14077e = str2;
        uVar.f14080h = String.valueOf(lVar.ay());
        uVar.f14086o = String.valueOf(lVar.ai());
        uVar.f14082k = lVar.an();
        uVar.f14094w = String.valueOf(str3);
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2, String str3, String str4) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14075c = "1004648";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        uVar.f14088q = String.valueOf(wVar.b());
        uVar.f14089r = str;
        uVar.f14090s = str2;
        uVar.f14091t = str3;
        uVar.f14092u = str4;
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2, int i6) {
        a(xVar, wVar, str, str2, i6, 0, "");
    }

    public static void a(x xVar, w wVar, String str, String str2, int i6, int i9, String str3) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004650";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        uVar.f14088q = String.valueOf(wVar.b());
        uVar.f14089r = str;
        uVar.f14090s = str2;
        uVar.f14091t = String.valueOf(i6);
        if (wVar instanceof r) {
            uVar.f14093v = String.valueOf(((r) wVar).aD());
        }
        uVar.f14094w = String.valueOf(xVar.f14163j);
        if (i9 > 0) {
            uVar.f14095x = String.valueOf(i9);
        }
        uVar.f14096y = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str, String str2) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004652";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(xVar.f14160f);
        uVar.f14088q = xVar.f14157c;
        if (wVar instanceof ay) {
            uVar.f14089r = "1";
        } else if (wVar instanceof r) {
            uVar.f14089r = "2";
        } else if (wVar instanceof bi) {
            uVar.f14089r = "3";
        }
        uVar.f14090s = str;
        uVar.f14091t = str2;
        uVar.f14092u = wVar.v();
        uVar.f14093v = wVar.w();
        uVar.f14094w = wVar.I();
        uVar.f14095x = wVar.x();
        uVar.f14096y = wVar.y();
        uVar.f14097z = wVar.z();
        uVar.f14051A = wVar.B();
        uVar.f14052B = wVar.E();
        try {
            if (wVar instanceof bj) {
                StringBuilder sb = new StringBuilder();
                String aK = ((bj) wVar).aK();
                if (!TextUtils.isEmpty(aK)) {
                    JSONArray jSONArray = new JSONArray(aK);
                    int length = jSONArray.length();
                    for (int i6 = 0; i6 < length; i6++) {
                        sb.append(jSONArray.optString(i6));
                        sb.append(",");
                    }
                    if (sb.length() > 1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    uVar.f14053C = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        a(uVar);
    }

    public static void a() {
        u uVar = new u(null, null);
        uVar.f14075c = "1004657";
        a(uVar);
    }

    public static void a(aw awVar, double d2, String str, double d9, double d10, double d11, double d12, String str2, String str3, boolean z3) {
        a(awVar, d2, str, d9, d10, d11, d12, str2, str3, z3, 0.0d);
    }

    public static void a(aw awVar, double d2, String str, double d9, double d10, double d11, double d12, String str2, String str3, boolean z3, double d13) {
        u uVar = new u(String.valueOf(awVar.n()), String.valueOf(awVar.k()));
        uVar.f14075c = "1004659";
        uVar.a(awVar.z());
        uVar.f14082k = awVar.m();
        uVar.f14087p = String.valueOf(awVar.k());
        uVar.f14088q = awVar.l();
        uVar.f14089r = String.valueOf(d2);
        uVar.f14090s = str;
        uVar.f14067R = awVar.o();
        uVar.f14068S = awVar.p();
        uVar.f14091t = String.valueOf(d9);
        uVar.f14092u = String.valueOf(d10);
        uVar.f14093v = awVar.s();
        uVar.f14094w = String.valueOf(awVar.t());
        uVar.f14095x = String.valueOf(awVar.h());
        uVar.f14096y = String.valueOf(d11);
        if (awVar.d() != null) {
            uVar.f14097z = awVar.d();
        }
        Double v9 = awVar.v();
        if (v9 != null) {
            uVar.f14051A = String.valueOf(v9);
        }
        if (awVar.k() == 66 && d12 > 0.0d) {
            uVar.f14052B = String.valueOf(d10 / d12);
        }
        uVar.f14053C = awVar.B();
        uVar.f14054D = z3 ? "1" : null;
        uVar.f14055E = str2;
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14056F = str3;
        }
        ATAdMixBidInfo.BidEntity a9 = awVar.a();
        if (a9 != null) {
            if (!TextUtils.isEmpty(a9.getAdUserName())) {
                uVar.f14057G = a9.getAdUserName();
            }
            if (!TextUtils.isEmpty(a9.getAdTittle())) {
                uVar.f14058H = a9.getAdTittle();
            }
            if (!TextUtils.isEmpty(a9.getAdPackageName())) {
                uVar.f14061L = a9.getAdPackageName();
            }
        }
        uVar.f14059I = String.valueOf(awVar.E());
        MgComparedResult F8 = awVar.F();
        if (F8 != null && c.b.a(awVar.w())) {
            uVar.J = F8.isMgWin() ? "1" : "2";
            uVar.f14060K = String.valueOf(F8.getCpCostTime());
        }
        uVar.f14062M = String.valueOf(awVar.G());
        uVar.f14063N = String.valueOf(awVar.H());
        if (awVar.k() == 8 && d13 > 0.0d) {
            uVar.f14064O = String.valueOf(com.anythink.core.b.d.a.a(8, String.valueOf(d13)));
        }
        uVar.Y = awVar.q();
        a(uVar);
    }

    public static void a(bv bvVar, com.anythink.core.common.h.a aVar, long j6, boolean z3, boolean z6) {
        Object obj;
        String str;
        u uVar = new u(String.valueOf(aVar.f13331f), String.valueOf(bvVar.g()));
        uVar.f14075c = "1004660";
        uVar.a(bvVar);
        cb cbVar = aVar.f13338n;
        l a9 = cbVar != null ? cbVar.a() : null;
        uVar.f14076d = aVar.f13329d;
        uVar.f14077e = aVar.f13330e;
        String str2 = "";
        uVar.f14080h = String.valueOf(a9 != null ? Integer.valueOf(a9.ay()) : "");
        if (a9 == null) {
            obj = "";
        } else {
            obj = Integer.valueOf(a9.ai());
        }
        uVar.f14086o = String.valueOf(obj);
        if (a9 == null) {
            str = "";
        } else {
            str = a9.an();
        }
        uVar.f14082k = str;
        uVar.f14087p = String.valueOf(bvVar.g());
        uVar.f14088q = bvVar.z();
        uVar.f14089r = z3 ? "1" : "2";
        uVar.f14090s = String.valueOf(j6);
        uVar.f14091t = z6 ? "1" : "2";
        if (a9 != null) {
            try {
                str2 = a9.A();
            } catch (Throwable unused) {
            }
        }
        uVar.f14067R = str2;
        Map<String, Object> map = aVar.f13328c.f13551g;
        if (map != null) {
            try {
                Object obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj2 != null) {
                    uVar.f14068S = obj2.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject a10 = ai.a(aVar.f13328c.f13551g);
                if (a10 != null) {
                    uVar.Y = a10;
                }
            } catch (Throwable unused3) {
            }
        }
        a(uVar);
    }

    public static void a(String str, bv bvVar, boolean z3, long j6, com.anythink.core.common.h.a aVar) {
        l a9 = aVar != null ? aVar.f13338n.a() : null;
        u uVar = new u(String.valueOf(aVar.f13331f), String.valueOf(bvVar.g()));
        uVar.f14075c = "1004665";
        uVar.a(bvVar);
        uVar.f14077e = str;
        String str2 = "";
        uVar.f14082k = a9 != null ? a9.an() : "";
        uVar.f14087p = String.valueOf(bvVar.g());
        uVar.f14088q = bvVar.z();
        uVar.f14089r = String.valueOf(z3 ? 1 : 2);
        uVar.f14090s = String.valueOf(j6);
        if (a9 != null) {
            try {
                str2 = a9.A();
            } catch (Throwable unused) {
            }
        }
        uVar.f14067R = str2;
        Map<String, Object> map = aVar.f13328c.f13551g;
        if (map != null) {
            try {
                Object obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj != null) {
                    uVar.f14068S = obj.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject a10 = ai.a(aVar.f13328c.f13551g);
                if (a10 != null) {
                    uVar.Y = a10;
                }
            } catch (Throwable unused3) {
            }
        }
        a(uVar);
    }

    public static void a(cd cdVar) {
        if (cdVar == null) {
            return;
        }
        u uVar = new u(cdVar.m(), String.valueOf(cdVar.k()));
        uVar.f14075c = "1004667";
        uVar.a(cdVar.y());
        uVar.f14087p = String.valueOf(cdVar.k());
        uVar.f14088q = cdVar.l();
        uVar.f14089r = cdVar.g();
        uVar.f14090s = cdVar.h();
        uVar.f14091t = cdVar.f();
        uVar.f14092u = cdVar.e();
        uVar.f14093v = cdVar.j();
        uVar.f14094w = cdVar.i();
        uVar.f14095x = String.valueOf(cdVar.o());
        uVar.f14096y = String.valueOf(cdVar.p());
        uVar.f14097z = String.valueOf(cdVar.r());
        uVar.f14051A = String.valueOf(cdVar.t());
        uVar.f14052B = String.valueOf(cdVar.u());
        if (cdVar.b() != null) {
            uVar.f14053C = cdVar.b();
        }
        Double c9 = cdVar.c();
        if (c9 != null) {
            uVar.f14054D = String.valueOf(c9);
        }
        uVar.Y = cdVar.n();
        if (cdVar.k() == 66 && cdVar.w().doubleValue() > 0.0d) {
            uVar.f14055E = String.valueOf(cdVar.t() / cdVar.w().doubleValue());
        }
        uVar.f14056F = cdVar.B();
        if (cdVar.y() != null) {
            String au = cdVar.y().au();
            if (!TextUtils.isEmpty(au)) {
                uVar.f14057G = au;
            }
        }
        MgComparedResult C8 = cdVar.C();
        if (C8 != null && c.b.a(cdVar.x())) {
            MgAdInfo mgAdInfo = C8.getMgAdInfo();
            uVar.f14058H = mgAdInfo != null ? String.valueOf(mgAdInfo.getUSDEcpm()) : "0";
            uVar.f14059I = String.valueOf(C8.getCpCostTime());
        }
        uVar.J = String.valueOf(cdVar.q());
        a(uVar);
    }

    public static void a(n nVar, int i6, String str, double d2, double d9, String str2, String str3, String str4, String str5) {
        u uVar = new u(nVar.aK(), String.valueOf(i6));
        uVar.f14075c = "1004668";
        uVar.a(nVar);
        uVar.f14077e = nVar.aI();
        uVar.f14074Z = str4;
        uVar.aa = str5;
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = str;
        uVar.f14089r = String.valueOf(d2);
        uVar.f14090s = str2;
        uVar.f14091t = str3;
        uVar.f14092u = String.valueOf(d9);
        uVar.f14082k = nVar.aH();
        uVar.f14080h = String.valueOf(nVar.Z());
        uVar.f14086o = String.valueOf(nVar.aG());
        uVar.f14067R = nVar.aB();
        uVar.f14068S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
    }

    public static void a(n nVar, String str, String str2) {
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004669";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = str;
        uVar.f14089r = str2;
        a(uVar);
    }

    public static void a(x xVar, int i6, String str, Map<String, JSONArray> map, int i9, int i10, int i11, String str2, int i12, int i13, long j6, String str3, int i14, boolean z3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004675";
        uVar.a(xVar);
        uVar.f14087p = str;
        uVar.f14088q = String.valueOf(i6);
        uVar.f14090s = String.valueOf(i9);
        uVar.f14091t = String.valueOf(i10);
        uVar.f14092u = String.valueOf(i11);
        uVar.f14093v = str2;
        uVar.f14094w = String.valueOf(i12);
        if (i13 >= 0) {
            uVar.f14095x = String.valueOf(i13);
        }
        if (j6 > 0) {
            uVar.f14096y = String.valueOf(j6);
        }
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14097z = str3;
        }
        if (i14 > 0) {
            uVar.f14051A = String.valueOf(i14);
        }
        if (map != null && map.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, JSONArray> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                uVar.f14052B = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        if (z3) {
            uVar.f14053C = "1";
        }
        a(uVar);
    }

    private static void a(final String str, final String str2, final String str3, final String str4, final String str5, final int i6, final boolean z3, final String str6, final String str7) {
        a(new Runnable() { // from class: com.anythink.core.common.u.e.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z6;
                u uVar = new u(str4, str5);
                uVar.f14075c = "1004680";
                uVar.f14076d = str;
                uVar.f14077e = str2;
                uVar.f14087p = str3;
                uVar.f14088q = String.valueOf(i6);
                uVar.f14089r = z3 ? "1" : "0";
                try {
                    z6 = ((PowerManager) t.b().g().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    z6 = true;
                }
                uVar.f14090s = z6 ? "1" : "0";
                uVar.f14091t = q.a(t.b().g()) ? "1" : "0";
                uVar.f14092u = str7;
                uVar.f14093v = str6;
                e.a(uVar);
            }
        });
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        a(str, str2, str3, str4, str5, str6, str7, "", "", "", "", 0);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i6) {
        u uVar = new u("", "");
        if (TextUtils.isEmpty(uVar.f14075c)) {
            uVar.f14075c = "1004685";
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14087p = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14088q = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14089r = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            uVar.f14090s = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            uVar.f14091t = str5;
        }
        if (!TextUtils.isEmpty(str6)) {
            uVar.f14092u = str6;
        }
        if (!TextUtils.isEmpty(str7)) {
            uVar.f14093v = str7;
        }
        if (!TextUtils.isEmpty(str8)) {
            uVar.f14094w = str8;
        }
        if (!TextUtils.isEmpty(str9)) {
            uVar.f14095x = str9;
        }
        if (!TextUtils.isEmpty(str10)) {
            uVar.f14096y = str10;
        }
        if (!TextUtils.isEmpty(str11)) {
            uVar.f14097z = str11;
        }
        if (i6 > 0) {
            uVar.f14052B = String.valueOf(i6);
        }
        uVar.f14051A = "0";
        a(uVar);
    }

    public static void a(String str, String str2, l lVar, String str3, com.anythink.core.common.h.c cVar, long j6, ATAdRequest aTAdRequest) {
        String str4;
        if (cVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.i().Y());
            str4 = sb.toString();
        } else {
            str4 = null;
        }
        u uVar = new u("4", str4);
        uVar.f14075c = "1004690";
        uVar.a(aTAdRequest);
        uVar.a(lVar);
        uVar.f14076d = str2;
        uVar.f14077e = str;
        if (lVar != null) {
            uVar.f14086o = String.valueOf(lVar.ai());
            uVar.f14080h = String.valueOf(lVar.ay());
            uVar.f14082k = lVar.an();
        }
        if (cVar != null) {
            uVar.a(cVar.i());
        }
        uVar.f14087p = str3;
        if (cVar != null) {
            uVar.f14088q = cVar.l();
            uVar.f14089r = uVar.f14066Q;
            uVar.f14090s = cVar.i() != null ? cVar.i().M() : "";
        }
        uVar.f14091t = "1";
        uVar.f14092u = String.valueOf(j6);
        a(uVar);
    }

    public static void a(final String str, final x xVar, final String str2, final String str3, final String str4, final int i6, final int i9, final String str5, final String str6, final boolean z3, final long j6) {
        if (t.b().g() == null) {
            return;
        }
        a(new Runnable() { // from class: com.anythink.core.common.u.e.3
            @Override // java.lang.Runnable
            public final void run() {
                boolean z6;
                u uVar = new u(str3, str4);
                uVar.f14075c = "1004687";
                com.anythink.core.d.b g4 = D.y.g(D.y.h());
                if (g4 == null || !e.c(g4, uVar)) {
                    uVar.a(xVar);
                    uVar.f14087p = str2;
                    uVar.f14088q = String.valueOf(i6);
                    uVar.f14089r = String.valueOf(i9);
                    boolean z9 = true;
                    try {
                        z6 = ((PowerManager) t.b().g().getSystemService("power")).isScreenOn();
                    } catch (Throwable unused) {
                        z6 = true;
                    }
                    boolean z10 = false;
                    try {
                        KeyguardManager keyguardManager = (KeyguardManager) t.b().g().getSystemService("keyguard");
                        if (keyguardManager != null) {
                            z10 = keyguardManager.inKeyguardRestrictedInputMode();
                        }
                    } catch (Throwable unused2) {
                    }
                    uVar.f14090s = (z10 || !z6) ? (z10 || z6) ? (z10 && z6) ? "2" : "3" : "1" : "0";
                    try {
                        z9 = q.a(t.b().g());
                    } catch (Throwable unused3) {
                    }
                    uVar.f14091t = z9 ? "1" : "0";
                    uVar.f14092u = str6;
                    uVar.f14093v = str5;
                    uVar.f14094w = z3 ? "1" : "2";
                    if (TextUtils.isEmpty(e.f16501y)) {
                        try {
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            long blockSize = statFs.getBlockSize();
                            String unused4 = e.f16501y = ((statFs.getAvailableBlocks() * blockSize) / 1048576) + "MB";
                            uVar.f14095x = e.f16501y;
                        } catch (Throwable unused5) {
                        }
                    } else {
                        uVar.f14095x = e.f16501y;
                    }
                    uVar.f14096y = str;
                    uVar.f14097z = String.valueOf(j6);
                    e.a(uVar);
                }
            }
        });
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004688";
        if (!TextUtils.isEmpty(str)) {
            uVar.f14077e = str;
        }
        uVar.f14087p = str2;
        uVar.f14088q = str3;
        uVar.f14089r = str4;
        uVar.f14090s = str5;
        a(uVar);
    }

    public static void a(final String str, final n nVar, final String str2, final String str3, final String str4, final int i6, final int i9, final long j6) {
        if (t.b().g() == null) {
            return;
        }
        a(new Runnable() { // from class: com.anythink.core.common.u.e.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    u uVar = new u(String.valueOf(i9), "");
                    uVar.f14075c = "1004691";
                    uVar.a(nVar);
                    com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                    if (b9 != null && !b9.S() && b9.i() && !e.c(b9, uVar)) {
                        uVar.f14076d = str2;
                        uVar.f14077e = str3;
                        uVar.a(nVar);
                        uVar.f14087p = str;
                        uVar.f14088q = str4;
                        long j9 = j6;
                        if (j9 >= 0) {
                            uVar.f14089r = String.valueOf(j9);
                        }
                        int i10 = i6;
                        if (i10 > 0) {
                            uVar.f14090s = String.valueOf(i10);
                        }
                        com.anythink.core.common.o.d b10 = com.anythink.core.common.o.e.a().b();
                        if (b10 != null) {
                            uVar.f14091t = String.valueOf(b10.a());
                            uVar.f14092u = String.valueOf(b10.e());
                            uVar.f14093v = String.valueOf(b10.f());
                            uVar.f14094w = String.valueOf(b10.b());
                            uVar.f14095x = String.valueOf(b10.g());
                            uVar.f14096y = String.valueOf(b10.h());
                            uVar.f14097z = String.valueOf(b10.c());
                            uVar.f14051A = String.valueOf(b10.d());
                        }
                        uVar.f14052B = String.valueOf(com.anythink.core.common.o.e.a().e());
                        e.a(uVar);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static void a(x xVar, w wVar) {
        if (wVar == null || xVar == null || !(wVar instanceof bj)) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004697";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        uVar.f14088q = wVar.w();
        uVar.f14089r = ((bj) wVar).aD();
        a(uVar);
    }

    public static void a(String str, String str2, n nVar, String str3, String str4, l lVar, boolean z3, String str5, String str6, String str7) {
        u uVar = new u(str3, "");
        uVar.f14075c = "1004693";
        uVar.a(nVar);
        uVar.f14076d = str4;
        uVar.f14077e = str;
        if (lVar != null) {
            uVar.f14080h = String.valueOf(lVar.ay());
            uVar.f14086o = String.valueOf(lVar.ai());
            uVar.f14082k = lVar.an();
        }
        uVar.f14087p = z3 ? "1" : "2";
        uVar.f14088q = str5;
        uVar.f14089r = str6;
        if (lVar != null) {
            uVar.f14090s = lVar.y() == 1 ? "1" : "2";
        }
        uVar.f14091t = str2;
        uVar.f14092u = str7;
        a(uVar);
    }

    public static void a(String str, String str2, l lVar, n nVar, boolean z3, boolean z6, boolean z9, String str3, String str4, String str5) {
        u uVar = new u(null, "");
        uVar.f14075c = "1004694";
        uVar.a(nVar);
        uVar.a(lVar);
        uVar.f14076d = str3;
        uVar.f14077e = str;
        if (lVar != null) {
            uVar.f14080h = String.valueOf(lVar.ay());
            uVar.f14086o = String.valueOf(lVar.ai());
            uVar.f14082k = lVar.an();
        }
        uVar.f14083l = str5;
        uVar.f14087p = z3 ? "1" : "0";
        uVar.f14088q = z9 ? "1" : "0";
        uVar.f14089r = z6 ? "1" : "0";
        uVar.f14090s = str2;
        uVar.f14091t = str4;
        a(uVar);
    }

    public static void a(n nVar, l lVar, String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, str);
        uVar.f14075c = "1004695";
        uVar.a(nVar);
        if (lVar != null) {
            uVar.f14082k = lVar.an();
        }
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = str4;
        uVar.f14091t = str5;
        a(uVar);
    }

    public static void a(n nVar, l lVar, String str, String str2, String str3, int i6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004696";
        uVar.a(nVar);
        if (lVar != null) {
            uVar.f14082k = lVar.an();
        }
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = String.valueOf(i6);
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i6, boolean z3) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14075c = "1004698";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        uVar.f14088q = wVar.w();
        uVar.f14089r = wVar instanceof r ? ((r) wVar).aD() : "";
        uVar.f14090s = String.valueOf(xVar.f14163j);
        uVar.f14091t = String.valueOf(xVar.f14155a);
        uVar.f14092u = String.valueOf(i6);
        uVar.f14093v = String.valueOf(xVar.f14165l);
        if (i6 != 5) {
            uVar.f14094w = z3 ? "1" : "2";
        }
        a(uVar);
    }

    public static void a(x xVar, w wVar, boolean z3, int i6, int i9, long j6, long j9) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14075c = "1004699";
        uVar.a(xVar);
        uVar.f14087p = z3 ? "2" : "1";
        uVar.f14088q = String.valueOf(i6);
        uVar.f14089r = String.valueOf(j6);
        uVar.f14090s = String.valueOf(j9);
        uVar.f14091t = String.valueOf(xVar.f14163j);
        uVar.f14092u = String.valueOf(i9);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14093v = String.valueOf(rVar.aD());
            uVar.f14094w = String.valueOf(rVar.v());
        }
        a(uVar);
    }

    public static void a(x xVar, int i6, String str, JSONArray jSONArray, String str2, int i9) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004700";
        uVar.a(xVar);
        uVar.f14087p = str;
        uVar.f14088q = String.valueOf(i6);
        uVar.f14089r = jSONArray != null ? jSONArray.toString() : "";
        uVar.f14090s = str2;
        uVar.f14091t = String.valueOf(i9);
        a(uVar);
    }

    public static void a(String str, n nVar, String str2, Object obj, String str3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004701";
        uVar.a(nVar);
        uVar.f14077e = str;
        uVar.f14080h = String.valueOf(nVar.Z());
        uVar.f14086o = String.valueOf(nVar.aG());
        uVar.f14087p = nVar.aK();
        uVar.f14088q = String.valueOf(nVar.Y());
        uVar.f14089r = nVar.M();
        uVar.f14090s = String.valueOf(nVar.ac());
        uVar.f14091t = str2;
        uVar.f14092u = obj != null ? obj.toString() : "";
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14093v = str3;
        }
        a(uVar);
    }

    public static void a(n nVar, com.anythink.core.d.f fVar, String str, double d2, String str2, double d9, String str3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004702";
        uVar.a(nVar);
        uVar.f14087p = nVar.aK();
        uVar.f14088q = fVar.a() == 1 ? "1" : "2";
        uVar.f14089r = String.valueOf(fVar.b());
        uVar.f14090s = String.valueOf(fVar.c());
        uVar.f14091t = String.valueOf(fVar.d());
        uVar.f14092u = String.valueOf(fVar.f());
        uVar.f14093v = String.valueOf(fVar.e());
        uVar.f14094w = str;
        uVar.f14095x = String.valueOf(d2);
        uVar.f14096y = str2;
        uVar.f14097z = String.valueOf(d9);
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14051A = str3;
        }
        a(uVar);
    }

    public static void a(r rVar, x xVar, String str, bh bhVar, boolean z3, int i6) {
        u uVar = new u(String.valueOf(xVar.f14163j), "66");
        uVar.f14075c = "1004704";
        uVar.a(xVar);
        uVar.f14087p = rVar != null ? rVar.v() : "";
        uVar.f14088q = "2";
        uVar.f14089r = String.valueOf(xVar.f14163j);
        if (!TextUtils.isEmpty(str)) {
            uVar.f14090s = str;
        }
        uVar.f14091t = String.valueOf(bhVar.f13631b - bhVar.f13630a);
        uVar.f14092u = String.valueOf(bhVar.f13632c - bhVar.f13630a);
        if (rVar != null) {
            uVar.f14093v = rVar.g() == 1 ? "1" : "0";
        } else {
            uVar.f14093v = "0";
        }
        uVar.f14094w = String.valueOf(bhVar.a());
        uVar.f14095x = xVar.f14170q ? "1" : "0";
        uVar.f14096y = String.valueOf(bhVar.f13631b - bhVar.f13632c);
        uVar.f14097z = z3 ? "1" : "0";
        if (bhVar.f13635f > 0 && bhVar.f13636g > 0) {
            uVar.f14051A = String.valueOf(bhVar.b());
        }
        uVar.f14052B = String.valueOf(i6);
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004705";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = str4;
        uVar.f14090s = str5;
        uVar.f14091t = str;
        uVar.f14092u = str2;
        uVar.f14093v = str3;
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i6, String str) {
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004706";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(xVar.f14160f);
        uVar.f14088q = xVar.f14157c;
        uVar.f14089r = String.valueOf(xVar.f14163j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14090s = rVar.aD();
            uVar.f14091t = rVar.v();
        }
        uVar.f14092u = String.valueOf(i6);
        uVar.f14093v = str;
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i6, long j6, long j9, long j10, long j11) {
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004707";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(xVar.f14160f);
        uVar.f14088q = xVar.f14157c;
        uVar.f14089r = String.valueOf(xVar.f14163j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14090s = rVar.aD();
            uVar.f14091t = rVar.v();
        }
        uVar.f14092u = String.valueOf(i6);
        uVar.f14093v = String.valueOf(j6);
        uVar.f14094w = String.format("%.2f", Double.valueOf((j9 / 1024.0d) / 1024.0d));
        uVar.f14095x = String.valueOf(j10);
        uVar.f14096y = String.format("%.2f", Double.valueOf((j11 / 1024.0d) / 1024.0d));
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, int i6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004709";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = nVar.aK();
        uVar.f14090s = str;
        uVar.f14091t = str2;
        uVar.f14092u = String.valueOf(i6);
        uVar.f14093v = "1";
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, boolean z3) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004710";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = str;
        uVar.f14090s = str2;
        uVar.f14091t = z3 ? "1" : "2";
        a(uVar);
    }

    public static void a(String str, x xVar, String str2, String str3, String str4, String str5, String str6, String str7, long j6, int i6, int i9) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004713";
        uVar.f14076d = str;
        uVar.f14077e = str2;
        uVar.a(xVar);
        uVar.f14087p = str3;
        uVar.f14088q = str4;
        uVar.f14089r = str5;
        uVar.f14090s = str6;
        uVar.f14091t = str7;
        uVar.f14092u = String.valueOf(j6);
        uVar.f14093v = String.valueOf(i6);
        uVar.f14094w = String.valueOf(i9);
        a(uVar);
    }

    public static void a(String str, String str2, bv bvVar, Double d2, Double d9, com.anythink.core.b.c.a aVar) {
        String str3;
        u uVar = new u(null, null);
        uVar.f14075c = "1004716";
        uVar.a(bvVar);
        uVar.f14076d = str;
        uVar.f14077e = str2;
        uVar.f14087p = String.valueOf(bvVar.g());
        uVar.f14088q = bvVar.z();
        String str4 = "";
        uVar.f14089r = d2 != null ? String.valueOf(d2) : "";
        if (d9 == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(d9);
        }
        uVar.f14090s = str3;
        if (aVar != null) {
            str4 = aVar.a();
        }
        uVar.f14091t = str4;
        a(uVar);
    }

    public static void a(x xVar, String str, String str2, String str3, String str4, long j6, String str5, String str6, String str7, String str8, String str9, String str10) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004715";
        uVar.a(xVar);
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = str4;
        uVar.f14091t = String.valueOf(j6);
        uVar.f14092u = str5;
        uVar.f14093v = str6;
        uVar.f14094w = str7;
        uVar.f14095x = str8;
        uVar.f14096y = str9;
        uVar.f14097z = str10;
        a(uVar);
    }

    private static void a(String str, int i6, int i9, int i10) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004717";
        uVar.f14087p = str;
        uVar.f14088q = String.valueOf(i6);
        uVar.f14089r = String.valueOf(i9);
        uVar.f14090s = String.valueOf(i10);
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i6) {
        a(wVar, xVar, i6, false, 0, "", 0, wVar.r() != null ? wVar.r().aQ() : 1);
    }

    public static void a(n nVar, String str, String str2, String str3) {
        u uVar = new u(null, str);
        uVar.f14075c = "1004718";
        uVar.a(nVar);
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i6, boolean z3, int i9, String str, int i10, int i11) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004719";
        uVar.a(xVar);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14087p = rVar.aD();
            uVar.f14088q = rVar.v();
        }
        uVar.f14089r = z3 ? "2" : "1";
        if (i9 > 0) {
            uVar.f14090s = String.valueOf(i9);
            if (!TextUtils.isEmpty(str)) {
                uVar.f14091t = str;
            }
            if (i10 > 0) {
                uVar.f14092u = String.valueOf(i10);
            }
        } else {
            uVar.f14090s = "1";
        }
        uVar.f14093v = String.valueOf(xVar.f14163j);
        if (wVar != null && wVar.r() != null) {
            uVar.f14094w = wVar.r().Q();
        }
        uVar.f14095x = String.valueOf(i6);
        uVar.f14096y = String.valueOf(i11);
        a(uVar);
    }

    public static void a(x xVar, int i6, w wVar, long j6, long j9) {
        u uVar = new u(String.valueOf(i6), null);
        uVar.f14075c = "1004721";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(j6);
        uVar.f14088q = String.valueOf(j9);
        if (wVar != null) {
            if (!TextUtils.isEmpty(wVar.R())) {
                uVar.f14089r = wVar.R();
            }
            uVar.f14090s = wVar.G();
            uVar.f14091t = wVar.v();
            if (wVar instanceof r) {
                uVar.f14092u = ((r) wVar).aD();
            }
        }
        uVar.f14093v = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, l lVar, int i6, int i9, int i10, ATAdRequest aTAdRequest) {
        u uVar = new u("4", null);
        uVar.f14075c = "1004722";
        uVar.f14077e = str;
        uVar.a(aTAdRequest);
        uVar.a(lVar);
        if (lVar != null) {
            uVar.f14082k = lVar.an();
            uVar.f14080h = String.valueOf(lVar.ay());
            uVar.f14086o = String.valueOf(lVar.ai());
        }
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = String.valueOf(i10);
        uVar.f14089r = String.valueOf(i9);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, double d2, String str4, String str5, String str6) {
        u uVar = new u(str3, null);
        uVar.f14075c = "1004724";
        uVar.f14077e = str;
        uVar.f14076d = str2;
        uVar.f14087p = String.valueOf(System.currentTimeMillis());
        uVar.f14088q = str3;
        uVar.f14089r = String.valueOf(d2);
        uVar.f14090s = str4;
        uVar.f14091t = str5;
        uVar.f14092u = str6;
        a(uVar);
    }

    public static void a(String str, String str2, String str3, int i6, long j6, long j9, long j10, long j11, long j12) {
        u uVar = new u(null, "2");
        uVar.f14075c = "1004725";
        uVar.f14087p = str;
        uVar.f14088q = str3;
        uVar.f14089r = str2;
        uVar.f14090s = String.valueOf(i6);
        uVar.f14091t = String.valueOf(j10);
        uVar.f14092u = String.valueOf(j11);
        uVar.f14093v = String.valueOf(j6);
        uVar.f14094w = String.valueOf(j9);
        uVar.f14095x = String.valueOf(j12);
        a(uVar);
    }

    public static void a(x xVar, String str, String str2, String str3, String str4, int i6) {
        u uVar = new u(null, "66");
        uVar.f14075c = "1004735";
        uVar.a(xVar);
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = str4;
        uVar.f14091t = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, String str2) {
        boolean isEmpty = str.isEmpty();
        u uVar = new u(null, null);
        uVar.f14075c = "1004729";
        uVar.f14087p = Build.MANUFACTURER;
        uVar.f14088q = !isEmpty ? "1" : "2";
        if (!isEmpty) {
            uVar.f14089r = str;
        } else {
            uVar.f14090s = str2;
        }
        a(uVar);
    }

    public static void a(final com.anythink.core.common.k.e eVar, final boolean z3, final n nVar, final long j6, final boolean z6, final String str, final ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.u.e.5

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f16540b = 1;

            /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str2;
                com.anythink.core.common.k.e eVar2;
                Map<String, Object> networkInfoMap;
                u uVar = new u(n.this.aK(), "2");
                uVar.f14075c = "1004730";
                uVar.a(n.this);
                uVar.f14087p = n.this.M();
                uVar.f14088q = String.valueOf(n.this.ad());
                uVar.f14089r = String.valueOf(n.this.Y());
                uVar.f14090s = String.valueOf(this.f16540b);
                uVar.f14091t = String.valueOf(j6);
                uVar.f14092u = z6 ? "1" : "2";
                uVar.f14093v = str;
                ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                if (aTBaseAdAdapter2 != null && (networkInfoMap = aTBaseAdAdapter2.getNetworkInfoMap()) != null) {
                    try {
                        str2 = new JSONObject(networkInfoMap).toString();
                    } catch (Throwable unused) {
                    }
                    uVar.f14094w = str2;
                    uVar.f14095x = z3 ? "1" : "2";
                    eVar2 = eVar;
                    if (eVar2 instanceof com.anythink.core.common.q.e) {
                        com.anythink.core.common.q.e eVar3 = (com.anythink.core.common.q.e) eVar2;
                        uVar.f14096y = String.valueOf(eVar3.a());
                        String b9 = eVar3.b();
                        if (!TextUtils.isEmpty(b9)) {
                            uVar.f14097z = b9;
                        }
                    }
                    e.a(uVar);
                }
                str2 = "";
                uVar.f14094w = str2;
                uVar.f14095x = z3 ? "1" : "2";
                eVar2 = eVar;
                if (eVar2 instanceof com.anythink.core.common.q.e) {
                }
                e.a(uVar);
            }
        }, 13);
    }

    public static void a(String str, String str2, x xVar, String str3, String str4, int i6, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z3, boolean z6, String str18, String str19, String str20) {
        u uVar = new u(null, "66");
        uVar.f14075c = "1004731";
        uVar.f14076d = str;
        uVar.f14077e = str2;
        uVar.a(xVar);
        uVar.f14087p = str3;
        uVar.f14088q = str4;
        uVar.f14089r = str6;
        uVar.f14090s = str7;
        uVar.f14091t = str8;
        uVar.f14092u = str9;
        uVar.f14093v = str10;
        uVar.f14094w = str11;
        uVar.f14095x = str12;
        uVar.f14096y = str5;
        uVar.f14097z = String.valueOf(i6);
        uVar.f14051A = str13;
        uVar.f14052B = str14;
        uVar.f14053C = str15;
        uVar.f14054D = str16;
        uVar.f14055E = str17;
        uVar.f14056F = z3 ? "2" : "1";
        uVar.f14057G = z6 ? "1" : "2";
        uVar.f14058H = str18;
        uVar.f14059I = str19;
        uVar.J = str20;
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, long j6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004738";
        uVar.f14087p = str;
        uVar.f14088q = str2;
        uVar.f14089r = str3;
        uVar.f14090s = str4;
        uVar.f14091t = str5;
        uVar.f14092u = str6;
        uVar.f14093v = String.valueOf(SystemClock.elapsedRealtime() - j6);
        a(uVar);
    }

    public static void a(x xVar, w wVar, long j6, boolean z3, long j9, int i6) {
        u uVar = new u(String.valueOf(xVar.f14163j), "66");
        uVar.f14075c = "1004733";
        uVar.a(xVar);
        y yVar = xVar.f14168o;
        if (yVar != null) {
            uVar.f14087p = yVar.br() == 2 ? "1" : "2";
            uVar.f14092u = String.valueOf(xVar.f14168o.bs());
            uVar.f14093v = String.valueOf(xVar.f14168o.bt());
            uVar.f14095x = String.valueOf(xVar.f14168o.bu());
            uVar.f14096y = String.valueOf(xVar.f14168o.o());
        }
        uVar.f14088q = String.valueOf(j6);
        uVar.f14089r = String.valueOf(System.currentTimeMillis() - j6);
        if (wVar instanceof r) {
            uVar.f14090s = ((r) wVar).aD();
            uVar.f14091t = wVar.v();
        }
        uVar.f14094w = z3 ? "1" : "2";
        uVar.f14097z = String.valueOf(j9);
        uVar.f14051A = String.valueOf(i6);
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i6, int i9, int i10, boolean z3, boolean z6) {
        u uVar = new u(String.valueOf(xVar.f14163j), "66");
        uVar.f14075c = "1004736";
        uVar.a(xVar);
        uVar.f14087p = String.valueOf(xVar.f14163j);
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
            uVar.f14089r = wVar.v();
        }
        uVar.f14090s = 1 == ((bj) wVar).aJ() ? "2" : "1";
        y yVar = xVar.f14168o;
        if (yVar != null) {
            uVar.f14091t = yVar.W() == 1 ? "1" : "2";
        }
        uVar.f14092u = i6 == 1 ? "2" : "1";
        uVar.f14093v = i9 == 1 ? "2" : "1";
        uVar.f14094w = String.valueOf(i10);
        uVar.f14095x = z3 ? "1" : "2";
        uVar.f14096y = z6 ? "1" : "2";
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), "66");
        uVar.f14075c = "1004737";
        uVar.a(xVar);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14087p = String.valueOf(rVar.aD());
            uVar.f14088q = String.valueOf(rVar.v());
        }
        uVar.f14089r = wVar.ak();
        uVar.f14090s = wVar.al();
        uVar.f14091t = wVar.am();
        uVar.f14092u = str;
        uVar.f14093v = String.valueOf(xVar.f14163j);
        a(uVar);
    }

    public static void a(long j6, long j9) {
        u uVar = new u("", "");
        uVar.f14075c = "1004742";
        uVar.f14087p = String.valueOf(j6);
        uVar.f14088q = "0";
        uVar.f14089r = String.valueOf(j9);
        a(uVar);
    }

    public static void a(n nVar, String str, boolean z3) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14075c = "1004744";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(nVar.Y());
        uVar.f14088q = nVar.M();
        uVar.f14089r = String.valueOf(nVar.aK());
        uVar.f14090s = z3 ? "1" : "2";
        uVar.f14091t = str;
        uVar.f14092u = t.b().W() ? "1" : "2";
        uVar.f14093v = com.anythink.core.common.d.b.b().a();
        a(uVar);
    }

    public static void a(int i6) {
        u uVar = new u("", "");
        uVar.f14075c = "1004739";
        uVar.f14087p = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, n nVar, boolean z3, String str2) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004740";
        uVar.a(nVar);
        uVar.f14087p = str;
        uVar.f14089r = z3 ? "1" : "2";
        if (nVar != null) {
            uVar.f14088q = String.valueOf(nVar.Y());
            uVar.f14090s = String.valueOf(nVar.ad());
            uVar.f14091t = nVar.M();
        }
        uVar.f14092u = str2;
        a(uVar);
    }

    public static void a(n nVar, String str) {
        if (nVar != null) {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14075c = "1004741";
            uVar.a(nVar);
            uVar.f14087p = nVar.M();
            uVar.f14088q = "2";
            uVar.f14089r = String.valueOf(nVar.Y());
            uVar.f14090s = nVar.aK();
            uVar.f14091t = String.valueOf(nVar.ad());
            uVar.f14092u = str;
            a(uVar);
        }
    }

    public static void a(w wVar, x xVar, int i6, int i9) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004747";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        uVar.f14089r = String.valueOf(i6);
        if (i9 > 0) {
            uVar.f14090s = String.valueOf(i9);
        }
        uVar.f14091t = String.valueOf(wVar.K());
        uVar.f14092u = wVar.G();
        uVar.f14093v = wVar.H();
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i6, boolean z3, int i9, String str) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004748";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        if (TextUtils.isEmpty(str)) {
            uVar.f14089r = wVar.G();
        } else {
            uVar.f14089r = str;
        }
        uVar.f14090s = wVar.H();
        uVar.f14091t = String.valueOf(i6);
        if (i6 != 1 && z3) {
            uVar.f14092u = z3 ? "1" : "2";
        }
        if (i6 == 3 && i9 > 0) {
            uVar.f14093v = String.valueOf(i9);
        }
        a(uVar);
    }

    public static void a(com.anythink.core.common.h.h hVar, n nVar) {
        if (hVar == null || nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), null);
        uVar.f14075c = "1004753";
        uVar.a(nVar);
        uVar.f14087p = String.valueOf(hVar.i());
        uVar.f14088q = String.valueOf(hVar.a());
        uVar.f14089r = String.valueOf(hVar.b());
        uVar.f14090s = String.valueOf(hVar.c());
        uVar.f14091t = String.valueOf(hVar.d());
        uVar.f14092u = String.valueOf(hVar.e());
        uVar.f14093v = String.valueOf(hVar.f());
        uVar.f14094w = String.valueOf(hVar.g());
        uVar.f14095x = String.valueOf(hVar.h());
        uVar.f14096y = String.valueOf(nVar.an());
        hVar.h();
        hVar.a();
        a(uVar);
    }

    public static void a(w wVar, x xVar, boolean z3, boolean z6) {
        String str;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004751";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        y yVar = xVar.f14168o;
        if (yVar != null) {
            uVar.f14089r = String.valueOf(yVar.bz());
            uVar.f14092u = String.valueOf(xVar.f14168o.aK());
            if (xVar.f14168o.aK() == 2) {
                str = String.valueOf(xVar.f14168o.aN());
            } else if (xVar.f14168o.aM() != null) {
                str = xVar.f14168o.aM().toString();
            } else {
                str = "";
            }
            uVar.f14093v = str;
            uVar.f14094w = String.valueOf(xVar.f14168o.bA());
        }
        uVar.f14090s = z3 ? "1" : "2";
        uVar.f14091t = z6 ? "1" : "2";
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str, String str2, List<Boolean> list, int i6, boolean z3) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004756";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        uVar.f14089r = str;
        uVar.f14090s = str2;
        uVar.f14091t = String.valueOf(xVar.f14163j);
        uVar.f14093v = String.valueOf(i6);
        if (list != null && list.size() == 5) {
            Boolean bool = list.get(0);
            Boolean bool2 = list.get(1);
            Boolean bool3 = list.get(2);
            Boolean bool4 = list.get(3);
            Boolean bool5 = list.get(4);
            if (bool != null) {
                uVar.f14094w = bool.booleanValue() ? "1" : "2";
            }
            if (bool2 != null) {
                uVar.f14095x = bool2.booleanValue() ? "1" : "2";
            }
            if (bool3 != null) {
                uVar.f14096y = bool3.booleanValue() ? "1" : "2";
            }
            if (bool4 != null) {
                uVar.f14097z = bool4.booleanValue() ? "1" : "2";
            }
            if (bool5 != null) {
                uVar.f14051A = bool5.booleanValue() ? "1" : "2";
            }
        }
        uVar.f14052B = z3 ? "1" : "2";
        a(uVar);
    }

    public static void a(int i6, int i9, int i10, long j6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004758";
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = String.valueOf(i9);
        uVar.f14089r = String.valueOf(i10);
        uVar.f14090s = String.valueOf(j6);
        a(uVar);
    }

    public static void a(String str) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004755";
        uVar.f14087p = str;
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2) {
        a(xVar, wVar, str, str2, true, "", "");
    }

    public static void a(x xVar, w wVar, String str, String str2, boolean z3, String str3, String str4) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), "66");
        uVar.f14075c = "1004743";
        uVar.f14076d = xVar.f14158d;
        uVar.f14077e = xVar.f14156b;
        uVar.a(xVar);
        uVar.f14087p = str;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14088q = String.valueOf(rVar.aD());
            uVar.f14089r = String.valueOf(rVar.v());
        }
        uVar.f14090s = String.valueOf(xVar.f14163j);
        uVar.f14091t = str2;
        uVar.f14092u = z3 ? "1" : "2";
        uVar.f14093v = str3;
        uVar.f14094w = str4;
        a(uVar);
    }

    public static void a(n nVar, int i6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004759";
        uVar.a(nVar);
        uVar.f14087p = i6 == 7 ? "1" : "2";
        a(uVar);
    }

    public static void a(x xVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        u a9 = u.a(str);
        a9.a(xVar);
        a(a9);
    }

    public static void a(w wVar, x xVar, long j6, long j9) {
        a(wVar, xVar, true, j6, 0, "", j9);
    }

    public static void a(w wVar, x xVar, boolean z3, long j6, int i6, String str, long j9) {
        String str2;
        String str3;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004761";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        uVar.f14089r = z3 ? "1" : "2";
        uVar.f14090s = String.valueOf(j6);
        uVar.f14091t = wVar.an();
        String str4 = "";
        if (wVar.r() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(wVar.r().bG());
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        uVar.f14092u = str2;
        if (wVar.r() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.r().bE());
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        uVar.f14093v = str3;
        if (wVar.r() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(wVar.r().bF());
            str4 = sb3.toString();
        }
        uVar.f14094w = str4;
        if (!z3) {
            uVar.f14095x = String.valueOf(i6);
            uVar.f14096y = str;
        }
        if (j9 > 0) {
            uVar.f14097z = String.valueOf(j9);
        }
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i6, long j6, String str, long j9, long j10, long j11, long j12, long j13) {
        String str2;
        String str3;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14163j), String.valueOf(xVar.f14160f));
        uVar.f14075c = "1004762";
        uVar.a(xVar);
        uVar.f14087p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14088q = ((r) wVar).aD();
        }
        uVar.f14089r = String.valueOf(i6);
        uVar.f14090s = String.valueOf(j6);
        uVar.f14091t = wVar.an();
        String str4 = "";
        if (wVar.r() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(wVar.r().bG());
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        uVar.f14092u = str2;
        if (wVar.r() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.r().bE());
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        uVar.f14093v = str3;
        if (wVar.r() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(wVar.r().bF());
            str4 = sb3.toString();
        }
        uVar.f14094w = str4;
        uVar.f14095x = str;
        uVar.f14096y = String.valueOf(j9);
        uVar.f14097z = String.valueOf(j10);
        uVar.f14051A = String.valueOf(j11);
        uVar.f14052B = String.valueOf(j12);
        uVar.f14053C = String.valueOf(j13);
        a(uVar);
    }

    public static void a(int i6, String str, String str2) {
        u uVar = new u("", "");
        uVar.f14075c = "1004765";
        uVar.f14087p = String.valueOf(i6);
        uVar.f14088q = str;
        uVar.f14089r = str2;
        a(uVar);
    }

    public static void a(com.anythink.core.common.m.b.a aVar) {
        if (aVar == null) {
            return;
        }
        u uVar = new u("", "");
        uVar.f14075c = "1004766";
        uVar.f14087p = aVar.a();
        uVar.f14088q = String.valueOf(aVar.b());
        uVar.f14089r = String.valueOf(aVar.c());
        uVar.f14090s = String.valueOf(aVar.f());
        uVar.f14091t = String.valueOf(aVar.g());
        uVar.f14092u = String.valueOf(aVar.d());
        uVar.f14093v = String.valueOf(aVar.e());
        uVar.f14094w = aVar.i();
        uVar.f14095x = String.valueOf(aVar.j());
        uVar.f14096y = aVar.l();
        uVar.f14097z = aVar.m();
        uVar.f14051A = aVar.n();
        uVar.f14053C = String.valueOf(aVar.q());
        Context g4 = t.b().g();
        if (g4 != null) {
            uVar.f14052B = q.a(g4) ? "1" : "0";
        }
        a(uVar);
    }

    public static void a(int i6, int i9, String str, long j6) {
        u uVar = new u(null, null);
        uVar.f14075c = "1004769";
        try {
            uVar.f14087p = Build.MANUFACTURER;
        } catch (Throwable unused) {
        }
        uVar.f14088q = String.valueOf(i6);
        uVar.f14089r = String.valueOf(i9);
        if (!TextUtils.isEmpty(str)) {
            uVar.f14090s = str;
        }
        uVar.f14091t = String.valueOf(j6);
        a(uVar);
    }

    public static void a(final u uVar) {
        if (uVar == null || t.b().g() == null) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.u.e.6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                try {
                    if (TextUtils.isEmpty(u.this.f14078f)) {
                        u.this.f14078f = t.b().r();
                    }
                    if (!TextUtils.isEmpty(u.this.f14077e)) {
                        u.this.f14079g = t.b().g(u.this.f14077e);
                        e.c(u.this);
                        if (ATAdxSetting.getInstance().isAdxNetworkMode(u.this.f14077e)) {
                            u.this.f14073X = 1;
                        }
                    }
                    u.this.f14081j = String.valueOf(System.currentTimeMillis());
                    com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                    if (b9 != null) {
                        z3 = e.a(u.this, b9);
                        if (e.c(b9, u.this)) {
                            return;
                        }
                        if (e.b(b9, u.this)) {
                            f.a(t.b().g()).a(u.this, z3);
                            return;
                        }
                    } else {
                        z3 = false;
                    }
                    d.a().a(u.this, z3);
                } catch (Throwable unused) {
                }
            }
        }, 8);
    }

    private static void a(Runnable runnable) {
        com.anythink.core.common.v.b.b.a().b(runnable, 13);
    }

    private static String a(AdError adError, int i6, String str, int i9) {
        com.anythink.core.common.w.a.b.c cVar;
        com.anythink.core.common.h.ai a9;
        if (i9 == 0 && (cVar = (com.anythink.core.common.w.a.b.c) com.anythink.core.common.w.a.a.d.a(str, com.anythink.core.common.w.a.b.c.class)) != null && adError != null && (a9 = cVar.a()) != null && a9.e() != null) {
            return com.anythink.core.common.w.a.d.a.a(adError.getPlatformCode() + "," + adError.getPlatformMSG(), a9.e().get(Integer.valueOf(i6)));
        }
        return "";
    }

    public static /* synthetic */ boolean a(u uVar, com.anythink.core.d.b bVar) {
        Map<String, String> f3;
        if ("1004742".equals(uVar.f14075c)) {
            return true;
        }
        if (!TextUtils.isEmpty(uVar.f14075c) && !TextUtils.isEmpty(uVar.f14066Q) && !TextUtils.isEmpty(uVar.f14065P) && (f3 = bVar.f(uVar.f14075c)) != null) {
            if (f3.containsKey("0")) {
                String str = f3.get("0");
                return !TextUtils.isEmpty(str) && str.contains(uVar.f14065P);
            }
            if (f3.containsKey(uVar.f14066Q)) {
                String str2 = f3.get(uVar.f14066Q);
                if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14065P)) {
                    return true;
                }
            }
        }
        return false;
    }
}
