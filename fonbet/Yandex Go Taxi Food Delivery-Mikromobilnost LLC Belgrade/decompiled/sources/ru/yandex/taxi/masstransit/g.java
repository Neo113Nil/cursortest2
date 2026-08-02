package ru.yandex.taxi.masstransit;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.StopModalDto;

/* loaded from: classes9.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StopModalDto.ButtonType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
