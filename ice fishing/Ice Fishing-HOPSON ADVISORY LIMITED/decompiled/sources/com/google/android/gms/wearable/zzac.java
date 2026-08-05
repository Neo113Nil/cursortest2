package com.google.android.gms.wearable;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzac implements Runnable {
    final /* synthetic */ com.google.android.gms.wearable.internal.zzl zza;
    final /* synthetic */ zzai zzb;

    zzac(zzai zzaiVar, com.google.android.gms.wearable.internal.zzl zzlVar) {
        this.zza = zzlVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onNotificationReceived");
        if (zzm == null) {
            return;
        }
        zzm.onNotificationReceived(this.zza);
    }
}
