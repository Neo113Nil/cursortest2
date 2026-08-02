package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class xlk0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardPresentationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
