package com.yandex.metrica.push.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.push.common.PushServiceFacade;
import com.yandex.metrica.push.common.RefreshTokenInfo;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
abstract class B0 implements w0 {
    public abstract void a(Context context, Map<String, String> map, RefreshTokenInfo refreshTokenInfo);

    public void a(Context context, boolean z, Map<String, String> map, L0<Map<String, String>> l0) {
        C0079p e = C0077n.a(context).e();
        String str = null;
        Map<String, v0> a = v0.a(e.a().getString("com.yandex.metrica.push.all_tokens", null));
        long currentTimeMillis = System.currentTimeMillis();
        if (!z && a != null && map.size() == a.size()) {
            for (Map.Entry<String, v0> entry : a.entrySet()) {
                if (map.containsKey(entry.getKey()) && TextUtils.equals(entry.getValue().a, map.get(entry.getKey())) && currentTimeMillis - entry.getValue().b <= 86400000) {
                }
            }
            InternalLogger.i("Received old tokens", new Object[0]);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject.put(entry2.getKey(), new JSONObject().put("token", entry2.getValue()).put("lastUpdateTime", currentTimeMillis));
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        e.a().edit().putString("com.yandex.metrica.push.all_tokens", str).apply();
        l0.a(map);
        InternalLogger.i("New tokens were saved to PreferenceManager and sent:", new Object[0]);
        for (Map.Entry<String, String> entry3 : map.entrySet()) {
            InternalLogger.i("token from %s is %s", entry3.getKey(), entry3.getValue());
        }
    }

    @Override // com.yandex.metrica.push.impl.w0
    public void a(Context context, Bundle bundle) {
        RefreshTokenInfo fromBundle = RefreshTokenInfo.fromBundle(bundle.getBundle(PushServiceFacade.REFRESH_TOKEN_INFO));
        if (C0077n.a(context).m()) {
            a(context, C0077n.a(context).h().b(), fromBundle);
        }
    }
}
