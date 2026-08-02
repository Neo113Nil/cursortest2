package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0882j implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q0 parse(@NotNull JSONObject jSONObject) {
        Q0 q0 = new Q0();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject, "wifi_networks_ttl");
            long j = q0.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            q0.b = WrapUtils.getMillisOrDefault(optLongOrNull, timeUnit, j);
            q0.a = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject, "cells_around_ttl"), timeUnit, q0.a);
        }
        return q0;
    }

    public final Q0 b(@NotNull JSONObject jSONObject) {
        return (Q0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (Q0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
