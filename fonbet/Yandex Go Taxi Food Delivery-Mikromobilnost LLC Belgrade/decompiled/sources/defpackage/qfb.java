package defpackage;

import com.yandex.go.taxi.order.models.api.response.CheckInActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class qfb {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CheckInActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
