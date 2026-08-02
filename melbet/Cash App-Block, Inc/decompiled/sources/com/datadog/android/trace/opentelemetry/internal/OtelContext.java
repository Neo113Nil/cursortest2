package com.datadog.android.trace.opentelemetry.internal;

import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.context.Context;

/* loaded from: classes9.dex */
public final class OtelContext implements Context {
    public final Span currentSpan;
    public final Span rootSpan;
    public final Context wrapped;

    public OtelContext(Context context, Span span, Span span2) {
        context.getClass();
        span.getClass();
        span2.getClass();
        this.wrapped = context;
        this.currentSpan = span;
        this.rootSpan = span2;
    }

    @Override // io.opentelemetry.context.Context
    public final Object get() {
        Span span = this.currentSpan;
        if (span == null) {
            return null;
        }
        return span;
    }

    @Override // io.opentelemetry.context.Context
    public final Context with(PropagatedSpan propagatedSpan) {
        return new OtelContext(this.wrapped, propagatedSpan, this.rootSpan);
    }
}
