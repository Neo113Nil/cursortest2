package com.squareup.cash.observability.backend.real;

import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.protos.binfo.api.CardProduct;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RealDatadogSpanTracking implements SpanTracking {
    public final Span span;
    public final Tracer tracer;

    public RealDatadogSpanTracking(Tracer tracer, Span span) {
        this.tracer = tracer;
        this.span = span;
    }

    @Override // com.squareup.cash.observability.backend.api.SpanTracking
    public final SpanTracking childSpanStarted(String str, String str2, Map map, Long l) {
        str2.getClass();
        map.getClass();
        return CardProduct.Companion.startTrackingSpan$real$default(this.tracer, str2, str, this.span.getSpanContext(), map, l, 64);
    }

    @Override // com.squareup.cash.observability.backend.api.SpanTracking
    public final void spanEnded(Long l, Map map) {
        Span span;
        map.getClass();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            span = this.span;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            span.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        if (l != null) {
            span.end(l.longValue());
        } else {
            span.end();
        }
    }
}
