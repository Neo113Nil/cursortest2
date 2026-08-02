package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

/* loaded from: classes9.dex */
public final class zwq0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ServicePromo.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
