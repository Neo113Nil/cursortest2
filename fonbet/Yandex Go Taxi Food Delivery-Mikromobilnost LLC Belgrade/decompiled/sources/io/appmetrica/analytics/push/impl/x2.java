package io.appmetrica.analytics.push.impl;

import android.text.TextUtils;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.sls;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class x2 extends Lambda implements sls {
    public final /* synthetic */ y2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var) {
        super(0);
        this.a = y2Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        LinkedHashMap linkedHashMap;
        y2 y2Var = this.a;
        y2Var.getClass();
        PublicLogger.INSTANCE.info("TokenManager: load tokens from preferences", new Object[0]);
        M1 c = r.a(y2Var.a).f.c();
        HashMap hashMap = null;
        String string = c.a.getSharedPreferences(c.b, 0).getString("io.appmetrica.analytics.push.all_tokens", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    hashMap2.put(next, new t2(jSONObject2.has(AuthSdkActivity.RESPONSE_TYPE_TOKEN) ? jSONObject2.getString(AuthSdkActivity.RESPONSE_TYPE_TOKEN) : null, jSONObject2.getLong("lastUpdateTime")));
                }
                hashMap = hashMap2;
            } catch (JSONException unused) {
            }
        }
        if (hashMap != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (y2Var.b.contains(entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        PublicLogger.INSTANCE.info("TokenManager: load tokens from preferences result: " + linkedHashMap, new Object[0]);
        return linkedHashMap;
    }
}
