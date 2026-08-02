package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzamv implements zzanb {
    public final zzakg zza;
    public final zzzx zzb;

    public zzamv(zzzx zzzxVar, zzakg zzakgVar) {
        zzzx zzzxVar2 = zzali.zza;
        this.zzb = zzzxVar;
        this.zza = zzakgVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final int zza(zzals zzalsVar) {
        return zzalsVar.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final zzals zzd() {
        zzakg zzakgVar = this.zza;
        return zzakgVar instanceof zzals ? (zzals) ((zzals) zzakgVar).zzb(4) : ((zza) ((zzals) zzakgVar).zzb(5)).zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zze(Object obj) {
        this.zzb.getClass();
        zzano zzanoVar = ((zzals) obj).zzc;
        if (zzanoVar.zze) {
            zzanoVar.zze = false;
        }
        zzzx zzzxVar = zzali.zza;
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zzf(Object obj, Object obj2) {
        zzand.zzd(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final void zzg(Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzacg zzacgVar) {
        zzals zzalsVar = (zzals) obj;
        if (zzalsVar.zzc == zzano.zza) {
            zzalsVar.zzc = zzano.zzd();
        }
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final boolean zzh(zzals zzalsVar, zzals zzalsVar2) {
        return zzalsVar.zzc.equals(zzalsVar2.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzanb
    public final boolean zzi(Object obj) {
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }
}
