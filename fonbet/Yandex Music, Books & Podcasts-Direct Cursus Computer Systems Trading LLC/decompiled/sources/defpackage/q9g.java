package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class q9g implements r9g {
    public final /* synthetic */ ime a;

    public q9g(ime imeVar) {
        this.a = imeVar;
    }

    @Override // defpackage.r9g
    public final void Q() {
        HashSet u0;
        Object t7oVar;
        ime imeVar = this.a;
        yjj yjjVar = (yjj) imeVar.c;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                imeVar.B();
                ((vbu) next).a.c(true);
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
