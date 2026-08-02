package com.squareup.cash.card.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentDeviceAvailability {
    public static final /* synthetic */ PaymentDeviceAvailability[] $VALUES;
    public static final PaymentDeviceAvailability AVAILABLE;
    public static final PaymentDeviceAvailability COMING_SOON;
    public static final PaymentDeviceAvailability NEW;
    public static final PaymentDeviceAvailability SOLD_OUT;
    public static final PaymentDeviceAvailability TEASER;

    static {
        PaymentDeviceAvailability paymentDeviceAvailability = new PaymentDeviceAvailability("AVAILABLE", 0);
        AVAILABLE = paymentDeviceAvailability;
        PaymentDeviceAvailability paymentDeviceAvailability2 = new PaymentDeviceAvailability("NEW", 1);
        NEW = paymentDeviceAvailability2;
        PaymentDeviceAvailability paymentDeviceAvailability3 = new PaymentDeviceAvailability("TEASER", 2);
        TEASER = paymentDeviceAvailability3;
        PaymentDeviceAvailability paymentDeviceAvailability4 = new PaymentDeviceAvailability("COMING_SOON", 3);
        COMING_SOON = paymentDeviceAvailability4;
        PaymentDeviceAvailability paymentDeviceAvailability5 = new PaymentDeviceAvailability("SOLD_OUT", 4);
        SOLD_OUT = paymentDeviceAvailability5;
        $VALUES = new PaymentDeviceAvailability[]{paymentDeviceAvailability, paymentDeviceAvailability2, paymentDeviceAvailability3, paymentDeviceAvailability4, paymentDeviceAvailability5};
    }

    public static PaymentDeviceAvailability valueOf(String str) {
        return (PaymentDeviceAvailability) Enum.valueOf(PaymentDeviceAvailability.class, str);
    }

    public static PaymentDeviceAvailability[] values() {
        return (PaymentDeviceAvailability[]) $VALUES.clone();
    }
}
