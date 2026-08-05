package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzib;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzz implements Runnable {
    final /* synthetic */ zzib zza;
    final /* synthetic */ zzai zzb;

    zzz(zzai zzaiVar, zzib zzibVar) {
        this.zza = zzibVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onPeerDisconnected");
        if (zzm == null) {
            return;
        }
        zzm.onPeerDisconnected(this.zza);
    }
}
