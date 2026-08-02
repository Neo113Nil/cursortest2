package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.ticket.TicketBottomButton;

/* loaded from: classes14.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TicketBottomButton.TicketBottomButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
