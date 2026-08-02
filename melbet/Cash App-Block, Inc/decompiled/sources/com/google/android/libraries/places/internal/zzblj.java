package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzblj {
    public static final zzblj zza = new zzblj();
    public final ConcurrentHashMap zzc = new ConcurrentHashMap();
    public final zzfv zzb = new zzfv(1);

    public final zzbln zzb(Class cls) {
        zzbln zzbldVar;
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzbln) obj;
        }
        zzfv zzfvVar = this.zzb;
        zzfvVar.getClass();
        zzgc zzgcVar = zzblo.zzb;
        if (!zzbjr.class.isAssignableFrom(cls)) {
            int i = zzbid.$r8$clinit;
        }
        zzbll zzc = ((zzfv) zzfvVar.zza).zzc(cls);
        if ((zzc.zzd & 2) == 2) {
            int i2 = zzbid.$r8$clinit;
            zzgc zzgcVar2 = zzblo.zzb;
            zzgc zzgcVar3 = zzbjf.zza;
            zzbldVar = new zzbld(zzgcVar2, zzc.zza);
        } else {
            int i3 = zzbid.$r8$clinit;
            int i4 = zzblg.$r8$clinit;
            int i5 = zzbkm.$r8$clinit;
            zzgc zzgcVar4 = zzblo.zzb;
            zzgc zzgcVar5 = zzc.zzc() + (-1) != 1 ? zzbjf.zza : null;
            int i6 = zzbkv.$r8$clinit;
            zzbldVar = zzblc.zzj(zzc, zzgcVar4, zzgcVar5);
        }
        zzbln zzblnVar = (zzbln) concurrentHashMap.putIfAbsent(cls, zzbldVar);
        return zzblnVar != null ? zzblnVar : zzbldVar;
    }
}
