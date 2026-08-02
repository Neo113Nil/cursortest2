package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* loaded from: classes4.dex */
public final class zzwg extends zzvt {
    public static final zzwg zza;

    static {
        UUID randomUUID = UUID.randomUUID();
        zza = new zzwg("<skip trace>", randomUUID, zzvn.zzcL(randomUUID), zzwk.zza, zzvy.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzj(String str, zzwl zzwlVar, zzwq zzwqVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzl() {
        return zzwk.zza;
    }
}
