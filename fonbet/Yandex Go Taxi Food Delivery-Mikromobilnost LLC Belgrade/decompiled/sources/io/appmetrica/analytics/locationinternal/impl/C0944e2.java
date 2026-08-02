package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0944e2 implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X0 parse(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("retry_policy");
        if (optJSONObject == null) {
            return new X0();
        }
        X0 x0 = new X0();
        x0.a = optJSONObject.optInt("max_interval_seconds", x0.a);
        x0.b = optJSONObject.optInt("exponential_multiplier", x0.b);
        return x0;
    }

    public final X0 b(JSONObject jSONObject) {
        return (X0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (X0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
