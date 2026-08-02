package com.anythink.core.common.h;

import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    double f14360a;

    /* renamed from: b, reason: collision with root package name */
    bv f14361b;

    /* renamed from: c, reason: collision with root package name */
    ATAdMixBidInfo.BidEntity f14362c;

    /* renamed from: d, reason: collision with root package name */
    private int f14363d;

    /* renamed from: e, reason: collision with root package name */
    private n f14364e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14365f;

    /* renamed from: g, reason: collision with root package name */
    private String f14366g;

    /* renamed from: h, reason: collision with root package name */
    private int f14367h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private String f14368j;

    /* renamed from: k, reason: collision with root package name */
    private String f14369k;

    /* renamed from: l, reason: collision with root package name */
    private Double f14370l;

    /* renamed from: m, reason: collision with root package name */
    private int f14371m;

    /* renamed from: n, reason: collision with root package name */
    private double f14372n;

    /* renamed from: o, reason: collision with root package name */
    private String f14373o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14374p;

    /* renamed from: q, reason: collision with root package name */
    private String f14375q;

    /* renamed from: r, reason: collision with root package name */
    private int f14376r;

    /* renamed from: s, reason: collision with root package name */
    private int f14377s;

    /* renamed from: t, reason: collision with root package name */
    private int f14378t;

    /* renamed from: u, reason: collision with root package name */
    private double f14379u;

    /* renamed from: v, reason: collision with root package name */
    private double f14380v;

    public aw(int i, bv bvVar, n nVar) {
        this.f14370l = null;
        this.f14376r = 1;
        this.f14363d = i;
        this.f14361b = bvVar;
        this.f14365f = bvVar.am();
        if (nVar != null) {
            n af = nVar.af();
            this.f14364e = af;
            com.anythink.core.common.v.aj.a(af, bvVar, 0, false);
        }
        this.f14366g = "0";
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f14366g = "2";
        } else if (q8 == 5 || q8 == 6) {
            this.f14366g = "3";
        } else {
            this.f14366g = "1";
        }
        this.f14367h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f14375q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f14376r = bvVar.bs();
    }

    private String I() {
        n nVar = this.f14364e;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String J() {
        n nVar = this.f14364e;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    public final bv A() {
        return this.f14361b;
    }

    public final String B() {
        return this.f14374p ? "1" : "0";
    }

    public final String C() {
        return this.f14375q;
    }

    public final int D() {
        return this.f14376r;
    }

    public final int E() {
        return this.f14378t;
    }

    public final MgComparedResult F() {
        n nVar = this.f14364e;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final double G() {
        return this.f14379u;
    }

    public final double H() {
        return this.f14380v;
    }

    public final ATAdMixBidInfo.BidEntity a() {
        return this.f14362c;
    }

    public final int b() {
        return this.f14377s;
    }

    public final double c() {
        return this.i;
    }

    public final String d() {
        return this.f14368j;
    }

    public final String e() {
        return this.f14369k;
    }

    public final boolean f() {
        return this.f14365f;
    }

    public final double g() {
        return this.f14360a;
    }

    public final int h() {
        return this.f14363d;
    }

    public final String i() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.aJ() : "";
    }

    public final String j() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.aI() : "";
    }

    public final int k() {
        n nVar = this.f14364e;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.aH() : "";
    }

    public final String n() {
        n nVar = this.f14364e;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final String o() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.aB() : "";
    }

    public final String p() {
        n nVar = this.f14364e;
        return nVar != null ? nVar.aC() : "";
    }

    public final JSONObject q() {
        n nVar = this.f14364e;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final int r() {
        n nVar = this.f14364e;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String s() {
        return this.f14366g;
    }

    public final int t() {
        return this.f14367h;
    }

    public final boolean u() {
        return this.f14367h == 1;
    }

    public final Double v() {
        return this.f14370l;
    }

    public final int w() {
        return this.f14371m;
    }

    public final double x() {
        return this.f14372n;
    }

    public final String y() {
        return this.f14373o;
    }

    public final n z() {
        return this.f14364e;
    }

    private void d(int i) {
        this.f14376r = i;
    }

    public final void a(ATAdMixBidInfo.BidEntity bidEntity) {
        this.f14362c = bidEntity;
    }

    public final void b(int i) {
        this.f14371m = i;
    }

    public final void c(int i) {
        this.f14378t = i;
    }

    public final void a(int i) {
        this.f14377s = i;
    }

    public final void b(double d9) {
        this.f14379u = d9;
    }

    public final void c(double d9) {
        this.f14380v = d9;
    }

    public final void a(double d9, String str, String str2) {
        this.i = d9;
        this.f14368j = str;
        this.f14369k = str2;
    }

    private void a(bv bvVar) {
        this.f14366g = "0";
        if (bvVar == null) {
            return;
        }
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f14366g = "2";
        } else if (q8 != 5 && q8 != 6) {
            this.f14366g = "1";
        } else {
            this.f14366g = "3";
        }
        this.f14367h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f14375q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f14376r = bvVar.bs();
    }

    public final void a(Double d9) {
        this.f14370l = d9;
    }

    public final void a(double d9) {
        this.f14372n = d9;
    }

    public aw(int i, bv bvVar, n nVar, double d9) {
        this(i, bvVar, nVar);
        this.f14360a = d9;
    }

    public final void a(String str) {
        this.f14373o = str;
    }

    public final void a(boolean z6) {
        this.f14374p = z6;
    }
}
