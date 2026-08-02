package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.Objects;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzbuu implements zzcgi {
    public static final Logger zza = Logger.getLogger(zzbuu.class.getName());

    public abstract zzccs zzh();

    public abstract zzcho zzp();

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzr() {
        zzcho zzp = zzp();
        zzcco zzccoVar = zzp.zzu;
        zzccoVar.zza = zzp;
        zzp.zzr = zzccoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzs(int i) {
        zzcho zzp = zzp();
        int i2 = zzclf.$r8$clinit;
        Objects.requireNonNull(zzp);
        synchronized (zzp.zzc) {
            try {
                int i3 = zzclf.$r8$clinit;
                zzcco zzccoVar = zzp.zzr;
                if (!(zzccoVar.zzi == null)) {
                    zzccoVar.zzj += i;
                    zzccoVar.zzi();
                }
            } catch (Throwable th) {
                zzp.zzP(zzbtx.zzb(th), true, new zzbsn());
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzt(zzcjz zzcjzVar) {
        try {
            if (!zzh().zzj) {
                zzh().zza(zzcjzVar);
            }
        } finally {
            zzbzg.zzh(zzcjzVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzu() {
        zzccs zzh;
        zzcig zzcigVar;
        if (zzh().zzj || (zzcigVar = (zzh = zzh()).zzc) == null || zzcigVar.zzc <= 0) {
            return;
        }
        zzh.zzc = null;
        zzh.zza.zzj(zzcigVar, false, true, zzh.zzk);
        zzh.zzk = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzv(zzbpl zzbplVar) {
        zzccs zzh = zzh();
        Trace.checkNotNull(zzbplVar, "compressor");
        zzh.getClass();
        zzh.zze = zzbplVar;
    }
}
