package com.squareup.cash.cdf.featurerestrictionbanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Location {
    public static final /* synthetic */ Location[] $VALUES;
    public static final Location BITCOIN;
    public static final Location CARD;
    public static final Location DIRECT_DEPOSIT;
    public static final Location FAMILIES;
    public static final Location MONEY;
    public static final Location PAYCHECKS;
    public static final Location STOCKS;

    static {
        Location location = new Location("MONEY", 0);
        MONEY = location;
        Location location2 = new Location("STOCKS", 1);
        STOCKS = location2;
        Location location3 = new Location("BITCOIN", 2);
        BITCOIN = location3;
        Location location4 = new Location("FAMILIES", 3);
        FAMILIES = location4;
        Location location5 = new Location("CARD", 4);
        CARD = location5;
        Location location6 = new Location("DIRECT_DEPOSIT", 5);
        DIRECT_DEPOSIT = location6;
        Location location7 = new Location("PAYCHECKS", 6);
        PAYCHECKS = location7;
        $VALUES = new Location[]{location, location2, location3, location4, location5, location6, location7, new Location("TAX", 7)};
    }

    public static Location valueOf(String str) {
        return (Location) Enum.valueOf(Location.class, str);
    }

    public static Location[] values() {
        return (Location[]) $VALUES.clone();
    }
}
