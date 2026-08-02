package io.appmetrica.analytics.push.model;

import io.appmetrica.analytics.push.coreutils.internal.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class LocationRequestInfo {
    private final String a;
    private final Long b;
    private final Long c;
    private final Integer d;

    public LocationRequestInfo(JSONObject jSONObject) {
        this.a = a(JsonUtils.extractIntegerSafely(jSONObject, "a"));
        this.b = JsonUtils.extractLongSafely(jSONObject, "b");
        this.c = JsonUtils.extractLongSafely(jSONObject, "c");
        this.d = JsonUtils.extractIntegerSafely(jSONObject, "d");
    }

    private static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return "passive";
        }
        if (intValue == 1) {
            return "network";
        }
        if (intValue != 2) {
            return null;
        }
        return "gps";
    }

    public Integer getMinAccuracy() {
        return this.d;
    }

    public Long getMinRecency() {
        return this.c;
    }

    public String getProvider() {
        return this.a;
    }

    public Long getRequestTimeoutSeconds() {
        return this.b;
    }
}
