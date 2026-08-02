package ru.yandex.taxi.summary.promotions.models;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final class i0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SummaryPromotionsResponse.OfferAvailability.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
