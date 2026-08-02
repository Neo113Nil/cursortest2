package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class re50 {
    public final ya50 a;
    public final r0 b;
    public final mth c;

    public re50(ya50 ya50Var, mf50 mf50Var) {
        ArrayList arrayList;
        this.a = ya50Var;
        sul sulVar = mf50Var.b;
        e41 e41Var = mf50Var.a;
        pe50 pe50Var = null;
        String l = sulVar.a().l("navigation:source_address", null);
        Address address = l != null ? (Address) ((xnt) e41Var.a).c(l, Address.Companion.serializer()) : null;
        oe50 oe50Var = address != null ? new oe50(address) : null;
        String l2 = mf50Var.b.a().l("navigation:stops_address", null);
        List list = l2 != null ? (List) ((xnt) e41Var.a).c(l2, e41Var.b) : null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ne50((Address) it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && oe50Var != null) {
            pe50Var = new pe50(oe50Var, arrayList);
        }
        r0 c = bvf0.c(pe50Var);
        this.b = c;
        this.c = new mth(c, 6);
    }

    public final void a(ne50 ne50Var, Integer num) {
        r0 r0Var;
        Object value;
        pe50 pe50Var;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            pe50 pe50Var2 = (pe50) value;
            if (pe50Var2 != null) {
                i650 i650Var = this.a.a;
                i650Var.a.a("navigation.request_route.add_stop_to_route", n.u(i650Var), 1, new HashMap());
                pe50Var = pe50Var2.b(ne50Var, num);
            } else {
                pe50Var = null;
            }
        } while (!r0Var.k(value, pe50Var));
    }

    public final void b(oe50 oe50Var) {
        r0 r0Var;
        Object value;
        pe50 pe50Var;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            pe50Var = (pe50) value;
        } while (!r0Var.k(value, pe50Var != null ? pe50.a(pe50Var, oe50Var, null, 2) : new pe50(oe50Var, EmptyList.a)));
    }

    public final pe50 c() {
        return (pe50) this.b.getValue();
    }

    public final mth d() {
        return this.c;
    }
}
