package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.ConnectionError;

/* loaded from: classes14.dex */
public final class w4e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ConnectionError.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
