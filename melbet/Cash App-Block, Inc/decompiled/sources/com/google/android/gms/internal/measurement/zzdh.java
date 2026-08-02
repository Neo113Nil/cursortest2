package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdh extends zzeo {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ zzez zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzez zzezVar, zzdd zzddVar, String str, String str2) {
        super(zzezVar, true);
        this.$r8$classId = 2;
        this.zzc = zzddVar;
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzezVar);
        this.zzd = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = this.zzd.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.clearConditionalUserProperty(this.zza, this.zzb, (Bundle) this.zzc);
                break;
            case 1:
                zzcp zzcpVar2 = this.zzd.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.getConditionalUserProperties(this.zza, this.zzb, (zzcm) this.zzc);
                break;
            default:
                zzcp zzcpVar3 = this.zzd.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar3);
                zzcpVar3.setCurrentScreenByScionActivityInfo((zzdd) this.zzc, this.zza, this.zzb, this.zzi);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public void zzb() {
        switch (this.$r8$classId) {
            case 1:
                ((zzcm) this.zzc).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdh(zzez zzezVar, String str, String str2, Object obj, int i) {
        super(zzezVar, true);
        this.$r8$classId = i;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = zzezVar;
    }
}
