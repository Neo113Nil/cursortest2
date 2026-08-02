package com.squareup.cash.interaction;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InteractionInfo {
    public final ArrayList activeUserJourneyNames;
    public final UserInteractionLatencyEvent analyticEvent;
    public final String description;
    public final Long navigationLatencyMs;

    public InteractionInfo(String str, UserInteractionLatencyEvent userInteractionLatencyEvent, ArrayList arrayList, Long l) {
        this.description = str;
        this.analyticEvent = userInteractionLatencyEvent;
        this.activeUserJourneyNames = arrayList;
        this.navigationLatencyMs = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionInfo)) {
            return false;
        }
        InteractionInfo interactionInfo = (InteractionInfo) obj;
        return this.description.equals(interactionInfo.description) && this.analyticEvent.equals(interactionInfo.analyticEvent) && this.activeUserJourneyNames.equals(interactionInfo.activeUserJourneyNames) && Intrinsics.areEqual(this.navigationLatencyMs, interactionInfo.navigationLatencyMs);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.activeUserJourneyNames, (this.analyticEvent.hashCode() + (this.description.hashCode() * 31)) * 31, 29791);
        Long l = this.navigationLatencyMs;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "InteractionInfo(description=" + this.description + ", analyticEvent=" + this.analyticEvent + ", activeUserJourneyNames=" + this.activeUserJourneyNames + ", startMetadata=null, endMetadata=null, navigationLatencyMs=" + this.navigationLatencyMs + ")";
    }
}
