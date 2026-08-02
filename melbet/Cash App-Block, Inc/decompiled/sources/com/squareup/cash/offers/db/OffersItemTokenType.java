package com.squareup.cash.offers.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OffersItemTokenType {
    public static final /* synthetic */ OffersItemTokenType[] $VALUES;
    public static final OffersItemTokenType BUSINESS;
    public static final OffersItemTokenType CATEGORY;

    static {
        OffersItemTokenType offersItemTokenType = new OffersItemTokenType("CATEGORY", 0);
        CATEGORY = offersItemTokenType;
        OffersItemTokenType offersItemTokenType2 = new OffersItemTokenType("BUSINESS", 1);
        BUSINESS = offersItemTokenType2;
        $VALUES = new OffersItemTokenType[]{offersItemTokenType, offersItemTokenType2};
    }

    public static OffersItemTokenType valueOf(String str) {
        return (OffersItemTokenType) Enum.valueOf(OffersItemTokenType.class, str);
    }

    public static OffersItemTokenType[] values() {
        return (OffersItemTokenType[]) $VALUES.clone();
    }
}
