package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzir extends zzil {
    public static final zzir zza = new zzir(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzir(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhw.zza(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzil, com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final Object[] zzg() {
        return this.zzb;
    }
}
