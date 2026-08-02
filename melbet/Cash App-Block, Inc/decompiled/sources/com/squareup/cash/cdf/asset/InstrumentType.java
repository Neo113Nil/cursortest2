package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InstrumentType {
    public static final /* synthetic */ InstrumentType[] $VALUES;
    public static final InstrumentType APPLE_PAY;
    public static final InstrumentType BANK_ACCOUNT;
    public static final InstrumentType CASH_BALANCE;
    public static final InstrumentType CREDIT_CARD;
    public static final InstrumentType DEBIT_CARD;
    public static final InstrumentType GOOGLE_PAY;

    static {
        InstrumentType instrumentType = new InstrumentType("CASH_BALANCE", 0);
        CASH_BALANCE = instrumentType;
        InstrumentType instrumentType2 = new InstrumentType("BANK_ACCOUNT", 1);
        BANK_ACCOUNT = instrumentType2;
        InstrumentType instrumentType3 = new InstrumentType("DEBIT_CARD", 2);
        DEBIT_CARD = instrumentType3;
        InstrumentType instrumentType4 = new InstrumentType("CREDIT_CARD", 3);
        CREDIT_CARD = instrumentType4;
        InstrumentType instrumentType5 = new InstrumentType("GOOGLE_PAY", 4);
        GOOGLE_PAY = instrumentType5;
        InstrumentType instrumentType6 = new InstrumentType("APPLE_PAY", 5);
        APPLE_PAY = instrumentType6;
        $VALUES = new InstrumentType[]{instrumentType, instrumentType2, instrumentType3, instrumentType4, instrumentType5, instrumentType6};
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }
}
