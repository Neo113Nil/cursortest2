package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.PositionConfirmationScreen;

/* loaded from: classes5.dex */
public final class ude0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PositionConfirmationScreen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
