package com.squareup.address.typeahead.backend.api;

/* loaded from: classes5.dex */
public abstract class LocationSearchClient$LocationDetailsResult {

    public final class Failure extends LocationSearchClient$LocationDetailsResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 1330780536;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success extends LocationSearchClient$LocationDetailsResult {
        public final Location location;

        public Success(Location location) {
            this.location = location;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.location.equals(((Success) obj).location);
        }

        public final int hashCode() {
            return this.location.hashCode();
        }

        public final String toString() {
            return "Success(location=" + this.location + ")";
        }
    }
}
