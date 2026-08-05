package com.google.android.gms.wearable;

import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzaa implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ zzai zzb;

    zzaa(zzai zzaiVar, List list) {
        this.zza = list;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onConnectedNodes");
        if (zzm == null) {
            return;
        }
        zzm.onConnectedNodes(this.zza);
    }
}
