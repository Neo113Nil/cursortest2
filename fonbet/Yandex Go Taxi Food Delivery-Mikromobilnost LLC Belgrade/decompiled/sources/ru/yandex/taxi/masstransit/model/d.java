package ru.yandex.taxi.masstransit.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VariantStyle.VariantType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
