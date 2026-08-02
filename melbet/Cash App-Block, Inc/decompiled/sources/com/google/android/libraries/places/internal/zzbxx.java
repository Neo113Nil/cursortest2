package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbxx implements zzbvt {
    public final zzbvt zza;
    public volatile boolean zzb;
    public List zzc = new ArrayList();

    public zzbxx(zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zza(zzbsn zzbsnVar) {
        zzg(new com.google.android.gms.tasks.zzc(27, this, zzbsnVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzfv zzfvVar) {
        if (this.zzb) {
            this.zza.zzb(zzfvVar);
        } else {
            zzg(new com.google.android.gms.tasks.zzc(26, this, zzfvVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzc(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        zzg(new zzbuo(this, zzbtxVar, zzbvsVar, zzbsnVar, 1));
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzmu(this, 6));
        }
    }

    public final void zzg(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzb) {
                    runnable.run();
                } else {
                    this.zzc.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
