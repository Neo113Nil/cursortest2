package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;

/* loaded from: classes10.dex */
public final class ul3 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AuthType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
