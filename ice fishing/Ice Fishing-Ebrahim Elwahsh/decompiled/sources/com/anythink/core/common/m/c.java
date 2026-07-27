package com.anythink.core.common.m;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.j;
import com.anythink.core.d.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.core.common.h.t f14688a;

    /* renamed from: b, reason: collision with root package name */
    private long f14689b;

    /* renamed from: c, reason: collision with root package name */
    private long f14690c;

    public c(com.anythink.core.common.h.t tVar) {
        this.f14688a = tVar;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.q();
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
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
        JSONObject e6 = super.e();
        try {
            com.anythink.core.common.h.t tVar = this.f14688a;
            e6.put("app_id", tVar != null ? tVar.b() : "");
            e6.put("nw_ver", com.anythink.core.common.v.m.g());
            String C7 = com.anythink.core.common.d.t.b().C();
            if (!TextUtils.isEmpty(C7)) {
                e6.put("sy_id", C7);
            }
            String D8 = com.anythink.core.common.d.t.b().D();
            if (TextUtils.isEmpty(D8)) {
                com.anythink.core.common.d.t.b().k(com.anythink.core.common.d.t.b().B());
                e6.put("bk_id", com.anythink.core.common.d.t.b().B());
            } else {
                e6.put("bk_id", D8);
            }
            JSONObject a9 = e.a();
            if (a9 != null) {
                e6.put("custom", a9);
            }
            e6.put("deny", com.anythink.core.common.v.m.q(com.anythink.core.common.d.t.b().g()));
            if (com.anythink.core.common.d.t.b().z()) {
                e6.put("is_test", 1);
            }
            com.anythink.core.common.c.b.a();
            e6.put("pil_offset", com.anythink.core.common.c.b.b());
            try {
                JSONObject jSONObject = new JSONObject();
                com.anythink.core.common.j.a.a().a(jSONObject);
                if (jSONObject.length() > 0) {
                    e6.put(e.bg, jSONObject.toString());
                }
            } catch (Throwable unused) {
            }
            e6.putOpt(e.bh, 1);
            e6.put(e.bp, com.anythink.core.common.d.t.b().E());
            Pair<Integer, List<String>> I2 = com.anythink.core.common.d.t.b().I();
            if (I2 != null && (obj = I2.first) != null) {
                e6.put(e.bq, ((Integer) obj).intValue());
            }
        } catch (Throwable unused2) {
        }
        return e6;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        try {
            HashMap hashMap = new HashMap();
            String a9 = com.anythink.core.common.v.k.a(e().toString());
            String a10 = com.anythink.core.common.v.k.a(f().toString());
            hashMap.put(e.f14781P, o());
            hashMap.put("p", a9);
            hashMap.put(e.f14788W, a10);
            com.anythink.core.common.h.t tVar = this.f14688a;
            byte[] a11 = tVar != null ? tVar.a() : null;
            if (a11 != null && a11.length > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enc_d", new String(a11));
                hashMap.put("p3", com.anythink.core.common.v.k.a(jSONObject.toString()));
            }
            ArrayList arrayList = new ArrayList(hashMap.size());
            arrayList.addAll(hashMap.keySet());
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(str);
                sb.append("=");
                sb.append(hashMap.get(str));
            }
            hashMap.put("sign", com.anythink.core.common.v.o.c(j() + sb.toString()));
            return new JSONObject(hashMap).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        com.anythink.core.common.h.t tVar = this.f14688a;
        return tVar != null ? tVar.b() : "";
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return com.anythink.core.common.d.t.b().g();
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        com.anythink.core.common.h.t tVar = this.f14688a;
        return tVar != null ? tVar.c() : "";
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 187;
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12548a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        com.anythink.core.common.u.e.a(b.a.f17350A, adError.getPlatformCode(), adError.getPlatformMSG(), b(), "", "", "", (ATAdRequest) null);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        com.anythink.core.common.u.e.a(b.a.f17350A, (String) null, this.f14689b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f14690c, (ATAdRequest) null);
        return obj;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, q qVar) {
        this.f14689b = System.currentTimeMillis();
        this.f14690c = SystemClock.elapsedRealtime();
        super.a(i, qVar);
    }
}
