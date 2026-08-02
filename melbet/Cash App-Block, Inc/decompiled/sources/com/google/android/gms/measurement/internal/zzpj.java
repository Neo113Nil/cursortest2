package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzib;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzpj {
    public final long zza;
    public final zzib zzb;
    public final String zzc;
    public final Map zzd;
    public final zzls zze;
    public final long zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;

    public /* synthetic */ zzpj(long j, zzib zzibVar, String str, HashMap hashMap, zzls zzlsVar, long j2, long j3, long j4, int i) {
        this.zza = j;
        this.zzb = zzibVar;
        this.zzc = str;
        this.zzd = hashMap;
        this.zze = zzlsVar;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = j4;
        this.zzi = i;
    }

    public final zzot zza() {
        return new zzot(this.zzc, this.zzd, this.zze, null);
    }

    public final zzib zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzls zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }
}
