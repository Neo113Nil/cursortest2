package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzct {
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    public zzct(String str, String str2, int i, int i2, int i3, int i4) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null name");
            throw null;
        }
        this.zza = str;
        if (str2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null modelName");
            throw null;
        }
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzct) {
            zzct zzctVar = (zzct) obj;
            if (this.zza.equals(zzctVar.zza) && this.zzb.equals(zzctVar.zzb) && this.zzc == zzctVar.zzc && this.zzd == zzctVar.zzd && this.zze == zzctVar.zze && this.zzf == zzctVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzf ^ ((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd) * 1000003) ^ this.zze) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiFeature{name=");
        sb.append(this.zza);
        sb.append(", modelName=");
        sb.append(this.zzb);
        sb.append(", type=");
        sb.append(this.zzc);
        sb.append(", variant=");
        sb.append(this.zzd);
        sb.append(", id=");
        sb.append(this.zze);
        sb.append(", version=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzf, "}", sb);
    }

    public final zzm zze() {
        return new zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
