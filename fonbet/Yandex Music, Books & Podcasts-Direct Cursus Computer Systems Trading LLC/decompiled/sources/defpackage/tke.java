package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class tke {
    public final jyr a;

    public tke() {
        jyr b = btf.b(new sxd(10));
        this.a = b;
        gld.e(dm6.b);
        ple pleVar = (ple) b.getValue();
        if (pleVar.b.compareAndSet(false, true)) {
            ssg.a(3, "InformerRegistry", "init", null);
            rn2 rn2Var = pleVar.a;
            ArrayList arrayList = rn2Var.d;
            ArrayList arrayList2 = rn2Var.c;
            ReentrantLock reentrantLock = rn2Var.a;
            reentrantLock.lock();
            try {
                if (rn2Var.b) {
                    return;
                }
                rn2Var.b = true;
                arrayList2.addAll(arrayList);
                arrayList.clear();
                List w0 = CollectionsKt.w0(arrayList2);
                reentrantLock.unlock();
                Iterator it = w0.iterator();
                while (it.hasNext()) {
                    ((lke) it.next()).start();
                }
                rn2Var.e.l(rn2Var.b ? CollectionsKt.w0(arrayList2) : c5b.a);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final fkn a(mm6 mm6Var, kle kleVar) {
        mm6Var.getClass();
        kleVar.getClass();
        jyr jyrVar = this.a;
        return lg3.u0(new ub7(27, q6k.m(zsd.M0(((ple) jyrVar.getValue()).a.e, new tn2(3, 3, null)), new mke(10), q6k.g), kleVar), mm6Var, kleVar.a((List) ((ple) jyrVar.getValue()).a.e.getValue()));
    }

    public final void b(lke lkeVar) {
        ple pleVar = (ple) this.a.getValue();
        pleVar.getClass();
        v3w.l("register ", lkeVar.getTag(), 3, "InformerRegistry", null);
        rn2 rn2Var = pleVar.a;
        rn2Var.getClass();
        ArrayList arrayList = rn2Var.c;
        ReentrantLock reentrantLock = rn2Var.a;
        reentrantLock.lock();
        try {
            if (rn2Var.b) {
                arrayList.add(lkeVar);
            } else {
                rn2Var.d.add(lkeVar);
            }
            boolean z = rn2Var.b;
            reentrantLock.unlock();
            if (z) {
                lkeVar.start();
            }
            rn2Var.e.l(rn2Var.b ? CollectionsKt.w0(arrayList) : c5b.a);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
