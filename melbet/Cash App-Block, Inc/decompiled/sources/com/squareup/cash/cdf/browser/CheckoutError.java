package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CheckoutError {
    public static final /* synthetic */ CheckoutError[] $VALUES;
    public static final CheckoutError CartAboveLimit;
    public static final CheckoutError CartBelowMinimum;
    public static final CheckoutError CartNotDetected;
    public static final CheckoutError ConnectionFailed;
    public static final CheckoutError EmptyCart;
    public static final CheckoutError LoanLimitReached;
    public static final CheckoutError RestrictedItem;
    public static final CheckoutError SpendingLimitReached;

    static {
        CheckoutError checkoutError = new CheckoutError("CartNotDetected", 0);
        CartNotDetected = checkoutError;
        CheckoutError checkoutError2 = new CheckoutError("CartAboveLimit", 1);
        CartAboveLimit = checkoutError2;
        CheckoutError checkoutError3 = new CheckoutError("CartBelowMinimum", 2);
        CartBelowMinimum = checkoutError3;
        CheckoutError checkoutError4 = new CheckoutError("ConnectionFailed", 3);
        ConnectionFailed = checkoutError4;
        CheckoutError checkoutError5 = new CheckoutError("EmptyCart", 4);
        EmptyCart = checkoutError5;
        CheckoutError checkoutError6 = new CheckoutError("RestrictedItem", 5);
        RestrictedItem = checkoutError6;
        CheckoutError checkoutError7 = new CheckoutError("LoanLimitReached", 6);
        LoanLimitReached = checkoutError7;
        CheckoutError checkoutError8 = new CheckoutError("SpendingLimitReached", 7);
        SpendingLimitReached = checkoutError8;
        $VALUES = new CheckoutError[]{checkoutError, checkoutError2, checkoutError3, checkoutError4, checkoutError5, checkoutError6, checkoutError7, checkoutError8};
    }

    public static CheckoutError valueOf(String str) {
        return (CheckoutError) Enum.valueOf(CheckoutError.class, str);
    }

    public static CheckoutError[] values() {
        return (CheckoutError[]) $VALUES.clone();
    }
}
