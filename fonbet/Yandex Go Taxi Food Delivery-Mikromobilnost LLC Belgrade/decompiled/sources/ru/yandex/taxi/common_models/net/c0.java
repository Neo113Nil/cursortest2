package ru.yandex.taxi.common_models.net;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.NotificationParams;

/* loaded from: classes6.dex */
public final class c0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NotificationParams.BehaviorOption.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
