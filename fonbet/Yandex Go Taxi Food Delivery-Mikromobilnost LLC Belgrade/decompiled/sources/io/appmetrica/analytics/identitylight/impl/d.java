package io.appmetrica.analytics.identitylight.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.identitylight.internal.config.IdentityLightConfig;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class d implements JsonParser {
    public final String a = "identity_light_collecting";
    public final String b = "min_interval_seconds";
    public final g c = new g();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdentityLightConfig parse(JSONObject jSONObject) {
        g gVar = this.c;
        e eVar = new e();
        eVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.a, eVar.a);
        JSONObject optJSONObject = jSONObject.optJSONObject(this.a);
        if (optJSONObject != null) {
            eVar.b = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.b, eVar.b);
        }
        gVar.getClass();
        return new IdentityLightConfig(eVar.a, eVar.b);
    }

    public final IdentityLightConfig b(JSONObject jSONObject) {
        return (IdentityLightConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (IdentityLightConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
