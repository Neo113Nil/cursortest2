package com.squareup.cash.payments.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PersonalizePaymentManager$PaymentFlow {
    public static final /* synthetic */ PersonalizePaymentManager$PaymentFlow[] $VALUES;
    public static final PersonalizePaymentManager$PaymentFlow QUICK_PAY;
    public static final PersonalizePaymentManager$PaymentFlow RECIPIENT_SELECTOR;

    static {
        PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow = new PersonalizePaymentManager$PaymentFlow("QUICK_PAY", 0);
        QUICK_PAY = personalizePaymentManager$PaymentFlow;
        PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow2 = new PersonalizePaymentManager$PaymentFlow("RECIPIENT_SELECTOR", 1);
        RECIPIENT_SELECTOR = personalizePaymentManager$PaymentFlow2;
        $VALUES = new PersonalizePaymentManager$PaymentFlow[]{personalizePaymentManager$PaymentFlow, personalizePaymentManager$PaymentFlow2};
    }

    public static PersonalizePaymentManager$PaymentFlow valueOf(String str) {
        return (PersonalizePaymentManager$PaymentFlow) Enum.valueOf(PersonalizePaymentManager$PaymentFlow.class, str);
    }

    public static PersonalizePaymentManager$PaymentFlow[] values() {
        return (PersonalizePaymentManager$PaymentFlow[]) $VALUES.clone();
    }
}
