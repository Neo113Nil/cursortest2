package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;

/* loaded from: classes9.dex */
public final class z0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TypedContentWidget.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
