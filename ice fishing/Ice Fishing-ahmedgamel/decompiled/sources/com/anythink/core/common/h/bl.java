package com.anythink.core.common.h;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bl implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    String[] f13649A;

    /* renamed from: B, reason: collision with root package name */
    String[] f13650B;

    /* renamed from: C, reason: collision with root package name */
    String[] f13651C;

    /* renamed from: D, reason: collision with root package name */
    String[] f13652D;

    /* renamed from: E, reason: collision with root package name */
    String[] f13653E;

    /* renamed from: F, reason: collision with root package name */
    String[] f13654F;

    /* renamed from: G, reason: collision with root package name */
    Map<Integer, String[]> f13655G;

    /* renamed from: H, reason: collision with root package name */
    String[] f13656H;

    /* renamed from: I, reason: collision with root package name */
    String[] f13657I;
    String J;

    /* renamed from: K, reason: collision with root package name */
    String f13658K;

    /* renamed from: L, reason: collision with root package name */
    String f13659L;

    /* renamed from: M, reason: collision with root package name */
    String f13660M;

    /* renamed from: N, reason: collision with root package name */
    String f13661N;

    /* renamed from: O, reason: collision with root package name */
    String f13662O;

    /* renamed from: P, reason: collision with root package name */
    String f13663P;

    /* renamed from: Q, reason: collision with root package name */
    String f13664Q;

    /* renamed from: R, reason: collision with root package name */
    String f13665R;

    /* renamed from: S, reason: collision with root package name */
    String f13666S;

    /* renamed from: T, reason: collision with root package name */
    String f13667T;

    /* renamed from: U, reason: collision with root package name */
    String f13668U;

    /* renamed from: V, reason: collision with root package name */
    String f13669V;

    /* renamed from: W, reason: collision with root package name */
    String f13670W;

    /* renamed from: X, reason: collision with root package name */
    String f13671X;
    String Y;

    /* renamed from: Z, reason: collision with root package name */
    String f13672Z;

    /* renamed from: a, reason: collision with root package name */
    String f13673a;
    String aa;
    String ab;
    String ac;
    String ad;
    String ae;
    String af;
    String ag;
    String ah;
    String ai;
    String aj;
    String ak;
    String al;
    String am;
    String an;
    String ao;
    String[] ap;
    String aq;

    /* renamed from: b, reason: collision with root package name */
    String[] f13674b;

    /* renamed from: c, reason: collision with root package name */
    String[] f13675c;

    /* renamed from: d, reason: collision with root package name */
    String[] f13676d;

    /* renamed from: e, reason: collision with root package name */
    String[] f13677e;

    /* renamed from: f, reason: collision with root package name */
    String[] f13678f;

    /* renamed from: g, reason: collision with root package name */
    String[] f13679g;

    /* renamed from: h, reason: collision with root package name */
    String[] f13680h;
    String[] i;

    /* renamed from: j, reason: collision with root package name */
    String[] f13681j;

    /* renamed from: k, reason: collision with root package name */
    String[] f13682k;

    /* renamed from: l, reason: collision with root package name */
    String[] f13683l;

    /* renamed from: m, reason: collision with root package name */
    String[] f13684m;

    /* renamed from: n, reason: collision with root package name */
    String[] f13685n;

    /* renamed from: o, reason: collision with root package name */
    String[] f13686o;

    /* renamed from: p, reason: collision with root package name */
    String[] f13687p;

    /* renamed from: q, reason: collision with root package name */
    String[] f13688q;

    /* renamed from: r, reason: collision with root package name */
    String[] f13689r;

    /* renamed from: s, reason: collision with root package name */
    String[] f13690s;

    /* renamed from: t, reason: collision with root package name */
    String[] f13691t;

    /* renamed from: u, reason: collision with root package name */
    String[] f13692u;

    /* renamed from: v, reason: collision with root package name */
    String[] f13693v;

    /* renamed from: w, reason: collision with root package name */
    String[] f13694w;

    /* renamed from: x, reason: collision with root package name */
    String[] f13695x;

    /* renamed from: y, reason: collision with root package name */
    String[] f13696y;

    /* renamed from: z, reason: collision with root package name */
    String[] f13697z;

    public static final bl a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            bl blVar = new bl();
            blVar.f13673a = jSONObject.optString("ks");
            blVar.f13674b = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("nurl"));
            blVar.f13675c = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("lurl"));
            blVar.f13676d = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("imp"));
            blVar.f13677e = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("click"));
            blVar.f13678f = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vstart"));
            blVar.f13679g = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v25"));
            blVar.f13680h = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v50"));
            blVar.i = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v75"));
            blVar.f13681j = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v100"));
            blVar.f13682k = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vpaused"));
            blVar.f13683l = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vclick"));
            blVar.f13684m = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vmute"));
            blVar.f13685n = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vunmute"));
            blVar.f13686o = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_show"));
            blVar.f13687p = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_close"));
            blVar.f13688q = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_star"));
            blVar.f13689r = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_end"));
            blVar.f13690s = com.anythink.core.common.v.q.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.j.db));
            blVar.f13691t = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vresumed"));
            blVar.f13692u = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vskip"));
            blVar.f13693v = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vfail"));
            blVar.f13694w = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_start_install"));
            blVar.f13695x = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_start"));
            blVar.f13696y = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_succ"));
            blVar.f13697z = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_install"));
            blVar.f13649A = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_uninstall"));
            blVar.f13650B = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_unknow"));
            blVar.f13652D = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_inst_fail"));
            blVar.f13651C = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_uninst_fail"));
            blVar.f13653E = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vd_succ"));
            blVar.f13654F = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray optJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (optJSONArray != null) {
                blVar.f13655G = new HashMap();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("play_sec");
                    blVar.f13655G.put(Integer.valueOf(optInt), com.anythink.core.common.v.q.a(optJSONObject.optJSONArray("list")));
                }
            }
            blVar.f13656H = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_success"));
            blVar.f13657I = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_fail"));
            blVar.J = jSONObject.optString("tp_nurl");
            blVar.f13658K = jSONObject.optString("tp_imp");
            blVar.f13659L = jSONObject.optString("tp_click");
            blVar.f13660M = jSONObject.optString("tp_vstart");
            blVar.f13661N = jSONObject.optString("tp_v25");
            blVar.f13662O = jSONObject.optString("tp_v50");
            blVar.f13663P = jSONObject.optString("tp_v75");
            blVar.f13664Q = jSONObject.optString("tp_v100");
            blVar.f13665R = jSONObject.optString("tp_vpaused");
            blVar.f13666S = jSONObject.optString("tp_vclick");
            blVar.f13667T = jSONObject.optString("tp_vmute");
            blVar.f13668U = jSONObject.optString("tp_vunmute");
            blVar.f13669V = jSONObject.optString("tp_ec_show");
            blVar.f13670W = jSONObject.optString("tp_ec_close");
            blVar.f13671X = jSONObject.optString("tp_apk_dl_star");
            blVar.Y = jSONObject.optString("tp_apk_dl_end");
            blVar.f13672Z = jSONObject.optString("tp_apk_install");
            blVar.aa = jSONObject.optString("tp_vresumed");
            blVar.ab = jSONObject.optString("tp_vskip");
            blVar.ac = jSONObject.optString("tp_vfail");
            blVar.ad = jSONObject.optString("tp_apk_start_install");
            blVar.ae = jSONObject.optString("tp_dp_start");
            blVar.af = jSONObject.optString("tp_dp_succ");
            blVar.ag = jSONObject.optString("tp_app_install");
            blVar.ah = jSONObject.optString("tp_app_uninstall");
            blVar.ai = jSONObject.optString("tp_app_unknow");
            blVar.ak = jSONObject.optString("tp_dp_inst_fail");
            blVar.aj = jSONObject.optString("tp_dp_uninst_fail");
            blVar.al = jSONObject.optString("tp_vd_succ");
            blVar.am = jSONObject.optString("tp_vrewarded");
            blVar.an = jSONObject.optString("tp_load_success");
            blVar.ao = jSONObject.optString("tp_load_fail");
            blVar.ap = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vready"));
            blVar.aq = jSONObject.optString("tp_ready");
            return blVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String A() {
        return this.J;
    }

    public final String B() {
        return this.f13658K;
    }

    public final String C() {
        return this.f13659L;
    }

    public final String D() {
        return this.f13660M;
    }

    public final String E() {
        return this.f13661N;
    }

    public final String F() {
        return this.f13662O;
    }

    public final String G() {
        return this.f13663P;
    }

    public final String H() {
        return this.f13664Q;
    }

    public final String I() {
        return this.f13665R;
    }

    public final String J() {
        return this.f13666S;
    }

    public final String K() {
        return this.f13667T;
    }

    public final String L() {
        return this.f13668U;
    }

    public final String M() {
        return this.f13669V;
    }

    public final String N() {
        return this.f13670W;
    }

    public final String O() {
        return this.f13671X;
    }

    public final String P() {
        return this.Y;
    }

    public final String Q() {
        return this.f13672Z;
    }

    public final String[] R() {
        return this.f13691t;
    }

    public final String[] S() {
        return this.f13692u;
    }

    public final String[] T() {
        return this.f13693v;
    }

    public final String[] U() {
        return this.f13694w;
    }

    public final String[] V() {
        return this.f13695x;
    }

    public final String[] W() {
        return this.f13696y;
    }

    public final String[] X() {
        return this.f13697z;
    }

    public final String[] Y() {
        return this.f13649A;
    }

    public final String[] Z() {
        return this.f13650B;
    }

    public final String aa() {
        return this.aa;
    }

    public final String ab() {
        return this.ab;
    }

    public final String ac() {
        return this.ac;
    }

    public final String ad() {
        return this.ad;
    }

    public final String ae() {
        return this.ae;
    }

    public final String af() {
        return this.af;
    }

    public final String ag() {
        return this.ag;
    }

    public final String ah() {
        return this.ah;
    }

    public final String ai() {
        return this.ai;
    }

    public final String aj() {
        return this.aj;
    }

    public final String ak() {
        return this.ak;
    }

    public final String al() {
        return this.al;
    }

    public final String am() {
        return this.am;
    }

    public final String an() {
        return this.an;
    }

    public final String ao() {
        return this.ao;
    }

    public final String[] ap() {
        return this.ap;
    }

    public final String aq() {
        return this.aq;
    }

    public final void b(String[] strArr) {
        this.f13688q = strArr;
    }

    public final void c(String[] strArr) {
        this.f13689r = strArr;
    }

    public final void d(String[] strArr) {
        this.f13690s = strArr;
    }

    public final String[] e() {
        return this.f13675c;
    }

    public final String[] f() {
        return this.f13676d;
    }

    public final String[] g() {
        return this.f13677e;
    }

    public final String[] h() {
        return this.f13678f;
    }

    public final String[] i() {
        return this.f13679g;
    }

    public final String[] j() {
        return this.f13680h;
    }

    public final String[] k() {
        return this.i;
    }

    public final String[] l() {
        return this.f13681j;
    }

    public final String[] m() {
        return this.f13682k;
    }

    public final String[] n() {
        return this.f13683l;
    }

    public final String[] o() {
        return this.f13684m;
    }

    public final String[] p() {
        return this.f13685n;
    }

    public final String[] q() {
        return this.f13686o;
    }

    public final String[] r() {
        return this.f13687p;
    }

    public final String[] s() {
        return this.f13688q;
    }

    public final String[] t() {
        return this.f13689r;
    }

    public final String[] u() {
        return this.f13690s;
    }

    public final String[] v() {
        return this.f13651C;
    }

    public final String[] w() {
        return this.f13652D;
    }

    public final String[] x() {
        return this.f13653E;
    }

    public final String[] y() {
        return this.f13654F;
    }

    public final Map<Integer, String[]> z() {
        return this.f13655G;
    }

    private void A(String[] strArr) {
        this.f13649A = strArr;
    }

    private void B(String[] strArr) {
        this.f13650B = strArr;
    }

    private void C(String[] strArr) {
        this.f13651C = strArr;
    }

    private void D(String[] strArr) {
        this.f13652D = strArr;
    }

    private void E(String[] strArr) {
        this.f13653E = strArr;
    }

    private void F(String[] strArr) {
        this.f13654F = strArr;
    }

    private void G(String[] strArr) {
        this.f13656H = strArr;
    }

    private void H(String[] strArr) {
        this.f13657I = strArr;
    }

    private void q(String[] strArr) {
        this.f13674b = strArr;
    }

    private void r(String[] strArr) {
        this.f13675c = strArr;
    }

    private void s(String[] strArr) {
        this.f13683l = strArr;
    }

    private void t(String[] strArr) {
        this.f13686o = strArr;
    }

    private void u(String[] strArr) {
        this.f13687p = strArr;
    }

    private void v(String[] strArr) {
        this.f13692u = strArr;
    }

    private void w(String[] strArr) {
        this.f13694w = strArr;
    }

    private void x(String[] strArr) {
        this.f13695x = strArr;
    }

    private void y(String[] strArr) {
        this.f13696y = strArr;
    }

    private void z(String[] strArr) {
        this.f13697z = strArr;
    }

    public final String[] b() {
        return this.f13657I;
    }

    public final String c() {
        return this.f13673a;
    }

    public final String[] d() {
        return this.f13674b;
    }

    public final void e(String[] strArr) {
        this.f13676d = strArr;
    }

    public final void f(String[] strArr) {
        this.f13677e = strArr;
    }

    public final void g(String[] strArr) {
        this.f13678f = strArr;
    }

    public final void h(String[] strArr) {
        this.f13679g = strArr;
    }

    public final void i(String[] strArr) {
        this.f13680h = strArr;
    }

    public final void j(String[] strArr) {
        this.i = strArr;
    }

    public final void k(String[] strArr) {
        this.f13681j = strArr;
    }

    public final void l(String[] strArr) {
        this.f13682k = strArr;
    }

    public final void m(String[] strArr) {
        this.f13684m = strArr;
    }

    public final void n(String[] strArr) {
        this.f13685n = strArr;
    }

    public final void o(String[] strArr) {
        this.f13691t = strArr;
    }

    public final void p(String[] strArr) {
        this.f13693v = strArr;
    }

    public final void a(String[] strArr) {
        this.f13677e = strArr;
    }

    public final String[] a() {
        return this.f13656H;
    }

    private void a(Map<Integer, String[]> map) {
        this.f13655G = map;
    }
}
