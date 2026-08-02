package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0955i0 implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R0 parse(JSONObject jSONObject) {
        R0 r0 = new R0();
        r0.a = jSONObject.optInt("records_count_to_force_flush", r0.a);
        r0.b = jSONObject.optInt("max_records_count_in_batch", r0.b);
        r0.c = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, "max_age_seconds_to_force_flush"), TimeUnit.SECONDS, r0.c);
        r0.d = jSONObject.optInt("max_records_to_store_locally", r0.d);
        return r0;
    }

    public final R0 b(JSONObject jSONObject) {
        return (R0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (R0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
