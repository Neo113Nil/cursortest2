package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class w2h {
    public final wnt a;

    public /* synthetic */ w2h(wnt wntVar) {
        this.a = wntVar;
    }

    public static q6e a(zzs zzsVar, String str, String str2, List list) {
        kdx kdxVar = new kdx();
        if (zzsVar != null) {
            xbx xbxVar = new xbx();
            xbxVar.a(qcx.b(Double.valueOf(zzsVar.b)));
            xbxVar.a(qcx.b(Double.valueOf(zzsVar.a)));
            kdxVar.b("delivery_search_point", xbxVar.b());
        }
        if (str != null) {
            abb1.d(kdxVar, "product_scenario", str);
        }
        if (str2 != null) {
            abb1.d(kdxVar, "point_a", str2);
        }
        if (list != null) {
            xbx xbxVar2 = new xbx();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xbxVar2.a(qcx.c((String) it.next()));
            }
            kdxVar.b("point_b", xbxVar2.b());
        }
        return new q6e(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, kdxVar.a());
    }

    public c b(List list) {
        if (list == null) {
            return null;
        }
        kdx kdxVar = new kdx();
        abb1.d(kdxVar, "type", "ndd_station_filters");
        xbx xbxVar = new xbx();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                kdx kdxVar2 = new kdx();
                kdxVar2.b(str, ((xnt) this.a).a(value, cm2.a));
                xbxVar.a(kdxVar2.a());
            }
        }
        kdxVar.b("filters_meta", xbxVar.b());
        return kdxVar.a();
    }
}
