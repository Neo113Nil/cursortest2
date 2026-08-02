package com.squareup.cash.scrubbing;

import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.protos.common.CurrencyCode;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public final class MoneyScrubber implements InsertingScrubber {
    public final char decimalSeparator;
    public final int maxFractionDigits;
    public final Integer maxWholeDigits;
    public Function0 onInvalidContentListener;
    public final boolean usesDecimalSeparator;

    public MoneyScrubber(CurrencyConfig currencyConfig, Integer num) {
        this.maxWholeDigits = num;
        this.decimalSeparator = currencyConfig.decimalSeparator;
        this.maxFractionDigits = currencyConfig.maxFractionDigits;
        this.usesDecimalSeparator = currencyConfig.usesDecimalSeparator;
        this.onInvalidContentListener = new DateScrubber$$ExternalSyntheticLambda0(29);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r9.length() > (kotlin.text.StringsKt.contains((java.lang.CharSequence) r9, r4, false) ? (r1.intValue() + 1) + r5 : r1.intValue())) goto L45;
     */
    @Override // com.squareup.cash.scrubbing.InsertingScrubber
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String scrub(String str, String str2) {
        char c;
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
        int i2 = 0;
        for (int i3 = 0; i3 < sb2.length(); i3++) {
            if (sb2.charAt(i3) == c) {
                i2++;
            }
        }
        boolean z = true;
        boolean z2 = i2 > 1;
        int i4 = this.maxFractionDigits;
        if (i2 == 1 && ((String) StringsKt.split$default(sb2, new char[]{c}, 6).get(1)).length() > i4) {
            z2 = true;
        }
        if (sb2.length() > str.length() && str.equals("0")) {
            if (!StringsKt__StringsJVMKt.startsWith(sb2, "0" + c, false)) {
                z2 = true;
            }
        }
        Integer num = this.maxWholeDigits;
        if (num != null) {
        }
        z = z2;
        if (!z) {
            return sb2;
        }
        this.onInvalidContentListener.invoke();
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MoneyScrubber(CurrencyCode currencyCode, Integer num) {
        this(CurrencyConfig.Companion.toCurrencyConfig(currencyCode, r0), num);
        currencyCode.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
    }
}
