package com.google.android.libraries.places.internal;

import com.fillr.browsersdk.Fillr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbwy extends zzboz {
    public final zzboz zza;
    public volatile boolean zzb;
    public List zzc = new ArrayList();

    public zzbwy(zzboz zzbozVar) {
        this.zza = zzbozVar;
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zza(zzbsn zzbsnVar) {
        if (this.zzb) {
            this.zza.zza(zzbsnVar);
        } else {
            zzg(new com.google.android.gms.tasks.zzc(18, this, zzbsnVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzb(Object obj) {
        if (this.zzb) {
            this.zza.zzb(obj);
        } else {
            zzg(new com.google.android.gms.tasks.zzc(19, this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzc(zzbtx zzbtxVar, zzbsn zzbsnVar) {
        zzg(new Fillr.AnonymousClass2(this, zzbtxVar, zzbsnVar, false, 23));
    }

    @Override // com.google.android.libraries.places.internal.zzboz
    public final void zzd() {
        if (this.zzb) {
            this.zza.zzd();
        } else {
            zzg(new zzmu(this, 5));
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
