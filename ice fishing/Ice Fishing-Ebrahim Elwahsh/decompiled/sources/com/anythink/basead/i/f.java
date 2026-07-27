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
    String f9255a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f9256b;

    /* renamed from: c, reason: collision with root package name */
    int f9257c;

    /* renamed from: d, reason: collision with root package name */
    String f9258d;

    /* renamed from: e, reason: collision with root package name */
    bj f9259e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f9260f;

    public f(int i, bj bjVar, String str, Map<String, Object> map) {
        this.f9257c = i;
        this.f9259e = bjVar;
        this.f9260f = map;
        this.f9258d = str;
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
        hashMap.put("Content-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        bj bjVar = this.f9259e;
        if (bjVar != null && (r9 = bjVar.r()) != null && com.anythink.basead.b.b.a(this.f9257c, r9)) {
            String h9 = m.h();
            if (!TextUtils.isEmpty(h9)) {
                hashMap.put("User-Agent", h9);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return com.anythink.core.common.m.a.b(this.f9256b.toString());
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
            if (!TextUtils.isEmpty(this.f9258d)) {
                this.f9256b = new JSONObject(this.f9258d);
                for (Map.Entry<String, Object> entry : this.f9260f.entrySet()) {
                    this.f9256b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        i.a();
        String e9 = i.e();
        this.f9255a = e9;
        return e9;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f9256b.put("scenario", str);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c4 = c();
        if (c4 != null) {
            try {
                for (String str : c4.keySet()) {
                    jSONObject.put(str, c4.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        JSONObject jSONObject3 = this.f9256b;
        t.a().a(1, b(), jSONObject2, jSONObject3 != null ? jSONObject3.toString() : "", aq.a(1000));
        com.anythink.core.common.u.e.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f9255a, "", "1", "", (ATAdRequest) null);
    }
}
