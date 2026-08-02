package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;

/* loaded from: classes6.dex */
public final class b0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MicroWidgetPlaqueDto.IconInCornerDto.Position.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
