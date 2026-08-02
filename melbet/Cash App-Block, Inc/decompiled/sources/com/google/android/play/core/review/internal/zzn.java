package com.google.android.play.core.review.internal;

/* loaded from: classes4.dex */
public final class zzn extends zzj {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public /* synthetic */ zzn(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                synchronized (((zzt) this.zza).zzg) {
                    try {
                        if (((zzt) this.zza).zzl.get() > 0 && ((zzt) this.zza).zzl.decrementAndGet() > 0) {
                            ((zzt) this.zza).zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        zzt zztVar = (zzt) this.zza;
                        if (zztVar.zzn != null) {
                            zztVar.zzc.zzc("Unbind from service.", new Object[0]);
                            zzt zztVar2 = (zzt) this.zza;
                            zztVar2.zzb.unbindService(zztVar2.zzm);
                            zzt zztVar3 = (zzt) this.zza;
                            zztVar3.zzh = false;
                            zztVar3.zzn = null;
                            zztVar3.zzm = null;
                        }
                        ((zzt) this.zza).zzw();
                        return;
                    } finally {
                    }
                }
            default:
                zzt zztVar4 = (zzt) ((zzr) this.zza).zza;
                zztVar4.zzc.zzc("unlinkToDeath", new Object[0]);
                zztVar4.zzn.asBinder().unlinkToDeath(zztVar4.zzk, 0);
                zztVar4.zzn = null;
                zztVar4.zzh = false;
                return;
        }
    }
}
