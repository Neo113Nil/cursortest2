package ru.yandex.taxi.summary.promotions.models;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;

/* loaded from: classes6.dex */
public final class n {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SummaryPromotionsParam.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
