package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class zzed extends zzeo {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ zzcm zzb;
    public final /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzey zzeyVar, Activity activity, zzcm zzcmVar) {
        super(zzeyVar.zza, true);
        this.zza = activity;
        this.zzb = zzcmVar;
        this.zzc = zzeyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = ((zzez) this.zzc).zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.getMaxUserProperties((String) this.zza, this.zzb);
                break;
            default:
                zzcp zzcpVar2 = ((zzey) this.zzc).zza.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.onActivitySaveInstanceStateByScionActivityInfo(zzdd.zza((Activity) this.zza), this.zzb, this.zzj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public void zzb() {
        switch (this.$r8$classId) {
            case 0:
                this.zzb.zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzez zzezVar, String str, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = zzcmVar;
        this.zzc = zzezVar;
    }
}
