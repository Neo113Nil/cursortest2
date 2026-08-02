package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0959j1 implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V0 parse(JSONObject jSONObject) {
        V0 v0 = new V0();
        v0.a = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, "min_update_interval_seconds"), TimeUnit.SECONDS, v0.a);
        v0.b = JsonUtils.optFloatOrDefault(jSONObject, "min_update_distance_meters", v0.b);
        return v0;
    }

    public final V0 b(JSONObject jSONObject) {
        return (V0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (V0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
