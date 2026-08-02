package com.squareup.cash.clientsync.telemetry;

import com.squareup.cash.observability.backend.api.SpanTracking;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class RealClientSyncSpan {
    public final LinkedHashMap attributes;
    public final SpanTracking spanTracking;

    public RealClientSyncSpan(SpanTracking spanTracking) {
        spanTracking.getClass();
        this.spanTracking = spanTracking;
        this.attributes = new LinkedHashMap();
    }

    public final SpanTracking getSpanTracking$real() {
        return this.spanTracking;
    }

    public final void setAttribute(String str, String str2) {
        str2.getClass();
        this.attributes.put(str, str2);
    }

    public final void stop() {
        SpanTracking.spanEnded$default(this.spanTracking, this.attributes, 1);
    }
}
