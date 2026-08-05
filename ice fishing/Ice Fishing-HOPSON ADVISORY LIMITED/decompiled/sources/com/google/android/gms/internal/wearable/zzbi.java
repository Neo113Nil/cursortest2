package com.google.android.gms.internal.wearable;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbi extends zzaw implements ScheduledFuture, zzbf {
    private final ScheduledFuture zza;

    zzbi(zzbf zzbfVar, ScheduledFuture scheduledFuture) {
        super(zzbfVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.wearable.zzav, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zzb().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
