package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzxn extends zzyq {
    public final AtomicLong zzb = new AtomicLong(-1);

    static {
        new zzxj(1);
    }

    public static void zza(zzxy zzxyVar) {
        if (zzxyVar.zzd(zzxx.zzd) == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        AtomicLong atomicLong = this.zzb;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
