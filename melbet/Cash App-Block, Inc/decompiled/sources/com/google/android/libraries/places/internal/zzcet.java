package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcet extends zzbph {
    public long zzb;
    public final /* synthetic */ zzcax zzc;
    public final zzcfj zzd;

    public zzcet(zzcax zzcaxVar, zzcfj zzcfjVar) {
        this.zzc = zzcaxVar;
        this.zzd = zzcfjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbub
    public final void zza(long j) {
        zzcax zzcaxVar = this.zzc;
        if (zzcaxVar.zzr.zzf != null) {
            return;
        }
        synchronized (zzcaxVar.zzl) {
            try {
                if (zzcaxVar.zzr.zzf == null) {
                    zzcfj zzcfjVar = this.zzd;
                    if (!zzcfjVar.zzb) {
                        long j2 = this.zzb + j;
                        this.zzb = j2;
                        long j3 = zzcaxVar.zzw;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > zzcaxVar.zzn) {
                            zzcfjVar.zzc = true;
                        } else {
                            long addAndGet = zzcaxVar.zzm.zza.addAndGet(j2 - j3);
                            zzcaxVar.zzw = this.zzb;
                            if (addAndGet > zzcaxVar.zzo) {
                                zzcfjVar.zzc = true;
                            }
                        }
                        zzcee zzaf = zzcfjVar.zzc ? zzcaxVar.zzaf(zzcfjVar) : null;
                        if (zzaf != null) {
                            zzaf.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
