package com.datadog.android.rum.metric.networksettled;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class TimeBasedInitialResourceIdentifier implements InitialResourceIdentifier {
    public final long timeThresholdInNanoSeconds = TimeUnit.MILLISECONDS.toNanos(100);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TimeBasedInitialResourceIdentifier.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.timeThresholdInNanoSeconds == ((TimeBasedInitialResourceIdentifier) obj).timeThresholdInNanoSeconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeThresholdInNanoSeconds);
    }

    @Override // com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier
    public final boolean validate(NetworkSettledResourceContext networkSettledResourceContext) {
        Long l = networkSettledResourceContext.viewCreatedTimestamp;
        if (l != null) {
            return networkSettledResourceContext.eventCreatedAtNanos - l.longValue() < this.timeThresholdInNanoSeconds;
        }
        return false;
    }
}
