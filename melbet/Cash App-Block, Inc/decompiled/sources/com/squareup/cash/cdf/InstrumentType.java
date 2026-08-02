package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InstrumentType {
    public static final /* synthetic */ InstrumentType[] $VALUES;
    public static final InstrumentType BANK;
    public static final InstrumentType CASH_BALANCE;
    public static final InstrumentType CREDIT_CARD;
    public static final InstrumentType DEBIT_CARD;
    public static final InstrumentType GOOGLE_PAY;
    public static final InstrumentType LINE_OF_CREDIT;

    static {
        InstrumentType instrumentType = new InstrumentType("DEBIT_CARD", 0);
        DEBIT_CARD = instrumentType;
        InstrumentType instrumentType2 = new InstrumentType("BANK", 1);
        BANK = instrumentType2;
        InstrumentType instrumentType3 = new InstrumentType("CREDIT_CARD", 2);
        CREDIT_CARD = instrumentType3;
        InstrumentType instrumentType4 = new InstrumentType("CASH_BALANCE", 3);
        CASH_BALANCE = instrumentType4;
        InstrumentType instrumentType5 = new InstrumentType("LINE_OF_CREDIT", 4);
        LINE_OF_CREDIT = instrumentType5;
        InstrumentType instrumentType6 = new InstrumentType("APPLE_PAY", 5);
        InstrumentType instrumentType7 = new InstrumentType("GOOGLE_PAY", 6);
        GOOGLE_PAY = instrumentType7;
        $VALUES = new InstrumentType[]{instrumentType, instrumentType2, instrumentType3, instrumentType4, instrumentType5, instrumentType6, instrumentType7};
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }
}
