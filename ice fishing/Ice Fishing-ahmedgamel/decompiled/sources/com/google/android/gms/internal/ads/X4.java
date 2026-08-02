package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class X4 extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f29258z = AbstractC3462k5.f32156a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f29259n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f29260u;

    /* renamed from: v, reason: collision with root package name */
    public final C3732p5 f29261v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f29262w = false;

    /* renamed from: x, reason: collision with root package name */
    public final C2590Gf f29263x;

    /* renamed from: y, reason: collision with root package name */
    public final Ux f29264y;

    public X4(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3732p5 c3732p5, Ux ux) {
        this.f29259n = priorityBlockingQueue;
        this.f29260u = priorityBlockingQueue2;
        this.f29261v = c3732p5;
        this.f29264y = ux;
        this.f29263x = new C2590Gf(this, priorityBlockingQueue2, ux);
    }

    public final void a() {
        AbstractC3194f5 abstractC3194f5 = (AbstractC3194f5) this.f29259n.take();
        abstractC3194f5.a("cache-queue-take");
        abstractC3194f5.c();
        try {
            synchronized (abstractC3194f5.f30833x) {
            }
            C3732p5 c3732p5 = this.f29261v;
            W4 p9 = c3732p5.p(abstractC3194f5.d());
            if (p9 == null) {
                abstractC3194f5.a("cache-miss");
                if (!this.f29263x.s(abstractC3194f5)) {
                    this.f29260u.put(abstractC3194f5);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (p9.f29115e < currentTimeMillis) {
                    abstractC3194f5.a("cache-hit-expired");
                    abstractC3194f5.f30826C = p9;
                    if (!this.f29263x.s(abstractC3194f5)) {
                        this.f29260u.put(abstractC3194f5);
                    }
                } else {
                    abstractC3194f5.a("cache-hit");
                    byte[] bArr = p9.f29111a;
                    Map map = p9.f29117g;
                    com.bumptech.glide.manager.n h3 = abstractC3194f5.h(new C3087d5(200, bArr, map, C3087d5.a(map), false));
                    abstractC3194f5.a("cache-hit-parsed");
                    if (!(((C3302h5) h3.f24251w) == null)) {
                        abstractC3194f5.a("cache-parsing-failed");
                        String d9 = abstractC3194f5.d();
                        synchronized (c3732p5) {
                            try {
                                W4 p10 = c3732p5.p(d9);
                                if (p10 != null) {
                                    p10.f29116f = 0L;
                                    p10.f29115e = 0L;
                                    c3732p5.q(d9, p10);
                                }
                            } finally {
                            }
                        }
                        abstractC3194f5.f30826C = null;
                        if (!this.f29263x.s(abstractC3194f5)) {
                            this.f29260u.put(abstractC3194f5);
                        }
                    } else if (p9.f29116f < currentTimeMillis) {
                        abstractC3194f5.a("cache-hit-refresh-needed");
                        abstractC3194f5.f30826C = p9;
                        h3.f24248n = true;
                        if (this.f29263x.s(abstractC3194f5)) {
                            this.f29264y.m(abstractC3194f5, h3, null);
                        } else {
                            this.f29264y.m(abstractC3194f5, h3, new RunnableC3996u0(this, abstractC3194f5));
                        }
                    } else {
                        this.f29264y.m(abstractC3194f5, h3, null);
                    }
                }
            }
            abstractC3194f5.c();
        } catch (Throwable th) {
            abstractC3194f5.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f29258z) {
            AbstractC3462k5.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f29261v.r();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f29262w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3462k5.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
