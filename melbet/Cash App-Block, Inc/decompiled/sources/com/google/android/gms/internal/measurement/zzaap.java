package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzaap extends zzaat {
    public static final zzaap zza = new zzaap(zzaav.zza);
    public final AtomicReference zzb;

    public zzaap(zzaat zzaatVar) {
        this.zzb = new AtomicReference(zzaatVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final void zzb(String str, Level level, boolean z) {
        ((zzaat) this.zzb.get()).zzb(str, level, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzabe zzc() {
        return ((zzaat) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzaat
    public final zzjx zzd() {
        return ((zzaat) this.zzb.get()).zzd();
    }
}
