package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfv extends zzie {
    private zzcfv() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzie
    public final boolean zza(zzcfw zzcfwVar) {
        synchronized (zzcfwVar) {
            try {
                if (zzcfwVar.zze != 0) {
                    return false;
                }
                zzcfwVar.zze = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzie
    public final void zzb(zzcfw zzcfwVar) {
        synchronized (zzcfwVar) {
            zzcfwVar.zze = 0;
        }
    }
}
