package com.google.android.libraries.places.internal;

import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzbvn extends zzbwi {
    public final /* synthetic */ zzbtx zza;
    public final /* synthetic */ zzbsn zzb;
    public final /* synthetic */ com.google.android.gms.maps.zzah zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbvn(com.google.android.gms.maps.zzah zzahVar, zzbtx zzbtxVar, zzbsn zzbsnVar) {
        super(((zzbvq) zzahVar.zzc).zzg, 0);
        this.zza = zzbtxVar;
        this.zzb = zzbsnVar;
        this.zzc = zzahVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwi
    public final void zza() {
        com.google.android.gms.maps.zzah zzahVar = this.zzc;
        int i = zzclf.$r8$clinit;
        zzbvk zzbvkVar = ((zzbvq) zzahVar.zzc).zzh;
        zzbvkVar.zzf = true;
        ScheduledFuture scheduledFuture = zzbvkVar.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        zzbtx zzbtxVar = this.zza;
        zzbsn zzbsnVar = this.zzb;
        zzbtx zzbtxVar2 = (zzbtx) zzahVar.zzb;
        if (zzbtxVar2 != null) {
            zzbsnVar = new zzbsn();
        } else {
            zzbtxVar2 = zzbtxVar;
        }
        try {
            try {
                ((zzboz) zzahVar.f68zza).zzc(zzbtxVar2, zzbsnVar);
            } catch (RuntimeException e) {
                zzbvq.zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
            }
            zzyr zzyrVar = ((zzbvq) zzahVar.zzc).zzf;
            if (zzbtxVar2.zzj()) {
                ((zzcan) zzyrVar.zze).zza();
            } else {
                ((zzcan) zzyrVar.zzf).zza();
            }
        } catch (Throwable th) {
            zzyr zzyrVar2 = ((zzbvq) zzahVar.zzc).zzf;
            if (zzbtxVar2.zzj()) {
                ((zzcan) zzyrVar2.zze).zza();
                throw th;
            }
            ((zzcan) zzyrVar2.zzf).zza();
            throw th;
        }
    }
}
