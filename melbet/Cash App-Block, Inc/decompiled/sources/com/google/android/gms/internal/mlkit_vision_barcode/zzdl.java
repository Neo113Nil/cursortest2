package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.TransactorKt;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdl extends zzcs {
    public final /* synthetic */ zzdm zza;

    public zzdl(zzdm zzdmVar) {
        this.zza = zzdmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzdm zzdmVar = this.zza;
        TransactorKt.zza(i, zzdmVar.zzc);
        Object[] objArr = zzdmVar.zzb;
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
