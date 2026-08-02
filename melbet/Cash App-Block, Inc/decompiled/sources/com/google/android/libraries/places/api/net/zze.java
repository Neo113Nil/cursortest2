package com.google.android.libraries.places.api.net;

import androidx.emoji2.text.MetadataRepo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.internal.zznk;
import java.util.List;

/* loaded from: classes4.dex */
public final class zze implements zznk {
    public final String zza;
    public final List zzb;
    public final zzdi zzc;
    public final com.google.android.gms.tasks.zzb zzd;

    public zze(String str, List list, zzdi zzdiVar, com.google.android.gms.tasks.zzb zzbVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzdiVar;
        this.zzd = zzbVar;
    }

    public static MetadataRepo builder(String str, List list) {
        MetadataRepo metadataRepo = new MetadataRepo();
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null placeId");
            return null;
        }
        metadataRepo.mMetadataList = str;
        if (list != null) {
            metadataRepo.mEmojiCharArray = list;
            return metadataRepo;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Null placeFields");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (this.zza.equals(zzeVar.zza) && this.zzb.equals(zzeVar.zzb)) {
                zzdi zzdiVar = zzeVar.zzc;
                zzdi zzdiVar2 = this.zzc;
                if (zzdiVar2 != null ? zzdiVar2.equals(zzdiVar) : zzdiVar == null) {
                    com.google.android.gms.tasks.zzb zzbVar = zzeVar.zzd;
                    com.google.android.gms.tasks.zzb zzbVar2 = this.zzd;
                    if (zzbVar2 != null ? zzbVar2 == zzbVar : zzbVar == null) {
                        return true;
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
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        zzdi zzdiVar = this.zzc;
        int hashCode2 = ((hashCode * 1000003) ^ (zzdiVar == null ? 0 : zzdiVar.hashCode())) * 1000003;
        com.google.android.gms.tasks.zzb zzbVar = this.zzd;
        return (hashCode2 ^ (zzbVar != null ? zzbVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.zzb.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = "null".length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 15 + length2 + 20 + length3 + 13 + length4 + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "FetchPlaceRequest{placeId=", str, ", placeFields=", obj);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", sessionToken=", valueOf, ", cancellationToken=", valueOf2);
        sb.append(", regionCode=null}");
        return sb.toString();
    }
}
