package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzcn extends zzco {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzco zzc;

    public zzcn(zzco zzcoVar, int i, int i2) {
        this.zzc = zzcoVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbz.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.time.zzco, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzco subList(int i, int i2) {
        zzbz.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
