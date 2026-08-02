package com.datadog.trace.core.propagation;

import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DDTraceId;

/* loaded from: classes4.dex */
public final class B3TraceId extends DDTraceId {
    public final DD128bTraceId delegate;
    public final String original;

    public B3TraceId(String str, DD128bTraceId dD128bTraceId) {
        this.original = str;
        this.delegate = dD128bTraceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B3TraceId.class != obj.getClass()) {
            return false;
        }
        return this.delegate.equals(((B3TraceId) obj).delegate);
    }

    public final int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final String toHexString() {
        return this.delegate.toHexString();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toHexStringPadded() {
        return this.delegate.toHexStringPadded();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final long toHighOrderLong() {
        return this.delegate.highOrderBits;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final long toLong() {
        return this.delegate.lowOrderBits;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toString() {
        return this.delegate.toString();
    }
}
