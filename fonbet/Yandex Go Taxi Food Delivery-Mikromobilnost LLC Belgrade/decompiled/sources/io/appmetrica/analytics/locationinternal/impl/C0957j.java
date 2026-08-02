package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0957j implements JsonParser {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P0 parse(JSONObject jSONObject) {
        P0 p0 = new P0();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject, "wifi_networks_ttl");
            long j = p0.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            p0.b = WrapUtils.getMillisOrDefault(optLongOrNull, timeUnit, j);
            p0.a = WrapUtils.getMillisOrDefault(JsonUtils.optLongOrNull(optJSONObject, "cells_around_ttl"), timeUnit, p0.a);
        }
        return p0;
    }

    public final P0 b(JSONObject jSONObject) {
        return (P0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (P0) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
