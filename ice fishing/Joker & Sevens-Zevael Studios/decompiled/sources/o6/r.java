package o6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5322g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5323h;

    public /* synthetic */ r(s sVar) {
        this.f5322g = 0;
        this.f5323h = sVar;
    }

    public static void a(p4.n nVar, String str) {
        p4.o oVar;
        boolean z10;
        WorkDatabase workDatabase = nVar.f5495c;
        x4.q t3 = workDatabase.t();
        x4.c f10 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i10 = t3.i(str2);
            if (i10 != 3 && i10 != 4) {
                t3.p(str2, 6);
            }
            linkedList.addAll(f10.d(str2));
        }
        p4.e eVar = nVar.f5498f;
        synchronized (eVar.f5474r) {
            try {
                o4.o.d().a(p4.e.f5462s, "Processor cancelling " + str);
                eVar.f5472p.add(str);
                oVar = (p4.o) eVar.f5468l.remove(str);
                z10 = oVar != null;
                if (oVar == null) {
                    oVar = (p4.o) eVar.f5469m.remove(str);
                }
                if (oVar != null) {
                    eVar.f5470n.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p4.e.c(str, oVar);
        if (z10) {
            eVar.i();
        }
        Iterator it = nVar.f5497e.iterator();
        while (it.hasNext()) {
            ((p4.g) it.next()).c(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5322g) {
            case 0:
                s sVar = (s) this.f5323h;
                Lock lock = sVar.f5327h;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e10) {
                        t tVar = sVar.f5326g.f5377h;
                        tVar.sendMessage(tVar.obtainMessage(2, e10));
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                x4.e eVar = (x4.e) this.f5323h;
                try {
                    b();
                    eVar.f(o4.t.f5223d);
                    return;
                } catch (Throwable th) {
                    eVar.f(new o4.q(th));
                    return;
                }
        }
    }

    public r() {
        this.f5322g = 1;
        this.f5323h = new x4.e(7);
    }
}
