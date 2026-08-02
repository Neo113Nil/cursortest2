package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m3m extends bfu {
    public final cvl k;
    public final z2m l;
    public List m;
    public final xdr n;
    public final fkn o;
    public final x0q p;
    public final dkn q;
    public final x0q r;
    public final dkn s;
    public final xdr t;
    public final fkn u;
    public final a2t v;

    public m3m(cvl cvlVar, z2m z2mVar) {
        cvlVar.getClass();
        this.k = cvlVar;
        this.l = z2mVar;
        this.m = c5b.a;
        xdr a = ydr.a(new i3m(cvlVar.b));
        this.n = a;
        this.o = new fkn(a);
        x0q b = y0q.b(0, 0, null, 7);
        this.p = b;
        this.q = new dkn(b);
        x0q b2 = y0q.b(0, 0, null, 7);
        this.r = b2;
        this.s = new dkn(b2);
        xdr a2 = ydr.a(Boolean.FALSE);
        this.t = a2;
        this.u = new fkn(a2);
        this.v = (a2t) z2mVar.b.getValue();
        G(cvlVar);
    }

    public final void G(cvl cvlVar) {
        i3m i3mVar = new i3m(cvlVar.b);
        xdr xdrVar = this.n;
        xdrVar.getClass();
        xdrVar.m(null, i3mVar);
        x97.y(ot0.F(this), null, null, new b5l(this, cvlVar, (Continuation) null, 20), 3);
    }

    public final void H(Function1 function1) {
        Object value;
        xdr xdrVar = this.n;
        k3m k3mVar = (k3m) xdrVar.getValue();
        if (k3mVar instanceof j3m) {
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, (k3m) function1.invoke(k3mVar)));
        }
    }

    public final boolean a(ArrayList arrayList) {
        if (this.m.size() != arrayList.size()) {
            return true;
        }
        Iterable f = u75.f(this.m);
        if ((f instanceof Collection) && ((Collection) f).isEmpty()) {
            return false;
        }
        ype it = f.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (!Intrinsics.d(((mqs) this.m.get(nextInt)).a, ((j1b) arrayList.get(nextInt)).b.a)) {
                return true;
            }
        }
        return false;
    }
}
