package com.anythink.core.common.m.d;

import com.anythink.core.api.ATAdRequest;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aq;
import com.anythink.core.common.h.o;
import com.anythink.core.common.t;
import com.anythink.core.common.v.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    List<o> f14764a;

    /* renamed from: b, reason: collision with root package name */
    boolean f14765b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14766c = "f";

    public f(List<o> list) {
        this.f14764a = list;
    }

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
        if (this.f14765b) {
            return;
        }
        String str4 = str3 + ":" + i;
        List<o> list = this.f14764a;
        com.anythink.core.common.u.e.a("tk", str, str2, str4, (String) null, String.valueOf(list != null ? list.size() : 0), "1", (ATAdRequest) null);
        t.a().a(3, "", "", a(true), aq.a(1000));
    }

    @Override // com.anythink.core.common.m.d.d
    public final int c() {
        return 1;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.m.d.d
    public final byte[] e() {
        List<o> list = this.f14764a;
        return (list == null || list.size() <= 0) ? new byte[0] : d.a(a(false));
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return this.f14765b;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int g() {
        return 6;
    }

    private String a(boolean z8) {
        JSONObject jSONObject = new JSONObject();
        JSONObject h9 = h();
        JSONObject i = i();
        try {
            h9.put("app_id", com.anythink.core.common.d.t.b().p());
            h9.put(com.anythink.core.common.m.e.f14784S, this.f14757j);
            h9.put(com.anythink.core.common.m.e.f14786U, this.f14758k);
            Iterator<String> keys = i.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                h9.put(next, i.opt(next));
            }
            Map<String, Object> m8 = com.anythink.core.common.d.t.b().m();
            if (m8 != null && m8.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : m8.keySet()) {
                    Object obj = m8.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                h9.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String a9 = k.a(h9.toString());
        JSONArray jSONArray = new JSONArray();
        List<o> list = this.f14764a;
        if (list != null) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a10 = it.next().a();
                if (z8 && a10 != null) {
                    try {
                        a10.put(com.anythink.core.common.m.e.f14785T, 1);
                    } catch (JSONException e6) {
                        e6.printStackTrace();
                    }
                }
                jSONArray.put(a10);
            }
        }
        String a11 = k.a(jSONArray.toString());
        String c4 = com.anythink.core.common.v.o.c(com.anythink.core.common.d.t.b().q() + "api_ver=1.0&common=" + a9 + "&data=" + a11);
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, a9);
            jSONObject.put("data", a11);
            jSONObject.put(com.anythink.core.common.m.e.f14781P, j.e.f12593a);
            jSONObject.put("sign", c4);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
