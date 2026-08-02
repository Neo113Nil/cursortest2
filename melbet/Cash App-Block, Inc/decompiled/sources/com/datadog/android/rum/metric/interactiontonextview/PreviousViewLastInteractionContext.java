package com.datadog.android.rum.metric.interactiontonextview;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.android.rum.model.ActionEvent;

/* loaded from: classes4.dex */
public final class PreviousViewLastInteractionContext {
    public final ActionEvent.ActionEventActionType actionType;
    public final Long currentViewCreationTimestamp;
    public final long eventCreatedAtNanos;

    public PreviousViewLastInteractionContext(ActionEvent.ActionEventActionType actionEventActionType, long j, Long l) {
        actionEventActionType.getClass();
        this.actionType = actionEventActionType;
        this.eventCreatedAtNanos = j;
        this.currentViewCreationTimestamp = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousViewLastInteractionContext)) {
            return false;
        }
        PreviousViewLastInteractionContext previousViewLastInteractionContext = (PreviousViewLastInteractionContext) obj;
        return this.actionType == previousViewLastInteractionContext.actionType && this.eventCreatedAtNanos == previousViewLastInteractionContext.eventCreatedAtNanos && this.currentViewCreationTimestamp.equals(previousViewLastInteractionContext.currentViewCreationTimestamp);
    }

    public final int hashCode() {
        return this.currentViewCreationTimestamp.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.actionType.hashCode() * 31, 31, this.eventCreatedAtNanos);
    }

    public final String toString() {
        return "PreviousViewLastInteractionContext(actionType=" + this.actionType + ", eventCreatedAtNanos=" + this.eventCreatedAtNanos + ", currentViewCreationTimestamp=" + this.currentViewCreationTimestamp + ")";
    }
}
