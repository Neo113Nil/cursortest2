package com.google.android.gms.internal.measurement;

import com.android.volley.Request;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzqi implements zzqm {
    public static boolean zza;
    public final Supplier zzb;
    public final int zzc = Math.max(5, 10);
    public final zzqh zzd = zzqh.zza;

    public zzqi(Supplier supplier) {
        this.zzb = supplier;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!zza) {
                    zzpv zzpvVar = new zzpv(this, 3);
                    long j = this.zzc;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) this.zzb.get();
                    Request.AnonymousClass1 anonymousClass1 = new Request.AnonymousClass1(this, zzpvVar, moreExecutors$ScheduledListeningDecorator, j);
                    moreExecutors$ScheduledListeningDecorator.getClass();
                    TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(Executors.callable(anonymousClass1, null));
                    zzh.zza((ListenableFuture) new MoreExecutors$ScheduledListeningDecorator.ListenableScheduledTask(trustedListenableFutureTask, moreExecutors$ScheduledListeningDecorator.delegate.schedule(trustedListenableFutureTask, j, timeUnit)));
                    zza = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
