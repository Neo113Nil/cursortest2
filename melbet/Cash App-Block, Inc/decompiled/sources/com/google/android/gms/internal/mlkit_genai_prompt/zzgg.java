package com.google.android.gms.internal.mlkit_genai_prompt;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzgg {
    public final zzil zza;
    public final float zzb;
    public final int zzc;
    public final zzil zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final zzgc zzl;
    public final zzeo zzm;

    public zzgg(zzil zzilVar, float f, int i, zzil zzilVar2, int i2, int i3, int i4, zzeo zzeoVar, boolean z, int i5, int i6, int i7, zzgc zzgcVar) {
        this.zza = zzilVar;
        this.zzb = f;
        this.zzc = i;
        this.zzd = zzilVar2;
        this.zze = i2;
        this.zzf = i3;
        this.zzg = i4;
        this.zzm = zzeoVar;
        this.zzh = z;
        this.zzi = i5;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = zzgcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgg)) {
            return false;
        }
        zzgg zzggVar = (zzgg) obj;
        if (!this.zza.equals(zzggVar.zza) || Float.floatToIntBits(this.zzb) != Float.floatToIntBits(zzggVar.zzb) || this.zzc != zzggVar.zzc || !this.zzd.equals(zzggVar.zzd) || this.zze != zzggVar.zze || this.zzf != zzggVar.zzf || this.zzg != zzggVar.zzg) {
            return false;
        }
        zzeo zzeoVar = zzggVar.zzm;
        zzeo zzeoVar2 = this.zzm;
        if (zzeoVar2 == null) {
            if (zzeoVar != null) {
                return false;
            }
        } else if (zzeoVar2 != zzeoVar) {
            return false;
        }
        if (this.zzh != zzggVar.zzh || this.zzi != zzggVar.zzi || this.zzj != zzggVar.zzj || this.zzk != zzggVar.zzk) {
            return false;
        }
        zzgc zzgcVar = zzggVar.zzl;
        zzgc zzgcVar2 = this.zzl;
        return zzgcVar2 == null ? zzgcVar == null : zzgcVar2.equals(zzgcVar);
    }

    public final int hashCode() {
        int hashCode = ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.zzb)) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
        zzeo zzeoVar = this.zzm;
        int hashCode2 = ((((((((((((hashCode * 1000003) ^ this.zze) * 1000003) ^ this.zzf) * 1000003) ^ this.zzg) * 1000003) ^ (zzeoVar == null ? 0 : zzeoVar.hashCode())) * 1000003) ^ (true != this.zzh ? 1237 : 1231)) * 1000003) ^ this.zzi) * 1000003;
        zzgc zzgcVar = this.zzl;
        return ((this.zzk ^ ((hashCode2 ^ this.zzj) * (-429739981))) * (-721379959)) ^ (zzgcVar != null ? zzgcVar.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzd.toString();
        String valueOf = String.valueOf(this.zzm);
        String valueOf2 = String.valueOf(this.zzl);
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("LlmRequest{messages=", obj, ", temperature=");
        m3m.append(this.zzb);
        m3m.append(", topK=");
        m3m.append(this.zzc);
        m3m.append(", stopTokensList=");
        m3m.append(obj2);
        m3m.append(", targetReplyLengthMin=");
        m3m.append(this.zze);
        m3m.append(", targetReplyLengthMax=");
        m3m.append(this.zzf);
        m3m.append(", numSamples=");
        m3m.append(this.zzg);
        m3m.append(", streamingCallback=");
        m3m.append(valueOf);
        m3m.append(", shouldApplySafetyFilter=");
        m3m.append(this.zzh);
        m3m.append(", preferredImageWidth=");
        m3m.append(this.zzi);
        m3m.append(", preferredImageHeight=");
        m3m.append(this.zzj);
        m3m.append(", numSoftTokens=0, loraFile=null, drafterLoraFile=null, sessionStateFile=null, rngSeed=");
        m3m.append(this.zzk);
        m3m.append(", overrideRequestKind=0, llmPrefixParam=");
        m3m.append(valueOf2);
        m3m.append("}");
        return m3m.toString();
    }
}
