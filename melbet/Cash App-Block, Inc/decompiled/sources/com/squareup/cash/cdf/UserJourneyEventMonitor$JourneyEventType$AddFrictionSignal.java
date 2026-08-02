package com.squareup.cash.cdf;

import androidx.room.Room;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal extends Room {
    public final String signalName;

    public UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal(String str) {
        this.signalName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal) && this.signalName.equals(((UserJourneyEventMonitor$JourneyEventType$AddFrictionSignal) obj).signalName);
    }

    public final int hashCode() {
        return this.signalName.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddFrictionSignal(signalName=", this.signalName, ")");
    }
}
