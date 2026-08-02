package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgh {
    public final zzil zza;
    public final zzbl zzb;

    public zzgh(zzil zzilVar, zzbl zzblVar) {
        if (zzilVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null results");
            throw null;
        }
        this.zza = zzilVar;
        this.zzb = zzblVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgh) {
            zzgh zzghVar = (zzgh) obj;
            if (this.zza.equals(zzghVar.zza)) {
                zzbl zzblVar = zzghVar.zzb;
                zzbl zzblVar2 = this.zzb;
                if (zzblVar2 != null ? zzblVar2 == zzblVar : zzblVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzbl zzblVar = this.zzb;
        return (zzblVar == null ? 0 : zzblVar.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LlmResult{results=", this.zza.toString(), ", inferenceEventTraceResult=", String.valueOf(this.zzb), "}");
    }
}
