package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import com.google.common.collect.Range;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzes implements Parcelable, Comparable {
    public static final Parcelable.Creator<zzes> CREATOR = new zzdp(12);
    public final int zza;
    public final int zzb;

    public zzes(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public static zzes newInstance(int i, int i2) {
        try {
            zzes zzesVar = new zzes(i, i2);
            Trace.checkState("Hours must not be out-of-range: 0 to 23, but was: %s.", i, Range.closed(0, 23).contains(Integer.valueOf(i)));
            Trace.checkState("Minutes must not be out-of-range: 0 to 59, but was: %s.", i2, Range.closed(0, 59).contains(Integer.valueOf(i2)));
            return zzesVar;
        } catch (IllegalStateException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzes zzesVar = (zzes) obj;
        Trace.checkNotNull(zzesVar, "compare must not be null.");
        if (this == zzesVar) {
            return 0;
        }
        int i = zzesVar.zza;
        int i2 = this.zza;
        return i2 == i ? this.zzb - zzesVar.zzb : i2 - i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzes) {
            zzes zzesVar = (zzes) obj;
            if (this.zza == zzesVar.zza && this.zzb == zzesVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(i2).length() + 1);
        Fragment$5$$ExternalSyntheticOutline0.m(i, i2, "LocalTime{hours=", ", minutes=", sb);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
    }
}
