package com.squareup.cash.scrubbing;

import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class WholeMoneyScrubber implements InsertingScrubber {
    public final char decimalSeparator;
    public final boolean usesDecimalSeparator;

    public WholeMoneyScrubber(CurrencyConfig currencyConfig) {
        this.decimalSeparator = currencyConfig.decimalSeparator;
        this.usesDecimalSeparator = currencyConfig.usesDecimalSeparator;
    }

    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    public final String scrub(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i = 0;
        while (true) {
            char c = this.decimalSeparator;
            if (i >= length) {
                return (String) CollectionsKt.first(StringsKt.split$default(sb.toString(), new char[]{c}, 6));
            }
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt) || (charAt == c && this.usesDecimalSeparator)) {
                sb.append(charAt);
            }
            i++;
        }
    }
}
