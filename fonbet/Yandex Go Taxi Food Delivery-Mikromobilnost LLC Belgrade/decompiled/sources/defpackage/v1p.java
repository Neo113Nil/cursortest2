package defpackage;

import com.yandex.go.superapp.orders.known.KnownOrder;
import com.yandex.go.superapp.orders.known.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.SupportedEatsServices;

/* loaded from: classes8.dex */
public final class v1p {
    public static final ArrayList b;
    public final b a;

    static {
        k4o a = SupportedEatsServices.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator<E> it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedEatsServices) it.next()).getKey());
        }
        b = arrayList;
    }

    public v1p(b bVar) {
        this.a = bVar;
    }

    public final void a(List list) {
        b bVar = this.a;
        ArrayList arrayList = new ArrayList((List) ((hk20) bVar.a.a.getValue()).c());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ren renVar = (ren) it.next();
            if (renVar.n().getIsActive()) {
                bVar.e(renVar.g(), renVar.m().getValue(), "order." + renVar.n().getId());
            } else {
                bVar.c(renVar.g(), renVar.m().getValue());
            }
            arrayList.removeIf(new md3(6, new d8(22, renVar)));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            KnownOrder knownOrder = (KnownOrder) it2.next();
            bVar.c(knownOrder.a, knownOrder.b);
        }
    }
}
