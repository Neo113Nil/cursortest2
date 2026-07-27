package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2957b5 extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f29209n;

    /* renamed from: u, reason: collision with root package name */
    public final C2991bm f29210u;

    /* renamed from: v, reason: collision with root package name */
    public final C3709p5 f29211v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f29212w = false;

    /* renamed from: x, reason: collision with root package name */
    public final Ux f29213x;

    public C2957b5(PriorityBlockingQueue priorityBlockingQueue, C2991bm c2991bm, C3709p5 c3709p5, Ux ux) {
        this.f29209n = priorityBlockingQueue;
        this.f29210u = c2991bm;
        this.f29211v = c3709p5;
        this.f29213x = ux;
    }

    public final void a() {
        Ux ux = this.f29213x;
        AbstractC3171f5 abstractC3171f5 = (AbstractC3171f5) this.f29209n.take();
        SystemClock.elapsedRealtime();
        abstractC3171f5.c();
        Object obj = null;
        try {
            try {
                abstractC3171f5.a("network-queue-take");
                synchronized (abstractC3171f5.f30046x) {
                }
                TrafficStats.setThreadStatsTag(abstractC3171f5.f30045w);
                C3064d5 h9 = this.f29210u.h(abstractC3171f5);
                abstractC3171f5.a("network-http-complete");
                if (h9.f29711e && abstractC3171f5.g()) {
                    abstractC3171f5.b("not-modified");
                    abstractC3171f5.k();
                } else {
                    com.bumptech.glide.manager.o h10 = abstractC3171f5.h(h9);
                    abstractC3171f5.a("network-parse-complete");
                    W4 w42 = (W4) h10.f23465v;
                    if (w42 != null) {
                        this.f29211v.q(abstractC3171f5.d(), w42);
                        abstractC3171f5.a("network-cache-written");
                    }
                    synchronized (abstractC3171f5.f30046x) {
                        abstractC3171f5.f30038B = true;
                    }
                    ux.l(abstractC3171f5, h10, null);
                    abstractC3171f5.j(h10);
                }
            } catch (C3279h5 e9) {
                SystemClock.elapsedRealtime();
                ux.getClass();
                abstractC3171f5.a("post-error");
                ((L) ux.f28050u).f26005u.post(new RunnableC3865s0(1, abstractC3171f5, new com.bumptech.glide.manager.o(e9), obj));
                abstractC3171f5.k();
            } catch (Exception e10) {
                Log.e("Volley", AbstractC3439k5.d("Unhandled exception %s", e10.toString()), e10);
                C3279h5 c3279h5 = new C3279h5(e10);
                SystemClock.elapsedRealtime();
                ux.getClass();
                abstractC3171f5.a("post-error");
                ((L) ux.f28050u).f26005u.post(new RunnableC3865s0(1, abstractC3171f5, new com.bumptech.glide.manager.o(c3279h5), obj));
                abstractC3171f5.k();
            }
            abstractC3171f5.c();
        } catch (Throwable th) {
            abstractC3171f5.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f29212w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3439k5.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
