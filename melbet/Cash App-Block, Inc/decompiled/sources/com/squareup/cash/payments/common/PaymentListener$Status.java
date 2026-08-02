package com.squareup.cash.payments.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentListener$Status {
    public static final /* synthetic */ PaymentListener$Status[] $VALUES;
    public static final PaymentListener$Status COMPLETED;
    public static final PaymentListener$Status ENDED;
    public static final PaymentListener$Status STARTED;

    /* JADX INFO: Fake field, exist only in values array */
    PaymentListener$Status EF0;

    static {
        PaymentListener$Status paymentListener$Status = new PaymentListener$Status("UNKNOWN", 0);
        PaymentListener$Status paymentListener$Status2 = new PaymentListener$Status("STARTED", 1);
        STARTED = paymentListener$Status2;
        PaymentListener$Status paymentListener$Status3 = new PaymentListener$Status("ENDED", 2);
        ENDED = paymentListener$Status3;
        PaymentListener$Status paymentListener$Status4 = new PaymentListener$Status("COMPLETED", 3);
        COMPLETED = paymentListener$Status4;
        $VALUES = new PaymentListener$Status[]{paymentListener$Status, paymentListener$Status2, paymentListener$Status3, paymentListener$Status4};
    }

    public static PaymentListener$Status valueOf(String str) {
        return (PaymentListener$Status) Enum.valueOf(PaymentListener$Status.class, str);
    }

    public static PaymentListener$Status[] values() {
        return (PaymentListener$Status[]) $VALUES.clone();
    }
}
