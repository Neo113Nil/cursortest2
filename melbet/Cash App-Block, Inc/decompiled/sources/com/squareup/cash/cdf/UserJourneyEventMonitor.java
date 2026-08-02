package com.squareup.cash.cdf;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.Room;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UserJourneyEventMonitor {
    public final NameProvider cdfEvent;
    public final Room eventType;
    public final UserJourneyName journeyName;
    public final Map requiredParameters;

    public UserJourneyEventMonitor(UserJourneyName userJourneyName, NameProvider nameProvider, Map map, Room room) {
        userJourneyName.getClass();
        nameProvider.getClass();
        map.getClass();
        this.journeyName = userJourneyName;
        this.cdfEvent = nameProvider;
        this.requiredParameters = map;
        this.eventType = room;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserJourneyEventMonitor)) {
            return false;
        }
        UserJourneyEventMonitor userJourneyEventMonitor = (UserJourneyEventMonitor) obj;
        return this.journeyName == userJourneyEventMonitor.journeyName && Intrinsics.areEqual(this.cdfEvent, userJourneyEventMonitor.cdfEvent) && Intrinsics.areEqual(this.requiredParameters, userJourneyEventMonitor.requiredParameters) && this.eventType.equals(userJourneyEventMonitor.eventType);
    }

    public final int hashCode() {
        return this.eventType.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((this.cdfEvent.hashCode() + (this.journeyName.hashCode() * 31)) * 31, this.requiredParameters, 31);
    }

    public final String toString() {
        return "UserJourneyEventMonitor(journeyName=" + this.journeyName + ", cdfEvent=" + this.cdfEvent + ", requiredParameters=" + this.requiredParameters + ", eventType=" + this.eventType + ")";
    }
}
