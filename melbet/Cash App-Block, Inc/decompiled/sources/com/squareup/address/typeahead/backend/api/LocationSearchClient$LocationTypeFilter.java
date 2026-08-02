package com.squareup.address.typeahead.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LocationSearchClient$LocationTypeFilter {
    public static final /* synthetic */ LocationSearchClient$LocationTypeFilter[] $VALUES = {new LocationSearchClient$LocationTypeFilter("ADDRESS", 0), new LocationSearchClient$LocationTypeFilter("CITIES", 1), new LocationSearchClient$LocationTypeFilter("ESTABLISHMENT", 2), new LocationSearchClient$LocationTypeFilter("GEOCODE", 3), new LocationSearchClient$LocationTypeFilter("REGIONS", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    LocationSearchClient$LocationTypeFilter EF5;

    public static LocationSearchClient$LocationTypeFilter valueOf(String str) {
        return (LocationSearchClient$LocationTypeFilter) Enum.valueOf(LocationSearchClient$LocationTypeFilter.class, str);
    }

    public static LocationSearchClient$LocationTypeFilter[] values() {
        return (LocationSearchClient$LocationTypeFilter[]) $VALUES.clone();
    }
}
