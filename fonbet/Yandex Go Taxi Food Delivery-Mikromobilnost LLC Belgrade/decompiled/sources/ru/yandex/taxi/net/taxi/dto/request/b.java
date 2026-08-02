package ru.yandex.taxi.net.taxi.dto.request;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.request.SupportedFeature;

/* loaded from: classes9.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SupportedFeature.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
