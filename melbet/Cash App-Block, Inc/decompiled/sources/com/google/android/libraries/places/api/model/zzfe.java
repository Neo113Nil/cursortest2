package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzfe implements Parcelable {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzdp(18);
    public final zzgk zza;
    public final zzgk zzb;

    public zzfe(zzgk zzgkVar, zzgk zzgkVar2) {
        this.zza = zzgkVar;
        this.zzb = zzgkVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfe) {
            zzfe zzfeVar = (zzfe) obj;
            zzgk zzgkVar = this.zza;
            if (zzgkVar != null ? zzgkVar.equals(zzfeVar.zza) : zzfeVar.zza == null) {
                zzgk zzgkVar2 = this.zzb;
                if (zzgkVar2 != null ? zzgkVar2.equals(zzfeVar.zzb) : zzfeVar.zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zzgk zzgkVar = this.zza;
        int hashCode = zzgkVar == null ? 0 : zzgkVar.hashCode();
        zzgk zzgkVar2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (zzgkVar2 != null ? zzgkVar2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 20 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Period{open=", valueOf, ", close=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
    }
}
