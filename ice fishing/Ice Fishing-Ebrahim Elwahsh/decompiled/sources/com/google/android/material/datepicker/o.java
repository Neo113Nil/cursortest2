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
public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new F0.a(25);

    /* renamed from: n, reason: collision with root package name */
    public final Calendar f36162n;

    /* renamed from: u, reason: collision with root package name */
    public final int f36163u;

    /* renamed from: v, reason: collision with root package name */
    public final int f36164v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36165w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36166x;

    /* renamed from: y, reason: collision with root package name */
    public final long f36167y;

    /* renamed from: z, reason: collision with root package name */
    public String f36168z;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a9 = w.a(calendar);
        this.f36162n = a9;
        this.f36163u = a9.get(2);
        this.f36164v = a9.get(1);
        this.f36165w = a9.getMaximum(7);
        this.f36166x = a9.getActualMaximum(5);
        this.f36167y = a9.getTimeInMillis();
    }

    public static o a(int i, int i4) {
        Calendar c4 = w.c(null);
        c4.set(1, i);
        c4.set(2, i4);
        return new o(c4);
    }

    public static o b(long j9) {
        Calendar c4 = w.c(null);
        c4.setTimeInMillis(j9);
        return new o(c4);
    }

    public final String c() {
        if (this.f36168z == null) {
            long timeInMillis = this.f36162n.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = w.f36182a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f36168z = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f36168z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f36162n.compareTo(((o) obj).f36162n);
    }

    public final int d(o oVar) {
        if (!(this.f36162n instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (oVar.f36163u - this.f36163u) + ((oVar.f36164v - this.f36164v) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f36163u == oVar.f36163u && this.f36164v == oVar.f36164v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36163u), Integer.valueOf(this.f36164v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36164v);
        parcel.writeInt(this.f36163u);
    }
}
