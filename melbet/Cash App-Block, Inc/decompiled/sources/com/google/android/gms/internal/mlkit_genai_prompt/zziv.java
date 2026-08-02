package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zziv extends zzil {
    public final transient Object[] zza;
    public final transient int zzb;
    public final transient int zzc;

    public zziv(int i, int i2, Object[] objArr) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzhw.zza(i, this.zzc);
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final boolean zzf() {
        return true;
    }
}
