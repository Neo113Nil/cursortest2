package com.datadog.android.trace.api.span;

/* loaded from: classes4.dex */
public interface DatadogSpan {
    DatadogSpanContext context();

    void drop();

    void finish();

    void finish(long j);

    DatadogSpan getLocalRootSpan();

    String getOperationName();

    Integer getSamplingPriority();

    Object getTag(String str);

    boolean isRootSpan();

    void setError();

    void setMetric(int i);

    void setOperationName(String str);

    void setResourceName(String str);

    void setTag(Integer num);

    void setTag(Object obj, String str);

    void setTag(String str, String str2);
}
