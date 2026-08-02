package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes6.dex */
public final class MetadataSection$OperatingSystemSection extends SyncValueSpec {
    public static final MetadataSection$OperatingSystemSection INSTANCE = new MetadataSection$OperatingSystemSection("Operating System", "os", 2);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$OperatingSystemSection);
    }

    public final int hashCode() {
        return -81444447;
    }

    public final String toString() {
        return "OperatingSystemSection";
    }
}
