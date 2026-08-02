package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.layers.api.StateRequirementsFailedType;

/* loaded from: classes13.dex */
public final class t5u0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StateRequirementsFailedType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
