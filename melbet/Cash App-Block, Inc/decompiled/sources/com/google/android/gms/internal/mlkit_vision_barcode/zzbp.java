package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.mlkit_vision_face.zzao;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class zzbp extends zzbh implements ListIterator {
    public final /* synthetic */ zzao zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzao zzaoVar, int i) {
        super(zzaoVar, ((List) zzaoVar.zzb).listIterator(i));
        this.zzd = zzaoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzao zzaoVar = this.zzd;
        boolean isEmpty = zzaoVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        ((zzbw) zzaoVar.zzf).zzb++;
        if (isEmpty) {
            zzaoVar.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzao zzaoVar) {
        super(zzaoVar);
        this.zzd = zzaoVar;
    }
}
