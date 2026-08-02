package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzafl {
    public static final zzafl zza = new zzafl();
    public final ConcurrentHashMap zzc = new ConcurrentHashMap();
    public final zzj zzb = new zzj(2);

    public static zzafl zza() {
        return zza;
    }

    public final zzafp zzb(Class cls) {
        zzafp zzafgVar;
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzafp) obj;
        }
        zzj zzjVar = this.zzb;
        zzjVar.getClass();
        zztw zztwVar = zzafq.zzb;
        if (!zzadu.class.isAssignableFrom(cls)) {
            int i = zzacf.$r8$clinit;
        }
        zzafn zzc = ((zzj) zzjVar.f64zza).zzc(cls);
        if ((zzc.zzd & 2) == 2) {
            int i2 = zzacf.$r8$clinit;
            zztw zztwVar2 = zzafq.zzb;
            zztw zztwVar3 = zzadi.zza;
            zzafgVar = new zzafg(zztwVar2, zzc.zza);
        } else {
            int i3 = zzacf.$r8$clinit;
            int i4 = zzafi.$r8$clinit;
            int i5 = zzaep.$r8$clinit;
            zztw zztwVar4 = zzafq.zzb;
            zztw zztwVar5 = zzc.zzc() + (-1) != 1 ? zzadi.zza : null;
            int i6 = zzaey.$r8$clinit;
            zzafgVar = zzaff.zzm(zzc, zztwVar4, zztwVar5);
        }
        zzafp zzafpVar = (zzafp) concurrentHashMap.putIfAbsent(cls, zzafgVar);
        return zzafpVar != null ? zzafpVar : zzafgVar;
    }
}
