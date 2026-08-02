package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a implements JsonParser {
    public final d a;
    public final String b = "egress";
    public final String c = "egress";
    public final String d = "url";
    public final String e = "repeated_delay";
    public final String f = "random_delay_window";
    public final String g = "background_allowed";
    public final String h = "diagnostic_enabled";

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EgressConfig parse(JSONObject jSONObject) {
        b bVar = new b();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.c);
        bVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.b, bVar.a);
        if (optJSONObject != null) {
            bVar.b = optJSONObject.optString(this.d, bVar.b);
            bVar.c = optJSONObject.optInt(this.e, bVar.c);
            bVar.d = optJSONObject.optInt(this.f, bVar.d);
            bVar.e = optJSONObject.optBoolean(this.g, bVar.e);
            bVar.f = optJSONObject.optBoolean(this.h, bVar.f);
        }
        return this.a.toModel(bVar);
    }

    public final EgressConfig b(JSONObject jSONObject) {
        return (EgressConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (EgressConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
