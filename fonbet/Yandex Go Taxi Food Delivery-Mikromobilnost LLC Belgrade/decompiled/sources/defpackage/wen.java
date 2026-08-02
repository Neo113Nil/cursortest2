package defpackage;

import com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDeliveryTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class wen {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EatsOrderDetailsDeliveryTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
