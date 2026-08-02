package com.squareup.cash.cdf;

import androidx.room.Room;

/* loaded from: classes.dex */
public final class UserJourneyEventMonitor$JourneyEventType$End extends Room {
    public final UserJourneyOutcome$Completed$Failed outcome;

    public UserJourneyEventMonitor$JourneyEventType$End(UserJourneyOutcome$Completed$Failed userJourneyOutcome$Completed$Failed) {
        this.outcome = userJourneyOutcome$Completed$Failed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserJourneyEventMonitor$JourneyEventType$End) && this.outcome.equals(((UserJourneyEventMonitor$JourneyEventType$End) obj).outcome);
    }

    public final int hashCode() {
        return this.outcome.hashCode();
    }

    public final String toString() {
        return "End(outcome=" + this.outcome + ")";
    }
}
