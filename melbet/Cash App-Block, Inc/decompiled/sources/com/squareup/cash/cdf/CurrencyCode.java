package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CurrencyCode {
    public static final /* synthetic */ CurrencyCode[] $VALUES;
    public static final CurrencyCode BTC;
    public static final CurrencyCode CAD;
    public static final CurrencyCode GBP;
    public static final CurrencyCode JPY;
    public static final CurrencyCode USD;

    static {
        CurrencyCode currencyCode = new CurrencyCode("USD", 0);
        USD = currencyCode;
        CurrencyCode currencyCode2 = new CurrencyCode("GBP", 1);
        GBP = currencyCode2;
        CurrencyCode currencyCode3 = new CurrencyCode("JPY", 2);
        JPY = currencyCode3;
        CurrencyCode currencyCode4 = new CurrencyCode("BTC", 3);
        BTC = currencyCode4;
        CurrencyCode currencyCode5 = new CurrencyCode("CAD", 4);
        CAD = currencyCode5;
        $VALUES = new CurrencyCode[]{currencyCode, currencyCode2, currencyCode3, currencyCode4, currencyCode5};
    }

    public static CurrencyCode valueOf(String str) {
        return (CurrencyCode) Enum.valueOf(CurrencyCode.class, str);
    }

    public static CurrencyCode[] values() {
        return (CurrencyCode[]) $VALUES.clone();
    }
}
