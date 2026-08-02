package com.datadog.trace.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import com.datadog.android.api.InternalLogger;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.InstrumenterConfig;
import com.datadog.trace.api.metrics.SpanMetricRegistry;
import com.datadog.trace.api.metrics.SpanMetricRegistryImpl;
import com.datadog.trace.api.metrics.SpanMetrics;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.core.PendingTrace;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.measurement.zzlj;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class DDSpan {
    public static final AtomicLongFieldUpdater DURATION_NANO_UPDATER = AtomicLongFieldUpdater.newUpdater(DDSpan.class, "durationNano");
    public final DDSpanContext context;
    public volatile long durationNano;
    public final boolean externalClock;
    public final CopyOnWriteArrayList links;
    public final zbc log;
    public volatile int longRunningVersion = 0;
    public final SpanMetrics metrics;
    public final long startTimeNano;
    public volatile Object wrapper;

    static {
        AtomicReferenceFieldUpdater.newUpdater(DDSpan.class, Object.class, "wrapper");
        Config.INSTANCE.configProvider.isEnabled(Arrays.asList("legacy"), "", ".e2e.duration.enabled", false);
    }

    public DDSpan(String str, long j, DDSpanContext dDSpanContext, ArrayList arrayList, InternalLogger internalLogger) {
        this.context = dDSpanContext;
        SpanMetrics spanMetrics = (InstrumenterConfig.INSTANCE.telemetryEnabled ? SpanMetricRegistryImpl.INSTANCE : SpanMetricRegistry.NOOP).get(str);
        this.metrics = spanMetrics;
        spanMetrics.onSpanCreated();
        if (j <= 0) {
            this.startTimeNano = dDSpanContext.trace.getCurrentTimeNano();
            this.externalClock = false;
        } else {
            this.startTimeNano = TimeUnit.MICROSECONDS.toNanos(j);
            this.externalClock = true;
            PendingTrace pendingTrace = dDSpanContext.trace;
            pendingTrace.getClass();
            pendingTrace.lastReferenced = System.nanoTime();
        }
        this.links = arrayList == null ? new CopyOnWriteArrayList() : new CopyOnWriteArrayList(arrayList);
        zbc zbcVar = new zbc(4, "DDSpan", internalLogger);
        this.log = zbcVar;
        zbcVar.debug("Started span: {}", this);
    }

    public final void finish(long j) {
        long nanos;
        long j2 = this.startTimeNano;
        DDSpanContext dDSpanContext = this.context;
        boolean z = this.externalClock;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (z) {
            nanos = timeUnit.toNanos(j) - j2;
            PendingTrace pendingTrace = dDSpanContext.trace;
            pendingTrace.getClass();
            pendingTrace.lastReferenced = System.nanoTime();
        } else {
            SystemTimeSource systemTimeSource = dDSpanContext.trace.timeSource;
            long currentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros = j - timeUnit2.toMicros(currentTimeMillis);
            nanos = timeUnit.toNanos(micros) + timeUnit2.toNanos((dDSpanContext.trace.getCurrentTimeNano() - j2) / 1000000);
        }
        finishAndAddToTrace(nanos);
    }

    public final void finishAndAddToTrace(long j) {
        PendingTrace.PublishState publishState;
        if (!DURATION_NANO_UPDATER.compareAndSet(this, 0L, Math.max(1L, j))) {
            this.log.debug("Already finished: {}", this);
            return;
        }
        int i = -this.longRunningVersion;
        if (this.longRunningVersion >= 0) {
            this.longRunningVersion = i;
        }
        this.metrics.onSpanFinished();
        PendingTrace pendingTrace = this.context.trace;
        if (!pendingTrace.pendingTraceBuffer.longRunningSpansEnabled()) {
            pendingTrace.spans.addFirst(this);
        }
        PendingTrace.COMPLETED_SPAN_COUNT.incrementAndGet(pendingTrace);
        boolean z = this == pendingTrace.rootSpan;
        int decrementAndGet = PendingTrace.PENDING_REFERENCE_COUNT.decrementAndGet(pendingTrace);
        boolean z2 = pendingTrace.strictTraceWrites;
        if (z2 && decrementAndGet < 0) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(decrementAndGet, "Pending reference count ", " is negative"));
            return;
        }
        int i2 = pendingTrace.tracer.partialFlushMinSpans;
        if (decrementAndGet == 0 && (z2 || !pendingTrace.rootSpanWritten)) {
            pendingTrace.write(false);
            publishState = PendingTrace.PublishState.WRITTEN;
        } else if (z) {
            pendingTrace.pendingTraceBuffer.enqueue(pendingTrace);
            publishState = PendingTrace.PublishState.ROOT_BUFFERED;
        } else if (i2 > 0 && pendingTrace.completedSpanCount > i2) {
            pendingTrace.write(true);
            pendingTrace.log.getClass();
            publishState = PendingTrace.PublishState.PARTIAL_FLUSH;
        } else if (pendingTrace.rootSpanWritten) {
            pendingTrace.pendingTraceBuffer.enqueue(pendingTrace);
            publishState = PendingTrace.PublishState.BUFFERED;
        } else {
            publishState = PendingTrace.PublishState.PENDING;
        }
        zbc zbcVar = this.log;
        ((zzlj) ((InternalLogger) zbcVar.zba)).log(2, InternalLogger.Target.MAINTAINER, (Function0) new n$$ExternalSyntheticLambda1(28, zbcVar, publishState, this), (Throwable) null, false, (Map) null);
    }

    public final Object getTag(String str) {
        DDSpanContext dDSpanContext;
        Object obj;
        dDSpanContext = this.context;
        switch (str) {
            case "thread.id":
                return Long.valueOf(dDSpanContext.threadId);
            case "http.status_code":
                if (dDSpanContext.httpStatusCode == 0) {
                    return null;
                }
                return Integer.valueOf(dDSpanContext.httpStatusCode);
            case "thread.name":
                return dDSpanContext.threadName.f977string;
            default:
                synchronized (dDSpanContext.unsafeTags) {
                    obj = dDSpanContext.unsafeTags.get(str);
                }
                if (obj == null) {
                    return null;
                }
                return "http.url".equals(str) ? obj.toString() : obj;
        }
    }

    public final Integer getTraceSamplingPriority() {
        int i = this.context.getRootSpanContextOrThis().samplingPriority;
        if (i == -128) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void setSamplingPriority$1(int i, String str, double d, int i2) {
        DDSpanContext dDSpanContext = this.context;
        if (dDSpanContext.setSamplingPriority(i, i2)) {
            dDSpanContext.setMetric(str, Double.valueOf(d));
        }
    }

    public final String toString() {
        return this.context.toString() + ", duration_ns=" + this.durationNano + ", forceKeep=false, links=" + this.links;
    }
}
