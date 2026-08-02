package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;

/* loaded from: classes5.dex */
public final class t0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StoryWidgets.ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
