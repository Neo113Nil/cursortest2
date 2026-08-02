package com.squareup.address.typeahead.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class LocationSearchClient$LocationSearchResult {

    public final class Failure extends LocationSearchClient$LocationSearchResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -1810011452;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success extends LocationSearchClient$LocationSearchResult {
        public final ArrayList locations;

        public Success(ArrayList arrayList) {
            this.locations = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.locations.equals(((Success) obj).locations);
        }

        public final int hashCode() {
            return this.locations.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Success(locations=", ")", this.locations);
        }
    }
}
