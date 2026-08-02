package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzgd {
    public final String zza;
    public final float zzb;
    public final int zzc;

    public zzgd(float f, int i, String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null text");
            throw null;
        }
        this.zza = str;
        this.zzb = f;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgd) {
            zzgd zzgdVar = (zzgd) obj;
            if (this.zza.equals(zzgdVar.zza) && Float.floatToIntBits(this.zzb) == Float.floatToIntBits(zzgdVar.zzb) && this.zzc == zzgdVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LlmReply{text=");
        sb.append(this.zza);
        sb.append(", score=");
        sb.append(this.zzb);
        sb.append(", stopReason=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzc, "}", sb);
    }
}
