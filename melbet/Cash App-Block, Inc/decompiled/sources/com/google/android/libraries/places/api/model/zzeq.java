package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.tracing.Trace;
import com.google.common.collect.Range;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzeq implements Parcelable, Comparable {
    public static final Parcelable.Creator<zzeq> CREATOR = new zzdp(11);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public zzeq(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzeq newInstance(int i, int i2, int i3) {
        zzeq zzeqVar = new zzeq(i, i2, i3);
        Range closed = Range.closed(1, 12);
        Integer valueOf = Integer.valueOf(i2);
        Trace.checkArgument("Month must not be out of range of 1 to 12, but was: %s.", i2, closed.contains(valueOf));
        Range closed2 = Range.closed(1, 31);
        Integer valueOf2 = Integer.valueOf(i3);
        Trace.checkArgument("Day must not be out of range of 1 to 31, but was: %s.", i3, closed2.contains(valueOf2));
        if (Arrays.asList(4, 6, 9, 11).contains(valueOf)) {
            Trace.checkArgument(i3, i2, "%s is not a valid day for month %s.", Range.closed(1, 30).contains(valueOf2));
        }
        if (i2 == 2) {
            Trace.checkArgument(Range.closed(1, Integer.valueOf(i % 4 == 0 ? 29 : 28)).contains(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, Integer.valueOf(i));
        }
        return zzeqVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzeq zzeqVar) {
        Trace.checkNotNull(zzeqVar, "dateToCompare must not be null.");
        if (this == zzeqVar) {
            return 0;
        }
        int i = zzeqVar.zza;
        int i2 = this.zza;
        if (i2 != i) {
            return i2 - i;
        }
        int i3 = zzeqVar.zzb;
        int i4 = this.zzb;
        return i4 != i3 ? i4 - i3 : this.zzc - zzeqVar.zzc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeq) {
            zzeq zzeqVar = (zzeq) obj;
            if (this.zza == zzeqVar.zza && this.zzb == zzeqVar.zzb && this.zzc == zzeqVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        String format2 = String.format(Locale.getDefault(), "%02d", Integer.valueOf(this.zzb));
        String format3 = String.format(Locale.getDefault(), "%02d", Integer.valueOf(this.zzc));
        Locale.getDefault();
        return this.zza + "-" + format2 + "-" + format3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
