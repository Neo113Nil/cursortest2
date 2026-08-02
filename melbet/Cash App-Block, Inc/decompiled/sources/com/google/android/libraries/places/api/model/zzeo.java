package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.time.Duration;

/* loaded from: classes4.dex */
public final class zzeo implements Parcelable {
    public static final Parcelable.Creator<zzeo> CREATOR = new zzdp(10);
    public final Duration zza;
    public final int zzb;

    public zzeo(Duration duration, int i) {
        if (duration == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null duration");
            throw null;
        }
        this.zza = duration;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeo) {
            zzeo zzeoVar = (zzeo) obj;
            if (this.zza.equals(zzeoVar.zza) && this.zzb == zzeoVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(i).length() + 1);
        sb.append("Leg{duration=");
        sb.append(obj);
        sb.append(", distanceMeters=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.zza);
        parcel.writeInt(this.zzb);
    }
}
