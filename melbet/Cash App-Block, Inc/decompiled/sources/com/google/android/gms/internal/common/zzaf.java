package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
public final class zzaf extends zzah {
    public final transient zzah zza;

    public zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzah zzahVar = this.zza;
        zzr.zzb(i, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
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

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i, int i2) {
        zzah zzahVar = this.zza;
        zzr.zzd(i, i2, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i2, zzahVar.size() - i).zzh();
    }
}
