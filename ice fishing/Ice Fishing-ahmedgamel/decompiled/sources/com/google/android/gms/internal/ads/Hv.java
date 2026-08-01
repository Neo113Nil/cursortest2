package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Hv {

    /* renamed from: a, reason: collision with root package name */
    public final Cv f25408a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25409b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public volatile ScheduledFuture f25410c;

    /* renamed from: d, reason: collision with root package name */
    public final Fv f25411d;

    public Hv(Cv cv, ScheduledExecutorService scheduledExecutorService, long j6, Fv fv) {
        this.f25411d = fv;
        this.f25408a = cv;
        if (j6 > 0) {
            this.f25410c = scheduledExecutorService.schedule(new RunnableC3865s0(9, this, cv, fv), j6, TimeUnit.MILLISECONDS);
        }
    }

    public final void a() {
        if (this.f25409b.compareAndSet(false, true)) {
            if (this.f25410c != null) {
                this.f25410c.cancel(false);
            }
            this.f25408a.b(this.f25411d, false);
        }
    }
}
