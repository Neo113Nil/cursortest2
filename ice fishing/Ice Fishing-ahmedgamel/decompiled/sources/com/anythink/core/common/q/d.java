package com.anythink.core.common.q;

import android.content.Context;
import com.anythink.basead.exoplayer.f;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.i;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.o;
import com.anythink.core.d.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class d extends com.anythink.core.common.m.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f16798b;

    /* renamed from: c, reason: collision with root package name */
    private int f16799c;

    /* renamed from: f, reason: collision with root package name */
    private String f16802f;

    /* renamed from: g, reason: collision with root package name */
    private n f16803g;

    /* renamed from: h, reason: collision with root package name */
    private l f16804h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f16805j;

    /* renamed from: a, reason: collision with root package name */
    boolean f16797a = false;

    /* renamed from: d, reason: collision with root package name */
    private String f16800d = t.b().p();

    /* renamed from: e, reason: collision with root package name */
    private String f16801e = t.b().q();

    public d(Context context, int i, String str, n nVar, l lVar, String str2, String str3) {
        this.f16798b = context;
        this.f16799c = i;
        this.f16803g = nVar;
        this.f16804h = lVar;
        this.i = str2;
        this.f16805j = str3;
        this.f16802f = str;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        i.a();
        return i.g();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return com.anythink.core.common.m.a.b(g());
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        JSONObject f2 = super.f();
        try {
            e9.put("app_id", this.f16800d);
            Iterator<String> keys = f2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e9.put(next, f2.opt(next));
            }
            Map<String, Object> m9 = t.b().m();
            if (m9 != null && m9.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : m9.keySet()) {
                    Object obj = m9.get(str);
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
        String a9 = k.a(e().toString());
        StringBuilder sb = new StringBuilder();
        AbstractC5128c.h(sb, this.f16801e, "api_ver=2.0&common=", a9, "&data=");
        sb.append(this.f16802f);
        sb.append("&ss_a=");
        sb.append(this.f16799c);
        String c9 = o.c(sb.toString());
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, a9);
            jSONObject.put("ss_a", this.f16799c);
            jSONObject.put("data", this.f16802f);
            jSONObject.put(com.anythink.core.common.m.e.f15410P, j.e.f13223b);
            jSONObject.put("sign", c9);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f16800d;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f16798b;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f16801e;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(g.f15314l);
    }

    @Override // com.anythink.core.common.m.a
    public final String o() {
        return j.e.f13223b;
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f13177a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        try {
            if (ErrorCode.httpStatuException.equals(adError.getCode())) {
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16805j, this.f16803g, this.f16804h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else if (this.f16797a) {
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16805j, this.f16803g, this.f16804h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else {
                this.f16797a = true;
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.q.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        dVar.a(0, ((com.anythink.core.common.m.a) dVar).f15197r);
                    }
                }, f.f7973a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
