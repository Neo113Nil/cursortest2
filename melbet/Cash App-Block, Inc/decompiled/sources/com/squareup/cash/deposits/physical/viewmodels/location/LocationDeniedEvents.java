package com.squareup.cash.deposits.physical.viewmodels.location;

/* loaded from: classes6.dex */
public abstract class LocationDeniedEvents {

    public final class Ignore extends LocationDeniedEvents {
        public static final Ignore INSTANCE = new Ignore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ignore);
        }

        public final int hashCode() {
            return 1577199597;
        }

        public final String toString() {
            return "Ignore";
        }
    }

    public final class UpdatePermissions extends LocationDeniedEvents {
        public static final UpdatePermissions INSTANCE = new UpdatePermissions();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdatePermissions);
        }

        public final int hashCode() {
            return -1177795840;
        }

        public final String toString() {
            return "UpdatePermissions";
        }
    }
}
