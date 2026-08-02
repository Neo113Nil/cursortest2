package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class zzyf {
    public final Object zza;

    public zzyf() {
        this.zza = new ConcurrentHashMap();
    }

    public abstract Object zza();

    public abstract void zza(Object obj, long j, byte b);

    public Object zzb(zzyd zzydVar, zzjx zzjxVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.zza;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object zza = zza();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, zza);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int zza2 = zzjxVar.zza();
        for (int i = 0; i < zza2; i++) {
            if (zzxx.zzf.equals(zzjxVar.zzb(i))) {
                zzjxVar.zzc(i);
            }
        }
        return zza;
    }

    public abstract boolean zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z);

    public abstract float zzd(Object obj, long j);

    public abstract void zze(Object obj, long j, float f);

    public abstract double zzf(Object obj, long j);

    public abstract void zzg(Object obj, long j, double d);

    public zzyf(Unsafe unsafe) {
        this.zza = unsafe;
    }
}
