package com.anythink.basead.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.y;
import com.anythink.core.common.s;
import com.anythink.core.common.v.m;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.anythink.core.common.m.a {

    /* renamed from: f, reason: collision with root package name */
    private static String f9092f = "e";

    /* renamed from: a, reason: collision with root package name */
    int f9093a;

    /* renamed from: b, reason: collision with root package name */
    String f9094b;

    /* renamed from: c, reason: collision with root package name */
    bj f9095c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f9096d;

    /* renamed from: e, reason: collision with root package name */
    boolean f9097e = false;

    public e(int i, String str, bj bjVar, Map<String, Object> map) {
        this.f9093a = i;
        this.f9094b = str;
        this.f9095c = bjVar;
        this.f9096d = map;
    }

    private void s() {
        String jSONObject;
        try {
            jSONObject = new JSONObject(c()).toString();
        } catch (Throwable unused) {
            jSONObject = new JSONObject().toString();
        }
        s.a().a(this.f14413t, jSONObject, this.f9095c.az());
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        if (this.f9095c == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        y r9 = this.f9095c.r();
        if (r9 != null && com.anythink.basead.b.b.a(this.f9093a, r9)) {
            String h9 = m.h();
            if (!TextUtils.isEmpty(h9)) {
                hashMap.put("User-Agent", h9);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        return "";
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
        if (this.f9096d != null && !TextUtils.isEmpty(this.f9094b)) {
            try {
                for (Map.Entry<String, Object> entry : this.f9096d.entrySet()) {
                    String key = entry.getKey();
                    this.f9094b = this.f9094b.replaceAll("\\{" + key + "\\}", (String) entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f9094b;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    public final void a(boolean z3) {
        this.f9097e = z3;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i) {
        String jSONObject;
        if (this.f9097e) {
            s.a();
            if (s.a(i)) {
                try {
                    jSONObject = new JSONObject(c()).toString();
                } catch (Throwable unused) {
                    jSONObject = new JSONObject().toString();
                }
                s.a().a(this.f14413t, jSONObject, this.f9095c.az());
            }
        }
    }
}
