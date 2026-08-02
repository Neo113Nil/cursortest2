package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.order.analytics.model.ListOpenReason;

/* loaded from: classes9.dex */
public final class uy70 {
    public ListOpenReason a = ListOpenReason.NONE;
    public Map b = b.f();

    public final ListOpenReason a(LinkedHashMap linkedHashMap) {
        Map map = this.b;
        ListOpenReason listOpenReason = ListOpenReason.NONE;
        if (!map.isEmpty() || !linkedHashMap.isEmpty()) {
            if (map.isEmpty() && !linkedHashMap.isEmpty()) {
                listOpenReason = ListOpenReason.SHOWN;
            } else if (map.size() == linkedHashMap.size()) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) map.get(entry.getKey());
                    if (str == null) {
                        listOpenReason = ListOpenReason.ORDERS_CHANGED;
                        break;
                    }
                    if (!str.equals(entry.getValue())) {
                        listOpenReason = ListOpenReason.ORDER_STATUS_CHANGES;
                    }
                }
            } else {
                listOpenReason = ListOpenReason.ORDERS_CHANGED;
            }
        }
        this.b = linkedHashMap;
        if (listOpenReason != ListOpenReason.NONE) {
            this.a = listOpenReason;
        }
        return listOpenReason;
    }
}
