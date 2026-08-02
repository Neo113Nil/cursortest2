package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class zzdz extends zzeo {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzez zzezVar, String str, String str2, boolean z, zzcm zzcmVar) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = zzcmVar;
        this.zze = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        switch (this.$r8$classId) {
            case 0:
                zzcp zzcpVar = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
                zzcpVar.getUserProperties(this.zza, this.zzb, this.zzc, (zzcm) this.zzd);
                break;
            default:
                long j = this.zzi;
                long j2 = this.zzj;
                zzcp zzcpVar2 = this.zze.zzj;
                com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar2);
                zzcpVar2.logEventWithElapsedTime(this.zza, this.zzb, (Bundle) this.zzd, this.zzc, true, j, j2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public void zzb() {
        switch (this.$r8$classId) {
            case 0:
                ((zzcm) this.zzd).zzb(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzez zzezVar, String str, String str2, Bundle bundle, boolean z) {
        super(zzezVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = z;
        this.zze = zzezVar;
    }
}
