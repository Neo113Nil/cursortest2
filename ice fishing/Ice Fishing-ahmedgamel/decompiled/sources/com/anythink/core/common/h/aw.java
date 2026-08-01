package com.anythink.core.common.h;

import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    double f13574a;

    /* renamed from: b, reason: collision with root package name */
    bv f13575b;

    /* renamed from: c, reason: collision with root package name */
    ATAdMixBidInfo.BidEntity f13576c;

    /* renamed from: d, reason: collision with root package name */
    private int f13577d;

    /* renamed from: e, reason: collision with root package name */
    private n f13578e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13579f;

    /* renamed from: g, reason: collision with root package name */
    private String f13580g;

    /* renamed from: h, reason: collision with root package name */
    private int f13581h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private String f13582j;

    /* renamed from: k, reason: collision with root package name */
    private String f13583k;

    /* renamed from: l, reason: collision with root package name */
    private Double f13584l;

    /* renamed from: m, reason: collision with root package name */
    private int f13585m;

    /* renamed from: n, reason: collision with root package name */
    private double f13586n;

    /* renamed from: o, reason: collision with root package name */
    private String f13587o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13588p;

    /* renamed from: q, reason: collision with root package name */
    private String f13589q;

    /* renamed from: r, reason: collision with root package name */
    private int f13590r;

    /* renamed from: s, reason: collision with root package name */
    private int f13591s;

    /* renamed from: t, reason: collision with root package name */
    private int f13592t;

    /* renamed from: u, reason: collision with root package name */
    private double f13593u;

    /* renamed from: v, reason: collision with root package name */
    private double f13594v;

    public aw(int i, bv bvVar, n nVar) {
        this.f13584l = null;
        this.f13590r = 1;
        this.f13577d = i;
        this.f13575b = bvVar;
        this.f13579f = bvVar.am();
        if (nVar != null) {
            n af = nVar.af();
            this.f13578e = af;
            com.anythink.core.common.v.aj.a(af, bvVar, 0, false);
        }
        this.f13580g = "0";
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f13580g = "2";
        } else if (q8 == 5 || q8 == 6) {
            this.f13580g = "3";
        } else {
            this.f13580g = "1";
        }
        this.f13581h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f13589q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f13590r = bvVar.bs();
    }

    private String I() {
        n nVar = this.f13578e;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String J() {
        n nVar = this.f13578e;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    public final bv A() {
        return this.f13575b;
    }

    public final String B() {
        return this.f13588p ? "1" : "0";
    }

    public final String C() {
        return this.f13589q;
    }

    public final int D() {
        return this.f13590r;
    }

    public final int E() {
        return this.f13592t;
    }

    public final MgComparedResult F() {
        n nVar = this.f13578e;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final double G() {
        return this.f13593u;
    }

    public final double H() {
        return this.f13594v;
    }

    public final ATAdMixBidInfo.BidEntity a() {
        return this.f13576c;
    }

    public final int b() {
        return this.f13591s;
    }

    public final double c() {
        return this.i;
    }

    public final String d() {
        return this.f13582j;
    }

    public final String e() {
        return this.f13583k;
    }

    public final boolean f() {
        return this.f13579f;
    }

    public final double g() {
        return this.f13574a;
    }

    public final int h() {
        return this.f13577d;
    }

    public final String i() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.aJ() : "";
    }

    public final String j() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.aI() : "";
    }

    public final int k() {
        n nVar = this.f13578e;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.aH() : "";
    }

    public final String n() {
        n nVar = this.f13578e;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final String o() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.aB() : "";
    }

    public final String p() {
        n nVar = this.f13578e;
        return nVar != null ? nVar.aC() : "";
    }

    public final JSONObject q() {
        n nVar = this.f13578e;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final int r() {
        n nVar = this.f13578e;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String s() {
        return this.f13580g;
    }

    public final int t() {
        return this.f13581h;
    }

    public final boolean u() {
        return this.f13581h == 1;
    }

    public final Double v() {
        return this.f13584l;
    }

    public final int w() {
        return this.f13585m;
    }

    public final double x() {
        return this.f13586n;
    }

    public final String y() {
        return this.f13587o;
    }

    public final n z() {
        return this.f13578e;
    }

    private void d(int i) {
        this.f13590r = i;
    }

    public final void a(ATAdMixBidInfo.BidEntity bidEntity) {
        this.f13576c = bidEntity;
    }

    public final void b(int i) {
        this.f13585m = i;
    }

    public final void c(int i) {
        this.f13592t = i;
    }

    public final void a(int i) {
        this.f13591s = i;
    }

    public final void b(double d2) {
        this.f13593u = d2;
    }

    public final void c(double d2) {
        this.f13594v = d2;
    }

    public final void a(double d2, String str, String str2) {
        this.i = d2;
        this.f13582j = str;
        this.f13583k = str2;
    }

    private void a(bv bvVar) {
        this.f13580g = "0";
        if (bvVar == null) {
            return;
        }
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f13580g = "2";
        } else if (q8 != 5 && q8 != 6) {
            this.f13580g = "1";
        } else {
            this.f13580g = "3";
        }
        this.f13581h = bvVar.aH();
        if (bvVar.g() == 8) {
            try {
                this.f13589q = bvVar.l().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.f13590r = bvVar.bs();
    }

    public final void a(Double d2) {
        this.f13584l = d2;
    }

    public final void a(double d2) {
        this.f13586n = d2;
    }

    public aw(int i, bv bvVar, n nVar, double d2) {
        this(i, bvVar, nVar);
        this.f13574a = d2;
    }

    public final void a(String str) {
        this.f13587o = str;
    }

    public final void a(boolean z3) {
        this.f13588p = z3;
    }
}
