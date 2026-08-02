package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.review.zzb;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Month implements Comparable, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new zzb(14);
    public final int daysInMonth;
    public final int daysInWeek;
    public final Calendar firstOfMonth;
    public String longName;
    public final int month;
    public final long timeInMillis;
    public final int year;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(calendar);
        this.firstOfMonth = dayCopy;
        this.month = dayCopy.get(2);
        this.year = dayCopy.get(1);
        this.daysInWeek = dayCopy.getMaximum(7);
        this.daysInMonth = dayCopy.getActualMaximum(5);
        this.timeInMillis = dayCopy.getTimeInMillis();
    }

    public static Month create(int i, int i2) {
        Calendar utcCalendarOf = UtcDates.getUtcCalendarOf(null);
        utcCalendarOf.set(1, i);
        utcCalendarOf.set(2, i2);
        return new Month(utcCalendarOf);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.month == month.month && this.year == month.year;
    }

    public final String getLongName() {
        if (this.longName == null) {
            this.longName = UtcDates.getAndroidFormat("yMMMM", Locale.getDefault()).format(new Date(this.firstOfMonth.getTimeInMillis()));
        }
        return this.longName;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    public final int monthsUntil(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return (month.month - this.month) + ((month.year - this.year) * 12);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }

    public static Month create(long j) {
        Calendar utcCalendarOf = UtcDates.getUtcCalendarOf(null);
        utcCalendarOf.setTimeInMillis(j);
        return new Month(utcCalendarOf);
    }
}
