package com.datadog.android.trace.api.tracer;

import com.datadog.android.trace.api.propagation.DatadogPropagation;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;
import com.fillr.e;
import com.google.mlkit.vision.text.zza;

/* loaded from: classes4.dex */
public final class NoOpDatadogTracer implements DatadogTracer {
    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogSpanBuilder buildSpan() {
        return new zza(2);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogPropagation propagate() {
        return new e();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final DatadogSpanBuilder buildSpan(String str) {
        return new zza(2);
    }
}
