package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzbuq extends zzbuu implements zzbvr {
    public static final Logger zzb = Logger.getLogger(zzbuq.class.getName());
    public final zzcgr zzc;
    public final zzccs zzd;
    public final boolean zze;
    public zzbsn zzf;
    public volatile boolean zzg;

    public zzbuq(zzcih zzcihVar, zzcgh zzcghVar, zzcgr zzcgrVar, zzbsn zzbsnVar, zzbov zzbovVar) {
        Trace.checkNotNull(zzbsnVar, "headers");
        Trace.checkNotNull(zzcgrVar, "transportTracer");
        this.zzc = zzcgrVar;
        this.zze = !Boolean.TRUE.equals(zzbovVar.zzi(zzbzg.zzl));
        this.zzd = new zzccs(this, zzcihVar, zzcghVar);
        this.zzf = zzbsnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zza(zzbpy zzbpyVar) {
        zzbsn zzbsnVar = this.zzf;
        zzbsh zzbshVar = zzbzg.zza;
        zzbsnVar.zzd(zzbshVar);
        this.zzf.zzc(zzbshVar, Long.valueOf(zzbpyVar.zzc()));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzb(int i) {
        zzccs zzccsVar = this.zzd;
        Trace.checkState("max size already set", zzccsVar.zzb == -1);
        zzccsVar.zzb = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzc(int i) {
        ((zzchp) this).zzg.zzr.zzb = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzd(zzbqb zzbqbVar) {
        zzcho zzchoVar = ((zzchp) this).zzg;
        Trace.checkState("Already called start", zzchoVar.zzc$2 == null);
        Trace.checkNotNull(zzbqbVar, "decompressorRegistry");
        zzchoVar.zzd$2 = zzbqbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzf(zzbvt zzbvtVar) {
        zzchp zzchpVar = (zzchp) this;
        zzcho zzchoVar = zzchpVar.zzg;
        Trace.checkState("Already called setListener", zzchoVar.zzc$2 == null);
        Trace.checkNotNull(zzbvtVar, "listener");
        zzchoVar.zzc$2 = zzbvtVar;
        zzfv zzfvVar = zzchpVar.zzh;
        zzbsn zzbsnVar = this.zzf;
        zzfvVar.getClass();
        int i = zzclf.$r8$clinit;
        zzchp zzchpVar2 = (zzchp) zzfvVar.zza;
        String str = (String) zzchpVar2.zzc.mVersion;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append("/");
        sb.append(str);
        String sb2 = sb.toString();
        synchronized (zzchpVar2.zzg.zzc) {
            zzchpVar2.zzg.zzN(zzbsnVar, sb2);
        }
        this.zzf = null;
    }

    @Override // com.google.android.libraries.places.internal.zzbuu
    public final zzccs zzh() {
        return this.zzd;
    }

    public final void zzj(zzcig zzcigVar, boolean z, boolean z2, int i) {
        zzclo zzcloVar;
        boolean z3 = true;
        if (zzcigVar == null && !z) {
            z3 = false;
        }
        Trace.checkArgument("null frame before EOS", z3);
        zzfv zzfvVar = ((zzchp) this).zzh;
        zzfvVar.getClass();
        int i2 = zzclf.$r8$clinit;
        if (zzcigVar == null) {
            zzcloVar = zzchp.zzb;
        } else {
            zzcloVar = zzcigVar.zza;
            int i3 = (int) zzcloVar.zzb;
            if (i3 > 0) {
                zzcho zzchoVar = ((zzchp) zzfvVar.zza).zzg;
                synchronized (zzchoVar.zzs) {
                    zzchoVar.zzv += i3;
                }
            }
        }
        zzchp zzchpVar = (zzchp) zzfvVar.zza;
        synchronized (zzchpVar.zzg.zzc) {
            zzchpVar.zzg.zzM(zzcloVar, z, z2);
            zzcgr zzcgrVar = ((zzbuq) zzchpVar).zzc;
            if (i == 0) {
                zzcgrVar.getClass();
            } else {
                zzcgrVar.getClass();
                zzcgrVar.zzb.zza();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzk() {
        zzchp zzchpVar = (zzchp) this;
        if (zzchpVar.zzg.zzg$1) {
            return;
        }
        zzchpVar.zzg.zzg$1 = true;
        zzccs zzccsVar = this.zzd;
        if (zzccsVar.zzj) {
            return;
        }
        zzccsVar.zzj = true;
        zzcig zzcigVar = zzccsVar.zzc;
        if (zzcigVar != null && zzcigVar.zzc == 0) {
            zzccsVar.zzc = null;
        }
        zzcig zzcigVar2 = zzccsVar.zzc;
        zzccsVar.zzc = null;
        zzccsVar.zza.zzj(zzcigVar2, true, true, zzccsVar.zzk);
        zzccsVar.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzl(zzbtx zzbtxVar) {
        Trace.checkArgument("Should not cancel with OK status", !zzbtxVar.zzj());
        this.zzg = true;
        zzfv zzfvVar = ((zzchp) this).zzh;
        zzfvVar.getClass();
        int i = zzclf.$r8$clinit;
        zzchp zzchpVar = (zzchp) zzfvVar.zza;
        synchronized (zzchpVar.zzg.zzc) {
            zzchpVar.zzg.zzP(zzbtxVar, true, null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final boolean zzm() {
        return ((zzchp) this).zzg.zza() && !this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzn(zzbzm zzbzmVar) {
        zzbzmVar.zzb(((zzchp) this).zzi.zzb.get(zzie.zza), "remote_addr");
    }
}
