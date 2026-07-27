package l1;

import C2.y;
import O2.B;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.W4;
import g1.C4523c;
import java.util.concurrent.PriorityBlockingQueue;
import m1.C4726a;
import m1.C4729d;

/* loaded from: classes.dex */
public final class e extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f38890n;

    /* renamed from: u, reason: collision with root package name */
    public final C4726a f38891u;

    /* renamed from: v, reason: collision with root package name */
    public final C3709p5 f38892v;

    /* renamed from: w, reason: collision with root package name */
    public final C4523c f38893w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f38894x = false;

    public e(PriorityBlockingQueue priorityBlockingQueue, C4726a c4726a, C3709p5 c3709p5, C4523c c4523c) {
        this.f38890n = priorityBlockingQueue;
        this.f38891u = c4726a;
        this.f38892v = c3709p5;
        this.f38893w = c4523c;
    }

    private void a() {
        W4 w42;
        C4729d c4729d = (C4729d) this.f38890n.take();
        C4523c c4523c = this.f38893w;
        SystemClock.elapsedRealtime();
        c4729d.g();
        Object obj = null;
        try {
            try {
                try {
                    c4729d.a("network-queue-take");
                    synchronized (c4729d.f39297w) {
                    }
                    TrafficStats.setThreadStatsTag(c4729d.f39296v);
                    o a9 = this.f38891u.a(c4729d);
                    c4729d.a("network-http-complete");
                    if (a9.f23463n && c4729d.c()) {
                        c4729d.b("not-modified");
                        c4729d.d();
                        return;
                    }
                    o f3 = C4729d.f(a9);
                    c4729d.a("network-parse-complete");
                    if (c4729d.f39287A && (w42 = (W4) f3.f23465v) != null) {
                        this.f38892v.f(c4729d.f39295u, w42);
                        c4729d.a("network-cache-written");
                    }
                    synchronized (c4729d.f39297w) {
                        c4729d.f39288B = true;
                    }
                    c4523c.E(c4729d, f3, null);
                    c4729d.e(f3);
                } catch (g e9) {
                    SystemClock.elapsedRealtime();
                    c4523c.getClass();
                    c4729d.a("post-error");
                    ((B) c4523c.f37627u).execute(new y(13, c4729d, new o(e9), obj));
                    c4729d.d();
                }
            } catch (Exception e10) {
                Log.e("Volley", j.a("Unhandled exception %s", e10.toString()), e10);
                g gVar = new g(e10);
                SystemClock.elapsedRealtime();
                c4523c.getClass();
                c4729d.a("post-error");
                ((B) c4523c.f37627u).execute(new y(13, c4729d, new o(gVar), obj));
                c4729d.d();
            }
        } finally {
            c4729d.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f38894x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
