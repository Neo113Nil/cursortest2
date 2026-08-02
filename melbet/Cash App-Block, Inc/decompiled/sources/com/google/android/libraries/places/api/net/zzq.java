package com.google.android.libraries.places.api.net;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zznk;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzq implements zznk {
    public final Place zza;
    public final String zzb;
    public final long zzc;
    public final com.google.android.gms.tasks.zzb zzd;

    public zzq(Place place, String str, long j, com.google.android.gms.tasks.zzb zzbVar) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzq) {
            zzq zzqVar = (zzq) obj;
            Place place = zzqVar.zza;
            Place place2 = this.zza;
            if (place2 != null ? place2.equals(place) : place == null) {
                String str = zzqVar.zzb;
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.zzc == zzqVar.zzc) {
                        com.google.android.gms.tasks.zzb zzbVar = zzqVar.zzd;
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
        Place place = this.zza;
        int hashCode = place == null ? 0 : place.hashCode();
        String str = this.zzb;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = hashCode ^ 1000003;
        com.google.android.gms.tasks.zzb zzbVar = this.zzd;
        int hashCode3 = zzbVar != null ? zzbVar.hashCode() : 0;
        long j = this.zzc;
        return (((((i * 1000003) ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ hashCode3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzd);
        int length = valueOf.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 16 + String.valueOf(j).length() + 20 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "IsOpenRequest{place=", valueOf, ", placeId=", str);
        Boxes$$ExternalSyntheticOutline1.m1151m(j, ", utcTimeMillis=", ", cancellationToken=", sb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, valueOf2, "}");
    }
}
