package com.google.android.gms.internal.mlkit_vision_text_common;

import coil3.size.DimensionKt;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcf extends zzbk {
    public final /* synthetic */ zzcg zza;

    public zzcf(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzcg zzcgVar = this.zza;
        DimensionKt.zza(i, zzcgVar.zzc);
        Object[] objArr = zzcgVar.zzb;
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
}
