package com.squareup.cash.calendar.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes5.dex */
public final class CalendarDateItemStyle {
    public final CalendarDateItemTextColors dateNumberTextColors;
    public final CalendarDateItemDateNumberTextStyles dateNumberTextStyles;
    public final CalendarDateItemTextColors headerTextColors;
    public final long selectedBorderColor;
    public final long selectedDotColor;

    public CalendarDateItemStyle(CalendarDateItemTextColors calendarDateItemTextColors, CalendarDateItemDateNumberTextStyles calendarDateItemDateNumberTextStyles, CalendarDateItemTextColors calendarDateItemTextColors2, long j, long j2) {
        this.headerTextColors = calendarDateItemTextColors;
        this.dateNumberTextStyles = calendarDateItemDateNumberTextStyles;
        this.dateNumberTextColors = calendarDateItemTextColors2;
        this.selectedDotColor = j;
        this.selectedBorderColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDateItemStyle)) {
            return false;
        }
        CalendarDateItemStyle calendarDateItemStyle = (CalendarDateItemStyle) obj;
        return this.headerTextColors.equals(calendarDateItemStyle.headerTextColors) && this.dateNumberTextStyles.equals(calendarDateItemStyle.dateNumberTextStyles) && this.dateNumberTextColors.equals(calendarDateItemStyle.dateNumberTextColors) && Color.m676equalsimpl0(this.selectedDotColor, calendarDateItemStyle.selectedDotColor) && Color.m676equalsimpl0(this.selectedBorderColor, calendarDateItemStyle.selectedBorderColor);
    }

    public final int hashCode() {
        int hashCode = (this.dateNumberTextColors.hashCode() + ((this.dateNumberTextStyles.hashCode() + (this.headerTextColors.hashCode() * 31)) * 31)) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.selectedDotColor), 31, this.selectedBorderColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.selectedDotColor);
        String m682toStringimpl2 = Color.m682toStringimpl(this.selectedBorderColor);
        StringBuilder sb = new StringBuilder("CalendarDateItemStyle(headerTextColors=");
        sb.append(this.headerTextColors);
        sb.append(", dateNumberTextStyles=");
        sb.append(this.dateNumberTextStyles);
        sb.append(", dateNumberTextColors=");
        sb.append(this.dateNumberTextColors);
        sb.append(", selectedDotColor=");
        sb.append(m682toStringimpl);
        sb.append(", selectedBorderColor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl2, ", todayBorderColor=null)");
    }
}
