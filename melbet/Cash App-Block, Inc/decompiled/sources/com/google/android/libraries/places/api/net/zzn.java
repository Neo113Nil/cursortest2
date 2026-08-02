package com.google.android.libraries.places.api.net;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.internal.zznk;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzn implements zznk {
    public final List zza;
    public final com.google.android.gms.tasks.zzb zzb;

    public zzn(List list, com.google.android.gms.tasks.zzb zzbVar) {
        this.zza = list;
        this.zzb = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzn) {
            zzn zznVar = (zzn) obj;
            if (this.zza.equals(zznVar.zza)) {
                com.google.android.gms.tasks.zzb zzbVar = zznVar.zzb;
                com.google.android.gms.tasks.zzb zzbVar2 = this.zzb;
                if (zzbVar2 != null ? zzbVar2 == zzbVar : zzbVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zznk
    public final com.google.android.gms.tasks.zzb getCancellationToken() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.tasks.zzb zzbVar = this.zzb;
        return (zzbVar == null ? 0 : zzbVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 56 + valueOf.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "FindCurrentPlaceRequest{placeFields=", obj, ", cancellationToken=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
