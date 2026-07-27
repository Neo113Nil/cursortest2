package com.anythink.core.common.h;

import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    double f13731a;

    /* renamed from: b, reason: collision with root package name */
    bv f13732b;

    /* renamed from: c, reason: collision with root package name */
    ATAdMixBidInfo.BidEntity f13733c;

    /* renamed from: d, reason: collision with root package name */
    private int f13734d;

    /* renamed from: e, reason: collision with root package name */
    private n f13735e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13736f;

    /* renamed from: g, reason: collision with root package name */
    private String f13737g;

    /* renamed from: h, reason: collision with root package name */
    private int f13738h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private String f13739j;

    /* renamed from: k, reason: collision with root package name */
    private String f13740k;

    /* renamed from: l, reason: collision with root package name */
    private Double f13741l;

    /* renamed from: m, reason: collision with root package name */
    private int f13742m;

    /* renamed from: n, reason: collision with root package name */
    private double f13743n;

    /* renamed from: o, reason: collision with root package name */
    private String f13744o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13745p;

    /* renamed from: q, reason: collision with root package name */
    private String f13746q;

    /* renamed from: r, reason: collision with root package name */
    private int f13747r;

    /* renamed from: s, reason: collision with root package name */
    private int f13748s;

    /* renamed from: t, reason: collision with root package name */
    private int f13749t;

    /* renamed from: u, reason: collision with root package name */
    private double f13750u;

    /* renamed from: v, reason: collision with root package name */
    private double f13751v;

    public aw(int i, bv bvVar, n nVar) {
        this.f13741l = null;
        this.f13747r = 1;
        this.f13734d = i;
        this.f13732b = bvVar;
        this.f13736f = bvVar.am();
        if (nVar != null) {
            n af = nVar.af();
            this.f13735e = af;
            com.anythink.core.common.v.aj.a(af, bvVar, 0, false);
        }
        this.f13737g = "0";
        int q6 = bvVar.q();
        if (q6 == 2) {
            this.f13737g = "2";
        } else if (q6 == 5 || q6 == 6) {
            this.f13737g = "3";
        } else {
            this.f13737g = "1";
        }
        this.f13738h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f13746q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f13747r = bvVar.bs();
    }

    private String I() {
        n nVar = this.f13735e;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String J() {
        n nVar = this.f13735e;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    public final bv A() {
        return this.f13732b;
    }

    public final String B() {
        return this.f13745p ? "1" : "0";
    }

    public final String C() {
        return this.f13746q;
    }

    public final int D() {
        return this.f13747r;
    }

    public final int E() {
        return this.f13749t;
    }

    public final MgComparedResult F() {
        n nVar = this.f13735e;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final double G() {
        return this.f13750u;
    }

    public final double H() {
        return this.f13751v;
    }

    public final ATAdMixBidInfo.BidEntity a() {
        return this.f13733c;
    }

    public final int b() {
        return this.f13748s;
    }

    public final double c() {
        return this.i;
    }

    public final String d() {
        return this.f13739j;
    }

    public final String e() {
        return this.f13740k;
    }

    public final boolean f() {
        return this.f13736f;
    }

    public final double g() {
        return this.f13731a;
    }

    public final int h() {
        return this.f13734d;
    }

    public final String i() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.aJ() : "";
    }

    public final String j() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.aI() : "";
    }

    public final int k() {
        n nVar = this.f13735e;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.aH() : "";
    }

    public final String n() {
        n nVar = this.f13735e;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final String o() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.aB() : "";
    }

    public final String p() {
        n nVar = this.f13735e;
        return nVar != null ? nVar.aC() : "";
    }

    public final JSONObject q() {
        n nVar = this.f13735e;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final int r() {
        n nVar = this.f13735e;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String s() {
        return this.f13737g;
    }

    public final int t() {
        return this.f13738h;
    }

    public final boolean u() {
        return this.f13738h == 1;
    }

    public final Double v() {
        return this.f13741l;
    }

    public final int w() {
        return this.f13742m;
    }

    public final double x() {
        return this.f13743n;
    }

    public final String y() {
        return this.f13744o;
    }

    public final n z() {
        return this.f13735e;
    }

    private void d(int i) {
        this.f13747r = i;
    }

    public final void a(ATAdMixBidInfo.BidEntity bidEntity) {
        this.f13733c = bidEntity;
    }

    public final void b(int i) {
        this.f13742m = i;
    }

    public final void c(int i) {
        this.f13749t = i;
    }

    public final void a(int i) {
        this.f13748s = i;
    }

    public final void b(double d2) {
        this.f13750u = d2;
    }

    public final void c(double d2) {
        this.f13751v = d2;
    }

    public final void a(double d2, String str, String str2) {
        this.i = d2;
        this.f13739j = str;
        this.f13740k = str2;
    }

    private void a(bv bvVar) {
        this.f13737g = "0";
        if (bvVar == null) {
            return;
        }
        int q6 = bvVar.q();
        if (q6 == 2) {
            this.f13737g = "2";
        } else if (q6 != 5 && q6 != 6) {
            this.f13737g = "1";
        } else {
            this.f13737g = "3";
        }
        this.f13738h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f13746q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f13747r = bvVar.bs();
    }

    public final void a(Double d2) {
        this.f13741l = d2;
    }

    public final void a(double d2) {
        this.f13743n = d2;
    }

    public aw(int i, bv bvVar, n nVar, double d2) {
        this(i, bvVar, nVar);
        this.f13731a = d2;
    }

    public final void a(String str) {
        this.f13744o = str;
    }

    public final void a(boolean z8) {
        this.f13745p = z8;
    }
}
