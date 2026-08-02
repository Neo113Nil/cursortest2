package com.squareup.cash.common.moneyformatter.currency;

import com.squareup.cash.common.moneyformatter.TrailingZeroesBehavior;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Currency {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Currency[] $VALUES;
    public static final Currency BTC;
    public static final Currency USD;
    public final int centDigits;
    public final String centName;
    public final String centNamePlural;
    public final String centSymbol;
    public final String dollarSymbol;
    public final ISOTextCode isoTextCode;
    public final ISONumericCode numericCode;
    public final String syntheticTextCode;
    public final TrailingZeroesBehavior trailingZeroesBehavior;

    static {
        Currency currency = new Currency("AUD", 0, ISOTextCode.AUD, ISONumericCode.AUD, "$", 2, "c", "cent", "cents", 768);
        ISOTextCode iSOTextCode = ISOTextCode.BTC;
        ISONumericCode iSONumericCode = ISONumericCode.BTC;
        TrailingZeroesBehavior trailingZeroesBehavior = TrailingZeroesBehavior.SHOW_NONE;
        Currency currency2 = new Currency("BTC", 1, iSOTextCode, iSONumericCode, "₿", 8, "₿", "sat", "sats", 512);
        BTC = currency2;
        Currency currency3 = new Currency("CAD", 2, ISOTextCode.CAD, ISONumericCode.CAD, "$", 2, "¢", "cent", "cents", 768);
        Currency currency4 = new Currency("EUR", 3, ISOTextCode.EUR, ISONumericCode.EUR, "€", 2, null, "cent", "cents", 768);
        Currency currency5 = new Currency("GBP", 4, ISOTextCode.GBP, ISONumericCode.GBP, "£", 2, "p", "penny", "pence", 768);
        Currency currency6 = new Currency("JPY", 5, ISOTextCode.JPY, ISONumericCode.JPY, "¥", 0, null, null, null, 992);
        Currency currency7 = new Currency("MXN", 6, ISOTextCode.MXN, ISONumericCode.MXN, "$", 2, "¢", "centavo", "centavos", 768);
        ISOTextCode iSOTextCode2 = ISOTextCode.USD;
        Currency currency8 = new Currency("USD", 7, iSOTextCode2, ISONumericCode.USD, "$", 2, "¢", "cent", "cents", 768);
        USD = currency8;
        Currency[] currencyArr = {currency, currency2, currency3, currency4, currency5, currency6, currency7, currency8, new Currency("XTS", 8, ISOTextCode.XTS, ISONumericCode.XTS, "¤", 0, null, null, null, 992), new Currency("XUS", 9, iSOTextCode2, ISONumericCode.XUS, "$", 6, "¢", "cent", "cents", TrailingZeroesBehavior.SHOW_TWO, "USDC"), new Currency("XXX", 10, ISOTextCode.XXX, ISONumericCode.XXX, "", 0, null, null, null, 992)};
        $VALUES = currencyArr;
        $ENTRIES = new EnumEntriesList(currencyArr);
    }

    public /* synthetic */ Currency(String str, int i, ISOTextCode iSOTextCode, ISONumericCode iSONumericCode, String str2, int i2, String str3, String str4, String str5, int i3) {
        this(str, i, iSOTextCode, iSONumericCode, str2, i2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? TrailingZeroesBehavior.SHOW_ALL : TrailingZeroesBehavior.SHOW_NONE, null);
    }

    public static EnumEntriesList getEntries() {
        return $ENTRIES;
    }

    public static Currency valueOf(String str) {
        return (Currency) Enum.valueOf(Currency.class, str);
    }

    public static Currency[] values() {
        return (Currency[]) $VALUES.clone();
    }

    public final String getDollarSymbol() {
        return this.dollarSymbol;
    }

    public final ISONumericCode getNumericCode() {
        return this.numericCode;
    }

    public Currency(String str, int i, ISOTextCode iSOTextCode, ISONumericCode iSONumericCode, String str2, int i2, String str3, String str4, String str5, TrailingZeroesBehavior trailingZeroesBehavior, String str6) {
        this.isoTextCode = iSOTextCode;
        this.numericCode = iSONumericCode;
        this.dollarSymbol = str2;
        this.centDigits = i2;
        this.centSymbol = str3;
        this.centName = str4;
        this.centNamePlural = str5;
        this.trailingZeroesBehavior = trailingZeroesBehavior;
        this.syntheticTextCode = str6;
    }
}
