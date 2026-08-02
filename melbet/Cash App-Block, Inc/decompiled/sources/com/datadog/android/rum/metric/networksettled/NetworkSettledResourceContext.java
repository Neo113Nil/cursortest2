package com.datadog.android.rum.metric.networksettled;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class NetworkSettledResourceContext {
    public final long eventCreatedAtNanos;
    public final String resourceId;
    public final Long viewCreatedTimestamp;

    public NetworkSettledResourceContext(long j, Long l, String str) {
        this.resourceId = str;
        this.eventCreatedAtNanos = j;
        this.viewCreatedTimestamp = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkSettledResourceContext)) {
            return false;
        }
        NetworkSettledResourceContext networkSettledResourceContext = (NetworkSettledResourceContext) obj;
        return this.resourceId.equals(networkSettledResourceContext.resourceId) && this.eventCreatedAtNanos == networkSettledResourceContext.eventCreatedAtNanos && Intrinsics.areEqual(this.viewCreatedTimestamp, networkSettledResourceContext.viewCreatedTimestamp);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.resourceId.hashCode() * 31, 31, this.eventCreatedAtNanos);
        Long l = this.viewCreatedTimestamp;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("NetworkSettledResourceContext(resourceId=", this.resourceId, ", eventCreatedAtNanos=", this.eventCreatedAtNanos);
        m.append(", viewCreatedTimestamp=");
        m.append(this.viewCreatedTimestamp);
        m.append(")");
        return m.toString();
    }
}
