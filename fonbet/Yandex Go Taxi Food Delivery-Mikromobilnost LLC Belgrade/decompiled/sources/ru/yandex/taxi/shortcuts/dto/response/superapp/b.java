package ru.yandex.taxi.shortcuts.dto.response.superapp;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest;

/* loaded from: classes10.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ServiceManifest.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
