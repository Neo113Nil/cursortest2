package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes9.dex */
public final class yo00 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapObjectType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
