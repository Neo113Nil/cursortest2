package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693qf implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6778a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f6779b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6780c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6781d;

    /* renamed from: e, reason: collision with root package name */
    public final S7 f6782e;

    public C0693qf(String str, JSONObject jSONObject, boolean z2, boolean z3, S7 s7) {
        this.f6778a = str;
        this.f6779b = jSONObject;
        this.f6780c = z2;
        this.f6781d = z3;
        this.f6782e = s7;
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final S7 a() {
        return this.f6782e;
    }

    public final JSONObject b() {
        if (!this.f6780c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f6778a);
            if (this.f6779b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f6779b);
            return jSONObject;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f6778a);
            jSONObject.put("additionalParams", this.f6779b);
            jSONObject.put("wasSet", this.f6780c);
            jSONObject.put("autoTracking", this.f6781d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f6782e.f5049a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f6778a + "', additionalParameters=" + this.f6779b + ", wasSet=" + this.f6780c + ", autoTrackingEnabled=" + this.f6781d + ", source=" + this.f6782e + '}';
    }

    public static C0693qf a(JSONObject jSONObject) {
        S7 s7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i2 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        S7[] values = S7.values();
        int length = values.length;
        while (true) {
            if (i2 >= length) {
                s7 = null;
                break;
            }
            s7 = values[i2];
            if (kotlin.jvm.internal.i.a(s7.f5049a, optStringOrNull2)) {
                break;
            }
            i2++;
        }
        return new C0693qf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, s7 == null ? S7.f5044b : s7);
    }
}
