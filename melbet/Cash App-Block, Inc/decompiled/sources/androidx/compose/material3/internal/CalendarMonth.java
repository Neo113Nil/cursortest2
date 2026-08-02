package androidx.compose.material3.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CalendarMonth {
    public final int daysFromStartOfWeekToFirstOfMonth;
    public final int month;
    public final int numberOfDays;
    public final long startUtcTimeMillis;
    public final int year;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.year = i;
        this.month = i2;
        this.numberOfDays = i3;
        this.daysFromStartOfWeekToFirstOfMonth = i4;
        this.startUtcTimeMillis = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.startUtcTimeMillis) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.daysFromStartOfWeekToFirstOfMonth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.numberOfDays, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.month, Integer.hashCode(this.year) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", numberOfDays=");
        sb.append(this.numberOfDays);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.daysFromStartOfWeekToFirstOfMonth);
        sb.append(", startUtcTimeMillis=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.startUtcTimeMillis, ')');
    }
}
