package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzyp {
    public static final zzxj zza = new zzxj(2);
    public final AtomicBoolean zzb = new AtomicBoolean();
    public final AtomicInteger zzc = new AtomicInteger();

    public static int zza(zzyq zzyqVar, zzyd zzydVar, zzjx zzjxVar) {
        zzyp zzypVar = (zzyp) zza.zzb(zzydVar, zzjxVar);
        AtomicInteger atomicInteger = zzypVar.zzc;
        AtomicBoolean atomicBoolean = zzypVar.zzb;
        int incrementAndGet = atomicInteger.incrementAndGet();
        if (zzyqVar == zzyq.zzc || !atomicBoolean.compareAndSet(false, true)) {
            return -1;
        }
        try {
            zzyqVar.zzb();
            atomicBoolean.set(false);
            atomicInteger.addAndGet(-incrementAndGet);
            return incrementAndGet - 1;
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }
}
