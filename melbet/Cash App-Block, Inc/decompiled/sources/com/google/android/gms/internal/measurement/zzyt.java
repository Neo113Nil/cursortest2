package com.google.android.gms.internal.measurement;

import androidx.camera.core.impl.utils.Exif;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzyt extends zzyq {
    public static final zzxj zzb = new zzxj(3);
    public static final Exif.AnonymousClass1 zze = new Exif.AnonymousClass1(8);
    public final AtomicInteger zza = new AtomicInteger();

    public static zzyq zza(zzxy zzxyVar, zzyd zzydVar) {
        Integer num = (Integer) zzxyVar.zzd(zzxx.zzc);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        zzyt zzytVar = (zzyt) zzb.zzb(zzydVar, zzxyVar);
        int nextInt = ((Random) zze.get()).nextInt(num.intValue());
        AtomicInteger atomicInteger = zzytVar.zza;
        return (nextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) > 0 ? zzytVar : zzyq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
