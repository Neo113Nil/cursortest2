package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzdc {
    public final zzil zza;
    public final zzbl zzb;
    public final int zzc;

    public zzdc(zzil zzilVar, zzbl zzblVar, int i) {
        if (zzilVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null results");
            throw null;
        }
        this.zza = zzilVar;
        this.zzb = zzblVar;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdc) {
            zzdc zzdcVar = (zzdc) obj;
            if (this.zza.equals(zzdcVar.zza)) {
                zzbl zzblVar = zzdcVar.zzb;
                zzbl zzblVar2 = this.zzb;
                if (zzblVar2 != null ? zzblVar2 == zzblVar : zzblVar == null) {
                    if (this.zzc == zzdcVar.zzc) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzbl zzblVar = this.zzb;
        return this.zzc ^ (((hashCode * 1000003) ^ (zzblVar == null ? 0 : zzblVar.hashCode())) * 1000003);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzc, "}", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CortanaResult{results=", this.zza.toString(), ", inferenceEventTraceResult=", String.valueOf(this.zzb), ", tokenOffset="));
    }
}
