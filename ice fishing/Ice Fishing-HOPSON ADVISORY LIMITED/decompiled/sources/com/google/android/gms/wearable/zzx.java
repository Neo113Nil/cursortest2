package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzhk;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzx implements Runnable {
    final /* synthetic */ zzhk zza;
    final /* synthetic */ zzai zzb;

    zzx(zzai zzaiVar, zzhk zzhkVar) {
        this.zza = zzhkVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onMessageReceived");
        if (zzm == null) {
            return;
        }
        zzm.onMessageReceived(this.zza);
    }
}
