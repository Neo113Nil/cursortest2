package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.time.Instant;

/* loaded from: classes4.dex */
public final class zzeg implements Parcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzdp(6);
    public final FuelPrice$FuelType zza;
    public final zzeu zzb;
    public final Instant zzc;

    public zzeg(FuelPrice$FuelType fuelPrice$FuelType, zzeu zzeuVar, Instant instant) {
        if (fuelPrice$FuelType == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null type");
            throw null;
        }
        this.zza = fuelPrice$FuelType;
        if (zzeuVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null price");
            throw null;
        }
        this.zzb = zzeuVar;
        if (instant != null) {
            this.zzc = instant;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null updateTime");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeg) {
            zzeg zzegVar = (zzeg) obj;
            if (this.zza.equals(zzegVar.zza) && this.zzb.equals(zzegVar.zzb) && this.zzc.equals(zzegVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String obj2 = this.zzb.toString();
        int length2 = obj2.length();
        String obj3 = this.zzc.toString();
        StringBuilder sb = new StringBuilder(length + 23 + length2 + 13 + obj3.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "FuelPrice{type=", obj, ", price=", obj2);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", updateTime=", obj3, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeSerializable(this.zzc);
    }
}
