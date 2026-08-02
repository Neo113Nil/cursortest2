package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.zbc;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcbi extends zzbtb {
    public final zzcbg zza;
    public final zzbtf zzb;
    public final /* synthetic */ zzcby zzc;

    public zzcbi(zzcby zzcbyVar, zzcbg zzcbgVar, zzcfq zzcfqVar) {
        this.zzc = zzcbyVar;
        this.zza = zzcbgVar;
        Trace.checkNotNull(zzcfqVar, "resolver");
        this.zzb = zzcfqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbtb
    public final zzbtx zza(zzbtd zzbtdVar) {
        zzcci zzcciVar;
        Object obj;
        zzboq zzboqVar = zzbqu.zza;
        zzcby zzcbyVar = this.zzc;
        zzbuf zzbufVar = zzcbyVar.zze;
        zzbufVar.zzc();
        if (zzcbyVar.zzD != this.zzb) {
            return zzbtx.zza;
        }
        zzbtz zzbtzVar = zzbtdVar.zza;
        boolean zzc = zzbtzVar.zzc();
        zzbtx zzbtxVar = zzbtzVar.zza;
        if (!zzc) {
            if (zzbtxVar == null) {
                zzbtxVar = zzbtx.zza;
            }
            zzc(zzbtxVar);
            zzbtx zzbtxVar2 = zzbtzVar.zza;
            return zzbtxVar2 == null ? zzbtx.zza : zzbtxVar2;
        }
        if (zzbtxVar != null) {
            a$$ExternalSyntheticBUOutline0.m$1("No value present.");
            return null;
        }
        List list = (List) zzbtzVar.zzb;
        zzcbyVar.zzU.zzb("Resolved address: {0}, config={1}", 1, list, zzbtdVar.zzb);
        if (zzcbyVar.zzaj != 2) {
            zzcbyVar.zzU.zzb("Address resolved: {0}", 2, list);
            zzcbyVar.zzaj = 2;
        }
        zzbsz zzbszVar = zzbtdVar.zzc;
        zzbqu zzbquVar = (zzbqu) zzbtdVar.zzb.zzb.get(zzboqVar);
        zzcci zzcciVar2 = (zzbszVar == null || (obj = zzbszVar.zzb) == null) ? null : (zzcci) obj;
        zzbtx zzbtxVar3 = zzbszVar != null ? zzbszVar.zza : null;
        if (zzcbyVar.zzZ) {
            if (zzcciVar2 != null) {
                if (zzbquVar != null) {
                    zzcbyVar.zzW.zzc(zzbquVar);
                    if (zzcciVar2.zzb() != null) {
                        zzcbyVar.zzU.zza(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    zzcbyVar.zzW.zzc(zzcciVar2.zzb());
                }
            } else if (zzbtxVar3 == null) {
                zzcbyVar.zzW.zzc(null);
                zzcciVar2 = zzcby.zzg;
            } else {
                if (!zzcbyVar.zzY) {
                    zzcbyVar.zzU.zza(2, "Fallback to error due to invalid first service config without default config");
                    zzbtx zzbtxVar4 = zzbszVar.zza;
                    Trace.checkArgument("the error status must not be OK", !zzbtxVar4.zzj());
                    zzbufVar.zzb(new zzb(3, this, zzbtxVar4));
                    zzbufVar.zza();
                    return zzbszVar.zza;
                }
                zzcciVar2 = zzcbyVar.zzX;
            }
            if (!zzcciVar2.equals(zzcbyVar.zzX)) {
                zzcbyVar.zzU.zzb("Service config changed{0}", 2, zzcciVar2 == zzcby.zzg ? " to empty" : "");
                zzcbyVar.zzX = zzcciVar2;
                zzcbyVar.zzaf.job = zzcciVar2.zzd;
            }
            try {
                zzcbyVar.zzY = true;
            } catch (RuntimeException e) {
                zzcby zzcbyVar2 = this.zzc;
                Logger logger = zzcby.zza;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(zzcbyVar2.zzj);
                logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 51), "[", valueOf, "] Unexpected exception from parsing service config"), (Throwable) e);
            }
            zzcciVar = zzcciVar2;
        } else {
            if (zzcciVar2 != null) {
                zzcbyVar.zzU.zza(2, "Service config from name resolver discarded by channel settings");
            }
            if (zzbquVar != null) {
                zzcbyVar.zzU.zza(2, "Config selector from name resolver discarded by channel settings");
            }
            zzcbs zzcbsVar = zzcbyVar.zzW;
            zzcciVar = zzcby.zzg;
            zzcbsVar.zzc(zzcciVar.zzb());
        }
        zzbor zzborVar = zzbtdVar.zzb;
        zzcbg zzcbgVar = this.zza;
        if (zzcbgVar != this.zzc.zzF) {
            return zzbtx.zza;
        }
        zzborVar.getClass();
        zbc zbcVar = new zbc(zzborVar);
        if (zzborVar.zzb.containsKey(zzboqVar)) {
            zbcVar.zzd(0).remove(zzboqVar);
        }
        Map map = zzcciVar.zzf;
        if (map != null) {
            zbcVar.zza(zzbrv.zza, map);
            zbcVar.zzc();
        }
        zzbor zzc2 = zbcVar.zzc();
        zzbrq zzbrqVar = new zzbrq();
        if (zzbtzVar.zza != null) {
            a$$ExternalSyntheticBUOutline0.m$1("No value present.");
            return null;
        }
        List list2 = (List) zzbtzVar.zzb;
        zzbrqVar.zza = list2;
        Object obj2 = zzcciVar.zze;
        zzbrqVar.zzc = obj2;
        return zzcbgVar.zza.zza(new zzbrr(list2, zzc2, obj2));
    }

    public final void zzc(zzbtx zzbtxVar) {
        Logger logger = zzcby.zza;
        Level level = Level.WARNING;
        zzcby zzcbyVar = this.zzc;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{zzcbyVar.zzj, zzbtxVar});
        zzcbs zzcbsVar = zzcbyVar.zzW;
        if (zzcbsVar.zzb.get() == zzcby.zzh) {
            zzcbsVar.zzc(null);
        }
        if (zzcbyVar.zzaj != 3) {
            zzcbyVar.zzU.zzb("Failed to resolve name: {0}", 3, zzbtxVar);
            zzcbyVar.zzaj = 3;
        }
        zzcbg zzcbgVar = zzcbyVar.zzF;
        zzcbg zzcbgVar2 = this.zza;
        if (zzcbgVar2 != zzcbgVar) {
            return;
        }
        zzcbgVar2.zza.zzb(zzbtxVar);
    }
}
