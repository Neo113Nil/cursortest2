package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class zzcee implements Runnable {
    public final /* synthetic */ Collection zza;
    public final /* synthetic */ zzcfj zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ Future zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ Future zzf;
    public final /* synthetic */ zzcax zzg;

    public zzcee(zzcax zzcaxVar, Collection collection, zzcfj zzcfjVar, boolean z, Future future, boolean z2, Future future2) {
        this.zza = collection;
        this.zzb = zzcfjVar;
        this.zzc = z;
        this.zzd = future;
        this.zze = z2;
        this.zzf = future2;
        this.zzg = zzcaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbtx zzbtxVar;
        for (zzcfj zzcfjVar : this.zza) {
            if (zzcfjVar != this.zzb) {
                zzcfjVar.zza.zzl(zzcax.zza$1);
            }
        }
        if (this.zzc) {
            Future future = this.zzd;
            if (future != null) {
                future.cancel(false);
            }
            if (!this.zze) {
                zzcax zzcaxVar = this.zzg;
                if (zzcaxVar.zzu.decrementAndGet() == Integer.MIN_VALUE) {
                    zzbuf zzbufVar = zzcaxVar.zzd$1;
                    zzbufVar.zzb(new zzmu(this, 13));
                    zzbufVar.zza();
                }
            }
        }
        Future future2 = this.zzf;
        if (future2 != null) {
            future2.cancel(false);
        }
        zzcax zzcaxVar2 = this.zzg;
        zzyr zzyrVar = ((zzcby) zzcaxVar2.zzd.view).zzL;
        synchronized (zzyrVar.zzc) {
            try {
                ((HashSet) zzyrVar.zzd).remove(zzcaxVar2);
                if (((HashSet) zzyrVar.zzd).isEmpty()) {
                    zzbtxVar = (zzbtx) zzyrVar.zze;
                    zzyrVar.zzd = new HashSet();
                } else {
                    zzbtxVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbtxVar != null) {
            ((zzcby) zzyrVar.zzf).zzK.zzd(zzbtxVar);
        }
    }
}
