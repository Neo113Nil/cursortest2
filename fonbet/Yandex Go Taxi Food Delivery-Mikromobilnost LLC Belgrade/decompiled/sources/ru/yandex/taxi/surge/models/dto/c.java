package ru.yandex.taxi.surge.models.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;

/* loaded from: classes6.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DetailedPriceContent.DetailedPriceItem.DividerType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
