package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Yk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2898Yk extends OK {

    /* renamed from: A, reason: collision with root package name */
    public long f29496A;

    /* renamed from: B, reason: collision with root package name */
    public long f29497B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f29498C;

    /* renamed from: D, reason: collision with root package name */
    public ScheduledFuture f29499D;

    /* renamed from: E, reason: collision with root package name */
    public ScheduledFuture f29500E;

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledExecutorService f29501v;

    /* renamed from: w, reason: collision with root package name */
    public final V2.a f29502w;

    /* renamed from: x, reason: collision with root package name */
    public final C3230fo f29503x;

    /* renamed from: y, reason: collision with root package name */
    public long f29504y;

    /* renamed from: z, reason: collision with root package name */
    public long f29505z;

    public C2898Yk(ScheduledExecutorService scheduledExecutorService, V2.a aVar, C3230fo c3230fo) {
        super(Collections.EMPTY_SET);
        this.f29504y = -1L;
        this.f29505z = -1L;
        this.f29496A = -1L;
        this.f29497B = -1L;
        this.f29498C = false;
        this.f29501v = scheduledExecutorService;
        this.f29502w = aVar;
        this.f29503x = c3230fo;
    }

    public final synchronized void F() {
        this.f29498C = false;
        U1(0L);
    }

    public final synchronized void R1(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        w2.z.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f29498C) {
                long j6 = this.f29496A;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f29496A = millis;
                return;
            }
            this.f29502w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3324ha c3324ha = AbstractC3592ma.Pe;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                long j9 = this.f29504y;
                if (elapsedRealtime >= j9 || j9 - elapsedRealtime > millis) {
                    U1(millis);
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.mf)).booleanValue()) {
                        S0.e a9 = this.f29503x.a();
                        a9.M(NativeAdvancedJsUtils.f18693p, "rtnc");
                        a9.P();
                    }
                }
            } else {
                long j10 = this.f29504y;
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
        w2.z.k(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f29498C) {
                long j6 = this.f29497B;
                if (j6 <= 0 || millis >= j6) {
                    millis = j6;
                }
                this.f29497B = millis;
                return;
            }
            this.f29502w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Pe)).booleanValue()) {
                if (elapsedRealtime == this.f29505z) {
                    w2.z.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j9 = this.f29505z;
                if (elapsedRealtime >= j9 || j9 - elapsedRealtime > millis) {
                    V1(millis);
                }
            } else {
                long j10 = this.f29505z;
                if (elapsedRealtime > j10 || j10 - elapsedRealtime > millis) {
                    V1(millis);
                }
            }
        }
    }

    public final synchronized void U1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f29499D;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f29499D.cancel(false);
            }
            this.f29502w.getClass();
            this.f29504y = SystemClock.elapsedRealtime() + j6;
            this.f29499D = this.f29501v.schedule(new RunnableC2882Xk(this, 0), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void V1(long j6) {
        try {
            ScheduledFuture scheduledFuture = this.f29500E;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f29500E.cancel(false);
            }
            this.f29502w.getClass();
            this.f29505z = SystemClock.elapsedRealtime() + j6;
            this.f29500E = this.f29501v.schedule(new RunnableC2882Xk(this, 1), j6, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
