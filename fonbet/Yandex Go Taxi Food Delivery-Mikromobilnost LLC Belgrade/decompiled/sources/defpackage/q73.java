package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;

/* loaded from: classes5.dex */
public final class q73 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ArrowActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
