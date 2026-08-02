package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdq extends zzeo {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzez zzezVar, String str, int i) {
        super(zzezVar, true);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = str;
                Objects.requireNonNull(zzezVar);
                this.zzb = zzezVar;
                super(zzezVar, true);
                break;
            default:
                this.zza = str;
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
                zzcpVar.beginAdUnitExposure(this.zza, this.zzj);
                break;
            default:
                zzcp zzcpVar2 = this.zzb.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.endAdUnitExposure(this.zza, this.zzj);
                break;
        }
    }
}
