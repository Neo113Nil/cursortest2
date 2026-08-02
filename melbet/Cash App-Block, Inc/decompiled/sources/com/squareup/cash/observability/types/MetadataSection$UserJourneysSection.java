package com.squareup.cash.observability.types;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public final class MetadataSection$UserJourneysSection extends SyncValueSpec {
    public static final MetadataSection$UserJourneysSection INSTANCE = new MetadataSection$UserJourneysSection("User Journeys", "user_journeys", 2);

    public final class AllActiveJourneyIds extends MetadataKey {
        public static final AllActiveJourneyIds INSTANCE = new AllActiveJourneyIds("active-user-journey-ids", Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$UserJourneysSection.INSTANCE.valueType, ".active_user_journey_ids"), 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllActiveJourneyIds);
        }

        public final int hashCode() {
            return 1021834988;
        }

        public final String toString() {
            return "AllActiveJourneyIds";
        }
    }

    public final class AllActiveJourneyNames extends MetadataKey {
        public static final AllActiveJourneyNames INSTANCE = new AllActiveJourneyNames("active-user-journey-names", Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$UserJourneysSection.INSTANCE.valueType, ".active_user_journey_names"), 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllActiveJourneyNames);
        }

        public final int hashCode() {
            return -1559561604;
        }

        public final String toString() {
            return "AllActiveJourneyNames";
        }
    }

    public final class LatestActiveUserJourneyId extends MetadataKey {
        public static final LatestActiveUserJourneyId INSTANCE = new LatestActiveUserJourneyId("latest-active-journey-id", Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$UserJourneysSection.INSTANCE.valueType, ".latest_active_journey_id"), 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LatestActiveUserJourneyId);
        }

        public final int hashCode() {
            return -298630160;
        }

        public final String toString() {
            return "LatestActiveUserJourneyId";
        }
    }

    public final class LatestActiveUserJourneyName extends MetadataKey {
        public static final LatestActiveUserJourneyName INSTANCE = new LatestActiveUserJourneyName("latest-active-journey-name", Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$UserJourneysSection.INSTANCE.valueType, ".latest_active_journey_name"), 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LatestActiveUserJourneyName);
        }

        public final int hashCode() {
            return 779374624;
        }

        public final String toString() {
            return "LatestActiveUserJourneyName";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$UserJourneysSection);
    }

    public final int hashCode() {
        return 1945900859;
    }

    public final String toString() {
        return "UserJourneysSection";
    }
}
