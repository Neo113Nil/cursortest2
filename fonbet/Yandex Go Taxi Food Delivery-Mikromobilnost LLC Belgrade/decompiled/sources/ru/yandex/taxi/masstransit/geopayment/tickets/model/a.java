package ru.yandex.taxi.masstransit.geopayment.tickets.model;

import defpackage.jl40;
import defpackage.nnm;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;

/* loaded from: classes6.dex */
public final class a {
    public static final a b = new a(0);
    public final Map a;

    public /* synthetic */ a(int i) {
        this(kotlin.collections.b.f());
    }

    public final boolean a() {
        if (((List) this.a.get(MtTicketsResponse.TicketType.AEROEXPRESS)) != null) {
            return !r1.isEmpty();
        }
        return false;
    }

    public final boolean b() {
        if (((List) this.a.get(MtTicketsResponse.TicketType.SUBURBAN)) != null) {
            return !r1.isEmpty();
        }
        return false;
    }

    public final boolean c(a aVar) {
        Map map = this.a;
        if (!jl40.l(map.keySet(), aVar.a.keySet())) {
            return false;
        }
        Set<MtTicketsResponse.TicketType> keySet = map.keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return true;
        }
        for (MtTicketsResponse.TicketType ticketType : keySet) {
            List list = (List) map.get(ticketType);
            List list2 = EmptyList.a;
            if (list == null) {
                list = list2;
            }
            List list3 = (List) aVar.a.get(ticketType);
            if (list3 != null) {
                list2 = list3;
            }
            if (list.size() != list2.size() || !list.containsAll(list2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("MtPaymentTickets(ticketsToIdMap=", Extension.C_BRAKE, this.a);
    }

    public a(Map map) {
        this.a = map;
    }

    public a() {
        this(0);
    }
}
