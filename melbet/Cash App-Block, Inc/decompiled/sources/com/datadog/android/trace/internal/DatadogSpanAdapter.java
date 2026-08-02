package com.datadog.android.trace.internal;

import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.DDSpanContext;
import com.datadog.trace.core.PendingTrace;
import com.google.mlkit.vision.text.zza;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class DatadogSpanAdapter implements DatadogSpan {
    public final DDSpan delegate;
    public final zza spanLogger;

    public DatadogSpanAdapter(DDSpan dDSpan, zza zzaVar) {
        zzaVar.getClass();
        this.delegate = dDSpan;
        this.spanLogger = zzaVar;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final DatadogSpanContext context() {
        return new DatadogSpanContextAdapter(this.delegate.context);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void drop() {
        DDSpan dDSpan = this.delegate;
        PendingTrace pendingTrace = dDSpan.context.trace;
        pendingTrace.getClass();
        PendingTrace.PENDING_REFERENCE_COUNT.decrementAndGet(pendingTrace);
        if (pendingTrace.pendingTraceBuffer.longRunningSpansEnabled()) {
            pendingTrace.spans.remove(dDSpan);
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish() {
        DDSpan dDSpan = this.delegate;
        boolean z = dDSpan.externalClock;
        PendingTrace pendingTrace = dDSpan.context.trace;
        if (!z) {
            dDSpan.finishAndAddToTrace(pendingTrace.getCurrentTimeNano() - dDSpan.startTimeNano);
        } else {
            SystemTimeSource systemTimeSource = pendingTrace.timeSource;
            dDSpan.finish(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final DatadogSpan getLocalRootSpan() {
        DDSpan dDSpan = this.delegate.context.trace.rootSpan;
        if (dDSpan != null) {
            return new DatadogSpanAdapter(dDSpan, this.spanLogger);
        }
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final String getOperationName() {
        return this.delegate.context.operationName.toString();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final Integer getSamplingPriority() {
        return this.delegate.getTraceSamplingPriority();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final Object getTag(String str) {
        return this.delegate.getTag(str);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final boolean isRootSpan() {
        DDSpan dDSpan = this.delegate;
        return (dDSpan instanceof DDSpan) && dDSpan.context.parentId == 0;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setError() {
        DDSpanContext dDSpanContext = this.delegate.context;
        if (dDSpanContext.errorFlagPriority <= 0) {
            dDSpanContext.errorFlag = true;
            dDSpanContext.errorFlagPriority = (byte) 0;
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setMetric(int i) {
        this.delegate.context.setMetric("_dd1.sr.eausr", Integer.valueOf(i));
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setOperationName(String str) {
        str.getClass();
        DDSpanContext dDSpanContext = this.delegate.context;
        dDSpanContext.operationName = str;
        dDSpanContext.profilingContextIntegration.getClass();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setResourceName(String str) {
        this.delegate.context.setResourceName(str, (byte) 0);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(String str, String str2) {
        DDSpanContext dDSpanContext = this.delegate.context;
        if (str2 == null || str2.isEmpty()) {
            dDSpanContext.setTag(null, str);
        } else {
            dDSpanContext.setTag(str2, str);
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(Integer num) {
        this.delegate.context.setTag(num, "http.status_code");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(Object obj, String str) {
        this.delegate.context.setTag(obj, str);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish(long j) {
        this.delegate.finish(j);
    }
}
