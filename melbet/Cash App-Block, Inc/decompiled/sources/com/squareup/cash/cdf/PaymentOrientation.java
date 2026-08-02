package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentOrientation {
    public static final /* synthetic */ PaymentOrientation[] $VALUES;
    public static final PaymentOrientation BILL;
    public static final PaymentOrientation CASH;

    static {
        PaymentOrientation paymentOrientation = new PaymentOrientation("BILL", 0);
        BILL = paymentOrientation;
        PaymentOrientation paymentOrientation2 = new PaymentOrientation("CASH", 1);
        CASH = paymentOrientation2;
        $VALUES = new PaymentOrientation[]{paymentOrientation, paymentOrientation2};
    }

    public static PaymentOrientation valueOf(String str) {
        return (PaymentOrientation) Enum.valueOf(PaymentOrientation.class, str);
    }

    public static PaymentOrientation[] values() {
        return (PaymentOrientation[]) $VALUES.clone();
    }
}
