package ru.yandex.taxi.plus.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.Action;

/* loaded from: classes6.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
