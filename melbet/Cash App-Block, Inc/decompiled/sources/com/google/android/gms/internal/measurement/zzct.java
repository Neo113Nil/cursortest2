package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzct extends zaa implements zzcv {
    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final void zze() {
        zzd(zza());
    }
}
