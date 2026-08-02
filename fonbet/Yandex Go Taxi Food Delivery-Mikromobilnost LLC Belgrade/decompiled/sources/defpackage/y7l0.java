package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class y7l0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RoutePointType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
