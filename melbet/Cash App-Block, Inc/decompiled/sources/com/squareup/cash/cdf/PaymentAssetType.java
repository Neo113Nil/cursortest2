package com.squareup.cash.cdf;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentAssetType {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ PaymentAssetType[] $VALUES;
    public static final PaymentAssetType CASH;

    static {
        PaymentAssetType paymentAssetType = new PaymentAssetType("CASH", 0);
        CASH = paymentAssetType;
        PaymentAssetType[] paymentAssetTypeArr = {paymentAssetType, new PaymentAssetType("BTC", 1), new PaymentAssetType("STOCK", 2), new PaymentAssetType("GIFTCARD", 3), new PaymentAssetType("USDC", 4)};
        $VALUES = paymentAssetTypeArr;
        $ENTRIES = new EnumEntriesList(paymentAssetTypeArr);
    }

    public static PaymentAssetType valueOf(String str) {
        return (PaymentAssetType) Enum.valueOf(PaymentAssetType.class, str);
    }

    public static PaymentAssetType[] values() {
        return (PaymentAssetType[]) $VALUES.clone();
    }
}
