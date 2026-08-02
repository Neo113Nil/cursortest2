package com.squareup.address.typeahead.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LocationType {
    public static final /* synthetic */ LocationType[] $VALUES;
    public static final LocationType Address;
    public static final LocationType City;
    public static final LocationType Postal;
    public static final LocationType StreetAndPostal;

    static {
        LocationType locationType = new LocationType("Address", 0);
        Address = locationType;
        LocationType locationType2 = new LocationType("City", 1);
        City = locationType2;
        LocationType locationType3 = new LocationType("Postal", 2);
        Postal = locationType3;
        LocationType locationType4 = new LocationType("StreetAndPostal", 3);
        StreetAndPostal = locationType4;
        $VALUES = new LocationType[]{locationType, locationType2, locationType3, locationType4};
    }

    public static LocationType valueOf(String str) {
        return (LocationType) Enum.valueOf(LocationType.class, str);
    }

    public static LocationType[] values() {
        return (LocationType[]) $VALUES.clone();
    }
}
