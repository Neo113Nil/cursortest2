package com.anythink.core.common.h;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    int f14696a;

    /* renamed from: b, reason: collision with root package name */
    private n f14697b;

    /* renamed from: c, reason: collision with root package name */
    private bv f14698c;

    /* renamed from: d, reason: collision with root package name */
    private String f14699d;

    /* renamed from: e, reason: collision with root package name */
    private String f14700e;

    /* renamed from: f, reason: collision with root package name */
    private String f14701f;

    /* renamed from: g, reason: collision with root package name */
    private String f14702g;

    /* renamed from: h, reason: collision with root package name */
    private String f14703h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private double f14704j;

    /* renamed from: k, reason: collision with root package name */
    private double f14705k;

    /* renamed from: l, reason: collision with root package name */
    private double f14706l;

    /* renamed from: m, reason: collision with root package name */
    private int f14707m;

    /* renamed from: n, reason: collision with root package name */
    private Double f14708n = null;

    /* renamed from: o, reason: collision with root package name */
    private String f14709o = null;

    /* renamed from: p, reason: collision with root package name */
    private Double f14710p;

    /* renamed from: q, reason: collision with root package name */
    private Double f14711q;

    /* renamed from: r, reason: collision with root package name */
    private int f14712r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14713s;

    /* renamed from: t, reason: collision with root package name */
    private double f14714t;

    private String D() {
        n nVar = this.f14697b;
        return nVar != null ? nVar.aJ() : "";
    }

    private String E() {
        n nVar = this.f14697b;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String F() {
        n nVar = this.f14697b;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    private String G() {
        n nVar = this.f14697b;
        return nVar != null ? nVar.aI() : "";
    }

    private String H() {
        n nVar = this.f14697b;
        return nVar != null ? nVar.aH() : "";
    }

    public final int A() {
        n nVar = this.f14697b;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String B() {
        return this.f14713s ? "1" : "0";
    }

    public final MgComparedResult C() {
        n nVar = this.f14697b;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final void a(Double d9, String str) {
        this.f14708n = d9;
        this.f14709o = str;
    }

    public final String b() {
        return this.f14709o;
    }

    public final Double c() {
        return this.f14710p;
    }

    public final int d() {
        return this.f14696a;
    }

    public final String e() {
        return this.f14699d;
    }

    public final String f() {
        return this.f14700e;
    }

    public final String g() {
        return this.f14701f;
    }

    public final String h() {
        return this.f14702g;
    }

    public final String i() {
        n nVar = this.f14697b;
        return nVar != null ? nVar.o() : "";
    }

    public final String j() {
        return this.f14703h;
    }

    public final int k() {
        n nVar = this.f14697b;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f14697b;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f14697b;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final JSONObject n() {
        n nVar = this.f14697b;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final double o() {
        return this.i;
    }

    public final double p() {
        return this.f14704j;
    }

    public final double q() {
        return this.f14714t;
    }

    public final double r() {
        return this.f14705k;
    }

    public final void s() {
        this.f14705k = 0.0d;
    }

    public final double t() {
        return this.f14706l;
    }

    public final int u() {
        return this.f14707m;
    }

    public final boolean v() {
        return this.f14707m == 1;
    }

    public final Double w() {
        return this.f14711q;
    }

    public final int x() {
        return this.f14712r;
    }

    public final n y() {
        return this.f14697b;
    }

    public final bv z() {
        return this.f14698c;
    }

    public final void b(double d9) {
        this.f14704j = d9;
    }

    public final void c(double d9) {
        this.f14714t = d9;
    }

    public final void d(double d9) {
        this.f14706l = d9;
    }

    public final Double a() {
        return this.f14708n;
    }

    public final void b(String str) {
        this.f14702g = str;
    }

    public final void a(n nVar) {
        this.f14697b = nVar;
    }

    public final void b(Double d9) {
        this.f14711q = d9;
    }

    public final void a(Double d9) {
        this.f14710p = d9;
    }

    public final void a(bv bvVar) {
        this.f14703h = "0";
        if (bvVar == null) {
            return;
        }
        this.f14698c = bvVar;
        int q8 = bvVar.q();
        if (q8 == 2) {
            this.f14703h = "2";
        } else if (q8 != 5 && q8 != 6) {
            this.f14703h = "1";
        } else {
            this.f14703h = "3";
        }
        this.f14707m = bvVar.aG();
    }

    public final void a(Map<String, Object> map) {
        this.f14699d = a(map, "offer_id");
        this.f14700e = a(map, "dsp_id");
        if (map != null) {
            Object obj = map.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH);
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.f14696a = num.intValue();
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

    public final void a(double d9) {
        this.i = d9;
    }

    public final void a(String str) {
        this.f14701f = str;
    }

    public final void a(int i) {
        this.f14712r = i;
    }

    public final void a(boolean z6) {
        this.f14713s = z6;
    }
}
