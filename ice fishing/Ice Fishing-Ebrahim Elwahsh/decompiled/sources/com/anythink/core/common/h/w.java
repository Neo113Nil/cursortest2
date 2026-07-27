package com.anythink.core.common.h;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.common.a.b;
import com.anythink.core.common.h.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class w<T extends y> implements Serializable {

    /* renamed from: B, reason: collision with root package name */
    public static final int f14260B = 1;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14261C = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14262f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14263g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14264h = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14265j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14266k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14267l = 10;

    /* renamed from: A, reason: collision with root package name */
    protected int f14268A;

    /* renamed from: D, reason: collision with root package name */
    protected int f14269D;

    /* renamed from: E, reason: collision with root package name */
    protected int f14270E;

    /* renamed from: F, reason: collision with root package name */
    protected String f14271F;

    /* renamed from: G, reason: collision with root package name */
    protected int f14272G;

    /* renamed from: H, reason: collision with root package name */
    protected String f14273H;

    /* renamed from: I, reason: collision with root package name */
    protected String f14274I;
    protected String J;

    /* renamed from: K, reason: collision with root package name */
    protected String f14275K;

    /* renamed from: L, reason: collision with root package name */
    protected String f14276L;

    /* renamed from: M, reason: collision with root package name */
    protected String f14277M;

    /* renamed from: N, reason: collision with root package name */
    protected String f14278N;

    /* renamed from: O, reason: collision with root package name */
    protected Bitmap f14279O;

    /* renamed from: P, reason: collision with root package name */
    protected y f14280P;

    /* renamed from: Q, reason: collision with root package name */
    protected String f14281Q;

    /* renamed from: R, reason: collision with root package name */
    protected String f14282R;

    /* renamed from: S, reason: collision with root package name */
    protected int f14283S;

    /* renamed from: T, reason: collision with root package name */
    protected String f14284T;

    /* renamed from: U, reason: collision with root package name */
    protected String f14285U;

    /* renamed from: V, reason: collision with root package name */
    protected String f14286V;

    /* renamed from: W, reason: collision with root package name */
    protected String f14287W;

    /* renamed from: X, reason: collision with root package name */
    protected int f14288X;
    protected int Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14290a;
    protected int aa;
    protected int ab;
    protected int ac;
    protected int ad;
    protected long ae;
    protected int af;
    protected String ag;
    protected String ah;
    protected String ai;
    private int ak;
    private String al;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private String au;
    private String av;
    private String aw;

    /* renamed from: b, reason: collision with root package name */
    private String f14291b;

    /* renamed from: c, reason: collision with root package name */
    private String f14292c;

    /* renamed from: d, reason: collision with root package name */
    private String f14293d;

    /* renamed from: e, reason: collision with root package name */
    private int f14294e;

    /* renamed from: m, reason: collision with root package name */
    protected String f14295m;

    /* renamed from: n, reason: collision with root package name */
    protected String f14296n;

    /* renamed from: o, reason: collision with root package name */
    protected String f14297o;

    /* renamed from: p, reason: collision with root package name */
    protected String f14298p;

    /* renamed from: q, reason: collision with root package name */
    protected String f14299q;

    /* renamed from: r, reason: collision with root package name */
    protected String f14300r;

    /* renamed from: s, reason: collision with root package name */
    protected String f14301s;

    /* renamed from: t, reason: collision with root package name */
    protected String f14302t;

    /* renamed from: u, reason: collision with root package name */
    protected String f14303u;

    /* renamed from: v, reason: collision with root package name */
    protected String f14304v;

    /* renamed from: w, reason: collision with root package name */
    protected String f14305w;

    /* renamed from: x, reason: collision with root package name */
    protected String f14306x;

    /* renamed from: y, reason: collision with root package name */
    protected String f14307y;

    /* renamed from: z, reason: collision with root package name */
    protected String f14308z;

    /* renamed from: Z, reason: collision with root package name */
    protected int f14289Z = -1;
    protected boolean aj = false;
    private String am = "";
    private String an = "";
    private String ao = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14309a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14310b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14311c = 3;
    }

    public final String A() {
        return this.f14300r;
    }

    public final String B() {
        return this.f14301s;
    }

    public final String C() {
        return this.f14302t;
    }

    public final String D() {
        return this.f14303u;
    }

    public final String E() {
        return this.f14304v;
    }

    public final String F() {
        return this.f14305w;
    }

    public final String G() {
        return this.f14306x;
    }

    public final String H() {
        return this.f14307y;
    }

    public final String I() {
        return this.f14308z;
    }

    public final int J() {
        return this.f14268A;
    }

    public final int K() {
        return this.f14269D;
    }

    public final boolean L() {
        return !TextUtils.isEmpty(this.f14304v);
    }

    public final String M() {
        return this.f14274I;
    }

    public final String N() {
        return this.J;
    }

    public final String O() {
        return this.f14275K;
    }

    public final String P() {
        return this.f14276L;
    }

    public final int Q() {
        return this.af;
    }

    public final String R() {
        return this.ag;
    }

    public final Bitmap S() {
        return this.f14279O;
    }

    public final boolean T() {
        return (TextUtils.isEmpty(this.J) || TextUtils.isEmpty(this.f14274I) || TextUtils.isEmpty(this.f14275K) || TextUtils.isEmpty(this.f14276L)) ? false : true;
    }

    public final String U() {
        return this.f14282R;
    }

    public final int V() {
        return this.ac;
    }

    public final int W() {
        return this.ad;
    }

    public final long X() {
        return this.ae;
    }

    public final boolean Y() {
        return this.f14290a;
    }

    public final void Z() {
        this.f14290a = true;
    }

    public abstract String a();

    public abstract List<String> a(T t9);

    public final void a(Bitmap bitmap) {
        this.f14279O = bitmap;
    }

    public final int aa() {
        return this.f14289Z;
    }

    public final int ab() {
        return this.aa;
    }

    public final int ac() {
        return this.ab;
    }

    public final String ad() {
        return this.ah;
    }

    public final boolean ae() {
        return this.f14269D == 4;
    }

    public final String af() {
        return this.ai;
    }

    public final boolean ag() {
        return this.aj;
    }

    public final void ah() {
        this.aj = true;
    }

    public final int ai() {
        return this.ak;
    }

    public final String aj() {
        return this.al;
    }

    public final String ak() {
        return this.am;
    }

    public final String al() {
        return this.an;
    }

    public final String am() {
        return this.ao;
    }

    public final String an() {
        y yVar = this.f14280P;
        return yVar != null ? yVar.bH() : "";
    }

    public final int ao() {
        y yVar = this.f14280P;
        if (yVar == null || yVar.bD() != 1 || TextUtils.isEmpty(this.f14280P.bH()) || (this.f14280P.F() == 1 && TextUtils.isEmpty(this.f14304v))) {
            return n() ? 2 : 1;
        }
        return 3;
    }

    public final String ap() {
        return this.ap;
    }

    public final String aq() {
        return this.aq;
    }

    public final String ar() {
        return this.ar;
    }

    public final String as() {
        return this.as;
    }

    public final String at() {
        return this.at;
    }

    public final JSONArray au() {
        if (TextUtils.isEmpty(this.au)) {
            return null;
        }
        try {
            return new JSONArray(this.au);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String av() {
        return this.au;
    }

    public final String aw() {
        return this.av;
    }

    public final String ax() {
        return this.aw;
    }

    public abstract int b();

    public abstract List<String> b(T t9);

    public boolean c() {
        return false;
    }

    public final void d(int i4) {
        this.Y = i4;
    }

    public final void e(String str) {
        this.f14287W = str;
    }

    public final void f(String str) {
        this.f14284T = str;
    }

    public final void g(String str) {
        this.f14285U = str;
    }

    public final String h() {
        return this.f14277M;
    }

    public final int i() {
        return this.f14288X;
    }

    public final int j() {
        return this.Y;
    }

    public final String k() {
        return this.f14286V;
    }

    public final String l() {
        return this.f14287W;
    }

    public final int m() {
        return this.f14283S;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r2.equals("2") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        char c4 = 2;
        int i4 = this.f14283S;
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            String valueOf = String.valueOf(this.f14280P.F());
            valueOf.getClass();
            switch (valueOf.hashCode()) {
                case com.anythink.basead.b.b.j.f5973W /* 48 */:
                    if (valueOf.equals("0")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case com.anythink.basead.b.b.j.f5974X /* 49 */:
                    if (valueOf.equals("1")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 50:
                    break;
                case 51:
                    if (valueOf.equals("3")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 52:
                    if (valueOf.equals("4")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 2:
                case 4:
                    if (TextUtils.isEmpty(this.f14304v) && !TextUtils.isEmpty(this.f14284T)) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    return !TextUtils.isEmpty(this.f14284T);
            }
        }
        return false;
    }

    public final String o() {
        return this.f14284T;
    }

    public final String p() {
        return this.f14285U;
    }

    public final String q() {
        return this.f14281Q;
    }

    public final y r() {
        return this.f14280P;
    }

    public final String s() {
        return this.f14278N;
    }

    public final int t() {
        return this.f14272G;
    }

    public final String u() {
        return this.f14273H;
    }

    public final String v() {
        return this.f14295m;
    }

    public final String w() {
        return this.f14296n;
    }

    public final String x() {
        return this.f14297o;
    }

    public final String y() {
        return this.f14298p;
    }

    public final String z() {
        return this.f14299q;
    }

    public final void A(String str) {
        this.J = str;
    }

    public final void B(String str) {
        this.f14275K = str;
    }

    public final void C(String str) {
        this.f14276L = str;
    }

    public final void D(String str) {
        this.ag = str;
    }

    public final void E(String str) {
        this.f14291b = str;
    }

    public final void F(String str) {
        this.f14292c = str;
    }

    public final void G(String str) {
        this.f14293d = str;
    }

    public final void H(String str) {
        this.f14282R = str;
    }

    public final boolean I(String str) {
        return TextUtils.equals(this.f14304v, str) && !TextUtils.isEmpty(str);
    }

    public final void J(String str) {
        this.ah = str;
    }

    public final void K(String str) {
        this.ai = str;
    }

    public final void L(String str) {
        this.al = str;
    }

    public final void M(String str) {
        this.am = str;
    }

    public final void N(String str) {
        this.an = str;
    }

    public final void O(String str) {
        this.ao = str;
    }

    public final void P(String str) {
        this.ap = str;
    }

    public final void Q(String str) {
        this.aq = str;
    }

    public final void R(String str) {
        this.ar = str;
    }

    public final void S(String str) {
        this.as = str;
    }

    public final void U(String str) {
        this.au = str;
    }

    public final void V(String str) {
        this.av = str;
    }

    public final void W(String str) {
        this.aw = str;
    }

    public final void a(long j9) {
        this.ae = j9;
    }

    public final void c(String str) {
        this.f14277M = str;
    }

    public final void d(String str) {
        this.f14286V = str;
    }

    public final void e(int i4) {
        this.f14283S = i4;
    }

    public final void f(int i4) {
        this.f14272G = i4;
    }

    public final void g(int i4) {
        this.f14268A = i4;
    }

    public final void h(String str) {
        this.f14281Q = str;
    }

    public final void i(String str) {
        this.f14278N = str;
    }

    public final void j(String str) {
        this.f14273H = str;
    }

    public final void k(String str) {
        this.f14295m = str;
    }

    public final void l(String str) {
        this.f14296n = str;
    }

    public final void m(String str) {
        this.f14297o = str;
    }

    public final void o(String str) {
        this.f14299q = str;
    }

    public final void p(String str) {
        this.f14300r = str;
    }

    public final void q(String str) {
        this.f14301s = str;
    }

    public final void r(String str) {
        this.f14302t = str;
    }

    public final void s(String str) {
        this.f14303u = str;
    }

    public final void t(String str) {
        this.f14304v = str;
    }

    public final void u(String str) {
        this.f14305w = str;
    }

    public final void v(String str) {
        this.f14306x = str;
    }

    public final void w(String str) {
        this.f14307y = str;
    }

    public final void x(String str) {
        this.f14308z = str;
    }

    public final void y(String str) {
        this.f14271F = str;
    }

    public final void z(String str) {
        this.f14274I = str;
    }

    private int d() {
        return this.f14270E;
    }

    private String e() {
        return this.f14271F;
    }

    private int f() {
        return this.f14294e;
    }

    public final void c(int i4) {
        this.f14288X = i4;
    }

    public final void h(int i4) {
        this.f14269D = i4;
    }

    public final void i(int i4) {
        this.f14270E = i4;
    }

    public final void j(int i4) {
        this.af = i4;
    }

    public final void k(int i4) {
        this.ac = i4;
    }

    public final void l(int i4) {
        this.ad = i4;
    }

    public final void m(int i4) {
        this.f14289Z = i4;
    }

    public final void o(int i4) {
        this.ab = i4;
    }

    public final void p(int i4) {
        this.f14294e = i4;
    }

    public final void q(int i4) {
        this.ak = i4;
    }

    public final void c(y yVar) {
        this.f14280P = yVar;
    }

    public String d(T t9) {
        return this.f14301s;
    }

    public final List<String> e(T t9) {
        HashSet hashSet = new HashSet();
        if (t9.au() == 1) {
            com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
        }
        if (t9.F() == 1) {
            if (t9.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12273a);
            }
            if (t9.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t9.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12287p);
            }
            if (t9.au() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12278f);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12279g);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12280h);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12282k);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12283l);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12284m);
            }
            if (TextUtils.isEmpty(this.f14304v) && t9.aq() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t9.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t9.br() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12282k);
            }
            if (t9.br() == 2) {
                if (com.anythink.core.common.v.q.b()) {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12286o);
                } else {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12285n);
                }
            }
        }
        if (t9.F() == 3) {
            if (t9.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12273a);
            }
            if (t9.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t9.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12287p);
            }
            if (t9.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12274b);
            }
            if (t9.at() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12275c);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12276d);
            }
            if (t9.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
        }
        if (t9.F() == 4) {
            if (t9.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12274b);
            }
            if (t9.bv() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12288q);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12290s);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12289r);
            }
            if (t9.aD() > 0) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12277e);
            }
            if (t9.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            boolean z8 = (b() == 1 && (t9 instanceof ba) && 2 != ((ba) t9).a()) ? false : true;
            if ((b() == 2 || b() == 4) && (this instanceof bj)) {
                z8 = 1 == ((bj) this).an;
            }
            if (!z8 && t9.bw() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12281j);
            }
        }
        return new ArrayList(hashSet);
    }

    public final void T(String str) {
        this.at = str;
    }

    public final void n(String str) {
        this.f14298p = str;
    }

    public final void n(int i4) {
        this.aa = i4;
    }
}
