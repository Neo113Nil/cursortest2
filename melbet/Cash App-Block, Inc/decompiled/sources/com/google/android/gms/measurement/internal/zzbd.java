package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zzbd {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final Long zzh;
    public final Long zzi;
    public final Long zzj;
    public final Boolean zzk;

    public zzbd(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        zzae.checkNotEmpty(str);
        zzae.checkNotEmpty(str2);
        zzae.checkArgument(j >= 0);
        zzae.checkArgument(j2 >= 0);
        zzae.checkArgument(j3 >= 0);
        zzae.checkArgument(j5 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = l;
        this.zzi = l2;
        this.zzj = l3;
        this.zzk = bool;
    }

    public final zzbd zza(long j) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzb(long j, long j2) {
        Long valueOf = Long.valueOf(j2);
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j, valueOf, this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzc(Long l, Long l2, Boolean bool) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l, l2, bool);
    }
}
