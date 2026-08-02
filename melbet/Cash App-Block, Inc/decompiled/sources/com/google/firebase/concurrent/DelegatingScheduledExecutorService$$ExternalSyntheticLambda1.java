package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.squareup.scannerview.SizeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda1 implements DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingScheduledExecutorService f$0;
    public final /* synthetic */ Runnable f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ TimeUnit f$4;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda1(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingScheduledExecutorService;
        this.f$1 = runnable;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(SizeMap sizeMap) {
        int i = this.$r8$classId;
        Runnable runnable = this.f$1;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f$0;
        switch (i) {
            case 0:
                return delegatingScheduledExecutorService.scheduler.scheduleAtFixedRate(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda4(delegatingScheduledExecutorService, runnable, sizeMap, 0), this.f$2, this.f$3, this.f$4);
            default:
                return delegatingScheduledExecutorService.scheduler.scheduleWithFixedDelay(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda4(delegatingScheduledExecutorService, runnable, sizeMap, 2), this.f$2, this.f$3, this.f$4);
        }
    }
}
