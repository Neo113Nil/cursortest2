package com.datadog.android.trace.api.propagation;

import com.datadog.android.trace.api.span.DatadogSpanContext;
import kotlin.jvm.functions.Function3;
import okhttp3.Request;

/* loaded from: classes4.dex */
public interface DatadogPropagation {
    DatadogSpanContext extract(Request request);

    void inject(DatadogSpanContext datadogSpanContext, Request.Builder builder, Function3 function3);
}
