package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.GrantResult;

/* loaded from: classes5.dex */
public final class rzt {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = GrantResult.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
