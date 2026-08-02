package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PaymentType {
    public static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType CARD_ON_FILE;
    public static final PaymentType CASH_APP;
    public static final PaymentType GOOGLE_PAY;
    public static final PaymentType KEYED_CARD;

    /* JADX INFO: Fake field, exist only in values array */
    PaymentType EF0;

    static {
        PaymentType paymentType = new PaymentType("APPLE_PAY", 0);
        PaymentType paymentType2 = new PaymentType("CARD_ON_FILE", 1);
        CARD_ON_FILE = paymentType2;
        PaymentType paymentType3 = new PaymentType("CASH_APP", 2);
        CASH_APP = paymentType3;
        PaymentType paymentType4 = new PaymentType("GOOGLE_PAY", 3);
        GOOGLE_PAY = paymentType4;
        PaymentType paymentType5 = new PaymentType("KEYED_CARD", 4);
        KEYED_CARD = paymentType5;
        $VALUES = new PaymentType[]{paymentType, paymentType2, paymentType3, paymentType4, paymentType5};
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }
}
