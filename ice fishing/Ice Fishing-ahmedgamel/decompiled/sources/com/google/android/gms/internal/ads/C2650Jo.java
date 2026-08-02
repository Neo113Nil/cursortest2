package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import s2.C4949p;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2650Jo implements InterfaceC4195xk, InterfaceC3013bl, InterfaceC2697Mk {

    /* renamed from: D, reason: collision with root package name */
    public JSONObject f26504D;

    /* renamed from: E, reason: collision with root package name */
    public JSONObject f26505E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26506F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f26507G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f26508H;

    /* renamed from: n, reason: collision with root package name */
    public final C2786Ro f26509n;

    /* renamed from: u, reason: collision with root package name */
    public final String f26510u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26511v;

    /* renamed from: y, reason: collision with root package name */
    public BinderC3871rk f26514y;

    /* renamed from: z, reason: collision with root package name */
    public C4969z0 f26515z;

    /* renamed from: A, reason: collision with root package name */
    public String f26501A = "";

    /* renamed from: B, reason: collision with root package name */
    public String f26502B = "";

    /* renamed from: C, reason: collision with root package name */
    public String f26503C = "";

    /* renamed from: w, reason: collision with root package name */
    public int f26512w = 0;

    /* renamed from: x, reason: collision with root package name */
    public EnumC2633Io f26513x = EnumC2633Io.f26341n;

    public C2650Jo(C2786Ro c2786Ro, C3075cu c3075cu, String str) {
        this.f26509n = c2786Ro;
        this.f26511v = str;
        this.f26510u = c3075cu.f30396g;
    }

    public static JSONObject c(C4969z0 c4969z0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c4969z0.f40514v);
        jSONObject.put("errorCode", c4969z0.f40512n);
        jSONObject.put("errorDescription", c4969z0.f40513u);
        C4969z0 c4969z02 = c4969z0.f40515w;
        jSONObject.put("underlyingError", c4969z02 == null ? null : c(c4969z02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        C2786Ro c2786Ro = this.f26509n;
        if (c2786Ro.f()) {
            this.f26513x = EnumC2633Io.f26343v;
            this.f26515z = c4969z0;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ia)).booleanValue()) {
                c2786Ro.c(this.f26510u, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        C2786Ro c2786Ro = this.f26509n;
        if (c2786Ro.f()) {
            C2590Gf c2590Gf = yt.f29533b;
            List list = (List) c2590Gf.f25830u;
            if (!list.isEmpty()) {
                this.f26512w = ((St) list.get(0)).f28391b;
            }
            Ut ut = (Ut) c2590Gf.f25831v;
            String str = ut.f28810l;
            if (!TextUtils.isEmpty(str)) {
                this.f26501A = str;
            }
            String str2 = ut.f28811m;
            if (!TextUtils.isEmpty(str2)) {
                this.f26502B = str2;
            }
            JSONObject jSONObject = ut.f28814p;
            if (jSONObject.length() > 0) {
                this.f26505E = jSONObject;
            }
            C3324ha c3324ha = AbstractC3592ma.Ea;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                if (c2786Ro.f28045w >= ((Long) rVar.f40509c.a(AbstractC3592ma.Fa)).longValue()) {
                    this.f26508H = true;
                    return;
                }
                String str3 = ut.f28812n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f26503C = str3;
                }
                JSONObject jSONObject2 = ut.f28813o;
                if (jSONObject2.length() > 0) {
                    this.f26504D = jSONObject2;
                }
                JSONObject jSONObject3 = this.f26504D;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f26503C)) {
                    length += this.f26503C.length();
                }
                long j6 = length;
                synchronized (c2786Ro) {
                    c2786Ro.f28045w += j6;
                }
            }
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.anythink.core.express.b.a.f18313b, this.f26513x);
        jSONObject2.put("format", St.a(this.f26512w));
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ia)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f26506F);
            if (this.f26506F) {
                jSONObject2.put("shown", this.f26507G);
            }
        }
        BinderC3871rk binderC3871rk = this.f26514y;
        if (binderC3871rk != null) {
            jSONObject = b(binderC3871rk);
        } else {
            C4969z0 c4969z0 = this.f26515z;
            JSONObject jSONObject3 = null;
            if (c4969z0 != null && (iBinder = c4969z0.f40516x) != null) {
                BinderC3871rk binderC3871rk2 = (BinderC3871rk) iBinder;
                jSONObject3 = b(binderC3871rk2);
                if (binderC3871rk2.f34474x.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.f26515z));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject b(BinderC3871rk binderC3871rk) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", binderC3871rk.f34470n);
        jSONObject.put("responseSecsSinceEpoch", binderC3871rk.f34475y);
        jSONObject.put("responseId", binderC3871rk.f34471u);
        C3324ha c3324ha = AbstractC3592ma.Ba;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            String str = binderC3871rk.f34476z;
            if (!TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                int i = w2.z.f41712b;
                x2.i.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f26501A)) {
            jSONObject.put("adRequestUrl", this.f26501A);
        }
        if (!TextUtils.isEmpty(this.f26502B)) {
            jSONObject.put("postBody", this.f26502B);
        }
        if (!TextUtils.isEmpty(this.f26503C)) {
            jSONObject.put("adResponseBody", this.f26503C);
        }
        Object obj = this.f26504D;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.f26505E;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ea)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f26508H);
        }
        JSONArray jSONArray = new JSONArray();
        for (s2.h1 h1Var : binderC3871rk.f34474x) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", h1Var.f40463n);
            jSONObject2.put("latencyMillis", h1Var.f40464u);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ca)).booleanValue()) {
                jSONObject2.put("credentials", C4949p.f40498g.f40499a.n(h1Var.f40466w));
            }
            C4969z0 c4969z0 = h1Var.f40465v;
            jSONObject2.put("error", c4969z0 == null ? null : c(c4969z0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ia)).booleanValue()) {
            return;
        }
        C2786Ro c2786Ro = this.f26509n;
        if (c2786Ro.f()) {
            c2786Ro.c(this.f26510u, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2697Mk
    public final void y(AbstractC2577Fj abstractC2577Fj) {
        C2786Ro c2786Ro = this.f26509n;
        if (c2786Ro.f()) {
            this.f26514y = abstractC2577Fj.f25627f;
            this.f26513x = EnumC2633Io.f26342u;
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ia)).booleanValue()) {
                c2786Ro.c(this.f26510u, this);
            }
        }
    }
}
