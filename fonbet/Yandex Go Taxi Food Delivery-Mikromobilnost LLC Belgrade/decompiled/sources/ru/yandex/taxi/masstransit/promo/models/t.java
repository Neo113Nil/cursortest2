package ru.yandex.taxi.masstransit.promo.models;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final class t {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtSummaryCommunicationsResponse.OfferAvailability.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
