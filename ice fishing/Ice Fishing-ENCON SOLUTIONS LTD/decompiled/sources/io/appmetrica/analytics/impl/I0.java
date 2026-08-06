package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class I0 {
    public static String a(H0 h02) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", h02.f4451a).put("packageName", h02.f4452b).put("reporterType", h02.f4453c.getStringValue()).put("processID", h02.f4454d).put("processSessionID", h02.f4455e).put("errorEnvironment", h02.f4456f).toString().getBytes(z1.a.f8620a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static H0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), z1.a.f8620a));
            return new H0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
