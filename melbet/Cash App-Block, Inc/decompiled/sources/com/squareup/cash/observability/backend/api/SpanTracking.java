package com.squareup.cash.observability.backend.api;

import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes6.dex */
public interface SpanTracking {
    static SpanTracking childSpanStarted$default(SpanTracking spanTracking, String str, String str2, Map map, int i) {
        if ((i & 4) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        return spanTracking.childSpanStarted(str, str2, map, null);
    }

    static void spanEnded$default(SpanTracking spanTracking, Map map, int i) {
        if ((i & 2) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        spanTracking.spanEnded(null, map);
    }

    SpanTracking childSpanStarted(String str, String str2, Map map, Long l);

    void spanEnded(Long l, Map map);
}
