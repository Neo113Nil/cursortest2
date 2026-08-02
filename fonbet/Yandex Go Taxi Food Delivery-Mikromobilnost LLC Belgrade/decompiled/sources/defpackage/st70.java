package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.request.OrderDraftParam$CallTypePreferences;

/* loaded from: classes14.dex */
public final class st70 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OrderDraftParam$CallTypePreferences.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
