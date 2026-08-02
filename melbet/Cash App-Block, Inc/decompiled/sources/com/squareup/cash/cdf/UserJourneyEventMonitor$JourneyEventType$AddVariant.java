package com.squareup.cash.cdf;

import androidx.room.Room;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class UserJourneyEventMonitor$JourneyEventType$AddVariant extends Room {
    public final String variantName;

    public UserJourneyEventMonitor$JourneyEventType$AddVariant(String str) {
        this.variantName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserJourneyEventMonitor$JourneyEventType$AddVariant) && this.variantName.equals(((UserJourneyEventMonitor$JourneyEventType$AddVariant) obj).variantName);
    }

    public final int hashCode() {
        return this.variantName.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddVariant(variantName=", this.variantName, ")");
    }
}
