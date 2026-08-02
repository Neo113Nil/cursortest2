package ru.yandex.taxi.common_models.net.map_object;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton;

/* loaded from: classes13.dex */
public final class m0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShowNavigationButton.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
