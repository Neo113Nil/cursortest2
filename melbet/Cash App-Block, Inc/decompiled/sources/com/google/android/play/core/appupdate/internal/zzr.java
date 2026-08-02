package com.google.android.play.core.appupdate.internal;

/* loaded from: classes4.dex */
public final class zzr extends zzn {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzr(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                synchronized (((zzx) this.zza).zzg) {
                    try {
                        if (((zzx) this.zza).zzl.get() > 0 && ((zzx) this.zza).zzl.decrementAndGet() > 0) {
                            ((zzx) this.zza).zzc.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        zzx zzxVar = (zzx) this.zza;
                        if (zzxVar.zzn != null) {
                            zzxVar.zzc.zzd("Unbind from service.", new Object[0]);
                            zzx zzxVar2 = (zzx) this.zza;
                            zzxVar2.zzb.unbindService(zzxVar2.zzm);
                            zzx zzxVar3 = (zzx) this.zza;
                            zzxVar3.zzh = false;
                            zzxVar3.zzn = null;
                            zzxVar3.zzm = null;
                        }
                        ((zzx) this.zza).zzw();
                        return;
                    } finally {
                    }
                }
            default:
                zzx zzxVar4 = (zzx) ((com.google.android.play.core.review.internal.zzr) this.zza).zza;
                zzxVar4.zzc.zzd("unlinkToDeath", new Object[0]);
                zzxVar4.zzn.asBinder().unlinkToDeath(zzxVar4.zzk, 0);
                zzxVar4.zzn = null;
                zzxVar4.zzh = false;
                return;
        }
    }
}
