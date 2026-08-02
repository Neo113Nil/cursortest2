package com.squareup.cash.common.moneyformatter.locale;

import com.google.mlkit.vision.text.zzd;

/* loaded from: classes6.dex */
public enum LocalizedUnitMagnitudes {
    English("Thousand", "K", "Million", "Billion", "B", "Trillion", "T"),
    Spanish("mil", "mil", "millón", "mil millones", "MM", "billón", "B");

    public static final zzd Companion = new zzd(21);
    public final String billionAbbreviated;
    public final String billionFull;
    public final String millionFull;
    public final String thousandAbbreviated;
    public final String thousandFull;
    public final String trillionAbbreviated;
    public final String trillionFull;

    LocalizedUnitMagnitudes(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.thousandFull = str;
        this.thousandAbbreviated = str2;
        this.millionFull = str3;
        this.billionFull = str4;
        this.billionAbbreviated = str5;
        this.trillionFull = str6;
        this.trillionAbbreviated = str7;
    }
}
