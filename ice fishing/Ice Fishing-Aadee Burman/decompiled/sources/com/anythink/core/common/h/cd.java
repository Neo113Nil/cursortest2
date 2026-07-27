package com.anythink.core.common.h;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    int f13910a;

    /* renamed from: b, reason: collision with root package name */
    private n f13911b;

    /* renamed from: c, reason: collision with root package name */
    private bv f13912c;

    /* renamed from: d, reason: collision with root package name */
    private String f13913d;

    /* renamed from: e, reason: collision with root package name */
    private String f13914e;

    /* renamed from: f, reason: collision with root package name */
    private String f13915f;

    /* renamed from: g, reason: collision with root package name */
    private String f13916g;

    /* renamed from: h, reason: collision with root package name */
    private String f13917h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private double f13918j;

    /* renamed from: k, reason: collision with root package name */
    private double f13919k;

    /* renamed from: l, reason: collision with root package name */
    private double f13920l;

    /* renamed from: m, reason: collision with root package name */
    private int f13921m;

    /* renamed from: n, reason: collision with root package name */
    private Double f13922n = null;

    /* renamed from: o, reason: collision with root package name */
    private String f13923o = null;

    /* renamed from: p, reason: collision with root package name */
    private Double f13924p;

    /* renamed from: q, reason: collision with root package name */
    private Double f13925q;

    /* renamed from: r, reason: collision with root package name */
    private int f13926r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13927s;

    /* renamed from: t, reason: collision with root package name */
    private double f13928t;

    private String D() {
        n nVar = this.f13911b;
        return nVar != null ? nVar.aJ() : "";
    }

    private String E() {
        n nVar = this.f13911b;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String F() {
        n nVar = this.f13911b;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    private String G() {
        n nVar = this.f13911b;
        return nVar != null ? nVar.aI() : "";
    }

    private String H() {
        n nVar = this.f13911b;
        return nVar != null ? nVar.aH() : "";
    }

    public final int A() {
        n nVar = this.f13911b;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String B() {
        return this.f13927s ? "1" : "0";
    }

    public final MgComparedResult C() {
        n nVar = this.f13911b;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final void a(Double d2, String str) {
        this.f13922n = d2;
        this.f13923o = str;
    }

    public final String b() {
        return this.f13923o;
    }

    public final Double c() {
        return this.f13924p;
    }

    public final int d() {
        return this.f13910a;
    }

    public final String e() {
        return this.f13913d;
    }

    public final String f() {
        return this.f13914e;
    }

    public final String g() {
        return this.f13915f;
    }

    public final String h() {
        return this.f13916g;
    }

    public final String i() {
        n nVar = this.f13911b;
        return nVar != null ? nVar.o() : "";
    }

    public final String j() {
        return this.f13917h;
    }

    public final int k() {
        n nVar = this.f13911b;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f13911b;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f13911b;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final JSONObject n() {
        n nVar = this.f13911b;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final double o() {
        return this.i;
    }

    public final double p() {
        return this.f13918j;
    }

    public final double q() {
        return this.f13928t;
    }

    public final double r() {
        return this.f13919k;
    }

    public final void s() {
        this.f13919k = 0.0d;
    }

    public final double t() {
        return this.f13920l;
    }

    public final int u() {
        return this.f13921m;
    }

    public final boolean v() {
        return this.f13921m == 1;
    }

    public final Double w() {
        return this.f13925q;
    }

    public final int x() {
        return this.f13926r;
    }

    public final n y() {
        return this.f13911b;
    }

    public final bv z() {
        return this.f13912c;
    }

    public final void b(double d2) {
        this.f13918j = d2;
    }

    public final void c(double d2) {
        this.f13928t = d2;
    }

    public final void d(double d2) {
        this.f13920l = d2;
    }

    public final Double a() {
        return this.f13922n;
    }

    public final void b(String str) {
        this.f13916g = str;
    }

    public final void a(n nVar) {
        this.f13911b = nVar;
    }

    public final void b(Double d2) {
        this.f13925q = d2;
    }

    public final void a(Double d2) {
        this.f13924p = d2;
    }

    public final void a(bv bvVar) {
        this.f13917h = "0";
        if (bvVar == null) {
            return;
        }
        this.f13912c = bvVar;
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f13917h = "2";
        } else if (q8 != 5 && q8 != 6) {
            this.f13917h = "1";
        } else {
            this.f13917h = "3";
        }
        this.f13921m = bvVar.aG();
    }

    public final void a(Map<String, Object> map) {
        this.f13913d = a(map, "offer_id");
        this.f13914e = a(map, "dsp_id");
        if (map != null) {
            Object obj = map.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH);
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.f13910a = num.intValue();
                }
            }
        }
    }

    private static String a(Map<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return obj.toString();
            }
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }
        return "";
    }

    public final void a(double d2) {
        this.i = d2;
    }

    public final void a(String str) {
        this.f13915f = str;
    }

    public final void a(int i) {
        this.f13926r = i;
    }

    public final void a(boolean z3) {
        this.f13927s = z3;
    }
}
