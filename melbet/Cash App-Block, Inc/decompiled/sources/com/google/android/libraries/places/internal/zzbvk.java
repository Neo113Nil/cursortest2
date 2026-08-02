package com.google.android.libraries.places.internal;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes4.dex */
public final class zzbvk implements Runnable {
    public final /* synthetic */ zzbvq zza;
    public final boolean zzb;
    public final boolean zzc;
    public final long zzd;
    public volatile ScheduledFuture zze;
    public volatile boolean zzf;

    public zzbvk(zzbvq zzbvqVar, zzbpy zzbpyVar, boolean z) {
        this.zza = zzbvqVar;
        this.zzb = z;
        if (zzbpyVar == null) {
            this.zzc = false;
            this.zzd = 0L;
        } else {
            this.zzc = true;
            this.zzd = zzbpyVar.zzc();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzk.zzl(zzc());
    }

    public final zzbtx zzc() {
        long j = this.zzd;
        long abs = Math.abs(j) / 1000000000;
        long abs2 = Math.abs(j) % 1000000000;
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.zzb ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(abs);
        Locale locale = Locale.US;
        sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        zzbvq zzbvqVar = this.zza;
        sb.append(String.format(locale, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) zzbvqVar.zzj.zzi(zzbph.zza)) == null ? 0.0d : r1.longValue() / zzbvq.zzb)));
        if (zzbvqVar.zzk != null) {
            zzbzm zzbzmVar = new zzbzm();
            zzbvqVar.zzk.zzn(zzbzmVar);
            sb.append(" ");
            sb.append(zzbzmVar);
        }
        return zzbtx.zzd.zze(sb.toString());
    }
}
