package com.anythink.basead.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.y;
import com.anythink.core.common.i;
import com.anythink.core.common.t;
import com.anythink.core.common.v.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends com.anythink.core.common.m.a {

    /* renamed from: a, reason: collision with root package name */
    String f9098a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f9099b;

    /* renamed from: c, reason: collision with root package name */
    int f9100c;

    /* renamed from: d, reason: collision with root package name */
    String f9101d;

    /* renamed from: e, reason: collision with root package name */
    bj f9102e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f9103f;

    public f(int i, bj bjVar, String str, Map<String, Object> map) {
        this.f9100c = i;
        this.f9102e = bjVar;
        this.f9103f = map;
        this.f9101d = str;
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
        y r9;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        bj bjVar = this.f9102e;
        if (bjVar != null && (r9 = bjVar.r()) != null && com.anythink.basead.b.b.a(this.f9100c, r9)) {
            String h9 = m.h();
            if (!TextUtils.isEmpty(h9)) {
                hashMap.put("User-Agent", h9);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return com.anythink.core.common.m.a.b(this.f9099b.toString());
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
    public final Object a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        try {
            if (!TextUtils.isEmpty(this.f9101d)) {
                this.f9099b = new JSONObject(this.f9101d);
                for (Map.Entry<String, Object> entry : this.f9103f.entrySet()) {
                    this.f9099b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        i.a();
        String e10 = i.e();
        this.f9098a = e10;
        return e10;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f9099b.put("scenario", str);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
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
        JSONObject jSONObject3 = this.f9099b;
        t.a().a(1, b(), jSONObject2, jSONObject3 != null ? jSONObject3.toString() : "", aq.a(1000));
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f9098a, "", "1", "", (ATAdRequest) null);
    }
}
