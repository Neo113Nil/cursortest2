package com.datadog.android.rum.internal.domain.event;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumEventMeta$View {
    public final long documentVersion;
    public final Boolean hasAccessibility;
    public final String viewId;

    public RumEventMeta$View(String str, long j, Boolean bool) {
        str.getClass();
        this.viewId = str;
        this.documentVersion = j;
        this.hasAccessibility = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumEventMeta$View)) {
            return false;
        }
        RumEventMeta$View rumEventMeta$View = (RumEventMeta$View) obj;
        return Intrinsics.areEqual(this.viewId, rumEventMeta$View.viewId) && this.documentVersion == rumEventMeta$View.documentVersion && this.hasAccessibility.equals(rumEventMeta$View.hasAccessibility);
    }

    public final int hashCode() {
        return this.hasAccessibility.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.viewId.hashCode() * 31, 31, this.documentVersion);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("View(viewId=", this.viewId, ", documentVersion=", this.documentVersion);
        m.append(", hasAccessibility=");
        m.append(this.hasAccessibility);
        m.append(")");
        return m.toString();
    }
}
