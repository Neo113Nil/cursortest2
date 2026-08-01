package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.C4900p;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Io, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2613Io implements InterfaceC4172xk, InterfaceC2990bl, InterfaceC2677Mk {

    /* renamed from: D, reason: collision with root package name */
    public JSONObject f25580D;

    /* renamed from: E, reason: collision with root package name */
    public JSONObject f25581E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f25582F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f25583G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f25584H;

    /* renamed from: n, reason: collision with root package name */
    public final C2749Qo f25585n;

    /* renamed from: u, reason: collision with root package name */
    public final String f25586u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25587v;

    /* renamed from: y, reason: collision with root package name */
    public BinderC3848rk f25590y;

    /* renamed from: z, reason: collision with root package name */
    public C4920z0 f25591z;

    /* renamed from: A, reason: collision with root package name */
    public String f25577A = "";

    /* renamed from: B, reason: collision with root package name */
    public String f25578B = "";

    /* renamed from: C, reason: collision with root package name */
    public String f25579C = "";

    /* renamed from: w, reason: collision with root package name */
    public int f25588w = 0;

    /* renamed from: x, reason: collision with root package name */
    public EnumC2596Ho f25589x = EnumC2596Ho.f25377n;

    public C2613Io(C2749Qo c2749Qo, C3052cu c3052cu, String str) {
        this.f25585n = c2749Qo;
        this.f25587v = str;
        this.f25586u = c3052cu.f29626g;
    }

    public static JSONObject c(C4920z0 c4920z0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c4920z0.f40215v);
        jSONObject.put("errorCode", c4920z0.f40213n);
        jSONObject.put("errorDescription", c4920z0.f40214u);
        C4920z0 c4920z02 = c4920z0.f40216w;
        jSONObject.put("underlyingError", c4920z02 == null ? null : c(c4920z02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2677Mk
    public final void A(AbstractC2557Fj abstractC2557Fj) {
        C2749Qo c2749Qo = this.f25585n;
        if (c2749Qo.f()) {
            this.f25590y = abstractC2557Fj.f24838f;
            this.f25589x = EnumC2596Ho.f25378u;
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ia)).booleanValue()) {
                c2749Qo.c(this.f25586u, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        C2749Qo c2749Qo = this.f25585n;
        if (c2749Qo.f()) {
            C2570Gf c2570Gf = yt.f28754b;
            List list = (List) c2570Gf.f25042u;
            if (!list.isEmpty()) {
                this.f25588w = ((St) list.get(0)).f27608b;
            }
            Ut ut = (Ut) c2570Gf.f25043v;
            String str = ut.f28013l;
            if (!TextUtils.isEmpty(str)) {
                this.f25577A = str;
            }
            String str2 = ut.f28014m;
            if (!TextUtils.isEmpty(str2)) {
                this.f25578B = str2;
            }
            JSONObject jSONObject = ut.f28017p;
            if (jSONObject.length() > 0) {
                this.f25581E = jSONObject;
            }
            C3301ha c3301ha = AbstractC3569ma.Ea;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                if (c2749Qo.f27101w >= ((Long) rVar.f40210c.a(AbstractC3569ma.Fa)).longValue()) {
                    this.f25584H = true;
                    return;
                }
                String str3 = ut.f28015n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f25579C = str3;
                }
                JSONObject jSONObject2 = ut.f28016o;
                if (jSONObject2.length() > 0) {
                    this.f25580D = jSONObject2;
                }
                JSONObject jSONObject3 = this.f25580D;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f25579C)) {
                    length += this.f25579C.length();
                }
                long j6 = length;
                synchronized (c2749Qo) {
                    c2749Qo.f27101w += j6;
                }
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.anythink.core.express.b.a.f17526b, this.f25589x);
        jSONObject2.put("format", St.a(this.f25588w));
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ia)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f25582F);
            if (this.f25582F) {
                jSONObject2.put("shown", this.f25583G);
            }
        }
        BinderC3848rk binderC3848rk = this.f25590y;
        if (binderC3848rk != null) {
            jSONObject = b(binderC3848rk);
        } else {
            C4920z0 c4920z0 = this.f25591z;
            JSONObject jSONObject3 = null;
            if (c4920z0 != null && (iBinder = c4920z0.f40217x) != null) {
                BinderC3848rk binderC3848rk2 = (BinderC3848rk) iBinder;
                jSONObject3 = b(binderC3848rk2);
                if (binderC3848rk2.f33702x.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f25591z));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject b(BinderC3848rk binderC3848rk) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC3848rk.f33698n);
        jSONObject.put("responseSecsSinceEpoch", binderC3848rk.f33703y);
        jSONObject.put("responseId", binderC3848rk.f33699u);
        C3301ha c3301ha = AbstractC3569ma.Ba;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            String str = binderC3848rk.f33704z;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                int i = u2.z.f41322b;
                v2.i.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f25577A)) {
            jSONObject.put("adRequestUrl", this.f25577A);
        }
        if (!TextUtils.isEmpty(this.f25578B)) {
            jSONObject.put("postBody", this.f25578B);
        }
        if (!TextUtils.isEmpty(this.f25579C)) {
            jSONObject.put("adResponseBody", this.f25579C);
        }
        Object obj = this.f25580D;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f25581E;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Ea)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f25584H);
        }
        JSONArray jSONArray = new JSONArray();
        for (q2.h1 h1Var : binderC3848rk.f33702x) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", h1Var.f40164n);
            jSONObject2.put("latencyMillis", h1Var.f40165u);
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ca)).booleanValue()) {
                jSONObject2.put("credentials", C4900p.f40199g.f40200a.n(h1Var.f40167w));
            }
            C4920z0 c4920z0 = h1Var.f40166v;
            jSONObject2.put("error", c4920z0 == null ? null : c(c4920z0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ia)).booleanValue()) {
            return;
        }
        C2749Qo c2749Qo = this.f25585n;
        if (c2749Qo.f()) {
            c2749Qo.c(this.f25586u, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        C2749Qo c2749Qo = this.f25585n;
        if (c2749Qo.f()) {
            this.f25589x = EnumC2596Ho.f25379v;
            this.f25591z = c4920z0;
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ia)).booleanValue()) {
                c2749Qo.c(this.f25586u, this);
            }
        }
    }
}
