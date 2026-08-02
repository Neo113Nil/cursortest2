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
    public static final String f14835a = "send_count";

    /* renamed from: b, reason: collision with root package name */
    public static final int f14836b = 5;

    /* renamed from: A, reason: collision with root package name */
    public String f14837A;

    /* renamed from: B, reason: collision with root package name */
    public String f14838B;

    /* renamed from: C, reason: collision with root package name */
    public String f14839C;

    /* renamed from: D, reason: collision with root package name */
    public String f14840D;

    /* renamed from: E, reason: collision with root package name */
    public String f14841E;

    /* renamed from: F, reason: collision with root package name */
    public String f14842F;

    /* renamed from: G, reason: collision with root package name */
    public String f14843G;

    /* renamed from: H, reason: collision with root package name */
    public String f14844H;

    /* renamed from: I, reason: collision with root package name */
    public String f14845I;
    public String J;

    /* renamed from: K, reason: collision with root package name */
    public String f14846K;

    /* renamed from: L, reason: collision with root package name */
    public String f14847L;

    /* renamed from: M, reason: collision with root package name */
    public String f14848M;

    /* renamed from: N, reason: collision with root package name */
    public String f14849N;

    /* renamed from: O, reason: collision with root package name */
    public String f14850O;

    /* renamed from: P, reason: collision with root package name */
    public String f14851P;

    /* renamed from: Q, reason: collision with root package name */
    public String f14852Q;

    /* renamed from: R, reason: collision with root package name */
    public String f14853R;

    /* renamed from: S, reason: collision with root package name */
    public String f14854S;

    /* renamed from: T, reason: collision with root package name */
    public JSONObject f14855T;

    /* renamed from: U, reason: collision with root package name */
    public String f14856U;
    public JSONObject Y;

    /* renamed from: Z, reason: collision with root package name */
    public String f14860Z;
    public String aa;
    private ATAdRequest ac;

    /* renamed from: c, reason: collision with root package name */
    public String f14861c;

    /* renamed from: d, reason: collision with root package name */
    public String f14862d;

    /* renamed from: e, reason: collision with root package name */
    public String f14863e;

    /* renamed from: f, reason: collision with root package name */
    public String f14864f;

    /* renamed from: g, reason: collision with root package name */
    public String f14865g;

    /* renamed from: h, reason: collision with root package name */
    public String f14866h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f14867j;

    /* renamed from: k, reason: collision with root package name */
    public String f14868k;

    /* renamed from: l, reason: collision with root package name */
    public String f14869l;

    /* renamed from: o, reason: collision with root package name */
    public String f14872o;

    /* renamed from: p, reason: collision with root package name */
    public String f14873p;

    /* renamed from: q, reason: collision with root package name */
    public String f14874q;

    /* renamed from: r, reason: collision with root package name */
    public String f14875r;

    /* renamed from: s, reason: collision with root package name */
    public String f14876s;

    /* renamed from: t, reason: collision with root package name */
    public String f14877t;

    /* renamed from: u, reason: collision with root package name */
    public String f14878u;

    /* renamed from: v, reason: collision with root package name */
    public String f14879v;

    /* renamed from: w, reason: collision with root package name */
    public String f14880w;

    /* renamed from: x, reason: collision with root package name */
    public String f14881x;

    /* renamed from: y, reason: collision with root package name */
    public String f14882y;

    /* renamed from: z, reason: collision with root package name */
    public String f14883z;

    /* renamed from: m, reason: collision with root package name */
    public int f14870m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14871n = -1;

    /* renamed from: V, reason: collision with root package name */
    public int f14857V = -1;

    /* renamed from: W, reason: collision with root package name */
    public int f14858W = -1;

    /* renamed from: X, reason: collision with root package name */
    public int f14859X = -1;
    public int ab = com.anythink.core.common.d.t.b().E();

    private u() {
    }

    public final void a(n nVar) {
        if (nVar != null) {
            this.f14862d = nVar.aJ();
            this.f14863e = nVar.aI();
            this.f14851P = nVar.aK();
            this.f14872o = String.valueOf(nVar.aG());
            this.f14866h = String.valueOf(nVar.Z());
            this.f14869l = String.valueOf(nVar.U());
            this.f14870m = nVar.V();
            this.f14871n = nVar.W();
            this.f14868k = nVar.aH();
            this.f14853R = nVar.aB();
            this.f14854S = nVar.aC();
            this.f14860Z = nVar.az();
            this.aa = nVar.aM();
            a(nVar.a());
        }
    }

    public u(String str, String str2) {
        this.f14851P = str;
        this.f14852Q = str2;
    }

    public final void a(x xVar) {
        if (xVar != null) {
            this.f14862d = xVar.f14944d;
            this.f14863e = xVar.f14942b;
            this.f14866h = String.valueOf(xVar.i);
            this.f14872o = String.valueOf(xVar.f14948h);
            this.f14860Z = xVar.f14958s;
            this.aa = xVar.f14959t;
            this.ab = xVar.f14960u;
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
            jSONObject.put("key", this.f14861c);
            jSONObject.put("requestid", this.f14862d);
            jSONObject.put("unitid", this.f14863e);
            jSONObject.put(com.anythink.core.common.d.g.f13117c, this.f14864f);
            jSONObject.put("sessionid", this.f14865g);
            jSONObject.put("groupid", this.f14866h);
            jSONObject.put("unitgroupid", this.i);
            jSONObject.put(com.anythink.expressad.foundation.d.d.f19383u, this.f14867j);
            jSONObject.put("asid", this.f14868k);
            jSONObject.put(ToolBar.REFRESH, this.f14869l);
            int i = this.f14870m;
            if (i != -1) {
                jSONObject.put("refresh_v2", i);
            }
            int i4 = this.f14871n;
            if (i4 != -1) {
                jSONObject.put("load_mode", i4);
            }
            int i6 = this.f14859X;
            if (i6 != -1) {
                jSONObject.put(com.anythink.core.common.m.e.be, i6);
            }
            jSONObject.put("traffic_group_id", this.f14872o);
            jSONObject.put(com.anythink.expressad.foundation.g.a.f19880q, this.f14873p);
            jSONObject.put("msg1", this.f14874q);
            jSONObject.put("msg2", this.f14875r);
            jSONObject.put("msg3", this.f14876s);
            jSONObject.put("msg4", this.f14877t);
            jSONObject.put("msg5", this.f14878u);
            jSONObject.put("msg6", this.f14879v);
            jSONObject.put("msg7", this.f14880w);
            jSONObject.put("msg8", this.f14881x);
            jSONObject.put("msg9", this.f14882y);
            jSONObject.put("msg10", this.f14883z);
            jSONObject.put("msg11", this.f14837A);
            jSONObject.put("msg12", this.f14838B);
            jSONObject.put("msg13", this.f14839C);
            jSONObject.put("msg14", this.f14840D);
            jSONObject.put("msg15", this.f14841E);
            jSONObject.put("msg16", this.f14842F);
            jSONObject.put("msg17", this.f14843G);
            jSONObject.put("msg18", this.f14844H);
            jSONObject.put("msg19", this.f14845I);
            jSONObject.put("msg20", this.J);
            jSONObject.put("msg21", this.f14846K);
            jSONObject.put("msg22", this.f14847L);
            jSONObject.put("msg23", this.f14848M);
            jSONObject.put("msg24", this.f14849N);
            jSONObject.put("msg25", this.f14850O);
            jSONObject.put(l.a.f18188T, this.f14853R);
            jSONObject.put(com.anythink.core.common.m.e.ai, this.f14854S);
            JSONObject jSONObject2 = this.f14855T;
            if (jSONObject2 != null) {
                jSONObject.put(l.a.aa, jSONObject2);
            }
            jSONObject.put("real_p", this.f14856U);
            int i9 = this.f14857V;
            if (i9 != -1) {
                jSONObject.put("real_g", i9);
            }
            int i10 = this.f14858W;
            if (i10 != -1) {
                jSONObject.put("real_t", i10);
            }
            JSONObject jSONObject3 = this.Y;
            if (jSONObject3 != null) {
                jSONObject.put("adap_c", jSONObject3);
            }
            if (!TextUtils.isEmpty(this.f14860Z)) {
                jSONObject.put("x_c", new JSONArray(this.f14860Z));
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
                    uVar.f14861c = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    uVar.f14862d = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    uVar.f14863e = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has(com.anythink.core.common.d.g.f13117c)) {
                    uVar.f14864f = jSONObject.optString(com.anythink.core.common.d.g.f13117c, "");
                }
                if (jSONObject.has("sessionid")) {
                    uVar.f14865g = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    uVar.f14866h = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    uVar.i = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has(com.anythink.expressad.foundation.d.d.f19383u)) {
                    uVar.f14867j = jSONObject.optString(com.anythink.expressad.foundation.d.d.f19383u, "");
                }
                if (jSONObject.has("asid")) {
                    uVar.f14868k = jSONObject.optString("asid", "");
                }
                if (jSONObject.has(ToolBar.REFRESH)) {
                    uVar.f14869l = jSONObject.optString(ToolBar.REFRESH, "");
                }
                if (jSONObject.has(com.anythink.core.common.m.e.be)) {
                    uVar.f14859X = jSONObject.optInt(com.anythink.core.common.m.e.be, 0);
                }
                if (jSONObject.has("traffic_group_id")) {
                    uVar.f14872o = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has(com.anythink.expressad.foundation.g.a.f19880q)) {
                    uVar.f14873p = jSONObject.optString(com.anythink.expressad.foundation.g.a.f19880q, "");
                }
                if (jSONObject.has("msg1")) {
                    uVar.f14874q = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    uVar.f14875r = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    uVar.f14876s = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    uVar.f14877t = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    uVar.f14878u = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    uVar.f14879v = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    uVar.f14880w = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    uVar.f14881x = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    uVar.f14882y = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    uVar.f14883z = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    uVar.f14837A = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    uVar.f14838B = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    uVar.f14839C = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has("msg14")) {
                    uVar.f14840D = jSONObject.optString("msg14", "");
                }
                if (jSONObject.has("msg15")) {
                    uVar.f14841E = jSONObject.optString("msg15", "");
                }
                if (jSONObject.has(l.a.f18188T)) {
                    uVar.f14853R = jSONObject.optString(l.a.f18188T, "");
                }
                if (jSONObject.has(com.anythink.core.common.m.e.ai)) {
                    uVar.f14854S = jSONObject.optString(com.anythink.core.common.m.e.ai, "");
                }
                if (jSONObject.has(l.a.aa)) {
                    uVar.f14855T = jSONObject.optJSONObject(l.a.aa);
                }
                if (jSONObject.has("adap_c")) {
                    uVar.Y = jSONObject.optJSONObject("adap_c");
                }
                uVar.f14856U = jSONObject.optString("real_p", "");
                uVar.f14857V = jSONObject.optInt("real_g", -1);
                uVar.f14858W = jSONObject.optInt("real_t", -1);
                if (jSONObject.has("x_c")) {
                    uVar.f14860Z = jSONObject.optString("x_c");
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
            a(bvVar.f14607y);
        }
    }

    public final void a(ae aeVar) {
        if (aeVar != null) {
            a(aeVar.f14229c);
        }
    }
}
