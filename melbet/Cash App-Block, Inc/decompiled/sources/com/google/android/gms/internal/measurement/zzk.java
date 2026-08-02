package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.measurement.internal.zzht;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class zzk extends zzai {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object zza;

    public zzk(MemoryCacheService memoryCacheService) {
        super("internal.logger");
        this.zza = memoryCacheService;
        this.zze.put("log", new zzs(this, false, true));
        this.zze.put("silent", new zzn("silent", 1));
        ((zzai) this.zze.get("silent")).zzm("log", new zzs(this, true, true));
        this.zze.put("unmonitored", new zzn("unmonitored", 2));
        ((zzai) this.zze.get("unmonitored")).zzm("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(UnleashContext unleashContext, List list) {
        TreeMap treeMap;
        int i = this.$r8$classId;
        String str = this.zzd;
        zzat zzatVar = zzao.zzf;
        Object obj = this.zza;
        String str2 = null;
        switch (i) {
            case 0:
                zzh.zza(str, list, 3);
                String zzc = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0)).zzc();
                zzao zzaoVar = (zzao) list.get(1);
                zzz zzzVar = (zzz) unleashContext.sessionId;
                long zzi = (long) zzh.zzi(zzzVar.zzb(unleashContext, zzaoVar).zzd().doubleValue());
                zzao zzb = zzzVar.zzb(unleashContext, (zzao) list.get(2));
                HashMap zzk = zzb instanceof zzal ? zzh.zzk((zzal) zzb) : new HashMap();
                com.google.android.gms.maps.zzah zzahVar = (com.google.android.gms.maps.zzah) obj;
                zzahVar.getClass();
                HashMap hashMap = new HashMap();
                for (String str3 : zzk.keySet()) {
                    HashMap hashMap2 = ((zzaa) zzahVar.f68zza).zzd;
                    hashMap.put(str3, zzaa.zzh(str3, hashMap2.containsKey(str3) ? hashMap2.get(str3) : null, zzk.get(str3)));
                }
                ((ArrayList) zzahVar.zzc).add(new zzaa(zzc, zzi, hashMap));
                return zzatVar;
            case 1:
                zzh.zza("getValue", list, 2);
                zzao zzb2 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0));
                zzao zzb3 = ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(1));
                String zzc2 = zzb2.zzc();
                zbc zbcVar = (zbc) obj;
                Map map = (Map) ((zzht) zbcVar.zba).zzh.get((String) zbcVar.zbb);
                if (map != null && map.containsKey(zzc2)) {
                    str2 = (String) map.get(zzc2);
                }
                return str2 != null ? new zzas(str2) : zzb3;
            case 2:
                return zzatVar;
            case 3:
                try {
                    return zzh.zza(((com.google.android.gms.measurement.internal.zzhp) obj).call());
                } catch (Exception unused) {
                    return zzatVar;
                }
            default:
                zzh.zza(str, list, 3);
                ((zzz) unleashContext.sessionId).zzb(unleashContext, (zzao) list.get(0)).zzc();
                zzao zzaoVar2 = (zzao) list.get(1);
                zzz zzzVar2 = (zzz) unleashContext.sessionId;
                zzao zzb4 = zzzVar2.zzb(unleashContext, zzaoVar2);
                if (zzb4 instanceof zzan) {
                    zzao zzb5 = zzzVar2.zzb(unleashContext, (zzao) list.get(2));
                    if (zzb5 instanceof zzal) {
                        zzal zzalVar = (zzal) zzb5;
                        HashMap hashMap3 = zzalVar.zza;
                        if (hashMap3.containsKey("type")) {
                            String zzc3 = zzalVar.zzk("type").zzc();
                            int zzg = hashMap3.containsKey("priority") ? zzh.zzg(zzalVar.zzk("priority").zzd().doubleValue()) : IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                            zzz zzzVar3 = (zzz) obj;
                            zzan zzanVar = (zzan) zzb4;
                            zzzVar3.getClass();
                            if ("create".equals(zzc3)) {
                                treeMap = (TreeMap) zzzVar3.zzb;
                            } else if ("edit".equals(zzc3)) {
                                treeMap = (TreeMap) zzzVar3.zza;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("Unknown callback type: ".concat(String.valueOf(zzc3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(zzg))) {
                                zzg = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(zzg), zzanVar);
                            return zzatVar;
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Undefined rule type");
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("Invalid callback params");
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("Invalid callback type");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzn zznVar, zbc zbcVar) {
        super("getValue");
        this.zza = zbcVar;
    }

    public zzk(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    public zzk(com.google.android.gms.maps.zzah zzahVar) {
        super("internal.eventLogger");
        this.zza = zzahVar;
    }

    public zzk(com.google.android.gms.measurement.internal.zzhp zzhpVar) {
        super("internal.appMetadata");
        this.zza = zzhpVar;
    }
}
