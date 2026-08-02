package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.util.Strings;

/* loaded from: classes4.dex */
public final class zzbm extends zzbn {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzbn zzc;

    public zzbm(zzbn zzbnVar, int i, int i2) {
        this.zzc = zzbnVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Strings.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i, int i2) {
        Strings.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
