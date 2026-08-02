package com.google.android.gms.internal.common;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzaj extends zzah {
    public static final zzaj zza = new zzaj(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzaj(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzr.zzb(i, this.zzc);
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final int zzg(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }
}
