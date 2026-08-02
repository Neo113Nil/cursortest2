package ru.yandex.taxi.client.response;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.client.response.LaunchAcceptance;

/* loaded from: classes5.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LaunchAcceptance.IconStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
