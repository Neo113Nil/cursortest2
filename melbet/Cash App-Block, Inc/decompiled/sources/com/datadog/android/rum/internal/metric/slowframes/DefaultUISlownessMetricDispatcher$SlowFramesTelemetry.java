package com.datadog.android.rum.internal.metric.slowframes;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DefaultUISlownessMetricDispatcher$SlowFramesTelemetry {
    public final AtomicInteger ignoredFramesCount;
    public final AtomicInteger missedFrameCount;
    public final AtomicInteger slowFramesCount;

    public DefaultUISlownessMetricDispatcher$SlowFramesTelemetry() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicInteger atomicInteger2 = new AtomicInteger(0);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        this.slowFramesCount = atomicInteger;
        this.ignoredFramesCount = atomicInteger2;
        this.missedFrameCount = atomicInteger3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultUISlownessMetricDispatcher$SlowFramesTelemetry)) {
            return false;
        }
        DefaultUISlownessMetricDispatcher$SlowFramesTelemetry defaultUISlownessMetricDispatcher$SlowFramesTelemetry = (DefaultUISlownessMetricDispatcher$SlowFramesTelemetry) obj;
        return Intrinsics.areEqual(this.slowFramesCount, defaultUISlownessMetricDispatcher$SlowFramesTelemetry.slowFramesCount) && Intrinsics.areEqual(this.ignoredFramesCount, defaultUISlownessMetricDispatcher$SlowFramesTelemetry.ignoredFramesCount) && Intrinsics.areEqual(this.missedFrameCount, defaultUISlownessMetricDispatcher$SlowFramesTelemetry.missedFrameCount);
    }

    public final int hashCode() {
        return this.missedFrameCount.hashCode() + ((this.ignoredFramesCount.hashCode() + (this.slowFramesCount.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SlowFramesTelemetry(slowFramesCount=" + this.slowFramesCount + ", ignoredFramesCount=" + this.ignoredFramesCount + ", missedFrameCount=" + this.missedFrameCount + ")";
    }
}
