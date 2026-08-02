package com.datadog.trace.core.util;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.trace.DatadogTraceId;
import com.datadog.android.trace.internal.DatadogTraceIdAdapter;
import com.datadog.trace.api.DD128bTraceId;
import com.datadog.trace.api.DD64bTraceId;
import com.datadog.trace.api.internal.util.LongStringUtils;
import io.opentelemetry.api.trace.SpanContext;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class SimpleRateLimiter implements DatadogSpanContext {
    public int capacity;
    public Object secondsAndCount;
    public long startNanos;

    public SimpleRateLimiter(SpanContext spanContext) {
        String traceId = spanContext.getTraceId();
        traceId.getClass();
        this.secondsAndCount = new DatadogTraceIdAdapter(traceId.length() > 16 ? DD128bTraceId.fromHex(0, traceId.length(), traceId) : DD64bTraceId.create(LongStringUtils.parseUnsignedLongHex(traceId), null));
        String spanId = spanContext.getSpanId();
        spanId.getClass();
        this.startNanos = LongStringUtils.parseUnsignedLongHex(spanId);
        this.capacity = (spanContext.getTraceFlags().byteRep & 1) == 0 ? PKIFailureInfo.systemUnavail : 1;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public int getSamplingPriority() {
        return this.capacity;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public long getSpanId() {
        return this.startNanos;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public Map getTags() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public DatadogTraceId getTraceId() {
        return (DatadogTraceIdAdapter) this.secondsAndCount;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public void setMetric(double d) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public boolean setSamplingPriority(int i) {
        return false;
    }

    public SimpleRateLimiter(long j, Exception exc) {
        this.startNanos = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.capacity = 2;
            this.secondsAndCount = exc;
            return;
        }
        if (exc instanceof InitializationException) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.secondsAndCount = exc;
            if (exc instanceof CameraUnavailableException) {
                this.capacity = 2;
                return;
            } else if (exc instanceof IllegalArgumentException) {
                this.capacity = 1;
                return;
            } else {
                this.capacity = 0;
                return;
            }
        }
        this.capacity = 0;
        this.secondsAndCount = exc;
    }

    public SimpleRateLimiter(int i, URL url, long j) {
        this.capacity = i;
        this.secondsAndCount = url;
        this.startNanos = j;
    }
}
