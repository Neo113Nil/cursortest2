package ru.yandex.taxi.eatskit.dto;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;

/* loaded from: classes2.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ExternalServiceData.NotificationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
