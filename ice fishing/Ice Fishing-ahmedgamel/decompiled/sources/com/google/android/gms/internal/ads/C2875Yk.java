package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Yk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2875Yk extends OK {

    /* renamed from: A, reason: collision with root package name */
    public long f28721A;

    /* renamed from: B, reason: collision with root package name */
    public long f28722B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f28723C;

    /* renamed from: D, reason: collision with root package name */
    public ScheduledFuture f28724D;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f28725E;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f28726v;

    /* renamed from: w, reason: collision with root package name */
    public final T2.a f28727w;

    /* renamed from: x, reason: collision with root package name */
    public final C3153eo f28728x;

    /* renamed from: y, reason: collision with root package name */
    public long f28729y;

    /* renamed from: z, reason: collision with root package name */
    public long f28730z;

    public C2875Yk(ScheduledExecutorService scheduledExecutorService, T2.a aVar, C3153eo c3153eo) {
        super(Collections.EMPTY_SET);
        this.f28729y = -1L;
        this.f28730z = -1L;
        this.f28721A = -1L;
        this.f28722B = -1L;
        this.f28723C = false;
        this.f28726v = scheduledExecutorService;
        this.f28727w = aVar;
        this.f28728x = c3153eo;
    }

    public final synchronized void F() {
        this.f28723C = false;
        U1(0L);
    }

    public final synchronized void Q1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        u2.z.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f28723C) {
                long j6 = this.f28721A;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f28721A = millis;
                return;
            }
            this.f28727w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3301ha c3301ha = AbstractC3569ma.Pe;
            q2.r rVar = q2.r.f40207e;
            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                long j9 = this.f28729y;
                if (elapsedRealtime >= j9 || j9 - elapsedRealtime > millis) {
                    U1(millis);
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.mf)).booleanValue()) {
                        S0.e a9 = this.f28728x.a();
                        a9.v(NativeAdvancedJsUtils.f17906p, "rtnc");
                        a9.B();
                    }
                }
            } else {
                long j10 = this.f28729y;
                if (elapsedRealtime > j10 || j10 - elapsedRealtime > millis) {
                    U1(millis);
                }
            }
        }
    }

    public final synchronized void T1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        u2.z.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f28723C) {
                long j6 = this.f28722B;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f28722B = millis;
                return;
            }
            this.f28727w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Pe)).booleanValue()) {
                if (elapsedRealtime == this.f28730z) {
                    u2.z.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j9 = this.f28730z;
                if (elapsedRealtime >= j9 || j9 - elapsedRealtime > millis) {
                    V1(millis);
                }
            } else {
                long j10 = this.f28730z;
                if (elapsedRealtime > j10 || j10 - elapsedRealtime > millis) {
                    V1(millis);
                }
            }
        }
    }

    public final synchronized void U1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f28724D;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f28724D.cancel(false);
            }
            this.f28727w.getClass();
            this.f28729y = SystemClock.elapsedRealtime() + j6;
            this.f28724D = this.f28726v.schedule(new RunnableC2859Xk(this, 0), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void V1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f28725E;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f28725E.cancel(false);
            }
            this.f28727w.getClass();
            this.f28730z = SystemClock.elapsedRealtime() + j6;
            this.f28725E = this.f28726v.schedule(new RunnableC2859Xk(this, 1), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
