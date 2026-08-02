package com.squareup.cash.calendar.views;

import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class CalendarDateItemDateNumberTextStyles {
    public final TextStyle disabled;
    public final TextStyle standard;

    public CalendarDateItemDateNumberTextStyles(TextStyle textStyle, TextStyle textStyle2) {
        textStyle.getClass();
        textStyle2.getClass();
        this.standard = textStyle;
        this.disabled = textStyle2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDateItemDateNumberTextStyles)) {
            return false;
        }
        CalendarDateItemDateNumberTextStyles calendarDateItemDateNumberTextStyles = (CalendarDateItemDateNumberTextStyles) obj;
        return Intrinsics.areEqual(this.standard, calendarDateItemDateNumberTextStyles.standard) && Intrinsics.areEqual(this.disabled, calendarDateItemDateNumberTextStyles.disabled);
    }

    public final int hashCode() {
        return this.disabled.hashCode() + (this.standard.hashCode() * 31);
    }

    public final String toString() {
        return "CalendarDateItemDateNumberTextStyles(standard=" + this.standard + ", disabled=" + this.disabled + ")";
    }
}
