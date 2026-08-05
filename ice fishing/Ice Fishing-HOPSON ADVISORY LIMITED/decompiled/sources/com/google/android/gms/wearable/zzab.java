package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzao;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzab implements Runnable {
    final /* synthetic */ zzao zza;
    final /* synthetic */ zzai zzb;

    zzab(zzai zzaiVar, zzao zzaoVar) {
        this.zza = zzaoVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onConnectedCapabilityChanged");
        if (zzm == null) {
            return;
        }
        zzm.onCapabilityChanged(this.zza);
    }
}
