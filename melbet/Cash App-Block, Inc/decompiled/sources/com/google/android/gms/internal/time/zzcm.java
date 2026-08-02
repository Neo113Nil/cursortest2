package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.ListIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcm implements ListIterator, Iterator {
    public final zzco zza;
    public final int zza$1;
    public int zzb;

    public zzcm(zzco zzcoVar, int i) {
        int size = zzcoVar.size();
        if (i < 0 || i > size) {
            Path$$ExternalSyntheticBUOutline0.m(zzbz.zzd(i, size, "index"));
            throw null;
        }
        this.zza$1 = size;
        this.zzb = i;
        this.zza = zzcoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza$1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.zzb;
        this.zzb = i + 1;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.zzb - 1;
        this.zzb = i;
        return zza(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
