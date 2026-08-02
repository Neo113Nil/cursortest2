package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzcz extends zzcf {
    public final transient Object zza;

    public zzcz(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new zzcm(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zza(Object[] objArr) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final zzdc zzd() {
        return new zzcm(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        Object[] objArr = {this.zza};
        for (int i = 0; i < 1; i++) {
            zzbz zzbzVar = zzcc.zza;
            if (objArr[i] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        return zzcc.zzh(1, objArr);
    }
}
