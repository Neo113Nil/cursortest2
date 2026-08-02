package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdu extends zzeo {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcm zza;
    public final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzez zzezVar, zzcm zzcmVar, int i) {
        super(zzezVar, true);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.zzb = zzezVar;
                super(zzezVar, true);
                break;
            case 2:
                this.zza = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.zzb = zzezVar;
                super(zzezVar, true);
                break;
            default:
                this.zza = zzcmVar;
                Objects.requireNonNull(zzezVar);
                this.zzb = zzezVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.getGmpAppId(this.zza);
                break;
            case 1:
                zzcp zzcpVar2 = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.getCachedAppInstanceId(this.zza);
                break;
            case 2:
                zzcp zzcpVar3 = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar3);
                zzcpVar3.generateEventId(this.zza);
                break;
            case 3:
                zzcp zzcpVar4 = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar4);
                zzcpVar4.getCurrentScreenName(this.zza);
                break;
            default:
                zzcp zzcpVar5 = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar5);
                zzcpVar5.getCurrentScreenClass(this.zza);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zzb() {
        int i = this.$r8$classId;
        zzcm zzcmVar = this.zza;
        switch (i) {
            case 0:
                zzcmVar.zzb(null);
                break;
            case 1:
                zzcmVar.zzb(null);
                break;
            case 2:
                zzcmVar.zzb(null);
                break;
            case 3:
                zzcmVar.zzb(null);
                break;
            default:
                zzcmVar.zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdu(zzez zzezVar, zzcm zzcmVar, int i, boolean z) {
        super(zzezVar, true);
        this.$r8$classId = i;
        this.zza = zzcmVar;
        this.zzb = zzezVar;
    }
}
