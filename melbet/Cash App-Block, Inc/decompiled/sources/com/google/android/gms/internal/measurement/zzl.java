package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzl extends zzal {
    public final com.google.android.gms.maps.zzah zzb;

    public zzl(com.google.android.gms.maps.zzah zzahVar) {
        this.zzb = zzahVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList) {
        int hashCode = str.hashCode();
        com.google.android.gms.maps.zzah zzahVar = this.zzb;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    zzh.zza("getEventName", arrayList, 0);
                    return new zzas(((zzaa) zzahVar.zzb).zzb);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    zzh.zza("getTimestamp", arrayList, 0);
                    return new zzah(Double.valueOf(((zzaa) zzahVar.zzb).zzc));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    zzh.zza("getParamValue", arrayList, 1);
                    String zzc = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc();
                    HashMap hashMap = ((zzaa) zzahVar.zzb).zzd;
                    return zzh.zza(hashMap.containsKey(zzc) ? hashMap.get(zzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    zzh.zza("getParams", arrayList, 0);
                    HashMap hashMap2 = ((zzaa) zzahVar.zzb).zzd;
                    zzal zzalVar = new zzal();
                    for (String str2 : hashMap2.keySet()) {
                        zzalVar.zzm(str2, zzh.zza(hashMap2.get(str2)));
                    }
                    return zzalVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    zzh.zza("setParamValue", arrayList, 2);
                    String zzc2 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0)).zzc();
                    zzao zzb = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(1));
                    zzaa zzaaVar = (zzaa) zzahVar.zzb;
                    Object zzj = zzh.zzj(zzb);
                    HashMap hashMap3 = zzaaVar.zzd;
                    if (zzj == null) {
                        hashMap3.remove(zzc2);
                        return zzb;
                    }
                    hashMap3.put(zzc2, zzaa.zzh(zzc2, hashMap3.get(zzc2), zzj));
                    return zzb;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    zzh.zza("setEventName", arrayList, 1);
                    zzao zzb2 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) arrayList.get(0));
                    if (zzao.zzf.equals(zzb2) || zzao.zzg.equals(zzb2)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Illegal event name");
                        return null;
                    }
                    ((zzaa) zzahVar.zzb).zzb = zzb2.zzc();
                    return new zzas(zzb2.zzc());
                }
                break;
        }
        return super.zzcG(str, unleashContext, arrayList);
    }
}
