package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzik extends zzil {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzil zzc;

    public zzik(zzil zzilVar, int i, int i2) {
        this.zzc = zzilVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhw.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzil, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzil subList(int i, int i2) {
        zzhw.zzf(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
