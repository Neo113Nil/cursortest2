package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.LocationProvider;

/* loaded from: classes9.dex */
public final class xbz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LocationProvider.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
