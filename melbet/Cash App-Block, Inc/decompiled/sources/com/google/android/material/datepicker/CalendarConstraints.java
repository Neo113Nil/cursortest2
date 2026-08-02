package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.review.zzb;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new zzb(12);
    public final Month end;
    public final int firstDayOfWeek;
    public final int monthSpan;
    public Month openAt;
    public final Month start;
    public final DateValidator validator;
    public final int yearSpan;

    public final class Builder {
        public int firstDayOfWeek;
        public Long openAt;
        public static final long DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create(1900, 0).timeInMillis);
        public static final long DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create(2100, 11).timeInMillis);
        public long start = DEFAULT_START;
        public long end = DEFAULT_END;
        public DateValidator validator = new DateValidatorPointForward(Long.MIN_VALUE);

        public final CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.validator);
            Month create = Month.create(this.start);
            Month create2 = Month.create(this.end);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.openAt;
            return new CalendarConstraints(create, create2, dateValidator, l == null ? null : Month.create(l.longValue()), this.firstDayOfWeek);
        }
    }

    public interface DateValidator extends Parcelable {
        boolean isValid(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.firstDayOfWeek = i;
        this.validator = dateValidator;
        if (month3 != null && month.firstOfMonth.compareTo(month3.firstOfMonth) > 0) {
            a$$ExternalSyntheticBUOutline0.m$3("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.firstOfMonth.compareTo(month2.firstOfMonth) > 0) {
            a$$ExternalSyntheticBUOutline0.m$3("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > UtcDates.getUtcCalendarOf(null).getMaximum(7)) {
            a$$ExternalSyntheticBUOutline0.m$3("firstDayOfWeek is not valid");
            throw null;
        }
        this.monthSpan = month.monthsUntil(month2) + 1;
        this.yearSpan = (month2.year - month.year) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && Objects.equals(this.openAt, calendarConstraints.openAt) && this.firstDayOfWeek == calendarConstraints.firstDayOfWeek && this.validator.equals(calendarConstraints.validator);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, Integer.valueOf(this.firstDayOfWeek), this.validator});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
        parcel.writeInt(this.firstDayOfWeek);
    }
}
