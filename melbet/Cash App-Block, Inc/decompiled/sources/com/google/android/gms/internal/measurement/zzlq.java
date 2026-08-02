package com.google.android.gms.internal.measurement;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.google.common.util.concurrent.TrustedListenableFutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class zzlq implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Supplier zza;

    public /* synthetic */ zzlq(Supplier supplier, int i) {
        this.$r8$classId = i;
        this.zza = supplier;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        int i = this.$r8$classId;
        Supplier supplier = this.zza;
        switch (i) {
            case 0:
                Object obj = zzlk.zzb;
                return (zzqm) ((Optional) supplier.get()).orNull();
            default:
                MoreExecutors$ScheduledListeningDecorator moreExecutors$ScheduledListeningDecorator = (MoreExecutors$ScheduledListeningDecorator) supplier.get();
                moreExecutors$ScheduledListeningDecorator.getClass();
                TrustedListenableFutureTask trustedListenableFutureTask = new TrustedListenableFutureTask(zzrd.zza);
                return new MoreExecutors$ScheduledListeningDecorator.ListenableScheduledTask(trustedListenableFutureTask, moreExecutors$ScheduledListeningDecorator.delegate.schedule(trustedListenableFutureTask, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
