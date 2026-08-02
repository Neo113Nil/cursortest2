package com.google.android.gms.internal.tapandpay;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzak;

/* loaded from: classes4.dex */
public final class zzav extends zzak {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzav(Object obj) {
        super(4);
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzak, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.zza) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.zza = true;
        return this.zzb;
    }
}
