package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0795ve;
import io.appmetrica.analytics.impl.Sg;
import io.appmetrica.analytics.impl.Tc;
import io.appmetrica.analytics.impl.Wg;
import io.appmetrica.analytics.impl.Za;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new Sg(Za.ADJUST) : new Wg(Za.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new Sg(Za.AIRBRIDGE) : new C0795ve(Za.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new Sg(Za.APPSFLYER) : new C0795ve(Za.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new Sg(Za.KOCHAVA) : new Tc(Za.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new Sg(Za.SINGULAR) : new C0795ve(Za.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new Sg(Za.TENJIN) : new C0795ve(Za.TENJIN, map);
    }
}
