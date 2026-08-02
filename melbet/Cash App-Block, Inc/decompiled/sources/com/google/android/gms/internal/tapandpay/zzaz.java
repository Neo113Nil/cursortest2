package com.google.android.gms.internal.tapandpay;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzaz extends zzau {
    public final transient Object zza;

    public zzaz(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new zzav(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr) {
        objArr[0] = this.zza;
        return 1;
    }
}
