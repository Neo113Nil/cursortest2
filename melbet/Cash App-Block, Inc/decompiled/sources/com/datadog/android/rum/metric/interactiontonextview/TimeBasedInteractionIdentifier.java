package com.datadog.android.rum.metric.interactiontonextview;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class TimeBasedInteractionIdentifier implements LastInteractionIdentifier {
    public final long timeThresholdInNanoSeconds = TimeUnit.MILLISECONDS.toNanos(3000);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TimeBasedInteractionIdentifier.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.timeThresholdInNanoSeconds == ((TimeBasedInteractionIdentifier) obj).timeThresholdInNanoSeconds;
    }

    public final int hashCode() {
        return Long.hashCode(this.timeThresholdInNanoSeconds);
    }

    @Override // com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier
    public final boolean validate(PreviousViewLastInteractionContext previousViewLastInteractionContext) {
        return previousViewLastInteractionContext.currentViewCreationTimestamp.longValue() - previousViewLastInteractionContext.eventCreatedAtNanos < this.timeThresholdInNanoSeconds;
    }
}
