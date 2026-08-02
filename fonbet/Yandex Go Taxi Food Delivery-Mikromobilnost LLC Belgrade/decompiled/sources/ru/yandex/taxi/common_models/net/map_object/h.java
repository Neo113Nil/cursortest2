package ru.yandex.taxi.common_models.net.map_object;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationContent;

/* loaded from: classes5.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddressConfirmationContent.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
