package defpackage;

import com.yandex.go.order.external.unifiedpolling.dto.contact.EatsOrderContactKindDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class sen {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EatsOrderContactKindDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
