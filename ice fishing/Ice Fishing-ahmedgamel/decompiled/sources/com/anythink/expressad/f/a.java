package com.anythink.expressad.f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    private int f19121A;

    /* renamed from: B, reason: collision with root package name */
    private String f19122B;

    /* renamed from: C, reason: collision with root package name */
    private long f19123C;

    /* renamed from: D, reason: collision with root package name */
    private int f19124D;

    /* renamed from: E, reason: collision with root package name */
    private long f19125E;

    /* renamed from: F, reason: collision with root package name */
    private long f19126F;

    /* renamed from: G, reason: collision with root package name */
    private int f19127G;

    /* renamed from: H, reason: collision with root package name */
    private int f19128H;

    /* renamed from: I, reason: collision with root package name */
    private int f19129I;
    private String J;

    /* renamed from: K, reason: collision with root package name */
    private String f19130K;

    /* renamed from: L, reason: collision with root package name */
    private int f19131L;

    /* renamed from: M, reason: collision with root package name */
    private List<d> f19132M;

    /* renamed from: N, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.c> f19133N;

    /* renamed from: R, reason: collision with root package name */
    private int f19137R;

    /* renamed from: S, reason: collision with root package name */
    private LinkedList<String> f19138S;
    private int Y;

    /* renamed from: Z, reason: collision with root package name */
    private List<String> f19144Z;
    private int aE;
    private long aG;
    private long aH;
    private int aI;
    private int aJ;
    private long aK;
    private int aM;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private String ae;
    private String af;
    private String ao;

    /* renamed from: b, reason: collision with root package name */
    private String f19146b;
    private Map<String, C0118a> be;
    private b bg;
    private String bl;
    private String bm;

    /* renamed from: c, reason: collision with root package name */
    private long f19147c;

    /* renamed from: d, reason: collision with root package name */
    private int f19148d;

    /* renamed from: f, reason: collision with root package name */
    private int f19150f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19151g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f19152h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private long f19153j;

    /* renamed from: l, reason: collision with root package name */
    private List<c> f19155l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19156m;

    /* renamed from: n, reason: collision with root package name */
    private long f19157n;

    /* renamed from: o, reason: collision with root package name */
    private long f19158o;

    /* renamed from: p, reason: collision with root package name */
    private long f19159p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19160q;

    /* renamed from: r, reason: collision with root package name */
    private int f19161r;

    /* renamed from: s, reason: collision with root package name */
    private int f19162s;

    /* renamed from: t, reason: collision with root package name */
    private int f19163t;

    /* renamed from: u, reason: collision with root package name */
    private long f19164u;

    /* renamed from: v, reason: collision with root package name */
    private List<String> f19165v;

    /* renamed from: w, reason: collision with root package name */
    private int f19166w;

    /* renamed from: x, reason: collision with root package name */
    private int f19167x;

    /* renamed from: y, reason: collision with root package name */
    private int f19168y;

    /* renamed from: z, reason: collision with root package name */
    private int f19169z;

    /* renamed from: a, reason: collision with root package name */
    private int f19145a = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f19149e = 86400;

    /* renamed from: k, reason: collision with root package name */
    private String f19154k = "";

    /* renamed from: O, reason: collision with root package name */
    private boolean f19134O = false;

    /* renamed from: P, reason: collision with root package name */
    private int f19135P = 3;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f19136Q = true;

    /* renamed from: T, reason: collision with root package name */
    private int f19139T = 0;

    /* renamed from: U, reason: collision with root package name */
    private int f19140U = com.anythink.expressad.f.a.b.cl;

    /* renamed from: V, reason: collision with root package name */
    private int f19141V = 10;

    /* renamed from: W, reason: collision with root package name */
    private int f19142W = 120;

    /* renamed from: X, reason: collision with root package name */
    private String f19143X = "";
    private int ag = 1;
    private int ah = 1;
    private int ai = 1;
    private int aj = 0;
    private int ak = 1;
    private String al = "";
    private int am = 0;
    private int an = 2;
    private int ap = 86400;
    private String aq = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKAJ7eXHM==";
    private String ar = "LdxThdi1WBK\\/WgfPhbxQYkeXHBPwHZKsYFh=";
    private int as = 1;
    private int at = 30;
    private int au = 5;
    private int av = 0;
    private int aw = 0;
    private int ax = j.g.b.f13259a;
    private int ay = 0;
    private int az = 0;
    private int aA = 0;
    private int aB = 2;
    private int aC = 10;
    private List<Integer> aD = new ArrayList();
    private int aF = 1;
    private int aL = 3;
    private String aN = "";
    private String aO = "";
    private String aP = "";
    private String aQ = "";
    private String aR = "";
    private int aS = 0;
    private int aT = 21600;
    private int aU = 2;
    private int aV = 0;
    private int aW = 0;
    private int aX = 604800;
    private int aY = 0;
    private String aZ = "";
    private String ba = "";
    private String bb = "";
    private String bc = "";
    private String bd = "";
    private int bf = 0;
    private int bh = 0;
    private String bi = "";
    private int bj = 2;
    private int bk = 7200;
    private int bn = 0;
    private boolean bo = false;
    private int bp = 1;
    private int bq = 0;
    private int br = 0;
    private int bs = 0;
    private int bt = 3;
    private int bu = 600;
    private int bv = 10;

    /* renamed from: com.anythink.expressad.f.a$a, reason: collision with other inner class name */
    public static class C0118a {

        /* renamed from: a, reason: collision with root package name */
        private List<String> f19170a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f19171b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f19172c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f19173d;

        private List<String> a() {
            return this.f19170a;
        }

        private List<String> b() {
            return this.f19171b;
        }

        private List<String> c() {
            return this.f19172c;
        }

        private List<String> d() {
            return this.f19173d;
        }

        private void a(List<String> list) {
            this.f19170a = list;
        }

        private void b(List<String> list) {
            this.f19171b = list;
        }

        private void c(List<String> list) {
            this.f19172c = list;
        }

        private void d(List<String> list) {
            this.f19173d = list;
        }

        public final void a(JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("x");
                if (optJSONArray != null) {
                    this.f19170a = i.a(optJSONArray);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("y");
                if (optJSONArray2 != null) {
                    this.f19171b = i.a(optJSONArray2);
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("width");
                if (optJSONArray3 != null) {
                    this.f19172c = i.a(optJSONArray3);
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("height");
                if (optJSONArray4 != null) {
                    this.f19173d = i.a(optJSONArray4);
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f18405a) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f19223a;

        /* renamed from: b, reason: collision with root package name */
        private String f19224b;

        /* renamed from: c, reason: collision with root package name */
        private String f19225c;

        /* renamed from: d, reason: collision with root package name */
        private JSONArray f19226d;

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context g9 = t.b().g();
            bVar.f19223a = jSONObject.optString("title", g9.getString(k.a(g9, "anythink_cm_feedback_dialog_title", k.f20423g)));
            bVar.f19224b = jSONObject.optString(com.anythink.expressad.f.a.b.dP, g9.getString(k.a(g9, "anythink_cm_feedback_dialog_close_close", k.f20423g)));
            bVar.f19225c = jSONObject.optString(com.anythink.expressad.f.a.b.dQ, g9.getString(k.a(g9, "anythink_cm_feedback_dialog_close_submit", k.f20423g)));
            JSONArray optJSONArray = jSONObject.optJSONArray("content");
            bVar.f19226d = optJSONArray;
            if (optJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f19226d = jSONArray;
                jSONArray.put(g9.getString(k.a(g9, "anythink_cm_feedback_dialog_content_stuck", k.f20423g)));
                bVar.f19226d.put(g9.getString(k.a(g9, "anythink_cm_feedback_dialog_content_cnr", k.f20423g)));
                bVar.f19226d.put(g9.getString(k.a(g9, "anythink_cm_feedback_dialog_content_balck_screen", k.f20423g)));
                bVar.f19226d.put(g9.getString(k.a(g9, "anythink_cm_feedback_dialog_content_other", k.f20423g)));
            }
            return bVar;
        }

        public final String b() {
            return this.f19224b;
        }

        public final String c() {
            return this.f19225c;
        }

        public final JSONArray d() {
            return this.f19226d;
        }

        private void b(String str) {
            this.f19224b = str;
        }

        private void c(String str) {
            this.f19225c = str;
        }

        public final String a() {
            return this.f19223a;
        }

        private void a(String str) {
            this.f19223a = str;
        }

        private void a(JSONArray jSONArray) {
            this.f19226d = jSONArray;
        }
    }

    private void A(int i) {
        this.f19163t = i;
    }

    private void B(int i) {
        this.f19121A = i;
    }

    private void C(int i) {
        this.f19167x = i;
    }

    private void D(int i) {
        this.f19168y = i;
    }

    private void E(int i) {
        this.f19169z = i;
    }

    private void F(int i) {
        this.aL = i;
    }

    private void G(int i) {
        this.aI = i;
    }

    private void H(int i) {
        this.aJ = i;
    }

    private void I(int i) {
        this.f19150f = i;
    }

    private void J(int i) {
        this.f19161r = i;
    }

    private void K(int i) {
        this.f19162s = i;
    }

    private void L(int i) {
        this.aY = i;
    }

    private void M(int i) {
        this.aS = i;
    }

    private void N(int i) {
        this.aT = i;
    }

    private void O(int i) {
        this.aU = i;
    }

    private void P(int i) {
        this.aV = i;
    }

    private void Q(int i) {
        this.aW = i;
    }

    private void R(int i) {
        this.aX = i;
    }

    private void S(int i) {
        this.at = i;
    }

    private void T(int i) {
        this.au = i;
    }

    private void U(int i) {
        this.av = i;
    }

    private void V(int i) {
        this.aw = i;
    }

    private int W() {
        return this.f19137R;
    }

    private List<com.anythink.expressad.foundation.d.c> X() {
        return this.f19133N;
    }

    private String Y() {
        return this.f19143X;
    }

    private int Z() {
        return this.f19141V;
    }

    private int aA() {
        return this.Y;
    }

    private List<String> aB() {
        return this.f19144Z;
    }

    private int aC() {
        return this.aa;
    }

    private int aD() {
        return this.ab;
    }

    private int aE() {
        return this.ac;
    }

    private int aF() {
        return this.ad;
    }

    private String aG() {
        return this.ae;
    }

    private int aH() {
        return this.f19127G;
    }

    private int aI() {
        return this.f19128H;
    }

    private List<d> aJ() {
        return this.f19132M;
    }

    private int aK() {
        return this.f19129I;
    }

    private String aL() {
        return this.J;
    }

    private int aM() {
        return this.f19124D;
    }

    private long aN() {
        return this.f19125E;
    }

    private long aO() {
        return this.f19126F;
    }

    private long aP() {
        return this.f19123C * 1000;
    }

    private int aQ() {
        return this.f19163t;
    }

    private String aR() {
        return this.f19122B;
    }

    private int aS() {
        return this.f19167x;
    }

    private int aT() {
        return this.f19168y;
    }

    private int aU() {
        return this.f19169z;
    }

    private int aV() {
        return this.aL;
    }

    private long aW() {
        return this.aK;
    }

    private int aX() {
        return this.aI;
    }

    private int aY() {
        return this.aJ;
    }

    private long aZ() {
        return this.aG * 1000;
    }

    private LinkedList<String> aa() {
        return this.f19138S;
    }

    private int ab() {
        return this.f19145a;
    }

    private int ac() {
        return this.f19139T;
    }

    private int ad() {
        return this.f19140U * 1000;
    }

    private int ae() {
        return this.aC;
    }

    private int af() {
        return this.ay;
    }

    private int ag() {
        return this.az;
    }

    private int ah() {
        return this.aA;
    }

    private int ai() {
        return this.aB;
    }

    private int aj() {
        return this.as;
    }

    private String ak() {
        return this.aq;
    }

    private String al() {
        return this.ar;
    }

    private int am() {
        return this.ap;
    }

    private int an() {
        return this.an;
    }

    private String ao() {
        return this.ao;
    }

    private int ap() {
        return this.ag;
    }

    private int aq() {
        return this.ah;
    }

    private int ar() {
        return this.ai;
    }

    private int as() {
        return this.aj;
    }

    private int at() {
        return this.ak;
    }

    private String au() {
        return this.al;
    }

    private int av() {
        return this.am;
    }

    private int aw() {
        return this.f19131L;
    }

    private String ax() {
        return this.f19130K;
    }

    private int ay() {
        return this.aF;
    }

    private int az() {
        return this.aE;
    }

    private String bA() {
        return this.bc;
    }

    private String bB() {
        return this.bd;
    }

    private Map<String, C0118a> bC() {
        return this.be;
    }

    private boolean bD() {
        return (TextUtils.isEmpty(this.aZ) || TextUtils.isEmpty(this.bb) || TextUtils.isEmpty(this.ba)) ? false : true;
    }

    private int bE() {
        return this.at;
    }

    private int bF() {
        return this.au;
    }

    private int bG() {
        return this.av;
    }

    private int bH() {
        return this.aw;
    }

    private int bI() {
        return this.ax;
    }

    private boolean bJ() {
        return this.f19134O;
    }

    private int bK() {
        return this.f19135P;
    }

    private boolean bL() {
        return this.f19136Q;
    }

    private int bM() {
        return this.bh;
    }

    private String bN() {
        return this.bi;
    }

    private int bO() {
        return this.bj;
    }

    private int bP() {
        return this.bk;
    }

    private String bQ() {
        return this.bl;
    }

    private String bR() {
        return this.bm;
    }

    private int bS() {
        return this.bn;
    }

    private boolean bT() {
        return this.bo;
    }

    private int bU() {
        return this.bq;
    }

    private long ba() {
        return this.f19159p;
    }

    private long bb() {
        return this.f19158o;
    }

    private long bc() {
        return this.f19147c;
    }

    private int bd() {
        return this.f19148d;
    }

    private long be() {
        return this.f19149e;
    }

    private int bf() {
        return this.f19150f;
    }

    private List<c> bg() {
        return this.f19155l;
    }

    private String bh() {
        return this.af;
    }

    private String bi() {
        return this.f19154k;
    }

    private long bj() {
        return this.f19153j;
    }

    private Map<String, String> bk() {
        return this.f19152h;
    }

    private boolean bl() {
        return this.f19151g;
    }

    private boolean bm() {
        return this.i;
    }

    private int bn() {
        return this.f19161r;
    }

    private int bo() {
        return this.f19162s;
    }

    private static boolean bp() {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            a b9 = com.anythink.expressad.f.b.b();
            if (b9 != null) {
                return b9.f19151g;
            }
            return true;
        } catch (Exception e9) {
            e9.printStackTrace();
            return true;
        }
    }

    private String bq() {
        return this.aQ;
    }

    private boolean br() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) ? false : true;
    }

    private boolean bs() {
        return (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) ? false : true;
    }

    private int bt() {
        return this.aY;
    }

    private int bu() {
        return this.aS;
    }

    private int bv() {
        return this.aT;
    }

    private int bw() {
        return this.aU;
    }

    private int bx() {
        return this.aV;
    }

    private int by() {
        return this.aW;
    }

    private int bz() {
        return this.aX;
    }

    private void e(String str) {
        this.f19143X = str;
    }

    private void g(int i) {
        this.f19141V = i;
    }

    private void h(int i) {
        this.f19139T = i;
    }

    private void i(int i) {
        this.f19140U = i;
    }

    private void j(int i) {
        this.aD.add(Integer.valueOf(i));
    }

    private boolean k(int i) {
        return this.aD.contains(Integer.valueOf(i));
    }

    private void l(int i) {
        this.as = i;
    }

    private void m(int i) {
        this.ap = i;
    }

    private void n(int i) {
        this.an = i;
    }

    private void o(int i) {
        this.aF = i;
    }

    private void p(int i) {
        this.aE = i;
    }

    private void q(int i) {
        this.Y = i;
    }

    private void r(int i) {
        this.aa = i;
    }

    private void s(int i) {
        this.ab = i;
    }

    private void t(int i) {
        this.ac = i;
    }

    private void u(int i) {
        this.ad = i;
    }

    private void v(int i) {
        this.f19127G = i;
    }

    private void w(int i) {
        this.f19128H = i;
    }

    private void x(int i) {
        this.f19129I = i;
    }

    private void y(int i) {
        this.f19124D = i;
    }

    private void z(int i) {
        this.f19126F = i;
    }

    public final void a() {
        this.f19137R = 10;
    }

    public final int b() {
        return this.f19142W;
    }

    public final void c() {
        this.f19145a = 0;
    }

    public final void d(int i) {
        this.az = i;
    }

    public final void f(int i) {
        this.aB = i;
    }

    public final String toString() {
        return "cc=" + this.f19146b + " upal=" + this.f19147c + " cfc=" + this.f19148d + " getpf=" + this.f19149e + " uplc=" + this.f19150f + " rurl=" + this.f19156m;
    }

    private void W(int i) {
        this.ax = i;
    }

    private void X(int i) {
        this.f19135P = i;
    }

    private void Y(int i) {
        this.bf = i;
    }

    private void Z(int i) {
        this.bh = i;
    }

    private void aa(int i) {
        this.bj = i;
    }

    private void ab(int i) {
        this.bk = i;
    }

    private void ac(int i) {
        this.bp = i;
    }

    private void ad(int i) {
        this.br = i;
    }

    private void ae(int i) {
        this.bs = i;
    }

    private void af(int i) {
        this.bt = i;
    }

    private void ag(int i) {
        this.bu = i;
    }

    private void ah(int i) {
        this.bv = i;
    }

    private void f(String str) {
        this.aq = str;
    }

    private void g(String str) {
        this.ar = str;
    }

    private void h(String str) {
        this.ao = str;
    }

    private void i(String str) {
        this.al = str;
    }

    private void k(String str) {
        this.J = str;
    }

    private void l(String str) {
        this.f19122B = str;
    }

    public final void A() {
        this.f19148d = 1;
    }

    public final void B() {
        this.i = true;
    }

    public final String C() {
        return this.aN;
    }

    public final String D() {
        return this.aO;
    }

    public final String E() {
        return this.aP;
    }

    public final String F() {
        return this.aR;
    }

    public final void G() {
        Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aQ)) {
            this.aN = "Confirm to close? ";
            this.aO = "You will not be rewarded after closing the window";
            this.aP = "Close it";
            this.aQ = "Continue";
        }
        if (TextUtils.isEmpty(this.aN) || TextUtils.isEmpty(this.aO) || TextUtils.isEmpty(this.aP) || TextUtils.isEmpty(this.aR)) {
            this.aN = "Confirm to close? ";
            this.aO = "You will not be rewarded after closing the window";
            this.aP = "Close it";
            this.aR = "Continue";
        }
    }

    public final String H() {
        return this.aZ;
    }

    public final String I() {
        return this.ba;
    }

    public final String J() {
        return this.bb;
    }

    public final int K() {
        return this.bf;
    }

    public final b L() {
        return this.bg;
    }

    public final void M() {
        this.bn = 0;
    }

    public final void N() {
        this.bo = false;
    }

    public final int O() {
        return this.bp;
    }

    public final void P() {
        this.bq = 1;
    }

    public final String Q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.anythink.expressad.f.a.b.f19205h, this.f19146b);
            jSONObject.put(com.anythink.expressad.f.a.b.f19208l, this.f19147c);
            jSONObject.put(com.anythink.expressad.f.a.b.f19209m, this.f19148d);
            jSONObject.put(com.anythink.expressad.f.a.b.f19212p, this.f19150f);
            jSONObject.put(com.anythink.expressad.f.a.b.f19219w, this.f19151g);
            jSONObject.put(com.anythink.expressad.f.a.b.f19211o, this.i);
            jSONObject.put("plct", this.f19157n);
            jSONObject.put(com.anythink.expressad.f.a.b.f19175B, this.f19158o);
            jSONObject.put(com.anythink.expressad.f.a.b.f19176C, this.f19156m);
            jSONObject.put(com.anythink.expressad.f.a.b.f19180G, this.f19160q);
            jSONObject.put("plctb", this.f19164u);
            jSONObject.put(com.anythink.expressad.f.a.b.ab, this.aG);
            jSONObject.put(com.anythink.expressad.f.a.b.ac, this.aH);
            jSONObject.put(com.anythink.expressad.f.a.b.af, this.f19168y);
            jSONObject.put(com.anythink.expressad.f.a.b.ag, this.f19169z);
            jSONObject.put(com.anythink.expressad.f.a.b.i, this.J);
            jSONObject.put(com.anythink.expressad.f.a.b.f19206j, this.f19130K);
            jSONObject.put(com.anythink.expressad.f.a.b.f19207k, this.f19131L);
            jSONObject.put(com.anythink.expressad.f.a.b.ai, this.aK);
            jSONObject.put(com.anythink.expressad.f.a.b.aa, this.f19167x);
            jSONObject.put(com.anythink.expressad.f.a.b.aG, this.f19126F);
            jSONObject.put(com.anythink.expressad.f.a.b.aE, this.f19124D);
            jSONObject.put(com.anythink.expressad.f.a.b.aF, this.f19125E);
            jSONObject.put(com.anythink.expressad.f.a.b.ae, this.aJ);
            jSONObject.put(com.anythink.expressad.f.a.b.bo, this.aL);
            jSONObject.put(com.anythink.expressad.f.a.b.bw, this.aF);
            jSONObject.put("iex", this.f19129I);
            jSONObject.put(com.anythink.expressad.f.a.b.ao, this.f19127G);
            jSONObject.put(com.anythink.expressad.f.a.b.ap, this.f19128H);
            jSONObject.put(com.anythink.expressad.f.a.b.at, this.aM);
            jSONObject.put(com.anythink.expressad.f.a.b.al, this.aE);
            jSONObject.put("pf", this.Y);
            jSONObject.put(com.anythink.expressad.f.a.b.aA, this.aa);
            jSONObject.put(com.anythink.expressad.f.a.b.aB, this.ae);
            jSONObject.put(com.anythink.expressad.f.a.b.ax, this.ab);
            jSONObject.put(com.anythink.expressad.f.a.b.ay, this.ac);
            jSONObject.put(com.anythink.expressad.f.a.b.az, this.ad);
            jSONObject.put(com.anythink.expressad.f.a.b.ad, this.aI);
            jSONObject.put(com.anythink.expressad.f.a.b.bF, this.ah);
            jSONObject.put(com.anythink.expressad.f.a.b.bG, this.ag);
            jSONObject.put(com.anythink.expressad.f.a.b.bH, this.ai);
            jSONObject.put(com.anythink.expressad.f.a.b.bI, this.aj);
            jSONObject.put(com.anythink.expressad.f.a.b.bJ, this.ak);
            jSONObject.put(com.anythink.expressad.f.a.b.bL, this.am);
            jSONObject.put(com.anythink.expressad.f.a.b.bK, this.al);
            jSONObject.put(com.anythink.expressad.f.a.b.bW, this.an);
            jSONObject.put(com.anythink.expressad.f.a.b.bZ, this.ap);
            jSONObject.put(com.anythink.expressad.f.a.b.cP, this.f19145a);
            jSONObject.put(com.anythink.expressad.f.a.b.cU, this.bi);
            jSONObject.put(com.anythink.expressad.f.a.b.dj, this.f19142W);
            jSONObject.put(com.anythink.expressad.f.a.b.dh, this.f19141V);
            jSONObject.put(com.anythink.expressad.f.a.b.dx, this.bo);
            jSONObject.put(com.anythink.expressad.f.a.b.du, this.bn);
            jSONObject.put("isDefault", this.bq);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final int R() {
        return this.br;
    }

    public final int S() {
        return this.bs;
    }

    public final int T() {
        return this.bt;
    }

    public final int U() {
        return this.bu;
    }

    public final int V() {
        return this.bv;
    }

    public final void a(int i) {
        this.f19142W = i;
    }

    public final void b(int i) {
        if (i > 0) {
            this.aC = i;
        }
    }

    public final void c(int i) {
        this.ay = i;
    }

    public final void d() {
        this.ag = 1;
    }

    public final void e(int i) {
        this.aA = i;
    }

    public final void j() {
        this.f19131L = 1;
    }

    public final void m() {
        this.f19164u = com.anythink.expressad.f.a.b.f19189Q;
    }

    public final int n() {
        return this.aM;
    }

    public final void o() {
        this.aM = 259200;
    }

    public final void p() {
        this.aK = com.anythink.expressad.f.a.b.aC;
    }

    public final long q() {
        return this.aH * 1000;
    }

    public final void r() {
        this.aH = 10L;
    }

    public final boolean s() {
        return this.f19160q;
    }

    public final void t() {
        this.f19160q = false;
    }

    public final boolean u() {
        return this.f19156m;
    }

    public final void v() {
        this.f19156m = false;
    }

    public final long w() {
        return this.f19157n;
    }

    public final void x() {
        this.f19157n = com.anythink.expressad.f.a.b.f19188P;
    }

    public final void y() {
        this.f19158o = 0L;
    }

    public final String z() {
        return this.f19146b;
    }

    private void A(String str) {
        this.bl = str;
    }

    private void B(String str) {
        this.bm = str;
    }

    private void a(LinkedList<String> linkedList) {
        this.f19138S = linkedList;
    }

    private void b(List<String> list) {
        this.f19144Z = list;
    }

    private void c(List<d> list) {
        this.f19132M = list;
    }

    private void d(long j6) {
        this.f19159p = j6;
    }

    private void j(String str) {
        this.ae = str;
    }

    private void m(String str) {
        this.f19146b = str;
    }

    private void n(String str) {
        this.af = str;
    }

    private void o(String str) {
        this.f19154k = str;
    }

    private void p(String str) {
        this.aN = str;
    }

    private void q(String str) {
        this.aO = str;
    }

    private void r(String str) {
        this.aP = str;
    }

    private void s(String str) {
        this.aQ = str;
    }

    private void t(String str) {
        this.aR = str;
    }

    private void u(String str) {
        this.aZ = str;
    }

    private void v(String str) {
        this.ba = str;
    }

    private void w(String str) {
        this.bb = str;
    }

    private void x(String str) {
        this.bc = str;
    }

    private void y(String str) {
        this.bd = str;
    }

    private static Map<String, C0118a> z(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C0118a c0118a = new C0118a();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    c0118a.a(optJSONObject);
                }
                hashMap.put(next, c0118a);
            }
            return hashMap;
        } catch (JSONException e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
            return null;
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f18405a) {
                e10.printStackTrace();
            }
            return null;
        }
    }

    public final void e() {
        this.ah = 1;
    }

    public final void f() {
        this.ai = 1;
    }

    public final void g() {
        this.aj = 0;
    }

    public final void h() {
        this.ak = 1;
    }

    public final void i() {
        this.am = -1;
    }

    public final int k() {
        return this.f19121A;
    }

    public final long l() {
        if (this.f19164u <= 0) {
            this.f19164u = com.anythink.expressad.f.a.b.f19189Q;
        }
        return this.f19164u;
    }

    private void a(List<com.anythink.expressad.foundation.d.c> list) {
        this.f19133N = list;
    }

    private void b(long j6) {
        this.f19123C = j6;
    }

    private void c(long j6) {
        this.aG = j6;
    }

    private void d(List<c> list) {
        this.f19155l = list;
    }

    private void e(long j6) {
        this.f19147c = j6;
    }

    private void f(long j6) {
        this.f19149e = j6;
    }

    private void g(long j6) {
        this.f19153j = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a b(String str) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a();
                try {
                    aVar.f19146b = jSONObject.optString(com.anythink.expressad.f.a.b.f19205h);
                    aVar.f19130K = jSONObject.optString(com.anythink.expressad.f.a.b.f19206j, "anythink");
                    aVar.f19147c = jSONObject.optLong(com.anythink.expressad.f.a.b.f19208l);
                    aVar.f19148d = jSONObject.optInt(com.anythink.expressad.f.a.b.f19209m);
                    aVar.f19149e = jSONObject.optLong("getpf");
                    aVar.f19150f = jSONObject.optInt(com.anythink.expressad.f.a.b.f19212p);
                    aVar.f19151g = jSONObject.optBoolean(com.anythink.expressad.f.a.b.f19219w);
                    aVar.f19153j = jSONObject.optLong("current_time");
                    aVar.i = jSONObject.optBoolean(com.anythink.expressad.f.a.b.f19211o);
                    aVar.f19158o = jSONObject.optLong(com.anythink.expressad.f.a.b.f19175B);
                    aVar.f19157n = jSONObject.optLong("plct") == 0 ? com.anythink.expressad.f.a.b.f19188P : jSONObject.optLong("plct");
                    aVar.f19156m = jSONObject.optBoolean(com.anythink.expressad.f.a.b.f19176C);
                    aVar.f19159p = jSONObject.optLong(com.anythink.expressad.f.a.b.f19179F);
                    aVar.f19160q = jSONObject.optBoolean(com.anythink.expressad.f.a.b.f19180G);
                    aVar.f19161r = jSONObject.optInt(com.anythink.expressad.f.a.b.f19196X);
                    aVar.f19162s = jSONObject.optInt(com.anythink.expressad.f.a.b.Y);
                    aVar.f19131L = jSONObject.optInt(com.anythink.expressad.f.a.b.f19207k);
                    aVar.f19163t = jSONObject.optInt(com.anythink.expressad.f.a.b.f19197Z, 1800);
                    aVar.f19167x = jSONObject.optInt(com.anythink.expressad.f.a.b.aa);
                    aVar.f19164u = jSONObject.optLong("plctb") == 0 ? com.anythink.expressad.f.a.b.f19189Q : jSONObject.optLong("plctb");
                    aVar.aI = jSONObject.optInt(com.anythink.expressad.f.a.b.ad);
                    aVar.aJ = jSONObject.optInt(com.anythink.expressad.f.a.b.ae);
                    aVar.f19167x = jSONObject.optInt(com.anythink.expressad.f.a.b.aa, 100);
                    aVar.f19168y = jSONObject.optInt(com.anythink.expressad.f.a.b.af, 2);
                    aVar.f19169z = jSONObject.optInt(com.anythink.expressad.f.a.b.ag, 2);
                    boolean z6 = true;
                    aVar.f19121A = jSONObject.optInt(com.anythink.expressad.f.a.b.ah, 1);
                    aVar.aK = jSONObject.optLong(com.anythink.expressad.f.a.b.ai, com.anythink.expressad.f.a.b.aC);
                    aVar.f19122B = jSONObject.optString(com.anythink.expressad.f.a.b.aj);
                    aVar.f19123C = jSONObject.optLong(com.anythink.expressad.f.a.b.ak, com.anythink.expressad.f.a.b.aD);
                    aVar.f19124D = jSONObject.optInt(com.anythink.expressad.f.a.b.aE, 1);
                    aVar.f19125E = jSONObject.optInt(com.anythink.expressad.f.a.b.aF, 604800);
                    aVar.f19126F = jSONObject.optInt(com.anythink.expressad.f.a.b.aG, com.anythink.expressad.f.a.b.aK);
                    aVar.aL = jSONObject.optInt(com.anythink.expressad.f.a.b.bo, 3);
                    aVar.aF = jSONObject.optInt(com.anythink.expressad.f.a.b.bw, 1);
                    aVar.af = jSONObject.optString(com.anythink.expressad.f.a.b.aH, "");
                    aVar.aE = jSONObject.optInt(com.anythink.expressad.f.a.b.al, 1);
                    aVar.ah = jSONObject.optInt(com.anythink.expressad.f.a.b.bF, 1);
                    aVar.ag = jSONObject.optInt(com.anythink.expressad.f.a.b.bG, 1);
                    aVar.ai = jSONObject.optInt(com.anythink.expressad.f.a.b.bH, 1);
                    int i = 0;
                    aVar.aj = jSONObject.optInt(com.anythink.expressad.f.a.b.bI, 0);
                    aVar.ak = jSONObject.optInt(com.anythink.expressad.f.a.b.bJ, 1);
                    aVar.am = jSONObject.optInt(com.anythink.expressad.f.a.b.bL, -1);
                    aVar.an = jSONObject.optInt(com.anythink.expressad.f.a.b.bW, 2);
                    aVar.ap = jSONObject.optInt(com.anythink.expressad.f.a.b.bZ, 86400);
                    aVar.ao = jSONObject.optString(com.anythink.expressad.f.a.b.bX);
                    aVar.ar = jSONObject.optString(com.anythink.expressad.f.a.b.cH);
                    aVar.aq = jSONObject.optString(com.anythink.expressad.f.a.b.cG);
                    aVar.as = jSONObject.optInt(com.anythink.expressad.f.a.b.cO);
                    aVar.f19140U = jSONObject.optInt(com.anythink.expressad.f.a.b.cj, com.anythink.expressad.f.a.b.cl);
                    aVar.f19139T = jSONObject.optInt(com.anythink.expressad.f.a.b.ci, 0);
                    try {
                        JSONArray optJSONArray = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ch);
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            LinkedList<String> linkedList = new LinkedList<>();
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                linkedList.add(optJSONArray.optString(i4));
                            }
                            aVar.f19138S = linkedList;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    long optLong = jSONObject.optLong(com.anythink.expressad.f.a.b.ab);
                    if (optLong == 0) {
                        aVar.aG = 20L;
                    } else {
                        aVar.aG = optLong;
                    }
                    long optLong2 = jSONObject.optLong(com.anythink.expressad.f.a.b.ac);
                    if (optLong2 == 0) {
                        aVar.aH = 10L;
                    } else {
                        aVar.aH = optLong2;
                        JSONArray optJSONArray2 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.f19218v);
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            HashMap hashMap = new HashMap();
                            for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                                JSONObject optJSONObject = optJSONArray2.optJSONObject(i6);
                                hashMap.put(optJSONObject.optString("domain"), optJSONObject.optString("format"));
                            }
                            aVar.f19152h = hashMap;
                        }
                    }
                    aVar.f19127G = jSONObject.optInt(com.anythink.expressad.f.a.b.ao, 3);
                    aVar.f19128H = jSONObject.optInt(com.anythink.expressad.f.a.b.ap, 86400);
                    aVar.f19129I = jSONObject.optInt("iex", 1);
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ar);
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                            String optString = optJSONArray3.optString(i9);
                            if (y.b(optString)) {
                                arrayList.add(d.a(new JSONObject(optString)));
                            }
                        }
                    }
                    if (arrayList != null) {
                        aVar.f19132M = arrayList;
                    }
                    try {
                        JSONArray optJSONArray4 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.as);
                        if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                            arrayList2 = new ArrayList();
                            for (int i10 = 0; i10 < optJSONArray4.length(); i10++) {
                                String optString2 = optJSONArray4.optString(i10);
                                if (y.b(optString2)) {
                                    JSONObject jSONObject2 = new JSONObject(optString2);
                                    arrayList2.add(new com.anythink.expressad.foundation.d.c(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            aVar.f19133N = arrayList2;
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    aVar.aM = jSONObject.optInt(com.anythink.expressad.f.a.b.at, 259200);
                    aVar.Y = jSONObject.optInt("pf", com.anythink.expressad.f.a.b.bz);
                    aVar.aa = jSONObject.optInt(com.anythink.expressad.f.a.b.aA, 20);
                    aVar.ae = jSONObject.optString(com.anythink.expressad.f.a.b.aB);
                    JSONArray optJSONArray5 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.av);
                    if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i11 = 0; i11 < optJSONArray5.length(); i11++) {
                            arrayList3.add(optJSONArray5.optString(i11));
                        }
                        aVar.f19144Z = arrayList3;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(com.anythink.expressad.f.a.b.aw);
                    if (optJSONObject2 != null) {
                        aVar.ab = optJSONObject2.optInt(com.anythink.expressad.f.a.b.ax, 1);
                        aVar.ac = optJSONObject2.optInt(com.anythink.expressad.f.a.b.ay, 1);
                        aVar.ad = optJSONObject2.optInt(com.anythink.expressad.f.a.b.az, 1);
                    }
                    aVar.aN = jSONObject.optString(com.anythink.expressad.f.a.b.cu, "");
                    aVar.aO = jSONObject.optString(com.anythink.expressad.f.a.b.cv, "");
                    aVar.aP = jSONObject.optString(com.anythink.expressad.f.a.b.cw, "");
                    aVar.aQ = jSONObject.optString(com.anythink.expressad.f.a.b.cx, "");
                    aVar.aR = jSONObject.optString(com.anythink.expressad.f.a.b.cy, "");
                    aVar.aS = jSONObject.optInt(com.anythink.expressad.f.a.b.cz, 0);
                    aVar.aT = jSONObject.optInt(com.anythink.expressad.f.a.b.cA, 21600);
                    aVar.aU = jSONObject.optInt(com.anythink.expressad.f.a.b.cB, 2);
                    aVar.aV = jSONObject.optInt(com.anythink.expressad.f.a.b.cC, 0);
                    aVar.aW = jSONObject.optInt(com.anythink.expressad.f.a.b.cD, 0);
                    aVar.aX = jSONObject.optInt(com.anythink.expressad.f.a.b.cE, 604800);
                    aVar.aY = jSONObject.optInt(com.anythink.expressad.f.a.b.cF, 0);
                    aVar.aZ = jSONObject.optString("adchoice_icon", "");
                    aVar.bb = jSONObject.optString("adchoice_link", "");
                    aVar.ba = jSONObject.optString("adchoice_size", "");
                    aVar.bd = jSONObject.optString("platform_logo", "");
                    aVar.bc = jSONObject.optString("platform_name", "");
                    aVar.be = z(jSONObject.optString(com.anythink.expressad.f.a.b.cN, ""));
                    aVar.f19145a = jSONObject.optInt(com.anythink.expressad.f.a.b.cP, 0);
                    aVar.bh = jSONObject.optInt(com.anythink.expressad.f.a.b.cR, 0);
                    aVar.f19142W = jSONObject.optInt(com.anythink.expressad.f.a.b.dj, 120);
                    aVar.f19141V = jSONObject.optInt(com.anythink.expressad.f.a.b.dh, 10);
                    aVar.f19143X = jSONObject.optString(com.anythink.expressad.f.a.b.dJ, "");
                    aVar.bi = jSONObject.optString(com.anythink.expressad.f.a.b.cU, "");
                    aVar.bj = jSONObject.optInt(com.anythink.expressad.f.a.b.cV, 2);
                    aVar.bk = jSONObject.optInt(com.anythink.expressad.f.a.b.cW, 7200);
                    aVar.bm = jSONObject.optString(com.anythink.expressad.f.a.b.dt);
                    aVar.bl = jSONObject.optString(com.anythink.expressad.f.a.b.dB);
                    int optInt = jSONObject.optInt(com.anythink.expressad.f.a.b.du, 0);
                    if (optInt > 2 || optInt < 0) {
                        optInt = 0;
                    }
                    aVar.bn = optInt;
                    aVar.bo = jSONObject.optBoolean(com.anythink.expressad.f.a.b.dx, false);
                    JSONArray optJSONArray6 = jSONObject.optJSONArray(com.anythink.expressad.f.a.b.ds);
                    if (optJSONArray6 != null && optJSONArray6.length() > 0) {
                        for (int i12 = 0; i12 < optJSONArray6.length(); i12++) {
                            JSONObject jSONObject3 = optJSONArray6.getJSONObject(i12);
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!TextUtils.isEmpty(next) && jSONObject3.getBoolean(next)) {
                                    aVar.aD.add(Integer.valueOf(Integer.parseInt(next)));
                                }
                            }
                        }
                    }
                    try {
                        int optInt2 = jSONObject.optInt("lqcnt", 30);
                        int optInt3 = jSONObject.optInt("lqto", 5);
                        int optInt4 = jSONObject.optInt("lqswt", 0);
                        int optInt5 = jSONObject.optInt("lqtype", 0);
                        aVar.au = optInt3;
                        aVar.at = optInt2;
                        aVar.av = optInt4;
                        aVar.aw = optInt5;
                        int parseInt = Integer.parseInt(com.anythink.core.express.a.a.b(jSONObject.optString("lqpt")));
                        if (parseInt > 0 && parseInt < 65535) {
                            aVar.ax = parseInt;
                        }
                    } catch (Exception unused) {
                    }
                    aVar.bp = jSONObject.optInt(com.anythink.expressad.f.a.b.dC, 0);
                    try {
                        int optInt6 = jSONObject.optInt("l", 3);
                        boolean z9 = jSONObject.optInt("k", 0) == 1;
                        if (jSONObject.optInt(com.anythink.expressad.f.a.b.dI, 1) != 1) {
                            z6 = false;
                        }
                        aVar.f19135P = optInt6;
                        aVar.f19134O = z9;
                        aVar.f19136Q = z6;
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    aVar.bf = jSONObject.optInt(com.anythink.expressad.f.a.b.dL, 0);
                    aVar.bg = b.a(jSONObject.optJSONObject(com.anythink.expressad.f.a.b.dM));
                    try {
                        int optInt7 = jSONObject.optInt(com.anythink.expressad.f.a.b.dR, com.anythink.expressad.foundation.g.a.cL);
                        int optInt8 = jSONObject.optInt(com.anythink.expressad.f.a.b.dS, com.anythink.expressad.foundation.g.a.cN);
                        int optInt9 = jSONObject.optInt(com.anythink.expressad.f.a.b.dT, com.anythink.expressad.foundation.g.a.cO);
                        int optInt10 = jSONObject.optInt(com.anythink.expressad.f.a.b.dV, com.anythink.expressad.foundation.g.a.cT);
                        if (optInt7 <= 0) {
                            optInt7 = com.anythink.expressad.foundation.g.a.cL;
                        }
                        if (optInt8 <= 0) {
                            optInt8 = com.anythink.expressad.foundation.g.a.cN;
                        }
                        if (optInt9 <= 0) {
                            optInt9 = com.anythink.expressad.foundation.g.a.cO;
                        }
                        if (optInt10 < 0) {
                            optInt10 = com.anythink.expressad.foundation.g.a.cT;
                        }
                        aVar.aA = optInt7;
                        aVar.ay = optInt8;
                        aVar.az = optInt9;
                        aVar.aB = optInt10;
                        int optInt11 = jSONObject.optInt(com.anythink.expressad.f.a.b.dU, 0);
                        if (optInt11 >= 0) {
                            i = optInt11;
                        }
                        aVar.f19137R = i;
                        aVar.b(jSONObject.optInt(com.anythink.expressad.f.a.b.dW, 10));
                        return aVar;
                    } catch (Exception unused2) {
                        arrayList2 = aVar;
                    }
                } catch (Exception e11) {
                    e = e11;
                    arrayList2 = aVar;
                    e.printStackTrace();
                    return arrayList2;
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        return arrayList2;
    }

    public static String c(String str) {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            a b9 = com.anythink.expressad.f.b.b();
            if (b9 != null && b9.f19152h != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = b9.f19152h.entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = b9.f19152h.get(key);
                        if (TextUtils.isEmpty(str2)) {
                            return "";
                        }
                        return str2.replace("{gaid}", m.f());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public final void a(String str) {
        this.f19130K = str;
    }

    public final void d(String str) {
        this.bi = str;
    }

    private void a(long j6) {
        this.f19125E = j6;
    }

    private void a(Map<String, String> map) {
        this.f19152h = map;
    }

    private void a(boolean z6) {
        this.f19151g = z6;
    }

    private void a(b bVar) {
        this.bg = bVar;
    }

    private void c(boolean z6) {
        this.f19136Q = z6;
    }

    private void b(Map<String, C0118a> map) {
        this.be = map;
    }

    private void b(boolean z6) {
        this.f19134O = z6;
    }
}
