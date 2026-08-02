package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public final class MetadataSection$AdditionalInfoSection extends SyncValueSpec {
    public static final MetadataSection$AdditionalInfoSection INSTANCE = new MetadataSection$AdditionalInfoSection("Additional Info", null, 6);

    public final class ActiveStorageLinkKey extends MetadataKey {
        public static final ActiveStorageLinkKey INSTANCE = new ActiveStorageLinkKey("Active Storage Link", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActiveStorageLinkKey);
        }

        public final int hashCode() {
            return -53921030;
        }

        public final String toString() {
            return "ActiveStorageLinkKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class AppConfigSyncTimeKey extends MetadataKey {
        public static final AppConfigSyncTimeKey INSTANCE = new AppConfigSyncTimeKey("App Config Sync Time", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppConfigSyncTimeKey);
        }

        public final int hashCode() {
            return 1801556414;
        }

        public final String toString() {
            return "AppConfigSyncTimeKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class FeatureFlagSyncTimeKey extends MetadataKey {
        public static final FeatureFlagSyncTimeKey INSTANCE = new FeatureFlagSyncTimeKey("Feature Flag Sync Time", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeatureFlagSyncTimeKey);
        }

        public final int hashCode() {
            return 1610978079;
        }

        public final String toString() {
            return "FeatureFlagSyncTimeKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class FeatureKey extends MetadataKey {
        public static final FeatureKey INSTANCE = new FeatureKey("Features", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeatureKey);
        }

        public final int hashCode() {
            return -1915632301;
        }

        public final String toString() {
            return "FeatureKey";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$AdditionalInfoSection);
    }

    public final int hashCode() {
        return -2140833148;
    }

    public final String toString() {
        return "AdditionalInfoSection";
    }
}
