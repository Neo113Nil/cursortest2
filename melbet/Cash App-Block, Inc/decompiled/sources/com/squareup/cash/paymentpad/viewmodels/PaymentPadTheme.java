package com.squareup.cash.paymentpad.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaymentPadTheme {
    public static final /* synthetic */ PaymentPadTheme[] $VALUES;
    public static final PaymentPadTheme BLACK;
    public static final PaymentPadTheme BRAT;
    public static final PaymentPadTheme GLITTER;
    public static final PaymentPadTheme GREEN;
    public static final PaymentPadTheme PINK;
    public static final PaymentPadTheme TORTOISE;

    static {
        PaymentPadTheme paymentPadTheme = new PaymentPadTheme("GREEN", 0);
        GREEN = paymentPadTheme;
        PaymentPadTheme paymentPadTheme2 = new PaymentPadTheme("BLACK", 1);
        BLACK = paymentPadTheme2;
        PaymentPadTheme paymentPadTheme3 = new PaymentPadTheme("PINK", 2);
        PINK = paymentPadTheme3;
        PaymentPadTheme paymentPadTheme4 = new PaymentPadTheme("GLITTER", 3);
        GLITTER = paymentPadTheme4;
        PaymentPadTheme paymentPadTheme5 = new PaymentPadTheme("TORTOISE", 4);
        TORTOISE = paymentPadTheme5;
        PaymentPadTheme paymentPadTheme6 = new PaymentPadTheme("BRAT", 5);
        BRAT = paymentPadTheme6;
        $VALUES = new PaymentPadTheme[]{paymentPadTheme, paymentPadTheme2, paymentPadTheme3, paymentPadTheme4, paymentPadTheme5, paymentPadTheme6};
    }

    public static PaymentPadTheme valueOf(String str) {
        return (PaymentPadTheme) Enum.valueOf(PaymentPadTheme.class, str);
    }

    public static PaymentPadTheme[] values() {
        return (PaymentPadTheme[]) $VALUES.clone();
    }
}
