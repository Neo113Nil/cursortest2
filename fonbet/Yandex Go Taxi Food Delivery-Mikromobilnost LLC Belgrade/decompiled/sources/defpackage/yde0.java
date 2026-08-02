package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes9.dex */
public final class yde0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PositionInitAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
