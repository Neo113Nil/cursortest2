package com.datadog.android.trace.opentelemetry.internal;

import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.context.ArrayBasedContext;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextStorage;
import io.opentelemetry.context.LazyStorage;

/* loaded from: classes9.dex */
public final class DatadogContextStorage implements ContextStorage {
    public final ContextStorage wrapped;

    public DatadogContextStorage(ContextStorage contextStorage) {
        contextStorage.getClass();
        this.wrapped = contextStorage;
    }

    @Override // io.opentelemetry.context.ContextStorage
    public final Context current() {
        Context current = this.wrapped.current();
        if (current == null) {
            LazyStorage.storage.getClass();
            current = ArrayBasedContext.ROOT;
        }
        if (current instanceof OtelContext) {
            return current;
        }
        PropagatedSpan propagatedSpan = PropagatedSpan.INVALID;
        propagatedSpan.getClass();
        return new OtelContext(current, propagatedSpan, propagatedSpan);
    }
}
