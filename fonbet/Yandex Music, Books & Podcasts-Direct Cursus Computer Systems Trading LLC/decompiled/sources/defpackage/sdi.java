package defpackage;

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

/* loaded from: classes3.dex */
public final class sdi implements Comparable, Parcelable {
    public static final Parcelable.Creator<sdi> CREATOR = new mmh(16);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public sdi(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = fut.a(calendar);
        this.a = a;
        this.b = a.get(2);
        this.c = a.get(1);
        this.d = a.getMaximum(7);
        this.e = a.getActualMaximum(5);
        this.f = a.getTimeInMillis();
    }

    public static sdi a(int i, int i2) {
        Calendar c = fut.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new sdi(c);
    }

    public static sdi b(long j) {
        Calendar c = fut.c(null);
        c.setTimeInMillis(j);
        return new sdi(c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((sdi) obj).a);
    }

    public final String d() {
        if (this.g == null) {
            long timeInMillis = this.a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = fut.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(sdi sdiVar) {
        if (this.a instanceof GregorianCalendar) {
            return (sdiVar.b - this.b) + ((sdiVar.c - this.c) * 12);
        }
        xq0.x("Only Gregorian calendars are supported.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdi)) {
            return false;
        }
        sdi sdiVar = (sdi) obj;
        return this.b == sdiVar.b && this.c == sdiVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
