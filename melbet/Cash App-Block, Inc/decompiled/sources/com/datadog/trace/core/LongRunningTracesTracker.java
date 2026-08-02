package com.datadog.trace.core;

import com.datadog.trace.api.Config;
import com.datadog.trace.core.monitor.HealthMetrics$1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes4.dex */
public final class LongRunningTracesTracker {
    public int flushPeriodMilli;
    public Object healthMetrics;
    public long lastFlushMilli;
    public int maxTrackedTraces;
    public final Object traceArray;

    public LongRunningTracesTracker(Config config) {
        this.lastFlushMilli = 0L;
        this.traceArray = new ArrayList(16);
        this.maxTrackedTraces = 4096;
        this.flushPeriodMilli = (int) TimeUnit.SECONDS.toMillis(config.longRunningTraceFlushInterval);
        this.healthMetrics = HealthMetrics$1.NO_OP;
    }

    public void cleanSlot(int i) {
        ArrayList arrayList = (ArrayList) this.traceArray;
        int size = arrayList.size() - 1;
        arrayList.set(i, (PendingTrace) arrayList.get(size));
        arrayList.remove(size);
    }

    public void flushAndCompact(long j) {
        if (j < this.lastFlushMilli + 1000) {
            return;
        }
        int i = 0;
        while (i < ((ArrayList) this.traceArray).size()) {
            PendingTrace pendingTrace = (PendingTrace) ((ArrayList) this.traceArray).get(i);
            if (pendingTrace == null) {
                cleanSlot(i);
            } else {
                if (PendingTrace.PENDING_REFERENCE_COUNT.get(pendingTrace) + PendingTrace.COMPLETED_SPAN_COUNT.get(pendingTrace) <= 0) {
                    PendingTrace.LONG_RUNNING_STATE.compareAndSet(pendingTrace, 3, -1);
                    cleanSlot(i);
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater = PendingTrace.RUNNING_TRACE_START_TIME_NANO;
                    if (j - (atomicLongFieldUpdater.get(pendingTrace) / 1000000) > 43200000) {
                        PendingTrace.LONG_RUNNING_STATE.compareAndSet(pendingTrace, 3, 4);
                        cleanSlot(i);
                    } else {
                        if (j - (Math.max(atomicLongFieldUpdater.get(pendingTrace), PendingTrace.LAST_WRITE_TIME_NANO.get(pendingTrace)) / 1000000) > this.flushPeriodMilli) {
                            DDSpan dDSpan = (DDSpan) pendingTrace.spans.peek();
                            Integer num = null;
                            if (dDSpan != null) {
                                Integer traceSamplingPriority = dDSpan.getTraceSamplingPriority();
                                if (traceSamplingPriority == null) {
                                    PendingTrace pendingTrace2 = dDSpan.context.trace;
                                    DDSpan dDSpan2 = pendingTrace2.rootSpan;
                                    pendingTrace2.setSamplingPriorityIfNecessary();
                                    if (dDSpan2 != null) {
                                        num = dDSpan2.getTraceSamplingPriority();
                                    }
                                } else {
                                    num = traceSamplingPriority;
                                }
                            }
                            if (num == null || num.intValue() <= 0) {
                                PendingTrace.LONG_RUNNING_STATE.compareAndSet(pendingTrace, 2, -1);
                                cleanSlot(i);
                            } else {
                                PendingTrace.LONG_RUNNING_STATE.compareAndSet(pendingTrace, 2, 3);
                                pendingTrace.write(false);
                            }
                        }
                        i++;
                    }
                }
            }
        }
        this.lastFlushMilli = j;
        ((HealthMetrics$1) this.healthMetrics).getClass();
    }

    public LongRunningTracesTracker(zzds zzdsVar) {
        zzdsVar.getClass();
        this.traceArray = zzdsVar;
    }
}
