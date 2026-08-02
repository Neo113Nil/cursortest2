package com.squareup.cash.resource;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class DateFormat {
    public final DateTimeFormatter formatter;
    public final String localizedPattern;
    public final String pattern;

    public DateFormat(String str, Locale locale, TimeZone timeZone) {
        str.getClass();
        locale.getClass();
        timeZone.getClass();
        String replace = StringsKt__StringsJVMKt.replace(str, 'c', 'E', true);
        this.pattern = replace;
        DateTimeFormatter withZone = DateTimeFormatter.ofPattern(replace, locale).withZone(timeZone.toZoneId());
        withZone.getClass();
        this.formatter = withZone;
        StringBuilder sb = new StringBuilder();
        int length = replace.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = replace.charAt(i);
            if (z) {
                if (charAt == '\'') {
                    z = false;
                }
            } else if (charAt == '\'') {
                z = true;
            } else if (('a' <= charAt && charAt < '{') || ('A' <= charAt && charAt < '[')) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) "GyMdkHmsSEDFwWahKzZYuXL", charAt, 0, false, 6);
                if (indexOf$default < 0) {
                    throw new IllegalArgumentException(("Illegal pattern  character '" + charAt + "'").toString());
                }
                if (indexOf$default < 23) {
                    charAt = "GyMdkHmsSEDFwWahKzZYuXL".charAt(indexOf$default);
                }
            }
            sb.append(charAt);
        }
        if (z) {
            a$$ExternalSyntheticBUOutline0.m$3("Unfinished quote in pattern");
            throw null;
        }
        this.localizedPattern = sb.toString();
    }

    public final DateTimeFormatter getFormatter() {
        return this.formatter;
    }
}
