package com.gamericefishpro.space.u8;

import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Runnable {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ q(r rVar) {
        this.d = 0;
        this.e = rVar;
    }

    public static void a(com.gamericefishpro.space.m6.o oVar, String str) {
        com.gamericefishpro.space.m6.p pVar;
        boolean z;
        WorkDatabase workDatabase = oVar.c;
        com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
        com.gamericefishpro.space.u6.c cVarW = workDatabase.w();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            com.gamericefishpro.space.l6.y yVarK = qVarB.k(str2);
            if (yVarK != com.gamericefishpro.space.l6.y.i && yVarK != com.gamericefishpro.space.l6.y.v) {
                qVarB.r(com.gamericefishpro.space.l6.y.y, str2);
            }
            linkedList.addAll(cVarW.h(str2));
        }
        com.gamericefishpro.space.m6.f fVar = oVar.f;
        synchronized (fVar.E) {
            try {
                com.gamericefishpro.space.l6.q.c().getClass();
                fVar.C.add(str);
                pVar = (com.gamericefishpro.space.m6.p) fVar.y.remove(str);
                z = pVar != null;
                if (pVar == null) {
                    pVar = (com.gamericefishpro.space.m6.p) fVar.z.remove(str);
                }
                if (pVar != null) {
                    fVar.A.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.gamericefishpro.space.m6.f.b(pVar);
        if (z) {
            fVar.i();
        }
        Iterator it = oVar.e.iterator();
        while (it.hasNext()) {
            ((com.gamericefishpro.space.m6.h) it.next()).b(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = (r) this.e;
                Lock lock = rVar.e;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                        break;
                    } catch (RuntimeException e) {
                        s sVar = rVar.d.h;
                        sVar.sendMessage(sVar.obtainMessage(2, e));
                        break;
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            default:
                com.gamericefishpro.space.u6.c cVar = (com.gamericefishpro.space.u6.c) this.e;
                try {
                    b();
                    cVar.m(com.gamericefishpro.space.l6.w.r);
                    return;
                } catch (Throwable th) {
                    cVar.m(new com.gamericefishpro.space.l6.t(th));
                    return;
                }
        }
    }

    public q() {
        this.d = 1;
        this.e = new com.gamericefishpro.space.u6.c(6);
    }
}
