package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzx extends zzs {
    public final transient com.google.android.gms.internal.mlkit_vision_face.zzch zza;
    public final transient zzy zzb;

    public zzx(com.google.android.gms.internal.mlkit_vision_face.zzch zzchVar, zzy zzyVar) {
        this.zza = zzchVar;
        this.zzb = zzyVar;
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
        this.zza.getClass();
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zza(Object[] objArr) {
        return this.zzb.zza(objArr);
    }
}
