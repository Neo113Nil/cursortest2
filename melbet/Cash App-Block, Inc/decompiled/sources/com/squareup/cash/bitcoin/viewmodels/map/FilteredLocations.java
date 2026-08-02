package com.squareup.cash.bitcoin.viewmodels.map;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class FilteredLocations {
    public final BitcoinLocationFilter locationFilter;
    public final List locations;

    public FilteredLocations(List list, BitcoinLocationFilter bitcoinLocationFilter) {
        list.getClass();
        bitcoinLocationFilter.getClass();
        this.locations = list;
        this.locationFilter = bitcoinLocationFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilteredLocations)) {
            return false;
        }
        FilteredLocations filteredLocations = (FilteredLocations) obj;
        return Intrinsics.areEqual(this.locations, filteredLocations.locations) && Intrinsics.areEqual(this.locationFilter, filteredLocations.locationFilter);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.locationFilter.squareSellersOnly) + (this.locations.hashCode() * 31);
    }

    public final String toString() {
        return "FilteredLocations(locations=" + this.locations + ", locationFilter=" + this.locationFilter + ")";
    }
}
