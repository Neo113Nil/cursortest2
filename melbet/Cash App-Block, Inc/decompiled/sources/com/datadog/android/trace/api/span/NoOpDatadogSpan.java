package com.datadog.android.trace.api.span;

import com.google.android.gms.auth.api.zbc;

/* loaded from: classes4.dex */
public final class NoOpDatadogSpan implements DatadogSpan {
    public String operationName;

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final DatadogSpanContext context() {
        return new zbc(1);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void drop() {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish() {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish(long j) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final DatadogSpan getLocalRootSpan() {
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final String getOperationName() {
        return this.operationName;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final Integer getSamplingPriority() {
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final Object getTag(String str) {
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final boolean isRootSpan() {
        return false;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setError() {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setMetric(int i) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setOperationName(String str) {
        str.getClass();
        this.operationName = str;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setResourceName(String str) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(Integer num) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(String str, String str2) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(Object obj, String str) {
    }
}
