package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class s8l0 {
    public final no0 a;
    public final y1l0 b;
    public final nci0 c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public s8l0(no0 no0Var, y1l0 y1l0Var, nci0 nci0Var, boolean z) {
        List<Proxy> l;
        this.a = no0Var;
        this.b = y1l0Var;
        this.c = nci0Var;
        this.d = z;
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.g = emptyList;
        this.h = new ArrayList();
        kwu kwuVar = no0Var.h;
        bgo bgoVar = nci0Var.x;
        bgoVar.proxySelectStart(nci0Var, kwuVar);
        URI l2 = kwuVar.l();
        if (l2.getHost() == null) {
            l = bg61.l(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = no0Var.g.select(l2);
            List<Proxy> list = select;
            l = (list == null || list.isEmpty()) ? bg61.l(new Proxy[]{Proxy.NO_PROXY}) : bg61.k(select);
        }
        this.e = l;
        this.f = 0;
        bgoVar.proxySelectEnd(nci0Var, kwuVar, l);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
