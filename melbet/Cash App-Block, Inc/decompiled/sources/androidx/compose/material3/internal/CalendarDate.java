package androidx.compose.material3.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CalendarDate implements Comparable {
    public final int dayOfMonth;
    public final int month;
    public final long utcTimeMillis;
    public final int year;

    public CalendarDate(int i, int i2, int i3, long j) {
        this.year = i;
        this.month = i2;
        this.dayOfMonth = i3;
        this.utcTimeMillis = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.utcTimeMillis, ((CalendarDate) obj).utcTimeMillis);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.utcTimeMillis) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.dayOfMonth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.month, Integer.hashCode(this.year) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.year);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", utcTimeMillis=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.utcTimeMillis, ')');
    }
}
