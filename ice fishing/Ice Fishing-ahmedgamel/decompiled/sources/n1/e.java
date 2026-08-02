package n1;

import E2.x;
import Q2.A;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.W4;
import java.util.concurrent.PriorityBlockingQueue;
import m.R0;
import o1.C4797a;
import o1.C4800d;

/* loaded from: classes.dex */
public final class e extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f39628n;

    /* renamed from: u, reason: collision with root package name */
    public final C4797a f39629u;

    /* renamed from: v, reason: collision with root package name */
    public final C3732p5 f39630v;

    /* renamed from: w, reason: collision with root package name */
    public final R0 f39631w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f39632x = false;

    public e(PriorityBlockingQueue priorityBlockingQueue, C4797a c4797a, C3732p5 c3732p5, R0 r02) {
        this.f39628n = priorityBlockingQueue;
        this.f39629u = c4797a;
        this.f39630v = c3732p5;
        this.f39631w = r02;
    }

    private void a() {
        W4 w42;
        C4800d c4800d = (C4800d) this.f39628n.take();
        R0 r02 = this.f39631w;
        SystemClock.elapsedRealtime();
        c4800d.g();
        Object obj = null;
        try {
            try {
                try {
                    c4800d.a("network-queue-take");
                    synchronized (c4800d.f39740w) {
                    }
                    TrafficStats.setThreadStatsTag(c4800d.f39739v);
                    n b9 = this.f39629u.b(c4800d);
                    c4800d.a("network-http-complete");
                    if (b9.f24248n && c4800d.c()) {
                        c4800d.b("not-modified");
                        c4800d.d();
                        return;
                    }
                    n f2 = C4800d.f(b9);
                    c4800d.a("network-parse-complete");
                    if (c4800d.f39730A && (w42 = (W4) f2.f24250v) != null) {
                        this.f39630v.f(c4800d.f39738u, w42);
                        c4800d.a("network-cache-written");
                    }
                    synchronized (c4800d.f39740w) {
                        c4800d.f39731B = true;
                    }
                    r02.c(c4800d, f2, null);
                    c4800d.e(f2);
                } catch (Exception e9) {
                    Log.e("Volley", j.a("Unhandled exception %s", e9.toString()), e9);
                    g gVar = new g(e9);
                    SystemClock.elapsedRealtime();
                    r02.getClass();
                    c4800d.a("post-error");
                    ((A) r02.f39127n).execute(new x(13, c4800d, new n(gVar), obj));
                    c4800d.d();
                }
            } catch (g e10) {
                SystemClock.elapsedRealtime();
                r02.getClass();
                c4800d.a("post-error");
                ((A) r02.f39127n).execute(new x(13, c4800d, new n(e10), obj));
                c4800d.d();
            }
        } finally {
            c4800d.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f39632x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
