package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgg implements Parcelable {
    public static final Parcelable.Creator<zzgg> CREATOR = new zzdp(27);
    public final zzeq zza;
    public final boolean zzb;

    public zzgg(zzeq zzeqVar, boolean z) {
        if (zzeqVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null date");
            throw null;
        }
        this.zza = zzeqVar;
        this.zzb = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgg) {
            zzgg zzggVar = (zzgg) obj;
            if (this.zza.equals(zzggVar.zza) && this.zzb == zzggVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzb ? 1237 : 1231) ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String zzeqVar = this.zza.toString();
        int length = zzeqVar.length();
        boolean z = this.zzb;
        StringBuilder sb = new StringBuilder(length + 30 + String.valueOf(z).length() + 1);
        sb.append("SpecialDay{date=");
        sb.append(zzeqVar);
        sb.append(", exceptional=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeInt(this.zzb ? 1 : 0);
    }
}
