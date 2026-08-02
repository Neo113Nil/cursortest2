package ru.yandex.taxi.plus.api.dto.state.plaque_v2.display;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

/* loaded from: classes6.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShapeSettings.CornerSettings.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
