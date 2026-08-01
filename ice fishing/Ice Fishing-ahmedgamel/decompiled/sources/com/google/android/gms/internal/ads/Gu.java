package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class Gu implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f25158n;

    /* renamed from: u, reason: collision with root package name */
    public final RD f25159u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f25160v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public boolean f25161w = false;

    public Gu(ScheduledExecutorService scheduledExecutorService, RD rd) {
        this.f25158n = scheduledExecutorService;
        this.f25159u = rd;
    }

    public final synchronized void a(Runnable runnable, long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f25161w) {
                    C4835j.f39733C.f39742g.i(this);
                    this.f25161w = true;
                }
                C4835j.f39733C.f39745k.getClass();
                Fu fu = new Fu(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j6));
                ScheduledFuture<?> schedule = this.f25158n.schedule(new RunnableC3470kj(27, fu), j6, timeUnit);
                fu.f24864c = schedule;
                this.f25160v.put(schedule, fu);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z3) {
        if (z3) {
            this.f25159u.execute(new RunnableC3470kj(28, this));
        }
    }
}
