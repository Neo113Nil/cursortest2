package com.anythink.core.common.q;

import android.content.Context;
import com.anythink.basead.exoplayer.f;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.o;
import com.anythink.core.d.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends com.anythink.core.common.m.a {

    /* renamed from: b, reason: collision with root package name */
    private final Context f16001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16002c;

    /* renamed from: f, reason: collision with root package name */
    private final String f16005f;

    /* renamed from: g, reason: collision with root package name */
    private final n f16006g;

    /* renamed from: h, reason: collision with root package name */
    private final l f16007h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final String f16008j;

    /* renamed from: a, reason: collision with root package name */
    boolean f16000a = false;

    /* renamed from: d, reason: collision with root package name */
    private final String f16003d = t.b().p();

    /* renamed from: e, reason: collision with root package name */
    private final String f16004e = t.b().q();

    public c(Context context, String str, String str2, n nVar, l lVar, String str3, String str4) {
        this.f16001b = context;
        this.f16002c = str;
        this.f16005f = str2;
        this.f16006g = nVar;
        this.f16007h = lVar;
        this.i = str3;
        this.f16008j = str4;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f16002c;
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
        return com.anythink.core.common.m.a.b(g());
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        JSONObject f3 = super.f();
        try {
            e9.put("app_id", this.f16003d);
            Iterator<String> keys = f3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e9.put(next, f3.opt(next));
            }
            Map<String, Object> m4 = t.b().m();
            if (m4 != null && !m4.isEmpty()) {
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
        String d2 = k.d(e().toString());
        String c9 = o.c(this.f16004e + "api_ver=" + o() + "&common=" + d2 + "&data=" + this.f16005f);
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, d2);
            jSONObject.put("data", this.f16005f);
            jSONObject.put(com.anythink.core.common.m.e.f14624P, o());
            jSONObject.put("sign", c9);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f16003d;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f16001b;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f16004e;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        try {
            if (ErrorCode.httpStatuException.equals(adError.getCode())) {
                com.anythink.core.common.u.e.a("1004746", this.i, this.f16008j, this.f16006g, this.f16007h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else if (this.f16000a) {
                com.anythink.core.common.u.e.a("1004746", this.i, this.f16008j, this.f16006g, this.f16007h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else {
                this.f16000a = true;
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.q.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        cVar.a(0, ((com.anythink.core.common.m.a) cVar).f14411r);
                    }
                }, f.f7187a);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
