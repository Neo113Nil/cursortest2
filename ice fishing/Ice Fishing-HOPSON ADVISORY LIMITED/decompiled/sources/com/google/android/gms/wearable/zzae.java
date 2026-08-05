package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzbq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzae implements Runnable {
    final /* synthetic */ zzbq zza;
    final /* synthetic */ zzai zzb;

    zzae(zzai zzaiVar, zzbq zzbqVar) {
        this.zza = zzbqVar;
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService zzm = this.zzb.zzm("onChannelEvent");
        if (zzm == null) {
            return;
        }
        zzbq zzbqVar = this.zza;
        zzbqVar.zza(zzm);
        zzbqVar.zza(zzm.zzi());
    }
}
