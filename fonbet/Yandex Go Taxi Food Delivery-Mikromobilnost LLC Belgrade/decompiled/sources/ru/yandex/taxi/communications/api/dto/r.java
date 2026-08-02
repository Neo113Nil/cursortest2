package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public final class r {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BannerWidgets.OnCloseEffect.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
