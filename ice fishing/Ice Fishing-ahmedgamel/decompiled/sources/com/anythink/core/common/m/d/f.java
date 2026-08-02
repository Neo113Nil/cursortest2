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
    List<o> f15393a;

    /* renamed from: b, reason: collision with root package name */
    boolean f15394b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15395c = "f";

    public f(List<o> list) {
        this.f15393a = list;
    }

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
        if (this.f15394b) {
            return;
        }
        String str4 = str3 + ":" + i;
        List<o> list = this.f15393a;
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
        List<o> list = this.f15393a;
        return (list == null || list.size() <= 0) ? new byte[0] : d.a(a(false));
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return this.f15394b;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int g() {
        return 6;
    }

    private String a(boolean z6) {
        JSONObject jSONObject = new JSONObject();
        JSONObject h3 = h();
        JSONObject i = i();
        try {
            h3.put("app_id", com.anythink.core.common.d.t.b().p());
            h3.put(com.anythink.core.common.m.e.f15413S, this.f15386j);
            h3.put(com.anythink.core.common.m.e.f15415U, this.f15387k);
            Iterator<String> keys = i.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                h3.put(next, i.opt(next));
            }
            Map<String, Object> m9 = com.anythink.core.common.d.t.b().m();
            if (m9 != null && m9.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : m9.keySet()) {
                    Object obj = m9.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                h3.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String a9 = k.a(h3.toString());
        JSONArray jSONArray = new JSONArray();
        List<o> list = this.f15393a;
        if (list != null) {
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                JSONObject a10 = it.next().a();
                if (z6 && a10 != null) {
                    try {
                        a10.put(com.anythink.core.common.m.e.f15414T, 1);
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                }
                jSONArray.put(a10);
            }
        }
        String a11 = k.a(jSONArray.toString());
        String c9 = com.anythink.core.common.v.o.c(com.anythink.core.common.d.t.b().q() + "api_ver=1.0&common=" + a9 + "&data=" + a11);
        try {
            jSONObject.put(com.anythink.core.common.m.e.Y, a9);
            jSONObject.put("data", a11);
            jSONObject.put(com.anythink.core.common.m.e.f15410P, j.e.f13222a);
            jSONObject.put("sign", c9);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}
