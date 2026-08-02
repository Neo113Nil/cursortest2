package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CheckoutDetectionMethod {
    public static final /* synthetic */ CheckoutDetectionMethod[] $VALUES;
    public static final CheckoutDetectionMethod AfterPaySDK;

    /* JADX INFO: Fake field, exist only in values array */
    CheckoutDetectionMethod EF0;

    static {
        CheckoutDetectionMethod checkoutDetectionMethod = new CheckoutDetectionMethod("UrlMatch", 0);
        CheckoutDetectionMethod checkoutDetectionMethod2 = new CheckoutDetectionMethod("AfterPaySDK", 1);
        AfterPaySDK = checkoutDetectionMethod2;
        $VALUES = new CheckoutDetectionMethod[]{checkoutDetectionMethod, checkoutDetectionMethod2};
    }

    public static CheckoutDetectionMethod valueOf(String str) {
        return (CheckoutDetectionMethod) Enum.valueOf(CheckoutDetectionMethod.class, str);
    }

    public static CheckoutDetectionMethod[] values() {
        return (CheckoutDetectionMethod[]) $VALUES.clone();
    }
}
