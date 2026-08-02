package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final class o {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BannerWidgets.NamedActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
