package com.datadog.android.trace.internal;

import com.datadog.android.trace.api.trace.DatadogTraceId;
import com.datadog.trace.api.DDTraceId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DatadogTraceIdAdapter extends DDTraceId implements DatadogTraceId {
    public final DDTraceId delegate;

    public DatadogTraceIdAdapter(DDTraceId dDTraceId) {
        dDTraceId.getClass();
        this.delegate = dDTraceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DatadogTraceIdAdapter) && Intrinsics.areEqual(this.delegate, ((DatadogTraceIdAdapter) obj).delegate);
    }

    public final int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final String toHexString() {
        String hexString = this.delegate.toHexString();
        hexString.getClass();
        return hexString;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toHexStringPadded() {
        String hexStringPadded = this.delegate.toHexStringPadded();
        hexStringPadded.getClass();
        return hexStringPadded;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final long toHighOrderLong() {
        return this.delegate.toHighOrderLong();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final long toLong() {
        return this.delegate.toLong();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final String toString() {
        String dDTraceId = this.delegate.toString();
        dDTraceId.getClass();
        return dDTraceId;
    }
}
