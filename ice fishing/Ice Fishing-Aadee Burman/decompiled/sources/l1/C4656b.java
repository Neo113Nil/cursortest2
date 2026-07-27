package l1;

import S0.n;
import android.os.Process;
import com.bumptech.glide.manager.o;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import com.google.android.gms.internal.ads.W4;
import g1.C4523c;
import java.util.concurrent.PriorityBlockingQueue;
import m1.C4729d;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4656b extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f38881z = j.f38901a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f38882n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f38883u;

    /* renamed from: v, reason: collision with root package name */
    public final C3709p5 f38884v;

    /* renamed from: w, reason: collision with root package name */
    public final C4523c f38885w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f38886x = false;

    /* renamed from: y, reason: collision with root package name */
    public final n f38887y;

    public C4656b(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3709p5 c3709p5, C4523c c4523c) {
        this.f38882n = priorityBlockingQueue;
        this.f38883u = priorityBlockingQueue2;
        this.f38884v = c3709p5;
        this.f38885w = c4523c;
        this.f38887y = new n(this, priorityBlockingQueue2, c4523c);
    }

    private void a() {
        C4729d c4729d = (C4729d) this.f38882n.take();
        c4729d.a("cache-queue-take");
        c4729d.g();
        try {
            synchronized (c4729d.f39297w) {
            }
            W4 a9 = this.f38884v.a(c4729d.f39295u);
            if (a9 == null) {
                c4729d.a("cache-miss");
                if (!this.f38887y.o(c4729d)) {
                    this.f38883u.put(c4729d);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a9.f28317e < currentTimeMillis) {
                c4729d.a("cache-hit-expired");
                c4729d.f39290D = a9;
                if (!this.f38887y.o(c4729d)) {
                    this.f38883u.put(c4729d);
                }
                return;
            }
            c4729d.a("cache-hit");
            o f3 = C4729d.f(new o(a9.f28313a, a9.f28319g));
            c4729d.a("cache-hit-parsed");
            if (((g) f3.f23466w) == null) {
                if (a9.f28318f < currentTimeMillis) {
                    c4729d.a("cache-hit-refresh-needed");
                    c4729d.f39290D = a9;
                    f3.f23463n = true;
                    if (this.f38887y.o(c4729d)) {
                        this.f38885w.E(c4729d, f3, null);
                    } else {
                        this.f38885w.E(c4729d, f3, new RunnableC3191fP(this, c4729d, 14, false));
                    }
                } else {
                    this.f38885w.E(c4729d, f3, null);
                }
                return;
            }
            c4729d.a("cache-parsing-failed");
            C3709p5 c3709p5 = this.f38884v;
            String str = c4729d.f39295u;
            synchronized (c3709p5) {
                W4 a10 = c3709p5.a(str);
                if (a10 != null) {
                    a10.f28318f = 0L;
                    a10.f28317e = 0L;
                    c3709p5.f(str, a10);
                }
            }
            c4729d.f39290D = null;
            if (!this.f38887y.o(c4729d)) {
                this.f38883u.put(c4729d);
            }
        } finally {
            c4729d.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f38881z) {
            j.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f38884v.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f38886x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
