package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class v980 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
