package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzeh extends zzeo {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzez zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzez zzezVar, boolean z) {
        super(zzezVar, true);
        this.zza = z;
        this.zzb = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    public final void zza() {
        zzcp zzcpVar = this.zzb.zzj;
        com.google.android.gms.common.internal.zzae.checkNotNull(zzcpVar);
        zzcpVar.setDataCollectionEnabled(this.zza);
    }
}
