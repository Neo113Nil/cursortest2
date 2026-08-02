package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.base.zao;

/* loaded from: classes.dex */
public abstract class zzaz {
    public static volatile zao zzb;
    public final zzjg zza;
    public final com.google.android.gms.tasks.zzi zzc;
    public volatile long zzd;

    public zzaz(zzjg zzjgVar) {
        zzae.checkNotNull(zzjgVar);
        this.zza = zzjgVar;
        this.zzc = new com.google.android.gms.tasks.zzi(4, this, zzjgVar);
    }

    public abstract void zza();

    public final void zzb(long j) {
        zzd();
        if (j >= 0) {
            zzjg zzjgVar = this.zza;
            zzjgVar.zzba().getClass();
            this.zzd = System.currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j)) {
                return;
            }
            zzjgVar.zzaW().zzd.zzb(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void zzd() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public final Handler zzf() {
        zao zaoVar;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzaz.class) {
            try {
                if (zzb == null) {
                    zzb = new zao(this.zza.zzaZ().getMainLooper(), 3);
                }
                zaoVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zaoVar;
    }
}
