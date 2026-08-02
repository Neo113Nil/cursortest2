package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentRole {
    public static final /* synthetic */ PaymentRole[] $VALUES;
    public static final PaymentRole DO_NOT_USE;
    public static final PaymentRole RECIPIENT;
    public static final PaymentRole SENDER;

    static {
        PaymentRole paymentRole = new PaymentRole("DO_NOT_USE", 0);
        DO_NOT_USE = paymentRole;
        PaymentRole paymentRole2 = new PaymentRole("SENDER", 1);
        SENDER = paymentRole2;
        PaymentRole paymentRole3 = new PaymentRole("RECIPIENT", 2);
        RECIPIENT = paymentRole3;
        $VALUES = new PaymentRole[]{paymentRole, paymentRole2, paymentRole3};
    }

    public static PaymentRole valueOf(String str) {
        return (PaymentRole) Enum.valueOf(PaymentRole.class, str);
    }

    public static PaymentRole[] values() {
        return (PaymentRole[]) $VALUES.clone();
    }
}
