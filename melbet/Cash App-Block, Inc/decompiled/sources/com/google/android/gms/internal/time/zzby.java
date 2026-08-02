package com.google.android.gms.internal.time;

import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzby implements zzax {
    public final zzax zza;
    public final Object zzb = new Object();
    public final zzak zzc;
    public WeakReference zzd;
    public boolean zze;

    public zzby(zzax zzaxVar) {
        Objects.requireNonNull(zzaxVar);
        this.zza = zzaxVar;
        this.zzc = new zzak(this, 3);
    }

    @Override // com.google.android.gms.internal.time.zzax
    public final Task zza() {
        synchronized (this.zzb) {
            this.zze = true;
            this.zzd = null;
        }
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.time.zzax
    public final void zzd(zzak zzakVar) {
        synchronized (this.zzb) {
            try {
                if (this.zze) {
                    throw new IllegalStateException("dispose() has been called");
                }
                WeakReference weakReference = this.zzd;
                if (weakReference != null) {
                    throw new IllegalStateException("Listener already set:" + weakReference.toString());
                }
                this.zzd = new WeakReference(zzakVar);
                this.zza.zzd(this.zzc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
