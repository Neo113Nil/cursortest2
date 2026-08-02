package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes4.dex */
public final class zzeu extends zzeo {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ zzey zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeu(zzey zzeyVar, Activity activity, int i) {
        super(zzeyVar.zza, true);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = activity;
                this.zzb = zzeyVar;
                super(zzeyVar.zza, true);
                break;
            case 2:
                this.zza = activity;
                this.zzb = zzeyVar;
                super(zzeyVar.zza, true);
                break;
            default:
                this.zza = activity;
                this.zzb = zzeyVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = this.zzb.zza.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.onActivityPausedByScionActivityInfo(zzdd.zza(this.zza), this.zzj);
                break;
            case 1:
                zzcp zzcpVar2 = this.zzb.zza.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.onActivityStoppedByScionActivityInfo(zzdd.zza(this.zza), this.zzj);
                break;
            default:
                zzcp zzcpVar3 = this.zzb.zza.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar3);
                zzcpVar3.onActivityDestroyedByScionActivityInfo(zzdd.zza(this.zza), this.zzj);
                break;
        }
    }
}
