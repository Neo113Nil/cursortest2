package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzb;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzhm extends zzhp {
    public final int zza;
    public final zzcj zzb;

    public zzhm(zzcj zzcjVar) {
        zzcjVar.getClass();
        this.zzb = zzcjVar;
        zzdc zzd = zzcjVar.entrySet().zzd();
        int i = 0;
        while (zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) zzd.next();
            int zzb = ((zzhp) entry.getKey()).zzb();
            i = i < zzb ? zzb : i;
            int zzb2 = ((zzhp) entry.getValue()).zzb();
            if (i < zzb2) {
                i = zzb2;
            }
        }
        int i2 = i + 1;
        this.zza = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int zzd = zzhp.zzd((byte) -96);
        if (zzd != zza) {
            return zzd - zzhpVar.zza();
        }
        zzcj zzcjVar = ((zzhm) zzhpVar).zzb;
        zzcj zzcjVar2 = this.zzb;
        if (zzcjVar2.zze.size() != zzcjVar.zze.size()) {
            return zzcjVar2.zze.size() - zzcjVar.zze.size();
        }
        zzdc zzd2 = zzcjVar2.entrySet().zzd();
        zzdc zzd3 = zzcjVar.entrySet().zzd();
        do {
            if (!zzd2.hasNext() && !zzd3.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) zzd2.next();
            Map.Entry entry2 = (Map.Entry) zzd3.next();
            int compareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhm.class == obj.getClass()) {
            return this.zzb.equals(((zzhm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -96)), this.zzb});
    }

    public final String toString() {
        zzcj zzcjVar = this.zzb;
        if (zzcjVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc zzd = zzcjVar.entrySet().zzd();
        while (zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) zzd.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzb zzbVar = new zzb(6);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            zzh.zza(sb, linkedHashMap.entrySet().iterator(), zzbVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) -96);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zzb() {
        return this.zza;
    }
}
