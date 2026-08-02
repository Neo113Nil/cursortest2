package com.google.android.gms.internal.time;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcp extends zzco {
    public static final zzcp zza = new zzcp(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzcp(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbz.zza(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.time.zzco, com.google.android.gms.internal.time.zzcl
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final Object[] zzg() {
        return this.zzb;
    }
}
