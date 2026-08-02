package io.appmetrica.analytics.accessibility.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class b implements JsonParser {
    public final e a = new e();
    public final String b = "accessibility_info";
    public final String c = "collect_interval_seconds";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(@NotNull JSONObject jSONObject) {
        c cVar = new c();
        cVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, this.b, cVar.a);
        JSONObject optJSONObject = jSONObject.optJSONObject(this.b);
        if (optJSONObject != null) {
            cVar.b = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject, this.c, cVar.b);
        }
        this.a.getClass();
        return new a(cVar.a, cVar.b);
    }

    public final a b(@NotNull JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
