package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzib;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzy implements Runnable {
    final /* synthetic */ zzib zza;
    final /* synthetic */ zzai zzb;

    zzy(zzai zzaiVar, zzib zzibVar) {
        this.zza = zzibVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onPeerConnected");
        if (zzm == null) {
            return;
        }
        zzm.onPeerConnected(this.zza);
    }
}
