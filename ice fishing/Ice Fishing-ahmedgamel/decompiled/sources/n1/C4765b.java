package n1;

import android.os.Process;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import com.google.android.gms.internal.ads.W4;
import java.util.HashMap;
import java.util.concurrent.PriorityBlockingQueue;
import l4.q;
import m.R0;
import o1.C4800d;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4765b extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f39619z = j.f39639a;

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f39620n;

    /* renamed from: u, reason: collision with root package name */
    public final PriorityBlockingQueue f39621u;

    /* renamed from: v, reason: collision with root package name */
    public final C3732p5 f39622v;

    /* renamed from: w, reason: collision with root package name */
    public final R0 f39623w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f39624x = false;

    /* renamed from: y, reason: collision with root package name */
    public final q f39625y;

    public C4765b(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, C3732p5 c3732p5, R0 r02) {
        this.f39620n = priorityBlockingQueue;
        this.f39621u = priorityBlockingQueue2;
        this.f39622v = c3732p5;
        this.f39623w = r02;
        q qVar = new q();
        qVar.f38945n = new HashMap();
        qVar.f38946u = r02;
        qVar.f38947v = this;
        qVar.f38948w = priorityBlockingQueue2;
        this.f39625y = qVar;
    }

    private void a() {
        C4800d c4800d = (C4800d) this.f39620n.take();
        c4800d.a("cache-queue-take");
        c4800d.g();
        try {
            synchronized (c4800d.f39740w) {
            }
            W4 a9 = this.f39622v.a(c4800d.f39738u);
            if (a9 == null) {
                c4800d.a("cache-miss");
                if (!this.f39625y.l(c4800d)) {
                    this.f39621u.put(c4800d);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a9.f29115e < currentTimeMillis) {
                c4800d.a("cache-hit-expired");
                c4800d.f39733D = a9;
                if (!this.f39625y.l(c4800d)) {
                    this.f39621u.put(c4800d);
                }
                return;
            }
            c4800d.a("cache-hit");
            n f2 = C4800d.f(new n(a9.f29111a, a9.f29117g));
            c4800d.a("cache-hit-parsed");
            if (((g) f2.f24251w) == null) {
                if (a9.f29116f < currentTimeMillis) {
                    c4800d.a("cache-hit-refresh-needed");
                    c4800d.f39733D = a9;
                    f2.f24248n = true;
                    if (this.f39625y.l(c4800d)) {
                        this.f39623w.c(c4800d, f2, null);
                    } else {
                        this.f39623w.c(c4800d, f2, new RunnableC3214fP(this, c4800d, 14, false));
                    }
                } else {
                    this.f39623w.c(c4800d, f2, null);
                }
                return;
            }
            c4800d.a("cache-parsing-failed");
            C3732p5 c3732p5 = this.f39622v;
            String str = c4800d.f39738u;
            synchronized (c3732p5) {
                W4 a10 = c3732p5.a(str);
                if (a10 != null) {
                    a10.f29116f = 0L;
                    a10.f29115e = 0L;
                    c3732p5.f(str, a10);
                }
            }
            c4800d.f39733D = null;
            if (!this.f39625y.l(c4800d)) {
                this.f39621u.put(c4800d);
            }
        } finally {
            c4800d.g();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f39619z) {
            j.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f39622v.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f39624x) {
                    Thread.currentThread().interrupt();
                    return;
                }
                j.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
