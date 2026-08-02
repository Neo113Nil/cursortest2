package com.squareup.cash.payments.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RecurringDisabledInstrument {
    public static final /* synthetic */ RecurringDisabledInstrument[] $VALUES;
    public static final RecurringDisabledInstrument CREDIT_CARD;
    public static final RecurringDisabledInstrument GOOGLE_PAY;

    static {
        RecurringDisabledInstrument recurringDisabledInstrument = new RecurringDisabledInstrument("CREDIT_CARD", 0);
        CREDIT_CARD = recurringDisabledInstrument;
        RecurringDisabledInstrument recurringDisabledInstrument2 = new RecurringDisabledInstrument("GOOGLE_PAY", 1);
        GOOGLE_PAY = recurringDisabledInstrument2;
        $VALUES = new RecurringDisabledInstrument[]{recurringDisabledInstrument, recurringDisabledInstrument2};
    }

    public static RecurringDisabledInstrument valueOf(String str) {
        return (RecurringDisabledInstrument) Enum.valueOf(RecurringDisabledInstrument.class, str);
    }

    public static RecurringDisabledInstrument[] values() {
        return (RecurringDisabledInstrument[]) $VALUES.clone();
    }
}
