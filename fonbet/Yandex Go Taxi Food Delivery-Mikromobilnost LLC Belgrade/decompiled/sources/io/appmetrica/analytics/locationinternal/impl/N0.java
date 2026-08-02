package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class N0 implements JsonParser {
    public final C0939d1 a = new C0939d1();
    public final M0 b = new M0();

    public final LocationConfig a(JSONObject jSONObject) {
        return this.b.toModel(this.a.parse(jSONObject));
    }

    public final LocationConfig b(JSONObject jSONObject) {
        return (LocationConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.b.toModel(this.a.parse(jSONObject));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (LocationConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
