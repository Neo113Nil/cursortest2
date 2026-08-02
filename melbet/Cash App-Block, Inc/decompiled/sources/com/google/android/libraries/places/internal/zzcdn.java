package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zzcdn extends zzbrt {
    public final /* synthetic */ zzcdo zza;
    public final AtomicBoolean zzb;

    public /* synthetic */ zzcdn(zzcdo zzcdoVar) {
        Objects.requireNonNull(zzcdoVar);
        this.zza = zzcdoVar;
        this.zzb = new AtomicBoolean(false);
    }

    @Override // com.google.android.libraries.places.internal.zzbrt
    public final zzbro zza(zzbrp zzbrpVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzcdo zzcdoVar = this.zza;
            zzbuf zzd = zzcdoVar.zzf.zzd();
            zzd.zzb(new zzmu(zzcdoVar, 12));
            zzd.zza();
        }
        return zzbro.zza;
    }
}
