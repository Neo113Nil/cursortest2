package com.google.android.gms.internal.fido;

/* loaded from: classes4.dex */
public final class zzca extends zzcc {
    public final transient zzcc zza;

    public zzca(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzcc zzccVar = this.zza;
        zzh.m2006zza(i, zzccVar.size());
        return zzccVar.get((zzccVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg */
    public final zzcc subList(int i, int i2) {
        zzcc zzccVar = this.zza;
        zzh.zze(i, i2, zzccVar.size());
        return zzccVar.subList(zzccVar.size() - i2, zzccVar.size() - i).zzf();
    }
}
