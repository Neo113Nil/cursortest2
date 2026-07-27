package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2863Xk extends AbstractC2982bM {

    /* renamed from: A, reason: collision with root package name */
    public long f28677A;

    /* renamed from: B, reason: collision with root package name */
    public long f28678B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28679C;

    /* renamed from: D, reason: collision with root package name */
    public ScheduledFuture f28680D;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f28681E;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f28682v;

    /* renamed from: w, reason: collision with root package name */
    public final S2.a f28683w;

    /* renamed from: x, reason: collision with root package name */
    public final C3165eo f28684x;

    /* renamed from: y, reason: collision with root package name */
    public long f28685y;

    /* renamed from: z, reason: collision with root package name */
    public long f28686z;

    public C2863Xk(ScheduledExecutorService scheduledExecutorService, S2.a aVar, C3165eo c3165eo) {
        super(Collections.EMPTY_SET);
        this.f28685y = -1L;
        this.f28686z = -1L;
        this.f28677A = -1L;
        this.f28678B = -1L;
        this.f28679C = false;
        this.f28682v = scheduledExecutorService;
        this.f28683w = aVar;
        this.f28684x = c3165eo;
    }

    public final synchronized void v1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        t2.C.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f28679C) {
                long j9 = this.f28677A;
                if (j9 <= 0 || millis >= j9) {
                    millis = j9;
                }
                this.f28677A = millis;
                return;
            }
            this.f28683w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3151ea c3151ea = AbstractC3368ia.Je;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                long j10 = this.f28685y;
                if (elapsedRealtime >= j10 || j10 - elapsedRealtime > millis) {
                    x1(millis);
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.gf)).booleanValue()) {
                        C2593Hm a9 = this.f28684x.a();
                        a9.r(NativeAdvancedJsUtils.f18064p, "rtnc");
                        a9.v();
                    }
                }
            } else {
                long j11 = this.f28685y;
                if (elapsedRealtime > j11 || j11 - elapsedRealtime > millis) {
                    x1(millis);
                }
            }
        }
    }

    public final synchronized void w1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        t2.C.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f28679C) {
                long j9 = this.f28678B;
                if (j9 <= 0 || millis >= j9) {
                    millis = j9;
                }
                this.f28678B = millis;
                return;
            }
            this.f28683w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Je)).booleanValue()) {
                if (elapsedRealtime == this.f28686z) {
                    t2.C.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j10 = this.f28686z;
                if (elapsedRealtime >= j10 || j10 - elapsedRealtime > millis) {
                    z1(millis);
                }
            } else {
                long j11 = this.f28686z;
                if (elapsedRealtime > j11 || j11 - elapsedRealtime > millis) {
                    z1(millis);
                }
            }
        }
    }

    public final synchronized void x() {
        this.f28679C = false;
        x1(0L);
    }

    public final synchronized void x1(long j9) {
        try {
            ScheduledFuture scheduledFuture = this.f28680D;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f28680D.cancel(false);
            }
            this.f28683w.getClass();
            this.f28685y = SystemClock.elapsedRealtime() + j9;
            this.f28680D = this.f28682v.schedule(new RunnableC2829Vk(this, 0), j9, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void z1(long j9) {
        try {
            ScheduledFuture scheduledFuture = this.f28681E;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f28681E.cancel(false);
            }
            this.f28683w.getClass();
            this.f28686z = SystemClock.elapsedRealtime() + j9;
            this.f28681E = this.f28682v.schedule(new RunnableC2829Vk(this, 1), j9, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
