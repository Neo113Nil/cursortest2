package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public final class MetadataSection$SessionInfoSection extends SyncValueSpec {
    public static final MetadataSection$SessionInfoSection INSTANCE = new MetadataSection$SessionInfoSection("Session Info", "session", 2);

    public final class InteractivitySessionId extends MetadataKey {
        public static final InteractivitySessionId INSTANCE = new InteractivitySessionId("Interactivity Session ID", "session.interactivity_session_id", 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InteractivitySessionId);
        }

        public final int hashCode() {
            return 185514567;
        }

        public final String toString() {
            return "InteractivitySessionId";
        }
    }

    /* loaded from: classes6.dex */
    public final class RegionKey extends MetadataKey {
        public static final RegionKey INSTANCE = new RegionKey("Region", "session.region", 2);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RegionKey);
        }

        public final int hashCode() {
            return -1882293878;
        }

        public final String toString() {
            return "RegionKey";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$SessionInfoSection);
    }

    public final int hashCode() {
        return -636868723;
    }

    public final String toString() {
        return "SessionInfoSection";
    }
}
