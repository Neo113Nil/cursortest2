package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3225fj implements B8 {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f31197n;

    /* renamed from: u, reason: collision with root package name */
    public final V2.a f31198u;

    /* renamed from: v, reason: collision with root package name */
    public ScheduledFuture f31199v;

    /* renamed from: w, reason: collision with root package name */
    public long f31200w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f31201x = -1;

    /* renamed from: y, reason: collision with root package name */
    public RunnableC3611mt f31202y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f31203z = false;

    public C3225fj(ScheduledExecutorService scheduledExecutorService, V2.a aVar) {
        this.f31197n = scheduledExecutorService;
        this.f31198u = aVar;
        C4906k.f40186C.f40195g.i(this);
    }

    @Override // com.google.android.gms.internal.ads.B8
    public final void e0(boolean z6) {
        ScheduledFuture scheduledFuture;
        if (z6) {
            synchronized (this) {
                try {
                    if (this.f31203z) {
                        if (this.f31201x > 0 && (scheduledFuture = this.f31199v) != null && scheduledFuture.isCancelled()) {
                            this.f31199v = this.f31197n.schedule(this.f31202y, this.f31201x, TimeUnit.MILLISECONDS);
                        }
                        this.f31203z = false;
                        return;
                    }
                    return;
                } finally {
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f31203z) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f31199v;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f31201x = -1L;
                } else {
                    this.f31199v.cancel(true);
                    long j6 = this.f31200w;
                    this.f31198u.getClass();
                    this.f31201x = j6 - SystemClock.elapsedRealtime();
                }
                this.f31203z = true;
            } finally {
            }
        }
    }
}
