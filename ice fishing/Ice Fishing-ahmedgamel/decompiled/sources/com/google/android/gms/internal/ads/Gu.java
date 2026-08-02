package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class Gu implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f25930n;

    /* renamed from: u, reason: collision with root package name */
    public final RD f25931u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f25932v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public boolean f25933w = false;

    public Gu(ScheduledExecutorService scheduledExecutorService, RD rd) {
        this.f25930n = scheduledExecutorService;
        this.f25931u = rd;
    }

    public final synchronized void a(Runnable runnable, long j6) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f25933w) {
                    C4906k.f40186C.f40195g.i(this);
                    this.f25933w = true;
                }
                C4906k.f40186C.f40198k.getClass();
                Fu fu = new Fu(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j6));
                ScheduledFuture<?> schedule = this.f25930n.schedule(new RunnableC3493kj(27, fu), j6, timeUnit);
                fu.f25654c = schedule;
                this.f25932v.put(schedule, fu);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z6) {
        if (z6) {
            this.f25931u.execute(new RunnableC3493kj(28, this));
        }
    }
}
