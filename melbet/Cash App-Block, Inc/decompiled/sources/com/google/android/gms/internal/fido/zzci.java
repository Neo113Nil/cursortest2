package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzci extends zzcf {
    public final /* synthetic */ zzcj zza;

    public zzci(zzcj zzcjVar) {
        this.zza = zzcjVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zza.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzh.zza(this.zza.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzi().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zze.size();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final zzdc zzd() {
        return zzi().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzj() {
        return new zzch(this);
    }
}
