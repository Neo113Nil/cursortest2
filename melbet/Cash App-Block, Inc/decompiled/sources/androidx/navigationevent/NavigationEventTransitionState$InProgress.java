package androidx.navigationevent;

import app.cash.molecule.PlatformKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NavigationEventTransitionState$InProgress extends PlatformKt {
    public final NavigationEvent latestEvent;

    public NavigationEventTransitionState$InProgress(NavigationEvent navigationEvent) {
        navigationEvent.getClass();
        this.latestEvent = navigationEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NavigationEventTransitionState$InProgress.class == obj.getClass() && Intrinsics.areEqual(this.latestEvent, ((NavigationEventTransitionState$InProgress) obj).latestEvent);
    }

    public final int hashCode() {
        return this.latestEvent.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.latestEvent + ", direction=-1)";
    }
}
