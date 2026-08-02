package com.squareup.address.typeahead.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AddressSearcher$AddressTypeFilter {
    public static final /* synthetic */ AddressSearcher$AddressTypeFilter[] $VALUES;
    public static final AddressSearcher$AddressTypeFilter ADDRESS;
    public static final AddressSearcher$AddressTypeFilter CITIES;
    public static final AddressSearcher$AddressTypeFilter GEOCODE;

    static {
        AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter = new AddressSearcher$AddressTypeFilter("ADDRESS", 0);
        ADDRESS = addressSearcher$AddressTypeFilter;
        AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter2 = new AddressSearcher$AddressTypeFilter("CITIES", 1);
        CITIES = addressSearcher$AddressTypeFilter2;
        AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter3 = new AddressSearcher$AddressTypeFilter("ESTABLISHMENT", 2);
        AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter4 = new AddressSearcher$AddressTypeFilter("GEOCODE", 3);
        GEOCODE = addressSearcher$AddressTypeFilter4;
        $VALUES = new AddressSearcher$AddressTypeFilter[]{addressSearcher$AddressTypeFilter, addressSearcher$AddressTypeFilter2, addressSearcher$AddressTypeFilter3, addressSearcher$AddressTypeFilter4, new AddressSearcher$AddressTypeFilter("REGIONS", 4)};
    }

    public static AddressSearcher$AddressTypeFilter valueOf(String str) {
        return (AddressSearcher$AddressTypeFilter) Enum.valueOf(AddressSearcher$AddressTypeFilter.class, str);
    }

    public static AddressSearcher$AddressTypeFilter[] values() {
        return (AddressSearcher$AddressTypeFilter[]) $VALUES.clone();
    }
}
