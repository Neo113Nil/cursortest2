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
    public static final int f14889B = 1;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14890C = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14891f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14892g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14893h = 1;
    public static final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14894j = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14895k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14896l = 10;

    /* renamed from: A, reason: collision with root package name */
    protected int f14897A;

    /* renamed from: D, reason: collision with root package name */
    protected int f14898D;

    /* renamed from: E, reason: collision with root package name */
    protected int f14899E;

    /* renamed from: F, reason: collision with root package name */
    protected String f14900F;

    /* renamed from: G, reason: collision with root package name */
    protected int f14901G;

    /* renamed from: H, reason: collision with root package name */
    protected String f14902H;

    /* renamed from: I, reason: collision with root package name */
    protected String f14903I;
    protected String J;

    /* renamed from: K, reason: collision with root package name */
    protected String f14904K;

    /* renamed from: L, reason: collision with root package name */
    protected String f14905L;

    /* renamed from: M, reason: collision with root package name */
    protected String f14906M;

    /* renamed from: N, reason: collision with root package name */
    protected String f14907N;

    /* renamed from: O, reason: collision with root package name */
    protected Bitmap f14908O;

    /* renamed from: P, reason: collision with root package name */
    protected y f14909P;

    /* renamed from: Q, reason: collision with root package name */
    protected String f14910Q;

    /* renamed from: R, reason: collision with root package name */
    protected String f14911R;

    /* renamed from: S, reason: collision with root package name */
    protected int f14912S;

    /* renamed from: T, reason: collision with root package name */
    protected String f14913T;

    /* renamed from: U, reason: collision with root package name */
    protected String f14914U;

    /* renamed from: V, reason: collision with root package name */
    protected String f14915V;

    /* renamed from: W, reason: collision with root package name */
    protected String f14916W;

    /* renamed from: X, reason: collision with root package name */
    protected int f14917X;
    protected int Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f14919a;
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
    private String f14920b;

    /* renamed from: c, reason: collision with root package name */
    private String f14921c;

    /* renamed from: d, reason: collision with root package name */
    private String f14922d;

    /* renamed from: e, reason: collision with root package name */
    private int f14923e;

    /* renamed from: m, reason: collision with root package name */
    protected String f14924m;

    /* renamed from: n, reason: collision with root package name */
    protected String f14925n;

    /* renamed from: o, reason: collision with root package name */
    protected String f14926o;

    /* renamed from: p, reason: collision with root package name */
    protected String f14927p;

    /* renamed from: q, reason: collision with root package name */
    protected String f14928q;

    /* renamed from: r, reason: collision with root package name */
    protected String f14929r;

    /* renamed from: s, reason: collision with root package name */
    protected String f14930s;

    /* renamed from: t, reason: collision with root package name */
    protected String f14931t;

    /* renamed from: u, reason: collision with root package name */
    protected String f14932u;

    /* renamed from: v, reason: collision with root package name */
    protected String f14933v;

    /* renamed from: w, reason: collision with root package name */
    protected String f14934w;

    /* renamed from: x, reason: collision with root package name */
    protected String f14935x;

    /* renamed from: y, reason: collision with root package name */
    protected String f14936y;

    /* renamed from: z, reason: collision with root package name */
    protected String f14937z;

    /* renamed from: Z, reason: collision with root package name */
    protected int f14918Z = -1;
    protected boolean aj = false;
    private String am = "";
    private String an = "";
    private String ao = "";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14938a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14939b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14940c = 3;
    }

    public final String A() {
        return this.f14929r;
    }

    public final String B() {
        return this.f14930s;
    }

    public final String C() {
        return this.f14931t;
    }

    public final String D() {
        return this.f14932u;
    }

    public final String E() {
        return this.f14933v;
    }

    public final String F() {
        return this.f14934w;
    }

    public final String G() {
        return this.f14935x;
    }

    public final String H() {
        return this.f14936y;
    }

    public final String I() {
        return this.f14937z;
    }

    public final int J() {
        return this.f14897A;
    }

    public final int K() {
        return this.f14898D;
    }

    public final boolean L() {
        return !TextUtils.isEmpty(this.f14933v);
    }

    public final String M() {
        return this.f14903I;
    }

    public final String N() {
        return this.J;
    }

    public final String O() {
        return this.f14904K;
    }

    public final String P() {
        return this.f14905L;
    }

    public final int Q() {
        return this.af;
    }

    public final String R() {
        return this.ag;
    }

    public final Bitmap S() {
        return this.f14908O;
    }

    public final boolean T() {
        return (TextUtils.isEmpty(this.J) || TextUtils.isEmpty(this.f14903I) || TextUtils.isEmpty(this.f14904K) || TextUtils.isEmpty(this.f14905L)) ? false : true;
    }

    public final String U() {
        return this.f14911R;
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
        return this.f14919a;
    }

    public final void Z() {
        this.f14919a = true;
    }

    public abstract String a();

    public abstract List<String> a(T t6);

    public final void a(Bitmap bitmap) {
        this.f14908O = bitmap;
    }

    public final int aa() {
        return this.f14918Z;
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
        return this.f14898D == 4;
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
        y yVar = this.f14909P;
        return yVar != null ? yVar.bH() : "";
    }

    public final int ao() {
        y yVar = this.f14909P;
        if (yVar == null || yVar.bD() != 1 || TextUtils.isEmpty(this.f14909P.bH()) || (this.f14909P.F() == 1 && TextUtils.isEmpty(this.f14933v))) {
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

    public final void d(int i4) {
        this.Y = i4;
    }

    public final void e(String str) {
        this.f14916W = str;
    }

    public final void f(String str) {
        this.f14913T = str;
    }

    public final void g(String str) {
        this.f14914U = str;
    }

    public final String h() {
        return this.f14906M;
    }

    public final int i() {
        return this.f14917X;
    }

    public final int j() {
        return this.Y;
    }

    public final String k() {
        return this.f14915V;
    }

    public final String l() {
        return this.f14916W;
    }

    public final int m() {
        return this.f14912S;
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
        int i4 = this.f14912S;
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            String valueOf = String.valueOf(this.f14909P.F());
            valueOf.getClass();
            switch (valueOf.hashCode()) {
                case com.anythink.basead.b.b.j.f6602W /* 48 */:
                    if (valueOf.equals("0")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case com.anythink.basead.b.b.j.f6603X /* 49 */:
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
                    if (TextUtils.isEmpty(this.f14933v) && !TextUtils.isEmpty(this.f14913T)) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    return !TextUtils.isEmpty(this.f14913T);
            }
        }
        return false;
    }

    public final String o() {
        return this.f14913T;
    }

    public final String p() {
        return this.f14914U;
    }

    public final String q() {
        return this.f14910Q;
    }

    public final y r() {
        return this.f14909P;
    }

    public final String s() {
        return this.f14907N;
    }

    public final int t() {
        return this.f14901G;
    }

    public final String u() {
        return this.f14902H;
    }

    public final String v() {
        return this.f14924m;
    }

    public final String w() {
        return this.f14925n;
    }

    public final String x() {
        return this.f14926o;
    }

    public final String y() {
        return this.f14927p;
    }

    public final String z() {
        return this.f14928q;
    }

    public final void A(String str) {
        this.J = str;
    }

    public final void B(String str) {
        this.f14904K = str;
    }

    public final void C(String str) {
        this.f14905L = str;
    }

    public final void D(String str) {
        this.ag = str;
    }

    public final void E(String str) {
        this.f14920b = str;
    }

    public final void F(String str) {
        this.f14921c = str;
    }

    public final void G(String str) {
        this.f14922d = str;
    }

    public final void H(String str) {
        this.f14911R = str;
    }

    public final boolean I(String str) {
        return TextUtils.equals(this.f14933v, str) && !TextUtils.isEmpty(str);
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
        this.f14906M = str;
    }

    public final void d(String str) {
        this.f14915V = str;
    }

    public final void e(int i4) {
        this.f14912S = i4;
    }

    public final void f(int i4) {
        this.f14901G = i4;
    }

    public final void g(int i4) {
        this.f14897A = i4;
    }

    public final void h(String str) {
        this.f14910Q = str;
    }

    public final void i(String str) {
        this.f14907N = str;
    }

    public final void j(String str) {
        this.f14902H = str;
    }

    public final void k(String str) {
        this.f14924m = str;
    }

    public final void l(String str) {
        this.f14925n = str;
    }

    public final void m(String str) {
        this.f14926o = str;
    }

    public final void o(String str) {
        this.f14928q = str;
    }

    public final void p(String str) {
        this.f14929r = str;
    }

    public final void q(String str) {
        this.f14930s = str;
    }

    public final void r(String str) {
        this.f14931t = str;
    }

    public final void s(String str) {
        this.f14932u = str;
    }

    public final void t(String str) {
        this.f14933v = str;
    }

    public final void u(String str) {
        this.f14934w = str;
    }

    public final void v(String str) {
        this.f14935x = str;
    }

    public final void w(String str) {
        this.f14936y = str;
    }

    public final void x(String str) {
        this.f14937z = str;
    }

    public final void y(String str) {
        this.f14900F = str;
    }

    public final void z(String str) {
        this.f14903I = str;
    }

    private int d() {
        return this.f14899E;
    }

    private String e() {
        return this.f14900F;
    }

    private int f() {
        return this.f14923e;
    }

    public final void c(int i4) {
        this.f14917X = i4;
    }

    public final void h(int i4) {
        this.f14898D = i4;
    }

    public final void i(int i4) {
        this.f14899E = i4;
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
        this.f14918Z = i4;
    }

    public final void o(int i4) {
        this.ab = i4;
    }

    public final void p(int i4) {
        this.f14923e = i4;
    }

    public final void q(int i4) {
        this.ak = i4;
    }

    public final void c(y yVar) {
        this.f14909P = yVar;
    }

    public String d(T t6) {
        return this.f14930s;
    }

    public final List<String> e(T t6) {
        HashSet hashSet = new HashSet();
        if (t6.au() == 1) {
            com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
        }
        if (t6.F() == 1) {
            if (t6.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12902a);
            }
            if (t6.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12916p);
            }
            if (t6.au() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12907f);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12908g);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12909h);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12911k);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12912l);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12913m);
            }
            if (TextUtils.isEmpty(this.f14933v) && t6.aq() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.br() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12911k);
            }
            if (t6.br() == 2) {
                if (com.anythink.core.common.v.q.b()) {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12915o);
                } else {
                    com.anythink.core.common.v.g.a().a(hashSet, b.d.f12914n);
                }
            }
        }
        if (t6.F() == 3) {
            if (t6.aQ() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12902a);
            }
            if (t6.aQ() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            if (t6.aQ() == 4) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12916p);
            }
            if (t6.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12903b);
            }
            if (t6.at() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12904c);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12905d);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
        }
        if (t6.F() == 4) {
            if (t6.bv() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12903b);
            }
            if (t6.bv() == 3) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12917q);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12919s);
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12918r);
            }
            if (t6.aD() > 0) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12906e);
            }
            if (t6.s() == 1) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.i);
            }
            boolean z6 = (b() == 1 && (t6 instanceof ba) && 2 != ((ba) t6).a()) ? false : true;
            if ((b() == 2 || b() == 4) && (this instanceof bj)) {
                z6 = 1 == ((bj) this).an;
            }
            if (!z6 && t6.bw() == 2) {
                com.anythink.core.common.v.g.a().a(hashSet, b.d.f12910j);
            }
        }
        return new ArrayList(hashSet);
    }

    public final void T(String str) {
        this.at = str;
    }

    public final void n(String str) {
        this.f14927p = str;
    }

    public final void n(int i4) {
        this.aa = i4;
    }
}
