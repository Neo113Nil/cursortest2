package com.miteksystems.misnap.core;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class ValidationUtil {
    public static final Regex a = new Regex("^[a-zA-Z0-9<]+$");
    public static final Regex b = new Regex("^[a-zA-Z<]+$");
    public static final Regex c = new Regex("[0-9]+");
    public static final IntRange d = new IntRange(8, 9, 1);
    public static final IntRange e = new IntRange(8, 12, 1);
    public static final IntRange f = new IntRange(30, 30, 1);
    public static final IntRange g = new IntRange(1, 3, 1);
    public static final IntRange h = new IntRange(1, 2, 1);
    public static final IntRange i = new IntRange(14, 14, 1);

    public static final boolean areFieldsEmpty(String... strArr) {
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (str == null || StringsKt.isBlank(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsIllegalMrzCharacters(String str) {
        str.getClass();
        return !a.matches(str);
    }

    public static final boolean isDobAfterDoe(String str, String str2) {
        long parseDate;
        long parseDate2;
        Calendar utcCalendar;
        str.getClass();
        str2.getClass();
        parseDate = DateUtil.parseDate(str, "dd MMM yy", true, (r2 & 8) == 0);
        parseDate2 = DateUtil.parseDate(str2, "dd MMM yy", true, (r2 & 8) == 0);
        utcCalendar = DateUtil.getUtcCalendar();
        utcCalendar.setTimeInMillis(parseDate);
        Calendar utcCalendar2 = DateUtil.getUtcCalendar();
        utcCalendar2.setTimeInMillis(parseDate2);
        return utcCalendar.after(utcCalendar2);
    }

    public static final boolean isDocumentNumberLengthIncorrect(String str, String str2) {
        str.getClass();
        return isFieldLengthIncorrect(str, (Intrinsics.areEqual(str2, "BEL") || Intrinsics.areEqual(str2, "PRT")) ? e : d);
    }

    public static final boolean isFieldLengthIncorrect(String str, IntRange intRange) {
        str.getClass();
        intRange.getClass();
        int i2 = intRange.first;
        int i3 = intRange.last;
        int length = str.length();
        return !(i2 <= length && length <= i3);
    }

    public static final boolean isValidMrz(Mrz mrz) {
        mrz.getClass();
        if (mrz instanceof Mrz1Line) {
            String str = ((Mrz1Line) mrz).b;
            str.getClass();
            return (areFieldsEmpty(str) || isFieldLengthIncorrect(str, f) || containsIllegalMrzCharacters(str)) ? false : true;
        }
        if (mrz instanceof MrzData) {
            MrzData mrzData = (MrzData) mrz;
            return isValidMrzData(mrzData.b, mrzData.c, mrzData.d, mrzData.e, mrzData.f, mrzData.g, mrzData.h);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    public static final boolean isValidMrzData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        long parseDate;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        if (areFieldsEmpty(str4, str2, str3, str5, str, str6) || isDocumentNumberLengthIncorrect(str, str4) || containsIllegalMrzCharacters(str)) {
            return false;
        }
        parseDate = DateUtil.parseDate(str2, "dd MMM yy", true, (r2 & 8) == 0);
        Calendar utcCalendar = DateUtil.getUtcCalendar();
        utcCalendar.setTimeInMillis(parseDate);
        if (utcCalendar.after(DateUtil.getUtcCalendar()) || isDobAfterDoe(str2, str3)) {
            return false;
        }
        IntRange intRange = g;
        if (isFieldLengthIncorrect(str4, intRange) || containsIllegalMrzCharacters(str4) || isFieldLengthIncorrect(str5, h) || containsIllegalMrzCharacters(str5) || isFieldLengthIncorrect(str6, i)) {
            return false;
        }
        if (str7.length() > 0) {
            return !isFieldLengthIncorrect(str7, intRange) && b.matches(str7);
        }
        return true;
    }
}
