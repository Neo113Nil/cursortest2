package com.google.android.libraries.places.api.net;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zznk;

/* loaded from: classes4.dex */
public final class zzh implements zznk {
    public final Integer zza;
    public final Integer zzb;
    public final PhotoMetadata zzc;
    public final com.google.android.gms.tasks.zzb zzd;

    public zzh(Integer num, Integer num2, PhotoMetadata photoMetadata, com.google.android.gms.tasks.zzb zzbVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzh) {
            zzh zzhVar = (zzh) obj;
            Integer num = zzhVar.zza;
            Integer num2 = this.zza;
            if (num2 != null ? num2.equals(num) : num == null) {
                Integer num3 = zzhVar.zzb;
                Integer num4 = this.zzb;
                if (num4 != null ? num4.equals(num3) : num3 == null) {
                    if (this.zzc.equals(zzhVar.zzc)) {
                        com.google.android.gms.tasks.zzb zzbVar = zzhVar.zzd;
                        com.google.android.gms.tasks.zzb zzbVar2 = this.zzd;
                        if (zzbVar2 != null ? zzbVar2 == zzbVar : zzbVar == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zznk
    public final com.google.android.gms.tasks.zzb getCancellationToken() {
        return this.zzd;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int hashCode2 = ((((hashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode();
        com.google.android.gms.tasks.zzb zzbVar = this.zzd;
        return (hashCode2 * 1000003) ^ (zzbVar != null ? zzbVar.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zzc.toString();
        String valueOf = String.valueOf(this.zzd);
        Integer num = this.zza;
        int length = String.valueOf(num).length();
        Integer num2 = this.zzb;
        int length2 = String.valueOf(num2).length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 16 + obj.length() + 20 + valueOf.length() + 1);
        sb.append("FetchResolvedPhotoUriRequest{maxWidth=");
        sb.append(num);
        sb.append(", maxHeight=");
        sb.append(num2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", photoMetadata=", obj, ", cancellationToken=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
