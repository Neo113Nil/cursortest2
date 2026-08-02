package ru.yandex.taxi.net.taxi.dto.objects;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;

/* loaded from: classes6.dex */
public final class a {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Dialog.Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
