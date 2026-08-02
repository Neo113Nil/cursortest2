package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ro0 {
    public final g580 a;
    public final wiq0 b;
    public final lcj0 c;

    public ro0(g580 g580Var, wiq0 wiq0Var, lcj0 lcj0Var) {
        this.a = g580Var;
        this.b = wiq0Var;
        this.c = lcj0Var;
    }

    public final boolean a() {
        return this.c.b().b && b() != null;
    }

    public final fmw0 b() {
        pex0 m = ((k) this.b).m();
        Object obj = null;
        if (m == null) {
            return null;
        }
        ArrayList arrayList = ((x8) this.a).d;
        List f = m.f();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : f) {
            lmw0 lmw0Var = (lmw0) obj2;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((b580) it.next()).a, lmw0Var.getName())) {
                        arrayList2.add(obj2);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof fmw0) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            gbj0 gbj0Var = ((fmw0) next2).o;
            if ((gbj0Var != null ? gbj0Var.a : null) != null) {
                obj = next2;
                break;
            }
        }
        return (fmw0) obj;
    }
}
