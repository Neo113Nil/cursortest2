package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0884j1 implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W0 parse(@NotNull JSONObject jSONObject) {
        W0 w0 = new W0();
        w0.a = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(jSONObject, "min_update_interval_seconds"), TimeUnit.SECONDS, w0.a);
        w0.b = JsonUtils.optFloatOrDefault(jSONObject, "min_update_distance_meters", w0.b);
        return w0;
    }

    public final W0 b(@NotNull JSONObject jSONObject) {
        return (W0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (W0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
