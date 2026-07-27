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
    String f9227a;

    /* renamed from: b, reason: collision with root package name */
    String f9228b;

    /* renamed from: c, reason: collision with root package name */
    String f9229c;

    /* renamed from: d, reason: collision with root package name */
    int f9230d;

    /* renamed from: e, reason: collision with root package name */
    int f9231e;

    /* renamed from: f, reason: collision with root package name */
    String f9232f;

    /* renamed from: g, reason: collision with root package name */
    String f9233g;

    public a(x xVar) {
        this.f9227a = xVar.f14312a;
        this.f9228b = xVar.f14315d;
        this.f9229c = xVar.f14313b;
        this.f9230d = xVar.f14319h;
        this.f9231e = xVar.i;
        this.f9232f = xVar.f14322l;
        this.f9233g = xVar.f14323m;
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
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
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
        JSONObject e6 = super.e();
        try {
            e6.put("app_id", t.b().p());
            e6.put(com.anythink.core.common.m.e.bk, this.f9229c);
            e6.put("session_id", t.b().g(this.f9229c));
            e6.put("t_g_id", this.f9230d);
            e6.put("gro_id", this.f9231e);
            String C7 = t.b().C();
            if (!TextUtils.isEmpty(C7)) {
                e6.put("sy_id", C7);
            }
            String D8 = t.b().D();
            if (TextUtils.isEmpty(D8)) {
                t.b().k(t.b().B());
                e6.put("bk_id", t.b().B());
            } else {
                e6.put("bk_id", D8);
            }
            e6.put("deny", m.q(t.b().g()));
            JSONObject a9 = com.anythink.core.common.m.e.a(this.f9229c);
            if (a9 != null) {
                e6.put("customs", a9);
            }
        } catch (Exception unused) {
        }
        return e6;
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
        hashMap.put(com.anythink.core.common.m.e.f14788W, a10);
        hashMap.put("request_id", this.f9228b);
        hashMap.put(o.a.f13224c, this.f9227a);
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
        return com.anythink.core.common.m.b.d.a(g.f14683j);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        if (!TextUtils.isEmpty(this.f9233g)) {
            return this.f9233g;
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
            a(i, com.anythink.core.common.m.o.f14859m, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(obj.toString());
            if (TextUtils.isEmpty(jSONObject.optString("data"))) {
                a(i, com.anythink.core.common.m.o.f14860n, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i, jSONObject);
            }
        } catch (Throwable unused) {
            a(i, com.anythink.core.common.m.o.f14861o, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }
}
