package defpackage;

import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class yzx0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderDeeplink$ChangeSource$Mode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
