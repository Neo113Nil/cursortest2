package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.GeoObjectType;

/* loaded from: classes9.dex */
public final class qzs {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = GeoObjectType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
