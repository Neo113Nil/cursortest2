package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzwf extends zzvt implements zzvs {
    public final Exception zza;
    public final boolean zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzwf(String str, zzvs zzvsVar, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        super("<missing root>:".concat(str), (zzvn) zzvsVar, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = zzvsVar.zzf();
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final Exception zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzvs
    public final zzwf zzg(String str, zzwl zzwlVar, boolean z, zzwq zzwqVar) {
        boolean z2 = this.zzb;
        if (z && !z2) {
            AtomicReference atomicReference = zzvy.zzd;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new zzwf(str, this, zzwlVar, z3, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, zzwl zzwlVar, zzwq zzwqVar) {
        AtomicReference atomicReference = zzvy.zzd;
        return zzg(str, zzwlVar, true, zzwqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.zza;
    }

    public zzwf(UUID uuid, String str, String str2, zzwl zzwlVar, zzvr zzvrVar, zzwq zzwqVar) {
        super("<missing root>:".concat(str2), uuid, str, zzwl.zza(zzwlVar, zzwk.zzb), zzwqVar);
        this.zza = zzvrVar;
        this.zzb = false;
    }
}
