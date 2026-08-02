package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.Parser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class u2 implements Parser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y0 parse(JSONObject jSONObject) {
        Y0 y0 = new Y0();
        if (jSONObject != null) {
            y0.a = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, "refresh_period_seconds"), TimeUnit.SECONDS, y0.a);
            y0.b = jSONObject.optInt("refresh_event_count", y0.b);
        }
        return y0;
    }

    public final Y0 b(JSONObject jSONObject) {
        return (Y0) Parser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(Object obj) {
        return (Y0) Parser.DefaultImpls.parseOrNull(this, (JSONObject) obj);
    }
}
