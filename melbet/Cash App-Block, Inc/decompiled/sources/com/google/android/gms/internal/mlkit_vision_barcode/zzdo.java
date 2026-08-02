package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.room.TransactorKt;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdo extends zzcs {
    public final transient Object[] zza;
    public final transient int zzb;
    public final transient int zzc = 1;

    public zzdo(int i, Object[] objArr) {
        this.zza = objArr;
        this.zzb = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TransactorKt.zza(i, this.zzc);
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
