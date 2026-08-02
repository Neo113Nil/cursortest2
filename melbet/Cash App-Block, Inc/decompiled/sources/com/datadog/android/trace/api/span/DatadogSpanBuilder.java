package com.datadog.android.trace.api.span;

/* loaded from: classes4.dex */
public interface DatadogSpanBuilder {
    DatadogSpanBuilder ignoreActiveSpan();

    DatadogSpan start();

    DatadogSpanBuilder withOrigin(String str);

    DatadogSpanBuilder withParentContext(DatadogSpanContext datadogSpanContext);

    DatadogSpanBuilder withResourceName(String str);

    DatadogSpanBuilder withStartTimestamp(long j);

    DatadogSpanBuilder withTag(Object obj, String str);
}
