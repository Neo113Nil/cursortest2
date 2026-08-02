package io.appmetrica.analytics.push.impl;

import android.content.Context;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.gw00;
import defpackage.i3y;
import defpackage.zy11;
import io.appmetrica.analytics.push.TokenUpdateListener;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class y2 {
    public final Context a;
    public final Set b;
    public final i3y c = kotlin.a.a(new x2(this));

    public y2(Context context, Set set) {
        this.a = context;
        this.b = set;
    }

    public final synchronized void a(String str, String str2, long j) {
        String str3;
        try {
            if (this.b.contains(str2)) {
                ((Map) this.c.getValue()).put(str2, new t2(str, j));
                M1 d = r.a(this.a).d();
                Map map = (Map) this.c.getValue();
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        String str4 = (String) entry.getKey();
                        t2 t2Var = (t2) entry.getValue();
                        t2Var.getClass();
                        jSONObject.put(str4, new JSONObject().put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, t2Var.a).put("lastUpdateTime", t2Var.b));
                    }
                    str3 = jSONObject.toString();
                } catch (JSONException unused) {
                    str3 = null;
                }
                d.a("io.appmetrica.analytics.push.all_tokens", str3);
                c();
            } else {
                PublicLogger.INSTANCE.info("TokenManager: token for provider " + str2 + " is not supported", new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map b() {
        return (Map) this.c.getValue();
    }

    public final void c() {
        zy11 zy11Var;
        TokenUpdateListener tokenUpdateListener = r.a(this.a).h;
        if (tokenUpdateListener != null) {
            Map map = (Map) this.c.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((t2) entry.getValue()).a);
            }
            tokenUpdateListener.onTokenUpdated(linkedHashMap);
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            PublicLogger.INSTANCE.info("TokenManager: token update listener is null", new Object[0]);
        }
    }

    public final synchronized LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        Map b = b();
        linkedHashMap = new LinkedHashMap(gw00.d(b.size()));
        for (Map.Entry entry : b.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((t2) entry.getValue()).a);
        }
        return linkedHashMap;
    }
}
