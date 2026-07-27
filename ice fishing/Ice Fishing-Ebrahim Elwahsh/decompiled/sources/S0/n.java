package S0;

import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import android.util.SparseArray;
import b2.InterfaceC0525b;
import f2.C4500c;
import h2.InterfaceC4566c;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C4685b;
import m1.C4776c;
import p7.InterfaceC4864a;
import q2.R0;
import u1.C5101a;
import u1.x;

/* loaded from: classes.dex */
public final class n implements InterfaceC0525b {

    /* renamed from: n, reason: collision with root package name */
    public Object f2914n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2915u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2916v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2917w;

    public n(int i) {
        switch (i) {
            case 7:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new L.j(1));
                this.f2915u = new HashMap();
                this.f2916v = new ReferenceQueue();
                this.f2914n = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new R0(10, this));
                break;
            default:
                this.f2914n = new s.b();
                this.f2915u = new SparseArray();
                this.f2916v = new s.e();
                this.f2917w = new s.b();
                break;
        }
    }

    public synchronized void a(u1.p pVar, u1.q qVar) {
        C5101a c5101a = (C5101a) ((HashMap) this.f2915u).put(pVar, new C5101a(pVar, qVar, (ReferenceQueue) this.f2916v));
        if (c5101a != null) {
            c5101a.f41061c = null;
            c5101a.clear();
        }
    }

    public void b(C5101a c5101a) {
        x xVar;
        synchronized (this) {
            ((HashMap) this.f2915u).remove(c5101a.f41059a);
            if (c5101a.f41060b && (xVar = c5101a.f41061c) != null) {
                ((u1.k) this.f2917w).e(c5101a.f41059a, new u1.q(xVar, true, false, c5101a.f41059a, (u1.k) this.f2917w));
            }
        }
    }

    public synchronized boolean c(C4776c c4776c) {
        try {
            String str = c4776c.f39563u;
            if (!((HashMap) this.f2914n).containsKey(str)) {
                ((HashMap) this.f2914n).put(str, null);
                synchronized (c4776c.f39565w) {
                    c4776c.f39559E = this;
                }
                if (l1.j.f39043a) {
                    l1.j.b("new request, sending to network %s", str);
                }
                return false;
            }
            List list = (List) ((HashMap) this.f2914n).get(str);
            if (list == null) {
                list = new ArrayList();
            }
            c4776c.a("waiting-for-response");
            list.add(c4776c);
            ((HashMap) this.f2914n).put(str, list);
            if (l1.j.f39043a) {
                l1.j.b("Request for cacheKey=%s is in flight, putting on hold.", str);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d(X.l lVar) {
        Object e6 = ((Q7.c) this.f2916v).e(lVar);
        if (e6 instanceof Q7.h) {
            Throwable b9 = Q7.j.b(e6);
            if (b9 != null) {
                throw b9;
            }
            throw new Q7.m("Channel was closed normally");
        }
        if (e6 instanceof Q7.i) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.f2917w).getAndIncrement() == 0) {
            AbstractC0399y.o((InterfaceC0397w) this.f2914n, null, new X.i(this, null), 3);
        }
    }

    public synchronized void e(C4776c c4776c) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String str = c4776c.f39563u;
            List list = (List) ((HashMap) this.f2914n).remove(str);
            if (list != null && !list.isEmpty()) {
                if (l1.j.f39043a) {
                    l1.j.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
                }
                C4776c c4776c2 = (C4776c) list.remove(0);
                ((HashMap) this.f2914n).put(str, list);
                synchronized (c4776c2.f39565w) {
                    c4776c2.f39559E = this;
                }
                if (((C4685b) this.f2916v) != null && (priorityBlockingQueue = (PriorityBlockingQueue) this.f2917w) != null) {
                    try {
                        priorityBlockingQueue.put(c4776c2);
                    } catch (InterruptedException e6) {
                        l1.j.c("Couldn't add request to queue. %s", e6.toString());
                        Thread.currentThread().interrupt();
                        C4685b c4685b = (C4685b) this.f2916v;
                        c4685b.f39028x = true;
                        c4685b.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        return new f2.j((Executor) ((InterfaceC4864a) this.f2914n).get(), (g2.d) ((InterfaceC4864a) this.f2915u).get(), (C4500c) ((Y2.e) this.f2916v).get(), (InterfaceC4566c) ((InterfaceC4864a) this.f2917w).get());
    }
}
