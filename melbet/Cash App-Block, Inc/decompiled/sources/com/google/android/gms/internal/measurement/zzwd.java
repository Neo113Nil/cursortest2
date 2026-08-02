package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzwd extends zzvn implements zzvs {
    public static final zzvr zza = new zzvr();
    public final Exception zzc;

    public zzwd(UUID uuid, String str, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>", uuid, str, zzwqVar);
        this.zzc = zzvrVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzwf zzg(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        if (z) {
            AtomicReference atomicReference = zzvy.zzd;
        }
        return new zzwf(str, this, zzwlVar, z, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwk.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.zzd;
        return zzg(str, zzwlVar, true, zzwqVar);
    }
}
