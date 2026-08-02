package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.ControlAction;

/* loaded from: classes6.dex */
public final class rle {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ControlAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
