package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class xm2 {
    public final uu1 a;
    public final fkn b;

    public xm2(jyr jyrVar, uu1 uu1Var) {
        this.a = uu1Var;
        this.b = lg3.u0(new cz(((un2) jyrVar.getValue()).c, this, 12), gld.e(dm6.b), on2.a);
        un2 un2Var = (un2) jyrVar.getValue();
        if (un2Var.b.compareAndSet(false, true)) {
            rn2 rn2Var = un2Var.a;
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
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((cn2) it.next()).start();
                }
                reentrantLock.unlock();
                rn2Var.e.l(rn2Var.b ? CollectionsKt.w0(arrayList2) : c5b.a);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
