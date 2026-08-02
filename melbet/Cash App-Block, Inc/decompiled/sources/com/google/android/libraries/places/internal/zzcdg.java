package com.google.android.libraries.places.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class zzcdg extends zzbrt {
    public final /* synthetic */ zzcdj zza;
    public final zzcdj zzb;
    public final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcdg(zzcdj zzcdjVar, zzcdj zzcdjVar2) {
        this.zza = zzcdjVar;
        this.zzb = zzcdjVar2;
    }

    @Override // com.google.android.libraries.places.internal.zzbrt
    public final zzbro zza(zzbrp zzbrpVar) {
        if (this.zzc.compareAndSet(false, true)) {
            zzbuf zzd = this.zza.zzj.zzd();
            zzcdj zzcdjVar = this.zzb;
            Objects.requireNonNull(zzcdjVar);
            zzd.zzb(new zzccx(zzcdjVar, 2));
            zzd.zza();
        }
        return zzbro.zza;
    }
}
