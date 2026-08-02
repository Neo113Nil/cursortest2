package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* loaded from: classes14.dex */
public final class q9s {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FormedFrom.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
