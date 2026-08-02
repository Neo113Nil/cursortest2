package com.squareup.cash.scrubbing;

import java.util.List;
import java.util.ListIterator;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class FractionalMoneyScrubber implements InsertingScrubber {
    public final char decimalSeparator;
    public final int maxFractionDigits;
    public final boolean usesDecimalSeparator;

    public FractionalMoneyScrubber(CurrencyConfig currencyConfig) {
        this.decimalSeparator = currencyConfig.decimalSeparator;
        this.maxFractionDigits = currencyConfig.maxFractionDigits;
        this.usesDecimalSeparator = currencyConfig.usesDecimalSeparator;
    }

    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    public final String scrub(String str, String str2) {
        char c;
        Object obj;
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i = 0;
        while (true) {
            c = this.decimalSeparator;
            if (i >= length) {
                break;
            }
            char charAt = str2.charAt(i);
            if (Character.isDigit(charAt) || (charAt == c && this.usesDecimalSeparator)) {
                sb.append(charAt);
            }
            i++;
        }
        String sb2 = sb.toString();
        List split$default = StringsKt.split$default(sb2, new char[]{c}, 6);
        if (split$default.size() == 2) {
            ListIterator listIterator = split$default.listIterator(split$default.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (!StringsKt.isBlank((String) obj)) {
                    break;
                }
            }
            String str3 = (String) obj;
            if (str3 != null) {
                return str3;
            }
        } else if (sb2.length() <= this.maxFractionDigits) {
            return sb2;
        }
        return str;
    }
}
