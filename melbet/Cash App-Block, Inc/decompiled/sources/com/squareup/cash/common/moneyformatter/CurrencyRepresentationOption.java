package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CurrencyRepresentationOption {
    public static final /* synthetic */ CurrencyRepresentationOption[] $VALUES;
    public static final CurrencyRepresentationOption CENT_NAME;
    public static final CurrencyRepresentationOption CODE;
    public static final CurrencyRepresentationOption NARROW_SYMBOL;
    public static final CurrencyRepresentationOption NARROW_SYMBOL_AND_CODE;
    public static final CurrencyRepresentationOption NONE;

    static {
        CurrencyRepresentationOption currencyRepresentationOption = new CurrencyRepresentationOption("NARROW_SYMBOL", 0);
        NARROW_SYMBOL = currencyRepresentationOption;
        CurrencyRepresentationOption currencyRepresentationOption2 = new CurrencyRepresentationOption("CODE", 1);
        CODE = currencyRepresentationOption2;
        CurrencyRepresentationOption currencyRepresentationOption3 = new CurrencyRepresentationOption("NARROW_SYMBOL_AND_CODE", 2);
        NARROW_SYMBOL_AND_CODE = currencyRepresentationOption3;
        CurrencyRepresentationOption currencyRepresentationOption4 = new CurrencyRepresentationOption("CENT_NAME", 3);
        CENT_NAME = currencyRepresentationOption4;
        CurrencyRepresentationOption currencyRepresentationOption5 = new CurrencyRepresentationOption("NONE", 4);
        NONE = currencyRepresentationOption5;
        $VALUES = new CurrencyRepresentationOption[]{currencyRepresentationOption, currencyRepresentationOption2, currencyRepresentationOption3, currencyRepresentationOption4, currencyRepresentationOption5};
    }

    public static CurrencyRepresentationOption valueOf(String str) {
        return (CurrencyRepresentationOption) Enum.valueOf(CurrencyRepresentationOption.class, str);
    }

    public static CurrencyRepresentationOption[] values() {
        return (CurrencyRepresentationOption[]) $VALUES.clone();
    }
}
