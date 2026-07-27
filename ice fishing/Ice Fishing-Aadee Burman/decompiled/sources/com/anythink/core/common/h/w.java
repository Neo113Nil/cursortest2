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
    public static final int f14103B = 1;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14104C = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14105f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14106g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14107h = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14108j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14109k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14110l = 10;

    /* renamed from: A, reason: collision with root package name */
    protected int f14111A;

    /* renamed from: D, reason: collision with root package name */
    protected int f14112D;

    /* renamed from: E, reason: collision with root package name */
    protected int f14113E;

    /* renamed from: F, reason: collision with root package name */
    protected String f14114F;

    /* renamed from: G, reason: collision with root package name */
    protected int f14115G;

    /* renamed from: H, reason: collision with root package name */
    protected String f14116H;

    /* renamed from: I, reason: collision with root package name */
    protected String f14117I;
    protected String J;

    /* renamed from: K, reason: collision with root package name */
    protected String f14118K;

    /* renamed from: L, reason: collision with root package name */
    protected String f14119L;

    /* renamed from: M, reason: collision with root package name */
    protected String f14120M;

    /* renamed from: N, reason: collision with root package name */
    protected String f14121N;

    /* renamed from: O, reason: collision with root package name */
    protected Bitmap f14122O;

    /* renamed from: P, reason: collision with root package name */
    protected y f14123P;

    /* renamed from: Q, reason: collision with root package name */
    protected String f14124Q;

    /* renamed from: R, reason: collision with root package name */
    protected String f14125R;

    /* renamed from: S, reason: collision with root package name */
    protected int f14126S;

    /* renamed from: T, reason: collision with root package name */
    protected String f14127T;

    /* renamed from: U, reason: collision with root package name */
    protected String f14128U;

    /* renamed from: V, reason: collision with root package name */
    protected String f14129V;

    /* renamed from: W, reason: collision with root package name */
    protected String f14130W;

    /* renamed from: X, reason: collision with root package name */
    protected int f14131X;
    protected int Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14133a;
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
    private String f14134b;

    /* renamed from: c, reason: collision with root package name */
    private String f14135c;

    /* renamed from: d, reason: collision with root package name */
    private String f14136d;

    /* renamed from: e, reason: collision with root package name */
    private int f14137e;

    /* renamed from: m, reason: collision with root package name */
    protected String f14138m;

    /* renamed from: n, reason: collision with root package name */
    protected String f14139n;

    /* renamed from: o, reason: collision with root package name */
    protected String f14140o;

    /* renamed from: p, reason: collision with root package name */
    protected String f14141p;

    /* renamed from: q, reason: collision with root package name */
    protected String f14142q;

    /* renamed from: r, reason: collision with root package name */
    protected String f14143r;

    /* renamed from: s, reason: collision with root package name */
    protected String f14144s;

    /* renamed from: t, reason: collision with root package name */
    protected String f14145t;

    /* renamed from: u, reason: collision with root package name */
    protected String f14146u;

    /* renamed from: v, reason: collision with root package name */
    protected String f14147v;

    /* renamed from: w, reason: collision with root package name */
    protected String f14148w;

    /* renamed from: x, reason: collision with root package name */
    protected String f14149x;

    /* renamed from: y, reason: collision with root package name */
    protected String f14150y;

    /* renamed from: z, reason: collision with root package name */
    protected String f14151z;

    /* renamed from: Z, reason: collision with root package name */
    protected int f14132Z = -1;
    protected boolean aj = false;
    private String am = "";
    private String an = "";
    private String ao = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14152a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14153b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14154c = 3;
    }

    public final String A() {
        return this.f14143r;
    }

    public final String B() {
        return this.f14144s;
    }

    public final String C() {
        return this.f14145t;
    }

    public final String D() {
        return this.f14146u;
    }

    public final String E() {
        return this.f14147v;
    }

    public final String F() {
        return this.f14148w;
    }

    public final String G() {
        return this.f14149x;
    }

    public final String H() {
        return this.f14150y;
    }

    public final String I() {
        return this.f14151z;
    }

    public final int J() {
        return this.f14111A;
    }

    public final int K() {
        return this.f14112D;
    }

    public final boolean L() {
        return !TextUtils.isEmpty(this.f14147v);
    }

    public final String M() {
        return this.f14117I;
    }

    public final String N() {
        return this.J;
    }

    public final String O() {
        return this.f14118K;
    }

    public final String P() {
        return this.f14119L;
    }

    public final int Q() {
        return this.af;
    }

    public final String R() {
        return this.ag;
    }

    public final Bitmap S() {
        return this.f14122O;
    }

    public final boolean T() {
        return (TextUtils.isEmpty(this.J) || TextUtils.isEmpty(this.f14117I) || TextUtils.isEmpty(this.f14118K) || TextUtils.isEmpty(this.f14119L)) ? false : true;
    }

    public final String U() {
        return this.f14125R;
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
        return this.f14133a;
    }

    public final void Z() {
        this.f14133a = true;
    }

    public abstract String a();

    public abstract List<String> a(T t6);

    public final void a(Bitmap bitmap) {
        this.f14122O = bitmap;
    }

    public final int aa() {
        return this.f14132Z;
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
        return this.f14112D == 4;
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
        y yVar = this.f14123P;
        return yVar != null ? yVar.bH() : "";
    }

    public final int ao() {
        y yVar = this.f14123P;
        if (yVar == null || yVar.bD() != 1 || TextUtils.isEmpty(this.f14123P.bH()) || (this.f14123P.F() == 1 && TextUtils.isEmpty(this.f14147v))) {
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

    public abstract List<String> b(T t6);

    public boolean c() {
        return false;
    }

    public final void d(int i6) {
        this.Y = i6;
    }

    public final void e(String str) {
        this.f14130W = str;
    }

    public final void f(String str) {
        this.f14127T = str;
    }

    public final void g(String str) {
        this.f14128U = str;
    }

    public final String h() {
        return this.f14120M;
    }

    public final int i() {
        return this.f14131X;
    }

    public final int j() {
        return this.Y;
    }

    public final String k() {
        return this.f14129V;
    }

    public final String l() {
        return this.f14130W;
    }

    public final int m() {
        return this.f14126S;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r2.equals("2") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        char c9 = 2;
        int i6 = this.f14126S;
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            String valueOf = String.valueOf(this.f14123P.F());
            valueOf.getClass();
            switch (valueOf.hashCode()) {
                case com.anythink.basead.b.b.j.f5816W /* 48 */:
                    if (valueOf.equals("0")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case com.anythink.basead.b.b.j.f5817X /* 49 */:
                    if (valueOf.equals("1")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 50:
                    break;
                case 51:
                    if (valueOf.equals("3")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 52:
                    if (valueOf.equals("4")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                case 2:
                case 4:
                    if (TextUtils.isEmpty(this.f14147v) && !TextUtils.isEmpty(this.f14127T)) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    return !TextUtils.isEmpty(this.f14127T);
            }
        }
        return false;
    }

    public final String o() {
        return this.f14127T;
    }

    public final String p() {
        return this.f14128U;
    }

    public final String q() {
        return this.f14124Q;
    }

    public final y r() {
        return this.f14123P;
    }

    public final String s() {
        return this.f14121N;
    }

    public final int t() {
        return this.f14115G;
    }

    public final String u() {
        return this.f14116H;
    }

    public final String v() {
        return this.f14138m;
    }

    public final String w() {
        return this.f14139n;
    }

    public final String x() {
        return this.f14140o;
    }

    public final String y() {
        return this.f14141p;
    }

    public final String z() {
        return this.f14142q;
    }

    public final void A(String str) {
        this.J = str;
    }

    public final void B(String str) {
        this.f14118K = str;
    }

    public final void C(String str) {
        this.f14119L = str;
    }

    public final void D(String str) {
        this.ag = str;
    }

    public final void E(String str) {
        this.f14134b = str;
    }

    public final void F(String str) {
        this.f14135c = str;
    }

    public final void G(String str) {
        this.f14136d = str;
    }

    public final void H(String str) {
        this.f14125R = str;
    }

    public final boolean I(String str) {
        return TextUtils.equals(this.f14147v, str) && !TextUtils.isEmpty(str);
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

    public final void a(long j6) {
        this.ae = j6;
    }

    public final void c(String str) {
        this.f14120M = str;
    }

    public final void d(String str) {
        this.f14129V = str;
    }

    public final void e(int i6) {
        this.f14126S = i6;
    }

    public final void f(int i6) {
        this.f14115G = i6;
    }

    public final void g(int i6) {
        this.f14111A = i6;
    }

    public final void h(String str) {
        this.f14124Q = str;
    }

    public final void i(String str) {
        this.f14121N = str;
    }

    public final void j(String str) {
        this.f14116H = str;
    }

    public final void k(String str) {
        this.f14138m = str;
    }

    public final void l(String str) {
        this.f14139n = str;
    }

    public final void m(String str) {
        this.f14140o = str;
    }

    public final void o(String str) {
        this.f14142q = str;
    }

    public final void p(String str) {
        this.f14143r = str;
    }

    public final void q(String str) {
        this.f14144s = str;
    }

    public final void r(String str) {
        this.f14145t = str;
    }

    public final void s(String str) {
        this.f14146u = str;
    }

    public final void t(String str) {
        this.f14147v = str;
    }

    public final void u(String str) {
        this.f14148w = str;
    }

    public final void v(String str) {
        this.f14149x = str;
    }

    public final void w(String str) {
        this.f14150y = str;
    }

    public final void x(String str) {
        this.f14151z = str;
    }

    public final void y(String str) {
        this.f14114F = str;
    }

    public final void z(String str) {
        this.f14117I = str;
    }

    private int d() {
        return this.f14113E;
    }

    private String e() {
        return this.f14114F;
    }

    private int f() {
        return this.f14137e;
    }

    public final void c(int i6) {
        this.f14131X = i6;
    }

    public final void h(int i6) {
        this.f14112D = i6;
    }

    public final void i(int i6) {
        this.f14113E = i6;
    }

    public final void j(int i6) {
        this.af = i6;
    }

    public final void k(int i6) {
        this.ac = i6;
    }

    public final void l(int i6) {
        this.ad = i6;
    }

    public final void m(int i6) {
        this.f14132Z = i6;
    }

    public final void o(int i6) {
        this.ab = i6;
    }

    public final void p(int i6) {
        this.f14137e = i6;
    }

    public final void q(int i6) {
        this.ak = i6;
    }

    public final void c(y yVar) {
        this.f14123P = yVar;
    }

    public String d(T t6) {
        return this.f14144s;
    }

    public final List<String> e(T t6) {
        HashSet hashSet = new HashSet();
        if (t6.au() == 1) {
            com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
        }
        if (t6.F() == 1) {
            if (t6.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12116a);
            }
            if (t6.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12130p);
            }
            if (t6.au() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12121f);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12122g);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12123h);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12125k);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12126l);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12127m);
            }
            if (TextUtils.isEmpty(this.f14147v) && t6.aq() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.br() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12125k);
            }
            if (t6.br() == 2) {
                if (com.anythink.core.common.v.q.b()) {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12129o);
                } else {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12128n);
                }
            }
        }
        if (t6.F() == 3) {
            if (t6.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12116a);
            }
            if (t6.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12130p);
            }
            if (t6.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12117b);
            }
            if (t6.at() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12118c);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12119d);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
        }
        if (t6.F() == 4) {
            if (t6.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12117b);
            }
            if (t6.bv() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12131q);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12133s);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12132r);
            }
            if (t6.aD() > 0) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12120e);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            boolean z3 = (b() == 1 && (t6 instanceof ba) && 2 != ((ba) t6).a()) ? false : true;
            if ((b() == 2 || b() == 4) && (this instanceof bj)) {
                z3 = 1 == ((bj) this).an;
            }
            if (!z3 && t6.bw() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12124j);
            }
        }
        return new ArrayList(hashSet);
    }

    public final void T(String str) {
        this.at = str;
    }

    public final void n(String str) {
        this.f14141p = str;
    }

    public final void n(int i6) {
        this.aa = i6;
    }
}
