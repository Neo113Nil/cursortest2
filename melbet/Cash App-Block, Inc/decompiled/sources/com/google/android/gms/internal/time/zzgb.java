package com.google.android.gms.internal.time;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzgb extends zzgg {
    public static final zzgb zza = new zzgb(zzgj.zza);
    public final AtomicReference zzb;

    public zzgb(zzgg zzggVar) {
        this.zzb = new AtomicReference(zzggVar);
    }

    @Override // com.google.android.gms.internal.time.zzgg
    public final zzcw zza() {
        return ((zzgg) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.time.zzgg
    public final zzgs zzc() {
        return ((zzgg) this.zzb.get()).zzc();
    }
}
