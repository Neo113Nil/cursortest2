package com.google.android.gms.internal.wearable;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbn extends zzbd {
    final /* synthetic */ zzbo zza;
    private final Callable zzb;

    zzbn(zzbo zzboVar, Callable callable) {
        Objects.requireNonNull(zzboVar);
        this.zza = zzboVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.wearable.zzbd
    final boolean zza() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.wearable.zzbd
    final Object zzb() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.wearable.zzbd
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.android.gms.internal.wearable.zzbd
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.wearable.zzbd
    final String zzf() {
        return this.zzb.toString();
    }
}
