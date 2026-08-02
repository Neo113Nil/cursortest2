package com.google.android.gms.internal.location;

/* loaded from: classes4.dex */
public final class zzew extends zzex {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i, int i2) {
        this.zzc = zzexVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzer.zzc(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzex, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzex subList(int i, int i2) {
        zzer.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
