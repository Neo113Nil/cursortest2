package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzfq implements Parcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new zzdp(23);
    public final zzeu zza;
    public final zzeu zzb;

    public zzfq(zzeu zzeuVar, zzeu zzeuVar2) {
        this.zza = zzeuVar;
        this.zzb = zzeuVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfq) {
            zzfq zzfqVar = (zzfq) obj;
            zzeu zzeuVar = this.zza;
            if (zzeuVar != null ? zzeuVar.equals(zzfqVar.zza) : zzfqVar.zza == null) {
                zzeu zzeuVar2 = this.zzb;
                if (zzeuVar2 != null ? zzeuVar2.equals(zzfqVar.zzb) : zzfqVar.zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zzeu zzeuVar = this.zza;
        int hashCode = zzeuVar == null ? 0 : zzeuVar.hashCode();
        zzeu zzeuVar2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (zzeuVar2 != null ? zzeuVar2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 33 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "PriceRange{startPrice=", valueOf, ", endPrice=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
    }
}
