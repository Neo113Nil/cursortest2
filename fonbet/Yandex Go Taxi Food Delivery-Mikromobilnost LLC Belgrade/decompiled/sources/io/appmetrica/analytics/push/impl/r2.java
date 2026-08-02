package io.appmetrica.analytics.push.impl;

import com.yandex.messaging.core.net.entities.BackendConfig;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class r2 {
    public final C1076t1 a;

    public r2(C1076t1 c1076t1) {
        this.a = c1076t1;
    }

    public final JSONObject a() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        C1076t1 c1076t1 = this.a;
        if (c1076t1 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(BackendConfig.Restrictions.ENABLED, c1076t1.a);
            jSONObject3.put("system_notify_time", c1076t1.e);
            jSONObject3.put("changed", c1076t1.b ? Boolean.TRUE : null);
            if (!c1076t1.c.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                for (C1085w1 c1085w1 : c1076t1.c) {
                    String str = c1085w1.a;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(BackendConfig.Restrictions.ENABLED, c1085w1.b);
                    jSONObject5.put("changed", c1085w1.c ? Boolean.TRUE : null);
                    JSONObject jSONObject6 = new JSONObject();
                    for (C1079u1 c1079u1 : c1085w1.d) {
                        String str2 = c1079u1.a;
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put(BackendConfig.Restrictions.ENABLED, c1079u1.b);
                        jSONObject7.put("changed", c1079u1.c ? Boolean.TRUE : null);
                        jSONObject6.put(str2, jSONObject7);
                    }
                    jSONObject5.put("channels", jSONObject6);
                    jSONObject4.put(str, jSONObject5);
                }
                jSONObject3.put("groups", jSONObject4);
            }
            if (!c1076t1.d.isEmpty()) {
                JSONObject jSONObject8 = new JSONObject();
                for (C1079u1 c1079u12 : c1076t1.d) {
                    String str3 = c1079u12.a;
                    JSONObject jSONObject9 = new JSONObject();
                    jSONObject9.put(BackendConfig.Restrictions.ENABLED, c1079u12.b);
                    jSONObject9.put("changed", c1079u12.c ? Boolean.TRUE : null);
                    jSONObject8.put(str3, jSONObject9);
                }
                jSONObject3.put("channels", jSONObject8);
            }
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        jSONObject2.put("notifications_status", jSONObject);
        return jSONObject2;
    }
}
