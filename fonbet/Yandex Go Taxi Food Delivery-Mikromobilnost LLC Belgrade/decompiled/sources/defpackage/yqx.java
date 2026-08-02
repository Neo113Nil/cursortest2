package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.LabelType;

/* loaded from: classes5.dex */
public final class yqx {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LabelType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
