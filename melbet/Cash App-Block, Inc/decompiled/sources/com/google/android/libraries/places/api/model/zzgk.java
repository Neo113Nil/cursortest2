package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgk implements Parcelable {
    public static final Parcelable.Creator<zzgk> CREATOR = new zzdp(29);
    public final zzeq zza;
    public final DayOfWeek zzb;
    public final zzes zzc;
    public final boolean zzd;

    public zzgk(zzeq zzeqVar, DayOfWeek dayOfWeek, zzes zzesVar, boolean z) {
        this.zza = zzeqVar;
        if (dayOfWeek == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null day");
            throw null;
        }
        this.zzb = dayOfWeek;
        if (zzesVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null time");
            throw null;
        }
        this.zzc = zzesVar;
        this.zzd = z;
    }

    public static zzcm builder(DayOfWeek dayOfWeek, zzes zzesVar) {
        zzcm zzcmVar = new zzcm();
        if (dayOfWeek == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null day");
            return null;
        }
        zzcmVar.zzb = dayOfWeek;
        zzcmVar.zzc = zzesVar;
        zzcmVar.zzd = false;
        zzcmVar.zze = (byte) 1;
        return zzcmVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgk) {
            zzgk zzgkVar = (zzgk) obj;
            zzeq zzeqVar = this.zza;
            if (zzeqVar != null ? zzeqVar.equals(zzgkVar.zza) : zzgkVar.zza == null) {
                if (this.zzb.equals(zzgkVar.zzb) && this.zzc.equals(zzgkVar.zzc) && this.zzd == zzgkVar.zzd) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zzeq zzeqVar = this.zza;
        return (true != this.zzd ? 1237 : 1231) ^ (((((((zzeqVar == null ? 0 : zzeqVar.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzb.toString();
        String obj2 = this.zzc.toString();
        int length = valueOf.length();
        int length2 = obj.length();
        int length3 = obj2.length();
        boolean z = this.zzd;
        StringBuilder sb = new StringBuilder(length + 22 + length2 + 7 + length3 + 12 + String.valueOf(z).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "TimeOfWeek{date=", valueOf, ", day=", obj);
        sb.append(", time=");
        sb.append(obj2);
        sb.append(", truncated=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeInt(this.zzd ? 1 : 0);
    }
}
