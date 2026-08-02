package com.google.android.gms.measurement.internal;

import com.fillr.browsersdk.Fillr;
import com.google.android.gms.internal.measurement.zzcs;

/* loaded from: classes4.dex */
public final class zzi implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcs zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public /* synthetic */ zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcs zzcsVar, int i) {
        this.$r8$classId = i;
        this.zza = zzcsVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                zznl zzt = this.zzb.zza.zzt();
                zzcs zzcsVar = this.zza;
                zzt.zzg();
                zzt.zzb$1();
                zzt.zzaf(new Fillr.AnonymousClass2(zzt, zzt.zzah(false), zzcsVar, false, 16));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.zzb;
                zzpp zzppVar = appMeasurementDynamiteService.zza.zzl;
                zzic.zzN(zzppVar);
                zzic zzicVar = appMeasurementDynamiteService.zza;
                if (zzicVar.zzB != null && zzicVar.zzB.booleanValue()) {
                    z = true;
                }
                zzppVar.zzas(this.zza, z);
                break;
        }
    }
}
