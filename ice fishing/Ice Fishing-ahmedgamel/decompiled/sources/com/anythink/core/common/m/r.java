package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bm;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15491a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f15492b;

    /* renamed from: c, reason: collision with root package name */
    private String f15493c;

    /* renamed from: d, reason: collision with root package name */
    private long f15494d;

    /* renamed from: e, reason: collision with root package name */
    private long f15495e;

    public r(Context context, bm bmVar) {
        this.f15491a = context;
        this.f15492b = bmVar;
        this.f15493c = com.anythink.core.common.d.t.b().g(bmVar.d());
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.g.c.a().a(com.anythink.core.common.i.l() ? j.e.J : j.e.f13242v);
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
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
        if (this.f15492b == null) {
            return super.e();
        }
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", this.f15492b.b());
            e9.put(e.bk, this.f15492b.d());
            e9.put("session_id", this.f15493c);
            e9.put(e.bm, this.f15492b.l());
        } catch (Throwable unused) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        bm bmVar = this.f15492b;
        return bmVar != null ? bmVar.b() : "";
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f15491a;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        bm bmVar = this.f15492b;
        return bmVar != null ? bmVar.c() : "";
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f15494d = System.currentTimeMillis();
        this.f15495e = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        bm bmVar = this.f15492b;
        String d9 = bmVar != null ? bmVar.d() : "";
        bm bmVar2 = this.f15492b;
        com.anythink.core.common.u.e.a("pl_wf", adError.getPlatformCode(), adError.getPlatformMSG(), b(), d9, "", "", bmVar2 != null ? bmVar2.j() : null);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        bm bmVar = this.f15492b;
        String d9 = bmVar != null ? bmVar.d() : "";
        bm bmVar2 = this.f15492b;
        com.anythink.core.common.u.e.a("pl_wf", d9, this.f15494d, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f15495e, bmVar2 != null ? bmVar2.j() : null);
        return obj;
    }
}
