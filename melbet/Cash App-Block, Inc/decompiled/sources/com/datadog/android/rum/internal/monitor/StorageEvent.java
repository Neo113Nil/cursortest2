package com.datadog.android.rum.internal.monitor;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class StorageEvent {

    /* loaded from: classes4.dex */
    public final class Action extends StorageEvent {
        public final long eventEndTimestampInNanos;
        public final int frustrationCount;

        /* renamed from: type, reason: collision with root package name */
        public final ActionEvent.ActionEventActionType f954type;

        public Action(int i, ActionEvent.ActionEventActionType actionEventActionType, long j) {
            this.frustrationCount = i;
            this.f954type = actionEventActionType;
            this.eventEndTimestampInNanos = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.frustrationCount == action.frustrationCount && this.f954type == action.f954type && this.eventEndTimestampInNanos == action.eventEndTimestampInNanos;
        }

        public final int hashCode() {
            return Long.hashCode(this.eventEndTimestampInNanos) + ((this.f954type.hashCode() + (Integer.hashCode(this.frustrationCount) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(frustrationCount=");
            sb.append(this.frustrationCount);
            sb.append(", type=");
            sb.append(this.f954type);
            sb.append(", eventEndTimestampInNanos=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.eventEndTimestampInNanos, ")", sb);
        }
    }

    /* loaded from: classes4.dex */
    public final class Error extends StorageEvent {
        public final String resourceId;
        public final Long resourceStopTimestampInNanos;

        public Error(String str, Long l) {
            this.resourceId = str;
            this.resourceStopTimestampInNanos = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.resourceId, error.resourceId) && Intrinsics.areEqual(this.resourceStopTimestampInNanos, error.resourceStopTimestampInNanos);
        }

        public final int hashCode() {
            String str = this.resourceId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.resourceStopTimestampInNanos;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            return "Error(resourceId=" + this.resourceId + ", resourceStopTimestampInNanos=" + this.resourceStopTimestampInNanos + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class FrozenFrame extends StorageEvent {
        public static final FrozenFrame INSTANCE = new FrozenFrame();
    }

    /* loaded from: classes4.dex */
    public final class LongTask extends StorageEvent {
        public static final LongTask INSTANCE = new LongTask();
    }

    /* loaded from: classes4.dex */
    public final class Resource extends StorageEvent {
        public final String resourceId;
        public final long resourceStopTimestampInNanos;

        public Resource(String str, long j) {
            str.getClass();
            this.resourceId = str;
            this.resourceStopTimestampInNanos = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) obj;
            return Intrinsics.areEqual(this.resourceId, resource.resourceId) && this.resourceStopTimestampInNanos == resource.resourceStopTimestampInNanos;
        }

        public final int hashCode() {
            return Long.hashCode(this.resourceStopTimestampInNanos) + (this.resourceId.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Resource(resourceId=", this.resourceId, ", resourceStopTimestampInNanos=", this.resourceStopTimestampInNanos);
            m.append(")");
            return m.toString();
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNearbyPayment.deepLinkSpecs;
    }
}
