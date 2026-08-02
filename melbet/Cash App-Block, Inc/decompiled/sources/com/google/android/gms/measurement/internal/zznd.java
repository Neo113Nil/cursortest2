package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zznd implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zznl zza;

    public /* synthetic */ zznd(zznl zznlVar, int i) {
        this.$r8$classId = i;
        this.zza = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zznl zznlVar = this.zza;
        switch (i) {
            case 0:
                zznlVar.zzI();
                break;
            case 1:
                zzic zzicVar = (zzic) zznlVar.$$delegate_0;
                zzgb zzgbVar = zznlVar.zzb;
                if (zzgbVar == null) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zza("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar.zzz(zznlVar.zzah(false));
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e) {
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzb(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                zzic zzicVar2 = (zzic) zznlVar.$$delegate_0;
                zzgb zzgbVar2 = zznlVar.zzb;
                if (zzgbVar2 == null) {
                    zzgu zzguVar3 = zzicVar2.zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzd.zza("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar2.zzy(zznlVar.zzah(false));
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e2) {
                        zzgu zzguVar4 = zzicVar2.zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzd.zzb(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
