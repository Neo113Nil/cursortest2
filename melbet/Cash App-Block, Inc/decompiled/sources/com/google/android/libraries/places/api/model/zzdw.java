package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzdw implements Parcelable {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdp(3);
    public final Integer zza;
    public final List zzb;

    public zzdw(List list, Integer num) {
        this.zza = num;
        if (list != null) {
            this.zzb = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null connectorAggregations");
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
        if (!(obj instanceof zzdw)) {
            return false;
        }
        zzdw zzdwVar = (zzdw) obj;
        return this.zza.equals(zzdwVar.zza) && this.zzb.equals(zzdwVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ ((this.zza.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        Integer num = this.zza;
        StringBuilder sb = new StringBuilder(num.toString().length() + 55 + obj.length() + 1);
        sb.append("EVChargeOptions{connectorCount=");
        sb.append(num);
        sb.append(", connectorAggregations=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.intValue());
        parcel.writeList(this.zzb);
    }
}
