package io.appmetrica.analytics.accessibility.impl;

import io.appmetrica.analytics.accessibility.internal.config.AccessibilityConfig;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a implements JsonParser {
    public final d a = new d();
    public final String b = "accessibility_info";
    public final String c = "collect_interval_seconds";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityConfig parse(JSONObject jSONObject) {
        b bVar = new b();
        bVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.b, bVar.a);
        JSONObject optJSONObject = jSONObject.optJSONObject(this.b);
        if (optJSONObject != null) {
            bVar.b = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.c, bVar.b);
        }
        this.a.getClass();
        return new AccessibilityConfig(bVar.a, bVar.b);
    }

    public final AccessibilityConfig b(JSONObject jSONObject) {
        return (AccessibilityConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (AccessibilityConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
