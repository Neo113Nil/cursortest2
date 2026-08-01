package com.anythink.core.d;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATCustomAdapterConfig;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aa;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.bv;
import com.anythink.core.d.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f17497a = {"unit_id", "unitid", "slot_id", "placement_id", "zone_id", "ad_place_id", "position_id", "pos_id", "placement_name", "spot_id", "ad_tag", "ad_id", "plid", "space_id", "location", "tagid", "adslot_id", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID, com.anythink.expressad.f.a.b.aB};

    private static String a(String str, bv bvVar) {
        int q8;
        try {
            q8 = bvVar.q();
        } catch (Throwable unused) {
        }
        if (q8 != 3 && q8 != 7 && bvVar.g() != 35) {
            Map<String, Object> l9 = bvVar.l();
            for (String str2 : f17497a) {
                String a9 = com.anythink.core.common.v.q.a(l9, str2, "");
                if (!TextUtils.isEmpty(a9)) {
                    return a9;
                }
            }
            return "";
        }
        return str;
    }

    public static List<bv> b(l lVar) {
        List<bv> a9 = a(lVar, lVar.az(), 0, 1);
        a9.addAll(a(lVar, lVar.aA(), 4, 6));
        Collections.sort(a9);
        return a9;
    }

    public static List<bv> c(l lVar) {
        return a(lVar, lVar.J(), 8, 10);
    }

    public static List<bv> d(l lVar) {
        return a(lVar, lVar.bt(), 2, 12);
    }

    public static List<bv> e(l lVar) {
        return a(lVar, lVar.bu(), 1, 13);
    }

    public static void a(l lVar, Map<String, bv> map, List<bv> list) {
        a(lVar, map, list, lVar.az(), 0, 1);
        a(lVar, map, list, lVar.aA(), 0, 6);
        a(lVar, map, list, lVar.aB(), 1, 3);
        a(lVar, map, list, lVar.Y(), 3, 4);
        a(lVar, map, list, lVar.aC(), 2, 2);
        a(lVar, map, list, lVar.W(), 5, 7);
        a(lVar, map, list, lVar.O(), 6, 11);
        a(lVar, map, list, lVar.aI(), 7, 8);
        a(lVar, map, list, lVar.aJ(), 3, 5);
        a(lVar, map, list, lVar.J(), 8, 10);
        a(lVar, map, list, lVar.bt(), 2, 12);
        a(lVar, map, list, lVar.bu(), 1, 13);
    }

    private static void a(l lVar, Map<String, bv> map, List<bv> list, JSONArray jSONArray, int i, int i6) {
        try {
            com.anythink.core.common.h.q bf = lVar.bf();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                if (optJSONObject != null) {
                    bv a9 = a(i6, i, optJSONObject, lVar);
                    map.put(a9.z(), a9);
                    if (a9.g() == 35) {
                        list.add(a9);
                    }
                    a(lVar, a9);
                    if (bf != null && a9.g() == 2) {
                        if (i == 0) {
                            bf.f14037a = true;
                        }
                        if (i == 1) {
                            bf.f14038b = true;
                        }
                    }
                    if (lVar.bn() == null && a9.o() && a9.aS() == 1) {
                        lVar.a(Boolean.TRUE);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(l lVar, bv bvVar) {
        if (bvVar.ar() > 0.0d || lVar == null) {
            return;
        }
        double aM = lVar.aM();
        if (aM > 0.0d) {
            bvVar.d(aM);
        }
    }

    public static List<bv> a(l lVar) {
        List<bv> a9 = a(lVar, lVar.aB(), 1, 3);
        List<bv> a10 = a(lVar, lVar.Y(), 3, 4);
        List<bv> a11 = a(lVar, lVar.aC(), 2, 2);
        List<bv> a12 = a(lVar, lVar.W(), 5, 7);
        List<bv> a13 = a(lVar, lVar.O(), 6, 11);
        List<bv> a14 = a(lVar, lVar.aI(), 7, 8);
        List<bv> a15 = a(lVar, lVar.aJ(), 3, 5);
        a9.addAll(a10);
        a9.addAll(a11);
        a9.addAll(a12);
        a9.addAll(a13);
        a9.addAll(a14);
        a9.addAll(a15);
        return a9;
    }

    public static List<bv> a(l lVar, JSONArray jSONArray) {
        return a(lVar, jSONArray, 3, 4);
    }

    private static List<bv> a(l lVar, JSONArray jSONArray, int i, int i6) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                if (jSONObject != null) {
                    bv a9 = a(i6, i, jSONObject, lVar);
                    a(lVar, a9);
                    arrayList.add(a9);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private static bv a(int i, int i6, JSONObject jSONObject, l lVar) {
        long j6;
        aa a9;
        ATCustomAdapterConfig b9;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        int i9 = (i6 == 0 || i6 == 4 || i6 == 8) ? 0 : 1;
        bv bvVar = new bv(i);
        bvVar.e(i6);
        bvVar.d(i9);
        if (jSONObject.isNull(com.anythink.core.common.k.f14281D)) {
            bvVar.c("");
        } else {
            bvVar.c(jSONObject.optString(com.anythink.core.common.k.f14281D));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14278A)) {
            bvVar.b(-1);
        } else {
            bvVar.b(jSONObject.optInt(com.anythink.core.common.k.f14278A));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14279B)) {
            bvVar.c(-1);
        } else {
            bvVar.c(jSONObject.optInt(com.anythink.core.common.k.f14279B));
        }
        if (jSONObject.isNull("nw_firm_id")) {
            bvVar.a(-1);
        } else {
            bvVar.a(jSONObject.optInt("nw_firm_id"));
        }
        if (jSONObject.isNull("content")) {
            bvVar.b("");
            bvVar.a(new HashMap());
        } else {
            String optString = jSONObject.optString("content");
            Map<String, Object> c9 = com.anythink.core.common.v.q.c(optString);
            if (bvVar.g() == 22 && com.anythink.core.common.v.q.a(c9, "unit_type", 0) == 1) {
                c9.put(j.w.f12608E, 1);
            }
            bvVar.b(optString);
            bvVar.a(c9);
            bvVar.j(a(lVar.i(), bvVar));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14326z)) {
            bvVar.a("");
        } else {
            bvVar.a(jSONObject.optString(com.anythink.core.common.k.f14326z));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14282E)) {
            bvVar.d(com.anythink.core.common.v.m.f16809e);
        } else {
            bvVar.d(jSONObject.optString(com.anythink.core.common.k.f14282E));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14324x)) {
            bvVar.e(0L);
        } else {
            bvVar.e(jSONObject.optInt(com.anythink.core.common.k.f14324x));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14322v)) {
            bvVar.f(0L);
        } else {
            bvVar.f(jSONObject.optInt(com.anythink.core.common.k.f14322v));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14323w)) {
            bvVar.h(1);
        } else {
            bvVar.h(jSONObject.optInt(com.anythink.core.common.k.f14323w));
        }
        if (jSONObject.isNull("pacing")) {
            bvVar.g(-1L);
        } else {
            bvVar.g(jSONObject.optLong("pacing"));
        }
        if (jSONObject.isNull("unit_id")) {
            bvVar.e("");
        } else {
            bvVar.e(jSONObject.optString("unit_id"));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14285H)) {
            bvVar.b(0.0d);
        } else {
            bvVar.b(jSONObject.optDouble(com.anythink.core.common.k.f14285H, 0.0d));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14286I)) {
            bvVar.h(com.anythink.basead.exoplayer.i.a.f7883f);
        } else {
            bvVar.h(jSONObject.optInt(com.anythink.core.common.k.f14286I));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14287K)) {
            bvVar.f("");
        } else {
            bvVar.f(jSONObject.optString(com.anythink.core.common.k.f14287K));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14288L)) {
            bvVar.i(0);
        } else {
            bvVar.i(jSONObject.optInt(com.anythink.core.common.k.f14288L));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14289M)) {
            bvVar.j(3000);
        } else {
            bvVar.j(jSONObject.optInt(com.anythink.core.common.k.f14289M));
        }
        if (jSONObject.isNull("payload")) {
            bvVar.g("");
        } else {
            bvVar.g(jSONObject.optString("payload"));
        }
        if (jSONObject.isNull("error")) {
            bvVar.h("");
        } else {
            bvVar.h(jSONObject.optString("error"));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14290N)) {
            bvVar.i(1800000L);
        } else {
            bvVar.i(jSONObject.optLong(com.anythink.core.common.k.f14290N));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14291O)) {
            bvVar.j(-1L);
        } else {
            bvVar.j(jSONObject.optLong(com.anythink.core.common.k.f14291O));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14292P)) {
            bvVar.d(1800000L);
        } else {
            bvVar.d(jSONObject.optLong(com.anythink.core.common.k.f14292P));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.am)) {
            bvVar.g(i9 ^ 1);
        } else {
            bvVar.g(jSONObject.optInt(com.anythink.core.common.k.am));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14293Q)) {
            bvVar.k(1);
        } else {
            bvVar.k(jSONObject.optInt(com.anythink.core.common.k.f14293Q));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14294R)) {
            bvVar.l(1);
        } else {
            bvVar.l(jSONObject.optInt(com.anythink.core.common.k.f14294R));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14295S)) {
            bvVar.m(-1);
        } else {
            bvVar.m(jSONObject.optInt(com.anythink.core.common.k.f14295S));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14296T)) {
            bvVar.i("publisher_defined");
        } else {
            bvVar.i(jSONObject.optString(com.anythink.core.common.k.f14296T));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14297U)) {
            j6 = 0;
            bvVar.k(0L);
        } else {
            j6 = 0;
            bvVar.k(jSONObject.optLong(com.anythink.core.common.k.f14297U));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14298V)) {
            bvVar.l(j6);
        } else {
            bvVar.l(jSONObject.optLong(com.anythink.core.common.k.f14298V));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14299W)) {
            bvVar.c(0.0d);
        } else {
            bvVar.c(jSONObject.optDouble(com.anythink.core.common.k.f14299W, 0.0d));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14300X)) {
            bvVar.n(1);
        } else {
            bvVar.n(jSONObject.optInt(com.anythink.core.common.k.f14300X));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.Y)) {
            bvVar.o(1);
        } else {
            bvVar.o(jSONObject.optInt(com.anythink.core.common.k.Y));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.f14301Z)) {
            bvVar.p(2);
        } else {
            bvVar.p(jSONObject.optInt(com.anythink.core.common.k.f14301Z));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.aa)) {
            bvVar.f(1);
        } else {
            bvVar.f(jSONObject.optInt(com.anythink.core.common.k.aa));
        }
        if (jSONObject.isNull("s2s_sw")) {
            bvVar.q(2);
        } else {
            bvVar.q(jSONObject.optInt("s2s_sw"));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ab)) {
            bvVar.s(2);
        } else {
            bvVar.s(jSONObject.optInt(com.anythink.core.common.k.ab));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ac)) {
            bvVar.r(0);
        } else {
            bvVar.r(jSONObject.optInt(com.anythink.core.common.k.ac));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ae)) {
            bvVar.t(1);
        } else {
            bvVar.t(jSONObject.optInt(com.anythink.core.common.k.ae));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ah)) {
            bvVar.k("");
        } else {
            bvVar.k(jSONObject.optString(com.anythink.core.common.k.ah));
        }
        if (i6 == 7) {
            com.anythink.core.common.f.c.a(com.anythink.core.common.d.t.b().g()).a(bvVar.z(), bvVar.ac());
        }
        if (jSONObject.isNull(com.anythink.core.common.k.af)) {
            bvVar.u(2);
        } else {
            bvVar.u(jSONObject.optInt(com.anythink.core.common.k.af));
        }
        if (jSONObject.isNull("ad_type")) {
            bvVar.v(-1);
        } else {
            bvVar.v(jSONObject.optInt("ad_type", -1));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ai)) {
            bvVar.w(-1);
        } else {
            bvVar.w(jSONObject.optInt(com.anythink.core.common.k.ai, -1));
        }
        if (bvVar.q() == 2) {
            if (bvVar.g() == 22) {
                bvVar.a(ATAdConst.CURRENCY.RMB_CENT);
            } else {
                bvVar.a(ATAdConst.CURRENCY.USD);
            }
        } else {
            bvVar.a(ATAdConst.CURRENCY.USD);
        }
        if (jSONObject.isNull(com.anythink.core.common.k.aj)) {
            bvVar.D(0);
        } else {
            bvVar.D(jSONObject.optInt(com.anythink.core.common.k.aj, 0));
        }
        if (jSONObject.isNull("bid_floor")) {
            bvVar.d(0.0d);
        } else {
            bvVar.d(jSONObject.optDouble("bid_floor", 0.0d));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ao)) {
            bvVar.E(-1);
        } else {
            bvVar.E(jSONObject.optInt(com.anythink.core.common.k.ao, -1));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ap)) {
            bvVar.e(bvVar.D());
        } else {
            bvVar.e(jSONObject.optDouble(com.anythink.core.common.k.ap, bvVar.D()));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.aq)) {
            bvVar.m(j.C0076j.f12486b);
        } else {
            bvVar.m(jSONObject.optString(com.anythink.core.common.k.aq, j.C0076j.f12486b));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.ar)) {
            bvVar.F(2);
        } else {
            bvVar.F(jSONObject.optInt(com.anythink.core.common.k.ar, 2));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.as)) {
            bvVar.I(1);
        } else {
            bvVar.I(jSONObject.optInt(com.anythink.core.common.k.as));
        }
        if (jSONObject.isNull(com.anythink.core.common.k.at)) {
            bvVar.J(2);
        } else {
            bvVar.J(jSONObject.optInt(com.anythink.core.common.k.at, 2));
        }
        if (!jSONObject.has(com.anythink.core.common.k.au)) {
            bvVar.n("TopOn");
        } else {
            bvVar.n(jSONObject.optString(com.anythink.core.common.k.au));
        }
        bvVar.n(jSONObject.optLong(com.anythink.core.common.k.av, 15000L));
        int[] iArr = null;
        if (!jSONObject.isNull(l.a.ar) && (optJSONArray = jSONObject.optJSONArray(l.a.ar)) != null && optJSONArray.length() > 0) {
            try {
                iArr = new int[optJSONArray.length()];
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    iArr[i10] = optJSONArray.getInt(i10);
                }
            } catch (Exception unused) {
            }
        }
        bvVar.a(iArr);
        bvVar.K(jSONObject.optInt(com.anythink.core.common.k.aw, 1));
        bvVar.L(jSONObject.optInt(com.anythink.core.common.k.ax, 1));
        if (!jSONObject.isNull(com.anythink.core.common.k.ay)) {
            bvVar.a(jSONObject.optJSONArray(com.anythink.core.common.k.ay));
        }
        if (!jSONObject.isNull(com.anythink.core.common.k.az)) {
            bvVar.M(jSONObject.optInt(com.anythink.core.common.k.az));
        }
        if (!jSONObject.isNull("ad_s_reqf_mode")) {
            bvVar.N(jSONObject.optInt("ad_s_reqf_mode"));
        }
        bvVar.P(jSONObject.optInt("unit_type", 0));
        bvVar.Q(jSONObject.optInt(com.anythink.core.common.k.aC, 0));
        bvVar.O(jSONObject.optInt("network_id"));
        bvVar.R(jSONObject.optInt(com.anythink.core.common.k.aE, 2));
        bvVar.h(jSONObject.optDouble(com.anythink.core.common.k.aN, 0.0d));
        bvVar.g(jSONObject.optDouble(com.anythink.core.common.k.aO, 0.0d));
        bvVar.a(jSONObject.optJSONObject(com.anythink.core.common.k.aP));
        bvVar.S(jSONObject.optInt(com.anythink.core.common.k.aQ));
        bvVar.T(jSONObject.optInt(com.anythink.core.common.k.aR, 1));
        ap bi = lVar.bi();
        if (bi != null) {
            ap apVar = new ap();
            apVar.b(bi.e());
            apVar.a(bi.d());
            apVar.a(bi.a());
            String optString2 = jSONObject.optString(com.anythink.core.common.k.aS);
            if (!TextUtils.isEmpty(optString2)) {
                apVar.b(optString2);
            }
            String optString3 = jSONObject.optString(com.anythink.core.common.k.aT);
            if (!TextUtils.isEmpty(optString3)) {
                apVar.d(optString3);
            }
            bvVar.a(apVar);
        }
        bvVar.a(jSONObject.optDouble(com.anythink.core.common.k.aU, 0.0d));
        bvVar.U(jSONObject.optInt(com.anythink.core.common.k.aV, 2));
        bvVar.V(jSONObject.optInt(com.anythink.core.common.k.aW, 1));
        bvVar.o(jSONObject.optLong(com.anythink.core.common.k.aX, 500L));
        String optString4 = jSONObject.optString(com.anythink.core.common.k.aY);
        if (!TextUtils.isEmpty(optString4)) {
            try {
                a9 = aa.a(optString4);
            } catch (Throwable unused2) {
            }
        } else {
            if (bvVar.g() == 2) {
                a9 = aa.a();
            }
            a9 = null;
        }
        bvVar.a(a9);
        bvVar.W(jSONObject.optInt(com.anythink.core.common.k.aZ, 0));
        bvVar.p(jSONObject.optLong(com.anythink.core.common.k.ba, 0L));
        bvVar.X(lVar.aq());
        JSONObject bA = lVar.bA();
        if (bA != null && (optJSONObject = bA.optJSONObject(String.valueOf(bvVar.g()))) != null) {
            bvVar.Y(optJSONObject.optInt(com.anythink.core.common.k.bb, 2));
            bvVar.o(optJSONObject.optString(com.anythink.core.common.k.bc, ""));
            bvVar.f(optJSONObject.optJSONArray(com.anythink.core.common.k.bd));
            bvVar.b(optJSONObject.optJSONArray(com.anythink.core.common.k.be));
            bvVar.c(optJSONObject.optJSONArray(com.anythink.core.common.k.bf));
            bvVar.Z(optJSONObject.optInt(com.anythink.core.common.k.br, 2));
            bvVar.d(optJSONObject.optJSONArray(com.anythink.core.common.k.bs));
            bvVar.e(optJSONObject.optJSONArray(com.anythink.core.common.k.bt));
        }
        bvVar.aa(jSONObject.optInt(com.anythink.core.common.k.bg));
        bvVar.q(jSONObject.optLong(com.anythink.core.common.k.bh));
        bvVar.r(jSONObject.optLong(com.anythink.core.common.k.bi));
        bvVar.i(jSONObject.optDouble(com.anythink.core.common.k.bj, 0.0d));
        bvVar.x(jSONObject.optInt(com.anythink.core.common.k.bk, 2));
        bvVar.y(jSONObject.optInt(com.anythink.core.common.k.bl, 2));
        bvVar.z(jSONObject.optInt(com.anythink.core.common.k.bm, 0));
        JSONObject bF = lVar.bF();
        if (bF != null) {
            bvVar.l(bF.optString(com.anythink.core.common.k.bn, ""));
        }
        bvVar.A(jSONObject.optInt(com.anythink.core.common.k.bo, 2));
        bvVar.ab(jSONObject.optInt(com.anythink.core.common.k.bp, 1));
        bvVar.B(jSONObject.optInt(com.anythink.core.common.k.bq, 2));
        ATAdRequest aTAdRequest = lVar.i;
        if (aTAdRequest != null) {
            bvVar.a(aTAdRequest);
        }
        bvVar.a(com.anythink.core.common.h.l.a(jSONObject.optJSONObject(com.anythink.core.common.k.bu)));
        if (bvVar.g() >= 100000 && (b9 = com.anythink.core.common.d.t.b().b(bvVar.m())) != null) {
            bvVar.f(b9.isRealTimeBidSwitch() ? 2 : 1);
            bvVar.e(b9.getAdCacheTime());
            if (b9.getLossNoticePostion() > 0) {
                bvVar.E(b9.getLossNoticePostion());
            }
        }
        return bvVar;
    }

    private static void a(Map<String, Object> map, int i) {
        if (map != null && i == 22 && com.anythink.core.common.v.q.a(map, "unit_type", 0) == 1) {
            map.put(j.w.f12608E, 1);
        }
    }
}
