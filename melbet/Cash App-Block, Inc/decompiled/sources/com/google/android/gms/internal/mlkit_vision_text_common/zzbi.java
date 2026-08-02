package com.google.android.gms.internal.mlkit_vision_text_common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ListIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class zzbi extends UnmodifiableIterator implements ListIterator {
    public final zzbk zza;
    public final int zza$1;
    public int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbk zzbkVar, int i) {
        super(5);
        int size = zzbkVar.size();
        if (i < 0 || i > size) {
            Path$$ExternalSyntheticBUOutline0.m(DimensionKt.zze(i, size, "index"));
            throw null;
        }
        this.zza$1 = size;
        this.zzb = i;
        this.zza = zzbkVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza$1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
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

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
