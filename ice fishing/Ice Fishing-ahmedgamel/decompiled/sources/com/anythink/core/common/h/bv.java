package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bv implements Comparable<bv> {

    /* renamed from: u, reason: collision with root package name */
    public static final int f13774u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13775v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13776w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13777x = 1;

    /* renamed from: A, reason: collision with root package name */
    private int f13778A;

    /* renamed from: B, reason: collision with root package name */
    private String f13779B;

    /* renamed from: C, reason: collision with root package name */
    private int f13780C;

    /* renamed from: D, reason: collision with root package name */
    private int f13781D;

    /* renamed from: E, reason: collision with root package name */
    private String f13782E;

    /* renamed from: F, reason: collision with root package name */
    private Map<String, Object> f13783F;

    /* renamed from: G, reason: collision with root package name */
    private String f13784G;

    /* renamed from: H, reason: collision with root package name */
    private String f13785H;

    /* renamed from: I, reason: collision with root package name */
    private long f13786I;
    private String J;

    /* renamed from: K, reason: collision with root package name */
    private int f13787K;

    /* renamed from: L, reason: collision with root package name */
    private int f13788L;

    /* renamed from: M, reason: collision with root package name */
    private double f13789M;

    /* renamed from: N, reason: collision with root package name */
    private int f13790N;

    /* renamed from: O, reason: collision with root package name */
    private String f13791O;

    /* renamed from: P, reason: collision with root package name */
    private String f13792P;

    /* renamed from: Q, reason: collision with root package name */
    private int f13793Q;

    /* renamed from: R, reason: collision with root package name */
    private long f13794R;

    /* renamed from: S, reason: collision with root package name */
    private long f13795S;

    /* renamed from: T, reason: collision with root package name */
    private long f13796T;

    /* renamed from: U, reason: collision with root package name */
    private long f13797U;

    /* renamed from: V, reason: collision with root package name */
    private int f13798V;

    /* renamed from: W, reason: collision with root package name */
    private String f13799W;

    /* renamed from: X, reason: collision with root package name */
    private long f13800X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f13801Z;

    /* renamed from: a, reason: collision with root package name */
    int f13802a;
    private int aB;
    private int[] aE;
    private JSONArray aH;
    private int aI;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private double aO;
    private double aP;
    private JSONObject aQ;
    private int aR;
    private int aS;
    private Map<String, Object> aT;
    private ap aU;
    private int aW;
    private long aX;
    private aa aY;
    private int aZ;
    private long aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private String af;
    private long ag;
    private long ah;
    private double ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private ad ap;
    private int aq;
    private int ar;
    private String as;
    private int at;
    private int au;
    private long av;
    private l aw;
    private long ax;
    private long ay;
    private String az;
    private long ba;
    private int bb;
    private int bc;
    private String bd;
    private JSONArray be;
    private JSONArray bf;
    private JSONArray bg;
    private int bh;
    private JSONArray bi;
    private JSONArray bj;
    private int bk;
    private long bl;
    private double bm;
    private long bn;
    private int bo;
    private int bp;
    private int bq;
    private String br;
    private int bs;
    private int bt;
    private ad bu;

    /* renamed from: c, reason: collision with root package name */
    int f13804c;

    /* renamed from: d, reason: collision with root package name */
    int f13805d;

    /* renamed from: e, reason: collision with root package name */
    String f13806e;

    /* renamed from: f, reason: collision with root package name */
    int f13807f;

    /* renamed from: g, reason: collision with root package name */
    int f13808g;

    /* renamed from: h, reason: collision with root package name */
    double f13809h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    double f13810j;

    /* renamed from: k, reason: collision with root package name */
    String f13811k;

    /* renamed from: l, reason: collision with root package name */
    protected int f13812l;

    /* renamed from: m, reason: collision with root package name */
    int f13813m;

    /* renamed from: n, reason: collision with root package name */
    int f13814n;

    /* renamed from: o, reason: collision with root package name */
    int f13815o;

    /* renamed from: s, reason: collision with root package name */
    String f13819s;

    /* renamed from: t, reason: collision with root package name */
    long f13820t;

    /* renamed from: y, reason: collision with root package name */
    ATAdRequest f13821y;

    /* renamed from: z, reason: collision with root package name */
    double f13822z;
    private int aA = 1;

    /* renamed from: b, reason: collision with root package name */
    int f13803b = 0;
    private int aC = -1;
    private ATAdConst.CURRENCY aD = ATAdConst.CURRENCY.USD;

    /* renamed from: p, reason: collision with root package name */
    int f13816p = 2;

    /* renamed from: q, reason: collision with root package name */
    boolean f13817q = false;

    /* renamed from: r, reason: collision with root package name */
    double f13818r = -1.0d;
    private int aF = 1;
    private int aG = 1;
    private int aJ = 1;
    private int aV = 2;

    public bv(int i) {
        this.au = i;
    }

    private void ac(int i) {
        this.ad = i;
    }

    private void ad(int i) {
        this.aq = i;
    }

    private int bA() {
        return this.aB;
    }

    private boolean bB() {
        return this.aG == 1;
    }

    private boolean bC() {
        return com.anythink.core.common.v.p.d(this.au);
    }

    private String bD() {
        return this.bd;
    }

    private ATAdRequest bw() {
        return this.f13821y;
    }

    private long bx() {
        return this.f13800X;
    }

    private int by() {
        return this.ad;
    }

    private int bz() {
        return this.aj;
    }

    public final String A() {
        return this.J;
    }

    public final int B() {
        return this.f13787K;
    }

    public final int C() {
        return this.f13788L;
    }

    public final double D() {
        return this.f13789M;
    }

    public final String E() {
        return this.f13791O;
    }

    public final String F() {
        return this.f13792P;
    }

    public final long G() {
        return this.Y;
    }

    public final long H() {
        return this.f13801Z;
    }

    public final int I() {
        return this.ab;
    }

    public final int J() {
        return this.ac;
    }

    public final int K() {
        return this.ae;
    }

    public final String L() {
        return this.af;
    }

    public final long M() {
        return this.ag;
    }

    public final long N() {
        return this.ah;
    }

    public final double O() {
        return this.ai;
    }

    public final int P() {
        return this.ak;
    }

    public final boolean Q() {
        return this.al == 2;
    }

    public final ad R() {
        return this.ap;
    }

    public final ad S() {
        return this.bu;
    }

    public final int T() {
        return this.aq;
    }

    public final int U() {
        return this.ar;
    }

    public final void V() {
        this.ar = 1;
    }

    public final String W() {
        return this.as;
    }

    public final long X() {
        return this.av;
    }

    public final String Y() {
        return this.az;
    }

    public final int Z() {
        int i = this.f13803b;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final long a() {
        return this.ax;
    }

    public final boolean aA() {
        return this.f13817q;
    }

    public final void aB() {
        this.f13817q = true;
    }

    public final double aC() {
        return this.f13818r;
    }

    public final String aD() {
        return this.f13819s;
    }

    public final long aE() {
        return this.f13820t;
    }

    public final int[] aF() {
        return this.aE;
    }

    public final int aG() {
        return this.aF;
    }

    public final int aH() {
        return this.aG;
    }

    public final JSONArray aI() {
        return this.aH;
    }

    public final int aJ() {
        return this.aI;
    }

    public final int aK() {
        return this.aJ;
    }

    public final int aL() {
        return this.aK;
    }

    public final int aM() {
        return this.aL;
    }

    public final int aN() {
        return this.aM;
    }

    public final int aO() {
        return this.aN;
    }

    public final double aP() {
        return this.aO;
    }

    public final double aQ() {
        return this.aP;
    }

    public final JSONObject aR() {
        return this.aQ;
    }

    public final int aS() {
        return this.aR;
    }

    public final int aT() {
        return this.aS;
    }

    public final boolean aU() {
        return com.anythink.core.common.v.p.b(this.au);
    }

    public final boolean aV() {
        return com.anythink.core.common.v.p.c(this.au);
    }

    public final ap aW() {
        return this.aU;
    }

    public final Map<String, Object> aX() {
        return this.aT;
    }

    public final int aY() {
        return this.aV;
    }

    public final int aZ() {
        return this.aW;
    }

    public final int aa() {
        return this.f13804c;
    }

    public final int ab() {
        return this.f13805d;
    }

    public final int ae() {
        return this.aC;
    }

    public final int af() {
        int i;
        ad adVar = this.ap;
        return (adVar == null || (i = adVar.f13431n) == 0) ? this.f13807f : i;
    }

    public final int ag() {
        return this.bo;
    }

    public final int ah() {
        return this.bp;
    }

    public final int ai() {
        return this.bq;
    }

    public final String aj() {
        return this.br;
    }

    public final int ak() {
        return this.bs;
    }

    public final int al() {
        return this.bt;
    }

    public final boolean am() {
        int i = this.f13778A;
        return i == 66 || i == 67;
    }

    public final boolean an() {
        return this.f13778A == 1 && this.ao == 1;
    }

    public final int ao() {
        return this.at;
    }

    public final ATAdConst.CURRENCY ap() {
        return this.aD;
    }

    public final int aq() {
        return this.f13808g;
    }

    public final double ar() {
        return this.f13809h;
    }

    public final int as() {
        return this.i;
    }

    public final double at() {
        return this.f13810j;
    }

    public final String au() {
        return this.f13811k;
    }

    public final int av() {
        return this.f13812l;
    }

    public final int aw() {
        return this.f13813m;
    }

    public final int ax() {
        return this.f13814n;
    }

    public final int ay() {
        int i = this.f13815o;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final int az() {
        return this.f13816p;
    }

    public final long b() {
        return this.ay;
    }

    public final long ba() {
        return this.aX;
    }

    public final aa bb() {
        return this.aY;
    }

    public final boolean bc() {
        if (this.aZ != 2 || this.ba <= 0 || this.bb != 4) {
            return false;
        }
        int i = this.aC;
        return i == -1 || i == 4;
    }

    public final int bd() {
        return this.aZ;
    }

    public final long be() {
        return this.ba;
    }

    public final int bf() {
        return this.bb;
    }

    public final int bg() {
        return this.bc;
    }

    public final JSONArray bh() {
        return this.bf;
    }

    public final JSONArray bi() {
        return this.bg;
    }

    public final int bj() {
        return this.bh;
    }

    public final JSONArray bk() {
        return this.bi;
    }

    public final JSONArray bl() {
        return this.bj;
    }

    public final JSONArray bm() {
        return this.be;
    }

    public final int bn() {
        return this.bk;
    }

    public final long bo() {
        return this.bl;
    }

    public final double bp() {
        return this.bm;
    }

    public final long bq() {
        return this.bn;
    }

    public final boolean br() {
        ad adVar = this.ap;
        if (adVar != null) {
            return adVar.s();
        }
        return false;
    }

    public final int bs() {
        return this.aA;
    }

    public final String bt() {
        ad adVar = this.ap;
        return adVar != null ? adVar.x() : "";
    }

    public final String bu() {
        ad adVar = this.ap;
        return adVar != null ? adVar.getOriginRequestId() : "";
    }

    public final l bv() {
        return this.aw;
    }

    public final double c() {
        return this.f13822z;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(bv bvVar) {
        return com.anythink.core.common.v.l.a(this, bvVar);
    }

    public final int d() {
        return this.au;
    }

    public final int e() {
        return this.an;
    }

    public final void f() {
        this.an = -1;
    }

    public final int g() {
        return this.f13778A;
    }

    public final String h() {
        return this.f13779B;
    }

    public final int i() {
        return this.f13780C;
    }

    public final int j() {
        return this.f13781D;
    }

    public final String k() {
        return this.f13782E;
    }

    public final Map<String, Object> l() {
        return this.f13783F;
    }

    public final String m() {
        return this.f13784G;
    }

    public final int n() {
        return this.f13790N;
    }

    public final boolean o() {
        return this.f13790N == 1;
    }

    public final long p() {
        return this.f13795S;
    }

    @Deprecated
    public final int q() {
        return this.ao;
    }

    public final int r() {
        return this.am;
    }

    public final long s() {
        return this.aa;
    }

    public final int t() {
        return this.f13793Q;
    }

    public String toString() {
        return super.toString();
    }

    public final long u() {
        return com.anythink.core.common.v.ak.c(this);
    }

    public final long v() {
        return this.f13796T;
    }

    public final long w() {
        return this.f13797U;
    }

    public final int x() {
        return this.f13798V;
    }

    public final long y() {
        return this.f13786I;
    }

    public final String z() {
        return this.f13799W;
    }

    public final void A(int i) {
        this.bs = i;
    }

    public final void B(int i) {
        this.bt = i;
    }

    public final void C(int i) {
        this.at = i;
    }

    public final void D(int i) {
        this.f13808g = i;
    }

    public final void E(int i) {
        this.i = i;
    }

    public final void F(int i) {
        this.f13812l = i;
    }

    public final void G(int i) {
        this.f13813m = i;
    }

    public final void H(int i) {
        this.f13814n = i;
    }

    public final void I(int i) {
        this.f13815o = i;
    }

    public final void J(int i) {
        this.f13816p = i;
    }

    public final void K(int i) {
        this.aF = i;
    }

    public final void L(int i) {
        this.aG = i;
    }

    public final void M(int i) {
        this.aI = i;
    }

    public final void N(int i) {
        this.aJ = i;
    }

    public final void O(int i) {
        this.aK = i;
    }

    public final void P(int i) {
        this.aL = i;
    }

    public final void Q(int i) {
        this.aM = i;
    }

    public final void R(int i) {
        this.aN = i;
    }

    public final void S(int i) {
        this.aR = i;
    }

    public final void T(int i) {
        this.aS = i;
    }

    public final void U(int i) {
        this.aV = i;
    }

    public final void V(int i) {
        this.aW = i;
    }

    public final void W(int i) {
        this.aZ = i;
    }

    public final void X(int i) {
        this.bb = i;
    }

    public final void Y(int i) {
        this.bc = i;
    }

    public final void Z(int i) {
        this.bh = i;
    }

    public final void a(long j6) {
        this.ax = j6;
    }

    public final void aa(int i) {
        this.bk = i;
    }

    public final void ab(int i) {
        this.aA = i;
    }

    public final String ac() {
        return this.f13806e;
    }

    public final int ad() {
        return this.f13802a;
    }

    public final void b(long j6) {
        this.ay = j6;
    }

    public final void c(int i) {
        this.f13781D = i;
    }

    public final void d(String str) {
        this.f13785H = str;
    }

    public final void e(int i) {
        this.ao = i;
    }

    public final void f(int i) {
        this.am = i;
    }

    public final void g(int i) {
        this.f13793Q = i;
    }

    public final void h(int i) {
        this.f13798V = i;
    }

    public final void i(int i) {
        this.f13787K = i;
    }

    public final void j(int i) {
        this.f13788L = i;
    }

    public final void k(int i) {
        this.ab = i;
    }

    public final void l(int i) {
        this.ac = i;
    }

    public final void m(int i) {
        this.ae = i;
    }

    public final void n(int i) {
        this.aj = i;
    }

    public final void o(int i) {
        this.ak = i;
    }

    public final void p(int i) {
        this.al = i;
    }

    public final void q(int i) {
        this.aB = i;
    }

    public final void r(int i) {
        this.f13803b = i;
    }

    public final void s(int i) {
        this.f13804c = i;
    }

    public final void t(int i) {
        this.f13805d = i;
    }

    public final void u(int i) {
        this.f13802a = i;
    }

    public final void v(int i) {
        this.aC = i;
    }

    public final void w(int i) {
        this.f13807f = i;
    }

    public final void x(int i) {
        this.bo = i;
    }

    public final void y(int i) {
        this.bp = i;
    }

    public final void z(int i) {
        this.bq = i;
    }

    private void p(String str) {
        this.as = str;
    }

    public final void a(double d2) {
        this.f13822z = d2;
    }

    public final void b(int i) {
        this.f13780C = i;
    }

    public final void c(String str) {
        this.f13784G = str;
    }

    public final void d(int i) {
        this.f13790N = i;
    }

    public final void e(long j6) {
        this.f13796T = j6;
    }

    public final void f(long j6) {
        this.f13797U = j6;
    }

    public final void g(long j6) {
        this.f13786I = j6;
    }

    public final void h(long j6) {
        this.f13800X = j6;
    }

    public final void i(long j6) {
        this.Y = j6;
    }

    public final void j(long j6) {
        this.f13801Z = j6;
    }

    public final void k(long j6) {
        this.ag = j6;
    }

    public final void l(long j6) {
        this.ah = j6;
    }

    public final void m(long j6) {
        this.av = j6;
    }

    public final void n(String str) {
        this.f13819s = str;
    }

    public final void o(long j6) {
        this.aX = j6;
    }

    public final void q(long j6) {
        this.bl = j6;
    }

    public final void r(long j6) {
        this.bn = j6;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.f13821y = aTAdRequest;
    }

    public final void b(String str) {
        this.f13782E = str;
    }

    public final void c(long j6) {
        this.f13795S = j6;
    }

    public final void d(long j6) {
        this.aa = j6;
    }

    public final void e(String str) {
        this.f13799W = str;
    }

    public final void f(String str) {
        this.J = str;
    }

    public final void g(String str) {
        this.f13791O = str;
    }

    public final void h(String str) {
        this.f13792P = str;
    }

    public final void i(String str) {
        this.af = str;
    }

    public final void j(String str) {
        this.az = str;
    }

    public final void k(String str) {
        this.f13806e = str;
    }

    public final void l(String str) {
        this.br = str;
    }

    public final void m(String str) {
        this.f13811k = str;
    }

    public final void n(long j6) {
        this.f13820t = j6;
    }

    public final void o(String str) {
        this.bd = str;
    }

    public final void p(long j6) {
        this.ba = j6;
    }

    public final void a(int i) {
        this.f13778A = i;
    }

    public final void b(double d2) {
        this.f13789M = d2;
    }

    public final void c(double d2) {
        this.ai = d2;
    }

    public final void d(double d2) {
        this.f13809h = d2;
    }

    public final void e(double d2) {
        this.f13810j = d2;
    }

    public final void f(double d2) {
        this.f13818r = d2;
    }

    public final void g(double d2) {
        this.aO = d2;
    }

    public final void h(double d2) {
        this.aP = d2;
    }

    public final void i(double d2) {
        this.bm = d2;
    }

    private void b(ad adVar) {
        this.ap = adVar;
    }

    public final void a(String str) {
        this.f13779B = str;
    }

    public final void c(JSONArray jSONArray) {
        this.bg = jSONArray;
    }

    public final void d(JSONArray jSONArray) {
        this.bi = jSONArray;
    }

    public final void e(JSONArray jSONArray) {
        this.bj = jSONArray;
    }

    public final void f(JSONArray jSONArray) {
        this.be = jSONArray;
    }

    public final void a(Map<String, Object> map) {
        this.f13783F = map;
    }

    public final void b(JSONArray jSONArray) {
        this.bf = jSONArray;
    }

    public final void a(ad adVar) {
        this.bu = adVar;
    }

    private int a(bv bvVar) {
        return com.anythink.core.common.v.l.a(this, bvVar);
    }

    public final synchronized void a(bv bvVar, int i, int i6, int i9) {
        try {
            if (bvVar.f13799W.equals(this.f13799W)) {
                this.f13789M = bvVar.f13789M;
                this.f13810j = bvVar.f13810j;
                this.f13822z = bvVar.f13822z;
                this.aD = bvVar.aD;
                this.f13793Q = i6;
                this.f13791O = bvVar.f13791O;
                this.as = bvVar.as;
                this.an = 0;
                if (i == 0) {
                    this.aq = bvVar.aq;
                } else {
                    this.aq = i;
                }
                this.f13792P = bvVar.f13792P;
                this.ap = bvVar.ap;
                this.ar = i9;
                this.aU = bvVar.aU;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(ATAdConst.CURRENCY currency) {
        this.aD = currency;
    }

    public final void a(int[] iArr) {
        this.aE = iArr;
    }

    public final void a(JSONArray jSONArray) {
        this.aH = jSONArray;
    }

    public final void a(JSONObject jSONObject) {
        this.aQ = jSONObject;
    }

    public final void a(ap apVar) {
        this.aU = apVar;
    }

    public final void a(BaseAd baseAd) {
        int i;
        String str;
        String str2;
        int i6 = 0;
        String str3 = "";
        if (baseAd == null) {
            i = 0;
            str = "";
            str2 = str;
        } else {
            String title = baseAd.getTitle();
            i = baseAd.getNativeAdInteractionType();
            ATAdAppInfo adAppInfo = baseAd.getAdAppInfo();
            if (adAppInfo == null) {
                str2 = "";
            } else {
                str3 = adAppInfo.getPublisher();
                str2 = adAppInfo.getAppPackageName();
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = baseAd.getDescriptionText();
            }
            if (TextUtils.equals(baseAd.getAdType(), "1")) {
                i6 = baseAd.getVideoWidth() > baseAd.getVideoHeight() ? 3 : 4;
            } else if (TextUtils.equals(baseAd.getAdType(), "2")) {
                if (baseAd.getImageUrlList() != null && baseAd.getImageUrlList().size() > 1) {
                    i6 = 5;
                } else if (baseAd.getMainImageWidth() > baseAd.getMainImageHeight()) {
                    str = str3;
                    str3 = title;
                    i6 = 1;
                } else {
                    i6 = 2;
                }
            }
            str = str3;
            str3 = title;
        }
        HashMap hashMap = new HashMap();
        this.aT = hashMap;
        hashMap.put(j.w.f12638z, Integer.valueOf(i6));
        this.aT.put(j.w.f12604A, str3);
        this.aT.put(j.w.f12605B, str);
        this.aT.put(j.w.f12606C, str2);
        this.aT.put(j.w.f12607D, Integer.valueOf(i));
    }

    public final void a(aa aaVar) {
        this.aY = aaVar;
    }

    public final void a(l lVar) {
        this.aw = lVar;
    }

    public final void a(ad adVar, int i, int i6, int i9) {
        this.f13793Q = i6;
        this.f13789M = adVar.getPrice();
        this.f13810j = adVar.getSortPrice();
        this.f13822z = adVar.getRmbPrice();
        this.aD = adVar.getCurrency();
        this.f13791O = adVar.token;
        this.as = adVar.f13430m;
        this.an = 0;
        this.aq = i;
        this.ap = adVar;
        this.ar = i9;
        if (i9 == 1) {
            this.f13792P = "";
        }
        if (this.aU != null) {
            String m4 = adVar.m();
            int o6 = adVar.o();
            String n9 = adVar.n();
            this.aU.b(m4);
            this.aU.d(n9);
            this.aU.a(o6);
        }
    }
}
