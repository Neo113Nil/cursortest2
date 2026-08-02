package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zza implements Cloneable {
    public zzals zza;
    public final zzals zzb;

    public zza(zzals zzalsVar) {
        this.zzb = zzalsVar;
        if (zzalsVar.zzw()) {
            a$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
            throw null;
        }
        this.zza = (zzals) zzalsVar.zzb(4);
    }

    public final Object clone() {
        zza zzaVar = (zza) this.zzb.zzb(5);
        zzaVar.zza = zzc();
        return zzaVar;
    }

    public final zzals zzc() {
        boolean zzw = this.zza.zzw();
        zzals zzalsVar = this.zza;
        if (!zzw) {
            return zzalsVar;
        }
        zzalsVar.getClass();
        zzamy.zza.zzb(zzalsVar.getClass()).zze(zzalsVar);
        zzalsVar.zzs();
        return this.zza;
    }
}
