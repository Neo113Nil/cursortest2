package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzeu implements Parcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new zzdp(13);
    public final String zza;
    public final Long zzb;
    public final Integer zzc;

    public zzeu(Integer num, Long l, String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null currencyCode");
            throw null;
        }
        this.zza = str;
        this.zzb = l;
        this.zzc = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeu)) {
            return false;
        }
        zzeu zzeuVar = (zzeu) obj;
        return this.zza.equals(zzeuVar.zza) && this.zzb.equals(zzeuVar.zzb) && this.zzc.equals(zzeuVar.zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003);
    }

    public final String toString() {
        Long l = this.zzb;
        int length = l.toString().length();
        Integer num = this.zzc;
        int length2 = num.toString().length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 27 + length + 8 + length2 + 1);
        sb.append("Money{currencyCode=");
        sb.append(str);
        sb.append(", units=");
        sb.append(l);
        sb.append(", nanos=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeLong(this.zzb.longValue());
        parcel.writeInt(this.zzc.intValue());
    }
}
