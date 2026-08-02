package ru.yandex.taxi.summary.promotions.models;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes10.dex */
public final class p {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SummaryPromotionsResponse.DisplayOnType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
