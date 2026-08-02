package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules;

/* loaded from: classes6.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DisplayWidgetRules.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
