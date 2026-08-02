package com.squareup.cash.payments.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentScheduleFrequency {
    public static final /* synthetic */ PaymentScheduleFrequency[] $VALUES;
    public static final PaymentScheduleFrequency BIWEEKLY;
    public static final PaymentScheduleFrequency MONTHLY;
    public static final PaymentScheduleFrequency WEEKLY;

    static {
        PaymentScheduleFrequency paymentScheduleFrequency = new PaymentScheduleFrequency("WEEKLY", 0);
        WEEKLY = paymentScheduleFrequency;
        PaymentScheduleFrequency paymentScheduleFrequency2 = new PaymentScheduleFrequency("BIWEEKLY", 1);
        BIWEEKLY = paymentScheduleFrequency2;
        PaymentScheduleFrequency paymentScheduleFrequency3 = new PaymentScheduleFrequency("MONTHLY", 2);
        MONTHLY = paymentScheduleFrequency3;
        $VALUES = new PaymentScheduleFrequency[]{paymentScheduleFrequency, paymentScheduleFrequency2, paymentScheduleFrequency3};
    }

    public static PaymentScheduleFrequency valueOf(String str) {
        return (PaymentScheduleFrequency) Enum.valueOf(PaymentScheduleFrequency.class, str);
    }

    public static PaymentScheduleFrequency[] values() {
        return (PaymentScheduleFrequency[]) $VALUES.clone();
    }
}
