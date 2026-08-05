package com.google.android.gms.wearable;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzad implements Runnable {
    final /* synthetic */ com.google.android.gms.wearable.internal.zzj zza;
    final /* synthetic */ zzai zzb;

    zzad(zzai zzaiVar, com.google.android.gms.wearable.internal.zzj zzjVar) {
        this.zza = zzjVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onEntityUpdate");
        if (zzm == null) {
            return;
        }
        zzm.onEntityUpdate(this.zza);
    }
}
