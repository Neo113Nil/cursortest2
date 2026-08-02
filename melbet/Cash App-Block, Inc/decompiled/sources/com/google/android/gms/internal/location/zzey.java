package com.google.android.gms.internal.location;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzey extends zzex {
    public static final zzey zza = new zzey(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzey(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.zzc(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.location.zzex, com.google.android.gms.internal.location.zzeu
    public final int zzg(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
