package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class xra implements u9l {
    public final yjj a;
    public int b;

    public xra(yjj yjjVar) {
        this.a = yjjVar;
    }

    @Override // defpackage.u9l
    public final void h(int i) {
        HashSet u0;
        Object t7oVar;
        this.b += i;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                int i2 = this.b;
                xdr xdrVar = ((taw) next).j;
                Integer valueOf = Integer.valueOf(i2);
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
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
