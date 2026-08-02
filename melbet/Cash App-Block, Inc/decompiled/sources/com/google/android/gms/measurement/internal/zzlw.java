package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzlw implements Runnable {
    public final /* synthetic */ zzlu zza;
    public final /* synthetic */ zzlu zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzmb zze;

    public zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j, boolean z) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j;
        this.zzd = z;
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzm(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
