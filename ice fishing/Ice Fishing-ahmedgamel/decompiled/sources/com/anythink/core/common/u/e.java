package com.anythink.core.common.u;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
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
    public static final int f17265a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17266b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17267c = 7;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17268d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17269e = 9;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17270f = 10;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17271g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17272h = 11;
    public static final int i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17273j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17274k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17275l = 5;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17276m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17277n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17278o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17279p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f17280q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f17281r = 1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f17282s = 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f17283t = 3;

    /* renamed from: u, reason: collision with root package name */
    public static final int f17284u = 4;

    /* renamed from: v, reason: collision with root package name */
    public static final int f17285v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final int f17286w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static final String f17287x = "e";

    /* renamed from: y, reason: collision with root package name */
    private static String f17288y = "";

    private static boolean d(com.anythink.core.d.b bVar, u uVar) {
        Map<String, String> aw = bVar.aw();
        if (aw == null) {
            return false;
        }
        if (TextUtils.isEmpty(uVar.f14851P)) {
            return aw.containsKey(uVar.f14861c);
        }
        if (!aw.containsKey(uVar.f14861c)) {
            return false;
        }
        String str = aw.get(uVar.f14861c);
        return !TextUtils.isEmpty(str) && str.contains(uVar.f14851P);
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
            uVar.f14861c = "1004639";
            uVar.a(nVar);
            uVar.f14873p = String.valueOf(nVar.Y());
            uVar.f14874q = nVar.M();
            uVar.f14875r = String.valueOf(nVar.O());
            uVar.f14876s = str;
            uVar.f14851P = nVar.aK();
            uVar.f14853R = nVar.aB();
            uVar.f14854S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(n nVar, AdError adError, bv bvVar) {
        try {
            u uVar = new u(nVar.aK(), null);
            uVar.f14861c = "1004630";
            uVar.a(nVar);
            l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
            uVar.f14868k = a9 != null ? a9.an() : "";
            if (adError != null) {
                uVar.f14873p = adError.printStackTrace();
                uVar.f14874q = adError.getCode();
            }
            if (bvVar != null) {
                uVar.f14875r = bvVar.z();
                uVar.f14876s = String.valueOf(p.a(bvVar));
            }
            uVar.f14853R = nVar.aB();
            uVar.f14854S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004647";
        uVar.f14864f = str3;
        uVar.f14873p = str2;
        uVar.f14874q = str;
        uVar.f14875r = str4;
        a(uVar);
    }

    public static void b(x xVar, w wVar, String str, String str2, int i4) {
        if (xVar == null || wVar == null) {
            return;
        }
        boolean z6 = i4 == 0;
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004728";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        uVar.f14874q = String.valueOf(xVar.f14954o.bo());
        uVar.f14875r = String.valueOf(z6 ? 1 : 2);
        uVar.f14876s = str;
        uVar.f14877t = str2;
        if (!z6) {
            uVar.f14878u = String.valueOf(i4);
        }
        a(uVar);
    }

    public static void c(n nVar, String str, String str2) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14861c = "1004750";
        uVar.a(nVar);
        uVar.f14862d = nVar.aJ();
        uVar.f14863e = nVar.aI();
        uVar.f14868k = nVar.aH();
        uVar.f14866h = String.valueOf(nVar.Z());
        uVar.f14872o = String.valueOf(nVar.aG());
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = String.valueOf(nVar.aK());
        uVar.f14876s = str;
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14877t = str2;
        }
        a(uVar);
    }

    private static void a(n nVar, String str, int i4, String str2, String str3, int i6, int i9, AdError adError, int i10, double d9, long j6, int i11, int i12, String str4, String str5, JSONObject jSONObject, int i13, String str6) {
        String str7;
        u uVar = new u(str3, String.valueOf(i4));
        uVar.f14861c = "1004631";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = str2;
        uVar.f14875r = String.valueOf(i6);
        if (!TextUtils.isEmpty(str6)) {
            uVar.f14876s = "15";
        } else {
            uVar.f14876s = String.valueOf(i9);
        }
        String str8 = "";
        uVar.f14877t = adError != null ? adError.getPlatformCode() : "";
        if (adError == null) {
            str7 = "";
        } else {
            str7 = adError.getPlatformMSG();
        }
        uVar.f14878u = str7;
        uVar.f14879v = String.valueOf(i10);
        uVar.f14880w = String.valueOf(d9);
        if (i9 == 0) {
            uVar.f14881x = String.valueOf(j6);
        }
        uVar.f14882y = String.valueOf(i11);
        uVar.f14883z = String.valueOf(i12);
        if (i13 >= -1) {
            uVar.f14837A = String.valueOf(i13);
        }
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(str);
        if (a9 != null) {
            str8 = a9.an();
        }
        uVar.f14868k = str8;
        uVar.f14853R = str4;
        uVar.f14854S = str5;
        if (jSONObject != null) {
            uVar.Y = jSONObject;
        }
        a(uVar);
    }

    public static void b(x xVar, w wVar, int i4, long j6, long j9, long j10, long j11) {
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004708";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(xVar.f14946f);
        uVar.f14874q = xVar.f14943c;
        uVar.f14875r = String.valueOf(xVar.f14949j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14876s = rVar.aD();
            uVar.f14877t = rVar.v();
        }
        uVar.f14878u = String.valueOf(i4);
        uVar.f14879v = String.valueOf(j6);
        uVar.f14880w = String.format("%.2f", Double.valueOf((j9 / 1024.0d) / 1024.0d));
        uVar.f14881x = String.valueOf(j10);
        uVar.f14882y = String.format("%.2f", Double.valueOf((j11 / 1024.0d) / 1024.0d));
        y yVar = xVar.f14954o;
        if (yVar != null && yVar.bk() > 0) {
            uVar.f14883z = String.valueOf(xVar.f14954o.bk());
        }
        a(uVar);
    }

    public static void c(w wVar, x xVar, int i4) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004768";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14874q = rVar.aD();
            uVar.f14875r = String.valueOf(rVar.az());
        }
        uVar.f14876s = String.valueOf(i4);
        a(uVar);
    }

    public static void b(n nVar, String str, String str2) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14861c = "1004745";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = String.valueOf(nVar.aK());
        uVar.f14876s = str;
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14877t = str2;
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
            String str = uVar.f14852Q;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(aA);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        if (TextUtils.equals(str, jSONArray.optString(i4))) {
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
        if (TextUtils.isEmpty(uVar.f14851P)) {
            return ay.containsKey(uVar.f14861c);
        }
        if (ay.containsKey(uVar.f14861c)) {
            String str2 = ay.get(uVar.f14861c);
            if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14851P)) {
                return true;
            }
        }
        return false;
    }

    public static void a(n nVar, int i4, AdError adError) {
        try {
            a(nVar, nVar.aI(), nVar.Y(), nVar.M(), nVar.aK(), -1, i4, adError, nVar.J(), nVar.L(), 0L, nVar.ac(), nVar.f14811t, nVar.aB(), nVar.aC(), nVar.ax(), nVar.am(), a(adError, nVar.Y(), nVar.aI(), i4));
        } catch (Throwable unused) {
        }
    }

    public static void b(w wVar, x xVar, int i4) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004749";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        uVar.f14875r = wVar.G();
        uVar.f14876s = String.valueOf(i4);
        a(uVar);
    }

    public static void c(u uVar) {
        l b9 = com.anythink.core.d.n.a(t.b().g()).b(uVar.f14863e);
        if (b9 != null) {
            uVar.f14855T = b9.aQ();
        }
    }

    public static void a(n nVar, int i4, AdError adError, long j6) {
        try {
            a(nVar, nVar.aI(), nVar.Y(), nVar.M(), nVar.aK(), nVar.O(), i4, adError, nVar.J(), nVar.L(), j6, nVar.ac(), nVar.f14811t, nVar.aB(), nVar.aC(), nVar.ax(), nVar.am(), a(adError, nVar.Y(), nVar.aI(), i4));
        } catch (Throwable unused) {
        }
    }

    public static void b(n nVar) {
        com.anythink.core.common.h.d f2 = nVar.f();
        int U8 = nVar.U();
        nVar.aI();
        if (f2 == null || !com.anythink.core.common.w.a().a(nVar.aI())) {
            return;
        }
        u uVar = new u(nVar.aK(), null);
        uVar.f14861c = "1004754";
        uVar.a(nVar);
        uVar.f14862d = nVar.aJ();
        uVar.f14863e = nVar.aI();
        uVar.f14866h = String.valueOf(nVar.Z());
        uVar.f14872o = String.valueOf(nVar.aG());
        uVar.f14873p = String.valueOf(U8);
        uVar.f14874q = f2.a();
        uVar.f14875r = f2.d();
        uVar.f14876s = String.valueOf(f2.e());
        uVar.f14877t = String.valueOf(f2.i());
        uVar.f14878u = String.valueOf(f2.g());
        uVar.f14879v = String.valueOf(f2.f());
        uVar.f14880w = String.valueOf(f2.h());
        a(uVar);
    }

    public static void a(String str, String str2, l lVar, int i4, String str3, Map<String, Object> map, ae aeVar) {
        Object obj;
        String str4;
        try {
            String str5 = "";
            u uVar = new u(lVar != null ? String.valueOf(lVar.aq()) : "", "");
            uVar.f14861c = "1004633";
            uVar.a(lVar);
            uVar.a(aeVar);
            uVar.f14862d = str;
            uVar.f14863e = str2;
            uVar.f14866h = String.valueOf(lVar != null ? lVar.ay() : 0);
            uVar.f14869l = "0";
            if (lVar == null) {
                obj = "";
            } else {
                obj = Integer.valueOf(lVar.ai());
            }
            uVar.f14872o = String.valueOf(obj);
            uVar.f14873p = String.valueOf(i4);
            uVar.f14874q = str3;
            uVar.f14877t = str;
            uVar.f14878u = "0";
            if (lVar == null) {
                str4 = "";
            } else {
                str4 = lVar.an();
            }
            uVar.f14868k = str4;
            if (lVar != null) {
                str5 = lVar.A();
            }
            uVar.f14853R = str5;
            if (map != null) {
                Object obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj2 != null) {
                    uVar.f14854S = obj2.toString();
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

    public static void b(n nVar, int i4) {
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
        preLoadInfo.setCpEcpmReceiveTime(i4);
        u uVar = new u(null, null);
        uVar.f14861c = "1004760";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(i4);
        MgComparedResult mgComparedResult = a9.getPreLoadInfo().getMgComparedResult();
        uVar.f14874q = String.valueOf(mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L);
        double cpPrice = mgComparedResult != null ? mgComparedResult.getCpPrice() : 0.0d;
        if (cpPrice > 0.0d) {
            uVar.f14875r = String.valueOf(cpPrice);
        }
        a(uVar);
    }

    public static void a(n nVar, boolean z6) {
        if (t.b().g() == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14861c = "1004634";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = String.valueOf(nVar.P());
        uVar.f14876s = z6 ? "1" : "0";
        uVar.f14877t = String.valueOf(nVar.f14794C);
        if (nVar.Y() == 66) {
            int ag = nVar.ag();
            if (ag != 0) {
                uVar.f14878u = String.valueOf(ag);
            }
            int ai = nVar.ai();
            if (ai != 0) {
                uVar.f14880w = String.valueOf(ai);
            }
            int aj = nVar.aj();
            if (aj != 0) {
                uVar.f14881x = String.valueOf(aj);
            }
        }
        uVar.f14879v = nVar.aK();
        uVar.f14882y = String.valueOf(nVar.as());
        uVar.f14883z = String.valueOf(nVar.ar());
        uVar.f14837A = String.valueOf(nVar.at());
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
        uVar.f14868k = a9 != null ? a9.an() : "";
        uVar.f14851P = nVar.aK();
        uVar.f14853R = nVar.aB();
        uVar.f14854S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
        b.a().a(uVar, nVar);
    }

    public static void b(n nVar, String str) {
        u uVar = new u("", "");
        uVar.a(nVar);
        uVar.f14861c = "1004767";
        uVar.f14873p = str;
        a(uVar);
    }

    private static boolean b(u uVar, com.anythink.core.d.b bVar) {
        Map<String, String> f2;
        if ("1004742".equals(uVar.f14861c)) {
            return true;
        }
        if (!TextUtils.isEmpty(uVar.f14861c) && !TextUtils.isEmpty(uVar.f14852Q) && !TextUtils.isEmpty(uVar.f14851P) && (f2 = bVar.f(uVar.f14861c)) != null) {
            if (f2.containsKey("0")) {
                String str = f2.get("0");
                return !TextUtils.isEmpty(str) && str.contains(uVar.f14851P);
            }
            if (f2.containsKey(uVar.f14852Q)) {
                String str2 = f2.get(uVar.f14852Q);
                if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14851P)) {
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
                if (TextUtils.isEmpty(a9.f14861c)) {
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
        if (TextUtils.isEmpty(uVar.f14851P)) {
            return aw.containsKey(uVar.f14861c);
        }
        if (!aw.containsKey(uVar.f14861c)) {
            return false;
        }
        String str = aw.get(uVar.f14861c);
        return !TextUtils.isEmpty(str) && str.contains(uVar.f14851P);
    }

    public static void a(String str, String str2, boolean z6, int i4, l lVar, com.anythink.core.common.h.c cVar, String str3, String str4, Map<String, Object> map, com.anythink.core.common.h.d dVar, ae aeVar) {
        a(str, str2, z6, i4, lVar, cVar, str3, str4, map, dVar, 0L, aeVar);
    }

    public static void a(final String str, final String str2, final boolean z6, final int i4, final l lVar, final com.anythink.core.common.h.c cVar, final String str3, final String str4, final Map<String, Object> map, final com.anythink.core.common.h.d dVar, final long j6, final ae aeVar) {
        try {
            a(new Runnable() { // from class: com.anythink.core.common.u.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    JSONObject a9;
                    try {
                        com.anythink.core.common.h.c cVar2 = com.anythink.core.common.h.c.this;
                        n i6 = cVar2 != null ? cVar2.i() : null;
                        l lVar2 = lVar;
                        u uVar = new u(lVar2 != null ? String.valueOf(lVar2.aq()) : "", i6 != null ? String.valueOf(i6.Y()) : "");
                        uVar.f14861c = "1004632";
                        uVar.f14862d = str;
                        uVar.f14863e = str2;
                        uVar.a(i6);
                        if (i6 == null) {
                            uVar.a(aeVar);
                        }
                        if (TextUtils.isEmpty(uVar.f14866h)) {
                            l lVar3 = lVar;
                            if (lVar3 != null) {
                                uVar.f14866h = String.valueOf(lVar3.ay());
                            } else {
                                uVar.f14866h = "0";
                            }
                        }
                        uVar.f14873p = z6 ? "1" : "0";
                        uVar.f14874q = String.valueOf(i4);
                        uVar.f14875r = i6 != null ? String.valueOf(i6.P()) : "-1";
                        uVar.f14876s = i6 != null ? i6.M() : "";
                        uVar.f14877t = i6 != null ? String.valueOf(i6.Y()) : "";
                        uVar.f14878u = i6 != null ? i6.f14815x : "";
                        uVar.f14879v = str3;
                        uVar.f14880w = i6 != null ? i6.aJ() : str;
                        if (i6 == null || TextUtils.equals(str, i6.aJ())) {
                            uVar.f14881x = "0";
                        } else {
                            uVar.f14881x = "1";
                        }
                        if (i6 != null) {
                            uVar.f14882y = i6.f14811t == 3 ? "1" : "0";
                        } else {
                            uVar.f14882y = "0";
                        }
                        uVar.f14883z = str4;
                        com.anythink.core.common.h.c cVar3 = com.anythink.core.common.h.c.this;
                        if (cVar3 != null && cVar3.l() == "3") {
                            uVar.f14838B = "1";
                        }
                        long j9 = j6;
                        if (j9 > 0) {
                            uVar.f14837A = String.valueOf(j9);
                        }
                        l lVar4 = lVar;
                        uVar.f14868k = lVar4 != null ? lVar4.an() : "";
                        l lVar5 = lVar;
                        uVar.f14851P = lVar5 != null ? String.valueOf(lVar5.aq()) : "";
                        if (i6 != null) {
                            uVar.f14853R = i6.aB();
                        } else {
                            l lVar6 = lVar;
                            if (lVar6 != null) {
                                uVar.f14853R = lVar6.A();
                            }
                        }
                        if (i6 != null) {
                            uVar.f14854S = i6.aC();
                        } else {
                            Map map2 = map;
                            if (map2 != null && (obj = map2.get(ATAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                                uVar.f14854S = obj.toString();
                            }
                        }
                        com.anythink.core.common.h.d dVar2 = dVar;
                        if (dVar2 != null) {
                            uVar.f14856U = dVar2.a();
                            uVar.f14857V = dVar.b();
                            uVar.f14858W = dVar.c();
                        }
                        if (i6 != null) {
                            uVar.Y = i6.ax();
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
        uVar.f14861c = "1004636";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = String.valueOf(nVar.P());
        if (adError != null) {
            uVar.f14876s = adError.getCode();
            uVar.f14877t = adError.getPlatformCode();
            uVar.f14878u = adError.getPlatformMSG();
        }
        l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
        uVar.f14868k = a9 != null ? a9.an() : "";
        uVar.f14851P = nVar.aK();
        if (map != null) {
            try {
                if (map.containsKey("offer_id")) {
                    uVar.f14879v = map.get("offer_id").toString();
                }
                if (map.containsKey(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE) && nVar.aK().equals("1")) {
                    uVar.f14880w = map.get(ATAdConst.NETWORK_CUSTOM_KEY.RV_ANIM_TYPE).toString();
                }
            } catch (Throwable unused) {
            }
        }
        uVar.f14853R = nVar.aB();
        uVar.f14854S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, ATAdRequest aTAdRequest) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004616";
        uVar.a(aTAdRequest);
        uVar.f14863e = str5;
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = str4;
        uVar.f14877t = str6;
        uVar.f14878u = str7;
        uVar.f14879v = String.valueOf(q.a(t.b().g()) ? 1 : 0);
        uVar.f14880w = String.valueOf(com.anythink.core.d.d.a().aT());
        a(uVar);
    }

    public static void a(String str, String str2, long j6, long j9, long j10, ATAdRequest aTAdRequest) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004635";
        uVar.a(aTAdRequest);
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14863e = str2;
        }
        uVar.f14873p = str;
        uVar.f14874q = String.valueOf(j6);
        uVar.f14875r = String.valueOf(j9);
        uVar.f14876s = String.valueOf(j10);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004637";
        uVar.f14863e = str;
        uVar.f14873p = str2;
        uVar.f14874q = str3;
        uVar.f14875r = str4;
        a(uVar);
    }

    public static void a(String str, String str2, String str3) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004772";
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str) {
        a(wVar, xVar, false, str, 0.0d, 0.0d, 0L, 0L, 0L, 0);
    }

    public static void a(w wVar, x xVar, double d9, double d10, long j6) {
        a(wVar, xVar, true, "", d9, d10, j6, 0L, 0L, 0);
    }

    public static void a(w wVar, x xVar, boolean z6, String str, double d9, double d10, long j6, long j9, long j10, int i4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004764";
        uVar.a(xVar);
        if (wVar != null) {
            uVar.f14873p = String.valueOf(wVar.b());
            if (wVar instanceof r) {
                uVar.f14875r = ((r) wVar).aD();
                uVar.f14876s = wVar.v();
            }
            uVar.f14877t = wVar.E();
        }
        if (xVar != null) {
            uVar.f14874q = String.valueOf(xVar.f14949j);
            y yVar = xVar.f14954o;
            if (yVar != null) {
                uVar.f14882y = String.valueOf(yVar.ac());
            }
        }
        uVar.f14878u = z6 ? "1" : "2";
        if (!TextUtils.isEmpty(str)) {
            uVar.f14879v = str;
        }
        if (d9 > 0.0d) {
            uVar.f14880w = String.valueOf(Math.round(d9 / 1024.0d));
        }
        if (d10 > 0.0d) {
            uVar.f14881x = String.valueOf(Math.round(d10 / 1024.0d));
        }
        if (j6 > 0) {
            uVar.f14883z = String.valueOf(j6);
        }
        if (j9 > 0) {
            uVar.f14837A = String.valueOf(j9);
        }
        if (j10 > 0) {
            uVar.f14838B = String.valueOf(j10);
        }
        if (i4 > 0) {
            uVar.f14839C = String.valueOf(i4);
        }
        a(uVar);
    }

    public static void a(n nVar) {
        try {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14861c = "1004640";
            uVar.a(nVar);
            uVar.f14873p = String.valueOf(nVar.Y());
            uVar.f14874q = nVar.M();
            uVar.f14875r = String.valueOf(nVar.O());
            uVar.f14876s = String.valueOf(nVar.aa());
            uVar.f14877t = String.valueOf(nVar.ab());
            uVar.f14853R = nVar.aB();
            uVar.f14854S = nVar.aC();
            uVar.Y = nVar.ax();
            uVar.f14851P = nVar.aK();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(int i4, int i6, int i9, int i10) {
        u uVar = new u(null, String.valueOf(i10));
        uVar.f14861c = "1004641";
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = String.valueOf(i6);
        uVar.f14875r = String.valueOf(i9);
        uVar.f14876s = String.valueOf(i10);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, int i4, String str4, long j6, long j9, String str5, String str6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004642";
        uVar.f14862d = str;
        uVar.f14860Z = str5;
        uVar.aa = str6;
        uVar.f14873p = str2;
        uVar.f14874q = str3;
        uVar.f14875r = String.valueOf(i4);
        if (i4 == 3 || i4 == 10) {
            uVar.f14876s = str4;
        } else if (i4 == 2) {
            uVar.f14877t = String.valueOf(j6);
            uVar.f14878u = String.valueOf(j9 / 1024.0f);
        }
        a(uVar);
    }

    public static void a(String str, String str2, long j6, String str3, String str4, String str5, String str6, String str7, String str8, int i4, String str9, String str10, int i6, long j9, long j10, String str11, String str12) {
        u uVar = new u(null, str3);
        uVar.f14861c = "1004711";
        uVar.f14862d = str;
        uVar.f14860Z = str11;
        uVar.aa = str12;
        uVar.f14863e = str2;
        uVar.f14867j = String.valueOf(j6);
        uVar.f14873p = str3;
        uVar.f14874q = str4;
        uVar.f14875r = str5;
        uVar.f14876s = str6;
        if (!TextUtils.isEmpty(str7)) {
            uVar.f14877t = String.valueOf(str7.contains("data/data") ? 1 : 2);
        }
        uVar.f14878u = str8;
        uVar.f14879v = String.valueOf(i4);
        uVar.f14880w = str9;
        if (!"1".equals(str9)) {
            uVar.f14881x = str10;
        }
        uVar.f14882y = String.valueOf(i6);
        uVar.f14883z = String.valueOf(j9 / 1024.0f);
        uVar.f14837A = String.valueOf(j10);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4, String str8, String str9) {
        u uVar = new u(null, str3);
        uVar.f14861c = "1004712";
        uVar.f14862d = str;
        uVar.f14860Z = str8;
        uVar.aa = str9;
        uVar.f14863e = str2;
        uVar.f14867j = String.valueOf(System.currentTimeMillis());
        uVar.f14873p = str3;
        uVar.f14874q = str4;
        uVar.f14875r = str5;
        uVar.f14876s = str6;
        uVar.f14877t = str7;
        uVar.f14878u = String.valueOf(i4);
        a(uVar);
    }

    public static void a(int i4, long j6, long j9, String str) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004644";
        uVar.f14864f = str;
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = String.valueOf(j6);
        uVar.f14875r = String.valueOf(j9);
        uVar.f14876s = String.valueOf(j9 - j6);
        a(uVar);
    }

    private static void a(int i4, long j6, long j9, String str, String str2) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004651";
        uVar.f14864f = str;
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = String.valueOf(j9 - j6);
        uVar.f14875r = str2;
        a(uVar);
    }

    public static void a(n nVar, boolean z6, long j6, long j9, long j10) {
        try {
            if (t.b().g() == null) {
                return;
            }
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14861c = "1004643";
            uVar.a(nVar);
            uVar.f14873p = nVar.aK();
            uVar.f14874q = String.valueOf(j6);
            uVar.f14875r = String.valueOf(j9);
            uVar.f14876s = String.valueOf(j10);
            uVar.f14877t = String.valueOf(nVar.Y());
            uVar.f14878u = nVar.M();
            uVar.f14879v = String.valueOf(nVar.P());
            uVar.f14880w = String.valueOf(nVar.f14794C);
            uVar.f14881x = z6 ? "1" : "0";
            l a9 = com.anythink.core.d.n.a(t.b().g()).a(nVar.aI());
            uVar.f14868k = a9 != null ? a9.an() : "";
            uVar.f14851P = nVar.aK();
            uVar.f14853R = nVar.aB();
            uVar.f14854S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, n nVar, l lVar, String str4, String str5) {
        try {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14861c = str;
            uVar.a(nVar);
            uVar.f14862d = nVar.aJ();
            uVar.f14863e = str2;
            uVar.f14868k = lVar != null ? lVar.an() : "";
            uVar.f14873p = String.valueOf(nVar.Y());
            uVar.f14874q = nVar.M();
            uVar.f14875r = nVar.z();
            uVar.f14876s = nVar.o();
            uVar.f14877t = nVar.f14797F;
            uVar.f14878u = str4;
            uVar.f14879v = str5;
            uVar.f14880w = str3;
            uVar.f14853R = nVar.aB();
            uVar.f14854S = nVar.aC();
            uVar.Y = nVar.ax();
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(x xVar, w wVar, int i4) {
        try {
            u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
            uVar.f14861c = "1004679";
            uVar.a(xVar);
            if (wVar instanceof r) {
                uVar.f14873p = ((r) wVar).aD();
            }
            uVar.f14874q = xVar.f14943c;
            uVar.f14875r = wVar.v();
            uVar.f14876s = String.valueOf(wVar.b());
            uVar.f14877t = wVar.k();
            uVar.f14878u = wVar.l();
            uVar.f14879v = String.valueOf(i4);
            a(uVar);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, l lVar, String str3) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004646";
        uVar.f14862d = str;
        uVar.f14863e = str2;
        uVar.f14866h = String.valueOf(lVar.ay());
        uVar.f14872o = String.valueOf(lVar.ai());
        uVar.f14868k = lVar.an();
        uVar.f14880w = String.valueOf(str3);
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2, String str3, String str4) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14861c = "1004648";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        uVar.f14874q = String.valueOf(wVar.b());
        uVar.f14875r = str;
        uVar.f14876s = str2;
        uVar.f14877t = str3;
        uVar.f14878u = str4;
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2, int i4) {
        a(xVar, wVar, str, str2, i4, 0, "");
    }

    public static void a(x xVar, w wVar, String str, String str2, int i4, int i6, String str3) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004650";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        uVar.f14874q = String.valueOf(wVar.b());
        uVar.f14875r = str;
        uVar.f14876s = str2;
        uVar.f14877t = String.valueOf(i4);
        if (wVar instanceof r) {
            uVar.f14879v = String.valueOf(((r) wVar).aD());
        }
        uVar.f14880w = String.valueOf(xVar.f14949j);
        if (i6 > 0) {
            uVar.f14881x = String.valueOf(i6);
        }
        uVar.f14882y = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str, String str2) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004652";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(xVar.f14946f);
        uVar.f14874q = xVar.f14943c;
        if (wVar instanceof ay) {
            uVar.f14875r = "1";
        } else if (wVar instanceof r) {
            uVar.f14875r = "2";
        } else if (wVar instanceof bi) {
            uVar.f14875r = "3";
        }
        uVar.f14876s = str;
        uVar.f14877t = str2;
        uVar.f14878u = wVar.v();
        uVar.f14879v = wVar.w();
        uVar.f14880w = wVar.I();
        uVar.f14881x = wVar.x();
        uVar.f14882y = wVar.y();
        uVar.f14883z = wVar.z();
        uVar.f14837A = wVar.B();
        uVar.f14838B = wVar.E();
        try {
            if (wVar instanceof bj) {
                StringBuilder sb = new StringBuilder();
                String aK = ((bj) wVar).aK();
                if (!TextUtils.isEmpty(aK)) {
                    JSONArray jSONArray = new JSONArray(aK);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        sb.append(jSONArray.optString(i4));
                        sb.append(",");
                    }
                    if (sb.length() > 1) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    uVar.f14839C = sb.toString();
                }
            }
        } catch (Throwable unused) {
        }
        a(uVar);
    }

    public static void a() {
        u uVar = new u(null, null);
        uVar.f14861c = "1004657";
        a(uVar);
    }

    public static void a(aw awVar, double d9, String str, double d10, double d11, double d12, double d13, String str2, String str3, boolean z6) {
        a(awVar, d9, str, d10, d11, d12, d13, str2, str3, z6, 0.0d);
    }

    public static void a(aw awVar, double d9, String str, double d10, double d11, double d12, double d13, String str2, String str3, boolean z6, double d14) {
        u uVar = new u(String.valueOf(awVar.n()), String.valueOf(awVar.k()));
        uVar.f14861c = "1004659";
        uVar.a(awVar.z());
        uVar.f14868k = awVar.m();
        uVar.f14873p = String.valueOf(awVar.k());
        uVar.f14874q = awVar.l();
        uVar.f14875r = String.valueOf(d9);
        uVar.f14876s = str;
        uVar.f14853R = awVar.o();
        uVar.f14854S = awVar.p();
        uVar.f14877t = String.valueOf(d10);
        uVar.f14878u = String.valueOf(d11);
        uVar.f14879v = awVar.s();
        uVar.f14880w = String.valueOf(awVar.t());
        uVar.f14881x = String.valueOf(awVar.h());
        uVar.f14882y = String.valueOf(d12);
        if (awVar.d() != null) {
            uVar.f14883z = awVar.d();
        }
        Double v9 = awVar.v();
        if (v9 != null) {
            uVar.f14837A = String.valueOf(v9);
        }
        if (awVar.k() == 66 && d13 > 0.0d) {
            uVar.f14838B = String.valueOf(d11 / d13);
        }
        uVar.f14839C = awVar.B();
        uVar.f14840D = z6 ? "1" : null;
        uVar.f14841E = str2;
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14842F = str3;
        }
        ATAdMixBidInfo.BidEntity a9 = awVar.a();
        if (a9 != null) {
            if (!TextUtils.isEmpty(a9.getAdUserName())) {
                uVar.f14843G = a9.getAdUserName();
            }
            if (!TextUtils.isEmpty(a9.getAdTittle())) {
                uVar.f14844H = a9.getAdTittle();
            }
            if (!TextUtils.isEmpty(a9.getAdPackageName())) {
                uVar.f14847L = a9.getAdPackageName();
            }
        }
        uVar.f14845I = String.valueOf(awVar.E());
        MgComparedResult F8 = awVar.F();
        if (F8 != null && c.b.a(awVar.w())) {
            uVar.J = F8.isMgWin() ? "1" : "2";
            uVar.f14846K = String.valueOf(F8.getCpCostTime());
        }
        uVar.f14848M = String.valueOf(awVar.G());
        uVar.f14849N = String.valueOf(awVar.H());
        if (awVar.k() == 8 && d14 > 0.0d) {
            uVar.f14850O = String.valueOf(com.anythink.core.b.d.a.a(8, String.valueOf(d14)));
        }
        uVar.Y = awVar.q();
        a(uVar);
    }

    public static void a(bv bvVar, com.anythink.core.common.h.a aVar, long j6, boolean z6, boolean z9) {
        Object obj;
        String str;
        u uVar = new u(String.valueOf(aVar.f14117f), String.valueOf(bvVar.g()));
        uVar.f14861c = "1004660";
        uVar.a(bvVar);
        cb cbVar = aVar.f14124n;
        l a9 = cbVar != null ? cbVar.a() : null;
        uVar.f14862d = aVar.f14115d;
        uVar.f14863e = aVar.f14116e;
        String str2 = "";
        uVar.f14866h = String.valueOf(a9 != null ? Integer.valueOf(a9.ay()) : "");
        if (a9 == null) {
            obj = "";
        } else {
            obj = Integer.valueOf(a9.ai());
        }
        uVar.f14872o = String.valueOf(obj);
        if (a9 == null) {
            str = "";
        } else {
            str = a9.an();
        }
        uVar.f14868k = str;
        uVar.f14873p = String.valueOf(bvVar.g());
        uVar.f14874q = bvVar.z();
        uVar.f14875r = z6 ? "1" : "2";
        uVar.f14876s = String.valueOf(j6);
        uVar.f14877t = z9 ? "1" : "2";
        if (a9 != null) {
            try {
                str2 = a9.A();
            } catch (Throwable unused) {
            }
        }
        uVar.f14853R = str2;
        Map<String, Object> map = aVar.f14114c.f14337g;
        if (map != null) {
            try {
                Object obj2 = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj2 != null) {
                    uVar.f14854S = obj2.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject a10 = ai.a(aVar.f14114c.f14337g);
                if (a10 != null) {
                    uVar.Y = a10;
                }
            } catch (Throwable unused3) {
            }
        }
        a(uVar);
    }

    public static void a(String str, bv bvVar, boolean z6, long j6, com.anythink.core.common.h.a aVar) {
        l a9 = aVar != null ? aVar.f14124n.a() : null;
        u uVar = new u(String.valueOf(aVar.f14117f), String.valueOf(bvVar.g()));
        uVar.f14861c = "1004665";
        uVar.a(bvVar);
        uVar.f14863e = str;
        String str2 = "";
        uVar.f14868k = a9 != null ? a9.an() : "";
        uVar.f14873p = String.valueOf(bvVar.g());
        uVar.f14874q = bvVar.z();
        uVar.f14875r = String.valueOf(z6 ? 1 : 2);
        uVar.f14876s = String.valueOf(j6);
        if (a9 != null) {
            try {
                str2 = a9.A();
            } catch (Throwable unused) {
            }
        }
        uVar.f14853R = str2;
        Map<String, Object> map = aVar.f14114c.f14337g;
        if (map != null) {
            try {
                Object obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
                if (obj != null) {
                    uVar.f14854S = obj.toString();
                }
            } catch (Throwable unused2) {
            }
            try {
                JSONObject a10 = ai.a(aVar.f14114c.f14337g);
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
        uVar.f14861c = "1004667";
        uVar.a(cdVar.y());
        uVar.f14873p = String.valueOf(cdVar.k());
        uVar.f14874q = cdVar.l();
        uVar.f14875r = cdVar.g();
        uVar.f14876s = cdVar.h();
        uVar.f14877t = cdVar.f();
        uVar.f14878u = cdVar.e();
        uVar.f14879v = cdVar.j();
        uVar.f14880w = cdVar.i();
        uVar.f14881x = String.valueOf(cdVar.o());
        uVar.f14882y = String.valueOf(cdVar.p());
        uVar.f14883z = String.valueOf(cdVar.r());
        uVar.f14837A = String.valueOf(cdVar.t());
        uVar.f14838B = String.valueOf(cdVar.u());
        if (cdVar.b() != null) {
            uVar.f14839C = cdVar.b();
        }
        Double c9 = cdVar.c();
        if (c9 != null) {
            uVar.f14840D = String.valueOf(c9);
        }
        uVar.Y = cdVar.n();
        if (cdVar.k() == 66 && cdVar.w().doubleValue() > 0.0d) {
            uVar.f14841E = String.valueOf(cdVar.t() / cdVar.w().doubleValue());
        }
        uVar.f14842F = cdVar.B();
        if (cdVar.y() != null) {
            String au = cdVar.y().au();
            if (!TextUtils.isEmpty(au)) {
                uVar.f14843G = au;
            }
        }
        MgComparedResult C8 = cdVar.C();
        if (C8 != null && c.b.a(cdVar.x())) {
            MgAdInfo mgAdInfo = C8.getMgAdInfo();
            uVar.f14844H = mgAdInfo != null ? String.valueOf(mgAdInfo.getUSDEcpm()) : "0";
            uVar.f14845I = String.valueOf(C8.getCpCostTime());
        }
        uVar.J = String.valueOf(cdVar.q());
        a(uVar);
    }

    public static void a(n nVar, int i4, String str, double d9, double d10, String str2, String str3, String str4, String str5) {
        u uVar = new u(nVar.aK(), String.valueOf(i4));
        uVar.f14861c = "1004668";
        uVar.a(nVar);
        uVar.f14863e = nVar.aI();
        uVar.f14860Z = str4;
        uVar.aa = str5;
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = str;
        uVar.f14875r = String.valueOf(d9);
        uVar.f14876s = str2;
        uVar.f14877t = str3;
        uVar.f14878u = String.valueOf(d10);
        uVar.f14868k = nVar.aH();
        uVar.f14866h = String.valueOf(nVar.Z());
        uVar.f14872o = String.valueOf(nVar.aG());
        uVar.f14853R = nVar.aB();
        uVar.f14854S = nVar.aC();
        uVar.Y = nVar.ax();
        a(uVar);
    }

    public static void a(n nVar, String str, String str2) {
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14861c = "1004669";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = str;
        uVar.f14875r = str2;
        a(uVar);
    }

    public static void a(x xVar, int i4, String str, Map<String, JSONArray> map, int i6, int i9, int i10, String str2, int i11, int i12, long j6, String str3, int i13, boolean z6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004675";
        uVar.a(xVar);
        uVar.f14873p = str;
        uVar.f14874q = String.valueOf(i4);
        uVar.f14876s = String.valueOf(i6);
        uVar.f14877t = String.valueOf(i9);
        uVar.f14878u = String.valueOf(i10);
        uVar.f14879v = str2;
        uVar.f14880w = String.valueOf(i11);
        if (i12 >= 0) {
            uVar.f14881x = String.valueOf(i12);
        }
        if (j6 > 0) {
            uVar.f14882y = String.valueOf(j6);
        }
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14883z = str3;
        }
        if (i13 > 0) {
            uVar.f14837A = String.valueOf(i13);
        }
        if (map != null && map.size() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, JSONArray> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                uVar.f14838B = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        if (z6) {
            uVar.f14839C = "1";
        }
        a(uVar);
    }

    private static void a(final String str, final String str2, final String str3, final String str4, final String str5, final int i4, final boolean z6, final String str6, final String str7) {
        a(new Runnable() { // from class: com.anythink.core.common.u.e.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean z9;
                u uVar = new u(str4, str5);
                uVar.f14861c = "1004680";
                uVar.f14862d = str;
                uVar.f14863e = str2;
                uVar.f14873p = str3;
                uVar.f14874q = String.valueOf(i4);
                uVar.f14875r = z6 ? "1" : "0";
                try {
                    z9 = ((PowerManager) t.b().g().getSystemService("power")).isScreenOn();
                } catch (Throwable unused) {
                    z9 = true;
                }
                uVar.f14876s = z9 ? "1" : "0";
                uVar.f14877t = q.a(t.b().g()) ? "1" : "0";
                uVar.f14878u = str7;
                uVar.f14879v = str6;
                e.a(uVar);
            }
        });
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        a(str, str2, str3, str4, str5, str6, str7, "", "", "", "", 0);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4) {
        u uVar = new u("", "");
        if (TextUtils.isEmpty(uVar.f14861c)) {
            uVar.f14861c = "1004685";
        }
        if (!TextUtils.isEmpty(str)) {
            uVar.f14873p = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            uVar.f14874q = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14875r = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            uVar.f14876s = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            uVar.f14877t = str5;
        }
        if (!TextUtils.isEmpty(str6)) {
            uVar.f14878u = str6;
        }
        if (!TextUtils.isEmpty(str7)) {
            uVar.f14879v = str7;
        }
        if (!TextUtils.isEmpty(str8)) {
            uVar.f14880w = str8;
        }
        if (!TextUtils.isEmpty(str9)) {
            uVar.f14881x = str9;
        }
        if (!TextUtils.isEmpty(str10)) {
            uVar.f14882y = str10;
        }
        if (!TextUtils.isEmpty(str11)) {
            uVar.f14883z = str11;
        }
        if (i4 > 0) {
            uVar.f14838B = String.valueOf(i4);
        }
        uVar.f14837A = "0";
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
        uVar.f14861c = "1004690";
        uVar.a(aTAdRequest);
        uVar.a(lVar);
        uVar.f14862d = str2;
        uVar.f14863e = str;
        if (lVar != null) {
            uVar.f14872o = String.valueOf(lVar.ai());
            uVar.f14866h = String.valueOf(lVar.ay());
            uVar.f14868k = lVar.an();
        }
        if (cVar != null) {
            uVar.a(cVar.i());
        }
        uVar.f14873p = str3;
        if (cVar != null) {
            uVar.f14874q = cVar.l();
            uVar.f14875r = uVar.f14852Q;
            uVar.f14876s = cVar.i() != null ? cVar.i().M() : "";
        }
        uVar.f14877t = "1";
        uVar.f14878u = String.valueOf(j6);
        a(uVar);
    }

    public static void a(final String str, final x xVar, final String str2, final String str3, final String str4, final int i4, final int i6, final String str5, final String str6, final boolean z6, final long j6) {
        if (t.b().g() == null) {
            return;
        }
        a(new Runnable() { // from class: com.anythink.core.common.u.e.3
            @Override // java.lang.Runnable
            public final void run() {
                boolean z9;
                u uVar = new u(str3, str4);
                uVar.f14861c = "1004687";
                com.anythink.core.d.b k9 = k.k(k.l());
                if (k9 == null || !e.c(k9, uVar)) {
                    uVar.a(xVar);
                    uVar.f14873p = str2;
                    uVar.f14874q = String.valueOf(i4);
                    uVar.f14875r = String.valueOf(i6);
                    boolean z10 = true;
                    try {
                        z9 = ((PowerManager) t.b().g().getSystemService("power")).isScreenOn();
                    } catch (Throwable unused) {
                        z9 = true;
                    }
                    boolean z11 = false;
                    try {
                        KeyguardManager keyguardManager = (KeyguardManager) t.b().g().getSystemService("keyguard");
                        if (keyguardManager != null) {
                            z11 = keyguardManager.inKeyguardRestrictedInputMode();
                        }
                    } catch (Throwable unused2) {
                    }
                    uVar.f14876s = (z11 || !z9) ? (z11 || z9) ? (z11 && z9) ? "2" : "3" : "1" : "0";
                    try {
                        z10 = q.a(t.b().g());
                    } catch (Throwable unused3) {
                    }
                    uVar.f14877t = z10 ? "1" : "0";
                    uVar.f14878u = str6;
                    uVar.f14879v = str5;
                    uVar.f14880w = z6 ? "1" : "2";
                    if (TextUtils.isEmpty(e.f17288y)) {
                        try {
                            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                            long blockSize = statFs.getBlockSize();
                            String unused4 = e.f17288y = ((statFs.getAvailableBlocks() * blockSize) / 1048576) + "MB";
                            uVar.f14881x = e.f17288y;
                        } catch (Throwable unused5) {
                        }
                    } else {
                        uVar.f14881x = e.f17288y;
                    }
                    uVar.f14882y = str;
                    uVar.f14883z = String.valueOf(j6);
                    e.a(uVar);
                }
            }
        });
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004688";
        if (!TextUtils.isEmpty(str)) {
            uVar.f14863e = str;
        }
        uVar.f14873p = str2;
        uVar.f14874q = str3;
        uVar.f14875r = str4;
        uVar.f14876s = str5;
        a(uVar);
    }

    public static void a(final String str, final n nVar, final String str2, final String str3, final String str4, final int i4, final int i6, final long j6) {
        if (t.b().g() == null) {
            return;
        }
        a(new Runnable() { // from class: com.anythink.core.common.u.e.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    u uVar = new u(String.valueOf(i6), "");
                    uVar.f14861c = "1004691";
                    uVar.a(nVar);
                    com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                    if (b9 != null && !b9.S() && b9.i() && !e.c(b9, uVar)) {
                        uVar.f14862d = str2;
                        uVar.f14863e = str3;
                        uVar.a(nVar);
                        uVar.f14873p = str;
                        uVar.f14874q = str4;
                        long j9 = j6;
                        if (j9 >= 0) {
                            uVar.f14875r = String.valueOf(j9);
                        }
                        int i9 = i4;
                        if (i9 > 0) {
                            uVar.f14876s = String.valueOf(i9);
                        }
                        com.anythink.core.common.o.d b10 = com.anythink.core.common.o.e.a().b();
                        if (b10 != null) {
                            uVar.f14877t = String.valueOf(b10.a());
                            uVar.f14878u = String.valueOf(b10.e());
                            uVar.f14879v = String.valueOf(b10.f());
                            uVar.f14880w = String.valueOf(b10.b());
                            uVar.f14881x = String.valueOf(b10.g());
                            uVar.f14882y = String.valueOf(b10.h());
                            uVar.f14883z = String.valueOf(b10.c());
                            uVar.f14837A = String.valueOf(b10.d());
                        }
                        uVar.f14838B = String.valueOf(com.anythink.core.common.o.e.a().e());
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
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004697";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        uVar.f14874q = wVar.w();
        uVar.f14875r = ((bj) wVar).aD();
        a(uVar);
    }

    public static void a(String str, String str2, n nVar, String str3, String str4, l lVar, boolean z6, String str5, String str6, String str7) {
        u uVar = new u(str3, "");
        uVar.f14861c = "1004693";
        uVar.a(nVar);
        uVar.f14862d = str4;
        uVar.f14863e = str;
        if (lVar != null) {
            uVar.f14866h = String.valueOf(lVar.ay());
            uVar.f14872o = String.valueOf(lVar.ai());
            uVar.f14868k = lVar.an();
        }
        uVar.f14873p = z6 ? "1" : "2";
        uVar.f14874q = str5;
        uVar.f14875r = str6;
        if (lVar != null) {
            uVar.f14876s = lVar.y() == 1 ? "1" : "2";
        }
        uVar.f14877t = str2;
        uVar.f14878u = str7;
        a(uVar);
    }

    public static void a(String str, String str2, l lVar, n nVar, boolean z6, boolean z9, boolean z10, String str3, String str4, String str5) {
        u uVar = new u(null, "");
        uVar.f14861c = "1004694";
        uVar.a(nVar);
        uVar.a(lVar);
        uVar.f14862d = str3;
        uVar.f14863e = str;
        if (lVar != null) {
            uVar.f14866h = String.valueOf(lVar.ay());
            uVar.f14872o = String.valueOf(lVar.ai());
            uVar.f14868k = lVar.an();
        }
        uVar.f14869l = str5;
        uVar.f14873p = z6 ? "1" : "0";
        uVar.f14874q = z10 ? "1" : "0";
        uVar.f14875r = z9 ? "1" : "0";
        uVar.f14876s = str2;
        uVar.f14877t = str4;
        a(uVar);
    }

    public static void a(n nVar, l lVar, String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, str);
        uVar.f14861c = "1004695";
        uVar.a(nVar);
        if (lVar != null) {
            uVar.f14868k = lVar.an();
        }
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = str4;
        uVar.f14877t = str5;
        a(uVar);
    }

    public static void a(n nVar, l lVar, String str, String str2, String str3, int i4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004696";
        uVar.a(nVar);
        if (lVar != null) {
            uVar.f14868k = lVar.an();
        }
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = String.valueOf(i4);
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i4, boolean z6) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14861c = "1004698";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        uVar.f14874q = wVar.w();
        uVar.f14875r = wVar instanceof r ? ((r) wVar).aD() : "";
        uVar.f14876s = String.valueOf(xVar.f14949j);
        uVar.f14877t = String.valueOf(xVar.f14941a);
        uVar.f14878u = String.valueOf(i4);
        uVar.f14879v = String.valueOf(xVar.f14951l);
        if (i4 != 5) {
            uVar.f14880w = z6 ? "1" : "2";
        }
        a(uVar);
    }

    public static void a(x xVar, w wVar, boolean z6, int i4, int i6, long j6, long j9) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(null, null);
        uVar.f14861c = "1004699";
        uVar.a(xVar);
        uVar.f14873p = z6 ? "2" : "1";
        uVar.f14874q = String.valueOf(i4);
        uVar.f14875r = String.valueOf(j6);
        uVar.f14876s = String.valueOf(j9);
        uVar.f14877t = String.valueOf(xVar.f14949j);
        uVar.f14878u = String.valueOf(i6);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14879v = String.valueOf(rVar.aD());
            uVar.f14880w = String.valueOf(rVar.v());
        }
        a(uVar);
    }

    public static void a(x xVar, int i4, String str, JSONArray jSONArray, String str2, int i6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004700";
        uVar.a(xVar);
        uVar.f14873p = str;
        uVar.f14874q = String.valueOf(i4);
        uVar.f14875r = jSONArray != null ? jSONArray.toString() : "";
        uVar.f14876s = str2;
        uVar.f14877t = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, n nVar, String str2, Object obj, String str3) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004701";
        uVar.a(nVar);
        uVar.f14863e = str;
        uVar.f14866h = String.valueOf(nVar.Z());
        uVar.f14872o = String.valueOf(nVar.aG());
        uVar.f14873p = nVar.aK();
        uVar.f14874q = String.valueOf(nVar.Y());
        uVar.f14875r = nVar.M();
        uVar.f14876s = String.valueOf(nVar.ac());
        uVar.f14877t = str2;
        uVar.f14878u = obj != null ? obj.toString() : "";
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14879v = str3;
        }
        a(uVar);
    }

    public static void a(n nVar, com.anythink.core.d.f fVar, String str, double d9, String str2, double d10, String str3) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004702";
        uVar.a(nVar);
        uVar.f14873p = nVar.aK();
        uVar.f14874q = fVar.a() == 1 ? "1" : "2";
        uVar.f14875r = String.valueOf(fVar.b());
        uVar.f14876s = String.valueOf(fVar.c());
        uVar.f14877t = String.valueOf(fVar.d());
        uVar.f14878u = String.valueOf(fVar.f());
        uVar.f14879v = String.valueOf(fVar.e());
        uVar.f14880w = str;
        uVar.f14881x = String.valueOf(d9);
        uVar.f14882y = str2;
        uVar.f14883z = String.valueOf(d10);
        if (!TextUtils.isEmpty(str3)) {
            uVar.f14837A = str3;
        }
        a(uVar);
    }

    public static void a(r rVar, x xVar, String str, bh bhVar, boolean z6, int i4) {
        u uVar = new u(String.valueOf(xVar.f14949j), "66");
        uVar.f14861c = "1004704";
        uVar.a(xVar);
        uVar.f14873p = rVar != null ? rVar.v() : "";
        uVar.f14874q = "2";
        uVar.f14875r = String.valueOf(xVar.f14949j);
        if (!TextUtils.isEmpty(str)) {
            uVar.f14876s = str;
        }
        uVar.f14877t = String.valueOf(bhVar.f14417b - bhVar.f14416a);
        uVar.f14878u = String.valueOf(bhVar.f14418c - bhVar.f14416a);
        if (rVar != null) {
            uVar.f14879v = rVar.g() == 1 ? "1" : "0";
        } else {
            uVar.f14879v = "0";
        }
        uVar.f14880w = String.valueOf(bhVar.a());
        uVar.f14881x = xVar.f14956q ? "1" : "0";
        uVar.f14882y = String.valueOf(bhVar.f14417b - bhVar.f14418c);
        uVar.f14883z = z6 ? "1" : "0";
        if (bhVar.f14421f > 0 && bhVar.f14422g > 0) {
            uVar.f14837A = String.valueOf(bhVar.b());
        }
        uVar.f14838B = String.valueOf(i4);
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, String str3, String str4, String str5) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004705";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = str4;
        uVar.f14876s = str5;
        uVar.f14877t = str;
        uVar.f14878u = str2;
        uVar.f14879v = str3;
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i4, String str) {
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004706";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(xVar.f14946f);
        uVar.f14874q = xVar.f14943c;
        uVar.f14875r = String.valueOf(xVar.f14949j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14876s = rVar.aD();
            uVar.f14877t = rVar.v();
        }
        uVar.f14878u = String.valueOf(i4);
        uVar.f14879v = str;
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i4, long j6, long j9, long j10, long j11) {
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004707";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(xVar.f14946f);
        uVar.f14874q = xVar.f14943c;
        uVar.f14875r = String.valueOf(xVar.f14949j);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14876s = rVar.aD();
            uVar.f14877t = rVar.v();
        }
        uVar.f14878u = String.valueOf(i4);
        uVar.f14879v = String.valueOf(j6);
        uVar.f14880w = String.format("%.2f", Double.valueOf((j9 / 1024.0d) / 1024.0d));
        uVar.f14881x = String.valueOf(j10);
        uVar.f14882y = String.format("%.2f", Double.valueOf((j11 / 1024.0d) / 1024.0d));
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, int i4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004709";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = nVar.aK();
        uVar.f14876s = str;
        uVar.f14877t = str2;
        uVar.f14878u = String.valueOf(i4);
        uVar.f14879v = "1";
        a(uVar);
    }

    public static void a(n nVar, String str, String str2, boolean z6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004710";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = str;
        uVar.f14876s = str2;
        uVar.f14877t = z6 ? "1" : "2";
        a(uVar);
    }

    public static void a(String str, x xVar, String str2, String str3, String str4, String str5, String str6, String str7, long j6, int i4, int i6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004713";
        uVar.f14862d = str;
        uVar.f14863e = str2;
        uVar.a(xVar);
        uVar.f14873p = str3;
        uVar.f14874q = str4;
        uVar.f14875r = str5;
        uVar.f14876s = str6;
        uVar.f14877t = str7;
        uVar.f14878u = String.valueOf(j6);
        uVar.f14879v = String.valueOf(i4);
        uVar.f14880w = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, String str2, bv bvVar, Double d9, Double d10, com.anythink.core.b.c.a aVar) {
        String str3;
        u uVar = new u(null, null);
        uVar.f14861c = "1004716";
        uVar.a(bvVar);
        uVar.f14862d = str;
        uVar.f14863e = str2;
        uVar.f14873p = String.valueOf(bvVar.g());
        uVar.f14874q = bvVar.z();
        String str4 = "";
        uVar.f14875r = d9 != null ? String.valueOf(d9) : "";
        if (d10 == null) {
            str3 = "";
        } else {
            str3 = String.valueOf(d10);
        }
        uVar.f14876s = str3;
        if (aVar != null) {
            str4 = aVar.a();
        }
        uVar.f14877t = str4;
        a(uVar);
    }

    public static void a(x xVar, String str, String str2, String str3, String str4, long j6, String str5, String str6, String str7, String str8, String str9, String str10) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004715";
        uVar.a(xVar);
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = str4;
        uVar.f14877t = String.valueOf(j6);
        uVar.f14878u = str5;
        uVar.f14879v = str6;
        uVar.f14880w = str7;
        uVar.f14881x = str8;
        uVar.f14882y = str9;
        uVar.f14883z = str10;
        a(uVar);
    }

    private static void a(String str, int i4, int i6, int i9) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004717";
        uVar.f14873p = str;
        uVar.f14874q = String.valueOf(i4);
        uVar.f14875r = String.valueOf(i6);
        uVar.f14876s = String.valueOf(i9);
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i4) {
        a(wVar, xVar, i4, false, 0, "", 0, wVar.r() != null ? wVar.r().aQ() : 1);
    }

    public static void a(n nVar, String str, String str2, String str3) {
        u uVar = new u(null, str);
        uVar.f14861c = "1004718";
        uVar.a(nVar);
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i4, boolean z6, int i6, String str, int i9, int i10) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004719";
        uVar.a(xVar);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14873p = rVar.aD();
            uVar.f14874q = rVar.v();
        }
        uVar.f14875r = z6 ? "2" : "1";
        if (i6 > 0) {
            uVar.f14876s = String.valueOf(i6);
            if (!TextUtils.isEmpty(str)) {
                uVar.f14877t = str;
            }
            if (i9 > 0) {
                uVar.f14878u = String.valueOf(i9);
            }
        } else {
            uVar.f14876s = "1";
        }
        uVar.f14879v = String.valueOf(xVar.f14949j);
        if (wVar != null && wVar.r() != null) {
            uVar.f14880w = wVar.r().Q();
        }
        uVar.f14881x = String.valueOf(i4);
        uVar.f14882y = String.valueOf(i10);
        a(uVar);
    }

    public static void a(x xVar, int i4, w wVar, long j6, long j9) {
        u uVar = new u(String.valueOf(i4), null);
        uVar.f14861c = "1004721";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(j6);
        uVar.f14874q = String.valueOf(j9);
        if (wVar != null) {
            if (!TextUtils.isEmpty(wVar.R())) {
                uVar.f14875r = wVar.R();
            }
            uVar.f14876s = wVar.G();
            uVar.f14877t = wVar.v();
            if (wVar instanceof r) {
                uVar.f14878u = ((r) wVar).aD();
            }
        }
        uVar.f14879v = String.valueOf(i4);
        a(uVar);
    }

    public static void a(String str, l lVar, int i4, int i6, int i9, ATAdRequest aTAdRequest) {
        u uVar = new u("4", null);
        uVar.f14861c = "1004722";
        uVar.f14863e = str;
        uVar.a(aTAdRequest);
        uVar.a(lVar);
        if (lVar != null) {
            uVar.f14868k = lVar.an();
            uVar.f14866h = String.valueOf(lVar.ay());
            uVar.f14872o = String.valueOf(lVar.ai());
        }
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = String.valueOf(i9);
        uVar.f14875r = String.valueOf(i6);
        a(uVar);
    }

    public static void a(String str, String str2, String str3, double d9, String str4, String str5, String str6) {
        u uVar = new u(str3, null);
        uVar.f14861c = "1004724";
        uVar.f14863e = str;
        uVar.f14862d = str2;
        uVar.f14873p = String.valueOf(System.currentTimeMillis());
        uVar.f14874q = str3;
        uVar.f14875r = String.valueOf(d9);
        uVar.f14876s = str4;
        uVar.f14877t = str5;
        uVar.f14878u = str6;
        a(uVar);
    }

    public static void a(String str, String str2, String str3, int i4, long j6, long j9, long j10, long j11, long j12) {
        u uVar = new u(null, "2");
        uVar.f14861c = "1004725";
        uVar.f14873p = str;
        uVar.f14874q = str3;
        uVar.f14875r = str2;
        uVar.f14876s = String.valueOf(i4);
        uVar.f14877t = String.valueOf(j10);
        uVar.f14878u = String.valueOf(j11);
        uVar.f14879v = String.valueOf(j6);
        uVar.f14880w = String.valueOf(j9);
        uVar.f14881x = String.valueOf(j12);
        a(uVar);
    }

    public static void a(x xVar, String str, String str2, String str3, String str4, int i4) {
        u uVar = new u(null, "66");
        uVar.f14861c = "1004735";
        uVar.a(xVar);
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = str4;
        uVar.f14877t = String.valueOf(i4);
        a(uVar);
    }

    public static void a(String str, String str2) {
        boolean isEmpty = str.isEmpty();
        u uVar = new u(null, null);
        uVar.f14861c = "1004729";
        uVar.f14873p = Build.MANUFACTURER;
        uVar.f14874q = !isEmpty ? "1" : "2";
        if (!isEmpty) {
            uVar.f14875r = str;
        } else {
            uVar.f14876s = str2;
        }
        a(uVar);
    }

    public static void a(final com.anythink.core.common.k.e eVar, final boolean z6, final n nVar, final long j6, final boolean z9, final String str, final ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.u.e.5

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f17327b = 1;

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
                uVar.f14861c = "1004730";
                uVar.a(n.this);
                uVar.f14873p = n.this.M();
                uVar.f14874q = String.valueOf(n.this.ad());
                uVar.f14875r = String.valueOf(n.this.Y());
                uVar.f14876s = String.valueOf(this.f17327b);
                uVar.f14877t = String.valueOf(j6);
                uVar.f14878u = z9 ? "1" : "2";
                uVar.f14879v = str;
                ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                if (aTBaseAdAdapter2 != null && (networkInfoMap = aTBaseAdAdapter2.getNetworkInfoMap()) != null) {
                    try {
                        str2 = new JSONObject(networkInfoMap).toString();
                    } catch (Throwable unused) {
                    }
                    uVar.f14880w = str2;
                    uVar.f14881x = z6 ? "1" : "2";
                    eVar2 = eVar;
                    if (eVar2 instanceof com.anythink.core.common.q.e) {
                        com.anythink.core.common.q.e eVar3 = (com.anythink.core.common.q.e) eVar2;
                        uVar.f14882y = String.valueOf(eVar3.a());
                        String b9 = eVar3.b();
                        if (!TextUtils.isEmpty(b9)) {
                            uVar.f14883z = b9;
                        }
                    }
                    e.a(uVar);
                }
                str2 = "";
                uVar.f14880w = str2;
                uVar.f14881x = z6 ? "1" : "2";
                eVar2 = eVar;
                if (eVar2 instanceof com.anythink.core.common.q.e) {
                }
                e.a(uVar);
            }
        }, 13);
    }

    public static void a(String str, String str2, x xVar, String str3, String str4, int i4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z6, boolean z9, String str18, String str19, String str20) {
        u uVar = new u(null, "66");
        uVar.f14861c = "1004731";
        uVar.f14862d = str;
        uVar.f14863e = str2;
        uVar.a(xVar);
        uVar.f14873p = str3;
        uVar.f14874q = str4;
        uVar.f14875r = str6;
        uVar.f14876s = str7;
        uVar.f14877t = str8;
        uVar.f14878u = str9;
        uVar.f14879v = str10;
        uVar.f14880w = str11;
        uVar.f14881x = str12;
        uVar.f14882y = str5;
        uVar.f14883z = String.valueOf(i4);
        uVar.f14837A = str13;
        uVar.f14838B = str14;
        uVar.f14839C = str15;
        uVar.f14840D = str16;
        uVar.f14841E = str17;
        uVar.f14842F = z6 ? "2" : "1";
        uVar.f14843G = z9 ? "1" : "2";
        uVar.f14844H = str18;
        uVar.f14845I = str19;
        uVar.J = str20;
        a(uVar);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, long j6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004738";
        uVar.f14873p = str;
        uVar.f14874q = str2;
        uVar.f14875r = str3;
        uVar.f14876s = str4;
        uVar.f14877t = str5;
        uVar.f14878u = str6;
        uVar.f14879v = String.valueOf(SystemClock.elapsedRealtime() - j6);
        a(uVar);
    }

    public static void a(x xVar, w wVar, long j6, boolean z6, long j9, int i4) {
        u uVar = new u(String.valueOf(xVar.f14949j), "66");
        uVar.f14861c = "1004733";
        uVar.a(xVar);
        y yVar = xVar.f14954o;
        if (yVar != null) {
            uVar.f14873p = yVar.br() == 2 ? "1" : "2";
            uVar.f14878u = String.valueOf(xVar.f14954o.bs());
            uVar.f14879v = String.valueOf(xVar.f14954o.bt());
            uVar.f14881x = String.valueOf(xVar.f14954o.bu());
            uVar.f14882y = String.valueOf(xVar.f14954o.o());
        }
        uVar.f14874q = String.valueOf(j6);
        uVar.f14875r = String.valueOf(System.currentTimeMillis() - j6);
        if (wVar instanceof r) {
            uVar.f14876s = ((r) wVar).aD();
            uVar.f14877t = wVar.v();
        }
        uVar.f14880w = z6 ? "1" : "2";
        uVar.f14883z = String.valueOf(j9);
        uVar.f14837A = String.valueOf(i4);
        a(uVar);
    }

    public static void a(x xVar, w wVar, int i4, int i6, int i9, boolean z6, boolean z9) {
        u uVar = new u(String.valueOf(xVar.f14949j), "66");
        uVar.f14861c = "1004736";
        uVar.a(xVar);
        uVar.f14873p = String.valueOf(xVar.f14949j);
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
            uVar.f14875r = wVar.v();
        }
        uVar.f14876s = 1 == ((bj) wVar).aJ() ? "2" : "1";
        y yVar = xVar.f14954o;
        if (yVar != null) {
            uVar.f14877t = yVar.W() == 1 ? "1" : "2";
        }
        uVar.f14878u = i4 == 1 ? "2" : "1";
        uVar.f14879v = i6 == 1 ? "2" : "1";
        uVar.f14880w = String.valueOf(i9);
        uVar.f14881x = z6 ? "1" : "2";
        uVar.f14882y = z9 ? "1" : "2";
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), "66");
        uVar.f14861c = "1004737";
        uVar.a(xVar);
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14873p = String.valueOf(rVar.aD());
            uVar.f14874q = String.valueOf(rVar.v());
        }
        uVar.f14875r = wVar.ak();
        uVar.f14876s = wVar.al();
        uVar.f14877t = wVar.am();
        uVar.f14878u = str;
        uVar.f14879v = String.valueOf(xVar.f14949j);
        a(uVar);
    }

    public static void a(long j6, long j9) {
        u uVar = new u("", "");
        uVar.f14861c = "1004742";
        uVar.f14873p = String.valueOf(j6);
        uVar.f14874q = "0";
        uVar.f14875r = String.valueOf(j9);
        a(uVar);
    }

    public static void a(n nVar, String str, boolean z6) {
        if (nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
        uVar.f14861c = "1004744";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(nVar.Y());
        uVar.f14874q = nVar.M();
        uVar.f14875r = String.valueOf(nVar.aK());
        uVar.f14876s = z6 ? "1" : "2";
        uVar.f14877t = str;
        uVar.f14878u = t.b().W() ? "1" : "2";
        uVar.f14879v = com.anythink.core.common.d.b.b().a();
        a(uVar);
    }

    public static void a(int i4) {
        u uVar = new u("", "");
        uVar.f14861c = "1004739";
        uVar.f14873p = String.valueOf(i4);
        a(uVar);
    }

    public static void a(String str, n nVar, boolean z6, String str2) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004740";
        uVar.a(nVar);
        uVar.f14873p = str;
        uVar.f14875r = z6 ? "1" : "2";
        if (nVar != null) {
            uVar.f14874q = String.valueOf(nVar.Y());
            uVar.f14876s = String.valueOf(nVar.ad());
            uVar.f14877t = nVar.M();
        }
        uVar.f14878u = str2;
        a(uVar);
    }

    public static void a(n nVar, String str) {
        if (nVar != null) {
            u uVar = new u(nVar.aK(), String.valueOf(nVar.Y()));
            uVar.f14861c = "1004741";
            uVar.a(nVar);
            uVar.f14873p = nVar.M();
            uVar.f14874q = "2";
            uVar.f14875r = String.valueOf(nVar.Y());
            uVar.f14876s = nVar.aK();
            uVar.f14877t = String.valueOf(nVar.ad());
            uVar.f14878u = str;
            a(uVar);
        }
    }

    public static void a(w wVar, x xVar, int i4, int i6) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004747";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        uVar.f14875r = String.valueOf(i4);
        if (i6 > 0) {
            uVar.f14876s = String.valueOf(i6);
        }
        uVar.f14877t = String.valueOf(wVar.K());
        uVar.f14878u = wVar.G();
        uVar.f14879v = wVar.H();
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i4, boolean z6, int i6, String str) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004748";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        if (TextUtils.isEmpty(str)) {
            uVar.f14875r = wVar.G();
        } else {
            uVar.f14875r = str;
        }
        uVar.f14876s = wVar.H();
        uVar.f14877t = String.valueOf(i4);
        if (i4 != 1 && z6) {
            uVar.f14878u = z6 ? "1" : "2";
        }
        if (i4 == 3 && i6 > 0) {
            uVar.f14879v = String.valueOf(i6);
        }
        a(uVar);
    }

    public static void a(com.anythink.core.common.h.h hVar, n nVar) {
        if (hVar == null || nVar == null) {
            return;
        }
        u uVar = new u(nVar.aK(), null);
        uVar.f14861c = "1004753";
        uVar.a(nVar);
        uVar.f14873p = String.valueOf(hVar.i());
        uVar.f14874q = String.valueOf(hVar.a());
        uVar.f14875r = String.valueOf(hVar.b());
        uVar.f14876s = String.valueOf(hVar.c());
        uVar.f14877t = String.valueOf(hVar.d());
        uVar.f14878u = String.valueOf(hVar.e());
        uVar.f14879v = String.valueOf(hVar.f());
        uVar.f14880w = String.valueOf(hVar.g());
        uVar.f14881x = String.valueOf(hVar.h());
        uVar.f14882y = String.valueOf(nVar.an());
        hVar.h();
        hVar.a();
        a(uVar);
    }

    public static void a(w wVar, x xVar, boolean z6, boolean z9) {
        String str;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004751";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        y yVar = xVar.f14954o;
        if (yVar != null) {
            uVar.f14875r = String.valueOf(yVar.bz());
            uVar.f14878u = String.valueOf(xVar.f14954o.aK());
            if (xVar.f14954o.aK() == 2) {
                str = String.valueOf(xVar.f14954o.aN());
            } else if (xVar.f14954o.aM() != null) {
                str = xVar.f14954o.aM().toString();
            } else {
                str = "";
            }
            uVar.f14879v = str;
            uVar.f14880w = String.valueOf(xVar.f14954o.bA());
        }
        uVar.f14876s = z6 ? "1" : "2";
        uVar.f14877t = z9 ? "1" : "2";
        a(uVar);
    }

    public static void a(w wVar, x xVar, String str, String str2, List<Boolean> list, int i4, boolean z6) {
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004756";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        uVar.f14875r = str;
        uVar.f14876s = str2;
        uVar.f14877t = String.valueOf(xVar.f14949j);
        uVar.f14879v = String.valueOf(i4);
        if (list != null && list.size() == 5) {
            Boolean bool = list.get(0);
            Boolean bool2 = list.get(1);
            Boolean bool3 = list.get(2);
            Boolean bool4 = list.get(3);
            Boolean bool5 = list.get(4);
            if (bool != null) {
                uVar.f14880w = bool.booleanValue() ? "1" : "2";
            }
            if (bool2 != null) {
                uVar.f14881x = bool2.booleanValue() ? "1" : "2";
            }
            if (bool3 != null) {
                uVar.f14882y = bool3.booleanValue() ? "1" : "2";
            }
            if (bool4 != null) {
                uVar.f14883z = bool4.booleanValue() ? "1" : "2";
            }
            if (bool5 != null) {
                uVar.f14837A = bool5.booleanValue() ? "1" : "2";
            }
        }
        uVar.f14838B = z6 ? "1" : "2";
        a(uVar);
    }

    public static void a(int i4, int i6, int i9, long j6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004758";
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = String.valueOf(i6);
        uVar.f14875r = String.valueOf(i9);
        uVar.f14876s = String.valueOf(j6);
        a(uVar);
    }

    public static void a(String str) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004755";
        uVar.f14873p = str;
        a(uVar);
    }

    public static void a(x xVar, w wVar, String str, String str2) {
        a(xVar, wVar, str, str2, true, "", "");
    }

    public static void a(x xVar, w wVar, String str, String str2, boolean z6, String str3, String str4) {
        if (xVar == null || wVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), "66");
        uVar.f14861c = "1004743";
        uVar.f14862d = xVar.f14944d;
        uVar.f14863e = xVar.f14942b;
        uVar.a(xVar);
        uVar.f14873p = str;
        if (wVar instanceof r) {
            r rVar = (r) wVar;
            uVar.f14874q = String.valueOf(rVar.aD());
            uVar.f14875r = String.valueOf(rVar.v());
        }
        uVar.f14876s = String.valueOf(xVar.f14949j);
        uVar.f14877t = str2;
        uVar.f14878u = z6 ? "1" : "2";
        uVar.f14879v = str3;
        uVar.f14880w = str4;
        a(uVar);
    }

    public static void a(n nVar, int i4) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004759";
        uVar.a(nVar);
        uVar.f14873p = i4 == 7 ? "1" : "2";
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

    public static void a(w wVar, x xVar, boolean z6, long j6, int i4, String str, long j9) {
        String str2;
        String str3;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004761";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        uVar.f14875r = z6 ? "1" : "2";
        uVar.f14876s = String.valueOf(j6);
        uVar.f14877t = wVar.an();
        String str4 = "";
        if (wVar.r() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(wVar.r().bG());
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        uVar.f14878u = str2;
        if (wVar.r() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.r().bE());
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        uVar.f14879v = str3;
        if (wVar.r() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(wVar.r().bF());
            str4 = sb3.toString();
        }
        uVar.f14880w = str4;
        if (!z6) {
            uVar.f14881x = String.valueOf(i4);
            uVar.f14882y = str;
        }
        if (j9 > 0) {
            uVar.f14883z = String.valueOf(j9);
        }
        a(uVar);
    }

    public static void a(w wVar, x xVar, int i4, long j6, String str, long j9, long j10, long j11, long j12, long j13) {
        String str2;
        String str3;
        if (wVar == null || xVar == null) {
            return;
        }
        u uVar = new u(String.valueOf(xVar.f14949j), String.valueOf(xVar.f14946f));
        uVar.f14861c = "1004762";
        uVar.a(xVar);
        uVar.f14873p = wVar.v();
        if (wVar instanceof r) {
            uVar.f14874q = ((r) wVar).aD();
        }
        uVar.f14875r = String.valueOf(i4);
        uVar.f14876s = String.valueOf(j6);
        uVar.f14877t = wVar.an();
        String str4 = "";
        if (wVar.r() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(wVar.r().bG());
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        uVar.f14878u = str2;
        if (wVar.r() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.r().bE());
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        uVar.f14879v = str3;
        if (wVar.r() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(wVar.r().bF());
            str4 = sb3.toString();
        }
        uVar.f14880w = str4;
        uVar.f14881x = str;
        uVar.f14882y = String.valueOf(j9);
        uVar.f14883z = String.valueOf(j10);
        uVar.f14837A = String.valueOf(j11);
        uVar.f14838B = String.valueOf(j12);
        uVar.f14839C = String.valueOf(j13);
        a(uVar);
    }

    public static void a(int i4, String str, String str2) {
        u uVar = new u("", "");
        uVar.f14861c = "1004765";
        uVar.f14873p = String.valueOf(i4);
        uVar.f14874q = str;
        uVar.f14875r = str2;
        a(uVar);
    }

    public static void a(com.anythink.core.common.m.b.a aVar) {
        if (aVar == null) {
            return;
        }
        u uVar = new u("", "");
        uVar.f14861c = "1004766";
        uVar.f14873p = aVar.a();
        uVar.f14874q = String.valueOf(aVar.b());
        uVar.f14875r = String.valueOf(aVar.c());
        uVar.f14876s = String.valueOf(aVar.f());
        uVar.f14877t = String.valueOf(aVar.g());
        uVar.f14878u = String.valueOf(aVar.d());
        uVar.f14879v = String.valueOf(aVar.e());
        uVar.f14880w = aVar.i();
        uVar.f14881x = String.valueOf(aVar.j());
        uVar.f14882y = aVar.l();
        uVar.f14883z = aVar.m();
        uVar.f14837A = aVar.n();
        uVar.f14839C = String.valueOf(aVar.q());
        Context g9 = t.b().g();
        if (g9 != null) {
            uVar.f14838B = q.a(g9) ? "1" : "0";
        }
        a(uVar);
    }

    public static void a(int i4, int i6, String str, long j6) {
        u uVar = new u(null, null);
        uVar.f14861c = "1004769";
        try {
            uVar.f14873p = Build.MANUFACTURER;
        } catch (Throwable unused) {
        }
        uVar.f14874q = String.valueOf(i4);
        uVar.f14875r = String.valueOf(i6);
        if (!TextUtils.isEmpty(str)) {
            uVar.f14876s = str;
        }
        uVar.f14877t = String.valueOf(j6);
        a(uVar);
    }

    public static void a(final u uVar) {
        if (uVar == null || t.b().g() == null) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.u.e.6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z6;
                try {
                    if (TextUtils.isEmpty(u.this.f14864f)) {
                        u.this.f14864f = t.b().r();
                    }
                    if (!TextUtils.isEmpty(u.this.f14863e)) {
                        u.this.f14865g = t.b().g(u.this.f14863e);
                        e.c(u.this);
                        if (ATAdxSetting.getInstance().isAdxNetworkMode(u.this.f14863e)) {
                            u.this.f14859X = 1;
                        }
                    }
                    u.this.f14867j = String.valueOf(System.currentTimeMillis());
                    com.anythink.core.d.b b9 = com.anythink.core.d.d.a(t.b().g()).b(t.b().p());
                    if (b9 != null) {
                        z6 = e.a(u.this, b9);
                        if (e.c(b9, u.this)) {
                            return;
                        }
                        if (e.b(b9, u.this)) {
                            f.a(t.b().g()).a(u.this, z6);
                            return;
                        }
                    } else {
                        z6 = false;
                    }
                    d.a().a(u.this, z6);
                } catch (Throwable unused) {
                }
            }
        }, 8);
    }

    private static void a(Runnable runnable) {
        com.anythink.core.common.v.b.b.a().b(runnable, 13);
    }

    private static String a(AdError adError, int i4, String str, int i6) {
        com.anythink.core.common.w.a.b.c cVar;
        com.anythink.core.common.h.ai a9;
        if (i6 == 0 && (cVar = (com.anythink.core.common.w.a.b.c) com.anythink.core.common.w.a.a.d.a(str, com.anythink.core.common.w.a.b.c.class)) != null && adError != null && (a9 = cVar.a()) != null && a9.e() != null) {
            return com.anythink.core.common.w.a.d.a.a(adError.getPlatformCode() + "," + adError.getPlatformMSG(), a9.e().get(Integer.valueOf(i4)));
        }
        return "";
    }

    public static /* synthetic */ boolean a(u uVar, com.anythink.core.d.b bVar) {
        Map<String, String> f2;
        if ("1004742".equals(uVar.f14861c)) {
            return true;
        }
        if (!TextUtils.isEmpty(uVar.f14861c) && !TextUtils.isEmpty(uVar.f14852Q) && !TextUtils.isEmpty(uVar.f14851P) && (f2 = bVar.f(uVar.f14861c)) != null) {
            if (f2.containsKey("0")) {
                String str = f2.get("0");
                return !TextUtils.isEmpty(str) && str.contains(uVar.f14851P);
            }
            if (f2.containsKey(uVar.f14852Q)) {
                String str2 = f2.get(uVar.f14852Q);
                if (!TextUtils.isEmpty(str2) && str2.contains(uVar.f14851P)) {
                    return true;
                }
            }
        }
        return false;
    }
}
