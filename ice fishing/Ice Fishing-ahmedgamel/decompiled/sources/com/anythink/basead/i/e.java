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
    private static String f9878f = "e";

    /* renamed from: a, reason: collision with root package name */
    int f9879a;

    /* renamed from: b, reason: collision with root package name */
    String f9880b;

    /* renamed from: c, reason: collision with root package name */
    bj f9881c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f9882d;

    /* renamed from: e, reason: collision with root package name */
    boolean f9883e = false;

    public e(int i, String str, bj bjVar, Map<String, Object> map) {
        this.f9879a = i;
        this.f9880b = str;
        this.f9881c = bjVar;
        this.f9882d = map;
    }

    private void s() {
        String jSONObject;
        try {
            jSONObject = new JSONObject(c()).toString();
        } catch (Throwable unused) {
            jSONObject = new JSONObject().toString();
        }
        s.a().a(this.f15199t, jSONObject, this.f9881c.az());
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
        if (this.f9881c == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        y r9 = this.f9881c.r();
        if (r9 != null && com.anythink.basead.b.b.a(this.f9879a, r9)) {
            String h3 = m.h();
            if (!TextUtils.isEmpty(h3)) {
                hashMap.put("User-Agent", h3);
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
        if (this.f9882d != null && !TextUtils.isEmpty(this.f9880b)) {
            try {
                for (Map.Entry<String, Object> entry : this.f9882d.entrySet()) {
                    String key = entry.getKey();
                    this.f9880b = this.f9880b.replaceAll("\\{" + key + "\\}", (String) entry.getValue());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f9880b;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    public final void a(boolean z6) {
        this.f9883e = z6;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i) {
        String jSONObject;
        if (this.f9883e) {
            s.a();
            if (s.a(i)) {
                try {
                    jSONObject = new JSONObject(c()).toString();
                } catch (Throwable unused) {
                    jSONObject = new JSONObject().toString();
                }
                s.a().a(this.f15199t, jSONObject, this.f9881c.az());
            }
        }
    }
}
