package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class X4 extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f28478z = AbstractC3439k5.f31377a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f28479n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f28480u;

    /* renamed from: v, reason: collision with root package name */
    public final C3709p5 f28481v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f28482w = false;

    /* renamed from: x, reason: collision with root package name */
    public final C2570Gf f28483x;

    /* renamed from: y, reason: collision with root package name */
    public final Ux f28484y;

    public X4(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3709p5 c3709p5, Ux ux) {
        this.f28479n = priorityBlockingQueue;
        this.f28480u = priorityBlockingQueue2;
        this.f28481v = c3709p5;
        this.f28484y = ux;
        this.f28483x = new C2570Gf(this, priorityBlockingQueue2, ux);
    }

    public final void a() {
        AbstractC3171f5 abstractC3171f5 = (AbstractC3171f5) this.f28479n.take();
        abstractC3171f5.a("cache-queue-take");
        abstractC3171f5.c();
        try {
            synchronized (abstractC3171f5.f30046x) {
            }
            C3709p5 c3709p5 = this.f28481v;
            W4 p9 = c3709p5.p(abstractC3171f5.d());
            if (p9 == null) {
                abstractC3171f5.a("cache-miss");
                if (!this.f28483x.u(abstractC3171f5)) {
                    this.f28480u.put(abstractC3171f5);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (p9.f28317e < currentTimeMillis) {
                    abstractC3171f5.a("cache-hit-expired");
                    abstractC3171f5.f30039C = p9;
                    if (!this.f28483x.u(abstractC3171f5)) {
                        this.f28480u.put(abstractC3171f5);
                    }
                } else {
                    abstractC3171f5.a("cache-hit");
                    byte[] bArr = p9.f28313a;
                    Map map = p9.f28319g;
                    com.bumptech.glide.manager.o h9 = abstractC3171f5.h(new C3064d5(200, bArr, map, C3064d5.a(map), false));
                    abstractC3171f5.a("cache-hit-parsed");
                    if (!(((C3279h5) h9.f23466w) == null)) {
                        abstractC3171f5.a("cache-parsing-failed");
                        String d2 = abstractC3171f5.d();
                        synchronized (c3709p5) {
                            try {
                                W4 p10 = c3709p5.p(d2);
                                if (p10 != null) {
                                    p10.f28318f = 0L;
                                    p10.f28317e = 0L;
                                    c3709p5.q(d2, p10);
                                }
                            } finally {
                            }
                        }
                        abstractC3171f5.f30039C = null;
                        if (!this.f28483x.u(abstractC3171f5)) {
                            this.f28480u.put(abstractC3171f5);
                        }
                    } else if (p9.f28318f < currentTimeMillis) {
                        abstractC3171f5.a("cache-hit-refresh-needed");
                        abstractC3171f5.f30039C = p9;
                        h9.f23463n = true;
                        if (this.f28483x.u(abstractC3171f5)) {
                            this.f28484y.l(abstractC3171f5, h9, null);
                        } else {
                            this.f28484y.l(abstractC3171f5, h9, new RunnableC3973u0(this, abstractC3171f5));
                        }
                    } else {
                        this.f28484y.l(abstractC3171f5, h9, null);
                    }
                }
            }
            abstractC3171f5.c();
        } catch (Throwable th) {
            abstractC3171f5.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f28478z) {
            AbstractC3439k5.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f28481v.r();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f28482w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3439k5.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
