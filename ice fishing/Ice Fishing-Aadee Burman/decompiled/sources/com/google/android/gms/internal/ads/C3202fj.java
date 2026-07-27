package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3202fj implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f30409n;

    /* renamed from: u, reason: collision with root package name */
    public final T2.a f30410u;

    /* renamed from: v, reason: collision with root package name */
    public ScheduledFuture f30411v;

    /* renamed from: w, reason: collision with root package name */
    public long f30412w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f30413x = -1;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC3588mt f30414y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30415z = false;

    public C3202fj(ScheduledExecutorService scheduledExecutorService, T2.a aVar) {
        this.f30409n = scheduledExecutorService;
        this.f30410u = aVar;
        C4835j.f39730C.f39739g.i(this);
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z3) {
        ScheduledFuture scheduledFuture;
        if (z3) {
            synchronized (this) {
                try {
                    if (this.f30415z) {
                        if (this.f30413x > 0 && (scheduledFuture = this.f30411v) != null && scheduledFuture.isCancelled()) {
                            this.f30411v = this.f30409n.schedule(this.f30414y, this.f30413x, TimeUnit.MILLISECONDS);
                        }
                        this.f30415z = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f30415z) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f30411v;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f30413x = -1L;
                } else {
                    this.f30411v.cancel(true);
                    long j6 = this.f30412w;
                    this.f30410u.getClass();
                    this.f30413x = j6 - SystemClock.elapsedRealtime();
                }
                this.f30415z = true;
            } finally {
            }
        }
    }
}
