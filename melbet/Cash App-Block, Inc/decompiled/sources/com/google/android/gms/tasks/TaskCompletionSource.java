package com.google.android.gms.tasks;

import com.fillr.n;

/* loaded from: classes.dex */
public class TaskCompletionSource {
    public final zzw zza = new zzw();

    public TaskCompletionSource(zzb zzbVar) {
        zzbVar.onCanceledRequested(new n.b(this, 29));
    }

    public final void setException(Exception exc) {
        this.zza.zzc(exc);
    }

    public final void setResult(Object obj) {
        this.zza.zza(obj);
    }

    public final boolean trySetException(Exception exc) {
        zzw zzwVar = this.zza;
        zzwVar.getClass();
        com.google.android.gms.common.internal.zzae.checkNotNull(exc, "Exception must not be null");
        synchronized (zzwVar.zza) {
            try {
                if (zzwVar.zzc) {
                    return false;
                }
                zzwVar.zzc = true;
                zzwVar.zzf = exc;
                zzwVar.zzb.zzb(zzwVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void trySetResult(Object obj) {
        this.zza.zzb(obj);
    }

    public TaskCompletionSource() {
    }
}
