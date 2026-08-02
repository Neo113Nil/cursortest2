package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class zzkc implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ Bundle zze;
    public final /* synthetic */ boolean zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ boolean zzh;
    public final /* synthetic */ zzlj zzj;

    public zzkc(zzlj zzljVar, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bundle;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzj = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzj.zzG(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
