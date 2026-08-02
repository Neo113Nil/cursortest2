package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzxk extends zzyq {
    public static final zzxj zza = new zzxj(0);
    public final AtomicLong zzb = new AtomicLong(2147483647L);

    public static zzyq zza(zzxy zzxyVar, zzyd zzydVar) {
        Integer num = (Integer) zzxyVar.zzd(zzxx.zzb);
        if (num == null) {
            return null;
        }
        zzxk zzxkVar = (zzxk) zza.zzb(zzydVar, zzxyVar);
        return zzxkVar.zzb.incrementAndGet() >= ((long) num.intValue()) ? zzxkVar : zzyq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        this.zzb.set(0L);
    }
}
