package com.squareup.cash.payments.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class NearbyPaymentsInfoItem {
    public static final /* synthetic */ NearbyPaymentsInfoItem[] $VALUES;
    public static final NearbyPaymentsInfoItem HOW_TO_GET_PAID;
    public static final NearbyPaymentsInfoItem HOW_TO_PAY;
    public static final NearbyPaymentsInfoItem PRIVACY_AND_SECURITY;
    public static final NearbyPaymentsInfoItem TROUBLESHOOTING;

    static {
        NearbyPaymentsInfoItem nearbyPaymentsInfoItem = new NearbyPaymentsInfoItem("HOW_TO_PAY", 0);
        HOW_TO_PAY = nearbyPaymentsInfoItem;
        NearbyPaymentsInfoItem nearbyPaymentsInfoItem2 = new NearbyPaymentsInfoItem("HOW_TO_GET_PAID", 1);
        HOW_TO_GET_PAID = nearbyPaymentsInfoItem2;
        NearbyPaymentsInfoItem nearbyPaymentsInfoItem3 = new NearbyPaymentsInfoItem("PRIVACY_AND_SECURITY", 2);
        PRIVACY_AND_SECURITY = nearbyPaymentsInfoItem3;
        NearbyPaymentsInfoItem nearbyPaymentsInfoItem4 = new NearbyPaymentsInfoItem("TROUBLESHOOTING", 3);
        TROUBLESHOOTING = nearbyPaymentsInfoItem4;
        $VALUES = new NearbyPaymentsInfoItem[]{nearbyPaymentsInfoItem, nearbyPaymentsInfoItem2, nearbyPaymentsInfoItem3, nearbyPaymentsInfoItem4};
    }

    public static NearbyPaymentsInfoItem valueOf(String str) {
        return (NearbyPaymentsInfoItem) Enum.valueOf(NearbyPaymentsInfoItem.class, str);
    }

    public static NearbyPaymentsInfoItem[] values() {
        return (NearbyPaymentsInfoItem[]) $VALUES.clone();
    }
}
