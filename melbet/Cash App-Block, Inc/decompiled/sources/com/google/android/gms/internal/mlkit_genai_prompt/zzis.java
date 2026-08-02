package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzis extends zzil {
    public final /* synthetic */ zzit zza;

    public zzis(zzit zzitVar) {
        this.zza = zzitVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzit zzitVar = this.zza;
        zzhw.zza(i, zzitVar.zzc);
        Object[] objArr = zzitVar.zzb;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final boolean zzf() {
        return true;
    }
}
