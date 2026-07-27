package l1;

import B2.z;
import N2.A;
import S0.s;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.T4;
import i8.m;
import java.util.concurrent.PriorityBlockingQueue;
import m1.C4776c;

/* loaded from: classes.dex */
public final class e extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f39032n;

    /* renamed from: u, reason: collision with root package name */
    public final s f39033u;

    /* renamed from: v, reason: collision with root package name */
    public final C3614n5 f39034v;

    /* renamed from: w, reason: collision with root package name */
    public final m f39035w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f39036x = false;

    public e(PriorityBlockingQueue priorityBlockingQueue, s sVar, C3614n5 c3614n5, m mVar) {
        this.f39032n = priorityBlockingQueue;
        this.f39033u = sVar;
        this.f39034v = c3614n5;
        this.f39035w = mVar;
    }

    private void a() {
        T4 t42;
        C4776c c4776c = (C4776c) this.f39032n.take();
        m mVar = this.f39035w;
        SystemClock.elapsedRealtime();
        c4776c.g();
        Object obj = null;
        try {
            try {
                try {
                    c4776c.a("network-queue-take");
                    synchronized (c4776c.f39565w) {
                    }
                    TrafficStats.setThreadStatsTag(c4776c.f39564v);
                    n m8 = this.f39033u.m(c4776c);
                    c4776c.a("network-http-complete");
                    if (m8.f23617n && c4776c.c()) {
                        c4776c.b("not-modified");
                        c4776c.d();
                        return;
                    }
                    n f6 = C4776c.f(m8);
                    c4776c.a("network-parse-complete");
                    if (c4776c.f39555A && (t42 = (T4) f6.f23619v) != null) {
                        this.f39034v.f(c4776c.f39563u, t42);
                        c4776c.a("network-cache-written");
                    }
                    synchronized (c4776c.f39565w) {
                        c4776c.f39556B = true;
                    }
                    mVar.h(c4776c, f6, null);
                    c4776c.e(f6);
                } catch (g e6) {
                    SystemClock.elapsedRealtime();
                    mVar.getClass();
                    c4776c.a("post-error");
                    ((A) mVar.f38384n).execute(new z(c4776c, new n(e6), obj, 11));
                    c4776c.d();
                }
            } catch (Exception e9) {
                Log.e("Volley", j.a("Unhandled exception %s", e9.toString()), e9);
                g gVar = new g(e9);
                SystemClock.elapsedRealtime();
                mVar.getClass();
                c4776c.a("post-error");
                ((A) mVar.f38384n).execute(new z(c4776c, new n(gVar), obj, 11));
                c4776c.d();
            }
        } finally {
            c4776c.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f39036x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
