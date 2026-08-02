package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzmh implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzr zza;
    public final /* synthetic */ zznl zzb;

    public zzmh(zznl zznlVar, zzr zzrVar) {
        this.$r8$classId = 4;
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzr zzrVar = this.zza;
        zznl zznlVar = this.zzb;
        switch (i) {
            case 0:
                zzgb zzgbVar = zznlVar.zzb;
                zzic zzicVar = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar != null) {
                    try {
                        zzgbVar.zzt(zzrVar);
                    } catch (RemoteException e) {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzb(e, "Failed to reset data on the service: remote exception");
                    }
                    zznlVar.zzae();
                    break;
                } else {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zza("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                zzgb zzgbVar2 = zznlVar.zzb;
                zzic zzicVar2 = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar2 == null) {
                    zzgu zzguVar3 = zzicVar2.zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzd.zza("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        zzal zzalVar = zzicVar2.zzg;
                        zzfx zzfxVar = zzfy.zzaW;
                        if (zzalVar.zzp(null, zzfxVar)) {
                            zznlVar.zzm(zzgbVar2, null, zzrVar);
                        }
                        zzgbVar2.zzg(zzrVar);
                        zzicVar2.zzm().zzo();
                        zzicVar2.zzg.zzp(null, zzfxVar);
                        zznlVar.zzm(zzgbVar2, null, zzrVar);
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e2) {
                        zzgu zzguVar4 = zzicVar2.zzi;
                        zzic.zzP(zzguVar4);
                        zzguVar4.zzd.zzb(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            case 2:
                zzgb zzgbVar3 = zznlVar.zzb;
                zzic zzicVar3 = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar3 == null) {
                    zzgu zzguVar5 = zzicVar3.zzi;
                    zzic.zzP(zzguVar5);
                    zzguVar5.zzg.zza("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        zzgbVar3.zzA(zzrVar);
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e3) {
                        zzgu zzguVar6 = zzicVar3.zzi;
                        zzic.zzP(zzguVar6);
                        zzguVar6.zzd.zzb(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            case 3:
                zzgb zzgbVar4 = zznlVar.zzb;
                zzic zzicVar4 = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar4 == null) {
                    zzgu zzguVar7 = zzicVar4.zzi;
                    zzic.zzP(zzguVar7);
                    zzguVar7.zzd.zza("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        zzgbVar4.zzi(zzrVar);
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e4) {
                        zzgu zzguVar8 = zzicVar4.zzi;
                        zzic.zzP(zzguVar8);
                        zzguVar8.zzd.zzb(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
            default:
                zzgb zzgbVar5 = zznlVar.zzb;
                zzic zzicVar5 = (zzic) zznlVar.$$delegate_0;
                if (zzgbVar5 == null) {
                    zzgu zzguVar9 = zzicVar5.zzi;
                    zzic.zzP(zzguVar9);
                    zzguVar9.zzd.zza("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar5.zzv(zzrVar);
                        zznlVar.zzae();
                        break;
                    } catch (RemoteException e5) {
                        zzgu zzguVar10 = zzicVar5.zzi;
                        zzic.zzP(zzguVar10);
                        zzguVar10.zzd.zzb(e5, "Failed to send consent settings to the service");
                    }
                }
        }
    }

    public /* synthetic */ zzmh(zznl zznlVar, zzr zzrVar, int i) {
        this.$r8$classId = i;
        this.zza = zzrVar;
        this.zzb = zznlVar;
    }
}
