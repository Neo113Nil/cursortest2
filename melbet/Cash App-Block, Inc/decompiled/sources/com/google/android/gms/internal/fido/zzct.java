package com.google.android.gms.internal.fido;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzct extends zzcc {
    public static final zzct zza = new zzct(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzct(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzh.m2006zza(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.zzb;
    }
}
