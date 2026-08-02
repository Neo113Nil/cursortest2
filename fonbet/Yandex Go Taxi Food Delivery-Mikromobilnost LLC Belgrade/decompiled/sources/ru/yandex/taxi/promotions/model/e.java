package ru.yandex.taxi.promotions.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final class e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PromotionBackground.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
