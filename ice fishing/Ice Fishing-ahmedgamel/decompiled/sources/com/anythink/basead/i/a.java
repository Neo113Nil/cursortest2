package com.anythink.basead.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.o;
import com.anythink.core.common.h.x;
import com.anythink.core.common.i;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.anythink.core.common.m.a {

    /* renamed from: a, reason: collision with root package name */
    String f9856a;

    /* renamed from: b, reason: collision with root package name */
    String f9857b;

    /* renamed from: c, reason: collision with root package name */
    String f9858c;

    /* renamed from: d, reason: collision with root package name */
    int f9859d;

    /* renamed from: e, reason: collision with root package name */
    int f9860e;

    /* renamed from: f, reason: collision with root package name */
    String f9861f;

    /* renamed from: g, reason: collision with root package name */
    String f9862g;

    public a(x xVar) {
        this.f9856a = xVar.f14941a;
        this.f9857b = xVar.f14944d;
        this.f9858c = xVar.f14942b;
        this.f9859d = xVar.f14948h;
        this.f9860e = xVar.i;
        this.f9861f = xVar.f14951l;
        this.f9862g = xVar.f14952m;
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
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
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
    public final JSONObject e() {
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", t.b().p());
            e9.put(com.anythink.core.common.m.e.bk, this.f9858c);
            e9.put("session_id", t.b().g(this.f9858c));
            e9.put("t_g_id", this.f9859d);
            e9.put("gro_id", this.f9860e);
            String C8 = t.b().C();
            if (!TextUtils.isEmpty(C8)) {
                e9.put("sy_id", C8);
            }
            String D8 = t.b().D();
            if (TextUtils.isEmpty(D8)) {
                t.b().k(t.b().B());
                e9.put("bk_id", t.b().B());
            } else {
                e9.put("bk_id", D8);
            }
            e9.put("deny", m.q(t.b().g()));
            JSONObject a9 = com.anythink.core.common.m.e.a(this.f9858c);
            if (a9 != null) {
                e9.put("customs", a9);
            }
        } catch (Exception unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        HashMap hashMap = new HashMap();
        String a9 = k.a(e().toString());
        String a10 = k.a(f().toString());
        hashMap.put("p", a9);
        hashMap.put(com.anythink.core.common.m.e.f15417W, a10);
        hashMap.put("request_id", this.f9857b);
        hashMap.put(o.a.f13853c, this.f9856a);
        return new JSONObject(hashMap).toString();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 34;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(g.f15312j);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        if (!TextUtils.isEmpty(this.f9862g)) {
            return this.f9862g;
        }
        i.a();
        return i.d();
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, Object obj) {
        if (obj == null) {
            a(i, com.anythink.core.common.m.o.f15488m, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            if (TextUtils.isEmpty(jSONObject.optString("data"))) {
                a(i, com.anythink.core.common.m.o.f15489n, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i, jSONObject);
            }
        } catch (Throwable unused) {
            a(i, com.anythink.core.common.m.o.f15490o, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }
}
