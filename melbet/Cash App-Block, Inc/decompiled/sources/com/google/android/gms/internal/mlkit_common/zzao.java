package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzao extends zzaj {
    public final transient zzaq zza;
    public final transient zzap zzb;

    public zzao(zzaq zzaqVar, zzap zzapVar) {
        this.zza = zzaqVar;
        this.zzb = zzapVar;
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

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr) {
        return this.zzb.zza(objArr);
    }
}
