package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: classes4.dex */
public final class zzds extends zzbm implements zzcv {
    public final /* synthetic */ com.google.android.gms.tasks.zzc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdf zzdfVar, com.google.android.gms.tasks.zzc zzcVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.zza = zzcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void zze() {
        this.zza.run();
    }
}
