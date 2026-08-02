package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.b;

/* loaded from: classes8.dex */
public final class qrw {
    public static mi31 a(String str, String str2, List list) {
        Object obj;
        t5r g = b.g(eja1.d(str2, list), new brd(str, 5));
        s5r s5rVar = new s5r(g);
        while (true) {
            if (!s5rVar.hasNext()) {
                obj = null;
                break;
            }
            obj = s5rVar.next();
            if (jl40.l(((mi31) obj).b, str2)) {
                break;
            }
        }
        mi31 mi31Var = (mi31) obj;
        if (mi31Var == null) {
            mi31Var = (mi31) b.j(g);
        }
        if (mi31Var != null || gwk0.v(str2)) {
            return mi31Var;
        }
        return null;
    }

    public static mi31 b(List list, final sgx0 sgx0Var, String str) {
        Object obj;
        final int i = 0;
        t5r g = b.g(eja1.d(str, list), new tls() { // from class: prw
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i2 = i;
                sgx0 sgx0Var2 = sgx0Var;
                mi31 mi31Var = (mi31) obj2;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(sgx0Var2.a(mi31Var.a));
                    default:
                        return mi31.a(mi31Var, ru.yandex.taxi.tariffs.model.b.f(mi31Var.a, sgx0Var2), null, 30);
                }
            }
        });
        final int i2 = 1;
        yw01 yw01Var = new yw01(g, new tls() { // from class: prw
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i22 = i2;
                sgx0 sgx0Var2 = sgx0Var;
                mi31 mi31Var = (mi31) obj2;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(sgx0Var2.a(mi31Var.a));
                    default:
                        return mi31.a(mi31Var, ru.yandex.taxi.tariffs.model.b.f(mi31Var.a, sgx0Var2), null, 30);
                }
            }
        });
        Iterator it = g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = yw01Var.b.invoke(it.next());
            if (jl40.l(((mi31) obj).b, str)) {
                break;
            }
        }
        mi31 mi31Var = (mi31) obj;
        if (mi31Var == null) {
            mi31Var = (mi31) b.j(yw01Var);
        }
        if (mi31Var != null || gwk0.v(str)) {
            return mi31Var;
        }
        return null;
    }

    public static za31 c(String str, String str2, List list) {
        Object obj;
        s5r s5rVar = new s5r(b.g(new h73(1, list), new brd(str2, 6)));
        loop0: while (true) {
            if (!s5rVar.hasNext()) {
                obj = null;
                break;
            }
            obj = s5rVar.next();
            List list2 = ((za31) obj).b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((mi31) it.next()).a.b, str)) {
                        break loop0;
                    }
                }
            }
        }
        return (za31) obj;
    }

    public static za31 d(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((za31) obj).d, str)) {
                break;
            }
        }
        return (za31) obj;
    }
}
