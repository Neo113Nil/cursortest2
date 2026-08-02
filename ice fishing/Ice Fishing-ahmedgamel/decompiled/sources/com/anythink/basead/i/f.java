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
    String f9884a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f9885b;

    /* renamed from: c, reason: collision with root package name */
    int f9886c;

    /* renamed from: d, reason: collision with root package name */
    String f9887d;

    /* renamed from: e, reason: collision with root package name */
    bj f9888e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f9889f;

    public f(int i, bj bjVar, String str, Map<String, Object> map) {
        this.f9886c = i;
        this.f9888e = bjVar;
        this.f9889f = map;
        this.f9887d = str;
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
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        bj bjVar = this.f9888e;
        if (bjVar != null && (r9 = bjVar.r()) != null && com.anythink.basead.b.b.a(this.f9886c, r9)) {
            String h3 = m.h();
            if (!TextUtils.isEmpty(h3)) {
                hashMap.put("User-Agent", h3);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return com.anythink.core.common.m.a.b(this.f9885b.toString());
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
            if (!TextUtils.isEmpty(this.f9887d)) {
                this.f9885b = new JSONObject(this.f9887d);
                for (Map.Entry<String, Object> entry : this.f9889f.entrySet()) {
                    this.f9885b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        i.a();
        String e10 = i.e();
        this.f9884a = e10;
        return e10;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f9885b.put("scenario", str);
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
        JSONObject jSONObject3 = this.f9885b;
        t.a().a(1, b(), jSONObject2, jSONObject3 != null ? jSONObject3.toString() : "", aq.a(1000));
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f9884a, "", "1", "", (ATAdRequest) null);
    }
}
