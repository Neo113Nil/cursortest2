package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k implements Comparable, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new F0.b(10);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2529b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2530c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2531d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2532f;

    /* renamed from: g, reason: collision with root package name */
    public String f2533g;

    public k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = r.a(calendar);
        this.f2528a = a2;
        this.f2529b = a2.get(2);
        this.f2530c = a2.get(1);
        this.f2531d = a2.getMaximum(7);
        this.e = a2.getActualMaximum(5);
        this.f2532f = a2.getTimeInMillis();
    }

    public static k a(int i, int i2) {
        Calendar c2 = r.c(null);
        c2.set(1, i);
        c2.set(2, i2);
        return new k(c2);
    }

    public static k b(long j) {
        Calendar c2 = r.c(null);
        c2.setTimeInMillis(j);
        return new k(c2);
    }

    public final String c() {
        if (this.f2533g == null) {
            long timeInMillis = this.f2528a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = r.f2544a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2533g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2533g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2528a.compareTo(((k) obj).f2528a);
    }

    public final int d(k kVar) {
        if (!(this.f2528a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (kVar.f2529b - this.f2529b) + ((kVar.f2530c - this.f2530c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2529b == kVar.f2529b && this.f2530c == kVar.f2530c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2529b), Integer.valueOf(this.f2530c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2530c);
        parcel.writeInt(this.f2529b);
    }
}
