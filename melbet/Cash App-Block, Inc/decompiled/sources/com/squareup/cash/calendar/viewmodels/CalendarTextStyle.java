package com.squareup.cash.calendar.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CalendarTextStyle {
    public static final /* synthetic */ CalendarTextStyle[] $VALUES;
    public static final CalendarTextStyle DISABLED;
    public static final CalendarTextStyle STANDARD;

    static {
        CalendarTextStyle calendarTextStyle = new CalendarTextStyle("STANDARD", 0);
        STANDARD = calendarTextStyle;
        CalendarTextStyle calendarTextStyle2 = new CalendarTextStyle("DISABLED", 1);
        DISABLED = calendarTextStyle2;
        $VALUES = new CalendarTextStyle[]{calendarTextStyle, calendarTextStyle2};
    }

    public static CalendarTextStyle valueOf(String str) {
        return (CalendarTextStyle) Enum.valueOf(CalendarTextStyle.class, str);
    }

    public static CalendarTextStyle[] values() {
        return (CalendarTextStyle[]) $VALUES.clone();
    }
}
