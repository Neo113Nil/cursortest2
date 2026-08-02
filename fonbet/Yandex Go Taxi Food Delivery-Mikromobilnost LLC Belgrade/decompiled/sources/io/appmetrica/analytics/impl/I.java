package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class I implements InterfaceC0901z4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0901z4
    public final JSONObject a(Map<String, ? extends Object> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = map.get(AppMetricaYandexConfig.CLIDS_KEY);
            if (obj != null) {
                jSONObject.put(AppMetricaYandexConfig.CLIDS_KEY, Vc.b((Map) obj));
            }
            Object obj2 = map.get(AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY);
            if (obj2 != null) {
                jSONObject.put(AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY, obj2);
            }
            Object obj3 = map.get(AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY);
            if (obj3 != null) {
                jSONObject.put(AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY, obj3);
            }
            return jSONObject;
        } catch (Throwable th) {
            C0313en c0313en = Cm.a;
            String message = th.getMessage();
            if (message == null) {
                message = "Exception during converting additional fields";
            }
            c0313en.getClass();
            c0313en.a(new Dm(message, th));
            return new JSONObject();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0901z4
    public final void a(JSONObject jSONObject, AppMetricaConfig.Builder builder) {
        if (jSONObject != null) {
            Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObject, AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY);
            if (optBooleanOrNull != null) {
                builder.withAdditionalConfig(AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY, optBooleanOrNull);
            }
            String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY);
            if (optStringOrNull != null) {
                builder.withAdditionalConfig(AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY, optStringOrNull);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(AppMetricaYandexConfig.CLIDS_KEY);
            if (optJSONObject != null) {
                builder.withAdditionalConfig(AppMetricaYandexConfig.CLIDS_KEY, Vc.a(optJSONObject));
            }
        }
    }
}
