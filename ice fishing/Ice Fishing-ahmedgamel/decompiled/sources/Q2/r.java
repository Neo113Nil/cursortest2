package Q2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class r implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2586n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2587u;

    public /* synthetic */ r(C0373s c0373s) {
        this.f2586n = 0;
        this.f2587u = c0373s;
    }

    public static void a(K0.p pVar, String str) {
        K0.q qVar;
        boolean z6;
        WorkDatabase workDatabase = pVar.f1643c;
        S0.q t6 = workDatabase.t();
        S0.c f2 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e9 = t6.e(str2);
            if (e9 != 3 && e9 != 4) {
                t6.m(6, str2);
            }
            linkedList.addAll(f2.g(str2));
        }
        K0.f fVar = pVar.f1646f;
        synchronized (fVar.f1615E) {
            try {
                J0.r.d().a(K0.f.f1610F, "Processor cancelling " + str);
                fVar.f1613C.add(str);
                qVar = (K0.q) fVar.f1621y.remove(str);
                z6 = qVar != null;
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1622z.remove(str);
                }
                if (qVar != null) {
                    fVar.f1611A.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K0.f.c(str, qVar);
        if (z6) {
            fVar.i();
        }
        Iterator it = pVar.f1645e.iterator();
        while (it.hasNext()) {
            ((K0.h) it.next()).d(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2586n) {
            case 0:
                C0373s c0373s = (C0373s) this.f2587u;
                ReentrantLock reentrantLock = c0373s.f2602u;
                ReentrantLock reentrantLock2 = c0373s.f2602u;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e9) {
                        HandlerC0374t handlerC0374t = c0373s.f2601n.f2644x;
                        handlerC0374t.sendMessage(handlerC0374t.obtainMessage(2, e9));
                    }
                    return;
                } finally {
                    reentrantLock2.unlock();
                }
            default:
                S0.s sVar = (S0.s) this.f2587u;
                try {
                    b();
                    sVar.k(J0.w.f1438a0);
                    return;
                } catch (Throwable th) {
                    sVar.k(new J0.t(th));
                    return;
                }
        }
    }

    public r() {
        this.f2586n = 1;
        this.f2587u = new S0.s(2);
    }
}
