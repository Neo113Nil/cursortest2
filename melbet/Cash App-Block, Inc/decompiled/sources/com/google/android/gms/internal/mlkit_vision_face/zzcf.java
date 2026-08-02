package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzcf extends zzbq {
    public final transient zzch zza;
    public final transient zzcg zzb;

    public zzcf(zzch zzchVar, zzcg zzcgVar) {
        this.zza = zzchVar;
        this.zzb = zzcgVar;
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

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr) {
        return this.zzb.zza(objArr);
    }
}
