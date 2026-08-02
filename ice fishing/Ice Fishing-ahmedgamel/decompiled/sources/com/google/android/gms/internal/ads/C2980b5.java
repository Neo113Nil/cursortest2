package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2980b5 extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f29997n;

    /* renamed from: u, reason: collision with root package name */
    public final C3067cm f29998u;

    /* renamed from: v, reason: collision with root package name */
    public final C3732p5 f29999v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f30000w = false;

    /* renamed from: x, reason: collision with root package name */
    public final Ux f30001x;

    public C2980b5(PriorityBlockingQueue priorityBlockingQueue, C3067cm c3067cm, C3732p5 c3732p5, Ux ux) {
        this.f29997n = priorityBlockingQueue;
        this.f29998u = c3067cm;
        this.f29999v = c3732p5;
        this.f30001x = ux;
    }

    public final void a() {
        Ux ux = this.f30001x;
        AbstractC3194f5 abstractC3194f5 = (AbstractC3194f5) this.f29997n.take();
        SystemClock.elapsedRealtime();
        abstractC3194f5.c();
        Object obj = null;
        try {
            try {
                abstractC3194f5.a("network-queue-take");
                synchronized (abstractC3194f5.f30833x) {
                }
                TrafficStats.setThreadStatsTag(abstractC3194f5.f30832w);
                C3087d5 k9 = this.f29998u.k(abstractC3194f5);
                abstractC3194f5.a("network-http-complete");
                if (k9.f30483e && abstractC3194f5.g()) {
                    abstractC3194f5.b("not-modified");
                    abstractC3194f5.k();
                } else {
                    com.bumptech.glide.manager.n h3 = abstractC3194f5.h(k9);
                    abstractC3194f5.a("network-parse-complete");
                    W4 w42 = (W4) h3.f24250v;
                    if (w42 != null) {
                        this.f29999v.q(abstractC3194f5.d(), w42);
                        abstractC3194f5.a("network-cache-written");
                    }
                    synchronized (abstractC3194f5.f30833x) {
                        abstractC3194f5.f30825B = true;
                    }
                    ux.m(abstractC3194f5, h3, null);
                    abstractC3194f5.j(h3);
                }
            } catch (C3302h5 e9) {
                SystemClock.elapsedRealtime();
                ux.getClass();
                abstractC3194f5.a("post-error");
                ((L) ux.f28847u).f26805u.post(new RunnableC3888s0(1, abstractC3194f5, new com.bumptech.glide.manager.n(e9), obj));
                abstractC3194f5.k();
            } catch (Exception e10) {
                Log.e("Volley", AbstractC3462k5.d("Unhandled exception %s", e10.toString()), e10);
                C3302h5 c3302h5 = new C3302h5(e10);
                SystemClock.elapsedRealtime();
                ux.getClass();
                abstractC3194f5.a("post-error");
                ((L) ux.f28847u).f26805u.post(new RunnableC3888s0(1, abstractC3194f5, new com.bumptech.glide.manager.n(c3302h5), obj));
                abstractC3194f5.k();
            }
            abstractC3194f5.c();
        } catch (Throwable th) {
            abstractC3194f5.c();
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
                if (this.f30000w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3462k5.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
