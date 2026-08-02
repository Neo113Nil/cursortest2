package com.squareup.cash.payments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.calendar.viewmodels.CalendarTextStyle;
import com.squareup.cash.calendar.viewmodels.DotStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ScheduleCalendarDate {
    public final String contentDescription;
    public final LocalDate date;
    public final CalendarTextStyle dateNumberTextStyle;
    public final String dayAbbreviation;
    public final int dayOfMonth;
    public final DotStyle dotStyle;
    public final CalendarTextStyle headerTextStyle;
    public final boolean isSelectable;
    public final boolean isToday;
    public final String monthAbbreviation;

    public ScheduleCalendarDate(LocalDate localDate, int i, String str, String str2, String str3, CalendarTextStyle calendarTextStyle, CalendarTextStyle calendarTextStyle2, DotStyle dotStyle, boolean z, boolean z2) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.date = localDate;
        this.dayOfMonth = i;
        this.dayAbbreviation = str;
        this.monthAbbreviation = str2;
        this.contentDescription = str3;
        this.headerTextStyle = calendarTextStyle;
        this.dateNumberTextStyle = calendarTextStyle2;
        this.dotStyle = dotStyle;
        this.isSelectable = z;
        this.isToday = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleCalendarDate)) {
            return false;
        }
        ScheduleCalendarDate scheduleCalendarDate = (ScheduleCalendarDate) obj;
        return this.date.equals(scheduleCalendarDate.date) && this.dayOfMonth == scheduleCalendarDate.dayOfMonth && Intrinsics.areEqual(this.dayAbbreviation, scheduleCalendarDate.dayAbbreviation) && Intrinsics.areEqual(this.monthAbbreviation, scheduleCalendarDate.monthAbbreviation) && Intrinsics.areEqual(this.contentDescription, scheduleCalendarDate.contentDescription) && this.headerTextStyle == scheduleCalendarDate.headerTextStyle && this.dateNumberTextStyle == scheduleCalendarDate.dateNumberTextStyle && this.dotStyle == scheduleCalendarDate.dotStyle && this.isSelectable == scheduleCalendarDate.isSelectable && this.isToday == scheduleCalendarDate.isToday;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isToday) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.dotStyle.hashCode() + ((this.dateNumberTextStyle.hashCode() + ((this.headerTextStyle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dayOfMonth, this.date.hashCode() * 31, 31), 31, this.dayAbbreviation), 31, this.monthAbbreviation), 31, this.contentDescription)) * 31)) * 31)) * 31, 31, this.isSelectable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduleCalendarDate(date=");
        sb.append(this.date);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", dayAbbreviation=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.dayAbbreviation, ", monthAbbreviation=", this.monthAbbreviation, ", contentDescription=");
        sb.append(this.contentDescription);
        sb.append(", headerTextStyle=");
        sb.append(this.headerTextStyle);
        sb.append(", dateNumberTextStyle=");
        sb.append(this.dateNumberTextStyle);
        sb.append(", dotStyle=");
        sb.append(this.dotStyle);
        sb.append(", isSelectable=");
        return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.isSelectable, ", isToday=", this.isToday, ")");
    }
}
