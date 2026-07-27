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

/* loaded from: classes2.dex */
public final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new B8.d(27);

    /* renamed from: n, reason: collision with root package name */
    public final Calendar f35997n;

    /* renamed from: u, reason: collision with root package name */
    public final int f35998u;

    /* renamed from: v, reason: collision with root package name */
    public final int f35999v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36000w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36001x;

    /* renamed from: y, reason: collision with root package name */
    public final long f36002y;

    /* renamed from: z, reason: collision with root package name */
    public String f36003z;

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a9 = v.a(calendar);
        this.f35997n = a9;
        this.f35998u = a9.get(2);
        this.f35999v = a9.get(1);
        this.f36000w = a9.getMaximum(7);
        this.f36001x = a9.getActualMaximum(5);
        this.f36002y = a9.getTimeInMillis();
    }

    public static n a(int i, int i6) {
        Calendar c9 = v.c(null);
        c9.set(1, i);
        c9.set(2, i6);
        return new n(c9);
    }

    public static n b(long j6) {
        Calendar c9 = v.c(null);
        c9.setTimeInMillis(j6);
        return new n(c9);
    }

    public final String c() {
        if (this.f36003z == null) {
            long timeInMillis = this.f35997n.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f36017a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f36003z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f36003z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35997n.compareTo(((n) obj).f35997n);
    }

    public final int d(n nVar) {
        if (!(this.f35997n instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (nVar.f35998u - this.f35998u) + ((nVar.f35999v - this.f35999v) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f35998u == nVar.f35998u && this.f35999v == nVar.f35999v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35998u), Integer.valueOf(this.f35999v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35999v);
        parcel.writeInt(this.f35998u);
    }
}
