package ru.yandex.taxi.eatskit.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.OpenSupportParam;

/* loaded from: classes14.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OpenSupportParam.ScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
