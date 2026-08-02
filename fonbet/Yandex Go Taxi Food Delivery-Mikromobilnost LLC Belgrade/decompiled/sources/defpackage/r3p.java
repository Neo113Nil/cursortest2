package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;

/* loaded from: classes8.dex */
public final class r3p {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final List a() {
        ConcurrentHashMap concurrentHashMap = this.a;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            arrayList.add(new ren((String) entry.getKey(), (h1p) entry.getValue(), EatsOrderStatus.PENDING, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EmptyList.a, null));
        }
        return a.J0(arrayList);
    }

    public final List b(List list) {
        if (list == null) {
            return a();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ren) obj).n() != EatsOrderStatus.PENDING) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.a.remove(((ren) it.next()).g());
        }
        return a.m0(a(), list);
    }
}
