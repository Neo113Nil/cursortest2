package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbvb extends zzbrx {
    public final zzbsa zza;
    public final zzbrx zzb;

    public zzbvb(zzbsa zzbsaVar) {
        Trace.checkNotNull(zzbsaVar, "registry");
        this.zza = zzbsaVar;
        zzbrx zzb = zzbsaVar.zzb("pick_first");
        if (zzb == null) {
            zzbtx zzbtxVar = zzbtx.zzh;
            StringBuilder sb = new StringBuilder(192);
            sb.append("Could not find policy 'pick_first'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
            zzbtx zze = zzbtxVar.zze(sb.toString());
            zzb = new zzbyq(new zzbrl(zzbro.zzb(zze)), zze);
        }
        this.zzb = zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbrk
    public final /* synthetic */ zzbrv zza(zzbrm zzbrmVar) {
        return new zzbva(this, zzbrmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrx
    public final String zzd() {
        return "auto_configured_internal";
    }

    @Override // com.google.android.libraries.places.internal.zzbrx
    public final zzbsz zze(Map map) {
        List<zzcfx> unmodifiableList;
        String zzg;
        if (map != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    List zza = zzwr.zza("loadBalancingConfig", map);
                    if (zza == null) {
                        zza = null;
                    } else {
                        zzwr.zzj(zza);
                    }
                    arrayList.addAll(zza);
                }
                if (arrayList.isEmpty() && (zzg = zzwr.zzg("loadBalancingPolicy", map)) != null) {
                    arrayList.add(Collections.singletonMap(zzg.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
                }
                List<Map> unmodifiableList2 = Collections.unmodifiableList(arrayList);
                if (unmodifiableList2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map2 : unmodifiableList2) {
                        if (map2.size() != 1) {
                            int size = map2.size();
                            String valueOf = String.valueOf(map2);
                            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 83 + valueOf.length());
                            sb.append("There are ");
                            sb.append(size);
                            sb.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                            sb.append(valueOf);
                            throw new RuntimeException(sb.toString());
                        }
                        String str = (String) ((Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new zzcfx(str, zzwr.zzd(str, map2)));
                    }
                    unmodifiableList = Collections.unmodifiableList(arrayList2);
                    if (unmodifiableList != null || unmodifiableList.isEmpty()) {
                        return null;
                    }
                    zzbsa zzbsaVar = this.zza;
                    ArrayList arrayList3 = new ArrayList();
                    for (zzcfx zzcfxVar : unmodifiableList) {
                        String str2 = zzcfxVar.zza;
                        zzbrx zzb = zzbsaVar.zzb(str2);
                        if (zzb != null) {
                            if (!arrayList3.isEmpty()) {
                                Logger.getLogger(zzcfz.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                            }
                            zzbsz zze = zzb.zze(zzcfxVar.zzb);
                            return zze.zza == null ? new zzbsz(new zzcfy(zzb, zze.zzb)) : zze;
                        }
                        arrayList3.add(str2);
                    }
                    zzbtx zzbtxVar = zzbtx.zzc;
                    String obj = arrayList3.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 51);
                    sb2.append("None of ");
                    sb2.append(obj);
                    sb2.append(" specified by Service Config are available.");
                    return new zzbsz(zzbtxVar.zze(sb2.toString()));
                }
            } catch (RuntimeException e) {
                return new zzbsz(zzbtx.zzc.zze("can't parse load balancer configuration").zzd(e));
            }
        }
        unmodifiableList = null;
        if (unmodifiableList != null) {
        }
        return null;
    }
}
