package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class qi3 implements rgl {
    public final yjj a;

    public qi3(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.rgl
    public final void z(long j) {
        HashSet u0;
        Object t7oVar;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                taw tawVar = (taw) next;
                long j2 = 0;
                if (j >= 0) {
                    j2 = j;
                }
                long currentTimeMillis = System.currentTimeMillis();
                tawVar.getClass();
                pi3 pi3Var = new pi3(currentTimeMillis, j2);
                xdr xdrVar = tawVar.n;
                xdrVar.getClass();
                xdrVar.m(null, pi3Var);
                tawVar.u.add(pi3Var);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }
}
