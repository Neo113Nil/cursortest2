package com.squareup.cash.cdf;

import androidx.room.Room;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class UserJourneyEventMonitor$JourneyEventType$AddTag extends Room {
    public final String tagName;

    public UserJourneyEventMonitor$JourneyEventType$AddTag(String str) {
        this.tagName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserJourneyEventMonitor$JourneyEventType$AddTag) && this.tagName.equals(((UserJourneyEventMonitor$JourneyEventType$AddTag) obj).tagName);
    }

    public final int hashCode() {
        return this.tagName.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddTag(tagName=", this.tagName, ")");
    }
}
