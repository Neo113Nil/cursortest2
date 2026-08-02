package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0867e2 implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y0 parse(@NotNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("retry_policy");
        if (optJSONObject == null) {
            return new Y0();
        }
        Y0 y0 = new Y0();
        y0.a = optJSONObject.optInt("max_interval_seconds", y0.a);
        y0.b = optJSONObject.optInt("exponential_multiplier", y0.b);
        return y0;
    }

    public final Y0 b(@NotNull JSONObject jSONObject) {
        return (Y0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (Y0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
