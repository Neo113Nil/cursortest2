package com.datadog.opentelemetry.trace;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.internal.DatadogSpanAdapter;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;
import io.opentelemetry.api.trace.ArrayBasedTraceStateBuilder;
import io.opentelemetry.api.trace.AutoValue_ArrayBasedTraceState;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class OtelSpan implements Span {
    public final DatadogSpan delegate;
    public boolean recording = true;

    public OtelSpan(DatadogSpan datadogSpan) {
        this.delegate = datadogSpan;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void end(long j) {
        this.recording = false;
        DatadogSpan datadogSpan = this.delegate;
        OtelConventions.applyNamingConvention(datadogSpan);
        datadogSpan.finish(TimeUnit.MILLISECONDS.toMicros(j));
    }

    @Override // io.opentelemetry.api.trace.Span
    public final SpanContext getSpanContext() {
        DatadogSpan datadogSpan = this.delegate;
        DatadogSpanContext context = datadogSpan.context();
        DatadogSpan localRootSpan = datadogSpan.getLocalRootSpan();
        Integer traceSamplingPriority = localRootSpan != null ? ((DatadogSpanAdapter) localRootSpan).delegate.getTraceSamplingPriority() : null;
        boolean z = traceSamplingPriority != null && traceSamplingPriority.intValue() > 0;
        AutoValue_ArrayBasedTraceState autoValue_ArrayBasedTraceState = ArrayBasedTraceStateBuilder.EMPTY;
        return new OtelSpanContext(context, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r1 != 1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.opentelemetry.api.trace.Span
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Span setAttribute(InternalAttributeKeyImpl internalAttributeKeyImpl, String str) {
        if (this.recording) {
            String str2 = internalAttributeKeyImpl.key;
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(1);
            DatadogSpan datadogSpan = this.delegate;
            if (ordinal == 0) {
                if ("operation.name".equals(str2) && str != 0) {
                    datadogSpan.setOperationName(str.toLowerCase(Locale.ROOT));
                    return this;
                }
                if ("analytics.event".equals(str2) && str != 0) {
                    datadogSpan.setMetric(Boolean.parseBoolean(str) ? 1 : 0);
                    return this;
                }
            }
            "analytics.event".equals(str2);
            int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(1);
            if (ordinal2 != 4 && ordinal2 != 5 && ordinal2 != 6 && ordinal2 != 7) {
                datadogSpan.setTag((Object) str, str2);
                return this;
            }
            if (str instanceof List) {
                List list = (List) str;
                if (list.isEmpty()) {
                    datadogSpan.setTag((Object) "", str2);
                    return this;
                }
                for (int i = 0; i < list.size(); i++) {
                    datadogSpan.setTag(list.get(i), Boxes$$ExternalSyntheticOutline1.m(i, str2, "."));
                }
            }
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.Span
    public final void end() {
        this.recording = false;
        DatadogSpan datadogSpan = this.delegate;
        OtelConventions.applyNamingConvention(datadogSpan);
        datadogSpan.finish();
    }
}
