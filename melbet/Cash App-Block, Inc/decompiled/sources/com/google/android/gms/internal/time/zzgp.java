package com.google.android.gms.internal.time;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzgp extends AbstractSet {
    public final int zza;
    public final /* synthetic */ zzgq zzb;

    public zzgp(zzgq zzgqVar, int i) {
        this.zzb = zzgqVar;
        this.zza = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb, zzb(), zza(), obj, this.zza == -1 ? zzgq.zza : zzgs.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfg(this, 3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        return this.zzb.zzc[this.zza + 1];
    }

    public final int zzb() {
        int i = this.zza;
        if (i == -1) {
            return 0;
        }
        return this.zzb.zzc[i];
    }
}
