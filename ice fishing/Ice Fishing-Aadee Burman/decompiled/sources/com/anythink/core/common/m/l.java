package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.a;
import com.anythink.core.common.h.an;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14676a = "l";

    /* renamed from: b, reason: collision with root package name */
    private final an f14677b;

    public l(an anVar) {
        this.f14677b = anVar;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final boolean d_() {
        return true;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e9 = super.e();
        try {
            an anVar = this.f14677b;
            if (anVar != null) {
                e9.put("app_id", anVar.b());
                e9.put(e.bk, this.f14677b.c());
                e9.put("t_g_id", this.f14677b.f());
                e9.put("gro_id", this.f14677b.g());
            }
        } catch (Throwable unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        String jSONObject = e().toString();
        String jSONObject2 = f().toString();
        HashMap hashMap = new HashMap();
        String a9 = com.anythink.core.common.v.k.a(jSONObject);
        String a10 = com.anythink.core.common.v.k.a(jSONObject2);
        hashMap.put("p", a9);
        hashMap.put(e.f14631W, a10);
        an anVar = this.f14677b;
        if (anVar != null) {
            JSONArray d2 = anVar.d();
            if (d2 != null) {
                hashMap.put(e.bn, com.anythink.core.common.v.k.a(d2.toString()));
            }
            hashMap.put(a.C0077a.f12916o, this.f14677b.e());
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject3 = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject3.put(str, hashMap.get(str));
            }
            return jSONObject3.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        an anVar = this.f14677b;
        return anVar != null ? anVar.b() : "";
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        an anVar = this.f14677b;
        if (anVar != null) {
            return anVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        an anVar = this.f14677b;
        return anVar != null ? anVar.c() : "";
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
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.m();
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
