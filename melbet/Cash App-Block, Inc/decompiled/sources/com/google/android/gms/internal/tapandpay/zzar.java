package com.google.android.gms.internal.tapandpay;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzak;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import java.util.ListIterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzar extends zzak implements ListIterator {
    public final zzat zza;
    public final int zza$1;
    public int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzat zzatVar, int i) {
        super(4);
        int size = zzatVar.size();
        if (i < 0 || i > size) {
            Path$$ExternalSyntheticBUOutline0.m(ContextUtilsKt.zzd(i, size, "index"));
            throw null;
        }
        this.zza$1 = size;
        this.zzb = i;
        this.zza = zzatVar;
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

    @Override // com.google.android.gms.internal.common.zzak, java.util.Iterator, java.util.ListIterator
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
