package com.squareup.cash.activity.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TabToolbarEvent implements ActivityTabViewEvent {
    public final TabToolbarInternalViewEvent tabToolbarEvent;

    public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
        tabToolbarInternalViewEvent.getClass();
        this.tabToolbarEvent = tabToolbarInternalViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.tabToolbarEvent, ((TabToolbarEvent) obj).tabToolbarEvent);
    }

    public final int hashCode() {
        return this.tabToolbarEvent.hashCode();
    }

    public final String toString() {
        return "TabToolbarEvent(tabToolbarEvent=" + this.tabToolbarEvent + ")";
    }
}
