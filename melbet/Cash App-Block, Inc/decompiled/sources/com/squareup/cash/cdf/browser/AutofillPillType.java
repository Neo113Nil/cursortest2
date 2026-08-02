package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class AutofillPillType {
    public static final /* synthetic */ AutofillPillType[] $VALUES;
    public static final AutofillPillType DeliveryAddress;
    public static final AutofillPillType Payment;

    static {
        AutofillPillType autofillPillType = new AutofillPillType("DeliveryAddress", 0);
        DeliveryAddress = autofillPillType;
        AutofillPillType autofillPillType2 = new AutofillPillType("Payment", 1);
        Payment = autofillPillType2;
        $VALUES = new AutofillPillType[]{autofillPillType, autofillPillType2};
    }

    public static AutofillPillType valueOf(String str) {
        return (AutofillPillType) Enum.valueOf(AutofillPillType.class, str);
    }

    public static AutofillPillType[] values() {
        return (AutofillPillType[]) $VALUES.clone();
    }
}
