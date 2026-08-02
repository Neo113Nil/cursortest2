package com.squareup.cash.cdf.afterpayapplet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AfterpayProduct {
    public static final /* synthetic */ AfterpayProduct[] $VALUES;
    public static final AfterpayProduct AFTERPAY_ONLINE_CHECKOUT;
    public static final AfterpayProduct PRE_PURCHASE_FINANCING;
    public static final AfterpayProduct RETROACTIVE_FINANCING;

    static {
        AfterpayProduct afterpayProduct = new AfterpayProduct("AFTERPAY_ONLINE_CHECKOUT", 0);
        AFTERPAY_ONLINE_CHECKOUT = afterpayProduct;
        AfterpayProduct afterpayProduct2 = new AfterpayProduct("RETROACTIVE_FINANCING", 1);
        RETROACTIVE_FINANCING = afterpayProduct2;
        AfterpayProduct afterpayProduct3 = new AfterpayProduct("PRE_PURCHASE_FINANCING", 2);
        PRE_PURCHASE_FINANCING = afterpayProduct3;
        $VALUES = new AfterpayProduct[]{afterpayProduct, afterpayProduct2, afterpayProduct3, new AfterpayProduct("AFTERPAY_APP", 3)};
    }

    public static AfterpayProduct valueOf(String str) {
        return (AfterpayProduct) Enum.valueOf(AfterpayProduct.class, str);
    }

    public static AfterpayProduct[] values() {
        return (AfterpayProduct[]) $VALUES.clone();
    }
}
