package com.google.android.libraries.places.api.net;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.internal.zznk;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzk implements zznk {
    public final String zza;
    public final List zze;
    public final zzdi zzf;
    public final List zzg;
    public final com.google.android.gms.tasks.zzb zzk;

    public zzk(String str, List list, zzdi zzdiVar, List list2, com.google.android.gms.tasks.zzb zzbVar) {
        this.zza = str;
        this.zze = list;
        this.zzf = zzdiVar;
        this.zzg = list2;
        this.zzk = zzbVar;
    }

    public static zzj builder() {
        zzj zzjVar = new zzj();
        zzjVar.zze = new ArrayList();
        zzjVar.zzg = new ArrayList();
        zzjVar.zzl = (byte) 1;
        return zzjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        String str = zzkVar.zza;
        String str2 = this.zza;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.zze.equals(zzkVar.zze)) {
            return false;
        }
        zzdi zzdiVar = zzkVar.zzf;
        zzdi zzdiVar2 = this.zzf;
        if (zzdiVar2 == null) {
            if (zzdiVar != null) {
                return false;
            }
        } else if (!zzdiVar2.equals(zzdiVar)) {
            return false;
        }
        if (!this.zzg.equals(zzkVar.zzg)) {
            return false;
        }
        com.google.android.gms.tasks.zzb zzbVar = zzkVar.zzk;
        com.google.android.gms.tasks.zzb zzbVar2 = this.zzk;
        return zzbVar2 == null ? zzbVar == null : zzbVar2 == zzbVar;
    }

    @Override // com.google.android.libraries.places.internal.zznk
    public final com.google.android.gms.tasks.zzb getCancellationToken() {
        return this.zzk;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1525764945) ^ this.zze.hashCode()) * 1000003;
        zzdi zzdiVar = this.zzf;
        int hashCode2 = (((((hashCode ^ (zzdiVar == null ? 0 : zzdiVar.hashCode())) * 1000003) ^ this.zzg.hashCode()) * 583896283) ^ 1237) * 1000003;
        com.google.android.gms.tasks.zzb zzbVar = this.zzk;
        return hashCode2 ^ (zzbVar != null ? zzbVar.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zze.toString();
        String valueOf = String.valueOf(this.zzf);
        String obj2 = this.zzg.toString();
        String valueOf2 = String.valueOf(this.zzk);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = "null".length();
        int length3 = obj.length();
        int length4 = valueOf.length();
        int length5 = obj2.length();
        int length6 = "null".length();
        int length7 = "null".length();
        StringBuilder sb = new StringBuilder(length + 95 + length2 + 12 + length3 + 15 + length4 + 14 + length5 + 14 + length6 + 13 + length7 + 36 + String.valueOf(false).length() + 20 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "FindAutocompletePredictionsRequest{query=", str, ", locationBias=null, locationRestriction=null, origin=null, countries=", obj);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", sessionToken=", valueOf, ", typesFilter=", obj2);
        return Recorder$$ExternalSyntheticOutline2.m(sb, ", inputOffset=null, regionCode=null, pureServiceAreaBusinessesIncluded=false, cancellationToken=", valueOf2, "}");
    }
}
