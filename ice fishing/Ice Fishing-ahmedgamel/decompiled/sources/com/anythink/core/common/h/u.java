package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.d.l;
import com.anythink.core.mg.api.MgAdInfo;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import com.anythink.core.mg.api.MgPreLoadCallbackRegister;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u extends av {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14049a = "send_count";

    /* renamed from: b, reason: collision with root package name */
    public static final int f14050b = 5;

    /* renamed from: A, reason: collision with root package name */
    public String f14051A;

    /* renamed from: B, reason: collision with root package name */
    public String f14052B;

    /* renamed from: C, reason: collision with root package name */
    public String f14053C;

    /* renamed from: D, reason: collision with root package name */
    public String f14054D;

    /* renamed from: E, reason: collision with root package name */
    public String f14055E;

    /* renamed from: F, reason: collision with root package name */
    public String f14056F;

    /* renamed from: G, reason: collision with root package name */
    public String f14057G;

    /* renamed from: H, reason: collision with root package name */
    public String f14058H;

    /* renamed from: I, reason: collision with root package name */
    public String f14059I;
    public String J;

    /* renamed from: K, reason: collision with root package name */
    public String f14060K;

    /* renamed from: L, reason: collision with root package name */
    public String f14061L;

    /* renamed from: M, reason: collision with root package name */
    public String f14062M;

    /* renamed from: N, reason: collision with root package name */
    public String f14063N;

    /* renamed from: O, reason: collision with root package name */
    public String f14064O;

    /* renamed from: P, reason: collision with root package name */
    public String f14065P;

    /* renamed from: Q, reason: collision with root package name */
    public String f14066Q;

    /* renamed from: R, reason: collision with root package name */
    public String f14067R;

    /* renamed from: S, reason: collision with root package name */
    public String f14068S;

    /* renamed from: T, reason: collision with root package name */
    public JSONObject f14069T;

    /* renamed from: U, reason: collision with root package name */
    public String f14070U;
    public JSONObject Y;

    /* renamed from: Z, reason: collision with root package name */
    public String f14074Z;
    public String aa;
    private ATAdRequest ac;

    /* renamed from: c, reason: collision with root package name */
    public String f14075c;

    /* renamed from: d, reason: collision with root package name */
    public String f14076d;

    /* renamed from: e, reason: collision with root package name */
    public String f14077e;

    /* renamed from: f, reason: collision with root package name */
    public String f14078f;

    /* renamed from: g, reason: collision with root package name */
    public String f14079g;

    /* renamed from: h, reason: collision with root package name */
    public String f14080h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f14081j;

    /* renamed from: k, reason: collision with root package name */
    public String f14082k;

    /* renamed from: l, reason: collision with root package name */
    public String f14083l;

    /* renamed from: o, reason: collision with root package name */
    public String f14086o;

    /* renamed from: p, reason: collision with root package name */
    public String f14087p;

    /* renamed from: q, reason: collision with root package name */
    public String f14088q;

    /* renamed from: r, reason: collision with root package name */
    public String f14089r;

    /* renamed from: s, reason: collision with root package name */
    public String f14090s;

    /* renamed from: t, reason: collision with root package name */
    public String f14091t;

    /* renamed from: u, reason: collision with root package name */
    public String f14092u;

    /* renamed from: v, reason: collision with root package name */
    public String f14093v;

    /* renamed from: w, reason: collision with root package name */
    public String f14094w;

    /* renamed from: x, reason: collision with root package name */
    public String f14095x;

    /* renamed from: y, reason: collision with root package name */
    public String f14096y;

    /* renamed from: z, reason: collision with root package name */
    public String f14097z;

    /* renamed from: m, reason: collision with root package name */
    public int f14084m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14085n = -1;

    /* renamed from: V, reason: collision with root package name */
    public int f14071V = -1;

    /* renamed from: W, reason: collision with root package name */
    public int f14072W = -1;

    /* renamed from: X, reason: collision with root package name */
    public int f14073X = -1;
    public int ab = com.anythink.core.common.d.t.b().E();

    private u() {
    }

    public final void a(n nVar) {
        if (nVar != null) {
            this.f14076d = nVar.aJ();
            this.f14077e = nVar.aI();
            this.f14065P = nVar.aK();
            this.f14086o = String.valueOf(nVar.aG());
            this.f14080h = String.valueOf(nVar.Z());
            this.f14083l = String.valueOf(nVar.U());
            this.f14084m = nVar.V();
            this.f14085n = nVar.W();
            this.f14082k = nVar.aH();
            this.f14067R = nVar.aB();
            this.f14068S = nVar.aC();
            this.f14074Z = nVar.az();
            this.aa = nVar.aM();
            a(nVar.a());
        }
    }

    public u(String str, String str2) {
        this.f14065P = str;
        this.f14066Q = str2;
    }

    public final void a(x xVar) {
        if (xVar != null) {
            this.f14076d = xVar.f14158d;
            this.f14077e = xVar.f14156b;
            this.f14080h = String.valueOf(xVar.i);
            this.f14086o = String.valueOf(xVar.f14162h);
            this.f14074Z = xVar.f14172s;
            this.aa = xVar.f14173t;
            this.ab = xVar.f14174u;
        }
    }

    public final void a(com.anythink.core.d.l lVar) {
        if (lVar != null) {
            a(lVar.s());
        }
    }

    public final void a(ATAdRequest aTAdRequest) {
        if (aTAdRequest != null) {
            this.ab = aTAdRequest.getChannelSource();
        } else {
            this.ab = com.anythink.core.common.d.t.b().E();
        }
        this.ac = aTAdRequest;
    }

    @Override // com.anythink.core.common.h.av
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f14075c);
            jSONObject.put("requestid", this.f14076d);
            jSONObject.put("unitid", this.f14077e);
            jSONObject.put(com.anythink.core.common.d.g.f12331c, this.f14078f);
            jSONObject.put("sessionid", this.f14079g);
            jSONObject.put("groupid", this.f14080h);
            jSONObject.put("unitgroupid", this.i);
            jSONObject.put(com.anythink.expressad.foundation.d.d.f18596u, this.f14081j);
            jSONObject.put("asid", this.f14082k);
            jSONObject.put(ToolBar.REFRESH, this.f14083l);
            int i = this.f14084m;
            if (i != -1) {
                jSONObject.put("refresh_v2", i);
            }
            int i6 = this.f14085n;
            if (i6 != -1) {
                jSONObject.put("load_mode", i6);
            }
            int i9 = this.f14073X;
            if (i9 != -1) {
                jSONObject.put(com.anythink.core.common.m.e.be, i9);
            }
            jSONObject.put("traffic_group_id", this.f14086o);
            jSONObject.put(com.anythink.expressad.foundation.g.a.f19093q, this.f14087p);
            jSONObject.put("msg1", this.f14088q);
            jSONObject.put("msg2", this.f14089r);
            jSONObject.put("msg3", this.f14090s);
            jSONObject.put("msg4", this.f14091t);
            jSONObject.put("msg5", this.f14092u);
            jSONObject.put("msg6", this.f14093v);
            jSONObject.put("msg7", this.f14094w);
            jSONObject.put("msg8", this.f14095x);
            jSONObject.put("msg9", this.f14096y);
            jSONObject.put("msg10", this.f14097z);
            jSONObject.put("msg11", this.f14051A);
            jSONObject.put("msg12", this.f14052B);
            jSONObject.put("msg13", this.f14053C);
            jSONObject.put("msg14", this.f14054D);
            jSONObject.put("msg15", this.f14055E);
            jSONObject.put("msg16", this.f14056F);
            jSONObject.put("msg17", this.f14057G);
            jSONObject.put("msg18", this.f14058H);
            jSONObject.put("msg19", this.f14059I);
            jSONObject.put("msg20", this.J);
            jSONObject.put("msg21", this.f14060K);
            jSONObject.put("msg22", this.f14061L);
            jSONObject.put("msg23", this.f14062M);
            jSONObject.put("msg24", this.f14063N);
            jSONObject.put("msg25", this.f14064O);
            jSONObject.put(l.a.f17401T, this.f14067R);
            jSONObject.put(com.anythink.core.common.m.e.ai, this.f14068S);
            JSONObject jSONObject2 = this.f14069T;
            if (jSONObject2 != null) {
                jSONObject.put(l.a.aa, jSONObject2);
            }
            jSONObject.put("real_p", this.f14070U);
            int i10 = this.f14071V;
            if (i10 != -1) {
                jSONObject.put("real_g", i10);
            }
            int i11 = this.f14072W;
            if (i11 != -1) {
                jSONObject.put("real_t", i11);
            }
            JSONObject jSONObject3 = this.Y;
            if (jSONObject3 != null) {
                jSONObject.put("adap_c", jSONObject3);
            }
            if (!TextUtils.isEmpty(this.f14074Z)) {
                jSONObject.put("x_c", new JSONArray(this.f14074Z));
            }
            if (!TextUtils.isEmpty(this.aa)) {
                jSONObject.put("o_r", this.aa);
            }
            jSONObject.put(com.anythink.core.common.m.e.bp, this.ab);
            ATAdRequest aTAdRequest = this.ac;
            MgPreLoadAdRequest preLoadInfo = (aTAdRequest == null || aTAdRequest.getPreLoadInfo() == null) ? null : this.ac.getPreLoadInfo();
            if (preLoadInfo != null) {
                String placementId = preLoadInfo.getPlacementId();
                String psId = preLoadInfo.getPsId();
                String requestId = preLoadInfo.getRequestId();
                if (!TextUtils.isEmpty(placementId)) {
                    jSONObject.put("mmed_pl_id", placementId);
                }
                if (!TextUtils.isEmpty(psId)) {
                    jSONObject.put("mmed_psid", psId);
                }
                if (!TextUtils.isEmpty(requestId)) {
                    jSONObject.put("mmed_req_id", requestId);
                }
                jSONObject.put("mmed_wait_price_sw", preLoadInfo.getCpEcpmSwitch());
                jSONObject.put("mmed_wait_price_t", preLoadInfo.getCpEcpmTimeout());
                MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo.getPreLoadCallbackRegister();
                MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
                double uSDEcpm = mgAdInfo != null ? mgAdInfo.getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d) {
                    jSONObject.put("mmed_price", String.valueOf(uSDEcpm));
                    return jSONObject;
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public static u a(String str) {
        u uVar = new u();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("key")) {
                    uVar.f14075c = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    uVar.f14076d = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    uVar.f14077e = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has(com.anythink.core.common.d.g.f12331c)) {
                    uVar.f14078f = jSONObject.optString(com.anythink.core.common.d.g.f12331c, "");
                }
                if (jSONObject.has("sessionid")) {
                    uVar.f14079g = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    uVar.f14080h = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    uVar.i = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has(com.anythink.expressad.foundation.d.d.f18596u)) {
                    uVar.f14081j = jSONObject.optString(com.anythink.expressad.foundation.d.d.f18596u, "");
                }
                if (jSONObject.has("asid")) {
                    uVar.f14082k = jSONObject.optString("asid", "");
                }
                if (jSONObject.has(ToolBar.REFRESH)) {
                    uVar.f14083l = jSONObject.optString(ToolBar.REFRESH, "");
                }
                if (jSONObject.has(com.anythink.core.common.m.e.be)) {
                    uVar.f14073X = jSONObject.optInt(com.anythink.core.common.m.e.be, 0);
                }
                if (jSONObject.has("traffic_group_id")) {
                    uVar.f14086o = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has(com.anythink.expressad.foundation.g.a.f19093q)) {
                    uVar.f14087p = jSONObject.optString(com.anythink.expressad.foundation.g.a.f19093q, "");
                }
                if (jSONObject.has("msg1")) {
                    uVar.f14088q = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    uVar.f14089r = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    uVar.f14090s = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    uVar.f14091t = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    uVar.f14092u = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    uVar.f14093v = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    uVar.f14094w = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    uVar.f14095x = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    uVar.f14096y = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    uVar.f14097z = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    uVar.f14051A = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    uVar.f14052B = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    uVar.f14053C = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has("msg14")) {
                    uVar.f14054D = jSONObject.optString("msg14", "");
                }
                if (jSONObject.has("msg15")) {
                    uVar.f14055E = jSONObject.optString("msg15", "");
                }
                if (jSONObject.has(l.a.f17401T)) {
                    uVar.f14067R = jSONObject.optString(l.a.f17401T, "");
                }
                if (jSONObject.has(com.anythink.core.common.m.e.ai)) {
                    uVar.f14068S = jSONObject.optString(com.anythink.core.common.m.e.ai, "");
                }
                if (jSONObject.has(l.a.aa)) {
                    uVar.f14069T = jSONObject.optJSONObject(l.a.aa);
                }
                if (jSONObject.has("adap_c")) {
                    uVar.Y = jSONObject.optJSONObject("adap_c");
                }
                uVar.f14070U = jSONObject.optString("real_p", "");
                uVar.f14071V = jSONObject.optInt("real_g", -1);
                uVar.f14072W = jSONObject.optInt("real_t", -1);
                if (jSONObject.has("x_c")) {
                    uVar.f14074Z = jSONObject.optString("x_c");
                    return uVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return uVar;
    }

    public final void a(bv bvVar) {
        if (bvVar != null) {
            a(bvVar.f13821y);
        }
    }

    public final void a(ae aeVar) {
        if (aeVar != null) {
            a(aeVar.f13443c);
        }
    }
}
