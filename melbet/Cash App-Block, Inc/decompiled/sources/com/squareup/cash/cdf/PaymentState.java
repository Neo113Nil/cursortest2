package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentState {
    public static final /* synthetic */ PaymentState[] $VALUES;
    public static final PaymentState BLOCKED_BY_RISK;
    public static final PaymentState COMPLETE;
    public static final PaymentState EXPIRED;
    public static final PaymentState FAILED;
    public static final PaymentState PAYMENT_NOT_KNOWN;
    public static final PaymentState PROCESSING;
    public static final PaymentState RECIPIENT_EMAIL_BOUNCED;
    public static final PaymentState RECIPIENT_REJECTED;
    public static final PaymentState SCHEDULED;
    public static final PaymentState SENDER_CANCELED;
    public static final PaymentState WAITING_ON_EXTERNAL;
    public static final PaymentState WAITING_ON_RECIPIENT;
    public static final PaymentState WAITING_ON_RISK;
    public static final PaymentState WAITING_ON_SENDER;

    static {
        PaymentState paymentState = new PaymentState("PAYMENT_NOT_KNOWN", 0);
        PAYMENT_NOT_KNOWN = paymentState;
        PaymentState paymentState2 = new PaymentState("SCHEDULED", 1);
        SCHEDULED = paymentState2;
        PaymentState paymentState3 = new PaymentState("WAITING_ON_SENDER", 2);
        WAITING_ON_SENDER = paymentState3;
        PaymentState paymentState4 = new PaymentState("WAITING_ON_RECIPIENT", 3);
        WAITING_ON_RECIPIENT = paymentState4;
        PaymentState paymentState5 = new PaymentState("PROCESSING", 4);
        PROCESSING = paymentState5;
        PaymentState paymentState6 = new PaymentState("COMPLETE", 5);
        COMPLETE = paymentState6;
        PaymentState paymentState7 = new PaymentState("WAITING_ON_RISK", 6);
        WAITING_ON_RISK = paymentState7;
        PaymentState paymentState8 = new PaymentState("RECIPIENT_EMAIL_BOUNCED", 7);
        RECIPIENT_EMAIL_BOUNCED = paymentState8;
        PaymentState paymentState9 = new PaymentState("RECIPIENT_REJECTED", 8);
        RECIPIENT_REJECTED = paymentState9;
        PaymentState paymentState10 = new PaymentState("SENDER_CANCELED", 9);
        SENDER_CANCELED = paymentState10;
        PaymentState paymentState11 = new PaymentState("EXPIRED", 10);
        EXPIRED = paymentState11;
        PaymentState paymentState12 = new PaymentState("BLOCKED_BY_RISK", 11);
        BLOCKED_BY_RISK = paymentState12;
        PaymentState paymentState13 = new PaymentState("FAILED", 12);
        FAILED = paymentState13;
        PaymentState paymentState14 = new PaymentState("WAITING_ON_EXTERNAL", 13);
        WAITING_ON_EXTERNAL = paymentState14;
        $VALUES = new PaymentState[]{paymentState, paymentState2, paymentState3, paymentState4, paymentState5, paymentState6, paymentState7, paymentState8, paymentState9, paymentState10, paymentState11, paymentState12, paymentState13, paymentState14};
    }

    public static PaymentState valueOf(String str) {
        return (PaymentState) Enum.valueOf(PaymentState.class, str);
    }

    public static PaymentState[] values() {
        return (PaymentState[]) $VALUES.clone();
    }
}
