package ru.yandex.taxi.masstransit.geopayment.tickets.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;

/* loaded from: classes6.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtTicketsResponse.TicketType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
