package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d5l {
    public final jyr a;
    public final tf6 b;
    public final jyr c;
    public final ConcurrentHashMap d;
    public final ReentrantLock e;
    public volatile CountDownLatch f;
    public String g;
    public ConcurrentHashMap h;
    public final ReentrantLock i;
    public rar j;

    public d5l() {
        l18 l18Var = l18.b;
        this.a = l18Var.b(hag.I(frt.class), true);
        this.b = gld.e(dm6.b.plus(a4g.n()));
        this.c = l18Var.b(hag.I(d2l.class), true);
        this.d = new ConcurrentHashMap();
        this.e = new ReentrantLock();
        this.f = new CountDownLatch(1);
        this.h = new ConcurrentHashMap();
        this.i = new ReentrantLock();
        x97.y(cmd.a, mn7.d, null, new g2l(this, null, 1), 2);
    }

    public final void a(l1l l1lVar) {
        String str = l1lVar.a;
        this.d.put(str, l1lVar);
        this.h.put(str, l1lVar);
        ReentrantLock reentrantLock = this.i;
        reentrantLock.lock();
        try {
            if (this.j == null) {
                String str2 = this.g;
                str2.getClass();
                this.j = x97.y(this.b, null, null, new c5l(this, str2, (Continuation) null, 0), 3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
