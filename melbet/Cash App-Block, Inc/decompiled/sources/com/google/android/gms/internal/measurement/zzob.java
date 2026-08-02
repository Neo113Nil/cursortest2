package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzob extends zzof {
    public final long zza;
    public volatile long zza$1;

    public zzob(String str, zzpi zzpiVar, long j) {
        super(str, zzpiVar);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zza() {
        return Long.valueOf(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzc(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zzd(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ Object zze() {
        return Long.valueOf(this.zza$1);
    }

    @Override // com.google.android.gms.internal.measurement.zzof
    public final /* synthetic */ void zzh(Object obj) {
        this.zza$1 = ((Long) obj).longValue();
    }
}
