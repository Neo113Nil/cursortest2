package com.google.android.gms.internal.mlkit_vision_text_common;

import coil3.size.DimensionKt;

/* loaded from: classes4.dex */
public final class zzbj extends zzbk {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzbk zzc;

    public zzbj(zzbk zzbkVar, int i, int i2) {
        this.zzc = zzbkVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DimensionKt.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i, int i2) {
        DimensionKt.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
