package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.C4907p;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2612Io implements InterfaceC4131wk, InterfaceC2944al, InterfaceC2642Kk {

    /* renamed from: D, reason: collision with root package name */
    public JSONObject f25615D;

    /* renamed from: E, reason: collision with root package name */
    public JSONObject f25616E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25617F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f25618G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f25619H;

    /* renamed from: n, reason: collision with root package name */
    public final C2748Qo f25620n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25621u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25622v;

    /* renamed from: y, reason: collision with root package name */
    public BinderC3754pk f25625y;

    /* renamed from: z, reason: collision with root package name */
    public C4927z0 f25626z;

    /* renamed from: A, reason: collision with root package name */
    public String f25612A = "";

    /* renamed from: B, reason: collision with root package name */
    public String f25613B = "";

    /* renamed from: C, reason: collision with root package name */
    public String f25614C = "";

    /* renamed from: w, reason: collision with root package name */
    public int f25623w = 0;

    /* renamed from: x, reason: collision with root package name */
    public EnumC2595Ho f25624x = EnumC2595Ho.f25419n;

    public C2612Io(C2748Qo c2748Qo, C3226fu c3226fu, String str) {
        this.f25620n = c2748Qo;
        this.f25622v = str;
        this.f25621u = c3226fu.f30904g;
    }

    public static JSONObject c(C4927z0 c4927z0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c4927z0.f40124v);
        jSONObject.put("errorCode", c4927z0.f40122n);
        jSONObject.put("errorDescription", c4927z0.f40123u);
        C4927z0 c4927z02 = c4927z0.f40125w;
        jSONObject.put("underlyingError", c4927z02 == null ? null : c(c4927z02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        C2748Qo c2748Qo = this.f25620n;
        if (c2748Qo.f()) {
            C2518Df c2518Df = c2953au.f29349b;
            List list = (List) c2518Df.f24453u;
            if (!list.isEmpty()) {
                this.f25623w = ((Ut) list.get(0)).f28141b;
            }
            Wt wt = (Wt) c2518Df.f24454v;
            String str = wt.f28500l;
            if (!TextUtils.isEmpty(str)) {
                this.f25612A = str;
            }
            String str2 = wt.f28501m;
            if (!TextUtils.isEmpty(str2)) {
                this.f25613B = str2;
            }
            JSONObject jSONObject = wt.f28504p;
            if (jSONObject.length() > 0) {
                this.f25616E = jSONObject;
            }
            C3151ea c3151ea = AbstractC3368ia.Ea;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                if (c2748Qo.f27238w >= ((Long) rVar.f40119c.a(AbstractC3368ia.Fa)).longValue()) {
                    this.f25619H = true;
                    return;
                }
                String str3 = wt.f28502n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f25614C = str3;
                }
                JSONObject jSONObject2 = wt.f28503o;
                if (jSONObject2.length() > 0) {
                    this.f25615D = jSONObject2;
                }
                JSONObject jSONObject3 = this.f25615D;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f25614C)) {
                    length += this.f25614C.length();
                }
                long j9 = length;
                synchronized (c2748Qo) {
                    c2748Qo.f27238w += j9;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ia)).booleanValue()) {
            return;
        }
        C2748Qo c2748Qo = this.f25620n;
        if (c2748Qo.f()) {
            c2748Qo.c(this.f25621u, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2642Kk
    public final void K(AbstractC2539Ej abstractC2539Ej) {
        C2748Qo c2748Qo = this.f25620n;
        if (c2748Qo.f()) {
            this.f25625y = abstractC2539Ej.f24808f;
            this.f25624x = EnumC2595Ho.f25420u;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ia)).booleanValue()) {
                c2748Qo.c(this.f25621u, this);
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.anythink.core.express.b.a.f17684b, this.f25624x);
        jSONObject2.put("format", Ut.a(this.f25623w));
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ia)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f25617F);
            if (this.f25617F) {
                jSONObject2.put("shown", this.f25618G);
            }
        }
        BinderC3754pk binderC3754pk = this.f25625y;
        if (binderC3754pk != null) {
            jSONObject = b(binderC3754pk);
        } else {
            C4927z0 c4927z0 = this.f25626z;
            JSONObject jSONObject3 = null;
            if (c4927z0 != null && (iBinder = c4927z0.f40126x) != null) {
                BinderC3754pk binderC3754pk2 = (BinderC3754pk) iBinder;
                jSONObject3 = b(binderC3754pk2);
                if (binderC3754pk2.f33488x.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f25626z));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject b(BinderC3754pk binderC3754pk) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC3754pk.f33484n);
        jSONObject.put("responseSecsSinceEpoch", binderC3754pk.f33489y);
        jSONObject.put("responseId", binderC3754pk.f33485u);
        C3151ea c3151ea = AbstractC3368ia.Ba;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            String str = binderC3754pk.f33490z;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                int i = t2.C.f40822b;
                u2.i.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f25612A)) {
            jSONObject.put("adRequestUrl", this.f25612A);
        }
        if (!TextUtils.isEmpty(this.f25613B)) {
            jSONObject.put("postBody", this.f25613B);
        }
        if (!TextUtils.isEmpty(this.f25614C)) {
            jSONObject.put("adResponseBody", this.f25614C);
        }
        Object obj = this.f25615D;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f25616E;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ea)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f25619H);
        }
        JSONArray jSONArray = new JSONArray();
        for (q2.i1 i1Var : binderC3754pk.f33488x) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", i1Var.f40079n);
            jSONObject2.put("latencyMillis", i1Var.f40080u);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ca)).booleanValue()) {
                jSONObject2.put("credentials", C4907p.f40108g.f40109a.m(i1Var.f40082w));
            }
            C4927z0 c4927z0 = i1Var.f40081v;
            jSONObject2.put("error", c4927z0 == null ? null : c(c4927z0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        C2748Qo c2748Qo = this.f25620n;
        if (c2748Qo.f()) {
            this.f25624x = EnumC2595Ho.f25421v;
            this.f25626z = c4927z0;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ia)).booleanValue()) {
                c2748Qo.c(this.f25621u, this);
            }
        }
    }
}
