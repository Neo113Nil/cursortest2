package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.net.response.Status;

/* loaded from: classes13.dex */
public final class y7u0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
