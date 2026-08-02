package com.squareup.cash.activity.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class PulledToRefresh implements ActivityTabViewEvent {
    public final boolean manuallyTriggered;

    public PulledToRefresh(boolean z) {
        this.manuallyTriggered = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PulledToRefresh) && this.manuallyTriggered == ((PulledToRefresh) obj).manuallyTriggered;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.manuallyTriggered);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("PulledToRefresh(manuallyTriggered=", ")", this.manuallyTriggered);
    }
}
