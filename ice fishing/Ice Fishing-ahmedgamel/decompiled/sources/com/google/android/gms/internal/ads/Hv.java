package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Hv {

    /* renamed from: a, reason: collision with root package name */
    public final Cv f26151a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26152b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public volatile ScheduledFuture f26153c;

    /* renamed from: d, reason: collision with root package name */
    public final Fv f26154d;

    public Hv(Cv cv, ScheduledExecutorService scheduledExecutorService, long j6, Fv fv) {
        this.f26154d = fv;
        this.f26151a = cv;
        if (j6 > 0) {
            this.f26153c = scheduledExecutorService.schedule(new RunnableC3888s0(9, this, cv, fv), j6, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.f26152b.compareAndSet(false, true)) {
            if (this.f26153c != null) {
                this.f26153c.cancel(false);
            }
            this.f26151a.b(this.f26154d, false);
        }
    }
}
