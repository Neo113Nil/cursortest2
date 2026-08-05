package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    public final String zza;
    public final String zzb;
    public final zzkq zzc;
    public final String zzd;
    public final String zze;
    public final Float zzf;
    public final zzr zzg;

    public zzn(String str, String str2, zzkq zzkqVar, String str3, String str4, Float f, zzr zzrVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzkqVar;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = f;
        this.zzg = zzrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzn zznVar = (zzn) obj;
            if (Objects.equals(this.zza, zznVar.zza) && Objects.equals(this.zzb, zznVar.zzb) && Objects.equals(this.zzc, zznVar.zzc) && Objects.equals(this.zzd, zznVar.zzd) && Objects.equals(this.zze, zznVar.zze) && Objects.equals(this.zzf, zznVar.zzf) && Objects.equals(this.zzg, zznVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        zzkq zzkqVar = this.zzc;
        String valueOf = String.valueOf(this.zzg);
        String valueOf2 = String.valueOf(zzkqVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzd;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zze;
        int length3 = String.valueOf(str3).length();
        Float f = this.zzf;
        int length4 = String.valueOf(f).length();
        int length5 = String.valueOf(valueOf).length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 19 + length3 + 14 + length4 + 14 + length5 + 15 + String.valueOf(str4).length() + 8 + String.valueOf(valueOf2).length() + 1);
        sb.append("AppParcelable{title='");
        sb.append(str);
        sb.append("', developerName='");
        sb.append(str2);
        sb.append("', formattedPrice='");
        sb.append(str3);
        sb.append("', starRating=");
        sb.append(f);
        sb.append(", wearDetails=");
        sb.append(valueOf);
        sb.append(", deepLinkUri='");
        sb.append(str4);
        sb.append("', icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeFloatObject(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
