package com.google.android.gms.internal.mlkit_common;

import androidx.room.Room;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzam extends zzaf {
    public final /* synthetic */ zzan zza;

    public zzam(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzan zzanVar = this.zza;
        Room.zza(i, zzanVar.zzc);
        Object[] objArr = zzanVar.zzb;
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
