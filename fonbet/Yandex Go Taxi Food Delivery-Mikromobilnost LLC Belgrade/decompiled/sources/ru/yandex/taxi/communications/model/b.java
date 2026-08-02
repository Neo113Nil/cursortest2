package ru.yandex.taxi.communications.model;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CommunicationItem.DisplayOnType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
