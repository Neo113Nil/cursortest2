package io.appmetrica.analytics.impl;

import android.util.Base64;
import defpackage.uza;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Y0 {
    public static String a(X0 x0) {
        try {
            return Base64.encodeToString(new JSONObject().put(Constants.KEY_API_KEY, x0.a).put("packageName", x0.b).put("reporterType", x0.c.getStringValue()).put("processID", x0.d).put("processSessionID", x0.e).put("errorEnvironment", x0.f).toString().getBytes(uza.a), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static X0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), uza.a));
            return new X0(jSONObject.getString(Constants.KEY_API_KEY), jSONObject.getString("packageName"), CounterConfigurationReporterType.INSTANCE.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
