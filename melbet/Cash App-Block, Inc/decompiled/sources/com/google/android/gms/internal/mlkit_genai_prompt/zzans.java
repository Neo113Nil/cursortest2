package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzans extends zzant {
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final void zzc(Object obj, long j, boolean z) {
        if (zzanu.zza) {
            zzanu.zzi(obj, j, z);
        } else {
            zzanu.zzj(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final void zzd(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzant
    public final boolean zzf(Object obj, long j) {
        return zzanu.zza ? zzanu.zzq(obj, j) : zzanu.zzr(obj, j);
    }
}
