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
    public static final int f14560u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14561v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14562w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14563x = 1;

    /* renamed from: A, reason: collision with root package name */
    private int f14564A;

    /* renamed from: B, reason: collision with root package name */
    private String f14565B;

    /* renamed from: C, reason: collision with root package name */
    private int f14566C;

    /* renamed from: D, reason: collision with root package name */
    private int f14567D;

    /* renamed from: E, reason: collision with root package name */
    private String f14568E;

    /* renamed from: F, reason: collision with root package name */
    private Map<String, Object> f14569F;

    /* renamed from: G, reason: collision with root package name */
    private String f14570G;

    /* renamed from: H, reason: collision with root package name */
    private String f14571H;

    /* renamed from: I, reason: collision with root package name */
    private long f14572I;
    private String J;

    /* renamed from: K, reason: collision with root package name */
    private int f14573K;

    /* renamed from: L, reason: collision with root package name */
    private int f14574L;

    /* renamed from: M, reason: collision with root package name */
    private double f14575M;

    /* renamed from: N, reason: collision with root package name */
    private int f14576N;

    /* renamed from: O, reason: collision with root package name */
    private String f14577O;

    /* renamed from: P, reason: collision with root package name */
    private String f14578P;

    /* renamed from: Q, reason: collision with root package name */
    private int f14579Q;

    /* renamed from: R, reason: collision with root package name */
    private long f14580R;

    /* renamed from: S, reason: collision with root package name */
    private long f14581S;

    /* renamed from: T, reason: collision with root package name */
    private long f14582T;

    /* renamed from: U, reason: collision with root package name */
    private long f14583U;

    /* renamed from: V, reason: collision with root package name */
    private int f14584V;

    /* renamed from: W, reason: collision with root package name */
    private String f14585W;

    /* renamed from: X, reason: collision with root package name */
    private long f14586X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f14587Z;

    /* renamed from: a, reason: collision with root package name */
    int f14588a;
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
    int f14590c;

    /* renamed from: d, reason: collision with root package name */
    int f14591d;

    /* renamed from: e, reason: collision with root package name */
    String f14592e;

    /* renamed from: f, reason: collision with root package name */
    int f14593f;

    /* renamed from: g, reason: collision with root package name */
    int f14594g;

    /* renamed from: h, reason: collision with root package name */
    double f14595h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    double f14596j;

    /* renamed from: k, reason: collision with root package name */
    String f14597k;

    /* renamed from: l, reason: collision with root package name */
    protected int f14598l;

    /* renamed from: m, reason: collision with root package name */
    int f14599m;

    /* renamed from: n, reason: collision with root package name */
    int f14600n;

    /* renamed from: o, reason: collision with root package name */
    int f14601o;

    /* renamed from: s, reason: collision with root package name */
    String f14605s;

    /* renamed from: t, reason: collision with root package name */
    long f14606t;

    /* renamed from: y, reason: collision with root package name */
    ATAdRequest f14607y;

    /* renamed from: z, reason: collision with root package name */
    double f14608z;
    private int aA = 1;

    /* renamed from: b, reason: collision with root package name */
    int f14589b = 0;
    private int aC = -1;
    private ATAdConst.CURRENCY aD = ATAdConst.CURRENCY.USD;

    /* renamed from: p, reason: collision with root package name */
    int f14602p = 2;

    /* renamed from: q, reason: collision with root package name */
    boolean f14603q = false;

    /* renamed from: r, reason: collision with root package name */
    double f14604r = -1.0d;
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
        return this.f14607y;
    }

    private long bx() {
        return this.f14586X;
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
        return this.f14573K;
    }

    public final int C() {
        return this.f14574L;
    }

    public final double D() {
        return this.f14575M;
    }

    public final String E() {
        return this.f14577O;
    }

    public final String F() {
        return this.f14578P;
    }

    public final long G() {
        return this.Y;
    }

    public final long H() {
        return this.f14587Z;
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
        int i = this.f14589b;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final long a() {
        return this.ax;
    }

    public final boolean aA() {
        return this.f14603q;
    }

    public final void aB() {
        this.f14603q = true;
    }

    public final double aC() {
        return this.f14604r;
    }

    public final String aD() {
        return this.f14605s;
    }

    public final long aE() {
        return this.f14606t;
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
        return this.f14590c;
    }

    public final int ab() {
        return this.f14591d;
    }

    public final int ae() {
        return this.aC;
    }

    public final int af() {
        int i;
        ad adVar = this.ap;
        return (adVar == null || (i = adVar.f14217n) == 0) ? this.f14593f : i;
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
        int i = this.f14564A;
        return i == 66 || i == 67;
    }

    public final boolean an() {
        return this.f14564A == 1 && this.ao == 1;
    }

    public final int ao() {
        return this.at;
    }

    public final ATAdConst.CURRENCY ap() {
        return this.aD;
    }

    public final int aq() {
        return this.f14594g;
    }

    public final double ar() {
        return this.f14595h;
    }

    public final int as() {
        return this.i;
    }

    public final double at() {
        return this.f14596j;
    }

    public final String au() {
        return this.f14597k;
    }

    public final int av() {
        return this.f14598l;
    }

    public final int aw() {
        return this.f14599m;
    }

    public final int ax() {
        return this.f14600n;
    }

    public final int ay() {
        int i = this.f14601o;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final int az() {
        return this.f14602p;
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
        return this.f14608z;
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
        return this.f14564A;
    }

    public final String h() {
        return this.f14565B;
    }

    public final int i() {
        return this.f14566C;
    }

    public final int j() {
        return this.f14567D;
    }

    public final String k() {
        return this.f14568E;
    }

    public final Map<String, Object> l() {
        return this.f14569F;
    }

    public final String m() {
        return this.f14570G;
    }

    public final int n() {
        return this.f14576N;
    }

    public final boolean o() {
        return this.f14576N == 1;
    }

    public final long p() {
        return this.f14581S;
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
        return this.f14579Q;
    }

    public String toString() {
        return super.toString();
    }

    public final long u() {
        return com.anythink.core.common.v.ak.c(this);
    }

    public final long v() {
        return this.f14582T;
    }

    public final long w() {
        return this.f14583U;
    }

    public final int x() {
        return this.f14584V;
    }

    public final long y() {
        return this.f14572I;
    }

    public final String z() {
        return this.f14585W;
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
        this.f14594g = i;
    }

    public final void E(int i) {
        this.i = i;
    }

    public final void F(int i) {
        this.f14598l = i;
    }

    public final void G(int i) {
        this.f14599m = i;
    }

    public final void H(int i) {
        this.f14600n = i;
    }

    public final void I(int i) {
        this.f14601o = i;
    }

    public final void J(int i) {
        this.f14602p = i;
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
        return this.f14592e;
    }

    public final int ad() {
        return this.f14588a;
    }

    public final void b(long j6) {
        this.ay = j6;
    }

    public final void c(int i) {
        this.f14567D = i;
    }

    public final void d(String str) {
        this.f14571H = str;
    }

    public final void e(int i) {
        this.ao = i;
    }

    public final void f(int i) {
        this.am = i;
    }

    public final void g(int i) {
        this.f14579Q = i;
    }

    public final void h(int i) {
        this.f14584V = i;
    }

    public final void i(int i) {
        this.f14573K = i;
    }

    public final void j(int i) {
        this.f14574L = i;
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
        this.f14589b = i;
    }

    public final void s(int i) {
        this.f14590c = i;
    }

    public final void t(int i) {
        this.f14591d = i;
    }

    public final void u(int i) {
        this.f14588a = i;
    }

    public final void v(int i) {
        this.aC = i;
    }

    public final void w(int i) {
        this.f14593f = i;
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

    public final void a(double d9) {
        this.f14608z = d9;
    }

    public final void b(int i) {
        this.f14566C = i;
    }

    public final void c(String str) {
        this.f14570G = str;
    }

    public final void d(int i) {
        this.f14576N = i;
    }

    public final void e(long j6) {
        this.f14582T = j6;
    }

    public final void f(long j6) {
        this.f14583U = j6;
    }

    public final void g(long j6) {
        this.f14572I = j6;
    }

    public final void h(long j6) {
        this.f14586X = j6;
    }

    public final void i(long j6) {
        this.Y = j6;
    }

    public final void j(long j6) {
        this.f14587Z = j6;
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
        this.f14605s = str;
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
        this.f14607y = aTAdRequest;
    }

    public final void b(String str) {
        this.f14568E = str;
    }

    public final void c(long j6) {
        this.f14581S = j6;
    }

    public final void d(long j6) {
        this.aa = j6;
    }

    public final void e(String str) {
        this.f14585W = str;
    }

    public final void f(String str) {
        this.J = str;
    }

    public final void g(String str) {
        this.f14577O = str;
    }

    public final void h(String str) {
        this.f14578P = str;
    }

    public final void i(String str) {
        this.af = str;
    }

    public final void j(String str) {
        this.az = str;
    }

    public final void k(String str) {
        this.f14592e = str;
    }

    public final void l(String str) {
        this.br = str;
    }

    public final void m(String str) {
        this.f14597k = str;
    }

    public final void n(long j6) {
        this.f14606t = j6;
    }

    public final void o(String str) {
        this.bd = str;
    }

    public final void p(long j6) {
        this.ba = j6;
    }

    public final void a(int i) {
        this.f14564A = i;
    }

    public final void b(double d9) {
        this.f14575M = d9;
    }

    public final void c(double d9) {
        this.ai = d9;
    }

    public final void d(double d9) {
        this.f14595h = d9;
    }

    public final void e(double d9) {
        this.f14596j = d9;
    }

    public final void f(double d9) {
        this.f14604r = d9;
    }

    public final void g(double d9) {
        this.aO = d9;
    }

    public final void h(double d9) {
        this.aP = d9;
    }

    public final void i(double d9) {
        this.bm = d9;
    }

    private void b(ad adVar) {
        this.ap = adVar;
    }

    public final void a(String str) {
        this.f14565B = str;
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
        this.f14569F = map;
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

    public final synchronized void a(bv bvVar, int i, int i4, int i6) {
        try {
            if (bvVar.f14585W.equals(this.f14585W)) {
                this.f14575M = bvVar.f14575M;
                this.f14596j = bvVar.f14596j;
                this.f14608z = bvVar.f14608z;
                this.aD = bvVar.aD;
                this.f14579Q = i4;
                this.f14577O = bvVar.f14577O;
                this.as = bvVar.as;
                this.an = 0;
                if (i == 0) {
                    this.aq = bvVar.aq;
                } else {
                    this.aq = i;
                }
                this.f14578P = bvVar.f14578P;
                this.ap = bvVar.ap;
                this.ar = i6;
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
        int i4 = 0;
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
                i4 = baseAd.getVideoWidth() > baseAd.getVideoHeight() ? 3 : 4;
            } else if (TextUtils.equals(baseAd.getAdType(), "2")) {
                if (baseAd.getImageUrlList() != null && baseAd.getImageUrlList().size() > 1) {
                    i4 = 5;
                } else if (baseAd.getMainImageWidth() > baseAd.getMainImageHeight()) {
                    str = str3;
                    str3 = title;
                    i4 = 1;
                } else {
                    i4 = 2;
                }
            }
            str = str3;
            str3 = title;
        }
        HashMap hashMap = new HashMap();
        this.aT = hashMap;
        hashMap.put(j.w.f13424z, Integer.valueOf(i4));
        this.aT.put(j.w.f13390A, str3);
        this.aT.put(j.w.f13391B, str);
        this.aT.put(j.w.f13392C, str2);
        this.aT.put(j.w.f13393D, Integer.valueOf(i));
    }

    public final void a(aa aaVar) {
        this.aY = aaVar;
    }

    public final void a(l lVar) {
        this.aw = lVar;
    }

    public final void a(ad adVar, int i, int i4, int i6) {
        this.f14579Q = i4;
        this.f14575M = adVar.getPrice();
        this.f14596j = adVar.getSortPrice();
        this.f14608z = adVar.getRmbPrice();
        this.aD = adVar.getCurrency();
        this.f14577O = adVar.token;
        this.as = adVar.f14216m;
        this.an = 0;
        this.aq = i;
        this.ap = adVar;
        this.ar = i6;
        if (i6 == 1) {
            this.f14578P = "";
        }
        if (this.aU != null) {
            String m9 = adVar.m();
            int o4 = adVar.o();
            String n9 = adVar.n();
            this.aU.b(m9);
            this.aU.d(n9);
            this.aU.a(o4);
        }
    }
}
