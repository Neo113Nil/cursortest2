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
    String[] f14435A;

    /* renamed from: B, reason: collision with root package name */
    String[] f14436B;

    /* renamed from: C, reason: collision with root package name */
    String[] f14437C;

    /* renamed from: D, reason: collision with root package name */
    String[] f14438D;

    /* renamed from: E, reason: collision with root package name */
    String[] f14439E;

    /* renamed from: F, reason: collision with root package name */
    String[] f14440F;

    /* renamed from: G, reason: collision with root package name */
    Map<Integer, String[]> f14441G;

    /* renamed from: H, reason: collision with root package name */
    String[] f14442H;

    /* renamed from: I, reason: collision with root package name */
    String[] f14443I;
    String J;

    /* renamed from: K, reason: collision with root package name */
    String f14444K;

    /* renamed from: L, reason: collision with root package name */
    String f14445L;

    /* renamed from: M, reason: collision with root package name */
    String f14446M;

    /* renamed from: N, reason: collision with root package name */
    String f14447N;

    /* renamed from: O, reason: collision with root package name */
    String f14448O;

    /* renamed from: P, reason: collision with root package name */
    String f14449P;

    /* renamed from: Q, reason: collision with root package name */
    String f14450Q;

    /* renamed from: R, reason: collision with root package name */
    String f14451R;

    /* renamed from: S, reason: collision with root package name */
    String f14452S;

    /* renamed from: T, reason: collision with root package name */
    String f14453T;

    /* renamed from: U, reason: collision with root package name */
    String f14454U;

    /* renamed from: V, reason: collision with root package name */
    String f14455V;

    /* renamed from: W, reason: collision with root package name */
    String f14456W;

    /* renamed from: X, reason: collision with root package name */
    String f14457X;
    String Y;

    /* renamed from: Z, reason: collision with root package name */
    String f14458Z;

    /* renamed from: a, reason: collision with root package name */
    String f14459a;
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
    String[] f14460b;

    /* renamed from: c, reason: collision with root package name */
    String[] f14461c;

    /* renamed from: d, reason: collision with root package name */
    String[] f14462d;

    /* renamed from: e, reason: collision with root package name */
    String[] f14463e;

    /* renamed from: f, reason: collision with root package name */
    String[] f14464f;

    /* renamed from: g, reason: collision with root package name */
    String[] f14465g;

    /* renamed from: h, reason: collision with root package name */
    String[] f14466h;
    String[] i;

    /* renamed from: j, reason: collision with root package name */
    String[] f14467j;

    /* renamed from: k, reason: collision with root package name */
    String[] f14468k;

    /* renamed from: l, reason: collision with root package name */
    String[] f14469l;

    /* renamed from: m, reason: collision with root package name */
    String[] f14470m;

    /* renamed from: n, reason: collision with root package name */
    String[] f14471n;

    /* renamed from: o, reason: collision with root package name */
    String[] f14472o;

    /* renamed from: p, reason: collision with root package name */
    String[] f14473p;

    /* renamed from: q, reason: collision with root package name */
    String[] f14474q;

    /* renamed from: r, reason: collision with root package name */
    String[] f14475r;

    /* renamed from: s, reason: collision with root package name */
    String[] f14476s;

    /* renamed from: t, reason: collision with root package name */
    String[] f14477t;

    /* renamed from: u, reason: collision with root package name */
    String[] f14478u;

    /* renamed from: v, reason: collision with root package name */
    String[] f14479v;

    /* renamed from: w, reason: collision with root package name */
    String[] f14480w;

    /* renamed from: x, reason: collision with root package name */
    String[] f14481x;

    /* renamed from: y, reason: collision with root package name */
    String[] f14482y;

    /* renamed from: z, reason: collision with root package name */
    String[] f14483z;

    public static final bl a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            bl blVar = new bl();
            blVar.f14459a = jSONObject.optString("ks");
            blVar.f14460b = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("nurl"));
            blVar.f14461c = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("lurl"));
            blVar.f14462d = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("imp"));
            blVar.f14463e = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("click"));
            blVar.f14464f = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vstart"));
            blVar.f14465g = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v25"));
            blVar.f14466h = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v50"));
            blVar.i = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v75"));
            blVar.f14467j = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("v100"));
            blVar.f14468k = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vpaused"));
            blVar.f14469l = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vclick"));
            blVar.f14470m = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vmute"));
            blVar.f14471n = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vunmute"));
            blVar.f14472o = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_show"));
            blVar.f14473p = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("ec_close"));
            blVar.f14474q = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_star"));
            blVar.f14475r = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_dl_end"));
            blVar.f14476s = com.anythink.core.common.v.q.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.j.db));
            blVar.f14477t = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vresumed"));
            blVar.f14478u = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vskip"));
            blVar.f14479v = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vfail"));
            blVar.f14480w = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("apk_start_install"));
            blVar.f14481x = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_start"));
            blVar.f14482y = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_succ"));
            blVar.f14483z = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_install"));
            blVar.f14435A = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_uninstall"));
            blVar.f14436B = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("app_unknow"));
            blVar.f14438D = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_inst_fail"));
            blVar.f14437C = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("dp_uninst_fail"));
            blVar.f14439E = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vd_succ"));
            blVar.f14440F = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray optJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (optJSONArray != null) {
                blVar.f14441G = new HashMap();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("play_sec");
                    blVar.f14441G.put(Integer.valueOf(optInt), com.anythink.core.common.v.q.a(optJSONObject.optJSONArray("list")));
                }
            }
            blVar.f14442H = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_success"));
            blVar.f14443I = com.anythink.core.common.v.q.a(jSONObject.optJSONArray("load_fail"));
            blVar.J = jSONObject.optString("tp_nurl");
            blVar.f14444K = jSONObject.optString("tp_imp");
            blVar.f14445L = jSONObject.optString("tp_click");
            blVar.f14446M = jSONObject.optString("tp_vstart");
            blVar.f14447N = jSONObject.optString("tp_v25");
            blVar.f14448O = jSONObject.optString("tp_v50");
            blVar.f14449P = jSONObject.optString("tp_v75");
            blVar.f14450Q = jSONObject.optString("tp_v100");
            blVar.f14451R = jSONObject.optString("tp_vpaused");
            blVar.f14452S = jSONObject.optString("tp_vclick");
            blVar.f14453T = jSONObject.optString("tp_vmute");
            blVar.f14454U = jSONObject.optString("tp_vunmute");
            blVar.f14455V = jSONObject.optString("tp_ec_show");
            blVar.f14456W = jSONObject.optString("tp_ec_close");
            blVar.f14457X = jSONObject.optString("tp_apk_dl_star");
            blVar.Y = jSONObject.optString("tp_apk_dl_end");
            blVar.f14458Z = jSONObject.optString("tp_apk_install");
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
        return this.f14444K;
    }

    public final String C() {
        return this.f14445L;
    }

    public final String D() {
        return this.f14446M;
    }

    public final String E() {
        return this.f14447N;
    }

    public final String F() {
        return this.f14448O;
    }

    public final String G() {
        return this.f14449P;
    }

    public final String H() {
        return this.f14450Q;
    }

    public final String I() {
        return this.f14451R;
    }

    public final String J() {
        return this.f14452S;
    }

    public final String K() {
        return this.f14453T;
    }

    public final String L() {
        return this.f14454U;
    }

    public final String M() {
        return this.f14455V;
    }

    public final String N() {
        return this.f14456W;
    }

    public final String O() {
        return this.f14457X;
    }

    public final String P() {
        return this.Y;
    }

    public final String Q() {
        return this.f14458Z;
    }

    public final String[] R() {
        return this.f14477t;
    }

    public final String[] S() {
        return this.f14478u;
    }

    public final String[] T() {
        return this.f14479v;
    }

    public final String[] U() {
        return this.f14480w;
    }

    public final String[] V() {
        return this.f14481x;
    }

    public final String[] W() {
        return this.f14482y;
    }

    public final String[] X() {
        return this.f14483z;
    }

    public final String[] Y() {
        return this.f14435A;
    }

    public final String[] Z() {
        return this.f14436B;
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
        this.f14474q = strArr;
    }

    public final void c(String[] strArr) {
        this.f14475r = strArr;
    }

    public final void d(String[] strArr) {
        this.f14476s = strArr;
    }

    public final String[] e() {
        return this.f14461c;
    }

    public final String[] f() {
        return this.f14462d;
    }

    public final String[] g() {
        return this.f14463e;
    }

    public final String[] h() {
        return this.f14464f;
    }

    public final String[] i() {
        return this.f14465g;
    }

    public final String[] j() {
        return this.f14466h;
    }

    public final String[] k() {
        return this.i;
    }

    public final String[] l() {
        return this.f14467j;
    }

    public final String[] m() {
        return this.f14468k;
    }

    public final String[] n() {
        return this.f14469l;
    }

    public final String[] o() {
        return this.f14470m;
    }

    public final String[] p() {
        return this.f14471n;
    }

    public final String[] q() {
        return this.f14472o;
    }

    public final String[] r() {
        return this.f14473p;
    }

    public final String[] s() {
        return this.f14474q;
    }

    public final String[] t() {
        return this.f14475r;
    }

    public final String[] u() {
        return this.f14476s;
    }

    public final String[] v() {
        return this.f14437C;
    }

    public final String[] w() {
        return this.f14438D;
    }

    public final String[] x() {
        return this.f14439E;
    }

    public final String[] y() {
        return this.f14440F;
    }

    public final Map<Integer, String[]> z() {
        return this.f14441G;
    }

    private void A(String[] strArr) {
        this.f14435A = strArr;
    }

    private void B(String[] strArr) {
        this.f14436B = strArr;
    }

    private void C(String[] strArr) {
        this.f14437C = strArr;
    }

    private void D(String[] strArr) {
        this.f14438D = strArr;
    }

    private void E(String[] strArr) {
        this.f14439E = strArr;
    }

    private void F(String[] strArr) {
        this.f14440F = strArr;
    }

    private void G(String[] strArr) {
        this.f14442H = strArr;
    }

    private void H(String[] strArr) {
        this.f14443I = strArr;
    }

    private void q(String[] strArr) {
        this.f14460b = strArr;
    }

    private void r(String[] strArr) {
        this.f14461c = strArr;
    }

    private void s(String[] strArr) {
        this.f14469l = strArr;
    }

    private void t(String[] strArr) {
        this.f14472o = strArr;
    }

    private void u(String[] strArr) {
        this.f14473p = strArr;
    }

    private void v(String[] strArr) {
        this.f14478u = strArr;
    }

    private void w(String[] strArr) {
        this.f14480w = strArr;
    }

    private void x(String[] strArr) {
        this.f14481x = strArr;
    }

    private void y(String[] strArr) {
        this.f14482y = strArr;
    }

    private void z(String[] strArr) {
        this.f14483z = strArr;
    }

    public final String[] b() {
        return this.f14443I;
    }

    public final String c() {
        return this.f14459a;
    }

    public final String[] d() {
        return this.f14460b;
    }

    public final void e(String[] strArr) {
        this.f14462d = strArr;
    }

    public final void f(String[] strArr) {
        this.f14463e = strArr;
    }

    public final void g(String[] strArr) {
        this.f14464f = strArr;
    }

    public final void h(String[] strArr) {
        this.f14465g = strArr;
    }

    public final void i(String[] strArr) {
        this.f14466h = strArr;
    }

    public final void j(String[] strArr) {
        this.i = strArr;
    }

    public final void k(String[] strArr) {
        this.f14467j = strArr;
    }

    public final void l(String[] strArr) {
        this.f14468k = strArr;
    }

    public final void m(String[] strArr) {
        this.f14470m = strArr;
    }

    public final void n(String[] strArr) {
        this.f14471n = strArr;
    }

    public final void o(String[] strArr) {
        this.f14477t = strArr;
    }

    public final void p(String[] strArr) {
        this.f14479v = strArr;
    }

    public final void a(String[] strArr) {
        this.f14463e = strArr;
    }

    public final String[] a() {
        return this.f14442H;
    }

    private void a(Map<Integer, String[]> map) {
        this.f14441G = map;
    }
}
