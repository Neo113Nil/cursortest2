package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes6.dex */
public final class MetadataSection$AppSection extends SyncValueSpec {
    public static final MetadataSection$AppSection INSTANCE = new MetadataSection$AppSection("App", null, 6);

    public final class MigratedSyncValuesKey extends MetadataKey {
        public static final MigratedSyncValuesKey INSTANCE = new MigratedSyncValuesKey("Migrated Sync Values", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MigratedSyncValuesKey);
        }

        public final int hashCode() {
            return 2126459275;
        }

        public final String toString() {
            return "MigratedSyncValuesKey";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$AppSection);
    }

    public final int hashCode() {
        return 332348208;
    }

    public final String toString() {
        return "AppSection";
    }
}
