package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public class WaitForActivationDelayBarrier implements ActivationBarrier {

    /* renamed from: a, reason: collision with root package name */
    private long f3867a;

    /* renamed from: b, reason: collision with root package name */
    private final SystemTimeProvider f3868b;

    public static class ActivationBarrierHelper {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3869a = false;

        /* renamed from: b, reason: collision with root package name */
        private final a f3870b;

        /* renamed from: c, reason: collision with root package name */
        private final WaitForActivationDelayBarrier f3871c;

        public ActivationBarrierHelper(Runnable runnable, WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.f3870b = new a(this, runnable);
            this.f3871c = waitForActivationDelayBarrier;
        }

        public void subscribeIfNeeded(long j2, ICommonExecutor iCommonExecutor) {
            if (this.f3869a) {
                iCommonExecutor.execute(new b(this));
            } else {
                this.f3871c.subscribe(j2, iCommonExecutor, this.f3870b);
            }
        }
    }

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    public void activate() {
        this.f3867a = this.f3868b.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier
    public void subscribe(long j2, ICommonExecutor iCommonExecutor, ActivationBarrierCallback activationBarrierCallback) {
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), Math.max(j2 - (this.f3868b.currentTimeMillis() - this.f3867a), 0L));
    }

    public WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.f3868b = systemTimeProvider;
    }
}
