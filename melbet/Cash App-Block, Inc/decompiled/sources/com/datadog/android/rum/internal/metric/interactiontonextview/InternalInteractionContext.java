package com.datadog.android.rum.internal.metric.interactiontonextview;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InternalInteractionContext {
    public final ActionEvent.ActionEventActionType actionType;
    public final long eventCreatedAtNanos;
    public final String viewId;

    public InternalInteractionContext(String str, ActionEvent.ActionEventActionType actionEventActionType, long j) {
        str.getClass();
        actionEventActionType.getClass();
        this.viewId = str;
        this.actionType = actionEventActionType;
        this.eventCreatedAtNanos = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalInteractionContext)) {
            return false;
        }
        InternalInteractionContext internalInteractionContext = (InternalInteractionContext) obj;
        return Intrinsics.areEqual(this.viewId, internalInteractionContext.viewId) && this.actionType == internalInteractionContext.actionType && this.eventCreatedAtNanos == internalInteractionContext.eventCreatedAtNanos;
    }

    public final int hashCode() {
        return Long.hashCode(this.eventCreatedAtNanos) + ((this.actionType.hashCode() + (this.viewId.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalInteractionContext(viewId=");
        sb.append(this.viewId);
        sb.append(", actionType=");
        sb.append(this.actionType);
        sb.append(", eventCreatedAtNanos=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.eventCreatedAtNanos, ")", sb);
    }
}
