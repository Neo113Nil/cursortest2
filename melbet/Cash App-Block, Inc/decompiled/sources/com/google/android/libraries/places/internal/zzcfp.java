package com.google.android.libraries.places.internal;

import com.google.android.filament.Box;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzcfp extends zzbtb {
    public final /* synthetic */ zzcfq zza;
    public final zzbtb zzb;

    public zzcfp(zzcfq zzcfqVar, zzbtb zzbtbVar) {
        this.zza = zzcfqVar;
        this.zzb = zzbtbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbtb
    public final zzbtx zza(zzbtd zzbtdVar) {
        zzbtx zza = this.zzb.zza(zzbtdVar);
        boolean zzj = zza.zzj();
        zzcfq zzcfqVar = this.zza;
        if (zzj) {
            zzbvd zzbvdVar = zzcfqVar.zzb;
            zzbuf zzbufVar = zzbvdVar.zzb;
            zzbufVar.zzc();
            zzbufVar.zzb(new zzmu(zzbvdVar, 4));
            zzbufVar.zza();
            return zza;
        }
        zzmu zzmuVar = new zzmu(zzcfqVar);
        zzbvd zzbvdVar2 = zzcfqVar.zzb;
        zzbuf zzbufVar2 = zzbvdVar2.zzb;
        zzbufVar2.zzc();
        if (zzbvdVar2.zze == null) {
            zzbvdVar2.zze = new zzbyl();
        }
        Box box = zzbvdVar2.zzc;
        if (box != null) {
            zzbud zzbudVar = (zzbud) box.mCenter;
            if (!zzbudVar.zzc && !zzbudVar.zzb) {
                return zza;
            }
        }
        long zza2 = zzbvdVar2.zze.zza();
        zzbvdVar2.zzc = zzbufVar2.zzd(zzbvdVar2.zza, zzmuVar, zza2, TimeUnit.NANOSECONDS);
        zzbvd.zzd.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(zza2));
        return zza;
    }
}
