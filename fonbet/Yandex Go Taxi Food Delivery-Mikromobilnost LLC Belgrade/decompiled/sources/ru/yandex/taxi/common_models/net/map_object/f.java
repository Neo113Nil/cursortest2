package ru.yandex.taxi.common_models.net.map_object;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton;

/* loaded from: classes5.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddressConfirmationButton.ButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
