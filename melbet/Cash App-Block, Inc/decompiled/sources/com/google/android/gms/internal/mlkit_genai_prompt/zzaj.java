package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes4.dex */
public final class zzaj extends zaa implements zzal {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.aicore.aidl.ICancellationCallback", 6);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzal
    public final void zzd$1() {
        Parcel zza = zza();
        try {
            this.zaa.transact(2, zza, null, 1);
        } finally {
            zza.recycle();
        }
    }
}
