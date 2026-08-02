package ru.yandex.taxi.communications.api.dto.ticket;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

/* loaded from: classes5.dex */
public final class i {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TicketTopAsset.TicketTopAssetReplayMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
