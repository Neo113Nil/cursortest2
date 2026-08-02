package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzabb extends AbstractSet {
    public final int zza;
    public final /* synthetic */ zzabc zzb;

    public zzabb(zzabc zzabcVar, int i) {
        this.zzb = zzabcVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb, zzb(), zzc(), obj, this.zza == -1 ? zzabc.zza : zzabe.zzb) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new com.google.android.gms.internal.time.zzfg(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzc() - zzb();
    }

    public final int zzb() {
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        return this.zzb.zzc[i];
    }

    public final int zzc() {
        return this.zzb.zzc[this.zza + 1];
    }
}
