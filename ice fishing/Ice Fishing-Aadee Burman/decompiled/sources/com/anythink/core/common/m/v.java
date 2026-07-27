package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v extends a {

    /* renamed from: A, reason: collision with root package name */
    public static final int f14736A = 21;

    /* renamed from: B, reason: collision with root package name */
    public static final int f14737B = 22;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14738C = 23;

    /* renamed from: D, reason: collision with root package name */
    public static final int f14739D = 24;

    /* renamed from: E, reason: collision with root package name */
    public static final int f14740E = 25;

    /* renamed from: F, reason: collision with root package name */
    public static final int f14741F = 26;

    /* renamed from: G, reason: collision with root package name */
    public static final int f14742G = 27;

    /* renamed from: H, reason: collision with root package name */
    public static final int f14743H = 28;
    private static final String J = "v";

    /* renamed from: a, reason: collision with root package name */
    public static final int f14744a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14745b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14746c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14747d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14748e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14749f = 6;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14750g = 7;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14751h = 8;
    public static final int i = 9;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14752j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14753k = 11;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14754l = 12;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14755u = 13;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14756v = 15;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14757w = 16;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14758x = 18;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14759y = 19;

    /* renamed from: z, reason: collision with root package name */
    public static final int f14760z = 20;

    /* renamed from: K, reason: collision with root package name */
    private Context f14762K;

    /* renamed from: N, reason: collision with root package name */
    private List<com.anythink.core.common.h.o> f14765N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.core.common.h.o f14766O;

    /* renamed from: P, reason: collision with root package name */
    private int f14767P;

    /* renamed from: I, reason: collision with root package name */
    boolean f14761I = false;

    /* renamed from: L, reason: collision with root package name */
    private String f14763L = com.anythink.core.common.d.t.b().p();

    /* renamed from: M, reason: collision with root package name */
    private String f14764M = com.anythink.core.common.d.t.b().q();

    public v(Context context, int i6, List<com.anythink.core.common.h.o> list) {
        this.f14762K = context;
        this.f14767P = i6;
        this.f14765N = list;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.h.o oVar = this.f14766O;
        if (oVar != null) {
            return oVar.f14033b.aP;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.h();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return a.b(g());
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        JSONObject f3 = super.f();
        try {
            e9.put("app_id", this.f14763L);
            e9.put(e.f14627S, this.f14767P);
            Iterator<String> keys = f3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e9.put(next, f3.opt(next));
            }
            Map<String, Object> m4 = com.anythink.core.common.d.t.b().m();
            if (m4 != null && m4.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : m4.keySet()) {
                    Object obj = m4.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                e9.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String a9 = com.anythink.core.common.v.k.a(e().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.anythink.core.common.h.o> list = this.f14765N;
        if (list != null) {
            Iterator<com.anythink.core.common.h.o> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a10 = it.next().a();
                a(a10);
                jSONArray.put(a10);
            }
        } else {
            com.anythink.core.common.h.o oVar = this.f14766O;
            if (oVar != null) {
                JSONObject a11 = oVar.a();
                a(a11);
                jSONArray.put(a11);
            }
        }
        String a12 = com.anythink.core.common.v.k.a(jSONArray.toString());
        StringBuilder sb = new StringBuilder();
        u1.h.i(sb, this.f14764M, "api_ver=1.0&common=", a9, "&data=");
        sb.append(a12);
        String c9 = com.anythink.core.common.v.o.c(sb.toString());
        try {
            jSONObject.put(e.Y, a9);
            jSONObject.put("data", a12);
            jSONObject.put(e.f14624P, j.e.f12436a);
            jSONObject.put("sign", c9);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14763L;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14762K;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14764M;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 6;
    }

    @Override // com.anythink.core.common.m.a
    public final boolean p() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    private void a(JSONObject jSONObject) {
        if (!this.f14761I || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(e.f14628T, 1);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        List<com.anythink.core.common.h.o> list = this.f14765N;
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), b(), (String) null, String.valueOf(list != null ? list.size() : 1), "0", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c9 = c();
        if (c9 != null) {
            try {
                for (String str : c9.keySet()) {
                    jSONObject.put(str, c9.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        this.f14761I = true;
        String g4 = g();
        this.f14761I = false;
        com.anythink.core.common.t.a().a(1, b(), jSONObject2, g4, aq.a(1000));
    }
}
