package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes5.dex */
public final class e0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Story.PageMediaType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
