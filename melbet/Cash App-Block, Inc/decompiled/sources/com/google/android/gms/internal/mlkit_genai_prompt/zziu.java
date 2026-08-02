package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zziu extends zzip {
    public final transient zziw zza;
    public final transient zziv zzb;

    public zziu(zziw zziwVar, zziv zzivVar) {
        this.zza = zziwVar;
        this.zzb = zzivVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zza(Object[] objArr) {
        return this.zzb.zza(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzip, com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final zzil zzd() {
        return this.zzb;
    }
}
