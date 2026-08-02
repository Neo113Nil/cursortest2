package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.requirements.repository.b;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public final class yiq0 {
    public final wiq0 a;
    public final dqe0 b;
    public final ijj0 c;
    public final b d;

    public yiq0(wiq0 wiq0Var, dqe0 dqe0Var, ijj0 ijj0Var, b bVar) {
        this.a = wiq0Var;
        this.b = dqe0Var;
        this.c = ijj0Var;
        this.d = bVar;
    }

    public final LinkedHashMap a() {
        List J0;
        fnx0 n = ((k) this.a).n();
        Zone c = this.b.c();
        if (n == null || c == null) {
            J0 = a.J0(this.d.d.values());
        } else {
            TariffOrderFlow tariffOrderFlow = n.c.u0;
            J0 = (tariffOrderFlow == TariffOrderFlow.TAXI_FLOW || tariffOrderFlow == TariffOrderFlow.COPTER_CITY_TOUR_FLOW) ? this.c.e(c, n.e, this.b.a.x) : EmptyList.a;
        }
        List<b580> list = J0;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (b580 b580Var : list) {
            Pair pair = new Pair(b580Var.a, q5z.k0(b580Var.b()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
