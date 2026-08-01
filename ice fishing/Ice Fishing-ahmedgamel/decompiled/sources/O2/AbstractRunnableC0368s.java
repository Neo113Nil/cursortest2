package O2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: O2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0368s implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2270n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2271u;

    public /* synthetic */ AbstractRunnableC0368s(C0369t c0369t) {
        this.f2270n = 0;
        this.f2271u = c0369t;
    }

    public static void a(K0.p pVar, String str) {
        K0.q qVar;
        boolean z3;
        WorkDatabase workDatabase = pVar.f1534c;
        S0.q t6 = workDatabase.t();
        S0.c f3 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e9 = t6.e(str2);
            if (e9 != 3 && e9 != 4) {
                t6.m(6, str2);
            }
            linkedList.addAll(f3.j(str2));
        }
        K0.f fVar = pVar.f1537f;
        synchronized (fVar.f1506E) {
            try {
                J0.s.d().a(K0.f.f1501F, "Processor cancelling " + str);
                fVar.f1504C.add(str);
                qVar = (K0.q) fVar.f1512y.remove(str);
                z3 = qVar != null;
                if (qVar == null) {
                    qVar = (K0.q) fVar.f1513z.remove(str);
                }
                if (qVar != null) {
                    fVar.f1502A.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K0.f.c(str, qVar);
        if (z3) {
            fVar.i();
        }
        Iterator it = pVar.f1536e.iterator();
        while (it.hasNext()) {
            ((K0.h) it.next()).d(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2270n) {
            case 0:
                C0369t c0369t = (C0369t) this.f2271u;
                ReentrantLock reentrantLock = c0369t.f2286u;
                ReentrantLock reentrantLock2 = c0369t.f2286u;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e9) {
                        HandlerC0370u handlerC0370u = c0369t.f2285n.f2328x;
                        handlerC0370u.sendMessage(handlerC0370u.obtainMessage(2, e9));
                    }
                    return;
                } finally {
                    reentrantLock2.unlock();
                }
            default:
                C2991bm c2991bm = (C2991bm) this.f2271u;
                try {
                    b();
                    c2991bm.S(J0.x.f1410f0);
                    return;
                } catch (Throwable th) {
                    c2991bm.S(new J0.u(th));
                    return;
                }
        }
    }

    public AbstractRunnableC0368s() {
        this.f2270n = 1;
        this.f2271u = new C2991bm(2);
    }
}
