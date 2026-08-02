package ru.yandex.taxi.location.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.location.dto.LbsResponse;

/* loaded from: classes9.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LbsResponse.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
