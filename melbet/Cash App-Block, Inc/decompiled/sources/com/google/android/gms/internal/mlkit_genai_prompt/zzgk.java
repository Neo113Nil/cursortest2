package com.google.android.gms.internal.mlkit_genai_prompt;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzgk {
    public final zzfn zza;
    public final zzzx zzb;
    public final zzct zzc;

    public zzgk(zzct zzctVar, zzfn zzfnVar, zzzx zzzxVar) {
        this.zza = zzfnVar;
        this.zzb = zzzxVar;
        this.zzc = zzctVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgk) {
            zzgk zzgkVar = (zzgk) obj;
            if (this.zza.equals(zzgkVar.zza) && this.zzb.equals(zzgkVar.zzb) && this.zzc.equals(zzgkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003);
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LlmServiceOptions{aiCoreClient=", obj, ", downloadCallback=", obj2, ", feature="), this.zzc.toString(), "}");
    }
}
