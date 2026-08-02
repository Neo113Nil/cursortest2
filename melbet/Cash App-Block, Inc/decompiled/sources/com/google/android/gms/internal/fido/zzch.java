package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* loaded from: classes4.dex */
public final class zzch extends zzcc {
    public final /* synthetic */ zzci zza;

    public zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcj zzcjVar = this.zza.zza;
        return new AbstractMap.SimpleImmutableEntry(zzcjVar.zzd.zzd.get(i), zzcjVar.zze.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.zze.size();
    }
}
