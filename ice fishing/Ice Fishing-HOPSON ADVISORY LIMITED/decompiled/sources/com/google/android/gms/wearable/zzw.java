package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzw implements Runnable {
    final /* synthetic */ DataHolder zza;
    final /* synthetic */ zzai zzb;

    zzw(zzai zzaiVar, DataHolder dataHolder) {
        this.zza = dataHolder;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataEventBuffer dataEventBuffer = new DataEventBuffer(this.zza);
        try {
            WearableListenerService zzm = this.zzb.zzm("onDataChanged");
            if (zzm != null) {
                zzm.onDataChanged(dataEventBuffer);
            }
        } finally {
            dataEventBuffer.release();
        }
    }
}
