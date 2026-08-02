package com.google.gson.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown DateFormat style: "));
        return null;
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown DateFormat style: "));
        return null;
    }

    public static DateFormat getUsDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + " " + getTimePartOfDateTimePattern(i2), Locale.US);
    }
}
