package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Origin {
    public static final /* synthetic */ Origin[] $VALUES;
    public static final Origin AMOUNT_FIRST;
    public static final Origin APP_LINK;
    public static final Origin CUSTOMER_PROFILE_ACTIVITY;
    public static final Origin CUSTOMER_PROFILE_FAVORITES;
    public static final Origin CUSTOMER_PROFILE_PROFILE_DIRECTORY;
    public static final Origin PERSON_FIRST;
    public static final Origin PROFILE_DIRECTORY;

    static {
        Origin origin = new Origin("CUSTOMER_PROFILE_FAVORITES", 0);
        CUSTOMER_PROFILE_FAVORITES = origin;
        Origin origin2 = new Origin("CUSTOMER_PROFILE_PROFILE_DIRECTORY", 1);
        CUSTOMER_PROFILE_PROFILE_DIRECTORY = origin2;
        Origin origin3 = new Origin("CUSTOMER_PROFILE_ACTIVITY", 2);
        CUSTOMER_PROFILE_ACTIVITY = origin3;
        Origin origin4 = new Origin("PROFILE_DIRECTORY", 3);
        PROFILE_DIRECTORY = origin4;
        Origin origin5 = new Origin("APP_LINK", 4);
        APP_LINK = origin5;
        Origin origin6 = new Origin("APP_SHORTCUT", 5);
        Origin origin7 = new Origin("SIRI_DRAFT_PAYMENT", 6);
        Origin origin8 = new Origin("AMOUNT_FIRST", 7);
        AMOUNT_FIRST = origin8;
        Origin origin9 = new Origin("PERSON_FIRST", 8);
        PERSON_FIRST = origin9;
        $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5, origin6, origin7, origin8, origin9, new Origin("THREAD", 9), new Origin("BUSINESS_PROFILE_FAVORITES", 10), new Origin("BUSINESS_PROFILE_DISCOVER_SEARCH", 11), new Origin("BUSINESS_PROFILE_ACTIVITY", 12)};
    }

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}
