package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class zzcfu extends zzie {
    public final AtomicIntegerFieldUpdater zza;

    public /* synthetic */ zzcfu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.libraries.places.internal.zzie
    public final boolean zza(zzcfw zzcfwVar) {
        return this.zza.compareAndSet(zzcfwVar, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.zzie
    public final void zzb(zzcfw zzcfwVar) {
        this.zza.set(zzcfwVar, 0);
    }
}
