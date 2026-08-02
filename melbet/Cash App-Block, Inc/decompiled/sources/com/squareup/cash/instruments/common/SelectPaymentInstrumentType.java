package com.squareup.cash.instruments.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentType {
    public static final /* synthetic */ SelectPaymentInstrumentType[] $VALUES;
    public static final SelectPaymentInstrumentType SELECT_FROM_ALL;
    public static final SelectPaymentInstrumentType SELECT_FROM_INSTRUMENTS;
    public static final SelectPaymentInstrumentType SELECT_FROM_TYPES;

    static {
        SelectPaymentInstrumentType selectPaymentInstrumentType = new SelectPaymentInstrumentType("SELECT_FROM_INSTRUMENTS", 0);
        SELECT_FROM_INSTRUMENTS = selectPaymentInstrumentType;
        SelectPaymentInstrumentType selectPaymentInstrumentType2 = new SelectPaymentInstrumentType("SELECT_FROM_TYPES", 1);
        SELECT_FROM_TYPES = selectPaymentInstrumentType2;
        SelectPaymentInstrumentType selectPaymentInstrumentType3 = new SelectPaymentInstrumentType("SELECT_FROM_ALL", 2);
        SELECT_FROM_ALL = selectPaymentInstrumentType3;
        $VALUES = new SelectPaymentInstrumentType[]{selectPaymentInstrumentType, selectPaymentInstrumentType2, selectPaymentInstrumentType3};
    }

    public static SelectPaymentInstrumentType valueOf(String str) {
        return (SelectPaymentInstrumentType) Enum.valueOf(SelectPaymentInstrumentType.class, str);
    }

    public static SelectPaymentInstrumentType[] values() {
        return (SelectPaymentInstrumentType[]) $VALUES.clone();
    }
}
