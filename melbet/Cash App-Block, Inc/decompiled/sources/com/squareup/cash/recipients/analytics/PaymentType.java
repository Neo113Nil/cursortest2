package com.squareup.cash.recipients.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PaymentType {
    public static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType REQUEST;
    public static final PaymentType SEND;

    static {
        PaymentType paymentType = new PaymentType("SEND", 0);
        SEND = paymentType;
        PaymentType paymentType2 = new PaymentType("REQUEST", 1);
        REQUEST = paymentType2;
        $VALUES = new PaymentType[]{paymentType, paymentType2};
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }
}
