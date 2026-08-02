package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;
import ru.yandex.taxi.masstransit.geopayment.tickets.storage.a;

/* loaded from: classes6.dex */
public final class xr30 {
    public final tt2 a;
    public final a b;
    public final i3y c;

    public xr30(on2 on2Var, tt2 tt2Var, a aVar) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = kotlin.a.a(new zn1(on2Var, 28));
    }

    public static final ru.yandex.taxi.masstransit.geopayment.tickets.model.a a(xr30 xr30Var, MtTicketsResponse mtTicketsResponse) {
        List list;
        xr30Var.getClass();
        if (mtTicketsResponse == null || (list = mtTicketsResponse.a) == null) {
            return null;
        }
        List<MtTicketsResponse.a> list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (MtTicketsResponse.a aVar : list2) {
            Pair pair = new Pair(aVar.a, aVar.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        MapBuilder mapBuilder = new MapBuilder();
        k4o b = MtTicketsResponse.TicketType.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((MtTicketsResponse.TicketType) obj) != MtTicketsResponse.TicketType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MtTicketsResponse.TicketType ticketType = (MtTicketsResponse.TicketType) it.next();
            Object obj2 = (List) linkedHashMap.get(ticketType);
            if (obj2 == null) {
                obj2 = EmptyList.a;
            }
            mapBuilder.put(ticketType, obj2);
        }
        return new ru.yandex.taxi.masstransit.geopayment.tickets.model.a(mapBuilder.j());
    }
}
