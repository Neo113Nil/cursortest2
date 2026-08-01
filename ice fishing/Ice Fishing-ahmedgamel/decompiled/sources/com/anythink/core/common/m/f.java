package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14659a = "custom";

    /* renamed from: b, reason: collision with root package name */
    private static final String f14660b = "f";

    /* renamed from: c, reason: collision with root package name */
    private String f14661c;

    /* renamed from: d, reason: collision with root package name */
    private String f14662d;

    /* renamed from: e, reason: collision with root package name */
    private String f14663e;

    /* renamed from: f, reason: collision with root package name */
    private Context f14664f;

    /* renamed from: g, reason: collision with root package name */
    private long f14665g;

    /* renamed from: h, reason: collision with root package name */
    private long f14666h;
    private Map<String, Object> i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, String> f14667j;

    /* renamed from: k, reason: collision with root package name */
    private String f14668k;

    public f(Context context, com.anythink.core.common.h.v vVar) {
        if (vVar == null) {
            return;
        }
        this.i = com.anythink.core.common.d.t.b().m();
        this.f14661c = vVar.a();
        this.f14662d = vVar.b();
        this.f14664f = context;
        this.f14667j = vVar.d();
        this.f14663e = vVar.c();
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        if (!TextUtils.isEmpty(this.f14668k)) {
            return this.f14668k;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.b();
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
        Object obj;
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", this.f14661c);
            e9.put("nw_ver", com.anythink.core.common.v.m.g());
            String C8 = com.anythink.core.common.d.t.b().C();
            if (!TextUtils.isEmpty(C8)) {
                e9.put("sy_id", C8);
            }
            String D8 = com.anythink.core.common.d.t.b().D();
            if (TextUtils.isEmpty(D8)) {
                com.anythink.core.common.d.t.b().k(com.anythink.core.common.d.t.b().B());
                e9.put("bk_id", com.anythink.core.common.d.t.b().B());
            } else {
                e9.put("bk_id", D8);
            }
            JSONObject a9 = e.a();
            if (a9 != null) {
                e9.put("custom", a9);
            }
            e9.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                e9.put("is_test", 1);
            }
            com.anythink.core.common.c.b.a();
            e9.put("pil_offset", com.anythink.core.common.c.b.b());
            Map<String, String> map = this.f14667j;
            if (map != null && map.size() != 0) {
                try {
                    e9.put("cached", new JSONObject(this.f14667j));
                } catch (Throwable unused) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                com.anythink.core.common.j.a.a().a(jSONObject);
                if (jSONObject.length() > 0) {
                    e9.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            e9.putOpt(e.bh, 1);
            if (!TextUtils.isEmpty(this.f14663e)) {
                e9.put(e.bm, this.f14663e);
            }
            e9.put(e.bp, com.anythink.core.common.d.t.b().E());
            Pair<Integer, List<String>> I8 = com.anythink.core.common.d.t.b().I();
            if (I8 != null && (obj = I8.first) != null) {
                e9.put(e.bq, ((Integer) obj).intValue());
            }
        } catch (JSONException unused3) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        return super.f();
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return this.f14661c;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return this.f14664f;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return this.f14662d;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public int l() {
        return 187;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(com.anythink.core.common.m.b.g.f14519b, this.f14661c);
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12391a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f14665g = System.currentTimeMillis();
        this.f14666h = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        com.anythink.core.common.u.e.a("app", adError.getPlatformCode(), adError.getPlatformMSG(), b(), "", "", "", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (this.i != null) {
                    jSONObject.put("custom", new JSONObject(this.i));
                }
            }
        } catch (Exception unused) {
        }
        com.anythink.core.common.u.e.a("app", (String) null, this.f14665g, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14666h, (ATAdRequest) null);
        return obj;
    }

    public final f a(String str) {
        this.f14668k = str;
        return this;
    }
}
