package defpackage;

import com.yandex.go.order.state.instructions.ScheduledOrderItemActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class znm0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScheduledOrderItemActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
