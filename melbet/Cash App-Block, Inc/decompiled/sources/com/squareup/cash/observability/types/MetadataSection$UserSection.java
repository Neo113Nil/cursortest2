package com.squareup.cash.observability.types;

import com.squareup.cash.clientsync.readers.SyncValueSpec;

/* loaded from: classes6.dex */
public final class MetadataSection$UserSection extends SyncValueSpec {
    public static final MetadataSection$UserSection INSTANCE = new MetadataSection$UserSection("User", null, 6);

    public final class EmployeeKey extends MetadataKey {
        public static final EmployeeKey INSTANCE = new EmployeeKey("isEmployee", null, 6);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmployeeKey);
        }

        public final int hashCode() {
            return -720190671;
        }

        public final String toString() {
            return "EmployeeKey";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MetadataSection$UserSection);
    }

    public final int hashCode() {
        return 1685389422;
    }

    public final String toString() {
        return "UserSection";
    }
}
