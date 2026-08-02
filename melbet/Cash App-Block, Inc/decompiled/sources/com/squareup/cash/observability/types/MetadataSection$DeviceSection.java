package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes.dex */
public final class MetadataSection$DeviceSection extends SyncValueSpec {
    public static final MetadataSection$DeviceSection INSTANCE = new MetadataSection$DeviceSection("Device", "device", 2);

    public final class IsTablet extends MetadataKey {
        public static final IsTablet INSTANCE = new IsTablet("isTablet", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IsTablet);
        }

        public final int hashCode() {
            return -875633829;
        }

        public final String toString() {
            return "IsTablet";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$DeviceSection);
    }

    public final int hashCode() {
        return 23021187;
    }

    public final String toString() {
        return "DeviceSection";
    }
}
