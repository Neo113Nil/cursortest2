package com.google.android.libraries.places.internal;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.common.sdkinternal.zzb;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzjt {
    public final ScheduledExecutorService zzb = Executors.newSingleThreadScheduledExecutor();
    public Long zzd;
    public zzblx zze;
    public String zzf;
    public final Context zzg;
    public final zzbgl zzh;

    public zzjt(Context context, zzbsd zzbsdVar) {
        this.zzg = context;
        this.zzh = new zzbgl(zzbsdVar, zzbov.zza.zzh(zzcko.zza, zzckm.zzb), 1);
    }

    public final ListenableFuture zza() {
        zzblx zzblxVar = this.zze;
        if (zzblxVar == null || zzblxVar.zzc() < Instant.now().getEpochSecond()) {
            return Futures.transform(zzb(), new zzfn(this, 1), DirectExecutor.INSTANCE);
        }
        String str = this.zzf;
        if (str != null) {
            return Futures.immediateFuture(str);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Signature not generated.");
        return null;
    }

    public final zzckj zzb() {
        Context context = this.zzg;
        zzbna zzc = zzbnb.zzc();
        String packageName = context.getPackageName();
        zzc.zzy();
        ((zzbnb) zzc.zza).zzf(packageName);
        zzbnb zzbnbVar = (zzbnb) zzc.zzD();
        zzbgl zzbglVar = this.zzh;
        zzbow zzbowVar = (zzbow) zzbglVar.zza;
        Schema schema = zzkf.f78zza;
        if (schema == null) {
            synchronized (zzkf.class) {
                try {
                    schema = zzkf.f78zza;
                    if (schema == null) {
                        zzbso zzi = Schema.zzi();
                        zzi.zzc = zzbsq.zza;
                        zzi.zzd = Schema.zzh("google.internal.maps.gmpsdksbackend.v1.GmpSdksBackendService", "InitMapsJwt");
                        zzi.zze = true;
                        zzbnb zze = zzbnb.zze();
                        zzbjc zzbjcVar = zzckb.zza;
                        zzi.zza = new zzcka(zze);
                        zzi.zzb = new zzcka(zzbnd.zzf());
                        schema = zzi.zzf();
                        zzkf.f78zza = schema;
                    }
                } finally {
                }
            }
        }
        zzckj zzb = zzcko.zzb(zzbowVar.zza(schema, (zzbov) zzbglVar.zzd), zzbnbVar);
        zzfv zzfvVar = new zzfv(this, 12);
        zzb.addListener(new zzb(zzb, zzfvVar, false, 15), DirectExecutor.INSTANCE);
        return zzb;
    }
}
