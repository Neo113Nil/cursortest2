package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;

/* loaded from: classes5.dex */
public final class vpy {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LinkedOrderTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
