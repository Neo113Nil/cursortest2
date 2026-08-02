package defpackage;

import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class tvp0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SearchOverlayType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
