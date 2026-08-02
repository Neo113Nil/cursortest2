package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzyn extends zzyq {
    public final /* synthetic */ zzyq zza;
    public final /* synthetic */ zzyq zzb;

    public zzyn(zzyq zzyqVar, zzyq zzyqVar2) {
        this.zza = zzyqVar;
        this.zzb = zzyqVar2;
    }

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void zzb() {
        zzyq zzyqVar = this.zzb;
        try {
            this.zza.zzb();
        } finally {
            zzyqVar.zzb();
        }
    }
}
