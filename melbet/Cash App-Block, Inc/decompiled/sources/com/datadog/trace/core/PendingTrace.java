package com.datadog.trace.core;

import com.datadog.android.api.InternalLogger;
import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import com.datadog.trace.api.DDTraceId;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.bootstrap.instrumentation.api.AgentTrace;
import com.datadog.trace.common.sampling.PrioritySampler;
import com.datadog.trace.common.writer.Writer;
import com.datadog.trace.core.CoreTracer;
import com.datadog.trace.core.PendingTraceBuffer;
import com.datadog.trace.logger.DatadogCoreTracerLogger$$ExternalSyntheticLambda0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.measurement.zzlj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class PendingTrace implements AgentTrace, PendingTraceBuffer.Element {
    public volatile long endToEndStartTime;
    public final zbc log;
    public final PendingTraceBuffer pendingTraceBuffer;
    public final ConcurrentLinkedDeque spans;
    public final boolean strictTraceWrites;
    public final SystemTimeSource timeSource;
    public final CoreTracer.ConfigSnapshot traceConfig;
    public final CoreTracer tracer;
    public static final ArrayList EMPTY = new ArrayList(0);
    public static final AtomicIntegerFieldUpdater COMPLETED_SPAN_COUNT = AtomicIntegerFieldUpdater.newUpdater(PendingTrace.class, "completedSpanCount");
    public static final AtomicIntegerFieldUpdater PENDING_REFERENCE_COUNT = AtomicIntegerFieldUpdater.newUpdater(PendingTrace.class, "pendingReferenceCount");
    public static final AtomicIntegerFieldUpdater IS_ENQUEUED = AtomicIntegerFieldUpdater.newUpdater(PendingTrace.class, "isEnqueued");
    public static final AtomicIntegerFieldUpdater LONG_RUNNING_STATE = AtomicIntegerFieldUpdater.newUpdater(PendingTrace.class, "longRunningTrackedState");
    public static final AtomicLongFieldUpdater RUNNING_TRACE_START_TIME_NANO = AtomicLongFieldUpdater.newUpdater(PendingTrace.class, "runningTraceStartTimeNano");
    public static final AtomicLongFieldUpdater LAST_WRITE_TIME_NANO = AtomicLongFieldUpdater.newUpdater(PendingTrace.class, "lastWriteTimeNano");
    public static final AtomicReferenceFieldUpdater ROOT_SPAN = AtomicReferenceFieldUpdater.newUpdater(PendingTrace.class, DDSpan.class, "rootSpan");
    public static final /* synthetic */ long ROOT_SPAN$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(PendingTrace.class.getDeclaredField("rootSpan"));
    public static final AtomicLongFieldUpdater END_TO_END_START_TIME = AtomicLongFieldUpdater.newUpdater(PendingTrace.class, "endToEndStartTime");
    public volatile int completedSpanCount = 0;
    public volatile int pendingReferenceCount = 0;
    public volatile int isEnqueued = 0;
    public volatile int longRunningTrackedState = 0;
    public volatile long runningTraceStartTimeNano = 0;
    public volatile long lastWriteTimeNano = 0;
    public volatile DDSpan rootSpan = null;
    public volatile boolean rootSpanWritten = false;
    public volatile long lastReferenced = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PublishState {
        public static final /* synthetic */ PublishState[] $VALUES;
        public static final PublishState BUFFERED;
        public static final PublishState PARTIAL_FLUSH;
        public static final PublishState PENDING;
        public static final PublishState ROOT_BUFFERED;
        public static final PublishState WRITTEN;

        static {
            PublishState publishState = new PublishState("WRITTEN", 0);
            WRITTEN = publishState;
            PublishState publishState2 = new PublishState("PARTIAL_FLUSH", 1);
            PARTIAL_FLUSH = publishState2;
            PublishState publishState3 = new PublishState("ROOT_BUFFERED", 2);
            ROOT_BUFFERED = publishState3;
            PublishState publishState4 = new PublishState("BUFFERED", 3);
            BUFFERED = publishState4;
            PublishState publishState5 = new PublishState("PENDING", 4);
            PENDING = publishState5;
            $VALUES = new PublishState[]{publishState, publishState2, publishState3, publishState4, publishState5};
        }

        public static PublishState valueOf(String str) {
            return (PublishState) Enum.valueOf(PublishState.class, str);
        }

        public static PublishState[] values() {
            return (PublishState[]) $VALUES.clone();
        }
    }

    public PendingTrace(CoreTracer coreTracer, DDTraceId dDTraceId, PendingTraceBuffer pendingTraceBuffer, SystemTimeSource systemTimeSource, CoreTracer.ConfigSnapshot configSnapshot, boolean z) {
        this.tracer = coreTracer;
        this.pendingTraceBuffer = pendingTraceBuffer;
        this.timeSource = systemTimeSource;
        this.traceConfig = configSnapshot == null ? coreTracer.dynamicConfig.currentSnapshot : configSnapshot;
        this.strictTraceWrites = z;
        this.spans = new ConcurrentLinkedDeque();
        this.log = new zbc(4, "PendingTrace", coreTracer.internalLogger);
    }

    public final int enqueueSpansToWrite(ArrayList arrayList, boolean z) {
        long j;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.spans;
        if (z) {
            j = getCurrentTimeNano();
            LAST_WRITE_TIME_NANO.set(this, j);
        } else {
            j = 0;
        }
        boolean z2 = false;
        long j2 = 0;
        int i = 0;
        for (DDSpan dDSpan = (DDSpan) concurrentLinkedDeque.pollFirst(); dDSpan != null; dDSpan = (DDSpan) concurrentLinkedDeque.pollFirst()) {
            if (z2 && dDSpan.context.spanId == j2) {
                concurrentLinkedDeque.addFirst(dDSpan);
                return i;
            }
            if (dDSpan.durationNano != 0) {
                arrayList.add(dDSpan);
                i++;
            } else {
                concurrentLinkedDeque.add(dDSpan);
                if (!z2) {
                    j2 = dDSpan.context.spanId;
                    z2 = true;
                }
                if (z) {
                    int i2 = (int) ((j - dDSpan.startTimeNano) / 1000000);
                    if (dDSpan.longRunningVersion >= 0) {
                        dDSpan.longRunningVersion = i2;
                    }
                    arrayList.add(dDSpan);
                }
            }
        }
        return i;
    }

    public final long getCurrentTimeNano() {
        long nanoTime = System.nanoTime();
        this.lastReferenced = nanoTime;
        CoreTracer coreTracer = this.tracer;
        long max = Math.max(0L, nanoTime - coreTracer.startNanoTicks) + coreTracer.startTimeNano;
        if (nanoTime - coreTracer.lastSyncTicks >= coreTracer.clockSyncPeriod) {
            long currentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = max - timeUnit.toNanos(currentTimeMillis);
            if (Math.abs(coreTracer.counterDrift + nanos) >= 1000000) {
                coreTracer.counterDrift = -timeUnit.toNanos(nanos / 1000000);
            }
            coreTracer.lastSyncTicks = nanoTime;
        }
        return max + coreTracer.counterDrift;
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final DDSpan getRootSpan() {
        return this.rootSpan;
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final boolean lastReferencedNanosAgo() {
        return 500000000 < System.nanoTime() - this.lastReferenced;
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final long oldestFinishedTime() {
        Iterator it = this.spans.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            DDSpan dDSpan = (DDSpan) it.next();
            if (dDSpan.durationNano != 0) {
                j = Math.min(j, dDSpan.startTimeNano + dDSpan.durationNano);
            }
        }
        return j;
    }

    public final void registerSpan(DDSpan dDSpan) {
        PendingTrace pendingTrace;
        DDSpan dDSpan2;
        while (true) {
            ROOT_SPAN.getClass();
            Unsafe unsafe = ConfigCollectorAtomicFieldUpdaterHelper.unsafe;
            long j = ROOT_SPAN$offset;
            pendingTrace = this;
            dDSpan2 = dDSpan;
            if (!unsafe.compareAndSwapObject(pendingTrace, j, (Object) null, dDSpan2) && unsafe.getObjectVolatile(pendingTrace, j) == null) {
                this = pendingTrace;
                dDSpan = dDSpan2;
            }
        }
        PENDING_REFERENCE_COUNT.incrementAndGet(pendingTrace);
        PendingTraceBuffer pendingTraceBuffer = pendingTrace.pendingTraceBuffer;
        if (pendingTraceBuffer.longRunningSpansEnabled()) {
            pendingTrace.spans.addFirst(dDSpan2);
            if (LONG_RUNNING_STATE.compareAndSet(pendingTrace, 0, 1)) {
                RUNNING_TRACE_START_TIME_NANO.set(pendingTrace, dDSpan2.startTimeNano);
                pendingTraceBuffer.enqueue(pendingTrace);
            }
        }
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final boolean setEnqueued(boolean z) {
        int i = !z ? 1 : 0;
        return IS_ENQUEUED.compareAndSet(this, i, 1 - i);
    }

    public final void setSamplingPriorityIfNecessary() {
        if ((this.traceConfig.sampler instanceof PrioritySampler) && this.rootSpan != null && this.rootSpan.context.getRootSpanContextOrThis().samplingPriority == -128) {
            ((PrioritySampler) this.traceConfig.sampler).setSamplingPriority(this.rootSpan);
        }
    }

    public final void write(boolean z) {
        int i;
        ArrayList arrayList;
        int i2;
        if (this.spans.isEmpty()) {
            return;
        }
        this.tracer.traceWriteTimer.getClass();
        synchronized (this) {
            i = 1;
            if (!z) {
                try {
                    this.rootSpanWritten = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i3 = this.completedSpanCount;
            boolean z2 = 3 == LONG_RUNNING_STATE.get(this);
            if (z2) {
                i3 += this.pendingReferenceCount;
            }
            if (i3 <= 0 || (z && i3 < this.tracer.partialFlushMinSpans)) {
                arrayList = EMPTY;
                i2 = 0;
            } else {
                arrayList = new ArrayList(i3);
                i2 = enqueueSpansToWrite(arrayList, z2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        COMPLETED_SPAN_COUNT.addAndGet(this, -i2);
        CoreTracer coreTracer = this.tracer;
        if (arrayList.isEmpty()) {
            return;
        }
        coreTracer.metricsAggregator.getClass();
        PendingTrace pendingTrace = ((DDSpan) arrayList.get(0)).context.trace;
        pendingTrace.setSamplingPriorityIfNecessary();
        DDSpan dDSpan = pendingTrace.rootSpan;
        DDSpan dDSpan2 = dDSpan == null ? (DDSpan) arrayList.get(0) : dDSpan;
        dDSpan2.getClass();
        boolean sample = pendingTrace.traceConfig.sampler.sample(dDSpan2);
        Writer writer = coreTracer.writer;
        if (sample) {
            writer.write(arrayList);
        } else {
            arrayList.size();
            writer.getClass();
        }
        if (dDSpan != null) {
            DDSpan dDSpan3 = dDSpan.context.trace.rootSpan;
            coreTracer.onRootSpanFinished(dDSpan);
            try {
                dDSpan.context.close();
            } catch (IOException e) {
                zbc zbcVar = coreTracer.log;
                ((zzlj) ((InternalLogger) zbcVar.zba)).log(4, Arrays.asList(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (Function0) new DatadogCoreTracerLogger$$ExternalSyntheticLambda0(zbcVar, i), (Throwable) e, false, (Map) null);
            }
        }
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final boolean writeOnBufferFull() {
        return !LONG_RUNNING_STATE.compareAndSet(this, 1, -1);
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public final void write() {
        write(false);
    }
}
