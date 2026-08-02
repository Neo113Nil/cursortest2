package com.squareup.cash.integration.analytics;

import com.squareup.cash.cdf.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class UtilsKt$toCdfEvent$2 implements Event {
    public final String name;
    public final Map parameters;

    public UtilsKt$toCdfEvent$2(CdfEvent cdfEvent, Pair[] pairArr) {
        Map map;
        this.name = String.valueOf(cdfEvent.name);
        CdfEvent.Parameters parameters = cdfEvent.parameters;
        Map<String, String> map2 = parameters != null ? parameters.values : null;
        if (map2 == null) {
            map2 = EmptyMap.INSTANCE;
            map2.getClass();
        }
        if (map2.isEmpty()) {
            map = MapsKt__MapsKt.toMap(pairArr);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            MapsKt__MapsKt.putAll(linkedHashMap, pairArr);
            map = linkedHashMap;
        }
        this.parameters = map;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }
}
