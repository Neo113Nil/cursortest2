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
import u1.h;

/* loaded from: classes.dex */
public final class d extends com.anythink.core.common.m.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f16011b;

    /* renamed from: c, reason: collision with root package name */
    private int f16012c;

    /* renamed from: f, reason: collision with root package name */
    private String f16015f;

    /* renamed from: g, reason: collision with root package name */
    private n f16016g;

    /* renamed from: h, reason: collision with root package name */
    private l f16017h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f16018j;

    /* renamed from: a, reason: collision with root package name */
    boolean f16010a = false;

    /* renamed from: d, reason: collision with root package name */
    private String f16013d = t.b().p();

    /* renamed from: e, reason: collision with root package name */
    private String f16014e = t.b().q();

    public d(Context context, int i, String str, n nVar, l lVar, String str2, String str3) {
        this.f16011b = context;
        this.f16012c = i;
        this.f16016g = nVar;
        this.f16017h = lVar;
        this.i = str2;
        this.f16018j = str3;
        this.f16015f = str;
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
            e9.put("app_id", this.f16013d);
            Iterator<String> keys = f3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e9.put(next, f3.opt(next));
            }
            Map<String, Object> m4 = t.b().m();
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
        String a9 = k.a(e().toString());
        StringBuilder sb = new StringBuilder();
        h.i(sb, this.f16014e, "api_ver=2.0&common=", a9, "&data=");
        sb.append(this.f16015f);
        sb.append("&ss_a=");
        sb.append(this.f16012c);
        String c9 = o.c(sb.toString());
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, a9);
            jSONObject.put("ss_a", this.f16012c);
            jSONObject.put("data", this.f16015f);
            jSONObject.put(com.anythink.core.common.m.e.f14624P, j.e.f12437b);
            jSONObject.put("sign", c9);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f16013d;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f16011b;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f16014e;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(g.f14528l);
    }

    @Override // com.anythink.core.common.m.a
    public final String o() {
        return j.e.f12437b;
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12391a);
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
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16018j, this.f16016g, this.f16017h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else if (this.f16010a) {
                com.anythink.core.common.u.e.a("1004658", this.i, this.f16018j, this.f16016g, this.f16017h, adError.getPlatformCode(), adError.getPlatformMSG());
            } else {
                this.f16010a = true;
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.q.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d dVar = d.this;
                        dVar.a(0, ((com.anythink.core.common.m.a) dVar).f14411r);
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
