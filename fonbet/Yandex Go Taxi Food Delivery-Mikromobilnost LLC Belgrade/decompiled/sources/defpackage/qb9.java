package defpackage;

import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class qb9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChangeOrderNotificationActionResponse.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
