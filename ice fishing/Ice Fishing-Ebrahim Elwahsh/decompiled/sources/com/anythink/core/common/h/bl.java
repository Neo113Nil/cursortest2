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
    String[] f13806A;

    /* renamed from: B, reason: collision with root package name */
    String[] f13807B;

    /* renamed from: C, reason: collision with root package name */
    String[] f13808C;

    /* renamed from: D, reason: collision with root package name */
    String[] f13809D;

    /* renamed from: E, reason: collision with root package name */
    String[] f13810E;

    /* renamed from: F, reason: collision with root package name */
    String[] f13811F;

    /* renamed from: G, reason: collision with root package name */
    Map<Integer, String[]> f13812G;

    /* renamed from: H, reason: collision with root package name */
    String[] f13813H;

    /* renamed from: I, reason: collision with root package name */
    String[] f13814I;
    String J;

    /* renamed from: K, reason: collision with root package name */
    String f13815K;

    /* renamed from: L, reason: collision with root package name */
    String f13816L;

    /* renamed from: M, reason: collision with root package name */
    String f13817M;

    /* renamed from: N, reason: collision with root package name */
    String f13818N;

    /* renamed from: O, reason: collision with root package name */
    String f13819O;

    /* renamed from: P, reason: collision with root package name */
    String f13820P;

    /* renamed from: Q, reason: collision with root package name */
    String f13821Q;

    /* renamed from: R, reason: collision with root package name */
    String f13822R;

    /* renamed from: S, reason: collision with root package name */
    String f13823S;

    /* renamed from: T, reason: collision with root package name */
    String f13824T;

    /* renamed from: U, reason: collision with root package name */
    String f13825U;

    /* renamed from: V, reason: collision with root package name */
    String f13826V;

    /* renamed from: W, reason: collision with root package name */
    String f13827W;

    /* renamed from: X, reason: collision with root package name */
    String f13828X;
    String Y;

    /* renamed from: Z, reason: collision with root package name */
    String f13829Z;

    /* renamed from: a, reason: collision with root package name */
    String f13830a;
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
    String[] f13831b;

    /* renamed from: c, reason: collision with root package name */
    String[] f13832c;

    /* renamed from: d, reason: collision with root package name */
    String[] f13833d;

    /* renamed from: e, reason: collision with root package name */
    String[] f13834e;

    /* renamed from: f, reason: collision with root package name */
    String[] f13835f;

    /* renamed from: g, reason: collision with root package name */
    String[] f13836g;

    /* renamed from: h, reason: collision with root package name */
    String[] f13837h;
    String[] i;

    /* renamed from: j, reason: collision with root package name */
    String[] f13838j;

    /* renamed from: k, reason: collision with root package name */
    String[] f13839k;

    /* renamed from: l, reason: collision with root package name */
    String[] f13840l;

    /* renamed from: m, reason: collision with root package name */
    String[] f13841m;

    /* renamed from: n, reason: collision with root package name */
    String[] f13842n;

    /* renamed from: o, reason: collision with root package name */
    String[] f13843o;

    /* renamed from: p, reason: collision with root package name */
    String[] f13844p;

    /* renamed from: q, reason: collision with root package name */
    String[] f13845q;

    /* renamed from: r, reason: collision with root package name */
    String[] f13846r;

    /* renamed from: s, reason: collision with root package name */
    String[] f13847s;

    /* renamed from: t, reason: collision with root package name */
    String[] f13848t;

    /* renamed from: u, reason: collision with root package name */
    String[] f13849u;

    /* renamed from: v, reason: collision with root package name */
    String[] f13850v;

    /* renamed from: w, reason: collision with root package name */
    String[] f13851w;

    /* renamed from: x, reason: collision with root package name */
    String[] f13852x;

    /* renamed from: y, reason: collision with root package name */
    String[] f13853y;

    /* renamed from: z, reason: collision with root package name */
    String[] f13854z;

    public static final bl a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            bl blVar = new bl();
            blVar.f13830a = jSONObject.optString("ks");
            blVar.f13831b = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("nurl"));
            blVar.f13832c = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("lurl"));
            blVar.f13833d = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("imp"));
            blVar.f13834e = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("click"));
            blVar.f13835f = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vstart"));
            blVar.f13836g = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v25"));
            blVar.f13837h = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v50"));
            blVar.i = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v75"));
            blVar.f13838j = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v100"));
            blVar.f13839k = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vpaused"));
            blVar.f13840l = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vclick"));
            blVar.f13841m = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vmute"));
            blVar.f13842n = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vunmute"));
            blVar.f13843o = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_show"));
            blVar.f13844p = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_close"));
            blVar.f13845q = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_star"));
            blVar.f13846r = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_end"));
            blVar.f13847s = com.anythink.core.common.v.q.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.j.db));
            blVar.f13848t = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vresumed"));
            blVar.f13849u = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vskip"));
            blVar.f13850v = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vfail"));
            blVar.f13851w = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_start_install"));
            blVar.f13852x = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_start"));
            blVar.f13853y = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_succ"));
            blVar.f13854z = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_install"));
            blVar.f13806A = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_uninstall"));
            blVar.f13807B = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_unknow"));
            blVar.f13809D = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_inst_fail"));
            blVar.f13808C = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_uninst_fail"));
            blVar.f13810E = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vd_succ"));
            blVar.f13811F = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray optJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (optJSONArray != null) {
                blVar.f13812G = new HashMap();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("play_sec");
                    blVar.f13812G.put(Integer.valueOf(optInt), com.anythink.core.common.v.q.a(optJSONObject.optJSONArray("list")));
                }
            }
            blVar.f13813H = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_success"));
            blVar.f13814I = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_fail"));
            blVar.J = jSONObject.optString("tp_nurl");
            blVar.f13815K = jSONObject.optString("tp_imp");
            blVar.f13816L = jSONObject.optString("tp_click");
            blVar.f13817M = jSONObject.optString("tp_vstart");
            blVar.f13818N = jSONObject.optString("tp_v25");
            blVar.f13819O = jSONObject.optString("tp_v50");
            blVar.f13820P = jSONObject.optString("tp_v75");
            blVar.f13821Q = jSONObject.optString("tp_v100");
            blVar.f13822R = jSONObject.optString("tp_vpaused");
            blVar.f13823S = jSONObject.optString("tp_vclick");
            blVar.f13824T = jSONObject.optString("tp_vmute");
            blVar.f13825U = jSONObject.optString("tp_vunmute");
            blVar.f13826V = jSONObject.optString("tp_ec_show");
            blVar.f13827W = jSONObject.optString("tp_ec_close");
            blVar.f13828X = jSONObject.optString("tp_apk_dl_star");
            blVar.Y = jSONObject.optString("tp_apk_dl_end");
            blVar.f13829Z = jSONObject.optString("tp_apk_install");
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
        return this.f13815K;
    }

    public final String C() {
        return this.f13816L;
    }

    public final String D() {
        return this.f13817M;
    }

    public final String E() {
        return this.f13818N;
    }

    public final String F() {
        return this.f13819O;
    }

    public final String G() {
        return this.f13820P;
    }

    public final String H() {
        return this.f13821Q;
    }

    public final String I() {
        return this.f13822R;
    }

    public final String J() {
        return this.f13823S;
    }

    public final String K() {
        return this.f13824T;
    }

    public final String L() {
        return this.f13825U;
    }

    public final String M() {
        return this.f13826V;
    }

    public final String N() {
        return this.f13827W;
    }

    public final String O() {
        return this.f13828X;
    }

    public final String P() {
        return this.Y;
    }

    public final String Q() {
        return this.f13829Z;
    }

    public final String[] R() {
        return this.f13848t;
    }

    public final String[] S() {
        return this.f13849u;
    }

    public final String[] T() {
        return this.f13850v;
    }

    public final String[] U() {
        return this.f13851w;
    }

    public final String[] V() {
        return this.f13852x;
    }

    public final String[] W() {
        return this.f13853y;
    }

    public final String[] X() {
        return this.f13854z;
    }

    public final String[] Y() {
        return this.f13806A;
    }

    public final String[] Z() {
        return this.f13807B;
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
        this.f13845q = strArr;
    }

    public final void c(String[] strArr) {
        this.f13846r = strArr;
    }

    public final void d(String[] strArr) {
        this.f13847s = strArr;
    }

    public final String[] e() {
        return this.f13832c;
    }

    public final String[] f() {
        return this.f13833d;
    }

    public final String[] g() {
        return this.f13834e;
    }

    public final String[] h() {
        return this.f13835f;
    }

    public final String[] i() {
        return this.f13836g;
    }

    public final String[] j() {
        return this.f13837h;
    }

    public final String[] k() {
        return this.i;
    }

    public final String[] l() {
        return this.f13838j;
    }

    public final String[] m() {
        return this.f13839k;
    }

    public final String[] n() {
        return this.f13840l;
    }

    public final String[] o() {
        return this.f13841m;
    }

    public final String[] p() {
        return this.f13842n;
    }

    public final String[] q() {
        return this.f13843o;
    }

    public final String[] r() {
        return this.f13844p;
    }

    public final String[] s() {
        return this.f13845q;
    }

    public final String[] t() {
        return this.f13846r;
    }

    public final String[] u() {
        return this.f13847s;
    }

    public final String[] v() {
        return this.f13808C;
    }

    public final String[] w() {
        return this.f13809D;
    }

    public final String[] x() {
        return this.f13810E;
    }

    public final String[] y() {
        return this.f13811F;
    }

    public final Map<Integer, String[]> z() {
        return this.f13812G;
    }

    private void A(String[] strArr) {
        this.f13806A = strArr;
    }

    private void B(String[] strArr) {
        this.f13807B = strArr;
    }

    private void C(String[] strArr) {
        this.f13808C = strArr;
    }

    private void D(String[] strArr) {
        this.f13809D = strArr;
    }

    private void E(String[] strArr) {
        this.f13810E = strArr;
    }

    private void F(String[] strArr) {
        this.f13811F = strArr;
    }

    private void G(String[] strArr) {
        this.f13813H = strArr;
    }

    private void H(String[] strArr) {
        this.f13814I = strArr;
    }

    private void q(String[] strArr) {
        this.f13831b = strArr;
    }

    private void r(String[] strArr) {
        this.f13832c = strArr;
    }

    private void s(String[] strArr) {
        this.f13840l = strArr;
    }

    private void t(String[] strArr) {
        this.f13843o = strArr;
    }

    private void u(String[] strArr) {
        this.f13844p = strArr;
    }

    private void v(String[] strArr) {
        this.f13849u = strArr;
    }

    private void w(String[] strArr) {
        this.f13851w = strArr;
    }

    private void x(String[] strArr) {
        this.f13852x = strArr;
    }

    private void y(String[] strArr) {
        this.f13853y = strArr;
    }

    private void z(String[] strArr) {
        this.f13854z = strArr;
    }

    public final String[] b() {
        return this.f13814I;
    }

    public final String c() {
        return this.f13830a;
    }

    public final String[] d() {
        return this.f13831b;
    }

    public final void e(String[] strArr) {
        this.f13833d = strArr;
    }

    public final void f(String[] strArr) {
        this.f13834e = strArr;
    }

    public final void g(String[] strArr) {
        this.f13835f = strArr;
    }

    public final void h(String[] strArr) {
        this.f13836g = strArr;
    }

    public final void i(String[] strArr) {
        this.f13837h = strArr;
    }

    public final void j(String[] strArr) {
        this.i = strArr;
    }

    public final void k(String[] strArr) {
        this.f13838j = strArr;
    }

    public final void l(String[] strArr) {
        this.f13839k = strArr;
    }

    public final void m(String[] strArr) {
        this.f13841m = strArr;
    }

    public final void n(String[] strArr) {
        this.f13842n = strArr;
    }

    public final void o(String[] strArr) {
        this.f13848t = strArr;
    }

    public final void p(String[] strArr) {
        this.f13850v = strArr;
    }

    public final void a(String[] strArr) {
        this.f13834e = strArr;
    }

    public final String[] a() {
        return this.f13813H;
    }

    private void a(Map<Integer, String[]> map) {
        this.f13812G = map;
    }
}
